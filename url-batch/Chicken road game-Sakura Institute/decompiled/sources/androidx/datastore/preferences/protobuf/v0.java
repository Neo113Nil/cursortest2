package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: c, reason: collision with root package name */
    public static final v0 f916c = new v0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f918b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final h0 f917a = new h0();

    public final y0 a(Class cls) {
        y0 z8;
        Class cls2;
        x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f918b;
        y0 y0Var = (y0) concurrentHashMap.get(cls);
        if (y0Var != null) {
            return y0Var;
        }
        h0 h0Var = this.f917a;
        h0Var.getClass();
        Class cls3 = z0.f929a;
        if (!v.class.isAssignableFrom(cls) && (cls2 = z0.f929a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        x0 a3 = ((g0) h0Var.f831a).a(cls);
        int i7 = a3.f927d;
        a aVar = a3.f924a;
        if ((i7 & 2) == 2) {
            if (v.class.isAssignableFrom(cls)) {
                z8 = new q0(z0.f932d, p.f871a, aVar);
            } else {
                j1 j1Var = z0.f930b;
                o oVar = p.f872b;
                if (oVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                z8 = new q0(j1Var, oVar, aVar);
            }
        } else if (v.class.isAssignableFrom(cls)) {
            z8 = (a3.f927d & 1) == 1 ? p0.z(a3, s0.f911b, f0.f811b, z0.f932d, p.f871a, m0.f865b) : p0.z(a3, s0.f911b, f0.f811b, z0.f932d, null, m0.f865b);
        } else if ((a3.f927d & 1) == 1) {
            r0 r0Var = s0.f910a;
            d0 d0Var = f0.f810a;
            j1 j1Var2 = z0.f930b;
            o oVar2 = p.f872b;
            if (oVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            z8 = p0.z(a3, r0Var, d0Var, j1Var2, oVar2, m0.f864a);
        } else {
            z8 = p0.z(a3, s0.f910a, f0.f810a, z0.f931c, null, m0.f864a);
        }
        y0 y0Var2 = (y0) concurrentHashMap.putIfAbsent(cls, z8);
        return y0Var2 != null ? y0Var2 : z8;
    }
}
