package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes9.dex */
public final class JvmBuiltInsSignatures {
    public static final Set DEPRECATED_LIST_METHODS;
    public static final LinkedHashSet DROP_LIST_METHOD_SIGNATURES;
    public static final LinkedHashSet HIDDEN_CONSTRUCTOR_SIGNATURES;
    public static final LinkedHashSet HIDDEN_METHOD_SIGNATURES;
    public static final JvmBuiltInsSignatures INSTANCE = new JvmBuiltInsSignatures();
    public static final LinkedHashSet MUTABLE_METHOD_SIGNATURES;
    public static final Set VISIBLE_CONSTRUCTOR_SIGNATURES;
    public static final LinkedHashSet VISIBLE_METHOD_SIGNATURES;

    static {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        DROP_LIST_METHOD_SIGNATURES = SetsKt___SetsKt.plus(signatureBuildingComponents.inJavaUtil("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        List<JvmPrimitiveType> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new JvmPrimitiveType[]{JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listOf) {
            String asString = jvmPrimitiveType.getWrapperFqName().shortName().asString();
            asString.getClass();
            CollectionsKt__MutableCollectionsKt.addAll(signatureBuildingComponents.inJavaLang(asString, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()), linkedHashSet);
        }
        HIDDEN_METHOD_SIGNATURES = SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) linkedHashSet, (Iterable) signatureBuildingComponents.inJavaUtil("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), (Iterable) signatureBuildingComponents.inJavaLang("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), (Iterable) signatureBuildingComponents.inJavaLang("Double", "isInfinite()Z", "isNaN()Z")), (Iterable) signatureBuildingComponents.inJavaLang("Float", "isInfinite()Z", "isNaN()Z")), (Iterable) signatureBuildingComponents.inJavaLang("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), (Iterable) signatureBuildingComponents.inJavaLang("CharSequence", "isEmpty()Z"));
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        DEPRECATED_LIST_METHODS = signatureBuildingComponents2.inJavaUtil("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        VISIBLE_METHOD_SIGNATURES = SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) signatureBuildingComponents2.inJavaLang("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (Iterable) signatureBuildingComponents2.inJavaUtil("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (Iterable) signatureBuildingComponents2.inJavaLang("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), (Iterable) signatureBuildingComponents2.inJavaLang("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), (Iterable) signatureBuildingComponents2.inJavaUtil("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), (Iterable) signatureBuildingComponents2.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), (Iterable) signatureBuildingComponents2.inJavaUtil("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        MUTABLE_METHOD_SIGNATURES = SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) signatureBuildingComponents2.inJavaUtil("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), (Iterable) signatureBuildingComponents2.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), (Iterable) signatureBuildingComponents2.inJavaUtil("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        INSTANCE.getClass();
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BOOLEAN;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.BYTE;
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new JvmPrimitiveType[]{jvmPrimitiveType2, jvmPrimitiveType3, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType3, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT});
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listOf2.iterator();
        while (it.hasNext()) {
            String asString2 = ((JvmPrimitiveType) it.next()).getWrapperFqName().shortName().asString();
            asString2.getClass();
            String[] constructors = signatureBuildingComponents2.constructors("Ljava/lang/String;");
            CollectionsKt__MutableCollectionsKt.addAll(signatureBuildingComponents2.inJavaLang(asString2, (String[]) Arrays.copyOf(constructors, constructors.length)), linkedHashSet2);
        }
        String[] constructors2 = signatureBuildingComponents2.constructors("D");
        LinkedHashSet plus = SetsKt___SetsKt.plus((Set) linkedHashSet2, (Iterable) signatureBuildingComponents2.inJavaLang("Float", (String[]) Arrays.copyOf(constructors2, constructors2.length)));
        String[] constructors3 = signatureBuildingComponents2.constructors("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        HIDDEN_CONSTRUCTOR_SIGNATURES = SetsKt___SetsKt.plus((Set) plus, (Iterable) signatureBuildingComponents2.inJavaLang("String", (String[]) Arrays.copyOf(constructors3, constructors3.length)));
        SignatureBuildingComponents signatureBuildingComponents3 = SignatureBuildingComponents.INSTANCE;
        String[] constructors4 = signatureBuildingComponents3.constructors("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        VISIBLE_CONSTRUCTOR_SIGNATURES = signatureBuildingComponents3.inJavaLang("Throwable", (String[]) Arrays.copyOf(constructors4, constructors4.length));
    }

    public final Set<String> getDEPRECATED_LIST_METHODS() {
        return DEPRECATED_LIST_METHODS;
    }

    public final Set<String> getDROP_LIST_METHOD_SIGNATURES() {
        return DROP_LIST_METHOD_SIGNATURES;
    }

    public final Set<String> getHIDDEN_CONSTRUCTOR_SIGNATURES() {
        return HIDDEN_CONSTRUCTOR_SIGNATURES;
    }

    public final Set<String> getHIDDEN_METHOD_SIGNATURES() {
        return HIDDEN_METHOD_SIGNATURES;
    }

    public final Set<String> getMUTABLE_METHOD_SIGNATURES() {
        return MUTABLE_METHOD_SIGNATURES;
    }

    public final Set<String> getVISIBLE_CONSTRUCTOR_SIGNATURES() {
        return VISIBLE_CONSTRUCTOR_SIGNATURES;
    }

    public final Set<String> getVISIBLE_METHOD_SIGNATURES() {
        return VISIBLE_METHOD_SIGNATURES;
    }

    public final boolean isArrayOrPrimitiveArray(FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return Intrinsics.areEqual(fqNameUnsafe, StandardNames.FqNames.f1524array) || StandardNames.isPrimitiveArray(fqNameUnsafe);
    }

    public final boolean isSerializableInJava(FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        if (isArrayOrPrimitiveArray(fqNameUnsafe)) {
            return true;
        }
        ClassId mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe);
        if (mapKotlinToJava == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(mapKotlinToJava.asSingleFqName().asString()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
