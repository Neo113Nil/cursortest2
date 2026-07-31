package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hh1 implements d92 {
    @Override // com.yandex.mobile.ads.impl.d92
    @NotNull
    public final String a(@NotNull String key, @NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        String a4 = w81.a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        return a4;
    }
}
