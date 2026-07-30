package com.moyoung.lib.ai.tone;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.moyoung.lib.ai.c;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class ToneDelegate {
    private static final String TAG = "VoiceDelegate";
    private final OkHttpClient client;
    private final Gson gson = new Gson();

    public interface a {
    }

    public ToneDelegate(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public void getToneList(a aVar) {
        getToneList(c.getCurrentLanguage(), aVar);
    }

    public void getToneList(String str, a aVar) {
        if (str == null || str.isEmpty()) {
            str = c.getCurrentLanguage();
        }
        this.client.newCall(new Request.Builder().url("https://altair.moyoung.com/api/v3/tts/voices?lang=" + str).get().build()).enqueue(new Callback(aVar) { // from class: com.moyoung.lib.ai.tone.ToneDelegate.1
            final /* synthetic */ a val$callback;

            @Override // okhttp3.Callback
            public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
                Log.e(ToneDelegate.TAG, "获取语音角色列表失败", iOException);
                iOException.getMessage();
                throw null;
            }

            @Override // okhttp3.Callback
            public void onResponse(@NonNull Call call, @NonNull Response response) {
                try {
                    if (!response.isSuccessful()) {
                        Log.e(ToneDelegate.TAG, "获取语音角色列表失败: " + response.code());
                        throw null;
                    }
                    try {
                        if (response.body() == null) {
                            throw null;
                        }
                        JsonObject asJsonObject = JsonParser.parseString(response.body().string()).getAsJsonObject();
                        asJsonObject.get(FileDownloadModel.TOTAL).getAsInt();
                        throw null;
                    } catch (Exception e8) {
                        Log.e(ToneDelegate.TAG, "解析语音角色列表失败", e8);
                        StringBuilder sb = new StringBuilder();
                        sb.append("解析响应失败: ");
                        sb.append(e8.getMessage());
                        throw null;
                    }
                } catch (Throwable th) {
                    response.close();
                    throw th;
                }
            }
        });
    }
}
