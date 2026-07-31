package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.C1454e2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class el extends cl implements w5 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final UUID f16063d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final w6 f16064e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final gi f16065f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private LevelPlayAdSize f16066g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private LevelPlayBannerAdViewListener f16067h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private String f16068i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private v5 f16069j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private Boolean f16070k;

    /* renamed from: l, reason: collision with root package name */
    private Placement f16071l;

    @Metadata
    public static final class a extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16073b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ el f16074c;

        a(String str, String str2, el elVar) {
            this.f16072a = str;
            this.f16073b = str2;
            this.f16074c = elVar;
        }

        @Override // com.ironsource.ir
        public void a() {
            String str = this.f16072a;
            if (str != null) {
                this.f16074c.a(str);
            }
            String str2 = this.f16073b;
            if (str2 != null) {
                this.f16074c.f16066g = LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str2);
            }
        }

        @Override // com.ironsource.ir
        public void a(@NotNull Throwable t4) {
            Intrinsics.checkNotNullParameter(t4, "t");
            if (t4 instanceof IllegalArgumentException) {
                throw t4;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public el(@NotNull UUID adId, @NotNull w6 bannerContainer, @Nullable AttributeSet attributeSet) {
        super(new C1525o1(r1, C1454e2.b.MEDIATION));
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f16063d = adId;
        this.f16064e = bannerContainer;
        this.f16065f = nm.f18364r.d().o();
        this.f16066g = LevelPlayAdSize.BANNER;
        this.f16068i = "";
        a().e().a(new C1523o(ad_unit, adId, b()));
        if (attributeSet != null) {
            Context context = bannerContainer.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "bannerContainer.context");
            a(context, attributeSet);
        }
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
        a().d(new a(obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId), obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize), this));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(el this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16064e.removeAllViews();
        ViewParent parent = this$0.f16064e.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.f16064e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(el this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C1525o1.a(this$0.a(), "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            v5 e4 = this$0.e();
            Boolean bool = this$0.f16070k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    e4.q();
                } else {
                    e4.p();
                }
            }
            e4.l();
            this$0.f16069j = e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(el this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a().e().f().b();
        v5 v5Var = this$0.f16069j;
        if (v5Var != null) {
            v5Var.p();
        }
    }

    private final v5 e() {
        Placement placement;
        this.f16071l = a().a(this.f16068i);
        Context context = this.f16064e.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f16063d;
        String b4 = b();
        Placement placement2 = this.f16071l;
        Placement placement3 = null;
        if (placement2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            placement = null;
        } else {
            placement = placement2;
        }
        j6 j6Var = new j6(uuid, b4, placement, this.f16066g, null, null, this.f16065f.a(), 48, null);
        a(j6Var);
        ISBannerSize a4 = a().a(j6Var.g());
        ac e4 = a().e();
        C1525o1 a5 = a();
        Placement placement4 = this.f16071l;
        if (placement4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            placement3 = placement4;
        }
        e4.a(new y6(a5, a4, placement3.getPlacementName()));
        return new v5(this, a(), j6Var, this.f16064e);
    }

    public /* synthetic */ el(UUID uuid, w6 w6Var, AttributeSet attributeSet, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? mf.f18026a.a() : uuid, w6Var, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final el this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.c()) {
            IronLog.INTERNAL.warning(C1525o1.a(this$0.a(), "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.f16069j == null) {
            IronLog.INTERNAL.warning(C1525o1.a(this$0.a(), "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        wl.a(this$0.a(), new Runnable() { // from class: com.ironsource.H0
            @Override // java.lang.Runnable
            public final void run() {
                el.b(el.this);
            }
        }, 0L, 2, (Object) null);
        v5 v5Var = this$0.f16069j;
        if (v5Var != null) {
            v5Var.k();
        }
        this$0.f16069j = null;
        this$0.f16070k = null;
        this$0.f16067h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(el this$0, LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adSize, "$adSize");
        if (this$0.c()) {
            return;
        }
        this$0.f16066g = adSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(el this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a().e().f().c();
        v5 v5Var = this$0.f16069j;
        if (v5Var != null) {
            v5Var.q();
        }
    }

    @Override // com.ironsource.w5
    public void c(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.C0
            @Override // java.lang.Runnable
            public final void run() {
                el.b(LevelPlayAdInfo.this, this);
            }
        });
    }

    @Override // com.ironsource.w5
    public void d(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.G0
            @Override // java.lang.Runnable
            public final void run() {
                el.d(LevelPlayAdInfo.this, this);
            }
        });
    }

    public final void f() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        a(new Runnable() { // from class: com.ironsource.E0
            @Override // java.lang.Runnable
            public final void run() {
                el.a(el.this);
            }
        });
    }

    @NotNull
    public final UUID g() {
        return this.f16063d;
    }

    @NotNull
    public final LevelPlayAdSize h() {
        return this.f16066g;
    }

    @Nullable
    public final LevelPlayBannerAdViewListener i() {
        return this.f16067h;
    }

    @NotNull
    public final String j() {
        return this.f16068i;
    }

    public final void k() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        a(new Runnable() { // from class: com.ironsource.D0
            @Override // java.lang.Runnable
            public final void run() {
                el.c(el.this);
            }
        });
    }

    public final void l() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        if (this.f16069j != null) {
            a(new Runnable() { // from class: com.ironsource.J0
                @Override // java.lang.Runnable
                public final void run() {
                    el.d(el.this);
                }
            });
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f16070k = Boolean.FALSE;
        }
    }

    public final void m() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        if (this.f16069j != null) {
            a(new Runnable() { // from class: com.ironsource.I0
                @Override // java.lang.Runnable
                public final void run() {
                    el.e(el.this);
                }
            });
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f16070k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, el this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f16067h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, el this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f16067h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, el this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f16067h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    @Override // com.ironsource.w5
    public void e(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.Z
            @Override // java.lang.Runnable
            public final void run() {
                el.a(LevelPlayAdInfo.this, this);
            }
        });
    }

    @Override // com.ironsource.w5
    public void g(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.F0
            @Override // java.lang.Runnable
            public final void run() {
                el.c(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(el this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16067h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, el this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f16067h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    public final void b(@NotNull final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        IronLog.API.info("LevelPlayBannerAdView.setPlacementName() placementName: " + placementName);
        a(new Runnable() { // from class: com.ironsource.W
            @Override // java.lang.Runnable
            public final void run() {
                el.a(el.this, placementName);
            }
        });
    }

    @Override // com.ironsource.cl
    public boolean d() {
        LevelPlayAdError levelPlayAdError;
        if (b().length() == 0) {
            String uuid = this.f16063d.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(uuid, b(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified");
        } else {
            if (a().g()) {
                fl a4 = nm.f18364r.d().t().a();
                if (a4 != null && a4.a(b(), LevelPlay.AdFormat.BANNER)) {
                    return true;
                }
                LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f16067h;
                if (levelPlayBannerAdViewListener != null) {
                    String uuid2 = this.f16063d.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid2, "adId.toString()");
                    levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(uuid2, b(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
                }
                return false;
            }
            String uuid3 = this.f16063d.toString();
            Intrinsics.checkNotNullExpressionValue(uuid3, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(uuid3, b(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback");
        }
        a(levelPlayAdError);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(el this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        if (this$0.c()) {
            return;
        }
        this$0.f16068i = placementName;
    }

    @Override // com.ironsource.w5
    public void a(@Nullable final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            b(new Runnable() { // from class: com.ironsource.B0
                @Override // java.lang.Runnable
                public final void run() {
                    el.a(LevelPlayAdError.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, el this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f16067h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.w5
    public void a(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.A0
            @Override // java.lang.Runnable
            public final void run() {
                el.e(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, el this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f16067h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.w5
    public void a(@NotNull final LevelPlayAdInfo adInfo, @Nullable final LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            b(new Runnable() { // from class: com.ironsource.X
                @Override // java.lang.Runnable
                public final void run() {
                    el.a(LevelPlayAdInfo.this, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, el this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f16067h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    @Override // com.ironsource.w5
    public void a(@NotNull final LevelPlayAdInfo adInfo, final boolean z4) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.K0
            @Override // java.lang.Runnable
            public final void run() {
                el.a(z4, adInfo, this);
            }
        });
    }

    public final void a(@NotNull final LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        IronLog.API.info("LevelPlayBannerAdView.setBannerAdSize() adSize: " + adSize);
        a(new Runnable() { // from class: com.ironsource.Y
            @Override // java.lang.Runnable
            public final void run() {
                el.b(el.this, adSize);
            }
        });
    }

    public final void a(@Nullable final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        a(new Runnable() { // from class: com.ironsource.L0
            @Override // java.lang.Runnable
            public final void run() {
                el.a(el.this, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z4, LevelPlayAdInfo adInfo, el this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z4 + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f16067h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }
}
