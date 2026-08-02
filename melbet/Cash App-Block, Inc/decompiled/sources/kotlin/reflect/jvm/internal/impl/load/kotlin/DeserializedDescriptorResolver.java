package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;

/* loaded from: classes9.dex */
public final class DeserializedDescriptorResolver {
    public DeserializationComponents components;
    public static final Companion Companion = new Companion(null);
    public static final Set KOTLIN_CLASS = SetsKt__SetsJVMKt.setOf(KotlinClassHeader.Kind.CLASS);
    public static final Set KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART = ArraysKt___ArraysKt.toSet(new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});
    public static final MetadataVersion KOTLIN_1_1_EAP_METADATA_VERSION = new MetadataVersion(1, 1, 2);
    public static final MetadataVersion KOTLIN_1_3_M1_METADATA_VERSION = new MetadataVersion(1, 1, 11);
    public static final MetadataVersion KOTLIN_1_3_RC_METADATA_VERSION = new MetadataVersion(1, 1, 13);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final MetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.KOTLIN_1_3_RC_METADATA_VERSION;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART.contains(r0.getKind()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MemberScope createKotlinPackagePartScope(PackageFragmentDescriptor packageFragmentDescriptor, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Pair<JvmNameResolver, ProtoBuf.Package> pair;
        packageFragmentDescriptor.getClass();
        kotlinJvmBinaryClass.getClass();
        KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data != null) {
        }
        data = null;
        if (data != null) {
            String[] strings = kotlinJvmBinaryClass.getClassHeader().getStrings();
            try {
            } catch (Throwable th) {
                if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(getComponents().getConfiguration().getMetadataVersion())) {
                    throw th;
                }
                pair = null;
            }
            if (strings != null) {
                try {
                    pair = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                    if (pair != null) {
                        JvmNameResolver jvmNameResolver = (JvmNameResolver) pair.first;
                        ProtoBuf.Package r4 = (ProtoBuf.Package) pair.second;
                        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinJvmBinaryClass, r4, jvmNameResolver, getIncompatibility(kotlinJvmBinaryClass), isPreReleaseInvisible(kotlinJvmBinaryClass), getComponents().getConfiguration().getAllowUnstableDependencies() ? DeserializedContainerAbiStability.STABLE : kotlinJvmBinaryClass.getClassHeader().isUnstableJvmIrBinary() ? DeserializedContainerAbiStability.UNSTABLE : DeserializedContainerAbiStability.STABLE);
                        return new DeserializedPackageMemberScope(packageFragmentDescriptor, r4, jvmNameResolver, kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), jvmPackagePartSource, getComponents(), "scope for " + jvmPackagePartSource + " in " + packageFragmentDescriptor, DeserializedDescriptorResolver$$Lambda$0.INSTANCE);
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e);
                }
            }
        }
        return null;
    }

    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        throw null;
    }

    public final IncompatibleVersionErrorData getIncompatibility(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(getComponents().getConfiguration().getMetadataVersion())) {
            return null;
        }
        return new IncompatibleVersionErrorData(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), MetadataVersion.INSTANCE, getComponents().getConfiguration().getMetadataVersion(), getComponents().getConfiguration().getMetadataVersion().lastSupportedVersionWithThisLanguageVersion(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isStrictSemantics()), kotlinJvmBinaryClass.getLocation());
    }

    public final boolean isPreReleaseInvisible(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_1_EAP_METADATA_VERSION))) {
            return true;
        }
        return !getComponents().getConfiguration().getSkipPrereleaseCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_3_M1_METADATA_VERSION);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.KOTLIN_CLASS.contains(r1.getKind()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ClassData readClassData$descriptors_jvm(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Pair<JvmNameResolver, ProtoBuf.Class> pair;
        kotlinJvmBinaryClass.getClass();
        KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data != null) {
        }
        data = null;
        if (data != null) {
            String[] strings = kotlinJvmBinaryClass.getClassHeader().getStrings();
            try {
            } catch (Throwable th) {
                if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(getComponents().getConfiguration().getMetadataVersion())) {
                    throw th;
                }
                pair = null;
            }
            if (strings != null) {
                try {
                    pair = JvmProtoBufUtil.readClassDataFrom(data, strings);
                    if (pair != null) {
                        return new ClassData((JvmNameResolver) pair.first, (ProtoBuf.Class) pair.second, kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, getIncompatibility(kotlinJvmBinaryClass), new PreReleaseInfo(isPreReleaseInvisible(kotlinJvmBinaryClass), null, 2, null), getComponents().getConfiguration().getAllowUnstableDependencies() ? DeserializedContainerAbiStability.STABLE : kotlinJvmBinaryClass.getClassHeader().isUnstableJvmIrBinary() ? DeserializedContainerAbiStability.UNSTABLE : DeserializedContainerAbiStability.STABLE));
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e);
                }
            }
        }
        return null;
    }

    public final ClassDescriptor resolveClass(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        ClassData readClassData$descriptors_jvm = readClassData$descriptors_jvm(kotlinJvmBinaryClass);
        if (readClassData$descriptors_jvm == null) {
            return null;
        }
        return getComponents().getClassDeserializer().deserializeClass(kotlinJvmBinaryClass.getClassId(), readClassData$descriptors_jvm);
    }

    public final void setComponents(DeserializationComponentsForJava deserializationComponentsForJava) {
        deserializationComponentsForJava.getClass();
        setComponents(deserializationComponentsForJava.getComponents());
    }

    public final void setComponents(DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.components = deserializationComponents;
    }
}
