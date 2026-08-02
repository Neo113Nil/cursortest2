package kotlinx.serialization.internal;

import kotlin.UShort;
import kotlin.UShortArray;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class UShortArraySerializer extends PrimitiveArraySerializer {
    public static final UShortArraySerializer INSTANCE = new UShortArraySerializer(BuiltinSerializersKt.serializer(UShort.Companion));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        return ((UShortArray) obj).storage.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new UShortArray(new short[0]);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        UShortArrayBuilder uShortArrayBuilder = (UShortArrayBuilder) obj;
        uShortArrayBuilder.getClass();
        short decodeShort = compositeDecoder.decodeInlineElement(this.descriptor, i).decodeShort();
        UShort.Companion companion = UShort.Companion;
        uShortArrayBuilder.m4209appendxj2QHRw$kotlinx_serialization_core(decodeShort);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        return new UShortArrayBuilder(((UShortArray) obj).storage);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        short[] sArr = ((UShortArray) obj).storage;
        compositeEncoder.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encodeInlineElement = compositeEncoder.encodeInlineElement(this.descriptor, i2);
            short s = sArr[i2];
            UShort.Companion companion = UShort.Companion;
            encodeInlineElement.encodeShort(s);
        }
    }
}
