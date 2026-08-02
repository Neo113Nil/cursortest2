package io.appmetrica.analytics.billingv6.internal;

import E1.C0027c;
import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.c;
import io.appmetrica.analytics.billingv6.impl.l;
import io.appmetrica.analytics.billingv6.impl.n;
import io.appmetrica.analytics.billingv6.impl.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9584a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f9585b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f9586c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f9587d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f9588e;

    /* renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f9589f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f9590g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9591h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f9584a = context;
        this.f9585b = executor;
        this.f9586c = executor2;
        this.f9587d = billingInfoSender;
        this.f9588e = billingInfoManager;
        this.f9589f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (i.a(this.f9590g, billingConfig)) {
            return;
        }
        this.f9590g = billingConfig;
        if (billingConfig != null && !this.f9591h) {
            this.f9591h = true;
            new l();
            C0027c.b();
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            if (this.f9590g != null && !this.f9591h) {
                this.f9591h = true;
                new l();
                C0027c.b();
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv6.impl.n
    public synchronized void onUpdateFinished() {
        this.f9591h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i4, e eVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i4 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i4 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
