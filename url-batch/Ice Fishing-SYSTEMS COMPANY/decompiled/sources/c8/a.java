package c8;

import q7.C4939h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5763a;

    static {
        Object e6;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.h.d(property, "getProperty(...)");
            e6 = M7.q.J(property);
        } catch (Throwable th) {
            e6 = com.bumptech.glide.f.e(th);
        }
        if (e6 instanceof C4939h) {
            e6 = null;
        }
        Integer num = (Integer) e6;
        f5763a = num != null ? num.intValue() : 2097152;
    }
}
