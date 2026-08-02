package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
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
    public final ServiceContext f5670a;

    /* renamed from: b, reason: collision with root package name */
    public final B f5671b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f5672c = new SystemTimeProvider();

    /* renamed from: d, reason: collision with root package name */
    public final q f5673d;

    /* renamed from: e, reason: collision with root package name */
    public final s f5674e;
    public final i f;

    public p(ServiceContext serviceContext, B b3) {
        this.f5670a = serviceContext;
        this.f5671b = b3;
        this.f5673d = new q(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f5674e = new s(serviceContext);
        this.f = new i(serviceContext);
    }

    public static final void a(y yVar, p pVar) {
        if (yVar.f5682b) {
            B b3 = pVar.f5671b;
            String str = yVar.f5681a;
            b3.f5623d.put(str, new z(str, pVar.f5672c.currentTimeMillis(), yVar.f5684d ? 2 : 4));
            b3.f5620a.putString(b3.f5622c, b3.f5621b.fromModel(c2.e.Y(b3.f5623d.values())));
            i iVar = pVar.f;
            ModuleSelfReporter selfReporter = iVar.f5648a.getSelfReporter();
            iVar.f5649b.getClass();
            selfReporter.reportEvent("id_sync", j.a(yVar));
        }
    }

    public static final void a(p pVar, RequestConfig requestConfig) {
        t c0346a;
        s sVar = pVar.f5674e;
        Preconditions preconditions = requestConfig.getPreconditions();
        sVar.getClass();
        if (r.f5677a[preconditions.getNetworkType().ordinal()] == 1) {
            c0346a = new C0347b(sVar.f5678a);
        } else {
            c0346a = new C0346a();
        }
        if (c0346a.a()) {
            q qVar = pVar.f5673d;
            qVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), c2.e.S(entry.getValue(), ", ", null, null, null, 62));
            }
            Response execute = new NetworkClient.Builder().withSslSocketFactory(qVar.f5675a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build().newCall(builder.build()).execute();
            qVar.f5676b.a(new y(requestConfig.getType(), execute.isCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(execute.getCode())), execute.getCode(), execute.getResponseData().length == 0 ? execute.getErrorData() : execute.getResponseData(), execute.getHeaders()));
        }
    }

    public final void a(y yVar) {
        this.f5670a.getExecutorProvider().getModuleExecutor().execute(new A1.a(yVar, this));
    }

    public final void a(RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        z zVar = (z) this.f5671b.f5623d.get(requestConfig.getType());
        if (zVar != null) {
            long currentTimeMillis = this.f5672c.currentTimeMillis();
            int a3 = v.a(zVar.f5689c);
            if (a3 != 1) {
                resendIntervalForValidResponse = a3 != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - zVar.f5688b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f5670a.getExecutorProvider().getSupportIOExecutor().execute(new A1.a(this, 0, requestConfig));
    }
}
