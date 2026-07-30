package com.moyoung.lib.ai.img;

import android.os.Environment;
import android.util.Log;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.yanzhenjie.kalle.i;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class d {
    private static final String IMG_SERVER_URL = "https://altair.moyoung.com/api/v2/text2image";
    private static final String TAG = "ImgDelegate";
    private final OkHttpClient client;
    private e downloader;
    private ScheduledExecutorService scheduler;
    private final AtomicReference<ScheduledFuture<?>> currentPollingTask = new AtomicReference<>();
    private final AtomicBoolean isSchedulerActive = new AtomicBoolean(false);
    private final AtomicReference<ScheduledFuture<?>> inactivityTimeoutTask = new AtomicReference<>();
    private final ScheduledExecutorService timeoutScheduler = Executors.newSingleThreadScheduledExecutor();

    class a implements Callback {
        final /* synthetic */ com.moyoung.lib.ai.img.b val$callback;
        final /* synthetic */ String val$imgFileDir;
        final /* synthetic */ boolean val$isSaveToFile;
        final /* synthetic */ Request val$request;

        /* renamed from: com.moyoung.lib.ai.img.d$a$a, reason: collision with other inner class name */
        class C0310a implements com.moyoung.lib.ai.oauth.d {
            C0310a() {
            }

            @Override // com.moyoung.lib.ai.oauth.d
            public void onError(String str) {
                Log.d("refreshToken", str);
                a.this.val$callback.onError(str);
            }

            @Override // com.moyoung.lib.ai.oauth.d
            public void onSuccess() {
                Log.d("refreshToken", "onSuccess");
                a aVar = a.this;
                d dVar = d.this;
                Request rebuildRequestWithNewToken = com.moyoung.lib.ai.oauth.e.rebuildRequestWithNewToken(aVar.val$request);
                a aVar2 = a.this;
                dVar.executeRequestImg(rebuildRequestWithNewToken, aVar2.val$imgFileDir, aVar2.val$isSaveToFile, aVar2.val$callback);
            }
        }

        a(com.moyoung.lib.ai.img.b bVar, Request request, String str, boolean z7) {
            this.val$callback = bVar;
            this.val$request = request;
            this.val$imgFileDir = str;
            this.val$isSaveToFile = z7;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(d.TAG, "图片生成请求失败", iOException);
            this.val$callback.onError(iOException.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            Log.d(d.TAG, "onResponse=" + response);
            if (com.moyoung.lib.ai.oauth.e.isTokenExpired(response.code())) {
                com.moyoung.lib.ai.e.get().oauth.refreshToken(new C0310a());
                return;
            }
            try {
                if (!response.isSuccessful()) {
                    String str = "图片生成请求失败: " + response.code() + l.SPACE + response.message();
                    Log.e(d.TAG, str);
                    this.val$callback.onError(str);
                    response.close();
                    return;
                }
                try {
                    String string = response.body().string();
                    Log.d(d.TAG, "图片生成响应: " + string);
                    JsonObject asJsonObject = JsonParser.parseString(string).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    String asString2 = asJsonObject.get("task_id").getAsString();
                    if ("processing".equals(asString)) {
                        this.val$callback.onProcessing(asString2);
                        d.this.pollStatus(asString2, this.val$isSaveToFile, this.val$imgFileDir, this.val$callback);
                    } else if (FirebaseAnalytics.Param.SUCCESS.equals(asString)) {
                        d.this.handleSuccess(asJsonObject.get("image_url").getAsString(), asString2, this.val$isSaveToFile, this.val$imgFileDir, this.val$callback);
                    } else {
                        this.val$callback.onError(asJsonObject.has("message") ? asJsonObject.get("message").getAsString() : "图片生成失败");
                    }
                } catch (Exception e8) {
                    Log.e(d.TAG, "解析图片生成响应失败", e8);
                    this.val$callback.onError("解析响应失败: " + e8.getMessage());
                }
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    class b implements Callback {
        final /* synthetic */ com.moyoung.lib.ai.img.b val$callback;
        final /* synthetic */ String val$imgFileDir;
        final /* synthetic */ boolean val$isSaveToFile;
        final /* synthetic */ String val$taskId;

        b(com.moyoung.lib.ai.img.b bVar, String str, boolean z7, String str2) {
            this.val$callback = bVar;
            this.val$taskId = str;
            this.val$isSaveToFile = z7;
            this.val$imgFileDir = str2;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(d.TAG, "查询状态失败", iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            try {
                if (!response.isSuccessful()) {
                    Log.e(d.TAG, "查询状态失败: " + response.code() + l.SPACE + response.message());
                    response.close();
                    return;
                }
                try {
                    String string = response.body().string();
                    Log.d(d.TAG, "状态查询响应: " + string);
                    JsonObject asJsonObject = JsonParser.parseString(string).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    if ("processing".equals(asString)) {
                        this.val$callback.onProcessing(this.val$taskId);
                    } else if (FirebaseAnalytics.Param.SUCCESS.equals(asString)) {
                        d.this.handleSuccess(asJsonObject.get("image_url").getAsString(), this.val$taskId, this.val$isSaveToFile, this.val$imgFileDir, this.val$callback);
                        d.this.stopPolling();
                    } else {
                        this.val$callback.onError(asJsonObject.has("message") ? asJsonObject.get("message").getAsString() : "图片生成失败");
                        d.this.stopPolling();
                    }
                } catch (Exception e8) {
                    Log.e(d.TAG, "解析状态响应失败", e8);
                }
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    class c implements com.moyoung.lib.ai.img.b {
        final /* synthetic */ com.moyoung.lib.ai.img.b val$callback;

        c(com.moyoung.lib.ai.img.b bVar) {
            this.val$callback = bVar;
        }

        @Override // com.moyoung.lib.ai.img.b
        public void onError(String str) {
            this.val$callback.onError(str);
        }

        @Override // com.moyoung.lib.ai.img.b
        public void onProcessing(String str) {
            this.val$callback.onProcessing(str);
        }

        @Override // com.moyoung.lib.ai.img.b
        public void onSuccess(String str, String str2) {
            this.val$callback.onSuccess(str, str2);
        }
    }

    public d(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
        initScheduler();
    }

    private void downloadAndSaveImage(String str, String str2, String str3, com.moyoung.lib.ai.img.b bVar) {
        if (this.downloader == null) {
            this.downloader = new e();
        }
        this.downloader.downloadAndSaveImage(str, str3, str2, new c(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeRequestImg(Request request, String str, boolean z7, com.moyoung.lib.ai.img.b bVar) {
        this.client.newCall(request).enqueue(new a(bVar, request, str, z7));
    }

    private static String getDefaultImgFileDir() {
        StringBuilder sb = new StringBuilder();
        File externalFilesDir = com.moyoung.lib.ai.e.getContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        Objects.requireNonNull(externalFilesDir);
        sb.append(externalFilesDir.getPath());
        sb.append("/moy_ai_img");
        return sb.toString();
    }

    private Request getGenerateRequest(@NonNull f fVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("size", fVar.getSize());
        jsonObject.addProperty(TtmlNode.TAG_STYLE, fVar.getStyle());
        jsonObject.addProperty("prompt", fVar.getPrompt());
        String language = fVar.getLanguage();
        jsonObject.addProperty("language", fVar.getLanguage());
        String jsonElement = jsonObject.toString();
        Log.d(TAG, "生成图片请求Body: " + jsonElement);
        Request.Builder header = new Request.Builder().url("https://altair.moyoung.com/api/v2/text2image/generate").post(RequestBody.create(jsonElement, MediaType.get("application/json; charset=utf-8"))).header("Content-Type", i.VALUE_APPLICATION_JSON);
        String token = com.moyoung.lib.ai.e.get().oauth.getToken();
        if (token != null && !token.isEmpty()) {
            header.header("Authorization", token);
        }
        header.header("Accept-Language", language);
        return header.build();
    }

    private Request getStatusRequest(String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("task_id", str);
        String jsonElement = jsonObject.toString();
        Log.d(TAG, "状态查询请求Body: " + jsonElement);
        Request.Builder header = new Request.Builder().url("https://altair.moyoung.com/api/v2/text2image/status").post(RequestBody.create(jsonElement, MediaType.get("application/json; charset=utf-8"))).header("Content-Type", i.VALUE_APPLICATION_JSON);
        String token = com.moyoung.lib.ai.e.get().oauth.getToken();
        if (token != null && !token.isEmpty()) {
            header.header("Authorization", token);
        }
        return header.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSuccess(String str, String str2, boolean z7, String str3, com.moyoung.lib.ai.img.b bVar) {
        if (!z7 || str3 == null) {
            bVar.onSuccess(str, str2);
        } else {
            downloadAndSaveImage(str, str2, str3, bVar);
        }
    }

    private void initScheduler() {
        ScheduledExecutorService scheduledExecutorService = this.scheduler;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.scheduler.isTerminated()) {
            this.scheduler = Executors.newScheduledThreadPool(1);
            this.isSchedulerActive.set(true);
            Log.d(TAG, "初始化定时任务");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollStatus$0(String str, com.moyoung.lib.ai.img.b bVar, boolean z7, String str2) {
        if (this.scheduler.isShutdown() || this.scheduler.isTerminated()) {
            Log.w(TAG, "Scheduler已关闭，停止轮询");
            return;
        }
        Request statusRequest = getStatusRequest(str);
        Log.d(TAG, "轮询状态请求: " + statusRequest.url());
        this.client.newCall(statusRequest).enqueue(new b(bVar, str, z7, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pollStatus(final String str, final boolean z7, final String str2, final com.moyoung.lib.ai.img.b bVar) {
        initScheduler();
        if (this.scheduler.isShutdown() || this.scheduler.isTerminated()) {
            Log.e(TAG, "Scheduler已关闭，无法启动轮询任务");
            bVar.onError("轮询任务启动失败：Scheduler已关闭");
            return;
        }
        try {
            this.currentPollingTask.set(this.scheduler.scheduleWithFixedDelay(new Runnable() { // from class: com.moyoung.lib.ai.img.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.lambda$pollStatus$0(str, bVar, z7, str2);
                }
            }, 0L, 3L, TimeUnit.SECONDS));
        } catch (Exception e8) {
            Log.e(TAG, "启动轮询任务失败", e8);
            bVar.onError("启动轮询任务失败: " + e8.getMessage());
        }
    }

    private void requestImg(@NonNull f fVar, boolean z7, com.moyoung.lib.ai.img.b bVar) {
        Request generateRequest = getGenerateRequest(fVar);
        Log.d(TAG, generateRequest.toString());
        executeRequestImg(generateRequest, fVar.getImgFileDir(), z7, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPolling() {
        ScheduledFuture<?> andSet = this.currentPollingTask.getAndSet(null);
        if (andSet == null || andSet.isDone()) {
            return;
        }
        andSet.cancel(false);
    }

    public void cleanup() {
        Log.d(TAG, "清理ImgDelegate资源");
        stopPolling();
        ScheduledExecutorService scheduledExecutorService = this.scheduler;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.isSchedulerActive.set(false);
            this.scheduler.shutdown();
        }
        ScheduledFuture<?> andSet = this.inactivityTimeoutTask.getAndSet(null);
        if (andSet != null && !andSet.isDone()) {
            andSet.cancel(false);
        }
        ScheduledExecutorService scheduledExecutorService2 = this.timeoutScheduler;
        if (scheduledExecutorService2 != null && !scheduledExecutorService2.isShutdown()) {
            this.timeoutScheduler.shutdown();
        }
        this.currentPollingTask.set(null);
    }

    public void textDrawing(@NonNull f fVar, com.moyoung.lib.ai.img.b bVar) {
        requestImg(fVar, false, bVar);
    }

    public void textDrawingToFile(@NonNull f fVar, com.moyoung.lib.ai.img.b bVar) {
        requestImg(fVar, true, bVar);
    }
}
