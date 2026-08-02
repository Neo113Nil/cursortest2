package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;

/* loaded from: classes9.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {
    public final KotlinJvmBinaryClass binaryClass;

    public KotlinJvmBinarySourceElement(KotlinJvmBinaryClass kotlinJvmBinaryClass, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, PreReleaseInfo preReleaseInfo, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        kotlinJvmBinaryClass.getClass();
        preReleaseInfo.getClass();
        deserializedContainerAbiStability.getClass();
        this.binaryClass = kotlinJvmBinaryClass;
    }

    public final KotlinJvmBinaryClass getBinaryClass() {
        return this.binaryClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        sourceFile.getClass();
        return sourceFile;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String getPresentableString() {
        return "Class '" + this.binaryClass.getClassId().asSingleFqName().asString() + '\'';
    }

    public String toString() {
        return "KotlinJvmBinarySourceElement: " + this.binaryClass;
    }
}
