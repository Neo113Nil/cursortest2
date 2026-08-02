package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* loaded from: classes9.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {
    Result findKotlinClassOrContent(JavaClass javaClass, MetadataVersion metadataVersion);

    Result findKotlinClassOrContent(ClassId classId, MetadataVersion metadataVersion);

    public static abstract class Result {

        public static final class ClassFileContent extends Result {
            public final byte[] getContent() {
                return null;
            }
        }

        public Result(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            KotlinClass kotlinClass = this instanceof KotlinClass ? (KotlinClass) this : null;
            if (kotlinClass != null) {
                return kotlinClass.getKotlinJvmBinaryClass();
            }
            return null;
        }

        public static final class KotlinClass extends Result {
            public final KotlinJvmBinaryClass kotlinJvmBinaryClass;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                kotlinJvmBinaryClass.getClass();
                this.kotlinJvmBinaryClass = kotlinJvmBinaryClass;
            }

            public final KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.kotlinJvmBinaryClass;
            }

            public /* synthetic */ KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass, (i & 2) != 0 ? null : bArr);
            }
        }
    }
}
