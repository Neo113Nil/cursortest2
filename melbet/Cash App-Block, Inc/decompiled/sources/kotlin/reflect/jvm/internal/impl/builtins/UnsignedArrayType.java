package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTEARRAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes9.dex */
public final class UnsignedArrayType {
    public static final /* synthetic */ UnsignedArrayType[] $VALUES;
    public static final UnsignedArrayType UBYTEARRAY;
    public static final UnsignedArrayType UINTARRAY;
    public static final UnsignedArrayType ULONGARRAY;
    public static final UnsignedArrayType USHORTARRAY;
    public final Name typeName;

    static {
        ClassId.Companion companion = ClassId.Companion;
        UnsignedArrayType unsignedArrayType = new UnsignedArrayType("UBYTEARRAY", 0, ClassId.Companion.fromString$default(companion, "kotlin/UByteArray", false, 2, null));
        UBYTEARRAY = unsignedArrayType;
        UnsignedArrayType unsignedArrayType2 = new UnsignedArrayType("USHORTARRAY", 1, ClassId.Companion.fromString$default(companion, "kotlin/UShortArray", false, 2, null));
        USHORTARRAY = unsignedArrayType2;
        UnsignedArrayType unsignedArrayType3 = new UnsignedArrayType("UINTARRAY", 2, ClassId.Companion.fromString$default(companion, "kotlin/UIntArray", false, 2, null));
        UINTARRAY = unsignedArrayType3;
        UnsignedArrayType unsignedArrayType4 = new UnsignedArrayType("ULONGARRAY", 3, ClassId.Companion.fromString$default(companion, "kotlin/ULongArray", false, 2, null));
        ULONGARRAY = unsignedArrayType4;
        $VALUES = new UnsignedArrayType[]{unsignedArrayType, unsignedArrayType2, unsignedArrayType3, unsignedArrayType4};
    }

    public UnsignedArrayType(String str, int i, ClassId classId) {
        this.typeName = classId.getShortClassName();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    public final Name getTypeName() {
        return this.typeName;
    }
}
