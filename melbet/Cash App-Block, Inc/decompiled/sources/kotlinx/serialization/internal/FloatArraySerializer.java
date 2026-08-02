package kotlinx.serialization.internal;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* loaded from: classes3.dex */
public final class FloatArraySerializer extends PrimitiveArraySerializer {
    public static final FloatArraySerializer INSTANCE = new FloatArraySerializer(BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new float[0];
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        FloatArrayBuilder floatArrayBuilder = (FloatArrayBuilder) obj;
        floatArrayBuilder.getClass();
        floatArrayBuilder.append$kotlinx_serialization_core(compositeDecoder.decodeFloatElement(this.descriptor, i));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return new FloatArrayBuilder(fArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        float[] fArr = (float[]) obj;
        compositeEncoder.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeFloatElement(this.descriptor, i2, fArr[i2]);
        }
    }
}
