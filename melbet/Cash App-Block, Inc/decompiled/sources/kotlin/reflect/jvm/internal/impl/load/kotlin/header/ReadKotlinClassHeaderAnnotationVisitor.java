package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* loaded from: classes9.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {
    public static final HashMap HEADER_KINDS;
    public static final boolean IGNORE_OLD_METADATA;
    public int[] metadataVersionArray = null;
    public String extraString = null;
    public int extraInt = 0;
    public String packageName = null;
    public String[] data = null;
    public String[] strings = null;
    public String[] incompatibleData = null;
    public KotlinClassHeader.Kind headerKind = null;
    public String[] serializedIrFields = null;

    public abstract class CollectStringArrayAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {
        public final ArrayList strings = new ArrayList();

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final void visit(Object obj) {
            if (obj instanceof String) {
                this.strings.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId) {
            if (classId != null) {
                return null;
            }
            $$$reportNull$$$0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final void visitClassLiteral(ClassLiteralValue classLiteralValue) {
            if (classLiteralValue != null) {
                return;
            }
            $$$reportNull$$$0(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final void visitEnd() {
            visitEnd((String[]) this.strings.toArray(new String[0]));
        }

        public abstract void visitEnd(String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final void visitEnum(ClassId classId, Name name) {
            if (classId == null) {
                $$$reportNull$$$0(0);
                throw null;
            }
            if (name != null) {
                return;
            }
            $$$reportNull$$$0(1);
            throw null;
        }
    }

    public final class KotlinMetadataArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public KotlinMetadataArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visit(Name name, Object obj) {
            if (name == null) {
                return;
            }
            String asString = name.asString();
            boolean equals = "k".equals(asString);
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
            if (equals) {
                if (obj instanceof Integer) {
                    readKotlinClassHeaderAnnotationVisitor.headerKind = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(asString)) {
                if (obj instanceof int[]) {
                    readKotlinClassHeaderAnnotationVisitor.metadataVersionArray = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(asString)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    readKotlinClassHeaderAnnotationVisitor.extraString = str;
                    return;
                }
                return;
            }
            if ("xi".equals(asString)) {
                if (obj instanceof Integer) {
                    readKotlinClassHeaderAnnotationVisitor.extraInt = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(asString) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                readKotlinClassHeaderAnnotationVisitor.packageName = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            $$$reportNull$$$0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            String asString = name != null ? name.asString() : null;
            if ("d1".equals(asString)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void visitEnd(String[] strArr) {
                        if (strArr != null) {
                            ReadKotlinClassHeaderAnnotationVisitor.this.data = strArr;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                        }
                    }
                };
            }
            if ("d2".equals(asString)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.2
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void visitEnd(String[] strArr) {
                        if (strArr != null) {
                            ReadKotlinClassHeaderAnnotationVisitor.this.strings = strArr;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                        }
                    }
                };
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue != null) {
                return;
            }
            $$$reportNull$$$0(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            if (name2 != null) {
                return;
            }
            $$$reportNull$$$0(2);
            throw null;
        }
    }

    public final class KotlinSerializedIrArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public KotlinSerializedIrArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visit(Name name, Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            $$$reportNull$$$0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            if ("b".equals(name != null ? name.asString() : null)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinSerializedIrArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void visitEnd(String[] strArr) {
                        if (strArr != null) {
                            ReadKotlinClassHeaderAnnotationVisitor.this.serializedIrFields = strArr;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                        }
                    }
                };
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue != null) {
                return;
            }
            $$$reportNull$$$0(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            if (name2 != null) {
                return;
            }
            $$$reportNull$$$0(2);
            throw null;
        }
    }

    public final class OldDeprecatedAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public OldDeprecatedAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visit(Name name, Object obj) {
            if (name == null) {
                return;
            }
            String asString = name.asString();
            boolean equals = "version".equals(asString);
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
            if (equals) {
                if (obj instanceof int[]) {
                    readKotlinClassHeaderAnnotationVisitor.metadataVersionArray = (int[]) obj;
                }
            } else if ("multifileClassName".equals(asString)) {
                readKotlinClassHeaderAnnotationVisitor.extraString = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            $$$reportNull$$$0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            String asString = name != null ? name.asString() : null;
            if ("data".equals(asString) || "filePartClassNames".equals(asString)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void visitEnd(String[] strArr) {
                        if (strArr != null) {
                            ReadKotlinClassHeaderAnnotationVisitor.this.data = strArr;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                        }
                    }
                };
            }
            if ("strings".equals(asString)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.2
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void visitEnd(String[] strArr) {
                        if (strArr != null) {
                            ReadKotlinClassHeaderAnnotationVisitor.this.strings = strArr;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                        }
                    }
                };
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue != null) {
                return;
            }
            $$$reportNull$$$0(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            if (name2 != null) {
                return;
            }
            $$$reportNull$$$0(2);
            throw null;
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        try {
            IGNORE_OLD_METADATA = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            IGNORE_OLD_METADATA = false;
        }
        HashMap hashMap = new HashMap();
        HEADER_KINDS = hashMap;
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public KotlinClassHeader createHeader(MetadataVersion metadataVersion) {
        if (this.headerKind == null || this.metadataVersionArray == null) {
            return null;
        }
        MetadataVersion metadataVersion2 = new MetadataVersion(this.metadataVersionArray, (this.extraInt & 8) != 0);
        if (metadataVersion2.isCompatible(metadataVersion)) {
            KotlinClassHeader.Kind kind = this.headerKind;
            if ((kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) && this.data == null) {
                return null;
            }
        } else {
            this.incompatibleData = this.data;
            this.data = null;
        }
        String[] strArr = this.serializedIrFields;
        return new KotlinClassHeader(this.headerKind, metadataVersion2, this.data, this.incompatibleData, this.strings, this.extraString, this.extraInt, this.packageName, strArr != null ? BitEncoding.decodeBytes(strArr) : null);
    }

    public KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return createHeader(MetadataVersion.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        FqName asSingleFqName = classId.asSingleFqName();
        if (asSingleFqName.equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new KotlinMetadataArgumentVisitor();
        }
        if (asSingleFqName.equals(JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
            return new KotlinSerializedIrArgumentVisitor();
        }
        if (IGNORE_OLD_METADATA || this.headerKind != null || (kind = (KotlinClassHeader.Kind) HEADER_KINDS.get(classId)) == null) {
            return null;
        }
        this.headerKind = kind;
        return new OldDeprecatedAnnotationArgumentVisitor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}
