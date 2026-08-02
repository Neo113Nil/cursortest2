package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import i1.C0342b;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.b;
import io.appmetrica.analytics.billingv6.impl.c;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.l;
import io.appmetrica.analytics.billingv6.impl.n;
import io.appmetrica.analytics.billingv6.impl.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import n0.C1141c;
import n0.C1143e;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5336a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5337b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5338c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f5339d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f5340e;
    private final UpdatePolicy f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f5341g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5342h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f5336a = context;
        this.f5337b = executor;
        this.f5338c = executor2;
        this.f5339d = billingInfoSender;
        this.f5340e = billingInfoManager;
        this.f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (j.a(this.f5341g, billingConfig)) {
            return;
        }
        this.f5341g = billingConfig;
        if (billingConfig != null && !this.f5342h) {
            this.f5342h = true;
            C1141c c1141c = new C1141c(this.f5336a);
            c1141c.f10057c = new l();
            c1141c.f10055a = new C0342b(false);
            C1143e a3 = c1141c.a();
            try {
                a3.l(new b(billingConfig, a3, new BillingLibraryMonitor$updateBilling$1(this), new d(a3), this));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f5341g;
            if (billingConfig != null && !this.f5342h) {
                this.f5342h = true;
                C1141c c1141c = new C1141c(this.f5336a);
                c1141c.f10057c = new l();
                c1141c.f10055a = new C0342b(false);
                C1143e a3 = c1141c.a();
                a3.l(new b(billingConfig, a3, new BillingLibraryMonitor$updateBilling$1(this), new d(a3), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv6.impl.n
    public synchronized void onUpdateFinished() {
        this.f5342h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i3, f fVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i3 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i3 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
