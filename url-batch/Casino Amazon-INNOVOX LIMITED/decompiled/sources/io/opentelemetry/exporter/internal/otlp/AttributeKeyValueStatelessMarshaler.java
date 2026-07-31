package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import io.opentelemetry.proto.common.v1.internal.KeyValue;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class AttributeKeyValueStatelessMarshaler implements StatelessMarshaler2<AttributeKey<?>, Object> {
    public static final AttributeKeyValueStatelessMarshaler INSTANCE = new AttributeKeyValueStatelessMarshaler();
    private static final byte[] EMPTY_BYTES = new byte[0];

    private AttributeKeyValueStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public void writeTo(Serializer serializer, AttributeKey<?> attributeKey, Object obj, MarshalerContext marshalerContext) throws IOException {
        if (attributeKey.getKey().isEmpty()) {
            serializer.serializeString(KeyValue.KEY, EMPTY_BYTES);
        } else if (attributeKey instanceof InternalAttributeKeyImpl) {
            serializer.serializeString(KeyValue.KEY, ((InternalAttributeKeyImpl) attributeKey).getKeyUtf8());
        } else {
            serializer.serializeStringWithContext(KeyValue.KEY, attributeKey.getKey(), marshalerContext);
        }
        serializer.serializeMessageWithContext(KeyValue.VALUE, attributeKey, obj, ValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public int getBinarySerializedSize(AttributeKey<?> attributeKey, Object obj, MarshalerContext marshalerContext) {
        int i;
        if (attributeKey.getKey().isEmpty()) {
            i = 0;
        } else if (attributeKey instanceof InternalAttributeKeyImpl) {
            i = MarshalerUtil.sizeBytes(KeyValue.KEY, ((InternalAttributeKeyImpl) attributeKey).getKeyUtf8());
        } else {
            return StatelessMarshalerUtil.sizeStringWithContext(KeyValue.KEY, attributeKey.getKey(), marshalerContext);
        }
        return i + StatelessMarshalerUtil.sizeMessageWithContext(KeyValue.VALUE, attributeKey, obj, ValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    private static class ValueStatelessMarshaler implements StatelessMarshaler2<AttributeKey<?>, Object> {
        static final ValueStatelessMarshaler INSTANCE = new ValueStatelessMarshaler();

        private ValueStatelessMarshaler() {
        }

        @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
        public int getBinarySerializedSize(AttributeKey<?> attributeKey, Object obj, MarshalerContext marshalerContext) {
            AttributeType type = attributeKey.getType();
            switch (AnonymousClass1.$SwitchMap$io$opentelemetry$api$common$AttributeType[type.ordinal()]) {
                case 1:
                    return StringAnyValueStatelessMarshaler.INSTANCE.getBinarySerializedSize((String) obj, marshalerContext);
                case 2:
                    return IntAnyValueStatelessMarshaler.INSTANCE.getBinarySerializedSize((Long) obj, marshalerContext);
                case 3:
                    return BoolAnyValueStatelessMarshaler.INSTANCE.getBinarySerializedSize((Boolean) obj, marshalerContext);
                case 4:
                    return DoubleAnyValueStatelessMarshaler.INSTANCE.getBinarySerializedSize((Double) obj, marshalerContext);
                case 5:
                case 6:
                case 7:
                case 8:
                    return StatelessMarshalerUtil.sizeMessageWithContext(AnyValue.ARRAY_VALUE, type, (List) obj, AttributeArrayAnyValueStatelessMarshaler.INSTANCE, marshalerContext);
                default:
                    throw new IllegalArgumentException("Unsupported attribute type.");
            }
        }

        @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
        public void writeTo(Serializer serializer, AttributeKey<?> attributeKey, Object obj, MarshalerContext marshalerContext) throws IOException {
            AttributeType type = attributeKey.getType();
            switch (AnonymousClass1.$SwitchMap$io$opentelemetry$api$common$AttributeType[type.ordinal()]) {
                case 1:
                    StringAnyValueStatelessMarshaler.INSTANCE.writeTo(serializer, (String) obj, marshalerContext);
                    return;
                case 2:
                    IntAnyValueStatelessMarshaler.INSTANCE.writeTo(serializer, (Long) obj, marshalerContext);
                    return;
                case 3:
                    BoolAnyValueStatelessMarshaler.INSTANCE.writeTo(serializer, (Boolean) obj, marshalerContext);
                    return;
                case 4:
                    DoubleAnyValueStatelessMarshaler.INSTANCE.writeTo(serializer, (Double) obj, marshalerContext);
                    return;
                case 5:
                case 6:
                case 7:
                case 8:
                    serializer.serializeMessageWithContext(AnyValue.ARRAY_VALUE, type, (List) obj, AttributeArrayAnyValueStatelessMarshaler.INSTANCE, marshalerContext);
                    return;
                default:
                    throw new IllegalArgumentException("Unsupported attribute type.");
            }
        }
    }

    /* renamed from: io.opentelemetry.exporter.internal.otlp.AttributeKeyValueStatelessMarshaler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$api$common$AttributeType;

        static {
            int[] iArr = new int[AttributeType.values().length];
            $SwitchMap$io$opentelemetry$api$common$AttributeType = iArr;
            try {
                iArr[AttributeType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.STRING_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.LONG_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.BOOLEAN_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.DOUBLE_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }
}
