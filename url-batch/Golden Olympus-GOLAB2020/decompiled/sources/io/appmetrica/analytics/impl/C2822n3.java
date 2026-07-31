package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2822n3 implements InterfaceC2763km {

    /* renamed from: a, reason: collision with root package name */
    public BillingMonitor f39477a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f39478b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f39479c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f39480d;

    /* renamed from: e, reason: collision with root package name */
    public final BillingType f39481e;

    /* renamed from: f, reason: collision with root package name */
    public final BillingInfoStorage f39482f;

    /* renamed from: g, reason: collision with root package name */
    public final BillingInfoSender f39483g;

    /* renamed from: h, reason: collision with root package name */
    public final ApplicationStateProvider f39484h;

    /* renamed from: i, reason: collision with root package name */
    public final C2770l3 f39485i;

    public C2822n3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingType billingType, @NonNull BillingInfoStorage billingInfoStorage, @NonNull BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, Ia.j().d(), new C2770l3());
    }

    public final void a(@NonNull C2633fm c2633fm, Boolean bool) {
        BillingMonitor c2853o8;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                try {
                    C2770l3 c2770l3 = this.f39485i;
                    Context context = this.f39478b;
                    Executor executor = this.f39479c;
                    Executor executor2 = this.f39480d;
                    BillingType billingType = this.f39481e;
                    BillingInfoStorage billingInfoStorage = this.f39482f;
                    BillingInfoSender billingInfoSender = this.f39483g;
                    c2770l3.getClass();
                    if (AbstractC2744k3.f39328a[billingType.ordinal()] == 1) {
                        c2853o8 = new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null);
                    } else {
                        c2853o8 = new C2853o8();
                    }
                    this.f39477a = c2853o8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2853o8.onBillingConfigChanged(c2633fm.f39002x);
            if (this.f39484h.registerStickyObserver(new C2796m3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f39477a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C2822n3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingType billingType, @NonNull BillingInfoStorage billingInfoStorage, @NonNull BillingInfoSender billingInfoSender, @NonNull ApplicationStateProvider applicationStateProvider, @NonNull C2770l3 c2770l3) {
        this.f39478b = context;
        this.f39479c = executor;
        this.f39480d = executor2;
        this.f39481e = billingType;
        this.f39482f = billingInfoStorage;
        this.f39483g = billingInfoSender;
        this.f39484h = applicationStateProvider;
        this.f39485i = c2770l3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2763km
    public final synchronized void a(@NonNull C2633fm c2633fm) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.f39477a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(c2633fm.f39002x);
        }
    }
}
