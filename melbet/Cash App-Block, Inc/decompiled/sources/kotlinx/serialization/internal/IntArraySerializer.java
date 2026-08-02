package kotlinx.serialization.internal;

import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* loaded from: classes3.dex */
public final class IntArraySerializer extends PrimitiveArraySerializer {
    public static final IntArraySerializer INSTANCE = new IntArraySerializer(BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        IntArrayBuilder intArrayBuilder = (IntArrayBuilder) obj;
        intArrayBuilder.getClass();
        intArrayBuilder.append$kotlinx_serialization_core(compositeDecoder.decodeIntElement(this.descriptor, i));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return new IntArrayBuilder(iArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        int[] iArr = (int[]) obj;
        compositeEncoder.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeIntElement(i2, iArr[i2], this.descriptor);
        }
    }
}
