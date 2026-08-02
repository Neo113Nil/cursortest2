package io.appmetrica.analytics.billingv8.internal;

import E1.C0027c;
import E1.C0029e;
import E1.C0038n;
import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv8.impl.b;
import io.appmetrica.analytics.billingv8.impl.c;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.l;
import io.appmetrica.analytics.billingv8.impl.n;
import io.appmetrica.analytics.billingv8.impl.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9637a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f9638b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f9639c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f9640d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f9641e;

    /* renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f9642f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f9643g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9644h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f9637a = context;
        this.f9638b = executor;
        this.f9639c = executor2;
        this.f9640d = billingInfoSender;
        this.f9641e = billingInfoManager;
        this.f9642f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (i.a(this.f9643g, billingConfig)) {
            return;
        }
        this.f9643g = billingConfig;
        if (billingConfig != null && !this.f9644h) {
            this.f9644h = true;
            C0027c c0027c = new C0027c(this.f9637a);
            c0027c.f580c = new l();
            c0027c.f578a = new C0038n(false);
            C0029e a3 = c0027c.a();
            try {
                a3.h(new b(billingConfig, a3, new BillingLibraryMonitor$updateBilling$1(this), new d(a3), this));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f9643g;
            if (billingConfig != null && !this.f9644h) {
                this.f9644h = true;
                C0027c c0027c = new C0027c(this.f9637a);
                c0027c.f580c = new l();
                c0027c.f578a = new C0038n(false);
                C0029e a3 = c0027c.a();
                a3.h(new b(billingConfig, a3, new BillingLibraryMonitor$updateBilling$1(this), new d(a3), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv8.impl.n
    public synchronized void onUpdateFinished() {
        this.f9644h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i4, e eVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i4 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i4 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
