package com.withpersona.sdk2.inquiry.selfie.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.tax.views.databinding.TaxWebAppLayoutBinding;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes9.dex */
public final class OldSelfieOverlayView extends ConstraintLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final TaxWebAppLayoutBinding binding;
    public ViewState currentViewState;
    public final Lazy drawableLeft$delegate;
    public final Lazy drawableRight$delegate;
    public final int leftPoseAnimation;
    public RemoteImage leftPoseImage;
    public final ArrayList oneShotOnAnimationCompleteListeners;
    public final ArrayList oneShotOnCompositionLoadedListeners;
    public View previewView;
    public View remoteImageView;
    public final int rightPoseAnimation;
    public RemoteImage rightPoseImage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ViewState {
        public static final /* synthetic */ ViewState[] $VALUES;
        public static final ViewState CENTER;
        public static final ViewState CENTER_COMPLETE;
        public static final ViewState CLEAR;
        public static final ViewState COMPLETE;
        public static final ViewState COMPLETE_WITH_CAPTURE;
        public static final ViewState FINALIZING;
        public static final ViewState LOOK_LEFT;
        public static final ViewState LOOK_LEFT_COMPLETE;
        public static final ViewState LOOK_LEFT_HINT;
        public static final ViewState LOOK_RIGHT;
        public static final ViewState LOOK_RIGHT_COMPLETE;
        public static final ViewState LOOK_RIGHT_HINT;

        static {
            ViewState viewState = new ViewState("CLEAR", 0);
            CLEAR = viewState;
            ViewState viewState2 = new ViewState("CENTER", 1);
            CENTER = viewState2;
            ViewState viewState3 = new ViewState("CENTER_COMPLETE", 2);
            CENTER_COMPLETE = viewState3;
            ViewState viewState4 = new ViewState("LOOK_LEFT_HINT", 3);
            LOOK_LEFT_HINT = viewState4;
            ViewState viewState5 = new ViewState("LOOK_LEFT", 4);
            LOOK_LEFT = viewState5;
            ViewState viewState6 = new ViewState("LOOK_LEFT_COMPLETE", 5);
            LOOK_LEFT_COMPLETE = viewState6;
            ViewState viewState7 = new ViewState("LOOK_RIGHT_HINT", 6);
            LOOK_RIGHT_HINT = viewState7;
            ViewState viewState8 = new ViewState("LOOK_RIGHT", 7);
            LOOK_RIGHT = viewState8;
            ViewState viewState9 = new ViewState("LOOK_RIGHT_COMPLETE", 8);
            LOOK_RIGHT_COMPLETE = viewState9;
            ViewState viewState10 = new ViewState("FINALIZING", 9);
            FINALIZING = viewState10;
            ViewState viewState11 = new ViewState("COMPLETE_WITH_CAPTURE", 10);
            COMPLETE_WITH_CAPTURE = viewState11;
            ViewState viewState12 = new ViewState("COMPLETE", 11);
            COMPLETE = viewState12;
            $VALUES = new ViewState[]{viewState, viewState2, viewState3, viewState4, viewState5, viewState6, viewState7, viewState8, viewState9, viewState10, viewState11, viewState12};
        }

        public static ViewState valueOf(String str) {
            return (ViewState) Enum.valueOf(ViewState.class, str);
        }

        public static ViewState[] values() {
            return (ViewState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.pi2_old_selfie_overlay, this);
        int i2 = R.id.blinds_view;
        View findChildViewById = ViewBindings.findChildViewById(this, R.id.blinds_view);
        if (findChildViewById != null) {
            i2 = R.id.circle_mask;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) ViewBindings.findChildViewById(this, R.id.circle_mask);
            if (pi2CircleMaskView != null) {
                i2 = R.id.hint_animation;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(this, R.id.hint_animation);
                if (themeableLottieAnimationView != null) {
                    i2 = R.id.hint_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(this, R.id.hint_image);
                    if (imageView != null) {
                        i2 = R.id.hint_overlay_view;
                        View findChildViewById2 = ViewBindings.findChildViewById(this, R.id.hint_overlay_view);
                        if (findChildViewById2 != null) {
                            i2 = R.id.image_overlay_view;
                            View findChildViewById3 = ViewBindings.findChildViewById(this, R.id.image_overlay_view);
                            if (findChildViewById3 != null) {
                                i2 = R.id.progress_arc;
                                Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) ViewBindings.findChildViewById(this, R.id.progress_arc);
                                if (pi2ProgressArcView != null) {
                                    this.binding = new TaxWebAppLayoutBinding(this, findChildViewById, pi2CircleMaskView, themeableLottieAnimationView, imageView, findChildViewById2, findChildViewById3, pi2ProgressArcView);
                                    this.drawableLeft$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 17));
                                    this.drawableRight$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 18));
                                    Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaSelfieLookLeftLottieRaw);
                                    this.leftPoseAnimation = resourceIdFromAttr$default != null ? resourceIdFromAttr$default.intValue() : R.raw.pi2_selfie_left_pose;
                                    Integer resourceIdFromAttr$default2 = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaSelfieLookLeftLottieRaw);
                                    this.rightPoseAnimation = resourceIdFromAttr$default2 != null ? resourceIdFromAttr$default2.intValue() : R.raw.pi2_selfie_right_pose;
                                    this.oneShotOnCompositionLoadedListeners = new ArrayList();
                                    this.oneShotOnAnimationCompleteListeners = new ArrayList();
                                    themeableLottieAnimationView.addLottieOnCompositionLoadedListener(new OldSelfieOverlayView$$ExternalSyntheticLambda2(this, 0));
                                    themeableLottieAnimationView.addAnimatorListener(new Transition.AnonymousClass3(this, 15));
                                    int parseColor = Color.parseColor("#022050");
                                    Context context2 = getContext();
                                    context2.getClass();
                                    themeableLottieAnimationView.addColorReplacement(parseColor, ResToolsKt.getColorFromAttr$default(context2, R.attr.colorPrimaryVariant));
                                    int parseColor2 = Color.parseColor("#AA85FF");
                                    Context context3 = getContext();
                                    context3.getClass();
                                    themeableLottieAnimationView.addColorReplacement(parseColor2, ResToolsKt.getColorFromAttr$default(context3, R.attr.colorSecondary));
                                    int parseColor3 = Color.parseColor("#280087");
                                    Context context4 = getContext();
                                    context4.getClass();
                                    themeableLottieAnimationView.addColorReplacement(parseColor3, ResToolsKt.getColorFromAttr$default(context4, R.attr.colorPrimaryVariant));
                                    int parseColor4 = Color.parseColor("#8552FF");
                                    Context context5 = getContext();
                                    context5.getClass();
                                    themeableLottieAnimationView.addColorReplacement(parseColor4, ResToolsKt.getColorFromAttr$default(context5, R.attr.colorSecondary));
                                    Context context6 = getContext();
                                    context6.getClass();
                                    int colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context6, R.attr.colorSecondary);
                                    Context context7 = getContext();
                                    context7.getClass();
                                    themeableLottieAnimationView.addColorReplacement(Color.parseColor("#DBCCFF"), ColorUtils.blendARGB(0.66f, colorFromAttr$default, ResToolsKt.getColorFromAttr$default(context7, R.attr.colorSurface)));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static ViewPropertyAnimator animateHide(View view, long j) {
        ViewPropertyAnimator withEndAction = view.animate().alpha(RecyclerView.DECELERATION_RATE).setDuration(j).withEndAction(new ViewUtils$$ExternalSyntheticLambda0(view, 6));
        withEndAction.getClass();
        return withEndAction;
    }

    public static ViewPropertyAnimator animateShow(View view, long j) {
        if (view.getVisibility() != 0) {
            view.setAlpha(RecyclerView.DECELERATION_RATE);
            view.setVisibility(0);
        }
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j);
        duration.getClass();
        return duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setState$default(OldSelfieOverlayView oldSelfieOverlayView, ViewState viewState, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        oldSelfieOverlayView.setState(viewState, z, (Function0<Unit>) function0);
    }

    public static void switchImageDrawable(ImageView imageView, Drawable drawable) {
        if (Intrinsics.areEqual(imageView.getDrawable(), drawable)) {
            return;
        }
        if (drawable == null) {
            animateHide(imageView, 200L).withEndAction(new Task$$ExternalSyntheticLambda0(imageView, 12));
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setAlpha(RecyclerView.DECELERATION_RATE);
        animateShow(imageView, 200L);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void playBlinkAnimation(TaxWebAppLayoutBinding taxWebAppLayoutBinding, Function0 function0) {
        animateShow(taxWebAppLayoutBinding.rootView, 80L).withEndAction(new r6$$ExternalSyntheticLambda0(this, taxWebAppLayoutBinding, function0));
    }

    public final void setLeftPoseImage(RemoteImage remoteImage) {
        this.leftPoseImage = remoteImage;
    }

    public final void setPreviewView(View view) {
        view.getClass();
        this.previewView = view;
    }

    public final void setRightPoseImage(RemoteImage remoteImage) {
        this.rightPoseImage = remoteImage;
    }

    public final void setState(ViewState viewState, boolean z, final Function0<Unit> function0) {
        viewState.getClass();
        if (this.currentViewState == viewState) {
            return;
        }
        this.currentViewState = viewState;
        removeView(this.remoteImageView);
        Context context = getContext();
        context.getClass();
        final int i = 1;
        final int i2 = 0;
        boolean z2 = (ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaSelfieLookLeftDrawable) == null || ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaSelfieLookRightDrawable) == null) && this.leftPoseImage == null && this.rightPoseImage == null;
        TaxWebAppLayoutBinding taxWebAppLayoutBinding = this.binding;
        if (z) {
            ((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar).setVisibility(0);
        } else {
            ((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar).setVisibility(8);
        }
        switch (viewState.ordinal()) {
            case 0:
                Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton;
                if (pi2CircleMaskView.getScaleX() != 5.0f || pi2CircleMaskView.getScaleY() != 5.0f) {
                    ViewPropertyAnimator animate = pi2CircleMaskView.animate();
                    animate.setDuration(MathKt__MathJVMKt.roundToLong((Math.abs(pi2CircleMaskView.getScaleX() - 5.0f) / 4.0f) * 500.0f));
                    animate.scaleX(5.0f);
                    animate.scaleY(5.0f);
                    animate.start();
                }
                ((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar).setProgress(RecyclerView.DECELERATION_RATE, function0);
                break;
            case 1:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                ((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar).setProgress(RecyclerView.DECELERATION_RATE, function0);
                break;
            case 2:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                Pi2ProgressArcView.setProgress$default((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar, RecyclerView.DECELERATION_RATE, null, 2, null);
                playBlinkAnimation(taxWebAppLayoutBinding, function0);
                break;
            case 3:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                Pi2ProgressArcView.setProgress$default((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar, RecyclerView.DECELERATION_RATE, null, 2, null);
                if (!z2) {
                    if (function0 != null) {
                        function0.invoke();
                        break;
                    }
                } else {
                    switchAnimation(taxWebAppLayoutBinding, this.leftPoseAnimation, function0);
                    break;
                }
                break;
            case 4:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                ((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar).setProgress(RecyclerView.DECELERATION_RATE, function0);
                if (!z2) {
                    RemoteImage remoteImage = this.leftPoseImage;
                    if (remoteImage == null) {
                        taxWebAppLayoutBinding.taxWebAppLoadingView.setVisibility(0);
                        switchImageDrawable((ImageView) taxWebAppLayoutBinding.taxWebAppToolbarTitle, (Drawable) this.drawableLeft$delegate.getValue());
                        break;
                    } else {
                        this.remoteImageView = RemoteImageUtilsKt.renderToContainer(remoteImage, this, true);
                        break;
                    }
                }
                break;
            case 5:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                Pi2ProgressArcView.setProgress$default((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar, 50.0f, null, 2, null);
                playBlinkAnimation(taxWebAppLayoutBinding, function0);
                break;
            case 6:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                Pi2ProgressArcView.setProgress$default((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar, 50.0f, null, 2, null);
                if (!z2) {
                    if (function0 != null) {
                        function0.invoke();
                        break;
                    }
                } else {
                    switchAnimation(taxWebAppLayoutBinding, this.rightPoseAnimation, function0);
                    break;
                }
                break;
            case 7:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                ((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar).setProgress(50.0f, function0);
                if (!z2) {
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    if (remoteImage2 == null) {
                        taxWebAppLayoutBinding.taxWebAppLoadingView.setVisibility(0);
                        switchImageDrawable((ImageView) taxWebAppLayoutBinding.taxWebAppToolbarTitle, (Drawable) this.drawableRight$delegate.getValue());
                        break;
                    } else {
                        this.remoteImageView = RemoteImageUtilsKt.renderToContainer(remoteImage2, this, true);
                        break;
                    }
                }
                break;
            case 8:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                Pi2ProgressArcView.setProgress$default((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar, 100.0f, null, 2, null);
                playBlinkAnimation(taxWebAppLayoutBinding, function0);
                break;
            case 9:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                ((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar).setIndeterminate();
                break;
            case 10:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                Pi2ProgressArcView.setProgress$default((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar, 100.0f, null, 2, null);
                playBlinkAnimation(taxWebAppLayoutBinding, new Function0(this) { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda3
                    public final /* synthetic */ OldSelfieOverlayView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        Function0 function02 = function0;
                        OldSelfieOverlayView oldSelfieOverlayView = this.f$0;
                        switch (i3) {
                            case 0:
                                oldSelfieOverlayView.switchAnimation(oldSelfieOverlayView.binding, R.raw.pi2_selfie_capture_success, function02);
                                break;
                            default:
                                oldSelfieOverlayView.switchAnimation(oldSelfieOverlayView.binding, R.raw.pi2_selfie_capture_success, function02);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                break;
            case 11:
                Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, null, 3);
                ((Pi2ProgressArcView) taxWebAppLayoutBinding.taxWebAppToolbar).setProgress(100.0f, new Function0(this) { // from class: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda3
                    public final /* synthetic */ OldSelfieOverlayView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i;
                        Function0 function02 = function0;
                        OldSelfieOverlayView oldSelfieOverlayView = this.f$0;
                        switch (i3) {
                            case 0:
                                oldSelfieOverlayView.switchAnimation(oldSelfieOverlayView.binding, R.raw.pi2_selfie_capture_success, function02);
                                break;
                            default:
                                oldSelfieOverlayView.switchAnimation(oldSelfieOverlayView.binding, R.raw.pi2_selfie_capture_success, function02);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                break;
        }
    }

    public final void switchAnimation(TaxWebAppLayoutBinding taxWebAppLayoutBinding, int i, Function0 function0) {
        this.oneShotOnCompositionLoadedListeners.add(new UiScreenRunner$$ExternalSyntheticLambda29(22, taxWebAppLayoutBinding, this, function0));
        ((ThemeableLottieAnimationView) taxWebAppLayoutBinding.taxWebAppErrorText).setAnimation(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ OldSelfieOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
