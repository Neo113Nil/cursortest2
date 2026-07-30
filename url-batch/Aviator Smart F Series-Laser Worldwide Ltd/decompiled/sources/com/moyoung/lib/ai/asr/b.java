package com.moyoung.lib.ai.asr;

import android.util.Log;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class b {
    private static final String ASR_SERVER_URL = "https://altair.moyoung.com/api/v3/asr-offline";
    private static final String TAG = "ASRDelegate";
    private final OkHttpClient client;

    class a implements Callback {
        final /* synthetic */ com.moyoung.lib.ai.asr.a val$callback;
        final /* synthetic */ Request val$request;

        /* renamed from: com.moyoung.lib.ai.asr.b$a$a, reason: collision with other inner class name */
        class C0304a implements com.moyoung.lib.ai.oauth.d {
            C0304a() {
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
                b.this.asrRequest(com.moyoung.lib.ai.oauth.e.rebuildRequestWithNewToken(aVar.val$request), a.this.val$callback);
            }
        }

        a(com.moyoung.lib.ai.asr.a aVar, Request request) {
            this.val$callback = aVar;
            this.val$request = request;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(b.TAG, "ASR请求失败", iOException);
            this.val$callback.onError(iOException.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            Log.d(b.TAG, "onResponse=" + response);
            if (com.moyoung.lib.ai.oauth.e.isTokenExpired(response.code())) {
                com.moyoung.lib.ai.e.get().oauth.refreshToken(new C0304a());
                return;
            }
            try {
                if (!response.isSuccessful()) {
                    String str = "ASR请求失败: " + response.code() + l.SPACE + response.message();
                    Log.e(b.TAG, str);
                    this.val$callback.onError(str);
                    response.close();
                    return;
                }
                try {
                    String string = response.body().string();
                    Log.d(b.TAG, "ASR响应: " + string);
                    JsonObject asJsonObject = JsonParser.parseString(string).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    if (FirebaseAnalytics.Param.SUCCESS.equals(asString)) {
                        e eVar = new e();
                        eVar.setStatus(asString);
                        JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("data");
                        if (asJsonObject2 != null) {
                            eVar.setText(asJsonObject2.get("text").getAsString());
                            eVar.setFilename(asJsonObject2.get("filename").getAsString());
                            eVar.setTimestamp(asJsonObject2.get("timestamp").getAsLong());
                        }
                        this.val$callback.onSuccess(eVar);
                    } else {
                        String asString2 = asJsonObject.has("message") ? asJsonObject.get("message").getAsString() : "ASR识别失败";
                        String asString3 = asJsonObject.has("code") ? asJsonObject.get("code").getAsString() : "UNKNOWN_ERROR";
                        c cVar = new c();
                        cVar.setStatus(asString);
                        cVar.setCode(asString3);
                        cVar.setMessage(asString2);
                        this.val$callback.onError(b.this.formatErrorMessage(cVar));
                    }
                } catch (Exception e8) {
                    Log.e(b.TAG, "解析ASR响应失败", e8);
                    this.val$callback.onError("解析响应失败: " + e8.getMessage());
                }
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    public b(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void asrRequest(Request request, com.moyoung.lib.ai.asr.a aVar) {
        this.client.newCall(request).enqueue(new a(aVar, request));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatErrorMessage(c cVar) {
        return String.format("[%s] %s", cVar.getCode(), cVar.getMessage());
    }

    private Request getASRRequest(d dVar) {
        String audioFilePath = dVar.getAudioFilePath();
        File file = new File(audioFilePath);
        if (!file.exists()) {
            throw new IllegalArgumentException("音频文件不存在: " + audioFilePath);
        }
        String language = dVar.getLanguage();
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        type.addFormDataPart("language", language);
        type.addFormDataPart("audio", file.getName(), RequestBody.create(file, MediaType.parse("application/octet-stream")));
        Request.Builder post = new Request.Builder().url(ASR_SERVER_URL).post(type.build());
        String token = com.moyoung.lib.ai.e.get().oauth.getToken();
        if (token != null && !token.isEmpty()) {
            post.header("Authorization", token);
        }
        post.header("Accept-Language", language);
        return post.build();
    }

    public void speechToText(d dVar, com.moyoung.lib.ai.asr.a aVar) {
        asrRequest(getASRRequest(dVar), aVar);
    }
}
