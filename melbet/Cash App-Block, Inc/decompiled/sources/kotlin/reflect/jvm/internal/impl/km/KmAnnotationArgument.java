package kotlin.reflect.jvm.internal.impl.km;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class KmAnnotationArgument {

    public static final class AnnotationValue extends KmAnnotationArgument {
        public final KmAnnotation annotation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnnotationValue(KmAnnotation kmAnnotation) {
            super(null);
            kmAnnotation.getClass();
            this.annotation = kmAnnotation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnnotationValue) && Intrinsics.areEqual(this.annotation, ((AnnotationValue) obj).annotation);
        }

        public final KmAnnotation getAnnotation() {
            return this.annotation;
        }

        public int hashCode() {
            return this.annotation.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public String toString() {
            return "AnnotationValue(" + this.annotation + ')';
        }
    }

    public static final class ArrayKClassValue extends KmAnnotationArgument {
        public final int arrayDimensionCount;
        public final String className;
        public final String stringRepresentation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayKClassValue(String str, int i) {
            super(null);
            str.getClass();
            this.className = str;
            this.arrayDimensionCount = i;
            if (i <= 0) {
                a$$ExternalSyntheticBUOutline0.m$3("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
                throw null;
            }
            StringBuilder sb = new StringBuilder("ArrayKClassValue(");
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("kotlin/Array<");
            }
            sb.append(this.className);
            int i3 = this.arrayDimensionCount;
            for (int i4 = 0; i4 < i3; i4++) {
                sb.append(">");
            }
            sb.append(")");
            this.stringRepresentation = sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayKClassValue)) {
                return false;
            }
            ArrayKClassValue arrayKClassValue = (ArrayKClassValue) obj;
            return Intrinsics.areEqual(this.className, arrayKClassValue.className) && this.arrayDimensionCount == arrayKClassValue.arrayDimensionCount;
        }

        public final int getArrayDimensionCount() {
            return this.arrayDimensionCount;
        }

        public final String getClassName() {
            return this.className;
        }

        public int hashCode() {
            return Integer.hashCode(this.arrayDimensionCount) + (this.className.hashCode() * 31);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public String toString() {
            return this.stringRepresentation;
        }
    }

    public static final class ArrayValue extends KmAnnotationArgument {
        public final List elements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayValue(List<? extends KmAnnotationArgument> list) {
            super(null);
            list.getClass();
            this.elements = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArrayValue) && Intrinsics.areEqual(this.elements, ((ArrayValue) obj).elements);
        }

        public final List<KmAnnotationArgument> getElements() {
            return this.elements;
        }

        public int hashCode() {
            return this.elements.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("ArrayValue("), this.elements, ')');
        }
    }

    public static final class BooleanValue extends LiteralValue<Boolean> {
        public final boolean value;

        public BooleanValue(boolean z) {
            super(null);
            this.value = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BooleanValue) && this.value == ((BooleanValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public Boolean getValue() {
            return Boolean.valueOf(this.value);
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }
    }

    public static final class ByteValue extends LiteralValue<Byte> {
        public final byte value;

        public ByteValue(byte b) {
            super(null);
            this.value = b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ByteValue) && this.value == ((ByteValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public Byte getValue() {
            return Byte.valueOf(this.value);
        }

        public int hashCode() {
            return Byte.hashCode(this.value);
        }
    }

    public static final class CharValue extends LiteralValue<Character> {
        public final char value;

        public CharValue(char c) {
            super(null);
            this.value = c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CharValue) && this.value == ((CharValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public Character getValue() {
            return Character.valueOf(this.value);
        }

        public int hashCode() {
            return Character.hashCode(this.value);
        }
    }

    public static final class DoubleValue extends LiteralValue<Double> {
        public final double value;

        public DoubleValue(double d) {
            super(null);
            this.value = d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoubleValue) && Double.compare(this.value, ((DoubleValue) obj).value) == 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public Double getValue() {
            return Double.valueOf(this.value);
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }
    }

    public static final class EnumValue extends KmAnnotationArgument {
        public final String enumClassName;
        public final String enumEntryName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumValue(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.enumClassName = str;
            this.enumEntryName = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnumValue)) {
                return false;
            }
            EnumValue enumValue = (EnumValue) obj;
            return Intrinsics.areEqual(this.enumClassName, enumValue.enumClassName) && Intrinsics.areEqual(this.enumEntryName, enumValue.enumEntryName);
        }

        public final String getEnumClassName() {
            return this.enumClassName;
        }

        public final String getEnumEntryName() {
            return this.enumEntryName;
        }

        public int hashCode() {
            return this.enumEntryName.hashCode() + (this.enumClassName.hashCode() * 31);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public String toString() {
            StringBuilder sb = new StringBuilder("EnumValue(");
            sb.append(this.enumClassName);
            sb.append('.');
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.enumEntryName, ')');
        }
    }

    public static final class FloatValue extends LiteralValue<Float> {
        public final float value;

        public FloatValue(float f) {
            super(null);
            this.value = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatValue) && Float.compare(this.value, ((FloatValue) obj).value) == 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public Float getValue() {
            return Float.valueOf(this.value);
        }

        public int hashCode() {
            return Float.hashCode(this.value);
        }
    }

    public static final class IntValue extends LiteralValue<Integer> {
        public final int value;

        public IntValue(int i) {
            super(null);
            this.value = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntValue) && this.value == ((IntValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public Integer getValue() {
            return Integer.valueOf(this.value);
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }
    }

    public static final class KClassValue extends KmAnnotationArgument {
        public final String className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KClassValue(String str) {
            super(null);
            str.getClass();
            this.className = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KClassValue) && Intrinsics.areEqual(this.className, ((KClassValue) obj).className);
        }

        public final String getClassName() {
            return this.className;
        }

        public int hashCode() {
            return this.className.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("KClassValue("), this.className, ')');
        }
    }

    public static abstract class LiteralValue<T> extends KmAnnotationArgument {
        public LiteralValue(DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
        }

        public abstract T getValue();

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public final String toString() {
            String obj;
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append('(');
            if (this instanceof StringValue) {
                obj = "\"" + ((Object) ((StringValue) this).getValue()) + '\"';
            } else {
                obj = getValue().toString();
            }
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, obj, ')');
        }
    }

    public static final class LongValue extends LiteralValue<Long> {
        public final long value;

        public LongValue(long j) {
            super(null);
            this.value = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LongValue) && this.value == ((LongValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public Long getValue() {
            return Long.valueOf(this.value);
        }

        public int hashCode() {
            return Long.hashCode(this.value);
        }
    }

    public static final class ShortValue extends LiteralValue<Short> {
        public final short value;

        public ShortValue(short s) {
            super(null);
            this.value = s;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShortValue) && this.value == ((ShortValue) obj).value;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public Short getValue() {
            return Short.valueOf(this.value);
        }

        public int hashCode() {
            return Short.hashCode(this.value);
        }
    }

    public static final class UByteValue extends LiteralValue<UByte> {
        public final byte value;

        public UByteValue(byte b, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.value = b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UByteValue) && this.value == ((UByteValue) obj).value;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* synthetic */ UByte getValue() {
            return new UByte(m4145getValuew2LRezQ());
        }

        /* renamed from: getValue-w2LRezQ, reason: not valid java name */
        public byte m4145getValuew2LRezQ() {
            return this.value;
        }

        public int hashCode() {
            UByte.Companion companion = UByte.Companion;
            return Byte.hashCode(this.value);
        }
    }

    public static final class UIntValue extends LiteralValue<UInt> {
        public final int value;

        public UIntValue(int i, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.value = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UIntValue) && this.value == ((UIntValue) obj).value;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* synthetic */ UInt getValue() {
            return new UInt(m4146getValuepVg5ArA());
        }

        /* renamed from: getValue-pVg5ArA, reason: not valid java name */
        public int m4146getValuepVg5ArA() {
            return this.value;
        }

        public int hashCode() {
            UInt.Companion companion = UInt.Companion;
            return Integer.hashCode(this.value);
        }
    }

    public static final class ULongValue extends LiteralValue<ULong> {
        public final long value;

        public ULongValue(long j, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.value = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ULongValue) && this.value == ((ULongValue) obj).value;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* synthetic */ ULong getValue() {
            return new ULong(m4147getValuesVKNKU());
        }

        /* renamed from: getValue-s-VKNKU, reason: not valid java name */
        public long m4147getValuesVKNKU() {
            return this.value;
        }

        public int hashCode() {
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.value);
        }
    }

    public static final class UShortValue extends LiteralValue<UShort> {
        public final short value;

        public UShortValue(short s, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.value = s;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UShortValue) && this.value == ((UShortValue) obj).value;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* synthetic */ UShort getValue() {
            return new UShort(m4148getValueMh2AYeg());
        }

        /* renamed from: getValue-Mh2AYeg, reason: not valid java name */
        public short m4148getValueMh2AYeg() {
            return this.value;
        }

        public int hashCode() {
            UShort.Companion companion = UShort.Companion;
            return Short.hashCode(this.value);
        }
    }

    public KmAnnotationArgument(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract String toString();

    public static final class StringValue extends LiteralValue<String> {
        public final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringValue(String str) {
            super(null);
            str.getClass();
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringValue) && Intrinsics.areEqual(this.value, ((StringValue) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public String getValue() {
            return this.value;
        }
    }
}
