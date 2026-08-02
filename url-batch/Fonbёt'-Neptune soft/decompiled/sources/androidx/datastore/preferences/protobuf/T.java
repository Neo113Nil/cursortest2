package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f1643c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1645b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final F f1644a = new F();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.O] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.O] */
    public final W a(Class cls) {
        C0153p c0153p;
        N x2;
        N n2;
        Class cls2;
        AbstractC0161y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1645b;
        W w2 = (W) concurrentHashMap.get(cls);
        if (w2 != null) {
            return w2;
        }
        F f2 = this.f1644a;
        f2.getClass();
        Class cls3 = X.f1653a;
        if (!AbstractC0159w.class.isAssignableFrom(cls) && (cls2 = X.f1653a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V b2 = ((E) f2.f1613a).b(cls);
        if ((b2.f1652d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0159w.class.isAssignableFrom(cls);
            AbstractC0159w abstractC0159w = b2.f1649a;
            if (isAssignableFrom) {
                n2 = new O(X.f1655c, AbstractC0154q.f1731a, abstractC0159w);
            } else {
                e0 e0Var = X.f1654b;
                C0153p c0153p2 = AbstractC0154q.f1732b;
                if (c0153p2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                n2 = new O(e0Var, c0153p2, abstractC0159w);
            }
            x2 = n2;
        } else if (AbstractC0159w.class.isAssignableFrom(cls)) {
            P p2 = Q.f1642b;
            C c2 = D.f1610b;
            e0 e0Var2 = X.f1655c;
            C0153p c0153p3 = K.j.b(b2.d()) != 1 ? AbstractC0154q.f1731a : null;
            J j2 = K.f1621b;
            int[] iArr = N.f1623n;
            if (!(b2 instanceof V)) {
                b2.getClass();
                throw new ClassCastException();
            }
            x2 = N.x(b2, p2, c2, e0Var2, c0153p3, j2);
        } else {
            P p3 = Q.f1641a;
            C c3 = D.f1609a;
            e0 e0Var3 = X.f1654b;
            if (K.j.b(b2.d()) != 1) {
                c0153p = AbstractC0154q.f1732b;
                if (c0153p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0153p = null;
            }
            J j3 = K.f1620a;
            int[] iArr2 = N.f1623n;
            if (!(b2 instanceof V)) {
                b2.getClass();
                throw new ClassCastException();
            }
            x2 = N.x(b2, p3, c3, e0Var3, c0153p, j3);
        }
        W w3 = (W) concurrentHashMap.putIfAbsent(cls, x2);
        return w3 != null ? w3 : x2;
    }
}
