package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mg0 implements ej0, h70 {
    public final gg0 a;

    public mg0(gg0 gg0Var) {
        this.a = gg0Var;
    }

    @Override // defpackage.ej0
    public final Object a(dj0 dj0Var, xr xrVar, tg0 tg0Var) {
        return e(dj0Var, xrVar, tg0Var);
    }

    @Override // defpackage.h70
    public final cb0 b() {
        return this.a;
    }

    @Override // defpackage.ej0
    public final Object c(tg0 tg0Var) {
        return Boolean.valueOf(this.a.f.t());
    }

    @Override // defpackage.v50
    public final Object d(String str, tr trVar, eg egVar) {
        sg0 N = this.a.N(str);
        try {
            Object h = trVar.h(N);
            mv.h(N, null);
            return h;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(dj0 dj0Var, xr xrVar, eg egVar) {
        lg0 lg0Var;
        int i;
        mg0 mg0Var;
        ig0 ig0Var;
        if (egVar instanceof lg0) {
            lg0Var = (lg0) egVar;
            int i2 = lg0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lg0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = lg0Var.k;
                Object obj2 = bh.COROUTINE_SUSPENDED;
                i = lg0Var.m;
                if (i != 0) {
                    mv.O(obj);
                    ig0 ig0Var2 = this.a.f;
                    ig0Var2.t();
                    int i3 = kg0.a[dj0Var.ordinal()];
                    if (i3 == 1) {
                        ig0Var2.q();
                    } else if (i3 == 2) {
                        ig0Var2.C();
                    } else {
                        if (i3 != 3) {
                            throw new md();
                        }
                        ig0Var2.e();
                    }
                    try {
                        Object x50Var = new x50(1, this);
                        lg0Var.i = this;
                        lg0Var.j = ig0Var2;
                        lg0Var.m = 1;
                        Object g = xrVar.g(x50Var, lg0Var);
                        if (g == obj2) {
                            return obj2;
                        }
                        mg0Var = this;
                        ig0Var = ig0Var2;
                        obj = g;
                    } catch (Throwable th) {
                        th = th;
                        mg0Var = this;
                        ig0Var = ig0Var2;
                        ig0Var.d();
                        if (!ig0Var.t()) {
                            mg0Var.getClass();
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ig0Var = lg0Var.j;
                    mg0Var = lg0Var.i;
                    try {
                        mv.O(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        ig0Var.d();
                        if (!ig0Var.t()) {
                        }
                        throw th;
                    }
                }
                ig0Var.z();
                ig0Var.d();
                if (!ig0Var.t()) {
                    mg0Var.getClass();
                }
                return obj;
            }
        }
        lg0Var = new lg0(this, egVar);
        Object obj3 = lg0Var.k;
        Object obj22 = bh.COROUTINE_SUSPENDED;
        i = lg0Var.m;
        if (i != 0) {
        }
        ig0Var.z();
        ig0Var.d();
        if (!ig0Var.t()) {
        }
        return obj3;
    }
}
