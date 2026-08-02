package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements BillingInfoSender {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceComponentModuleReporter f5217a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5218b;

    /* renamed from: c, reason: collision with root package name */
    public final o f5219c;

    public j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar) {
        this.f5217a = serviceComponentModuleReporter;
        this.f5218b = executor;
        this.f5219c = oVar;
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f5217a;
        ServiceModuleCounterReport.Builder withType = ServiceModuleCounterReport.Companion.newBuilder().withType(40976);
        jVar.f5219c.getClass();
        serviceComponentModuleReporter.handleReport(withType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(List<? extends ProductInfo> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f5218b.execute(new A1.a(this, 22, (ProductInfo) it.next()));
        }
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i3, kotlin.jvm.internal.f fVar) {
        this(serviceComponentModuleReporter, executor, (i3 & 4) != 0 ? new o() : oVar);
    }
}
