package io.opentelemetry.exporter.internal.marshal;

import io.opentelemetry.api.internal.OtelEncodingUtils;
import io.opentelemetry.api.trace.SpanId;
import io.opentelemetry.api.trace.TraceId;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes3.dex */
final class ProtoSerializer extends Serializer implements AutoCloseable {
    private static final ThreadLocal<Map<String, byte[]>> THREAD_LOCAL_ID_CACHE = new ThreadLocal<>();
    private final Map<String, byte[]> idCache = getIdCache();
    private final CodedOutputStream output;

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeEndMessage() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeEndRepeated() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeEndRepeatedPrimitive() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeEndRepeatedVarint() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeStartRepeated(ProtoFieldInfo protoFieldInfo) {
    }

    ProtoSerializer(OutputStream outputStream) {
        this.output = CodedOutputStream.newInstance(outputStream);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeTraceId(ProtoFieldInfo protoFieldInfo, String str) throws IOException {
        writeBytes(protoFieldInfo, this.idCache.computeIfAbsent(str, new Function() { // from class: io.opentelemetry.exporter.internal.marshal.ProtoSerializer$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                byte[] bytesFromBase16;
                bytesFromBase16 = OtelEncodingUtils.bytesFromBase16((String) obj, TraceId.getLength());
                return bytesFromBase16;
            }
        }));
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeTraceId(ProtoFieldInfo protoFieldInfo, String str, MarshalerContext marshalerContext) throws IOException {
        byte[] bArr = this.idCache.get(str);
        if (bArr == null) {
            bArr = marshalerContext.getTraceIdBuffer();
            OtelEncodingUtils.bytesFromBase16(str, TraceId.getLength(), bArr);
            this.idCache.put(str, bArr);
        }
        writeBytes(protoFieldInfo, bArr);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeSpanId(ProtoFieldInfo protoFieldInfo, String str) throws IOException {
        writeBytes(protoFieldInfo, this.idCache.computeIfAbsent(str, new Function() { // from class: io.opentelemetry.exporter.internal.marshal.ProtoSerializer$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                byte[] bytesFromBase16;
                bytesFromBase16 = OtelEncodingUtils.bytesFromBase16((String) obj, SpanId.getLength());
                return bytesFromBase16;
            }
        }));
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeSpanId(ProtoFieldInfo protoFieldInfo, String str, MarshalerContext marshalerContext) throws IOException {
        byte[] bArr = this.idCache.get(str);
        if (bArr == null) {
            bArr = marshalerContext.getSpanIdBuffer();
            OtelEncodingUtils.bytesFromBase16(str, SpanId.getLength(), bArr);
            this.idCache.put(str, bArr);
        }
        writeBytes(protoFieldInfo, bArr);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeBool(ProtoFieldInfo protoFieldInfo, boolean z) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeBoolNoTag(z);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeEnum(ProtoFieldInfo protoFieldInfo, ProtoEnumInfo protoEnumInfo) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeEnumNoTag(protoEnumInfo.getEnumNumber());
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeUint32(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeUInt32NoTag(i);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeSInt32(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeSInt32NoTag(i);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeint32(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeInt32NoTag(i);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeInt64(ProtoFieldInfo protoFieldInfo, long j) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeInt64NoTag(j);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeUInt64(ProtoFieldInfo protoFieldInfo, long j) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeUInt64NoTag(j);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeFixed64(ProtoFieldInfo protoFieldInfo, long j) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeFixed64NoTag(j);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeFixed64Value(long j) throws IOException {
        this.output.writeFixed64NoTag(j);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeUInt64Value(long j) throws IOException {
        this.output.writeUInt64NoTag(j);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeFixed32(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeFixed32NoTag(i);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeDouble(ProtoFieldInfo protoFieldInfo, double d) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeDoubleNoTag(d);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeDoubleValue(double d) throws IOException {
        this.output.writeDoubleNoTag(d);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeString(ProtoFieldInfo protoFieldInfo, byte[] bArr) throws IOException {
        writeBytes(protoFieldInfo, bArr);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeString(ProtoFieldInfo protoFieldInfo, String str, int i, MarshalerContext marshalerContext) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeUInt32NoTag(i);
        StatelessMarshalerUtil.writeUtf8(this.output, str, i, marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeRepeatedString(ProtoFieldInfo protoFieldInfo, byte[][] bArr) throws IOException {
        for (byte[] bArr2 : bArr) {
            writeString(protoFieldInfo, bArr2);
        }
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeBytes(ProtoFieldInfo protoFieldInfo, byte[] bArr) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeByteArrayNoTag(bArr);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeByteBuffer(ProtoFieldInfo protoFieldInfo, ByteBuffer byteBuffer) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeByteBufferNoTag(byteBuffer);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeStartMessage(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeUInt32NoTag(i);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeStartRepeatedPrimitive(ProtoFieldInfo protoFieldInfo, int i, int i2) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeUInt32NoTag(i * i2);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    protected void writeStartRepeatedVarint(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        this.output.writeUInt32NoTag(protoFieldInfo.getTag());
        this.output.writeUInt32NoTag(i);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void serializeRepeatedMessage(ProtoFieldInfo protoFieldInfo, Marshaler[] marshalerArr) throws IOException {
        for (Marshaler marshaler : marshalerArr) {
            serializeMessage(protoFieldInfo, marshaler);
        }
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void serializeRepeatedMessage(ProtoFieldInfo protoFieldInfo, List<? extends Marshaler> list) throws IOException {
        Iterator<? extends Marshaler> it = list.iterator();
        while (it.hasNext()) {
            serializeMessage(protoFieldInfo, it.next());
        }
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public <T> void serializeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, List<? extends T> list, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            writeStartMessage(protoFieldInfo, marshalerContext.getSize());
            statelessMarshaler.writeTo(this, t, marshalerContext);
            writeEndMessage();
        }
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeStartRepeatedElement(ProtoFieldInfo protoFieldInfo, int i) throws IOException {
        writeStartMessage(protoFieldInfo, i);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeEndRepeatedElement() {
        writeEndMessage();
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer
    public void writeSerializedMessage(byte[] bArr, String str) throws IOException {
        this.output.writeRawBytes(bArr);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Serializer, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.output.flush();
            this.idCache.clear();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    private static Map<String, byte[]> getIdCache() {
        ThreadLocal<Map<String, byte[]>> threadLocal = THREAD_LOCAL_ID_CACHE;
        Map<String, byte[]> map = threadLocal.get();
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        threadLocal.set(hashMap);
        return hashMap;
    }
}
