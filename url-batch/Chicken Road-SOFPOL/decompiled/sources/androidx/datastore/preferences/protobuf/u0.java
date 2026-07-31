package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f784c = new u0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f786b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final g0 f785a = new g0();

    public final x0 a(Class cls) {
        x0 w7;
        Class cls2;
        y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f786b;
        x0 x0Var = (x0) concurrentHashMap.get(cls);
        if (x0Var != null) {
            return x0Var;
        }
        g0 g0Var = this.f785a;
        g0Var.getClass();
        Class cls3 = y0.f796a;
        if (!w.class.isAssignableFrom(cls) && (cls2 = y0.f796a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        w0 a8 = ((f0) g0Var.f687a).a(cls);
        int i = a8.f793d;
        a aVar = a8.f790a;
        if ((i & 2) == 2) {
            if (w.class.isAssignableFrom(cls)) {
                w7 = new p0(y0.f798c, q.f754a, aVar);
            } else {
                f1 f1Var = y0.f797b;
                p pVar = q.f755b;
                if (pVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w7 = new p0(f1Var, pVar, aVar);
            }
        } else if (w.class.isAssignableFrom(cls)) {
            p pVar2 = null;
            q0 q0Var = r0.f760b;
            d0 d0Var = e0.f673b;
            f1 f1Var2 = y0.f798c;
            if (w2.e.a(a8.a()) != 1) {
                pVar2 = q.f754a;
            }
            p pVar3 = pVar2;
            k0 k0Var = l0.f723b;
            if (!(a8 instanceof w0)) {
                int[] iArr = o0.f737n;
                a8.getClass();
                throw new ClassCastException();
            }
            w7 = o0.w(a8, q0Var, d0Var, f1Var2, pVar3, k0Var);
        } else {
            p pVar4 = null;
            q0 q0Var2 = r0.f759a;
            d0 d0Var2 = e0.f672a;
            f1 f1Var3 = y0.f797b;
            if (w2.e.a(a8.a()) != 1 && (pVar4 = q.f755b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            p pVar5 = pVar4;
            k0 k0Var2 = l0.f722a;
            if (!(a8 instanceof w0)) {
                int[] iArr2 = o0.f737n;
                a8.getClass();
                throw new ClassCastException();
            }
            w7 = o0.w(a8, q0Var2, d0Var2, f1Var3, pVar5, k0Var2);
        }
        x0 x0Var2 = (x0) concurrentHashMap.putIfAbsent(cls, w7);
        return x0Var2 != null ? x0Var2 : w7;
    }
}
