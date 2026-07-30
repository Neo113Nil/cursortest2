package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q52 {
    public static final q52 c = new q52();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ar0 a = new ar0(1);

    public final se2 a(Class cls) {
        xj0 xj0Var;
        se2 w;
        Class cls2;
        f41.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        se2 se2Var = (se2) concurrentHashMap.get(cls);
        if (se2Var != null) {
            return se2Var;
        }
        ar0 ar0Var = this.a;
        ar0Var.getClass();
        Class cls3 = ve2.a;
        if (!vu0.class.isAssignableFrom(cls) && (cls2 = ve2.a) != null && !cls2.isAssignableFrom(cls)) {
            lh.e("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        f62 a = ((th1) ar0Var.n).a(cls);
        if ((a.d & 2) == 2) {
            if (vu0.class.isAssignableFrom(cls)) {
                w = new il1(ve2.c, yj0.a, a.a);
            } else {
                e23 e23Var = ve2.b;
                xj0 xj0Var2 = yj0.b;
                if (xj0Var2 == null) {
                    lh.g("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w = new il1(e23Var, xj0Var2, a.a);
            }
        } else if (vu0.class.isAssignableFrom(cls)) {
            wr1 wr1Var = xr1.b;
            ne1 ne1Var = oe1.b;
            e23 e23Var2 = ve2.c;
            xj0 xj0Var3 = q40.u(a.a()) != 1 ? yj0.a : null;
            di1 di1Var = ei1.b;
            if (!(a instanceof f62)) {
                int[] iArr = hl1.n;
                b71.o();
                return null;
            }
            w = hl1.w(a, wr1Var, ne1Var, e23Var2, xj0Var3, di1Var);
        } else {
            wr1 wr1Var2 = xr1.a;
            ne1 ne1Var2 = oe1.a;
            e23 e23Var3 = ve2.b;
            if (q40.u(a.a()) != 1) {
                xj0 xj0Var4 = yj0.b;
                if (xj0Var4 == null) {
                    lh.g("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                xj0Var = xj0Var4;
            } else {
                xj0Var = null;
            }
            di1 di1Var2 = ei1.a;
            if (!(a instanceof f62)) {
                int[] iArr2 = hl1.n;
                b71.o();
                return null;
            }
            w = hl1.w(a, wr1Var2, ne1Var2, e23Var3, xj0Var, di1Var2);
        }
        se2 se2Var2 = (se2) concurrentHashMap.putIfAbsent(cls, w);
        return se2Var2 != null ? se2Var2 : w;
    }
}
