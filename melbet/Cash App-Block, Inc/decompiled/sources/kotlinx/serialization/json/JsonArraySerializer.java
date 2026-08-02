package kotlinx.serialization.json;

import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayClassDesc;
import kotlinx.serialization.internal.HashSetSerializer;
import okio.Utf8;

/* loaded from: classes9.dex */
public final class JsonArraySerializer implements KSerializer {
    public static final JsonArraySerializer INSTANCE = new JsonArraySerializer();
    public static final JsonArrayDescriptor descriptor = JsonArrayDescriptor.INSTANCE;

    public final class JsonArrayDescriptor implements SerialDescriptor {
        public static final JsonArrayDescriptor INSTANCE = new JsonArrayDescriptor();
        public static final String serialName = "kotlinx.serialization.json.JsonArray";
        public final /* synthetic */ ArrayClassDesc $$delegate_0;

        public JsonArrayDescriptor() {
            SerialDescriptor descriptor = JsonElementSerializer.INSTANCE.getDescriptor();
            descriptor.getClass();
            this.$$delegate_0 = new ArrayClassDesc(descriptor, 1);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List getAnnotations() {
            this.$$delegate_0.getClass();
            return EmptyList.INSTANCE;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List getElementAnnotations(int i) {
            return this.$$delegate_0.getElementAnnotations(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final SerialDescriptor getElementDescriptor(int i) {
            return this.$$delegate_0.getElementDescriptor(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int getElementIndex(String str) {
            str.getClass();
            return this.$$delegate_0.getElementIndex(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String getElementName(int i) {
            this.$$delegate_0.getClass();
            return String.valueOf(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int getElementsCount() {
            this.$$delegate_0.getClass();
            return 1;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final Utf8 getKind() {
            this.$$delegate_0.getClass();
            return StructureKind.MAP.INSTANCE$1;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String getSerialName() {
            return serialName;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean isElementOptional(int i) {
            this.$$delegate_0.isElementOptional(i);
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean isInline() {
            this.$$delegate_0.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean isNullable() {
            this.$$delegate_0.getClass();
            return false;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        MarkdownAnimationsKt.asJsonDecoder(decoder);
        return new JsonArray((List) new HashSetSerializer(JsonElementSerializer.INSTANCE, 1).merge(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        jsonArray.getClass();
        MarkdownAnimationsKt.asJsonEncoder(encoder);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.INSTANCE;
        SerialDescriptor descriptor2 = jsonElementSerializer.getDescriptor();
        descriptor2.getClass();
        ArrayClassDesc arrayClassDesc = new ArrayClassDesc(descriptor2, 1);
        int size = jsonArray.size();
        CompositeEncoder beginCollection = encoder.beginCollection(arrayClassDesc);
        Iterator<JsonElement> it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            beginCollection.encodeSerializableElement(arrayClassDesc, i, jsonElementSerializer, it.next());
        }
        beginCollection.endStructure(arrayClassDesc);
    }
}
