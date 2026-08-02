package kotlin.reflect.jvm.internal.impl.km.jvm;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmLambda;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmReadUtils;

/* loaded from: classes9.dex */
public abstract class KotlinClassMetadata {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinClassMetadata readLenient(Metadata metadata) {
            metadata.getClass();
            return JvmReadUtils.INSTANCE.readMetadataImpl$kotlin_metadata_jvm(metadata, true);
        }
    }

    public static final class Unknown extends KotlinClassMetadata {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(Metadata metadata, boolean z) {
            super(null);
            metadata.getClass();
            new JvmMetadataVersion(metadata.mv());
            metadata.xi();
        }
    }

    public KotlinClassMetadata(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public final void setAllowedToWrite$kotlin_metadata_jvm(boolean z) {
    }

    public static final class Class extends KotlinClassMetadata {
        public final KmClass kmClass;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Class(Metadata metadata, boolean z) {
            this(JvmReadUtils.INSTANCE.readKmClass$kotlin_metadata_jvm(metadata), new JvmMetadataVersion(metadata.mv()), metadata.xi());
            metadata.getClass();
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }

        public final KmClass getKmClass() {
            return this.kmClass;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(KmClass kmClass, JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            kmClass.getClass();
            jvmMetadataVersion.getClass();
            this.kmClass = kmClass;
        }
    }

    public static final class FileFacade extends KotlinClassMetadata {
        public final KmPackage kmPackage;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public FileFacade(Metadata metadata, boolean z) {
            this(JvmReadUtils.INSTANCE.readKmPackage$kotlin_metadata_jvm(metadata), new JvmMetadataVersion(metadata.mv()), metadata.xi());
            metadata.getClass();
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }

        public final KmPackage getKmPackage() {
            return this.kmPackage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileFacade(KmPackage kmPackage, JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            kmPackage.getClass();
            jvmMetadataVersion.getClass();
            this.kmPackage = kmPackage;
        }
    }

    public static final class SyntheticClass extends KotlinClassMetadata {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SyntheticClass(Metadata metadata, boolean z) {
            this(JvmReadUtils.INSTANCE.readKmLambda$kotlin_metadata_jvm(metadata), new JvmMetadataVersion(metadata.mv()), metadata.xi());
            metadata.getClass();
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SyntheticClass(KmLambda kmLambda, JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            jvmMetadataVersion.getClass();
        }
    }

    public static final class MultiFileClassFacade extends KotlinClassMetadata {
        public final List partClassNames;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public MultiFileClassFacade(Metadata metadata, boolean z) {
            this(ArraysKt___ArraysJvmKt.asList(metadata.d1()), new JvmMetadataVersion(metadata.mv()), metadata.xi());
            metadata.getClass();
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }

        public final List<String> getPartClassNames() {
            return this.partClassNames;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiFileClassFacade(List<String> list, JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            list.getClass();
            jvmMetadataVersion.getClass();
            this.partClassNames = list;
        }
    }

    public static final class MultiFileClassPart extends KotlinClassMetadata {
        public final KmPackage kmPackage;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public MultiFileClassPart(Metadata metadata, boolean z) {
            this(JvmReadUtils.INSTANCE.readKmPackage$kotlin_metadata_jvm(metadata), metadata.xs(), new JvmMetadataVersion(metadata.mv()), metadata.xi());
            metadata.getClass();
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }

        public final KmPackage getKmPackage() {
            return this.kmPackage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiFileClassPart(KmPackage kmPackage, String str, JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            kmPackage.getClass();
            str.getClass();
            jvmMetadataVersion.getClass();
            this.kmPackage = kmPackage;
        }
    }
}
