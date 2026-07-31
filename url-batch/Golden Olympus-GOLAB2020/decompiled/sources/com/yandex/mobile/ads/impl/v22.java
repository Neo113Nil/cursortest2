package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v22 implements InterfaceC1951gg<String> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC1951gg
    public final String a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String a4 = w81.a(jsonAsset, "jsonAsset", "value", "jsonAttribute", "value");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        return a4;
    }
}
