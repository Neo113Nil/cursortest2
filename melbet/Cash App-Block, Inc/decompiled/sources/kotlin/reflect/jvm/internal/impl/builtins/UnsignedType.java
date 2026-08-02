package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes9.dex */
public final class UnsignedType {
    public static final /* synthetic */ UnsignedType[] $VALUES;
    public static final UnsignedType UBYTE;
    public static final UnsignedType UINT;
    public static final UnsignedType ULONG;
    public static final UnsignedType USHORT;
    public final ClassId arrayClassId;
    public final ClassId classId;
    public final Name typeName;

    static {
        ClassId.Companion companion = ClassId.Companion;
        UnsignedType unsignedType = new UnsignedType("UBYTE", 0, ClassId.Companion.fromString$default(companion, "kotlin/UByte", false, 2, null));
        UBYTE = unsignedType;
        UnsignedType unsignedType2 = new UnsignedType("USHORT", 1, ClassId.Companion.fromString$default(companion, "kotlin/UShort", false, 2, null));
        USHORT = unsignedType2;
        UnsignedType unsignedType3 = new UnsignedType("UINT", 2, ClassId.Companion.fromString$default(companion, "kotlin/UInt", false, 2, null));
        UINT = unsignedType3;
        UnsignedType unsignedType4 = new UnsignedType("ULONG", 3, ClassId.Companion.fromString$default(companion, "kotlin/ULong", false, 2, null));
        ULONG = unsignedType4;
        $VALUES = new UnsignedType[]{unsignedType, unsignedType2, unsignedType3, unsignedType4};
    }

    public UnsignedType(String str, int i, ClassId classId) {
        this.classId = classId;
        Name shortClassName = classId.getShortClassName();
        this.typeName = shortClassName;
        FqName packageFqName = classId.getPackageFqName();
        Name identifier = Name.identifier(shortClassName.asString() + "Array");
        identifier.getClass();
        this.arrayClassId = new ClassId(packageFqName, identifier);
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    public final ClassId getArrayClassId() {
        return this.arrayClassId;
    }

    public final ClassId getClassId() {
        return this.classId;
    }

    public final Name getTypeName() {
        return this.typeName;
    }
}
