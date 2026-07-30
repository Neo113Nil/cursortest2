package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i01 {
    public static final i01 c = new i01();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final s40 a = new s40(2);

    public final u61 a(Class cls) {
        rw rwVar;
        u61 w;
        Class cls2;
        ia0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        u61 u61Var = (u61) concurrentHashMap.get(cls);
        if (u61Var != null) {
            return u61Var;
        }
        s40 s40Var = this.a;
        s40Var.getClass();
        Class cls3 = x61.a;
        if (!m40.class.isAssignableFrom(cls) && (cls2 = x61.a) != null && !cls2.isAssignableFrom(cls)) {
            dd0.e("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        c11 a = ((sj0) s40Var.e).a(cls);
        if ((a.d & 2) == 2) {
            if (m40.class.isAssignableFrom(cls)) {
                w = new jl0(x61.c, sw.a, a.a);
            } else {
                fl1 fl1Var = x61.b;
                rw rwVar2 = sw.b;
                if (rwVar2 == null) {
                    dd0.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w = new jl0(fl1Var, rwVar2, a.a);
            }
        } else if (m40.class.isAssignableFrom(cls)) {
            ep0 ep0Var = fp0.b;
            xh0 xh0Var = yh0.b;
            fl1 fl1Var2 = x61.c;
            rw rwVar3 = qy0.v(a.a()) != 1 ? sw.a : null;
            dk0 dk0Var = ek0.b;
            if (!(a instanceof c11)) {
                int[] iArr = il0.n;
                af.c();
                return null;
            }
            w = il0.w(a, ep0Var, xh0Var, fl1Var2, rwVar3, dk0Var);
        } else {
            ep0 ep0Var2 = fp0.a;
            xh0 xh0Var2 = yh0.a;
            fl1 fl1Var3 = x61.b;
            if (qy0.v(a.a()) != 1) {
                rw rwVar4 = sw.b;
                if (rwVar4 == null) {
                    dd0.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                rwVar = rwVar4;
            } else {
                rwVar = null;
            }
            dk0 dk0Var2 = ek0.a;
            if (!(a instanceof c11)) {
                int[] iArr2 = il0.n;
                af.c();
                return null;
            }
            w = il0.w(a, ep0Var2, xh0Var2, fl1Var3, rwVar, dk0Var2);
        }
        u61 u61Var2 = (u61) concurrentHashMap.putIfAbsent(cls, w);
        return u61Var2 != null ? u61Var2 : w;
    }
}
