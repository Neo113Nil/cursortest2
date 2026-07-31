package P0;

import O0.s;
import O0.t;
import O0.u;
import O0.v;
import O0.w;
import a.AbstractC0086a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements T0.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f797b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f798a;

    static {
        Map map;
        List O2 = E0.g.O(O0.a.class, O0.l.class, O0.p.class, O0.q.class, O0.r.class, s.class, t.class, u.class, v.class, w.class, O0.b.class, O0.c.class, O0.d.class, O0.e.class, O0.f.class, O0.g.class, O0.h.class, O0.i.class, O0.j.class, O0.k.class, O0.m.class, O0.n.class, O0.o.class);
        ArrayList arrayList = new ArrayList(O2.size());
        int i2 = 0;
        int i3 = 0;
        for (Object obj : O2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new D0.c((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = E0.p.f220e;
        } else if (size != 1) {
            map = new LinkedHashMap(AbstractC0086a.y(arrayList.size()));
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                D0.c cVar = (D0.c) obj2;
                map.put(cVar.f199e, cVar.f200f);
            }
        } else {
            D0.c cVar2 = (D0.c) arrayList.get(0);
            h.e(cVar2, "pair");
            map = Collections.singletonMap(cVar2.f199e, cVar2.f200f);
            h.d(map, "singletonMap(...)");
        }
        f797b = map;
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f798a = cls;
    }

    @Override // P0.d
    public final Class a() {
        return this.f798a;
    }

    public final String b() {
        String d2;
        Class cls = this.f798a;
        h.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String d3 = r.d(cls.getName());
                return d3 == null ? cls.getSimpleName() : d3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (d2 = r.d(componentType.getName())) != null) {
                str = d2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return V0.i.Q(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return V0.i.Q(simpleName, enclosingConstructor.getName() + '$');
        }
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && AbstractC0086a.s(this).equals(AbstractC0086a.s((T0.b) obj));
    }

    public final int hashCode() {
        return AbstractC0086a.s(this).hashCode();
    }

    public final String toString() {
        return this.f798a.toString() + " (Kotlin reflection is not available)";
    }
}
