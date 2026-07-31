package q6;

import d6.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements w6.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f6193b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f6194a;

    static {
        Map map;
        List y7 = s6.a.y(p6.a.class, p6.c.class, p6.e.class, p6.f.class, p6.g.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, p6.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, p6.d.class);
        ArrayList arrayList = new ArrayList(d6.n.M(y7, 10));
        int i = 0;
        for (Object obj : y7) {
            int i8 = i + 1;
            if (i < 0) {
                s6.a.J();
                throw null;
            }
            arrayList.add(new c6.f((Class) obj, Integer.valueOf(i)));
            i = i8;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = d6.v.f2327d;
        } else if (size != 1) {
            map = new LinkedHashMap(y.F(arrayList.size()));
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                c6.f fVar = (c6.f) obj2;
                map.put(fVar.f1747d, fVar.f1748e);
            }
        } else {
            c6.f fVar2 = (c6.f) arrayList.get(0);
            i.e(fVar2, "pair");
            map = Collections.singletonMap(fVar2.f1747d, fVar2.f1748e);
            i.d(map, "singletonMap(...)");
        }
        f6193b = map;
    }

    public e(Class cls) {
        i.e(cls, "jClass");
        this.f6194a = cls;
    }

    @Override // q6.d
    public final Class a() {
        return this.f6194a;
    }

    public final String b() {
        String f6;
        Class cls = this.f6194a;
        i.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String f8 = v.f(cls.getName());
                return f8 == null ? cls.getSimpleName() : f8;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (f6 = v.f(componentType.getName())) != null) {
                str = f6.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return y6.j.g0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return y6.j.g0(simpleName, enclosingConstructor.getName() + '$');
        }
        int d02 = y6.j.d0(simpleName, '$', 0, 6);
        if (d02 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(d02 + 1, simpleName.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && m.a.B(this).equals(m.a.B((w6.b) obj));
    }

    public final int hashCode() {
        return m.a.B(this).hashCode();
    }

    public final String toString() {
        return this.f6194a.toString() + " (Kotlin reflection is not available)";
    }
}
