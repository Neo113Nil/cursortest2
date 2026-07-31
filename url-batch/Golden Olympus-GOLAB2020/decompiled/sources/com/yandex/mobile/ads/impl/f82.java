package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f82 {
    @NotNull
    public static String a(@NotNull String key, @NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        String a4 = w81.a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        if (a4.length() != 0) {
            return a4;
        }
        throw new i61("Native Ad json has not required attributes");
    }
}
