package kotlin.jvm.internal;

import g2.AbstractC2429a;
import h2.InterfaceC2465a;
import h2.InterfaceC2466b;
import h2.InterfaceC2467c;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3243i implements m2.c, InterfaceC3242h {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f41151c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Map f41152d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f41153e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f41154f;

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap f41155g;

    /* renamed from: h, reason: collision with root package name */
    private static final Map f41156h;

    /* renamed from: b, reason: collision with root package name */
    private final Class f41157b;

    /* renamed from: kotlin.jvm.internal.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C3243i.f41155g.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C3243i.f41155g.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) C3243i.f41156h.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C3243i.f41156h.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.checkNotNull(simpleName);
                String O02 = StringsKt.O0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (O02 != null) {
                    return O02;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                Intrinsics.checkNotNull(simpleName);
                return StringsKt.N0(simpleName, '$', null, 2, null);
            }
            Intrinsics.checkNotNull(simpleName);
            return StringsKt.O0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Map map = C3243i.f41152d;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return M.k(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = AbstractC2429a.b(AbstractC2429a.c(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        List listOf = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, h2.n.class, h2.o.class, h2.p.class, h2.q.class, h2.r.class, h2.s.class, h2.t.class, InterfaceC2465a.class, InterfaceC2466b.class, InterfaceC2467c.class, h2.d.class, h2.e.class, h2.f.class, h2.g.class, h2.h.class, h2.i.class, h2.j.class, h2.k.class, h2.l.class, h2.m.class});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10));
        int i4 = 0;
        for (Object obj : listOf) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        f41152d = MapsKt.toMap(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f41153e = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f41154f = hashMap2;
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
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            Intrinsics.checkNotNull(str);
            sb.append(StringsKt.R0(str, JwtParser.SEPARATOR_CHAR, null, 2, null));
            sb.append("CompanionObject");
            Pair pair = TuplesKt.to(sb.toString(), str + ".Companion");
            hashMap3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry entry : f41152d.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f41155g = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), StringsKt.R0((String) entry2.getValue(), JwtParser.SEPARATOR_CHAR, null, 2, null));
        }
        f41156h = linkedHashMap;
    }

    public C3243i(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f41157b = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC3242h
    public Class a() {
        return this.f41157b;
    }

    @Override // m2.c
    public String c() {
        return f41151c.a(a());
    }

    @Override // m2.c
    public String e() {
        return f41151c.b(a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3243i) && Intrinsics.areEqual(AbstractC2429a.b(this), AbstractC2429a.b((m2.c) obj));
    }

    @Override // m2.c
    public boolean h(Object obj) {
        return f41151c.c(obj, a());
    }

    public int hashCode() {
        return AbstractC2429a.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
