package io.appmetrica.analytics.billing.impl;

import android.content.Context;
import io.appmetrica.analytics.billing.impl.m;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.monitor.DummyBillingMonitor;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements ServiceModuleReporterComponentLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f5223a;

    /* renamed from: b, reason: collision with root package name */
    public B f5224b;

    /* renamed from: c, reason: collision with root package name */
    public BillingMonitor f5225c;

    public m(ServiceContext serviceContext, B b3) {
        this.f5223a = serviceContext;
        this.f5224b = b3;
    }

    public final void a(B b3) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.f5225c;
        if (billingMonitor != null) {
            if (b3 != null) {
                A a3 = b3.f5202b;
                billingConfig = new BillingConfig(a3.f5199a, a3.f5200b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f5224b = b3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMainReporterCreated(ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        String str;
        BillingMonitor billingLibraryMonitor;
        BillingMonitor billingMonitor;
        Field field;
        if (!serviceModuleReporterComponentContext.getConfig().isRevenueAutoTrackingEnabled()) {
            return;
        }
        Context context = this.f5223a.getContext();
        IHandlerExecutor defaultExecutor = this.f5223a.getExecutorProvider().getDefaultExecutor();
        Executor uiExecutor = this.f5223a.getExecutorProvider().getUiExecutor();
        try {
            Class<?> findClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((findClass == null || (field = findClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
            str = null;
        }
        BillingType billingType = (str == null || s2.n.U(str)) ? BillingType.NONE : s2.n.X(str, "2.") ? BillingType.NONE : s2.n.X(str, "3.") ? BillingType.NONE : s2.n.X(str, "4.") ? BillingType.NONE : s2.n.X(str, "5.") ? BillingType.LIBRARY_V6 : s2.n.X(str, "6.") ? BillingType.LIBRARY_V6 : s2.n.X(str, "7.") ? BillingType.LIBRARY_V6 : s2.n.X(str, "8.") ? BillingType.LIBRARY_V8 : BillingType.LIBRARY_V8;
        k kVar = new k(this.f5223a.getServiceStorageProvider().createBinaryStateStorageFactory("auto_inapp_collecting_info_data", new e(), new C0345b(null, 1, null)).create(this.f5223a.getContext()));
        j jVar = new j(serviceModuleReporterComponentContext.getReporter(), this.f5223a.getExecutorProvider().getReportRunnableExecutor(), null, 4, null);
        int i3 = l.f5222a[billingType.ordinal()];
        if (i3 == 1) {
            billingLibraryMonitor = new BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
        } else {
            if (i3 != 2) {
                billingMonitor = new DummyBillingMonitor();
                this.f5225c = billingMonitor;
                a(this.f5224b);
                if (this.f5223a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: z1.a
                    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
                    public final void onApplicationStateChanged(ApplicationState applicationState) {
                        m.a(m.this, applicationState);
                    }
                }) != ApplicationState.VISIBLE) {
                    try {
                        BillingMonitor billingMonitor2 = this.f5225c;
                        if (billingMonitor2 != null) {
                            billingMonitor2.onSessionResumed();
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            }
            billingLibraryMonitor = new io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
        }
        billingMonitor = billingLibraryMonitor;
        this.f5225c = billingMonitor;
        a(this.f5224b);
        if (this.f5223a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: z1.a
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
            public final void onApplicationStateChanged(ApplicationState applicationState) {
                m.a(m.this, applicationState);
            }
        }) != ApplicationState.VISIBLE) {
        }
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.f5225c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
