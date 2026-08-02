package kotlinx.serialization.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class HashMapSerializer extends AbstractCollectionSerializer {
    public final /* synthetic */ int $r8$classId;
    public final HashMapClassDesc descriptor;
    public final KSerializer keySerializer;
    public final KSerializer valueSerializer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HashMapSerializer(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                kSerializer.getClass();
                kSerializer2.getClass();
                this(kSerializer, kSerializer2, (byte) 0);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.descriptor = new HashMapClassDesc("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                kSerializer.getClass();
                kSerializer2.getClass();
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.descriptor = new HashMapClassDesc("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object builder() {
        switch (this.$r8$classId) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(Object obj) {
        int size;
        switch (this.$r8$classId) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator collectionIterator(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.$r8$classId) {
        }
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder compositeDecoder, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object decodeSerializableElement = compositeDecoder.decodeSerializableElement(getDescriptor(), i, this.keySerializer, null);
        int decodeElementIndex = compositeDecoder.decodeElementIndex(getDescriptor());
        if (decodeElementIndex != i + 1) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Value must follow key in a map, index for key: ", i, decodeElementIndex, ", returned index for value: "));
            return;
        }
        boolean containsKey = map.containsKey(decodeSerializableElement);
        KSerializer kSerializer = this.valueSerializer;
        map.put(decodeSerializableElement, (!containsKey || (kSerializer.getDescriptor().getKind() instanceof PrimitiveKind$INT)) ? compositeDecoder.decodeSerializableElement(getDescriptor(), decodeElementIndex, kSerializer, null) : compositeDecoder.decodeSerializableElement(getDescriptor(), decodeElementIndex, kSerializer, MapsKt__MapsKt.getValue(map, decodeSerializableElement)));
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        collectionSize(obj);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginCollection = encoder.beginCollection(descriptor);
        Iterator collectionIterator = collectionIterator(obj);
        int i = 0;
        while (collectionIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) collectionIterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            beginCollection.encodeSerializableElement(getDescriptor(), i, this.keySerializer, key);
            i += 2;
            beginCollection.encodeSerializableElement(getDescriptor(), i2, this.valueSerializer, value);
        }
        beginCollection.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toResult(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public HashMapSerializer(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }
}
