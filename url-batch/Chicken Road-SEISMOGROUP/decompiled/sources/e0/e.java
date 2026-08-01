package e0;

import a.AbstractC0016a;
import d0.o;
import d0.p;
import d0.q;
import d0.r;
import d0.s;
import d0.t;
import d0.u;
import d0.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements h0.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f551b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f552c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f553d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f554a;

    static {
        List asList = Arrays.asList(d0.a.class, d0.l.class, p.class, m0.b.class, q.class, r.class, s.class, t.class, u.class, v.class, d0.b.class, d0.c.class, d0.d.class, d0.e.class, d0.f.class, d0.g.class, d0.h.class, d0.i.class, d0.j.class, d0.k.class, d0.m.class, d0.n.class, o.class);
        h.d(asList, "asList(...)");
        ArrayList arrayList = new ArrayList(asList.size());
        int i2 = 0;
        for (Object obj : asList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new U.b((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        Map map = V.n.f442b;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(AbstractC0016a.u(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    U.b bVar = (U.b) it.next();
                    map.put(bVar.f426b, bVar.f427c);
                }
            } else {
                U.b bVar2 = (U.b) arrayList.get(0);
                h.e(bVar2, "pair");
                map = Collections.singletonMap(bVar2.f426b, bVar2.f427c);
                h.d(map, "singletonMap(...)");
            }
        }
        f551b = map;
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
        h.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h.b(str);
            sb.append(j0.g.K(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f551b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f552c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0016a.u(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            h.b(str2);
            linkedHashMap.put(key, j0.g.K(str2));
        }
        f553d = linkedHashMap;
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f554a = cls;
    }

    @Override // e0.d
    public final Class a() {
        return this.f554a;
    }

    public final String b() {
        String str;
        Class cls = this.f554a;
        h.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f553d;
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
            return j0.g.J(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return j0.g.J(simpleName, enclosingConstructor.getName() + '$');
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
        return (obj instanceof e) && AbstractC0016a.n(this).equals(AbstractC0016a.n((h0.b) obj));
    }

    public final int hashCode() {
        return AbstractC0016a.n(this).hashCode();
    }

    public final String toString() {
        return this.f554a + " (Kotlin reflection is not available)";
    }
}
