package kotlin.jvm.internal;

import b2.C0190d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.u;
import l2.v;
import l2.w;

/* loaded from: classes.dex */
public final class e implements q2.c, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9683b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9684c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f9685d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f9686a;

    static {
        List L = c2.f.L(l2.a.class, l2.l.class, l2.p.class, l2.q.class, l2.r.class, l2.s.class, l2.t.class, u.class, v.class, w.class, l2.b.class, l2.c.class, l2.d.class, l2.e.class, l2.f.class, l2.g.class, l2.h.class, l2.i.class, l2.j.class, l2.k.class, l2.m.class, l2.n.class, l2.o.class);
        ArrayList arrayList = new ArrayList(c2.g.N(L));
        int i3 = 0;
        for (Object obj : L) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                c2.f.M();
                throw null;
            }
            arrayList.add(new C0190d((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f9683b = c2.p.f0(arrayList);
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
        j.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            j.b(str);
            sb.append(s2.n.Z(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f9683b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f9684c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2.q.Z(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            j.b(str2);
            linkedHashMap.put(key, s2.n.Z(str2, str2));
        }
        f9685d = linkedHashMap;
    }

    public e(Class jClass) {
        j.e(jClass, "jClass");
        this.f9686a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f9686a;
    }

    public final String b() {
        String str;
        Class jClass = this.f9686a;
        j.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f9685d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(jClass.getName());
                return str3 == null ? jClass.getSimpleName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return s2.n.Y(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return s2.n.Y(simpleName, enclosingConstructor.getName() + '$');
        }
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        j.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && C2.b.o(this).equals(C2.b.o((q2.c) obj));
    }

    public final int hashCode() {
        return C2.b.o(this).hashCode();
    }

    public final String toString() {
        return this.f9686a + " (Kotlin reflection is not available)";
    }
}
