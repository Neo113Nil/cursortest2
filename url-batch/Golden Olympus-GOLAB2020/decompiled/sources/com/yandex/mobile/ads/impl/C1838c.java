package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1838c {
    @Nullable
    public static C1814b a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(com.ironsource.ur.f19945d);
            JSONArray jSONArray = jSONObject.getJSONArray("test_ids");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            LinkedHashSet a4 = a(jSONArray);
            Intrinsics.checkNotNull(string);
            return new C1814b(string, a4);
        } catch (Throwable unused) {
            ap0.b(new Object[0]);
            return null;
        }
    }

    private static LinkedHashSet a(JSONArray jSONArray) {
        Object m243constructorimpl;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i4)))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.d(m243constructorimpl) != null) {
                Objects.toString(TuplesKt.to(jSONArray.get(i4), kotlin.jvm.internal.t.f41162a));
                ap0.b(new Object[0]);
            }
        }
        return linkedHashSet;
    }
}
