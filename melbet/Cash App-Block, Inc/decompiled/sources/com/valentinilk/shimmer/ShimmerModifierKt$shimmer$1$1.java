package com.valentinilk.shimmer;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.view.SurfaceHolder;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.consent.ConsentClickableText;
import com.stripe.android.financialconnections.features.error.ErrorState;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerClickableText;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onNewBankAccountClick$1;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.OTPElement$$ExternalSyntheticLambda0;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.ProgressRequestBody;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.launchers.DocumentsSelectLauncherResult;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ShimmerModifierKt$shimmer$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $area;
    public Object $customShimmer;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShimmerModifierKt$shimmer$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$customShimmer = obj;
        this.$area = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$area;
        switch (i) {
            case 0:
                return new ShimmerModifierKt$shimmer$1$1((Shimmer) this.$customShimmer, (ShimmerArea) obj2, continuation, 0);
            case 1:
                return new ShimmerModifierKt$shimmer$1$1((ErrorViewModel) obj2, continuation, 1);
            case 2:
                return new ShimmerModifierKt$shimmer$1$1((LinkAccountPickerViewModel) this.$customShimmer, (String) obj2, continuation, 2);
            case 3:
                ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$1 = new ShimmerModifierKt$shimmer$1$1((ManualEntryViewModel) obj2, continuation, 3);
                shimmerModifierKt$shimmer$1$1.$customShimmer = obj;
                return shimmerModifierKt$shimmer$1$1;
            case 4:
                return new ShimmerModifierKt$shimmer$1$1((NetworkingLinkVerificationState.Payload) this.$customShimmer, (NetworkingLinkVerificationViewModel) obj2, continuation, 4);
            case 5:
                return new ShimmerModifierKt$shimmer$1$1((NetworkingSaveToLinkVerificationState.Payload) this.$customShimmer, (NetworkingSaveToLinkVerificationViewModel) obj2, continuation, 5);
            case 6:
                return new ShimmerModifierKt$shimmer$1$1((NoticeSheetViewModel) this.$customShimmer, (String) obj2, continuation, 6);
            case 7:
                return new ShimmerModifierKt$shimmer$1$1((WebAuthFlowState) this.$customShimmer, (PartnerAuthViewModel) obj2, continuation, 7);
            case 8:
                return new ShimmerModifierKt$shimmer$1$1((IDConsentContentViewModel) this.$customShimmer, (String) obj2, continuation, 8);
            case 9:
                ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$12 = new ShimmerModifierKt$shimmer$1$1((SuccessViewModel) obj2, continuation, 9);
                shimmerModifierKt$shimmer$1$12.$customShimmer = obj;
                return shimmerModifierKt$shimmer$1$12;
            case 10:
                return new ShimmerModifierKt$shimmer$1$1((FinancialConnectionsLiteViewModel) this.$customShimmer, (Throwable) obj2, continuation, 10);
            case 11:
                return new ShimmerModifierKt$shimmer$1$1((FinancialConnectionsLiteViewModel) this.$customShimmer, (String) obj2, continuation, 11);
            case 12:
                ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$13 = new ShimmerModifierKt$shimmer$1$1((BottomSheetNavigator) obj2, continuation, 12);
                shimmerModifierKt$shimmer$1$13.$customShimmer = obj;
                return shimmerModifierKt$shimmer$1$13;
            case 13:
                return new ShimmerModifierKt$shimmer$1$1((FinancialConnectionsViewModel) this.$customShimmer, obj2, continuation, 13);
            case 14:
                return new ShimmerModifierKt$shimmer$1$1((RealWebSocket$connect$1) this.$customShimmer, (OnBackPressedDispatcher) obj2, continuation, 14);
            case 15:
                return new ShimmerModifierKt$shimmer$1$1((RealWebSocket$connect$1) this.$customShimmer, (Function0) obj2, continuation, 15);
            case 16:
                return new ShimmerModifierKt$shimmer$1$1((DefaultGooglePayRepository) this.$customShimmer, (IsReadyToPayRequest) obj2, continuation, 16);
            case 17:
                return new ShimmerModifierKt$shimmer$1$1((GooglePayLauncherActivity) this.$customShimmer, (ActivityResultLauncher) obj2, continuation, 17);
            case 18:
                return new ShimmerModifierKt$shimmer$1$1((FinancialConnectionsSheetResult) this.$customShimmer, (CollectBankAccountViewModel) obj2, continuation, 18);
            case 19:
                return new ShimmerModifierKt$shimmer$1$1((FinancialConnectionsSheetInstantDebitsResult) this.$customShimmer, (CollectBankAccountViewModel) obj2, continuation, 19);
            case 20:
                return new ShimmerModifierKt$shimmer$1$1((PaymentLauncherViewModel) this.$customShimmer, (PaymentFlowResult$Unvalidated) obj2, continuation, 20);
            case 21:
                return new ShimmerModifierKt$shimmer$1$1((ChallengeActionHandler$Default) this.$customShimmer, (ChallengeAction) obj2, continuation, 21);
            case 22:
                return new ShimmerModifierKt$shimmer$1$1((ScrollState) this.$customShimmer, (Ref$IntRef) obj2, continuation, 22);
            case 23:
                return new ShimmerModifierKt$shimmer$1$1((StripeBottomSheetState) this.$customShimmer, (Function0) obj2, continuation, 23);
            case 24:
                return new ShimmerModifierKt$shimmer$1$1((StateFlow) this.$customShimmer, (ProduceStateScope) obj2, continuation, 24);
            case 25:
                return new ShimmerModifierKt$shimmer$1$1((StateFlowImpl) this.$customShimmer, (PaymentAuthWebViewActivity) obj2, continuation, 25);
            case 26:
                return new ShimmerModifierKt$shimmer$1$1((Camera2Manager) obj2, continuation, 26);
            case 27:
                ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$14 = new ShimmerModifierKt$shimmer$1$1((DocumentsSelectWorker) obj2, continuation, 27);
                shimmerModifierKt$shimmer$1$14.$customShimmer = obj;
                return shimmerModifierKt$shimmer$1$14;
            case 28:
                ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$15 = new ShimmerModifierKt$shimmer$1$1((ProgressRequestBody) obj2, continuation, 28);
                shimmerModifierKt$shimmer$1$15.$customShimmer = obj;
                return shimmerModifierKt$shimmer$1$15;
            default:
                return new ShimmerModifierKt$shimmer$1$1((DocumentFileUploadWorker) this.$customShimmer, (ProgressRequestBody) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 1:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((ShimmerModifierKt$shimmer$1$1) create((ManualEntryState.Payload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((ShimmerModifierKt$shimmer$1$1) create((SuccessState.Payload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((ShimmerModifierKt$shimmer$1$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 18:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 25:
                ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 26:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((ShimmerModifierKt$shimmer$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((ShimmerModifierKt$shimmer$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ShimmerModifierKt$shimmer$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e6, code lost:
    
        if (r1 == r7) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r1.emit(r2, r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r7.collect(r2, r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        if (com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker.access$handleDocumentResult(r13, r1, r2, r5) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010f, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r3, r5) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        if (r2 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:
    
        if (r0 != r7) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object value;
        PaymentFlowResultProcessor paymentFlowResultProcessor;
        Object m4053processResultgIAlus;
        ChallengeRequestData copy$default;
        Object awaitDismissal;
        Object result;
        Camera2Manager camera2Manager;
        CameraDevice cameraDevice;
        LinkResolverDef linkResolverDef;
        Object obj2;
        CameraChoice cameraChoice;
        CameraCharacteristics cameraCharacteristics;
        Handler handler;
        Object create;
        Object create2;
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper;
        FlowCollector flowCollector;
        Object withTimeoutOrNull;
        FlowCollector flowCollector2;
        ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$1 = this;
        int i = shimmerModifierKt$shimmer$1$1.$r8$classId;
        int i2 = 25;
        int i3 = 5;
        CollectBankAccountResultInternal.Cancelled cancelled = CollectBankAccountResultInternal.Cancelled.INSTANCE;
        int i4 = 27;
        int i5 = 11;
        int i6 = 26;
        int i7 = 4;
        int i8 = 0;
        int i9 = 2;
        Object obj3 = shimmerModifierKt$shimmer$1$1.$area;
        int i10 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = shimmerModifierKt$shimmer$1$1.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = ((Shimmer) shimmerModifierKt$shimmer$1$1.$customShimmer).boundsFlow;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1((ShimmerArea) obj3, 21);
                shimmerModifierKt$shimmer$1$1.label = 1;
                stateFlowImpl.collect(anonymousClass1, shimmerModifierKt$shimmer$1$1);
                return coroutineSingletons;
            case 1:
                ErrorViewModel errorViewModel = (ErrorViewModel) obj3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = shimmerModifierKt$shimmer$1$1.label;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion2 = Result.Companion;
                    Object invoke = ((ErrorState) errorViewModel.stateFlow.$$delegate_0.getValue()).payload.invoke();
                    if (invoke == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ErrorState.Payload payload = (ErrorState.Payload) invoke;
                    if (payload.disableLinkMoreAccounts) {
                        Throwable th2 = payload.error;
                        shimmerModifierKt$shimmer$1$1.$customShimmer = null;
                        shimmerModifierKt$shimmer$1$1.label = 1;
                        Object emit = errorViewModel.coordinator.flow.emit(new NativeAuthFlowCoordinator.Message.CloseWithError(th2), shimmerModifierKt$shimmer$1$1);
                        if (emit != coroutineSingletons2) {
                            emit = Unit.INSTANCE;
                        }
                        if (emit == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        NavigationManagerImpl.tryNavigateTo$default(errorViewModel.navigationManager, Destination.invoke$default(Destination.Reset.INSTANCE, ErrorViewModel.PANE), new PopUpToBehavior.Current(), 4);
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                failure = Unit.INSTANCE;
                Result.Companion companion3 = Result.Companion;
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    shimmerModifierKt$shimmer$1$1.$customShimmer = failure;
                    shimmerModifierKt$shimmer$1$1.label = 2;
                    Object emit2 = errorViewModel.coordinator.flow.emit(new NativeAuthFlowCoordinator.Message.CloseWithError(m4120exceptionOrNullimpl), shimmerModifierKt$shimmer$1$1);
                    if (emit2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        emit2 = Unit.INSTANCE;
                    }
                    if (emit2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = shimmerModifierKt$shimmer$1$1.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Date date = new Date();
                    LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    HandleClickableUrl handleClickableUrl = linkAccountPickerViewModel.handleClickableUrl;
                    FinancialConnectionsSessionManifest.Pane pane = LinkAccountPickerViewModel.PANE;
                    String str = (String) obj3;
                    CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda4 = new CardTransitionKt$$ExternalSyntheticLambda4(i2, linkAccountPickerViewModel, str, date);
                    LinkAccountPickerClickableText[] linkAccountPickerClickableTextArr = LinkAccountPickerClickableText.$VALUES;
                    Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("stripe://data-access-notice", new LinkAccountPickerViewModel$onNewBankAccountClick$1(linkAccountPickerViewModel, continuation, i10)));
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (handleClickableUrl.invoke(pane, str, cardTransitionKt$$ExternalSyntheticLambda4, mapOf, shimmerModifierKt$shimmer$1$1) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                ManualEntryState.Payload payload2 = (ManualEntryState.Payload) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = shimmerModifierKt$shimmer$1$1.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (payload2.customManualEntry) {
                        SharedFlowImpl sharedFlowImpl = ((ManualEntryViewModel) obj3).nativeAuthFlowCoordinator.flow;
                        NativeAuthFlowCoordinator.Message.Complete complete = new NativeAuthFlowCoordinator.Message.Complete(NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause.USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY);
                        shimmerModifierKt$shimmer$1$1.$customShimmer = null;
                        shimmerModifierKt$shimmer$1$1.label = 1;
                        if (sharedFlowImpl.emit(complete, shimmerModifierKt$shimmer$1$1) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = shimmerModifierKt$shimmer$1$1.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OTPElement oTPElement = ((NetworkingLinkVerificationState.Payload) shimmerModifierKt$shimmer$1$1.$customShimmer).otpElement;
                    StartedLazily$command$$inlined$unsafeFlow$1 startedLazily$command$$inlined$unsafeFlow$1 = new StartedLazily$command$$inlined$unsafeFlow$1(IblLoaderKt.mapAsStateFlow(oTPElement.controller.fieldValue, new OTPElement$$ExternalSyntheticLambda0(oTPElement, i8)), 1);
                    HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682 c00682 = new HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682(2, (NetworkingLinkVerificationViewModel) obj3, NetworkingLinkVerificationViewModel.class, "onOTPEntered", "onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 12, 7);
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (FlowKt.collectLatest(startedLazily$command$$inlined$unsafeFlow$1, c00682, shimmerModifierKt$shimmer$1$1) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = shimmerModifierKt$shimmer$1$1.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OTPElement oTPElement2 = ((NetworkingSaveToLinkVerificationState.Payload) shimmerModifierKt$shimmer$1$1.$customShimmer).otpElement;
                    StartedLazily$command$$inlined$unsafeFlow$1 startedLazily$command$$inlined$unsafeFlow$12 = new StartedLazily$command$$inlined$unsafeFlow$1(IblLoaderKt.mapAsStateFlow(oTPElement2.controller.fieldValue, new OTPElement$$ExternalSyntheticLambda0(oTPElement2, i8)), 1);
                    NetworkingSaveToLinkVerificationViewModel$logErrors$2 networkingSaveToLinkVerificationViewModel$logErrors$2 = new NetworkingSaveToLinkVerificationViewModel$logErrors$2((NetworkingSaveToLinkVerificationViewModel) obj3, continuation, i10);
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (FlowKt.collectLatest(startedLazily$command$$inlined$unsafeFlow$12, networkingSaveToLinkVerificationViewModel$logErrors$2, shimmerModifierKt$shimmer$1$1) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                NoticeSheetViewModel noticeSheetViewModel = (NoticeSheetViewModel) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = shimmerModifierKt$shimmer$1$1.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Date date2 = new Date();
                    FinancialConnectionsSessionManifest.Pane pane2 = ((NoticeSheetState) noticeSheetViewModel.stateFlow.$$delegate_0.getValue()).pane;
                    HandleClickableUrl handleClickableUrl2 = noticeSheetViewModel.handleClickableUrl;
                    String str2 = (String) obj3;
                    CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda42 = new CardTransitionKt$$ExternalSyntheticLambda4(i6, noticeSheetViewModel, str2, date2);
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (handleClickableUrl2.invoke(pane2, str2, cardTransitionKt$$ExternalSyntheticLambda42, emptyMap, shimmerModifierKt$shimmer$1$1) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                WebAuthFlowState webAuthFlowState = (WebAuthFlowState) shimmerModifierKt$shimmer$1$1.$customShimmer;
                PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) obj3;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = shimmerModifierKt$shimmer$1$1.label;
                if (i18 != 0) {
                    if (i18 == 1 || i18 == 2 || i18 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (webAuthFlowState instanceof WebAuthFlowState.Canceled) {
                    String str3 = ((WebAuthFlowState.Canceled) webAuthFlowState).url;
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (PartnerAuthViewModel.access$onAuthCancelled(partnerAuthViewModel, str3, shimmerModifierKt$shimmer$1$1) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else if (webAuthFlowState instanceof WebAuthFlowState.Failed) {
                    WebAuthFlowState.Failed failed = (WebAuthFlowState.Failed) webAuthFlowState;
                    String str4 = failed.url;
                    String str5 = failed.message;
                    String str6 = failed.reason;
                    shimmerModifierKt$shimmer$1$1.label = 2;
                    if (PartnerAuthViewModel.access$onAuthFailed(partnerAuthViewModel, str4, str5, str6, shimmerModifierKt$shimmer$1$1) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else if (Intrinsics.areEqual(webAuthFlowState, WebAuthFlowState.InProgress.INSTANCE)) {
                    partnerAuthViewModel.getClass();
                    StateFlowImpl stateFlowImpl2 = partnerAuthViewModel._stateFlow;
                    do {
                        value = stateFlowImpl2.getValue();
                    } while (!stateFlowImpl2.compareAndSet(value, SharedPartnerAuthState.copy$default((SharedPartnerAuthState) value, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING)), 23)));
                } else if (webAuthFlowState instanceof WebAuthFlowState.Success) {
                    String str7 = ((WebAuthFlowState.Success) webAuthFlowState).url;
                    shimmerModifierKt$shimmer$1$1.label = 3;
                    if (PartnerAuthViewModel.access$completeAuthorizationSession(partnerAuthViewModel, str7, shimmerModifierKt$shimmer$1$1) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else if (!Intrinsics.areEqual(webAuthFlowState, WebAuthFlowState.Uninitialized.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = shimmerModifierKt$shimmer$1$1.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    IDConsentContentViewModel iDConsentContentViewModel = (IDConsentContentViewModel) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    HandleClickableUrl handleClickableUrl3 = iDConsentContentViewModel.handleClickableUrl;
                    FinancialConnectionsSessionManifest.Pane pane3 = IDConsentContentViewModel.PANE;
                    String str8 = (String) obj3;
                    HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(19, iDConsentContentViewModel, str8);
                    ConsentClickableText[] consentClickableTextArr = ConsentClickableText.$VALUES;
                    Map mapOf2 = MapsKt__MapsJVMKt.mapOf(new Pair("stripe://legal-details-notice", new CameraHelper$unbind$2(iDConsentContentViewModel, continuation, 18)));
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (handleClickableUrl3.invoke(pane3, str8, heroCardViewKt$$ExternalSyntheticLambda0, mapOf2, shimmerModifierKt$shimmer$1$1) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                SuccessState.Payload payload3 = (SuccessState.Payload) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = shimmerModifierKt$shimmer$1$1.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SuccessViewModel successViewModel = (SuccessViewModel) obj3;
                    if (payload3.skipSuccessPane) {
                        shimmerModifierKt$shimmer$1$1.$customShimmer = null;
                        shimmerModifierKt$shimmer$1$1.label = 1;
                        Object emit3 = successViewModel.nativeAuthFlowCoordinator.flow.emit(new NativeAuthFlowCoordinator.Message.Complete(null), shimmerModifierKt$shimmer$1$1);
                        if (emit3 != coroutineSingletons10) {
                            emit3 = Unit.INSTANCE;
                        }
                        if (emit3 == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        successViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(SuccessViewModel.PANE, 25));
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = shimmerModifierKt$shimmer$1$1.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl2 = ((FinancialConnectionsLiteViewModel) shimmerModifierKt$shimmer$1$1.$customShimmer)._viewEffects;
                    FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult finishWithResult = new FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult(new FinancialConnectionsSheetActivityResult.Failed((Throwable) obj3));
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (sharedFlowImpl2.emit(finishWithResult, shimmerModifierKt$shimmer$1$1) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = shimmerModifierKt$shimmer$1$1.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl3 = ((FinancialConnectionsLiteViewModel) shimmerModifierKt$shimmer$1$1.$customShimmer)._viewEffects;
                    FinancialConnectionsLiteViewModel.ViewEffect.OpenCustomTab openCustomTab = new FinancialConnectionsLiteViewModel.ViewEffect.OpenCustomTab((String) obj3);
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (sharedFlowImpl3.emit(openCustomTab, shimmerModifierKt$shimmer$1$1) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                BottomSheetNavigator bottomSheetNavigator = (BottomSheetNavigator) obj3;
                ProduceStateScope produceStateScope = (ProduceStateScope) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = shimmerModifierKt$shimmer$1$1.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow = new SafeFlow(new WorkerWorkflow$render$1(((Boolean) bottomSheetNavigator.attached$delegate.getValue()).booleanValue() ? bottomSheetNavigator.getState().backStack : FlowKt.MutableStateFlow(EmptyList.INSTANCE), continuation, bottomSheetNavigator, i4));
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, 9);
                    shimmerModifierKt$shimmer$1$1.$customShimmer = null;
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (safeFlow.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$1, shimmerModifierKt$shimmer$1$1) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                FinancialConnectionsViewModel financialConnectionsViewModel = (FinancialConnectionsViewModel) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = shimmerModifierKt$shimmer$1$1.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TopAppBarStateUpdate updateTopAppBar = financialConnectionsViewModel.updateTopAppBar(obj3);
                    if (updateTopAppBar == null) {
                        return Unit.INSTANCE;
                    }
                    SharedFlowImpl sharedFlowImpl4 = financialConnectionsViewModel.nativeAuthFlowCoordinator.flow;
                    NativeAuthFlowCoordinator.Message.UpdateTopAppBar updateTopAppBar2 = new NativeAuthFlowCoordinator.Message.UpdateTopAppBar(updateTopAppBar);
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (sharedFlowImpl4.emit(updateTopAppBar2, shimmerModifierKt$shimmer$1$1) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = shimmerModifierKt$shimmer$1$1.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealWebSocket$connect$1 realWebSocket$connect$1 = (RealWebSocket$connect$1) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (realWebSocket$connect$1.dismiss(shimmerModifierKt$shimmer$1$1) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) obj3;
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.onBackPressed();
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = shimmerModifierKt$shimmer$1$1.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealWebSocket$connect$1 realWebSocket$connect$12 = (RealWebSocket$connect$1) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (realWebSocket$connect$12.dismiss(shimmerModifierKt$shimmer$1$1) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((Function0) obj3).invoke();
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = shimmerModifierKt$shimmer$1$1.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    Object isReady = ((DefaultGooglePayAvailabilityClient) ((DefaultGooglePayRepository) shimmerModifierKt$shimmer$1$1.$customShimmer).googlePayAvailabilityClient$delegate.getValue()).isReady((IsReadyToPayRequest) obj3, shimmerModifierKt$shimmer$1$1);
                    return isReady == coroutineSingletons17 ? coroutineSingletons17 : isReady;
                }
                if (i27 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                GooglePayLauncherActivity googlePayLauncherActivity = (GooglePayLauncherActivity) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = shimmerModifierKt$shimmer$1$1.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i29 = GooglePayLauncherActivity.$r8$clinit;
                    ReadonlySharedFlow readonlySharedFlow = googlePayLauncherActivity.getViewModel().googlePayLaunchTask;
                    TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass12 = new TakeUntil$collectSafely$2.AnonymousClass1(i6, (ActivityResultLauncher) obj3, googlePayLauncherActivity);
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (readonlySharedFlow.$$delegate_0.collect(anonymousClass12, shimmerModifierKt$shimmer$1$1) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 18:
                FinancialConnectionsSheetResult financialConnectionsSheetResult = (FinancialConnectionsSheetResult) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CollectBankAccountViewModel collectBankAccountViewModel = (CollectBankAccountViewModel) obj3;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = shimmerModifierKt$shimmer$1$1.label;
                if (i30 != 0) {
                    if (i30 == 1 || i30 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Canceled) {
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (collectBankAccountViewModel.finishWithResult(cancelled, shimmerModifierKt$shimmer$1$1) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Failed) {
                    Throwable th3 = ((FinancialConnectionsSheetResult.Failed) financialConnectionsSheetResult).error;
                    shimmerModifierKt$shimmer$1$1.label = 2;
                    if (collectBankAccountViewModel.finishWithError(th3, shimmerModifierKt$shimmer$1$1) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (!(financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Completed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (collectBankAccountViewModel.args.getAttachToIntent()) {
                        JobKt.launch$default(ViewModelKt.getViewModelScope(collectBankAccountViewModel), null, null, new Logger$log$1(collectBankAccountViewModel, ((FinancialConnectionsSheetResult.Completed) financialConnectionsSheetResult).financialConnectionsSession, continuation, i7), 3);
                    } else {
                        JobKt.launch$default(ViewModelKt.getViewModelScope(collectBankAccountViewModel), null, null, new Logger$log$1(collectBankAccountViewModel, new HCaptcha$$ExternalSyntheticLambda2(((FinancialConnectionsSheetResult.Completed) financialConnectionsSheetResult).financialConnectionsSession, i9), continuation, i3), 3);
                    }
                }
                return Unit.INSTANCE;
            case 19:
                CollectBankAccountViewModel collectBankAccountViewModel2 = (CollectBankAccountViewModel) obj3;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = shimmerModifierKt$shimmer$1$1.label;
                if (i31 != 0) {
                    if (i31 == 1 || i31 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult = (FinancialConnectionsSheetInstantDebitsResult) shimmerModifierKt$shimmer$1$1.$customShimmer;
                if (financialConnectionsSheetInstantDebitsResult instanceof FinancialConnectionsSheetInstantDebitsResult.Canceled) {
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (collectBankAccountViewModel2.finishWithResult(cancelled, shimmerModifierKt$shimmer$1$1) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else if (financialConnectionsSheetInstantDebitsResult instanceof FinancialConnectionsSheetInstantDebitsResult.Failed) {
                    Throwable th4 = ((FinancialConnectionsSheetInstantDebitsResult.Failed) financialConnectionsSheetInstantDebitsResult).error;
                    shimmerModifierKt$shimmer$1$1.label = 2;
                    if (collectBankAccountViewModel2.finishWithError(th4, shimmerModifierKt$shimmer$1$1) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (!(financialConnectionsSheetInstantDebitsResult instanceof FinancialConnectionsSheetInstantDebitsResult.Completed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    collectBankAccountViewModel2.getClass();
                    JobKt.launch$default(ViewModelKt.getViewModelScope(collectBankAccountViewModel2), null, null, new Logger$log$1(collectBankAccountViewModel2, new HeroCardViewKt$$ExternalSyntheticLambda0(28, collectBankAccountViewModel2, (FinancialConnectionsSheetInstantDebitsResult.Completed) financialConnectionsSheetInstantDebitsResult), continuation, i3), 3);
                }
                return Unit.INSTANCE;
            case 20:
                PaymentLauncherViewModel paymentLauncherViewModel = (PaymentLauncherViewModel) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineContext coroutineContext = paymentLauncherViewModel.uiContext;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = shimmerModifierKt$shimmer$1$1.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (paymentLauncherViewModel.isPaymentIntent) {
                        Object obj4 = paymentLauncherViewModel.lazyPaymentIntentFlowResultProcessor.get();
                        obj4.getClass();
                        paymentFlowResultProcessor = (PaymentFlowResultProcessor) obj4;
                    } else {
                        Object obj5 = paymentLauncherViewModel.lazySetupIntentFlowResultProcessor.get();
                        obj5.getClass();
                        paymentFlowResultProcessor = (PaymentFlowResultProcessor) obj5;
                    }
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    m4053processResultgIAlus = paymentFlowResultProcessor.m4053processResultgIAlus((PaymentFlowResult$Unvalidated) obj3, shimmerModifierKt$shimmer$1$1);
                    if (m4053processResultgIAlus == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 == 2 || i32 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4053processResultgIAlus = ((Result) obj).value;
                }
                Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(m4053processResultgIAlus);
                if (m4120exceptionOrNullimpl2 == null) {
                    InquiryViewModel.AnonymousClass1 anonymousClass13 = new InquiryViewModel.AnonymousClass1(paymentLauncherViewModel, (StripeIntentResult) m4053processResultgIAlus, continuation, 15);
                    shimmerModifierKt$shimmer$1$1.label = 2;
                    if (JobKt.withContext(coroutineContext, anonymousClass13, shimmerModifierKt$shimmer$1$1) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    InquiryViewModel.AnonymousClass1 anonymousClass14 = new InquiryViewModel.AnonymousClass1(paymentLauncherViewModel, m4120exceptionOrNullimpl2, continuation, 16);
                    shimmerModifierKt$shimmer$1$1.label = 3;
                    if (JobKt.withContext(coroutineContext, anonymousClass14, shimmerModifierKt$shimmer$1$1) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                }
                return Unit.INSTANCE;
            case 21:
                ChallengeActionHandler$Default challengeActionHandler$Default = (ChallengeActionHandler$Default) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = shimmerModifierKt$shimmer$1$1.label;
                if (i33 != 0) {
                    if (i33 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ChallengeRequestData challengeRequestData = challengeActionHandler$Default.creqData;
                ChallengeRequestData challengeRequestData2 = new ChallengeRequestData(challengeRequestData.messageVersion, challengeRequestData.threeDsServerTransId, challengeRequestData.acsTransId, challengeRequestData.sdkTransId, challengeRequestData.threeDSRequestorAppURL, challengeRequestData.messageExtensions, 3808);
                ChallengeAction challengeAction = (ChallengeAction) obj3;
                if (challengeAction instanceof ChallengeAction.NativeForm) {
                    ChallengeAction.NativeForm nativeForm = (ChallengeAction.NativeForm) challengeAction;
                    copy$default = ChallengeRequestData.copy$default(challengeRequestData2, nativeForm.userEntry, null, nativeForm.whitelistingValue, 2015);
                } else if (challengeAction instanceof ChallengeAction.HtmlForm) {
                    copy$default = ChallengeRequestData.copy$default(challengeRequestData2, null, ((ChallengeAction.HtmlForm) challengeAction).userEntry, null, 3967);
                } else if (challengeAction instanceof ChallengeAction.Oob) {
                    copy$default = ChallengeRequestData.copy$default(challengeRequestData2, null, null, ((ChallengeAction.Oob) challengeAction).whitelistingValue, 1535);
                } else if (challengeAction instanceof ChallengeAction.Resend) {
                    copy$default = ChallengeRequestData.copy$default(challengeRequestData2, null, null, null, 3071);
                } else {
                    if (!(challengeAction instanceof ChallengeAction.Cancel)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ChallengeRequestData.CancelReason cancelReason = ChallengeRequestData.CancelReason.UserSelected;
                    copy$default = ChallengeRequestData.copy$default(challengeRequestData2, null, null, null, 4031);
                }
                shimmerModifierKt$shimmer$1$1.label = 1;
                Object access$executeChallengeRequest = ChallengeActionHandler$Default.access$executeChallengeRequest(challengeActionHandler$Default, copy$default, shimmerModifierKt$shimmer$1$1);
                return access$executeChallengeRequest == coroutineSingletons22 ? coroutineSingletons22 : access$executeChallengeRequest;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = shimmerModifierKt$shimmer$1$1.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScrollState scrollState = (ScrollState) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    int i35 = ((Ref$IntRef) obj3).element;
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (PlatformKt.scrollBy(scrollState, i35 - scrollState.value$delegate.getIntValue(), shimmerModifierKt$shimmer$1$1) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                StripeBottomSheetState stripeBottomSheetState = (StripeBottomSheetState) shimmerModifierKt$shimmer$1$1.$customShimmer;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = shimmerModifierKt$shimmer$1$1.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!stripeBottomSheetState.modalBottomSheetState.isVisible()) {
                        shimmerModifierKt$shimmer$1$1.label = 1;
                        if (stripeBottomSheetState.show(shimmerModifierKt$shimmer$1$1) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        if (i36 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        awaitDismissal = obj;
                        if (((StripeBottomSheetState.DismissalType) awaitDismissal) == StripeBottomSheetState.DismissalType.SwipedDownByUser) {
                            ((Function0) obj3).invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                shimmerModifierKt$shimmer$1$1.label = 2;
                awaitDismissal = stripeBottomSheetState.awaitDismissal(shimmerModifierKt$shimmer$1$1);
                if (awaitDismissal == coroutineSingletons24) {
                    return coroutineSingletons24;
                }
                if (((StripeBottomSheetState.DismissalType) awaitDismissal) == StripeBottomSheetState.DismissalType.SwipedDownByUser) {
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = shimmerModifierKt$shimmer$1$1.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow stateFlow = (StateFlow) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$12 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1((ProduceStateScope) obj3, i5);
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    if (stateFlow.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$12, shimmerModifierKt$shimmer$1$1) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = shimmerModifierKt$shimmer$1$1.label;
                if (i38 != 0) {
                    if (i38 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl3 = (StateFlowImpl) shimmerModifierKt$shimmer$1$1.$customShimmer;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass15 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1((PaymentAuthWebViewActivity) obj3, 20);
                shimmerModifierKt$shimmer$1$1.label = 1;
                stateFlowImpl3.collect(anonymousClass15, shimmerModifierKt$shimmer$1$1);
                return coroutineSingletons26;
            case 26:
                final Camera2Manager camera2Manager2 = (Camera2Manager) obj3;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = shimmerModifierKt$shimmer$1$1.label;
                LinkResolverDef linkResolverDef2 = CameraCaptureSessionWrapper.Companion;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (camera2Manager2.camera == null) {
                        CameraManager cameraManager = camera2Manager2.cameraManager;
                        final String str9 = camera2Manager2.cameraChoice.id;
                        Handler handler2 = camera2Manager2.cameraHandler;
                        shimmerModifierKt$shimmer$1$1.$customShimmer = camera2Manager2;
                        shimmerModifierKt$shimmer$1$1.label = 1;
                        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(shimmerModifierKt$shimmer$1$1));
                        cancellableContinuationImpl.initCancellability();
                        cameraManager.openCamera(str9, new CameraDevice.StateCallback() { // from class: com.withpersona.sdk2.camera.camera2.Camera2Manager$openCamera$2$1
                            @Override // android.hardware.camera2.CameraDevice.StateCallback
                            public final void onDisconnected(CameraDevice cameraDevice2) {
                                cameraDevice2.getClass();
                                camera2Manager2.camera = null;
                            }

                            @Override // android.hardware.camera2.CameraDevice.StateCallback
                            public final void onError(CameraDevice cameraDevice2, int i40) {
                                cameraDevice2.getClass();
                                String str10 = i40 != 1 ? i40 != 2 ? i40 != 3 ? i40 != 4 ? i40 != 5 ? "Unknown" : "Fatal (service)" : "Fatal (device)" : "Device policy" : "Maximum cameras in use" : "Camera in use";
                                StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Camera ", i40, str9, " error: (", ") ");
                                m.append(str10);
                                RuntimeException runtimeException = new RuntimeException(m.toString());
                                CancellableContinuationImpl cancellableContinuationImpl2 = CancellableContinuationImpl.this;
                                if (cancellableContinuationImpl2.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
                                    Result.Companion companion4 = Result.Companion;
                                    cancellableContinuationImpl2.resumeWith(new Result.Failure(runtimeException));
                                }
                            }

                            @Override // android.hardware.camera2.CameraDevice.StateCallback
                            public final void onOpened(CameraDevice cameraDevice2) {
                                cameraDevice2.getClass();
                                Result.Companion companion4 = Result.Companion;
                                CancellableContinuationImpl.this.resumeWith(cameraDevice2);
                            }
                        }, handler2);
                        result = cancellableContinuationImpl.getResult();
                        if (result != coroutineSingletons27) {
                            camera2Manager = camera2Manager2;
                        }
                        return coroutineSingletons27;
                    }
                    cameraDevice = camera2Manager2.camera;
                    MediaRecorderWrapper mediaRecorderWrapper = camera2Manager2.mediaRecorderWrapper;
                    if (cameraDevice != null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Unable to open camera");
                        return null;
                    }
                    SurfaceHolder holder = camera2Manager2.previewView.surfaceView.getHolder();
                    holder.getClass();
                    ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(holder.getSurface(), camera2Manager2.imageReader.getSurface());
                    if (camera2Manager2.videoCaptureMethod == VideoCaptureMethod.Upload) {
                        if (!mediaRecorderWrapper.isPrepared) {
                            mediaRecorderWrapper.isPrepared = true;
                            mediaRecorderWrapper.newRecordSession(true);
                        }
                        mutableListOf.add(mediaRecorderWrapper.getSurface());
                    }
                    linkResolverDef = linkResolverDef2;
                    try {
                        cameraChoice = camera2Manager2.cameraChoice;
                        try {
                            cameraCharacteristics = camera2Manager2.characteristics;
                            handler = camera2Manager2.cameraHandler;
                            shimmerModifierKt$shimmer$1$1.$customShimmer = cameraDevice;
                            shimmerModifierKt$shimmer$1$1.label = 2;
                            obj2 = null;
                        } catch (Exception unused) {
                            obj2 = null;
                        }
                    } catch (Exception unused2) {
                        obj2 = null;
                    }
                    try {
                        create = linkResolverDef.create(cameraChoice, cameraCharacteristics, mutableListOf, cameraDevice, handler, shimmerModifierKt$shimmer$1$1);
                        shimmerModifierKt$shimmer$1$1 = shimmerModifierKt$shimmer$1$1;
                        break;
                    } catch (Exception unused3) {
                        shimmerModifierKt$shimmer$1$1 = shimmerModifierKt$shimmer$1$1;
                        camera2Manager2.analysisSizeScaling = 1.0f;
                        MediaRecorderWrapper mediaRecorderWrapper2 = camera2Manager2.mediaRecorderWrapper;
                        camera2Manager2.imageReader = camera2Manager2.newImageReader();
                        SurfaceHolder holder2 = camera2Manager2.previewView.surfaceView.getHolder();
                        holder2.getClass();
                        ArrayList mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(holder2.getSurface(), camera2Manager2.imageReader.getSurface());
                        if (camera2Manager2.videoCaptureMethod == VideoCaptureMethod.Upload) {
                        }
                        CameraChoice cameraChoice2 = camera2Manager2.cameraChoice;
                        CameraCharacteristics cameraCharacteristics2 = camera2Manager2.characteristics;
                        Handler handler3 = camera2Manager2.cameraHandler;
                        shimmerModifierKt$shimmer$1$1.$customShimmer = obj2;
                        shimmerModifierKt$shimmer$1$1.label = 3;
                        create2 = linkResolverDef.create(cameraChoice2, cameraCharacteristics2, mutableListOf2, cameraDevice, handler3, shimmerModifierKt$shimmer$1$1);
                    }
                } else {
                    if (i39 != 1) {
                        if (i39 != 2) {
                            if (i39 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            create2 = obj;
                            cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) create2;
                            camera2Manager2.session = cameraCaptureSessionWrapper;
                            cameraCaptureSessionWrapper.updateRepeatingRequest();
                            return Unit.INSTANCE;
                        }
                        CameraDevice cameraDevice2 = (CameraDevice) shimmerModifierKt$shimmer$1$1.$customShimmer;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            obj2 = null;
                            cameraDevice = cameraDevice2;
                            linkResolverDef = linkResolverDef2;
                            create = obj;
                            try {
                                camera2Manager2.session = (CameraCaptureSessionWrapper) create;
                                cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) create;
                            } catch (Exception unused4) {
                                camera2Manager2.analysisSizeScaling = 1.0f;
                                MediaRecorderWrapper mediaRecorderWrapper22 = camera2Manager2.mediaRecorderWrapper;
                                camera2Manager2.imageReader = camera2Manager2.newImageReader();
                                SurfaceHolder holder22 = camera2Manager2.previewView.surfaceView.getHolder();
                                holder22.getClass();
                                ArrayList mutableListOf22 = CollectionsKt__CollectionsKt.mutableListOf(holder22.getSurface(), camera2Manager2.imageReader.getSurface());
                                if (camera2Manager2.videoCaptureMethod == VideoCaptureMethod.Upload) {
                                    if (!mediaRecorderWrapper22.isPrepared) {
                                        mediaRecorderWrapper22.isPrepared = true;
                                        mediaRecorderWrapper22.newRecordSession(true);
                                    }
                                    mutableListOf22.add(mediaRecorderWrapper22.getSurface());
                                }
                                CameraChoice cameraChoice22 = camera2Manager2.cameraChoice;
                                CameraCharacteristics cameraCharacteristics22 = camera2Manager2.characteristics;
                                Handler handler32 = camera2Manager2.cameraHandler;
                                shimmerModifierKt$shimmer$1$1.$customShimmer = obj2;
                                shimmerModifierKt$shimmer$1$1.label = 3;
                                create2 = linkResolverDef.create(cameraChoice22, cameraCharacteristics22, mutableListOf22, cameraDevice, handler32, shimmerModifierKt$shimmer$1$1);
                                break;
                            }
                        } catch (Exception unused5) {
                            obj2 = null;
                            cameraDevice = cameraDevice2;
                            linkResolverDef = linkResolverDef2;
                            camera2Manager2.analysisSizeScaling = 1.0f;
                            MediaRecorderWrapper mediaRecorderWrapper222 = camera2Manager2.mediaRecorderWrapper;
                            camera2Manager2.imageReader = camera2Manager2.newImageReader();
                            SurfaceHolder holder222 = camera2Manager2.previewView.surfaceView.getHolder();
                            holder222.getClass();
                            ArrayList mutableListOf222 = CollectionsKt__CollectionsKt.mutableListOf(holder222.getSurface(), camera2Manager2.imageReader.getSurface());
                            if (camera2Manager2.videoCaptureMethod == VideoCaptureMethod.Upload) {
                            }
                            CameraChoice cameraChoice222 = camera2Manager2.cameraChoice;
                            CameraCharacteristics cameraCharacteristics222 = camera2Manager2.characteristics;
                            Handler handler322 = camera2Manager2.cameraHandler;
                            shimmerModifierKt$shimmer$1$1.$customShimmer = obj2;
                            shimmerModifierKt$shimmer$1$1.label = 3;
                            create2 = linkResolverDef.create(cameraChoice222, cameraCharacteristics222, mutableListOf222, cameraDevice, handler322, shimmerModifierKt$shimmer$1$1);
                        }
                        cameraCaptureSessionWrapper.updateRepeatingRequest();
                        return Unit.INSTANCE;
                    }
                    Camera2Manager camera2Manager3 = (Camera2Manager) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    SafeTrace.throwOnFailure(obj);
                    camera2Manager = camera2Manager3;
                    result = obj;
                }
                camera2Manager.camera = (CameraDevice) result;
                cameraDevice = camera2Manager2.camera;
                MediaRecorderWrapper mediaRecorderWrapper3 = camera2Manager2.mediaRecorderWrapper;
                if (cameraDevice != null) {
                }
            case 27:
                DocumentsSelectWorker documentsSelectWorker = (DocumentsSelectWorker) obj3;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = shimmerModifierKt$shimmer$1$1.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = (FlowCollector) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    SessionWorkerKt$runSession$snapshotMonitor$1 sessionWorkerKt$runSession$snapshotMonitor$1 = new SessionWorkerKt$runSession$snapshotMonitor$1(i9, continuation, 10);
                    shimmerModifierKt$shimmer$1$1.$customShimmer = flowCollector;
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    withTimeoutOrNull = JobKt.withTimeoutOrNull(100L, sessionWorkerKt$runSession$snapshotMonitor$1, shimmerModifierKt$shimmer$1$1);
                    break;
                } else {
                    if (i40 != 1) {
                        if (i40 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i40 != 3) {
                            if (i40 == 4) {
                                throw Recorder$$ExternalSyntheticOutline2.m(obj);
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        flowCollector = (FlowCollector) shimmerModifierKt$shimmer$1$1.$customShimmer;
                        SafeTrace.throwOnFailure(obj);
                        DocumentsSelectLauncherResult documentsSelectLauncherResult = new DocumentsSelectLauncherResult();
                        TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass16 = new TakeUntil$collectSafely$2.AnonymousClass1(28, documentsSelectWorker, flowCollector);
                        shimmerModifierKt$shimmer$1$1.$customShimmer = null;
                        shimmerModifierKt$shimmer$1$1.label = 4;
                        documentsSelectLauncherResult.collect(anonymousClass16, shimmerModifierKt$shimmer$1$1);
                        return coroutineSingletons28;
                    }
                    flowCollector = (FlowCollector) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    SafeTrace.throwOnFailure(obj);
                    withTimeoutOrNull = obj;
                }
                List list = (List) withTimeoutOrNull;
                if (list == null) {
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                    CameraHelper$unbind$2 cameraHelper$unbind$2 = new CameraHelper$unbind$2(documentsSelectWorker, continuation, i6);
                    shimmerModifierKt$shimmer$1$1.$customShimmer = flowCollector;
                    shimmerModifierKt$shimmer$1$1.label = 3;
                    break;
                } else {
                    shimmerModifierKt$shimmer$1$1.$customShimmer = null;
                    shimmerModifierKt$shimmer$1$1.label = 2;
                    break;
                }
                return coroutineSingletons28;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = shimmerModifierKt$shimmer$1$1.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector2 = (FlowCollector) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(FlowKt.asStateFlow(((ProgressRequestBody) obj3).flow), new SessionWorkerKt$runSession$snapshotMonitor$1(i9, continuation, i5), i8);
                    FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2 anonymousClass2 = new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector2, i4);
                    shimmerModifierKt$shimmer$1$1.$customShimmer = flowCollector2;
                    shimmerModifierKt$shimmer$1$1.label = 1;
                    break;
                } else {
                    if (i41 != 1) {
                        if (i41 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector2 = (FlowCollector) shimmerModifierKt$shimmer$1$1.$customShimmer;
                    SafeTrace.throwOnFailure(obj);
                }
                DocumentFileUploadWorker.Response.ProgressUpdate progressUpdate = new DocumentFileUploadWorker.Response.ProgressUpdate(100);
                shimmerModifierKt$shimmer$1$1.$customShimmer = null;
                shimmerModifierKt$shimmer$1$1.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = shimmerModifierKt$shimmer$1$1.label;
                if (i42 != 0) {
                    if (i42 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ResetViewModel.AnonymousClass1 anonymousClass17 = new ResetViewModel.AnonymousClass1((DocumentFileUploadWorker) shimmerModifierKt$shimmer$1$1.$customShimmer, (ProgressRequestBody) obj3, continuation, i9);
                shimmerModifierKt$shimmer$1$1.label = 1;
                Object enqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(anonymousClass17, shimmerModifierKt$shimmer$1$1);
                return enqueueVerificationRequestWithRetry == coroutineSingletons30 ? coroutineSingletons30 : enqueueVerificationRequestWithRetry;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShimmerModifierKt$shimmer$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$area = obj;
    }
}
