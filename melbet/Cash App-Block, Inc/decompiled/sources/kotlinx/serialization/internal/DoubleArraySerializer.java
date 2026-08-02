package kotlinx.serialization.internal;

import kotlin.jvm.internal.DoubleCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* loaded from: classes3.dex */
public final class DoubleArraySerializer extends PrimitiveArraySerializer {
    public static final DoubleArraySerializer INSTANCE = new DoubleArraySerializer(BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        DoubleArrayBuilder doubleArrayBuilder = (DoubleArrayBuilder) obj;
        doubleArrayBuilder.getClass();
        doubleArrayBuilder.append$kotlinx_serialization_core(compositeDecoder.decodeDoubleElement(this.descriptor, i));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return new DoubleArrayBuilder(dArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        double[] dArr = (double[]) obj;
        compositeEncoder.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeDoubleElement(this.descriptor, i2, dArr[i2]);
        }
    }
}
