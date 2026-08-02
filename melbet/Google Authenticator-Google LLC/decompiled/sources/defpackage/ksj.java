package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksj implements ktj, ksi {
    public static final Map a;
    private final Class b;

    static {
        int i = 0;
        List D = ixc.D(new Class[]{kri.class, krt.class, krx.class, kry.class, krz.class, ksa.class, ksb.class, ksc.class, ksd.class, kse.class, krj.class, krk.class, krl.class, krm.class, krn.class, kro.class, krp.class, krq.class, krr.class, krs.class, kru.class, krv.class, krw.class});
        ArrayList arrayList = new ArrayList(ixc.w(D));
        for (Object obj : D) {
            int i2 = i + 1;
            if (i < 0) {
                ixc.d();
            }
            arrayList.add(new kol((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = ixd.s(arrayList);
    }

    public ksj(Class cls) {
        cls.getClass();
        this.b = cls;
    }

    @Override // defpackage.ksi
    public final Class a() {
        return this.b;
    }

    @Override // defpackage.ktj
    public final String b() {
        Class cls = this.b;
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String name = cls.getName();
            name.getClass();
            String a2 = ksl.a(name);
            return a2 == null ? cls.getCanonicalName() : a2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive()) {
            String name2 = componentType.getName();
            name2.getClass();
            String a3 = ksl.a(name2);
            if (a3 != null) {
                str = a3.concat("Array");
            }
        }
        return str == null ? "kotlin.Array" : str;
    }

    @Override // defpackage.ktj
    public final String c() {
        Class cls = this.b;
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String name = cls.getName();
                name.getClass();
                String b = ksl.b(name);
                return b == null ? cls.getSimpleName() : b;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive()) {
                String name2 = componentType.getName();
                name2.getClass();
                String b2 = ksl.b(name2);
                if (b2 != null) {
                    str = b2.concat("Array");
                }
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            simpleName.getClass();
            return ksp.k(simpleName, String.valueOf(enclosingMethod.getName()).concat("$"), simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            simpleName.getClass();
            return ksp.k(simpleName, String.valueOf(enclosingConstructor.getName()).concat("$"), simpleName);
        }
        simpleName.getClass();
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        substring.getClass();
        return substring;
    }

    @Override // defpackage.ktj
    public final boolean d(Object obj) {
        Map map = a;
        map.getClass();
        Class cls = this.b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return ksy.a(obj, num.intValue());
        }
        if (cls.isPrimitive()) {
            cls = ixf.g(ixf.h(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ksj) && ksp.b(ixf.g(this), ixf.g((ktj) obj));
    }

    public final int hashCode() {
        return ixf.g(this).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat(" (Kotlin reflection is not available)");
    }
}
