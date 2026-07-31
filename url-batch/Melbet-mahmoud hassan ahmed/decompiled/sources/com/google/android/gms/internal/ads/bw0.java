package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class bw0 implements i11 {

    /* renamed from: a, reason: collision with root package name */
    private static bw0 f3551a;

    @Deprecated
    public static synchronized bw0 f(po0 po0Var, Context context, c01 c01Var) {
        bw0 bw0Var;
        synchronized (bw0.class) {
            if (f3551a == null) {
                ly0 ly0Var = new ly0(null);
                cw0 cw0Var = new cw0();
                cw0Var.d(po0Var);
                cw0Var.c(context);
                ly0Var.b(new ew0(cw0Var, null));
                ly0Var.c(new d01(c01Var));
                f3551a = ly0Var.a();
                m10.c(context);
                y2.t.p().q(context, po0Var);
                y2.t.d().i(context);
                y2.t.q().Z(context);
                y2.t.q().Y(context);
                y2.t.q().T(context);
                a3.q1.a(context);
                y2.t.c().d(context);
                y2.t.w().b(context);
                qm0.d(context);
                if (((Boolean) sw.c().b(m10.E4)).booleanValue()) {
                    if (!((Boolean) sw.c().b(m10.f8273p0)).booleanValue()) {
                        ar arVar = new ar(new fr(context));
                        n32 n32Var = new n32(new j32(context), f3551a.c());
                        y2.t.q();
                        new f42(context, po0Var, arVar, n32Var, UUID.randomUUID().toString(), f3551a.D()).b(y2.t.p().h().K());
                    }
                }
            }
            bw0Var = f3551a;
        }
        return bw0Var;
    }

    @Deprecated
    public static bw0 g(Context context, int i7) {
        synchronized (bw0.class) {
            bw0 bw0Var = f3551a;
            return bw0Var != null ? bw0Var : f(new po0(214106000, i7, true, false), context, new cx0());
        }
    }

    public static bw0 h(Context context, dd0 dd0Var, int i7) {
        bw0 g7 = g(context, i7);
        g7.q().c(dd0Var);
        return g7;
    }

    public abstract up2 A();

    public abstract kr2 B();

    public abstract bt2<rr1> C();

    public abstract xw2 D();

    @Override // com.google.android.gms.internal.ads.i11
    public final bk2 a(vi0 vi0Var, int i7) {
        return x(new jl2(vi0Var, i7));
    }

    public abstract qx2 b();

    public abstract dc3 c();

    public abstract Executor d();

    public abstract ScheduledExecutorService e();

    public abstract n01 i();

    public abstract u31 j();

    public abstract g41 k();

    public abstract q51 l();

    public abstract nd1 m();

    public abstract fk1 n();

    public abstract cl1 o();

    public abstract ls1 p();

    public abstract rt1 q();

    public abstract hx1 r();

    public abstract uy1 s();

    public abstract w42 t();

    public abstract g3.l u();

    public abstract g3.p v();

    public abstract g3.f0 w();

    protected abstract bk2 x(jl2 jl2Var);

    public abstract jm2 y();

    public abstract yn2 z();
}
