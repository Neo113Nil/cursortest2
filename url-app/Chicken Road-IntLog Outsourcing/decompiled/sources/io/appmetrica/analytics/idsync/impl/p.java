package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import g4.AbstractC0465j;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f6440a;

    /* renamed from: b, reason: collision with root package name */
    public final B f6441b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f6442c = new SystemTimeProvider();

    /* renamed from: d, reason: collision with root package name */
    public final q f6443d;

    /* renamed from: e, reason: collision with root package name */
    public final s f6444e;

    /* renamed from: f, reason: collision with root package name */
    public final i f6445f;

    public p(ServiceContext serviceContext, B b6) {
        this.f6440a = serviceContext;
        this.f6441b = b6;
        this.f6443d = new q(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f6444e = new s(serviceContext);
        this.f6445f = new i(serviceContext);
    }

    public static final void a(y yVar, p pVar) {
        if (yVar.f6453b) {
            B b6 = pVar.f6441b;
            String str = yVar.f6452a;
            b6.f6390d.put(str, new z(str, pVar.f6442c.currentTimeMillis(), yVar.f6455d ? 2 : 4));
            b6.f6387a.putString(b6.f6389c, b6.f6388b.fromModel(AbstractC0465j.S0(b6.f6390d.values())));
            i iVar = pVar.f6445f;
            ModuleSelfReporter selfReporter = iVar.f6417a.getSelfReporter();
            iVar.f6418b.getClass();
            selfReporter.reportEvent("id_sync", j.a(yVar));
        }
    }

    public static final void a(p pVar, RequestConfig requestConfig) {
        t c0497a;
        s sVar = pVar.f6444e;
        Preconditions preconditions = requestConfig.getPreconditions();
        sVar.getClass();
        if (r.f6448a[preconditions.getNetworkType().ordinal()] == 1) {
            c0497a = new C0498b(sVar.f6449a);
        } else {
            c0497a = new C0497a();
        }
        if (c0497a.a()) {
            q qVar = pVar.f6443d;
            qVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), AbstractC0465j.K0(entry.getValue(), ", ", null, null, null, 62));
            }
            Response execute = new NetworkClient.Builder().withSslSocketFactory(qVar.f6446a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build().newCall(builder.build()).execute();
            qVar.f6447b.a(new y(requestConfig.getType(), execute.isCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(execute.getCode())), execute.getCode(), execute.getResponseData().length == 0 ? execute.getErrorData() : execute.getResponseData(), execute.getHeaders()));
        }
    }

    public final void a(y yVar) {
        this.f6440a.getExecutorProvider().getModuleExecutor().execute(new B3.c(yVar, 23, this));
    }

    public final void a(RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        z zVar = (z) this.f6441b.f6390d.get(requestConfig.getType());
        if (zVar != null) {
            long currentTimeMillis = this.f6442c.currentTimeMillis();
            int a6 = v.a(zVar.f6461c);
            if (a6 != 1) {
                resendIntervalForValidResponse = a6 != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - zVar.f6460b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f6440a.getExecutorProvider().getSupportIOExecutor().execute(new B3.c(this, 22, requestConfig));
    }
}
