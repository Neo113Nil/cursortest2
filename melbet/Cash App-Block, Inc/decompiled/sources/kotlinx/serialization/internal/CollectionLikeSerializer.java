package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public abstract class CollectionLikeSerializer extends AbstractCollectionSerializer {
    public final KSerializer elementSerializer;

    public CollectionLikeSerializer(KSerializer kSerializer) {
        this.elementSerializer = kSerializer;
    }

    public abstract void insert(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        Object decodeSerializableElement;
        decodeSerializableElement = compositeDecoder.decodeSerializableElement(getDescriptor(), i, this.elementSerializer, null);
        insert(i, obj, decodeSerializableElement);
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int collectionSize = collectionSize(obj);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginCollection = encoder.beginCollection(descriptor);
        Iterator collectionIterator = collectionIterator(obj);
        for (int i = 0; i < collectionSize; i++) {
            beginCollection.encodeSerializableElement(getDescriptor(), i, this.elementSerializer, collectionIterator.next());
        }
        beginCollection.endStructure(descriptor);
    }
}
