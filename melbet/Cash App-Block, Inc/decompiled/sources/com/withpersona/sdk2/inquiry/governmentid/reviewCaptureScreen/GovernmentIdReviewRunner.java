package com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeClipBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.integrity.internal.ah;
import com.squareup.cash.R;
import com.squareup.cash.portfolio.graphs.GraphPresenterData$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.AssetConfigUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.OverlayAssets;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class GovernmentIdReviewRunner implements LayoutRunner {
    public static final UiScreenRunner.Companion Companion = new UiScreenRunner.Companion(4);
    public final GovIdReviewCaptureViewController viewController;

    public GovernmentIdReviewRunner(GovIdReviewCaptureViewController govIdReviewCaptureViewController) {
        govIdReviewCaptureViewController.getClass();
        this.viewController = govIdReviewCaptureViewController;
        Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = ((BasicGovIdReviewCaptureViewController) govIdReviewCaptureViewController).binding;
        InsetsUtilsKt.applyInsetsAsPadding$default(pi2GovernmentidReviewBinding.cameraScreenContent, 15);
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidReviewBinding.overlayIcon;
        int parseColor = Color.parseColor("#43957D");
        Context context = pi2GovernmentidReviewBinding.rootView.getContext();
        context.getClass();
        themeableLottieAnimationView.addColorReplacement(parseColor, ResToolsKt.getColorFromAttr$default(context, R.attr.colorPrimary));
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(Screen.ReviewScreen reviewScreen, ViewEnvironment viewEnvironment) {
        String str;
        BasicGovIdReviewCaptureViewController basicGovIdReviewCaptureViewController;
        int i;
        StyleElements.FontWeight fontWeight;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        reviewScreen.getClass();
        viewEnvironment.getClass();
        RealImageLoader realImageLoader = reviewScreen.imageLoader;
        String str2 = reviewScreen.imagePath;
        String str3 = reviewScreen.message;
        String str4 = reviewScreen.disclaimer;
        String str5 = reviewScreen.acceptText;
        String str6 = reviewScreen.retryText;
        String str7 = reviewScreen.confirmCaptureTitle;
        Screen.Overlay overlay = reviewScreen.overlay;
        BasicGovIdReviewCaptureViewController basicGovIdReviewCaptureViewController2 = (BasicGovIdReviewCaptureViewController) this.viewController;
        FrameLayout frameLayout = basicGovIdReviewCaptureViewController2.binding.rootView;
        frameLayout.getClass();
        Context context = frameLayout.getContext();
        context.getClass();
        IdConfig.Side side = reviewScreen.captureSide;
        OverlayAssets idFrameAssetsFor = GovernmentIdKt.idFrameAssetsFor(context, overlay, side);
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = reviewScreen.assetConfig;
        RemoteImage asset = capturePage != null ? AssetConfigUtilsKt.getAsset(capturePage, reviewScreen.idClass, side) : null;
        NavigationState navigationState = reviewScreen.navigationState;
        boolean z = reviewScreen.isEnabled;
        boolean z2 = reviewScreen.isAutoClassifying;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = reviewScreen.styles;
        String str8 = reviewScreen.error;
        StyleElements.Axis axis = reviewScreen.reviewCaptureButtonsAxis;
        GovernmentIdReviewRunner$$ExternalSyntheticLambda0 governmentIdReviewRunner$$ExternalSyntheticLambda0 = new GovernmentIdReviewRunner$$ExternalSyntheticLambda0(reviewScreen, 0);
        GovernmentIdReviewRunner$$ExternalSyntheticLambda0 governmentIdReviewRunner$$ExternalSyntheticLambda02 = new GovernmentIdReviewRunner$$ExternalSyntheticLambda0(reviewScreen, 1);
        GovernmentIdReviewRunner$$ExternalSyntheticLambda0 governmentIdReviewRunner$$ExternalSyntheticLambda03 = new GovernmentIdReviewRunner$$ExternalSyntheticLambda0(reviewScreen, 2);
        GovernmentIdReviewRunner$$ExternalSyntheticLambda0 governmentIdReviewRunner$$ExternalSyntheticLambda04 = new GovernmentIdReviewRunner$$ExternalSyntheticLambda0(reviewScreen, 3);
        basicGovIdReviewCaptureViewController2.getClass();
        Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = basicGovIdReviewCaptureViewController2.binding;
        realImageLoader.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        navigationState.getClass();
        axis.getClass();
        CheckBox checkBox = pi2GovernmentidReviewBinding.animationsPlayed;
        ConstraintLayout constraintLayout = pi2GovernmentidReviewBinding.overlayHint;
        Pi2NavigationBar pi2NavigationBar = pi2GovernmentidReviewBinding.navigationBar;
        View view = pi2GovernmentidReviewBinding.overlay;
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidReviewBinding.overlayIcon;
        TextView textView = pi2GovernmentidReviewBinding.overlayText;
        TextView textView2 = pi2GovernmentidReviewBinding.disclaimer;
        PersonaMaterialButton personaMaterialButton = pi2GovernmentidReviewBinding.acceptButton;
        RemoteImage remoteImage = asset;
        PersonaMaterialButton personaMaterialButton2 = pi2GovernmentidReviewBinding.retryButton;
        TextView textView3 = pi2GovernmentidReviewBinding.title;
        FrameLayout frameLayout2 = pi2GovernmentidReviewBinding.rootView;
        ImageView imageView = pi2GovernmentidReviewBinding.disclaimerIcon;
        ImageView imageView2 = pi2GovernmentidReviewBinding.reviewImage;
        if (checkBox.isChecked()) {
            str = str6;
            themeableLottieAnimationView.addLottieOnCompositionLoadedListener(new OldSelfieOverlayView$$ExternalSyntheticLambda2(pi2GovernmentidReviewBinding, 1));
        } else {
            str = str6;
            pi2GovernmentidReviewBinding.animationsPlayed.setChecked(true);
            frameLayout2.post(new Task$$ExternalSyntheticLambda0(pi2GovernmentidReviewBinding, 8));
        }
        Object tag = imageView2.getTag(R.id.pi2_last_image_path);
        int i2 = 7;
        if (!Intrinsics.areEqual(tag instanceof String ? (String) tag : null, str2)) {
            ah.addOneShotPreDrawListenerAndDiscardFrame(imageView2, new UiScreenRunner$$ExternalSyntheticLambda29(i2, pi2GovernmentidReviewBinding, str2, realImageLoader));
        }
        textView.setText(str3);
        imageView.setVisibility(StringsKt.isBlank(str4) ? 8 : 0);
        textView2.setVisibility(StringsKt.isBlank(str4) ? 8 : 0);
        textView2.setText(str4);
        personaMaterialButton.setText(str5);
        personaMaterialButton2.setText(str);
        textView3.setText(str7);
        CharSequence text = textView3.getText();
        text.getClass();
        textView3.setVisibility(text.length() == 0 ? 8 : 0);
        Context context2 = frameLayout2.getContext();
        context2.getClass();
        view.setBackground(GovernmentIdKt.createIdFrameWithAttributes(context2, R.attr.personaIdFrameReviewStyle));
        if (ResToolsKt.boolFromAttr$default(context2, R.attr.personaIdFrameCenterText)) {
            textView.setGravity(17);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                textView.setLayoutParams(marginLayoutParams);
            }
        }
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context2, R.attr.personaLockImage);
        if (resourceIdFromAttr$default != null) {
            imageView.setImageResource(resourceIdFromAttr$default.intValue());
        }
        pi2GovernmentidReviewBinding.overlayGuide.setImageResource(idFrameAssetsFor.guideDrawable);
        if (remoteImage != null) {
            basicGovIdReviewCaptureViewController = basicGovIdReviewCaptureViewController2;
            if (basicGovIdReviewCaptureViewController.currentOverlayAssetView == null) {
                basicGovIdReviewCaptureViewController.currentOverlayAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, pi2GovernmentidReviewBinding.overlayIconContainer, false);
                themeableLottieAnimationView.setVisibility(8);
            }
        } else {
            basicGovIdReviewCaptureViewController = basicGovIdReviewCaptureViewController2;
            themeableLottieAnimationView.setAnimation(idFrameAssetsFor.hintAnimation);
        }
        zzai.applyNavigationState(navigationState, new CameraHelper$$ExternalSyntheticLambda0(governmentIdReviewRunner$$ExternalSyntheticLambda02, 18), new CameraHelper$$ExternalSyntheticLambda0(governmentIdReviewRunner$$ExternalSyntheticLambda03, 19), new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, frameLayout2);
        personaMaterialButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(governmentIdReviewRunner$$ExternalSyntheticLambda0, 20));
        personaMaterialButton2.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(governmentIdReviewRunner$$ExternalSyntheticLambda02, 21));
        personaMaterialButton.setEnabled(z);
        personaMaterialButton2.setEnabled(z);
        if (basicGovIdReviewCaptureViewController.isProcessing != z2) {
            basicGovIdReviewCaptureViewController.isProcessing = z2;
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(3));
            transitionSet.addTransition(new ChangeBounds());
            transitionSet.addTransition(new ChangeClipBounds());
            transitionSet.addTransition(new ChangeImageTransform());
            transitionSet.setOrdering(0);
            transitionSet.setDuration(300L);
            LinearLayout linearLayout = pi2GovernmentidReviewBinding.disclaimerView;
            TransitionManager.beginDelayedTransition(frameLayout2, transitionSet);
            FrameLayout frameLayout3 = pi2GovernmentidReviewBinding.processing;
            if (z2) {
                frameLayout3.setVisibility(0);
                linearLayout.setVisibility(4);
                personaMaterialButton.setVisibility(4);
                personaMaterialButton2.setVisibility(4);
                constraintLayout.setVisibility(4);
            } else {
                frameLayout3.setVisibility(4);
                linearLayout.setVisibility(0);
                personaMaterialButton.setVisibility(0);
                personaMaterialButton2.setVisibility(0);
                constraintLayout.setVisibility(0);
            }
        }
        if (governmentIdStepStyle != null) {
            float dpToPx = (float) ExtensionsKt.getDpToPx(8.0d);
            int dpToPx2 = (int) ExtensionsKt.getDpToPx(3.0d);
            TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                TextStylingKt.style(textView3, titleStyleValue, EmptySet.INSTANCE);
                textView3.setTextColor(-1);
            }
            TextBasedComponentStyle governmentIdCaptureHintTextStyle = governmentIdStepStyle.getGovernmentIdCaptureHintTextStyle();
            if (governmentIdCaptureHintTextStyle != null) {
                TextStylingKt.style(textView, governmentIdCaptureHintTextStyle, SetsKt__SetsJVMKt.setOf(TextStyleElements.LineHeight));
            }
            Integer governmentIdReviewImageBoxBorderColorValue = governmentIdStepStyle.getGovernmentIdReviewImageBoxBorderColorValue();
            if (governmentIdReviewImageBoxBorderColorValue != null) {
                i = governmentIdReviewImageBoxBorderColorValue.intValue();
                pi2GovernmentidReviewBinding.progressBar.setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{i}));
            } else {
                i = -1;
            }
            StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
            String fontNameValue = (textStyle == null || (base3 = textStyle.getBase()) == null || (base4 = base3.getBase()) == null) ? null : base4.getFontNameValue();
            StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = governmentIdStepStyle.getTextStyle();
            if (textStyle2 == null || (base = textStyle2.getBase()) == null || (base2 = base.getBase()) == null || (fontWeight = base2.getFontWeightValue()) == null) {
                fontWeight = StyleElements.FontWeight.NORMAL;
            }
            TextStylingKt.setTypeface(textView2, fontNameValue, fontWeight, new InstantKt$$ExternalSyntheticLambda0(3));
            Double governmentIdReviewImageBoxBorderRadiusValue = governmentIdStepStyle.getGovernmentIdReviewImageBoxBorderRadiusValue();
            if (governmentIdReviewImageBoxBorderRadiusValue != null) {
                dpToPx = (float) ExtensionsKt.getDpToPx(governmentIdReviewImageBoxBorderRadiusValue.doubleValue());
            }
            Double governmentIdReviewImageBoxBorderWidthValue = governmentIdStepStyle.getGovernmentIdReviewImageBoxBorderWidthValue();
            if (governmentIdReviewImageBoxBorderWidthValue != null) {
                dpToPx2 = (int) Math.ceil(ExtensionsKt.getDpToPx(governmentIdReviewImageBoxBorderWidthValue.doubleValue()));
            }
            pi2GovernmentidReviewBinding.spotlightView.setRadius(dpToPx2 + dpToPx);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(dpToPx);
            gradientDrawable.setStroke(dpToPx2, i);
            view.setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(-1);
            gradientDrawable2.setCornerRadii(new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, dpToPx, dpToPx, dpToPx, dpToPx});
            constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) ExtensionsKt.getDpToPx(6.0d)));
            ButtonSubmitComponentStyle submitPhotoButtonStyleValue = governmentIdStepStyle.getSubmitPhotoButtonStyleValue();
            if (submitPhotoButtonStyleValue != null) {
                ButtonStylingKt.style$default(personaMaterialButton, submitPhotoButtonStyleValue, false, false, 10);
            }
            ButtonCancelComponentStyle retakePhotoButtonStyleValue = governmentIdStepStyle.getRetakePhotoButtonStyleValue();
            if (retakePhotoButtonStyleValue != null) {
                ButtonStylingKt.style$default(personaMaterialButton2, retakePhotoButtonStyleValue, false, false, 10);
            }
            Integer captureHintIconStrokeColor = governmentIdStepStyle.getCaptureHintIconStrokeColor();
            if (captureHintIconStrokeColor != null) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
            }
            Integer captureHintIconFillColor = governmentIdStepStyle.getCaptureHintIconFillColor();
            if (captureHintIconFillColor != null) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
            }
            Integer capturePageHeaderIconColorValue = governmentIdStepStyle.getCapturePageHeaderIconColorValue();
            if (capturePageHeaderIconColorValue != null) {
                pi2NavigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
            }
            int color = frameLayout2.getContext().getColor(R.color.blackScreenStatusBarColor);
            Context context3 = frameLayout2.getContext();
            context3.getClass();
            zzat.updateSystemUiColor(viewEnvironment, context3, color);
        }
        ah.addOneShotPreDrawListenerAndDiscardFrame(pi2GovernmentidReviewBinding.acceptButton, new GraphPresenterData$$ExternalSyntheticLambda0(pi2GovernmentidReviewBinding, basicGovIdReviewCaptureViewController, System.currentTimeMillis(), axis, 1));
        LeftSheetDelegate.renderErrorSnackbarIfNeeded(pi2GovernmentidReviewBinding.cameraScreenContent, str8, governmentIdReviewRunner$$ExternalSyntheticLambda04, null, 2, 0);
    }
}
