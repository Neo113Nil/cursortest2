package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC1488j1;
import com.ironsource.gd;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ld implements od {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hl f17014a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q9 f17015b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17016c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f17017d;

    public ld(@NotNull hl adInternal, @NotNull q9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f17014a = adInternal;
        this.f17015b = currentTimeProvider;
        this.f17016c = currentTimeProvider.a();
        String uuid = adInternal.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f17017d = new LevelPlayAdInfo(uuid, adInternal.i(), adInternal.e().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.od
    public void a() {
        this.f17014a.a("onAdExpired on loading state");
    }

    @Override // com.ironsource.od
    public void b() {
        this.f17014a.a("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.od
    @NotNull
    public LevelPlayAdInfo c() {
        return this.f17017d;
    }

    @Override // com.ironsource.od
    @NotNull
    public InterfaceC1488j1 d() {
        return new InterfaceC1488j1.a("Ad is loading");
    }

    @Override // com.ironsource.od
    public void loadAd() {
        String uuid = this.f17014a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f17014a.a(new LevelPlayAdError(uuid, this.f17014a.i(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.f17015b.a() - this.f17016c);
    }

    @Override // com.ironsource.od
    public void onAdClicked() {
        this.f17014a.a("onAdClicked on loading state");
    }

    @Override // com.ironsource.od
    public void onAdClosed() {
        this.f17014a.a("onAdClosed on loading state");
    }

    @Override // com.ironsource.od
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f17014a.a("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.od
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f17014a.a(error, this.f17015b.a() - this.f17016c);
        this.f17014a.a(gd.a.LoadFailed);
    }

    @Override // com.ironsource.od
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        hl hlVar = this.f17014a;
        hlVar.a(new kd(hlVar, adInfo, this.f17015b));
        this.f17014a.a(adInfo);
    }

    @Override // com.ironsource.od
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.f17014a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f17014a.a(new LevelPlayAdError(uuid, this.f17014a.i(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f17017d);
    }

    @Override // com.ironsource.od
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f17014a.a("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
