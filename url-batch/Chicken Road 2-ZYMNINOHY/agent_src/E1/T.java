package E1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0315f1;
import com.google.android.gms.internal.play_billing.C0321h1;
import com.google.android.gms.internal.play_billing.G0;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.I1;
import com.google.android.gms.internal.play_billing.InterfaceC0322i;
import com.google.android.gms.internal.play_billing.J1;
import com.google.android.gms.internal.play_billing.K1;
import com.google.android.gms.internal.play_billing.l1;
import com.google.android.gms.internal.play_billing.o1;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class T extends C0029e {

    /* renamed from: H, reason: collision with root package name */
    public final Context f522H;

    /* renamed from: I, reason: collision with root package name */
    public volatile int f523I;

    /* renamed from: J, reason: collision with root package name */
    public volatile InterfaceC0322i f524J;

    /* renamed from: K, reason: collision with root package name */
    public volatile S f525K;
    public volatile ScheduledExecutorService L;

    public T(Context context, C0027c c0027c) {
        super(context, c0027c);
        this.f523I = 0;
        this.f522H = context;
    }

    public final com.google.android.gms.internal.play_billing.W P(int i4) {
        if (!W()) {
            AbstractC0352w.h("BillingClientTesting", "Billing Override Service is not ready.");
            Q(94, 28, W.a(-1, "Billing Override Service connection is disconnected."));
            return new com.google.android.gms.internal.play_billing.U(0);
        }
        P p2 = new P(i4, 0, this);
        H1 h1 = new H1();
        h1.f5853c = new K1();
        J1 j12 = new J1(h1);
        h1.f5852b = j12;
        h1.f5851a = P.class;
        try {
            p2.g(h1);
            h1.f5851a = "billingOverrideService.getBillingOverride";
            return j12;
        } catch (Exception e4) {
            G0 g02 = new G0(e4);
            U.i iVar = G1.f5840f;
            I1 i12 = j12.f5865b;
            if (iVar.M(i12, null, g02)) {
                G1.c(i12);
            }
            return j12;
        }
    }

    public final void Q(int i4, int i5, C0037m c0037m) {
        int i6 = U.f526a;
        C0315f1 b4 = U.b(i4, i5, c0037m, null, l1.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(b4, "ApiFailure should not be null");
        this.f601h.v(b4);
    }

    public final void R(int i4) {
        int i5 = U.f526a;
        C0321h1 c4 = U.c(i4, l1.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c4, "ApiSuccess should not be null");
        l2.e eVar = this.f601h;
        eVar.getClass();
        try {
            eVar.H(c4, (o1) eVar.f14270b);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void S(int i4, D.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        com.google.android.gms.internal.play_billing.W P4 = P(i4);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.L == null) {
                    this.L = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.L;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!P4.isDone()) {
            com.google.android.gms.internal.play_billing.Z z = new com.google.android.gms.internal.play_billing.Z();
            z.f5929h = P4;
            com.google.android.gms.internal.play_billing.X x4 = new com.google.android.gms.internal.play_billing.X();
            x4.f5928a = z;
            z.f5930i = scheduledExecutorService.schedule(x4, 28500L, timeUnit);
            P4.a(x4, com.google.android.gms.internal.play_billing.S.f5908a);
            P4 = z;
        }
        N n = new N(this, i4, aVar, runnable);
        P4.a(new com.google.android.gms.internal.play_billing.T(P4, n), i());
    }

    public final synchronized boolean W() {
        if (this.f523I == 2 && this.f524J != null) {
            if (this.f525K != null) {
                return true;
            }
        }
        return false;
    }

    @Override // E1.C0029e, E1.AbstractC0028d
    public final void a(C3.v vVar, io.flutter.plugins.inapppurchase.f fVar) {
        S(3, new B.h(3, fVar), new B.o(this, vVar, fVar, 4));
    }

    @Override // E1.C0029e, E1.AbstractC0028d
    public final void b(final C3.v vVar, final io.flutter.plugins.inapppurchase.f fVar) {
        S(4, new D.a() { // from class: E1.O
            @Override // D.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                String str = vVar.f321b;
                fVar.f((C0037m) obj, str);
            }
        }, new B.o(this, vVar, fVar, 3));
    }

    @Override // E1.C0029e, E1.AbstractC0028d
    public final void c() {
        synchronized (this) {
            R(27);
            try {
                try {
                    if (this.f525K != null && this.f524J != null) {
                        AbstractC0352w.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f522H.unbindService(this.f525K);
                        this.f525K = new S(this);
                    }
                    this.f524J = null;
                    if (this.L != null) {
                        this.L.shutdownNow();
                        this.L = null;
                    }
                } catch (RuntimeException e4) {
                    AbstractC0352w.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e4);
                }
                this.f523I = 3;
            } catch (Throwable th) {
                this.f523I = 3;
                throw th;
            }
        }
        super.c();
    }

    @Override // E1.C0029e, E1.AbstractC0028d
    public final C0037m d(Activity activity, C0035k c0035k) {
        int i4 = 0;
        try {
            i4 = ((Integer) P(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e4) {
            Q(102, 28, W.f532E);
            AbstractC0352w.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e4);
        } catch (Exception e5) {
            if (e5 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Q(95, 28, W.f532E);
            AbstractC0352w.i("BillingClientTesting", "An error occurred while retrieving billing override.", e5);
        }
        if (i4 > 0) {
            C0037m a3 = W.a(i4, "Billing override value was set by a license tester.");
            Q(93, 2, a3);
            O(a3);
            return a3;
        }
        try {
            return super.d(activity, c0035k);
        } catch (Exception e6) {
            C0037m c0037m = W.f540h;
            Q(103, 2, c0037m);
            AbstractC0352w.i("BillingClientTesting", "An internal error occurred.", e6);
            return c0037m;
        }
    }

    @Override // E1.C0029e, E1.AbstractC0028d
    public final void e(C0048y c0048y, InterfaceC0044u interfaceC0044u) {
        S(7, new B.h(2, interfaceC0044u), new B.o(this, c0048y, interfaceC0044u, 2));
    }

    @Override // E1.C0029e, E1.AbstractC0028d
    public final void h(InterfaceC0030f interfaceC0030f) {
        synchronized (this) {
            if (W()) {
                AbstractC0352w.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                R(26);
            } else {
                int i4 = 1;
                if (this.f523I == 1) {
                    AbstractC0352w.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.f523I == 3) {
                    AbstractC0352w.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    Q(38, 26, W.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f523I = 1;
                    AbstractC0352w.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.f525K = new S(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.f522H;
                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i4 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                AbstractC0352w.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.f525K, 1)) {
                                    AbstractC0352w.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    AbstractC0352w.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i4 = 39;
                        }
                    }
                    this.f523I = 0;
                    AbstractC0352w.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    Q(i4, 26, W.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        u(interfaceC0030f);
    }

    public T(C0038n c0038n, Context context, C0027c c0027c) {
        super(c0038n, context, c0027c);
        this.f523I = 0;
        this.f522H = context;
    }

    public T(C0038n c0038n, Context context, InterfaceC0047x interfaceC0047x, C0027c c0027c) {
        super(c0038n, context, interfaceC0047x, c0027c);
        this.f523I = 0;
        this.f522H = context;
    }

    public T(C0038n c0038n, Context context, InterfaceC0047x interfaceC0047x, C c4, C0027c c0027c) {
        super(c0038n, context, interfaceC0047x, c4, c0027c);
        this.f523I = 0;
        this.f522H = context;
    }
}
