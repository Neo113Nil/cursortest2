package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f740a;
    public final G b;
    public SdkIdentifiers c;
    public final SystemTimeProvider d = new SystemTimeProvider();
    public final o e;
    public final x f;
    public final q g;

    public n(ServiceContext serviceContext, G g, SdkIdentifiers sdkIdentifiers) {
        this.f740a = serviceContext;
        this.b = g;
        this.c = sdkIdentifiers;
        this.e = new o(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f = new x(serviceContext);
        this.g = new q(serviceContext);
    }

    public static final void a(D d, n nVar, RequestConfig requestConfig) {
        if (d.b) {
            G g = nVar.b;
            String str = d.f724a;
            g.d.put(str, new E(str, nVar.d.currentTimeMillis(), d.d ? 2 : 4));
            g.f727a.putString(g.c, g.b.fromModel(CollectionsKt.toList(g.d.values())));
            q qVar = nVar.g;
            SdkIdentifiers sdkIdentifiers = nVar.c;
            qVar.f743a.getClass();
            String a2 = v.a(d);
            t tVar = qVar.b;
            tVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (requestConfig.getReportEventEnabled()) {
                arrayList.add(new p(tVar.f745a));
            }
            String reportUrl = requestConfig.getReportUrl();
            if (reportUrl != null && !StringsKt.isBlank(reportUrl)) {
                arrayList.add(new r(tVar.f745a, requestConfig.getReportUrl()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(a2, sdkIdentifiers);
            }
        }
    }

    public final SdkIdentifiers a() {
        return this.c;
    }

    public final void a(SdkIdentifiers sdkIdentifiers) {
        this.c = sdkIdentifiers;
    }

    public static final void a(n nVar, RequestConfig requestConfig) {
        y c0024a;
        x xVar = nVar.f;
        Preconditions preconditions = requestConfig.getPreconditions();
        xVar.getClass();
        if (w.f747a[preconditions.getNetworkType().ordinal()] == 1) {
            c0024a = new C0025b(xVar.f748a);
        } else {
            c0024a = new C0024a();
        }
        if (c0024a.a()) {
            o oVar = nVar.e;
            oVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), CollectionsKt.joinToString$default(entry.getValue(), ", ", null, null, 0, null, null, 62, null));
            }
            Response execute = new NetworkClient.Builder().withSslSocketFactory(oVar.f741a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build().newCall(builder.build()).execute();
            oVar.b.a(new D(requestConfig.getCom.onesignal.inAppMessages.internal.display.impl.WebViewManager.EVENT_TYPE_KEY java.lang.String(), execute.isCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(execute.getCode())), execute.getCode(), !(execute.getResponseData().length == 0) ? execute.getResponseData() : execute.getErrorData(), execute.getHeaders()), requestConfig);
        }
    }

    public final void a(final D d, final RequestConfig requestConfig) {
        this.f740a.getExecutorProvider().getModuleExecutor().execute(new Runnable() { // from class: io.appmetrica.analytics.idsync.impl.n$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                n.a(D.this, this, requestConfig);
            }
        });
    }

    public final void a(final RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getCom.onesignal.inAppMessages.internal.display.impl.WebViewManager.EVENT_TYPE_KEY java.lang.String()) || TextUtils.isEmpty(requestConfig.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        E e = (E) this.b.d.get(requestConfig.getCom.onesignal.inAppMessages.internal.display.impl.WebViewManager.EVENT_TYPE_KEY java.lang.String());
        if (e != null) {
            long currentTimeMillis = this.d.currentTimeMillis();
            int a2 = A.a(e.c);
            if (a2 != 1) {
                resendIntervalForValidResponse = a2 != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - e.b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f740a.getExecutorProvider().getSupportIOExecutor().execute(new Runnable() { // from class: io.appmetrica.analytics.idsync.impl.n$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                n.a(n.this, requestConfig);
            }
        });
    }
}
