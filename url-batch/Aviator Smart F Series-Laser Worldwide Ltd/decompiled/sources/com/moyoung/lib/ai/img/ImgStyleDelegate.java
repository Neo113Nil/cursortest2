package com.moyoung.lib.ai.img;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class ImgStyleDelegate {
    private static final String TAG = "ImgStyleDelegate";
    private static final String URL_IMG_STYLE = "https://altair.moyoung.com/api/v2/text2image/styles";
    private final OkHttpClient client;
    private final Gson gson = new Gson();

    public interface a {
        void onError(String str);

        void onSuccess(List<g> list, int i8);
    }

    public ImgStyleDelegate(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public void requestStyleList(a aVar) {
        requestStyleList(com.moyoung.lib.ai.c.getCurrentLanguage(), aVar);
    }

    public void requestStyleList(String str, final a aVar) {
        StringBuilder sb = new StringBuilder(URL_IMG_STYLE);
        if (str == null || str.isEmpty()) {
            str = com.moyoung.lib.ai.c.getCurrentLanguage();
        }
        sb.append("?language=");
        sb.append(str);
        this.client.newCall(new Request.Builder().url(sb.toString()).get().build()).enqueue(new Callback() { // from class: com.moyoung.lib.ai.img.ImgStyleDelegate.1
            @Override // okhttp3.Callback
            public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
                Log.e(ImgStyleDelegate.TAG, "获取图片风格列表失败", iOException);
                aVar.onError(iOException.getMessage());
            }

            @Override // okhttp3.Callback
            public void onResponse(@NonNull Call call, @NonNull Response response) {
                try {
                    if (!response.isSuccessful()) {
                        String str2 = "获取图片风格列表失败: " + response.code();
                        Log.e(ImgStyleDelegate.TAG, str2);
                        aVar.onError(str2);
                        return;
                    }
                    try {
                        if (response.body() != null) {
                            JsonObject asJsonObject = JsonParser.parseString(response.body().string()).getAsJsonObject();
                            String asString = asJsonObject.get("status").getAsString();
                            if (!FirebaseAnalytics.Param.SUCCESS.equals(asString)) {
                                aVar.onError("获取图片风格列表失败: " + asString);
                                return;
                            }
                            aVar.onSuccess((List) ImgStyleDelegate.this.gson.fromJson(asJsonObject.getAsJsonArray("data"), new TypeToken<List<g>>() { // from class: com.moyoung.lib.ai.img.ImgStyleDelegate.1.1
                            }.getType()), asJsonObject.get("count").getAsInt());
                        } else {
                            aVar.onError("响应体为空");
                        }
                    } catch (Exception e8) {
                        Log.e(ImgStyleDelegate.TAG, "解析图片风格列表失败", e8);
                        aVar.onError("解析响应失败: " + e8.getMessage());
                    }
                } finally {
                    response.close();
                }
            }
        });
    }
}
