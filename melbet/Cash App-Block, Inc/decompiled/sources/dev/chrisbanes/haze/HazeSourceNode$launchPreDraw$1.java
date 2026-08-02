package dev.chrisbanes.haze;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.integrity.bx;
import com.google.android.play.core.integrity.o;
import com.google.android.play.core.integrity.q;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker$check$2$1;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import com.valentinilk.shimmer.ShimmerEffect;
import com.withpersona.sdk2.camera.CameraHelper;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.camera.UnsupportedDevice;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$2;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2;
import kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.selects.SelectBuilderImpl;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.brotli.dec.HuffmanTreeGroup;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class HazeSourceNode$launchPreDraw$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HazeSourceNode$launchPreDraw$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new HazeSourceNode$launchPreDraw$1((HazeSourceNode) obj2, continuation, 0);
            case 1:
                return new HazeSourceNode$launchPreDraw$1((FinancialConnectionsSheetNativeActivity) obj2, continuation, 1);
            case 2:
                return new HazeSourceNode$launchPreDraw$1((GooglePayLauncherActivity) obj2, continuation, 2);
            case 3:
                return new HazeSourceNode$launchPreDraw$1((GooglePayLauncherViewModel) obj2, continuation, 3);
            case 4:
                return new HazeSourceNode$launchPreDraw$1((CollectBankAccountActivity) obj2, continuation, 4);
            case 5:
                return new HazeSourceNode$launchPreDraw$1((CollectBankAccountViewModel) obj2, continuation, 5);
            case 6:
                return new HazeSourceNode$launchPreDraw$1((PaymentLauncherConfirmationActivity) obj2, continuation, 6);
            case 7:
                return new HazeSourceNode$launchPreDraw$1((Sniffer) obj2, continuation, 7);
            case 8:
                return new HazeSourceNode$launchPreDraw$1((ChallengeActivityViewModel) obj2, continuation, 8);
            case 9:
                return new HazeSourceNode$launchPreDraw$1((ShimmerEffect) obj2, continuation, 9);
            case 10:
                return new HazeSourceNode$launchPreDraw$1((Camera2Controller) obj2, continuation, 10);
            case 11:
                return new HazeSourceNode$launchPreDraw$1((CameraCaptureSessionWrapper) obj2, continuation, 11);
            case 12:
                return new HazeSourceNode$launchPreDraw$1((DocumentStepStateManager) obj2, continuation, 12);
            case 13:
                return new HazeSourceNode$launchPreDraw$1((GovernmentIdWorkflow) obj2, continuation, 13);
            case 14:
                return new HazeSourceNode$launchPreDraw$1((CameraScreenRunner) obj2, continuation, 14);
            case 15:
                return new HazeSourceNode$launchPreDraw$1((GovernmentIdStepStateManager) obj2, continuation, 15);
            case 16:
                return new HazeSourceNode$launchPreDraw$1((IntegrationBrowserWorker) obj2, continuation, 16);
            case 17:
                return new HazeSourceNode$launchPreDraw$1((IntegrationStepStateManager) obj2, continuation, 17);
            case 18:
                return new HazeSourceNode$launchPreDraw$1((InquiryFragment) obj2, continuation, 18);
            case 19:
                return new HazeSourceNode$launchPreDraw$1((PlayIntegrityHelper) obj2, continuation, 19);
            case 20:
                return new HazeSourceNode$launchPreDraw$1((PermissionRequestStateManager) obj2, continuation, 20);
            case 21:
                return new HazeSourceNode$launchPreDraw$1((OldCameraScreenRunner) obj2, continuation, 21);
            case 22:
                return new HazeSourceNode$launchPreDraw$1((SelfieWorkflow) obj2, continuation, 22);
            case 23:
                return new HazeSourceNode$launchPreDraw$1((BasicSelfieCaptureViewController) obj2, continuation, 23);
            case 24:
                return new HazeSourceNode$launchPreDraw$1((SelfieStepStateManager) obj2, continuation, 24);
            case 25:
                return new HazeSourceNode$launchPreDraw$1((UiStepFileSelectWorker) obj2, continuation, 25);
            default:
                return new HazeSourceNode$launchPreDraw$1((SelectBuilderImpl) obj2, continuation, 26);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 2:
                ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 4:
                ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 6:
                ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 12:
                ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 15:
                ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 17:
                ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 20:
                ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            case 24:
                ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((HazeSourceNode$launchPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f3, code lost:
    
        if (r2 == r0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03e6, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r3, r16) == r0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03d2, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(5000, r16) == r0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x058a, code lost:
    
        if (r2.emit((com.google.android.gms.tasks.Task) r1, r16) == r0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0577, code lost:
    
        if (r1 == r0) goto L291;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m4022access$resolveLoadPaymentDataTaskIoAF18A;
        Object withContext;
        Object firstOrNull;
        Object doSelect;
        int i = this.$r8$classId;
        int i2 = 19;
        int i3 = 21;
        int i4 = 7;
        CameraHelper cameraHelper = CameraHelper.INSTANCE;
        int i5 = 24;
        int i6 = 5;
        int i7 = 0;
        int i8 = 2;
        int i9 = 3;
        Object obj2 = this.this$0;
        int i10 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HazeEffectNode$$ExternalSyntheticLambda3 hazeEffectNode$$ExternalSyntheticLambda3 = new HazeEffectNode$$ExternalSyntheticLambda3((HazeSourceNode) obj2);
                    this.label = 1;
                    if (Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, hazeEffectNode$$ExternalSyntheticLambda3) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new SquareAccountStore$userFlow$$inlined$map$1(financialConnectionsSheetNativeActivity.getViewModel().stateFlow, i2));
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(financialConnectionsSheetNativeActivity, 15);
                    this.label = 1;
                    Object collect = distinctUntilChanged.collect(new FlowKt__MergeKt$flattenConcat$1$1(anonymousClass1, 16), this);
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                GooglePayLauncherActivity googlePayLauncherActivity = (GooglePayLauncherActivity) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i14 = GooglePayLauncherActivity.$r8$clinit;
                    ReadonlySharedFlow readonlySharedFlow = googlePayLauncherActivity.getViewModel().googlePayResult;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass12 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(googlePayLauncherActivity, 16);
                    this.label = 1;
                    if (readonlySharedFlow.$$delegate_0.collect(anonymousClass12, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 3:
                GooglePayLauncherViewModel googlePayLauncherViewModel = (GooglePayLauncherViewModel) obj2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(googlePayLauncherViewModel.savedStateHandle.get("has_launched"), Boolean.TRUE)) {
                        this.label = 1;
                        m4022access$resolveLoadPaymentDataTaskIoAF18A = GooglePayLauncherViewModel.m4022access$resolveLoadPaymentDataTaskIoAF18A(googlePayLauncherViewModel, this);
                        break;
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                m4022access$resolveLoadPaymentDataTaskIoAF18A = ((Result) obj).value;
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4022access$resolveLoadPaymentDataTaskIoAF18A);
                if (m4120exceptionOrNullimpl == null) {
                    SharedFlowImpl sharedFlowImpl = googlePayLauncherViewModel._googlePayLaunchTask;
                    this.label = 2;
                    break;
                } else {
                    googlePayLauncherViewModel._googleResult.tryEmit(new GooglePayLauncher$Result.Failed(m4120exceptionOrNullimpl));
                }
                return Unit.INSTANCE;
            case 4:
                CollectBankAccountActivity collectBankAccountActivity = (CollectBankAccountActivity) obj2;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 != 0) {
                    if (i16 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                int i17 = CollectBankAccountActivity.$r8$clinit;
                SharedFlowImpl sharedFlowImpl2 = ((CollectBankAccountViewModel) collectBankAccountActivity.viewModel$delegate.getValue()).viewEffect;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass13 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(collectBankAccountActivity, 18);
                this.label = 1;
                sharedFlowImpl2.collect(anonymousClass13, this);
                return coroutineSingletons5;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (CollectBankAccountViewModel.access$createFinancialConnectionsSession((CollectBankAccountViewModel) obj2, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = (PaymentLauncherConfirmationActivity) obj2;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 != 0) {
                    if (i19 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = paymentLauncherConfirmationActivity.getViewModel$payments_core_release().internalPaymentResult;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass14 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(paymentLauncherConfirmationActivity, i2);
                this.label = 1;
                stateFlowImpl.collect(anonymousClass14, this);
                return coroutineSingletons7;
            case 7:
                Sniffer sniffer = (Sniffer) obj2;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) sniffer.scratch;
                    this.label = 1;
                    withContext = JobKt.withContext((CoroutineContext) huffmanTreeGroup.codes, new CameraHelper$unbind$2(huffmanTreeGroup, z ? 1 : 0, i3), this);
                    if (withContext == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                AppInfo appInfo = (AppInfo) withContext;
                if (appInfo == null || sniffer.peekLength != appInfo.version) {
                    sniffer.initAppInfo();
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultTransactionTimer defaultTransactionTimer = ((ChallengeActivityViewModel) obj2).transactionTimer;
                    this.label = 1;
                    if (defaultTransactionTimer.start(this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShimmerEffect shimmerEffect = (ShimmerEffect) obj2;
                    this.label = 1;
                    Object animateTo$default = Animatable.animateTo$default(shimmerEffect.animatedState, new Float(1.0f), shimmerEffect.animationSpec, null, null, this, 12);
                    Object obj4 = animateTo$default;
                    if (animateTo$default != obj3) {
                        obj4 = Unit.INSTANCE;
                    }
                    if (obj4 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                Camera2Controller camera2Controller = (Camera2Controller) obj2;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow = new SafeFlow(new FlowKt__LimitKt$transformWhile$1((Object) ((Camera2Manager) camera2Controller.currentManager).state, (Object) new CachedPagingDataKt$cachedIn$2(i9, (Continuation) (z3 ? 1 : 0), 8), (Continuation) (z2 ? 1 : 0), i7));
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass15 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(camera2Controller, 22);
                    this.label = 1;
                    if (safeFlow.collect(anonymousClass15, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                CameraHelper$unbind$2 cameraHelper$unbind$2 = new CameraHelper$unbind$2((CameraCaptureSessionWrapper) obj2, z4 ? 1 : 0, i5);
                this.label = 2;
                break;
            case 12:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 != 0) {
                    if (i25 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DocumentStepStateManager documentStepStateManager = (DocumentStepStateManager) obj2;
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) documentStepStateManager.firstChild;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass16 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(documentStepStateManager, i5);
                this.label = 1;
                stateFlowImpl2.collect(anonymousClass16, this);
                return coroutineSingletons12;
            case 13:
                GovernmentIdWorkflow governmentIdWorkflow = (GovernmentIdWorkflow) obj2;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Context context = governmentIdWorkflow.applicationContext;
                    this.label = 1;
                    if (cameraHelper.unbind(context, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                governmentIdWorkflow.videoCaptureHelper.getClass();
                return Unit.INSTANCE;
            case 14:
                final CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) obj2;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl cameraState = cameraScreenRunner.cameraController.getCameraState();
                    cameraState.getClass();
                    SafeFlow safeFlow2 = new SafeFlow(new FlowKt__LimitKt$transformWhile$1((Object) cameraState, (Object) new CachedPagingDataKt$cachedIn$2(i9, (Continuation) (z6 ? 1 : 0), i4), (Continuation) (z5 ? 1 : 0), i7));
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$registerCameraStateListener$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj5, Continuation continuation) {
                            Function1 function1;
                            CameraState cameraState2 = (CameraState) obj5;
                            boolean areEqual = Intrinsics.areEqual(cameraState2, CameraState.Error.INSTANCE$3);
                            CameraScreenRunner cameraScreenRunner2 = CameraScreenRunner.this;
                            if (areEqual) {
                                TrackingEventsLogger.DefaultImpls.logCameraInfoEvent$default(cameraScreenRunner2.trackingEventsLogger, CameraPropertiesKt.toCameraInfoEventData(cameraScreenRunner2.cameraController.getCameraProperties()), false, 2, null);
                            } else if (Intrinsics.areEqual(cameraState2, CameraState.Error.INSTANCE)) {
                                Function1 function12 = cameraScreenRunner2.currentErrorHandler;
                                if (function12 != null) {
                                    function12.invoke(new UnsupportedDevice());
                                }
                            } else if (cameraState2 instanceof CameraState.Closed) {
                                CameraState.Closed closed = (CameraState.Closed) cameraState2;
                                if (closed.wasRecordingInterrupted && (function1 = cameraScreenRunner2.currentErrorHandler) != null) {
                                    function1.invoke(new RecordingInterrupted(closed.isClosedDueToBadCameraConfiguration));
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (safeFlow2.collect(flowCollector, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 != 0) {
                    if (i28 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                GovernmentIdStepStateManager governmentIdStepStateManager = (GovernmentIdStepStateManager) obj2;
                StateFlowImpl stateFlowImpl3 = (StateFlowImpl) governmentIdStepStateManager.firstChild;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass17 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(governmentIdStepStateManager, 25);
                this.label = 1;
                stateFlowImpl3.collect(anonymousClass17, this);
                return coroutineSingletons15;
            case 16:
                IntegrationBrowserWorker integrationBrowserWorker = (IntegrationBrowserWorker) obj2;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(integrationBrowserWorker.url));
                    intent.addFlags(268435456);
                    integrationBrowserWorker.applicationContext.startActivity(intent);
                    this.label = 1;
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl.initCancellability();
                    DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$waitForExternalBrowserReturn$2$observer$1
                        public boolean hasLeftApp;

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final void onPause(LifecycleOwner lifecycleOwner) {
                            this.hasLeftApp = true;
                        }

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final void onResume(LifecycleOwner lifecycleOwner) {
                            if (this.hasLeftApp) {
                                ProcessLifecycleOwner.newInstance.registry.removeObserver(this);
                                CancellableContinuationImpl cancellableContinuationImpl2 = CancellableContinuationImpl.this;
                                if (cancellableContinuationImpl2.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
                                    Result.Companion companion = Result.Companion;
                                    cancellableContinuationImpl2.resumeWith(Unit.INSTANCE);
                                }
                            }
                        }
                    };
                    ProcessLifecycleOwner.newInstance.registry.addObserver(defaultLifecycleObserver);
                    cancellableContinuationImpl.invokeOnCancellation(new KClasses$$Lambda$2(defaultLifecycleObserver, i5));
                    Object result = cancellableContinuationImpl.getResult();
                    if (result != coroutineSingletons16) {
                        result = Unit.INSTANCE;
                    }
                    if (result == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                IntegrationStepStateManager integrationStepStateManager = (IntegrationStepStateManager) obj2;
                StateFlowImpl stateFlowImpl4 = (StateFlowImpl) integrationStepStateManager.firstChild;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass18 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(integrationStepStateManager, 26);
                this.label = 1;
                stateFlowImpl4.collect(anonymousClass18, this);
                return coroutineSingletons17;
            case 18:
                final InquiryFragment inquiryFragment = (InquiryFragment) obj2;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(inquiryFragment.getViewModel$1().forceFallbackModeFlow, 1);
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$onViewCreated$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj5, Continuation continuation) {
                            ((Boolean) obj5).getClass();
                            InquiryFragment.this.createAndLaunchInquiry(true);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (drop.collect(flowCollector2, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                PlayIntegrityHelper playIntegrityHelper = (PlayIntegrityHelper) obj2;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(playIntegrityHelper.playIntegrityState.getValue() instanceof PlayIntegrityHelper.PlayIntegrityState.NotStarted)) {
                        StartedLazily$command$$inlined$unsafeFlow$1 startedLazily$command$$inlined$unsafeFlow$1 = new StartedLazily$command$$inlined$unsafeFlow$1(new FinishSetupTileBadgeCounter(i3, new AppLockMonitor$special$$inlined$map$2(new FlowKt__DelayKt$timeoutInternal$1(PlayIntegrityHelper.INTEGRITY_TOKEN_PROVIDER_MAX_WAIT_DURATION, new SquareAccountStore$userFlow$$inlined$map$1(playIntegrityHelper.playIntegrityState, 20), null), 20), new CachedPagingDataKt$cachedIn$5(3, null, 4)), 2);
                        this.label = 1;
                        firstOrNull = FlowKt.firstOrNull(startedLazily$command$$inlined$unsafeFlow$1, this);
                        break;
                    } else {
                        return null;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                bx bxVar = (bx) firstOrNull;
                if (bxVar == null) {
                    return null;
                }
                this.label = 2;
                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                cancellableContinuationImpl2.initCancellability();
                o builder = q.builder();
                builder.a = UUID.randomUUID().toString();
                zzw request = bxVar.request(builder.build());
                int i33 = 5;
                o0 o0Var = new o0(new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl2, i33), 13);
                request.getClass();
                request.addOnSuccessListener(TaskExecutors.MAIN_THREAD, o0Var);
                request.addOnFailureListener(new RealWebSocket$connect$1(i33, playIntegrityHelper, cancellableContinuationImpl2));
                Object result2 = cancellableContinuationImpl2.getResult();
                if (result2 != coroutineSingletons19) {
                    return result2;
                }
                return coroutineSingletons19;
            case 20:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 != 0) {
                    if (i34 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                PermissionRequestStateManager permissionRequestStateManager = (PermissionRequestStateManager) obj2;
                StateFlowImpl stateFlowImpl5 = (StateFlowImpl) permissionRequestStateManager.firstChild;
                FlowKt__CollectionKt$toCollection$2 flowKt__CollectionKt$toCollection$2 = new FlowKt__CollectionKt$toCollection$2(permissionRequestStateManager, i10);
                this.label = 1;
                stateFlowImpl5.collect(flowKt__CollectionKt$toCollection$2, this);
                return coroutineSingletons20;
            case 21:
                OldCameraScreenRunner oldCameraScreenRunner = (OldCameraScreenRunner) obj2;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl cameraState2 = oldCameraScreenRunner.cameraController.getCameraState();
                    cameraState2.getClass();
                    SafeFlow safeFlow3 = new SafeFlow(new FlowKt__LimitKt$transformWhile$1((Object) cameraState2, (Object) new CachedPagingDataKt$cachedIn$2(i9, (Continuation) (z8 ? 1 : 0), i4), (Continuation) (z7 ? 1 : 0), i7));
                    FlowKt__CollectionKt$toCollection$2 flowKt__CollectionKt$toCollection$22 = new FlowKt__CollectionKt$toCollection$2(oldCameraScreenRunner, i8);
                    this.label = 1;
                    if (safeFlow3.collect(flowKt__CollectionKt$toCollection$22, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                SelfieWorkflow selfieWorkflow = (SelfieWorkflow) obj2;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Context context2 = selfieWorkflow.applicationContext;
                    this.label = 1;
                    if (cameraHelper.unbind(context2, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                BasicSelfieCaptureViewController basicSelfieCaptureViewController = (BasicSelfieCaptureViewController) obj2;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow debounce = FlowKt.debounce(basicSelfieCaptureViewController.realTimeHintFlow, 300L);
                    FlowKt__CollectionKt$toCollection$2 flowKt__CollectionKt$toCollection$23 = new FlowKt__CollectionKt$toCollection$2(basicSelfieCaptureViewController, i9);
                    this.label = 1;
                    if (debounce.collect(flowKt__CollectionKt$toCollection$23, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 != 0) {
                    if (i38 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) obj2;
                StateFlowImpl stateFlowImpl6 = (StateFlowImpl) selfieStepStateManager.firstChild;
                FlowKt__CollectionKt$toCollection$2 flowKt__CollectionKt$toCollection$24 = new FlowKt__CollectionKt$toCollection$2(selfieStepStateManager, i6);
                this.label = 1;
                stateFlowImpl6.collect(flowKt__CollectionKt$toCollection$24, this);
                return coroutineSingletons24;
            case 25:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 != 0) {
                    if (i39 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                UiStepFileSelectWorker$Factory$create$2 uiStepFileSelectWorker$Factory$create$2 = ((UiStepFileSelectWorker) obj2).checkPendingResult;
                this.label = 1;
                Object invoke = uiStepFileSelectWorker$Factory$create$2.invoke(this);
                return invoke == coroutineSingletons25 ? coroutineSingletons25 : invoke;
            default:
                SelectBuilderImpl selectBuilderImpl = (SelectBuilderImpl) obj2;
                CancellableContinuationImpl cancellableContinuationImpl3 = selectBuilderImpl.cont;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                try {
                    if (i40 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        doSelect = selectBuilderImpl.doSelect(this);
                        if (doSelect == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i40 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        doSelect = obj;
                    }
                    CoroutineContext.Element element = cancellableContinuationImpl3.context.get(ContinuationInterceptor.Key);
                    CoroutineDispatcher coroutineDispatcher = element instanceof CoroutineDispatcher ? (CoroutineDispatcher) element : null;
                    if (coroutineDispatcher != null) {
                        cancellableContinuationImpl3.resumeUndispatched(coroutineDispatcher, doSelect);
                    } else {
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl3.resumeWith(doSelect);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    CoroutineContext.Element element2 = cancellableContinuationImpl3.context.get(ContinuationInterceptor.Key);
                    CoroutineDispatcher coroutineDispatcher2 = element2 instanceof CoroutineDispatcher ? (CoroutineDispatcher) element2 : null;
                    if (coroutineDispatcher2 != null) {
                        Continuation continuation = cancellableContinuationImpl3.delegate;
                        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
                        cancellableContinuationImpl3.resumeImpl$kotlinx_coroutines_core(new CompletedExceptionally(th, false), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) != coroutineDispatcher2 ? cancellableContinuationImpl3.resumeMode : 4, null);
                    } else {
                        Result.Companion companion2 = Result.Companion;
                        cancellableContinuationImpl3.resumeWith(new Result.Failure(th));
                    }
                    return Unit.INSTANCE;
                }
        }
    }
}
