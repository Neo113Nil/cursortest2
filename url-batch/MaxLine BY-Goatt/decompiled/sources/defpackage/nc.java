package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nc implements bc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public nc(ab0 ab0Var, cp1 cp1Var, fn2 fn2Var) {
        this.a = 1;
        this.c = ab0Var;
        this.d = cp1Var;
        this.b = fn2Var;
    }

    @Override // defpackage.bc0
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((fn2) obj3).remove(obj2);
                ((zc) obj).d.k(obj2);
                break;
            case 1:
                cp1 cp1Var = (cp1) obj;
                ((ab0) obj2).b().b(cp1Var);
                ((fn2) obj3).remove(cp1Var);
                break;
            case 2:
                ((id1) obj3).getLifecycle().c((dd1) obj2);
                y32 y32Var = (y32) ((c82) obj).m;
                if (y32Var != null) {
                    y32Var.a();
                    break;
                }
                break;
            default:
                kd2 kd2Var = (kd2) obj3;
                od2 od2Var = (od2) obj;
                if (kd2Var.n.k(obj2) == od2Var) {
                    Map map = kd2Var.m;
                    Map b = od2Var.b();
                    if (!b.isEmpty()) {
                        map.put(obj2, b);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ nc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
