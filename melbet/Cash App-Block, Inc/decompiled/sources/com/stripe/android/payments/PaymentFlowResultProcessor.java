package com.stripe.android.payments;

import android.content.Context;
import androidx.credentials.CredentialProviderFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtxKt;
import com.stripe.android.networking.StripeRepository;
import io.noties.markwon.LinkResolverDef;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public abstract class PaymentFlowResultProcessor {
    public static final List EXPAND_PAYMENT_METHOD = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
    public final CredentialProviderFactory failureMessageFactory;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final Provider publishableKeyProvider;
    public final StripeRepository stripeRepository;
    public final CoroutineContext workContext;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                LinkResolverDef linkResolverDef = StripeIntent.Status.Companion;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LinkResolverDef linkResolverDef2 = StripeIntent.Status.Companion;
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentFlowResultProcessor(Context context, Provider provider, StripeRepository stripeRepository, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, CoroutineContext coroutineContext) {
        this.publishableKeyProvider = provider;
        this.stripeRepository = stripeRepository;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.workContext = coroutineContext;
        this.failureMessageFactory = new CredentialProviderFactory(context, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: access$pollStripeIntentUntilTerminalState-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4051access$pollStripeIntentUntilTerminalStateyxL6bBk(PaymentFlowResultProcessor paymentFlowResultProcessor, StripeIntent stripeIntent, String str, ApiRequest.Options options, long j, ContinuationImpl continuationImpl) {
        PaymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1 paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1;
        PaymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1 paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12;
        Object obj;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        long pollingDuration;
        String str2;
        ApiRequest.Options options2;
        long j2;
        PaymentMethod.Type type2;
        PaymentMethod.AfterRedirectAction afterRedirectAction;
        Object mo4055retrieveStripeIntentBWLJW6A;
        Ref$ObjectRef ref$ObjectRef2;
        if (continuationImpl instanceof PaymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1) {
            paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1 = (PaymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1) continuationImpl;
            int i2 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1.label = i2 - PKIFailureInfo.systemUnavail;
                paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1;
                Object obj2 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j;
                    ref$ObjectRef = new Ref$ObjectRef();
                    PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
                    pollingDuration = ((paymentMethod == null || (type2 = paymentMethod.f1440type) == null || (afterRedirectAction = type2.afterRedirectAction) == null) ? 15000L : afterRedirectAction.getPollingDuration()) - (System.currentTimeMillis() - j);
                    str2 = str;
                    options2 = options;
                    NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$1 = new NotificationActionService$onHandleIntent$1(ref$ObjectRef, paymentFlowResultProcessor, str2, options2, ref$LongRef, (Continuation) null);
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$1 = str2;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$2 = options2;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$4 = ref$ObjectRef;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.J$0 = j;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.J$1 = pollingDuration;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.label = 1;
                    if (JobKt.withTimeoutOrNull(pollingDuration, notificationActionService$onHandleIntent$1, paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12) != obj) {
                        j2 = j;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$5;
                    ref$ObjectRef2 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    mo4055retrieveStripeIntentBWLJW6A = ((Result) obj2).value;
                    ref$ObjectRef.element = new Result(mo4055retrieveStripeIntentBWLJW6A);
                    ref$ObjectRef = ref$ObjectRef2;
                    return ((Result) ref$ObjectRef.element).value;
                }
                long j3 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.J$1;
                j2 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.J$0;
                ref$ObjectRef = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$4;
                ApiRequest.Options options3 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$2;
                String str3 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$1;
                SafeTrace.throwOnFailure(obj2);
                pollingDuration = j3;
                options2 = options3;
                str2 = str3;
                if (!shouldRetry((Result) ref$ObjectRef.element) || ref$ObjectRef.element == null) {
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$1 = null;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$2 = null;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$4 = ref$ObjectRef;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$5 = ref$ObjectRef;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.J$0 = j2;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.J$1 = pollingDuration;
                    paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.label = 2;
                    mo4055retrieveStripeIntentBWLJW6A = paymentFlowResultProcessor.mo4055retrieveStripeIntentBWLJW6A(str2, options2, EXPAND_PAYMENT_METHOD, paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12);
                    if (mo4055retrieveStripeIntentBWLJW6A != obj) {
                        ref$ObjectRef2 = ref$ObjectRef;
                        ref$ObjectRef.element = new Result(mo4055retrieveStripeIntentBWLJW6A);
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                    return obj;
                }
                return ((Result) ref$ObjectRef.element).value;
            }
        }
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1 = new PaymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1(paymentFlowResultProcessor, continuationImpl);
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1;
        Object obj22 = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.label;
        if (i != 0) {
        }
        if (!shouldRetry((Result) ref$ObjectRef.element)) {
        }
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$1 = null;
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$2 = null;
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$4 = ref$ObjectRef;
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.L$5 = ref$ObjectRef;
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.J$0 = j2;
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.J$1 = pollingDuration;
        paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12.label = 2;
        mo4055retrieveStripeIntentBWLJW6A = paymentFlowResultProcessor.mo4055retrieveStripeIntentBWLJW6A(str2, options2, EXPAND_PAYMENT_METHOD, paymentFlowResultProcessor$pollStripeIntentUntilTerminalState$12);
        if (mo4055retrieveStripeIntentBWLJW6A != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean access$shouldRefreshOrPollIntent(PaymentFlowResultProcessor paymentFlowResultProcessor, StripeIntent stripeIntent, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        PaymentMethod paymentMethod;
        PaymentMethod.Type type2;
        PaymentMethod.AfterRedirectAction afterRedirectAction;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        if (i == 1) {
            Set set = StripeIntentKtxKt.REFRESHABLE_PAYMENT_METHODS;
            if (stripeIntent instanceof PaymentIntent) {
                Set set2 = StripeIntentKtxKt.REFRESHABLE_PAYMENT_METHODS;
                PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
                PaymentMethod paymentMethod4 = paymentIntent.paymentMethod;
                if (CollectionsKt.contains(set2, paymentMethod4 != null ? paymentMethod4.f1440type : null) && paymentIntent.requiresAction()) {
                    z = true;
                    if (i == 3 && stripeIntent.getStatus() == StripeIntent.Status.Processing) {
                        paymentMethod3 = stripeIntent.getPaymentMethod();
                        if ((paymentMethod3 == null ? paymentMethod3.f1440type : null) == PaymentMethod.Type.Card) {
                            z2 = true;
                            if (i == 3 && stripeIntent.getStatus() == StripeIntent.Status.RequiresAction) {
                                paymentMethod2 = stripeIntent.getPaymentMethod();
                                if ((paymentMethod2 != null ? paymentMethod2.f1440type : null) == PaymentMethod.Type.Card && stripeIntent.getNextActionType() == StripeIntent.NextActionType.UseStripeSdk) {
                                    z3 = true;
                                    return !z || z2 || z3 || (!stripeIntent.requiresAction() && (paymentMethod = stripeIntent.getPaymentMethod()) != null && (type2 = paymentMethod.f1440type) != null && (afterRedirectAction = type2.afterRedirectAction) != null && afterRedirectAction.getShouldRefreshOrRetrieve());
                                }
                            }
                            z3 = false;
                            if (z) {
                            }
                        }
                    }
                    z2 = false;
                    if (i == 3) {
                        paymentMethod2 = stripeIntent.getPaymentMethod();
                        if ((paymentMethod2 != null ? paymentMethod2.f1440type : null) == PaymentMethod.Type.Card) {
                            z3 = true;
                            if (z) {
                            }
                        }
                    }
                    z3 = false;
                    if (z) {
                    }
                }
            }
        }
        z = false;
        if (i == 3) {
            paymentMethod3 = stripeIntent.getPaymentMethod();
            if ((paymentMethod3 == null ? paymentMethod3.f1440type : null) == PaymentMethod.Type.Card) {
            }
        }
        z2 = false;
        if (i == 3) {
        }
        z3 = false;
        if (z) {
        }
    }

    public static boolean shouldRetry(Result result) {
        boolean z;
        if (result != null) {
            Object obj = result.value;
            if (obj instanceof Result.Failure) {
                obj = null;
            }
            StripeIntent stripeIntent = (StripeIntent) obj;
            if (stripeIntent != null) {
                boolean requiresAction = stripeIntent.requiresAction();
                if (stripeIntent.getStatus() == StripeIntent.Status.Processing) {
                    PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
                    if ((paymentMethod != null ? paymentMethod.f1440type : null) == PaymentMethod.Type.Card) {
                        z = true;
                        if (requiresAction && !z) {
                            return false;
                        }
                    }
                }
                z = false;
                if (requiresAction) {
                }
            }
        }
        return true;
    }

    /* renamed from: cancelStripeIntentSource-BWLJW6A, reason: not valid java name */
    public abstract Object mo4052cancelStripeIntentSourceBWLJW6A(ApiRequest.Options options, String str, String str2, ContinuationImpl continuationImpl);

    public abstract StripeIntentResult createStripeIntentResult(int i, StripeIntent stripeIntent, String str);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: processResult-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4053processResultgIAlus(PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated, ContinuationImpl continuationImpl) {
        PaymentFlowResultProcessor$processResult$1 paymentFlowResultProcessor$processResult$1;
        int i;
        if (continuationImpl instanceof PaymentFlowResultProcessor$processResult$1) {
            paymentFlowResultProcessor$processResult$1 = (PaymentFlowResultProcessor$processResult$1) continuationImpl;
            int i2 = paymentFlowResultProcessor$processResult$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentFlowResultProcessor$processResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentFlowResultProcessor$processResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentFlowResultProcessor$processResult$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Hero3DCardViewKt$InteractiveCard$9$1$3 hero3DCardViewKt$InteractiveCard$9$1$3 = new Hero3DCardViewKt$InteractiveCard$9$1$3(this, paymentFlowResult$Unvalidated, null);
                    paymentFlowResultProcessor$processResult$1.label = 1;
                    obj = JobKt.withContext(this.workContext, hero3DCardViewKt$InteractiveCard$9$1$3, paymentFlowResultProcessor$processResult$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((Result) obj).value;
            }
        }
        paymentFlowResultProcessor$processResult$1 = new PaymentFlowResultProcessor$processResult$1(this, continuationImpl);
        Object obj2 = paymentFlowResultProcessor$processResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentFlowResultProcessor$processResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).value;
    }

    /* renamed from: refreshStripeIntent-BWLJW6A, reason: not valid java name */
    public abstract Object mo4054refreshStripeIntentBWLJW6A(String str, ApiRequest.Options options, ContinuationImpl continuationImpl);

    /* renamed from: retrieveStripeIntent-BWLJW6A, reason: not valid java name */
    public abstract Object mo4055retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List list, ContinuationImpl continuationImpl);
}
