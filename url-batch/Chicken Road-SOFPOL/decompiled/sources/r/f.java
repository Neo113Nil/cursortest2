package r;

import java.util.LinkedHashMap;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f6289a = d.l(0.0f, 0.0f, null, 7);

    static {
        LinkedHashMap linkedHashMap = x1.f6455a;
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final t2 a(float f6, v vVar, String str, m0.s sVar, int i, int i8) {
        Float valueOf = Float.valueOf(0.01f);
        if ((i8 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (vVar == f6289a) {
            sVar.V(1144108831);
            boolean c8 = sVar.c(0.01f);
            Object K = sVar.K();
            if (c8 || K == m0.n.f5019a) {
                K = d.l(0.0f, 0.0f, valueOf, 3);
                sVar.f0(K);
            }
            vVar = (u0) K;
            sVar.p(false);
        } else {
            sVar.V(1144218757);
            sVar.p(false);
        }
        return b(Float.valueOf(f6), d.f6262j, vVar, valueOf, str2, sVar, (i & 14) | ((i << 3) & 57344), 0);
    }

    public static final t2 b(Object obj, r1 r1Var, j jVar, Float f6, String str, m0.s sVar, int i, int i8) {
        if ((i8 & 8) != 0) {
            f6 = null;
        }
        Object K = sVar.K();
        Object obj2 = m0.n.f5019a;
        if (K == obj2) {
            K = m0.b.q(null);
            sVar.f0(K);
        }
        m0.z0 z0Var = (m0.z0) K;
        Object K2 = sVar.K();
        if (K2 == obj2) {
            K2 = new c(obj, r1Var, f6);
            sVar.f0(K2);
        }
        c cVar = (c) K2;
        m0.z0 t3 = m0.b.t(null, sVar);
        if (f6 != null && (jVar instanceof u0)) {
            u0 u0Var = (u0) jVar;
            if (!q6.i.a(u0Var.f6441c, f6)) {
                jVar = new u0(u0Var.f6439a, u0Var.f6440b, f6);
            }
        }
        m0.z0 t7 = m0.b.t(jVar, sVar);
        Object K3 = sVar.K();
        if (K3 == obj2) {
            K3 = c7.j.a(-1, null, 6);
            sVar.f0(K3);
        }
        c7.g gVar = (c7.g) K3;
        boolean h8 = sVar.h(gVar) | ((((i & 14) ^ 6) > 4 && sVar.h(obj)) || (6 & i) == 4);
        Object K4 = sVar.K();
        if (h8 || K4 == obj2) {
            K4 = new a0.z0(7, gVar, obj);
            sVar.f0(K4);
        }
        m0.b.g((p6.a) K4, sVar);
        boolean h9 = sVar.h(gVar) | sVar.h(cVar) | sVar.f(t7) | sVar.f(t3);
        Object K5 = sVar.K();
        if (h9 || K5 == obj2) {
            Object eVar = new e(gVar, cVar, t7, t3, null);
            sVar.f0(eVar);
            K5 = eVar;
        }
        m0.b.f(gVar, sVar, (p6.e) K5);
        t2 t2Var = (t2) z0Var.getValue();
        return t2Var == null ? cVar.f6235c : t2Var;
    }
}
