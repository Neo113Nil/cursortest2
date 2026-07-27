package io.appmetrica.analytics.billing.impl;

import android.content.Context;
import io.appmetrica.analytics.billing.impl.m;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.monitor.DummyBillingMonitor;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor;
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
    public final ServiceContext f5974a;

    /* renamed from: b, reason: collision with root package name */
    public B f5975b;

    /* renamed from: c, reason: collision with root package name */
    public BillingMonitor f5976c;

    public m(ServiceContext serviceContext, B b6) {
        this.f5974a = serviceContext;
        this.f5975b = b6;
    }

    public final void a(B b6) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.f5976c;
        if (billingMonitor != null) {
            if (b6 != null) {
                A a6 = b6.f5951b;
                billingConfig = new BillingConfig(a6.f5948a, a6.f5949b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f5975b = b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    public final void onMainReporterCreated(ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        String str;
        Field field;
        if (serviceModuleReporterComponentContext.getConfig().isRevenueAutoTrackingEnabled()) {
            Context context = this.f5974a.getContext();
            IHandlerExecutor defaultExecutor = this.f5974a.getExecutorProvider().getDefaultExecutor();
            Executor uiExecutor = this.f5974a.getExecutorProvider().getUiExecutor();
            try {
                Class<?> findClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
                str = (String) ((findClass == null || (field = findClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
            } catch (Throwable unused) {
                str = null;
            }
            BillingType billingType = (str == null || B4.k.Z(str)) ? BillingType.NONE : B4.r.O(str, "2.", false) ? BillingType.NONE : B4.r.O(str, "3.", false) ? BillingType.NONE : B4.r.O(str, "4.", false) ? BillingType.NONE : B4.r.O(str, "5.", false) ? BillingType.LIBRARY_V6 : B4.r.O(str, "6.", false) ? BillingType.LIBRARY_V6 : B4.r.O(str, "7.", false) ? BillingType.LIBRARY_V6 : B4.r.O(str, "8.", false) ? BillingType.LIBRARY_V8 : BillingType.LIBRARY_V8;
            k kVar = new k(this.f5974a.getServiceStorageProvider().createBinaryStateStorageFactory("auto_inapp_collecting_info_data", new e(), new C0496b(null, 1, null)).create(this.f5974a.getContext()));
            j jVar = new j(serviceModuleReporterComponentContext.getReporter(), this.f5974a.getExecutorProvider().getReportRunnableExecutor(), null, 4, null);
            int i2 = l.f5973a[billingType.ordinal()];
            this.f5976c = i2 != 1 ? i2 != 2 ? new DummyBillingMonitor() : new BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null) : new io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
            a(this.f5975b);
            if (this.f5974a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: r2.a
                @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
                public final void onApplicationStateChanged(ApplicationState applicationState) {
                    m.a(m.this, applicationState);
                }
            }) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f5976c;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.f5976c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
