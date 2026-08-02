package com.withpersona.sdk2.inquiry.selfie.selfieStep;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBinding;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.camera2.Camera2UtilsKt;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.camera2.CameraDirection;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.advancedCustomizations.AdvancedCustomizations;
import com.withpersona.sdk2.inquiry.advancedCustomizations.ViewControllerVersion;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda17;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieRestartCameraRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieInstructionsBinding;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewCapturesBinding;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieStepBinding;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieSubmittingScreenBinding;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy;
import com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$special$$inlined$lazyViewModel$4;
import dagger.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.idrnd.face.iad.capture.internal.e3;
import net.idrnd.face.iad.capture.internal.o0;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "Lcom/withpersona/sdk2/inquiry/shared/di/BaseWorkflowFragment;", "Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieStepBinding;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "<init>", "()V", "SelfieStepFragmentArgs", "selfie_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SelfieStepFragment extends BaseWorkflowFragment {
    public final FragmentArgsLazy args$delegate;
    public CameraPreview cameraPreview;
    public InquiryStateManager$$ExternalSyntheticLambda17 currentOutputHandler;
    public LayoutRunner currentRenderer;
    public FeatureFlagManager featureFlagManager;
    public SelfieWorkflow.Screen pendingRendering;
    public Lazy selfieDirectionFeed;
    public SystemUiController systemUiController;
    public TrackingEventsLogger trackingEventsLogger;
    public final kotlin.Lazy viewEnvironment$delegate;
    public final ViewModelLazy viewModel$delegate;
    public SelfieViewModel_Factory_Impl viewModelFactory;

    /* renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2SelfieStepBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieStepBinding;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            ViewGroup viewGroup = (ViewGroup) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.pi2_selfie_step, viewGroup, false);
            if (booleanValue) {
                viewGroup.addView(inflate);
            }
            if (inflate != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                return new Pi2SelfieStepBinding(frameLayout, frameLayout);
            }
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
    }

    public final class SelfieStepFragmentArgs implements Parcelable {
        public static final Parcelable.Creator<SelfieStepFragmentArgs> CREATOR = new PoseConfigs.Creator(24);
        public final SelfieWorkflow.Input props;

        public SelfieStepFragmentArgs(SelfieWorkflow.Input input) {
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

    public SelfieStepFragment() {
        super(AnonymousClass1.INSTANCE);
        ReflectionFactory reflectionFactory = Reflection.factory;
        this.args$delegate = new FragmentArgsLazy(reflectionFactory.getOrCreateKotlinClass(SelfieStepFragmentArgs.class), new ConvertFromJavaKt$$Lambda$4(this, 13));
        KClassImpl$Data$$Lambda$22 kClassImpl$Data$$Lambda$22 = new KClassImpl$Data$$Lambda$22(8, this, new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 6));
        kotlin.Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(new e3(this, 21), 22));
        this.viewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(SelfieViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 15), kClassImpl$Data$$Lambda$22, new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 16));
        this.viewEnvironment$delegate = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 29));
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        SelfieStepStateManager selfieStepStateManager = ((SelfieViewModel) this.viewModel$delegate.getValue()).selfieStepStateManager;
        collectAndRender((StateFlowImpl) selfieStepStateManager.next);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new TransitionWorker$run$1(selfieStepStateManager, this, null, 22), 3);
        SelfieWorkflow.Screen screen = this.pendingRendering;
        if (screen != null) {
            render(screen);
        }
        this.pendingRendering = null;
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment
    public final void render(SelfieWorkflow.Screen screen) {
        LayoutRunner layoutRunner;
        CameraController create;
        screen.getClass();
        ViewBinding viewBinding = this._binding;
        if (viewBinding == null) {
            this.pendingRendering = screen;
            return;
        }
        if (screen instanceof SelfieWorkflow.Screen.InstructionsScreen) {
            LayoutRunner layoutRunner2 = this.currentRenderer;
            SelfieInstructionsRunner selfieInstructionsRunner = layoutRunner2 instanceof SelfieInstructionsRunner ? (SelfieInstructionsRunner) layoutRunner2 : null;
            if (selfieInstructionsRunner == null) {
                viewBinding.getClass();
                ((Pi2SelfieStepBinding) viewBinding).content.removeAllViews();
                LayoutInflater from = LayoutInflater.from(getContext());
                ViewBinding viewBinding2 = this._binding;
                viewBinding2.getClass();
                selfieInstructionsRunner = new SelfieInstructionsRunner(Pi2SelfieInstructionsBinding.inflate(from, ((Pi2SelfieStepBinding) viewBinding2).content, true));
            }
            SelfieWorkflow.Screen.InstructionsScreen instructionsScreen = (SelfieWorkflow.Screen.InstructionsScreen) screen;
            SystemUiController systemUiController = this.systemUiController;
            if (systemUiController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            }
            selfieInstructionsRunner.showRendering(instructionsScreen, systemUiController);
            this.currentRenderer = selfieInstructionsRunner;
            return;
        }
        if (screen instanceof SelfieWorkflow.Screen.CameraScreen) {
            LayoutRunner layoutRunner3 = this.currentRenderer;
            CameraScreenRunner cameraScreenRunner = layoutRunner3 instanceof CameraScreenRunner ? (CameraScreenRunner) layoutRunner3 : null;
            if (cameraScreenRunner == null) {
                viewBinding.getClass();
                Context context = ((Pi2SelfieStepBinding) viewBinding).content.getContext();
                int i = AdvancedCustomizations.$r8$clinit;
                SelfieStepFragment$$ExternalSyntheticLambda0 selfieStepFragment$$ExternalSyntheticLambda0 = new SelfieStepFragment$$ExternalSyntheticLambda0(0);
                int ordinal = ((SelfieWorkflow.Screen.CameraScreen) screen).designVersion.ordinal();
                if (ordinal == 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("Invalid design version.");
                    return;
                }
                if (ordinal == 1) {
                    ViewControllerVersion[] viewControllerVersionArr = ViewControllerVersion.$VALUES;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    ViewControllerVersion[] viewControllerVersionArr2 = ViewControllerVersion.$VALUES;
                }
                context.getClass();
                ViewBinding viewBinding3 = this._binding;
                viewBinding3.getClass();
                BasicSelfieCaptureViewController newViewController = selfieStepFragment$$ExternalSyntheticLambda0.newViewController(context, ((Pi2SelfieStepBinding) viewBinding3).content);
                ViewBinding viewBinding4 = this._binding;
                viewBinding4.getClass();
                ((Pi2SelfieStepBinding) viewBinding4).content.removeAllViews();
                ViewBinding viewBinding5 = this._binding;
                viewBinding5.getClass();
                FrameLayout frameLayout = ((Pi2SelfieStepBinding) viewBinding5).content;
                ConstraintLayout constraintLayout = newViewController.binding.rootView_;
                constraintLayout.getClass();
                frameLayout.addView(constraintLayout);
                CameraPreview cameraPreview = this.cameraPreview;
                if (cameraPreview == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraPreview");
                    throw null;
                }
                Lazy lazy = this.selfieDirectionFeed;
                if (lazy == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selfieDirectionFeed");
                    throw null;
                }
                Object obj = lazy.get();
                obj.getClass();
                SelfieDirectionFeed selfieDirectionFeed = (SelfieDirectionFeed) obj;
                TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                if (trackingEventsLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("trackingEventsLogger");
                    throw null;
                }
                FeatureFlagManager featureFlagManager = this.featureFlagManager;
                if (featureFlagManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("featureFlagManager");
                    throw null;
                }
                cameraScreenRunner = new CameraScreenRunner(context, newViewController, cameraPreview, selfieDirectionFeed, trackingEventsLogger, featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$6));
            }
            SelfieWorkflow.Screen.CameraScreen cameraScreen = (SelfieWorkflow.Screen.CameraScreen) screen;
            SystemUiController systemUiController2 = this.systemUiController;
            if (systemUiController2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            }
            cameraScreenRunner.showRendering(cameraScreen, systemUiController2);
            this.currentRenderer = cameraScreenRunner;
            return;
        }
        boolean z = screen instanceof SelfieWorkflow.Screen.OldCameraScreen;
        kotlin.Lazy lazy2 = this.viewEnvironment$delegate;
        if (z) {
            LayoutRunner layoutRunner4 = this.currentRenderer;
            OldCameraScreenRunner oldCameraScreenRunner = layoutRunner4 instanceof OldCameraScreenRunner ? (OldCameraScreenRunner) layoutRunner4 : null;
            if (oldCameraScreenRunner == null) {
                SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen = (SelfieWorkflow.Screen.OldCameraScreen) screen;
                VideoCaptureMethod videoCaptureMethod = oldCameraScreen.videoCaptureMethod;
                viewBinding.getClass();
                Context context2 = ((Pi2SelfieStepBinding) viewBinding).rootView.getContext();
                Pi2OldSelfieCameraBinding inflate = Pi2OldSelfieCameraBinding.inflate(LayoutInflater.from(context2));
                Camera2PreviewView camera2PreviewView = inflate.camera2Preview;
                if (videoCaptureMethod != VideoCaptureMethod.None) {
                    Context applicationContext = context2.getApplicationContext();
                    applicationContext.getClass();
                    CameraChoices bestCameraChoices = Camera2UtilsKt.getBestCameraChoices(applicationContext, CameraDirection.FRONT);
                    if (bestCameraChoices == null) {
                        oldCameraScreen.onCameraError.invoke(new NoSuitableCameraError());
                        create = new o0(camera2PreviewView, 11);
                    } else {
                        Camera2Controller_Factory_Impl camera2Controller_Factory_Impl = oldCameraScreen.camera2ControllerFactory;
                        Lazy lazy3 = this.selfieDirectionFeed;
                        if (lazy3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("selfieDirectionFeed");
                            throw null;
                        }
                        Object obj2 = lazy3.get();
                        obj2.getClass();
                        create = camera2Controller_Factory_Impl.create(bestCameraChoices, camera2PreviewView, (Camera2ImageAnalyzer) obj2, VideoCaptureMethod.valueOf(videoCaptureMethod.toString()), oldCameraScreen.isAudioRequired);
                    }
                } else {
                    CameraXController_Factory_Impl cameraXController_Factory_Impl = oldCameraScreen.cameraXControllerFactory;
                    CameraPreview cameraPreview2 = this.cameraPreview;
                    if (cameraPreview2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cameraPreview");
                        throw null;
                    }
                    create = cameraXController_Factory_Impl.create(cameraPreview2, inflate.previewviewSelfieCamera, new MarkwonImpl(this, inflate, oldCameraScreen), oldCameraScreen.isAudioRequired);
                }
                ViewBinding viewBinding6 = this._binding;
                viewBinding6.getClass();
                ((Pi2SelfieStepBinding) viewBinding6).content.removeAllViews();
                ViewBinding viewBinding7 = this._binding;
                viewBinding7.getClass();
                ((Pi2SelfieStepBinding) viewBinding7).content.addView(inflate.rootView);
                Lazy lazy4 = this.selfieDirectionFeed;
                if (lazy4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selfieDirectionFeed");
                    throw null;
                }
                Object obj3 = lazy4.get();
                obj3.getClass();
                SelfieDirectionFeed selfieDirectionFeed2 = (SelfieDirectionFeed) obj3;
                TrackingEventsLogger trackingEventsLogger2 = this.trackingEventsLogger;
                if (trackingEventsLogger2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("trackingEventsLogger");
                    throw null;
                }
                oldCameraScreenRunner = new OldCameraScreenRunner(inflate, create, selfieDirectionFeed2, trackingEventsLogger2);
            }
            oldCameraScreenRunner.showRendering((SelfieWorkflow.Screen.OldCameraScreen) screen, (ViewEnvironment) lazy2.getValue());
            this.currentRenderer = oldCameraScreenRunner;
            return;
        }
        if (screen instanceof SelfieWorkflow.Screen.RestartCameraScreen) {
            LayoutRunner layoutRunner5 = this.currentRenderer;
            layoutRunner = layoutRunner5 instanceof SelfieRestartCameraRunner ? (SelfieRestartCameraRunner) layoutRunner5 : null;
            if (layoutRunner == null) {
                viewBinding.getClass();
                LayoutInflater from2 = LayoutInflater.from(((Pi2SelfieStepBinding) viewBinding).content.getContext());
                ViewBinding viewBinding8 = this._binding;
                viewBinding8.getClass();
                View inflate2 = from2.inflate(R.layout.pi2_selfie_camera_restart, (ViewGroup) ((Pi2SelfieStepBinding) viewBinding8).content, false);
                if (inflate2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("rootView");
                    return;
                }
                ViewBinding viewBinding9 = this._binding;
                viewBinding9.getClass();
                ((Pi2SelfieStepBinding) viewBinding9).content.removeAllViews();
                ViewBinding viewBinding10 = this._binding;
                viewBinding10.getClass();
                ((Pi2SelfieStepBinding) viewBinding10).content.addView((ConstraintLayout) inflate2);
                layoutRunner = new SelfieRestartCameraRunner();
            }
            ViewEnvironment viewEnvironment = (ViewEnvironment) lazy2.getValue();
            SandboxScreenRunner.Companion companion = SelfieRestartCameraRunner.Companion;
            viewEnvironment.getClass();
            ((SelfieWorkflow.Screen.RestartCameraScreen) screen).rendered.invoke();
            this.currentRenderer = layoutRunner;
            return;
        }
        if (screen instanceof SelfieWorkflow.Screen.ReviewCapturesScreen) {
            LayoutRunner layoutRunner6 = this.currentRenderer;
            layoutRunner = layoutRunner6 instanceof SelfieReviewCapturesRunner ? (SelfieReviewCapturesRunner) layoutRunner6 : null;
            if (layoutRunner == null) {
                viewBinding.getClass();
                LayoutInflater from3 = LayoutInflater.from(((Pi2SelfieStepBinding) viewBinding).content.getContext());
                ViewBinding viewBinding11 = this._binding;
                viewBinding11.getClass();
                Pi2SelfieReviewCapturesBinding inflate3 = Pi2SelfieReviewCapturesBinding.inflate(from3, ((Pi2SelfieStepBinding) viewBinding11).content, false);
                ViewBinding viewBinding12 = this._binding;
                viewBinding12.getClass();
                ((Pi2SelfieStepBinding) viewBinding12).content.removeAllViews();
                ViewBinding viewBinding13 = this._binding;
                viewBinding13.getClass();
                ((Pi2SelfieStepBinding) viewBinding13).content.addView(inflate3.rootView);
                layoutRunner = new SelfieReviewCapturesRunner(inflate3);
            }
            layoutRunner.showRendering((SelfieWorkflow.Screen.ReviewCapturesScreen) screen, (ViewEnvironment) lazy2.getValue());
            this.currentRenderer = layoutRunner;
            return;
        }
        if (!(screen instanceof SelfieWorkflow.Screen.SubmittingScreen)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LayoutRunner layoutRunner7 = this.currentRenderer;
        layoutRunner = layoutRunner7 instanceof SelfieSubmittingRunner ? (SelfieSubmittingRunner) layoutRunner7 : null;
        if (layoutRunner == null) {
            viewBinding.getClass();
            LayoutInflater from4 = LayoutInflater.from(((Pi2SelfieStepBinding) viewBinding).content.getContext());
            ViewBinding viewBinding14 = this._binding;
            viewBinding14.getClass();
            Pi2SelfieSubmittingScreenBinding inflate4 = Pi2SelfieSubmittingScreenBinding.inflate(from4, ((Pi2SelfieStepBinding) viewBinding14).content, false);
            ViewBinding viewBinding15 = this._binding;
            viewBinding15.getClass();
            ((Pi2SelfieStepBinding) viewBinding15).content.removeAllViews();
            ViewBinding viewBinding16 = this._binding;
            viewBinding16.getClass();
            ((Pi2SelfieStepBinding) viewBinding16).content.addView(inflate4.rootView);
            layoutRunner = new SelfieSubmittingRunner(inflate4);
        }
        layoutRunner.showRendering((SelfieWorkflow.Screen.SubmittingScreen) screen, (ViewEnvironment) lazy2.getValue());
        this.currentRenderer = layoutRunner;
    }
}
