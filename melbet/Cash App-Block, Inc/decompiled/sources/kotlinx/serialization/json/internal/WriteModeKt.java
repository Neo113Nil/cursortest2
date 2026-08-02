package kotlinx.serialization.json.internal;

import androidx.media3.common.FlagSet;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.AdapterHelper;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.WireAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex$$ExternalSyntheticLambda1;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$CONTEXTUAL;
import kotlinx.serialization.descriptors.SerialKind$ENUM;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonEncodingException;
import kotlinx.serialization.json.JsonIgnoreUnknownKeys;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import okio.Utf8;
import org.commonmark.internal.BlockContent;

/* loaded from: classes9.dex */
public abstract class WriteModeKt {
    public static final JsonPath$Tombstone JsonDeserializationNamesKey = new JsonPath$Tombstone();

    public static final JsonEncodingException InvalidFloatingPointEncoded(String str, Number number) {
        return new JsonEncodingException(nonFiniteFpMessage(str, number), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }

    public static final JsonEncodingException InvalidKeyKindException(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        String str = "Value of type '" + serialDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getKind() + '\'';
        serialDescriptor.getSerialName();
        return new JsonEncodingException(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final AdapterHelper StringJsonLexer(Json json, String str) {
        json.getClass();
        str.getClass();
        return new AdapterHelper(str, json.configuration);
    }

    public static final void access$checkEncodingConflicts(Json json, KSerializer kSerializer, KSerializer kSerializer2, String str) {
        SerialDescriptor descriptor = kSerializer2.getDescriptor();
        descriptor.getClass();
        json.getClass();
        namingStrategy(descriptor, json);
        if (EnumsKt.cachedSerialNames(descriptor).contains(str)) {
            String serialName = kSerializer.getDescriptor().getSerialName();
            String serialName2 = kSerializer2.getDescriptor().getSerialName();
            throw new JsonEncodingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Class '", serialName2, "' cannot be serialized ", (json.configuration.classDiscriminatorMode == ClassDiscriminatorMode.ALL_JSON_OBJECTS && Intrinsics.areEqual(serialName, serialName2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "as base class '", serialName), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    public static final SerialDescriptor carrierDescriptor(SerialDescriptor serialDescriptor, SerializersModule serializersModule) {
        SerialDescriptor carrierDescriptor;
        KSerializer contextual;
        serialDescriptor.getClass();
        serializersModule.getClass();
        if (!Intrinsics.areEqual(serialDescriptor.getKind(), SerialKind$CONTEXTUAL.INSTANCE)) {
            return serialDescriptor.isInline() ? carrierDescriptor(serialDescriptor.getElementDescriptor(0), serializersModule) : serialDescriptor;
        }
        KClass capturedKClass = ContextAwareKt.getCapturedKClass(serialDescriptor);
        SerialDescriptor serialDescriptor2 = null;
        if (capturedKClass != null && (contextual = serializersModule.getContextual(capturedKClass, EmptyList.INSTANCE)) != null) {
            serialDescriptor2 = contextual.getDescriptor();
        }
        return (serialDescriptor2 == null || (carrierDescriptor = carrierDescriptor(serialDescriptor2, serializersModule)) == null) ? serialDescriptor : carrierDescriptor;
    }

    public static final byte charToTokenClass(char c) {
        if (c < '~') {
            return CharMappings.CHAR_TO_TOKEN[c];
        }
        return (byte) 0;
    }

    public static final void checkKind(Utf8 utf8) {
        utf8.getClass();
        if (utf8 instanceof SerialKind$ENUM) {
            a$$ExternalSyntheticBUOutline0.m$1("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (utf8 instanceof PrimitiveKind$INT) {
            a$$ExternalSyntheticBUOutline0.m$1("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (utf8 instanceof PolymorphicKind) {
            a$$ExternalSyntheticBUOutline0.m$1("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String classDiscriminator(SerialDescriptor serialDescriptor, Json json) {
        serialDescriptor.getClass();
        json.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.configuration.classDiscriminator;
    }

    public static final void encodeByWriter(Json json, BlockContent blockContent, KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        new StreamingJsonEncoder(new FlagSet.Builder(blockContent), json, WriteMode.OBJ, new JsonEncoder[WriteMode.$ENTRIES.getSize()]).encodeSerializableValue(kSerializer, obj);
    }

    public static final String formatDecodingException(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !StringsKt.isBlank(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !StringsKt.isBlank(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final int getJsonNameIndex(SerialDescriptor serialDescriptor, Json json, String str) {
        serialDescriptor.getClass();
        json.getClass();
        str.getClass();
        namingStrategy(serialDescriptor, json);
        int elementIndex = serialDescriptor.getElementIndex(str);
        if (elementIndex != -3 || !json.configuration.useAlternativeNames) {
            return elementIndex;
        }
        WireAdapter wireAdapter = json._schemaCache;
        Regex$$ExternalSyntheticLambda1 regex$$ExternalSyntheticLambda1 = new Regex$$ExternalSyntheticLambda1(22, serialDescriptor, json);
        wireAdapter.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) wireAdapter.adapter;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        JsonPath$Tombstone jsonPath$Tombstone = JsonDeserializationNamesKey;
        Object obj = map != null ? map.get(jsonPath$Tombstone) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 == null) {
            obj2 = regex$$ExternalSyntheticLambda1.invoke();
            Object obj3 = concurrentHashMap.get(serialDescriptor);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj3);
            }
            ((Map) obj3).put(jsonPath$Tombstone, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int getJsonNameIndexOrThrow(SerialDescriptor serialDescriptor, Json json, String str, String str2) {
        serialDescriptor.getClass();
        json.getClass();
        str.getClass();
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, str);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean ignoreUnknownKeys(SerialDescriptor serialDescriptor, Json json) {
        serialDescriptor.getClass();
        json.getClass();
        if (json.configuration.ignoreUnknownKeys) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof JsonIgnoreUnknownKeys) {
                return true;
            }
        }
        return false;
    }

    public static final void invalidTrailingComma(AdapterHelper adapterHelper, String str) {
        adapterHelper.fail(adapterHelper.mExistingUpdateTypes - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence minify(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                m.append(charSequence.subSequence(i2, i3).toString());
                m.append(str2);
                return m.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void namingStrategy(SerialDescriptor serialDescriptor, Json json) {
        serialDescriptor.getClass();
        json.getClass();
        Intrinsics.areEqual(serialDescriptor.getKind(), StructureKind.CLASS.INSTANCE);
    }

    public static final String nonFiniteFpMessage(String str, Number number) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final Object readJson(Json json, JsonElement jsonElement, KSerializer kSerializer) {
        Decoder jsonPrimitiveDecoder;
        jsonElement.getClass();
        kSerializer.getClass();
        String str = null;
        if (jsonElement instanceof JsonObject) {
            jsonPrimitiveDecoder = new JsonTreeDecoder(json, (JsonObject) jsonElement, str, 12);
        } else if (jsonElement instanceof JsonArray) {
            jsonPrimitiveDecoder = new JsonTreeListDecoder(json, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof JsonLiteral) && !jsonElement.equals(JsonNull.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            jsonPrimitiveDecoder = new JsonPrimitiveDecoder(json, (JsonPrimitive) jsonElement, null);
        }
        return jsonPrimitiveDecoder.decodeSerializableValue$1(kSerializer);
    }

    public static final Object readPolymorphicJson(Json json, String str, JsonObject jsonObject, KSerializer kSerializer) {
        json.getClass();
        str.getClass();
        return new JsonTreeDecoder(json, jsonObject, str, kSerializer.getDescriptor()).decodeSerializableValue$1(kSerializer);
    }

    public static final WriteMode switchMode(SerialDescriptor serialDescriptor, Json json) {
        serialDescriptor.getClass();
        Utf8 kind = serialDescriptor.getKind();
        if (kind instanceof PolymorphicKind) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE$1)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor carrierDescriptor = carrierDescriptor(serialDescriptor.getElementDescriptor(0), json.serializersModule);
        Utf8 kind2 = carrierDescriptor.getKind();
        if ((kind2 instanceof PrimitiveKind$INT) || Intrinsics.areEqual(kind2, SerialKind$ENUM.INSTANCE)) {
            return WriteMode.MAP;
        }
        if (json.configuration.allowStructuredMapKeys) {
            return WriteMode.LIST;
        }
        throw InvalidKeyKindException(carrierDescriptor);
    }

    public static final void throwJsonElementPolymorphicException(String str, JsonElement jsonElement) {
        jsonElement.getClass();
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + Reflection.factory.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName() + '.', "Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final String tokenDescription(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final JsonElement writeJson(Json json, Object obj, KSerializer kSerializer) {
        json.getClass();
        kSerializer.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new JsonTreeEncoder(json, new Modifier$$ExternalSyntheticLambda0(6, ref$ObjectRef), 0).encodeSerializableValue(kSerializer, obj);
        Object obj2 = ref$ObjectRef.element;
        if (obj2 != null) {
            return (JsonElement) obj2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        throw null;
    }
}
