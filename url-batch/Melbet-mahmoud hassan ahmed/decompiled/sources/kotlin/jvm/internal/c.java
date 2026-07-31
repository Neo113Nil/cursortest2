package kotlin.jvm.internal;

import f6.o;
import f6.p;
import f6.q;
import f6.r;
import f6.s;
import f6.t;
import f6.u;
import f6.v;
import f6.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w5.y;
import w5.z;

/* loaded from: classes.dex */
public final class c implements j6.c<Object>, b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f18300g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Map<Class<? extends v5.c<?>>, Integer> f18301h;

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<String, String> f18302i;

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap<String, String> f18303j;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<String, String> f18304k;

    /* renamed from: l, reason: collision with root package name */
    private static final Map<String, String> f18305l;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f18306f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            String S;
            String T;
            String T2;
            i.d(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        i.c(simpleName, "name");
                        T2 = l6.n.T(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (T2 != null) {
                            return T2;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    i.c(simpleName, "name");
                    if (enclosingConstructor == null) {
                        S = l6.n.S(simpleName, '$', null, 2, null);
                        return S;
                    }
                    T = l6.n.T(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                    return T;
                }
                if (!cls.isArray()) {
                    String str3 = (String) c.f18305l.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) c.f18305l.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List d7;
        int g7;
        Map<Class<? extends v5.c<?>>, Integer> g8;
        int a7;
        String V;
        String V2;
        int i7 = 0;
        d7 = w5.i.d(f6.a.class, f6.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, f6.b.class, f6.c.class, f6.d.class, f6.e.class, f6.f.class, f6.g.class, f6.h.class, f6.i.class, f6.j.class, f6.k.class, f6.m.class, f6.n.class, o.class);
        g7 = w5.j.g(d7, 10);
        ArrayList arrayList = new ArrayList(g7);
        for (Object obj : d7) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                w5.i.f();
            }
            arrayList.add(v5.n.a((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        g8 = z.g(arrayList);
        f18301h = g8;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f18302i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f18303j = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
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
        i.c(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.c(str, "kotlinName");
            V2 = l6.n.V(str, '.', null, 2, null);
            sb.append(V2);
            sb.append("CompanionObject");
            v5.j a8 = v5.n.a(sb.toString(), str + ".Companion");
            hashMap3.put(a8.c(), a8.d());
        }
        for (Map.Entry<Class<? extends v5.c<?>>, Integer> entry : f18301h.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f18304k = hashMap3;
        a7 = y.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            V = l6.n.V((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, V);
        }
        f18305l = linkedHashMap;
    }

    public c(Class<?> cls) {
        i.d(cls, "jClass");
        this.f18306f = cls;
    }

    @Override // j6.c
    public String a() {
        return f18300g.a(b());
    }

    @Override // kotlin.jvm.internal.b
    public Class<?> b() {
        return this.f18306f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && i.a(e6.a.a(this), e6.a.a((j6.c) obj));
    }

    public int hashCode() {
        return e6.a.a(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
