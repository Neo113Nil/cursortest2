package com.onesignal.core.internal.backend.impl;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: FeatureFlagsJsonParser.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rJ\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/onesignal/core/internal/backend/impl/FeatureFlagsJsonParser;", "", "()V", "FEATURES_PROPERTY", "", "format", "Lkotlinx/serialization/json/Json;", "getFormat", "()Lkotlinx/serialization/json/Json;", "canonicalFeatureFlagId", "raw", "encodeMetadata", "metadata", "Lkotlinx/serialization/json/JsonObject;", "findSiblingJsonObject", "root", "rawKeyFromFeaturesArray", "canonicalKey", "parse", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsResult;", "payload", "parseRootStrict", "parseStoredMetadataMap", "", "parseSuccessful", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureFlagsJsonParser {
    private static final String FEATURES_PROPERTY = "features";
    public static final FeatureFlagsJsonParser INSTANCE = new FeatureFlagsJsonParser();
    private static final Json format = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.onesignal.core.internal.backend.impl.FeatureFlagsJsonParser$format$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setLenient(false);
            Json.setAllowSpecialFloatingPointValues(false);
            Json.setPrettyPrint(false);
        }
    }, 1, null);

    private FeatureFlagsJsonParser() {
    }

    public final Json getFormat() {
        return format;
    }

    public final RemoteFeatureFlagsResult parse(String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        RemoteFeatureFlagsResult parseSuccessful = parseSuccessful(payload);
        return parseSuccessful == null ? RemoteFeatureFlagsResult.INSTANCE.getEMPTY() : parseSuccessful;
    }

    public final RemoteFeatureFlagsResult parseSuccessful(String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        try {
            JsonElement parseToJsonElement = format.parseToJsonElement(payload);
            JsonObject jsonObject = parseToJsonElement instanceof JsonObject ? (JsonObject) parseToJsonElement : null;
            if (jsonObject == null) {
                return null;
            }
            return parseRootStrict(jsonObject);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0025 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RemoteFeatureFlagsResult parseRootStrict(JsonObject root) {
        Pair pair;
        String content;
        String obj;
        JsonElement jsonElement = (JsonElement) root.get(FEATURES_PROPERTY);
        if (jsonElement == null) {
            return null;
        }
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : jsonArray) {
            JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
            if (jsonPrimitive != null) {
                if (!jsonPrimitive.getIsString()) {
                    jsonPrimitive = null;
                }
                if (jsonPrimitive != null && (content = jsonPrimitive.getContent()) != null && (obj = StringsKt.trim((CharSequence) content).toString()) != null) {
                    if (obj.length() <= 0) {
                        obj = null;
                    }
                    if (obj != null) {
                        pair = TuplesKt.to(obj, INSTANCE.canonicalFeatureFlagId(obj));
                        if (pair == null) {
                            arrayList.add(pair);
                        }
                    }
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add((String) ((Pair) obj2).getSecond())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<Pair> arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            if (jsonArray.isEmpty()) {
                return new RemoteFeatureFlagsResult(CollectionsKt.emptyList(), null);
            }
            return null;
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add((String) ((Pair) it.next()).getSecond());
        }
        ArrayList arrayList6 = arrayList5;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Pair pair2 : arrayList3) {
            String str = (String) pair2.component1();
            String str2 = (String) pair2.component2();
            JsonObject findSiblingJsonObject = INSTANCE.findSiblingJsonObject(root, str, str2);
            if (findSiblingJsonObject != null) {
                jsonObjectBuilder.put(str2, findSiblingJsonObject);
            }
        }
        JsonObject build = jsonObjectBuilder.build();
        return new RemoteFeatureFlagsResult(arrayList6, build.isEmpty() ? null : build);
    }

    private final JsonObject findSiblingJsonObject(JsonObject root, String rawKeyFromFeaturesArray, String canonicalKey) {
        for (String str : CollectionsKt.listOf((Object[]) new String[]{rawKeyFromFeaturesArray, canonicalKey})) {
            if (!Intrinsics.areEqual(str, FEATURES_PROPERTY)) {
                JsonElement jsonElement = (JsonElement) root.get((Object) str);
                if (jsonElement instanceof JsonObject) {
                    return (JsonObject) jsonElement;
                }
            }
        }
        for (Map.Entry<String, JsonElement> entry : root.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (!Intrinsics.areEqual(key, FEATURES_PROPERTY) && StringsKt.equals(key, rawKeyFromFeaturesArray, true) && (value instanceof JsonObject)) {
                return (JsonObject) value;
            }
        }
        return null;
    }

    private final String canonicalFeatureFlagId(String raw) {
        StringBuilder sb = new StringBuilder(raw.length());
        int length = raw.length();
        for (int i = 0; i < length; i++) {
            sb.append(Character.toLowerCase(raw.charAt(i)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final String encodeMetadata(JsonObject metadata) {
        if (metadata != null) {
            return format.encodeToString(JsonElement.INSTANCE.serializer(), metadata);
        }
        return null;
    }

    public final Map<String, JsonObject> parseStoredMetadataMap(String raw) {
        String str = raw;
        if (str == null || StringsKt.isBlank(str)) {
            return MapsKt.emptyMap();
        }
        try {
            JsonElement parseToJsonElement = format.parseToJsonElement(raw);
            JsonObject jsonObject = parseToJsonElement instanceof JsonObject ? (JsonObject) parseToJsonElement : null;
            if (jsonObject == null) {
                return MapsKt.emptyMap();
            }
            Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                JsonObject jsonObject2 = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
                Pair pair = jsonObject2 != null ? TuplesKt.to(str2, jsonObject2) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return MapsKt.toMap(arrayList);
        } catch (Throwable unused) {
            return MapsKt.emptyMap();
        }
    }
}
