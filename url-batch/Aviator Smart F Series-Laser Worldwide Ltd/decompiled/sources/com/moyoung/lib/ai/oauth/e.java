package com.moyoung.lib.ai.oauth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.baidu.ar.constants.HttpConstants;
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
public class e {
    private static final String OAUTH_SERVER_URL = "https://altair.moyoung.com/api/v3/oauth";
    private static final String TAG = "OAuthDelegate";
    private final OkHttpClient client;

    class a implements Callback {
        final /* synthetic */ d val$callback;

        a(d dVar) {
            this.val$callback = dVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(e.TAG, "设备认证失败", iOException);
            this.val$callback.onError(iOException.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            Log.d(e.TAG, "onResponse=" + response);
            try {
                if (!response.isSuccessful()) {
                    String str = "设备认证失败: " + response.code() + ", " + response.message();
                    Log.e(e.TAG, str);
                    this.val$callback.onError(str);
                    response.close();
                    return;
                }
                try {
                    JsonObject asJsonObject = JsonParser.parseString(response.body().string()).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    if (FirebaseAnalytics.Param.SUCCESS.equals(asString)) {
                        com.moyoung.lib.ai.oauth.b bVar = new com.moyoung.lib.ai.oauth.b();
                        bVar.setStatus(asString);
                        bVar.setBearerToken(asJsonObject.get("bearer_token").getAsString());
                        bVar.setRefreshToken(asJsonObject.get("refresh_token").getAsString());
                        bVar.setExpiresIn(asJsonObject.get("expires_in").getAsInt());
                        bVar.setTokenType(asJsonObject.get("token_type").getAsString());
                        f.saveTokens(bVar);
                        this.val$callback.onSuccess();
                    } else {
                        this.val$callback.onError(asJsonObject.has("error_description") ? asJsonObject.get("error_description").getAsString() : "认证失败");
                    }
                } catch (Exception e8) {
                    Log.e(e.TAG, "解析认证响应失败", e8);
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
        final /* synthetic */ d val$callback;

        b(d dVar) {
            this.val$callback = dVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(e.TAG, "刷新令牌失败", iOException);
            if (TextUtils.isEmpty(iOException.getMessage()) || !iOException.getMessage().contains("401")) {
                this.val$callback.onError(iOException.getMessage());
            } else {
                e.this.authenticate(com.moyoung.lib.ai.e.getAuthConfig(), this.val$callback);
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            Log.d(e.TAG, "onResponse=" + response);
            if (e.isTokenExpired(response.code())) {
                Log.e(e.TAG, "刷新令牌（refresh token）失效了");
                e.this.authenticate(com.moyoung.lib.ai.e.getAuthConfig(), this.val$callback);
                return;
            }
            try {
                if (!response.isSuccessful()) {
                    String str = "刷新令牌失败: " + response.code();
                    Log.e(e.TAG, str);
                    this.val$callback.onError(str);
                    response.close();
                    return;
                }
                try {
                    JsonObject asJsonObject = JsonParser.parseString(response.body().string()).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    if (FirebaseAnalytics.Param.SUCCESS.equals(asString)) {
                        com.moyoung.lib.ai.oauth.b bVar = new com.moyoung.lib.ai.oauth.b();
                        bVar.setStatus(asString);
                        bVar.setBearerToken(asJsonObject.get("bearer_token").getAsString());
                        bVar.setRefreshToken(asJsonObject.get("refresh_token").getAsString());
                        bVar.setExpiresIn(asJsonObject.get("expires_in").getAsInt());
                        bVar.setTokenType(asJsonObject.get("token_type").getAsString());
                        f.saveTokens(bVar);
                        this.val$callback.onSuccess();
                    } else {
                        this.val$callback.onError(asJsonObject.has("error_description") ? asJsonObject.get("error_description").getAsString() : "刷新令牌失败");
                    }
                } catch (Exception e8) {
                    Log.e(e.TAG, "解析刷新令牌响应失败", e8);
                    this.val$callback.onError("解析响应失败: " + e8.getMessage());
                }
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    class c implements Callback {
        final /* synthetic */ d val$callback;

        c(d dVar) {
            this.val$callback = dVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(e.TAG, "销毁令牌失败", iOException);
            this.val$callback.onError("销毁令牌失败");
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            try {
                try {
                    if (response.isSuccessful()) {
                        JsonObject asJsonObject = JsonParser.parseString(response.body().string()).getAsJsonObject();
                        if (FirebaseAnalytics.Param.SUCCESS.equals(asJsonObject.get("status").getAsString())) {
                            Log.d(e.TAG, "令牌销毁成功");
                            this.val$callback.onSuccess();
                        } else {
                            String asString = asJsonObject.has("error_description") ? asJsonObject.get("error_description").getAsString() : "销毁失败";
                            Log.e(e.TAG, "销毁令牌失败: " + asString);
                            this.val$callback.onError("销毁令牌失败: " + asString);
                        }
                    } else {
                        Log.e(e.TAG, "销毁令牌失败: " + response.code() + l.SPACE + response.message());
                        if (response.code() == 401) {
                            this.val$callback.onSuccess();
                        }
                    }
                } catch (Exception e8) {
                    Log.e(e.TAG, "解析销毁令牌响应失败", e8);
                    this.val$callback.onError("解析销毁令牌响应失败: " + e8.getMessage());
                }
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    public e(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    private void authRequest(Request request, d dVar) {
        this.client.newCall(request).enqueue(new a(dVar));
    }

    private RequestBody buildAESRequestBody(JsonObject jsonObject) {
        try {
            String encrypt = com.moyoung.lib.ai.oauth.c.encrypt(jsonObject.toString());
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("query_data", encrypt);
            return RequestBody.create(jsonObject2.toString(), MediaType.get("application/json; charset=utf-8"));
        } catch (Exception e8) {
            Log.e(TAG, "构建认证请求体失败", e8);
            throw new RuntimeException("构建认证请求体失败", e8);
        }
    }

    @NonNull
    private static JsonObject getAuthJsonObject(com.moyoung.lib.ai.oauth.a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("soft_version", aVar.getSoftVersion());
        jsonObject.addProperty("mac", aVar.getMac());
        jsonObject.addProperty("device_id", aVar.getDeviceId());
        if (aVar.getDeviceName() != null) {
            jsonObject.addProperty("device_name", aVar.getDeviceName());
        }
        if (aVar.getAppVersion() != null) {
            jsonObject.addProperty(HttpConstants.APP_VERSION, aVar.getAppVersion());
        }
        jsonObject.addProperty("timestamp", aVar.getTimestamp());
        return jsonObject;
    }

    private Request getAuthRequest(com.moyoung.lib.ai.oauth.a aVar) {
        f.saveAuthConfigVersion(aVar.getSoftVersion());
        Request.Builder header = new Request.Builder().url("https://altair.moyoung.com/api/v3/oauth/auth").post(buildAESRequestBody(getAuthJsonObject(aVar))).header("Content-Type", i.VALUE_APPLICATION_JSON);
        StringBuilder sb = new StringBuilder();
        sb.append("MOY-SmartGlasses/");
        sb.append(aVar.getAppVersion() != null ? aVar.getAppVersion() : "1.2.3");
        return header.header("User-Agent", sb.toString()).build();
    }

    @NonNull
    private static JsonObject getRefreshJsonObject(String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("refresh_token", str);
        return jsonObject;
    }

    private Request getRefreshRequest(String str) {
        RequestBody buildAESRequestBody = buildAESRequestBody(getRefreshJsonObject(str));
        String authConfigVersion = f.getAuthConfigVersion();
        Request.Builder header = new Request.Builder().url("https://altair.moyoung.com/api/v3/oauth/refresh").post(buildAESRequestBody).header("Content-Type", i.VALUE_APPLICATION_JSON);
        StringBuilder sb = new StringBuilder();
        sb.append("MOY-SmartGlasses/");
        if (authConfigVersion == null) {
            authConfigVersion = "1.2.3";
        }
        sb.append(authConfigVersion);
        return header.header("User-Agent", sb.toString()).build();
    }

    public static boolean isTokenExpired(int i8) {
        return i8 == 401;
    }

    public static Request rebuildRequestWithNewToken(Request request) {
        Request.Builder header = request.newBuilder().header("Content-Type", i.VALUE_APPLICATION_JSON);
        String token = f.getToken();
        if (token != null && !token.isEmpty()) {
            header.header("Authorization", token);
        }
        return header.build();
    }

    private void refreshRequest(Request request, d dVar) {
        this.client.newCall(request).enqueue(new b(dVar));
    }

    public void authenticate(com.moyoung.lib.ai.oauth.a aVar, d dVar) {
        if (aVar == null) {
            dVar.onError("AuthConfig为空");
        } else {
            authRequest(getAuthRequest(aVar), dVar);
        }
    }

    public void destroyToken(d dVar) {
        String token = getToken();
        if (TextUtils.isEmpty(token)) {
            Log.w(TAG, "No token to destroy");
            dVar.onError("No token to destroy");
        } else {
            this.client.newCall(new Request.Builder().url("https://altair.moyoung.com/api/v3/oauth/destroy").post(RequestBody.create(new byte[0], (MediaType) null)).addHeader("Authorization", token).build()).enqueue(new c(dVar));
        }
    }

    public String getToken() {
        String token = f.getToken();
        if (token == null || token.isEmpty()) {
            return "";
        }
        return f.getTokenType() + l.SPACE + f.getToken();
    }

    public boolean isAuthorized() {
        String token = f.getToken();
        return (token == null || token.isEmpty()) ? false : true;
    }

    public void refreshToken(d dVar) {
        Log.d(TAG, "刷新令牌");
        String refreshTokenFromSP = f.getRefreshTokenFromSP();
        if (refreshTokenFromSP != null && !refreshTokenFromSP.isEmpty()) {
            refreshRequest(getRefreshRequest(refreshTokenFromSP), dVar);
        } else {
            Log.e(TAG, "未找到刷新令牌");
            authenticate(com.moyoung.lib.ai.e.getAuthConfig(), dVar);
        }
    }
}
