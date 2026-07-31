package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e20 implements InterfaceC2329x<InterfaceC2237t> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u00 f25061a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final v20 f25062b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final p62 f25063c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25064d;

    public e20(@NotNull u00 designJsonParser, @NotNull v20 divKitDesignParser, @NotNull p62 trackingUrlsParser, boolean z4) {
        Intrinsics.checkNotNullParameter(designJsonParser, "designJsonParser");
        Intrinsics.checkNotNullParameter(divKitDesignParser, "divKitDesignParser");
        Intrinsics.checkNotNullParameter(trackingUrlsParser, "trackingUrlsParser");
        this.f25061a = designJsonParser;
        this.f25062b = divKitDesignParser;
        this.f25063c = trackingUrlsParser;
        this.f25064d = z4;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2329x
    @NotNull
    public final InterfaceC2237t a(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String a4 = w81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        this.f25063c.getClass();
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        JSONArray jSONArray = jsonObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            String string = jSONArray.getString(i4);
            Intrinsics.checkNotNull(string);
            arrayList.add(string);
        }
        JSONObject optJSONObject = jsonObject.optJSONObject("design");
        p00 a5 = optJSONObject != null ? this.f25061a.a(optJSONObject) : null;
        q20 a6 = a5 != null ? this.f25062b.a(a5, this.f25064d) : null;
        if (a6 != null) {
            return new c20(a4, a6, arrayList);
        }
        throw new i61("Native Ad json has not required attributes");
    }
}
