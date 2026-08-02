package com.stripe.android.googlepaylauncher;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzr;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeApiRepository;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherViewModel extends ViewModel {
    public final StateFlowImpl _googleResult;
    public final GooglePayPaymentMethodLauncherContractV2.Args args;
    public final GooglePayJsonFactory googlePayJsonFactory;
    public final DefaultGooglePayRepository googlePayRepository;
    public final ReadonlyStateFlow googlePayResult;
    public final PaymentsClient paymentsClient;
    public final ApiRequest.Options requestOptions;
    public final SavedStateHandle savedStateHandle;
    public final StripeApiRepository stripeRepository;

    public GooglePayPaymentMethodLauncherViewModel(PaymentsClient paymentsClient, ApiRequest.Options options, GooglePayPaymentMethodLauncherContractV2.Args args, StripeApiRepository stripeApiRepository, GooglePayJsonFactory googlePayJsonFactory, DefaultGooglePayRepository defaultGooglePayRepository, SavedStateHandle savedStateHandle) {
        paymentsClient.getClass();
        args.getClass();
        googlePayJsonFactory.getClass();
        defaultGooglePayRepository.getClass();
        this.paymentsClient = paymentsClient;
        this.requestOptions = options;
        this.args = args;
        this.stripeRepository = stripeApiRepository;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = defaultGooglePayRepository;
        this.savedStateHandle = savedStateHandle;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
        this._googleResult = MutableStateFlow;
        this.googlePayResult = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentMethod(PaymentData paymentData, ContinuationImpl continuationImpl) {
        GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1 googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1;
        int i;
        Object m4040createPaymentMethod0E7RQCE;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1) {
            googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1 = (GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1) continuationImpl;
            int i2 = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentMethodCreateParams createFromGooglePay = zzx.createFromGooglePay(new JSONObject(paymentData.zzg), this.args.clientAttributionMetadata);
                    googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label = 1;
                    m4040createPaymentMethod0E7RQCE = this.stripeRepository.m4040createPaymentMethod0E7RQCE(createFromGooglePay, this.requestOptions, googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1);
                    if (m4040createPaymentMethod0E7RQCE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4040createPaymentMethod0E7RQCE = ((Result) obj).value;
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4040createPaymentMethod0E7RQCE);
                if (m4120exceptionOrNullimpl != null) {
                    return new GooglePayPaymentMethodLauncher$Result.Completed((PaymentMethod) m4040createPaymentMethod0E7RQCE);
                }
                if (m4120exceptionOrNullimpl instanceof APIConnectionException) {
                    i3 = 3;
                } else if (m4120exceptionOrNullimpl instanceof InvalidRequestException) {
                    i3 = 2;
                }
                return new GooglePayPaymentMethodLauncher$Result.Failed(m4120exceptionOrNullimpl, i3);
            }
        }
        googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1 = new GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1(this, continuationImpl);
        Object obj2 = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4040createPaymentMethod0E7RQCE);
        if (m4120exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPaymentData(ContinuationImpl continuationImpl) {
        GooglePayPaymentMethodLauncherViewModel$loadPaymentData$1 googlePayPaymentMethodLauncherViewModel$loadPaymentData$1;
        Object obj;
        int i;
        GooglePayJsonFactory.TransactionInfo transactionInfo;
        if (continuationImpl instanceof GooglePayPaymentMethodLauncherViewModel$loadPaymentData$1) {
            googlePayPaymentMethodLauncherViewModel$loadPaymentData$1 = (GooglePayPaymentMethodLauncherViewModel$loadPaymentData$1) continuationImpl;
            int i2 = googlePayPaymentMethodLauncherViewModel$loadPaymentData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayPaymentMethodLauncherViewModel$loadPaymentData$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = googlePayPaymentMethodLauncherViewModel$loadPaymentData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayPaymentMethodLauncherViewModel$loadPaymentData$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    googlePayPaymentMethodLauncherViewModel$loadPaymentData$1.label = 1;
                    DefaultGooglePayRepository defaultGooglePayRepository = this.googlePayRepository;
                    defaultGooglePayRepository.getClass();
                    obj = FlowKt.first(new SafeFlow(new WorkerWorkflow$render$1(defaultGooglePayRepository, continuation, 29)), googlePayPaymentMethodLauncherViewModel$loadPaymentData$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    a$$ExternalSyntheticBUOutline0.m$1("Google Pay is unavailable.");
                    return null;
                }
                GooglePayPaymentMethodLauncherContractV2.Args args = this.args;
                args.getClass();
                GooglePayPaymentMethodLauncher$Config googlePayPaymentMethodLauncher$Config = args.config;
                long j = args.amount;
                if ((StringsKt__StringsJVMKt.equals(googlePayPaymentMethodLauncher$Config.merchantCountryCode, Locale.US.getCountry(), true) || StringsKt__StringsJVMKt.equals(googlePayPaymentMethodLauncher$Config.merchantCountryCode, Locale.CANADA.getCountry(), true)) && j == 0) {
                    String str = args.currencyCode;
                    GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus = GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.NotCurrentlyKnown;
                    String str2 = googlePayPaymentMethodLauncher$Config.merchantCountryCode;
                    String str3 = args.transactionId;
                    String str4 = args.label;
                    GooglePayJsonFactory.TransactionInfo.CheckoutOption checkoutOption = GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default;
                    str.getClass();
                    transactionInfo = new GooglePayJsonFactory.TransactionInfo(str, totalPriceStatus, str2, str3, null, str4, checkoutOption);
                } else {
                    transactionInfo = new GooglePayJsonFactory.TransactionInfo(args.currencyCode, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, googlePayPaymentMethodLauncher$Config.merchantCountryCode, args.transactionId, Long.valueOf(j), args.label, GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default);
                }
                String jSONObject = GooglePayJsonFactory.createPaymentDataRequest$payments_core_release$default(this.googlePayJsonFactory, transactionInfo, new GooglePayJsonFactory.MerchantInfo(googlePayPaymentMethodLauncher$Config.merchantName, new GooglePayJsonFactory.SoftwareInfo(args.isElements ? GooglePayJsonFactory.SoftwareInfo.SoftwareId.Elements : GooglePayJsonFactory.SoftwareInfo.SoftwareId.Launcher)), zzj.convert(googlePayPaymentMethodLauncher$Config.billingAddressConfig), googlePayPaymentMethodLauncher$Config.isEmailRequired, Boolean.valueOf(googlePayPaymentMethodLauncher$Config.allowCreditCards)).toString();
                PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
                zzae.checkNotNull(jSONObject, "paymentDataRequestJson cannot be null!");
                paymentDataRequest.zzj = jSONObject;
                zzw loadPaymentData = this.paymentsClient.loadPaymentData(paymentDataRequest);
                loadPaymentData.getClass();
                googlePayPaymentMethodLauncherViewModel$loadPaymentData$1.label = 2;
                Object awaitTask$default = zzr.awaitTask$default(loadPaymentData, googlePayPaymentMethodLauncherViewModel$loadPaymentData$1);
                return awaitTask$default == coroutineSingletons ? coroutineSingletons : awaitTask$default;
            }
        }
        googlePayPaymentMethodLauncherViewModel$loadPaymentData$1 = new GooglePayPaymentMethodLauncherViewModel$loadPaymentData$1(this, continuationImpl);
        obj = googlePayPaymentMethodLauncherViewModel$loadPaymentData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayPaymentMethodLauncherViewModel$loadPaymentData$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
