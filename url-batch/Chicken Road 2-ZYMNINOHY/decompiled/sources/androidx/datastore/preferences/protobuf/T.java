package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f4591c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4593b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final F f4592a = new F();

    public final W a(Class cls) {
        W v;
        Class cls2;
        AbstractC0191y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4593b;
        W w4 = (W) concurrentHashMap.get(cls);
        if (w4 != null) {
            return w4;
        }
        F f4 = this.f4592a;
        f4.getClass();
        Class cls3 = X.f4601a;
        if (!AbstractC0189w.class.isAssignableFrom(cls) && (cls2 = X.f4601a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V a3 = ((E) f4.f4562a).a(cls);
        int i4 = a3.f4600d;
        AbstractC0168a abstractC0168a = a3.f4597a;
        if ((i4 & 2) == 2) {
            if (AbstractC0189w.class.isAssignableFrom(cls)) {
                v = new O(X.f4603c, AbstractC0184q.f4681a, abstractC0168a);
            } else {
                e0 e0Var = X.f4602b;
                C0183p c0183p = AbstractC0184q.f4682b;
                if (c0183p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                v = new O(e0Var, c0183p, abstractC0168a);
            }
        } else if (AbstractC0189w.class.isAssignableFrom(cls)) {
            C0183p c0183p2 = null;
            P p2 = Q.f4590b;
            C c4 = D.f4559b;
            e0 e0Var2 = X.f4603c;
            if (M.j.b(a3.a()) != 1) {
                c0183p2 = AbstractC0184q.f4681a;
            }
            C0183p c0183p3 = c0183p2;
            J j4 = K.f4571b;
            int[] iArr = N.n;
            if (!(a3 instanceof V)) {
                a3.getClass();
                throw new ClassCastException();
            }
            v = N.v(a3, p2, c4, e0Var2, c0183p3, j4);
        } else {
            C0183p c0183p4 = null;
            P p4 = Q.f4589a;
            C c5 = D.f4558a;
            e0 e0Var3 = X.f4602b;
            if (M.j.b(a3.a()) != 1 && (c0183p4 = AbstractC0184q.f4682b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0183p c0183p5 = c0183p4;
            J j5 = K.f4570a;
            int[] iArr2 = N.n;
            if (!(a3 instanceof V)) {
                a3.getClass();
                throw new ClassCastException();
            }
            v = N.v(a3, p4, c5, e0Var3, c0183p5, j5);
        }
        W w5 = (W) concurrentHashMap.putIfAbsent(cls, v);
        return w5 != null ? w5 : v;
    }
}
