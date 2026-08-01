package X0;

import W0.k;
import W0.l;
import W0.n;
import W0.o;
import W0.p;
import W0.q;
import W0.r;
import W0.s;
import W0.t;
import W0.u;
import W0.v;
import e1.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements c1.a, a {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1011b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f1012c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1013a;

    static {
        List asList = Arrays.asList(W0.a.class, l.class, m.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, W0.b.class, W0.c.class, W0.d.class, W0.e.class, W0.f.class, W0.g.class, W0.h.class, W0.i.class, W0.j.class, k.class, W0.m.class, n.class, o.class);
        d.d(asList, "asList(...)");
        ArrayList arrayList = new ArrayList(Q0.j.w0(asList));
        int i = 0;
        for (Object obj : asList) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new P0.b((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f1011b = Q0.t.e0(arrayList);
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
            sb.append(e1.d.w0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1011b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f1012c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q0.t.d0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), e1.d.w0((String) entry2.getValue()));
        }
    }

    public b(Class cls) {
        this.f1013a = cls;
    }

    @Override // X0.a
    public final Class a() {
        return this.f1013a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && q1.d.I(this).equals(q1.d.I((c1.a) obj));
    }

    public final int hashCode() {
        return q1.d.I(this).hashCode();
    }

    public final String toString() {
        return this.f1013a.toString() + " (Kotlin reflection is not available)";
    }
}
