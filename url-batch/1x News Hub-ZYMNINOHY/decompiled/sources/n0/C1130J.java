package n0;

import E1.AbstractActivityC0029e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.A0;
import com.google.android.gms.internal.play_billing.AbstractC0216d1;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.B0;
import com.google.android.gms.internal.play_billing.C0252p1;
import com.google.android.gms.internal.play_billing.C0265u0;
import com.google.android.gms.internal.play_billing.E0;
import com.google.android.gms.internal.play_billing.EnumC0256r0;
import com.google.android.gms.internal.play_billing.F0;
import com.google.android.gms.internal.play_billing.H0;
import com.google.android.gms.internal.play_billing.InterfaceC0226h;
import com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC0280z0;
import com.google.android.gms.internal.play_billing.InterfaceFutureC0277y0;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.RunnableC0262t0;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;
import com.google.android.gms.internal.play_billing.v2;
import i1.C0342b;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* renamed from: n0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130J extends C1143e {

    /* renamed from: F, reason: collision with root package name */
    public final Context f10005F;

    /* renamed from: G, reason: collision with root package name */
    public volatile int f10006G;

    /* renamed from: H, reason: collision with root package name */
    public volatile InterfaceC0226h f10007H;

    /* renamed from: I, reason: collision with root package name */
    public volatile ServiceConnectionC1129I f10008I;

    /* renamed from: J, reason: collision with root package name */
    public volatile A0 f10009J;

    public C1130J(Context context) {
        super(context);
        this.f10006G = 0;
        this.f10005F = context;
    }

    public final /* synthetic */ void L(C1140b c1140b, B0.g gVar) {
        super.e(c1140b, gVar);
    }

    public final /* synthetic */ void M(B0.g gVar, C1148j c1148j) {
        super.f(gVar, c1148j);
    }

    public final /* synthetic */ void N(b0.s sVar, InterfaceC1153o interfaceC1153o) {
        super.c(sVar, interfaceC1153o);
    }

    public final synchronized boolean O() {
        if (this.f10006G == 2 && this.f10007H != null) {
            if (this.f10008I != null) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceFutureC0277y0 P(int i3) {
        if (!O()) {
            AbstractC0248o0.g("BillingClientTesting", "Billing Override Service is not ready.");
            Q(106, 28, AbstractC1135O.a(-1, "Billing Override Service connection is disconnected."));
            return new C0265u0();
        }
        C1125E c1125e = new C1125E(i3, this);
        s2 s2Var = new s2();
        s2Var.f2927c = new v2();
        u2 u2Var = new u2(s2Var);
        s2Var.f2926b = u2Var;
        s2Var.f2925a = C1125E.class;
        try {
            c1125e.a(s2Var);
            s2Var.f2925a = "billingOverrideService.getBillingOverride";
            return u2Var;
        } catch (Exception e3) {
            C0252p1 c0252p1 = new C0252p1(e3);
            AbstractC0216d1 abstractC0216d1 = r2.f;
            t2 t2Var = u2Var.f2941b;
            if (abstractC0216d1.v(t2Var, null, c0252p1)) {
                r2.c(t2Var);
            }
            return u2Var;
        }
    }

    public final void Q(int i3, int i4, C1147i c1147i) {
        Q1 b3 = AbstractC1133M.b(i3, i4, c1147i);
        Objects.requireNonNull(b3, "ApiFailure should not be null");
        this.f10070g.v(b3);
    }

    public final void R(int i3, Consumer consumer, Runnable runnable) {
        A0 a02;
        InterfaceExecutorServiceC0280z0 interfaceExecutorServiceC0280z0;
        InterfaceExecutorServiceC0280z0 e02;
        InterfaceFutureC0277y0 P2 = P(i3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f10009J == null) {
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.f10009J = newSingleThreadScheduledExecutor instanceof A0 ? (A0) newSingleThreadScheduledExecutor : new E0(newSingleThreadScheduledExecutor);
                }
                a02 = this.f10009J;
            } finally {
            }
        }
        if (!P2.isDone()) {
            H0 h02 = new H0();
            h02.f2737h = P2;
            F0 f02 = new F0();
            f02.f2731a = h02;
            h02.f2738i = ((E0) a02).schedule(f02, 28500L, timeUnit);
            P2.a(f02, EnumC0256r0.f2912a);
            P2 = h02;
        }
        C1126F c1126f = new C1126F(this, i3, consumer, runnable);
        synchronized (this) {
            try {
                if (this.f10063D == null) {
                    ExecutorService q3 = q();
                    if (q3 instanceof InterfaceExecutorServiceC0280z0) {
                        e02 = (InterfaceExecutorServiceC0280z0) q3;
                    } else {
                        e02 = q3 instanceof ScheduledExecutorService ? new E0((ScheduledExecutorService) q3) : new B0(q3);
                    }
                    this.f10063D = e02;
                }
                interfaceExecutorServiceC0280z0 = this.f10063D;
            } finally {
            }
        }
        P2.a(new RunnableC0262t0(P2, c1126f), interfaceExecutorServiceC0280z0);
    }

    @Override // n0.C1143e, n0.AbstractC1142d
    public final void a() {
        synchronized (this) {
            S1 d3 = AbstractC1133M.d(27);
            Objects.requireNonNull(d3, "ApiSuccess should not be null");
            this.f10070g.x(d3);
            try {
                try {
                    if (this.f10008I != null && this.f10007H != null) {
                        AbstractC0248o0.f("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f10005F.unbindService(this.f10008I);
                        this.f10008I = new ServiceConnectionC1129I(this);
                    }
                    this.f10007H = null;
                    if (this.f10009J != null) {
                        ((B0) this.f10009J).shutdownNow();
                        this.f10009J = null;
                    }
                } catch (RuntimeException e3) {
                    AbstractC0248o0.h("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e3);
                }
                this.f10006G = 3;
            } catch (Throwable th) {
                this.f10006G = 3;
                throw th;
            }
        }
        super.a();
    }

    @Override // n0.C1143e, n0.AbstractC1142d
    public final void c(b0.s sVar, InterfaceC1153o interfaceC1153o) {
        R(7, new C1124D(0, interfaceC1153o), new B.n(this, (Object) sVar, (Object) interfaceC1153o, 1));
    }

    @Override // n0.C1143e
    public final void e(C1140b c1140b, B0.g gVar) {
        R(3, new C1124D(2, gVar), new B.n(this, (Object) c1140b, (Object) gVar, 3));
    }

    @Override // n0.C1143e
    public final void f(B0.g gVar, C1148j c1148j) {
        R(4, new C1124D(gVar, c1148j), new B.n(this, (Object) c1148j, (Object) gVar, 2));
    }

    @Override // n0.C1143e
    public final C1147i j(AbstractActivityC0029e abstractActivityC0029e, M0.o oVar) {
        int i3 = 0;
        try {
            i3 = ((Integer) P(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e3) {
            Q(114, 28, AbstractC1135O.f10016E);
            AbstractC0248o0.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e3);
        } catch (Exception e4) {
            if (e4 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Q(107, 28, AbstractC1135O.f10016E);
            AbstractC0248o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", e4);
        }
        if (i3 > 0) {
            C1147i a3 = AbstractC1135O.a(i3, "Billing override value was set by a license tester.");
            Q(105, 2, a3);
            K(a3);
            return a3;
        }
        try {
            return super.j(abstractActivityC0029e, oVar);
        } catch (Exception e5) {
            C1147i c1147i = AbstractC1135O.f10024i;
            Q(115, 2, c1147i);
            AbstractC0248o0.h("BillingClientTesting", "An internal error occurred.", e5);
            return c1147i;
        }
    }

    @Override // n0.C1143e
    public final void l(InterfaceC1144f interfaceC1144f) {
        synchronized (this) {
            if (O()) {
                AbstractC0248o0.f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                S1 d3 = AbstractC1133M.d(26);
                Objects.requireNonNull(d3, "ApiSuccess should not be null");
                this.f10070g.x(d3);
            } else {
                int i3 = 1;
                if (this.f10006G == 1) {
                    AbstractC0248o0.g("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.f10006G == 3) {
                    AbstractC0248o0.g("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    Q(38, 26, AbstractC1135O.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f10006G = 1;
                    AbstractC0248o0.f("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.f10008I = new ServiceConnectionC1129I(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> queryIntentServices = this.f10005F.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i3 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                AbstractC0248o0.g("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.f10005F.bindService(intent2, this.f10008I, 1)) {
                                    AbstractC0248o0.f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    AbstractC0248o0.g("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i3 = 39;
                        }
                    }
                    this.f10006G = 0;
                    AbstractC0248o0.f("BillingClientTesting", "Billing Override Service unavailable on device.");
                    Q(i3, 26, AbstractC1135O.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.l(interfaceC1144f);
    }

    public C1130J(C0342b c0342b, Context context) {
        super(c0342b, context);
        this.f10006G = 0;
        this.f10005F = context;
    }

    public C1130J(C0342b c0342b, Context context, InterfaceC1156r interfaceC1156r) {
        super(c0342b, context, interfaceC1156r);
        this.f10006G = 0;
        this.f10005F = context;
    }

    public C1130J(C0342b c0342b, Context context, InterfaceC1156r interfaceC1156r, B0.k kVar) {
        super(c0342b, context, interfaceC1156r, kVar);
        this.f10006G = 0;
        this.f10005F = context;
    }
}
