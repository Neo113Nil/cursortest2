package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes3.dex */
public abstract class AbstractCollectionSerializer implements KSerializer {
    public abstract Object builder();

    public abstract int builderSize(Object obj);

    public abstract Iterator collectionIterator(Object obj);

    public abstract int collectionSize(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return merge(decoder);
    }

    public final Object merge(Decoder decoder) {
        Object builder = builder();
        int builderSize = builderSize(builder);
        CompositeDecoder beginStructure = decoder.beginStructure(getDescriptor());
        while (true) {
            int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
            if (decodeElementIndex == -1) {
                beginStructure.endStructure(getDescriptor());
                return toResult(builder);
            }
            readElement(beginStructure, decodeElementIndex + builderSize, builder);
        }
    }

    public abstract void readElement(CompositeDecoder compositeDecoder, int i, Object obj);

    public abstract Object toBuilder(Object obj);

    public abstract Object toResult(Object obj);
}
