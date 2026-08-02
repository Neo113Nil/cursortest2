package kotlin.reflect.jvm.internal.impl.km.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

/* loaded from: classes9.dex */
public final class ReadUtilsKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getClassName(NameResolver nameResolver, int i) {
        nameResolver.getClass();
        String qualifiedClassName = nameResolver.getQualifiedClassName(i);
        return nameResolver.isLocalClassName(i) ? Recorder$$ExternalSyntheticOutline2.m(".", qualifiedClassName) : qualifiedClassName;
    }

    public static final KmAnnotation readAnnotation(ProtoBuf.Annotation annotation, NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        String className = getClassName(nameResolver, annotation.getId());
        List<ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
        argumentList.getClass();
        ArrayList arrayList = new ArrayList();
        for (ProtoBuf.Annotation.Argument argument : argumentList) {
            ProtoBuf.Annotation.Argument.Value value = argument.getValue();
            value.getClass();
            KmAnnotationArgument readAnnotationArgument = readAnnotationArgument(value, nameResolver);
            Pair pair = readAnnotationArgument != null ? new Pair(nameResolver.getString(argument.getNameId()), readAnnotationArgument) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new KmAnnotation(className, MapsKt__MapsKt.toMap(arrayList));
    }

    public static final KmAnnotationArgument readAnnotationArgument(ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        value.getClass();
        nameResolver.getClass();
        if (Flags.IS_UNSIGNED.get(value.getFlags()).booleanValue()) {
            ProtoBuf.Annotation.Argument.Value.Type type2 = value.getType();
            int i = type2 != null ? WhenMappings.$EnumSwitchMapping$0[type2.ordinal()] : -1;
            if (i == 1) {
                byte intValue = (byte) value.getIntValue();
                UByte.Companion companion = UByte.Companion;
                return new KmAnnotationArgument.UByteValue(intValue, null);
            }
            if (i == 2) {
                short intValue2 = (short) value.getIntValue();
                UShort.Companion companion2 = UShort.Companion;
                return new KmAnnotationArgument.UShortValue(intValue2, null);
            }
            if (i == 3) {
                int intValue3 = (int) value.getIntValue();
                UInt.Companion companion3 = UInt.Companion;
                return new KmAnnotationArgument.UIntValue(intValue3, null);
            }
            if (i != 4) {
                a$$ExternalSyntheticBUOutline0.m(value.getType(), "Cannot read value of unsigned type: ");
                return null;
            }
            long intValue4 = value.getIntValue();
            ULong.Companion companion4 = ULong.Companion;
            return new KmAnnotationArgument.ULongValue(intValue4, null);
        }
        ProtoBuf.Annotation.Argument.Value.Type type3 = value.getType();
        switch (type3 != null ? WhenMappings.$EnumSwitchMapping$0[type3.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                return new KmAnnotationArgument.ByteValue((byte) value.getIntValue());
            case 2:
                return new KmAnnotationArgument.ShortValue((short) value.getIntValue());
            case 3:
                return new KmAnnotationArgument.IntValue((int) value.getIntValue());
            case 4:
                return new KmAnnotationArgument.LongValue(value.getIntValue());
            case 5:
                return new KmAnnotationArgument.CharValue((char) value.getIntValue());
            case 6:
                return new KmAnnotationArgument.FloatValue(value.getFloatValue());
            case 7:
                return new KmAnnotationArgument.DoubleValue(value.getDoubleValue());
            case 8:
                return new KmAnnotationArgument.BooleanValue(value.getIntValue() != 0);
            case 9:
                return new KmAnnotationArgument.StringValue(nameResolver.getString(value.getStringValue()));
            case 10:
                String className = getClassName(nameResolver, value.getClassId());
                return value.getArrayDimensionCount() == 0 ? new KmAnnotationArgument.KClassValue(className) : new KmAnnotationArgument.ArrayKClassValue(className, value.getArrayDimensionCount());
            case 11:
                return new KmAnnotationArgument.EnumValue(getClassName(nameResolver, value.getClassId()), nameResolver.getString(value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new KmAnnotationArgument.AnnotationValue(readAnnotation(annotation, nameResolver));
            case 13:
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument.Value value2 : arrayElementList) {
                    value2.getClass();
                    KmAnnotationArgument readAnnotationArgument = readAnnotationArgument(value2, nameResolver);
                    if (readAnnotationArgument != null) {
                        arrayList.add(readAnnotationArgument);
                    }
                }
                return new KmAnnotationArgument.ArrayValue(arrayList);
        }
    }
}
