package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: c, reason: collision with root package name */
    public static final W f5303c = new W();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5305b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final H f5304a = new H();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.Q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.datastore.preferences.protobuf.Q] */
    public final Z a(Class cls) {
        P z4;
        P p4;
        Class cls2;
        AbstractC0458x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f5305b;
        Z z5 = (Z) concurrentHashMap.get(cls);
        if (z5 != null) {
            return z5;
        }
        H h4 = this.f5304a;
        h4.getClass();
        Class cls3 = AbstractC0435a0.f5313a;
        if (!AbstractC0456v.class.isAssignableFrom(cls) && (cls2 = AbstractC0435a0.f5313a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        Y b4 = ((G) h4.f5272a).b(cls);
        if ((b4.f5312d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0456v.class.isAssignableFrom(cls);
            AbstractC0456v abstractC0456v = b4.f5309a;
            if (isAssignableFrom) {
                p4 = new Q(AbstractC0435a0.f5316d, AbstractC0451p.f5384a, abstractC0456v);
            } else {
                k0 k0Var = AbstractC0435a0.f5314b;
                C0450o c0450o = AbstractC0451p.f5385b;
                if (c0450o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                p4 = new Q(k0Var, c0450o, abstractC0456v);
            }
            z4 = p4;
        } else if (AbstractC0456v.class.isAssignableFrom(cls)) {
            z4 = b4.d() == 1 ? P.z(b4, T.f5302b, F.f5269b, AbstractC0435a0.f5316d, AbstractC0451p.f5384a, M.f5280b) : P.z(b4, T.f5302b, F.f5269b, AbstractC0435a0.f5316d, null, M.f5280b);
        } else if (b4.d() == 1) {
            S s4 = T.f5301a;
            D d4 = F.f5268a;
            k0 k0Var2 = AbstractC0435a0.f5314b;
            C0450o c0450o2 = AbstractC0451p.f5385b;
            if (c0450o2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            z4 = P.z(b4, s4, d4, k0Var2, c0450o2, M.f5279a);
        } else {
            z4 = P.z(b4, T.f5301a, F.f5268a, AbstractC0435a0.f5315c, null, M.f5279a);
        }
        Z z6 = (Z) concurrentHashMap.putIfAbsent(cls, z4);
        return z6 != null ? z6 : z4;
    }
}
