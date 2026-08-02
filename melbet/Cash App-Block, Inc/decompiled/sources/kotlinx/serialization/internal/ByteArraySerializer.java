package kotlinx.serialization.internal;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* loaded from: classes3.dex */
public final class ByteArraySerializer extends PrimitiveArraySerializer {
    public static final ByteArraySerializer INSTANCE = new ByteArraySerializer(BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        ByteArrayBuilder byteArrayBuilder = (ByteArrayBuilder) obj;
        byteArrayBuilder.getClass();
        byteArrayBuilder.append$kotlinx_serialization_core(compositeDecoder.decodeByteElement(this.descriptor, i));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return new ByteArrayBuilder(bArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        compositeEncoder.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeByteElement(this.descriptor, i2, bArr[i2]);
        }
    }
}
