package io.appmetrica.analytics.billingv8.internal;

import G0.C0052b;
import G0.C0054d;
import G0.C0062l;
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
    private final Context f6148a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f6149b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6150c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f6151d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f6152e;

    /* renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f6153f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f6154g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6155h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f6148a = context;
        this.f6149b = executor;
        this.f6150c = executor2;
        this.f6151d = billingInfoSender;
        this.f6152e = billingInfoManager;
        this.f6153f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (i.a(this.f6154g, billingConfig)) {
            return;
        }
        this.f6154g = billingConfig;
        if (billingConfig != null && !this.f6155h) {
            this.f6155h = true;
            C0052b c0052b = new C0052b(this.f6148a);
            c0052b.f816c = new l();
            c0052b.f814a = new C0062l(false);
            C0054d a6 = c0052b.a();
            a6.l(new b(billingConfig, a6, new BillingLibraryMonitor$updateBilling$1(this), new d(a6), this));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f6154g;
            if (billingConfig != null && !this.f6155h) {
                this.f6155h = true;
                C0052b c0052b = new C0052b(this.f6148a);
                c0052b.f816c = new l();
                c0052b.f814a = new C0062l(false);
                C0054d a6 = c0052b.a();
                a6.l(new b(billingConfig, a6, new BillingLibraryMonitor$updateBilling$1(this), new d(a6), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv8.impl.n
    public synchronized void onUpdateFinished() {
        this.f6155h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i2, e eVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i2 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i2 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
