package kotlin.reflect.jvm.internal.impl.km.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.km.ClassNameKt;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.serialization.StringTable;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public final class WriteUtilsKt {
    public static final int getClassNameIndex(StringTable stringTable, String str) {
        stringTable.getClass();
        str.getClass();
        return ClassNameKt.isLocalClassName(str) ? stringTable.getQualifiedClassNameIndex(str.substring(1), true) : stringTable.getQualifiedClassNameIndex(str, false);
    }

    public static final ProtoBuf.Annotation.Builder writeAnnotation(KmAnnotation kmAnnotation, StringTable stringTable) {
        kmAnnotation.getClass();
        stringTable.getClass();
        ProtoBuf.Annotation.Builder newBuilder = ProtoBuf.Annotation.newBuilder();
        newBuilder.setId(getClassNameIndex(stringTable, kmAnnotation.getClassName()));
        for (Map.Entry<String, KmAnnotationArgument> entry : kmAnnotation.getArguments().entrySet()) {
            String key = entry.getKey();
            KmAnnotationArgument value = entry.getValue();
            ProtoBuf.Annotation.Argument.Builder newBuilder2 = ProtoBuf.Annotation.Argument.newBuilder();
            newBuilder2.setNameId(stringTable.getStringIndex(key));
            newBuilder2.setValue(writeAnnotationArgument(value, stringTable).build());
            newBuilder.addArgument(newBuilder2);
        }
        return newBuilder;
    }

    public static final ProtoBuf.Annotation.Argument.Value.Builder writeAnnotationArgument(KmAnnotationArgument kmAnnotationArgument, StringTable stringTable) {
        kmAnnotationArgument.getClass();
        stringTable.getClass();
        ProtoBuf.Annotation.Argument.Value.Builder newBuilder = ProtoBuf.Annotation.Argument.Value.newBuilder();
        if (kmAnnotationArgument instanceof KmAnnotationArgument.ByteValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.BYTE);
            newBuilder.setIntValue(((KmAnnotationArgument.ByteValue) kmAnnotationArgument).getValue().byteValue());
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.CharValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.CHAR);
            newBuilder.setIntValue(((KmAnnotationArgument.CharValue) kmAnnotationArgument).getValue().charValue());
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.ShortValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.SHORT);
            newBuilder.setIntValue(((KmAnnotationArgument.ShortValue) kmAnnotationArgument).getValue().shortValue());
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.IntValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.INT);
            newBuilder.setIntValue(((KmAnnotationArgument.IntValue) kmAnnotationArgument).getValue().intValue());
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.LongValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.LONG);
            newBuilder.setIntValue(((KmAnnotationArgument.LongValue) kmAnnotationArgument).getValue().longValue());
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.FloatValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.FLOAT);
            newBuilder.setFloatValue(((KmAnnotationArgument.FloatValue) kmAnnotationArgument).getValue().floatValue());
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.DoubleValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.DOUBLE);
            newBuilder.setDoubleValue(((KmAnnotationArgument.DoubleValue) kmAnnotationArgument).getValue().doubleValue());
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.BooleanValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN);
            newBuilder.setIntValue(((KmAnnotationArgument.BooleanValue) kmAnnotationArgument).getValue().booleanValue() ? 1L : 0L);
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.UByteValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.BYTE);
            newBuilder.setIntValue(((KmAnnotationArgument.UByteValue) kmAnnotationArgument).m4145getValuew2LRezQ() & 255);
            newBuilder.setFlags(Flags.IS_UNSIGNED.toFlags(Boolean.TRUE));
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.UShortValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.SHORT);
            newBuilder.setIntValue(((KmAnnotationArgument.UShortValue) kmAnnotationArgument).m4148getValueMh2AYeg() & 65535);
            newBuilder.setFlags(Flags.IS_UNSIGNED.toFlags(Boolean.TRUE));
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.UIntValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.INT);
            newBuilder.setIntValue(((KmAnnotationArgument.UIntValue) kmAnnotationArgument).m4146getValuepVg5ArA() & BodyPartID.bodyIdMax);
            newBuilder.setFlags(Flags.IS_UNSIGNED.toFlags(Boolean.TRUE));
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.ULongValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.LONG);
            newBuilder.setIntValue(((KmAnnotationArgument.ULongValue) kmAnnotationArgument).m4147getValuesVKNKU());
            newBuilder.setFlags(Flags.IS_UNSIGNED.toFlags(Boolean.TRUE));
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.StringValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.STRING);
            newBuilder.setStringValue(stringTable.getStringIndex(((KmAnnotationArgument.StringValue) kmAnnotationArgument).getValue()));
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.KClassValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.CLASS);
            newBuilder.setClassId(getClassNameIndex(stringTable, ((KmAnnotationArgument.KClassValue) kmAnnotationArgument).getClassName()));
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.ArrayKClassValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.CLASS);
            KmAnnotationArgument.ArrayKClassValue arrayKClassValue = (KmAnnotationArgument.ArrayKClassValue) kmAnnotationArgument;
            newBuilder.setClassId(getClassNameIndex(stringTable, arrayKClassValue.getClassName()));
            newBuilder.setArrayDimensionCount(arrayKClassValue.getArrayDimensionCount());
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.EnumValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.ENUM);
            KmAnnotationArgument.EnumValue enumValue = (KmAnnotationArgument.EnumValue) kmAnnotationArgument;
            newBuilder.setClassId(getClassNameIndex(stringTable, enumValue.getEnumClassName()));
            newBuilder.setEnumValueId(stringTable.getStringIndex(enumValue.getEnumEntryName()));
        } else if (kmAnnotationArgument instanceof KmAnnotationArgument.AnnotationValue) {
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION);
            newBuilder.setAnnotation(writeAnnotation(((KmAnnotationArgument.AnnotationValue) kmAnnotationArgument).getAnnotation(), stringTable).build());
        } else {
            if (!(kmAnnotationArgument instanceof KmAnnotationArgument.ArrayValue)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            newBuilder.setType(ProtoBuf.Annotation.Argument.Value.Type.ARRAY);
            Iterator<KmAnnotationArgument> it = ((KmAnnotationArgument.ArrayValue) kmAnnotationArgument).getElements().iterator();
            while (it.hasNext()) {
                newBuilder.addArrayElement(writeAnnotationArgument(it.next(), stringTable));
            }
        }
        newBuilder.getClass();
        return newBuilder;
    }
}
