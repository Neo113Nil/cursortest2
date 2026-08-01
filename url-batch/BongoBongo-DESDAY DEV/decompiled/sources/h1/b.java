package h1;

import g1.InterfaceC0110a;
import g1.InterfaceC0111b;
import g1.k;
import g1.l;
import g1.m;
import g1.n;
import g1.o;
import g1.p;
import g1.q;
import g1.r;
import g1.s;
import g1.t;
import g1.u;
import g1.v;
import g1.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements m1.a, a {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2644b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f2645c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f2646a;

    static {
        List n02 = W0.h.n0(InterfaceC0110a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, InterfaceC0111b.class, g1.c.class, g1.d.class, g1.e.class, g1.f.class, g1.g.class, g1.h.class, g1.i.class, g1.j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(W0.i.o0(n02));
        int i = 0;
        for (Object obj : n02) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new V0.b((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f2644b = W0.s.r0(arrayList);
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
            sb.append(o1.d.Q(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f2644b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f2645c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(W0.s.q0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), o1.d.Q((String) entry2.getValue()));
        }
    }

    public b(Class cls) {
        this.f2646a = cls;
    }

    @Override // h1.a
    public final Class a() {
        return this.f2646a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && A1.m.x(this).equals(A1.m.x((m1.a) obj));
    }

    public final int hashCode() {
        return A1.m.x(this).hashCode();
    }

    public final String toString() {
        return this.f2646a.toString() + " (Kotlin reflection is not available)";
    }
}
