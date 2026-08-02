package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class ReflectClassUtilKt {
    public static final Map FUNCTION_CLASSES;
    public static final List PRIMITIVE_CLASSES;
    public static final Map PRIMITIVE_TO_WRAPPER;
    public static final Map WRAPPER_TO_PRIMITIVE;

    static {
        ReflectionFactory reflectionFactory = Reflection.factory;
        int i = 0;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new KClass[]{reflectionFactory.getOrCreateKotlinClass(Boolean.TYPE), reflectionFactory.getOrCreateKotlinClass(Byte.TYPE), reflectionFactory.getOrCreateKotlinClass(Character.TYPE), reflectionFactory.getOrCreateKotlinClass(Double.TYPE), reflectionFactory.getOrCreateKotlinClass(Float.TYPE), reflectionFactory.getOrCreateKotlinClass(Integer.TYPE), reflectionFactory.getOrCreateKotlinClass(Long.TYPE), reflectionFactory.getOrCreateKotlinClass(Short.TYPE)});
        PRIMITIVE_CLASSES = listOf;
        List<KClass> list = listOf;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KClass kClass : list) {
            arrayList.add(new Pair(PapaEvent.getJavaObjectType(kClass), PapaEvent.getJavaPrimitiveType(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = MapsKt__MapsKt.toMap(arrayList);
        List<KClass> list2 = PRIMITIVE_CLASSES;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (KClass kClass2 : list2) {
            arrayList2.add(new Pair(PapaEvent.getJavaPrimitiveType(kClass2), PapaEvent.getJavaObjectType(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = MapsKt__MapsKt.toMap(arrayList2);
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf2, 10));
        for (Object obj : listOf2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        FUNCTION_CLASSES = MapsKt__MapsKt.toMap(arrayList3);
    }

    public static final ClassId getClassId(Class<?> cls) {
        ClassId classId;
        cls.getClass();
        if (cls.isPrimitive()) {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m((Class) cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m((Class) cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.parent(), FqName.Companion.topLevel(fqName.shortName()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null && (classId = getClassId(declaringClass)) != null) {
            Name identifier = Name.identifier(cls.getSimpleName());
            identifier.getClass();
            ClassId createNestedClassId = classId.createNestedClassId(identifier);
            if (createNestedClassId != null) {
                return createNestedClassId;
            }
        }
        return ClassId.Companion.topLevel(new FqName(cls.getName()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String getDesc(Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return StringsKt__StringsJVMKt.replace(cls.getName(), '.', '/', false);
            }
            return "L" + StringsKt__StringsJVMKt.replace(cls.getName(), '.', '/', false) + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY;
                }
                break;
            case 64711720:
                if (name.equals(InquiryField.BooleanField.TYPE)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals(InquiryField.FloatField.TYPE)) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m((Class) cls, "Unsupported primitive type: "));
        return null;
    }

    public static final Integer getFunctionClassArity(Class<?> cls) {
        cls.getClass();
        return (Integer) FUNCTION_CLASSES.get(cls);
    }

    public static final List<Type> getParameterizedTypeArguments(Type type2) {
        type2.getClass();
        if (!(type2 instanceof ParameterizedType)) {
            return EmptyList.INSTANCE;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type2;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMap(SequencesKt__SequencesKt.generateSequence(ReflectJavaClass$$Lambda$0.INSTANCE$1, type2), ReflectJavaClass$$Lambda$0.INSTANCE$2));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return ArraysKt___ArraysKt.toList(actualTypeArguments);
    }

    public static final Class<?> getPrimitiveByWrapper(Class<?> cls) {
        cls.getClass();
        return (Class) WRAPPER_TO_PRIMITIVE.get(cls);
    }

    public static final ClassLoader getSafeClassLoader(Class<?> cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    public static final Class<?> getWrapperByPrimitive(Class<?> cls) {
        cls.getClass();
        return (Class) PRIMITIVE_TO_WRAPPER.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(Class<?> cls) {
        cls.getClass();
        return Enum.class.isAssignableFrom(cls);
    }
}
