package com.yandex.div.json;

import com.yandex.div.internal.util.JsonArray;
import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class ParsingExceptionKt {

    @NotNull
    private static final ParsingException SILENT_PARSING_EXCEPTION = new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "", null, null, null, 28, null);

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject json, @NotNull String key, @NotNull ParsingException cause) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cause, "cause");
        return dependencyFailed(json, key, (Exception) cause);
    }

    @NotNull
    public static final ParsingException getSILENT_PARSING_EXCEPTION() {
        return SILENT_PARSING_EXCEPTION;
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject json, @NotNull String key, T t4) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t4) + "' for key '" + key + "' is not valid", null, new JsonObject(json), JsonUtilsKt.summary$default(json, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull JSONObject json, @NotNull String key) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + key + "' is missing", null, new JsonObject(json), JsonUtilsKt.summary$default(json, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException missingVariable(@NotNull String key, @NotNull String expression, @NotNull String variableName, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "Undefined variable '" + variableName + "' at \"" + key + "\": \"" + expression + '\"', th, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException missingVariable$default(String str, Throwable th, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            th = null;
        }
        return missingVariable(str, th);
    }

    @NotNull
    public static final <T> ParsingException resolveFailed(@NotNull String key, T t4, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t4) + "' for key '" + key + "' could not be resolved", th, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException resolveFailed$default(String str, Object obj, Throwable th, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        return resolveFailed(str, obj, th);
    }

    @NotNull
    public static final ParsingException templateNotFound(@NotNull JSONObject json, @NotNull String templateId) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, "Template '" + templateId + "' is missing!", null, new JsonObject(json), JsonUtilsKt.summary$default(json, 0, 1, (Object) null), 4, null);
    }

    private static final String trimLength(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() <= 100) {
            return valueOf;
        }
        return StringsKt.i1(valueOf, 97) + "...";
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value for key '" + key + "' has wrong type " + value.getClass().getName(), null, new JsonObject(json), JsonUtilsKt.summary$default(json, 0, 1, (Object) null), 4, null);
    }

    public static /* synthetic */ ParsingException typeMismatch$default(String str, String str2, Object obj, Throwable th, int i4, Object obj2) {
        if ((i4 & 8) != 0) {
            th = null;
        }
        return typeMismatch(str, str2, obj, th);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject json, @NotNull String key, @NotNull Exception cause) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cause, "cause");
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value for key '" + key + "' is failed to create", cause, new JsonObject(json), JsonUtilsKt.summary$default(json, 0, 1, (Object) null));
    }

    @NotNull
    public static final ParsingException missingVariable(@NotNull String variableName, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "No variable could be resolved for '" + variableName, th, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException invalidValue(@NotNull String expressionKey, @NotNull String rawExpression, @Nullable Object obj, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Field '" + expressionKey + "' with expression '" + rawExpression + "' received wrong value: '" + obj + '\'', th, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull String key, @NotNull String path) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(path, "path");
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + key + "' at path '" + path + "' is missing", null, null, null, 28, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONArray json, @NotNull String key, int i4, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value at " + i4 + " position of '" + key + "' has wrong type " + value.getClass().getName(), null, new JsonArray(json), JsonUtilsKt.summary$default(json, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONArray json, @NotNull String key, int i4, @NotNull Exception cause) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cause, "cause");
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value at " + i4 + " position of '" + key + "' is failed to create", cause, new JsonArray(json), JsonUtilsKt.summary$default(json, 0, 1, (Object) null));
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject json, @NotNull String key, T t4, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cause, "cause");
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t4) + "' for key '" + key + "' is not valid", cause, new JsonObject(json), null, 16, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull String expressionKey, @NotNull String rawExpression, @Nullable Object obj, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Expression '" + expressionKey + "': '" + rawExpression + "' received value of wrong type: '" + obj + '\'', th, null, null, 24, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray json, @NotNull String key, int i4, T t4, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cause, "cause");
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t4) + "' at " + i4 + " position of '" + key + "' is not valid", cause, new JsonArray(json), null, 16, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(int i4, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Item builder data at " + i4 + " position has wrong type: " + value.getClass().getName(), null, null, null, 28, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray json, @NotNull String key, int i4, T t4) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t4) + "' at " + i4 + " position of '" + key + "' is not valid", null, new JsonArray(json), JsonUtilsKt.summary$default(json, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull String path, T t4) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t4) + "' at path '" + path + "' is not valid", null, null, null, 28, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull String key, @NotNull String path, T t4) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(path, "path");
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t4) + "' for key '" + key + "' at path '" + path + "' is not valid", null, null, null, 28, null);
    }
}
