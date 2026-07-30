package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l0;
import kotlin.collections.m0;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class m implements kotlin.reflect.d, l {
    public static final a Companion = new a(null);
    private static final Map<Class<? extends y5.c>, Integer> FUNCTION_CLASSES;
    private static final HashMap<String, String> classFqNames;
    private static final HashMap<String, String> primitiveFqNames;
    private static final HashMap<String, String> primitiveWrapperFqNames;
    private static final Map<String, String> simpleNames;
    private final Class<?> jClass;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final String getClassQualifiedName(Class<?> jClass) {
            String str;
            s.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) m.classFqNames.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) m.classFqNames.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getClassSimpleName(Class<?> jClass) {
            String str;
            String str2;
            String substringAfter$default;
            String substringAfter$default2;
            s.checkNotNullParameter(jClass, "jClass");
            String str3 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (jClass.isLocalClass()) {
                String name = jClass.getSimpleName();
                Method enclosingMethod = jClass.getEnclosingMethod();
                if (enclosingMethod != null) {
                    s.checkNotNullExpressionValue(name, "name");
                    str = StringsKt__StringsKt.substringAfter$default(name, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                }
                Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    s.checkNotNullExpressionValue(name, "name");
                    substringAfter$default = StringsKt__StringsKt.substringAfter$default(name, '$', (String) null, 2, (Object) null);
                    return substringAfter$default;
                }
                s.checkNotNullExpressionValue(name, "name");
                substringAfter$default2 = StringsKt__StringsKt.substringAfter$default(name, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                return substringAfter$default2;
            }
            if (!jClass.isArray()) {
                String str4 = (String) m.simpleNames.get(jClass.getName());
                return str4 == null ? jClass.getSimpleName() : str4;
            }
            Class<?> componentType = jClass.getComponentType();
            str = "Array";
            if (componentType.isPrimitive() && (str2 = (String) m.simpleNames.get(componentType.getName())) != null) {
                str3 = str2 + "Array";
            }
            if (str3 != null) {
                return str3;
            }
            return str;
        }

        public final boolean isInstance(Object obj, Class<?> jClass) {
            s.checkNotNullParameter(jClass, "jClass");
            Map map = m.FUNCTION_CLASSES;
            s.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return x.isFunctionOfArity(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = e6.a.getJavaObjectType(e6.a.getKotlinClass(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listOf;
        Map<Class<? extends y5.c>, Integer> map;
        int mapCapacity;
        String substringAfterLast$default;
        String substringAfterLast$default2;
        int i8 = 0;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{f6.a.class, f6.l.class, f6.p.class, f6.q.class, f6.r.class, f6.s.class, f6.t.class, f6.u.class, f6.v.class, f6.w.class, f6.b.class, f6.c.class, f6.d.class, f6.e.class, f6.f.class, f6.g.class, f6.h.class, f6.i.class, f6.j.class, f6.k.class, f6.m.class, f6.n.class, f6.o.class});
        List list = listOf;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(y5.h.to((Class) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        map = m0.toMap(arrayList);
        FUNCTION_CLASSES = map;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        primitiveFqNames = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        primitiveWrapperFqNames = hashMap2;
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
        s.checkNotNullExpressionValue(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            s.checkNotNullExpressionValue(kotlinName, "kotlinName");
            substringAfterLast$default2 = StringsKt__StringsKt.substringAfterLast$default(kotlinName, '.', (String) null, 2, (Object) null);
            sb.append(substringAfterLast$default2);
            sb.append("CompanionObject");
            Pair pair = y5.h.to(sb.toString(), kotlinName + ".Companion");
            hashMap3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry<Class<? extends y5.c>, Integer> entry : FUNCTION_CLASSES.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        classFqNames = hashMap3;
        mapCapacity = l0.mapCapacity(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default((String) entry2.getValue(), '.', (String) null, 2, (Object) null);
            linkedHashMap.put(key, substringAfterLast$default);
        }
        simpleNames = linkedHashMap;
    }

    public m(Class<?> jClass) {
        s.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
    }

    private final Void error() {
        throw new KotlinReflectionNotSupportedError();
    }

    public static /* synthetic */ void getSealedSubclasses$annotations() {
    }

    public static /* synthetic */ void getSupertypes$annotations() {
    }

    public static /* synthetic */ void getTypeParameters$annotations() {
    }

    public static /* synthetic */ void getVisibility$annotations() {
    }

    public static /* synthetic */ void isAbstract$annotations() {
    }

    public static /* synthetic */ void isCompanion$annotations() {
    }

    public static /* synthetic */ void isData$annotations() {
    }

    public static /* synthetic */ void isFinal$annotations() {
    }

    public static /* synthetic */ void isFun$annotations() {
    }

    public static /* synthetic */ void isInner$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isSealed$annotations() {
    }

    public static /* synthetic */ void isValue$annotations() {
    }

    @Override // kotlin.reflect.d
    public boolean equals(Object obj) {
        return (obj instanceof m) && s.areEqual(e6.a.getJavaObjectType(this), e6.a.getJavaObjectType((kotlin.reflect.d) obj));
    }

    @Override // kotlin.reflect.d, kotlin.reflect.b
    public List<Annotation> getAnnotations() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public Collection<kotlin.reflect.h> getConstructors() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.internal.l
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.d, kotlin.reflect.g
    public Collection<kotlin.reflect.c> getMembers() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public Collection<kotlin.reflect.d> getNestedClasses() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public Object getObjectInstance() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public String getQualifiedName() {
        return Companion.getClassQualifiedName(getJClass());
    }

    @Override // kotlin.reflect.d
    public List<kotlin.reflect.d> getSealedSubclasses() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public String getSimpleName() {
        return Companion.getClassSimpleName(getJClass());
    }

    @Override // kotlin.reflect.d
    public List<kotlin.reflect.q> getSupertypes() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public List<kotlin.reflect.r> getTypeParameters() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public KVisibility getVisibility() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public int hashCode() {
        return e6.a.getJavaObjectType(this).hashCode();
    }

    @Override // kotlin.reflect.d
    public boolean isAbstract() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isCompanion() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isData() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isFinal() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isFun() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isInner() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isInstance(Object obj) {
        return Companion.isInstance(obj, getJClass());
    }

    @Override // kotlin.reflect.d
    public boolean isOpen() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isSealed() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isValue() {
        error();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return getJClass().toString() + " (Kotlin reflection is not available)";
    }
}
