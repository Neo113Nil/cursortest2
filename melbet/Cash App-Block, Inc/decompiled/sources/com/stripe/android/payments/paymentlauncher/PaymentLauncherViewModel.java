package com.stripe.android.payments.paymentlauncher;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.model.SpanEvent;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.analytics.ErrorReporter$Companion;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.utils.MapUtilsKt;
import com.stripe.android.view.ActivityHost;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import dagger.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PaymentLauncherViewModel extends ViewModel {
    public static final List EXPAND_PAYMENT_METHOD = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final SelfieDirectionFeed_Factory apiRequestOptionsProvider;
    public final DefaultReturnUrl defaultReturnUrl;
    public final DurationProvider durationProvider;
    public final StateFlowImpl internalPaymentResult;
    public final boolean isInstantApp;
    public final boolean isPaymentIntent;
    public final Lazy lazyPaymentIntentFlowResultProcessor;
    public final Lazy lazySetupIntentFlowResultProcessor;
    public final DefaultPaymentNextActionHandlerRegistry nextActionHandlerRegistry;
    public final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    public final SavedStateHandle savedStateHandle;
    public final StripeApiRepository stripeApiRepository;
    public final CoroutineContext uiContext;

    public PaymentLauncherViewModel(boolean z, StripeApiRepository stripeApiRepository, DefaultPaymentNextActionHandlerRegistry defaultPaymentNextActionHandlerRegistry, DefaultReturnUrl defaultReturnUrl, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, Lazy lazy, Lazy lazy2, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, CoroutineContext coroutineContext, SavedStateHandle savedStateHandle, boolean z2, DurationProvider durationProvider) {
        defaultPaymentNextActionHandlerRegistry.getClass();
        defaultReturnUrl.getClass();
        lazy.getClass();
        lazy2.getClass();
        durationProvider.getClass();
        this.isPaymentIntent = z;
        this.stripeApiRepository = stripeApiRepository;
        this.nextActionHandlerRegistry = defaultPaymentNextActionHandlerRegistry;
        this.defaultReturnUrl = defaultReturnUrl;
        this.apiRequestOptionsProvider = selfieDirectionFeed_Factory;
        this.lazyPaymentIntentFlowResultProcessor = lazy;
        this.lazySetupIntentFlowResultProcessor = lazy2;
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.uiContext = coroutineContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z2;
        this.durationProvider = durationProvider;
        this.internalPaymentResult = FlowKt.MutableStateFlow(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: access$confirmIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4060access$confirmIntent0E7RQCE(PaymentLauncherViewModel paymentLauncherViewModel, ConfirmStripeIntentParams confirmStripeIntentParams, String str, ContinuationImpl continuationImpl) {
        PaymentLauncherViewModel$confirmIntent$1 paymentLauncherViewModel$confirmIntent$1;
        int i;
        SelfieDirectionFeed_Factory selfieDirectionFeed_Factory = paymentLauncherViewModel.apiRequestOptionsProvider;
        StripeApiRepository stripeApiRepository = paymentLauncherViewModel.stripeApiRepository;
        if (continuationImpl instanceof PaymentLauncherViewModel$confirmIntent$1) {
            paymentLauncherViewModel$confirmIntent$1 = (PaymentLauncherViewModel$confirmIntent$1) continuationImpl;
            int i2 = paymentLauncherViewModel$confirmIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentLauncherViewModel$confirmIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentLauncherViewModel$confirmIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentLauncherViewModel$confirmIntent$1.label;
                if (i == 0) {
                    if (i == 1 || i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                confirmStripeIntentParams.setReturnUrl(str);
                ConfirmStripeIntentParams withShouldUseStripeSdk = confirmStripeIntentParams.withShouldUseStripeSdk();
                boolean z = withShouldUseStripeSdk instanceof ConfirmPaymentIntentParams;
                List list = EXPAND_PAYMENT_METHOD;
                if (z) {
                    ApiRequest.Options options = (ApiRequest.Options) selfieDirectionFeed_Factory.get();
                    paymentLauncherViewModel$confirmIntent$1.label = 1;
                    Object m4034confirmPaymentIntentBWLJW6A = stripeApiRepository.m4034confirmPaymentIntentBWLJW6A((ConfirmPaymentIntentParams) withShouldUseStripeSdk, options, list, paymentLauncherViewModel$confirmIntent$1);
                    if (m4034confirmPaymentIntentBWLJW6A != coroutineSingletons) {
                        return m4034confirmPaymentIntentBWLJW6A;
                    }
                } else {
                    if (!(withShouldUseStripeSdk instanceof ConfirmSetupIntentParams)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiRequest.Options options2 = (ApiRequest.Options) selfieDirectionFeed_Factory.get();
                    paymentLauncherViewModel$confirmIntent$1.label = 2;
                    Object m4036confirmSetupIntentBWLJW6A = stripeApiRepository.m4036confirmSetupIntentBWLJW6A((ConfirmSetupIntentParams) withShouldUseStripeSdk, options2, list, paymentLauncherViewModel$confirmIntent$1);
                    if (m4036confirmSetupIntentBWLJW6A != coroutineSingletons) {
                        return m4036confirmSetupIntentBWLJW6A;
                    }
                }
                return coroutineSingletons;
            }
        }
        paymentLauncherViewModel$confirmIntent$1 = new PaymentLauncherViewModel$confirmIntent$1(paymentLauncherViewModel, continuationImpl);
        Object obj2 = paymentLauncherViewModel$confirmIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentLauncherViewModel$confirmIntent$1.label;
        if (i == 0) {
        }
    }

    public static void postInternalResult$default(PaymentLauncherViewModel paymentLauncherViewModel, InternalPaymentResult internalPaymentResult, StripeIntent stripeIntent, Map map, int i) {
        String str;
        Map map2;
        Map map3;
        PaymentMethod paymentMethod;
        PaymentMethod.Type type2;
        String clientSecret;
        if ((i & 2) != 0) {
            stripeIntent = null;
        }
        if ((i & 4) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        StateFlowImpl stateFlowImpl = paymentLauncherViewModel.internalPaymentResult;
        if (stateFlowImpl.getValue() != null) {
            return;
        }
        Boolean bool = (Boolean) paymentLauncherViewModel.savedStateHandle.get("confirm_action_requested");
        PaymentAnalyticsEvent paymentAnalyticsEvent = bool != null ? bool.booleanValue() : true ? PaymentAnalyticsEvent.PaymentLauncherConfirmFinished : PaymentAnalyticsEvent.PaymentLauncherNextActionFinished;
        if (internalPaymentResult instanceof InternalPaymentResult.Completed) {
            str = "succeeded";
        } else if (internalPaymentResult instanceof InternalPaymentResult.Canceled) {
            str = "canceled";
        } else {
            if (!(internalPaymentResult instanceof InternalPaymentResult.Failed)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            str = "failed";
        }
        Map filterNotNullValues = MapUtilsKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("intent_id", (stripeIntent == null || (clientSecret = stripeIntent.getClientSecret()) == null) ? null : StringsKt.substringBefore(clientSecret, "_secret_", clientSecret)), new Pair("status", str), new Pair("payment_method_type", (stripeIntent == null || (paymentMethod = stripeIntent.getPaymentMethod()) == null || (type2 = paymentMethod.f1440type) == null) ? null : type2.code)));
        if (internalPaymentResult instanceof InternalPaymentResult.Failed) {
            int i2 = StripeException.$r8$clinit;
            map2 = ErrorReporter$Companion.getAdditionalParamsFromStripeException(SpanEvent.Account.create(((InternalPaymentResult.Failed) internalPaymentResult).throwable));
        } else {
            map2 = EmptyMap.INSTANCE;
            map2.getClass();
        }
        Duration m4011endLV8wdWc = ((DefaultDurationProvider) paymentLauncherViewModel.durationProvider).m4011endLV8wdWc(DurationProvider.Key.PaymentLauncher);
        if (m4011endLV8wdWc == null || (map3 = MapsKt__MapsJVMKt.mapOf(new Pair("duration", Long.valueOf(Duration.m4176toLongimpl(m4011endLV8wdWc.rawValue, DurationUnit.SECONDS))))) == null) {
            map3 = EmptyMap.INSTANCE;
            map3.getClass();
        }
        paymentLauncherViewModel.analyticsRequestExecutor.executeAsync(paymentLauncherViewModel.paymentAnalyticsRequestFactory.createRequest(paymentAnalyticsEvent, MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(map, filterNotNullValues), map2), map3)));
        stateFlowImpl.updateState(null, internalPaymentResult);
    }

    public final void handleNextActionForStripeIntent$payments_core_release(String str, ActivityHost activityHost) {
        str.getClass();
        Boolean bool = (Boolean) this.savedStateHandle.get("key_has_started");
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FlowKt__LimitKt$transformWhile$1(this, str, activityHost, null, 4), 3);
    }
}
