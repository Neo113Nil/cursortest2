package com.moyoung.lib.ai.chat;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.yanzhenjie.kalle.i;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class a {
    private static final String TAG = "ChatDelegate";
    private final c chatMsgManager = new c();
    private final OkHttpClient client;

    /* renamed from: com.moyoung.lib.ai.chat.a$a, reason: collision with other inner class name */
    class C0306a implements Callback {
        final /* synthetic */ f val$callback;
        final /* synthetic */ Request val$request;

        /* renamed from: com.moyoung.lib.ai.chat.a$a$a, reason: collision with other inner class name */
        class C0307a implements com.moyoung.lib.ai.oauth.d {
            C0307a() {
            }

            @Override // com.moyoung.lib.ai.oauth.d
            public void onError(String str) {
                Log.d("refreshToken", str);
                C0306a.this.val$callback.onError(str);
            }

            @Override // com.moyoung.lib.ai.oauth.d
            public void onSuccess() {
                Log.d("refreshToken", "onSuccess");
                C0306a c0306a = C0306a.this;
                a.this.chatCompletion(com.moyoung.lib.ai.oauth.e.rebuildRequestWithNewToken(c0306a.val$request), C0306a.this.val$callback);
            }
        }

        C0306a(f fVar, Request request) {
            this.val$callback = fVar;
            this.val$request = request;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(a.TAG, "请求失败", iOException);
            a.this.chatMsgManager.removeLastMsg();
            this.val$callback.onError(iOException.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            String string;
            try {
                if (com.moyoung.lib.ai.oauth.e.isTokenExpired(response.code())) {
                    com.moyoung.lib.ai.e.get().oauth.refreshToken(new C0307a());
                    return;
                }
                try {
                    string = response.body().string();
                } catch (Exception e8) {
                    Log.e(a.TAG, "解析响应失败", e8);
                    a.this.chatMsgManager.removeLastMsg();
                    this.val$callback.onError("解析响应失败: " + e8.getMessage());
                }
                if (response.isSuccessful()) {
                    String asString = JsonParser.parseString(string).getAsJsonObject().getAsJsonArray("choices").get(0).getAsJsonObject().getAsJsonObject("message").get(FirebaseAnalytics.Param.CONTENT).getAsString();
                    a.this.chatMsgManager.addAssistantMsg(asString);
                    this.val$callback.onNotStreamResponse(asString);
                    response.close();
                    return;
                }
                String extractFieldFromResponse = com.moyoung.lib.ai.b.extractFieldFromResponse(string, "message");
                if (extractFieldFromResponse == null) {
                    extractFieldFromResponse = response.code() + " UNKNOWN_ERROR";
                }
                Log.e(a.TAG, extractFieldFromResponse);
                a.this.chatMsgManager.removeLastMsg();
                this.val$callback.onError(extractFieldFromResponse);
                response.close();
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    class b implements Callback {
        final /* synthetic */ f val$callback;
        final /* synthetic */ Request val$request;

        /* renamed from: com.moyoung.lib.ai.chat.a$b$a, reason: collision with other inner class name */
        class C0308a implements com.moyoung.lib.ai.oauth.d {
            C0308a() {
            }

            @Override // com.moyoung.lib.ai.oauth.d
            public void onError(String str) {
                Log.d("refreshToken", str);
                b.this.val$callback.onError(str);
            }

            @Override // com.moyoung.lib.ai.oauth.d
            public void onSuccess() {
                Log.d("refreshToken", "onSuccess");
                b bVar = b.this;
                a.this.streamChatCompletion(com.moyoung.lib.ai.oauth.e.rebuildRequestWithNewToken(bVar.val$request), b.this.val$callback);
            }
        }

        b(f fVar, Request request) {
            this.val$callback = fVar;
            this.val$request = request;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(a.TAG, "请求失败", iOException);
            a.this.chatMsgManager.removeLastMsg();
            this.val$callback.onError(iOException.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            String readUtf8Line;
            Log.d(a.TAG, "onResponse=" + response);
            try {
                if (com.moyoung.lib.ai.oauth.e.isTokenExpired(response.code())) {
                    com.moyoung.lib.ai.e.get().oauth.refreshToken(new C0308a());
                    return;
                }
                try {
                } catch (Exception e8) {
                    Log.e(a.TAG, "读取流失败", e8);
                    a.this.chatMsgManager.removeLastMsg();
                    this.val$callback.onError("读取流失败: " + e8.getMessage());
                }
                if (!response.isSuccessful()) {
                    String extractFieldFromResponse = com.moyoung.lib.ai.b.extractFieldFromResponse(response.body().string(), "message");
                    if (extractFieldFromResponse == null) {
                        extractFieldFromResponse = response.code() + " UNKNOWN_ERROR";
                    }
                    Log.e(a.TAG, extractFieldFromResponse);
                    a.this.chatMsgManager.removeLastMsg();
                    this.val$callback.onError(extractFieldFromResponse);
                    response.close();
                    response.close();
                    return;
                }
                okio.e source = response.body().source();
                StringBuilder sb = new StringBuilder();
                while (!source.exhausted() && (readUtf8Line = source.readUtf8Line()) != null) {
                    if (readUtf8Line.startsWith("data: ") && !readUtf8Line.equals("data: [DONE]")) {
                        String substring = readUtf8Line.substring(6);
                        try {
                            String extractFieldFromResponse2 = com.moyoung.lib.ai.b.extractFieldFromResponse(substring, "message");
                            if (extractFieldFromResponse2 != null) {
                                Log.e(a.TAG, extractFieldFromResponse2);
                                a.this.chatMsgManager.addAssistantMsg(extractFieldFromResponse2);
                                this.val$callback.onError(extractFieldFromResponse2);
                                response.close();
                                response.close();
                                return;
                            }
                            JsonObject asJsonObject = JsonParser.parseString(substring).getAsJsonObject().getAsJsonArray("choices").get(0).getAsJsonObject().getAsJsonObject("delta");
                            if (asJsonObject.has(FirebaseAnalytics.Param.CONTENT)) {
                                String asString = asJsonObject.get(FirebaseAnalytics.Param.CONTENT).getAsString();
                                sb.append(asString);
                                this.val$callback.onStreamResponse(asString);
                            }
                        } catch (Exception e9) {
                            Log.e(a.TAG, "解析JSON失败", e9);
                        }
                    } else if (readUtf8Line.equals("data: [DONE]")) {
                        a.this.chatMsgManager.addAssistantMsg(sb.toString());
                        this.val$callback.onStreamComplete();
                    }
                }
            } finally {
                response.close();
            }
        }
    }

    public a(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    private RequestBody buildRequestBody(d dVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(com.liulishuo.filedownloader.services.f.KEY_MODEL, "MOYOUNG-1");
        this.chatMsgManager.addUserMsg(dVar.getPrompt());
        jsonObject.add("messages", this.chatMsgManager.toJsonArray());
        jsonObject.addProperty("stream", Boolean.valueOf(dVar.isStream()));
        if (dVar.getMaxTokens() > 0) {
            jsonObject.addProperty("max_tokens", Integer.valueOf(dVar.getMaxTokens()));
        }
        jsonObject.addProperty("language", dVar.getLanguage());
        return RequestBody.create(jsonObject.toString(), MediaType.get("application/json; charset=utf-8"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void chatCompletion(Request request, f fVar) {
        this.client.newCall(request).enqueue(new C0306a(fVar, request));
    }

    private Request getRequest(d dVar) {
        Request.Builder header = new Request.Builder().url("https://altair.moyoung.com/api/v1/chatgpt").post(buildRequestBody(dVar)).header("Content-Type", i.VALUE_APPLICATION_JSON);
        if (dVar.isStream()) {
            header.header("Accept", "text/event-stream");
        }
        header.header("Accept-Language", dVar.getLanguage());
        return header.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void streamChatCompletion(Request request, f fVar) {
        this.client.newCall(request).enqueue(new b(fVar, request));
    }

    public void clearCurrentTopic() {
        this.chatMsgManager.clear();
    }

    public void textToChat(d dVar, f fVar) {
        this.chatMsgManager.setCurrentMsgFromWatch(dVar.isFromWatch());
        this.chatMsgManager.setMaxMsgCount(dVar.getMaxMsgCount());
        Request request = getRequest(dVar);
        Log.d("MoyoungAI", "textToChat request: " + request);
        if (dVar.isStream()) {
            streamChatCompletion(request, fVar);
        } else {
            chatCompletion(request, fVar);
        }
    }
}
