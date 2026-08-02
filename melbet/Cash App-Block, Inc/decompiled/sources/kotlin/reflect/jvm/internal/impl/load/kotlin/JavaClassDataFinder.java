package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;

/* loaded from: classes9.dex */
public final class JavaClassDataFinder implements ClassDataFinder {
    public final DeserializedDescriptorResolver deserializedDescriptorResolver;
    public final KotlinClassFinder kotlinClassFinder;

    public JavaClassDataFinder(KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        kotlinClassFinder.getClass();
        deserializedDescriptorResolver.getClass();
        this.kotlinClassFinder = kotlinClassFinder;
        this.deserializedDescriptorResolver = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        classId.getClass();
        DeserializedDescriptorResolver deserializedDescriptorResolver = this.deserializedDescriptorResolver;
        KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, classId, deserializedDescriptorResolver.getComponents().getConfiguration().getMetadataVersion());
        if (findKotlinClass == null) {
            return null;
        }
        Intrinsics.areEqual(findKotlinClass.getClassId(), classId);
        return deserializedDescriptorResolver.readClassData$descriptors_jvm(findKotlinClass);
    }
}
