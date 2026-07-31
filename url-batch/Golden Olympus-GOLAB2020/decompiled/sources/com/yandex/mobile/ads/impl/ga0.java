package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.ea0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ga0 implements InterfaceC2329x<ea0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f82 f26079a;

    public ga0(@NotNull f82 urlJsonParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        this.f26079a = urlJsonParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2329x
    public final ea0 a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String a4 = w81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        JSONArray jSONArray = jsonObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkNotNull(jSONArray);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jsonAsset = jSONArray.getJSONObject(i4);
            Intrinsics.checkNotNull(jsonAsset);
            Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
            Intrinsics.checkNotNullParameter(b9.h.f15436D0, "jsonAttribute");
            String optString = jsonAsset.optString(b9.h.f15436D0);
            if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, "null")) {
                throw new i61("Native Ad json has not required attributes");
            }
            Intrinsics.checkNotNull(optString);
            this.f26079a.getClass();
            arrayList.add(new ea0.a(optString, f82.a("url", jsonAsset)));
        }
        if (arrayList.isEmpty()) {
            throw new i61("Native Ad json has not required attributes");
        }
        return new ea0(a4, arrayList);
    }
}
