package kotlinx.serialization.internal;

import kotlin.ULong;
import kotlin.ULongArray;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class ULongArraySerializer extends PrimitiveArraySerializer {
    public static final ULongArraySerializer INSTANCE = new ULongArraySerializer(BuiltinSerializersKt.serializer(ULong.Companion));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        long[] jArr = ((ULongArray) obj).storage;
        jArr.getClass();
        return jArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new ULongArray(new long[0]);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        ULongArrayBuilder uLongArrayBuilder = (ULongArrayBuilder) obj;
        uLongArrayBuilder.getClass();
        long decodeLong = compositeDecoder.decodeInlineElement(this.descriptor, i).decodeLong();
        ULong.Companion companion = ULong.Companion;
        uLongArrayBuilder.m4208appendVKZWuLQ$kotlinx_serialization_core(decodeLong);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        long[] jArr = ((ULongArray) obj).storage;
        jArr.getClass();
        return new ULongArrayBuilder(jArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        long[] jArr = ((ULongArray) obj).storage;
        compositeEncoder.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encodeInlineElement = compositeEncoder.encodeInlineElement(this.descriptor, i2);
            long j = jArr[i2];
            ULong.Companion companion = ULong.Companion;
            encodeInlineElement.encodeLong(j);
        }
    }
}
