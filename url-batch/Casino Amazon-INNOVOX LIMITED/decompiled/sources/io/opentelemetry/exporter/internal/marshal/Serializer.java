package io.opentelemetry.exporter.internal.marshal;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.sdk.internal.DynamicPrimitiveLongList;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import kotlin.UByte;

/* loaded from: classes3.dex */
public abstract class Serializer implements AutoCloseable {
    private static final MarshalerContext.Key ATTRIBUTES_WRITER_KEY = MarshalerContext.key();

    @Override // java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract void serializeRepeatedMessage(ProtoFieldInfo protoFieldInfo, List<? extends Marshaler> list) throws IOException;

    public abstract void serializeRepeatedMessage(ProtoFieldInfo protoFieldInfo, Marshaler[] marshalerArr) throws IOException;

    public abstract <T> void serializeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, List<? extends T> list, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext) throws IOException;

    public abstract void writeBool(ProtoFieldInfo protoFieldInfo, boolean z) throws IOException;

    public abstract void writeByteBuffer(ProtoFieldInfo protoFieldInfo, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(ProtoFieldInfo protoFieldInfo, byte[] bArr) throws IOException;

    public abstract void writeDouble(ProtoFieldInfo protoFieldInfo, double d) throws IOException;

    protected abstract void writeDoubleValue(double d) throws IOException;

    protected abstract void writeEndMessage() throws IOException;

    public abstract void writeEndRepeated() throws IOException;

    public abstract void writeEndRepeatedElement() throws IOException;

    protected abstract void writeEndRepeatedPrimitive() throws IOException;

    protected abstract void writeEndRepeatedVarint() throws IOException;

    protected abstract void writeEnum(ProtoFieldInfo protoFieldInfo, ProtoEnumInfo protoEnumInfo) throws IOException;

    protected abstract void writeFixed32(ProtoFieldInfo protoFieldInfo, int i) throws IOException;

    protected abstract void writeFixed64(ProtoFieldInfo protoFieldInfo, long j) throws IOException;

    protected abstract void writeFixed64Value(long j) throws IOException;

    public abstract void writeInt64(ProtoFieldInfo protoFieldInfo, long j) throws IOException;

    public abstract void writeRepeatedString(ProtoFieldInfo protoFieldInfo, byte[][] bArr) throws IOException;

    protected abstract void writeSInt32(ProtoFieldInfo protoFieldInfo, int i) throws IOException;

    public abstract void writeSerializedMessage(byte[] bArr, String str) throws IOException;

    protected abstract void writeSpanId(ProtoFieldInfo protoFieldInfo, String str) throws IOException;

    protected abstract void writeStartMessage(ProtoFieldInfo protoFieldInfo, int i) throws IOException;

    public abstract void writeStartRepeated(ProtoFieldInfo protoFieldInfo) throws IOException;

    public abstract void writeStartRepeatedElement(ProtoFieldInfo protoFieldInfo, int i) throws IOException;

    protected abstract void writeStartRepeatedPrimitive(ProtoFieldInfo protoFieldInfo, int i, int i2) throws IOException;

    protected abstract void writeStartRepeatedVarint(ProtoFieldInfo protoFieldInfo, int i) throws IOException;

    public abstract void writeString(ProtoFieldInfo protoFieldInfo, String str, int i, MarshalerContext marshalerContext) throws IOException;

    public abstract void writeString(ProtoFieldInfo protoFieldInfo, byte[] bArr) throws IOException;

    protected abstract void writeTraceId(ProtoFieldInfo protoFieldInfo, String str) throws IOException;

    public abstract void writeUInt64(ProtoFieldInfo protoFieldInfo, long j) throws IOException;

    protected abstract void writeUInt64Value(long j) throws IOException;

    protected abstract void writeUint32(ProtoFieldInfo protoFieldInfo, int i) throws IOException;

    protected abstract void writeint32(ProtoFieldInfo protoFieldInfo, int i) throws IOException;

    Serializer() {
    }

    public void serializeTraceId(ProtoFieldInfo protoFieldInfo, @Nullable String str) throws IOException {
        if (str == null) {
            return;
        }
        writeTraceId(protoFieldInfo, str);
    }

    public void serializeTraceId(ProtoFieldInfo protoFieldInfo, @Nullable String str, MarshalerContext marshalerContext) throws IOException {
        if (str == null) {
            return;
        }
        writeTraceId(protoFieldInfo, str, marshalerContext);
    }

    protected void writeTraceId(ProtoFieldInfo protoFieldInfo, String str, MarshalerContext marshalerContext) throws IOException {
        writeTraceId(protoFieldInfo, str);
    }

    public void serializeSpanId(ProtoFieldInfo protoFieldInfo, @Nullable String str) throws IOException {
        if (str == null) {
            return;
        }
        writeSpanId(protoFieldInfo, str);
    }

    public void serializeSpanId(ProtoFieldInfo protoFieldInfo, @Nullable String str, MarshalerContext marshalerContext) throws IOException {
        if (str == null) {
            return;
        }
        writeSpanId(protoFieldInfo, str, marshalerContext);
    }

    protected void writeSpanId(ProtoFieldInfo protoFieldInfo, String str, MarshalerContext marshalerContext) throws IOException {
        writeSpanId(protoFieldInfo, str);
    }

    public void serializeBool(ProtoFieldInfo protoFieldInfo, boolean z) throws IOException {
        if (z) {
            writeBool(protoFieldInfo, z);
        }
    }

    public void serializeEnum(ProtoFieldInfo protoFieldInfo, ProtoEnumInfo protoEnumInfo) throws IOException {
        if (protoEnumInfo.getEnumNumber() == 0) {
            return;
        }
        writeEnum(protoFieldInfo, protoEnumInfo);
    }

    public void serializeUInt32(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        if (i == 0) {
            return;
        }
        writeUint32(protoFieldInfo, i);
    }

    public void serializeSInt32(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        if (i == 0) {
            return;
        }
        writeSInt32(protoFieldInfo, i);
    }

    public void serializeInt32(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        if (i == 0) {
            return;
        }
        writeint32(protoFieldInfo, i);
    }

    public void serializeInt32Optional(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        writeint32(protoFieldInfo, i);
    }

    public void serializeInt32Optional(ProtoFieldInfo protoFieldInfo, @Nullable Integer num) throws IOException {
        if (num != null) {
            serializeInt32Optional(protoFieldInfo, num.intValue());
        }
    }

    public void serializeInt64(ProtoFieldInfo protoFieldInfo, long j) throws IOException {
        if (j == 0) {
            return;
        }
        writeInt64(protoFieldInfo, j);
    }

    public void serializeUInt64(ProtoFieldInfo protoFieldInfo, long j) throws IOException {
        if (j == 0) {
            return;
        }
        writeUInt64(protoFieldInfo, j);
    }

    public void serializeFixed64(ProtoFieldInfo protoFieldInfo, long j) throws IOException {
        if (j == 0) {
            return;
        }
        writeFixed64(protoFieldInfo, j);
    }

    public void serializeFixed64Optional(ProtoFieldInfo protoFieldInfo, long j) throws IOException {
        writeFixed64(protoFieldInfo, j);
    }

    public void serializeByteAsFixed32(ProtoFieldInfo protoFieldInfo, byte b) throws IOException {
        serializeFixed32(protoFieldInfo, b & UByte.MAX_VALUE);
    }

    public void serializeFixed32(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        if (i == 0) {
            return;
        }
        writeFixed32(protoFieldInfo, i);
    }

    public void serializeDouble(ProtoFieldInfo protoFieldInfo, double d) throws IOException {
        if (d == 0.0d) {
            return;
        }
        writeDouble(protoFieldInfo, d);
    }

    public void serializeDoubleOptional(ProtoFieldInfo protoFieldInfo, double d) throws IOException {
        writeDouble(protoFieldInfo, d);
    }

    public void serializeString(ProtoFieldInfo protoFieldInfo, byte[] bArr) throws IOException {
        if (bArr.length == 0) {
            return;
        }
        writeString(protoFieldInfo, bArr);
    }

    public void serializeRepeatedString(ProtoFieldInfo protoFieldInfo, byte[][] bArr) throws IOException {
        if (bArr.length == 0) {
            return;
        }
        writeRepeatedString(protoFieldInfo, bArr);
    }

    public void serializeStringWithContext(ProtoFieldInfo protoFieldInfo, @Nullable String str, MarshalerContext marshalerContext) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (marshalerContext.marshalStringNoAllocation()) {
            writeString(protoFieldInfo, str, marshalerContext.getSize(), marshalerContext);
        } else {
            writeString(protoFieldInfo, (byte[]) marshalerContext.getData(byte[].class));
        }
    }

    public void serializeBytes(ProtoFieldInfo protoFieldInfo, byte[] bArr) throws IOException {
        if (bArr.length == 0) {
            return;
        }
        writeBytes(protoFieldInfo, bArr);
    }

    public void serializeByteBuffer(ProtoFieldInfo protoFieldInfo, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.capacity() == 0) {
            return;
        }
        writeByteBuffer(protoFieldInfo, byteBuffer);
    }

    public void serializeMessage(ProtoFieldInfo protoFieldInfo, Marshaler marshaler) throws IOException {
        writeStartMessage(protoFieldInfo, marshaler.getBinarySerializedSize());
        marshaler.writeTo(this);
        writeEndMessage();
    }

    public <T> void serializeMessageWithContext(ProtoFieldInfo protoFieldInfo, T t, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext) throws IOException {
        writeStartMessage(protoFieldInfo, marshalerContext.getSize());
        statelessMarshaler.writeTo(this, t, marshalerContext);
        writeEndMessage();
    }

    public <K, V> void serializeMessageWithContext(ProtoFieldInfo protoFieldInfo, K k, V v, StatelessMarshaler2<K, V> statelessMarshaler2, MarshalerContext marshalerContext) throws IOException {
        writeStartMessage(protoFieldInfo, marshalerContext.getSize());
        statelessMarshaler2.writeTo(this, k, v, marshalerContext);
        writeEndMessage();
    }

    public void serializeRepeatedInt32(ProtoFieldInfo protoFieldInfo, List<Integer> list) throws IOException {
        if (list.isEmpty()) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += CodedOutputStream.computeInt32SizeNoTag(it.next().intValue());
        }
        writeStartRepeatedVarint(protoFieldInfo, i);
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            writeUInt64Value(it2.next().intValue());
        }
        writeEndRepeatedVarint();
    }

    public void serializeRepeatedFixed64(ProtoFieldInfo protoFieldInfo, List<Long> list) throws IOException {
        if (list.isEmpty()) {
            return;
        }
        writeStartRepeatedPrimitive(protoFieldInfo, 8, list.size());
        for (int i = 0; i < list.size(); i++) {
            writeFixed64Value(list.get(i).longValue());
        }
        writeEndRepeatedPrimitive();
    }

    public void serializeRepeatedFixed64(ProtoFieldInfo protoFieldInfo, long[] jArr) throws IOException {
        if (jArr.length == 0) {
            return;
        }
        writeStartRepeatedPrimitive(protoFieldInfo, 8, jArr.length);
        for (long j : jArr) {
            writeFixed64Value(j);
        }
        writeEndRepeatedPrimitive();
    }

    public void serializeRepeatedUInt64(ProtoFieldInfo protoFieldInfo, long[] jArr) throws IOException {
        if (jArr.length == 0) {
            return;
        }
        int i = 0;
        for (long j : jArr) {
            i += CodedOutputStream.computeUInt64SizeNoTag(j);
        }
        writeStartRepeatedVarint(protoFieldInfo, i);
        for (long j2 : jArr) {
            writeUInt64Value(j2);
        }
        writeEndRepeatedVarint();
    }

    public void serializeRepeatedUInt64(ProtoFieldInfo protoFieldInfo, List<Long> list) throws IOException {
        if (list.isEmpty()) {
            return;
        }
        Iterator<Long> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += CodedOutputStream.computeUInt64SizeNoTag(it.next().longValue());
        }
        writeStartRepeatedVarint(protoFieldInfo, i);
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            writeUInt64Value(it2.next().longValue());
        }
        writeEndRepeatedVarint();
    }

    public void serializeRepeatedUInt64(ProtoFieldInfo protoFieldInfo, DynamicPrimitiveLongList dynamicPrimitiveLongList) throws IOException {
        if (dynamicPrimitiveLongList.isEmpty()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < dynamicPrimitiveLongList.size(); i2++) {
            i += CodedOutputStream.computeUInt64SizeNoTag(dynamicPrimitiveLongList.getLong(i2));
        }
        writeStartRepeatedVarint(protoFieldInfo, i);
        for (int i3 = 0; i3 < dynamicPrimitiveLongList.size(); i3++) {
            writeUInt64Value(dynamicPrimitiveLongList.getLong(i3));
        }
        writeEndRepeatedVarint();
    }

    public void serializeRepeatedInt64(ProtoFieldInfo protoFieldInfo, List<Long> list) throws IOException {
        if (list.isEmpty()) {
            return;
        }
        Iterator<Long> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += CodedOutputStream.computeInt64SizeNoTag(it.next().longValue());
        }
        writeStartRepeatedVarint(protoFieldInfo, i);
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            writeUInt64Value(it2.next().longValue());
        }
        writeEndRepeatedVarint();
    }

    public void serializeRepeatedDouble(ProtoFieldInfo protoFieldInfo, List<Double> list) throws IOException {
        if (list.isEmpty()) {
            return;
        }
        writeStartRepeatedPrimitive(protoFieldInfo, 8, list.size());
        for (int i = 0; i < list.size(); i++) {
            writeDoubleValue(list.get(i).doubleValue());
        }
        writeEndRepeatedPrimitive();
    }

    public <T> void serializeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, Collection<? extends T> collection, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext, MarshalerContext.Key key) throws IOException {
        if (collection instanceof List) {
            serializeRepeatedMessageWithContext(protoFieldInfo, (List) collection, statelessMarshaler, marshalerContext);
            return;
        }
        writeStartRepeated(protoFieldInfo);
        if (!collection.isEmpty()) {
            RepeatedElementWriter repeatedElementWriter = (RepeatedElementWriter) marshalerContext.getInstance(key, new Supplier() { // from class: io.opentelemetry.exporter.internal.marshal.Serializer$$ExternalSyntheticLambda1
                @Override // java.util.function.Supplier
                public final Object get() {
                    return Serializer.lambda$serializeRepeatedMessageWithContext$0();
                }
            });
            repeatedElementWriter.initialize(protoFieldInfo, this, statelessMarshaler, marshalerContext);
            try {
                collection.forEach(repeatedElementWriter);
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        writeEndRepeated();
    }

    static /* synthetic */ RepeatedElementWriter lambda$serializeRepeatedMessageWithContext$0() {
        return new RepeatedElementWriter();
    }

    public <K, V> void serializeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, Map<K, V> map, StatelessMarshaler2<K, V> statelessMarshaler2, MarshalerContext marshalerContext, MarshalerContext.Key key) throws IOException {
        writeStartRepeated(protoFieldInfo);
        if (!map.isEmpty()) {
            RepeatedElementPairWriter repeatedElementPairWriter = (RepeatedElementPairWriter) marshalerContext.getInstance(key, new Supplier() { // from class: io.opentelemetry.exporter.internal.marshal.Serializer$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return Serializer.lambda$serializeRepeatedMessageWithContext$1();
                }
            });
            repeatedElementPairWriter.initialize(protoFieldInfo, this, statelessMarshaler2, marshalerContext);
            try {
                map.forEach(repeatedElementPairWriter);
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        writeEndRepeated();
    }

    static /* synthetic */ RepeatedElementPairWriter lambda$serializeRepeatedMessageWithContext$1() {
        return new RepeatedElementPairWriter();
    }

    public void serializeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, Attributes attributes, StatelessMarshaler2<AttributeKey<?>, Object> statelessMarshaler2, MarshalerContext marshalerContext) throws IOException {
        writeStartRepeated(protoFieldInfo);
        if (!attributes.isEmpty()) {
            RepeatedElementPairWriter repeatedElementPairWriter = (RepeatedElementPairWriter) marshalerContext.getInstance(ATTRIBUTES_WRITER_KEY, new Supplier() { // from class: io.opentelemetry.exporter.internal.marshal.Serializer$$ExternalSyntheticLambda2
                @Override // java.util.function.Supplier
                public final Object get() {
                    return Serializer.lambda$serializeRepeatedMessageWithContext$2();
                }
            });
            repeatedElementPairWriter.initialize(protoFieldInfo, this, statelessMarshaler2, marshalerContext);
            try {
                attributes.forEach(repeatedElementPairWriter);
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        writeEndRepeated();
    }

    static /* synthetic */ RepeatedElementPairWriter lambda$serializeRepeatedMessageWithContext$2() {
        return new RepeatedElementPairWriter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class RepeatedElementWriter<T> implements Consumer<T> {
        private MarshalerContext context;
        private ProtoFieldInfo field;
        private StatelessMarshaler<T> marshaler;
        private Serializer output;

        private RepeatedElementWriter() {
        }

        void initialize(ProtoFieldInfo protoFieldInfo, Serializer serializer, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext) {
            this.field = protoFieldInfo;
            this.output = serializer;
            this.marshaler = statelessMarshaler;
            this.context = marshalerContext;
        }

        @Override // java.util.function.Consumer
        public void accept(T t) {
            try {
                this.output.writeStartRepeatedElement(this.field, this.context.getSize());
                this.marshaler.writeTo(this.output, t, this.context);
                this.output.writeEndRepeatedElement();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class RepeatedElementPairWriter<K, V> implements BiConsumer<K, V> {
        private MarshalerContext context;
        private ProtoFieldInfo field;
        private StatelessMarshaler2<K, V> marshaler;
        private Serializer output;

        private RepeatedElementPairWriter() {
        }

        void initialize(ProtoFieldInfo protoFieldInfo, Serializer serializer, StatelessMarshaler2<K, V> statelessMarshaler2, MarshalerContext marshalerContext) {
            this.field = protoFieldInfo;
            this.output = serializer;
            this.marshaler = statelessMarshaler2;
            this.context = marshalerContext;
        }

        @Override // java.util.function.BiConsumer
        public void accept(K k, V v) {
            try {
                this.output.writeStartRepeatedElement(this.field, this.context.getSize());
                this.marshaler.writeTo(this.output, k, v, this.context);
                this.output.writeEndRepeatedElement();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }
}
