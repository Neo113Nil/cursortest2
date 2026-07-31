package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.KeyValue;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class KeyValueMarshaler extends MarshalerWithSize {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final KeyValueMarshaler[] EMPTY_REPEATED = new KeyValueMarshaler[0];
    private final byte[] keyUtf8;
    private final Marshaler value;

    KeyValueMarshaler(byte[] bArr, Marshaler marshaler) {
        super(calculateSize(bArr, marshaler));
        this.keyUtf8 = bArr;
        this.value = marshaler;
    }

    public static KeyValueMarshaler createForKeyValue(KeyValue keyValue) {
        return new KeyValueMarshaler(keyValue.getKey().getBytes(StandardCharsets.UTF_8), AnyValueMarshaler.create(keyValue.getValue()));
    }

    public static KeyValueMarshaler[] createForAttributes(Attributes attributes) {
        if (attributes.isEmpty()) {
            return EMPTY_REPEATED;
        }
        final KeyValueMarshaler[] keyValueMarshalerArr = new KeyValueMarshaler[attributes.size()];
        attributes.forEach(new BiConsumer<AttributeKey<?>, Object>() { // from class: io.opentelemetry.exporter.internal.otlp.KeyValueMarshaler.1
            int index = 0;

            @Override // java.util.function.BiConsumer
            public void accept(AttributeKey<?> attributeKey, Object obj) {
                KeyValueMarshaler[] keyValueMarshalerArr2 = keyValueMarshalerArr;
                int i = this.index;
                this.index = i + 1;
                keyValueMarshalerArr2[i] = KeyValueMarshaler.create(attributeKey, obj);
            }
        });
        return keyValueMarshalerArr;
    }

    public static KeyValueMarshaler[] createRepeated(List<AttributeKeyValue<?>> list) {
        if (list.isEmpty()) {
            return EMPTY_REPEATED;
        }
        final KeyValueMarshaler[] keyValueMarshalerArr = new KeyValueMarshaler[list.size()];
        list.forEach(new Consumer() { // from class: io.opentelemetry.exporter.internal.otlp.KeyValueMarshaler$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                KeyValueMarshaler.lambda$createRepeated$0(keyValueMarshalerArr, (AttributeKeyValue) obj);
            }
        });
        return keyValueMarshalerArr;
    }

    static /* synthetic */ void lambda$createRepeated$0(final KeyValueMarshaler[] keyValueMarshalerArr, AttributeKeyValue attributeKeyValue) {
        new Consumer<AttributeKeyValue<?>>() { // from class: io.opentelemetry.exporter.internal.otlp.KeyValueMarshaler.2
            int index = 0;

            @Override // java.util.function.Consumer
            public void accept(AttributeKeyValue<?> attributeKeyValue2) {
                KeyValueMarshaler[] keyValueMarshalerArr2 = keyValueMarshalerArr;
                int i = this.index;
                this.index = i + 1;
                keyValueMarshalerArr2[i] = KeyValueMarshaler.create(attributeKeyValue2.getAttributeKey(), attributeKeyValue2.getValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyValueMarshaler create(AttributeKey<?> attributeKey, Object obj) {
        byte[] bytes;
        if (attributeKey.getKey().isEmpty()) {
            bytes = EMPTY_BYTES;
        } else if (attributeKey instanceof InternalAttributeKeyImpl) {
            bytes = ((InternalAttributeKeyImpl) attributeKey).getKeyUtf8();
        } else {
            bytes = attributeKey.getKey().getBytes(StandardCharsets.UTF_8);
        }
        switch (AnonymousClass3.$SwitchMap$io$opentelemetry$api$common$AttributeType[attributeKey.getType().ordinal()]) {
            case 1:
                return new KeyValueMarshaler(bytes, StringAnyValueMarshaler.create((String) obj));
            case 2:
                return new KeyValueMarshaler(bytes, IntAnyValueMarshaler.create(((Long) obj).longValue()));
            case 3:
                return new KeyValueMarshaler(bytes, BoolAnyValueMarshaler.create(((Boolean) obj).booleanValue()));
            case 4:
                return new KeyValueMarshaler(bytes, DoubleAnyValueMarshaler.create(((Double) obj).doubleValue()));
            case 5:
                return new KeyValueMarshaler(bytes, ArrayAnyValueMarshaler.createString((List) obj));
            case 6:
                return new KeyValueMarshaler(bytes, ArrayAnyValueMarshaler.createInt((List) obj));
            case 7:
                return new KeyValueMarshaler(bytes, ArrayAnyValueMarshaler.createBool((List) obj));
            case 8:
                return new KeyValueMarshaler(bytes, ArrayAnyValueMarshaler.createDouble((List) obj));
            default:
                throw new IllegalArgumentException("Unsupported attribute type.");
        }
    }

    /* renamed from: io.opentelemetry.exporter.internal.otlp.KeyValueMarshaler$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
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

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeString(io.opentelemetry.proto.common.v1.internal.KeyValue.KEY, this.keyUtf8);
        serializer.serializeMessage(io.opentelemetry.proto.common.v1.internal.KeyValue.VALUE, this.value);
    }

    private static int calculateSize(byte[] bArr, Marshaler marshaler) {
        return MarshalerUtil.sizeBytes(io.opentelemetry.proto.common.v1.internal.KeyValue.KEY, bArr) + MarshalerUtil.sizeMessage(io.opentelemetry.proto.common.v1.internal.KeyValue.VALUE, marshaler);
    }
}
