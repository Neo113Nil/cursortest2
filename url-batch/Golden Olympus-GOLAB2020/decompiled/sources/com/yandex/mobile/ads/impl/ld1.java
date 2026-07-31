package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ld1 implements InterfaceC1951gg<String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kr1 f28518a;

    public ld1(@NotNull kr1 reviewCountFormatter) {
        Intrinsics.checkNotNullParameter(reviewCountFormatter, "reviewCountFormatter");
        this.f28518a = reviewCountFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1951gg
    public final String a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String a4 = w81.a(jsonAsset, "jsonAsset", "name", "jsonAttribute", "name");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        Intrinsics.checkNotNullParameter("value", "jsonAttribute");
        String optString = jsonAsset.optString("value");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(optString);
        return Intrinsics.areEqual("review_count", a4) ? this.f28518a.a(optString) : optString;
    }
}
