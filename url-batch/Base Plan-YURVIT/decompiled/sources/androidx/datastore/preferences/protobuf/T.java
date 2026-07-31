package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f1483c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1485b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final F f1484a = new F();

    public final W a(Class cls) {
        W w2;
        Class cls2;
        AbstractC0112y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1485b;
        W w3 = (W) concurrentHashMap.get(cls);
        if (w3 != null) {
            return w3;
        }
        F f2 = this.f1484a;
        f2.getClass();
        Class cls3 = X.f1493a;
        if (!AbstractC0110w.class.isAssignableFrom(cls) && (cls2 = X.f1493a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V a2 = ((E) f2.f1452a).a(cls);
        int i2 = a2.f1492d;
        AbstractC0089a abstractC0089a = a2.f1489a;
        if ((i2 & 2) == 2) {
            if (AbstractC0110w.class.isAssignableFrom(cls)) {
                w2 = new O(X.f1495c, AbstractC0105q.f1571a, abstractC0089a);
            } else {
                e0 e0Var = X.f1494b;
                C0104p c0104p = AbstractC0105q.f1572b;
                if (c0104p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w2 = new O(e0Var, c0104p, abstractC0089a);
            }
        } else if (AbstractC0110w.class.isAssignableFrom(cls)) {
            C0104p c0104p2 = null;
            P p2 = Q.f1482b;
            C c2 = D.f1449b;
            e0 e0Var2 = X.f1495c;
            if (H.j.a(a2.a()) != 1) {
                c0104p2 = AbstractC0105q.f1571a;
            }
            C0104p c0104p3 = c0104p2;
            J j2 = K.f1461b;
            int[] iArr = N.f1463n;
            if (!(a2 instanceof V)) {
                a2.getClass();
                throw new ClassCastException();
            }
            w2 = N.w(a2, p2, c2, e0Var2, c0104p3, j2);
        } else {
            C0104p c0104p4 = null;
            P p3 = Q.f1481a;
            C c3 = D.f1448a;
            e0 e0Var3 = X.f1494b;
            if (H.j.a(a2.a()) != 1 && (c0104p4 = AbstractC0105q.f1572b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0104p c0104p5 = c0104p4;
            J j3 = K.f1460a;
            int[] iArr2 = N.f1463n;
            if (!(a2 instanceof V)) {
                a2.getClass();
                throw new ClassCastException();
            }
            w2 = N.w(a2, p3, c3, e0Var3, c0104p5, j3);
        }
        W w4 = (W) concurrentHashMap.putIfAbsent(cls, w2);
        return w4 != null ? w4 : w2;
    }
}
