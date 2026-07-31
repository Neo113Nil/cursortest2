package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.common.ValueType;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class AnyValueMarshaler {
    private AnyValueMarshaler() {
    }

    /* renamed from: io.opentelemetry.exporter.internal.otlp.AnyValueMarshaler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$api$common$ValueType;

        static {
            int[] iArr = new int[ValueType.values().length];
            $SwitchMap$io$opentelemetry$api$common$ValueType = iArr;
            try {
                iArr[ValueType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$ValueType[ValueType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$ValueType[ValueType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$ValueType[ValueType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$ValueType[ValueType.ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$ValueType[ValueType.KEY_VALUE_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$ValueType[ValueType.BYTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static MarshalerWithSize create(Value<?> value) {
        switch (AnonymousClass1.$SwitchMap$io$opentelemetry$api$common$ValueType[value.getType().ordinal()]) {
            case 1:
                return StringAnyValueMarshaler.create((String) value.getValue());
            case 2:
                return BoolAnyValueMarshaler.create(((Boolean) value.getValue()).booleanValue());
            case 3:
                return IntAnyValueMarshaler.create(((Long) value.getValue()).longValue());
            case 4:
                return DoubleAnyValueMarshaler.create(((Double) value.getValue()).doubleValue());
            case 5:
                return ArrayAnyValueMarshaler.createAnyValue((List) value.getValue());
            case 6:
                return KeyValueListAnyValueMarshaler.create((List) value.getValue());
            case 7:
                return BytesAnyValueMarshaler.create((ByteBuffer) value.getValue());
            default:
                throw new IllegalArgumentException("Unsupported Value type: " + value.getType());
        }
    }
}
