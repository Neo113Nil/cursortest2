package kotlinx.serialization.json.internal;

import com.squareup.cash.db.WireAdapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.Regex$$ExternalSyntheticLambda1;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$ENUM;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes9.dex */
public class JsonTreeDecoder extends AbstractJsonTreeDecoder {
    public boolean forceNull;
    public final SerialDescriptor polyDescriptor;
    public int position;
    public final JsonObject value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(json, str);
        json.getClass();
        jsonObject.getClass();
        this.value = jsonObject;
        this.polyDescriptor = serialDescriptor;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder beginStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        SerialDescriptor serialDescriptor2 = this.polyDescriptor;
        if (serialDescriptor != serialDescriptor2) {
            return super.beginStructure(serialDescriptor);
        }
        JsonElement currentObject = currentObject();
        String serialName = serialDescriptor2.getSerialName();
        boolean z = currentObject instanceof JsonObject;
        Json json = this.json;
        if (z) {
            return new JsonTreeDecoder(json, (JsonObject) currentObject, this.polymorphicDiscriminator, serialDescriptor2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        ReflectionFactory reflectionFactory = Reflection.factory;
        sb.append(reflectionFactory.getOrCreateKotlinClass(JsonObject.class).getSimpleName());
        sb.append(", but had ");
        sb.append(reflectionFactory.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName());
        throw new JsonDecodingException(WriteModeKt.formatDecodingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, " as the serialized body of ", serialName), -1, renderTagStack(), null, json.configuration.exceptionsWithDebugInfo ? WriteModeKt.minify(-1, currentObject.toString()).toString() : null));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement currentElement(String str) {
        str.getClass();
        return (JsonElement) MapsKt__MapsKt.getValue(getValue(), str);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        while (this.position < serialDescriptor.getElementsCount()) {
            int i = this.position;
            this.position = i + 1;
            String tag = getTag(serialDescriptor, i);
            int i2 = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey(tag) || setForceNull(serialDescriptor, i2)) {
                if (this.configuration.coerceInputValues) {
                    boolean isElementOptional = serialDescriptor.isElementOptional(i2);
                    SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i2);
                    if (!isElementOptional || elementDescriptor.isNullable() || !(((JsonElement) getValue().get(tag)) instanceof JsonNull)) {
                        if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind$ENUM.INSTANCE) && (!elementDescriptor.isNullable() || !(((JsonElement) getValue().get(tag)) instanceof JsonNull))) {
                            JsonElement jsonElement = (JsonElement) getValue().get(tag);
                            String str = null;
                            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                            if (jsonPrimitive != null) {
                                InlineClassDescriptor inlineClassDescriptor = JsonElementKt.jsonUnquotedLiteralDescriptor;
                                if (!(jsonPrimitive instanceof JsonNull)) {
                                    str = jsonPrimitive.getContent();
                                }
                            }
                            if (str != null) {
                                Json json = this.json;
                                int jsonNameIndex = WriteModeKt.getJsonNameIndex(elementDescriptor, json, str);
                                boolean z = !json.configuration.explicitNulls && elementDescriptor.isNullable();
                                if (jsonNameIndex == -3 && ((isElementOptional || z) && !setForceNull(serialDescriptor, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean decodeNotNullMark() {
        return !this.forceNull && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public String elementName(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        Json json = this.json;
        WriteModeKt.namingStrategy(serialDescriptor, json);
        String elementName = serialDescriptor.getElementName(i);
        if (this.configuration.useAlternativeNames && !getValue().content.keySet().contains(elementName)) {
            WireAdapter wireAdapter = json._schemaCache;
            Regex$$ExternalSyntheticLambda1 regex$$ExternalSyntheticLambda1 = new Regex$$ExternalSyntheticLambda1(22, serialDescriptor, json);
            wireAdapter.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) wireAdapter.adapter;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            JsonPath$Tombstone jsonPath$Tombstone = WriteModeKt.JsonDeserializationNamesKey;
            Object obj2 = map != null ? map.get(jsonPath$Tombstone) : null;
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = regex$$ExternalSyntheticLambda1.invoke();
                Object obj3 = concurrentHashMap.get(serialDescriptor);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, obj3);
                }
                ((Map) obj3).put(jsonPath$Tombstone, obj2);
            }
            Map map2 = (Map) obj2;
            Iterator it = getValue().content.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return elementName;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor serialDescriptor) {
        Set plus;
        serialDescriptor.getClass();
        Json json = this.json;
        if (WriteModeKt.ignoreUnknownKeys(serialDescriptor, json) || (serialDescriptor.getKind() instanceof PolymorphicKind)) {
            return;
        }
        WriteModeKt.namingStrategy(serialDescriptor, json);
        if (this.configuration.useAlternativeNames) {
            Set cachedSerialNames = EnumsKt.cachedSerialNames(serialDescriptor);
            WireAdapter wireAdapter = json._schemaCache;
            wireAdapter.getClass();
            Map map = (Map) ((ConcurrentHashMap) wireAdapter.adapter).get(serialDescriptor);
            Object obj = map != null ? map.get(WriteModeKt.JsonDeserializationNamesKey) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = EmptySet.INSTANCE;
            }
            plus = SetsKt___SetsKt.plus(cachedSerialNames, (Iterable) keySet);
        } else {
            plus = EnumsKt.cachedSerialNames(serialDescriptor);
        }
        for (String str : getValue().content.keySet()) {
            if (!plus.contains(str) && !Intrinsics.areEqual(str, this.polymorphicDiscriminator)) {
                throw new JsonDecodingException(WriteModeKt.formatDecodingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Encountered an unknown key '", str), -1, renderTagStack(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", json.configuration.exceptionsWithDebugInfo ? WriteModeKt.minify(-1, getValue().toString()).toString() : null));
            }
        }
    }

    public final boolean setForceNull(SerialDescriptor serialDescriptor, int i) {
        boolean z = (this.json.configuration.explicitNulls || serialDescriptor.isElementOptional(i) || !serialDescriptor.getElementDescriptor(i).isNullable()) ? false : true;
        this.forceNull = z;
        return z;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonObject getValue() {
        return this.value;
    }

    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, int i) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }
}
