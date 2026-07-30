package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ck implements eu0, zj {
    public static final bk Companion = new bk();
    public static final Map lS5Rgt96tfkO;
    public final Class PxuCJdSBwIXG;

    static {
        List D0aTLcX6Uhyo = fx1.D0aTLcX6Uhyo(ae0.class, le0.class, pe0.class, qe0.class, re0.class, se0.class, te0.class, ue0.class, ve0.class, we0.class, be0.class, ce0.class, de0.class, ee0.class, fe0.class, ge0.class, he0.class, ie0.class, je0.class, ke0.class, me0.class, ne0.class, oe0.class);
        ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(D0aTLcX6Uhyo, 10));
        int i = 0;
        for (Object obj : D0aTLcX6Uhyo) {
            int i2 = i + 1;
            if (i < 0) {
                fx1.mFd1aGiJX24N();
                throw null;
            }
            arrayList.add(new vi1((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        lS5Rgt96tfkO = w41.zf8DYfih6EZu(arrayList);
    }

    public ck(Class cls) {
        cls.getClass();
        this.PxuCJdSBwIXG = cls;
    }

    @Override // defpackage.zj
    public final Class PxuCJdSBwIXG() {
        return this.PxuCJdSBwIXG;
    }

    public final String TSizfFm2Yiuu() {
        String lS5Rgt96tfkO2;
        Companion.getClass();
        Class cls = this.PxuCJdSBwIXG;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String lS5Rgt96tfkO3 = bk.lS5Rgt96tfkO(cls.getName());
                return lS5Rgt96tfkO3 == null ? cls.getSimpleName() : lS5Rgt96tfkO3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (lS5Rgt96tfkO2 = bk.lS5Rgt96tfkO(componentType.getName())) != null) {
                str = lS5Rgt96tfkO2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ia2.cJeY36nTk9tz(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int rxipThha848g = ia2.rxipThha848g(simpleName, '$', 0, 6);
            return rxipThha848g == -1 ? simpleName : simpleName.substring(rxipThha848g + 1, simpleName.length());
        }
        return ia2.cJeY36nTk9tz(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean Y1f8riQaR6yg(Object obj) {
        Companion.getClass();
        Class cls = this.PxuCJdSBwIXG;
        cls.getClass();
        Map map = lS5Rgt96tfkO;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return mm2.i68hK7ahKtgp(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = kj0.jyegZNwi31qc(bu1.PxuCJdSBwIXG(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ck) && kj0.jyegZNwi31qc(this).equals(kj0.jyegZNwi31qc((eu0) obj));
    }

    public final int hashCode() {
        return kj0.jyegZNwi31qc(this).hashCode();
    }

    public final String lS5Rgt96tfkO() {
        String PxuCJdSBwIXG;
        Companion.getClass();
        Class cls = this.PxuCJdSBwIXG;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String PxuCJdSBwIXG2 = bk.PxuCJdSBwIXG(cls.getName());
            return PxuCJdSBwIXG2 == null ? cls.getCanonicalName() : PxuCJdSBwIXG2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (PxuCJdSBwIXG = bk.PxuCJdSBwIXG(componentType.getName())) != null) {
            str = PxuCJdSBwIXG.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String toString() {
        return this.PxuCJdSBwIXG.toString() + " (Kotlin reflection is not available)";
    }
}
