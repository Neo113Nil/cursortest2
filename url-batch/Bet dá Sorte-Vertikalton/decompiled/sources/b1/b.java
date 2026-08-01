package b1;

import a1.InterfaceC0058a;
import a1.InterfaceC0059b;
import a1.k;
import a1.l;
import a1.n;
import a1.o;
import a1.p;
import a1.q;
import a1.r;
import a1.s;
import a1.t;
import a1.u;
import a1.v;
import i1.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements g1.a, a {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1581b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f1582c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1583a;

    static {
        List k02 = T0.i.k0(InterfaceC0058a.class, l.class, m.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, InterfaceC0059b.class, a1.c.class, a1.d.class, a1.e.class, a1.f.class, a1.g.class, a1.h.class, a1.i.class, a1.j.class, k.class, a1.m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(T0.j.l0(k02));
        int i = 0;
        for (Object obj : k02) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new S0.b((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f1581b = T0.t.s0(arrayList);
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
        d.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            d.b(str);
            sb.append(i1.d.K0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1581b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f1582c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(T0.t.r0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), i1.d.K0((String) entry2.getValue()));
        }
    }

    public b(Class cls) {
        this.f1583a = cls;
    }

    @Override // b1.a
    public final Class a() {
        return this.f1583a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && u1.l.B(this).equals(u1.l.B((g1.a) obj));
    }

    public final int hashCode() {
        return u1.l.B(this).hashCode();
    }

    public final String toString() {
        return this.f1583a.toString() + " (Kotlin reflection is not available)";
    }
}
