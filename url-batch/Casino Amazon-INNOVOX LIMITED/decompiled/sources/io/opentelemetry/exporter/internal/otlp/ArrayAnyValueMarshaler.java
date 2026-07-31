package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.Value;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import io.opentelemetry.proto.common.v1.internal.ArrayValue;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes3.dex */
final class ArrayAnyValueMarshaler extends MarshalerWithSize {
    private final Marshaler value;

    private ArrayAnyValueMarshaler(ArrayValueMarshaler arrayValueMarshaler) {
        super(calculateSize(arrayValueMarshaler));
        this.value = arrayValueMarshaler;
    }

    static MarshalerWithSize createAnyValue(List<Value<?>> list) {
        return createInternal(list, new Function() { // from class: io.opentelemetry.exporter.internal.otlp.ArrayAnyValueMarshaler$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AnyValueMarshaler.create((Value) obj);
            }
        });
    }

    static MarshalerWithSize createString(List<String> list) {
        return createInternal(list, new Function() { // from class: io.opentelemetry.exporter.internal.otlp.ArrayAnyValueMarshaler$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return StringAnyValueMarshaler.create((String) obj);
            }
        });
    }

    static MarshalerWithSize createBool(List<Boolean> list) {
        return createInternal(list, new Function() { // from class: io.opentelemetry.exporter.internal.otlp.ArrayAnyValueMarshaler$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BoolAnyValueMarshaler.create(((Boolean) obj).booleanValue());
            }
        });
    }

    static MarshalerWithSize createInt(List<Long> list) {
        return createInternal(list, new Function() { // from class: io.opentelemetry.exporter.internal.otlp.ArrayAnyValueMarshaler$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return IntAnyValueMarshaler.create(((Long) obj).longValue());
            }
        });
    }

    static MarshalerWithSize createDouble(List<Double> list) {
        return createInternal(list, new Function() { // from class: io.opentelemetry.exporter.internal.otlp.ArrayAnyValueMarshaler$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DoubleAnyValueMarshaler.create(((Double) obj).doubleValue());
            }
        });
    }

    private static <T, M extends MarshalerWithSize> MarshalerWithSize createInternal(List<T> list, Function<T, M> function) {
        int size = list.size();
        Marshaler[] marshalerArr = new Marshaler[size];
        for (int i = 0; i < size; i++) {
            marshalerArr[i] = function.apply(list.get(i));
        }
        return new ArrayAnyValueMarshaler(new ArrayValueMarshaler(marshalerArr));
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeMessage(AnyValue.ARRAY_VALUE, this.value);
    }

    private static int calculateSize(Marshaler marshaler) {
        return MarshalerUtil.sizeMessage(AnyValue.ARRAY_VALUE, marshaler);
    }

    private static class ArrayValueMarshaler extends MarshalerWithSize {
        private final Marshaler[] values;

        private ArrayValueMarshaler(Marshaler[] marshalerArr) {
            super(calculateSize(marshalerArr));
            this.values = marshalerArr;
        }

        @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
        public void writeTo(Serializer serializer) throws IOException {
            serializer.serializeRepeatedMessage(ArrayValue.VALUES, this.values);
        }

        private static int calculateSize(Marshaler[] marshalerArr) {
            return MarshalerUtil.sizeRepeatedMessage(ArrayValue.VALUES, marshalerArr);
        }
    }
}
