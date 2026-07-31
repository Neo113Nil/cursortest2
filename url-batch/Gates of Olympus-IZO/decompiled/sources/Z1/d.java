package Z1;

import M1.B;
import f2.InterfaceC0387b;
import h2.AbstractC0447i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements InterfaceC0387b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3466b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f3467c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f3468d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f3469a;

    static {
        List c02 = M1.m.c0(Y1.a.class, Y1.c.class, Y1.e.class, Y1.f.class, Y1.g.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Y1.b.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Y1.d.class);
        ArrayList arrayList = new ArrayList(M1.n.g0(c02, 10));
        int i3 = 0;
        for (Object obj : c02) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                M1.m.f0();
                throw null;
            }
            arrayList.add(new L1.j((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f3466b = B.P(arrayList);
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
        i.e(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.c(str);
            sb.append(AbstractC0447i.F0(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3466b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f3467c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(B.I(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AbstractC0447i.F0(str2, str2));
        }
        f3468d = linkedHashMap;
    }

    public d(Class cls) {
        i.f(cls, "jClass");
        this.f3469a = cls;
    }

    @Override // Z1.c
    public final Class a() {
        return this.f3469a;
    }

    public final String b() {
        String str;
        Class cls = this.f3469a;
        i.f(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f3468d;
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
            return AbstractC0447i.E0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC0447i.D0(simpleName, '$', simpleName);
        }
        return AbstractC0447i.E0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && I2.d.B(this).equals(I2.d.B((InterfaceC0387b) obj));
    }

    public final int hashCode() {
        return I2.d.B(this).hashCode();
    }

    public final String toString() {
        return this.f3469a.toString() + " (Kotlin reflection is not available)";
    }
}
