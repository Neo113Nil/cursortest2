package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC1488j1;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class gd implements od {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hl f16375a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f16376b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f16377c;

    @Metadata
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public gd(@NotNull hl adInternal, @NotNull a status) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f16375a = adInternal;
        this.f16376b = status;
        String uuid = adInternal.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f16377c = new LevelPlayAdInfo(uuid, adInternal.i(), adInternal.e().toString(), null, null, null, null, 120, null);
    }

    private final boolean e() {
        if (this.f16375a.i().length() == 0) {
            hl hlVar = this.f16375a;
            String uuid = this.f16375a.f().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
            hl.a(hlVar, new LevelPlayAdError(uuid, this.f16375a.i(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f16375a.g().g()) {
            hl hlVar2 = this.f16375a;
            String uuid2 = this.f16375a.f().toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "adInternal.adId.toString()");
            hl.a(hlVar2, new LevelPlayAdError(uuid2, this.f16375a.i(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        fl a4 = this.f16375a.m().t().a();
        if (a4 != null && a4.a(this.f16375a.i(), this.f16375a.e())) {
            return true;
        }
        hl hlVar3 = this.f16375a;
        String uuid3 = this.f16375a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid3, "adInternal.adId.toString()");
        hl.a(hlVar3, new LevelPlayAdError(uuid3, this.f16375a.i(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.od
    public void a() {
        this.f16375a.a("onAdExpired on " + this.f16376b + " state");
    }

    @Override // com.ironsource.od
    public void b() {
        this.f16375a.a("onAdDisplayed on " + this.f16376b + " state");
    }

    @Override // com.ironsource.od
    @NotNull
    public LevelPlayAdInfo c() {
        return this.f16377c;
    }

    @Override // com.ironsource.od
    @NotNull
    public InterfaceC1488j1 d() {
        return new InterfaceC1488j1.a(this.f16376b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.od
    public void loadAd() {
        if (e()) {
            this.f16375a.p();
        }
    }

    @Override // com.ironsource.od
    public void onAdClicked() {
        this.f16375a.a("onAdClicked on " + this.f16376b + " state");
    }

    @Override // com.ironsource.od
    public void onAdClosed() {
        this.f16375a.a("onAdClosed on " + this.f16376b + " state");
    }

    @Override // com.ironsource.od
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f16375a.a("onAdInfoChanged on " + this.f16376b + " state");
    }

    @Override // com.ironsource.od
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16375a.a("onAdLoadFailed on " + this.f16376b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.od
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f16375a.a("onAdLoaded on " + this.f16376b + " state");
    }

    public /* synthetic */ gd(hl hlVar, a aVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(hlVar, (i4 & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.od
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str2 = this.f16376b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String uuid = this.f16375a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f16375a.a(new LevelPlayAdError(uuid, this.f16375a.i(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.f16377c);
    }

    @Override // com.ironsource.od
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16375a.a("onAdDisplayFailed on " + this.f16376b + " state with error: " + error.getErrorMessage());
    }
}
