package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dc implements ow, cc {
    public static final Map b;
    public final Class a;

    static {
        List f0 = vc.f0(ir.class, tr.class, xr.class, ja.class, xq.class, yr.class, zr.class, as.class, bs.class, cs.class, jr.class, kr.class, lr.class, mr.class, nr.class, or.class, pr.class, qr.class, rr.class, sr.class, ur.class, vr.class, wr.class);
        ArrayList arrayList = new ArrayList(wc.g0(f0));
        int i = 0;
        for (Object obj : f0) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new k50((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = vz.a0(arrayList);
    }

    public dc(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.cc
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String h;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String h2 = gk0.h(cls.getName());
            return h2 == null ? cls.getCanonicalName() : h2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (h = gk0.h(componentType.getName())) != null) {
            str = h.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final boolean c(Object obj) {
        Class cls = this.a;
        cls.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return gk0.w(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = mv.v(b90.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dc) && mv.v(this).equals(mv.v((ow) obj));
    }

    public final int hashCode() {
        return mv.v(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
