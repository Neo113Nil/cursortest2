package V5;

import k5.C0478h;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2725a;

    static {
        Object f7;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.i.d(property, "getProperty(...)");
            f7 = F5.q.J(property);
        } catch (Throwable th) {
            f7 = AbstractC0676f.f(th);
        }
        if (f7 instanceof C0478h) {
            f7 = null;
        }
        Integer num = (Integer) f7;
        f2725a = num != null ? num.intValue() : 2097152;
    }
}
