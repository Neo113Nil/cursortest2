package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f31538a = CollectionsKt.listOf((Object[]) new String[]{"native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", "video_progress", "mute_button"});

    @NotNull
    public final Set<h20> a(@NotNull JSONObject designCard) {
        Intrinsics.checkNotNullParameter(designCard, "designCard");
        ArrayList arrayList = new ArrayList();
        a(designCard, i20.f27070b, new r20(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!f31538a.contains(((h20) obj).a())) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList2);
    }

    private static void a(JSONArray jSONArray, i20 i20Var, Function2 function2) {
        Object obj;
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            Intrinsics.checkNotNullParameter(jSONArray, "<this>");
            try {
                obj = jSONArray.get(i4);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, i20Var, function2);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, i20Var, function2);
            }
        }
    }

    private static void a(JSONObject jSONObject, i20 i20Var, Function2 function2) {
        Object obj;
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("extensions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i4);
                if (Intrinsics.areEqual((optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("params")) == null) ? null : optJSONObject.optString("view_name"), "native_ad_view")) {
                    i20Var = i20.f27071c;
                    break;
                }
                i4++;
            }
        }
        ((r20) function2).invoke(jSONObject, i20Var);
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.checkNotNull(key);
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                obj = jSONObject.get(key);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, i20Var, function2);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, i20Var, function2);
            }
        }
    }
}
