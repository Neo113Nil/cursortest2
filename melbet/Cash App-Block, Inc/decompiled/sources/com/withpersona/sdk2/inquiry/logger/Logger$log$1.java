package com.withpersona.sdk2.inquiry.logger;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.core.SettableImageProxy;
import androidx.compose.foundation.text.selection.SelectionLayoutKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.core.graphics.TypefaceCompat$$ExternalSyntheticApiModelOutline0;
import androidx.emoji2.text.MetadataRepo;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.lifecycle.LiveDataScopeImpl;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzms;
import com.google.android.gms.internal.mlkit_vision_barcode.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcj;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.material.math.MathUtils;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.cash.work.presenters.shift.RealClockInRepository$updateNote$2;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.scannerview.SizeMap;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.utils.FlowsKt$get$1;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$1;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.HttpResponse;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeTransaction;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.view.ActivityHost;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileData;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1;
import com.withpersona.sdk2.inquiry.document.network.ProgressRequestBody;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.internal.ErrorReportingManager;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestLauncherResult;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture;
import com.withpersona.sdk2.inquiry.shared.RealFileHelper;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.SendingCollector;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import net.idrnd.face.iad.capture.internal.y0;
import net.idrnd.misnap.iad.Payload;
import okhttp3.Cache;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;
import papa.SafeTrace;
import xyz.block.genie.GenieCreateSessionResponse;
import xyz.block.genie.SessionHTTPPayload;

/* loaded from: classes8.dex */
public final class Logger$log$1 extends SuspendLambda implements Function2 {
    public Object $message;
    public final /* synthetic */ int $r8$classId;
    public Object $subsystem;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logger$log$1(MutableState mutableState, FocusOwnerImpl focusOwnerImpl, int i, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.$message = mutableState;
        this.$subsystem = focusOwnerImpl;
        this.label = i;
        this.this$0 = mutableState2;
    }

    private final Object invokeSuspend$com$withpersona$sdk2$inquiry$internal$fallbackmode$FallbackModeApiController$transition$uploadResult$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        RealClockInRepository$updateNote$2 realClockInRepository$updateNote$2 = new RealClockInRepository$updateNote$2((FallbackModeApiController) this.$subsystem, (String) this.$message, (RequestBody) this.this$0, null);
        this.label = 1;
        Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(realClockInRepository$updateNote$2, this);
        return enqueueRetriableRequestWithRetry == coroutineSingletons ? coroutineSingletons : enqueueRetriableRequestWithRetry;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r7.lock(r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$withpersona$sdk2$inquiry$internal$integrity$PlayIntegrityHelper$release$2(Object obj) {
        PlayIntegrityHelper playIntegrityHelper;
        MutexImpl mutexImpl;
        Throwable th;
        Mutex mutex;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                playIntegrityHelper = (PlayIntegrityHelper) this.this$0;
                mutexImpl = playIntegrityHelper.mutex;
                this.$message = mutexImpl;
                this.$subsystem = playIntegrityHelper;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutex = (Mutex) this.$message;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                playIntegrityHelper = (PlayIntegrityHelper) this.$subsystem;
                ?? r3 = (Mutex) this.$message;
                SafeTrace.throwOnFailure(obj);
                mutexImpl = r3;
            }
            StateFlowImpl stateFlowImpl = playIntegrityHelper.playIntegrityState;
            PlayIntegrityHelper.PlayIntegrityState.NotStarted notStarted = PlayIntegrityHelper.PlayIntegrityState.NotStarted.INSTANCE;
            this.$message = mutexImpl;
            this.$subsystem = null;
            this.label = 2;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, notStarted);
            if (Unit.INSTANCE != coroutineSingletons) {
                mutex = mutexImpl;
                mutex.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            MutexImpl mutexImpl2 = mutexImpl;
            th = th3;
            mutex = mutexImpl2;
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        if (r1.emit(r3, r11) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r6, r7, r11) == r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$withpersona$sdk2$inquiry$permissions$permissionRequest$PermissionRequestWorker$run$1(Object obj) {
        FlowCollector flowCollector;
        String m;
        FlowCollector flowCollector2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.$subsystem;
            m = Boxes$$ExternalSyntheticOutline1.m();
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
            InquiryViewModel.AnonymousClass1 anonymousClass1 = new InquiryViewModel.AnonymousClass1((PermissionRequestWorker) this.this$0, m, continuation, 24);
            this.$subsystem = flowCollector;
            this.$message = m;
            this.label = 1;
        } else if (i == 1) {
            m = (String) this.$message;
            FlowCollector flowCollector3 = (FlowCollector) this.$subsystem;
            SafeTrace.throwOnFailure(obj);
            flowCollector = flowCollector3;
        } else {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector2 = (FlowCollector) this.$subsystem;
            SafeTrace.throwOnFailure(obj);
            PermissionRequestWorker.Output output = new PermissionRequestWorker.Output(((PermissionRequestFragment.PermissionRequestFragmentResult) obj).permissionState);
            this.$subsystem = null;
            this.label = 3;
        }
        PermissionRequestLauncherResult permissionRequestLauncherResult = new PermissionRequestLauncherResult();
        zzms zzmsVar = new zzms(m, continuation, 5);
        this.$subsystem = flowCollector;
        this.$message = null;
        this.label = 2;
        Object first = FlowKt.first(permissionRequestLauncherResult, zzmsVar, this);
        if (first != coroutineSingletons) {
            flowCollector2 = flowCollector;
            obj = first;
            PermissionRequestWorker.Output output2 = new PermissionRequestWorker.Output(((PermissionRequestFragment.PermissionRequestFragmentResult) obj).permissionState);
            this.$subsystem = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }

    private final Object invokeSuspend$com$withpersona$sdk2$inquiry$selfie$OldCameraScreenRunner$showRendering$1$6(Object obj) {
        Object mo4084stopVideoIoAF18A;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CameraController cameraController = ((OldCameraScreenRunner) this.$message).cameraController;
            this.label = 1;
            mo4084stopVideoIoAF18A = cameraController.mo4084stopVideoIoAF18A(this);
            if (mo4084stopVideoIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            mo4084stopVideoIoAF18A = ((Result) obj).value;
        }
        MathUtils mathUtils = (MathUtils) this.$subsystem;
        Result.Companion companion = Result.Companion;
        if (!(mo4084stopVideoIoAF18A instanceof Result.Failure)) {
            ((SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture) mathUtils).finalizeVideo.invoke((File) mo4084stopVideoIoAF18A);
        }
        SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen = (SelfieWorkflow.Screen.OldCameraScreen) this.this$0;
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4084stopVideoIoAF18A);
        if (m4120exceptionOrNullimpl != null && !(m4120exceptionOrNullimpl instanceof NoActiveRecordingError)) {
            oldCameraScreen.onCameraError.invoke(m4120exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0027 -> B:5:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$withpersona$sdk2$inquiry$selfie$SelfieWorkflow$runManualCaptureEnabledChecker$1(Object obj) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.$message;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (ref$BooleanRef.element) {
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            ((StatefulWorkflow.RenderContext) this.$subsystem).$$delegate_0.getActionSink().send(Workflows.action$default((SelfieWorkflow) this.this$0, new SelectionLayoutKt$$ExternalSyntheticLambda0(ref$BooleanRef, 2)));
            if (ref$BooleanRef.element) {
                this.label = 1;
                if (JobKt.delay(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ((StatefulWorkflow.RenderContext) this.$subsystem).$$delegate_0.getActionSink().send(Workflows.action$default((SelfieWorkflow) this.this$0, new SelectionLayoutKt$$ExternalSyntheticLambda0(ref$BooleanRef, 2)));
                if (ref$BooleanRef.element) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    private final Object invokeSuspend$kotlinx$coroutines$channels$ChannelsKt__ChannelsKt$trySendBlocking$2(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                SendChannel sendChannel = (SendChannel) this.$subsystem;
                Object obj2 = this.this$0;
                Result.Companion companion = Result.Companion;
                this.$message = null;
                this.label = 1;
                if (sendChannel.send(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            failure = Unit.INSTANCE;
            Result.Companion companion2 = Result.Companion;
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            failure = new Result.Failure(th);
        }
        return new ChannelResult(!(failure instanceof Result.Failure) ? Unit.INSTANCE : new ChannelResult.Closed(Result.m4120exceptionOrNullimpl(failure)));
    }

    private final Object invokeSuspend$kotlinx$coroutines$flow$FlowKt__DelayKt$timeoutInternal$1$1$1(Object obj) {
        Object obj2 = this.$subsystem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.this$0;
            if (!(obj2 instanceof ChannelResult.Failed)) {
                this.$subsystem = null;
                this.$message = obj2;
                this.label = 1;
                if (flowCollector.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.$message;
            SafeTrace.throwOnFailure(obj);
        }
        if (!(obj2 instanceof ChannelResult.Closed)) {
            return Boolean.TRUE;
        }
        Throwable m4190exceptionOrNullimpl = ChannelResult.m4190exceptionOrNullimpl(obj2);
        if (m4190exceptionOrNullimpl == null) {
            return Boolean.FALSE;
        }
        throw m4190exceptionOrNullimpl;
    }

    private final Object invokeSuspend$kotlinx$coroutines$flow$FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.$message;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow[] flowArr = (Flow[]) this.$subsystem;
            RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$1 = new RealPasscodeProvider$getPasscode$1(continuation, this.this$0, 24);
            this.$message = null;
            this.label = 1;
            if (CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, realPasscodeProvider$getPasscode$1, flowCollector, flowArr) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$kotlinx$coroutines$flow$internal$ChannelFlowMerge$collectTo$2$1(Object obj) {
        SemaphoreImpl semaphoreImpl = (SemaphoreImpl) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                Flow flow = (Flow) this.$message;
                SendingCollector sendingCollector = (SendingCollector) this.$subsystem;
                this.label = 1;
                if (flow.collect(sendingCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            semaphoreImpl.release();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            semaphoreImpl.release();
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                String str = (String) this.$message;
                String str2 = (String) this.$subsystem;
                LogLevel logLevel = LogLevel.Error;
                return new Logger$log$1((Logger) obj2, str, str2, continuation);
            case 1:
                return new Logger$log$1((GooglePayLauncherViewModel) this.$message, (PaymentMethodCreateParams) this.$subsystem, (ActivityHost) obj2, continuation, 1);
            case 2:
                Logger$log$1 logger$log$1 = new Logger$log$1((GooglePayPaymentMethodLauncherActivity) this.$subsystem, (ActivityResultLauncher) obj2, continuation, 2);
                logger$log$1.$message = obj;
                return logger$log$1;
            case 3:
                return new Logger$log$1((GooglePayPaymentMethodLauncherActivity) this.$subsystem, (PaymentData) obj2, continuation, 3);
            case 4:
                return new Logger$log$1((CollectBankAccountViewModel) this.$subsystem, (FinancialConnectionsSession) obj2, continuation, 4);
            case 5:
                return new Logger$log$1((CollectBankAccountViewModel) this.$subsystem, (Function1) obj2, continuation, 5);
            case 6:
                return new Logger$log$1((ChallengeResult) this.$subsystem, (DefaultStripe3ds2ChallengeResultProcessor) obj2, continuation, 6);
            case 7:
                return new Logger$log$1((PaymentLauncherViewModel) this.$message, (StripeIntent) this.$subsystem, (ActivityHost) obj2, continuation, 7);
            case 8:
                Logger$log$1 logger$log$12 = new Logger$log$1((StripeTransaction) this.$subsystem, (ChallengeRequestData) obj2, continuation, 8);
                logger$log$12.$message = obj;
                return logger$log$12;
            case 9:
                Logger$log$1 logger$log$13 = new Logger$log$1(obj2, (String) this.$message, continuation, 9);
                logger$log$13.$subsystem = obj;
                return logger$log$13;
            case 10:
                Logger$log$1 logger$log$14 = new Logger$log$1((ChallengeActivityViewModel) obj2, continuation, 10);
                logger$log$14.$subsystem = obj;
                return logger$log$14;
            case 11:
                return new Logger$log$1((ChallengeActivityViewModel) this.$subsystem, (ChallengeAction) obj2, continuation, 11);
            case 12:
                return new Logger$log$1((MutableState) this.$message, (FocusOwnerImpl) this.$subsystem, this.label, (MutableState) obj2, continuation);
            case 13:
                return new Logger$log$1((SettableImageProxy) this.$subsystem, (GovernmentIdFeed) obj2, continuation, 13);
            case 14:
                return new Logger$log$1((MediaRecorderWrapper) obj2, continuation, 14);
            case 15:
                Logger$log$1 logger$log$15 = new Logger$log$1((DocumentFileUploadWorker) obj2, continuation, 15);
                logger$log$15.$subsystem = obj;
                return logger$log$15;
            case 16:
                return new Logger$log$1((GovernmentIdStepFragment) this.$message, (Screen) this.$subsystem, (Context) obj2, continuation, 16);
            case 17:
                return new Logger$log$1(17, (ErrorReportingManager) this.$subsystem, (InternalErrorInfo) obj2, (String) this.$message, continuation);
            case 18:
                return new Logger$log$1(18, (FallbackModeApiController) this.$subsystem, (RequestBody) obj2, (String) this.$message, continuation);
            case 19:
                return new Logger$log$1((PlayIntegrityHelper) obj2, continuation, 19);
            case 20:
                Logger$log$1 logger$log$16 = new Logger$log$1((PermissionRequestWorker) obj2, continuation, 20);
                logger$log$16.$subsystem = obj;
                return logger$log$16;
            case 21:
                return new Logger$log$1((OldCameraScreenRunner) this.$message, (MathUtils) this.$subsystem, (SelfieWorkflow.Screen.OldCameraScreen) obj2, continuation, 21);
            case 22:
                return new Logger$log$1((Ref$BooleanRef) this.$message, (StatefulWorkflow.RenderContext) this.$subsystem, (SelfieWorkflow) obj2, continuation, 22);
            case 23:
                Logger$log$1 logger$log$17 = new Logger$log$1((SendChannel) this.$subsystem, obj2, continuation, 23);
                logger$log$17.$message = obj;
                return logger$log$17;
            case 24:
                Logger$log$1 logger$log$18 = new Logger$log$1((FlowCollector) obj2, continuation, 24);
                logger$log$18.$subsystem = ((ChannelResult) obj).holder;
                return logger$log$18;
            case 25:
                Logger$log$1 logger$log$19 = new Logger$log$1((Flow[]) this.$subsystem, continuation, (FlowsKt$get$1) obj2);
                logger$log$19.$message = obj;
                return logger$log$19;
            case 26:
                return new Logger$log$1((Flow) this.$message, (SendingCollector) this.$subsystem, (SemaphoreImpl) obj2, continuation, 26);
            default:
                Logger$log$1 logger$log$110 = new Logger$log$1(obj2, (String) this.$message, continuation, 27);
                logger$log$110.$subsystem = obj;
                return logger$log$110;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((Logger$log$1) create((LiveDataScopeImpl) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((Logger$log$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((Logger$log$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                Object obj3 = ((ChannelResult) obj).holder;
                Logger$log$1 logger$log$1 = new Logger$log$1((FlowCollector) this.this$0, (Continuation) obj2, 24);
                logger$log$1.$subsystem = obj3;
                return logger$log$1.invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((Logger$log$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((Logger$log$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((Logger$log$1) create((byte[]) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:94|(1:(1:(1:(3:99|100|101)(2:102|103))(6:104|105|106|107|108|109))(1:115))(8:124|(1:133)|128|(4:130|(1:132)|111|112)|106|107|108|109)|116|(2:120|(1:122))|105|106|107|108|109) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0278, code lost:
    
        if (r0.collect(r2, r28) == r1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0234, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0219, code lost:
    
        if (r12 == r1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x034b, code lost:
    
        if (r1.emit(r3, r28) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0336, code lost:
    
        if (r2 == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03f9, code lost:
    
        if (r0 == r1) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03e0, code lost:
    
        if (r2 == r1) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0608, code lost:
    
        if (r0 == r3) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0842, code lost:
    
        if (r0.finishWithResult(r3, r28) == r2) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x080e, code lost:
    
        if (r11 == r2) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0908, code lost:
    
        if (r12.finishWithError(r1, r28) == r13) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x08f7, code lost:
    
        if (r12.finishWithResult((com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal.Completed) r0, r28) == r13) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x089e, code lost:
    
        if (r0 == r13) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x08bd, code lost:
    
        if (r0 == r13) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016b, code lost:
    
        if (com.withpersona.sdk2.camera.CameraHelper.INSTANCE.unbind(r3, r28) != r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0157, code lost:
    
        if (r3.mo4084stopVideoIoAF18A(r28) == r2) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:417:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0900  */
    /* JADX WARN: Type inference failed for: r1v117, types: [int, java.lang.AutoCloseable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ConfirmStripeIntentParams confirmSetupIntentParams;
        Object failure;
        Object withContext;
        Object createPaymentMethod;
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
        Object m4057forSetupIntentyxL6bBk;
        Object failure2;
        Throwable m4120exceptionOrNullimpl;
        Object obj2;
        ApiRequest.Options options;
        Object complete3ds2Auth;
        int i;
        Object failure3;
        Object runtimeError;
        Object failure4;
        Object protocolError;
        Object obj3;
        Object obj4;
        Object failure5;
        Object withContext2;
        Object failure6;
        Object withContext3;
        Object firstOrNull;
        Object withContext4;
        ChallengeActivityViewModel.OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData;
        SettableImageProxy settableImageProxy;
        Object m4088access$analyzegIAlus;
        MediaRecorderWrapper mediaRecorderWrapper;
        MutexImpl mutexImpl;
        File file;
        FlowCollector flowCollector;
        String str;
        Object access$fetchCurrentDocuments;
        FlowCollector flowCollector2;
        String str2;
        ErrorRequest.ErrorType errorType;
        Object execute;
        int i2 = this.$r8$classId;
        int i3 = 4;
        int i4 = 28;
        int i5 = 2;
        Object obj5 = this.this$0;
        int i6 = 1;
        Object obj6 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        Object obj7 = null;
        switch (i2) {
            case 0:
                Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String replace$default = StringsKt__StringsJVMKt.replace$default((String) this.$message, "\n", "\\n");
                    Logger logger = (Logger) obj5;
                    String str3 = (String) this.$subsystem;
                    LogLevel logLevel = LogLevel.Error;
                    this.label = 1;
                    Object withContext5 = JobKt.withContext(logger.loggerContext, new Logger$_log$2(logger, str3, replace$default, (Continuation) null), this);
                    Object obj9 = withContext5;
                    if (withContext5 != obj8) {
                        obj9 = Unit.INSTANCE;
                    }
                    if (obj9 == obj8) {
                        return obj8;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                PaymentMethodCreateParams paymentMethodCreateParams = (PaymentMethodCreateParams) this.$subsystem;
                GooglePayLauncherViewModel googlePayLauncherViewModel = (GooglePayLauncherViewModel) this.$message;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GooglePayLauncherContract.Args args = googlePayLauncherViewModel.args;
                    if (args instanceof GooglePayLauncherContract.PaymentIntentArgs) {
                        String str4 = ((GooglePayLauncherContract.PaymentIntentArgs) args).clientSecret;
                        str4.getClass();
                        confirmSetupIntentParams = new ConfirmPaymentIntentParams(paymentMethodCreateParams, null, str4, null, null, paymentMethodCreateParams.code, 270510);
                    } else {
                        if (!(args instanceof GooglePayLauncherContract.SetupIntentArgs)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str5 = ((GooglePayLauncherContract.SetupIntentArgs) args).clientSecret;
                        str5.getClass();
                        confirmSetupIntentParams = new ConfirmSetupIntentParams(str5, null, paymentMethodCreateParams, null, false, null, null, null, paymentMethodCreateParams.code, null, null, null, null, 4634);
                    }
                    ApiRequest.Options options2 = googlePayLauncherViewModel.requestOptions;
                    this.label = 1;
                    if (googlePayLauncherViewModel.paymentController.startConfirmAndAuth((ActivityHost) obj5, confirmSetupIntentParams, options2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = (GooglePayPaymentMethodLauncherActivity) this.$subsystem;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                try {
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion = Result.Companion;
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        GooglePayPaymentMethodLauncherActivity$onCreate$1 googlePayPaymentMethodLauncherActivity$onCreate$1 = new GooglePayPaymentMethodLauncherActivity$onCreate$1(googlePayPaymentMethodLauncherActivity2, z ? 1 : 0, i6);
                        this.$message = null;
                        this.label = 1;
                        withContext = JobKt.withContext(defaultIoScheduler, googlePayPaymentMethodLauncherActivity$onCreate$1, this);
                        if (withContext == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        withContext = obj;
                    }
                    failure = (Task) withContext;
                    Result.Companion companion2 = Result.Companion;
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) obj5;
                Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl2 == null) {
                    activityResultLauncher.launch((Task) failure);
                    int i10 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                    googlePayPaymentMethodLauncherActivity2.getViewModel().savedStateHandle.set(Boolean.TRUE, "has_launched");
                } else {
                    GooglePayPaymentMethodLauncher$Result.Failed failed = new GooglePayPaymentMethodLauncher$Result.Failed(m4120exceptionOrNullimpl2, 1);
                    int i11 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                    StateFlowImpl stateFlowImpl = googlePayPaymentMethodLauncherActivity2.getViewModel()._googleResult;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, failed);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity3 = (GooglePayPaymentMethodLauncherActivity) this.$subsystem;
                    int i13 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                    this.$message = googlePayPaymentMethodLauncherActivity3;
                    this.label = 1;
                    createPaymentMethod = googlePayPaymentMethodLauncherActivity3.getViewModel().createPaymentMethod((PaymentData) obj5, this);
                    if (createPaymentMethod == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity3;
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.$message;
                    SafeTrace.throwOnFailure(obj);
                    createPaymentMethod = obj;
                }
                int i14 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                googlePayPaymentMethodLauncherActivity.finishWithResult((GooglePayPaymentMethodLauncher$Result) createPaymentMethod);
                return Unit.INSTANCE;
            case 4:
                FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) obj5;
                CollectBankAccountViewModel collectBankAccountViewModel = (CollectBankAccountViewModel) this.$subsystem;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CollectBankAccountContract.Args args2 = collectBankAccountViewModel.args;
                    if ((args2 instanceof CollectBankAccountContract.Args.ForDeferredPaymentIntent) || (args2 instanceof CollectBankAccountContract.Args.ForDeferredSetupIntent)) {
                        a$$ExternalSyntheticBUOutline0.m$1("Attach requires client secret");
                        return null;
                    }
                    if (args2 instanceof CollectBankAccountContract.Args.ForPaymentIntent) {
                        AttachFinancialConnectionsSession attachFinancialConnectionsSession = collectBankAccountViewModel.attachFinancialConnectionsSession;
                        CollectBankAccountContract.Args.ForPaymentIntent forPaymentIntent = (CollectBankAccountContract.Args.ForPaymentIntent) args2;
                        String str6 = forPaymentIntent.publishableKey;
                        String str7 = forPaymentIntent.stripeAccountId;
                        String str8 = forPaymentIntent.clientSecret;
                        String str9 = financialConnectionsSession.id;
                        this.label = 1;
                        m4057forSetupIntentyxL6bBk = attachFinancialConnectionsSession.m4056forPaymentIntentyxL6bBk(str6, str9, str8, str7, this);
                        break;
                    } else {
                        if (!(args2 instanceof CollectBankAccountContract.Args.ForSetupIntent)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        AttachFinancialConnectionsSession attachFinancialConnectionsSession2 = collectBankAccountViewModel.attachFinancialConnectionsSession;
                        CollectBankAccountContract.Args.ForSetupIntent forSetupIntent = (CollectBankAccountContract.Args.ForSetupIntent) args2;
                        String str10 = forSetupIntent.publishableKey;
                        String str11 = forSetupIntent.stripeAccountId;
                        String str12 = forSetupIntent.clientSecret;
                        String str13 = financialConnectionsSession.id;
                        this.label = 2;
                        m4057forSetupIntentyxL6bBk = attachFinancialConnectionsSession2.m4057forSetupIntentyxL6bBk(str10, str13, str12, str11, this);
                        break;
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 1 && i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m4057forSetupIntentyxL6bBk = this.$message;
                    SafeTrace.throwOnFailure(obj);
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4057forSetupIntentyxL6bBk);
                    if (m4120exceptionOrNullimpl != null) {
                        this.$message = m4057forSetupIntentyxL6bBk;
                        this.label = 4;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                m4057forSetupIntentyxL6bBk = ((Result) obj).value;
                Result.Companion companion4 = Result.Companion;
                if (!(m4057forSetupIntentyxL6bBk instanceof Result.Failure)) {
                    try {
                        failure2 = new CollectBankAccountResultInternal.Completed(new CollectBankAccountResponseInternal((StripeIntent) m4057forSetupIntentyxL6bBk, new CollectBankAccountResponseInternal.USBankAccountData(financialConnectionsSession), null));
                    } catch (Throwable th2) {
                        Result.Companion companion5 = Result.Companion;
                        failure2 = new Result.Failure(th2);
                    }
                    m4057forSetupIntentyxL6bBk = failure2;
                }
                if (!(m4057forSetupIntentyxL6bBk instanceof Result.Failure)) {
                    collectBankAccountViewModel.logger.debug("Bank account session attached to intent!!");
                    this.$message = m4057forSetupIntentyxL6bBk;
                    this.label = 3;
                    break;
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4057forSetupIntentyxL6bBk);
                if (m4120exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                CollectBankAccountViewModel collectBankAccountViewModel2 = (CollectBankAccountViewModel) this.$subsystem;
                CollectBankAccountContract.Args args3 = collectBankAccountViewModel2.args;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String clientSecret = args3.getClientSecret();
                    if (clientSecret != null) {
                        Payload payload = collectBankAccountViewModel2.retrieveStripeIntent;
                        String publishableKey = args3.getPublishableKey();
                        String stripeAccountId = args3.getStripeAccountId();
                        this.label = 1;
                        obj6 = payload.m4315invokeBWLJW6A(publishableKey, stripeAccountId, clientSecret, this);
                        break;
                    } else {
                        Result.Companion companion6 = Result.Companion;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.$message;
                        SafeTrace.throwOnFailure(obj);
                        obj6 = obj2;
                        Function1 function1 = (Function1) obj5;
                        Result.Companion companion7 = Result.Companion;
                        if (!(obj6 instanceof Result.Failure)) {
                            CollectBankAccountResultInternal.Completed completed = new CollectBankAccountResultInternal.Completed((CollectBankAccountResponseInternal) function1.invoke((StripeIntent) obj6));
                            this.$message = obj6;
                            this.label = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    obj6 = ((Result) obj).value;
                }
                Throwable m4120exceptionOrNullimpl3 = Result.m4120exceptionOrNullimpl(obj6);
                if (m4120exceptionOrNullimpl3 != null) {
                    this.$message = obj6;
                    this.label = 2;
                    if (collectBankAccountViewModel2.finishWithError(m4120exceptionOrNullimpl3, this) != coroutineSingletons5) {
                        obj2 = obj6;
                        obj6 = obj2;
                    }
                    return coroutineSingletons5;
                }
                Function1 function12 = (Function1) obj5;
                Result.Companion companion72 = Result.Companion;
                if (!(obj6 instanceof Result.Failure)) {
                }
                return Unit.INSTANCE;
            case 6:
                ChallengeResult challengeResult = (ChallengeResult) this.$subsystem;
                DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor = (DefaultStripe3ds2ChallengeResultProcessor) obj5;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (challengeResult instanceof ChallengeResult.Succeeded) {
                        defaultStripe3ds2ChallengeResultProcessor.analyticsRequestExecutor.executeAsync(defaultStripe3ds2ChallengeResultProcessor.paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((ChallengeResult.Succeeded) challengeResult).uiTypeCode));
                    } else if (challengeResult instanceof ChallengeResult.Failed) {
                        defaultStripe3ds2ChallengeResultProcessor.analyticsRequestExecutor.executeAsync(defaultStripe3ds2ChallengeResultProcessor.paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((ChallengeResult.Failed) challengeResult).uiTypeCode));
                    } else if (challengeResult instanceof ChallengeResult.Canceled) {
                        defaultStripe3ds2ChallengeResultProcessor.analyticsRequestExecutor.executeAsync(defaultStripe3ds2ChallengeResultProcessor.paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCanceled, ((ChallengeResult.Canceled) challengeResult).uiTypeCode));
                    } else if (challengeResult instanceof ChallengeResult.ProtocolError) {
                        defaultStripe3ds2ChallengeResultProcessor.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(defaultStripe3ds2ChallengeResultProcessor.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2ChallengeErrored, null, null, null, null, 62));
                    } else if (challengeResult instanceof ChallengeResult.RuntimeError) {
                        defaultStripe3ds2ChallengeResultProcessor.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(defaultStripe3ds2ChallengeResultProcessor.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2ChallengeErrored, null, null, null, null, 62));
                    } else {
                        if (!(challengeResult instanceof ChallengeResult.Timeout)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        defaultStripe3ds2ChallengeResultProcessor.analyticsRequestExecutor.executeAsync(defaultStripe3ds2ChallengeResultProcessor.paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeTimedOut, ((ChallengeResult.Timeout) challengeResult).uiTypeCode));
                    }
                    DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = defaultStripe3ds2ChallengeResultProcessor.analyticsRequestExecutor;
                    PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = defaultStripe3ds2ChallengeResultProcessor.paymentAnalyticsRequestFactory;
                    PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.Auth3ds2ChallengePresented;
                    UiType initialUiType = challengeResult.getInitialUiType();
                    String str14 = initialUiType != null ? initialUiType.code : null;
                    defaultAnalyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(paymentAnalyticsEvent, str14 != null ? str14 : ""));
                    options = new ApiRequest.Options(challengeResult.getIntentData().publishableKey, challengeResult.getIntentData().accountId, i3);
                    this.$message = options;
                    this.label = 1;
                    complete3ds2Auth = defaultStripe3ds2ChallengeResultProcessor.complete3ds2Auth(challengeResult, options, 3, this);
                    if (complete3ds2Auth == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    options = (ApiRequest.Options) this.$message;
                    SafeTrace.throwOnFailure(obj);
                    complete3ds2Auth = obj;
                }
                if (((Boolean) complete3ds2Auth).booleanValue()) {
                    if (challengeResult instanceof ChallengeResult.Succeeded) {
                        i = 1;
                    } else if (!(challengeResult instanceof ChallengeResult.Failed)) {
                        if (challengeResult instanceof ChallengeResult.Canceled) {
                            i = 3;
                        } else if (!(challengeResult instanceof ChallengeResult.ProtocolError) && !(challengeResult instanceof ChallengeResult.RuntimeError)) {
                            if (!(challengeResult instanceof ChallengeResult.Timeout)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            i = 4;
                        }
                    }
                    return new PaymentFlowResult$Unvalidated(challengeResult.getIntentData().clientSecret, i, (StripeException) null, false, (String) null, options.stripeAccount, 60);
                }
                i = 2;
                return new PaymentFlowResult$Unvalidated(challengeResult.getIntentData().clientSecret, i, (StripeException) null, false, (String) null, options.stripeAccount, 60);
            case 7:
                StripeIntent stripeIntent = (StripeIntent) this.$subsystem;
                PaymentLauncherViewModel paymentLauncherViewModel = (PaymentLauncherViewModel) this.$message;
                SavedStateHandle savedStateHandle = paymentLauncherViewModel.savedStateHandle;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    savedStateHandle.set(Boolean.TRUE, "key_has_started");
                    savedStateHandle.set(Boolean.FALSE, "confirm_action_requested");
                    DurationProvider.start$default(paymentLauncherViewModel.durationProvider, DurationProvider.Key.PaymentLauncher);
                    ApiRequest.Options options3 = (ApiRequest.Options) paymentLauncherViewModel.apiRequestOptionsProvider.get();
                    this.label = 1;
                    if (paymentLauncherViewModel.nextActionHandlerRegistry.getNextActionHandler(stripeIntent).performNextAction((ActivityHost) obj5, stripeIntent, options3, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                ChallengeRequestData challengeRequestData = (ChallengeRequestData) obj5;
                StripeTransaction stripeTransaction = (StripeTransaction) this.$subsystem;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                try {
                } catch (Throwable th3) {
                    Result.Companion companion8 = Result.Companion;
                    failure3 = new Result.Failure(th3);
                }
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion9 = Result.Companion;
                    TextSetter textSetter = (TextSetter) stripeTransaction.directoryServerPublicKey;
                    String access$getRequestBody = StripeTransaction.access$getRequestBody(stripeTransaction, challengeRequestData.toJson$3ds2sdk_release());
                    this.$message = null;
                    this.label = 1;
                    withContext2 = JobKt.withContext((CoroutineContext) textSetter.scannerText, new HeroCardViewKt$Render$1$4$1.AnonymousClass2(textSetter, access$getRequestBody, "application/jose; charset=UTF-8", (Continuation) null), this);
                    if (withContext2 == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        obj4 = obj;
                        runtimeError = (ChallengeRequestResult) obj4;
                        return runtimeError;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext2 = obj;
                }
                failure3 = (HttpResponse) withContext2;
                Result.Companion companion10 = Result.Companion;
                Throwable m4120exceptionOrNullimpl4 = Result.m4120exceptionOrNullimpl(failure3);
                if (m4120exceptionOrNullimpl4 != null) {
                    ((DefaultErrorReporter) stripeTransaction.directoryServerId).reportError(m4120exceptionOrNullimpl4);
                }
                Throwable m4120exceptionOrNullimpl5 = Result.m4120exceptionOrNullimpl(failure3);
                if (m4120exceptionOrNullimpl5 != null) {
                    if (m4120exceptionOrNullimpl5 instanceof TimeoutCancellationException) {
                        SdkTransactionId sdkTransactionId = challengeRequestData.sdkTransId;
                        String str15 = challengeRequestData.messageVersion;
                        String str16 = challengeRequestData.acsTransId;
                        String str17 = challengeRequestData.threeDsServerTransId;
                        ProtocolError[] protocolErrorArr = ProtocolError.$VALUES;
                        String valueOf = String.valueOf(402);
                        y0 y0Var = ErrorData.ErrorComponent.Companion;
                        runtimeError = new ChallengeRequestResult.Timeout(new ErrorData(str17, str16, valueOf, "Transaction timed-out.", "Challenge request timed-out", "CReq", str15, sdkTransactionId, 4));
                    } else {
                        runtimeError = new ChallengeRequestResult.RuntimeError(m4120exceptionOrNullimpl5);
                    }
                    return runtimeError;
                }
                HttpResponse httpResponse = (HttpResponse) failure3;
                MetadataRepo metadataRepo = (MetadataRepo) stripeTransaction.sdkKeyPair;
                this.$message = null;
                this.label = 2;
                metadataRepo.getClass();
                boolean z7 = httpResponse.isJsonContentType;
                String str18 = httpResponse.content;
                if (z7) {
                    JSONObject jSONObject = new JSONObject(str18);
                    if (!"Erro".equals(jSONObject.optString("messageType"))) {
                        obj4 = new ChallengeRequestResult.RuntimeError(new IllegalArgumentException("Received a JSON response that was not an Error message."));
                        break;
                    } else {
                        obj4 = new ChallengeRequestResult.ProtocolError(zzcj.fromJson$3ds2sdk_release(jSONObject));
                        break;
                    }
                } else {
                    try {
                        failure4 = metadataRepo.getResponsePayload(str18);
                    } catch (Throwable th4) {
                        Result.Companion companion11 = Result.Companion;
                        failure4 = new Result.Failure(th4);
                    }
                    Throwable m4120exceptionOrNullimpl6 = Result.m4120exceptionOrNullimpl(failure4);
                    if (m4120exceptionOrNullimpl6 != null) {
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) metadataRepo.mRootNode;
                        challengeRequestData.getClass();
                        defaultErrorReporter.reportError(new RuntimeException(StringsKt__IndentKt.replaceIndent("\n                            Failed to process challenge response.\n\n                            CReq = " + ChallengeRequestData.copy$default(challengeRequestData, null, null, null, 3935) + "\n                            "), m4120exceptionOrNullimpl6));
                    }
                    Throwable m4120exceptionOrNullimpl7 = Result.m4120exceptionOrNullimpl(failure4);
                    if (m4120exceptionOrNullimpl7 == null) {
                        JSONObject jSONObject2 = (JSONObject) failure4;
                        challengeRequestData.getClass();
                        if ("Erro".equals(jSONObject2.optString("messageType"))) {
                            obj3 = new ChallengeRequestResult.ProtocolError(zzcj.fromJson$3ds2sdk_release(jSONObject2));
                            obj4 = obj3;
                            break;
                        } else {
                            try {
                                Parcelable.Creator<ChallengeResponseData> creator = ChallengeResponseData.CREATOR;
                                failure5 = zzba.fromJson$3ds2sdk_release(jSONObject2);
                            } catch (Throwable th5) {
                                Result.Companion companion12 = Result.Companion;
                                failure5 = new Result.Failure(th5);
                            }
                            Throwable m4120exceptionOrNullimpl8 = Result.m4120exceptionOrNullimpl(failure5);
                            if (m4120exceptionOrNullimpl8 == null) {
                                ChallengeResponseData challengeResponseData = (ChallengeResponseData) failure5;
                                SdkTransactionId sdkTransactionId2 = challengeRequestData.sdkTransId;
                                String str19 = challengeRequestData.messageVersion;
                                if (!Intrinsics.areEqual(sdkTransactionId2, challengeResponseData.sdkTransId) || !Intrinsics.areEqual(challengeRequestData.threeDsServerTransId, challengeResponseData.serverTransId) || !Intrinsics.areEqual(challengeRequestData.acsTransId, challengeResponseData.acsTransId)) {
                                    ProtocolError[] protocolErrorArr2 = ProtocolError.$VALUES;
                                    protocolError = new ChallengeRequestResult.ProtocolError(MetadataRepo.createErrorData(challengeRequestData, EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, "Transaction ID received is not valid for the receiving component.", "The Transaction ID received was invalid."));
                                } else if (Intrinsics.areEqual(str19, challengeResponseData.messageVersion)) {
                                    protocolError = new ChallengeRequestResult.Success(challengeRequestData, challengeResponseData, (ChallengeRequestExecutor$Config) metadataRepo.mTypeface);
                                } else {
                                    ProtocolError[] protocolErrorArr3 = ProtocolError.$VALUES;
                                    protocolError = new ChallengeRequestResult.ProtocolError(MetadataRepo.createErrorData(challengeRequestData, 102, "Message Version Number received is not valid for the receiving component.", str19));
                                }
                            } else if (m4120exceptionOrNullimpl8 instanceof ChallengeResponseParseException) {
                                ChallengeResponseParseException challengeResponseParseException = (ChallengeResponseParseException) m4120exceptionOrNullimpl8;
                                protocolError = new ChallengeRequestResult.ProtocolError(MetadataRepo.createErrorData(challengeRequestData, challengeResponseParseException.code, challengeResponseParseException.description, challengeResponseParseException.detail));
                            } else {
                                protocolError = new ChallengeRequestResult.RuntimeError(m4120exceptionOrNullimpl8);
                            }
                        }
                    } else {
                        ProtocolError[] protocolErrorArr4 = ProtocolError.$VALUES;
                        String message = m4120exceptionOrNullimpl7.getMessage();
                        protocolError = new ChallengeRequestResult.ProtocolError(MetadataRepo.createErrorData(challengeRequestData, EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE, "Data could not be decrypted by the receiving system due to technical or other reason.", message != null ? message : ""));
                    }
                    obj3 = protocolError;
                    obj4 = obj3;
                }
                break;
            case 9:
                StripeErrorRequestExecutor stripeErrorRequestExecutor = (StripeErrorRequestExecutor) obj5;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                try {
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        String str20 = (String) this.$message;
                        Result.Companion companion13 = Result.Companion;
                        TextSetter textSetter2 = stripeErrorRequestExecutor.httpClient;
                        this.$subsystem = null;
                        this.label = 1;
                        withContext3 = JobKt.withContext((CoroutineContext) textSetter2.scannerText, new HeroCardViewKt$Render$1$4$1.AnonymousClass2(textSetter2, str20, "application/json; charset=utf-8", (Continuation) null), this);
                        if (withContext3 == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        withContext3 = obj;
                    }
                    failure6 = (HttpResponse) withContext3;
                    Result.Companion companion14 = Result.Companion;
                } catch (Throwable th6) {
                    Result.Companion companion15 = Result.Companion;
                    failure6 = new Result.Failure(th6);
                }
                Throwable m4120exceptionOrNullimpl9 = Result.m4120exceptionOrNullimpl(failure6);
                if (m4120exceptionOrNullimpl9 != null) {
                    stripeErrorRequestExecutor.errorReporter.reportError(m4120exceptionOrNullimpl9);
                }
                return Unit.INSTANCE;
            case 10:
                LiveDataScopeImpl liveDataScopeImpl = (LiveDataScopeImpl) this.$subsystem;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl2 = ((ChallengeActivityViewModel) obj5).transactionTimer.timeout;
                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i5, z2 ? 1 : 0, i4);
                    this.$subsystem = null;
                    this.$message = liveDataScopeImpl;
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(stateFlowImpl2, sessionWorkerKt$runSession$5, this);
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    liveDataScopeImpl = (LiveDataScopeImpl) this.$message;
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                this.$subsystem = null;
                this.$message = null;
                this.label = 2;
                Object withContext6 = JobKt.withContext(liveDataScopeImpl.coroutineContext, new PageFetcher$flow$1(liveDataScopeImpl, firstOrNull, (Continuation) null), this);
                if (withContext6 != coroutineSingletons10) {
                    withContext6 = Unit.INSTANCE;
                    break;
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChallengeActivityViewModel challengeActivityViewModel = (ChallengeActivityViewModel) this.$subsystem;
                    ChallengeActivityViewModel.OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData2 = challengeActivityViewModel._challengeRequestResult;
                    ChallengeActionHandler$Default challengeActionHandler$Default = challengeActivityViewModel.challengeActionHandler;
                    this.$message = onInactiveAwareMutableLiveData2;
                    this.label = 1;
                    withContext4 = JobKt.withContext(challengeActionHandler$Default.workContext, new ShimmerModifierKt$shimmer$1$1(challengeActionHandler$Default, (ChallengeAction) obj5, z3 ? 1 : 0, 21), this);
                    if (withContext4 == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                    onInactiveAwareMutableLiveData = onInactiveAwareMutableLiveData2;
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    onInactiveAwareMutableLiveData = (ChallengeActivityViewModel.OnInactiveAwareMutableLiveData) this.$message;
                    SafeTrace.throwOnFailure(obj);
                    withContext4 = obj;
                }
                onInactiveAwareMutableLiveData.postValue(withContext4);
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = TextFieldUIKt.LocalAutofillEventReporter;
                return Unit.INSTANCE;
            case 13:
                GovernmentIdFeed governmentIdFeed = (GovernmentIdFeed) obj5;
                Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ?? r1 = this.label;
                try {
                    if (r1 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        settableImageProxy = (SettableImageProxy) this.$subsystem;
                        ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyze = ImageToAnalyzeKt.toImageToAnalyze(settableImageProxy);
                        if (imageToAnalyze != null) {
                            this.$message = settableImageProxy;
                            this.label = 1;
                            m4088access$analyzegIAlus = GovernmentIdFeed.m4088access$analyzegIAlus(governmentIdFeed, imageToAnalyze, this);
                            break;
                        } else {
                            obj10 = Unit.INSTANCE;
                            Cache.Companion.closeFinally(settableImageProxy, null);
                        }
                        return obj10;
                    }
                    if (r1 != 1) {
                        if (r1 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    settableImageProxy = (SettableImageProxy) this.$message;
                    SafeTrace.throwOnFailure(obj);
                    m4088access$analyzegIAlus = ((Result) obj).value;
                    Cache.Companion.closeFinally(settableImageProxy, null);
                    MutableSharedFlow mutableSharedFlow = governmentIdFeed.resultFlow;
                    Result result = new Result(m4088access$analyzegIAlus);
                    this.$message = null;
                    this.label = 2;
                    break;
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        Cache.Companion.closeFinally(r1, th7);
                        throw th8;
                    }
                }
            case 14:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MediaRecorderWrapper mediaRecorderWrapper2 = (MediaRecorderWrapper) obj5;
                    MutexImpl mutexImpl2 = mediaRecorderWrapper2.mutex;
                    this.$message = mutexImpl2;
                    this.$subsystem = mediaRecorderWrapper2;
                    this.label = 1;
                    if (mutexImpl2.lock(this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                    mediaRecorderWrapper = mediaRecorderWrapper2;
                    mutexImpl = mutexImpl2;
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mediaRecorderWrapper = (MediaRecorderWrapper) this.$subsystem;
                    mutexImpl = (MutexImpl) this.$message;
                    SafeTrace.throwOnFailure(obj);
                }
                try {
                    if (mediaRecorderWrapper.isDestroyed) {
                        return null;
                    }
                    try {
                        mediaRecorderWrapper.mediaRecorder.stop();
                        file = mediaRecorderWrapper.currentFile;
                    } catch (RuntimeException unused) {
                        mediaRecorderWrapper.currentFile.delete();
                        file = null;
                    }
                    mediaRecorderWrapper.mediaRecorder.release();
                    if (!mediaRecorderWrapper.isDestroyed) {
                        mediaRecorderWrapper.mediaRecorder = Build.VERSION.SDK_INT >= 31 ? TypefaceCompat$$ExternalSyntheticApiModelOutline0.m(mediaRecorderWrapper.context) : new MediaRecorder();
                        mediaRecorderWrapper.newRecordSession(false);
                    }
                    mutexImpl.unlock(null);
                    return file;
                } finally {
                    mutexImpl.unlock(null);
                }
            case 15:
                DocumentFileUploadWorker documentFileUploadWorker = (DocumentFileUploadWorker) obj5;
                DocumentFile.Local local = documentFileUploadWorker.localDocument;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.$subsystem;
                    RealFileHelper realFileHelper = documentFileUploadWorker.fileHelper;
                    String str21 = local.absoluteFilePath;
                    realFileHelper.getClass();
                    str21.getClass();
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str21);
                    if (fileExtensionFromUrl == null || (str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
                        str = "image/*";
                    }
                    if (documentFileUploadWorker.isSingleFileLimit) {
                        this.$subsystem = flowCollector;
                        this.$message = str;
                        this.label = 1;
                        access$fetchCurrentDocuments = DocumentFileUploadWorker.access$fetchCurrentDocuments(documentFileUploadWorker, this);
                        if (access$fetchCurrentDocuments != coroutineSingletons14) {
                            String str22 = str;
                            flowCollector2 = flowCollector;
                            str2 = str22;
                        }
                        return coroutineSingletons14;
                    }
                    File file2 = new File(local.absoluteFilePath);
                    Regex regex = MediaType.TYPE_SUBTYPE;
                    str.getClass();
                    MediaType mediaType = UnsignedKt.get(str);
                    ProgressRequestBody progressRequestBody = new ProgressRequestBody(file2, mediaType);
                    ContextScope contextScope = documentFileUploadWorker.serviceCoroutineScope;
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    ChannelFlowBuilder merge = FlowKt.merge(new SafeFlow(new DocumentFileUploadWorker$run$1$resultFlow$1(JobKt.async$default(contextScope, DefaultIoScheduler.INSTANCE, null, new ShimmerModifierKt$shimmer$1$1(documentFileUploadWorker, progressRequestBody, z6 ? 1 : 0, 29), 2), documentFileUploadWorker, null)), new SafeFlow(new ShimmerModifierKt$shimmer$1$1(progressRequestBody, z5 ? 1 : 0, i4)));
                    FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2 anonymousClass2 = new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 26);
                    this.$subsystem = null;
                    this.$message = null;
                    this.label = 3;
                } else if (i24 == 1) {
                    str2 = (String) this.$message;
                    flowCollector2 = (FlowCollector) this.$subsystem;
                    SafeTrace.throwOnFailure(obj);
                    access$fetchCurrentDocuments = obj;
                } else if (i24 == 2) {
                    str2 = (String) this.$message;
                    flowCollector2 = (FlowCollector) this.$subsystem;
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector3 = flowCollector2;
                    str = str2;
                    flowCollector = flowCollector3;
                    File file22 = new File(local.absoluteFilePath);
                    Regex regex2 = MediaType.TYPE_SUBTYPE;
                    str.getClass();
                    MediaType mediaType2 = UnsignedKt.get(str);
                    ProgressRequestBody progressRequestBody2 = new ProgressRequestBody(file22, mediaType2);
                    ContextScope contextScope2 = documentFileUploadWorker.serviceCoroutineScope;
                    DefaultScheduler defaultScheduler22 = Dispatchers.Default;
                    ChannelFlowBuilder merge2 = FlowKt.merge(new SafeFlow(new DocumentFileUploadWorker$run$1$resultFlow$1(JobKt.async$default(contextScope2, DefaultIoScheduler.INSTANCE, null, new ShimmerModifierKt$shimmer$1$1(documentFileUploadWorker, progressRequestBody2, z6 ? 1 : 0, 29), 2), documentFileUploadWorker, null)), new SafeFlow(new ShimmerModifierKt$shimmer$1$1(progressRequestBody2, z5 ? 1 : 0, i4)));
                    FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2 anonymousClass22 = new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 26);
                    this.$subsystem = null;
                    this.$message = null;
                    this.label = 3;
                    break;
                } else {
                    if (i24 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list = (List) access$fetchCurrentDocuments;
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    String str23 = ((DocumentFileData) CollectionsKt.first(list)).id;
                    this.$subsystem = flowCollector2;
                    this.$message = str2;
                    this.label = 2;
                    Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(new ResetViewModel.AnonymousClass1(documentFileUploadWorker, str23, z4 ? 1 : 0, i6), this);
                    if (enqueueRetriableRequestWithRetry != coroutineSingletons14) {
                        enqueueRetriableRequestWithRetry = Unit.INSTANCE;
                        break;
                    }
                }
                FlowCollector flowCollector32 = flowCollector2;
                str = str2;
                flowCollector = flowCollector32;
                File file222 = new File(local.absoluteFilePath);
                Regex regex22 = MediaType.TYPE_SUBTYPE;
                str.getClass();
                MediaType mediaType22 = UnsignedKt.get(str);
                ProgressRequestBody progressRequestBody22 = new ProgressRequestBody(file222, mediaType22);
                ContextScope contextScope22 = documentFileUploadWorker.serviceCoroutineScope;
                DefaultScheduler defaultScheduler222 = Dispatchers.Default;
                ChannelFlowBuilder merge22 = FlowKt.merge(new SafeFlow(new DocumentFileUploadWorker$run$1$resultFlow$1(JobKt.async$default(contextScope22, DefaultIoScheduler.INSTANCE, null, new ShimmerModifierKt$shimmer$1$1(documentFileUploadWorker, progressRequestBody22, z6 ? 1 : 0, 29), 2), documentFileUploadWorker, null)), new SafeFlow(new ShimmerModifierKt$shimmer$1$1(progressRequestBody22, z5 ? 1 : 0, i4)));
                FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2 anonymousClass222 = new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 26);
                this.$subsystem = null;
                this.$message = null;
                this.label = 3;
                break;
            case 16:
                Screen screen = (Screen) this.$subsystem;
                GovernmentIdStepFragment governmentIdStepFragment = (GovernmentIdStepFragment) this.$message;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CameraController cameraController = governmentIdStepFragment.cameraController;
                    if (cameraController != null) {
                        this.label = 1;
                        break;
                    }
                    Context requireContext = governmentIdStepFragment.requireContext();
                    requireContext.getClass();
                    this.label = 2;
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        governmentIdStepFragment.bindErrorRunner((Screen.ErrorScreen) screen, (Context) obj5);
                        governmentIdStepFragment.cleanupRetainedCamera();
                        governmentIdStepFragment.currentScreen = screen;
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Object obj11 = ((Result) obj).value;
                }
                Result.Companion companion16 = Result.Companion;
                Context requireContext2 = governmentIdStepFragment.requireContext();
                requireContext2.getClass();
                this.label = 2;
            case 17:
                InternalErrorInfo internalErrorInfo = (InternalErrorInfo) obj5;
                ErrorReportingManager errorReportingManager = (ErrorReportingManager) this.$subsystem;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InquiryService inquiryService = errorReportingManager.inquiryService;
                    String str24 = (String) this.$message;
                    internalErrorInfo.getClass();
                    if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
                        errorType = ErrorRequest.ErrorType.Network;
                    } else if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
                        errorType = ErrorRequest.ErrorType.Other;
                    } else if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
                        errorType = ErrorRequest.ErrorType.Permissions;
                    } else if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
                        errorType = ErrorRequest.ErrorType.Camera;
                    } else if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
                        errorType = ErrorRequest.ErrorType.Other;
                    } else if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
                        errorType = ErrorRequest.ErrorType.Other;
                    } else if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
                        errorType = ErrorRequest.ErrorType.Other;
                    } else if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
                        errorType = ErrorRequest.ErrorType.Other;
                    } else {
                        if (!(internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        errorType = ErrorRequest.ErrorType.Other;
                    }
                    Moshi moshi = errorReportingManager.moshi;
                    moshi.getClass();
                    ErrorRequest errorRequest = new ErrorRequest(errorType, moshi.adapter(InternalErrorInfo.class, Util.NO_ANNOTATIONS, null).toJsonValue(internalErrorInfo));
                    this.label = 1;
                    if (inquiryService.reportError(str24, errorRequest, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                return invokeSuspend$com$withpersona$sdk2$inquiry$internal$fallbackmode$FallbackModeApiController$transition$uploadResult$1(obj);
            case 19:
                return invokeSuspend$com$withpersona$sdk2$inquiry$internal$integrity$PlayIntegrityHelper$release$2(obj);
            case 20:
                return invokeSuspend$com$withpersona$sdk2$inquiry$permissions$permissionRequest$PermissionRequestWorker$run$1(obj);
            case 21:
                return invokeSuspend$com$withpersona$sdk2$inquiry$selfie$OldCameraScreenRunner$showRendering$1$6(obj);
            case 22:
                return invokeSuspend$com$withpersona$sdk2$inquiry$selfie$SelfieWorkflow$runManualCaptureEnabledChecker$1(obj);
            case 23:
                return invokeSuspend$kotlinx$coroutines$channels$ChannelsKt__ChannelsKt$trySendBlocking$2(obj);
            case 24:
                return invokeSuspend$kotlinx$coroutines$flow$FlowKt__DelayKt$timeoutInternal$1$1$1(obj);
            case 25:
                return invokeSuspend$kotlinx$coroutines$flow$FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(obj);
            case 26:
                return invokeSuspend$kotlinx$coroutines$flow$internal$ChannelFlowMerge$collectTo$2$1(obj);
            default:
                byte[] bArr = (byte[]) this.$subsystem;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SizeMap sizeMap = (SizeMap) obj5;
                    String str25 = ((String) this.$message) + "/2.0/cash/genie/create-session";
                    bArr.getClass();
                    this.$subsystem = null;
                    this.label = 1;
                    sizeMap.getClass();
                    execute = sizeMap.execute(str25, bArr, "application/x-protobuf", "application/x-protobuf", null, new CashMapViewKt$$ExternalSyntheticLambda1(i6), this);
                    if (execute == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    execute = obj;
                }
                GenieCreateSessionResponse genieCreateSessionResponse = (GenieCreateSessionResponse) execute;
                return new SessionHTTPPayload(genieCreateSessionResponse.body, genieCreateSessionResponse.statusCode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger$log$1(int i, Object obj, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$subsystem = obj;
        this.$message = str;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logger$log$1(Logger logger, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        LogLevel logLevel = LogLevel.Error;
        this.$message = str;
        this.this$0 = logger;
        this.$subsystem = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger$log$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$message = obj;
        this.$subsystem = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger$log$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$subsystem = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger$log$1(Object obj, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$message = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger$log$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logger$log$1(Flow[] flowArr, Continuation continuation, FlowsKt$get$1 flowsKt$get$1) {
        super(2, continuation);
        this.$r8$classId = 25;
        this.$subsystem = flowArr;
        this.this$0 = flowsKt$get$1;
    }
}
