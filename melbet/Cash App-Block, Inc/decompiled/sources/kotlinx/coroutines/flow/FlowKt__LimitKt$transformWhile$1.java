package kotlinx.coroutines.flow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;
import androidx.compose.runtime.ProduceStateScope;
import androidx.credentials.CredentialManagerImpl;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetDigitalCredentialOption;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1$2$1;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.utils.ImageCache$Default;
import com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default;
import com.stripe.android.utils.MapUtilsKt;
import com.stripe.android.view.ActivityHost;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepViewModel;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata$GoogleWalletRequestMetadata;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.MdocHelperKt;
import com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$WorkflowWorkerWithHandler;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.oneformapp.helper.matching.POPMatchingFactory;
import papa.SafeTrace;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes8.dex */
public final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_transformWhile;
    public final /* synthetic */ Object $transform;
    public Object L$0;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowKt__LimitKt$transformWhile$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$2 = obj;
        this.L$0 = obj2;
        this.$this_transformWhile = obj3;
        this.$transform = obj4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$transform;
        Object obj3 = this.$this_transformWhile;
        switch (i) {
            case 0:
                FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1((Flow) obj3, (Function3) obj2, continuation, 0);
                flowKt__LimitKt$transformWhile$1.L$0 = obj;
                return flowKt__LimitKt$transformWhile$1;
            case 1:
                return new FlowKt__LimitKt$transformWhile$1((FinancialConnectionsViewModel) this.L$2, (KProperty1) this.L$0, (Function2) obj3, (Function2) obj2, continuation, 1);
            case 2:
                return new FlowKt__LimitKt$transformWhile$1((Stripe3ds2TransactionActivity) this.L$0, (ChallengeResult) obj3, (ViewModelLazy) obj2, continuation, 2);
            case 3:
                return new FlowKt__LimitKt$transformWhile$1((PaymentLauncherViewModel) this.L$0, (ConfirmStripeIntentParams) obj3, (ActivityHost) obj2, continuation, 3);
            case 4:
                return new FlowKt__LimitKt$transformWhile$1((PaymentLauncherViewModel) this.L$0, (String) obj3, (ActivityHost) obj2, continuation, 4);
            case 5:
                return new FlowKt__LimitKt$transformWhile$1((String) obj3, (TextSetter) obj2, continuation, 5);
            case 6:
                FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$12 = new FlowKt__LimitKt$transformWhile$1((CoroutineContext) this.L$2, (StateFlow) obj3, (AssertionError) obj2, continuation);
                flowKt__LimitKt$transformWhile$12.L$0 = obj;
                return flowKt__LimitKt$transformWhile$12;
            case 7:
                return new FlowKt__LimitKt$transformWhile$1((GovernmentIdState.HolographicTorchDelay) this.L$2, (StatefulWorkflow.RenderContext) this.L$0, (GovernmentIdWorkflow.Input) obj3, (POPMatchingFactory) obj2, continuation, 7);
            case 8:
                return new FlowKt__LimitKt$transformWhile$1((CameraController) this.L$2, (GovernmentIdStepFragment) this.L$0, (Screen) obj3, (Context) obj2, continuation, 8);
            case 9:
                return new FlowKt__LimitKt$transformWhile$1((RealFontDownloader) this.L$0, (String) obj3, (BlurEffectKt$$ExternalSyntheticLambda1) obj2, continuation, 9);
            case 10:
                return new FlowKt__LimitKt$transformWhile$1((CredentialManagerImpl) this.L$2, (View) this.L$0, (MdocRequestMetadata$GoogleWalletRequestMetadata) obj3, (UiComponent) obj2, continuation, 10);
            default:
                return new FlowKt__LimitKt$transformWhile$1((WorkflowWorker) this.L$2, (SubtreeManager) this.L$0, (Class) obj3, (WorkflowContextAdapter$WorkflowWorkerWithHandler) obj2, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((FlowKt__LimitKt$transformWhile$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02f0, code lost:
    
        if (r11.collect(r0, r43) == r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0304, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r0, r4, r43) == r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0493, code lost:
    
        if (r2.performNextAction(r10, r3, r0, r43) == r7) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04ac, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r15, r43) == r7) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03ea, code lost:
    
        if (r3 == r7) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013c, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r12, r2, r43) == r11) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06de  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass2;
        Object withContext;
        Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
        String str;
        Map filterNotNullValues;
        String returnUrl;
        Object m4060access$confirmIntent0E7RQCE;
        Throwable m4120exceptionOrNullimpl;
        Map m;
        Object m4049retrieveStripeIntentBWLJW6A;
        TextSetter textSetter;
        Object bitmap;
        String str2;
        Object mo4084stopVideoIoAF18A;
        File access$getFontFile;
        Object credential;
        int i = this.$r8$classId;
        int i2 = 24;
        int i3 = 10;
        Object obj2 = this.$transform;
        Object obj3 = this.$this_transformWhile;
        boolean z = false;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) obj3;
                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass22 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2((Function3) obj2, flowCollector);
                    try {
                        this.L$0 = null;
                        this.L$2 = anonymousClass22;
                        this.label = 1;
                        if (flow.collect(anonymousClass22, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (AbortFlowException e) {
                        e = e;
                        anonymousClass2 = anonymousClass22;
                        if (e.owner == anonymousClass2) {
                            throw e;
                        }
                        JobKt.ensureActive(getContext());
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    anonymousClass2 = (FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2) this.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (AbortFlowException e2) {
                        e = e2;
                        if (e.owner == anonymousClass2) {
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FlowExtensionsKt$combine$$inlined$combine$1(28, ((FinancialConnectionsViewModel) this.L$2).stateFlow, (KProperty1) this.L$0));
                    TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass1 = new TakeUntil$collectSafely$2.AnonymousClass1(i2, (Function2) obj3, (Function2) obj2);
                    this.label = 1;
                    if (distinctUntilChanged.collect(anonymousClass1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = (Stripe3ds2TransactionActivity) this.L$0;
                    int i7 = Stripe3ds2TransactionActivity.$r8$clinit;
                    Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel = (Stripe3ds2TransactionViewModel) ((ViewModelLazy) obj2).getValue();
                    this.L$2 = stripe3ds2TransactionActivity2;
                    this.label = 1;
                    DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor = stripe3ds2TransactionViewModel.challengeResultProcessor;
                    withContext = JobKt.withContext(defaultStripe3ds2ChallengeResultProcessor.workContext, new Logger$log$1((ChallengeResult) obj3, defaultStripe3ds2ChallengeResultProcessor, (Continuation) null, 6), this);
                    if (withContext == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                int i8 = Stripe3ds2TransactionActivity.$r8$clinit;
                stripe3ds2TransactionActivity.finishWithResult((PaymentFlowResult$Unvalidated) withContext);
                return Unit.INSTANCE;
            case 3:
                ConfirmStripeIntentParams confirmStripeIntentParams = (ConfirmStripeIntentParams) obj3;
                PaymentLauncherViewModel paymentLauncherViewModel = (PaymentLauncherViewModel) this.L$0;
                CoroutineContext coroutineContext = paymentLauncherViewModel.uiContext;
                DefaultReturnUrl defaultReturnUrl = paymentLauncherViewModel.defaultReturnUrl;
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = paymentLauncherViewModel.analyticsRequestExecutor;
                SavedStateHandle savedStateHandle = paymentLauncherViewModel.savedStateHandle;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = Boolean.TRUE;
                    savedStateHandle.set(bool, "key_has_started");
                    savedStateHandle.set(bool, "confirm_action_requested");
                    DurationProvider.start$default(paymentLauncherViewModel.durationProvider, DurationProvider.Key.PaymentLauncher);
                    confirmStripeIntentParams.getClass();
                    if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                        str = ((ConfirmPaymentIntentParams) confirmStripeIntentParams).paymentMethodCode;
                    } else {
                        if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str = ((ConfirmSetupIntentParams) confirmStripeIntentParams).paymentMethodCode;
                    }
                    Pair pair = new Pair("payment_method_type", str);
                    String clientSecret = confirmStripeIntentParams.getClientSecret();
                    filterNotNullValues = MapUtilsKt.filterNotNullValues(MapsKt__MapsKt.mapOf(pair, new Pair("intent_id", StringsKt.substringBefore(clientSecret, "_secret_", clientSecret))));
                    defaultAnalyticsRequestExecutor.executeAsync(paymentLauncherViewModel.paymentAnalyticsRequestFactory.createRequest(PaymentAnalyticsEvent.PaymentLauncherConfirmStarted, filterNotNullValues));
                    String returnUrl2 = confirmStripeIntentParams.getReturnUrl();
                    defaultAnalyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentLauncherViewModel.paymentAnalyticsRequestFactory, Intrinsics.areEqual(returnUrl2, defaultReturnUrl.getValue()) ? PaymentAnalyticsEvent.ConfirmReturnUrlDefault : returnUrl2 == null ? PaymentAnalyticsEvent.ConfirmReturnUrlNull : PaymentAnalyticsEvent.ConfirmReturnUrlCustom, null, null, null, null, 62));
                    if (paymentLauncherViewModel.isInstantApp) {
                        returnUrl = confirmStripeIntentParams.getReturnUrl();
                    } else {
                        returnUrl = confirmStripeIntentParams.getReturnUrl();
                        if (returnUrl == null || StringsKt.isBlank(returnUrl)) {
                            returnUrl = null;
                        }
                        if (returnUrl == null) {
                            returnUrl = defaultReturnUrl.getValue();
                        }
                    }
                    this.L$2 = filterNotNullValues;
                    this.label = 1;
                    m4060access$confirmIntent0E7RQCE = PaymentLauncherViewModel.m4060access$confirmIntent0E7RQCE(paymentLauncherViewModel, confirmStripeIntentParams, returnUrl, this);
                    if (m4060access$confirmIntent0E7RQCE == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    Map map = filterNotNullValues;
                    ActivityHost activityHost = (ActivityHost) obj2;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4060access$confirmIntent0E7RQCE);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                } else if (i9 == 1) {
                    filterNotNullValues = (Map) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    m4060access$confirmIntent0E7RQCE = ((Result) obj).value;
                    Map map2 = filterNotNullValues;
                    ActivityHost activityHost2 = (ActivityHost) obj2;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4060access$confirmIntent0E7RQCE);
                    if (m4120exceptionOrNullimpl != null) {
                        StripeIntent stripeIntent = (StripeIntent) m4060access$confirmIntent0E7RQCE;
                        if (stripeIntent.requiresAction()) {
                            PaymentNextActionHandler nextActionHandler = paymentLauncherViewModel.nextActionHandlerRegistry.getNextActionHandler(stripeIntent);
                            ApiRequest.Options options = (ApiRequest.Options) paymentLauncherViewModel.apiRequestOptionsProvider.get();
                            this.L$2 = null;
                            this.label = 3;
                            if (nextActionHandler.performNextAction(activityHost2, stripeIntent, options, this) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else {
                            InquiryViewModel.AnonymousClass1 anonymousClass12 = new InquiryViewModel.AnonymousClass1(paymentLauncherViewModel, stripeIntent, null, 14);
                            this.L$2 = null;
                            this.label = 2;
                            if (JobKt.withContext(coroutineContext, anonymousClass12, this) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        }
                    } else {
                        PaymentLauncherViewModel$confirmStripeIntent$1$2$1 paymentLauncherViewModel$confirmStripeIntent$1$2$1 = new PaymentLauncherViewModel$confirmStripeIntent$1$2$1(paymentLauncherViewModel, m4120exceptionOrNullimpl, map2, null, 0);
                        this.L$2 = null;
                        this.label = 4;
                        if (JobKt.withContext(coroutineContext, paymentLauncherViewModel$confirmStripeIntent$1$2$1, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    }
                } else {
                    if (i9 != 2 && i9 != 3 && i9 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                String str3 = (String) obj3;
                PaymentLauncherViewModel paymentLauncherViewModel2 = (PaymentLauncherViewModel) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    paymentLauncherViewModel2.savedStateHandle.set(Boolean.TRUE, "key_has_started");
                    paymentLauncherViewModel2.savedStateHandle.set(Boolean.FALSE, "confirm_action_requested");
                    DurationProvider.start$default(paymentLauncherViewModel2.durationProvider, DurationProvider.Key.PaymentLauncher);
                    m = Thread$State$EnumUnboxingLocalUtility.m("intent_id", StringsKt.substringBefore(str3, "_secret_", str3));
                    paymentLauncherViewModel2.analyticsRequestExecutor.executeAsync(paymentLauncherViewModel2.paymentAnalyticsRequestFactory.createRequest(PaymentAnalyticsEvent.PaymentLauncherNextActionStarted, m));
                    StripeApiRepository stripeApiRepository = paymentLauncherViewModel2.stripeApiRepository;
                    ApiRequest.Options options2 = (ApiRequest.Options) paymentLauncherViewModel2.apiRequestOptionsProvider.get();
                    this.L$2 = m;
                    this.label = 1;
                    StripeRepository.Companion companion = StripeRepository.Companion;
                    m4049retrieveStripeIntentBWLJW6A = stripeApiRepository.m4049retrieveStripeIntentBWLJW6A(str3, options2, EmptyList.INSTANCE, this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    m = (Map) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    m4049retrieveStripeIntentBWLJW6A = ((Result) obj).value;
                }
                Map map3 = m;
                ActivityHost activityHost3 = (ActivityHost) obj2;
                Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(m4049retrieveStripeIntentBWLJW6A);
                if (m4120exceptionOrNullimpl2 != null) {
                    CoroutineContext coroutineContext2 = paymentLauncherViewModel2.uiContext;
                    PaymentLauncherViewModel$confirmStripeIntent$1$2$1 paymentLauncherViewModel$confirmStripeIntent$1$2$12 = new PaymentLauncherViewModel$confirmStripeIntent$1$2$1(paymentLauncherViewModel2, m4120exceptionOrNullimpl2, map3, null, 1);
                    this.L$2 = null;
                    this.label = 3;
                    break;
                } else {
                    StripeIntent stripeIntent2 = (StripeIntent) m4049retrieveStripeIntentBWLJW6A;
                    if (stripeIntent2 instanceof PaymentIntent) {
                        PaymentIntent paymentIntent = (PaymentIntent) stripeIntent2;
                        String str4 = paymentIntent.clientSecret;
                        if (Intrinsics.areEqual(str4, "redacted_client_secret")) {
                            str3.getClass();
                            stripeIntent2 = !Intrinsics.areEqual(str4, "redacted_client_secret") ? paymentIntent : new PaymentIntent(paymentIntent.id, paymentIntent.paymentMethodTypes, paymentIntent.amount, paymentIntent.canceledAt, paymentIntent.cancellationReason, paymentIntent.captureMethod, str3, paymentIntent.confirmationMethod, paymentIntent.countryCode, paymentIntent.created, paymentIntent.currency, paymentIntent.description, paymentIntent.isLiveMode, paymentIntent.paymentMethod, paymentIntent.paymentMethodId, paymentIntent.receiptEmail, paymentIntent.status, paymentIntent.setupFutureUsage, paymentIntent.lastPaymentError, paymentIntent.shipping, paymentIntent.unactivatedPaymentMethods, paymentIntent.linkFundingSources, paymentIntent.nextActionData, paymentIntent.paymentMethodOptionsJsonString, false);
                        }
                    }
                    PaymentNextActionHandler nextActionHandler2 = paymentLauncherViewModel2.nextActionHandlerRegistry.getNextActionHandler(stripeIntent2);
                    ApiRequest.Options options3 = (ApiRequest.Options) paymentLauncherViewModel2.apiRequestOptionsProvider.get();
                    this.L$2 = null;
                    this.label = 2;
                    break;
                }
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str5 = (String) obj3;
                    if (str5 == null) {
                        return null;
                    }
                    textSetter = (TextSetter) obj2;
                    ((ImageCache$Default) textSetter.textSwitcher).getClass();
                    Bitmap bitmap2 = (Bitmap) ImageCache$Default.cache.get(str5);
                    if (bitmap2 != null) {
                        return bitmap2;
                    }
                    this.L$2 = textSetter;
                    this.L$0 = str5;
                    this.label = 1;
                    bitmap = ((ImageRepository$ImageSupplier$Default) textSetter.scannerText).getBitmap(str5, this);
                    if (bitmap == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                    str2 = str5;
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.L$0;
                    TextSetter textSetter2 = (TextSetter) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    textSetter = textSetter2;
                    bitmap = obj;
                }
                Bitmap bitmap3 = (Bitmap) bitmap;
                if (bitmap3 == null) {
                    textSetter.getClass();
                    return bitmap3;
                }
                ((ImageCache$Default) textSetter.textSwitcher).getClass();
                str2.getClass();
                ImageCache$Default.cache.put(str2, bitmap3);
                return bitmap3;
            case 6:
                StateFlow stateFlow = (StateFlow) obj3;
                CoroutineContext coroutineContext3 = (CoroutineContext) this.L$2;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 != 0) {
                    if (i12 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        OptionalProvider$$ExternalSyntheticLambda0.m$1();
                        return null;
                    }
                    if (i12 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (!Intrinsics.areEqual(coroutineContext3, EmptyCoroutineContext.INSTANCE)) {
                    ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$1 = new ShimmerModifierKt$shimmer$1$1(stateFlow, produceStateScope, z ? 1 : 0, i2);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                } else {
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, i3);
                    this.L$0 = null;
                    this.label = 1;
                    break;
                }
                return coroutineSingletons7;
            case 7:
                GovernmentIdState.HolographicTorchDelay holographicTorchDelay = (GovernmentIdState.HolographicTorchDelay) this.L$2;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = holographicTorchDelay.torchDurationMs;
                    this.label = 1;
                    if (JobKt.delay(j, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                GovernmentIdWorkflowUtilsKt.moveToNextStep$default(holographicTorchDelay, (StatefulWorkflow.RenderContext) this.L$0, (GovernmentIdWorkflow.Input) obj3, holographicTorchDelay.acceptedId, holographicTorchDelay.id, (POPMatchingFactory) obj2, holographicTorchDelay.cameraProperties, false, null, 0, null, 3840);
                return Unit.INSTANCE;
            case 8:
                Screen screen = (Screen) obj3;
                CameraController cameraController = (CameraController) this.L$2;
                GovernmentIdStepFragment governmentIdStepFragment = (GovernmentIdStepFragment) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (cameraController != null) {
                        this.label = 1;
                        mo4084stopVideoIoAF18A = cameraController.mo4084stopVideoIoAF18A(this);
                        if (mo4084stopVideoIoAF18A == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    }
                    governmentIdStepFragment.bindSubmittingRunner((Screen.SubmittingScreen) screen, (Context) obj2);
                    governmentIdStepFragment.cleanupRetainedCamera();
                    governmentIdStepFragment.currentScreen = screen;
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mo4084stopVideoIoAF18A = ((Result) obj).value;
                Result.Companion companion2 = Result.Companion;
                if (!(mo4084stopVideoIoAF18A instanceof Result.Failure)) {
                    File file = (File) mo4084stopVideoIoAF18A;
                    GovernmentIdStepStateManager governmentIdStepStateManager = ((GovernmentIdStepViewModel) governmentIdStepFragment.viewModel$delegate.getValue()).governmentIdStepStateManager;
                    CameraProperties cameraProperties = cameraController.getCameraProperties();
                    governmentIdStepStateManager.getClass();
                    file.getClass();
                    cameraProperties.getClass();
                    WorkflowState state = ((SubtreeManager) governmentIdStepStateManager.lastChild).getState();
                    GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = state instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) state : null;
                    if (finalizeLocalVideoCapture != null) {
                        GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) ((StateFlowImpl) governmentIdStepStateManager.firstChild).getValue();
                        TrackingEventsLogger.DefaultImpls.logVideoStopEvent$default(governmentIdStepStateManager.trackingEventsLogger, input.fromStep, "Upload", null, null, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        List list = finalizeLocalVideoCapture.uploadingIds;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((GovernmentId) it.next()).getSide());
                        }
                        GovernmentId.Side side = GovernmentId.Side.FRONT;
                        boolean contains = arrayList.contains(side);
                        GovernmentId.Side side2 = GovernmentId.Side.BACK;
                        boolean contains2 = arrayList.contains(side2);
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Frame(absolutePath, "video/*"));
                        if (contains && contains2) {
                            side = GovernmentId.Side.FRONT_AND_BACK;
                        } else if (!contains && contains2) {
                            side = side2;
                        }
                        GovernmentIdStateManagerUtilsKt.moveToNextStep$default(finalizeLocalVideoCapture, (SubtreeManager) governmentIdStepStateManager.lastChild, input, new GovernmentId.GovernmentIdVideo(listOf, side, finalizeLocalVideoCapture.id.idClassKey, GovernmentId.CaptureMethod.MANUAL), finalizeLocalVideoCapture.id, governmentIdStepStateManager.videoCaptureHelper, cameraProperties, false, null, 0, null, 3840);
                    }
                }
                Result.Companion companion3 = Result.Companion;
                governmentIdStepFragment.bindSubmittingRunner((Screen.SubmittingScreen) screen, (Context) obj2);
                governmentIdStepFragment.cleanupRetainedCamera();
                governmentIdStepFragment.currentScreen = screen;
                return Unit.INSTANCE;
            case 9:
                String str6 = (String) obj3;
                RealFontDownloader realFontDownloader = (RealFontDownloader) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                try {
                } catch (Exception unused) {
                    realFontDownloader.fontCache.put(str6, null);
                    CollectionsKt__MutableCollectionsKt.removeAll(realFontDownloader.onFontDownloadedCallbacks, new StateBindingsKt$$ExternalSyntheticLambda0(str6, 17));
                }
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    access$getFontFile = RealFontDownloader.access$getFontFile(realFontDownloader);
                    this.L$2 = access$getFontFile;
                    this.label = 1;
                    if (RealFontDownloader.access$downloadFontFile(realFontDownloader, str6, access$getFontFile, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    access$getFontFile = (File) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                Typeface createFromFile = Typeface.createFromFile(access$getFontFile);
                LinkedHashMap linkedHashMap = realFontDownloader.fontCache;
                createFromFile.getClass();
                linkedHashMap.put(str6, new RealFontDownloader.FontState.Cached(createFromFile));
                access$getFontFile.delete();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                HeroCardViewKt$Render$1$4$1.AnonymousClass2 anonymousClass23 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2((BlurEffectKt$$ExternalSyntheticLambda1) obj2, createFromFile, (RealFontDownloader) this.L$0, str6, (Continuation) null, 17);
                this.L$2 = null;
                this.label = 2;
                break;
            case 10:
                UiComponent uiComponent = (UiComponent) obj2;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                try {
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Context context = ((View) this.L$0).getContext();
                        context.getClass();
                        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(30, CollectionsKt__CollectionsJVMKt.listOf(new GetDigitalCredentialOption(((MdocRequestMetadata$GoogleWalletRequestMetadata) obj3).requestJson)), false);
                        this.label = 1;
                        credential = CredentialManagerImpl.getCredential(context, getCredentialRequest, this);
                        if (credential == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        credential = obj;
                    }
                    String responseData = MdocHelperKt.getResponseData(((GetCredentialResponse) credential).credential);
                    if (responseData != null) {
                        ((MdocComponent) uiComponent).mdocDataController.setTextValue(responseData);
                    } else {
                        ((MdocComponent) uiComponent).errorTextController.setTextValue(((MdocComponent) uiComponent).errorRetrievingMdocText);
                    }
                } catch (GetCredentialException unused2) {
                    MdocComponent mdocComponent = (MdocComponent) uiComponent;
                    mdocComponent.errorTextController.setTextValue(mdocComponent.errorRetrievingMdocText);
                }
                return Unit.INSTANCE;
            default:
                WorkflowContextAdapter$WorkflowWorkerWithHandler workflowContextAdapter$WorkflowWorkerWithHandler = (WorkflowContextAdapter$WorkflowWorkerWithHandler) obj2;
                SubtreeManager subtreeManager = (SubtreeManager) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                try {
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow run = ((WorkflowWorker) this.L$2).run();
                        FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass24 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(11, subtreeManager, workflowContextAdapter$WorkflowWorkerWithHandler);
                        this.label = 1;
                        if (run.collect(anonymousClass24, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (Exception unused3) {
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) subtreeManager.interceptor;
                Class cls = (Class) obj3;
                Object obj4 = linkedHashMap2.get(cls);
                Object obj5 = obj4;
                if (obj4 == null) {
                    obj5 = new ArrayList();
                }
                linkedHashMap2.put(cls, CollectionsKt.minus((Iterable) obj5, workflowContextAdapter$WorkflowWorkerWithHandler));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowKt__LimitKt$transformWhile$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$this_transformWhile = obj2;
        this.$transform = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowKt__LimitKt$transformWhile$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_transformWhile = obj;
        this.$transform = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$transformWhile$1(CoroutineContext coroutineContext, StateFlow stateFlow, AssertionError assertionError, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.L$2 = coroutineContext;
        this.$this_transformWhile = stateFlow;
        this.$transform = assertionError;
    }
}
