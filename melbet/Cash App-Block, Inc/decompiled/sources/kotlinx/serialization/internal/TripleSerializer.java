package kotlinx.serialization.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Triple;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okhttp3.internal.Tags;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class TripleSerializer implements KSerializer {
    public final KSerializer aSerializer;
    public final KSerializer bSerializer;
    public final KSerializer cSerializer;
    public final SerialDescriptorImpl descriptor;

    public TripleSerializer(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        this.aSerializer = kSerializer;
        this.bSerializer = kSerializer2;
        this.cSerializer = kSerializer3;
        this.descriptor = Tags.buildClassSerialDescriptor("kotlin.Triple", new SerialDescriptor[0], new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 22));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptorImpl serialDescriptorImpl = this.descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptorImpl);
        Object obj = TuplesKt.NULL;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptorImpl);
            if (decodeElementIndex == -1) {
                beginStructure.endStructure(serialDescriptorImpl);
                if (obj2 == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new Triple(obj2, obj3, obj4);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (decodeElementIndex == 0) {
                obj2 = beginStructure.decodeSerializableElement(serialDescriptorImpl, 0, this.aSerializer, null);
            } else if (decodeElementIndex == 1) {
                obj3 = beginStructure.decodeSerializableElement(serialDescriptorImpl, 1, this.bSerializer, null);
            } else {
                if (decodeElementIndex != 2) {
                    throw new SerializationException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(decodeElementIndex, "Unexpected index "));
                }
                obj4 = beginStructure.decodeSerializableElement(serialDescriptorImpl, 2, this.cSerializer, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Triple triple = (Triple) obj;
        triple.getClass();
        SerialDescriptorImpl serialDescriptorImpl = this.descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptorImpl);
        beginStructure.encodeSerializableElement(serialDescriptorImpl, 0, this.aSerializer, triple.first);
        beginStructure.encodeSerializableElement(serialDescriptorImpl, 1, this.bSerializer, triple.second);
        beginStructure.encodeSerializableElement(serialDescriptorImpl, 2, this.cSerializer, triple.third);
        beginStructure.endStructure(serialDescriptorImpl);
    }
}
