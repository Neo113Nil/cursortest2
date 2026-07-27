package M2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z2.C1411O;
import z2.C1412P;
import z2.C1441y;
import z2.C1442z;

@Metadata
/* renamed from: M2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256h implements S2.b, InterfaceC0255g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3597b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Map f3598c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f3599d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f3600e;

    /* renamed from: a, reason: collision with root package name */
    public final Class f3601a;

    @Metadata
    /* renamed from: M2.h$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        List e4 = C1441y.e(Function0.class, Function1.class, Function2.class, L2.c.class, L2.d.class, O.a.class, O.a.class, O.a.class, O.a.class, O.a.class, O.a.class, O.a.class, L2.a.class, O.a.class, O.a.class, O.a.class, O.a.class, O.a.class, O.a.class, O.a.class, O.a.class, O.a.class, L2.b.class);
        ArrayList arrayList = new ArrayList(C1442z.h(e4, 10));
        int i2 = 0;
        for (Object obj : e4) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                C1441y.g();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i4;
        }
        f3598c = C1412P.h(arrayList);
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
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.c(str);
            sb.append(kotlin.text.y.L(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3598c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f3599d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C1411O.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, kotlin.text.y.L(str2, str2));
        }
        f3600e = linkedHashMap;
    }

    public C0256h(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f3601a = jClass;
    }

    @Override // M2.InterfaceC0255g
    public final Class a() {
        return this.f3601a;
    }

    public final String b() {
        String str;
        f3597b.getClass();
        Class jClass = this.f3601a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f3600e;
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
            String K3 = kotlin.text.y.K(simpleName, enclosingMethod.getName() + '$');
            if (K3 != null) {
                return K3;
            }
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return kotlin.text.y.J(simpleName, '$', simpleName);
        }
        return kotlin.text.y.K(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0256h) && u3.l.h0(this).equals(u3.l.h0((S2.b) obj));
    }

    public final int hashCode() {
        return u3.l.h0(this).hashCode();
    }

    public final String toString() {
        return this.f3601a.toString() + " (Kotlin reflection is not available)";
    }
}
