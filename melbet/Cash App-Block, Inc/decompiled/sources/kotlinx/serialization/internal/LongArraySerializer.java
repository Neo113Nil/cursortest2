package kotlinx.serialization.internal;

import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* loaded from: classes3.dex */
public final class LongArraySerializer extends PrimitiveArraySerializer {
    public static final LongArraySerializer INSTANCE = new LongArraySerializer(BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new long[0];
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        LongArrayBuilder longArrayBuilder = (LongArrayBuilder) obj;
        longArrayBuilder.getClass();
        longArrayBuilder.append$kotlinx_serialization_core(compositeDecoder.decodeLongElement(this.descriptor, i));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return new LongArrayBuilder(jArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        long[] jArr = (long[]) obj;
        compositeEncoder.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeLongElement(this.descriptor, i2, jArr[i2]);
        }
    }
}
