package j1;

import X0.w;
import a.AbstractC0058a;
import i1.InterfaceC0181a;
import i1.InterfaceC0182b;
import i1.InterfaceC0183c;
import i1.InterfaceC0184d;
import i1.InterfaceC0185e;
import i1.InterfaceC0186f;
import i1.InterfaceC0187g;
import i1.InterfaceC0188h;
import i1.InterfaceC0189i;
import i1.InterfaceC0190j;
import i1.InterfaceC0191k;
import i1.InterfaceC0192l;
import i1.InterfaceC0193m;
import i1.InterfaceC0194n;
import i1.InterfaceC0195o;
import i1.p;
import i1.q;
import i1.r;
import i1.s;
import i1.t;
import i1.u;
import i1.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements o1.b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3175b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f3176c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f3177d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f3178a;

    static {
        List k02 = X0.l.k0(InterfaceC0181a.class, InterfaceC0192l.class, p.class, q.class, l0.b.class, r.class, s.class, t.class, u.class, v.class, InterfaceC0182b.class, InterfaceC0183c.class, InterfaceC0184d.class, InterfaceC0185e.class, InterfaceC0186f.class, InterfaceC0187g.class, InterfaceC0188h.class, InterfaceC0189i.class, InterfaceC0190j.class, InterfaceC0191k.class, InterfaceC0193m.class, InterfaceC0194n.class, InterfaceC0195o.class);
        ArrayList arrayList = new ArrayList(X0.m.m0(k02));
        int i = 0;
        for (Object obj : k02) {
            int i2 = i + 1;
            if (i < 0) {
                X0.l.l0();
                throw null;
            }
            arrayList.add(new W0.d((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f3175b = w.i0(arrayList);
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
            sb.append(q1.e.J0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3175b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f3176c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(w.h0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), q1.e.J0((String) entry2.getValue()));
        }
        f3177d = linkedHashMap;
    }

    public d(Class cls) {
        h.e(cls, "jClass");
        this.f3178a = cls;
    }

    @Override // j1.c
    public final Class a() {
        return this.f3178a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && AbstractC0058a.y(this).equals(AbstractC0058a.y((o1.b) obj));
    }

    public final int hashCode() {
        return AbstractC0058a.y(this).hashCode();
    }

    public final String toString() {
        return this.f3178a.toString() + " (Kotlin reflection is not available)";
    }
}
