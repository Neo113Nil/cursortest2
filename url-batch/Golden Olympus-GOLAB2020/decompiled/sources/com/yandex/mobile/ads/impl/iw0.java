package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C1933fm;
import com.yandex.mobile.ads.impl.am1;
import com.yandex.mobile.ads.impl.dz;
import com.yandex.mobile.ads.impl.t60;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class iw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hw0 f27406a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f27407b;

    public iw0(@NotNull Context context, @NotNull hw0 mediaSourcePathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaSourcePathProvider, "mediaSourcePathProvider");
        this.f27406a = mediaSourcePathProvider;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f27407b = applicationContext;
    }

    @NotNull
    public final am1 a(@NotNull gc2 videoAdPlaybackInfo) {
        Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        dz.a aVar = new dz.a(this.f27407b, new wu1(xs1.a()).a(this.f27407b));
        int i4 = t60.f32227e;
        C1933fm.a a4 = new C1933fm.a().a(t60.a.a().a(this.f27407b)).a(aVar);
        Intrinsics.checkNotNullExpressionValue(a4, "setUpstreamDataSourceFactory(...)");
        am1.a aVar2 = new am1.a(a4, new mz());
        this.f27406a.getClass();
        Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        am1 a5 = aVar2.a(rv0.a(videoAdPlaybackInfo.getUrl()));
        Intrinsics.checkNotNullExpressionValue(a5, "createMediaSource(...)");
        return a5;
    }
}
