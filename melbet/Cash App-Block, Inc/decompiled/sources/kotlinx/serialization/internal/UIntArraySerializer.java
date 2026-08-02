package kotlinx.serialization.internal;

import kotlin.UInt;
import kotlin.UIntArray;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class UIntArraySerializer extends PrimitiveArraySerializer {
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer(BuiltinSerializersKt.serializer(UInt.Companion));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        return ((UIntArray) obj).storage.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new UIntArray(new int[0]);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        UIntArrayBuilder uIntArrayBuilder = (UIntArrayBuilder) obj;
        uIntArrayBuilder.getClass();
        int decodeInt = compositeDecoder.decodeInlineElement(this.descriptor, i).decodeInt();
        UInt.Companion companion = UInt.Companion;
        uIntArrayBuilder.m4207appendWZ4Q5Ns$kotlinx_serialization_core(decodeInt);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        return new UIntArrayBuilder(((UIntArray) obj).storage);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        int[] iArr = ((UIntArray) obj).storage;
        compositeEncoder.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encodeInlineElement = compositeEncoder.encodeInlineElement(this.descriptor, i2);
            int i3 = iArr[i2];
            UInt.Companion companion = UInt.Companion;
            encodeInlineElement.encodeInt(i3);
        }
    }
}
