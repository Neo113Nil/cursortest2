package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.model.SpanEvent;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.common.zzr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet$WalletOptions;
import com.google.android.gms.wallet.zzk;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt$$ExternalSyntheticLambda0;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.DefaultCardFundingFilter;
import com.stripe.android.GooglePayConfig;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.RequestSurface;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import dagger.internal.Preconditions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.InputTracker$listener$1$1$2$trigger$1;

/* loaded from: classes8.dex */
public final class GooglePayLauncherViewModel extends ViewModel {
    public final SharedFlowImpl _googlePayLaunchTask;
    public final SharedFlowImpl _googleResult;
    public final GooglePayLauncherContract.Args args;
    public final RealErrorReporter errorReporter;
    public final GooglePayJsonFactory googlePayJsonFactory;
    public final ReadonlySharedFlow googlePayLaunchTask;
    public final DefaultGooglePayRepository googlePayRepository;
    public final ReadonlySharedFlow googlePayResult;
    public final StripePaymentController paymentController;
    public final PaymentsClient paymentsClient;
    public final ApiRequest.Options requestOptions;
    public final SavedStateHandle savedStateHandle;
    public final StripeApiRepository stripeRepository;
    public final CoroutineContext workContext;

    public final class Factory implements ViewModelProvider$Factory {
        public final GooglePayLauncherContract.Args args;
        public final CoroutineContext workContext;

        public Factory(GooglePayLauncherContract.Args args) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
            args.getClass();
            defaultIoScheduler.getClass();
            this.args = args;
            this.workContext = defaultIoScheduler;
        }

        @Override // androidx.lifecycle.ViewModelProvider$Factory
        public final ViewModel create(Class cls, CreationExtras creationExtras) {
            GooglePayJsonFactory.BillingAddressParameters.Format format2;
            creationExtras.getClass();
            Application requireApplication = CreationExtrasKtxKt.requireApplication(creationExtras);
            GooglePayLauncherContract.Args args = this.args;
            GooglePayEnvironment googlePayEnvironment = args.getConfig$payments_core_release().environment;
            PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
            if (paymentConfiguration == null) {
                SharedPreferences sharedPreferences = new PaymentConfiguration.Store(requireApplication).prefs;
                String string2 = sharedPreferences.getString("key_publishable_key", null);
                paymentConfiguration = string2 != null ? new PaymentConfiguration(string2, sharedPreferences.getString("key_account_id", null)) : null;
                if (paymentConfiguration == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    return null;
                }
                PaymentConfiguration.instance = paymentConfiguration;
            }
            String str = paymentConfiguration.publishableKey;
            String str2 = paymentConfiguration.stripeAccountId;
            Set of = SetsKt__SetsJVMKt.setOf("GooglePayLauncher");
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(requireApplication, str, of);
            PromotionsTitleBarKt$$ExternalSyntheticLambda0 promotionsTitleBarKt$$ExternalSyntheticLambda0 = new PromotionsTitleBarKt$$ExternalSyntheticLambda0(str, 1);
            StripeRepository.Companion.getClass();
            RequestSurface requestSurface = StripeRepository.Companion.DEFAULT_REQUEST_SURFACE;
            Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = Logger$Companion.NOOP_LOGGER;
            StripeApiRepository stripeApiRepository = new StripeApiRepository(requireApplication, promotionsTitleBarKt$$ExternalSyntheticLambda0, requestSurface, logger$Companion$NOOP_LOGGER$1, this.workContext, of, null, paymentAnalyticsRequestFactory, 63368);
            Context applicationContext = requireApplication.getApplicationContext();
            applicationContext.getClass();
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
            Preconditions.checkNotNullFromProvides(defaultIoScheduler);
            RealErrorReporter realErrorReporter = new RealErrorReporter(new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, defaultIoScheduler), new PaymentAnalyticsRequestFactory(applicationContext, new CameraX$$ExternalSyntheticLambda0(applicationContext, 14), of));
            GooglePayEnvironment googlePayEnvironment2 = args.getConfig$payments_core_release().environment;
            GooglePayLauncher$BillingAddressConfig googlePayLauncher$BillingAddressConfig = args.getConfig$payments_core_release().billingAddressConfig;
            googlePayLauncher$BillingAddressConfig.getClass();
            boolean z = googlePayLauncher$BillingAddressConfig.isRequired;
            int ordinal = googlePayLauncher$BillingAddressConfig.f1435format.ordinal();
            if (ordinal == 0) {
                format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
            }
            GooglePayJsonFactory.BillingAddressParameters billingAddressParameters = new GooglePayJsonFactory.BillingAddressParameters(z, format2, googlePayLauncher$BillingAddressConfig.isPhoneNumberRequired);
            boolean z2 = args.getConfig$payments_core_release().existingPaymentMethodRequired;
            boolean z3 = args.getConfig$payments_core_release().allowCreditCards;
            DefaultPaymentsClientFactory defaultPaymentsClientFactory = new DefaultPaymentsClientFactory(requireApplication);
            EmptyList emptyList = EmptyList.INSTANCE;
            DefaultCardBrandFilter defaultCardBrandFilter = DefaultCardBrandFilter.INSTANCE;
            DefaultCardFundingFilter defaultCardFundingFilter = DefaultCardFundingFilter.INSTANCE;
            DefaultGooglePayRepository defaultGooglePayRepository = new DefaultGooglePayRepository(requireApplication, googlePayEnvironment2, billingAddressParameters, z2, z3, defaultPaymentsClientFactory, realErrorReporter, logger$Companion$NOOP_LOGGER$1, defaultCardBrandFilter, defaultCardFundingFilter, emptyList);
            googlePayEnvironment.getClass();
            InputTracker$listener$1$1$2$trigger$1 inputTracker$listener$1$1$2$trigger$1 = new InputTracker$listener$1$1$2$trigger$1();
            inputTracker$listener$1$1$2$trigger$1.setEnvironment(googlePayEnvironment.value);
            PaymentsClient paymentsClient = new PaymentsClient(requireApplication, null, zzk.API, new Wallet$WalletOptions(inputTracker$listener$1$1$2$trigger$1), GoogleApi.Settings.DEFAULT_SETTINGS);
            ApiRequest.Options options = new ApiRequest.Options(str, str2, 4);
            StripePaymentController stripePaymentController = new StripePaymentController(requireApplication, new PromotionsTitleBarKt$$ExternalSyntheticLambda0(str, 1), stripeApiRepository, this.workContext);
            GooglePayConfig googlePayConfig = new GooglePayConfig(str, str2);
            boolean equals = StringsKt__StringsJVMKt.equals(args.getConfig$payments_core_release().merchantCountryCode, Locale.JAPAN.getCountry(), true);
            List list = args.getConfig$payments_core_release().additionalEnabledNetworks;
            list.getClass();
            return new GooglePayLauncherViewModel(paymentsClient, options, this.args, stripeApiRepository, stripePaymentController, new GooglePayJsonFactory(googlePayConfig, equals, list, defaultCardBrandFilter, defaultCardFundingFilter), defaultGooglePayRepository, SavedStateHandleSupport.createSavedStateHandle(creationExtras), realErrorReporter, this.workContext);
        }
    }

    public GooglePayLauncherViewModel(PaymentsClient paymentsClient, ApiRequest.Options options, GooglePayLauncherContract.Args args, StripeApiRepository stripeApiRepository, StripePaymentController stripePaymentController, GooglePayJsonFactory googlePayJsonFactory, DefaultGooglePayRepository defaultGooglePayRepository, SavedStateHandle savedStateHandle, RealErrorReporter realErrorReporter, CoroutineContext coroutineContext) {
        args.getClass();
        coroutineContext.getClass();
        this.paymentsClient = paymentsClient;
        this.requestOptions = options;
        this.args = args;
        this.stripeRepository = stripeApiRepository;
        this.paymentController = stripePaymentController;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = defaultGooglePayRepository;
        this.savedStateHandle = savedStateHandle;
        this.errorReporter = realErrorReporter;
        this.workContext = coroutineContext;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        this._googleResult = MutableSharedFlow$default;
        this.googlePayResult = FlowKt.asSharedFlow(MutableSharedFlow$default);
        SharedFlowImpl MutableSharedFlow$default2 = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        this._googlePayLaunchTask = MutableSharedFlow$default2;
        this.googlePayLaunchTask = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), coroutineContext, null, new HazeSourceNode$launchPreDraw$1(this, null, 3), 2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(7:19|20|(3:27|28|29)|22|(3:24|(1:26)|13)|14|15))(1:33))(3:45|46|(2:48|49))|34|(9:36|37|(2:39|(1:41))(1:42)|20|(0)|22|(0)|14|15)(2:43|44)))|52|6|7|(0)(0)|34|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0041, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0078, code lost:
    
        r2 = kotlin.Result.Companion;
        r8 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:33:0x003d, B:34:0x0063, B:36:0x006b, B:43:0x0070, B:44:0x0077, B:46:0x0046), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:33:0x003d, B:34:0x0063, B:36:0x006b, B:43:0x0070, B:44:0x0077, B:46:0x0046), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: access$resolveLoadPaymentDataTask-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4022access$resolveLoadPaymentDataTaskIoAF18A(GooglePayLauncherViewModel googlePayLauncherViewModel, ContinuationImpl continuationImpl) {
        GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1 googlePayLauncherViewModel$resolveLoadPaymentDataTask$1;
        Object obj;
        int i;
        Object failure;
        if (continuationImpl instanceof GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1) {
            googlePayLauncherViewModel$resolveLoadPaymentDataTask$1 = (GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1) continuationImpl;
            int i2 = googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label = 1;
                    DefaultGooglePayRepository defaultGooglePayRepository = googlePayLauncherViewModel.googlePayRepository;
                    defaultGooglePayRepository.getClass();
                    obj = FlowKt.first(new SafeFlow(new WorkerWorkflow$render$1(defaultGooglePayRepository, continuation, 29)), googlePayLauncherViewModel$resolveLoadPaymentDataTask$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            failure = (Task) obj;
                            Result.Companion companion2 = Result.Companion;
                            return failure;
                        }
                        SafeTrace.throwOnFailure(obj);
                        failure = ((Result) obj).value;
                        Result.Companion companion3 = Result.Companion;
                        if (!(failure instanceof Result.Failure)) {
                            try {
                                String str = (String) failure;
                                PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
                                zzae.checkNotNull(str, "paymentDataRequestJson cannot be null!");
                                paymentDataRequest.zzj = str;
                                failure = paymentDataRequest;
                            } catch (Throwable th) {
                                Result.Companion companion4 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                        }
                        if (!(failure instanceof Result.Failure)) {
                            zzw loadPaymentData = googlePayLauncherViewModel.paymentsClient.loadPaymentData((PaymentDataRequest) failure);
                            loadPaymentData.getClass();
                            googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label = 3;
                            obj = zzr.awaitTask$default(loadPaymentData, googlePayLauncherViewModel$resolveLoadPaymentDataTask$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                            failure = (Task) obj;
                            Result.Companion companion22 = Result.Companion;
                        }
                        return failure;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new IllegalStateException("Google Pay is unavailable.");
                }
                Object failure2 = Unit.INSTANCE;
                Result.Companion companion5 = Result.Companion;
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                if (m4120exceptionOrNullimpl == null) {
                    GooglePayLauncherContract.Args args = googlePayLauncherViewModel.args;
                    googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label = 2;
                    failure = googlePayLauncherViewModel.m4023createPaymentDataRequestgIAlus(args, googlePayLauncherViewModel$resolveLoadPaymentDataTask$1);
                    if (failure == obj2) {
                        return obj2;
                    }
                } else {
                    failure = new Result.Failure(m4120exceptionOrNullimpl);
                }
                Result.Companion companion32 = Result.Companion;
                if (!(failure instanceof Result.Failure)) {
                }
                if (!(failure instanceof Result.Failure)) {
                }
                return failure;
            }
        }
        googlePayLauncherViewModel$resolveLoadPaymentDataTask$1 = new GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1(googlePayLauncherViewModel, continuationImpl);
        obj = googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        if (r14 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r14 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: createPaymentDataRequest-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4023createPaymentDataRequestgIAlus(GooglePayLauncherContract.Args args, ContinuationImpl continuationImpl) {
        GooglePayLauncherViewModel$createPaymentDataRequest$1 googlePayLauncherViewModel$createPaymentDataRequest$1;
        int i;
        Object m4048retrieveSetupIntentBWLJW6A;
        GooglePayJsonFactory.BillingAddressParameters.Format format2;
        if (continuationImpl instanceof GooglePayLauncherViewModel$createPaymentDataRequest$1) {
            googlePayLauncherViewModel$createPaymentDataRequest$1 = (GooglePayLauncherViewModel$createPaymentDataRequest$1) continuationImpl;
            int i2 = googlePayLauncherViewModel$createPaymentDataRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayLauncherViewModel$createPaymentDataRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = googlePayLauncherViewModel$createPaymentDataRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayLauncherViewModel$createPaymentDataRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z = args instanceof GooglePayLauncherContract.PaymentIntentArgs;
                    ApiRequest.Options options = this.requestOptions;
                    StripeApiRepository stripeApiRepository = this.stripeRepository;
                    if (z) {
                        String str = ((GooglePayLauncherContract.PaymentIntentArgs) args).clientSecret;
                        googlePayLauncherViewModel$createPaymentDataRequest$1.L$0 = args;
                        googlePayLauncherViewModel$createPaymentDataRequest$1.label = 1;
                        StripeRepository.Companion companion = StripeRepository.Companion;
                        m4048retrieveSetupIntentBWLJW6A = stripeApiRepository.m4047retrievePaymentIntentBWLJW6A(str, options, EmptyList.INSTANCE, googlePayLauncherViewModel$createPaymentDataRequest$1);
                    } else {
                        if (!(args instanceof GooglePayLauncherContract.SetupIntentArgs)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str2 = ((GooglePayLauncherContract.SetupIntentArgs) args).clientSecret;
                        googlePayLauncherViewModel$createPaymentDataRequest$1.L$0 = args;
                        googlePayLauncherViewModel$createPaymentDataRequest$1.label = 2;
                        StripeRepository.Companion companion2 = StripeRepository.Companion;
                        m4048retrieveSetupIntentBWLJW6A = stripeApiRepository.m4048retrieveSetupIntentBWLJW6A(str2, options, EmptyList.INSTANCE, googlePayLauncherViewModel$createPaymentDataRequest$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    args = googlePayLauncherViewModel$createPaymentDataRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    m4048retrieveSetupIntentBWLJW6A = ((Result) obj).value;
                    Result.Companion companion3 = Result.Companion;
                    if (!(m4048retrieveSetupIntentBWLJW6A instanceof Result.Failure)) {
                        PaymentIntent paymentIntent = (PaymentIntent) m4048retrieveSetupIntentBWLJW6A;
                        String str3 = paymentIntent.currency;
                        if (str3 == null) {
                            str3 = "";
                        }
                        m4048retrieveSetupIntentBWLJW6A = createTransactionInfo$payments_core_release(paymentIntent, str3, null, ((GooglePayLauncherContract.PaymentIntentArgs) args).label);
                    }
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    args = googlePayLauncherViewModel$createPaymentDataRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    m4048retrieveSetupIntentBWLJW6A = ((Result) obj).value;
                    Result.Companion companion4 = Result.Companion;
                    if (!(m4048retrieveSetupIntentBWLJW6A instanceof Result.Failure)) {
                        GooglePayLauncherContract.SetupIntentArgs setupIntentArgs = (GooglePayLauncherContract.SetupIntentArgs) args;
                        m4048retrieveSetupIntentBWLJW6A = createTransactionInfo$payments_core_release((SetupIntent) m4048retrieveSetupIntentBWLJW6A, setupIntentArgs.currencyCode, setupIntentArgs.amount, setupIntentArgs.label);
                    }
                }
                if (!(m4048retrieveSetupIntentBWLJW6A instanceof Result.Failure)) {
                    return m4048retrieveSetupIntentBWLJW6A;
                }
                GooglePayJsonFactory.TransactionInfo transactionInfo = (GooglePayJsonFactory.TransactionInfo) m4048retrieveSetupIntentBWLJW6A;
                GooglePayJsonFactory.MerchantInfo merchantInfo = new GooglePayJsonFactory.MerchantInfo(args.getConfig$payments_core_release().merchantName, new GooglePayJsonFactory.SoftwareInfo(GooglePayJsonFactory.SoftwareInfo.SoftwareId.Launcher));
                boolean z2 = args.getConfig$payments_core_release().billingAddressConfig.isRequired;
                int ordinal = args.getConfig$payments_core_release().billingAddressConfig.f1435format.ordinal();
                if (ordinal == 0) {
                    format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
                }
                return GooglePayJsonFactory.createPaymentDataRequest$payments_core_release$default(this.googlePayJsonFactory, transactionInfo, merchantInfo, new GooglePayJsonFactory.BillingAddressParameters(z2, format2, args.getConfig$payments_core_release().billingAddressConfig.isPhoneNumberRequired), args.getConfig$payments_core_release().isEmailRequired, Boolean.valueOf(args.getConfig$payments_core_release().allowCreditCards)).toString();
            }
        }
        googlePayLauncherViewModel$createPaymentDataRequest$1 = new GooglePayLauncherViewModel$createPaymentDataRequest$1(this, continuationImpl);
        Object obj2 = googlePayLauncherViewModel$createPaymentDataRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayLauncherViewModel$createPaymentDataRequest$1.label;
        if (i != 0) {
        }
        if (!(m4048retrieveSetupIntentBWLJW6A instanceof Result.Failure)) {
        }
    }

    public final GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release(StripeIntent stripeIntent, String str, Long l, String str2) {
        stripeIntent.getClass();
        str.getClass();
        boolean z = stripeIntent instanceof PaymentIntent;
        GooglePayLauncherContract.Args args = this.args;
        if (z) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            return new GooglePayJsonFactory.TransactionInfo(str, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Final, args.getConfig$payments_core_release().merchantCountryCode, paymentIntent.id, paymentIntent.amount, null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.CompleteImmediatePurchase);
        }
        if (stripeIntent instanceof SetupIntent) {
            return new GooglePayJsonFactory.TransactionInfo(str, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, args.getConfig$payments_core_release().merchantCountryCode, ((SetupIntent) stripeIntent).id, Long.valueOf(l != null ? l.longValue() : 0L), str2, GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r5 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r5 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getResultFromConfirmation$payments_core_release(int i, Intent intent, ContinuationImpl continuationImpl) {
        GooglePayLauncherViewModel$getResultFromConfirmation$1 googlePayLauncherViewModel$getResultFromConfirmation$1;
        int i2;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof GooglePayLauncherViewModel$getResultFromConfirmation$1) {
            googlePayLauncherViewModel$getResultFromConfirmation$1 = (GooglePayLauncherViewModel$getResultFromConfirmation$1) continuationImpl;
            int i3 = googlePayLauncherViewModel$getResultFromConfirmation$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayLauncherViewModel$getResultFromConfirmation$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = googlePayLauncherViewModel$getResultFromConfirmation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = googlePayLauncherViewModel$getResultFromConfirmation$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StripePaymentController stripePaymentController = this.paymentController;
                    stripePaymentController.getClass();
                    if (i == 50000 && intent != null) {
                        googlePayLauncherViewModel$getResultFromConfirmation$1.label = 1;
                        failure = stripePaymentController.m4008getPaymentIntentResultgIAlus(intent, googlePayLauncherViewModel$getResultFromConfirmation$1);
                    } else if (i != 50001 || intent == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("Unexpected confirmation result.");
                        ErrorReporter$UnexpectedErrorEvent errorReporter$UnexpectedErrorEvent = ErrorReporter$UnexpectedErrorEvent.GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT;
                        int i4 = StripeException.$r8$clinit;
                        this.errorReporter.report(errorReporter$UnexpectedErrorEvent, SpanEvent.Account.create(illegalStateException), MapsKt__MapsJVMKt.mapOf(new Pair("request_code", String.valueOf(i))));
                        Result.Companion companion = Result.Companion;
                        failure = new Result.Failure(illegalStateException);
                    } else {
                        googlePayLauncherViewModel$getResultFromConfirmation$1.label = 2;
                        failure = stripePaymentController.m4009getSetupIntentResultgIAlus(intent, googlePayLauncherViewModel$getResultFromConfirmation$1);
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    failure = ((Result) obj).value;
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl == null) {
                    return new GooglePayLauncher$Result.Failed(m4120exceptionOrNullimpl);
                }
                return GooglePayLauncher$Result.Completed.INSTANCE;
            }
        }
        googlePayLauncherViewModel$getResultFromConfirmation$1 = new GooglePayLauncherViewModel$getResultFromConfirmation$1(this, continuationImpl);
        Object obj2 = googlePayLauncherViewModel$getResultFromConfirmation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = googlePayLauncherViewModel$getResultFromConfirmation$1.label;
        if (i2 != 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl == null) {
        }
    }
}
