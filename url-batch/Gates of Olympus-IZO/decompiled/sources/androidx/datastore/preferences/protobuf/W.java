package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: c, reason: collision with root package name */
    public static final W f3828c = new W();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3830b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final H f3829a = new H();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.Q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.datastore.preferences.protobuf.Q] */
    public final Z a(Class cls) {
        P z3;
        P p;
        Class cls2;
        AbstractC0213x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f3830b;
        Z z4 = (Z) concurrentHashMap.get(cls);
        if (z4 != null) {
            return z4;
        }
        H h3 = this.f3829a;
        h3.getClass();
        Class cls3 = AbstractC0190a0.f3838a;
        if (!AbstractC0211v.class.isAssignableFrom(cls) && (cls2 = AbstractC0190a0.f3838a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        Y b2 = ((G) h3.f3798a).b(cls);
        if ((b2.f3837d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0211v.class.isAssignableFrom(cls);
            AbstractC0211v abstractC0211v = b2.f3834a;
            if (isAssignableFrom) {
                p = new Q(AbstractC0190a0.f3841d, AbstractC0206p.f3909a, abstractC0211v);
            } else {
                k0 k0Var = AbstractC0190a0.f3839b;
                C0205o c0205o = AbstractC0206p.f3910b;
                if (c0205o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                p = new Q(k0Var, c0205o, abstractC0211v);
            }
            z3 = p;
        } else if (AbstractC0211v.class.isAssignableFrom(cls)) {
            z3 = b2.d() == 1 ? P.z(b2, T.f3827b, F.f3795b, AbstractC0190a0.f3841d, AbstractC0206p.f3909a, M.f3806b) : P.z(b2, T.f3827b, F.f3795b, AbstractC0190a0.f3841d, null, M.f3806b);
        } else if (b2.d() == 1) {
            S s3 = T.f3826a;
            D d3 = F.f3794a;
            k0 k0Var2 = AbstractC0190a0.f3839b;
            C0205o c0205o2 = AbstractC0206p.f3910b;
            if (c0205o2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            z3 = P.z(b2, s3, d3, k0Var2, c0205o2, M.f3805a);
        } else {
            z3 = P.z(b2, T.f3826a, F.f3794a, AbstractC0190a0.f3840c, null, M.f3805a);
        }
        Z z5 = (Z) concurrentHashMap.putIfAbsent(cls, z3);
        return z5 != null ? z5 : z3;
    }
}
