package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f9945a;

    /* renamed from: b, reason: collision with root package name */
    public final G f9946b;

    /* renamed from: c, reason: collision with root package name */
    public SdkIdentifiers f9947c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f9948d = new SystemTimeProvider();

    /* renamed from: e, reason: collision with root package name */
    public final o f9949e;

    /* renamed from: f, reason: collision with root package name */
    public final x f9950f;

    /* renamed from: g, reason: collision with root package name */
    public final q f9951g;

    public n(ServiceContext serviceContext, G g4, SdkIdentifiers sdkIdentifiers) {
        this.f9945a = serviceContext;
        this.f9946b = g4;
        this.f9947c = sdkIdentifiers;
        this.f9949e = new o(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f9950f = new x(serviceContext);
        this.f9951g = new q(serviceContext);
    }

    public static final void a(D d4, n nVar, RequestConfig requestConfig) {
        if (d4.f9879b) {
            G g4 = nVar.f9946b;
            String str = d4.f9878a;
            g4.f9895d.put(str, new E(str, nVar.f9948d.currentTimeMillis(), d4.f9881d ? 2 : 4));
            g4.f9892a.putString(g4.f9894c, g4.f9893b.fromModel(d3.i.n0(g4.f9895d.values())));
            q qVar = nVar.f9951g;
            SdkIdentifiers sdkIdentifiers = nVar.f9947c;
            qVar.f9956a.getClass();
            String a3 = v.a(d4);
            t tVar = qVar.f9957b;
            tVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (requestConfig.getReportEventEnabled()) {
                arrayList.add(new p(tVar.f9970a));
            }
            String reportUrl = requestConfig.getReportUrl();
            if (reportUrl != null && !AbstractC1510g.j0(reportUrl)) {
                arrayList.add(new r(tVar.f9970a, requestConfig.getReportUrl()));
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((s) obj).a(a3, sdkIdentifiers);
            }
        }
    }

    public final SdkIdentifiers a() {
        return this.f9947c;
    }

    public final void a(SdkIdentifiers sdkIdentifiers) {
        this.f9947c = sdkIdentifiers;
    }

    public static final void a(n nVar, RequestConfig requestConfig) {
        y c0463a;
        x xVar = nVar.f9950f;
        Preconditions preconditions = requestConfig.getPreconditions();
        xVar.getClass();
        if (w.f9972a[preconditions.getNetworkType().ordinal()] == 1) {
            c0463a = new C0464b(xVar.f9973a);
        } else {
            c0463a = new C0463a();
        }
        if (c0463a.a()) {
            o oVar = nVar.f9949e;
            oVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), d3.i.g0(entry.getValue(), ", ", null, null, null, 62));
            }
            Response execute = new NetworkClientBuilder().withSettings(new NetworkClientSettings.Builder().withSslSocketFactory(oVar.f9952a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build()).build().newCall(builder.build()).execute();
            oVar.f9953b.a(new D(requestConfig.getType(), execute.isCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(execute.getCode())), execute.getCode(), execute.getResponseData(), execute.getHeaders()), requestConfig);
        }
    }

    public final void a(D d4, RequestConfig requestConfig) {
        this.f9945a.getExecutorProvider().getModuleExecutor().execute(new Q1.a(d4, this, requestConfig, 1));
    }

    public final void a(RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        E e4 = (E) this.f9946b.f9895d.get(requestConfig.getType());
        if (e4 != null) {
            long currentTimeMillis = this.f9948d.currentTimeMillis();
            int a3 = A.a(e4.f9887c);
            if (a3 != 1) {
                resendIntervalForValidResponse = a3 != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - e4.f9886b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f9945a.getExecutorProvider().getSupportIOExecutor().execute(new R1.e(this, 3, requestConfig));
    }
}
