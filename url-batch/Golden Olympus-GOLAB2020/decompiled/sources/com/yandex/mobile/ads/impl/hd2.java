package com.yandex.mobile.ads.impl;

import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.InterfaceC1490j3;
import com.yandex.mobile.ads.impl.bg2;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hd2 implements bg2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bb2 f26717a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zf2 f26718b;

    public hd2(@NotNull bb2 videoAd, @NotNull zf2 eventsTracker) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(eventsTracker, "eventsTracker");
        this.f26717a = videoAd;
        this.f26718b = eventsTracker;
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void d() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void e() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void f() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void h() {
        this.f26718b.a(this.f26717a, "render_impression");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void i() {
        bb2 videoAd = this.f26717a;
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f26718b.a(new lb2(videoAd), "renderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void j() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void k() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void l() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void m() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void n() {
        this.f26718b.a(this.f26717a, com.ironsource.c9.f15701e);
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(float f4) {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(float f4, long j4) {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull View view, @NotNull List<mb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull mc2 error) {
        int i4;
        Intrinsics.checkNotNullParameter(error, "error");
        switch (error.a().ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i4 = InterfaceC1490j3.a.b.f16790e;
                break;
            case 7:
                i4 = 402;
                break;
            case 8:
            case 12:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i4 = 900;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i4 = 400;
                break;
            case 19:
                i4 = InterfaceC1490j3.a.b.f16787b;
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                i4 = InterfaceC1490j3.a.b.f16788c;
                break;
            case 29:
                i4 = 901;
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                i4 = 902;
                break;
            default:
                throw new W1.m();
        }
        this.f26718b.a(this.f26717a, "error", MapsKt.mapOf(TuplesKt.to("[ERRORCODE]", String.valueOf(i4))));
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull bg2.a quartile) {
        Intrinsics.checkNotNullParameter(quartile, "quartile");
    }
}
