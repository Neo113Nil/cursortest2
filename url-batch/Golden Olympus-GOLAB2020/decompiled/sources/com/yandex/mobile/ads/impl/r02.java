package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r02 implements InterfaceC2329x<k02> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1906ej f30980a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o02 f30981b;

    public r02(@NotNull mp1 reporter, @NotNull InterfaceC1906ej base64EncodingParameters, @NotNull o02 itemParser) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        Intrinsics.checkNotNullParameter(itemParser, "itemParser");
        this.f30980a = base64EncodingParameters;
        this.f30981b = itemParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2329x
    public final k02 a(JSONObject jsonObject) {
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
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            o02 o02Var = this.f30981b;
            Intrinsics.checkNotNull(jSONObject);
            arrayList.add(o02Var.a(jSONObject, this.f30980a));
        }
        if (arrayList.isEmpty()) {
            throw new i61("Native Ad json has not required attributes");
        }
        return new k02(a4, arrayList);
    }
}
