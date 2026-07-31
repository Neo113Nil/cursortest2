package io.appmetrica.analytics.idsync.impl;

import androidx.work.Data;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f746a;

    public u(ServiceContext serviceContext) {
        this.f746a = serviceContext;
    }

    public final boolean a(String str, String str2) {
        try {
            Response execute = new NetworkClient.Builder().withSslSocketFactory(this.f746a.getNetworkContext().getSslSocketFactoryProvider().getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(Data.MAX_DATA_BYTES).build().newCall(new Request.Builder(str).post(str2.getBytes(Charsets.UTF_8)).addHeader("Content-Type", "application/json").build()).execute();
            if (execute.isCompleted()) {
                if (execute.getCode() != 200) {
                    int code = execute.getCode();
                    if (400 > code || code >= 500) {
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
