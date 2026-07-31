package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qb2<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hc2<T> f30726a;

    public qb2(@NotNull hc2<T> videoAdPlaybackInfoCreator) {
        Intrinsics.checkNotNullParameter(videoAdPlaybackInfoCreator, "videoAdPlaybackInfoCreator");
        this.f30726a = videoAdPlaybackInfoCreator;
    }

    @NotNull
    public final ob2<T> a(@NotNull ga2 vastVideoAdData, int i4, int i5) {
        Intrinsics.checkNotNullParameter(vastVideoAdData, "vastVideoAdData");
        bb2 e4 = vastVideoAdData.e();
        hu b4 = vastVideoAdData.b();
        mv0 c4 = vastVideoAdData.c();
        w02 d4 = vastVideoAdData.d();
        String f4 = vastVideoAdData.f();
        JSONObject g4 = vastVideoAdData.g();
        oc2 oc2Var = new oc2(i4, i5 + 1);
        C1944g9 a4 = vastVideoAdData.a();
        return new ob2<>(b4, e4, c4, this.f30726a.a(e4, b4, c4, oc2Var, f4, a4 != null ? C1968h9.a(a4) : null, g4), d4, String.valueOf(ci0.a()), a4);
    }
}
