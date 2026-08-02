package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {
    public final JvmClassName className;
    public final JvmClassName facadeClassName;
    public final KotlinJvmBinaryClass knownJvmBinaryClass;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JvmPackagePartSource(KotlinJvmBinaryClass kotlinJvmBinaryClass, ProtoBuf.Package r13, NameResolver nameResolver, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        this(r2, r3, null, r13, nameResolver, incompatibleVersionErrorData, new PreReleaseInfo(z, null, 2, null), deserializedContainerAbiStability, kotlinJvmBinaryClass);
        JvmClassName jvmClassName;
        kotlinJvmBinaryClass.getClass();
        r13.getClass();
        nameResolver.getClass();
        deserializedContainerAbiStability.getClass();
        JvmClassName byClassId = JvmClassName.byClassId(kotlinJvmBinaryClass.getClassId());
        byClassId.getClass();
        String multifileClassName = kotlinJvmBinaryClass.getClassHeader().getMultifileClassName();
        if (multifileClassName != null) {
            jvmClassName = multifileClassName.length() > 0 ? JvmClassName.byInternalName(multifileClassName) : null;
        } else {
            jvmClassName = null;
        }
    }

    public final ClassId getClassId() {
        FqName packageFqName = getClassName().getPackageFqName();
        packageFqName.getClass();
        return new ClassId(packageFqName, getSimpleName());
    }

    public JvmClassName getClassName() {
        return this.className;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        sourceFile.getClass();
        return sourceFile;
    }

    public JvmClassName getFacadeClassName() {
        return this.facadeClassName;
    }

    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.knownJvmBinaryClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + '\'';
    }

    public final Name getSimpleName() {
        String internalName = getClassName().getInternalName();
        internalName.getClass();
        Name identifier = Name.identifier(StringsKt.substringAfterLast('/', internalName, internalName));
        identifier.getClass();
        return identifier;
    }

    public String toString() {
        return "JvmPackagePartSource: " + getClassName();
    }

    public JvmPackagePartSource(JvmClassName jvmClassName, JvmClassName jvmClassName2, JvmClassName jvmClassName3, ProtoBuf.Package r4, NameResolver nameResolver, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, PreReleaseInfo preReleaseInfo, DeserializedContainerAbiStability deserializedContainerAbiStability, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        jvmClassName.getClass();
        r4.getClass();
        nameResolver.getClass();
        preReleaseInfo.getClass();
        deserializedContainerAbiStability.getClass();
        this.className = jvmClassName;
        this.facadeClassName = jvmClassName2;
        this.knownJvmBinaryClass = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = JvmProtoBuf.packageModuleName;
        generatedExtension.getClass();
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(r4, generatedExtension);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }
}
