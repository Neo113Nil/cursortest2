package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gp;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hp implements InterfaceC1951gg<gp> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC1951gg
    public final gp a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (jsonAsset.has("value") && jsonAsset.isNull("value")) {
            return new gp(gp.a.f26265c, null);
        }
        gp.a aVar = gp.a.f26264b;
        String a4 = w81.a(jsonAsset, "jsonAsset", "value", "jsonAttribute", "value");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        return new gp(aVar, a4);
    }
}
