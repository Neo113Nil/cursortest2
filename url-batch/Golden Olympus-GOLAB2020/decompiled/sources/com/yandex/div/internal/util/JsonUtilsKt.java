package com.yandex.div.internal.util;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class JsonUtilsKt {
    @NotNull
    public static final <R> List<R> asList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = jSONArray.get(i4);
            Intrinsics.checkNotNullExpressionValue(obj, "get(i)");
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean isEmpty(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        return jSONObject.length() == 0;
    }

    @NotNull
    public static final String summary(@NotNull JSONObject jSONObject, int i4) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        return new JsonPrinter(i4, 1).print(jSONObject);
    }

    public static /* synthetic */ String summary$default(JSONObject jSONObject, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return summary(jSONObject, i4);
    }

    @NotNull
    public static final String summary(@NotNull JSONArray jSONArray, int i4) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        return new JsonPrinter(i4, 1).print(jSONArray);
    }

    public static /* synthetic */ String summary$default(JSONArray jSONArray, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return summary(jSONArray, i4);
    }
}
