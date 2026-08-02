package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;

/* loaded from: classes9.dex */
public class SpecialGenericSignatures {
    public static final Companion Companion = new Companion(null);
    public static final ArrayList ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
    public static final ArrayList ERASED_COLLECTION_PARAMETER_SIGNATURES;
    public static final Set ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    public static final Set ERASED_VALUE_PARAMETERS_SIGNATURES;
    public static final Map GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
    public static final LinkedHashMap JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    public static final Map NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
    public static final HashSet ORIGINAL_SHORT_NAMES;
    public static final Companion.NameAndSignature REMOVE_AT_NAME_AND_SIGNATURE;
    public static final LinkedHashMap SIGNATURE_TO_DEFAULT_VALUES_MAP;
    public static final LinkedHashMap SIGNATURE_TO_JVM_REPRESENTATION_NAME;

    public static final class Companion {

        public static final class NameAndSignature {
            public final String classInternalName;
            public final Name name;
            public final String parameters;
            public final String returnType;
            public final String signature;

            public NameAndSignature(String str, Name name, String str2, String str3) {
                str.getClass();
                name.getClass();
                str2.getClass();
                str3.getClass();
                this.classInternalName = str;
                this.name = name;
                this.parameters = str2;
                this.returnType = str3;
                this.signature = SignatureBuildingComponents.INSTANCE.signature(str, name + '(' + str2 + ')' + str3);
            }

            public static /* synthetic */ NameAndSignature copy$default(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = nameAndSignature.classInternalName;
                }
                if ((i & 2) != 0) {
                    name = nameAndSignature.name;
                }
                if ((i & 4) != 0) {
                    str2 = nameAndSignature.parameters;
                }
                if ((i & 8) != 0) {
                    str3 = nameAndSignature.returnType;
                }
                return nameAndSignature.copy(str, name, str2, str3);
            }

            public final NameAndSignature copy(String str, Name name, String str2, String str3) {
                str.getClass();
                name.getClass();
                str2.getClass();
                str3.getClass();
                return new NameAndSignature(str, name, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.areEqual(this.classInternalName, nameAndSignature.classInternalName) && Intrinsics.areEqual(this.name, nameAndSignature.name) && Intrinsics.areEqual(this.parameters, nameAndSignature.parameters) && Intrinsics.areEqual(this.returnType, nameAndSignature.returnType);
            }

            public final Name getName() {
                return this.name;
            }

            public final String getSignature() {
                return this.signature;
            }

            public int hashCode() {
                return this.returnType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.name.hashCode() + (this.classInternalName.hashCode() * 31)) * 31, 31, this.parameters);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
                sb.append(this.classInternalName);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", parameters=");
                sb.append(this.parameters);
                sb.append(", returnType=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.returnType, ')');
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final NameAndSignature access$method(Companion companion, String str, String str2, String str3, String str4) {
            companion.getClass();
            Name identifier = Name.identifier(str2);
            identifier.getClass();
            return new NameAndSignature(str, identifier, str3, str4);
        }

        public final Name getBuiltinFunctionNamesByJvmName(Name name) {
            name.getClass();
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
        }

        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.ERASED_COLLECTION_PARAMETER_SIGNATURES;
        }

        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.ERASED_VALUE_PARAMETERS_SHORT_NAMES;
        }

        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.ERASED_VALUE_PARAMETERS_SIGNATURES;
        }

        public final Map<Name, Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
        }

        public final Set<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.ORIGINAL_SHORT_NAMES;
        }

        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.REMOVE_AT_NAME_AND_SIGNATURE;
        }

        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.SIGNATURE_TO_DEFAULT_VALUES_MAP;
        }

        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.SIGNATURE_TO_JVM_REPRESENTATION_NAME;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(Name name) {
            name.getClass();
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        public final SpecialSignatureInfo getSpecialSignatureInfo(String str) {
            str.getClass();
            return getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(str) ? SpecialSignatureInfo.ONE_COLLECTION_PARAMETER : ((TypeSafeBarrierDescription) MapsKt__MapsKt.getValue(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), str)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SpecialSignatureInfo {
        public static final /* synthetic */ SpecialSignatureInfo[] $VALUES;
        public static final SpecialSignatureInfo OBJECT_PARAMETER_GENERIC;
        public static final SpecialSignatureInfo OBJECT_PARAMETER_NON_GENERIC;
        public static final SpecialSignatureInfo ONE_COLLECTION_PARAMETER;

        static {
            SpecialSignatureInfo specialSignatureInfo = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0);
            ONE_COLLECTION_PARAMETER = specialSignatureInfo;
            SpecialSignatureInfo specialSignatureInfo2 = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1);
            OBJECT_PARAMETER_NON_GENERIC = specialSignatureInfo2;
            SpecialSignatureInfo specialSignatureInfo3 = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2);
            OBJECT_PARAMETER_GENERIC = specialSignatureInfo3;
            $VALUES = new SpecialSignatureInfo[]{specialSignatureInfo, specialSignatureInfo2, specialSignatureInfo3};
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) $VALUES.clone();
        }
    }

    static {
        Set<String> set = ArraysKt___ArraysKt.toSet(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        for (String str : set) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            desc.getClass();
            arrayList.add(Companion.access$method(companion, "java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it.next()).getSignature());
        }
        ERASED_COLLECTION_PARAMETER_SIGNATURES = arrayList2;
        ArrayList arrayList3 = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).getName().asString());
        }
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String javaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        desc2.getClass();
        Companion.NameAndSignature access$method = Companion.access$method(companion2, javaUtil, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair pair = new Pair(access$method, typeSafeBarrierDescription);
        String javaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        desc3.getClass();
        Pair pair2 = new Pair(Companion.access$method(companion2, javaUtil2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String javaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        desc4.getClass();
        Pair pair3 = new Pair(Companion.access$method(companion2, javaUtil3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String javaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        desc5.getClass();
        Pair pair4 = new Pair(Companion.access$method(companion2, javaUtil4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String javaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        desc6.getClass();
        Pair pair5 = new Pair(Companion.access$method(companion2, javaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair pair6 = new Pair(Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature access$method2 = Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair pair7 = new Pair(access$method2, typeSafeBarrierDescription2);
        Pair pair8 = new Pair(Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String javaUtil6 = signatureBuildingComponents.javaUtil("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        desc7.getClass();
        Companion.NameAndSignature access$method3 = Companion.access$method(companion2, javaUtil6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair pair9 = new Pair(access$method3, typeSafeBarrierDescription3);
        String javaUtil7 = signatureBuildingComponents.javaUtil("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        desc8.getClass();
        Map mapOf = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(Companion.access$method(companion2, javaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP = mapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOf.size()));
        for (Map.Entry entry : mapOf.entrySet()) {
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_DEFAULT_VALUES_MAP = linkedHashMap;
        LinkedHashSet plus = SetsKt___SetsKt.plus(GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP.keySet(), (Iterable) ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES);
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
        Iterator it3 = plus.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it3.next()).getName());
        }
        ERASED_VALUE_PARAMETERS_SHORT_NAMES = CollectionsKt.toSet(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
        Iterator it4 = plus.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it4.next()).getSignature());
        }
        ERASED_VALUE_PARAMETERS_SIGNATURES = CollectionsKt.toSet(arrayList6);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        desc9.getClass();
        Companion.NameAndSignature access$method4 = Companion.access$method(companion3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        REMOVE_AT_NAME_AND_SIGNATURE = access$method4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String javaLang = signatureBuildingComponents2.javaLang("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        desc10.getClass();
        Pair pair10 = new Pair(Companion.access$method(companion3, javaLang, "toByte", "", desc10), Name.identifier("byteValue"));
        String javaLang2 = signatureBuildingComponents2.javaLang("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        desc11.getClass();
        Pair pair11 = new Pair(Companion.access$method(companion3, javaLang2, "toShort", "", desc11), Name.identifier("shortValue"));
        String javaLang3 = signatureBuildingComponents2.javaLang("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        desc12.getClass();
        Pair pair12 = new Pair(Companion.access$method(companion3, javaLang3, "toInt", "", desc12), Name.identifier("intValue"));
        String javaLang4 = signatureBuildingComponents2.javaLang("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        desc13.getClass();
        Pair pair13 = new Pair(Companion.access$method(companion3, javaLang4, "toLong", "", desc13), Name.identifier("longValue"));
        String javaLang5 = signatureBuildingComponents2.javaLang("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        desc14.getClass();
        Pair pair14 = new Pair(Companion.access$method(companion3, javaLang5, "toFloat", "", desc14), Name.identifier("floatValue"));
        String javaLang6 = signatureBuildingComponents2.javaLang("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        desc15.getClass();
        Pair pair15 = new Pair(Companion.access$method(companion3, javaLang6, "toDouble", "", desc15), Name.identifier("doubleValue"));
        Pair pair16 = new Pair(access$method4, Name.identifier("remove"));
        String javaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        desc16.getClass();
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        desc17.getClass();
        Map mapOf2 = MapsKt__MapsKt.mapOf(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(Companion.access$method(companion3, javaLang7, "get", desc16, desc17), Name.identifier("charAt")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "load", "", "I"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "store", "I", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "exchange", "I", "I"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "fetchAndAdd", "I", "I"), Name.identifier("getAndAdd")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "addAndFetch", "I", "I"), Name.identifier("addAndGet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "load", "", "J"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "store", "J", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "exchange", "J", "J"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "fetchAndAdd", "J", "J"), Name.identifier("getAndAdd")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "addAndFetch", "J", "J"), Name.identifier("addAndGet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "load", "", "Z"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "store", "Z", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "exchange", "Z", "Z"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "load", "", "Ljava/lang/Object;"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "store", "Ljava/lang/Object;", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "loadAt", "I", "I"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "storeAt", "II", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "exchangeAt", "II", "I"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), Name.identifier("compareAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), Name.identifier("getAndAdd")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), Name.identifier("addAndGet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "loadAt", "I", "J"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "storeAt", "IJ", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "exchangeAt", "IJ", "J"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), Name.identifier("compareAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), Name.identifier("getAndAdd")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), Name.identifier("addAndGet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), Name.identifier("compareAndSet")));
        NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP = mapOf2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOf2.size()));
        for (Map.Entry entry2 : mapOf2.entrySet()) {
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        SIGNATURE_TO_JVM_REPRESENTATION_NAME = linkedHashMap2;
        Map map = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.copy$default((Companion.NameAndSignature) entry3.getKey(), null, (Name) entry3.getValue(), null, null, 13, null).getSignature());
        }
        Set keySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = keySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it5.next()).getName());
        }
        ORIGINAL_SHORT_NAMES = hashSet;
        Set<Map.Entry> entrySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet();
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).getName(), entry4.getValue()));
        }
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            Pair pair17 = (Pair) it6.next();
            linkedHashMap3.put((Name) pair17.second, (Name) pair17.first);
        }
        JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP = linkedHashMap3;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {
        public static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;
        public static final TypeSafeBarrierDescription FALSE;
        public static final TypeSafeBarrierDescription INDEX;
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT;
        public static final TypeSafeBarrierDescription NULL;
        public final Object defaultValue;

        public final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            NULL = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            INDEX = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            FALSE = typeSafeBarrierDescription3;
            MAP_GET_OR_DEFAULT map_get_or_default = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3, defaultConstructorMarker, defaultConstructorMarker);
            MAP_GET_OR_DEFAULT = map_get_or_default;
            $VALUES = new TypeSafeBarrierDescription[]{typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
        }

        public TypeSafeBarrierDescription(String str, int i, Object obj) {
            this.defaultValue = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }
    }
}
