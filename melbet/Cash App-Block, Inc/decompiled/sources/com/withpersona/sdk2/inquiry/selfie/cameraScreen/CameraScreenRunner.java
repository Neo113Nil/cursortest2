package com.withpersona.sdk2.inquiry.selfie.cameraScreen;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.video.VideoCapture;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.integrity.internal.ah;
import com.google.common.hash.AbstractHashFunction;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.camera.SelfieProcessor;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.camera2.Camera2UtilsKt;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.camera2.CameraDirection;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda6;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$AutoCapture;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$CountDown;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$Transition;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;

/* loaded from: classes9.dex */
public final class CameraScreenRunner implements LayoutRunner {
    public CameraController cameraController;
    public final List cameraFacingDirections;
    public final CameraPreview cameraPreview;
    public StandaloneCoroutine cameraStateListenerJob;
    public final Context context;
    public Function1 currentErrorHandler;
    public CameraProperties.FacingMode currentFacingMode;
    public final LifecycleCoroutineScopeImpl lifecycleScope;
    public StandaloneCoroutine maxRecordingLimitJob;
    public Function0 permissionChangedHandler;
    public final SelfieDirectionFeed selfieDirectionFeed;
    public boolean takingManualCapture;
    public final TrackingEventsLogger trackingEventsLogger;
    public final boolean useCameraXForVideo;
    public final BasicSelfieCaptureViewController viewController;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Selfie.Pose.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Selfie.Pose pose = Selfie.Pose.Center;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Selfie.Pose pose2 = Selfie.Pose.Center;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SelfieWorkflow.Screen.CameraScreen.Overlay.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SelfieWorkflow.Screen.CameraScreen.Overlay overlay = SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
                iArr2[4] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SelfieWorkflow.Screen.CameraScreen.Overlay overlay2 = SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                SelfieWorkflow.Screen.CameraScreen.Overlay overlay3 = SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
                iArr2[2] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                SelfieWorkflow.Screen.CameraScreen.Overlay overlay4 = SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
                iArr2[3] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[CameraProperties.FacingMode.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                CameraProperties.FacingMode facingMode = CameraProperties.FacingMode.User;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                CameraProperties.FacingMode facingMode2 = CameraProperties.FacingMode.User;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[VideoCaptureMethod.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                VideoCaptureMethod videoCaptureMethod = VideoCaptureMethod.Stream;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                VideoCaptureMethod videoCaptureMethod2 = VideoCaptureMethod.Stream;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public CameraScreenRunner(Context context, BasicSelfieCaptureViewController basicSelfieCaptureViewController, CameraPreview cameraPreview, SelfieDirectionFeed selfieDirectionFeed, TrackingEventsLogger trackingEventsLogger, boolean z) {
        context.getClass();
        cameraPreview.getClass();
        selfieDirectionFeed.getClass();
        trackingEventsLogger.getClass();
        this.context = context;
        this.viewController = basicSelfieCaptureViewController;
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.useCameraXForVideo = z;
        this.lifecycleScope = ViewModelKt.getCoroutineScope(ContextUtilsKt.requireLifecycleOwner(context).getLifecycle());
        ArrayList allCameraChoices = Camera2UtilsKt.getAllCameraChoices(context);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allCameraChoices, 10));
        Iterator it = allCameraChoices.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraChoice) it.next()).facingMode);
        }
        this.cameraFacingDirections = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList));
        final BasicSelfieCaptureViewController basicSelfieCaptureViewController2 = this.viewController;
        Pi2SelfieCameraBinding pi2SelfieCameraBinding = basicSelfieCaptureViewController2.binding;
        final int i = 0;
        InsetsUtilsKt.onInsetsChanged(pi2SelfieCameraBinding.topSpace, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                BasicSelfieCaptureViewController basicSelfieCaptureViewController3 = basicSelfieCaptureViewController2;
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                switch (i2) {
                    case 0:
                        windowInsetsCompat.getClass();
                        Insets insetsIgnoringVisibility = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                        insetsIgnoringVisibility.getClass();
                        Space space = basicSelfieCaptureViewController3.binding.topSpace;
                        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                        if (layoutParams == null) {
                            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            break;
                        } else {
                            layoutParams.height = insetsIgnoringVisibility.top;
                            space.setLayoutParams(layoutParams);
                            break;
                        }
                    default:
                        windowInsetsCompat.getClass();
                        Insets insetsIgnoringVisibility2 = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                        insetsIgnoringVisibility2.getClass();
                        Space space2 = basicSelfieCaptureViewController3.binding.bottomSpace;
                        ViewGroup.LayoutParams layoutParams2 = space2.getLayoutParams();
                        if (layoutParams2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            break;
                        } else {
                            layoutParams2.height = insetsIgnoringVisibility2.bottom;
                            space2.setLayoutParams(layoutParams2);
                            break;
                        }
                }
                return null;
            }
        });
        final int i2 = 1;
        InsetsUtilsKt.onInsetsChanged(pi2SelfieCameraBinding.bottomSpace, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                BasicSelfieCaptureViewController basicSelfieCaptureViewController3 = basicSelfieCaptureViewController2;
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                switch (i22) {
                    case 0:
                        windowInsetsCompat.getClass();
                        Insets insetsIgnoringVisibility = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                        insetsIgnoringVisibility.getClass();
                        Space space = basicSelfieCaptureViewController3.binding.topSpace;
                        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                        if (layoutParams == null) {
                            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            break;
                        } else {
                            layoutParams.height = insetsIgnoringVisibility.top;
                            space.setLayoutParams(layoutParams);
                            break;
                        }
                    default:
                        windowInsetsCompat.getClass();
                        Insets insetsIgnoringVisibility2 = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                        insetsIgnoringVisibility2.getClass();
                        Space space2 = basicSelfieCaptureViewController3.binding.bottomSpace;
                        ViewGroup.LayoutParams layoutParams2 = space2.getLayoutParams();
                        if (layoutParams2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            break;
                        } else {
                            layoutParams2.height = insetsIgnoringVisibility2.bottom;
                            space2.setLayoutParams(layoutParams2);
                            break;
                        }
                }
                return null;
            }
        });
        JobKt.launch$default(basicSelfieCaptureViewController2.lifecycleScope, null, null, new HazeSourceNode$launchPreDraw$1(basicSelfieCaptureViewController2, null, 23), 3);
    }

    public final void registerCameraStateListener(CameraController cameraController) {
        StandaloneCoroutine standaloneCoroutine = this.cameraStateListenerJob;
        Continuation continuation = null;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.cameraStateListenerJob = JobKt.launch$default(ViewModelKt.getCoroutineScope(ContextUtilsKt.requireLifecycleOwner(this.context).getLifecycle()), null, null, new TransitionWorker$run$1(cameraController, this, continuation, 21), 3);
    }

    public final void setFlash(boolean z) {
        Window window;
        Window window2;
        Pi2SelfieCameraBinding pi2SelfieCameraBinding = this.viewController.binding;
        CameraController cameraController = this.cameraController;
        if (cameraController == null) {
            return;
        }
        CameraProperties.FacingMode facingMode = cameraController.getCameraProperties().facingMode;
        Context context = this.context;
        if (z) {
            if (facingMode != CameraProperties.FacingMode.User) {
                cameraController.enableTorch(true);
                return;
            }
            pi2SelfieCameraBinding.selfieFlash.setVisibility(0);
            AppCompatActivity activity = ContextUtilsKt.getActivity(context);
            if (activity == null || (window2 = activity.getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.screenBrightness = 1.0f;
            window2.setAttributes(attributes);
            return;
        }
        if (facingMode != CameraProperties.FacingMode.User) {
            cameraController.enableTorch(false);
            return;
        }
        pi2SelfieCameraBinding.selfieFlash.setVisibility(8);
        AppCompatActivity activity2 = ContextUtilsKt.getActivity(context);
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.screenBrightness = -1.0f;
        window.setAttributes(attributes2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x0104, code lost:
    
        if (r47.useCameraXForVideo == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04a8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showRendering(SelfieWorkflow.Screen.CameraScreen cameraScreen, SystemUiController systemUiController) {
        CameraDirection cameraDirection;
        CameraController create;
        int i;
        int i2;
        SelfieProcessor.TargetPose targetPose;
        boolean z;
        CameraScreenRunner cameraScreenRunner;
        CameraController cameraController;
        zzpc zzpcVar;
        String str;
        String str2;
        zzpc zzpcVar2;
        BasicSelfieCaptureViewController basicSelfieCaptureViewController;
        CameraScreenRunner cameraScreenRunner2;
        CameraController cameraController2;
        boolean z2;
        final SelfieWorkflow.Screen.CameraScreen cameraScreen2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        CameraController cameraController3;
        boolean z7;
        zzpc zzpcVar3;
        BasicSelfieCaptureViewController basicSelfieCaptureViewController2;
        CameraController cameraController4;
        String str3;
        String str4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        zzpc zzpcVar4;
        boolean z18;
        int ordinal;
        boolean z19;
        SelfieOverlayView.State state;
        String str9;
        TextView textView;
        TextView textView2;
        TextView textView3;
        int i3;
        TextView textView4;
        int i4;
        int i5;
        ImageView imageView;
        Function1 function1;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        BasicSelfieCaptureViewController basicSelfieCaptureViewController3 = this.viewController;
        Pi2SelfieCameraBinding pi2SelfieCameraBinding = basicSelfieCaptureViewController3.binding;
        cameraScreen.getClass();
        Function1 function12 = cameraScreen.onCameraError;
        String str10 = cameraScreen.description;
        String str11 = cameraScreen.message;
        zzpc zzpcVar5 = cameraScreen.mode;
        CameraProperties.FacingMode facingMode = cameraScreen.facingMode;
        this.currentErrorHandler = function12;
        this.permissionChangedHandler = cameraScreen.onPermissionChanged;
        StepStyles.SelfieStepStyle selfieStepStyle = cameraScreen.styles;
        if (selfieStepStyle != null) {
            TextBasedComponentStyle titleStyleValue = selfieStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                TextStylingKt.style(pi2SelfieCameraBinding.hintMessageTitle, titleStyleValue, SetsKt__SetsJVMKt.setOf(TextStyleElements.Margin));
            }
            TextBasedComponentStyle textStyleValue = selfieStepStyle.getTextStyleValue();
            if (textStyleValue != null) {
                TextStylingKt.style(pi2SelfieCameraBinding.hintMessageBody, textStyleValue, SetsKt__SetsJVMKt.setOf(TextStyleElements.Margin));
                Integer textColorValue = textStyleValue.getTextColorValue();
                if (textColorValue != null) {
                    int intValue = textColorValue.intValue();
                    pi2SelfieCameraBinding.toggleFlash.setImageTintList(ColorStateList.valueOf(intValue));
                    pi2SelfieCameraBinding.nextCamera.setImageTintList(ColorStateList.valueOf(intValue));
                }
            }
            TextBasedComponentStyle selfieSmallText = selfieStepStyle.getSelfieSmallText();
            if (selfieSmallText != null) {
                TextStylingKt.style(pi2SelfieCameraBinding.autoCaptureDisclaimer, selfieSmallText, SetsKt__SetsJVMKt.setOf(TextStyleElements.Margin));
                AttributeStyles.TextBasedTextColorStyle textColor = selfieSmallText.getTextColor();
                if (textColor != null && (base = textColor.getBase()) != null && (base2 = base.getBase()) != null && (value = base2.getValue()) != null) {
                    pi2SelfieCameraBinding.autoCaptureDisclaimer.setCompoundDrawableTintList(ColorStateList.valueOf(value.intValue()));
                }
            }
            Integer backgroundColorValue = selfieStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue2 = backgroundColorValue.intValue();
                pi2SelfieCameraBinding.spotlight.setBackgroundColor(intValue2);
                if (systemUiController != null) {
                    Context context = pi2SelfieCameraBinding.rootView_.getContext();
                    context.getClass();
                    systemUiController.updateSystemUiColor(context, intValue2);
                }
            }
            Context context2 = pi2SelfieCameraBinding.rootView_.getContext();
            context2.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(selfieStepStyle, context2);
            if (backgroundImageDrawable != null) {
                pi2SelfieCameraBinding.spotlight.setBackground(backgroundImageDrawable);
            }
            Integer headerButtonColorValue = selfieStepStyle.getHeaderButtonColorValue();
            if (headerButtonColorValue != null) {
                pi2SelfieCameraBinding.navigationBar.setControlsColor(headerButtonColorValue.intValue());
            }
        }
        if (cameraScreen.requestingPermissions) {
            return;
        }
        final CameraController cameraController5 = this.cameraController;
        Context context3 = this.context;
        if (cameraController5 != null) {
            if (this.currentFacingMode == facingMode) {
                cameraController5.prepare();
                CameraController cameraController6 = cameraController5;
                if (cameraScreen.recordingLocallyRequired || cameraController6.isRecordingLocally() || (function1 = this.currentErrorHandler) == null) {
                    i = 0;
                } else {
                    i = 0;
                    function1.invoke(new RecordingInterrupted(false));
                }
                cameraController6.getPreviewView().setVisibility(i);
                double d = cameraScreen.requireStrictSelfieCapture ? 0.45d : 0.35d;
                SelfieDirectionFeed selfieDirectionFeed = this.selfieDirectionFeed;
                selfieDirectionFeed.selfieProcessor.minFaceRatio = d;
                Selfie.Pose pose = cameraScreen.pose;
                i2 = pose == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pose.ordinal()];
                if (i2 == -1) {
                    targetPose = SelfieProcessor.TargetPose.None;
                } else if (i2 == 1) {
                    targetPose = SelfieProcessor.TargetPose.Center;
                } else if (i2 == 2) {
                    targetPose = SelfieProcessor.TargetPose.Left;
                } else {
                    if (i2 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    targetPose = SelfieProcessor.TargetPose.Right;
                }
                SelfieProcessor selfieProcessor = selfieDirectionFeed.selfieProcessor;
                selfieProcessor.getClass();
                selfieProcessor.targetPose = targetPose;
                if (!this.takingManualCapture) {
                    setFlash(cameraScreen.isFlashOn);
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                z = zzpcVar5 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.lifecycleScope;
                if (z) {
                    str = str10;
                    cameraScreenRunner = this;
                    cameraController = cameraController6;
                    zzpcVar = zzpcVar5;
                    JobKt.launch$default(lifecycleCoroutineScopeImpl, Dispatchers.Default, null, new CameraScreenRunner$showRendering$2(cameraController6, this, zzpcVar5, cameraScreen, (Continuation) null), 2);
                } else {
                    cameraScreenRunner = this;
                    cameraController = cameraController6;
                    zzpcVar = zzpcVar5;
                    str = str10;
                    if (!(zzpcVar instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup)) {
                        if (!(zzpcVar instanceof SelfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint)) {
                            if (zzpcVar instanceof SelfieWorkflow$Screen$CameraScreen$Mode$CountDown) {
                                int i6 = ((SelfieWorkflow$Screen$CameraScreen$Mode$CountDown) zzpcVar).countDown;
                                TextView textView5 = pi2SelfieCameraBinding.countdown;
                                if (!Intrinsics.areEqual(textView5.getTag(), Integer.valueOf(i6))) {
                                    textView5.setVisibility(0);
                                    textView5.setAlpha(0.8f);
                                    ViewPropertyAnimator animate = textView5.animate();
                                    animate.setStartDelay(700L);
                                    animate.setDuration(200L).alpha(RecyclerView.DECELERATION_RATE).withEndAction(new OldCameraScreenRunner$$ExternalSyntheticLambda6(textView5, 1));
                                    textView5.setText(String.valueOf(i6));
                                    textView5.setTag(Integer.valueOf(i6));
                                }
                                zzpcVar2 = zzpcVar;
                                basicSelfieCaptureViewController = basicSelfieCaptureViewController3;
                                str2 = str;
                                z3 = false;
                                z4 = false;
                                z5 = false;
                                cameraScreenRunner2 = cameraScreenRunner;
                                cameraController2 = cameraController;
                                z2 = z;
                                z6 = true;
                                cameraScreen2 = cameraScreen;
                                boolean z20 = facingMode != CameraProperties.FacingMode.User;
                                z8 = z3;
                                List list = cameraScreenRunner2.cameraFacingDirections;
                                z9 = z4;
                                if (z8) {
                                    z10 = z5;
                                    if (list.size() >= 2 && cameraScreen2.allowSwitchCamera) {
                                        z11 = true;
                                        int indexOf = (list.indexOf(facingMode) + 1) % list.size();
                                        if (z11) {
                                            int ordinal2 = ((CameraProperties.FacingMode) list.get(indexOf)).ordinal();
                                            z12 = z11;
                                            if (ordinal2 == 0) {
                                                str5 = context3.getString(R.string.pi2_switch_to_next_camera_with_label, context3.getString(R.string.pi2_camera_label_front));
                                            } else if (ordinal2 == 1) {
                                                str5 = context3.getString(R.string.pi2_switch_to_next_camera_with_label, context3.getString(R.string.pi2_camera_label_back));
                                            } else {
                                                if (ordinal2 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return;
                                                }
                                                str5 = context3.getString(R.string.pi2_switch_to_next_camera_without_label);
                                            }
                                        } else {
                                            z12 = z11;
                                            str5 = null;
                                        }
                                        str6 = cameraScreen2.title;
                                        str7 = cameraScreen2.autoCaptureText;
                                        String str12 = cameraScreen2.realTimeHint;
                                        CameraController cameraController7 = cameraController2;
                                        str8 = cameraScreen2.captureSuccessText;
                                        z13 = z6;
                                        z14 = cameraScreen2.isAutoCaptureOn;
                                        z15 = cameraScreen2.isFlashEnabled;
                                        boolean z21 = z20;
                                        z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
                                        z17 = !z16 || z2;
                                        if (z13 || !z10) {
                                            zzpcVar4 = zzpcVar2;
                                        } else {
                                            zzpcVar4 = zzpcVar2;
                                            if (ref$ObjectRef.element != null) {
                                                z18 = true;
                                                NavigationState navigationState = cameraScreen2.navigationState;
                                                ordinal = zzpcVar4.getOverlay().ordinal();
                                                if (ordinal == 0) {
                                                    z19 = z18;
                                                    if (ordinal == 1) {
                                                        state = SelfieOverlayView.State.Center;
                                                    } else if (ordinal == 2) {
                                                        state = z21 ? SelfieOverlayView.State.Left : SelfieOverlayView.State.Right;
                                                    } else if (ordinal == 3) {
                                                        state = z21 ? SelfieOverlayView.State.Right : SelfieOverlayView.State.Left;
                                                    } else {
                                                        if (ordinal != 4) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return;
                                                        }
                                                        state = SelfieOverlayView.State.Finalizing;
                                                    }
                                                } else {
                                                    z19 = z18;
                                                    state = SelfieOverlayView.State.None;
                                                }
                                                float f = cameraScreen2.poseScore;
                                                SelfieOverlayView.State state2 = state;
                                                SelfieBrightnessInfo selfieBrightnessInfo = cameraScreen2.brightnessInfo;
                                                str9 = cameraScreen2.watermarkText;
                                                Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda3 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf, 9);
                                                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
                                                final int i7 = 0;
                                                Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i8 = i7;
                                                        SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                                        switch (i8) {
                                                            case 0:
                                                                cameraScreen3.onBack.invoke();
                                                                break;
                                                            default:
                                                                cameraScreen3.onCancel.invoke();
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                final int i8 = 1;
                                                Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i82 = i8;
                                                        SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                                        switch (i82) {
                                                            case 0:
                                                                cameraScreen3.onBack.invoke();
                                                                break;
                                                            default:
                                                                cameraScreen3.onCancel.invoke();
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda22 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef);
                                                navigationState.getClass();
                                                textView = pi2SelfieCameraBinding.title;
                                                ConstraintLayout constraintLayout = pi2SelfieCameraBinding.rootView_;
                                                CircularProgressIndicator circularProgressIndicator = pi2SelfieCameraBinding.autoCaptureProgressBar;
                                                textView2 = pi2SelfieCameraBinding.watermark;
                                                ImageView imageView2 = pi2SelfieCameraBinding.button;
                                                View view = pi2SelfieCameraBinding.cameraCover;
                                                SelfieOverlayView selfieOverlayView = pi2SelfieCameraBinding.selfieOverlay;
                                                ImageView imageView3 = pi2SelfieCameraBinding.nextCamera;
                                                textView3 = pi2SelfieCameraBinding.captureSuccess;
                                                ImageView imageView4 = pi2SelfieCameraBinding.toggleFlash;
                                                int i9 = 8;
                                                if (str6 != null || StringsKt.isBlank(str6)) {
                                                    i3 = 0;
                                                    textView.setVisibility(8);
                                                } else {
                                                    textView.setText(str6);
                                                    i3 = 0;
                                                    textView.setVisibility(0);
                                                }
                                                textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
                                                if (str7 != null || StringsKt.isBlank(str7)) {
                                                    textView4.setVisibility(4);
                                                } else {
                                                    textView4.setText(str7);
                                                    textView4.setVisibility(i3);
                                                }
                                                basicSelfieCaptureViewController.realTimeHintFlow.setValue(str12);
                                                if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                                    basicSelfieCaptureViewController.setMessageTitle(str11);
                                                    basicSelfieCaptureViewController.setMessageBody(str2);
                                                } else {
                                                    basicSelfieCaptureViewController.setMessageTitle(null);
                                                    basicSelfieCaptureViewController.setMessageBody(null);
                                                }
                                                if (z14) {
                                                    textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.pi2_ic_camera_autocapture_off, 0, 0, 0);
                                                    circularProgressIndicator.setVisibility(8);
                                                } else {
                                                    textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.pi2_ic_camera_autocapture_on, 0, 0, 0);
                                                    circularProgressIndicator.setVisibility(0);
                                                }
                                                if (str8 != null || StringsKt.isBlank(str8)) {
                                                    textView3.setCompoundDrawablePadding(0);
                                                    textView3.setText((CharSequence) null);
                                                } else {
                                                    textView3.setCompoundDrawablePadding((int) ExtensionsKt.getDpToPx(16.0d));
                                                    textView3.setText(str8);
                                                }
                                                if (basicSelfieCaptureViewController.isFlashEnabled == z15 || imageView4.getContentDescription() == null) {
                                                    basicSelfieCaptureViewController.isFlashEnabled = z15;
                                                    if (z15) {
                                                        imageView4.setImageResource(R.drawable.pi2_ic_zap_crossed);
                                                        imageView4.setContentDescription(constraintLayout.getContext().getString(R.string.pi2_selfie_turn_on_flash));
                                                    } else {
                                                        imageView4.setImageResource(R.drawable.pi2_ic_zap_outline);
                                                        imageView4.setContentDescription(constraintLayout.getContext().getString(R.string.pi2_selfie_turn_off_flash));
                                                    }
                                                }
                                                if (str5 != null) {
                                                    imageView3.setContentDescription(str5);
                                                }
                                                imageView3.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda3, 25));
                                                imageView4.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda2, 26));
                                                selfieOverlayView.setIsPreviewMirrored(z21);
                                                selfieOverlayView.setCameraStreamBrightnessInfo(selfieBrightnessInfo);
                                                if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                                    selfieOverlayView.setIntensity(f);
                                                }
                                                SelfieOverlayView.setState$default(selfieOverlayView, state2, false, 2, null);
                                                ProgressBar progressBar = pi2SelfieCameraBinding.initializingProgressBar;
                                                if (z16) {
                                                    progressBar.setVisibility(8);
                                                } else {
                                                    progressBar.setVisibility(0);
                                                }
                                                Pi2NavigationBar pi2NavigationBar = pi2SelfieCameraBinding.navigationBar;
                                                constraintLayout.getClass();
                                                zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, constraintLayout);
                                                if (!z17) {
                                                    view.setVisibility(0);
                                                    view.setAlpha(1.0f);
                                                } else if (!basicSelfieCaptureViewController.isCameraCoverAnimatingOut) {
                                                    basicSelfieCaptureViewController.isCameraCoverAnimatingOut = true;
                                                    view.animate().alpha(RecyclerView.DECELERATION_RATE).withEndAction(new r6$$ExternalSyntheticLambda0(17, basicSelfieCaptureViewController, pi2SelfieCameraBinding));
                                                }
                                                FrameLayout frameLayout = pi2SelfieCameraBinding.finalizingCover;
                                                if (z9) {
                                                    if (frameLayout.getVisibility() != 8 && !basicSelfieCaptureViewController.isFinalizingCoverAnimatingOut) {
                                                        basicSelfieCaptureViewController.isFinalizingCoverAnimatingIn = false;
                                                        basicSelfieCaptureViewController.isFinalizingCoverAnimatingOut = true;
                                                        frameLayout.animate().cancel();
                                                        frameLayout.animate().alpha(RecyclerView.DECELERATION_RATE).withEndAction(new r6$$ExternalSyntheticLambda0(16, basicSelfieCaptureViewController, frameLayout));
                                                    }
                                                } else if (frameLayout.getVisibility() != 0 && !basicSelfieCaptureViewController.isFinalizingCoverAnimatingIn) {
                                                    basicSelfieCaptureViewController.isFinalizingCoverAnimatingIn = true;
                                                    basicSelfieCaptureViewController.isFinalizingCoverAnimatingOut = false;
                                                    frameLayout.setVisibility(0);
                                                    frameLayout.setAlpha(RecyclerView.DECELERATION_RATE);
                                                    frameLayout.animate().cancel();
                                                    frameLayout.animate().alpha(1.0f).withEndAction(new BasicSelfieCaptureViewController$$ExternalSyntheticLambda10(basicSelfieCaptureViewController, 2));
                                                }
                                                if (z12) {
                                                    i4 = 4;
                                                    i5 = 0;
                                                    imageView3.setVisibility(4);
                                                } else {
                                                    i5 = 0;
                                                    imageView3.setVisibility(0);
                                                    i4 = 4;
                                                }
                                                if (z8) {
                                                    imageView4.setVisibility(i5);
                                                } else {
                                                    imageView4.setVisibility(i4);
                                                }
                                                if (z8) {
                                                    imageView = imageView2;
                                                    imageView.setVisibility(i5);
                                                } else {
                                                    imageView = imageView2;
                                                    imageView.setVisibility(i4);
                                                }
                                                imageView3.setEnabled(z13);
                                                imageView4.setEnabled(z13);
                                                imageView.setEnabled(z19);
                                                imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i9, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda22));
                                                if (str9 != null || StringsKt.isBlank(str9)) {
                                                    textView2.setVisibility(8);
                                                } else {
                                                    textView2.setText(str9);
                                                    textView2.setVisibility(0);
                                                }
                                                ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController7.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController7));
                                            }
                                        }
                                        z18 = false;
                                        NavigationState navigationState2 = cameraScreen2.navigationState;
                                        ordinal = zzpcVar4.getOverlay().ordinal();
                                        if (ordinal == 0) {
                                        }
                                        float f2 = cameraScreen2.poseScore;
                                        SelfieOverlayView.State state22 = state;
                                        SelfieBrightnessInfo selfieBrightnessInfo2 = cameraScreen2.brightnessInfo;
                                        str9 = cameraScreen2.watermarkText;
                                        Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda32 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf, 9);
                                        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda23 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
                                        final int i72 = 0;
                                        Function0 function03 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = i72;
                                                SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                                switch (i82) {
                                                    case 0:
                                                        cameraScreen3.onBack.invoke();
                                                        break;
                                                    default:
                                                        cameraScreen3.onCancel.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final int i82 = 1;
                                        Function0 function022 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i822 = i82;
                                                SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                                switch (i822) {
                                                    case 0:
                                                        cameraScreen3.onBack.invoke();
                                                        break;
                                                    default:
                                                        cameraScreen3.onCancel.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef);
                                        navigationState2.getClass();
                                        textView = pi2SelfieCameraBinding.title;
                                        ConstraintLayout constraintLayout2 = pi2SelfieCameraBinding.rootView_;
                                        CircularProgressIndicator circularProgressIndicator2 = pi2SelfieCameraBinding.autoCaptureProgressBar;
                                        textView2 = pi2SelfieCameraBinding.watermark;
                                        ImageView imageView22 = pi2SelfieCameraBinding.button;
                                        View view2 = pi2SelfieCameraBinding.cameraCover;
                                        SelfieOverlayView selfieOverlayView2 = pi2SelfieCameraBinding.selfieOverlay;
                                        ImageView imageView32 = pi2SelfieCameraBinding.nextCamera;
                                        textView3 = pi2SelfieCameraBinding.captureSuccess;
                                        ImageView imageView42 = pi2SelfieCameraBinding.toggleFlash;
                                        int i92 = 8;
                                        if (str6 != null) {
                                        }
                                        i3 = 0;
                                        textView.setVisibility(8);
                                        textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
                                        if (str7 != null) {
                                        }
                                        textView4.setVisibility(4);
                                        basicSelfieCaptureViewController.realTimeHintFlow.setValue(str12);
                                        if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                        }
                                        if (z14) {
                                        }
                                        if (str8 != null) {
                                        }
                                        textView3.setCompoundDrawablePadding(0);
                                        textView3.setText((CharSequence) null);
                                        if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
                                        }
                                        basicSelfieCaptureViewController.isFlashEnabled = z15;
                                        if (z15) {
                                        }
                                        if (str5 != null) {
                                        }
                                        imageView32.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda32, 25));
                                        imageView42.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda23, 26));
                                        selfieOverlayView2.setIsPreviewMirrored(z21);
                                        selfieOverlayView2.setCameraStreamBrightnessInfo(selfieBrightnessInfo2);
                                        if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                        }
                                        SelfieOverlayView.setState$default(selfieOverlayView2, state22, false, 2, null);
                                        ProgressBar progressBar2 = pi2SelfieCameraBinding.initializingProgressBar;
                                        if (z16) {
                                        }
                                        Pi2NavigationBar pi2NavigationBar2 = pi2SelfieCameraBinding.navigationBar;
                                        constraintLayout2.getClass();
                                        zzai.applyNavigationState(navigationState2, function03, function022, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar2, constraintLayout2);
                                        if (!z17) {
                                        }
                                        FrameLayout frameLayout2 = pi2SelfieCameraBinding.finalizingCover;
                                        if (z9) {
                                        }
                                        if (z12) {
                                        }
                                        if (z8) {
                                        }
                                        if (z8) {
                                        }
                                        imageView32.setEnabled(z13);
                                        imageView42.setEnabled(z13);
                                        imageView.setEnabled(z19);
                                        imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i92, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda222));
                                        if (str9 != null) {
                                        }
                                        textView2.setVisibility(8);
                                        ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController7.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController7));
                                    }
                                } else {
                                    z10 = z5;
                                }
                                z11 = false;
                                int indexOf2 = (list.indexOf(facingMode) + 1) % list.size();
                                if (z11) {
                                }
                                str6 = cameraScreen2.title;
                                str7 = cameraScreen2.autoCaptureText;
                                String str122 = cameraScreen2.realTimeHint;
                                CameraController cameraController72 = cameraController2;
                                str8 = cameraScreen2.captureSuccessText;
                                z13 = z6;
                                z14 = cameraScreen2.isAutoCaptureOn;
                                z15 = cameraScreen2.isFlashEnabled;
                                boolean z212 = z20;
                                z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
                                if (z16) {
                                }
                                if (z13) {
                                }
                                zzpcVar4 = zzpcVar2;
                                z18 = false;
                                NavigationState navigationState22 = cameraScreen2.navigationState;
                                ordinal = zzpcVar4.getOverlay().ordinal();
                                if (ordinal == 0) {
                                }
                                float f22 = cameraScreen2.poseScore;
                                SelfieOverlayView.State state222 = state;
                                SelfieBrightnessInfo selfieBrightnessInfo22 = cameraScreen2.brightnessInfo;
                                str9 = cameraScreen2.watermarkText;
                                Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda322 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf2, 9);
                                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda232 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
                                final int i722 = 0;
                                Function0 function032 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i822 = i722;
                                        SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                        switch (i822) {
                                            case 0:
                                                cameraScreen3.onBack.invoke();
                                                break;
                                            default:
                                                cameraScreen3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                final int i822 = 1;
                                Function0 function0222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i8222 = i822;
                                        SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                        switch (i8222) {
                                            case 0:
                                                cameraScreen3.onBack.invoke();
                                                break;
                                            default:
                                                cameraScreen3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef);
                                navigationState22.getClass();
                                textView = pi2SelfieCameraBinding.title;
                                ConstraintLayout constraintLayout22 = pi2SelfieCameraBinding.rootView_;
                                CircularProgressIndicator circularProgressIndicator22 = pi2SelfieCameraBinding.autoCaptureProgressBar;
                                textView2 = pi2SelfieCameraBinding.watermark;
                                ImageView imageView222 = pi2SelfieCameraBinding.button;
                                View view22 = pi2SelfieCameraBinding.cameraCover;
                                SelfieOverlayView selfieOverlayView22 = pi2SelfieCameraBinding.selfieOverlay;
                                ImageView imageView322 = pi2SelfieCameraBinding.nextCamera;
                                textView3 = pi2SelfieCameraBinding.captureSuccess;
                                ImageView imageView422 = pi2SelfieCameraBinding.toggleFlash;
                                int i922 = 8;
                                if (str6 != null) {
                                }
                                i3 = 0;
                                textView.setVisibility(8);
                                textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
                                if (str7 != null) {
                                }
                                textView4.setVisibility(4);
                                basicSelfieCaptureViewController.realTimeHintFlow.setValue(str122);
                                if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                }
                                if (z14) {
                                }
                                if (str8 != null) {
                                }
                                textView3.setCompoundDrawablePadding(0);
                                textView3.setText((CharSequence) null);
                                if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
                                }
                                basicSelfieCaptureViewController.isFlashEnabled = z15;
                                if (z15) {
                                }
                                if (str5 != null) {
                                }
                                imageView322.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda322, 25));
                                imageView422.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda232, 26));
                                selfieOverlayView22.setIsPreviewMirrored(z212);
                                selfieOverlayView22.setCameraStreamBrightnessInfo(selfieBrightnessInfo22);
                                if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                }
                                SelfieOverlayView.setState$default(selfieOverlayView22, state222, false, 2, null);
                                ProgressBar progressBar22 = pi2SelfieCameraBinding.initializingProgressBar;
                                if (z16) {
                                }
                                Pi2NavigationBar pi2NavigationBar22 = pi2SelfieCameraBinding.navigationBar;
                                constraintLayout22.getClass();
                                zzai.applyNavigationState(navigationState22, function032, function0222, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar22, constraintLayout22);
                                if (!z17) {
                                }
                                FrameLayout frameLayout22 = pi2SelfieCameraBinding.finalizingCover;
                                if (z9) {
                                }
                                if (z12) {
                                }
                                if (z8) {
                                }
                                if (z8) {
                                }
                                imageView322.setEnabled(z13);
                                imageView422.setEnabled(z13);
                                imageView.setEnabled(z19);
                                imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i922, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda2222));
                                if (str9 != null) {
                                }
                                textView2.setVisibility(8);
                                ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController72.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController72));
                            }
                            if (zzpcVar instanceof SelfieWorkflow$Screen$CameraScreen$Mode$Transition) {
                                SelfieWorkflow$Screen$CameraScreen$Mode$Transition selfieWorkflow$Screen$CameraScreen$Mode$Transition = (SelfieWorkflow$Screen$CameraScreen$Mode$Transition) zzpcVar;
                                if (selfieWorkflow$Screen$CameraScreen$Mode$Transition.imageCaptured) {
                                    CameraScreenRunner$$ExternalSyntheticLambda2 cameraScreenRunner$$ExternalSyntheticLambda2 = new CameraScreenRunner$$ExternalSyntheticLambda2(zzpcVar, 0);
                                    ConstraintLayout constraintLayout3 = pi2SelfieCameraBinding.rootView_;
                                    constraintLayout3.setHapticFeedbackEnabled(true);
                                    constraintLayout3.performHapticFeedback(basicSelfieCaptureViewController3.confirmHapticFeedbackConst, 2);
                                    pi2SelfieCameraBinding.selfieOverlay.setIntensity(1.0f);
                                    basicSelfieCaptureViewController3.isPlayingSuccessAnimation = true;
                                    zzpcVar3 = zzpcVar;
                                    basicSelfieCaptureViewController2 = basicSelfieCaptureViewController3;
                                    cameraController4 = cameraController;
                                    str3 = str11;
                                    str4 = str;
                                    MotionUtils.animateInAndOut(pi2SelfieCameraBinding.cover, new CameraHelper$$ExternalSyntheticLambda0(pi2SelfieCameraBinding, 28), new UiWorkflow$$ExternalSyntheticLambda25(basicSelfieCaptureViewController2, str3, str4, cameraScreenRunner$$ExternalSyntheticLambda2, 24));
                                    MotionUtils.animateInAndOut(pi2SelfieCameraBinding.captureSuccess, new ShimmerThemeKt$$ExternalSyntheticLambda0(22), new ShimmerThemeKt$$ExternalSyntheticLambda0(23));
                                } else {
                                    zzpcVar3 = zzpcVar;
                                    basicSelfieCaptureViewController2 = basicSelfieCaptureViewController3;
                                    cameraController4 = cameraController;
                                    str3 = str11;
                                    str4 = str;
                                    selfieWorkflow$Screen$CameraScreen$Mode$Transition.onComplete.invoke();
                                }
                                zzpc zzpcVar6 = zzpcVar3;
                                str2 = str4;
                                zzpcVar2 = zzpcVar6;
                                basicSelfieCaptureViewController = basicSelfieCaptureViewController2;
                                cameraController2 = cameraController4;
                                z2 = z;
                                z3 = false;
                                z4 = false;
                                z5 = true;
                                z6 = false;
                                cameraScreenRunner2 = this;
                                str11 = str3;
                                cameraScreen2 = cameraScreen;
                                if (facingMode != CameraProperties.FacingMode.User) {
                                }
                                z8 = z3;
                                List list2 = cameraScreenRunner2.cameraFacingDirections;
                                z9 = z4;
                                if (z8) {
                                }
                                z11 = false;
                                int indexOf22 = (list2.indexOf(facingMode) + 1) % list2.size();
                                if (z11) {
                                }
                                str6 = cameraScreen2.title;
                                str7 = cameraScreen2.autoCaptureText;
                                String str1222 = cameraScreen2.realTimeHint;
                                CameraController cameraController722 = cameraController2;
                                str8 = cameraScreen2.captureSuccessText;
                                z13 = z6;
                                z14 = cameraScreen2.isAutoCaptureOn;
                                z15 = cameraScreen2.isFlashEnabled;
                                boolean z2122 = z20;
                                z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
                                if (z16) {
                                }
                                if (z13) {
                                }
                                zzpcVar4 = zzpcVar2;
                                z18 = false;
                                NavigationState navigationState222 = cameraScreen2.navigationState;
                                ordinal = zzpcVar4.getOverlay().ordinal();
                                if (ordinal == 0) {
                                }
                                float f222 = cameraScreen2.poseScore;
                                SelfieOverlayView.State state2222 = state;
                                SelfieBrightnessInfo selfieBrightnessInfo222 = cameraScreen2.brightnessInfo;
                                str9 = cameraScreen2.watermarkText;
                                Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda3222 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf22, 9);
                                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2322 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
                                final int i7222 = 0;
                                Function0 function0322 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i8222 = i7222;
                                        SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                        switch (i8222) {
                                            case 0:
                                                cameraScreen3.onBack.invoke();
                                                break;
                                            default:
                                                cameraScreen3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                final int i8222 = 1;
                                Function0 function02222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i82222 = i8222;
                                        SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                        switch (i82222) {
                                            case 0:
                                                cameraScreen3.onBack.invoke();
                                                break;
                                            default:
                                                cameraScreen3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda22222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef);
                                navigationState222.getClass();
                                textView = pi2SelfieCameraBinding.title;
                                ConstraintLayout constraintLayout222 = pi2SelfieCameraBinding.rootView_;
                                CircularProgressIndicator circularProgressIndicator222 = pi2SelfieCameraBinding.autoCaptureProgressBar;
                                textView2 = pi2SelfieCameraBinding.watermark;
                                ImageView imageView2222 = pi2SelfieCameraBinding.button;
                                View view222 = pi2SelfieCameraBinding.cameraCover;
                                SelfieOverlayView selfieOverlayView222 = pi2SelfieCameraBinding.selfieOverlay;
                                ImageView imageView3222 = pi2SelfieCameraBinding.nextCamera;
                                textView3 = pi2SelfieCameraBinding.captureSuccess;
                                ImageView imageView4222 = pi2SelfieCameraBinding.toggleFlash;
                                int i9222 = 8;
                                if (str6 != null) {
                                }
                                i3 = 0;
                                textView.setVisibility(8);
                                textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
                                if (str7 != null) {
                                }
                                textView4.setVisibility(4);
                                basicSelfieCaptureViewController.realTimeHintFlow.setValue(str1222);
                                if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                }
                                if (z14) {
                                }
                                if (str8 != null) {
                                }
                                textView3.setCompoundDrawablePadding(0);
                                textView3.setText((CharSequence) null);
                                if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
                                }
                                basicSelfieCaptureViewController.isFlashEnabled = z15;
                                if (z15) {
                                }
                                if (str5 != null) {
                                }
                                imageView3222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda3222, 25));
                                imageView4222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda2322, 26));
                                selfieOverlayView222.setIsPreviewMirrored(z2122);
                                selfieOverlayView222.setCameraStreamBrightnessInfo(selfieBrightnessInfo222);
                                if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                }
                                SelfieOverlayView.setState$default(selfieOverlayView222, state2222, false, 2, null);
                                ProgressBar progressBar222 = pi2SelfieCameraBinding.initializingProgressBar;
                                if (z16) {
                                }
                                Pi2NavigationBar pi2NavigationBar222 = pi2SelfieCameraBinding.navigationBar;
                                constraintLayout222.getClass();
                                zzai.applyNavigationState(navigationState222, function0322, function02222, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar222, constraintLayout222);
                                if (!z17) {
                                }
                                FrameLayout frameLayout222 = pi2SelfieCameraBinding.finalizingCover;
                                if (z9) {
                                }
                                if (z12) {
                                }
                                if (z8) {
                                }
                                if (z8) {
                                }
                                imageView3222.setEnabled(z13);
                                imageView4222.setEnabled(z13);
                                imageView.setEnabled(z19);
                                imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i9222, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda22222));
                                if (str9 != null) {
                                }
                                textView2.setVisibility(8);
                                ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController722.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController722));
                            }
                            if (zzpcVar instanceof SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture) {
                                basicSelfieCaptureViewController = basicSelfieCaptureViewController3;
                                str2 = str;
                                str11 = str11;
                                zzpcVar2 = zzpcVar;
                                ref$ObjectRef.element = new UiWorkflow$$ExternalSyntheticLambda25(this, cameraScreen, cameraController, zzpcVar, 25);
                                if (((SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture) zzpcVar2).forceCapture) {
                                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                                    cameraScreenRunner2 = this;
                                    CameraScreenRunner$showRendering$2 cameraScreenRunner$showRendering$2 = new CameraScreenRunner$showRendering$2(cameraScreenRunner2, cameraScreen, cameraController, zzpcVar2, (Continuation) null);
                                    cameraController3 = cameraController;
                                    zzpcVar2 = zzpcVar2;
                                    JobKt.launch$default(lifecycleCoroutineScopeImpl, handlerContext, null, cameraScreenRunner$showRendering$2, 2);
                                    z7 = false;
                                } else {
                                    cameraController3 = cameraController;
                                    cameraScreenRunner2 = this;
                                    z7 = true;
                                }
                                if (cameraScreenRunner2.takingManualCapture) {
                                    z7 = false;
                                }
                                z5 = z7;
                                cameraController2 = cameraController3;
                                z2 = z;
                                z3 = false;
                                z4 = false;
                            } else {
                                str11 = str11;
                                cameraController = cameraController;
                                str2 = str;
                                zzpcVar2 = zzpcVar;
                                basicSelfieCaptureViewController = basicSelfieCaptureViewController3;
                                cameraScreenRunner2 = this;
                                if (zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown) {
                                    ref$ObjectRef.element = new CameraScreenRunner$$ExternalSyntheticLambda2(zzpcVar2, 1);
                                } else {
                                    if (!(zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$AutoCapture)) {
                                        if (!(zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return;
                                        }
                                        StandaloneCoroutine standaloneCoroutine = cameraScreenRunner2.maxRecordingLimitJob;
                                        if (standaloneCoroutine != null) {
                                            standaloneCoroutine.cancel(null);
                                        }
                                        if (((SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture) zzpcVar2).startFinalize) {
                                            DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                                            HandlerContext handlerContext2 = MainDispatcherLoader.dispatcher;
                                            z2 = z;
                                            CameraScreenRunner$showRendering$10 cameraScreenRunner$showRendering$10 = new CameraScreenRunner$showRendering$10(cameraController, cameraScreenRunner2, zzpcVar2, cameraScreen, null);
                                            cameraController2 = cameraController;
                                            cameraScreenRunner2 = cameraScreenRunner2;
                                            cameraScreen2 = cameraScreen;
                                            JobKt.launch$default(lifecycleCoroutineScopeImpl, handlerContext2, null, cameraScreenRunner$showRendering$10, 2);
                                        } else {
                                            cameraController2 = cameraController;
                                            z2 = z;
                                            cameraScreen2 = cameraScreen;
                                        }
                                        z3 = true;
                                        z4 = true;
                                        z5 = true;
                                        z6 = true;
                                        if (facingMode != CameraProperties.FacingMode.User) {
                                        }
                                        z8 = z3;
                                        List list22 = cameraScreenRunner2.cameraFacingDirections;
                                        z9 = z4;
                                        if (z8) {
                                        }
                                        z11 = false;
                                        int indexOf222 = (list22.indexOf(facingMode) + 1) % list22.size();
                                        if (z11) {
                                        }
                                        str6 = cameraScreen2.title;
                                        str7 = cameraScreen2.autoCaptureText;
                                        String str12222 = cameraScreen2.realTimeHint;
                                        CameraController cameraController7222 = cameraController2;
                                        str8 = cameraScreen2.captureSuccessText;
                                        z13 = z6;
                                        z14 = cameraScreen2.isAutoCaptureOn;
                                        z15 = cameraScreen2.isFlashEnabled;
                                        boolean z21222 = z20;
                                        z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
                                        if (z16) {
                                        }
                                        if (z13) {
                                        }
                                        zzpcVar4 = zzpcVar2;
                                        z18 = false;
                                        NavigationState navigationState2222 = cameraScreen2.navigationState;
                                        ordinal = zzpcVar4.getOverlay().ordinal();
                                        if (ordinal == 0) {
                                        }
                                        float f2222 = cameraScreen2.poseScore;
                                        SelfieOverlayView.State state22222 = state;
                                        SelfieBrightnessInfo selfieBrightnessInfo2222 = cameraScreen2.brightnessInfo;
                                        str9 = cameraScreen2.watermarkText;
                                        Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda32222 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf222, 9);
                                        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda23222 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
                                        final int i72222 = 0;
                                        Function0 function03222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82222 = i72222;
                                                SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                                switch (i82222) {
                                                    case 0:
                                                        cameraScreen3.onBack.invoke();
                                                        break;
                                                    default:
                                                        cameraScreen3.onCancel.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final int i82222 = 1;
                                        Function0 function022222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i822222 = i82222;
                                                SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                                switch (i822222) {
                                                    case 0:
                                                        cameraScreen3.onBack.invoke();
                                                        break;
                                                    default:
                                                        cameraScreen3.onCancel.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda222222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef);
                                        navigationState2222.getClass();
                                        textView = pi2SelfieCameraBinding.title;
                                        ConstraintLayout constraintLayout2222 = pi2SelfieCameraBinding.rootView_;
                                        CircularProgressIndicator circularProgressIndicator2222 = pi2SelfieCameraBinding.autoCaptureProgressBar;
                                        textView2 = pi2SelfieCameraBinding.watermark;
                                        ImageView imageView22222 = pi2SelfieCameraBinding.button;
                                        View view2222 = pi2SelfieCameraBinding.cameraCover;
                                        SelfieOverlayView selfieOverlayView2222 = pi2SelfieCameraBinding.selfieOverlay;
                                        ImageView imageView32222 = pi2SelfieCameraBinding.nextCamera;
                                        textView3 = pi2SelfieCameraBinding.captureSuccess;
                                        ImageView imageView42222 = pi2SelfieCameraBinding.toggleFlash;
                                        int i92222 = 8;
                                        if (str6 != null) {
                                        }
                                        i3 = 0;
                                        textView.setVisibility(8);
                                        textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
                                        if (str7 != null) {
                                        }
                                        textView4.setVisibility(4);
                                        basicSelfieCaptureViewController.realTimeHintFlow.setValue(str12222);
                                        if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                        }
                                        if (z14) {
                                        }
                                        if (str8 != null) {
                                        }
                                        textView3.setCompoundDrawablePadding(0);
                                        textView3.setText((CharSequence) null);
                                        if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
                                        }
                                        basicSelfieCaptureViewController.isFlashEnabled = z15;
                                        if (z15) {
                                        }
                                        if (str5 != null) {
                                        }
                                        imageView32222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda32222, 25));
                                        imageView42222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda23222, 26));
                                        selfieOverlayView2222.setIsPreviewMirrored(z21222);
                                        selfieOverlayView2222.setCameraStreamBrightnessInfo(selfieBrightnessInfo2222);
                                        if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                                        }
                                        SelfieOverlayView.setState$default(selfieOverlayView2222, state22222, false, 2, null);
                                        ProgressBar progressBar2222 = pi2SelfieCameraBinding.initializingProgressBar;
                                        if (z16) {
                                        }
                                        Pi2NavigationBar pi2NavigationBar2222 = pi2SelfieCameraBinding.navigationBar;
                                        constraintLayout2222.getClass();
                                        zzai.applyNavigationState(navigationState2222, function03222, function022222, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar2222, constraintLayout2222);
                                        if (!z17) {
                                        }
                                        FrameLayout frameLayout2222 = pi2SelfieCameraBinding.finalizingCover;
                                        if (z9) {
                                        }
                                        if (z12) {
                                        }
                                        if (z8) {
                                        }
                                        if (z8) {
                                        }
                                        imageView32222.setEnabled(z13);
                                        imageView42222.setEnabled(z13);
                                        imageView.setEnabled(z19);
                                        imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i92222, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda222222));
                                        if (str9 != null) {
                                        }
                                        textView2.setVisibility(8);
                                        ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController7222.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController7222));
                                    }
                                    cameraController2 = cameraController;
                                    z2 = z;
                                    z3 = false;
                                    z4 = false;
                                    z5 = false;
                                }
                            }
                            z6 = true;
                            cameraScreen2 = cameraScreen;
                            if (facingMode != CameraProperties.FacingMode.User) {
                            }
                            z8 = z3;
                            List list222 = cameraScreenRunner2.cameraFacingDirections;
                            z9 = z4;
                            if (z8) {
                            }
                            z11 = false;
                            int indexOf2222 = (list222.indexOf(facingMode) + 1) % list222.size();
                            if (z11) {
                            }
                            str6 = cameraScreen2.title;
                            str7 = cameraScreen2.autoCaptureText;
                            String str122222 = cameraScreen2.realTimeHint;
                            CameraController cameraController72222 = cameraController2;
                            str8 = cameraScreen2.captureSuccessText;
                            z13 = z6;
                            z14 = cameraScreen2.isAutoCaptureOn;
                            z15 = cameraScreen2.isFlashEnabled;
                            boolean z212222 = z20;
                            z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
                            if (z16) {
                            }
                            if (z13) {
                            }
                            zzpcVar4 = zzpcVar2;
                            z18 = false;
                            NavigationState navigationState22222 = cameraScreen2.navigationState;
                            ordinal = zzpcVar4.getOverlay().ordinal();
                            if (ordinal == 0) {
                            }
                            float f22222 = cameraScreen2.poseScore;
                            SelfieOverlayView.State state222222 = state;
                            SelfieBrightnessInfo selfieBrightnessInfo22222 = cameraScreen2.brightnessInfo;
                            str9 = cameraScreen2.watermarkText;
                            Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda322222 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf2222, 9);
                            StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda232222 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
                            final int i722222 = 0;
                            Function0 function032222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i822222 = i722222;
                                    SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                    switch (i822222) {
                                        case 0:
                                            cameraScreen3.onBack.invoke();
                                            break;
                                        default:
                                            cameraScreen3.onCancel.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            final int i822222 = 1;
                            Function0 function0222222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i8222222 = i822222;
                                    SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                    switch (i8222222) {
                                        case 0:
                                            cameraScreen3.onBack.invoke();
                                            break;
                                        default:
                                            cameraScreen3.onCancel.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2222222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef);
                            navigationState22222.getClass();
                            textView = pi2SelfieCameraBinding.title;
                            ConstraintLayout constraintLayout22222 = pi2SelfieCameraBinding.rootView_;
                            CircularProgressIndicator circularProgressIndicator22222 = pi2SelfieCameraBinding.autoCaptureProgressBar;
                            textView2 = pi2SelfieCameraBinding.watermark;
                            ImageView imageView222222 = pi2SelfieCameraBinding.button;
                            View view22222 = pi2SelfieCameraBinding.cameraCover;
                            SelfieOverlayView selfieOverlayView22222 = pi2SelfieCameraBinding.selfieOverlay;
                            ImageView imageView322222 = pi2SelfieCameraBinding.nextCamera;
                            textView3 = pi2SelfieCameraBinding.captureSuccess;
                            ImageView imageView422222 = pi2SelfieCameraBinding.toggleFlash;
                            int i922222 = 8;
                            if (str6 != null) {
                            }
                            i3 = 0;
                            textView.setVisibility(8);
                            textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
                            if (str7 != null) {
                            }
                            textView4.setVisibility(4);
                            basicSelfieCaptureViewController.realTimeHintFlow.setValue(str122222);
                            if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                            }
                            if (z14) {
                            }
                            if (str8 != null) {
                            }
                            textView3.setCompoundDrawablePadding(0);
                            textView3.setText((CharSequence) null);
                            if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
                            }
                            basicSelfieCaptureViewController.isFlashEnabled = z15;
                            if (z15) {
                            }
                            if (str5 != null) {
                            }
                            imageView322222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda322222, 25));
                            imageView422222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda232222, 26));
                            selfieOverlayView22222.setIsPreviewMirrored(z212222);
                            selfieOverlayView22222.setCameraStreamBrightnessInfo(selfieBrightnessInfo22222);
                            if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                            }
                            SelfieOverlayView.setState$default(selfieOverlayView22222, state222222, false, 2, null);
                            ProgressBar progressBar22222 = pi2SelfieCameraBinding.initializingProgressBar;
                            if (z16) {
                            }
                            Pi2NavigationBar pi2NavigationBar22222 = pi2SelfieCameraBinding.navigationBar;
                            constraintLayout22222.getClass();
                            zzai.applyNavigationState(navigationState22222, function032222, function0222222, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar22222, constraintLayout22222);
                            if (!z17) {
                            }
                            FrameLayout frameLayout22222 = pi2SelfieCameraBinding.finalizingCover;
                            if (z9) {
                            }
                            if (z12) {
                            }
                            if (z8) {
                            }
                            if (z8) {
                            }
                            imageView322222.setEnabled(z13);
                            imageView422222.setEnabled(z13);
                            imageView.setEnabled(z19);
                            imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i922222, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda2222222));
                            if (str9 != null) {
                            }
                            textView2.setVisibility(8);
                            ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController72222.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController72222));
                        }
                        SelfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint selfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint = (SelfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint) zzpcVar;
                        Function0 function04 = selfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint.poseHintComplete;
                        int ordinal3 = selfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint.overlay.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 == 1) {
                                function04.invoke();
                            } else if (ordinal3 == 2) {
                                function04.invoke();
                            } else if (ordinal3 == 3) {
                                function04.invoke();
                            } else if (ordinal3 != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            zzpcVar2 = zzpcVar;
                            basicSelfieCaptureViewController = basicSelfieCaptureViewController3;
                            str2 = str;
                            cameraScreenRunner2 = cameraScreenRunner;
                        }
                        function04.invoke();
                        zzpcVar2 = zzpcVar;
                        basicSelfieCaptureViewController = basicSelfieCaptureViewController3;
                        str2 = str;
                        cameraScreenRunner2 = cameraScreenRunner;
                        cameraController2 = cameraController;
                        z2 = z;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                        z6 = true;
                        cameraScreen2 = cameraScreen;
                        if (facingMode != CameraProperties.FacingMode.User) {
                        }
                        z8 = z3;
                        List list2222 = cameraScreenRunner2.cameraFacingDirections;
                        z9 = z4;
                        if (z8) {
                        }
                        z11 = false;
                        int indexOf22222 = (list2222.indexOf(facingMode) + 1) % list2222.size();
                        if (z11) {
                        }
                        str6 = cameraScreen2.title;
                        str7 = cameraScreen2.autoCaptureText;
                        String str1222222 = cameraScreen2.realTimeHint;
                        CameraController cameraController722222 = cameraController2;
                        str8 = cameraScreen2.captureSuccessText;
                        z13 = z6;
                        z14 = cameraScreen2.isAutoCaptureOn;
                        z15 = cameraScreen2.isFlashEnabled;
                        boolean z2122222 = z20;
                        z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
                        if (z16) {
                        }
                        if (z13) {
                        }
                        zzpcVar4 = zzpcVar2;
                        z18 = false;
                        NavigationState navigationState222222 = cameraScreen2.navigationState;
                        ordinal = zzpcVar4.getOverlay().ordinal();
                        if (ordinal == 0) {
                        }
                        float f222222 = cameraScreen2.poseScore;
                        SelfieOverlayView.State state2222222 = state;
                        SelfieBrightnessInfo selfieBrightnessInfo222222 = cameraScreen2.brightnessInfo;
                        str9 = cameraScreen2.watermarkText;
                        Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda3222222 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf22222, 9);
                        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2322222 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
                        final int i7222222 = 0;
                        Function0 function0322222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8222222 = i7222222;
                                SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                switch (i8222222) {
                                    case 0:
                                        cameraScreen3.onBack.invoke();
                                        break;
                                    default:
                                        cameraScreen3.onCancel.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        final int i8222222 = 1;
                        Function0 function02222222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i82222222 = i8222222;
                                SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                                switch (i82222222) {
                                    case 0:
                                        cameraScreen3.onBack.invoke();
                                        break;
                                    default:
                                        cameraScreen3.onCancel.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda22222222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef);
                        navigationState222222.getClass();
                        textView = pi2SelfieCameraBinding.title;
                        ConstraintLayout constraintLayout222222 = pi2SelfieCameraBinding.rootView_;
                        CircularProgressIndicator circularProgressIndicator222222 = pi2SelfieCameraBinding.autoCaptureProgressBar;
                        textView2 = pi2SelfieCameraBinding.watermark;
                        ImageView imageView2222222 = pi2SelfieCameraBinding.button;
                        View view222222 = pi2SelfieCameraBinding.cameraCover;
                        SelfieOverlayView selfieOverlayView222222 = pi2SelfieCameraBinding.selfieOverlay;
                        ImageView imageView3222222 = pi2SelfieCameraBinding.nextCamera;
                        textView3 = pi2SelfieCameraBinding.captureSuccess;
                        ImageView imageView4222222 = pi2SelfieCameraBinding.toggleFlash;
                        int i9222222 = 8;
                        if (str6 != null) {
                        }
                        i3 = 0;
                        textView.setVisibility(8);
                        textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
                        if (str7 != null) {
                        }
                        textView4.setVisibility(4);
                        basicSelfieCaptureViewController.realTimeHintFlow.setValue(str1222222);
                        if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                        }
                        if (z14) {
                        }
                        if (str8 != null) {
                        }
                        textView3.setCompoundDrawablePadding(0);
                        textView3.setText((CharSequence) null);
                        if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
                        }
                        basicSelfieCaptureViewController.isFlashEnabled = z15;
                        if (z15) {
                        }
                        if (str5 != null) {
                        }
                        imageView3222222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda3222222, 25));
                        imageView4222222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda2322222, 26));
                        selfieOverlayView222222.setIsPreviewMirrored(z2122222);
                        selfieOverlayView222222.setCameraStreamBrightnessInfo(selfieBrightnessInfo222222);
                        if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                        }
                        SelfieOverlayView.setState$default(selfieOverlayView222222, state2222222, false, 2, null);
                        ProgressBar progressBar222222 = pi2SelfieCameraBinding.initializingProgressBar;
                        if (z16) {
                        }
                        Pi2NavigationBar pi2NavigationBar222222 = pi2SelfieCameraBinding.navigationBar;
                        constraintLayout222222.getClass();
                        zzai.applyNavigationState(navigationState222222, function0322222, function02222222, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar222222, constraintLayout222222);
                        if (!z17) {
                        }
                        FrameLayout frameLayout222222 = pi2SelfieCameraBinding.finalizingCover;
                        if (z9) {
                        }
                        if (z12) {
                        }
                        if (z8) {
                        }
                        if (z8) {
                        }
                        imageView3222222.setEnabled(z13);
                        imageView4222222.setEnabled(z13);
                        imageView.setEnabled(z19);
                        imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i9222222, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda22222222));
                        if (str9 != null) {
                        }
                        textView2.setVisibility(8);
                        ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController722222.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController722222));
                    }
                    StandaloneCoroutine standaloneCoroutine2 = cameraScreenRunner.maxRecordingLimitJob;
                    if (standaloneCoroutine2 != null) {
                        standaloneCoroutine2.cancel(null);
                    }
                    DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                    cameraScreenRunner.maxRecordingLimitJob = JobKt.launch$default(lifecycleCoroutineScopeImpl, DefaultIoScheduler.INSTANCE, null, new CameraScreenRunner$showRendering$3(zzpcVar, cameraController, cameraScreenRunner, null), 2);
                }
                zzpcVar2 = zzpcVar;
                basicSelfieCaptureViewController = basicSelfieCaptureViewController3;
                str2 = str;
                z3 = true;
                z4 = false;
                z5 = true;
                cameraScreenRunner2 = cameraScreenRunner;
                cameraController2 = cameraController;
                z2 = z;
                z6 = true;
                cameraScreen2 = cameraScreen;
                if (facingMode != CameraProperties.FacingMode.User) {
                }
                z8 = z3;
                List list22222 = cameraScreenRunner2.cameraFacingDirections;
                z9 = z4;
                if (z8) {
                }
                z11 = false;
                int indexOf222222 = (list22222.indexOf(facingMode) + 1) % list22222.size();
                if (z11) {
                }
                str6 = cameraScreen2.title;
                str7 = cameraScreen2.autoCaptureText;
                String str12222222 = cameraScreen2.realTimeHint;
                CameraController cameraController7222222 = cameraController2;
                str8 = cameraScreen2.captureSuccessText;
                z13 = z6;
                z14 = cameraScreen2.isAutoCaptureOn;
                z15 = cameraScreen2.isFlashEnabled;
                boolean z21222222 = z20;
                z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
                if (z16) {
                }
                if (z13) {
                }
                zzpcVar4 = zzpcVar2;
                z18 = false;
                NavigationState navigationState2222222 = cameraScreen2.navigationState;
                ordinal = zzpcVar4.getOverlay().ordinal();
                if (ordinal == 0) {
                }
                float f2222222 = cameraScreen2.poseScore;
                SelfieOverlayView.State state22222222 = state;
                SelfieBrightnessInfo selfieBrightnessInfo2222222 = cameraScreen2.brightnessInfo;
                str9 = cameraScreen2.watermarkText;
                Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda32222222 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf222222, 9);
                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda23222222 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
                final int i72222222 = 0;
                Function0 function03222222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i82222222 = i72222222;
                        SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                        switch (i82222222) {
                            case 0:
                                cameraScreen3.onBack.invoke();
                                break;
                            default:
                                cameraScreen3.onCancel.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i82222222 = 1;
                Function0 function022222222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i822222222 = i82222222;
                        SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                        switch (i822222222) {
                            case 0:
                                cameraScreen3.onBack.invoke();
                                break;
                            default:
                                cameraScreen3.onCancel.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda222222222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef);
                navigationState2222222.getClass();
                textView = pi2SelfieCameraBinding.title;
                ConstraintLayout constraintLayout2222222 = pi2SelfieCameraBinding.rootView_;
                CircularProgressIndicator circularProgressIndicator2222222 = pi2SelfieCameraBinding.autoCaptureProgressBar;
                textView2 = pi2SelfieCameraBinding.watermark;
                ImageView imageView22222222 = pi2SelfieCameraBinding.button;
                View view2222222 = pi2SelfieCameraBinding.cameraCover;
                SelfieOverlayView selfieOverlayView2222222 = pi2SelfieCameraBinding.selfieOverlay;
                ImageView imageView32222222 = pi2SelfieCameraBinding.nextCamera;
                textView3 = pi2SelfieCameraBinding.captureSuccess;
                ImageView imageView42222222 = pi2SelfieCameraBinding.toggleFlash;
                int i92222222 = 8;
                if (str6 != null) {
                }
                i3 = 0;
                textView.setVisibility(8);
                textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
                if (str7 != null) {
                }
                textView4.setVisibility(4);
                basicSelfieCaptureViewController.realTimeHintFlow.setValue(str12222222);
                if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                }
                if (z14) {
                }
                if (str8 != null) {
                }
                textView3.setCompoundDrawablePadding(0);
                textView3.setText((CharSequence) null);
                if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
                }
                basicSelfieCaptureViewController.isFlashEnabled = z15;
                if (z15) {
                }
                if (str5 != null) {
                }
                imageView32222222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda32222222, 25));
                imageView42222222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda23222222, 26));
                selfieOverlayView2222222.setIsPreviewMirrored(z21222222);
                selfieOverlayView2222222.setCameraStreamBrightnessInfo(selfieBrightnessInfo2222222);
                if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
                }
                SelfieOverlayView.setState$default(selfieOverlayView2222222, state22222222, false, 2, null);
                ProgressBar progressBar2222222 = pi2SelfieCameraBinding.initializingProgressBar;
                if (z16) {
                }
                Pi2NavigationBar pi2NavigationBar2222222 = pi2SelfieCameraBinding.navigationBar;
                constraintLayout2222222.getClass();
                zzai.applyNavigationState(navigationState2222222, function03222222, function022222222, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar2222222, constraintLayout2222222);
                if (!z17) {
                }
                FrameLayout frameLayout2222222 = pi2SelfieCameraBinding.finalizingCover;
                if (z9) {
                }
                if (z12) {
                }
                if (z8) {
                }
                if (z8) {
                }
                imageView32222222.setEnabled(z13);
                imageView42222222.setEnabled(z13);
                imageView.setEnabled(z19);
                imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i92222222, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda222222222));
                if (str9 != null) {
                }
                textView2.setVisibility(8);
                ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController7222222.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController7222222));
            }
            cameraController5.destroy();
        }
        Camera2PreviewView camera2PreviewView = pi2SelfieCameraBinding.camera2Preview;
        VideoCaptureMethod videoCaptureMethod = cameraScreen.videoCaptureMethod;
        int ordinal4 = videoCaptureMethod.ordinal();
        if (ordinal4 != 0) {
            if (ordinal4 != 1) {
                if (ordinal4 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            cameraController5 = cameraScreen.cameraXControllerFactory.create(this.cameraPreview, pi2SelfieCameraBinding.previewviewSelfieCamera, new VideoCapture.AnonymousClass3(this, cameraScreen, videoCaptureMethod == VideoCaptureMethod.Upload), cameraScreen.isAudioRequired);
            ContextUtilsKt.requireLifecycleOwner(context3).getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$getOrCreateCameraController$2
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onResume(LifecycleOwner lifecycleOwner) {
                    CameraScreenRunner cameraScreenRunner3 = CameraScreenRunner.this;
                    ConstraintLayout constraintLayout4 = cameraScreenRunner3.viewController.binding.rootView_;
                    constraintLayout4.getClass();
                    constraintLayout4.post(new r6$$ExternalSyntheticLambda0(18, cameraScreenRunner3, cameraController5));
                }
            });
            registerCameraStateListener(cameraController5);
            cameraController5.prepare();
            this.cameraController = cameraController5;
            this.currentFacingMode = facingMode;
            CameraController cameraController62 = cameraController5;
            if (cameraScreen.recordingLocallyRequired) {
            }
            i = 0;
            cameraController62.getPreviewView().setVisibility(i);
            double d2 = cameraScreen.requireStrictSelfieCapture ? 0.45d : 0.35d;
            SelfieDirectionFeed selfieDirectionFeed2 = this.selfieDirectionFeed;
            selfieDirectionFeed2.selfieProcessor.minFaceRatio = d2;
            Selfie.Pose pose2 = cameraScreen.pose;
            if (pose2 == null) {
            }
            if (i2 == -1) {
            }
            SelfieProcessor selfieProcessor2 = selfieDirectionFeed2.selfieProcessor;
            selfieProcessor2.getClass();
            selfieProcessor2.targetPose = targetPose;
            if (!this.takingManualCapture) {
            }
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            z = zzpcVar5 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.lifecycleScope;
            if (z) {
            }
            zzpcVar2 = zzpcVar;
            basicSelfieCaptureViewController = basicSelfieCaptureViewController3;
            str2 = str;
            z3 = true;
            z4 = false;
            z5 = true;
            cameraScreenRunner2 = cameraScreenRunner;
            cameraController2 = cameraController;
            z2 = z;
            z6 = true;
            cameraScreen2 = cameraScreen;
            if (facingMode != CameraProperties.FacingMode.User) {
            }
            z8 = z3;
            List list222222 = cameraScreenRunner2.cameraFacingDirections;
            z9 = z4;
            if (z8) {
            }
            z11 = false;
            int indexOf2222222 = (list222222.indexOf(facingMode) + 1) % list222222.size();
            if (z11) {
            }
            str6 = cameraScreen2.title;
            str7 = cameraScreen2.autoCaptureText;
            String str122222222 = cameraScreen2.realTimeHint;
            CameraController cameraController72222222 = cameraController2;
            str8 = cameraScreen2.captureSuccessText;
            z13 = z6;
            z14 = cameraScreen2.isAutoCaptureOn;
            z15 = cameraScreen2.isFlashEnabled;
            boolean z212222222 = z20;
            z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
            if (z16) {
            }
            if (z13) {
            }
            zzpcVar4 = zzpcVar2;
            z18 = false;
            NavigationState navigationState22222222 = cameraScreen2.navigationState;
            ordinal = zzpcVar4.getOverlay().ordinal();
            if (ordinal == 0) {
            }
            float f22222222 = cameraScreen2.poseScore;
            SelfieOverlayView.State state222222222 = state;
            SelfieBrightnessInfo selfieBrightnessInfo22222222 = cameraScreen2.brightnessInfo;
            str9 = cameraScreen2.watermarkText;
            Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda322222222 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf2222222, 9);
            StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda232222222 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
            final int i722222222 = 0;
            Function0 function032222222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i822222222 = i722222222;
                    SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                    switch (i822222222) {
                        case 0:
                            cameraScreen3.onBack.invoke();
                            break;
                        default:
                            cameraScreen3.onCancel.invoke();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            final int i822222222 = 1;
            Function0 function0222222222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i8222222222 = i822222222;
                    SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                    switch (i8222222222) {
                        case 0:
                            cameraScreen3.onBack.invoke();
                            break;
                        default:
                            cameraScreen3.onCancel.invoke();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2222222222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef2);
            navigationState22222222.getClass();
            textView = pi2SelfieCameraBinding.title;
            ConstraintLayout constraintLayout22222222 = pi2SelfieCameraBinding.rootView_;
            CircularProgressIndicator circularProgressIndicator22222222 = pi2SelfieCameraBinding.autoCaptureProgressBar;
            textView2 = pi2SelfieCameraBinding.watermark;
            ImageView imageView222222222 = pi2SelfieCameraBinding.button;
            View view22222222 = pi2SelfieCameraBinding.cameraCover;
            SelfieOverlayView selfieOverlayView22222222 = pi2SelfieCameraBinding.selfieOverlay;
            ImageView imageView322222222 = pi2SelfieCameraBinding.nextCamera;
            textView3 = pi2SelfieCameraBinding.captureSuccess;
            ImageView imageView422222222 = pi2SelfieCameraBinding.toggleFlash;
            int i922222222 = 8;
            if (str6 != null) {
            }
            i3 = 0;
            textView.setVisibility(8);
            textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
            if (str7 != null) {
            }
            textView4.setVisibility(4);
            basicSelfieCaptureViewController.realTimeHintFlow.setValue(str122222222);
            if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
            }
            if (z14) {
            }
            if (str8 != null) {
            }
            textView3.setCompoundDrawablePadding(0);
            textView3.setText((CharSequence) null);
            if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
            }
            basicSelfieCaptureViewController.isFlashEnabled = z15;
            if (z15) {
            }
            if (str5 != null) {
            }
            imageView322222222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda322222222, 25));
            imageView422222222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda232222222, 26));
            selfieOverlayView22222222.setIsPreviewMirrored(z212222222);
            selfieOverlayView22222222.setCameraStreamBrightnessInfo(selfieBrightnessInfo22222222);
            if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
            }
            SelfieOverlayView.setState$default(selfieOverlayView22222222, state222222222, false, 2, null);
            ProgressBar progressBar22222222 = pi2SelfieCameraBinding.initializingProgressBar;
            if (z16) {
            }
            Pi2NavigationBar pi2NavigationBar22222222 = pi2SelfieCameraBinding.navigationBar;
            constraintLayout22222222.getClass();
            zzai.applyNavigationState(navigationState22222222, function032222222, function0222222222, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar22222222, constraintLayout22222222);
            if (!z17) {
            }
            FrameLayout frameLayout22222222 = pi2SelfieCameraBinding.finalizingCover;
            if (z9) {
            }
            if (z12) {
            }
            if (z8) {
            }
            if (z8) {
            }
            imageView322222222.setEnabled(z13);
            imageView422222222.setEnabled(z13);
            imageView.setEnabled(z19);
            imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i922222222, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda2222222222));
            if (str9 != null) {
            }
            textView2.setVisibility(8);
            ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController72222222.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController72222222));
        }
        Context applicationContext = context3.getApplicationContext();
        applicationContext.getClass();
        int ordinal5 = facingMode.ordinal();
        if (ordinal5 == 0) {
            cameraDirection = CameraDirection.FRONT;
        } else if (ordinal5 == 1) {
            cameraDirection = CameraDirection.BACK;
        } else {
            if (ordinal5 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            cameraDirection = CameraDirection.EXTERNAL;
        }
        CameraChoices bestCameraChoices = Camera2UtilsKt.getBestCameraChoices(applicationContext, cameraDirection);
        if (bestCameraChoices == null) {
            function12.invoke(new NoSuitableCameraError());
            create = new o0(camera2PreviewView, 11);
        } else {
            create = cameraScreen.camera2ControllerFactory.create(bestCameraChoices, camera2PreviewView, this.selfieDirectionFeed, VideoCaptureMethod.valueOf(videoCaptureMethod.toString()), cameraScreen.isAudioRequired);
        }
        cameraController5 = create;
        ContextUtilsKt.requireLifecycleOwner(context3).getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$getOrCreateCameraController$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(LifecycleOwner lifecycleOwner) {
                CameraScreenRunner cameraScreenRunner3 = CameraScreenRunner.this;
                ConstraintLayout constraintLayout4 = cameraScreenRunner3.viewController.binding.rootView_;
                constraintLayout4.getClass();
                constraintLayout4.post(new r6$$ExternalSyntheticLambda0(18, cameraScreenRunner3, cameraController5));
            }
        });
        registerCameraStateListener(cameraController5);
        cameraController5.prepare();
        this.cameraController = cameraController5;
        this.currentFacingMode = facingMode;
        CameraController cameraController622 = cameraController5;
        if (cameraScreen.recordingLocallyRequired) {
        }
        i = 0;
        cameraController622.getPreviewView().setVisibility(i);
        double d22 = cameraScreen.requireStrictSelfieCapture ? 0.45d : 0.35d;
        SelfieDirectionFeed selfieDirectionFeed22 = this.selfieDirectionFeed;
        selfieDirectionFeed22.selfieProcessor.minFaceRatio = d22;
        Selfie.Pose pose22 = cameraScreen.pose;
        if (pose22 == null) {
        }
        if (i2 == -1) {
        }
        SelfieProcessor selfieProcessor22 = selfieDirectionFeed22.selfieProcessor;
        selfieProcessor22.getClass();
        selfieProcessor22.targetPose = targetPose;
        if (!this.takingManualCapture) {
        }
        Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
        z = zzpcVar5 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl22 = this.lifecycleScope;
        if (z) {
        }
        zzpcVar2 = zzpcVar;
        basicSelfieCaptureViewController = basicSelfieCaptureViewController3;
        str2 = str;
        z3 = true;
        z4 = false;
        z5 = true;
        cameraScreenRunner2 = cameraScreenRunner;
        cameraController2 = cameraController;
        z2 = z;
        z6 = true;
        cameraScreen2 = cameraScreen;
        if (facingMode != CameraProperties.FacingMode.User) {
        }
        z8 = z3;
        List list2222222 = cameraScreenRunner2.cameraFacingDirections;
        z9 = z4;
        if (z8) {
        }
        z11 = false;
        int indexOf22222222 = (list2222222.indexOf(facingMode) + 1) % list2222222.size();
        if (z11) {
        }
        str6 = cameraScreen2.title;
        str7 = cameraScreen2.autoCaptureText;
        String str1222222222 = cameraScreen2.realTimeHint;
        CameraController cameraController722222222 = cameraController2;
        str8 = cameraScreen2.captureSuccessText;
        z13 = z6;
        z14 = cameraScreen2.isAutoCaptureOn;
        z15 = cameraScreen2.isFlashEnabled;
        boolean z2122222222 = z20;
        z16 = zzpcVar2 instanceof SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
        if (z16) {
        }
        if (z13) {
        }
        zzpcVar4 = zzpcVar2;
        z18 = false;
        NavigationState navigationState222222222 = cameraScreen2.navigationState;
        ordinal = zzpcVar4.getOverlay().ordinal();
        if (ordinal == 0) {
        }
        float f222222222 = cameraScreen2.poseScore;
        SelfieOverlayView.State state2222222222 = state;
        SelfieBrightnessInfo selfieBrightnessInfo222222222 = cameraScreen2.brightnessInfo;
        str9 = cameraScreen2.watermarkText;
        Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda3222222222 = new Http2Connection$$ExternalSyntheticLambda3(cameraScreenRunner2, cameraScreen2, indexOf22222222, 9);
        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2322222222 = new StateFlowsKt$$ExternalSyntheticLambda2(14, cameraScreen2, cameraScreenRunner2);
        final int i7222222222 = 0;
        Function0 function0322222222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i8222222222 = i7222222222;
                SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                switch (i8222222222) {
                    case 0:
                        cameraScreen3.onBack.invoke();
                        break;
                    default:
                        cameraScreen3.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i8222222222 = 1;
        Function0 function02222222222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i82222222222 = i8222222222;
                SelfieWorkflow.Screen.CameraScreen cameraScreen3 = cameraScreen2;
                switch (i82222222222) {
                    case 0:
                        cameraScreen3.onBack.invoke();
                        break;
                    default:
                        cameraScreen3.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda22222222222 = new StateFlowsKt$$ExternalSyntheticLambda2(12, cameraScreenRunner2, ref$ObjectRef22);
        navigationState222222222.getClass();
        textView = pi2SelfieCameraBinding.title;
        ConstraintLayout constraintLayout222222222 = pi2SelfieCameraBinding.rootView_;
        CircularProgressIndicator circularProgressIndicator222222222 = pi2SelfieCameraBinding.autoCaptureProgressBar;
        textView2 = pi2SelfieCameraBinding.watermark;
        ImageView imageView2222222222 = pi2SelfieCameraBinding.button;
        View view222222222 = pi2SelfieCameraBinding.cameraCover;
        SelfieOverlayView selfieOverlayView222222222 = pi2SelfieCameraBinding.selfieOverlay;
        ImageView imageView3222222222 = pi2SelfieCameraBinding.nextCamera;
        textView3 = pi2SelfieCameraBinding.captureSuccess;
        ImageView imageView4222222222 = pi2SelfieCameraBinding.toggleFlash;
        int i9222222222 = 8;
        if (str6 != null) {
        }
        i3 = 0;
        textView.setVisibility(8);
        textView4 = pi2SelfieCameraBinding.autoCaptureDisclaimer;
        if (str7 != null) {
        }
        textView4.setVisibility(4);
        basicSelfieCaptureViewController.realTimeHintFlow.setValue(str1222222222);
        if (basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
        }
        if (z14) {
        }
        if (str8 != null) {
        }
        textView3.setCompoundDrawablePadding(0);
        textView3.setText((CharSequence) null);
        if (basicSelfieCaptureViewController.isFlashEnabled == z15) {
        }
        basicSelfieCaptureViewController.isFlashEnabled = z15;
        if (z15) {
        }
        if (str5 != null) {
        }
        imageView3222222222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(http2Connection$$ExternalSyntheticLambda3222222222, 25));
        imageView4222222222.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(stateFlowsKt$$ExternalSyntheticLambda2322222222, 26));
        selfieOverlayView222222222.setIsPreviewMirrored(z2122222222);
        selfieOverlayView222222222.setCameraStreamBrightnessInfo(selfieBrightnessInfo222222222);
        if (!basicSelfieCaptureViewController.isPlayingSuccessAnimation) {
        }
        SelfieOverlayView.setState$default(selfieOverlayView222222222, state2222222222, false, 2, null);
        ProgressBar progressBar222222222 = pi2SelfieCameraBinding.initializingProgressBar;
        if (z16) {
        }
        Pi2NavigationBar pi2NavigationBar222222222 = pi2SelfieCameraBinding.navigationBar;
        constraintLayout222222222.getClass();
        zzai.applyNavigationState(navigationState222222222, function0322222222, function02222222222, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar222222222, constraintLayout222222222);
        if (!z17) {
        }
        FrameLayout frameLayout222222222 = pi2SelfieCameraBinding.finalizingCover;
        if (z9) {
        }
        if (z12) {
        }
        if (z8) {
        }
        if (z8) {
        }
        imageView3222222222.setEnabled(z13);
        imageView4222222222.setEnabled(z13);
        imageView.setEnabled(z19);
        imageView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(i9222222222, pi2SelfieCameraBinding, stateFlowsKt$$ExternalSyntheticLambda22222222222));
        if (str9 != null) {
        }
        textView2.setVisibility(8);
        ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController722222222.getPreviewView(), new StateFlowsKt$$ExternalSyntheticLambda2(13, this, cameraController722222222));
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(Object obj, ViewEnvironment viewEnvironment) {
        viewEnvironment.getClass();
        showRendering((SelfieWorkflow.Screen.CameraScreen) obj, zzat.getSystemUiController(viewEnvironment));
    }
}
