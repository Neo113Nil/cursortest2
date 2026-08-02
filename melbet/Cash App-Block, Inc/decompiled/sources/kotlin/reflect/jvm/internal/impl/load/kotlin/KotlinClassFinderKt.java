package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes9.dex */
public final class KotlinClassFinderKt {
    public static final KotlinJvmBinaryClass findKotlinClass(KotlinClassFinder kotlinClassFinder, ClassId classId, MetadataVersion metadataVersion) {
        kotlinClassFinder.getClass();
        classId.getClass();
        metadataVersion.getClass();
        KotlinClassFinder.Result findKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(classId, metadataVersion);
        if (findKotlinClassOrContent != null) {
            return findKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }

    public static final KotlinJvmBinaryClass findKotlinClass(KotlinClassFinder kotlinClassFinder, JavaClass javaClass, MetadataVersion metadataVersion) {
        kotlinClassFinder.getClass();
        javaClass.getClass();
        metadataVersion.getClass();
        KotlinClassFinder.Result findKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(javaClass, metadataVersion);
        if (findKotlinClassOrContent != null) {
            return findKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }
}
