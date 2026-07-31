package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oo implements InterfaceC1951gg<no> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f82 f30123a;

    public oo(@NotNull f82 urlJsonParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        this.f30123a = urlJsonParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1951gg
    public final no a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String str = new String[]{"value"}[0];
        if (!jsonAsset.has(str) || jsonAsset.isNull(str)) {
            ap0.b(new Object[0]);
            throw new i61("Native Ad json has not required attributes");
        }
        JSONObject jSONObject = jsonAsset.getJSONObject("value");
        Intrinsics.checkNotNull(jSONObject);
        String[] strArr = {"url", "size"};
        for (int i4 = 0; i4 < 2; i4++) {
            String str2 = strArr[i4];
            if (!jSONObject.has(str2) || jSONObject.isNull(str2)) {
                ap0.b(new Object[0]);
                throw new i61("Native Ad json has not required attributes");
            }
        }
        this.f30123a.getClass();
        return new no(jSONObject.optInt("size"), f82.a("url", jSONObject));
    }
}
