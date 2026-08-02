package kotlinx.serialization.internal;

import kotlin.jvm.internal.BooleanCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* loaded from: classes3.dex */
public final class BooleanArraySerializer extends PrimitiveArraySerializer {
    public static final BooleanArraySerializer INSTANCE = new BooleanArraySerializer(BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        BooleanArrayBuilder booleanArrayBuilder = (BooleanArrayBuilder) obj;
        booleanArrayBuilder.getClass();
        booleanArrayBuilder.append$kotlinx_serialization_core(compositeDecoder.decodeBooleanElement(this.descriptor, i));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return new BooleanArrayBuilder(zArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        compositeEncoder.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeBooleanElement(this.descriptor, i2, zArr[i2]);
        }
    }
}
