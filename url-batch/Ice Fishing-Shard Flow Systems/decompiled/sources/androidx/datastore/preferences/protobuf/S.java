package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: c, reason: collision with root package name */
    public static final S f3454c = new S();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3456b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final E f3455a = new E();

    public final V a(Class cls) {
        V w4;
        Class cls2;
        AbstractC0207x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f3456b;
        V v7 = (V) concurrentHashMap.get(cls);
        if (v7 != null) {
            return v7;
        }
        E e7 = this.f3455a;
        e7.getClass();
        Class cls3 = W.f3464a;
        if (!AbstractC0205v.class.isAssignableFrom(cls) && (cls2 = W.f3464a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        U a7 = ((D) e7.f3424a).a(cls);
        int i2 = a7.f3463d;
        AbstractC0185a abstractC0185a = a7.f3460a;
        if ((i2 & 2) == 2) {
            if (AbstractC0205v.class.isAssignableFrom(cls)) {
                w4 = new N(W.f3466c, AbstractC0200p.f3540a, abstractC0185a);
            } else {
                d0 d0Var = W.f3465b;
                C0199o c0199o = AbstractC0200p.f3541b;
                if (c0199o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w4 = new N(d0Var, c0199o, abstractC0185a);
            }
        } else if (AbstractC0205v.class.isAssignableFrom(cls)) {
            C0199o c0199o2 = null;
            O o7 = P.f3453b;
            B b7 = C.f3421b;
            d0 d0Var2 = W.f3466c;
            if (S.i.b(a7.a()) != 1) {
                c0199o2 = AbstractC0200p.f3540a;
            }
            C0199o c0199o3 = c0199o2;
            I i5 = J.f3433b;
            int[] iArr = M.f3435n;
            if (!(a7 instanceof U)) {
                a7.getClass();
                throw new ClassCastException();
            }
            w4 = M.w(a7, o7, b7, d0Var2, c0199o3, i5);
        } else {
            C0199o c0199o4 = null;
            O o8 = P.f3452a;
            B b8 = C.f3420a;
            d0 d0Var3 = W.f3465b;
            if (S.i.b(a7.a()) != 1 && (c0199o4 = AbstractC0200p.f3541b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0199o c0199o5 = c0199o4;
            I i7 = J.f3432a;
            int[] iArr2 = M.f3435n;
            if (!(a7 instanceof U)) {
                a7.getClass();
                throw new ClassCastException();
            }
            w4 = M.w(a7, o8, b8, d0Var3, c0199o5, i7);
        }
        V v8 = (V) concurrentHashMap.putIfAbsent(cls, w4);
        return v8 != null ? v8 : w4;
    }
}
