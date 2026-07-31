package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w50 {
    @Nullable
    public static Set a(@NotNull String jsonData) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(a(new JSONArray(jsonData)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            ap0.b(new Object[0]);
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (Set) m243constructorimpl;
    }

    @Nullable
    public static Set a(@NotNull JSONArray jsonArray) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            Result.Companion companion = Result.Companion;
            Set b4 = kotlin.collections.T.b();
            int length = jsonArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject jSONObject = jsonArray.getJSONObject(i4);
                String string = jSONObject.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                v50 valueOf = v50.valueOf(string);
                String string2 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                b4.add(new u50(valueOf, string2));
            }
            m243constructorimpl = Result.m243constructorimpl(kotlin.collections.T.a(b4));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            Objects.toString(jsonArray);
            ap0.b(new Object[0]);
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (Set) m243constructorimpl;
    }

    @Nullable
    public static String a(@Nullable Set set) {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            u50 u50Var = (u50) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", u50Var.a().name());
            jSONObject.put("value", u50Var.b());
            jSONArray = jSONArray.put(jSONObject);
            Intrinsics.checkNotNullExpressionValue(jSONArray, "put(...)");
        }
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return null;
    }
}
