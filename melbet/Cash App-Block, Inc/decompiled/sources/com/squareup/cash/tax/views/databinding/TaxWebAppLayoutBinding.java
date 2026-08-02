package com.squareup.cash.tax.views.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.squareup.cash.mooncake.components.MooncakeMediumText;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.mooncake.components.MooncakeToolbar;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes7.dex */
public final class TaxWebAppLayoutBinding implements ViewBinding {
    public final /* synthetic */ int $r8$classId = 0;
    public final View rootView;
    public final View taxDesktopIcon;
    public final View taxWebAppErrorText;
    public final View taxWebAppLoadingProgress;
    public final View taxWebAppLoadingView;
    public final View taxWebAppToolbar;
    public final View taxWebAppToolbarBackButton;
    public final View taxWebAppToolbarTitle;

    public TaxWebAppLayoutBinding(OldSelfieOverlayView oldSelfieOverlayView, View view, Pi2CircleMaskView pi2CircleMaskView, ThemeableLottieAnimationView themeableLottieAnimationView, ImageView imageView, View view2, View view3, Pi2ProgressArcView pi2ProgressArcView) {
        this.taxDesktopIcon = oldSelfieOverlayView;
        this.rootView = view;
        this.taxWebAppToolbarBackButton = pi2CircleMaskView;
        this.taxWebAppErrorText = themeableLottieAnimationView;
        this.taxWebAppToolbarTitle = imageView;
        this.taxWebAppLoadingProgress = view2;
        this.taxWebAppLoadingView = view3;
        this.taxWebAppToolbar = pi2ProgressArcView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.$r8$classId) {
            case 0:
                return this.rootView;
            default:
                return (OldSelfieOverlayView) this.taxDesktopIcon;
        }
    }

    public TaxWebAppLayoutBinding(View view, AppCompatImageView appCompatImageView, MooncakeMediumText mooncakeMediumText, MooncakeProgress mooncakeProgress, ConstraintLayout constraintLayout, MooncakeToolbar mooncakeToolbar, AppCompatImageView appCompatImageView2, MooncakeMediumText mooncakeMediumText2, WebView webView) {
        this.rootView = view;
        this.taxDesktopIcon = appCompatImageView;
        this.taxWebAppErrorText = mooncakeMediumText;
        this.taxWebAppLoadingProgress = mooncakeProgress;
        this.taxWebAppLoadingView = constraintLayout;
        this.taxWebAppToolbar = mooncakeToolbar;
        this.taxWebAppToolbarBackButton = appCompatImageView2;
        this.taxWebAppToolbarTitle = mooncakeMediumText2;
    }
}
