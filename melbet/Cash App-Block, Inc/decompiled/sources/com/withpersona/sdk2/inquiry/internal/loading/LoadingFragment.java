package com.withpersona.sdk2.inquiry.internal.loading;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.camera.video.VideoCapture;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda25;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2InquiryInitializingBinding;
import com.withpersona.sdk2.inquiry.internal.state.LoadingStepModel;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/loading/LoadingFragment;", "Lcom/withpersona/sdk2/inquiry/shared/di/BaseDaggerFragment;", "Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2InquiryInitializingBinding;", "<init>", "()V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LoadingFragment extends BaseDaggerFragment {
    public Integer currentAnimationRes;
    public LoadingStepModel currentModel;
    public CameraHelper$$ExternalSyntheticLambda0 onBackPressHandler;
    public final RedwoodLayoutKt$toAndroid$1 onBackPressedCallback;
    public SystemUiController systemUiController;

    /* renamed from: com.withpersona.sdk2.inquiry.internal.loading.LoadingFragment$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2InquiryInitializingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2InquiryInitializingBinding;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            ViewGroup viewGroup = (ViewGroup) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.pi2_inquiry_initializing, viewGroup, false);
            if (booleanValue) {
                viewGroup.addView(inflate);
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.animationview_inquiry_initializingspinner);
            if (lottieAnimationView != null) {
                return new Pi2InquiryInitializingBinding((ConstraintLayout) inflate, lottieAnimationView);
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.animationview_inquiry_initializingspinner)));
            return null;
        }
    }

    public LoadingFragment() {
        super(AnonymousClass1.INSTANCE);
        this.onBackPressedCallback = new RedwoodLayoutKt$toAndroid$1(this, false, 11);
    }

    public static int getColorFromAttr$default(LoadingFragment loadingFragment, Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Context context = getContext();
        Integer resourceIdFromAttr$default = context != null ? ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaInquiryLoadingLottieRaw) : null;
        ViewBinding viewBinding = this._binding;
        viewBinding.getClass();
        LottieAnimationView lottieAnimationView = ((Pi2InquiryInitializingBinding) viewBinding).animationviewInquiryInitializingspinner;
        if (resourceIdFromAttr$default != null) {
            setLoadingAnimation(resourceIdFromAttr$default.intValue());
            lottieAnimationView.removeAllUpdateListeners();
        } else {
            final int i = 0;
            lottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.STROKE_COLOR, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback(this) { // from class: com.withpersona.sdk2.inquiry.internal.loading.LoadingFragment$$ExternalSyntheticLambda0
                public final /* synthetic */ LoadingFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                    int i2 = i;
                    View view2 = view;
                    LoadingFragment loadingFragment = this.f$0;
                    switch (i2) {
                        case 0:
                            Context context2 = view2.getContext();
                            context2.getClass();
                            return Integer.valueOf(LoadingFragment.getColorFromAttr$default(loadingFragment, context2, R.attr.colorPrimaryVariant));
                        default:
                            Context context3 = view2.getContext();
                            context3.getClass();
                            return Integer.valueOf(LoadingFragment.getColorFromAttr$default(loadingFragment, context3, R.attr.colorPrimary));
                    }
                }
            });
            final int i2 = 1;
            lottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback(this) { // from class: com.withpersona.sdk2.inquiry.internal.loading.LoadingFragment$$ExternalSyntheticLambda0
                public final /* synthetic */ LoadingFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                    int i22 = i2;
                    View view2 = view;
                    LoadingFragment loadingFragment = this.f$0;
                    switch (i22) {
                        case 0:
                            Context context2 = view2.getContext();
                            context2.getClass();
                            return Integer.valueOf(LoadingFragment.getColorFromAttr$default(loadingFragment, context2, R.attr.colorPrimaryVariant));
                        default:
                            Context context3 = view2.getContext();
                            context3.getClass();
                            return Integer.valueOf(LoadingFragment.getColorFromAttr$default(loadingFragment, context3, R.attr.colorPrimary));
                    }
                }
            });
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.addCallback(this.onBackPressedCallback, viewLifecycleOwner);
        LoadingStepModel loadingStepModel = this.currentModel;
        if (loadingStepModel != null) {
            render$inquiry_internal_release(loadingStepModel);
        }
    }

    public final void render$inquiry_internal_release(LoadingStepModel loadingStepModel) {
        int colorFromAttr$default;
        Integer backgroundColorValue;
        loadingStepModel.getClass();
        this.currentModel = loadingStepModel;
        ViewBinding viewBinding = this._binding;
        if (viewBinding != null) {
            viewBinding.getClass();
            ConstraintLayout constraintLayout = ((Pi2InquiryInitializingBinding) viewBinding).rootView;
            constraintLayout.getClass();
            VideoCapture.AnonymousClass3 anonymousClass3 = loadingStepModel.inquiryLoadingScreen;
            boolean z = anonymousClass3.val$isStreamActive;
            Context context = getContext();
            Integer resourceIdFromAttr$default = context != null ? ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaInquiryLoadingLottieRaw) : null;
            StepStyle stepStyle = (StepStyle) anonymousClass3.val$surfaceUpdateFuture;
            if (z && resourceIdFromAttr$default == null) {
                setLoadingAnimation(R.raw.pi2_initial_load_animation);
                ViewBinding viewBinding2 = this._binding;
                viewBinding2.getClass();
                ((Pi2InquiryInitializingBinding) viewBinding2).animationviewInquiryInitializingspinner.setScaleX(0.5f);
                ViewBinding viewBinding3 = this._binding;
                viewBinding3.getClass();
                ((Pi2InquiryInitializingBinding) viewBinding3).animationviewInquiryInitializingspinner.setScaleY(0.5f);
            }
            if (z) {
                Context context2 = constraintLayout.getContext();
                context2.getClass();
                Integer resourceIdFromAttr$default2 = ResToolsKt.resourceIdFromAttr$default(context2, R.attr.personaInitialLoadingBackgroundDrawable);
                if (resourceIdFromAttr$default2 != null) {
                    constraintLayout.setBackgroundResource(resourceIdFromAttr$default2.intValue());
                }
            }
            if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
                Context context3 = constraintLayout.getContext();
                context3.getClass();
                colorFromAttr$default = getColorFromAttr$default(this, context3, android.R.attr.colorBackground);
            } else {
                colorFromAttr$default = backgroundColorValue.intValue();
            }
            SystemUiController systemUiController = this.systemUiController;
            if (systemUiController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            }
            Context context4 = constraintLayout.getContext();
            context4.getClass();
            systemUiController.updateSystemUiColor(context4, colorFromAttr$default);
            if (stepStyle != null) {
                Integer backgroundColorValue2 = stepStyle.getBackgroundColorValue();
                if (backgroundColorValue2 != null) {
                    constraintLayout.setBackgroundColor(backgroundColorValue2.intValue());
                }
                Context context5 = constraintLayout.getContext();
                context5.getClass();
                Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(stepStyle, context5);
                if (backgroundImageDrawable != null) {
                    constraintLayout.setBackground(backgroundImageDrawable);
                }
                if (resourceIdFromAttr$default == null) {
                    Integer fillColorValue = stepStyle.getFillColorValue();
                    if (fillColorValue != null) {
                        int intValue = fillColorValue.intValue();
                        ViewBinding viewBinding4 = this._binding;
                        viewBinding4.getClass();
                        ((Pi2InquiryInitializingBinding) viewBinding4).animationviewInquiryInitializingspinner.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR, (SimpleLottieValueCallback<KeyPath>) new ExoPlayerImpl$$ExternalSyntheticLambda25(intValue, 3));
                    }
                    Integer strokeColorValue = stepStyle.getStrokeColorValue();
                    if (strokeColorValue != null) {
                        int intValue2 = strokeColorValue.intValue();
                        ViewBinding viewBinding5 = this._binding;
                        viewBinding5.getClass();
                        ((Pi2InquiryInitializingBinding) viewBinding5).animationviewInquiryInitializingspinner.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.STROKE_COLOR, (SimpleLottieValueCallback<KeyPath>) new ExoPlayerImpl$$ExternalSyntheticLambda25(intValue2, 4));
                    }
                }
            }
            this.onBackPressedCallback.setEnabled(true);
            this.onBackPressHandler = new CameraHelper$$ExternalSyntheticLambda0(anonymousClass3, 23);
        }
    }

    public final void setLoadingAnimation(int i) {
        Integer num = this.currentAnimationRes;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.currentAnimationRes = Integer.valueOf(i);
        ViewBinding viewBinding = this._binding;
        viewBinding.getClass();
        LottieAnimationView lottieAnimationView = ((Pi2InquiryInitializingBinding) viewBinding).animationviewInquiryInitializingspinner;
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setAnimation(i);
        lottieAnimationView.playAnimation();
    }
}
