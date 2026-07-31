package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1857ci {
    @NotNull
    public static C1833bi a(@NotNull JSONObject jsonValue) {
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        Object opt = jsonValue.opt("top");
        String str = opt instanceof String ? (String) opt : null;
        Object opt2 = jsonValue.opt("right");
        String str2 = opt2 instanceof String ? (String) opt2 : null;
        Object opt3 = jsonValue.opt("left");
        String str3 = opt3 instanceof String ? (String) opt3 : null;
        Object opt4 = jsonValue.opt("bottom");
        return new C1833bi(str, str2, str3, opt4 instanceof String ? (String) opt4 : null);
    }
}
