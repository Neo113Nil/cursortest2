package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmLambda;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class JvmReadUtils {
    public static final JvmReadUtils INSTANCE = new JvmReadUtils();

    public static boolean isLessThan14(Metadata metadata) {
        return new JvmMetadataVersion(metadata.mv()).compareTo(new JvmMetadataVersion(1, 4, 0)) < 0;
    }

    public final KmClass readKmClass$kotlin_metadata_jvm(Metadata metadata) {
        metadata.getClass();
        Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom = JvmProtoBufUtil.readClassDataFrom(JvmExceptionUtilsKt.requireNotEmpty(metadata), metadata.d2());
        return ReadersKt.toKmClass$default((ProtoBuf.Class) readClassDataFrom.second, (JvmNameResolver) readClassDataFrom.first, isLessThan14(metadata), null, 4, null);
    }

    public final KmLambda readKmLambda$kotlin_metadata_jvm(Metadata metadata) {
        Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom;
        metadata.getClass();
        String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 == null || (readFunctionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(d1, metadata.d2())) == null) {
            return null;
        }
        return ReadersKt.toKmLambda((ProtoBuf.Function) readFunctionDataFrom.second, (JvmNameResolver) readFunctionDataFrom.first, isLessThan14(metadata));
    }

    public final KmPackage readKmPackage$kotlin_metadata_jvm(Metadata metadata) {
        metadata.getClass();
        Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom = JvmProtoBufUtil.readPackageDataFrom(JvmExceptionUtilsKt.requireNotEmpty(metadata), metadata.d2());
        return ReadersKt.toKmPackage$default((ProtoBuf.Package) readPackageDataFrom.second, (JvmNameResolver) readPackageDataFrom.first, isLessThan14(metadata), null, 4, null);
    }

    public final KotlinClassMetadata readMetadataImpl$kotlin_metadata_jvm(Metadata metadata, boolean z) {
        metadata.getClass();
        if (metadata.mv().length == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        throwIfNotCompatible$kotlin_metadata_jvm(new MetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0), z);
        try {
            int k = metadata.k();
            return k != 1 ? k != 2 ? k != 3 ? k != 4 ? k != 5 ? new KotlinClassMetadata.Unknown(metadata, z) : new KotlinClassMetadata.MultiFileClassPart(metadata, z) : new KotlinClassMetadata.MultiFileClassFacade(metadata, z) : new KotlinClassMetadata.SyntheticClass(metadata, z) : new KotlinClassMetadata.FileFacade(metadata, z) : new KotlinClassMetadata.Class(metadata, z);
        } finally {
        }
    }

    public final void throwIfNotCompatible$kotlin_metadata_jvm(MetadataVersion metadataVersion, boolean z) {
        String str;
        metadataVersion.getClass();
        boolean isAtLeast = metadataVersion.isAtLeast(1, 1, 0);
        if (z ? isAtLeast : metadataVersion.isCompatibleWithCurrentCompilerVersion()) {
            return;
        }
        if (isAtLeast) {
            StringBuilder sb = new StringBuilder("while maximum supported version is ");
            sb.append(metadataVersion.isStrictSemantics() ? MetadataVersion.INSTANCE : MetadataVersion.INSTANCE_NEXT);
            sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
            str = sb.toString();
        } else {
            str = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
        }
        Handlers$$ExternalSyntheticBUOutline0.m$1("Provided Metadata instance has version ", metadataVersion, ", ", str);
    }
}
