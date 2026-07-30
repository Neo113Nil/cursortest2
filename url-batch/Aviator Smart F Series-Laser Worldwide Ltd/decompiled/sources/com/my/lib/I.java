package com.my.lib;

import com.my.lib.data.TimeoutConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public abstract class I {
    public static void a(TimeoutConfig timeoutConfig, String url, String deviceId, String identifier, f6.l success, f6.p failed) {
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.s.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.s.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
        kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
        try {
            B.a(url);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long connectTimeout = timeoutConfig.getConnectTimeout();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).retryOnConnectionFailure(false).build().newCall(F.a(new Request.Builder(), "", "", "").get().url(url).build()).enqueue(new H(failed, success));
        } catch (Exception e8) {
            B.a("onFailure: ", e8, 1);
            failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
        }
    }
}
