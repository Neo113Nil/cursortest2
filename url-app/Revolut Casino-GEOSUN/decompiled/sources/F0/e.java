package F0;

import E0.t;
import E0.u;
import E0.v;
import E0.w;
import a.AbstractC0069a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import u0.C0242b;

/* loaded from: classes.dex */
public final class e implements J0.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f312b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f313c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f314d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f315a;

    static {
        List B2 = v0.e.B(E0.a.class, E0.l.class, E0.p.class, E0.q.class, E0.r.class, E0.s.class, t.class, u.class, v.class, w.class, E0.b.class, E0.c.class, E0.d.class, E0.e.class, E0.f.class, E0.g.class, E0.h.class, E0.i.class, E0.j.class, E0.k.class, E0.m.class, E0.n.class, E0.o.class);
        ArrayList arrayList = new ArrayList(B2.size());
        int i2 = 0;
        for (Object obj : B2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0242b((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        Map map = v0.m.f3014e;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(o.g.t(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0242b c0242b = (C0242b) it.next();
                    map.put(c0242b.f2998e, c0242b.f2999f);
                }
            } else {
                C0242b c0242b2 = (C0242b) arrayList.get(0);
                i.e(c0242b2, "pair");
                map = Collections.singletonMap(c0242b2.f2998e, c0242b2.f2999f);
                i.d(map, "singletonMap(...)");
            }
        }
        f312b = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb.append(L0.h.S(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f312b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f313c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.g.t(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            i.b(str2);
            linkedHashMap.put(key, L0.h.S(str2, str2));
        }
        f314d = linkedHashMap;
    }

    public e(Class cls) {
        i.e(cls, "jClass");
        this.f315a = cls;
    }

    @Override // F0.d
    public final Class a() {
        return this.f315a;
    }

    public final String b() {
        String str;
        Class cls = this.f315a;
        i.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f314d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return L0.h.R(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return L0.h.R(simpleName, enclosingConstructor.getName() + '$');
        }
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && AbstractC0069a.p(this).equals(AbstractC0069a.p((J0.b) obj));
    }

    public final int hashCode() {
        return AbstractC0069a.p(this).hashCode();
    }

    public final String toString() {
        return this.f315a + " (Kotlin reflection is not available)";
    }
}
