package kotlinx.serialization.internal;

import kotlin.jvm.internal.CharCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* loaded from: classes3.dex */
public final class CharArraySerializer extends PrimitiveArraySerializer {
    public static final CharArraySerializer INSTANCE = new CharArraySerializer(BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object empty() {
        return new char[0];
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        CharArrayBuilder charArrayBuilder = (CharArrayBuilder) obj;
        charArrayBuilder.getClass();
        charArrayBuilder.append$kotlinx_serialization_core(compositeDecoder.decodeCharElement(this.descriptor, i));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return new CharArrayBuilder(cArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        char[] cArr = (char[]) obj;
        compositeEncoder.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeCharElement(this.descriptor, i2, cArr[i2]);
        }
    }
}
