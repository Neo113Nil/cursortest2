package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.transition.Scene;
import androidx.transition.Slide;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import androidx.viewbinding.ViewBinding;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.advancedCustomizations.AdvancedCustomizations;
import com.withpersona.sdk2.inquiry.advancedCustomizations.ViewControllerVersion;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdSubmittingRunner;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.BasicSelectCountryAndIdClassViewController;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2ErrorBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidChooseCaptureMethodBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidFragmentBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidInstructionsBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewSelectedImageBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidSubmittingScreenBinding;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ChooseCaptureMethodScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ErrorScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ReviewSelectedImageScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.BasicGovIdReviewCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.GovernmentIdReviewRunner;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.GovernmentIdReviewRunner$Companion$1$viewController$1;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy;
import com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$special$$inlined$lazyViewModel$4;
import dagger.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.idrnd.face.iad.capture.internal.e3;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "Lcom/withpersona/sdk2/inquiry/shared/di/BaseWorkflowFragment;", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidFragmentBinding;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "<init>", "()V", "GovernmentIdStepFragmentArgs", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GovernmentIdStepFragment extends BaseWorkflowFragment {
    public final FragmentArgsLazy args$delegate;
    public CameraController cameraController;
    public CameraPreview cameraPreview;
    public InquiryStateManager$$ExternalSyntheticLambda3 currentOutputHandler;
    public Object currentRunner;
    public Screen currentScreen;
    public FeatureFlagManager featureFlagManager;
    public Lazy governmentIdFeed;
    public Screen pendingRendering;
    public CameraScreenRunner retainedCameraRunner;
    public View retainedCameraView;
    public SystemUiController systemUiController;
    public TrackingEventsLogger trackingEventsLogger;
    public final kotlin.Lazy viewEnvironment$delegate;
    public final ViewModelLazy viewModel$delegate;
    public GovernmentIdStepViewModel_Factory_Impl viewModelFactory;

    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2GovernmentidFragmentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidFragmentBinding;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            ViewGroup viewGroup = (ViewGroup) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.pi2_governmentid_fragment, viewGroup, false);
            if (booleanValue) {
                viewGroup.addView(inflate);
            }
            if (inflate != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                return new Pi2GovernmentidFragmentBinding(frameLayout, frameLayout);
            }
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
    }

    public final class GovernmentIdStepFragmentArgs implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepFragmentArgs> CREATOR = new RawExtraction.Creator(24);
        public final GovernmentIdWorkflow.Input props;

        public GovernmentIdStepFragmentArgs(GovernmentIdWorkflow.Input input) {
            input.getClass();
            this.props = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.props.writeToParcel(parcel, i);
        }
    }

    public GovernmentIdStepFragment() {
        super(AnonymousClass1.INSTANCE);
        ReflectionFactory reflectionFactory = Reflection.factory;
        int i = 9;
        this.args$delegate = new FragmentArgsLazy(reflectionFactory.getOrCreateKotlinClass(GovernmentIdStepFragmentArgs.class), new ConvertFromJavaKt$$Lambda$4(this, i));
        this.viewEnvironment$delegate = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, i));
        KClassImpl$Data$$Lambda$22 kClassImpl$Data$$Lambda$22 = new KClassImpl$Data$$Lambda$22(3, this, new HCaptcha$$ExternalSyntheticLambda2(this, 22));
        kotlin.Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(new e3(this, 11), 12));
        this.viewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(GovernmentIdStepViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 3), kClassImpl$Data$$Lambda$22, new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 4));
    }

    public final void bindErrorRunner(Screen.ErrorScreen errorScreen, Context context) {
        Object obj = this.currentRunner;
        CoordinatorLayout coordinatorLayout = null;
        if (!(obj instanceof ErrorScreenRunner)) {
            obj = null;
        }
        ErrorScreenRunner errorScreenRunner = (ErrorScreenRunner) obj;
        if (errorScreenRunner == null) {
            LayoutInflater from = LayoutInflater.from(context);
            ViewBinding viewBinding = this._binding;
            viewBinding.getClass();
            Pi2ErrorBinding inflate = Pi2ErrorBinding.inflate(from, ((Pi2GovernmentidFragmentBinding) viewBinding).content, false);
            errorScreenRunner = new ErrorScreenRunner(inflate);
            coordinatorLayout = inflate.rootView;
        }
        Screen screen = this.currentScreen;
        errorScreen.getClass();
        ScreenTransition screenTransition = GovernmentIdKt.isSameScreenAs(errorScreen, screen) ? ScreenTransition.NONE : errorScreen.transition;
        if (coordinatorLayout != null) {
            maybePerformTransition(coordinatorLayout, screenTransition);
        }
        errorScreenRunner.showRendering(errorScreen, getViewEnvironment());
        this.currentRunner = errorScreenRunner;
    }

    public final Pair bindReviewScreenRunner(Screen.ReviewScreen reviewScreen) {
        ViewBinding viewBinding = this._binding;
        viewBinding.getClass();
        Context context = ((Pi2GovernmentidFragmentBinding) viewBinding).content.getContext();
        int i = AdvancedCustomizations.$r8$clinit;
        GovernmentIdReviewRunner$Companion$1$viewController$1 governmentIdReviewRunner$Companion$1$viewController$1 = new GovernmentIdReviewRunner$Companion$1$viewController$1(1);
        int ordinal = reviewScreen.designVersion.ordinal();
        if (ordinal == 0) {
            ViewControllerVersion[] viewControllerVersionArr = ViewControllerVersion.$VALUES;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ViewControllerVersion[] viewControllerVersionArr2 = ViewControllerVersion.$VALUES;
        }
        context.getClass();
        ViewBinding viewBinding2 = this._binding;
        viewBinding2.getClass();
        BasicGovIdReviewCaptureViewController newViewController = governmentIdReviewRunner$Companion$1$viewController$1.newViewController(context, ((Pi2GovernmentidFragmentBinding) viewBinding2).content);
        GovernmentIdReviewRunner governmentIdReviewRunner = new GovernmentIdReviewRunner(newViewController);
        FrameLayout frameLayout = newViewController.binding.rootView;
        frameLayout.getClass();
        return new Pair(governmentIdReviewRunner, frameLayout);
    }

    public final void bindSubmittingRunner(Screen.SubmittingScreen submittingScreen, Context context) {
        Object obj = this.currentRunner;
        ConstraintLayout constraintLayout = null;
        if (!(obj instanceof GovernmentIdSubmittingRunner)) {
            obj = null;
        }
        GovernmentIdSubmittingRunner governmentIdSubmittingRunner = (GovernmentIdSubmittingRunner) obj;
        if (governmentIdSubmittingRunner == null) {
            LayoutInflater from = LayoutInflater.from(context);
            ViewBinding viewBinding = this._binding;
            viewBinding.getClass();
            Pi2GovernmentidSubmittingScreenBinding inflate = Pi2GovernmentidSubmittingScreenBinding.inflate(from, ((Pi2GovernmentidFragmentBinding) viewBinding).content, false);
            governmentIdSubmittingRunner = new GovernmentIdSubmittingRunner(inflate);
            constraintLayout = inflate.rootView;
        }
        Screen screen = this.currentScreen;
        submittingScreen.getClass();
        ScreenTransition screenTransition = GovernmentIdKt.isSameScreenAs(submittingScreen, screen) ? ScreenTransition.NONE : submittingScreen.transition;
        if (constraintLayout != null) {
            maybePerformTransition(constraintLayout, screenTransition);
        }
        governmentIdSubmittingRunner.showRendering(submittingScreen, getViewEnvironment());
        this.currentRunner = governmentIdSubmittingRunner;
    }

    public final void cleanupRetainedCamera() {
        View view = this.retainedCameraView;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.retainedCameraRunner = null;
        this.retainedCameraView = null;
        this.cameraController = null;
    }

    public final ViewEnvironment getViewEnvironment() {
        return (ViewEnvironment) this.viewEnvironment$delegate.getValue();
    }

    public final void maybePerformTransition(View view, ScreenTransition screenTransition) {
        ViewBinding viewBinding = this._binding;
        viewBinding.getClass();
        Object tag = ((Pi2GovernmentidFragmentBinding) viewBinding).content.getTag(R.id.pi2_current_content_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (this.currentScreen == null) {
            screenTransition = ScreenTransition.NONE;
        }
        ViewBinding viewBinding2 = this._binding;
        if (view2 != null) {
            viewBinding2.getClass();
            FrameLayout frameLayout = ((Pi2GovernmentidFragmentBinding) viewBinding2).content;
            screenTransition.getClass();
            int ordinal = screenTransition.ordinal();
            if (ordinal == 0) {
                TransitionSet transitionSet = new TransitionSet();
                Slide slide = new Slide(8388611);
                slide.mTargets.add(view2);
                transitionSet.addTransition(slide);
                Slide slide2 = new Slide(8388613);
                slide2.mTargets.add(view);
                transitionSet.addTransition(slide2);
                transitionSet.setInterpolator(new AccelerateDecelerateInterpolator());
                TransitionManager.endTransitions(frameLayout);
                TransitionManager.go(new Scene(view, frameLayout), transitionSet);
            } else if (ordinal == 1) {
                TransitionSet transitionSet2 = new TransitionSet();
                Slide slide3 = new Slide(8388613);
                slide3.mTargets.add(view2);
                transitionSet2.addTransition(slide3);
                Slide slide4 = new Slide(8388611);
                slide4.mTargets.add(view);
                transitionSet2.addTransition(slide4);
                transitionSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                TransitionManager.endTransitions(frameLayout);
                TransitionManager.go(new Scene(view, frameLayout), transitionSet2);
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                TransitionManager.go(new Scene(view, frameLayout), null);
            }
        } else {
            viewBinding2.getClass();
            ((Pi2GovernmentidFragmentBinding) viewBinding2).content.addView(view);
        }
        ViewBinding viewBinding3 = this._binding;
        viewBinding3.getClass();
        ((Pi2GovernmentidFragmentBinding) viewBinding3).content.setTag(R.id.pi2_current_content_view, view);
    }

    @Override // com.withpersona.sdk2.inquiry.shared.baseFragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        cleanupRetainedCamera();
        super.onDestroyView();
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        GovernmentIdStepStateManager governmentIdStepStateManager = ((GovernmentIdStepViewModel) this.viewModel$delegate.getValue()).governmentIdStepStateManager;
        collectAndRender((StateFlowImpl) governmentIdStepStateManager.next);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new TransitionWorker$run$1(governmentIdStepStateManager, this, null, 4), 3);
        Screen screen = this.pendingRendering;
        if (screen != null) {
            render(screen);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [androidx.fragment.app.Fragment, com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment, com.withpersona.sdk2.inquiry.shared.baseFragment.BaseFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v25, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v37 */
    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment
    public final void render(Screen screen) {
        CoordinatorLayout coordinatorLayout;
        View view;
        screen.getClass();
        if (this._binding == null) {
            this.pendingRendering = screen;
            return;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        ?? r5 = 0;
        CoordinatorLayout coordinatorLayout2 = null;
        CoordinatorLayout coordinatorLayout3 = null;
        FrameLayout frameLayout = null;
        if (screen instanceof Screen.InstructionsScreen) {
            Object obj = this.currentRunner;
            if (!(obj instanceof GovernmentIdInstructionsRunner)) {
                obj = null;
            }
            GovernmentIdInstructionsRunner governmentIdInstructionsRunner = (GovernmentIdInstructionsRunner) obj;
            if (governmentIdInstructionsRunner == null) {
                LayoutInflater from = LayoutInflater.from(requireContext);
                ViewBinding viewBinding = this._binding;
                viewBinding.getClass();
                Pi2GovernmentidInstructionsBinding inflate = Pi2GovernmentidInstructionsBinding.inflate(from, ((Pi2GovernmentidFragmentBinding) viewBinding).content, false);
                GovernmentIdInstructionsRunner governmentIdInstructionsRunner2 = new GovernmentIdInstructionsRunner(inflate);
                coordinatorLayout2 = inflate.rootView;
                governmentIdInstructionsRunner = governmentIdInstructionsRunner2;
            }
            Screen.InstructionsScreen instructionsScreen = (Screen.InstructionsScreen) screen;
            ScreenTransition screenTransition = GovernmentIdKt.isSameScreenAs(instructionsScreen, this.currentScreen) ? ScreenTransition.NONE : instructionsScreen.transition;
            if (coordinatorLayout2 != null) {
                maybePerformTransition(coordinatorLayout2, screenTransition);
            }
            governmentIdInstructionsRunner.showRendering(instructionsScreen, getViewEnvironment());
            this.currentRunner = governmentIdInstructionsRunner;
        } else if (screen instanceof Screen.AutoClassificationSelectCountryAndIdClassScreen) {
            int i = AdvancedCustomizations.$r8$clinit;
            GovernmentIdStepFragment$render$viewController$1 governmentIdStepFragment$render$viewController$1 = new GovernmentIdStepFragment$render$viewController$1(0);
            Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen = (Screen.AutoClassificationSelectCountryAndIdClassScreen) screen;
            int ordinal = autoClassificationSelectCountryAndIdClassScreen.designVersion.ordinal();
            if (ordinal == 0) {
                ViewControllerVersion[] viewControllerVersionArr = ViewControllerVersion.$VALUES;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ViewControllerVersion[] viewControllerVersionArr2 = ViewControllerVersion.$VALUES;
            }
            ViewBinding viewBinding2 = this._binding;
            viewBinding2.getClass();
            BasicSelectCountryAndIdClassViewController newViewController = governmentIdStepFragment$render$viewController$1.newViewController(requireContext, ((Pi2GovernmentidFragmentBinding) viewBinding2).content);
            Object obj2 = this.currentRunner;
            if (!(obj2 instanceof SelectCountryAndIdClassRunner)) {
                obj2 = null;
            }
            SelectCountryAndIdClassRunner selectCountryAndIdClassRunner = (SelectCountryAndIdClassRunner) obj2;
            if (selectCountryAndIdClassRunner == null) {
                selectCountryAndIdClassRunner = new SelectCountryAndIdClassRunner(newViewController);
                coordinatorLayout3 = (CoordinatorLayout) newViewController.binding.rootView;
                coordinatorLayout3.getClass();
            }
            ScreenTransition screenTransition2 = GovernmentIdKt.isSameScreenAs(autoClassificationSelectCountryAndIdClassScreen, this.currentScreen) ? ScreenTransition.NONE : autoClassificationSelectCountryAndIdClassScreen.transition;
            if (coordinatorLayout3 != null) {
                maybePerformTransition(coordinatorLayout3, screenTransition2);
            }
            selectCountryAndIdClassRunner.showRendering(autoClassificationSelectCountryAndIdClassScreen, getViewEnvironment());
            this.currentRunner = selectCountryAndIdClassRunner;
        } else if (screen instanceof Screen.CameraScreen) {
            if ((this.currentScreen instanceof Screen.ReviewScreen) && (this.currentRunner instanceof GovernmentIdReviewRunner)) {
                ViewBinding viewBinding3 = this._binding;
                viewBinding3.getClass();
                Object tag = ((Pi2GovernmentidFragmentBinding) viewBinding3).content.getTag(R.id.pi2_current_content_view);
                View view2 = tag instanceof View ? (View) tag : null;
                if (view2 != null) {
                    ViewBinding viewBinding4 = this._binding;
                    viewBinding4.getClass();
                    ((Pi2GovernmentidFragmentBinding) viewBinding4).content.removeView(view2);
                }
            }
            View view3 = this.retainedCameraView;
            if (view3 != null) {
                view3.setVisibility(0);
                ViewBinding viewBinding5 = this._binding;
                viewBinding5.getClass();
                ((Pi2GovernmentidFragmentBinding) viewBinding5).content.setTag(R.id.pi2_current_content_view, this.retainedCameraView);
                CameraScreenRunner cameraScreenRunner = this.retainedCameraRunner;
                if (cameraScreenRunner != null) {
                    cameraScreenRunner.showRendering((Screen.CameraScreen) screen, getViewEnvironment());
                }
                this.currentRunner = this.retainedCameraRunner;
            } else {
                Object obj3 = this.currentRunner;
                if (!(obj3 instanceof CameraScreenRunner)) {
                    obj3 = null;
                }
                CameraScreenRunner cameraScreenRunner2 = (CameraScreenRunner) obj3;
                if (cameraScreenRunner2 == null) {
                    Screen.CameraScreen cameraScreen = (Screen.CameraScreen) screen;
                    ViewBinding viewBinding6 = this._binding;
                    viewBinding6.getClass();
                    Context context = ((Pi2GovernmentidFragmentBinding) viewBinding6).content.getContext();
                    int i2 = AdvancedCustomizations.$r8$clinit;
                    GovernmentIdStepFragment$$ExternalSyntheticLambda0 governmentIdStepFragment$$ExternalSyntheticLambda0 = new GovernmentIdStepFragment$$ExternalSyntheticLambda0();
                    int ordinal2 = cameraScreen.designVersion.ordinal();
                    if (ordinal2 == 0) {
                        ViewControllerVersion[] viewControllerVersionArr3 = ViewControllerVersion.$VALUES;
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        ViewControllerVersion[] viewControllerVersionArr4 = ViewControllerVersion.$VALUES;
                    }
                    GovernmentIdStepFragment$$ExternalSyntheticLambda0 governmentIdStepFragment$$ExternalSyntheticLambda02 = governmentIdStepFragment$$ExternalSyntheticLambda0;
                    Lazy lazy = this.governmentIdFeed;
                    if (lazy == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("governmentIdFeed");
                        throw null;
                    }
                    Object obj4 = lazy.get();
                    obj4.getClass();
                    GovernmentIdFeed governmentIdFeed = (GovernmentIdFeed) obj4;
                    CameraPreview cameraPreview = this.cameraPreview;
                    if (cameraPreview == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cameraPreview");
                        throw null;
                    }
                    FeatureFlagManager featureFlagManager = this.featureFlagManager;
                    if (featureFlagManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("featureFlagManager");
                        throw null;
                    }
                    context.getClass();
                    ViewBinding viewBinding7 = this._binding;
                    viewBinding7.getClass();
                    BasicGovIdCaptureViewController newViewController2 = governmentIdStepFragment$$ExternalSyntheticLambda02.newViewController(governmentIdFeed, cameraPreview, featureFlagManager, cameraScreen, context, ((Pi2GovernmentidFragmentBinding) viewBinding7).content);
                    CameraController cameraController = newViewController2.cameraController;
                    this.cameraController = cameraController;
                    Lazy lazy2 = this.governmentIdFeed;
                    if (lazy2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("governmentIdFeed");
                        throw null;
                    }
                    Object obj5 = lazy2.get();
                    obj5.getClass();
                    GovernmentIdFeed governmentIdFeed2 = (GovernmentIdFeed) obj5;
                    TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                    if (trackingEventsLogger == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("trackingEventsLogger");
                        throw null;
                    }
                    CameraScreenRunner cameraScreenRunner3 = new CameraScreenRunner(context, newViewController2, cameraController, governmentIdFeed2, trackingEventsLogger);
                    frameLayout = newViewController2.getRoot();
                    cameraScreenRunner2 = cameraScreenRunner3;
                }
                Screen.CameraScreen cameraScreen2 = (Screen.CameraScreen) screen;
                ScreenTransition screenTransition3 = GovernmentIdKt.isSameScreenAs(cameraScreen2, this.currentScreen) ? ScreenTransition.NONE : cameraScreen2.transition;
                if (frameLayout != null) {
                    maybePerformTransition(frameLayout, screenTransition3);
                }
                cameraScreenRunner2.showRendering(cameraScreen2, getViewEnvironment());
                this.currentRunner = cameraScreenRunner2;
            }
        } else if (screen instanceof Screen.ChooseCaptureMethodScreen) {
            Object obj6 = this.currentRunner;
            if (!(obj6 instanceof ChooseCaptureMethodScreenRunner)) {
                obj6 = null;
            }
            ChooseCaptureMethodScreenRunner chooseCaptureMethodScreenRunner = (ChooseCaptureMethodScreenRunner) obj6;
            if (chooseCaptureMethodScreenRunner == null) {
                LayoutInflater from2 = LayoutInflater.from(requireContext);
                ViewBinding viewBinding8 = this._binding;
                viewBinding8.getClass();
                Pi2GovernmentidChooseCaptureMethodBinding inflate2 = Pi2GovernmentidChooseCaptureMethodBinding.inflate(from2, ((Pi2GovernmentidFragmentBinding) viewBinding8).content, false);
                ChooseCaptureMethodScreenRunner chooseCaptureMethodScreenRunner2 = new ChooseCaptureMethodScreenRunner(inflate2);
                CoordinatorLayout coordinatorLayout4 = inflate2.rootView;
                chooseCaptureMethodScreenRunner = chooseCaptureMethodScreenRunner2;
                r5 = coordinatorLayout4;
            }
            Screen.ChooseCaptureMethodScreen chooseCaptureMethodScreen = (Screen.ChooseCaptureMethodScreen) screen;
            ScreenTransition screenTransition4 = GovernmentIdKt.isSameScreenAs(chooseCaptureMethodScreen, this.currentScreen) ? ScreenTransition.NONE : chooseCaptureMethodScreen.transition;
            if (r5 != 0) {
                maybePerformTransition(r5, screenTransition4);
            }
            chooseCaptureMethodScreenRunner.showRendering(chooseCaptureMethodScreen, getViewEnvironment());
            this.currentRunner = chooseCaptureMethodScreenRunner;
        } else if (screen instanceof Screen.ErrorScreen) {
            Screen.ErrorScreen errorScreen = (Screen.ErrorScreen) screen;
            if (errorScreen.videoCaptureEnabled && this.cameraController != null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new Logger$log$1((Object) this, screen, requireContext, (Continuation) r5, 16), 3);
                return;
            }
            bindErrorRunner(errorScreen, requireContext);
        } else if (screen instanceof Screen.ReviewScreen) {
            Screen.ReviewScreen reviewScreen = (Screen.ReviewScreen) screen;
            if (reviewScreen.keepCameraAlive) {
                Object obj7 = this.currentRunner;
                if ((obj7 instanceof CameraScreenRunner) && (this.currentScreen instanceof Screen.CameraScreen)) {
                    this.retainedCameraRunner = (CameraScreenRunner) obj7;
                    ViewBinding viewBinding9 = this._binding;
                    viewBinding9.getClass();
                    Object tag2 = ((Pi2GovernmentidFragmentBinding) viewBinding9).content.getTag(R.id.pi2_current_content_view);
                    View view4 = tag2 instanceof View ? (View) tag2 : null;
                    this.retainedCameraView = view4;
                    if (view4 != null) {
                        view4.setVisibility(4);
                    }
                    Pair bindReviewScreenRunner = bindReviewScreenRunner(reviewScreen);
                    GovernmentIdReviewRunner governmentIdReviewRunner = (GovernmentIdReviewRunner) bindReviewScreenRunner.first;
                    View view5 = (View) bindReviewScreenRunner.second;
                    ViewBinding viewBinding10 = this._binding;
                    viewBinding10.getClass();
                    ((Pi2GovernmentidFragmentBinding) viewBinding10).content.addView(view5);
                    ViewBinding viewBinding11 = this._binding;
                    viewBinding11.getClass();
                    ((Pi2GovernmentidFragmentBinding) viewBinding11).content.setTag(R.id.pi2_current_content_view, view5);
                    governmentIdReviewRunner.showRendering(reviewScreen, getViewEnvironment());
                    this.currentRunner = governmentIdReviewRunner;
                }
            }
            Object obj8 = this.currentRunner;
            if (!(obj8 instanceof GovernmentIdReviewRunner)) {
                obj8 = null;
            }
            Object obj9 = (GovernmentIdReviewRunner) obj8;
            if (obj9 == null) {
                Pair bindReviewScreenRunner2 = bindReviewScreenRunner(reviewScreen);
                obj9 = bindReviewScreenRunner2.first;
                view = (View) bindReviewScreenRunner2.second;
            } else {
                view = null;
            }
            ScreenTransition screenTransition5 = GovernmentIdKt.isSameScreenAs(reviewScreen, this.currentScreen) ? ScreenTransition.NONE : reviewScreen.transition;
            if (view != null) {
                maybePerformTransition(view, screenTransition5);
            }
            ((GovernmentIdReviewRunner) obj9).showRendering(reviewScreen, getViewEnvironment());
            this.currentRunner = obj9;
        } else if (screen instanceof Screen.ReviewSelectedImageScreen) {
            Object obj10 = this.currentRunner;
            if (!(obj10 instanceof ReviewSelectedImageScreenRunner)) {
                obj10 = null;
            }
            ReviewSelectedImageScreenRunner reviewSelectedImageScreenRunner = (ReviewSelectedImageScreenRunner) obj10;
            if (reviewSelectedImageScreenRunner == null) {
                LayoutInflater from3 = LayoutInflater.from(requireContext);
                ViewBinding viewBinding12 = this._binding;
                viewBinding12.getClass();
                Pi2GovernmentidReviewSelectedImageBinding inflate3 = Pi2GovernmentidReviewSelectedImageBinding.inflate(from3, ((Pi2GovernmentidFragmentBinding) viewBinding12).content, false);
                reviewSelectedImageScreenRunner = new ReviewSelectedImageScreenRunner(inflate3);
                coordinatorLayout = inflate3.rootView;
            } else {
                coordinatorLayout = null;
            }
            Screen.ReviewSelectedImageScreen reviewSelectedImageScreen = (Screen.ReviewSelectedImageScreen) screen;
            ScreenTransition screenTransition6 = GovernmentIdKt.isSameScreenAs(reviewSelectedImageScreen, this.currentScreen) ? ScreenTransition.NONE : reviewSelectedImageScreen.transition;
            if (coordinatorLayout != null) {
                maybePerformTransition(coordinatorLayout, screenTransition6);
            }
            reviewSelectedImageScreenRunner.showRendering(reviewSelectedImageScreen, getViewEnvironment());
            this.currentRunner = reviewSelectedImageScreenRunner;
        } else {
            if (!(screen instanceof Screen.SubmittingScreen)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Screen.SubmittingScreen submittingScreen = (Screen.SubmittingScreen) screen;
            if (submittingScreen.isFinalizingVideoCapture) {
                CameraController cameraController2 = this.cameraController;
                LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner2.getLifecycle()), null, null, new FlowKt__LimitKt$transformWhile$1(cameraController2, this, screen, requireContext, null, 8), 3);
                return;
            }
            bindSubmittingRunner(submittingScreen, requireContext);
        }
        this.currentScreen = screen;
    }
}
