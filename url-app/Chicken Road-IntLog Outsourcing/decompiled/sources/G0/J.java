package G0;

import M2.C0097a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.A0;
import com.google.android.gms.internal.play_billing.AbstractC0325d1;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.B0;
import com.google.android.gms.internal.play_billing.C0361p1;
import com.google.android.gms.internal.play_billing.C0374u0;
import com.google.android.gms.internal.play_billing.E0;
import com.google.android.gms.internal.play_billing.EnumC0365r0;
import com.google.android.gms.internal.play_billing.F0;
import com.google.android.gms.internal.play_billing.H0;
import com.google.android.gms.internal.play_billing.InterfaceC0335h;
import com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC0389z0;
import com.google.android.gms.internal.play_billing.InterfaceFutureC0386y0;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.RunnableC0371t0;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;
import com.google.android.gms.internal.play_billing.v2;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class J extends C0054d {

    /* renamed from: F, reason: collision with root package name */
    public final Context f760F;

    /* renamed from: G, reason: collision with root package name */
    public volatile int f761G;

    /* renamed from: H, reason: collision with root package name */
    public volatile InterfaceC0335h f762H;

    /* renamed from: I, reason: collision with root package name */
    public volatile I f763I;

    /* renamed from: J, reason: collision with root package name */
    public volatile A0 f764J;

    public J(Context context) {
        super(context);
        this.f761G = 0;
        this.f760F = context;
    }

    public final /* synthetic */ void L(C0051a c0051a, D3.g gVar) {
        super.e(c0051a, gVar);
    }

    public final /* synthetic */ void M(D3.g gVar, C0061k c0061k) {
        super.f(gVar, c0061k);
    }

    public final /* synthetic */ void N(B1.g gVar, InterfaceC0067q interfaceC0067q) {
        super.c(gVar, interfaceC0067q);
    }

    public final synchronized boolean O() {
        if (this.f761G == 2 && this.f762H != null) {
            if (this.f763I != null) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceFutureC0386y0 P(int i2) {
        if (!O()) {
            AbstractC0357o0.g("BillingClientTesting", "Billing Override Service is not ready.");
            Q(106, 28, O.a(-1, "Billing Override Service connection is disconnected."));
            return new C0374u0();
        }
        F f3 = new F(i2, 0, this);
        s2 s2Var = new s2();
        s2Var.f5255c = new v2();
        u2 u2Var = new u2(s2Var);
        s2Var.f5254b = u2Var;
        s2Var.f5253a = F.class;
        try {
            f3.f(s2Var);
            s2Var.f5253a = "billingOverrideService.getBillingOverride";
        } catch (Exception e3) {
            C0361p1 c0361p1 = new C0361p1(e3);
            AbstractC0325d1 abstractC0325d1 = r2.f5245f;
            t2 t2Var = u2Var.f5269b;
            if (abstractC0325d1.D(t2Var, null, c0361p1)) {
                r2.d(t2Var);
            }
        }
        return u2Var;
    }

    public final void Q(int i2, int i3, C0060j c0060j) {
        Q1 b6 = M.b(i2, i3, c0060j);
        Objects.requireNonNull(b6, "ApiFailure should not be null");
        this.f830g.h(b6);
    }

    public final void R(int i2, Consumer consumer, Runnable runnable) {
        A0 a02;
        InterfaceExecutorServiceC0389z0 interfaceExecutorServiceC0389z0;
        InterfaceExecutorServiceC0389z0 e02;
        InterfaceFutureC0386y0 P5 = P(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f764J == null) {
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.f764J = newSingleThreadScheduledExecutor instanceof A0 ? (A0) newSingleThreadScheduledExecutor : new E0(newSingleThreadScheduledExecutor);
                }
                a02 = this.f764J;
            } finally {
            }
        }
        if (!P5.isDone()) {
            H0 h02 = new H0();
            h02.f5053h = P5;
            F0 f02 = new F0();
            f02.f5047a = h02;
            h02.f5054i = ((E0) a02).schedule(f02, 28500L, timeUnit);
            P5.b(f02, EnumC0365r0.f5239a);
            P5 = h02;
        }
        k1.n nVar = new k1.n(this, i2, consumer, runnable);
        synchronized (this) {
            try {
                if (this.f822D == null) {
                    ExecutorService q5 = q();
                    if (q5 instanceof InterfaceExecutorServiceC0389z0) {
                        e02 = (InterfaceExecutorServiceC0389z0) q5;
                    } else {
                        e02 = q5 instanceof ScheduledExecutorService ? new E0((ScheduledExecutorService) q5) : new B0(q5);
                    }
                    this.f822D = e02;
                }
                interfaceExecutorServiceC0389z0 = this.f822D;
            } finally {
            }
        }
        P5.b(new RunnableC0371t0(P5, nVar), interfaceExecutorServiceC0389z0);
    }

    @Override // G0.C0054d, G0.AbstractC0053c
    public final void a() {
        synchronized (this) {
            S1 d6 = M.d(27);
            Objects.requireNonNull(d6, "ApiSuccess should not be null");
            this.f830g.k(d6);
            try {
                try {
                    if (this.f763I != null && this.f762H != null) {
                        AbstractC0357o0.f("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f760F.unbindService(this.f763I);
                        this.f763I = new I(this);
                    }
                    this.f762H = null;
                    if (this.f764J != null) {
                        ((B0) this.f764J).shutdownNow();
                        this.f764J = null;
                    }
                } catch (RuntimeException e3) {
                    AbstractC0357o0.h("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e3);
                }
                this.f761G = 3;
            } catch (Throwable th) {
                this.f761G = 3;
                throw th;
            }
        }
        super.a();
    }

    @Override // G0.C0054d, G0.AbstractC0053c
    public final void c(B1.g gVar, InterfaceC0067q interfaceC0067q) {
        R(7, new E(0, interfaceC0067q), new B.l(this, gVar, interfaceC0067q, 2));
    }

    @Override // G0.C0054d
    public final void e(C0051a c0051a, D3.g gVar) {
        R(3, new E(2, gVar), new B.l(this, c0051a, gVar, 4));
    }

    @Override // G0.C0054d
    public final void f(D3.g gVar, C0061k c0061k) {
        R(4, new E(gVar, c0061k), new B.l(this, c0061k, gVar, 3));
    }

    @Override // G0.C0054d
    public final C0060j j(AbstractActivityC1515c abstractActivityC1515c, C0059i c0059i) {
        int i2 = 0;
        try {
            i2 = ((Integer) P(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e3) {
            Q(114, 28, O.f770E);
            AbstractC0357o0.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e3);
        } catch (Exception e6) {
            if (e6 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Q(107, 28, O.f770E);
            AbstractC0357o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", e6);
        }
        if (i2 > 0) {
            C0060j a6 = O.a(i2, "Billing override value was set by a license tester.");
            Q(105, 2, a6);
            K(a6);
            return a6;
        }
        try {
            return super.j(abstractActivityC1515c, c0059i);
        } catch (Exception e7) {
            C0060j c0060j = O.f779i;
            Q(115, 2, c0060j);
            AbstractC0357o0.h("BillingClientTesting", "An internal error occurred.", e7);
            return c0060j;
        }
    }

    @Override // G0.C0054d
    public final void l(InterfaceC0055e interfaceC0055e) {
        synchronized (this) {
            if (O()) {
                AbstractC0357o0.f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                S1 d6 = M.d(26);
                Objects.requireNonNull(d6, "ApiSuccess should not be null");
                this.f830g.k(d6);
            } else {
                int i2 = 1;
                if (this.f761G == 1) {
                    AbstractC0357o0.g("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.f761G == 3) {
                    AbstractC0357o0.g("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    Q(38, 26, O.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f761G = 1;
                    AbstractC0357o0.f("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.f763I = new I(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> queryIntentServices = this.f760F.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i2 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                AbstractC0357o0.g("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.f760F.bindService(intent2, this.f763I, 1)) {
                                    AbstractC0357o0.f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    AbstractC0357o0.g("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i2 = 39;
                        }
                    }
                    this.f761G = 0;
                    AbstractC0357o0.f("BillingClientTesting", "Billing Override Service unavailable on device.");
                    Q(i2, 26, O.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.l(interfaceC0055e);
    }

    public J(C0062l c0062l, Context context) {
        super(c0062l, context);
        this.f761G = 0;
        this.f760F = context;
    }

    public J(C0062l c0062l, Context context, InterfaceC0069t interfaceC0069t) {
        super(c0062l, context, interfaceC0069t);
        this.f761G = 0;
        this.f760F = context;
    }

    public J(C0062l c0062l, Context context, InterfaceC0069t interfaceC0069t, C0097a c0097a) {
        super(c0062l, context, interfaceC0069t, c0097a);
        this.f761G = 0;
        this.f760F = context;
    }
}
