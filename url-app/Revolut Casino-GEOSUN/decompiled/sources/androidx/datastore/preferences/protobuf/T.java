package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f1395c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1397b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final F f1396a = new F();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.O] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.O] */
    public final W a(Class cls) {
        C0086p c0086p;
        N x2;
        N n2;
        Class cls2;
        AbstractC0094y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1397b;
        W w2 = (W) concurrentHashMap.get(cls);
        if (w2 != null) {
            return w2;
        }
        F f2 = this.f1396a;
        f2.getClass();
        Class cls3 = X.f1405a;
        if (!AbstractC0092w.class.isAssignableFrom(cls) && (cls2 = X.f1405a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V b2 = ((E) f2.f1365a).b(cls);
        if ((b2.f1404d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0092w.class.isAssignableFrom(cls);
            AbstractC0092w abstractC0092w = b2.f1401a;
            if (isAssignableFrom) {
                n2 = new O(X.f1407c, AbstractC0087q.f1482a, abstractC0092w);
            } else {
                e0 e0Var = X.f1406b;
                C0086p c0086p2 = AbstractC0087q.f1483b;
                if (c0086p2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                n2 = new O(e0Var, c0086p2, abstractC0092w);
            }
            x2 = n2;
        } else if (AbstractC0092w.class.isAssignableFrom(cls)) {
            P p2 = Q.f1394b;
            C c2 = D.f1362b;
            e0 e0Var2 = X.f1407c;
            C0086p c0086p3 = F.j.b(b2.d()) != 1 ? AbstractC0087q.f1482a : null;
            J j2 = K.f1373b;
            int[] iArr = N.f1375n;
            if (!(b2 instanceof V)) {
                b2.getClass();
                throw new ClassCastException();
            }
            x2 = N.x(b2, p2, c2, e0Var2, c0086p3, j2);
        } else {
            P p3 = Q.f1393a;
            C c3 = D.f1361a;
            e0 e0Var3 = X.f1406b;
            if (F.j.b(b2.d()) != 1) {
                c0086p = AbstractC0087q.f1483b;
                if (c0086p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0086p = null;
            }
            J j3 = K.f1372a;
            int[] iArr2 = N.f1375n;
            if (!(b2 instanceof V)) {
                b2.getClass();
                throw new ClassCastException();
            }
            x2 = N.x(b2, p3, c3, e0Var3, c0086p, j3);
        }
        W w3 = (W) concurrentHashMap.putIfAbsent(cls, x2);
        return w3 != null ? w3 : x2;
    }
}
