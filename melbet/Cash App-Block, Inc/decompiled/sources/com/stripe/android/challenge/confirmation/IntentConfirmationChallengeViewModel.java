package com.stripe.android.challenge.confirmation;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.model.SpanEvent;
import com.datadog.trace.api.Platform;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.TimerWorker$run$1;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityResult;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.model.CancelCaptchaChallengeParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter$ExpectedErrorEvent;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class IntentConfirmationChallengeViewModel extends ViewModel implements DefaultLifecycleObserver {
    public final SharedFlowImpl _bridgeReady;
    public final SharedFlowImpl _result;
    public final TextSetter analyticsEventReporter;
    public final IntentConfirmationChallengeArgs args;
    public final DefaultConfirmationChallengeBridgeHandler bridgeHandler;
    public final SharedFlowImpl bridgeReady;
    public final RealErrorReporter errorReporter;
    public final GlobalScope fireAndForgetScope = GlobalScope.INSTANCE;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final ApiRequest.Options requestOptions;
    public final SharedFlowImpl result;
    public final StripeApiRepository stripeRepository;
    public final String userAgent;
    public final CoroutineContext workContext;

    /* renamed from: com.stripe.android.challenge.confirmation.IntentConfirmationChallengeViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ IntentConfirmationChallengeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(IntentConfirmationChallengeViewModel intentConfirmationChallengeViewModel, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = intentConfirmationChallengeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            IntentConfirmationChallengeViewModel intentConfirmationChallengeViewModel = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(intentConfirmationChallengeViewModel, continuation, 0);
                case 1:
                    return new AnonymousClass1(intentConfirmationChallengeViewModel, continuation, 1);
                default:
                    return new AnonymousClass1(intentConfirmationChallengeViewModel, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            IntentConfirmationChallengeViewModel intentConfirmationChallengeViewModel = this.this$0;
            int i2 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object collectLatest = FlowKt.collectLatest(intentConfirmationChallengeViewModel.bridgeHandler.event, new TimerWorker$run$1(intentConfirmationChallengeViewModel, continuation, 26), this);
                        if (collectLatest != obj2) {
                            collectLatest = Unit.INSTANCE;
                        }
                        if (collectLatest == obj2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (IntentConfirmationChallengeViewModel.access$cancelChallenge(intentConfirmationChallengeViewModel, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SharedFlowImpl sharedFlowImpl = intentConfirmationChallengeViewModel._result;
                        IntentConfirmationChallengeActivityResult.Canceled canceled = new IntentConfirmationChallengeActivityResult.Canceled(intentConfirmationChallengeViewModel.args.intent.getClientSecret());
                        this.label = 1;
                        if (sharedFlowImpl.emit(canceled, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    JobKt.launch$default(intentConfirmationChallengeViewModel.fireAndForgetScope, null, null, new AnonymousClass1(intentConfirmationChallengeViewModel, continuation, i2), 3);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public IntentConfirmationChallengeViewModel(IntentConfirmationChallengeArgs intentConfirmationChallengeArgs, DefaultConfirmationChallengeBridgeHandler defaultConfirmationChallengeBridgeHandler, CoroutineContext coroutineContext, TextSetter textSetter, String str, StripeApiRepository stripeApiRepository, RealErrorReporter realErrorReporter, ApiRequest.Options options, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        this.args = intentConfirmationChallengeArgs;
        this.bridgeHandler = defaultConfirmationChallengeBridgeHandler;
        this.workContext = coroutineContext;
        this.analyticsEventReporter = textSetter;
        this.userAgent = str;
        this.stripeRepository = stripeApiRepository;
        this.errorReporter = realErrorReporter;
        this.requestOptions = options;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        this._bridgeReady = MutableSharedFlow$default;
        this.bridgeReady = MutableSharedFlow$default;
        SharedFlowImpl MutableSharedFlow$default2 = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        this._result = MutableSharedFlow$default2;
        this.result = MutableSharedFlow$default2;
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), coroutineContext, null, new AnonymousClass1(this, null, 0), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r10 == r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r10 == r11) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$cancelChallenge(IntentConfirmationChallengeViewModel intentConfirmationChallengeViewModel, ContinuationImpl continuationImpl) {
        IntentConfirmationChallengeViewModel$cancelChallenge$1 intentConfirmationChallengeViewModel$cancelChallenge$1;
        int i;
        Object m4031cancelSetupIntentCaptchaChallengeBWLJW6A;
        Throwable m4120exceptionOrNullimpl;
        ApiRequest.Options options = intentConfirmationChallengeViewModel.requestOptions;
        RealErrorReporter realErrorReporter = intentConfirmationChallengeViewModel.errorReporter;
        StripeApiRepository stripeApiRepository = intentConfirmationChallengeViewModel.stripeRepository;
        IntentConfirmationChallengeArgs intentConfirmationChallengeArgs = intentConfirmationChallengeViewModel.args;
        if (continuationImpl instanceof IntentConfirmationChallengeViewModel$cancelChallenge$1) {
            intentConfirmationChallengeViewModel$cancelChallenge$1 = (IntentConfirmationChallengeViewModel$cancelChallenge$1) continuationImpl;
            int i2 = intentConfirmationChallengeViewModel$cancelChallenge$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                intentConfirmationChallengeViewModel$cancelChallenge$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = intentConfirmationChallengeViewModel$cancelChallenge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intentConfirmationChallengeViewModel$cancelChallenge$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StripeIntent stripeIntent = intentConfirmationChallengeArgs.intent;
                    String id = stripeIntent.getId();
                    String clientSecret = stripeIntent.getClientSecret();
                    if (id == null || clientSecret == null) {
                        RealErrorReporter.report$default(realErrorReporter, ErrorReporter$UnexpectedErrorEvent.INTENT_CONFIRMATION_CHALLENGE_INTENT_PARAMETERS_UNAVAILABLE, null, null, 6);
                        return Unit.INSTANCE;
                    }
                    CancelCaptchaChallengeParams cancelCaptchaChallengeParams = new CancelCaptchaChallengeParams(clientSecret);
                    if (stripeIntent instanceof PaymentIntent) {
                        intentConfirmationChallengeViewModel$cancelChallenge$1.label = 1;
                        m4031cancelSetupIntentCaptchaChallengeBWLJW6A = stripeApiRepository.m4029cancelPaymentIntentCaptchaChallengeBWLJW6A(id, cancelCaptchaChallengeParams, options, intentConfirmationChallengeViewModel$cancelChallenge$1);
                    } else {
                        if (!(stripeIntent instanceof SetupIntent)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        intentConfirmationChallengeViewModel$cancelChallenge$1.label = 2;
                        m4031cancelSetupIntentCaptchaChallengeBWLJW6A = stripeApiRepository.m4031cancelSetupIntentCaptchaChallengeBWLJW6A(id, cancelCaptchaChallengeParams, options, intentConfirmationChallengeViewModel$cancelChallenge$1);
                    }
                } else {
                    if (i != 1 && i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4031cancelSetupIntentCaptchaChallengeBWLJW6A = ((Result) obj).value;
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4031cancelSetupIntentCaptchaChallengeBWLJW6A);
                if (m4120exceptionOrNullimpl != null) {
                    ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent = ErrorReporter$ExpectedErrorEvent.INTENT_CONFIRMATION_CHALLENGE_CHALLENGE_CANCELLATION_REQUEST_FAILED;
                    int i3 = StripeException.$r8$clinit;
                    RealErrorReporter.report$default(realErrorReporter, errorReporter$ExpectedErrorEvent, SpanEvent.Account.create(m4120exceptionOrNullimpl), null, 4);
                }
                return Unit.INSTANCE;
            }
        }
        intentConfirmationChallengeViewModel$cancelChallenge$1 = new IntentConfirmationChallengeViewModel$cancelChallenge$1(intentConfirmationChallengeViewModel, continuationImpl);
        Object obj2 = intentConfirmationChallengeViewModel$cancelChallenge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intentConfirmationChallengeViewModel$cancelChallenge$1.label;
        if (i != 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4031cancelSetupIntentCaptchaChallengeBWLJW6A);
        if (m4120exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        String str = this.args.captchaVendorName;
        TextSetter textSetter = this.analyticsEventReporter;
        DurationProvider durationProvider = (DurationProvider) textSetter.scannerText;
        DurationProvider.start$default(durationProvider, DurationProvider.Key.IntentConfirmationChallenge);
        DurationProvider.start$default(durationProvider, DurationProvider.Key.IntentConfirmationChallengeWebViewLoaded);
        textSetter.fireEvent(new Platform.JvmRuntime(str, 3, (byte) 0));
    }
}
