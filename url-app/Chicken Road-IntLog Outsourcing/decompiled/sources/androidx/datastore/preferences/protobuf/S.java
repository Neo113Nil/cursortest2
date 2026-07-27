package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: c, reason: collision with root package name */
    public static final S f4392c = new S();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4394b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final E f4393a = new E();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.N] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.N] */
    public final V a(Class cls) {
        C0220o c0220o;
        M x5;
        M m6;
        Class cls2;
        AbstractC0228x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4394b;
        V v4 = (V) concurrentHashMap.get(cls);
        if (v4 != null) {
            return v4;
        }
        E e3 = this.f4393a;
        e3.getClass();
        Class cls3 = W.f4402a;
        if (!AbstractC0226v.class.isAssignableFrom(cls) && (cls2 = W.f4402a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        U a6 = ((D) e3.f4362a).a(cls);
        if ((a6.f4401d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0226v.class.isAssignableFrom(cls);
            AbstractC0226v abstractC0226v = a6.f4398a;
            if (isAssignableFrom) {
                m6 = new N(W.f4404c, AbstractC0221p.f4478a, abstractC0226v);
            } else {
                d0 d0Var = W.f4403b;
                C0220o c0220o2 = AbstractC0221p.f4479b;
                if (c0220o2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                m6 = new N(d0Var, c0220o2, abstractC0226v);
            }
            x5 = m6;
        } else if (AbstractC0226v.class.isAssignableFrom(cls)) {
            O o2 = P.f4391b;
            B b6 = C.f4359b;
            d0 d0Var2 = W.f4404c;
            C0220o c0220o3 = O.j.b(a6.d()) != 1 ? AbstractC0221p.f4478a : null;
            I i2 = J.f4370b;
            int[] iArr = M.f4372n;
            if (!(a6 instanceof U)) {
                a6.getClass();
                throw new ClassCastException();
            }
            x5 = M.x(a6, o2, b6, d0Var2, c0220o3, i2);
        } else {
            O o5 = P.f4390a;
            B b7 = C.f4358a;
            d0 d0Var3 = W.f4403b;
            if (O.j.b(a6.d()) != 1) {
                c0220o = AbstractC0221p.f4479b;
                if (c0220o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0220o = null;
            }
            I i3 = J.f4369a;
            int[] iArr2 = M.f4372n;
            if (!(a6 instanceof U)) {
                a6.getClass();
                throw new ClassCastException();
            }
            x5 = M.x(a6, o5, b7, d0Var3, c0220o, i3);
        }
        V v5 = (V) concurrentHashMap.putIfAbsent(cls, x5);
        return v5 != null ? v5 : x5;
    }
}
