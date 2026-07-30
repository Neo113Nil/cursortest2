package com.my.lib;

import com.my.lib.data.TimeoutConfig;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* renamed from: com.my.lib.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0415g {
    public static void a(File soundFile, String fileFormat, TimeoutConfig timeoutConfig, f6.l success, f6.p failed) {
        kotlin.jvm.internal.s.checkNotNullParameter(soundFile, "soundFile");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter("https://video.aiwatchmy.mom/my/ttsFile/upload", "url");
        kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
        kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
        try {
            B.a("https://video.aiwatchmy.mom/my/ttsFile/upload");
            String path = soundFile.getPath();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(path, "getPath(...)");
            B.a(path);
            MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM);
            String name = soundFile.getName();
            RequestBody.Companion companion = RequestBody.Companion;
            MediaType.Companion companion2 = MediaType.Companion;
            MediaType parse = companion2.parse("audio/" + fileFormat);
            if (parse == null) {
                parse = companion2.get("application/octet-stream");
            }
            MultipartBody build = type.addFormDataPart("YtYn", name, companion.create(soundFile, parse)).build();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long connectTimeout = timeoutConfig.getConnectTimeout();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).retryOnConnectionFailure(false).addInterceptor(new C0421m()).build().newCall(new Request.Builder().post(build).url("https://video.aiwatchmy.mom/my/ttsFile/upload").build()).enqueue(new C0414f(failed, success));
        } catch (Exception e8) {
            B.a("onFailure: ", e8, 1);
            failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
        }
    }
}
