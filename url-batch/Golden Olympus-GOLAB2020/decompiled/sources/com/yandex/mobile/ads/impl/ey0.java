package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.b9;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ey0 implements MediatedNativeAdViewProvider {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f25502a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f71 f25503b;

    public ey0(@NotNull View nativeAdView, @NotNull f71 nativeAdWeakViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(nativeAdWeakViewProvider, "nativeAdWeakViewProvider");
        this.f25502a = nativeAdView;
        this.f25503b = nativeAdWeakViewProvider;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getAgeView() {
        View a4 = this.f25503b.a(IronSourceSegment.AGE);
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getBodyView() {
        View a4 = this.f25503b.a(b9.h.f15438E0);
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getCallToActionView() {
        View a4 = this.f25503b.a("call_to_action");
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getDomainView() {
        View a4 = this.f25503b.a(b9.i.f15522D);
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final ImageView getFeedbackView() {
        View a4 = this.f25503b.a("feedback");
        if (a4 instanceof ImageView) {
            return (ImageView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final ImageView getIconView() {
        View a4 = this.f25503b.a(b9.h.f15444H0);
        if (a4 instanceof ImageView) {
            return (ImageView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final FrameLayout getMediaView() {
        View a4 = this.f25503b.a(b9.h.f15446I0);
        if (a4 instanceof CustomizableMediaView) {
            return (CustomizableMediaView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @NotNull
    public final View getNativeAdView() {
        return this.f25502a;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getPriceView() {
        View a4 = this.f25503b.a("price");
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final View getRatingView() {
        return this.f25503b.a("rating");
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getReviewCountView() {
        View a4 = this.f25503b.a("review_count");
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getSponsoredView() {
        View a4 = this.f25503b.a("sponsored");
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getTitleView() {
        View a4 = this.f25503b.a(b9.h.f15436D0);
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getWarningView() {
        View a4 = this.f25503b.a("warning");
        if (a4 instanceof TextView) {
            return (TextView) a4;
        }
        return null;
    }
}
