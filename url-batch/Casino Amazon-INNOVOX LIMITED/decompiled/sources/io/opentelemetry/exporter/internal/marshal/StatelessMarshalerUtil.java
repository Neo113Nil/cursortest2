package io.opentelemetry.exporter.internal.marshal;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.resources.Resource;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class StatelessMarshalerUtil {
    private static final int MAX_INNER_LOOP_SIZE = 2040;
    private static final long MOST_SIGNIFICANT_BIT_MASK = -9187201950435737472L;
    private static final MarshalerContext.Key GROUPER_KEY = MarshalerContext.key();
    private static final MarshalerContext.Key ATTRIBUTES_SIZE_CALCULATOR_KEY = MarshalerContext.key();

    public static <T> Map<Resource, Map<InstrumentationScopeInfo, List<T>>> groupByResourceAndScope(Collection<T> collection, Function<T, Resource> function, Function<T, InstrumentationScopeInfo> function2, MarshalerContext marshalerContext) {
        Map<Resource, Map<InstrumentationScopeInfo, List<T>>> identityMap = marshalerContext.getIdentityMap();
        Grouper grouper = (Grouper) marshalerContext.getInstance(GROUPER_KEY, new Supplier() { // from class: io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil$$ExternalSyntheticLambda2
            @Override // java.util.function.Supplier
            public final Object get() {
                return StatelessMarshalerUtil.lambda$groupByResourceAndScope$0();
            }
        });
        grouper.initialize(identityMap, function, function2, marshalerContext);
        collection.forEach(grouper);
        return identityMap;
    }

    static /* synthetic */ Grouper lambda$groupByResourceAndScope$0() {
        return new Grouper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Grouper<T> implements Consumer<T> {
        private MarshalerContext context;
        private Function<T, InstrumentationScopeInfo> getInstrumentationScope;
        private Function<T, Resource> getResource;
        private Map<Resource, Map<InstrumentationScopeInfo, List<T>>> result;

        private Grouper() {
        }

        void initialize(Map<Resource, Map<InstrumentationScopeInfo, List<T>>> map, Function<T, Resource> function, Function<T, InstrumentationScopeInfo> function2, MarshalerContext marshalerContext) {
            this.result = map;
            this.getResource = function;
            this.getInstrumentationScope = function2;
            this.context = marshalerContext;
        }

        @Override // java.util.function.Consumer
        public void accept(T t) {
            Resource apply = this.getResource.apply(t);
            Map<InstrumentationScopeInfo, List<T>> map = this.result.get(apply);
            if (map == null) {
                map = this.context.getIdentityMap();
                this.result.put(apply, map);
            }
            InstrumentationScopeInfo apply2 = this.getInstrumentationScope.apply(t);
            List<T> list = map.get(apply2);
            if (list == null) {
                list = this.context.getList();
                map.put(apply2, list);
            }
            list.add(t);
        }
    }

    public static int sizeStringWithContext(ProtoFieldInfo protoFieldInfo, @Nullable String str, MarshalerContext marshalerContext) {
        if (str == null || str.isEmpty()) {
            return sizeBytes(protoFieldInfo, 0);
        }
        if (marshalerContext.marshalStringNoAllocation()) {
            int utf8Size = getUtf8Size(str, marshalerContext);
            marshalerContext.addSize(utf8Size);
            return sizeBytes(protoFieldInfo, utf8Size);
        }
        byte[] bytes = MarshalerUtil.toBytes(str);
        marshalerContext.addData(bytes);
        return sizeBytes(protoFieldInfo, bytes.length);
    }

    private static int sizeBytes(ProtoFieldInfo protoFieldInfo, int i) {
        if (i == 0) {
            return 0;
        }
        return protoFieldInfo.getTagSize() + CodedOutputStream.computeLengthDelimitedFieldSize(i);
    }

    public static <T> int sizeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, List<? extends T> list, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext) {
        if (list.isEmpty()) {
            return 0;
        }
        int tagSize = protoFieldInfo.getTagSize();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int addSize = marshalerContext.addSize();
            int binarySerializedSize = statelessMarshaler.getBinarySerializedSize(t, marshalerContext);
            marshalerContext.setSize(addSize, binarySerializedSize);
            i += CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + tagSize + binarySerializedSize;
        }
        return i;
    }

    public static <T> int sizeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, Collection<? extends T> collection, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext, MarshalerContext.Key key) {
        if (collection instanceof List) {
            return sizeRepeatedMessageWithContext(protoFieldInfo, (List) collection, statelessMarshaler, marshalerContext);
        }
        if (collection.isEmpty()) {
            return 0;
        }
        RepeatedElementSizeCalculator repeatedElementSizeCalculator = (RepeatedElementSizeCalculator) marshalerContext.getInstance(key, new Supplier() { // from class: io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return StatelessMarshalerUtil.lambda$sizeRepeatedMessageWithContext$1();
            }
        });
        repeatedElementSizeCalculator.initialize(protoFieldInfo, statelessMarshaler, marshalerContext);
        collection.forEach(repeatedElementSizeCalculator);
        return repeatedElementSizeCalculator.size;
    }

    static /* synthetic */ RepeatedElementSizeCalculator lambda$sizeRepeatedMessageWithContext$1() {
        return new RepeatedElementSizeCalculator();
    }

    public static <K, V> int sizeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, Map<K, V> map, StatelessMarshaler2<K, V> statelessMarshaler2, MarshalerContext marshalerContext, MarshalerContext.Key key) {
        if (map.isEmpty()) {
            return 0;
        }
        RepeatedElementPairSizeCalculator repeatedElementPairSizeCalculator = (RepeatedElementPairSizeCalculator) marshalerContext.getInstance(key, new Supplier() { // from class: io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return StatelessMarshalerUtil.lambda$sizeRepeatedMessageWithContext$2();
            }
        });
        repeatedElementPairSizeCalculator.initialize(protoFieldInfo, statelessMarshaler2, marshalerContext);
        map.forEach(repeatedElementPairSizeCalculator);
        return repeatedElementPairSizeCalculator.size;
    }

    static /* synthetic */ RepeatedElementPairSizeCalculator lambda$sizeRepeatedMessageWithContext$2() {
        return new RepeatedElementPairSizeCalculator();
    }

    public static int sizeRepeatedMessageWithContext(ProtoFieldInfo protoFieldInfo, Attributes attributes, StatelessMarshaler2<AttributeKey<?>, Object> statelessMarshaler2, MarshalerContext marshalerContext) {
        if (attributes.isEmpty()) {
            return 0;
        }
        RepeatedElementPairSizeCalculator repeatedElementPairSizeCalculator = (RepeatedElementPairSizeCalculator) marshalerContext.getInstance(ATTRIBUTES_SIZE_CALCULATOR_KEY, new Supplier() { // from class: io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return StatelessMarshalerUtil.lambda$sizeRepeatedMessageWithContext$3();
            }
        });
        repeatedElementPairSizeCalculator.initialize(protoFieldInfo, statelessMarshaler2, marshalerContext);
        attributes.forEach(repeatedElementPairSizeCalculator);
        return repeatedElementPairSizeCalculator.size;
    }

    static /* synthetic */ RepeatedElementPairSizeCalculator lambda$sizeRepeatedMessageWithContext$3() {
        return new RepeatedElementPairSizeCalculator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class RepeatedElementSizeCalculator<T> implements Consumer<T> {
        private MarshalerContext context;
        private int fieldTagSize;
        private StatelessMarshaler<T> marshaler;
        private int size;

        private RepeatedElementSizeCalculator() {
        }

        void initialize(ProtoFieldInfo protoFieldInfo, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext) {
            this.size = 0;
            this.fieldTagSize = protoFieldInfo.getTagSize();
            this.marshaler = statelessMarshaler;
            this.context = marshalerContext;
        }

        @Override // java.util.function.Consumer
        public void accept(T t) {
            int addSize = this.context.addSize();
            int binarySerializedSize = this.marshaler.getBinarySerializedSize(t, this.context);
            this.context.setSize(addSize, binarySerializedSize);
            this.size += this.fieldTagSize + CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + binarySerializedSize;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class RepeatedElementPairSizeCalculator<K, V> implements BiConsumer<K, V> {
        private MarshalerContext context;
        private int fieldTagSize;
        private StatelessMarshaler2<K, V> marshaler;
        private int size;

        private RepeatedElementPairSizeCalculator() {
        }

        void initialize(ProtoFieldInfo protoFieldInfo, StatelessMarshaler2<K, V> statelessMarshaler2, MarshalerContext marshalerContext) {
            this.size = 0;
            this.fieldTagSize = protoFieldInfo.getTagSize();
            this.marshaler = statelessMarshaler2;
            this.context = marshalerContext;
        }

        @Override // java.util.function.BiConsumer
        public void accept(K k, V v) {
            int addSize = this.context.addSize();
            int binarySerializedSize = this.marshaler.getBinarySerializedSize(k, v, this.context);
            this.context.setSize(addSize, binarySerializedSize);
            this.size += this.fieldTagSize + CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + binarySerializedSize;
        }
    }

    public static <T> int sizeMessageWithContext(ProtoFieldInfo protoFieldInfo, T t, StatelessMarshaler<T> statelessMarshaler, MarshalerContext marshalerContext) {
        int addSize = marshalerContext.addSize();
        int binarySerializedSize = statelessMarshaler.getBinarySerializedSize(t, marshalerContext);
        int tagSize = protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + binarySerializedSize;
        marshalerContext.setSize(addSize, binarySerializedSize);
        return tagSize;
    }

    public static <K, V> int sizeMessageWithContext(ProtoFieldInfo protoFieldInfo, K k, V v, StatelessMarshaler2<K, V> statelessMarshaler2, MarshalerContext marshalerContext) {
        int addSize = marshalerContext.addSize();
        int binarySerializedSize = statelessMarshaler2.getBinarySerializedSize(k, v, marshalerContext);
        int tagSize = protoFieldInfo.getTagSize() + CodedOutputStream.computeUInt32SizeNoTag(binarySerializedSize) + binarySerializedSize;
        marshalerContext.setSize(addSize, binarySerializedSize);
        return tagSize;
    }

    private static int getUtf8Size(String str, MarshalerContext marshalerContext) {
        return getUtf8Size(str, marshalerContext.marshalStringUnsafe());
    }

    static int getUtf8Size(String str, boolean z) {
        if (z && UnsafeString.isAvailable() && UnsafeString.isLatin1(str)) {
            return str.length() + countNegative(UnsafeString.getBytes(str));
        }
        return encodedUtf8Length(str);
    }

    private static int countNegative(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 1; i3 <= (bArr.length / MAX_INNER_LOOP_SIZE) + 1; i3++) {
            int min = Math.min(i3 * MAX_INNER_LOOP_SIZE, bArr.length & (-8));
            long j = 0;
            while (i < min) {
                j += (UnsafeString.getLong(bArr, i) & (-9187201950435737472L)) >>> 7;
                i += 8;
            }
            if (j != 0) {
                for (int i4 = 0; i4 < 8; i4++) {
                    i2 += (int) (255 & j);
                    j >>>= 8;
                }
            }
        }
        while (i < bArr.length) {
            i2 += bArr[i] >>> 31;
            i++;
        }
        return i2;
    }

    private static int encodedUtf8Length(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = str.charAt(i);
                if (charAt >= 2048) {
                    i2 += encodedUtf8LengthGeneral(str, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    private static int encodedUtf8LengthGeneral(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                int i3 = i2 + 2;
                if (Character.isSurrogate(charAt)) {
                    if (Character.codePointAt(str, i) != charAt) {
                        i++;
                    }
                }
                i2 = i3;
            }
            i++;
        }
        return i2;
    }

    static void writeUtf8(CodedOutputStream codedOutputStream, String str, int i, MarshalerContext marshalerContext) throws IOException {
        writeUtf8(codedOutputStream, str, i, marshalerContext.marshalStringUnsafe());
    }

    static void writeUtf8(CodedOutputStream codedOutputStream, String str, int i, boolean z) throws IOException {
        if (z && UnsafeString.isAvailable() && str.length() == i && UnsafeString.isLatin1(str)) {
            byte[] bytes = UnsafeString.getBytes(str);
            codedOutputStream.write(bytes, 0, bytes.length);
        } else {
            encodeUtf8(codedOutputStream, str);
        }
    }

    private static void encodeUtf8(CodedOutputStream codedOutputStream, String str) throws IOException {
        char charAt;
        int length = str.length();
        int i = 0;
        while (i < length && (charAt = str.charAt(i)) < 128) {
            codedOutputStream.write((byte) charAt);
            i++;
        }
        if (i == length) {
            return;
        }
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                codedOutputStream.write((byte) charAt2);
            } else if (charAt2 < 2048) {
                codedOutputStream.write((byte) ((charAt2 >>> 6) | 960));
                codedOutputStream.write((byte) ((charAt2 & '?') | 128));
            } else if (!Character.isSurrogate(charAt2)) {
                codedOutputStream.write((byte) ((charAt2 >>> '\f') | 480));
                codedOutputStream.write((byte) (((charAt2 >>> 6) & 63) | 128));
                codedOutputStream.write((byte) ((charAt2 & '?') | 128));
            } else {
                int codePointAt = Character.codePointAt(str, i);
                if (codePointAt != charAt2) {
                    codedOutputStream.write((byte) ((codePointAt >>> 18) | 240));
                    codedOutputStream.write((byte) (((codePointAt >>> 12) & 63) | 128));
                    codedOutputStream.write((byte) (((codePointAt >>> 6) & 63) | 128));
                    codedOutputStream.write((byte) ((codePointAt & 63) | 128));
                    i++;
                } else {
                    codedOutputStream.write(Utf8.REPLACEMENT_BYTE);
                }
            }
            i++;
        }
    }

    private StatelessMarshalerUtil() {
    }
}
