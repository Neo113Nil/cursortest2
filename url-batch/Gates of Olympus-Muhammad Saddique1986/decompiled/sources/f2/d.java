package f2;

import S1.B;
import a.AbstractC0235a;
import e2.InterfaceC0422a;
import e2.InterfaceC0423b;
import e2.InterfaceC0424c;
import e2.InterfaceC0425d;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import e2.InterfaceC0428g;
import e2.InterfaceC0429h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.InterfaceC0601b;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class d implements InterfaceC0601b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5818b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f5819c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f5820d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f5821a;

    static {
        List A02 = S1.m.A0(InterfaceC0422a.class, InterfaceC0424c.class, InterfaceC0426e.class, InterfaceC0427f.class, InterfaceC0428g.class, InterfaceC0429h.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, InterfaceC0423b.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, Q.a.class, InterfaceC0425d.class);
        ArrayList arrayList = new ArrayList(S1.n.E0(A02, 10));
        int i3 = 0;
        for (Object obj : A02) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                S1.m.D0();
                throw null;
            }
            arrayList.add(new R1.i((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f5818b = B.L(arrayList);
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
        j.e(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            j.c(str);
            sb.append(AbstractC0730j.W(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f5818b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f5819c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(B.J(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AbstractC0730j.W(str2, str2));
        }
        f5820d = linkedHashMap;
    }

    public d(Class cls) {
        j.f(cls, "jClass");
        this.f5821a = cls;
    }

    @Override // f2.c
    public final Class a() {
        return this.f5821a;
    }

    public final String b() {
        String str;
        Class cls = this.f5821a;
        j.f(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f5820d;
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
            return AbstractC0730j.V(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC0730j.U(simpleName, '$', simpleName);
        }
        return AbstractC0730j.V(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && AbstractC0235a.z(this).equals(AbstractC0235a.z((InterfaceC0601b) obj));
    }

    public final int hashCode() {
        return AbstractC0235a.z(this).hashCode();
    }

    public final String toString() {
        return this.f5821a.toString() + " (Kotlin reflection is not available)";
    }
}
