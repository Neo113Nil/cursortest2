package com.my.lib;

import com.my.lib.data.TimeoutConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.my.lib.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0432x {
    public static void a(TimeoutConfig timeoutConfig, String imageUrl, String filePath, f6.l success, f6.p failed) {
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(imageUrl, "imageUrl");
        kotlin.jvm.internal.s.checkNotNullParameter(filePath, "filePath");
        kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
        kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
        try {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long connectTimeout = timeoutConfig.getConnectTimeout();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).build().newCall(new Request.Builder().url(imageUrl).build()).enqueue(new C0431w(failed, filePath, success));
        } catch (Exception e8) {
            B.a("onFailure: ", e8, 1);
            failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
        }
    }

    public static File a(TimeoutConfig timeoutConfig, String imageUrl, String filePath) {
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(imageUrl, "imageUrl");
        kotlin.jvm.internal.s.checkNotNullParameter(filePath, "filePath");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long connectTimeout = timeoutConfig.getConnectTimeout();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        try {
            Response execute = builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).build().newCall(new Request.Builder().url(imageUrl).build()).execute();
            if (!execute.isSuccessful()) {
                execute.close();
                return null;
            }
            ResponseBody body = execute.body();
            if (body == null) {
                execute.close();
                return null;
            }
            byte[] bytes = body.bytes();
            File file = new File(filePath);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                execute.close();
                return file;
            } catch (IOException e8) {
                e8.printStackTrace();
                execute.close();
                return null;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
