package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gs;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.na, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2111na {
    @Nullable
    public static Map a(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Map createMapBuilder = MapsKt.createMapBuilder();
        Iterator<String> keys = jsonObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            gs.a aVar = gs.f26279c;
            Intrinsics.checkNotNull(next);
            aVar.getClass();
            gs a4 = gs.a.a(next);
            JSONArray optJSONArray = jsonObject.optJSONArray(next);
            if (a4 != null && optJSONArray != null) {
                Set b4 = kotlin.collections.T.b();
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    b4.add(optJSONArray.getString(i4));
                }
                createMapBuilder.put(a4, kotlin.collections.T.a(b4));
            }
        }
        return MapsKt.build(createMapBuilder);
    }

    @Nullable
    public static String a(@Nullable Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put(((gs) entry.getKey()).b(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject.toString();
    }
}
