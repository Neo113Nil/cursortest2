package kotlinx.serialization.internal;

import kotlin.UByte;
import kotlin.UByteArray;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class UByteArraySerializer extends PrimitiveArraySerializer {
    public static final UByteArraySerializer INSTANCE = new UByteArraySerializer(BuiltinSerializersKt.serializer(UByte.Companion));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        return ((UByteArray) obj).storage.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new UByteArray(new byte[0]);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        UByteArrayBuilder uByteArrayBuilder = (UByteArrayBuilder) obj;
        uByteArrayBuilder.getClass();
        byte decodeByte = compositeDecoder.decodeInlineElement(this.descriptor, i).decodeByte();
        UByte.Companion companion = UByte.Companion;
        uByteArrayBuilder.m4206append7apg3OU$kotlinx_serialization_core(decodeByte);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        return new UByteArrayBuilder(((UByteArray) obj).storage);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        byte[] bArr = ((UByteArray) obj).storage;
        compositeEncoder.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encodeInlineElement = compositeEncoder.encodeInlineElement(this.descriptor, i2);
            byte b = bArr[i2];
            UByte.Companion companion = UByte.Companion;
            encodeInlineElement.encodeByte(b);
        }
    }
}
