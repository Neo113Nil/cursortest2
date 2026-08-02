package io.appmetrica.analytics.billingv6.internal;

import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor$updateBilling$1 implements UtilsProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BillingLibraryMonitor f9592a;

    public BillingLibraryMonitor$updateBilling$1(BillingLibraryMonitor billingLibraryMonitor) {
        this.f9592a = billingLibraryMonitor;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public BillingInfoManager getBillingInfoManager() {
        BillingInfoManager billingInfoManager;
        billingInfoManager = this.f9592a.f9588e;
        return billingInfoManager;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public BillingInfoSender getBillingInfoSender() {
        BillingInfoSender billingInfoSender;
        billingInfoSender = this.f9592a.f9587d;
        return billingInfoSender;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public Executor getUiExecutor() {
        Executor executor;
        executor = this.f9592a.f9586c;
        return executor;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public UpdatePolicy getUpdatePolicy() {
        UpdatePolicy updatePolicy;
        updatePolicy = this.f9592a.f9589f;
        return updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public Executor getWorkerExecutor() {
        Executor executor;
        executor = this.f9592a.f9585b;
        return executor;
    }
}
