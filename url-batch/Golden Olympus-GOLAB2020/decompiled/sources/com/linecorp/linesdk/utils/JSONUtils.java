package com.linecorp.linesdk.utils;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.Jsonable;
import com.linecorp.linesdk.message.Stringable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class JSONUtils {
    public static <T> void put(@NonNull JSONObject jSONObject, @NonNull String str, T t4) {
        if (t4 == null) {
            return;
        }
        if (t4 instanceof Jsonable) {
            jSONObject.put(str, ((Jsonable) t4).toJsonObject());
        } else if (t4 instanceof Stringable) {
            jSONObject.put(str, ((Stringable) t4).name().toLowerCase());
        } else {
            jSONObject.put(str, t4);
        }
    }

    public static <T> void putArray(@NonNull JSONObject jSONObject, @NonNull String str, List<T> list) {
        if (list == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (T t4 : list) {
            if (t4 instanceof Jsonable) {
                jSONArray.put(((Jsonable) t4).toJsonObject());
            } else {
                jSONArray.put(t4);
            }
        }
        jSONObject.put(str, jSONArray);
    }

    public static List<String> toStringList(@NonNull JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.getString(i4));
        }
        return arrayList;
    }
}
