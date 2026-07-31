package com.yandex.div.internal.parser;

import W1.h;
import androidx.annotation.NonNull;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class JsonPropertyParser {
    private static JSONObject nullable(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == JSONObject.NULL) {
            return null;
        }
        return jSONObject;
    }

    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t4 = (T) jSONObject.opt(str);
        if (t4 == JSONObject.NULL) {
            return null;
        }
        return t4;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull h hVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i4));
            if (nullable != null) {
                try {
                    Object deserialize = ((Deserializer) hVar.getValue()).deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e4) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i4, e4));
                }
            }
        }
        return arrayList;
    }

    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalList(parsingContext, jSONObject, str, function1, listValidator, JsonParsers.alwaysValid());
    }

    public static String readOptionalString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        try {
            return (String) optSafe;
        } catch (ClassCastException unused) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e4));
            return null;
        }
    }

    @NonNull
    public static String readString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            return (String) optSafe;
        } catch (ClassCastException unused) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
        } catch (Exception e4) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e4);
        }
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, V v4) {
        write(parsingContext, jSONObject, str, v4, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, List<V> list, @NonNull Function1<V, R> function1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < size; i4++) {
            jSONArray.put(function1.invoke(list.get(i4)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e4) {
            parsingContext.getLogger().logError(e4);
        }
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1) {
        return (V) read(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1) {
        return (V) readOptional(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<V> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return list;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            Object optSafe = optSafe(optJSONArray, i4);
            if (optSafe != null) {
                try {
                    Object invoke = function1.invoke(optSafe);
                    if (invoke != null) {
                        try {
                            if (valueValidator.isValid(invoke)) {
                                arrayList.add(invoke);
                            } else {
                                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i4, invoke));
                            }
                        } catch (ClassCastException unused2) {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i4, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i4, optSafe));
                } catch (Exception e4) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i4, optSafe, e4));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    public static <R, V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, V v4, @NonNull Function1<V, R> function1) {
        if (v4 != null) {
            try {
                jSONObject.put(str, function1.invoke(v4));
            } catch (JSONException e4) {
                parsingContext.getLogger().logError(e4);
            }
        }
    }

    private static <T> T optSafe(JSONArray jSONArray, int i4) {
        T t4 = (T) jSONArray.opt(i4);
        if (t4 == JSONObject.NULL) {
            return null;
        }
        return t4;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe != null) {
            try {
                V v4 = (V) function1.invoke(optSafe);
                if (v4 != null) {
                    try {
                        if (valueValidator.isValid(v4)) {
                            return v4;
                        }
                        throw ParsingExceptionKt.invalidValue(jSONObject, str, v4);
                    } catch (ClassCastException unused) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject, str, v4);
                    }
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
            } catch (Exception e4) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e4);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        try {
            V v4 = (V) function1.invoke(optSafe);
            if (v4 == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            }
            try {
                if (valueValidator.isValid(v4)) {
                    return v4;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e4));
            return null;
        }
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, V v4, @NonNull h hVar) {
        if (v4 != null) {
            try {
                jSONObject.put(str, ((Serializer) hVar.getValue()).serialize(parsingContext, v4));
            } catch (JSONException e4) {
                parsingContext.getLogger().logError(e4);
            }
        }
    }

    public static <V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, List<V> list, @NonNull h hVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < size; i4++) {
            jSONArray.put(((Serializer) hVar.getValue()).serialize(parsingContext, list.get(i4)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e4) {
            parsingContext.getLogger().logError(e4);
        }
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull h hVar, @NonNull ListValidator<V> listValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                List<V> list = Collections.EMPTY_LIST;
                try {
                    if (!listValidator.isValid(list)) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    }
                    return list;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return list;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject nullable = nullable(optJSONArray.optJSONObject(i4));
                if (nullable != null) {
                    try {
                        Object deserialize = ((Deserializer) hVar.getValue()).deserialize(parsingContext, nullable);
                        if (deserialize != null) {
                            arrayList.add(deserialize);
                        }
                    } catch (Exception e4) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i4, e4));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull h hVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (V) ((Deserializer) hVar.getValue()).deserialize(parsingContext, optJSONObject);
        } catch (Exception e4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONObject, str, e4));
            return null;
        }
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull h hVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            try {
                V v4 = (V) ((Deserializer) hVar.getValue()).deserialize(parsingContext, optJSONObject);
                if (v4 != null) {
                    return v4;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, (Object) null);
            } catch (Exception e4) {
                throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e4);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull h hVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i4));
            if (nullable != null) {
                try {
                    Object deserialize = ((Deserializer) hVar.getValue()).deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e4) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i4, e4));
                }
            }
        }
        return arrayList;
    }

    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull h hVar, @NonNull ListValidator<V> listValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<V> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return list;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i4));
            if (nullable != null) {
                try {
                    Object deserialize = ((Deserializer) hVar.getValue()).deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e4) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i4, e4));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }
}
