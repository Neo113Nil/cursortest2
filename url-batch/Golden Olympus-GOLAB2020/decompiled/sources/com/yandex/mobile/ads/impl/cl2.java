package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.C1918f7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cl2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hq1 f24245a;

    public /* synthetic */ cl2() {
        this(new hq1());
    }

    @NotNull
    public final C1918f7 a(@NotNull String adUnitId, @NotNull AdRequest adRequest) {
        gq1 gq1Var;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        if (preferredTheme != null) {
            this.f24245a.getClass();
            gq1Var = hq1.a(preferredTheme);
        } else {
            gq1Var = null;
        }
        return new C1918f7.a(adUnitId).a(adRequest.getAge()).d(adRequest.getBiddingData()).c(adRequest.getGender()).b(adRequest.getContextQuery()).a(adRequest.getContextTags()).a(adRequest.getLocation()).a(adRequest.getParameters()).a(gq1Var).a();
    }

    public cl2(@NotNull hq1 requestedAdThemeFactory) {
        Intrinsics.checkNotNullParameter(requestedAdThemeFactory, "requestedAdThemeFactory");
        this.f24245a = requestedAdThemeFactory;
    }
}
