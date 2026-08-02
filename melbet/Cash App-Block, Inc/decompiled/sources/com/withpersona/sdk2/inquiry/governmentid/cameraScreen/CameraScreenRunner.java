package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.chip.Chip$$ExternalSyntheticLambda0;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.integrity.internal.ah;
import com.knotapi.knot.webview.WebViewManager$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda12;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.ParsedIdSideOrNone;
import com.withpersona.sdk2.camera.analyzers.BarcodePdf417Analyzer;
import com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer;
import com.withpersona.sdk2.camera.analyzers.IdFrontAnalyzer;
import com.withpersona.sdk2.camera.analyzers.MrzAnalyzer;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.AssetConfigUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.DesignVersion;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.OverlayAssets;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.BottomSheetCaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsView;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidStaticCaptureTipsBinding;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes9.dex */
public final class CameraScreenRunner implements LayoutRunner {
    public final CameraController cameraController;
    public StandaloneCoroutine cameraStateListenerJob;
    public final Context context;
    public StandaloneCoroutine currentCaptureJob;
    public Function1 currentErrorHandler;
    public boolean currentHolographicTorchEnabled;
    public final GovernmentIdFeed governmentIdFeed;
    public Integer lastAutoCaptureRulesId;
    public StandaloneCoroutine maxRecordingLimitJob;
    public Function0 permissionChangedHandler;
    public final int statusBarColor;
    public final TrackingEventsLogger trackingEventsLogger;
    public final GovIdCaptureViewController viewController;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DesignVersion.values().length];
            try {
                DesignVersion designVersion = DesignVersion.V0;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CameraScreenRunner(Context context, GovIdCaptureViewController govIdCaptureViewController, CameraController cameraController, GovernmentIdFeed governmentIdFeed, TrackingEventsLogger trackingEventsLogger) {
        context.getClass();
        cameraController.getClass();
        governmentIdFeed.getClass();
        trackingEventsLogger.getClass();
        this.context = context;
        this.viewController = govIdCaptureViewController;
        this.cameraController = cameraController;
        this.governmentIdFeed = governmentIdFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.statusBarColor = context.getColor(R.color.blackScreenStatusBarColor);
        final BasicGovIdCaptureViewController basicGovIdCaptureViewController = (BasicGovIdCaptureViewController) govIdCaptureViewController;
        Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = basicGovIdCaptureViewController.binding;
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidCameraBinding.overlayIcon;
        int parseColor = Color.parseColor("#43957D");
        FrameLayout frameLayout = pi2GovernmentidCameraBinding.rootView;
        Context context2 = frameLayout.getContext();
        context2.getClass();
        themeableLottieAnimationView.addColorReplacement(parseColor, ResToolsKt.getColorFromAttr$default(context2, R.attr.colorPrimary));
        InsetsUtilsKt.applyInsetsAsPadding$default(pi2GovernmentidCameraBinding.innerContentView, 15);
        pi2GovernmentidCameraBinding.overlayGuide.setScaleY(RecyclerView.DECELERATION_RATE);
        pi2GovernmentidCameraBinding.previewContainer.setAlpha(RecyclerView.DECELERATION_RATE);
        pi2GovernmentidCameraBinding.scanningView.setScanningAnimationEnabled(false);
        Context context3 = frameLayout.getContext();
        context3.getClass();
        ContextUtilsKt.requireLifecycleOwner(context3).getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController$onViewCreated$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onPause(LifecycleOwner lifecycleOwner) {
                BasicGovIdCaptureViewController basicGovIdCaptureViewController2 = BasicGovIdCaptureViewController.this;
                Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding2 = basicGovIdCaptureViewController2.binding;
                pi2GovernmentidCameraBinding2.overlayGuide.animate().cancel();
                ConstraintLayout constraintLayout = pi2GovernmentidCameraBinding2.overlayHint;
                constraintLayout.animate().cancel();
                ScanningView scanningView = pi2GovernmentidCameraBinding2.scanningView;
                scanningView.animate().cancel();
                FrameLayout frameLayout2 = pi2GovernmentidCameraBinding2.previewContainer;
                frameLayout2.animate().cancel();
                ImageView imageView = pi2GovernmentidCameraBinding2.overlayGuide;
                imageView.setScaleY(1.0f);
                imageView.setTranslationY(RecyclerView.DECELERATION_RATE);
                constraintLayout.setTranslationY(RecyclerView.DECELERATION_RATE);
                scanningView.setScaleY(1.0f);
                scanningView.setTranslationY(RecyclerView.DECELERATION_RATE);
                frameLayout2.setAlpha(1.0f);
                frameLayout2.setVisibility(0);
                basicGovIdCaptureViewController2.animationState = BasicGovIdCaptureViewController.AnimationState.IDLE;
                scanningView.setScanningAnimationEnabled(true);
            }
        });
        ContextUtilsKt.requireLifecycleOwner(context).getLifecycle().addObserver(new OldCameraScreenRunner.AnonymousClass1(this, 1));
        registerCameraStateListener();
        TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.IDLE, null, null, 4, null), false, 2, null);
        basicGovIdCaptureViewController.getRoot().addOnAttachStateChangeListener(new StandardMenuPopup.AnonymousClass2(this, 9));
    }

    public final void registerCameraStateListener() {
        StandaloneCoroutine standaloneCoroutine = this.cameraStateListenerJob;
        Continuation continuation = null;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.cameraStateListenerJob = JobKt.launch$default(ViewModelKt.getCoroutineScope(ContextUtilsKt.requireLifecycleOwner(this.context).getLifecycle()), null, null, new HazeSourceNode$launchPreDraw$1(this, continuation, 14), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x087b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07c7  */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r6v27 */
    @Override // com.squareup.workflow1.ui.LayoutRunner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showRendering(Screen.CameraScreen cameraScreen, ViewEnvironment viewEnvironment) {
        boolean z;
        GovernmentIdState governmentIdState;
        boolean z2;
        int i;
        CameraController cameraController;
        int i2;
        Object frontOrBackAnalyzer;
        Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding;
        IdConfig.Side side;
        RemoteImage remoteImage;
        OverlayAssets overlayAssets;
        String str;
        IdConfig.Side side2;
        BasicGovIdCaptureViewController.AnimationState animationState;
        BasicGovIdCaptureViewController.AnimationState animationState2;
        GovernmentIdState governmentIdState2;
        int i3;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        StandaloneCoroutine standaloneCoroutine;
        ?? r6;
        StandaloneCoroutine standaloneCoroutine2;
        int i4;
        Button button;
        int i5;
        ThemeableLottieAnimationView themeableLottieAnimationView;
        ScanningView scanningView;
        LottieAnimationView lottieAnimationView;
        BasicGovIdCaptureViewController basicGovIdCaptureViewController;
        Button button2;
        LottieAnimationView lottieAnimationView2;
        Pi2NavigationBar pi2NavigationBar;
        ConstraintLayout constraintLayout;
        int i6;
        TextView textView;
        int i7;
        Double staticCaptureTipsBorderRadius;
        Integer staticCaptureTipsBackgroundColor;
        TextBasedComponentStyle staticCaptureTipsSubtextStyle;
        TextBasedComponentStyle staticCaptureTipsTitleStyle;
        RemoteImage staticCaptureTipsIconPictograph;
        float f;
        StyleElements.FontWeight fontWeight;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        cameraScreen.getClass();
        boolean z3 = cameraScreen.finalizeLocalVideo;
        viewEnvironment.getClass();
        Context context = this.context;
        LifecycleCoroutineScopeImpl coroutineScope = ViewModelKt.getCoroutineScope(ContextUtilsKt.requireLifecycleOwner(context).getLifecycle());
        CameraController cameraController2 = this.cameraController;
        cameraController2.prepare();
        boolean z4 = cameraScreen.holographicTorchEnabled;
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = cameraScreen.assetConfig;
        int i8 = cameraScreen.autoCaptureRulesId;
        long j = cameraScreen.maxRecordingLengthMs;
        VideoCaptureMethod videoCaptureMethod = cameraScreen.videoCaptureMethod;
        IdConfig.Side side3 = cameraScreen.captureSide;
        GovernmentIdState governmentIdState3 = cameraScreen.state;
        if (z4 != this.currentHolographicTorchEnabled) {
            this.currentHolographicTorchEnabled = z4;
            cameraController2.enableTorch(z4);
        }
        boolean z5 = governmentIdState3 instanceof GovernmentIdState.WaitForAutocapture;
        if (z5 && videoCaptureMethod == VideoCaptureMethod.Stream && ((GovernmentIdState.WaitForAutocapture) governmentIdState3).webRtcState == WebRtcState.Connected) {
            StandaloneCoroutine standaloneCoroutine3 = this.maxRecordingLimitJob;
            if (standaloneCoroutine3 != null) {
                standaloneCoroutine3.cancel(null);
            }
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            z = z3;
            governmentIdState = governmentIdState3;
            z2 = z5;
            i = 2;
            this.maxRecordingLimitJob = JobKt.launch$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1(j, this, cameraScreen, null), 2);
        } else {
            z = z3;
            governmentIdState = governmentIdState3;
            z2 = z5;
            i = 2;
        }
        cameraController2.setAnalyzerEnabled(cameraScreen.enableAnalyzer);
        zzat.updateSystemUiColor(viewEnvironment, context, this.statusBarColor);
        Integer num = this.lastAutoCaptureRulesId;
        if (num != null && num.intValue() == i8) {
            cameraController = cameraController2;
        } else {
            int ordinal = side3.ordinal();
            ParsedIdSideOrNone.Side side4 = ordinal != 0 ? ordinal != i ? ParsedIdSideOrNone.Side.Back : ParsedIdSideOrNone.Side.Front : ParsedIdSideOrNone.Side.Front;
            List list = cameraScreen.autoCaptureRules;
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new FrontOrBackAnalyzer(1));
            boolean z6 = WhenMappings.$EnumSwitchMapping$0[cameraScreen.designVersion.ordinal()] == 1;
            GovernmentIdFeed governmentIdFeed = this.governmentIdFeed;
            governmentIdFeed.getClass();
            list.getClass();
            listOf.getClass();
            governmentIdFeed.side = side4;
            List list2 = list;
            cameraController = cameraController2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AutoCaptureRule autoCaptureRule = (AutoCaptureRule) it.next();
                Iterator it2 = it;
                if (autoCaptureRule instanceof AutoCaptureRule.BarcodePdf417Rule) {
                    frontOrBackAnalyzer = new BarcodePdf417Analyzer(z6);
                    i2 = i8;
                } else if (autoCaptureRule instanceof AutoCaptureRule.FrontOrBackRule) {
                    i2 = i8;
                    frontOrBackAnalyzer = new FrontOrBackAnalyzer(new IdFrontAnalyzer(z6), new BarcodePdf417Analyzer(z6));
                } else {
                    i2 = i8;
                    if (autoCaptureRule instanceof AutoCaptureRule.FrontRule) {
                        frontOrBackAnalyzer = new IdFrontAnalyzer(z6);
                    } else if (autoCaptureRule instanceof AutoCaptureRule.MrzRule) {
                        frontOrBackAnalyzer = new MrzAnalyzer();
                    } else {
                        if (!(autoCaptureRule instanceof AutoCaptureRule.TextExtractionRule)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        frontOrBackAnalyzer = new FrontOrBackAnalyzer(2);
                        arrayList.add(frontOrBackAnalyzer);
                        it = it2;
                        i8 = i2;
                    }
                }
                arrayList.add(frontOrBackAnalyzer);
                it = it2;
                i8 = i2;
            }
            governmentIdFeed.analyzers = arrayList;
            governmentIdFeed.passiveAnalyzers = listOf;
            this.lastAutoCaptureRulesId = Integer.valueOf(i8);
        }
        this.currentErrorHandler = cameraScreen.onCameraError;
        this.permissionChangedHandler = cameraScreen.checkPermissions;
        String str2 = cameraScreen.message;
        String str3 = cameraScreen.disclaimer;
        String str4 = cameraScreen.title;
        String str5 = cameraScreen.hintText;
        Screen.CameraScreen.ManualCapture manualCapture = cameraScreen.captureButtonState;
        if (manualCapture == Screen.CameraScreen.ManualCapture.Enabled && !cameraScreen.isEnabled) {
            manualCapture = Screen.CameraScreen.ManualCapture.Disabled;
        }
        Screen.Overlay overlay = cameraScreen.overlay;
        OverlayAssets idFrameAssetsFor = GovernmentIdKt.idFrameAssetsFor(context, overlay, side3);
        RemoteImage asset = capturePage != null ? AssetConfigUtilsKt.getAsset(capturePage, cameraScreen.idClass, side3) : null;
        boolean z7 = z2 && videoCaptureMethod == VideoCaptureMethod.Stream && ((GovernmentIdState.WaitForAutocapture) governmentIdState).webRtcState != WebRtcState.Connected;
        boolean z8 = cameraScreen.showFinalizeUi;
        NavigationState navigationState = cameraScreen.navigationState;
        Screen.CameraScreen.ManualCapture manualCapture2 = manualCapture;
        CaptureTipsViewModel captureTipsViewModel = cameraScreen.captureTips;
        boolean z9 = cameraScreen.playSideTransition;
        Function0 function0 = cameraScreen.back;
        boolean z10 = z7;
        Function0 function02 = cameraScreen.close;
        HCaptcha$$ExternalSyntheticLambda2 hCaptcha$$ExternalSyntheticLambda2 = new HCaptcha$$ExternalSyntheticLambda2(this, 19);
        HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9 = new HeroCardViewKt$$ExternalSyntheticLambda9(22, this, cameraScreen, coroutineScope);
        CameraScreenRunner$$ExternalSyntheticLambda2 cameraScreenRunner$$ExternalSyntheticLambda2 = new CameraScreenRunner$$ExternalSyntheticLambda2(this, 0);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = cameraScreen.styles;
        String str6 = cameraScreen.watermarkText;
        BasicGovIdCaptureViewController basicGovIdCaptureViewController2 = (BasicGovIdCaptureViewController) this.viewController;
        CameraController cameraController3 = basicGovIdCaptureViewController2.cameraController;
        str2.getClass();
        str3.getClass();
        manualCapture2.getClass();
        navigationState.getClass();
        Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding2 = basicGovIdCaptureViewController2.binding;
        FrameLayout frameLayout = pi2GovernmentidCameraBinding2.rootView;
        ProgressBar progressBar = pi2GovernmentidCameraBinding2.progressBar;
        Pi2NavigationBar pi2NavigationBar2 = pi2GovernmentidCameraBinding2.navigationBar;
        TextView textView2 = pi2GovernmentidCameraBinding2.overlayText;
        TextView textView3 = pi2GovernmentidCameraBinding2.disclaimer;
        View view = pi2GovernmentidCameraBinding2.overlay;
        ThemeableLottieAnimationView themeableLottieAnimationView2 = pi2GovernmentidCameraBinding2.overlayIcon;
        TextView textView4 = pi2GovernmentidCameraBinding2.title;
        LottieAnimationView lottieAnimationView3 = pi2GovernmentidCameraBinding2.scanningAnimation;
        ConstraintLayout constraintLayout2 = pi2GovernmentidCameraBinding2.overlayHint;
        ImageView imageView = pi2GovernmentidCameraBinding2.overlayGuide;
        ScanningView scanningView2 = pi2GovernmentidCameraBinding2.scanningView;
        ProgressBar progressBar2 = pi2GovernmentidCameraBinding2.cameraInitializingProgressBar;
        TextView textView5 = pi2GovernmentidCameraBinding2.watermark;
        TextView textView6 = pi2GovernmentidCameraBinding2.hint;
        TextView textView7 = pi2GovernmentidCameraBinding2.captureTips;
        Button button3 = pi2GovernmentidCameraBinding2.captureButton;
        Context context2 = frameLayout.getContext();
        ConstraintLayout constraintLayout3 = pi2GovernmentidCameraBinding2.cameraView;
        if (z10) {
            constraintLayout3.setVisibility(4);
            progressBar2.setVisibility(0);
            pi2GovernmentidCameraBinding = pi2GovernmentidCameraBinding2;
            side2 = side3;
            remoteImage = asset;
            overlayAssets = idFrameAssetsFor;
            str = str2;
        } else {
            constraintLayout3.setVisibility(0);
            progressBar2.setVisibility(4);
            cameraController3.getPreviewView().setVisibility(0);
            if (basicGovIdCaptureViewController2.animationState == BasicGovIdCaptureViewController.AnimationState.INITIAL) {
                ah.addOneShotPreDrawListenerAndDiscardFrame(view, new StateFlowsKt$$ExternalSyntheticLambda2(6, basicGovIdCaptureViewController2, pi2GovernmentidCameraBinding2));
            }
            IdConfig.Side side5 = basicGovIdCaptureViewController2.lastCaptureSide;
            if (side5 == null || side5 == side3 || (animationState = basicGovIdCaptureViewController2.animationState) == (animationState2 = BasicGovIdCaptureViewController.AnimationState.TRANSITION_COLLAPSING)) {
                pi2GovernmentidCameraBinding = pi2GovernmentidCameraBinding2;
                side = side3;
            } else if (animationState == BasicGovIdCaptureViewController.AnimationState.TRANSITION_EXPANDING) {
                pi2GovernmentidCameraBinding = pi2GovernmentidCameraBinding2;
                side = side3;
            } else {
                if (z9) {
                    basicGovIdCaptureViewController2.animationState = animationState2;
                    Integer num2 = basicGovIdCaptureViewController2.lockedOverlayGuideHeight;
                    int intValue = num2 != null ? num2.intValue() : imageView.getHeight();
                    basicGovIdCaptureViewController2.lockedOverlayGuideHeight = Integer.valueOf(intValue);
                    FrameLayout frameLayout2 = pi2GovernmentidCameraBinding2.previewContainer;
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        return;
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = intValue;
                    imageView.setLayoutParams(layoutParams2);
                    frameLayout2.setVisibility(4);
                    frameLayout2.setAlpha(RecyclerView.DECELERATION_RATE);
                    scanningView2.setScanningAnimationEnabled(false);
                    int height = constraintLayout2.getHeight() + imageView.getHeight();
                    int height2 = constraintLayout2.getHeight();
                    if (height == 0 || height2 == 0) {
                        basicGovIdCaptureViewController2.animationState = BasicGovIdCaptureViewController.AnimationState.IDLE;
                    } else {
                        float f2 = height;
                        float f3 = -(f2 / 2.0f);
                        imageView.setPivotY(imageView.getHeight());
                        scanningView2.setPivotY(scanningView2.getHeight());
                        imageView.animate().scaleY(RecyclerView.DECELERATION_RATE).translationY(f3).setDuration(200L).withEndAction(new WebViewManager$$ExternalSyntheticLambda0(basicGovIdCaptureViewController2, side3, asset, pi2GovernmentidCameraBinding2, idFrameAssetsFor, str2)).start();
                        constraintLayout2.animate().translationY(f3).setDuration(200L).start();
                        scanningView2.animate().scaleY(height2 / f2).translationY(f3).setDuration(200L).start();
                    }
                    governmentIdState2 = governmentIdState;
                    i3 = 1;
                    cameraController.getPreviewView().setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 18));
                    if (cameraScreen.autoCapturing || ((standaloneCoroutine2 = this.currentCaptureJob) != null && standaloneCoroutine2.isActive())) {
                        lifecycleCoroutineScopeImpl = coroutineScope;
                    } else {
                        startLocalVideoCaptureIfNeeded(cameraScreen, j);
                        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                        lifecycleCoroutineScopeImpl = coroutineScope;
                        this.currentCaptureJob = JobKt.launch$default(lifecycleCoroutineScopeImpl, MainDispatcherLoader.dispatcher, null, new CameraScreenRunner$showRendering$5(cameraScreen, this, null), 2);
                    }
                    ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new CameraScreenRunner$$ExternalSyntheticLambda2(this, i3));
                    if ((!(governmentIdState2 instanceof GovernmentIdState.FinalizeWebRtc) || z) && (standaloneCoroutine = this.maxRecordingLimitJob) != null) {
                        r6 = 0;
                        standaloneCoroutine.cancel(null);
                    } else {
                        r6 = 0;
                    }
                    if (z) {
                        return;
                    }
                    DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                    JobKt.launch$default(lifecycleCoroutineScopeImpl, MainDispatcherLoader.dispatcher, r6, new CameraScreenRunner$showRendering$7(cameraScreen, this, r6), 2);
                    return;
                }
                pi2GovernmentidCameraBinding = pi2GovernmentidCameraBinding2;
                remoteImage = asset;
                overlayAssets = idFrameAssetsFor;
                str = str2;
                side = side3;
                basicGovIdCaptureViewController2.lastCaptureSide = side;
                side2 = side;
            }
            remoteImage = asset;
            overlayAssets = idFrameAssetsFor;
            str = str2;
            basicGovIdCaptureViewController2.lastCaptureSide = side;
            side2 = side;
        }
        BasicGovIdCaptureViewController.AnimationState animationState3 = basicGovIdCaptureViewController2.animationState;
        BasicGovIdCaptureViewController.AnimationState animationState4 = BasicGovIdCaptureViewController.AnimationState.TRANSITION_COLLAPSING;
        if (animationState3 != animationState4 && animationState3 != BasicGovIdCaptureViewController.AnimationState.TRANSITION_EXPANDING) {
            textView2.setText(str);
        }
        textView3.setText(str3);
        textView4.setText(str4);
        textView4.setVisibility(str4.length() == 0 ? 8 : 0);
        boolean isBlank = StringsKt.isBlank(str3);
        LinearLayout linearLayout = pi2GovernmentidCameraBinding.disclaimerLayout;
        if (isBlank) {
            linearLayout.setVisibility(8);
            i4 = 0;
        } else {
            i4 = 0;
            linearLayout.setVisibility(0);
        }
        if (str5 == null || z10) {
            textView6.setVisibility(8);
        } else {
            textView6.setVisibility(i4);
            textView6.setText(str5);
        }
        Context context3 = textView2.getContext();
        context3.getClass();
        Object systemService = context3.getSystemService("accessibility");
        systemService.getClass();
        if (((AccessibilityManager) systemService).isEnabled() && textView2.getParent() != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            if (str5 != null) {
                obtain.getText().add(str5);
            } else {
                int ordinal2 = side2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        obtain.getText().add(textView2.getContext().getString(R.string.pi2_governmentid_talkback_dl_back_hint));
                    } else if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            obtain.getText().add(textView2.getContext().getString(R.string.pi2_governmentid_talkback_dl_barcode_hint));
                        } else if (ordinal2 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                    }
                    obtain.getText().add(view.getContext().getString(R.string.pi2_governmentid_talkback_hold_hint));
                }
                obtain.getText().add(textView2.getContext().getString(R.string.pi2_governmentid_talkback_front_hint));
                obtain.getText().add(view.getContext().getString(R.string.pi2_governmentid_talkback_hold_hint));
            }
            textView2.getParent().requestSendAccessibilityEvent(textView2, obtain);
        }
        int ordinal3 = manualCapture2.ordinal();
        if (ordinal3 == 0) {
            button = button3;
            i5 = 0;
            button.setEnabled(false);
        } else if (ordinal3 == 1) {
            button = button3;
            i5 = 0;
            button.setVisibility(0);
            button.setEnabled(true);
        } else if (ordinal3 != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            button = button3;
            button.setVisibility(4);
            i5 = 0;
        }
        context2.getClass();
        if (ResToolsKt.boolFromAttr$default(context2, R.attr.personaIdFrameCenterText)) {
            textView2.setGravity(17);
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            if (layoutParams3 == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.setMarginStart(i5);
                textView2.setLayoutParams(marginLayoutParams);
            }
        }
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context2, R.attr.personaLockImage);
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(resourceIdFromAttr$default != null ? resourceIdFromAttr$default.intValue() : R.drawable.pi2_lock_icon, 0, 0, 0);
        BasicGovIdCaptureViewController.AnimationState animationState5 = basicGovIdCaptureViewController2.animationState;
        if (animationState5 == animationState4 || animationState5 == BasicGovIdCaptureViewController.AnimationState.TRANSITION_EXPANDING) {
            themeableLottieAnimationView = themeableLottieAnimationView2;
        } else {
            RemoteImage remoteImage2 = remoteImage;
            if (remoteImage2 == null) {
                themeableLottieAnimationView = themeableLottieAnimationView2;
                int i9 = basicGovIdCaptureViewController2.currentHintAnimation;
                int i10 = overlayAssets.hintAnimation;
                if (i9 != i10) {
                    basicGovIdCaptureViewController2.currentHintAnimation = i10;
                    themeableLottieAnimationView.setAnimation(i10);
                    themeableLottieAnimationView.setVisibility(0);
                }
            } else if (basicGovIdCaptureViewController2.currentOverlayAssetView == null) {
                basicGovIdCaptureViewController2.currentOverlayAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage2, pi2GovernmentidCameraBinding.overlayIconContainer, false);
                themeableLottieAnimationView = themeableLottieAnimationView2;
                themeableLottieAnimationView.setVisibility(8);
            } else {
                themeableLottieAnimationView = themeableLottieAnimationView2;
            }
            imageView.setImageResource(overlayAssets.guideDrawable);
        }
        Integer resourceIdFromAttr$default2 = ResToolsKt.resourceIdFromAttr$default(context2, R.attr.personaIdFrameScanningSweepLottieRaw);
        if (resourceIdFromAttr$default2 != null) {
            lottieAnimationView = lottieAnimationView3;
            lottieAnimationView.setAnimation(resourceIdFromAttr$default2.intValue());
            view.setVisibility(0);
            scanningView = scanningView2;
            scanningView.setVisibility(8);
        } else {
            scanningView = scanningView2;
            lottieAnimationView = lottieAnimationView3;
            lottieAnimationView.setVisibility(4);
            view.setVisibility(4);
            scanningView.setVisibility(0);
        }
        view.setBackground(GovernmentIdKt.createIdFrameWithAttributes(context2, R.attr.personaIdFrameCaptureStyle));
        if ((overlay instanceof Screen.Overlay.Custom) && basicGovIdCaptureViewController2.customOverlayView == null) {
            MarkwonImpl markwonImpl = new MarkwonImpl(context2);
            Screen.Overlay.Custom custom = (Screen.Overlay.Custom) overlay;
            View makeView = RemoteImageComponentKt.makeView(custom.customImage, markwonImpl, custom.config);
            basicGovIdCaptureViewController2.customOverlayView = makeView;
            constraintLayout3.addView(makeView);
            lottieAnimationView.setVisibility(4);
            imageView.setVisibility(4);
            View view2 = basicGovIdCaptureViewController2.customOverlayView;
            if (view2 != null) {
                ah.addOneShotPreDrawListenerAndDiscardFrame(view2, new HeroCardViewKt$$ExternalSyntheticLambda9(21, basicGovIdCaptureViewController2, markwonImpl, pi2GovernmentidCameraBinding));
            }
        }
        if (governmentIdStepStyle != null) {
            float dpToPx = (float) ExtensionsKt.getDpToPx(8.0d);
            int dpToPx2 = (int) ExtensionsKt.getDpToPx(3.0d);
            TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                TextStylingKt.style(textView4, titleStyleValue, EmptySet.INSTANCE);
                textView4.setTextColor(-1);
            }
            Integer governmentIdCaptureFeedBoxBorderColorValue = governmentIdStepStyle.getGovernmentIdCaptureFeedBoxBorderColorValue();
            if (governmentIdCaptureFeedBoxBorderColorValue != null) {
                scanningView.setBorderColor(governmentIdCaptureFeedBoxBorderColorValue.intValue());
            }
            Double governmentIdCaptureFeedBoxBorderRadiusValue = governmentIdStepStyle.getGovernmentIdCaptureFeedBoxBorderRadiusValue();
            if (governmentIdCaptureFeedBoxBorderRadiusValue != null) {
                lottieAnimationView2 = lottieAnimationView;
                f = (float) ExtensionsKt.getDpToPx(governmentIdCaptureFeedBoxBorderRadiusValue.doubleValue());
            } else {
                lottieAnimationView2 = lottieAnimationView;
                f = dpToPx;
            }
            Double governmentIdCaptureFeedBoxBorderWidthValue = governmentIdStepStyle.getGovernmentIdCaptureFeedBoxBorderWidthValue();
            if (governmentIdCaptureFeedBoxBorderWidthValue != null) {
                dpToPx2 = (int) Math.ceil(ExtensionsKt.getDpToPx(governmentIdCaptureFeedBoxBorderWidthValue.doubleValue()));
                basicGovIdCaptureViewController = basicGovIdCaptureViewController2;
                button2 = button;
                imageView.setPadding(imageView.getPaddingLeft(), ((int) ExtensionsKt.getDpToPx(8.0d)) + dpToPx2, imageView.getPaddingRight(), imageView.getPaddingBottom());
            } else {
                basicGovIdCaptureViewController = basicGovIdCaptureViewController2;
                button2 = button;
            }
            float f4 = dpToPx2;
            pi2GovernmentidCameraBinding.spotlightView.setRadius(f + f4);
            TextBasedComponentStyle governmentIdCaptureHintTextStyle = governmentIdStepStyle.getGovernmentIdCaptureHintTextStyle();
            if (governmentIdCaptureHintTextStyle != null) {
                TextStylingKt.style(textView2, governmentIdCaptureHintTextStyle, SetsKt__SetsJVMKt.setOf(TextStyleElements.LineHeight));
            }
            StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
            String fontNameValue = (textStyle == null || (base3 = textStyle.getBase()) == null || (base4 = base3.getBase()) == null) ? null : base4.getFontNameValue();
            StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = governmentIdStepStyle.getTextStyle();
            if (textStyle2 == null || (base = textStyle2.getBase()) == null || (base2 = base.getBase()) == null || (fontWeight = base2.getFontWeightValue()) == null) {
                fontWeight = StyleElements.FontWeight.NORMAL;
            }
            TextStylingKt.setTypeface(textView3, fontNameValue, fontWeight, new InstantKt$$ExternalSyntheticLambda0(3));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(f);
            gradientDrawable.setStroke(dpToPx2, scanningView.borderColor);
            view.setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(-1);
            gradientDrawable2.setCornerRadii(new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, f, f, f});
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) ExtensionsKt.getDpToPx(6.0d));
            constraintLayout = constraintLayout2;
            constraintLayout.setBackground(insetDrawable);
            Integer captureHintIconStrokeColor = governmentIdStepStyle.getCaptureHintIconStrokeColor();
            if (captureHintIconStrokeColor != null) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
            }
            Integer captureHintIconFillColor = governmentIdStepStyle.getCaptureHintIconFillColor();
            if (captureHintIconFillColor != null) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
            }
            scanningView.setStrokeWidth(f4);
            scanningView.setCornerRadius(f);
            Integer governmentIdCaptureFeedBoxStrokeColorValue = governmentIdStepStyle.getGovernmentIdCaptureFeedBoxStrokeColorValue();
            if (governmentIdCaptureFeedBoxStrokeColorValue != null) {
                scanningView.setHighlightColor(governmentIdCaptureFeedBoxStrokeColorValue.intValue());
            }
            Integer capturePageHeaderIconColorValue = governmentIdStepStyle.getCapturePageHeaderIconColorValue();
            if (capturePageHeaderIconColorValue != null) {
                pi2NavigationBar = pi2NavigationBar2;
                pi2NavigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
            } else {
                pi2NavigationBar = pi2NavigationBar2;
            }
        } else {
            basicGovIdCaptureViewController = basicGovIdCaptureViewController2;
            button2 = button;
            lottieAnimationView2 = lottieAnimationView;
            pi2NavigationBar = pi2NavigationBar2;
            constraintLayout = constraintLayout2;
        }
        AlertBannerKt$$ExternalSyntheticLambda2 alertBannerKt$$ExternalSyntheticLambda2 = new AlertBannerKt$$ExternalSyntheticLambda2(23, function0);
        AlertBannerKt$$ExternalSyntheticLambda2 alertBannerKt$$ExternalSyntheticLambda22 = new AlertBannerKt$$ExternalSyntheticLambda2(24, function02);
        FrameLayout frameLayout3 = pi2GovernmentidCameraBinding.rootView;
        frameLayout3.getClass();
        zzai.applyNavigationState(navigationState, alertBannerKt$$ExternalSyntheticLambda2, alertBannerKt$$ExternalSyntheticLambda22, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, frameLayout3);
        pi2GovernmentidCameraBinding.flashlightToggle.setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(hCaptcha$$ExternalSyntheticLambda2, 6));
        button2.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(heroCardViewKt$$ExternalSyntheticLambda9, 16));
        cameraController3.getPreviewView().setOnClickListener(new ChatView$$ExternalSyntheticLambda28(cameraScreenRunner$$ExternalSyntheticLambda2, 17));
        View view3 = pi2GovernmentidCameraBinding.previewDim;
        if (z8) {
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(view3, 0.66f);
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(lottieAnimationView2, RecyclerView.DECELERATION_RATE);
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(imageView, RecyclerView.DECELERATION_RATE);
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(constraintLayout, RecyclerView.DECELERATION_RATE);
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(progressBar, 1.0f);
            if (basicGovIdCaptureViewController.animationState == BasicGovIdCaptureViewController.AnimationState.IDLE) {
                scanningView.setScanningAnimationEnabled(false);
            }
        } else {
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(view3, RecyclerView.DECELERATION_RATE);
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(lottieAnimationView2, 1.0f);
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(imageView, 1.0f);
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(imageView, 1.0f);
            BasicGovIdCaptureViewController.animateAlphaIfNeeded(progressBar, RecyclerView.DECELERATION_RATE);
            if (basicGovIdCaptureViewController.animationState == BasicGovIdCaptureViewController.AnimationState.IDLE) {
                i6 = 1;
                scanningView.setScanningAnimationEnabled(true);
                StaticCaptureTipsView staticCaptureTipsView = pi2GovernmentidCameraBinding.staticCaptureTips;
                staticCaptureTipsView.setVisibility(8);
                if (captureTipsViewModel instanceof StaticCaptureTipsViewModel) {
                    if (captureTipsViewModel instanceof BottomSheetCaptureTipsViewModel) {
                        String str7 = ((BottomSheetCaptureTipsViewModel) captureTipsViewModel).helpButtonText;
                        if (str7.length() == 0) {
                            textView7.setVisibility(4);
                        } else {
                            textView7.setVisibility(0);
                            textView7.setText(str7);
                            governmentIdState2 = governmentIdState;
                            i3 = i6;
                            textView = textView5;
                            textView7.setOnClickListener(new ScannerView$$ExternalSyntheticLambda12(basicGovIdCaptureViewController, governmentIdStepStyle, captureTipsViewModel, capturePage, 5));
                        }
                    } else {
                        i3 = i6;
                        governmentIdState2 = governmentIdState;
                        textView = textView5;
                        textView7.setVisibility(4);
                    }
                    basicGovIdCaptureViewController.captureTipsBottomSheetController.updateBackPressedHandler();
                    if (str.length() == 0) {
                        constraintLayout.setVisibility(8);
                        i7 = 0;
                    } else {
                        i7 = 0;
                        constraintLayout.setVisibility(0);
                    }
                    if (str6 != null || StringsKt.isBlank(str6)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(str6);
                        textView.setVisibility(i7);
                    }
                    cameraController.getPreviewView().setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 18));
                    if (cameraScreen.autoCapturing) {
                    }
                    lifecycleCoroutineScopeImpl = coroutineScope;
                    ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new CameraScreenRunner$$ExternalSyntheticLambda2(this, i3));
                    if (governmentIdState2 instanceof GovernmentIdState.FinalizeWebRtc) {
                    }
                    r6 = 0;
                    standaloneCoroutine.cancel(null);
                    if (z) {
                    }
                } else {
                    staticCaptureTipsView.setVisibility(0);
                    StaticCaptureTipsViewModel staticCaptureTipsViewModel = (StaticCaptureTipsViewModel) captureTipsViewModel;
                    String str8 = staticCaptureTipsViewModel.title;
                    String str9 = staticCaptureTipsViewModel.subtext;
                    NextStep.GovernmentId.AssetConfig.CapturePage capturePage2 = staticCaptureTipsViewModel.iconAsset;
                    Pi2GovernmentidStaticCaptureTipsBinding pi2GovernmentidStaticCaptureTipsBinding = staticCaptureTipsView.binding;
                    TextView textView8 = pi2GovernmentidStaticCaptureTipsBinding.title;
                    TextView textView9 = pi2GovernmentidStaticCaptureTipsBinding.subtext;
                    if (str8 == null) {
                        str8 = "";
                    }
                    com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt.setMarkdown(textView8, str8);
                    if (str9 == null) {
                        str9 = "";
                    }
                    com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt.setMarkdown(textView9, str9);
                    if (capturePage2 != null && (staticCaptureTipsIconPictograph = capturePage2.getStaticCaptureTipsIconPictograph()) != null) {
                        RemoteImageUtilsKt.renderToContainer(staticCaptureTipsIconPictograph, pi2GovernmentidStaticCaptureTipsBinding.iconContainer, false);
                        pi2GovernmentidStaticCaptureTipsBinding.icon.setVisibility(8);
                    }
                    if (governmentIdStepStyle != null && (staticCaptureTipsTitleStyle = governmentIdStepStyle.getStaticCaptureTipsTitleStyle()) != null) {
                        TextStylingKt.style(pi2GovernmentidStaticCaptureTipsBinding.title, staticCaptureTipsTitleStyle, EmptySet.INSTANCE);
                    }
                    if (governmentIdStepStyle != null && (staticCaptureTipsSubtextStyle = governmentIdStepStyle.getStaticCaptureTipsSubtextStyle()) != null) {
                        TextStylingKt.style(textView9, staticCaptureTipsSubtextStyle, EmptySet.INSTANCE);
                    }
                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                    gradientDrawable3.setColor(-3355444);
                    gradientDrawable3.setCornerRadius(8.0f);
                    if (governmentIdStepStyle != null && (staticCaptureTipsBackgroundColor = governmentIdStepStyle.getStaticCaptureTipsBackgroundColor()) != null) {
                        gradientDrawable3.setColor(staticCaptureTipsBackgroundColor.intValue());
                    }
                    if (governmentIdStepStyle != null && (staticCaptureTipsBorderRadius = governmentIdStepStyle.getStaticCaptureTipsBorderRadius()) != null) {
                        gradientDrawable3.setCornerRadius((float) ExtensionsKt.getDpToPx(staticCaptureTipsBorderRadius.doubleValue()));
                    }
                    pi2GovernmentidStaticCaptureTipsBinding.rootView.setBackground(gradientDrawable3);
                    textView7.setVisibility(8);
                }
                i3 = i6;
                governmentIdState2 = governmentIdState;
                textView = textView5;
                basicGovIdCaptureViewController.captureTipsBottomSheetController.updateBackPressedHandler();
                if (str.length() == 0) {
                }
                if (str6 != null) {
                }
                textView.setVisibility(8);
                cameraController.getPreviewView().setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 18));
                if (cameraScreen.autoCapturing) {
                }
                lifecycleCoroutineScopeImpl = coroutineScope;
                ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new CameraScreenRunner$$ExternalSyntheticLambda2(this, i3));
                if (governmentIdState2 instanceof GovernmentIdState.FinalizeWebRtc) {
                }
                r6 = 0;
                standaloneCoroutine.cancel(null);
                if (z) {
                }
            }
        }
        i6 = 1;
        StaticCaptureTipsView staticCaptureTipsView2 = pi2GovernmentidCameraBinding.staticCaptureTips;
        staticCaptureTipsView2.setVisibility(8);
        if (captureTipsViewModel instanceof StaticCaptureTipsViewModel) {
        }
        i3 = i6;
        governmentIdState2 = governmentIdState;
        textView = textView5;
        basicGovIdCaptureViewController.captureTipsBottomSheetController.updateBackPressedHandler();
        if (str.length() == 0) {
        }
        if (str6 != null) {
        }
        textView.setVisibility(8);
        cameraController.getPreviewView().setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 18));
        if (cameraScreen.autoCapturing) {
        }
        lifecycleCoroutineScopeImpl = coroutineScope;
        ah.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new CameraScreenRunner$$ExternalSyntheticLambda2(this, i3));
        if (governmentIdState2 instanceof GovernmentIdState.FinalizeWebRtc) {
        }
        r6 = 0;
        standaloneCoroutine.cancel(null);
        if (z) {
        }
    }

    public final void startLocalVideoCaptureIfNeeded(Screen.CameraScreen cameraScreen, long j) {
        if (cameraScreen.videoCaptureMethod == VideoCaptureMethod.Upload) {
            LifecycleCoroutineScopeImpl coroutineScope = ViewModelKt.getCoroutineScope(ContextUtilsKt.requireLifecycleOwner(this.context).getLifecycle());
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            JobKt.launch$default(coroutineScope, MainDispatcherLoader.dispatcher, null, new CameraScreenRunner$startLocalVideoCaptureIfNeeded$1(this, cameraScreen, coroutineScope, j, null), 2);
        }
    }
}
