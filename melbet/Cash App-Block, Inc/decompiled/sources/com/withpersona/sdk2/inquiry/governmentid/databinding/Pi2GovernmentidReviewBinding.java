package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2GovernmentidReviewBinding implements ViewBinding {
    public final PersonaMaterialButton acceptButton;
    public final CheckBox animationsPlayed;
    public final CoordinatorLayout cameraScreenContent;
    public final ConstraintLayout cameraView;
    public final TextView disclaimer;
    public final ImageView disclaimerIcon;
    public final LinearLayout disclaimerView;
    public final View flashScreen;
    public final Flow flowLayout;
    public final Pi2NavigationBar navigationBar;
    public final View overlay;
    public final ImageView overlayGuide;
    public final ConstraintLayout overlayHint;
    public final ThemeableLottieAnimationView overlayIcon;
    public final ConstraintLayout overlayIconContainer;
    public final TextView overlayText;
    public final FrameLayout processing;
    public final ProgressBar progressBar;
    public final PersonaMaterialButton retryButton;
    public final ImageView reviewImage;
    public final FrameLayout rootView;
    public final SpotlightView spotlightView;
    public final TextView title;

    public Pi2GovernmentidReviewBinding(FrameLayout frameLayout, PersonaMaterialButton personaMaterialButton, CheckBox checkBox, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, LinearLayout linearLayout, View view, Flow flow, Pi2NavigationBar pi2NavigationBar, View view2, ImageView imageView2, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView, ConstraintLayout constraintLayout3, TextView textView2, FrameLayout frameLayout2, ProgressBar progressBar, PersonaMaterialButton personaMaterialButton2, ImageView imageView3, SpotlightView spotlightView, TextView textView3) {
        this.rootView = frameLayout;
        this.acceptButton = personaMaterialButton;
        this.animationsPlayed = checkBox;
        this.cameraScreenContent = coordinatorLayout;
        this.cameraView = constraintLayout;
        this.disclaimer = textView;
        this.disclaimerIcon = imageView;
        this.disclaimerView = linearLayout;
        this.flashScreen = view;
        this.flowLayout = flow;
        this.navigationBar = pi2NavigationBar;
        this.overlay = view2;
        this.overlayGuide = imageView2;
        this.overlayHint = constraintLayout2;
        this.overlayIcon = themeableLottieAnimationView;
        this.overlayIconContainer = constraintLayout3;
        this.overlayText = textView2;
        this.processing = frameLayout2;
        this.progressBar = progressBar;
        this.retryButton = personaMaterialButton2;
        this.reviewImage = imageView3;
        this.spotlightView = spotlightView;
        this.title = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
