package io.opentelemetry.exporter.internal.marshal;

import io.opentelemetry.api.trace.SpanId;
import io.opentelemetry.api.trace.TraceId;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.internal.DynamicPrimitiveLongList;
import io.opentelemetry.sdk.resources.Resource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class MarshalerUtil {
    private static final byte[] EMPTY_BYTES;
    private static final boolean JSON_AVAILABLE;
    private static final int TRACE_ID_VALUE_SIZE = CodedOutputStream.computeLengthDelimitedFieldSize(TraceId.getLength() / 2);
    private static final int SPAN_ID_VALUE_SIZE = CodedOutputStream.computeLengthDelimitedFieldSize(SpanId.getLength() / 2);

    static {
        boolean z;
        try {
            Class.forName("com.fasterxml.jackson.core.JsonFactory");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        JSON_AVAILABLE = z;
        EMPTY_BYTES = new byte[0];
    }

    public static <T, U> Map<Resource, Map<InstrumentationScopeInfo, List<U>>> groupByResourceAndScope(Collection<T> collection, Function<T, Resource> function, Function<T, InstrumentationScopeInfo> function2, Function<T, U> function3) {
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        for (T t : collection) {
            ((List) ((Map) identityHashMap.computeIfAbsent(function.apply(t), new Function() { // from class: io.opentelemetry.exporter.internal.marshal.MarshalerUtil$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return MarshalerUtil.lambda$groupByResourceAndScope$0((Resource) obj);
                }
            })).computeIfAbsent(function2.apply(t), new Function() { // from class: io.opentelemetry.exporter.internal.marshal.MarshalerUtil$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return MarshalerUtil.lambda$groupByResourceAndScope$1((InstrumentationScopeInfo) obj);
                }
            })).add(function3.apply(t));
        }
        return identityHashMap;
    }

    static /* synthetic */ Map lambda$groupByResourceAndScope$0(Resource resource) {
        return new IdentityHashMap(8);
    }

    static /* synthetic */ List lambda$groupByResourceAndScope$1(InstrumentationScopeInfo instrumentationScopeInfo) {
        return new ArrayList();
    }

    public static String preserializeJsonFields(Marshaler marshaler) {
        if (!JSON_AVAILABLE) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            marshaler.writeJsonTo(byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), 1, r4.length - 2, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e);
        }
    }

    public static int sizeRepeatedFixed64(ProtoFieldInfo protoFieldInfo, List<Long> list) {
        return sizeRepeatedFixed64(protoFieldInfo, list.size());
    }

    private static int sizeRepeatedFixed64(ProtoFieldInfo protoFieldInfo, int i) {
        if (i == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeLengthDelimitedFieldSize(i * 8);
    }

    public static int sizeRepeatedString(ProtoFieldInfo protoFieldInfo, byte[][] bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += sizeBytes(protoFieldInfo, bArr2);
        }
        return i;
    }

    public static int sizeRepeatedUInt64(ProtoFieldInfo protoFieldInfo, long[] jArr) {
        if (jArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (long j : jArr) {
            i += CodedOutputStream.computeUInt64SizeNoTag(j);
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(i) + i;
    }

    public static int sizeRepeatedUInt64(ProtoFieldInfo protoFieldInfo, List<Long> list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            i += CodedOutputStream.computeUInt64SizeNoTag(it.next().longValue());
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(i) + i;
    }

    public static int sizeRepeatedUInt64(ProtoFieldInfo protoFieldInfo, DynamicPrimitiveLongList dynamicPrimitiveLongList) {
        if (dynamicPrimitiveLongList.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < dynamicPrimitiveLongList.size(); i2++) {
            i += CodedOutputStream.computeUInt64SizeNoTag(dynamicPrimitiveLongList.getLong(i2));
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(i) + i;
    }

    public static int sizeRepeatedInt64(ProtoFieldInfo protoFieldInfo, long[] jArr) {
        if (jArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (long j : jArr) {
            i += CodedOutputStream.computeInt64SizeNoTag(j);
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(i) + i;
    }

    public static int sizeRepeatedInt64(ProtoFieldInfo protoFieldInfo, List<Long> list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            i += CodedOutputStream.computeInt64SizeNoTag(it.next().longValue());
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(i) + i;
    }

    public static int sizeRepeatedInt32(ProtoFieldInfo protoFieldInfo, List<Integer> list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            i += CodedOutputStream.computeInt32SizeNoTag(it.next().intValue());
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(i) + i;
    }

    public static int sizeRepeatedDouble(ProtoFieldInfo protoFieldInfo, List<Double> list) {
        return sizeRepeatedFixed64(protoFieldInfo, list.size());
    }

    public static <T extends Marshaler> int sizeRepeatedMessage(ProtoFieldInfo protoFieldInfo, T[] tArr) {
        int tagSize = protoFieldInfo.getTagSize();
        int i = 0;
        for (T t : tArr) {
            int binarySerializedSize = t.getBinarySerializedSize();
            i += CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + tagSize + binarySerializedSize;
        }
        return i;
    }

    public static int sizeRepeatedMessage(ProtoFieldInfo protoFieldInfo, List<? extends Marshaler> list) {
        int tagSize = protoFieldInfo.getTagSize();
        Iterator<? extends Marshaler> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int binarySerializedSize = it.next().getBinarySerializedSize();
            i += CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + tagSize + binarySerializedSize;
        }
        return i;
    }

    public static int sizeMessage(ProtoFieldInfo protoFieldInfo, Marshaler marshaler) {
        int binarySerializedSize = marshaler.getBinarySerializedSize();
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + binarySerializedSize;
    }

    public static int sizeBool(ProtoFieldInfo protoFieldInfo, boolean z) {
        if (z) {
            return protoFieldInfo.getTagSize() + CodedOutputStream.computeBoolSizeNoTag(z);
        }
        return 0;
    }

    public static int sizeInt64(ProtoFieldInfo protoFieldInfo, long j) {
        if (j == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeInt64SizeNoTag(j);
    }

    public static int sizeUInt64(ProtoFieldInfo protoFieldInfo, long j) {
        if (j == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt64SizeNoTag(j);
    }

    public static int sizeUInt32(ProtoFieldInfo protoFieldInfo, int i) {
        if (i == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(i);
    }

    public static int sizeSInt32(ProtoFieldInfo protoFieldInfo, int i) {
        if (i == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeSInt32SizeNoTag(i);
    }

    public static int sizeInt32(ProtoFieldInfo protoFieldInfo, int i) {
        if (i == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeInt32SizeNoTag(i);
    }

    public static int sizeInt32Optional(ProtoFieldInfo protoFieldInfo, int i) {
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeInt32SizeNoTag(i);
    }

    public static int sizeInt32Optional(ProtoFieldInfo protoFieldInfo, @Nullable Integer num) {
        if (num == null) {
            return 0;
        }
        return sizeInt32Optional(protoFieldInfo, num.intValue());
    }

    public static int sizeDouble(ProtoFieldInfo protoFieldInfo, double d) {
        if (d == 0.0d) {
            return 0;
        }
        return sizeDoubleOptional(protoFieldInfo, d);
    }

    public static int sizeDoubleOptional(ProtoFieldInfo protoFieldInfo, double d) {
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeDoubleSizeNoTag(d);
    }

    public static int sizeFixed64(ProtoFieldInfo protoFieldInfo, long j) {
        if (j == 0) {
            return 0;
        }
        return sizeFixed64Optional(protoFieldInfo, j);
    }

    public static int sizeFixed64Optional(ProtoFieldInfo protoFieldInfo, long j) {
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeFixed64SizeNoTag(j);
    }

    public static int sizeByteAsFixed32(ProtoFieldInfo protoFieldInfo, byte b) {
        return sizeFixed32(protoFieldInfo, b & UByte.MAX_VALUE);
    }

    public static int sizeFixed32(ProtoFieldInfo protoFieldInfo, int i) {
        if (i == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeFixed32SizeNoTag(i);
    }

    public static int sizeBytes(ProtoFieldInfo protoFieldInfo, byte[] bArr) {
        if (bArr.length == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeByteArraySizeNoTag(bArr);
    }

    public static int sizeByteBuffer(ProtoFieldInfo protoFieldInfo, ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int sizeEnum(ProtoFieldInfo protoFieldInfo, ProtoEnumInfo protoEnumInfo) {
        int enumNumber = protoEnumInfo.getEnumNumber();
        if (enumNumber == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeEnumSizeNoTag(enumNumber);
    }

    public static int sizeTraceId(ProtoFieldInfo protoFieldInfo, @Nullable String str) {
        if (str == null) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + TRACE_ID_VALUE_SIZE;
    }

    public static int sizeSpanId(ProtoFieldInfo protoFieldInfo, @Nullable String str) {
        if (str == null) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + SPAN_ID_VALUE_SIZE;
    }

    public static byte[] toBytes(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return EMPTY_BYTES;
        }
        return str.getBytes(StandardCharsets.UTF_8);
    }

    private MarshalerUtil() {
    }
}
