package org.asyncstorage.legacy_storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LegacyStorageSupplier.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n\u001a\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\n\u001a\u0010\u0010\f\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\b\u001a\f\u0010\r\u001a\u00020\u000e*\u0004\u0018\u00010\u0003\u001a\u0012\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DATABASE_VERSION", "", "DATABASE_NAME", "", "TABLE_NAME", "COLUMN_KEY", "COLUMN_VALUE", "toEntryList", "", "Lorg/asyncstorage/legacy_storage/Entry;", "Lcom/facebook/react/bridge/ReadableArray;", "toKeyList", "toKeyValueArgument", "isValidJson", "", "mergeWith", "Lorg/json/JSONObject;", "newObject", "react-native-async-storage_async-storage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LegacyStorageSupplierKt {
    private static final String COLUMN_KEY = "key";
    private static final String COLUMN_VALUE = "value";
    private static final String DATABASE_NAME = "AsyncStorage";
    private static final int DATABASE_VERSION = 2;
    private static final String TABLE_NAME = "Storage";

    public static final List<Entry> toEntryList(ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = readableArray.toArrayList().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof ArrayList) || ((ArrayList) next).size() != 2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            ArrayList arrayList2 = (ArrayList) next;
            Object obj = arrayList2.get(0);
            Object obj2 = arrayList2.get(1);
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(obj2 != null ? obj2 instanceof String : true)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            arrayList.add(new Entry((String) obj, (String) obj2));
        }
        return arrayList;
    }

    public static final List<String> toKeyList(ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        ArrayList<Object> arrayList = readableArray.toArrayList();
        Iterator<Object> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        return arrayList;
    }

    public static final ReadableArray toKeyValueArgument(List<Entry> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        WritableArray createArray = Arguments.createArray();
        for (Entry entry : list) {
            WritableArray createArray2 = Arguments.createArray();
            createArray2.pushString(entry.getKey());
            createArray2.pushString(entry.getValue());
            createArray.pushArray(createArray2);
        }
        return createArray;
    }

    public static final boolean isValidJson(String str) {
        if (str == null) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final JSONObject mergeWith(JSONObject jSONObject, JSONObject newObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(newObject, "newObject");
        Iterator<String> keys = newObject.keys();
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            JSONObject optJSONObject2 = newObject.optJSONObject(next);
            if (optJSONObject != null && optJSONObject2 != null) {
                jSONObject2.put(next, mergeWith(optJSONObject, optJSONObject2));
            } else {
                jSONObject2.put(next, newObject.get(next));
            }
        }
        return jSONObject2;
    }
}
