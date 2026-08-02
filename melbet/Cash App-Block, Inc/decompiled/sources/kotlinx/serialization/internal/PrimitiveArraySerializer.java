package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public abstract class PrimitiveArraySerializer extends CollectionLikeSerializer {
    public final PrimitiveArrayDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArraySerializer(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.descriptor = new PrimitiveArrayDescriptor(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object builder() {
        return (PrimitiveArrayBuilder) toBuilder(empty());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(Object obj) {
        PrimitiveArrayBuilder primitiveArrayBuilder = (PrimitiveArrayBuilder) obj;
        primitiveArrayBuilder.getClass();
        return primitiveArrayBuilder.getPosition$kotlinx_serialization_core();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator collectionIterator(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return merge(decoder);
    }

    public abstract Object empty();

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void insert(int i, Object obj, Object obj2) {
        ((PrimitiveArrayBuilder) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int collectionSize = collectionSize(obj);
        PrimitiveArrayDescriptor primitiveArrayDescriptor = this.descriptor;
        CompositeEncoder beginCollection = encoder.beginCollection(primitiveArrayDescriptor);
        writeContent(beginCollection, obj, collectionSize);
        beginCollection.endStructure(primitiveArrayDescriptor);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toResult(Object obj) {
        PrimitiveArrayBuilder primitiveArrayBuilder = (PrimitiveArrayBuilder) obj;
        primitiveArrayBuilder.getClass();
        return primitiveArrayBuilder.build$kotlinx_serialization_core();
    }

    public abstract void writeContent(CompositeEncoder compositeEncoder, Object obj, int i);
}
