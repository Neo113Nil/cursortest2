package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.el;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mf;
import com.ironsource.w6;
import com.unity3d.mediation.LevelPlayAdSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final el f21974a;

    @Metadata
    public static final class Config {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final LevelPlayAdSize f21975a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final Double f21976b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f21977c;

        @Metadata
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            private LevelPlayAdSize f21978a;

            /* renamed from: b, reason: collision with root package name */
            @Nullable
            private Double f21979b;

            /* renamed from: c, reason: collision with root package name */
            @Nullable
            private String f21980c;

            @NotNull
            public final Config build() {
                return new Config(this.f21978a, this.f21979b, this.f21980c, null);
            }

            @NotNull
            public final Builder setAdSize(@NotNull LevelPlayAdSize adSize) {
                Intrinsics.checkNotNullParameter(adSize, "adSize");
                this.f21978a = adSize;
                return this;
            }

            @NotNull
            public final Builder setBidFloor(double d4) {
                this.f21979b = Double.valueOf(d4);
                return this;
            }

            @NotNull
            public final Builder setPlacementName(@NotNull String placementName) {
                Intrinsics.checkNotNullParameter(placementName, "placementName");
                this.f21980c = placementName;
                return this;
            }
        }

        private Config(LevelPlayAdSize levelPlayAdSize, Double d4, String str) {
            this.f21975a = levelPlayAdSize;
            this.f21976b = d4;
            this.f21977c = str;
        }

        @Nullable
        public final LevelPlayAdSize getAdSize() {
            return this.f21975a;
        }

        @Nullable
        public final Double getBidFloor() {
            return this.f21976b;
        }

        @Nullable
        public final String getPlacementName() {
            return this.f21977c;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d4, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(levelPlayAdSize, d4, str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final w6 a(Context context) {
        w6 w6Var = new w6(context);
        w6Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return w6Var;
    }

    public final void destroy() {
        this.f21974a.f();
    }

    @NotNull
    public final String getAdId() {
        String uuid = this.f21974a.g().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "bannerViewInternal.adId.toString()");
        return uuid;
    }

    @NotNull
    public final LevelPlayAdSize getAdSize() {
        return this.f21974a.h();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f21974a.b();
    }

    @Nullable
    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f21974a.i();
    }

    @NotNull
    public final String getPlacementName() {
        return this.f21974a.j();
    }

    public final void loadAd() {
        this.f21974a.k();
    }

    public final void pauseAutoRefresh() {
        this.f21974a.l();
    }

    public final void resumeAutoRefresh() {
        this.f21974a.m();
    }

    public final void setAdSize(@NotNull LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.f21974a.a(adSize);
    }

    public final void setBannerListener(@Nullable LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f21974a.a(levelPlayBannerAdViewListener);
    }

    public final void setPlacementName(@Nullable String str) {
        el elVar = this.f21974a;
        if (str == null) {
            str = "";
        }
        elVar.b(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        w6 a4 = a(context);
        addView(a4);
        this.f21974a = new el(mf.f18026a.a(), a4, attributeSet);
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String adUnitId) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        IronLog.API.info("adUnitId: " + adUnitId + " context: " + context.getClass().getSimpleName());
        this.f21974a.a(adUnitId);
    }
}
