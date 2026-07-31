package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: c, reason: collision with root package name */
    public static final W f5029c = new W();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5031b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final H f5030a = new H();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.Q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.datastore.preferences.protobuf.Q] */
    public final Z a(Class cls) {
        P z3;
        P p3;
        Class cls2;
        AbstractC0269x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f5031b;
        Z z4 = (Z) concurrentHashMap.get(cls);
        if (z4 != null) {
            return z4;
        }
        H h3 = this.f5030a;
        h3.getClass();
        Class cls3 = AbstractC0246a0.f5039a;
        if (!AbstractC0267v.class.isAssignableFrom(cls) && (cls2 = AbstractC0246a0.f5039a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        Y b3 = ((G) h3.f4998a).b(cls);
        if ((b3.f5038d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0267v.class.isAssignableFrom(cls);
            AbstractC0267v abstractC0267v = b3.f5035a;
            if (isAssignableFrom) {
                p3 = new Q(AbstractC0246a0.f5042d, AbstractC0262p.f5110a, abstractC0267v);
            } else {
                k0 k0Var = AbstractC0246a0.f5040b;
                C0261o c0261o = AbstractC0262p.f5111b;
                if (c0261o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                p3 = new Q(k0Var, c0261o, abstractC0267v);
            }
            z3 = p3;
        } else if (AbstractC0267v.class.isAssignableFrom(cls)) {
            z3 = b3.d() == 1 ? P.z(b3, T.f5028b, F.f4995b, AbstractC0246a0.f5042d, AbstractC0262p.f5110a, M.f5006b) : P.z(b3, T.f5028b, F.f4995b, AbstractC0246a0.f5042d, null, M.f5006b);
        } else if (b3.d() == 1) {
            S s3 = T.f5027a;
            D d3 = F.f4994a;
            k0 k0Var2 = AbstractC0246a0.f5040b;
            C0261o c0261o2 = AbstractC0262p.f5111b;
            if (c0261o2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            z3 = P.z(b3, s3, d3, k0Var2, c0261o2, M.f5005a);
        } else {
            z3 = P.z(b3, T.f5027a, F.f4994a, AbstractC0246a0.f5041c, null, M.f5005a);
        }
        Z z5 = (Z) concurrentHashMap.putIfAbsent(cls, z3);
        return z5 != null ? z5 : z3;
    }
}
