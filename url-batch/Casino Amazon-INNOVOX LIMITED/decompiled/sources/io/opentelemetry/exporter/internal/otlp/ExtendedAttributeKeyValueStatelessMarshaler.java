package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.common.ExtendedAttributeKey;
import io.opentelemetry.api.incubator.common.ExtendedAttributeType;
import io.opentelemetry.api.incubator.common.ExtendedAttributes;
import io.opentelemetry.api.incubator.internal.InternalExtendedAttributeKeyImpl;
import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.ProtoFieldInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import io.opentelemetry.proto.common.v1.internal.KeyValue;
import io.opentelemetry.proto.common.v1.internal.KeyValueList;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class ExtendedAttributeKeyValueStatelessMarshaler implements StatelessMarshaler2<ExtendedAttributeKey<?>, Object> {
    private static final ExtendedAttributeKeyValueStatelessMarshaler INSTANCE = new ExtendedAttributeKeyValueStatelessMarshaler();
    private static final byte[] EMPTY_BYTES = new byte[0];

    private ExtendedAttributeKeyValueStatelessMarshaler() {
    }

    public static void serializeExtendedAttributes(final Serializer serializer, final ProtoFieldInfo protoFieldInfo, ExtendedAttributes extendedAttributes, final MarshalerContext marshalerContext) throws IOException {
        serializer.writeStartRepeated(protoFieldInfo);
        if (!extendedAttributes.isEmpty()) {
            try {
                extendedAttributes.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.otlp.ExtendedAttributeKeyValueStatelessMarshaler$$ExternalSyntheticLambda1
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        ExtendedAttributeKeyValueStatelessMarshaler.lambda$serializeExtendedAttributes$0(Serializer.this, protoFieldInfo, marshalerContext, (ExtendedAttributeKey) obj, obj2);
                    }
                });
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        serializer.writeEndRepeated();
    }

    static /* synthetic */ void lambda$serializeExtendedAttributes$0(Serializer serializer, ProtoFieldInfo protoFieldInfo, MarshalerContext marshalerContext, ExtendedAttributeKey extendedAttributeKey, Object obj) {
        try {
            serializer.writeStartRepeatedElement(protoFieldInfo, marshalerContext.getSize());
            INSTANCE.writeTo(serializer, (ExtendedAttributeKey<?>) extendedAttributeKey, obj, marshalerContext);
            serializer.writeEndRepeatedElement();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static int sizeExtendedAttributes(final ProtoFieldInfo protoFieldInfo, ExtendedAttributes extendedAttributes, final MarshalerContext marshalerContext) {
        if (extendedAttributes.isEmpty()) {
            return 0;
        }
        final int[] iArr = {0};
        extendedAttributes.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.otlp.ExtendedAttributeKeyValueStatelessMarshaler$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ExtendedAttributeKeyValueStatelessMarshaler.lambda$sizeExtendedAttributes$1(MarshalerContext.this, iArr, protoFieldInfo, (ExtendedAttributeKey) obj, obj2);
            }
        });
        return iArr[0];
    }

    static /* synthetic */ void lambda$sizeExtendedAttributes$1(MarshalerContext marshalerContext, int[] iArr, ProtoFieldInfo protoFieldInfo, ExtendedAttributeKey extendedAttributeKey, Object obj) {
        int addSize = marshalerContext.addSize();
        int binarySerializedSize = INSTANCE.getBinarySerializedSize((ExtendedAttributeKey<?>) extendedAttributeKey, obj, marshalerContext);
        marshalerContext.setSize(addSize, binarySerializedSize);
        iArr[0] = iArr[0] + protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + binarySerializedSize;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public void writeTo(Serializer serializer, ExtendedAttributeKey<?> extendedAttributeKey, Object obj, MarshalerContext marshalerContext) throws IOException {
        if (extendedAttributeKey.getKey().isEmpty()) {
            serializer.serializeString(KeyValue.KEY, EMPTY_BYTES);
        } else if (extendedAttributeKey instanceof InternalExtendedAttributeKeyImpl) {
            serializer.serializeString(KeyValue.KEY, ((InternalExtendedAttributeKeyImpl) extendedAttributeKey).getKeyUtf8());
        } else {
            serializer.serializeStringWithContext(KeyValue.KEY, extendedAttributeKey.getKey(), marshalerContext);
        }
        serializer.serializeMessageWithContext(KeyValue.VALUE, extendedAttributeKey, obj, ValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public int getBinarySerializedSize(ExtendedAttributeKey<?> extendedAttributeKey, Object obj, MarshalerContext marshalerContext) {
        int i;
        if (extendedAttributeKey.getKey().isEmpty()) {
            i = 0;
        } else if (extendedAttributeKey instanceof InternalExtendedAttributeKeyImpl) {
            i = MarshalerUtil.sizeBytes(KeyValue.KEY, ((InternalExtendedAttributeKeyImpl) extendedAttributeKey).getKeyUtf8());
        } else {
            return StatelessMarshalerUtil.sizeStringWithContext(KeyValue.KEY, extendedAttributeKey.getKey(), marshalerContext);
        }
        return i + StatelessMarshalerUtil.sizeMessageWithContext(KeyValue.VALUE, extendedAttributeKey, obj, ValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    private static class ValueStatelessMarshaler implements StatelessMarshaler2<ExtendedAttributeKey<?>, Object> {
        static final ValueStatelessMarshaler INSTANCE = new ValueStatelessMarshaler();

        private ValueStatelessMarshaler() {
        }

        @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
        public int getBinarySerializedSize(ExtendedAttributeKey<?> extendedAttributeKey, Object obj, MarshalerContext marshalerContext) {
            switch (AnonymousClass1.$SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[extendedAttributeKey.getType().ordinal()]) {
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
                    return StatelessMarshalerUtil.sizeMessageWithContext(AnyValue.ARRAY_VALUE, ((AttributeKey) Objects.requireNonNull(extendedAttributeKey.asAttributeKey())).getType(), (List) obj, AttributeArrayAnyValueStatelessMarshaler.INSTANCE, marshalerContext);
                case 9:
                    return StatelessMarshalerUtil.sizeMessageWithContext(AnyValue.KVLIST_VALUE, (ExtendedAttributes) obj, ExtendedAttributesKeyValueListStatelessMarshaler.INSTANCE, marshalerContext);
                default:
                    throw new IllegalArgumentException("Unsupported attribute type.");
            }
        }

        @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
        public void writeTo(Serializer serializer, ExtendedAttributeKey<?> extendedAttributeKey, Object obj, MarshalerContext marshalerContext) throws IOException {
            switch (AnonymousClass1.$SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[extendedAttributeKey.getType().ordinal()]) {
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
                    serializer.serializeMessageWithContext(AnyValue.ARRAY_VALUE, ((AttributeKey) Objects.requireNonNull(extendedAttributeKey.asAttributeKey())).getType(), (List) obj, AttributeArrayAnyValueStatelessMarshaler.INSTANCE, marshalerContext);
                    return;
                case 9:
                    serializer.serializeMessageWithContext(AnyValue.KVLIST_VALUE, (ExtendedAttributes) obj, ExtendedAttributesKeyValueListStatelessMarshaler.INSTANCE, marshalerContext);
                    return;
                default:
                    throw new IllegalArgumentException("Unsupported attribute type.");
            }
        }
    }

    /* renamed from: io.opentelemetry.exporter.internal.otlp.ExtendedAttributeKeyValueStatelessMarshaler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType;

        static {
            int[] iArr = new int[ExtendedAttributeType.values().length];
            $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType = iArr;
            try {
                iArr[ExtendedAttributeType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.STRING_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.LONG_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.BOOLEAN_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.DOUBLE_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.EXTENDED_ATTRIBUTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static class ExtendedAttributesKeyValueListStatelessMarshaler implements StatelessMarshaler<ExtendedAttributes> {
        private static final ExtendedAttributesKeyValueListStatelessMarshaler INSTANCE = new ExtendedAttributesKeyValueListStatelessMarshaler();

        private ExtendedAttributesKeyValueListStatelessMarshaler() {
        }

        @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
        public void writeTo(Serializer serializer, ExtendedAttributes extendedAttributes, MarshalerContext marshalerContext) throws IOException {
            ExtendedAttributeKeyValueStatelessMarshaler.serializeExtendedAttributes(serializer, KeyValueList.VALUES, extendedAttributes, marshalerContext);
        }

        @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
        public int getBinarySerializedSize(ExtendedAttributes extendedAttributes, MarshalerContext marshalerContext) {
            return ExtendedAttributeKeyValueStatelessMarshaler.sizeExtendedAttributes(KeyValueList.VALUES, extendedAttributes, marshalerContext);
        }
    }
}
