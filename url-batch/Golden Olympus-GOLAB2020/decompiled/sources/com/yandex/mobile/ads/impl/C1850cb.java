package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.cb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1850cb implements InterfaceC2329x<InterfaceC2237t> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f82 f24151a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final p62 f24152b;

    public C1850cb(@NotNull f82 urlJsonParser, @NotNull p62 trackingUrlsParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(trackingUrlsParser, "trackingUrlsParser");
        this.f24151a = urlJsonParser;
        this.f24152b = trackingUrlsParser;
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
        this.f24151a.getClass();
        String a5 = f82.a("url", jsonObject);
        String a6 = eq0.a("optOutUrl", jsonObject);
        if (a6 == null) {
            a6 = "";
        }
        this.f24152b.getClass();
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        JSONArray jSONArray = jsonObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            String string = jSONArray.getString(i4);
            Intrinsics.checkNotNull(string);
            arrayList.add(string);
        }
        return new C1802ab(a4, a5, a6, arrayList);
    }
}
