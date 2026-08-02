package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f2253c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2255b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final F f2254a = new F();

    public final W a(Class cls) {
        W w3;
        Class cls2;
        AbstractC0157y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2255b;
        W w4 = (W) concurrentHashMap.get(cls);
        if (w4 != null) {
            return w4;
        }
        F f = this.f2254a;
        f.getClass();
        Class cls3 = X.f2263a;
        if (!AbstractC0155w.class.isAssignableFrom(cls) && (cls2 = X.f2263a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V a3 = ((E) f.f2225a).a(cls);
        if ((a3.f2262d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0155w.class.isAssignableFrom(cls);
            AbstractC0155w abstractC0155w = a3.f2259a;
            if (isAssignableFrom) {
                w3 = new O(X.f2265c, AbstractC0150q.f2336a, abstractC0155w);
            } else {
                e0 e0Var = X.f2264b;
                C0149p c0149p = AbstractC0150q.f2337b;
                if (c0149p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w3 = new O(e0Var, c0149p, abstractC0155w);
            }
        } else if (AbstractC0155w.class.isAssignableFrom(cls)) {
            C0149p c0149p2 = null;
            P p3 = Q.f2252b;
            C c3 = D.f2222b;
            e0 e0Var2 = X.f2265c;
            if (M.j.b(a3.a()) != 1) {
                c0149p2 = AbstractC0150q.f2336a;
            }
            C0149p c0149p3 = c0149p2;
            J j3 = K.f2233b;
            int[] iArr = N.f2235n;
            if (!(a3 instanceof V)) {
                a3.getClass();
                throw new ClassCastException();
            }
            w3 = N.w(a3, p3, c3, e0Var2, c0149p3, j3);
        } else {
            C0149p c0149p4 = null;
            P p4 = Q.f2251a;
            C c4 = D.f2221a;
            e0 e0Var3 = X.f2264b;
            if (M.j.b(a3.a()) != 1 && (c0149p4 = AbstractC0150q.f2337b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0149p c0149p5 = c0149p4;
            J j4 = K.f2232a;
            int[] iArr2 = N.f2235n;
            if (!(a3 instanceof V)) {
                a3.getClass();
                throw new ClassCastException();
            }
            w3 = N.w(a3, p4, c4, e0Var3, c0149p5, j4);
        }
        W w5 = (W) concurrentHashMap.putIfAbsent(cls, w3);
        return w5 != null ? w5 : w3;
    }
}
