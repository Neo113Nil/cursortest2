package e1;

import d1.InterfaceC0081a;
import d1.InterfaceC0082b;
import d1.k;
import d1.l;
import d1.n;
import d1.o;
import d1.p;
import d1.q;
import d1.r;
import d1.s;
import d1.t;
import d1.u;
import d1.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l1.m;

/* loaded from: classes.dex */
public final class b implements j1.a, a {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2049b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f2050c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f2051a;

    static {
        List l02 = W0.i.l0(InterfaceC0081a.class, l.class, m.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, InterfaceC0082b.class, d1.c.class, d1.d.class, d1.e.class, d1.f.class, d1.g.class, d1.h.class, d1.i.class, d1.j.class, k.class, d1.m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(W0.j.m0(l02));
        int i = 0;
        for (Object obj : l02) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new V0.c((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f2049b = W0.t.p0(arrayList);
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
            sb.append(l1.d.I(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f2049b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f2050c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(W0.t.o0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), l1.d.I((String) entry2.getValue()));
        }
    }

    public b(Class cls) {
        this.f2051a = cls;
    }

    @Override // e1.a
    public final Class a() {
        return this.f2051a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && x1.d.B(this).equals(x1.d.B((j1.a) obj));
    }

    public final int hashCode() {
        return x1.d.B(this).hashCode();
    }

    public final String toString() {
        return this.f2051a.toString() + " (Kotlin reflection is not available)";
    }
}
