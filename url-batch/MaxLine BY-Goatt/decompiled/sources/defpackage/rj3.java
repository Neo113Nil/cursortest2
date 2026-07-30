package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rj3 implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public rj3(oq3 oq3Var, cs3 cs3Var) {
        this.m = 2;
        this.o = cs3Var;
        Objects.requireNonNull(oq3Var);
        this.n = oq3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.m;
        Object obj = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                mk3 mk3Var = (mk3) obj;
                mk3Var.g.B();
                tc3 tc3Var = mk3Var.g.o;
                oq3.U(tc3Var);
                return tc3Var.r0((String) obj2);
            case 1:
                mk3 mk3Var2 = (mk3) obj;
                mk3Var2.g.B();
                return new jc3(mk3Var2.g.p0(((cs3) obj2).m));
            default:
                cs3 cs3Var = (cs3) obj2;
                String str = cs3Var.m;
                ll3.v(str);
                oq3 oq3Var = (oq3) obj;
                xk3 b = oq3Var.b(str);
                vk3 vk3Var = vk3.ANALYTICS_STORAGE;
                if (b.i(vk3Var) && xk3.c(100, cs3Var.E).i(vk3Var)) {
                    return oq3Var.c0(cs3Var).E();
                }
                oq3Var.a().z.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ rj3(mk3 mk3Var, Object obj, int i) {
        this.m = i;
        this.o = obj;
        this.n = mk3Var;
    }
}
