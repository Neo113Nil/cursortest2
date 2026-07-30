package com.moyoung.lib.ai.tts;

import android.util.Log;
import androidx.annotation.NonNull;
import com.arthenica.ffmpegkit.n;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.gson.JsonObject;
import com.moyoung.lib.ai.oauth.e;
import com.moyoung.lib.ai.tts.d;
import com.yanzhenjie.kalle.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class c {
    private static final String TAG = "TTSDelegate";
    private final OkHttpClient client;

    class a implements Callback {
        final /* synthetic */ String val$audioFileDir;
        final /* synthetic */ b val$callback;
        final /* synthetic */ Request val$request;

        /* renamed from: com.moyoung.lib.ai.tts.c$a$a, reason: collision with other inner class name */
        class C0313a implements com.moyoung.lib.ai.oauth.d {
            C0313a() {
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
                c cVar = c.this;
                Request rebuildRequestWithNewToken = e.rebuildRequestWithNewToken(aVar.val$request);
                a aVar2 = a.this;
                cVar.ttsSynthesize(rebuildRequestWithNewToken, aVar2.val$audioFileDir, aVar2.val$callback);
            }
        }

        a(b bVar, Request request, String str) {
            this.val$callback = bVar;
            this.val$request = request;
            this.val$audioFileDir = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(c.TAG, "TTS请求失败", iOException);
            this.val$callback.onError(iOException.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            Log.d(c.TAG, "onResponse=" + response);
            if (e.isTokenExpired(response.code())) {
                com.moyoung.lib.ai.e.get().oauth.refreshToken(new C0313a());
                return;
            }
            try {
                if (!response.isSuccessful()) {
                    String str = "TTS请求失败: " + response.code();
                    Log.e(c.TAG, str);
                    this.val$callback.onError(str);
                    response.close();
                    return;
                }
                try {
                    String header = response.header("Content-Type", MimeTypes.AUDIO_MPEG);
                    File saveAudioToFileFromStream = c.this.saveAudioToFileFromStream(response, this.val$audioFileDir);
                    if (c.this.validateAudioFile(saveAudioToFileFromStream)) {
                        this.val$callback.onSuccess(saveAudioToFileFromStream, header);
                    } else {
                        this.val$callback.onError("音频文件验证失败，可能是损坏的文件");
                    }
                } catch (Exception e8) {
                    Log.e(c.TAG, "处理TTS响应失败", e8);
                    this.val$callback.onError("处理响应失败: " + e8.getMessage());
                }
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    public c(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    private RequestBody buildRequestBody(String str, d dVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("input", str);
        if (dVar.getVoice() != null) {
            jsonObject.addProperty("voice", dVar.getVoice());
        }
        jsonObject.addProperty("language", dVar.getLanguage());
        if (dVar.getFormat() != null) {
            jsonObject.addProperty(n.KEY_FORMAT_PROPERTIES, dVar.getFormat());
        }
        if (dVar.getSpeed() != null) {
            jsonObject.addProperty("speed", dVar.getSpeed());
        }
        return RequestBody.create(jsonObject.toString(), MediaType.get("application/json; charset=utf-8"));
    }

    private Request getRequest(String str, d dVar) {
        Request.Builder header = new Request.Builder().url("https://altair.moyoung.com/api/v3/tts").post(buildRequestBody(str, dVar)).header("Content-Type", i.VALUE_APPLICATION_JSON);
        String token = com.moyoung.lib.ai.e.get().oauth.getToken();
        if (token != null && !token.isEmpty()) {
            header.header("Authorization", token);
        }
        header.header("Accept-Language", dVar.getLanguage());
        return header.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File saveAudioToFileFromStream(Response response, String str) {
        FileOutputStream fileOutputStream;
        Log.d(TAG, "开始保存音频文件到目录: " + str);
        File file = new File(str);
        if (!file.exists()) {
            Log.d(TAG, "创建目录结果: " + file.mkdirs());
        }
        File file2 = new File(file, "tts_" + System.currentTimeMillis() + ".mp3");
        StringBuilder sb = new StringBuilder();
        sb.append("目标文件路径: ");
        sb.append(file2.getAbsolutePath());
        Log.d(TAG, sb.toString());
        if (file2.exists()) {
            file2.delete();
        }
        InputStream byteStream = response.body().byteStream();
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            Log.d(TAG, "开始流式写入数据...");
            long j8 = 0;
            while (true) {
                int read = byteStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j8 += read;
            }
            fileOutputStream.flush();
            Log.d(TAG, "音频文件流式保存完成，总大小: " + j8 + " 字节");
            try {
                fileOutputStream.close();
            } catch (IOException e8) {
                Log.e(TAG, "关闭FileOutputStream时出错", e8);
            }
            Log.d(TAG, "音频文件保存成功: " + file2.getAbsolutePath() + ", 文件大小: " + file2.length() + " 字节");
            return file2;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e9) {
                    Log.e(TAG, "关闭FileOutputStream时出错", e9);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ttsSynthesize(Request request, String str, b bVar) {
        this.client.newCall(request).enqueue(new a(bVar, request, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean validateAudioFile(File file) {
        try {
            Log.d(TAG, "验证音频文件: " + file.getAbsolutePath());
            Log.d(TAG, "文件大小: " + file.length() + " 字节");
            if (!file.exists()) {
                Log.e(TAG, "音频文件不存在");
                return false;
            }
            if (file.length() == 0) {
                Log.e(TAG, "音频文件为空");
                return false;
            }
            Log.d(TAG, "音频文件验证通过，文件非空");
            return true;
        } catch (Exception e8) {
            Log.e(TAG, "验证音频文件时出错", e8);
            return false;
        }
    }

    public void textToSpeech(String str, String str2, b bVar) {
        textToSpeech(str, str2, new d.a().setSpeed(Float.valueOf(1.1f)).build(), bVar);
    }

    public void textToSpeech(String str, String str2, d dVar, b bVar) {
        ttsSynthesize(getRequest(str, dVar), str2, bVar);
    }
}
