package kotlinx.serialization.json;

import androidx.recyclerview.widget.AdapterHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.internal.WriteModeKt;

/* loaded from: classes9.dex */
public abstract class JsonElementKt {
    public static final InlineClassDescriptor jsonUnquotedLiteralDescriptor = EnumsKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));

    public static final JsonPrimitive JsonPrimitive(String str) {
        return str == null ? JsonNull.INSTANCE : new JsonLiteral(str, true, null);
    }

    public static final void error(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + Reflection.factory.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    public static final JsonObject getJsonObject(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        error("JsonObject", jsonElement);
        throw null;
    }

    public static final JsonPrimitive getJsonPrimitive(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        error("JsonPrimitive", jsonElement);
        throw null;
    }

    public static final long parseLongImpl(JsonPrimitive jsonPrimitive) {
        AdapterHelper StringJsonLexer = WriteModeKt.StringJsonLexer(Json.Default, jsonPrimitive.getContent());
        String str = (String) StringJsonLexer.mOpReorderer;
        long consumeNumericLiteral = StringJsonLexer.consumeNumericLiteral();
        if (StringJsonLexer.consumeNextToken() == 10) {
            return consumeNumericLiteral;
        }
        int i = StringJsonLexer.mExistingUpdateTypes;
        int i2 = i > 0 ? i - 1 : i;
        AdapterHelper.fail$default(StringJsonLexer, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }

    public static final JsonPrimitive JsonPrimitive(Number number) {
        return new JsonLiteral(number, false, null);
    }
}
