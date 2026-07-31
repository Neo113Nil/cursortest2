package com.onesignal.common;

import android.os.Bundle;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.internal.logging.Logging;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSONUtils.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0004J\u001c\u0010\u0013\u001a\u00020\u00062\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0017\u001a\u00020\u0006J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010\u001a\u001a\u00020\fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u0001J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0006J\u0010\u0010\u001f\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/onesignal/common/JSONUtils;", "", "()V", "EXTERNAL_USER_ID", "", "bundleAsJSONObject", "Lorg/json/JSONObject;", "bundle", "Landroid/os/Bundle;", "compareJSONArrays", "", "jsonArray1", "Lorg/json/JSONArray;", "jsonArray2", "convertToJson", "value", "isValidJsonObject", "jsonStringToBundle", "data", "mapToJson", "map", "", "newStringMapFromJSONObject", "jsonObject", "newStringSetFromJSONArray", "", "jsonArray", "normalizeType", "object", "toUnescapedEUIDString", "json", "wrapInJsonArray", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JSONUtils {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final JSONUtils INSTANCE = new JSONUtils();

    private JSONUtils() {
    }

    public final JSONArray wrapInJsonArray(JSONObject jsonObject) {
        JSONArray put = new JSONArray().put(jsonObject);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                Logging.error("bundleAsJSONObject error for key: " + str, e);
            }
        }
        return jSONObject;
    }

    public final Bundle jsonStringToBundle(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            JSONObject jSONObject = new JSONObject(data);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jSONObject.getString(str));
            }
            return bundle;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jsonObject) {
        Object opt;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Iterator<String> keys = jsonObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                opt = jsonObject.opt(next);
            } catch (Throwable unused) {
            }
            if (!(opt instanceof JSONArray) && !(opt instanceof JSONObject)) {
                if (!jsonObject.isNull(next) && !Intrinsics.areEqual("", opt)) {
                    linkedHashMap.put(next, opt.toString());
                }
                linkedHashMap.put(next, "");
            }
            Logging.warn$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null, 2, null);
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            String string = jsonArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final String toUnescapedEUIDString(JSONObject json) {
        String group;
        Intrinsics.checkNotNullParameter(json, "json");
        String jSONObject = json.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        if (json.has(EXTERNAL_USER_ID)) {
            Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(jSONObject);
            if (matcher.find() && (group = matcher.group(0)) != null) {
                String replaceAll = matcher.replaceAll(Matcher.quoteReplacement(StringsKt.replace$default(group, "\\/", "/", false, 4, (Object) null)));
                Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
                return replaceAll;
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean compareJSONArrays(JSONArray jsonArray1, JSONArray jsonArray2) {
        int i;
        if (jsonArray1 == null && jsonArray2 == null) {
            return true;
        }
        if (jsonArray1 == null || jsonArray2 == null || jsonArray1.length() != jsonArray2.length()) {
            return false;
        }
        try {
            int length = jsonArray1.length();
            int i2 = 0;
            while (i2 < length) {
                int length2 = jsonArray2.length();
                for (0; i < length2; i + 1) {
                    Object obj = jsonArray1.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    Object normalizeType = normalizeType(obj);
                    Object obj2 = jsonArray2.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    i = Intrinsics.areEqual(normalizeType, normalizeType(obj2)) ? 0 : i + 1;
                }
                return false;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final Object normalizeType(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        Class<?> cls = object.getClass();
        if (Intrinsics.areEqual(cls, Integer.TYPE)) {
            return Long.valueOf(((Integer) object).intValue());
        }
        return Intrinsics.areEqual(cls, Float.TYPE) ? Double.valueOf(((Float) object).floatValue()) : object;
    }

    public final boolean isValidJsonObject(Object value) {
        boolean z;
        boolean z2;
        if (value == null ? true : value instanceof Boolean ? true : value instanceof Number ? true : value instanceof String ? true : value instanceof JSONObject ? true : value instanceof JSONArray) {
            return true;
        }
        if (!(value instanceof Map)) {
            if (!(value instanceof List)) {
                return false;
            }
            Iterable iterable = (Iterable) value;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!INSTANCE.isValidJsonObject(it.next())) {
                    return false;
                }
            }
            return true;
        }
        Map map = (Map) value;
        Set keySet = map.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            Iterator it2 = keySet.iterator();
            while (it2.hasNext()) {
                if (!(it2.next() instanceof String)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it3 = values.iterator();
                while (it3.hasNext()) {
                    if (!INSTANCE.isValidJsonObject(it3.next())) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final JSONObject mapToJson(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), convertToJson(entry.getValue()));
        }
        return jSONObject;
    }

    public final Object convertToJson(Object value) {
        if (value == null) {
            return JSONObject.NULL;
        }
        if (value instanceof Map) {
            Set entrySet = ((Map) value).entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entrySet) {
                if (((Map.Entry) obj).getKey() instanceof String) {
                    arrayList.add(obj);
                }
            }
            ArrayList<Map.Entry> arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            for (Map.Entry entry : arrayList2) {
                Object key = entry.getKey();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                Pair pair = TuplesKt.to((String) key, INSTANCE.convertToJson(entry.getValue()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return mapToJson(linkedHashMap);
        }
        if (!(value instanceof List)) {
            return value;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) value).iterator();
        while (it.hasNext()) {
            jSONArray.put(INSTANCE.convertToJson(it.next()));
        }
        return jSONArray;
    }
}
