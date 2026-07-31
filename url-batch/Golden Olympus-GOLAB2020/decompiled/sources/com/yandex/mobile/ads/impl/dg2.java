package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dg2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ua2 f24616a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gz1 f24617b;

    public /* synthetic */ dg2(ua2 ua2Var) {
        this(ua2Var, new gz1());
    }

    @NotNull
    public final cg2 a(@NotNull Context context, @NotNull ob2 videoAdInfo, @NotNull pc2 videoAdPosition) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        zf2 zf2Var = new zf2(context);
        ge2 ge2Var = new ge2(context);
        tq tqVar = new tq();
        tqVar.a(new qu(videoAdInfo.b(), zf2Var, ge2Var));
        tqVar.a(new hd2(videoAdInfo.g(), zf2Var));
        dn2 a4 = this.f24616a.a(context, videoAdPosition, this.f24617b.a(videoAdInfo.b()), videoAdInfo.g().d());
        if (a4 != null) {
            tqVar.a(a4);
        }
        return new cg2(tqVar);
    }

    public dg2(@NotNull ua2 verificationVideoTrackerProvider, @NotNull gz1 skipInfoParser) {
        Intrinsics.checkNotNullParameter(verificationVideoTrackerProvider, "verificationVideoTrackerProvider");
        Intrinsics.checkNotNullParameter(skipInfoParser, "skipInfoParser");
        this.f24616a = verificationVideoTrackerProvider;
        this.f24617b = skipInfoParser;
    }
}
