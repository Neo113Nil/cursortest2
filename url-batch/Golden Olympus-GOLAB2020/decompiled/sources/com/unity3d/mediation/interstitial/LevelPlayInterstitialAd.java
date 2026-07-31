package com.unity3d.mediation.interstitial;

import android.app.Activity;
import com.ironsource.C1454e2;
import com.ironsource.C1525o1;
import com.ironsource.ed;
import com.ironsource.hl;
import com.ironsource.jl;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mf;
import com.ironsource.nm;
import com.ironsource.q9;
import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlayInterstitialAd {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21981a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jl f21982b;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public final boolean isPlacementCapped(@NotNull String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            return hl.f16600m.a(placementName, LevelPlay.AdFormat.INTERSTITIAL);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class Config {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final Double f21983a;

        @Metadata
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            private Double f21984a;

            @NotNull
            public final Config build() {
                return new Config(this.f21984a, null);
            }

            @NotNull
            public final Builder setBidFloor(double d4) {
                this.f21984a = Double.valueOf(d4);
                return this;
            }
        }

        private Config(Double d4) {
            this.f21983a = d4;
        }

        @Nullable
        public final Double getBidFloor() {
            return this.f21983a;
        }

        public /* synthetic */ Config(Double d4, DefaultConstructorMarker defaultConstructorMarker) {
            this(d4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(@NotNull String adUnitId) {
        this(adUnitId, new hl.b(new C1525o1(IronSource.AD_UNIT.INTERSTITIAL, C1454e2.b.MEDIATION), new ed(), nm.f18364r.d(), new q9.a(), mf.f18026a));
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        IronLog.API.info("adUnitId: " + adUnitId);
    }

    public static final boolean isPlacementCapped(@NotNull String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayInterstitialAd levelPlayInterstitialAd, Activity activity, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    @NotNull
    public final String getAdId() {
        return this.f21982b.b();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f21981a;
    }

    public final boolean isAdReady() {
        return this.f21982b.c();
    }

    public final void loadAd() {
        this.f21982b.d();
    }

    public final void setListener(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.f21982b.a(levelPlayInterstitialAdListener);
    }

    public final void showAd(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    public LevelPlayInterstitialAd(@NotNull String adUnitId, @NotNull hl.b payload) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f21981a = adUnitId;
        this.f21982b = new jl(adUnitId, payload.b(), payload.a(), payload.e(), payload.c(), payload.d());
    }

    public final void showAd(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f21982b.a(activity, str);
    }
}
