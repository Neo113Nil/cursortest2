package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rb2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final on0 f31103a;

    public rb2(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31103a = videoAd;
    }

    @Nullable
    public final String a() {
        JSONObject e4 = this.f31103a.e();
        String optString = e4 != null ? e4.optString(b9.h.f15490m) : null;
        if (optString == null || optString.length() <= 0) {
            return null;
        }
        return optString;
    }
}
