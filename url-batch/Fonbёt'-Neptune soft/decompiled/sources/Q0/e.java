package Q0;

import P0.s;
import P0.t;
import P0.u;
import P0.v;
import P0.w;
import a.AbstractC0132a;
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

/* loaded from: classes.dex */
public final class e implements V0.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f971b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f972c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f973d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f974a;

    static {
        List O2 = G0.e.O(P0.a.class, P0.l.class, P0.p.class, P0.q.class, P0.r.class, s.class, t.class, u.class, v.class, w.class, P0.b.class, P0.c.class, P0.d.class, P0.e.class, P0.f.class, P0.g.class, P0.h.class, P0.i.class, P0.j.class, P0.k.class, P0.m.class, P0.n.class, P0.o.class);
        ArrayList arrayList = new ArrayList(O2.size());
        int i2 = 0;
        for (Object obj : O2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new F0.c((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        Map map = G0.m.f491e;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(AbstractC0132a.z(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    F0.c cVar = (F0.c) it.next();
                    map.put(cVar.f461e, cVar.f462f);
                }
            } else {
                F0.c cVar2 = (F0.c) arrayList.get(0);
                h.e(cVar2, "pair");
                map = Collections.singletonMap(cVar2.f461e, cVar2.f462f);
                h.d(map, "singletonMap(...)");
            }
        }
        f971b = map;
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
            sb.append(X0.j.V(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f971b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f972c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0132a.z(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, X0.j.V(str2, str2));
        }
        f973d = linkedHashMap;
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f974a = cls;
    }

    @Override // Q0.d
    public final Class a() {
        return this.f974a;
    }

    public final String b() {
        String str;
        Class cls = this.f974a;
        h.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f973d;
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
            return X0.j.U(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return X0.j.U(simpleName, enclosingConstructor.getName() + '$');
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
        return (obj instanceof e) && i1.a.q(this).equals(i1.a.q((V0.b) obj));
    }

    public final int hashCode() {
        return i1.a.q(this).hashCode();
    }

    public final String toString() {
        return this.f974a.toString() + " (Kotlin reflection is not available)";
    }
}
