package com.squareup.cash.wallet.views;

import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.credentials.CredentialProviderFactory;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.sharesheet.RealShareTargetsManager$addSmsTarget$$inlined$map$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.PaymentFlowResult$Validated;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class Hero3DCardViewKt$InteractiveCard$9$1$3 extends SuspendLambda implements Function2 {
    public Object $active;
    public Object $animationState$delegate;
    public final /* synthetic */ Object $backwardResting;
    public /* synthetic */ Object $cardDetails$delegate;
    public Object $cardRotation$delegate;
    public final /* synthetic */ Object $forwardResting;
    public final /* synthetic */ int $r8$classId;
    public long $refreshMs;
    public Object $view$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$9$1$3(MutableState mutableState, MutableState mutableState2, Quat quat, MutableState mutableState3, Quat quat2, MutableState mutableState4, long j, MutableState mutableState5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$view$delegate = mutableState;
        this.$animationState$delegate = mutableState2;
        this.$backwardResting = quat;
        this.$cardRotation$delegate = mutableState3;
        this.$forwardResting = quat2;
        this.$active = mutableState4;
        this.$refreshMs = j;
        this.$cardDetails$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$forwardResting;
        Object obj3 = this.$backwardResting;
        switch (i) {
            case 0:
                return new Hero3DCardViewKt$InteractiveCard$9$1$3((MutableState) this.$view$delegate, (MutableState) this.$animationState$delegate, (Quat) obj3, (MutableState) this.$cardRotation$delegate, (Quat) obj2, (MutableState) this.$active, this.$refreshMs, (MutableState) this.$cardDetails$delegate, continuation, 0);
            case 1:
                return new Hero3DCardViewKt$InteractiveCard$9$1$3((MutableState) this.$view$delegate, (MutableState) this.$animationState$delegate, (Quat) obj3, (MutableState) this.$cardRotation$delegate, (Quat) obj2, (MutableState) this.$active, this.$refreshMs, (MutableState) this.$cardDetails$delegate, continuation, 1);
            default:
                Hero3DCardViewKt$InteractiveCard$9$1$3 hero3DCardViewKt$InteractiveCard$9$1$3 = new Hero3DCardViewKt$InteractiveCard$9$1$3((PaymentFlowResultProcessor) obj3, (PaymentFlowResult$Unvalidated) obj2, continuation);
                hero3DCardViewKt$InteractiveCard$9$1$3.$cardDetails$delegate = obj;
                return hero3DCardViewKt$InteractiveCard$9$1$3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((Hero3DCardViewKt$InteractiveCard$9$1$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0227, code lost:
    
        if (r10 == null) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bb A[Catch: all -> 0x0278, TryCatch #0 {all -> 0x0278, blocks: (B:11:0x0039, B:12:0x024d, B:13:0x0274, B:22:0x0056, B:23:0x01a7, B:24:0x01ac, B:31:0x01c9, B:32:0x01bb, B:34:0x006e, B:35:0x0185, B:39:0x0120, B:41:0x012a, B:43:0x0132, B:45:0x013c, B:47:0x0142, B:48:0x0146, B:50:0x014a, B:54:0x0151, B:56:0x0159, B:58:0x015f, B:60:0x0163, B:61:0x0167, B:64:0x016d, B:70:0x018b, B:75:0x01d7, B:77:0x01db, B:79:0x01e1, B:83:0x01e8, B:85:0x0216, B:87:0x021c, B:92:0x022b, B:94:0x022f, B:95:0x0235, B:98:0x0223, B:101:0x025f, B:102:0x026a), top: B:4:0x0022 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object failure2;
        String str;
        PaymentFlowResult$Validated paymentFlowResult$Validated;
        ApiRequest.Options options;
        String str2;
        CredentialProviderFactory credentialProviderFactory;
        long j;
        StripeException stripeException;
        StripeIntentResult createStripeIntentResult;
        String id;
        Object mo4052cancelStripeIntentSourceBWLJW6A;
        PaymentFlowResult$Validated paymentFlowResult$Validated2;
        String str3;
        Object m4051access$pollStripeIntentUntilTerminalStateyxL6bBk;
        PaymentFlowResult$Validated paymentFlowResult$Validated3;
        Object mo4054refreshStripeIntentBWLJW6A;
        PaymentMethod.Type type2;
        StripeIntent stripeIntent;
        int i;
        int i2;
        int i3 = this.$r8$classId;
        int i4 = 1;
        Object obj2 = this.$backwardResting;
        Object obj3 = this.$forwardResting;
        switch (i3) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(11, (MutableState) this.$view$delegate)), 24);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((MutableState) this.$animationState$delegate, (Quat) obj2, (MutableState) this.$cardRotation$delegate, (Quat) obj3, (MutableState) this.$active, this.$refreshMs, (MutableState) this.$cardDetails$delegate, null, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, anonymousClass2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(19, (MutableState) this.$view$delegate)), 29);
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2((MutableState) this.$animationState$delegate, (Quat) obj2, (MutableState) this.$cardRotation$delegate, (Quat) obj3, (MutableState) this.$active, this.$refreshMs, (MutableState) this.$cardDetails$delegate, null, 1);
                    this.label = 1;
                    if (FlowKt.collectLatest(swipeableState$special$$inlined$filter$1, anonymousClass22, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) obj3;
                PaymentFlowResultProcessor paymentFlowResultProcessor = (PaymentFlowResultProcessor) obj2;
                CredentialProviderFactory credentialProviderFactory2 = paymentFlowResultProcessor.failureMessageFactory;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        stripeException = paymentFlowResult$Unvalidated.exception;
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.Companion;
                        failure2 = new Result.Failure(th2);
                    }
                    if (stripeException != null) {
                        throw stripeException;
                    }
                    String str4 = paymentFlowResult$Unvalidated.clientSecret;
                    if (str4 == null || StringsKt.isBlank(str4)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Invalid client_secret value in result Intent.");
                        failure2 = null;
                    } else {
                        failure2 = new PaymentFlowResult$Validated(paymentFlowResult$Unvalidated.clientSecret, paymentFlowResult$Unvalidated.flowOutcome, paymentFlowResult$Unvalidated.canCancelSource, paymentFlowResult$Unvalidated.sourceId, paymentFlowResult$Unvalidated.source, paymentFlowResult$Unvalidated.stripeAccountId);
                    }
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                    if (m4120exceptionOrNullimpl != null) {
                        return new Result(new Result.Failure(m4120exceptionOrNullimpl));
                    }
                    PaymentFlowResult$Validated paymentFlowResult$Validated4 = (PaymentFlowResult$Validated) failure2;
                    Object obj4 = paymentFlowResultProcessor.publishableKeyProvider.get();
                    obj4.getClass();
                    ApiRequest.Options options2 = new ApiRequest.Options((String) obj4, paymentFlowResult$Validated4.stripeAccountId, 4);
                    long currentTimeMillis = System.currentTimeMillis();
                    StripeException stripeException2 = paymentFlowResult$Unvalidated.exception;
                    String str5 = stripeException2 != null ? stripeException2.requestId : null;
                    String str6 = paymentFlowResult$Validated4.clientSecret;
                    List list = PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
                    this.$cardDetails$delegate = null;
                    this.$view$delegate = paymentFlowResult$Validated4;
                    this.$animationState$delegate = options2;
                    this.$cardRotation$delegate = str5;
                    this.$refreshMs = currentTimeMillis;
                    this.label = 1;
                    failure = paymentFlowResultProcessor.mo4055retrieveStripeIntentBWLJW6A(str6, options2, list, this);
                    if (failure != coroutineSingletons3) {
                        str = "Canceling source '";
                        paymentFlowResult$Validated = paymentFlowResult$Validated4;
                        options = options2;
                        str2 = str5;
                        credentialProviderFactory = credentialProviderFactory2;
                        j = currentTimeMillis;
                    }
                    return coroutineSingletons3;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        paymentFlowResultProcessor = (PaymentFlowResultProcessor) this.$active;
                        str2 = (String) this.$cardRotation$delegate;
                        paymentFlowResult$Validated3 = (PaymentFlowResult$Validated) this.$view$delegate;
                        SafeTrace.throwOnFailure(obj);
                        mo4054refreshStripeIntentBWLJW6A = ((Result) obj).value;
                        SafeTrace.throwOnFailure(mo4054refreshStripeIntentBWLJW6A);
                        stripeIntent = (StripeIntent) mo4054refreshStripeIntentBWLJW6A;
                        i = paymentFlowResult$Validated3.flowOutcome;
                        List list2 = PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
                        paymentFlowResultProcessor.getClass();
                        StripeIntent.Status status = stripeIntent.getStatus();
                        if (status != null) {
                        }
                        if (i2 != 1) {
                            i4 = i;
                        }
                        createStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(i4, stripeIntent, paymentFlowResultProcessor.failureMessageFactory.create(paymentFlowResult$Validated3.flowOutcome, stripeIntent, str2));
                        Result.Companion companion4 = Result.Companion;
                        failure = createStripeIntentResult;
                        return new Result(failure);
                    }
                    if (i7 != 3) {
                        if (i7 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        paymentFlowResultProcessor = (PaymentFlowResultProcessor) this.$active;
                        str2 = (String) this.$cardRotation$delegate;
                        paymentFlowResult$Validated2 = (PaymentFlowResult$Validated) this.$view$delegate;
                        SafeTrace.throwOnFailure(obj);
                        mo4052cancelStripeIntentSourceBWLJW6A = ((Result) obj).value;
                        SafeTrace.throwOnFailure(mo4052cancelStripeIntentSourceBWLJW6A);
                        StripeIntent stripeIntent2 = (StripeIntent) mo4052cancelStripeIntentSourceBWLJW6A;
                        int i8 = paymentFlowResult$Validated2.flowOutcome;
                        createStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(i8, stripeIntent2, paymentFlowResultProcessor.failureMessageFactory.create(i8, stripeIntent2, str2));
                        Result.Companion companion42 = Result.Companion;
                        failure = createStripeIntentResult;
                        return new Result(failure);
                    }
                    paymentFlowResultProcessor = (PaymentFlowResultProcessor) this.$active;
                    str2 = (String) this.$cardRotation$delegate;
                    paymentFlowResult$Validated3 = (PaymentFlowResult$Validated) this.$view$delegate;
                    SafeTrace.throwOnFailure(obj);
                    m4051access$pollStripeIntentUntilTerminalStateyxL6bBk = ((Result) obj).value;
                    SafeTrace.throwOnFailure(m4051access$pollStripeIntentUntilTerminalStateyxL6bBk);
                    stripeIntent = (StripeIntent) m4051access$pollStripeIntentUntilTerminalStateyxL6bBk;
                    i = paymentFlowResult$Validated3.flowOutcome;
                    List list22 = PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
                    paymentFlowResultProcessor.getClass();
                    StripeIntent.Status status2 = stripeIntent.getStatus();
                    i2 = status2 != null ? -1 : PaymentFlowResultProcessor.WhenMappings.$EnumSwitchMapping$0[status2.ordinal()];
                    if (i2 != 1 && i2 != 2) {
                        i4 = i;
                    }
                    createStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(i4, stripeIntent, paymentFlowResultProcessor.failureMessageFactory.create(paymentFlowResult$Validated3.flowOutcome, stripeIntent, str2));
                    Result.Companion companion422 = Result.Companion;
                    failure = createStripeIntentResult;
                    return new Result(failure);
                }
                long j2 = this.$refreshMs;
                String str7 = (String) this.$cardRotation$delegate;
                options = (ApiRequest.Options) this.$animationState$delegate;
                paymentFlowResult$Validated = (PaymentFlowResult$Validated) this.$view$delegate;
                SafeTrace.throwOnFailure(obj);
                failure = ((Result) obj).value;
                str2 = str7;
                credentialProviderFactory = credentialProviderFactory2;
                str = "Canceling source '";
                j = j2;
                Result.Companion companion5 = Result.Companion;
                if (!(failure instanceof Result.Failure)) {
                    StripeIntent stripeIntent3 = (StripeIntent) failure;
                    if (stripeIntent3.getStatus() != StripeIntent.Status.Succeeded && stripeIntent3.getStatus() != StripeIntent.Status.RequiresCapture) {
                        List list3 = PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
                        if (stripeIntent3.getStatus() == StripeIntent.Status.Processing) {
                            PaymentMethod paymentMethod = stripeIntent3.getPaymentMethod();
                            if ((paymentMethod != null ? paymentMethod.f1440type : null) == PaymentMethod.Type.Card && paymentFlowResult$Validated.flowOutcome != 3) {
                            }
                        }
                        if (!PaymentFlowResultProcessor.access$shouldRefreshOrPollIntent(paymentFlowResultProcessor, stripeIntent3, paymentFlowResult$Validated.flowOutcome)) {
                            if (paymentFlowResult$Validated.canCancelSource && stripeIntent3.requiresAction()) {
                                String str8 = paymentFlowResult$Validated.sourceId;
                                String str9 = "";
                                if (str8 == null) {
                                    str8 = "";
                                }
                                paymentFlowResultProcessor.logger.debug(str + str8 + "' for '" + stripeIntent3.getClass().getSimpleName() + "'");
                                StripeIntent.NextActionData nextActionData = stripeIntent3.getNextActionData();
                                StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2 = nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS2 ? (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData : null;
                                if (use3DS2 != null) {
                                    id = use3DS2.threeDS2IntentId;
                                    if (id == null) {
                                    }
                                    str9 = id;
                                    if (use3DS2 != null && (str3 = use3DS2.publishableKey) != null) {
                                        options = new ApiRequest.Options(str3, (String) null, 6);
                                    }
                                    this.$cardDetails$delegate = null;
                                    this.$view$delegate = paymentFlowResult$Validated;
                                    this.$animationState$delegate = null;
                                    this.$cardRotation$delegate = str2;
                                    this.$active = paymentFlowResultProcessor;
                                    this.$refreshMs = j;
                                    this.label = 4;
                                    mo4052cancelStripeIntentSourceBWLJW6A = paymentFlowResultProcessor.mo4052cancelStripeIntentSourceBWLJW6A(options, str9, str8, this);
                                    if (mo4052cancelStripeIntentSourceBWLJW6A != coroutineSingletons3) {
                                        paymentFlowResult$Validated2 = paymentFlowResult$Validated;
                                        SafeTrace.throwOnFailure(mo4052cancelStripeIntentSourceBWLJW6A);
                                        StripeIntent stripeIntent22 = (StripeIntent) mo4052cancelStripeIntentSourceBWLJW6A;
                                        int i82 = paymentFlowResult$Validated2.flowOutcome;
                                        createStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(i82, stripeIntent22, paymentFlowResultProcessor.failureMessageFactory.create(i82, stripeIntent22, str2));
                                        Result.Companion companion4222 = Result.Companion;
                                        failure = createStripeIntentResult;
                                    }
                                }
                                id = stripeIntent3.getId();
                                break;
                            } else {
                                int i9 = paymentFlowResult$Validated.flowOutcome;
                                createStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(i9, stripeIntent3, credentialProviderFactory.create(i9, stripeIntent3, str2));
                                Result.Companion companion42222 = Result.Companion;
                                failure = createStripeIntentResult;
                            }
                        } else {
                            PaymentMethod paymentMethod2 = stripeIntent3.getPaymentMethod();
                            boolean z = ((paymentMethod2 == null || (type2 = paymentMethod2.f1440type) == null) ? null : type2.afterRedirectAction) instanceof PaymentMethod.AfterRedirectAction.Refresh;
                            String str10 = paymentFlowResult$Validated.clientSecret;
                            if (z) {
                                this.$cardDetails$delegate = null;
                                this.$view$delegate = paymentFlowResult$Validated;
                                this.$animationState$delegate = null;
                                this.$cardRotation$delegate = str2;
                                this.$active = paymentFlowResultProcessor;
                                this.$refreshMs = j;
                                this.label = 2;
                                mo4054refreshStripeIntentBWLJW6A = paymentFlowResultProcessor.mo4054refreshStripeIntentBWLJW6A(str10, options, this);
                                if (mo4054refreshStripeIntentBWLJW6A != coroutineSingletons3) {
                                    paymentFlowResult$Validated3 = paymentFlowResult$Validated;
                                    SafeTrace.throwOnFailure(mo4054refreshStripeIntentBWLJW6A);
                                    stripeIntent = (StripeIntent) mo4054refreshStripeIntentBWLJW6A;
                                    i = paymentFlowResult$Validated3.flowOutcome;
                                    List list222 = PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
                                    paymentFlowResultProcessor.getClass();
                                    StripeIntent.Status status22 = stripeIntent.getStatus();
                                    if (status22 != null) {
                                    }
                                    if (i2 != 1) {
                                    }
                                    createStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(i4, stripeIntent, paymentFlowResultProcessor.failureMessageFactory.create(paymentFlowResult$Validated3.flowOutcome, stripeIntent, str2));
                                    Result.Companion companion422222 = Result.Companion;
                                    failure = createStripeIntentResult;
                                }
                            } else {
                                this.$cardDetails$delegate = null;
                                this.$view$delegate = paymentFlowResult$Validated;
                                this.$animationState$delegate = null;
                                this.$cardRotation$delegate = str2;
                                this.$active = paymentFlowResultProcessor;
                                this.$refreshMs = j;
                                this.label = 3;
                                m4051access$pollStripeIntentUntilTerminalStateyxL6bBk = PaymentFlowResultProcessor.m4051access$pollStripeIntentUntilTerminalStateyxL6bBk(paymentFlowResultProcessor, stripeIntent3, str10, options, j, this);
                                paymentFlowResultProcessor = paymentFlowResultProcessor;
                                if (m4051access$pollStripeIntentUntilTerminalStateyxL6bBk != coroutineSingletons3) {
                                    paymentFlowResult$Validated3 = paymentFlowResult$Validated;
                                    SafeTrace.throwOnFailure(m4051access$pollStripeIntentUntilTerminalStateyxL6bBk);
                                    stripeIntent = (StripeIntent) m4051access$pollStripeIntentUntilTerminalStateyxL6bBk;
                                    i = paymentFlowResult$Validated3.flowOutcome;
                                    List list2222 = PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
                                    paymentFlowResultProcessor.getClass();
                                    StripeIntent.Status status222 = stripeIntent.getStatus();
                                    if (status222 != null) {
                                    }
                                    if (i2 != 1) {
                                    }
                                    createStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(i4, stripeIntent, paymentFlowResultProcessor.failureMessageFactory.create(paymentFlowResult$Validated3.flowOutcome, stripeIntent, str2));
                                    Result.Companion companion4222222 = Result.Companion;
                                    failure = createStripeIntentResult;
                                }
                            }
                        }
                        return coroutineSingletons3;
                    }
                    createStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(1, stripeIntent3, credentialProviderFactory.create(paymentFlowResult$Validated.flowOutcome, stripeIntent3, str2));
                    Result.Companion companion42222222 = Result.Companion;
                    failure = createStripeIntentResult;
                }
                return new Result(failure);
        }
    }

    /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ Object $active;
        public final /* synthetic */ Object $animationState$delegate;
        public final /* synthetic */ Object $backwardResting;
        public final /* synthetic */ Object $cardDetails$delegate;
        public final /* synthetic */ Object $cardRotation$delegate;
        public final /* synthetic */ Object $forwardResting;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ long $refreshMs;
        public int label;

        /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3$2$7, reason: invalid class name */
        /* loaded from: classes7.dex */
        public final class AnonymousClass7 extends SuspendLambda implements Function2 {
            public final /* synthetic */ MutableState $active;
            public final /* synthetic */ MutableState $animationState$delegate;
            public final /* synthetic */ MutableState $cardDetails$delegate;
            public final /* synthetic */ MutableState $cardRotation$delegate;
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ long $refreshMs;
            public /* synthetic */ Object L$0;
            public int label;

            /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3$2$7$1, reason: invalid class name */
            public final class AnonymousClass1 extends SuspendLambda implements Function2 {
                public final /* synthetic */ MutableState $cardRotation$delegate;
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ SlerpAnimator $rotationAnimator;
                public /* synthetic */ float F$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ AnonymousClass1(SlerpAnimator slerpAnimator, MutableState mutableState, Continuation continuation, int i) {
                    super(2, continuation);
                    this.$r8$classId = i;
                    this.$rotationAnimator = slerpAnimator;
                    this.$cardRotation$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    int i = this.$r8$classId;
                    MutableState mutableState = this.$cardRotation$delegate;
                    SlerpAnimator slerpAnimator = this.$rotationAnimator;
                    switch (i) {
                        case 0:
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(slerpAnimator, mutableState, continuation, 0);
                            anonymousClass1.F$0 = ((Number) obj).floatValue();
                            return anonymousClass1;
                        case 1:
                            AnonymousClass1 anonymousClass12 = new AnonymousClass1(slerpAnimator, mutableState, continuation, 1);
                            anonymousClass12.F$0 = ((Number) obj).floatValue();
                            return anonymousClass12;
                        case 2:
                            AnonymousClass1 anonymousClass13 = new AnonymousClass1(slerpAnimator, mutableState, continuation, 2);
                            anonymousClass13.F$0 = ((Number) obj).floatValue();
                            return anonymousClass13;
                        case 3:
                            AnonymousClass1 anonymousClass14 = new AnonymousClass1(slerpAnimator, mutableState, continuation, 3);
                            anonymousClass14.F$0 = ((Number) obj).floatValue();
                            return anonymousClass14;
                        case 4:
                            AnonymousClass1 anonymousClass15 = new AnonymousClass1(slerpAnimator, mutableState, continuation, 4);
                            anonymousClass15.F$0 = ((Number) obj).floatValue();
                            return anonymousClass15;
                        case 5:
                            AnonymousClass1 anonymousClass16 = new AnonymousClass1(slerpAnimator, mutableState, continuation, 5);
                            anonymousClass16.F$0 = ((Number) obj).floatValue();
                            return anonymousClass16;
                        default:
                            AnonymousClass1 anonymousClass17 = new AnonymousClass1(slerpAnimator, mutableState, continuation, 6);
                            anonymousClass17.F$0 = ((Number) obj).floatValue();
                            return anonymousClass17;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i = this.$r8$classId;
                    float floatValue = ((Number) obj).floatValue();
                    Continuation continuation = (Continuation) obj2;
                    switch (i) {
                    }
                    return ((AnonymousClass1) create(Float.valueOf(floatValue), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int i = this.$r8$classId;
                    MutableState mutableState = this.$cardRotation$delegate;
                    SlerpAnimator slerpAnimator = this.$rotationAnimator;
                    float f = this.F$0;
                    switch (i) {
                        case 0:
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            SafeTrace.throwOnFailure(obj);
                            slerpAnimator.setCurrentFraction(f);
                            Object animatedValue = slerpAnimator.getAnimatedValue();
                            animatedValue.getClass();
                            float[] fArr = Hero3DCardViewKt.X_AXIS;
                            mutableState.setValue((Quat) animatedValue);
                            break;
                        case 1:
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            SafeTrace.throwOnFailure(obj);
                            slerpAnimator.setCurrentFraction(f);
                            Object animatedValue2 = slerpAnimator.getAnimatedValue();
                            animatedValue2.getClass();
                            Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            mutableState.setValue((Quat) animatedValue2);
                            break;
                        case 2:
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            SafeTrace.throwOnFailure(obj);
                            slerpAnimator.setCurrentFraction(f);
                            Object animatedValue3 = slerpAnimator.getAnimatedValue();
                            animatedValue3.getClass();
                            Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            mutableState.setValue((Quat) animatedValue3);
                            break;
                        case 3:
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            SafeTrace.throwOnFailure(obj);
                            slerpAnimator.setCurrentFraction(f);
                            Object animatedValue4 = slerpAnimator.getAnimatedValue();
                            animatedValue4.getClass();
                            Quat quat3 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            mutableState.setValue((Quat) animatedValue4);
                            break;
                        case 4:
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            SafeTrace.throwOnFailure(obj);
                            slerpAnimator.setCurrentFraction(f);
                            Object animatedValue5 = slerpAnimator.getAnimatedValue();
                            animatedValue5.getClass();
                            float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                            mutableState.setValue((Quat) animatedValue5);
                            break;
                        case 5:
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            SafeTrace.throwOnFailure(obj);
                            slerpAnimator.setCurrentFraction(f);
                            Object animatedValue6 = slerpAnimator.getAnimatedValue();
                            animatedValue6.getClass();
                            float[] fArr3 = Hero3DCardViewKt.X_AXIS;
                            mutableState.setValue((Quat) animatedValue6);
                            break;
                        default:
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            SafeTrace.throwOnFailure(obj);
                            slerpAnimator.setCurrentFraction(f);
                            Object animatedValue7 = slerpAnimator.getAnimatedValue();
                            animatedValue7.getClass();
                            float[] fArr4 = Hero3DCardViewKt.X_AXIS;
                            mutableState.setValue((Quat) animatedValue7);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass7(MutableState mutableState, long j, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.$active = mutableState;
                this.$refreshMs = j;
                this.$animationState$delegate = mutableState2;
                this.$cardRotation$delegate = mutableState3;
                this.$cardDetails$delegate = mutableState4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                switch (this.$r8$classId) {
                    case 0:
                        AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$active, this.$refreshMs, this.$animationState$delegate, this.$cardRotation$delegate, this.$cardDetails$delegate, continuation, 0);
                        anonymousClass7.L$0 = obj;
                        return anonymousClass7;
                    default:
                        AnonymousClass7 anonymousClass72 = new AnonymousClass7(this.$active, this.$refreshMs, this.$animationState$delegate, this.$cardRotation$delegate, this.$cardDetails$delegate, continuation, 1);
                        anonymousClass72.L$0 = obj;
                        return anonymousClass72;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SlerpAnimator slerpAnimator = (SlerpAnimator) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                }
                return ((AnonymousClass7) create(slerpAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.$r8$classId;
                MutableState mutableState = this.$cardDetails$delegate;
                MutableState mutableState2 = this.$cardRotation$delegate;
                long j = this.$refreshMs;
                MutableState mutableState3 = this.$active;
                MutableState mutableState4 = this.$animationState$delegate;
                Continuation continuation = null;
                switch (i) {
                    case 0:
                        SlerpAnimator slerpAnimator = (SlerpAnimator) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            float[] fArr = Hero3DCardViewKt.X_AXIS;
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((InteractiveCardState) mutableState4.getValue()).flipToBack$delegate;
                            Boolean bool = Boolean.FALSE;
                            parcelableSnapshotMutableState.setValue(bool);
                            ((InteractiveCardState) mutableState4.getValue()).flipToFront$delegate.setValue(bool);
                            FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow = FlowsKt.animatedFlow(mutableState3, j, 750L);
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(slerpAnimator, mutableState2, continuation, 0);
                            this.L$0 = null;
                            this.label = 1;
                            if (FlowKt.collectLatest(animatedFlow, anonymousClass1, this) == coroutineSingletons) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                        CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).cardInteraction;
                        if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                            cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1.onCardSettled(true);
                        }
                        break;
                    default:
                        SlerpAnimator slerpAnimator2 = (SlerpAnimator) this.L$0;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.label;
                        if (i3 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = ((InteractiveCardState) mutableState4.getValue()).flipToBack$delegate;
                            Boolean bool2 = Boolean.FALSE;
                            parcelableSnapshotMutableState2.setValue(bool2);
                            ((InteractiveCardState) mutableState4.getValue()).flipToFront$delegate.setValue(bool2);
                            FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow2 = FlowsKt.animatedFlow(mutableState3, j, 750L);
                            AnonymousClass1 anonymousClass12 = new AnonymousClass1(slerpAnimator2, mutableState2, continuation, 3);
                            this.L$0 = null;
                            this.label = 1;
                            if (FlowKt.collectLatest(animatedFlow2, anonymousClass12, this) == coroutineSingletons2) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                        CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$12 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).cardInteraction;
                        if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$12 != null) {
                            cardSchemePresenter$toHeroModule$cardDetails$2$1$1$12.onCardSettled(true);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, AeMode aeMode, long j) {
            super(2, continuation);
            this.$r8$classId = 2;
            this.$animationState$delegate = deferredUseCaseCameraRequestControl;
            this.$cardRotation$delegate = list;
            this.$active = list2;
            this.$cardDetails$delegate = list3;
            this.$backwardResting = lock3ABehavior;
            this.$forwardResting = aeMode;
            this.$refreshMs = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$forwardResting;
            Object obj3 = this.$backwardResting;
            Object obj4 = this.$cardDetails$delegate;
            Object obj5 = this.$active;
            Object obj6 = this.$cardRotation$delegate;
            Object obj7 = this.$animationState$delegate;
            switch (i) {
                case 0:
                    return new AnonymousClass2((MutableState) obj7, (Quat) obj3, (MutableState) obj6, (Quat) obj2, (MutableState) obj5, this.$refreshMs, (MutableState) obj4, continuation, 0);
                case 1:
                    return new AnonymousClass2((MutableState) obj7, (Quat) obj3, (MutableState) obj6, (Quat) obj2, (MutableState) obj5, this.$refreshMs, (MutableState) obj4, continuation, 1);
                default:
                    return new AnonymousClass2((DeferredUseCaseCameraRequestControl) obj7, continuation, (List) obj6, (List) obj5, (List) obj4, (Lock3ABehavior) obj3, (AeMode) obj2, this.$refreshMs);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass2) create((CardModelView) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    return ((AnonymousClass2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.$forwardResting;
            Object obj3 = this.$backwardResting;
            Object obj4 = this.$cardDetails$delegate;
            Object obj5 = this.$active;
            Object obj6 = this.$animationState$delegate;
            Object obj7 = this.$cardRotation$delegate;
            switch (i) {
                case 0:
                    MutableState mutableState = (MutableState) obj7;
                    MutableState mutableState2 = (MutableState) obj6;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelFlowBuilder merge = FlowKt.merge(new RealShareTargetsManager$addSmsTarget$$inlined$map$1(new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(12, mutableState2)), 8), (Quat) obj3, mutableState, 6), new RealShareTargetsManager$addSmsTarget$$inlined$map$1(new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(13, mutableState2)), 9), (Quat) obj2, mutableState, 7));
                        AnonymousClass7 anonymousClass7 = new AnonymousClass7((MutableState) obj5, this.$refreshMs, mutableState2, (MutableState) obj7, (MutableState) obj4, null, 0);
                        this.label = 1;
                        if (FlowKt.collectLatest(merge, anonymousClass7, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    MutableState mutableState3 = (MutableState) obj7;
                    MutableState mutableState4 = (MutableState) obj6;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelFlowBuilder merge2 = FlowKt.merge(new RealShareTargetsManager$addSmsTarget$$inlined$map$1(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(20, mutableState4)), 27), (Quat) obj3, mutableState3, 4), new RealShareTargetsManager$addSmsTarget$$inlined$map$1(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(21, mutableState4)), 28), (Quat) obj2, mutableState3, 5));
                        AnonymousClass7 anonymousClass72 = new AnonymousClass7((MutableState) obj5, this.$refreshMs, mutableState4, (MutableState) obj7, (MutableState) obj4, null, 1);
                        this.label = 1;
                        if (FlowKt.collectLatest(merge2, anonymousClass72, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Deferred mo34startFocusAndMeteringAsyncNxRnBj4 = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl((DeferredUseCaseCameraRequestControl) obj6).mo34startFocusAndMeteringAsyncNxRnBj4((List) obj7, (List) obj5, (List) obj4, (Lock3ABehavior) obj3, (AeMode) obj2, this.$refreshMs);
                    this.label = 1;
                    Object awaitInternal = ((CompletableDeferredImpl) mo34startFocusAndMeteringAsyncNxRnBj4).awaitInternal(this);
                    return awaitInternal == coroutineSingletons3 ? coroutineSingletons3 : awaitInternal;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(MutableState mutableState, Quat quat, MutableState mutableState2, Quat quat2, MutableState mutableState3, long j, MutableState mutableState4, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$animationState$delegate = mutableState;
            this.$backwardResting = quat;
            this.$cardRotation$delegate = mutableState2;
            this.$forwardResting = quat2;
            this.$active = mutableState3;
            this.$refreshMs = j;
            this.$cardDetails$delegate = mutableState4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hero3DCardViewKt$InteractiveCard$9$1$3(PaymentFlowResultProcessor paymentFlowResultProcessor, PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$backwardResting = paymentFlowResultProcessor;
        this.$forwardResting = paymentFlowResult$Unvalidated;
    }
}
