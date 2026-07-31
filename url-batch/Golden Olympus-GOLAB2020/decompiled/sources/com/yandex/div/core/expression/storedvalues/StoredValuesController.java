package com.yandex.div.core.expression.storedvalues;

import Q1.a;
import W1.h;
import W1.i;
import W1.m;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.storage.RawJsonRepository;
import com.yandex.div.storage.RawJsonRepositoryException;
import com.yandex.div.storage.RawJsonRepositoryResult;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public class StoredValuesController {

    @NotNull
    private final h rawJsonRepository$delegate;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoredValue.Type.values().length];
            try {
                iArr[StoredValue.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredValue.Type.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoredValue.Type.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoredValue.Type.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoredValue.Type.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoredValue.Type.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoredValue.Type.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoredValue.Type.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoredValuesController(@NotNull a divStorageComponentLazy) {
        Intrinsics.checkNotNullParameter(divStorageComponentLazy, "divStorageComponentLazy");
        this.rawJsonRepository$delegate = i.b(new StoredValuesController$rawJsonRepository$2(divStorageComponentLazy));
    }

    private long getCurrentTime() {
        return System.currentTimeMillis();
    }

    private RawJsonRepository getRawJsonRepository() {
        return (RawJsonRepository) this.rawJsonRepository$delegate.getValue();
    }

    private void logDeclarationFailed(ErrorCollector errorCollector, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("Stored value '");
        sb.append(str);
        sb.append("' declaration failed: ");
        sb.append(th != null ? th.getMessage() : null);
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException(sb.toString(), th);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private void logRepositoryErrors(ErrorCollector errorCollector, List<RawJsonRepositoryException> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            errorCollector.logError((RawJsonRepositoryException) it.next());
        }
    }

    private void logUnknownType(ErrorCollector errorCollector, String str, String str2) {
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException("Stored value '" + str + "' declaration failed because of unknown type '" + str2 + '\'', null, 2, null);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private JSONObject toJSONObject(StoredValue storedValue, long j4) {
        Object obj;
        if (storedValue instanceof StoredValue.StringStoredValue ? true : storedValue instanceof StoredValue.IntegerStoredValue ? true : storedValue instanceof StoredValue.BooleanStoredValue ? true : storedValue instanceof StoredValue.ArrayStoredValue ? true : storedValue instanceof StoredValue.DictStoredValue ? true : storedValue instanceof StoredValue.DoubleStoredValue) {
            obj = storedValue.getValue();
        } else {
            if (!(storedValue instanceof StoredValue.UrlStoredValue ? true : storedValue instanceof StoredValue.ColorStoredValue)) {
                throw new m();
            }
            obj = storedValue.getValue().toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("expiration_time", getCurrentTime() + (j4 * 1000));
        jSONObject.put("type", StoredValue.Type.Converter.toString(storedValue.getType()));
        jSONObject.put("value", obj);
        return jSONObject;
    }

    private StoredValue toStoredValue(JSONObject jSONObject, StoredValue.Type type, String str) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                String string = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string, "getString(KEY_VALUE)");
                return new StoredValue.StringStoredValue(str, string);
            case 2:
                return new StoredValue.IntegerStoredValue(str, jSONObject.getLong("value"));
            case 3:
                return new StoredValue.BooleanStoredValue(str, jSONObject.getBoolean("value"));
            case 4:
                return new StoredValue.DoubleStoredValue(str, jSONObject.getDouble("value"));
            case 5:
                Color.Companion companion = Color.Companion;
                String string2 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(KEY_VALUE)");
                return new StoredValue.ColorStoredValue(str, companion.m220parseC4zCDoM(string2), null);
            case 6:
                Url.Companion companion2 = Url.Companion;
                String string3 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(KEY_VALUE)");
                return new StoredValue.UrlStoredValue(str, companion2.m228fromVcSV9u8(string3), null);
            case 7:
                JSONArray jSONArray = jSONObject.getJSONArray("value");
                Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(KEY_VALUE)");
                return new StoredValue.ArrayStoredValue(str, jSONArray);
            case 8:
                JSONObject jSONObject2 = jSONObject.getJSONObject("value");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(KEY_VALUE)");
                return new StoredValue.DictStoredValue(str, jSONObject2);
            default:
                throw new m();
        }
    }

    @Nullable
    public StoredValue getStoredValue(@NotNull String name, @Nullable ErrorCollector errorCollector) {
        JSONObject data;
        Intrinsics.checkNotNullParameter(name, "name");
        String str = "stored_value_" + name;
        RawJsonRepositoryResult rawJsonRepositoryResult = getRawJsonRepository().get(CollectionsKt.listOf(str));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, rawJsonRepositoryResult.getErrors());
        }
        RawJson rawJson = (RawJson) CollectionsKt.firstOrNull((List) rawJsonRepositoryResult.getResultData());
        if (rawJson != null && (data = rawJson.getData()) != null) {
            if (data.has("expiration_time")) {
                if (getCurrentTime() >= data.getLong("expiration_time")) {
                    getRawJsonRepository().remove(new StoredValuesController$getStoredValue$1(str));
                    return null;
                }
            }
            try {
                String typeStrValue = data.getString("type");
                StoredValue.Type.Converter converter = StoredValue.Type.Converter;
                Intrinsics.checkNotNullExpressionValue(typeStrValue, "typeStrValue");
                StoredValue.Type fromString = converter.fromString(typeStrValue);
                if (fromString != null) {
                    return toStoredValue(data, fromString, name);
                }
                logUnknownType(errorCollector, name, typeStrValue);
                return null;
            } catch (JSONException e4) {
                logDeclarationFailed(errorCollector, name, e4);
            }
        }
        return null;
    }

    public boolean setStoredValue(@NotNull StoredValue storedValue, long j4, @Nullable ErrorCollector errorCollector) {
        Intrinsics.checkNotNullParameter(storedValue, "storedValue");
        RawJsonRepositoryResult put = getRawJsonRepository().put(new RawJsonRepository.Payload(CollectionsKt.listOf(RawJson.Companion.invoke("stored_value_" + storedValue.getName(), toJSONObject(storedValue, j4))), null, 2, null));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, put.getErrors());
        }
        return put.getErrors().isEmpty();
    }
}
