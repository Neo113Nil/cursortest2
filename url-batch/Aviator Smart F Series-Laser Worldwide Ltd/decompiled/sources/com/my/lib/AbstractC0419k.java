package com.my.lib;

import com.my.lib.data.TimeoutConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* renamed from: com.my.lib.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0419k {
    public static void a(TimeoutConfig timeoutConfig, String url, String deviceId, String identifier, String str, String params, f6.l success, f6.p failed) {
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.s.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.s.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.s.checkNotNullParameter(params, "params");
        kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
        kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
        try {
            B.a(url);
            B.a(params);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long connectTimeout = timeoutConfig.getConnectTimeout();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).retryOnConnectionFailure(false).build().newCall(F.a(new Request.Builder(), deviceId, identifier, str).post(RequestBody.Companion.create(params, MediaType.Companion.parse(com.yanzhenjie.kalle.i.VALUE_APPLICATION_JSON))).url(url).build()).enqueue(new C0418j(failed, success));
        } catch (Exception e8) {
            B.a("onFailure: ", e8, 1);
            failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
        }
    }
}
