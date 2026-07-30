package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yg implements wg {
    public static final xg b = new xg(null);
    public static final Map c;
    public final Class a;

    static {
        Map map;
        List e = zh.e(Function0.class, Function1.class, Function2.class, s30.class, t30.class, u30.class, v30.class, w30.class, x30.class, y30.class, f30.class, g30.class, h30.class, i30.class, j30.class, k30.class, l30.class, m30.class, n30.class, o30.class, p30.class, q30.class, r30.class);
        ArrayList arrayList = new ArrayList(ai.h(e));
        int i = 0;
        int i2 = 0;
        for (Object obj : e) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                zh.g();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = ov.d;
            map.getClass();
        } else if (size != 1) {
            map = new LinkedHashMap(hk0.a(arrayList.size()));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                Pair pair = (Pair) obj2;
                map.put(pair.d, pair.e);
            }
        } else {
            map = hk0.b((Pair) arrayList.get(0));
        }
        c = map;
    }

    public yg(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final String a() {
        String b2;
        b.getClass();
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String b3 = xg.b(cls.getName());
                return b3 == null ? cls.getSimpleName() : b3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = xg.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return StringsKt.q(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int m = StringsKt.m(simpleName, '$', 0, 6);
            return m == -1 ? simpleName : simpleName.substring(m + 1, simpleName.length());
        }
        return StringsKt.q(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yg) && y90.s(this).equals(y90.s((yg) obj));
    }

    public final int hashCode() {
        return y90.s(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
