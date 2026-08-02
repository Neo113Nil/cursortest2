package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* loaded from: classes9.dex */
public final class MethodSignatureBuildingUtilsKt {
    public static final String signature(SignatureBuildingComponents signatureBuildingComponents, ClassDescriptor classDescriptor, String str) {
        signatureBuildingComponents.getClass();
        classDescriptor.getClass();
        str.getClass();
        return signatureBuildingComponents.signature(MethodSignatureMappingKt.getInternalName(classDescriptor), str);
    }
}
