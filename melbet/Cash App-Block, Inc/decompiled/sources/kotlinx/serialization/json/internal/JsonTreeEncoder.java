package kotlinx.serialization.json.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$ENUM;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import okio.Utf8;

/* loaded from: classes9.dex */
public class JsonTreeEncoder implements JsonEncoder, Encoder, CompositeEncoder {
    public final /* synthetic */ int $r8$classId;
    public final JsonConfiguration configuration;
    public Object content;
    public final Json json;
    public final Function1 nodeConsumer;
    public String polymorphicDiscriminator;
    public String polymorphicSerialName;
    public final ArrayList tagStack;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonTreeEncoder(Json json, Function1 function1, int i) {
        this(json, function1, (char) 0);
        this.$r8$classId = i;
        json.getClass();
        function1.getClass();
        switch (i) {
            case 1:
                this(json, function1, (char) 0);
                this.tagStack.add("primitive");
                break;
            case 2:
                this(json, function1, (char) 0);
                this.content = new ArrayList();
                break;
            default:
                this.content = new LinkedHashMap();
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder beginStructure(SerialDescriptor serialDescriptor) {
        JsonTreeEncoder jsonTreeEncoder;
        serialDescriptor.getClass();
        Function1 forwardingFileSystem$$ExternalSyntheticLambda0 = CollectionsKt.lastOrNull((List) this.tagStack) == null ? this.nodeConsumer : new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 23);
        Utf8 kind = serialDescriptor.getKind();
        boolean areEqual = Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE$1);
        Json json = this.json;
        if (areEqual || (kind instanceof PolymorphicKind)) {
            jsonTreeEncoder = new JsonTreeEncoder(json, forwardingFileSystem$$ExternalSyntheticLambda0, 2);
        } else if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(serialDescriptor.getElementDescriptor(0), json.serializersModule);
            Utf8 kind2 = carrierDescriptor.getKind();
            if ((kind2 instanceof PrimitiveKind$INT) || Intrinsics.areEqual(kind2, SerialKind$ENUM.INSTANCE)) {
                forwardingFileSystem$$ExternalSyntheticLambda0.getClass();
                JsonTreeMapEncoder jsonTreeMapEncoder = new JsonTreeMapEncoder(json, forwardingFileSystem$$ExternalSyntheticLambda0, 0);
                jsonTreeMapEncoder.isKey = true;
                jsonTreeEncoder = jsonTreeMapEncoder;
            } else {
                if (!json.configuration.allowStructuredMapKeys) {
                    throw WriteModeKt.InvalidKeyKindException(carrierDescriptor);
                }
                jsonTreeEncoder = new JsonTreeEncoder(json, forwardingFileSystem$$ExternalSyntheticLambda0, 2);
            }
        } else {
            jsonTreeEncoder = new JsonTreeEncoder(json, forwardingFileSystem$$ExternalSyntheticLambda0, 0);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (jsonTreeEncoder instanceof JsonTreeMapEncoder) {
                JsonTreeMapEncoder jsonTreeMapEncoder2 = (JsonTreeMapEncoder) jsonTreeEncoder;
                jsonTreeMapEncoder2.putElement("key", JsonElementKt.JsonPrimitive(str));
                String str2 = this.polymorphicSerialName;
                if (str2 == null) {
                    str2 = serialDescriptor.getSerialName();
                }
                jsonTreeMapEncoder2.putElement("value", JsonElementKt.JsonPrimitive(str2));
            } else {
                String str3 = this.polymorphicSerialName;
                if (str3 == null) {
                    str3 = serialDescriptor.getSerialName();
                }
                jsonTreeEncoder.putElement(str, JsonElementKt.JsonPrimitive(str3));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return jsonTreeEncoder;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean z) {
        String str = (String) popTag();
        str.getClass();
        Boolean valueOf = Boolean.valueOf(z);
        InlineClassDescriptor inlineClassDescriptor = JsonElementKt.jsonUnquotedLiteralDescriptor;
        putElement(str, new JsonLiteral(valueOf, false, null));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        String tag = getTag(serialDescriptor, i);
        Boolean valueOf = Boolean.valueOf(z);
        InlineClassDescriptor inlineClassDescriptor = JsonElementKt.jsonUnquotedLiteralDescriptor;
        putElement(tag, new JsonLiteral(valueOf, false, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b) {
        String str = (String) popTag();
        str.getClass();
        putElement(str, JsonElementKt.JsonPrimitive(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, byte b) {
        primitiveArrayDescriptor.getClass();
        putElement(getTag(primitiveArrayDescriptor, i), JsonElementKt.JsonPrimitive(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c) {
        String str = (String) popTag();
        str.getClass();
        putElement(str, JsonElementKt.JsonPrimitive(String.valueOf(c)));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, char c) {
        primitiveArrayDescriptor.getClass();
        putElement(getTag(primitiveArrayDescriptor, i), JsonElementKt.JsonPrimitive(String.valueOf(c)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double d) {
        encodeTaggedDouble(popTag(), d);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        encodeTaggedDouble(getTag(serialDescriptor, i), d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String str = (String) popTag();
        str.getClass();
        putElement(str, JsonElementKt.JsonPrimitive(serialDescriptor.getElementName(i)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f) {
        encodeTaggedFloat(popTag(), f);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        encodeTaggedFloat(getTag(serialDescriptor, i), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder encodeInline(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (CollectionsKt.lastOrNull((List) this.tagStack) == null) {
            return new JsonTreeEncoder(this.json, this.nodeConsumer, 1).encodeInline(serialDescriptor);
        }
        if (this.polymorphicDiscriminator != null) {
            this.polymorphicSerialName = serialDescriptor.getSerialName();
        }
        return encodeTaggedInline(popTag(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder encodeInlineElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i) {
        primitiveArrayDescriptor.getClass();
        return encodeTaggedInline(getTag(primitiveArrayDescriptor, i), primitiveArrayDescriptor.getElementDescriptor(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int i) {
        String str = (String) popTag();
        str.getClass();
        putElement(str, JsonElementKt.JsonPrimitive(Integer.valueOf(i)));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        putElement(getTag(serialDescriptor, i), JsonElementKt.JsonPrimitive(Integer.valueOf(i2)));
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final void encodeJsonElement(JsonElement jsonElement) {
        jsonElement.getClass();
        if (this.polymorphicDiscriminator == null || (jsonElement instanceof JsonObject)) {
            encodeSerializableValue(JsonElementSerializer.INSTANCE, jsonElement);
        } else {
            WriteModeKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, jsonElement);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long j) {
        String str = (String) popTag();
        str.getClass();
        putElement(str, JsonElementKt.JsonPrimitive(Long.valueOf(j)));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        putElement(getTag(serialDescriptor, i), JsonElementKt.JsonPrimitive(Long.valueOf(j)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
        String str = (String) CollectionsKt.lastOrNull((List) this.tagStack);
        if (str == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            putElement(str, JsonNull.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                serialDescriptor.getClass();
                kSerializer.getClass();
                if (obj != null || this.configuration.explicitNulls) {
                    encodeNullableSerializableElement$kotlinx$serialization$json$internal$AbstractJsonTreeEncoder(serialDescriptor, i, kSerializer, obj);
                    break;
                }
                break;
            default:
                encodeNullableSerializableElement$kotlinx$serialization$json$internal$AbstractJsonTreeEncoder(serialDescriptor, i, kSerializer, obj);
                break;
        }
    }

    public final void encodeNullableSerializableElement$kotlinx$serialization$json$internal$AbstractJsonTreeEncoder(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.tagStack.add(getTag(serialDescriptor, i));
        encodeNullableSerializableValue(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.tagStack.add(getTag(serialDescriptor, i));
        encodeSerializableValue(kSerializer, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r0 != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE$1) == false) goto L32;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void encodeSerializableValue(KSerializer kSerializer, Object obj) {
        String classDiscriminator;
        KSerializer kSerializer2;
        kSerializer.getClass();
        Object lastOrNull = CollectionsKt.lastOrNull((List) this.tagStack);
        Json json = this.json;
        if (lastOrNull == null) {
            SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(kSerializer.getDescriptor(), json.serializersModule);
            if ((carrierDescriptor.getKind() instanceof PrimitiveKind$INT) || carrierDescriptor.getKind() == SerialKind$ENUM.INSTANCE) {
                new JsonTreeEncoder(json, this.nodeConsumer, 1).encodeSerializableValue(kSerializer, obj);
                return;
            }
        }
        JsonConfiguration jsonConfiguration = json.configuration;
        if (jsonConfiguration.useArrayPolymorphism) {
            kSerializer.serialize(this, obj);
            return;
        }
        boolean z = kSerializer instanceof AbstractPolymorphicSerializer;
        ClassDiscriminatorMode classDiscriminatorMode = jsonConfiguration.classDiscriminatorMode;
        if (!z) {
            int ordinal = classDiscriminatorMode.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    Utf8 kind = kSerializer.getDescriptor().getKind();
                    if (!Intrinsics.areEqual(kind, StructureKind.CLASS.INSTANCE)) {
                    }
                    classDiscriminator = WriteModeKt.classDiscriminator(kSerializer.getDescriptor(), json);
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            classDiscriminator = null;
        }
        if (z) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) kSerializer;
            if (obj == null) {
                a$$ExternalSyntheticBUOutline0.m("Value for serializer ", abstractPolymorphicSerializer.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            kSerializer2 = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, this, obj);
        } else {
            kSerializer2 = kSerializer;
        }
        if (classDiscriminator != null) {
            WriteModeKt.access$checkEncodingConflicts(json, kSerializer, kSerializer2, classDiscriminator);
            WriteModeKt.checkKind(kSerializer2.getDescriptor().getKind());
            String serialName = kSerializer2.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = classDiscriminator;
            this.polymorphicSerialName = serialName;
        }
        kSerializer2.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short s) {
        String str = (String) popTag();
        str.getClass();
        putElement(str, JsonElementKt.JsonPrimitive(Short.valueOf(s)));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, short s) {
        primitiveArrayDescriptor.getClass();
        putElement(getTag(primitiveArrayDescriptor, i), JsonElementKt.JsonPrimitive(Short.valueOf(s)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeString(String str) {
        str.getClass();
        String str2 = (String) popTag();
        str2.getClass();
        putElement(str2, JsonElementKt.JsonPrimitive(str));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        putElement(getTag(serialDescriptor, i), JsonElementKt.JsonPrimitive(str));
    }

    public final void encodeTaggedDouble(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        putElement(str, JsonElementKt.JsonPrimitive(Double.valueOf(d)));
        this.configuration.getClass();
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw WriteModeKt.InvalidFloatingPointEncoded(str, Double.valueOf(d));
        }
    }

    public final void encodeTaggedFloat(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        putElement(str, JsonElementKt.JsonPrimitive(Float.valueOf(f)));
        this.configuration.getClass();
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw WriteModeKt.InvalidFloatingPointEncoded(str, Float.valueOf(f));
        }
    }

    public final Encoder encodeTaggedInline(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (StreamingJsonEncoderKt.isUnsignedNumber(serialDescriptor)) {
            return new AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1(this, str);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(JsonElementKt.jsonUnquotedLiteralDescriptor)) {
            return new AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1(this, str, serialDescriptor);
        }
        this.tagStack.add(str);
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (!this.tagStack.isEmpty()) {
            popTag();
        }
        this.nodeConsumer.invoke(getCurrent());
    }

    public JsonElement getCurrent() {
        switch (this.$r8$classId) {
            case 0:
                return new JsonObject((LinkedHashMap) this.content);
            case 1:
                JsonElement jsonElement = (JsonElement) this.content;
                if (jsonElement != null) {
                    return jsonElement;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            default:
                return new JsonArray((ArrayList) this.content);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final SerializersModule getSerializersModule() {
        return this.json.serializersModule;
    }

    public final String getTag(SerialDescriptor serialDescriptor, int i) {
        String valueOf;
        serialDescriptor.getClass();
        int i2 = this.$r8$classId;
        serialDescriptor.getClass();
        switch (i2) {
            case 2:
                valueOf = String.valueOf(i);
                break;
            default:
                Json json = this.json;
                json.getClass();
                WriteModeKt.namingStrategy(serialDescriptor, json);
                valueOf = serialDescriptor.getElementName(i);
                break;
        }
        valueOf.getClass();
        return valueOf;
    }

    public final Object popTag() {
        ArrayList arrayList = this.tagStack;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList));
    }

    public void putElement(String str, JsonElement jsonElement) {
        int i = this.$r8$classId;
        str.getClass();
        jsonElement.getClass();
        switch (i) {
            case 0:
                ((LinkedHashMap) this.content).put(str, jsonElement);
                break;
            case 1:
                if (str != "primitive") {
                    a$$ExternalSyntheticBUOutline0.m$3("This output can only consume primitives with 'primitive' tag");
                    break;
                } else if (((JsonElement) this.content) != null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                    break;
                } else {
                    this.content = jsonElement;
                    this.nodeConsumer.invoke(jsonElement);
                    break;
                }
            default:
                ((ArrayList) this.content).add(Integer.parseInt(str), jsonElement);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.configuration.encodeDefaults;
    }

    public JsonTreeEncoder(Json json, Function1 function1, char c) {
        this.tagStack = new ArrayList();
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.configuration;
    }
}
