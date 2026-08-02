package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* loaded from: classes9.dex */
public final class UnsignedTypes {
    public static final UnsignedTypes INSTANCE = new UnsignedTypes();
    public static final HashMap arrayClassIdToUnsignedClassId;
    public static final LinkedHashSet arrayClassesShortNames;
    public static final HashMap unsignedClassIdToArrayClassId;
    public static final Set unsignedTypeNames;

    static {
        UnsignedType[] values = UnsignedType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (UnsignedType unsignedType : values) {
            arrayList.add(unsignedType.getTypeName());
        }
        unsignedTypeNames = CollectionsKt.toSet(arrayList);
        UnsignedArrayType[] values2 = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (UnsignedArrayType unsignedArrayType : values2) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        CollectionsKt.toSet(arrayList2);
        arrayClassIdToUnsignedClassId = new HashMap();
        unsignedClassIdToArrayClassId = new HashMap();
        MapsKt__MapsKt.hashMapOf(new Pair(UnsignedArrayType.UBYTEARRAY, Name.identifier("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, Name.identifier("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, Name.identifier("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, Name.identifier("ulongArrayOf")));
        UnsignedType[] values3 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : values3) {
            linkedHashSet.add(unsignedType2.getArrayClassId().getShortClassName());
        }
        arrayClassesShortNames = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            arrayClassIdToUnsignedClassId.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            unsignedClassIdToArrayClassId.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    public static final boolean isUnsignedType(KotlinType kotlinType) {
        ClassifierDescriptor mo4153getDeclarationDescriptor;
        kotlinType.getClass();
        if (TypeUtils.noExpectedType(kotlinType) || (mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor()) == null) {
            return false;
        }
        return INSTANCE.isUnsignedClass(mo4153getDeclarationDescriptor);
    }

    public final ClassId getUnsignedClassIdByArrayClassId(ClassId classId) {
        classId.getClass();
        return (ClassId) arrayClassIdToUnsignedClassId.get(classId);
    }

    public final boolean isShortNameOfUnsignedArray(Name name) {
        name.getClass();
        return arrayClassesShortNames.contains(name);
    }

    public final boolean isUnsignedClass(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        return (containingDeclaration instanceof PackageFragmentDescriptor) && Intrinsics.areEqual(((PackageFragmentDescriptor) containingDeclaration).getFqName(), StandardNames.BUILT_INS_PACKAGE_FQ_NAME) && unsignedTypeNames.contains(declarationDescriptor.getName());
    }
}
