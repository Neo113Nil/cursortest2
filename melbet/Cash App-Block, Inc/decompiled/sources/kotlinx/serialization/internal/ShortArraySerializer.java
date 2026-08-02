package kotlinx.serialization.internal;

import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* loaded from: classes3.dex */
public final class ShortArraySerializer extends PrimitiveArraySerializer {
    public static final ShortArraySerializer INSTANCE = new ShortArraySerializer(BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        ShortArrayBuilder shortArrayBuilder = (ShortArrayBuilder) obj;
        shortArrayBuilder.getClass();
        shortArrayBuilder.append$kotlinx_serialization_core(compositeDecoder.decodeShortElement(this.descriptor, i));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return new ShortArrayBuilder(sArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        short[] sArr = (short[]) obj;
        compositeEncoder.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeShortElement(this.descriptor, i2, sArr[i2]);
        }
    }
}
