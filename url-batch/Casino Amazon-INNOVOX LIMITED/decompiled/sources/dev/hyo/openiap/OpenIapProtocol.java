package dev.hyo.openiap;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import dev.hyo.openiap.listener.DeveloperProvidedBillingListener;
import dev.hyo.openiap.listener.OpenIapDeveloperProvidedBillingListener;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener;
import dev.hyo.openiap.listener.OpenIapUserChoiceBillingListener;
import dev.hyo.openiap.listener.UserChoiceBillingListener;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: OpenIapProtocol.kt */
@Metadata(d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010_\u001a\u0002022\b\u0010`\u001a\u0004\u0018\u00010aH&J\u0010\u0010b\u001a\u0002022\u0006\u0010c\u001a\u00020dH&J\u0010\u0010e\u001a\u0002022\u0006\u0010c\u001a\u00020dH&J\u0010\u0010f\u001a\u0002022\u0006\u0010c\u001a\u00020gH&J\u0010\u0010h\u001a\u0002022\u0006\u0010c\u001a\u00020gH&J\u000e\u0010i\u001a\u00020\tH§@¢\u0006\u0002\u0010jJ\u0016\u0010k\u001a\u00020\t2\u0006\u0010`\u001a\u00020aH§@¢\u0006\u0002\u0010lJ\u0010\u0010m\u001a\u0004\u0018\u00010 H§@¢\u0006\u0002\u0010jJ\u0012\u0010n\u001a\u0002022\b\u0010c\u001a\u0004\u0018\u00010oH&J\u0010\u0010p\u001a\u0002022\u0006\u0010c\u001a\u00020qH&J\u0010\u0010r\u001a\u0002022\u0006\u0010c\u001a\u00020qH&J\u0012\u0010s\u001a\u0002022\b\u0010c\u001a\u0004\u0018\u00010tH&J\u0010\u0010u\u001a\u0002022\u0006\u0010c\u001a\u00020vH&J\u0010\u0010w\u001a\u0002022\u0006\u0010c\u001a\u00020vH&J\u0016\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020{H¦@¢\u0006\u0002\u0010|J\u0016\u0010}\u001a\u00020~2\u0006\u0010z\u001a\u00020{H¦@¢\u0006\u0002\u0010|J \u0010\u007f\u001a\u00020\t2\u0006\u0010`\u001a\u00020a2\u0007\u0010\u0014\u001a\u00030\u0080\u0001H¦@¢\u0006\u0003\u0010\u0081\u0001RC\u0010\u0002\u001a3\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR,\u0010\r\u001a\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0002`\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011RA\u0010\u0012\u001a1\b\u0001\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fRI\u0010\u0018\u001a9\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fRO\u0010\u001f\u001a?\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020 \u0018\u00010\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(!\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001b0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\fRI\u0010%\u001a9\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020 \u0018\u00010\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\fRC\u0010(\u001a3\b\u0001\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010*0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\fRk\u0010-\u001a[\b\u0001\u0012&\u0012$0\u001cj\u0011`0¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(/¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(1\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010.j\u0002`3X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105RA\u00106\u001a1\b\u0001\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(7\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`8X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\fRA\u0010:\u001a1\b\u0001\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(7\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\fR,\u0010=\u001a\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0002`>X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0011RC\u0010@\u001a3\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010A¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`BX¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\fRI\u0010D\u001a1\b\u0001\u0012\u0013\u0012\u00110E¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`G8&X§\u0004¢\u0006\f\u0012\u0004\bH\u0010I\u001a\u0004\bJ\u0010\fRA\u0010K\u001a1\b\u0001\u0012\u0013\u0012\u00110E¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`LX¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\fRA\u0010N\u001a1\b\u0001\u0012\u0013\u0012\u00110O¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`QX¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\fR\u0012\u0010S\u001a\u00020TX¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0012\u0010W\u001a\u00020XX¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0012\u0010[\u001a\u00020\\X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006\u0082\u0001À\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/OpenIapProtocol;", "", "initConnection", "Lkotlin/Function2;", "Ldev/hyo/openiap/InitConnectionConfig;", "Lkotlin/ParameterName;", "name", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lkotlin/coroutines/Continuation;", "", "Ldev/hyo/openiap/MutationInitConnectionHandler;", "getInitConnection", "()Lkotlin/jvm/functions/Function2;", "endConnection", "Lkotlin/Function1;", "Ldev/hyo/openiap/MutationEndConnectionHandler;", "getEndConnection", "()Lkotlin/jvm/functions/Function1;", "fetchProducts", "Ldev/hyo/openiap/ProductRequest;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Ldev/hyo/openiap/FetchProductsResult;", "Ldev/hyo/openiap/QueryFetchProductsHandler;", "getFetchProducts", "getAvailablePurchases", "Ldev/hyo/openiap/PurchaseOptions;", "options", "", "Ldev/hyo/openiap/Purchase;", "Ldev/hyo/openiap/QueryGetAvailablePurchasesHandler;", "getGetAvailablePurchases", "getActiveSubscriptions", "", "subscriptionIds", "Ldev/hyo/openiap/ActiveSubscription;", "Ldev/hyo/openiap/QueryGetActiveSubscriptionsHandler;", "getGetActiveSubscriptions", "hasActiveSubscriptions", "Ldev/hyo/openiap/QueryHasActiveSubscriptionsHandler;", "getHasActiveSubscriptions", "requestPurchase", "Ldev/hyo/openiap/RequestPurchaseProps;", "Ldev/hyo/openiap/RequestPurchaseResult;", "Ldev/hyo/openiap/MutationRequestPurchaseHandler;", "getRequestPurchase", "finishTransaction", "Lkotlin/Function3;", "purchase", "Ldev/hyo/openiap/PurchaseInput;", "isConsumable", "", "Ldev/hyo/openiap/MutationFinishTransactionHandler;", "getFinishTransaction", "()Lkotlin/jvm/functions/Function3;", "acknowledgePurchaseAndroid", "purchaseToken", "Ldev/hyo/openiap/MutationAcknowledgePurchaseAndroidHandler;", "getAcknowledgePurchaseAndroid", "consumePurchaseAndroid", "Ldev/hyo/openiap/MutationConsumePurchaseAndroidHandler;", "getConsumePurchaseAndroid", "restorePurchases", "Ldev/hyo/openiap/MutationRestorePurchasesHandler;", "getRestorePurchases", "deepLinkToSubscriptions", "Ldev/hyo/openiap/DeepLinkOptions;", "Ldev/hyo/openiap/MutationDeepLinkToSubscriptionsHandler;", "getDeepLinkToSubscriptions", "validateReceipt", "Ldev/hyo/openiap/VerifyPurchaseProps;", "Ldev/hyo/openiap/VerifyPurchaseResult;", "Ldev/hyo/openiap/MutationValidateReceiptHandler;", "getValidateReceipt$annotations", "()V", "getValidateReceipt", "verifyPurchase", "Ldev/hyo/openiap/MutationVerifyPurchaseHandler;", "getVerifyPurchase", "verifyPurchaseWithProvider", "Ldev/hyo/openiap/VerifyPurchaseWithProviderProps;", "Ldev/hyo/openiap/VerifyPurchaseWithProviderResult;", "Ldev/hyo/openiap/MutationVerifyPurchaseWithProviderHandler;", "getVerifyPurchaseWithProvider", "queryHandlers", "Ldev/hyo/openiap/QueryHandlers;", "getQueryHandlers", "()Ldev/hyo/openiap/QueryHandlers;", "mutationHandlers", "Ldev/hyo/openiap/MutationHandlers;", "getMutationHandlers", "()Ldev/hyo/openiap/MutationHandlers;", "subscriptionHandlers", "Ldev/hyo/openiap/SubscriptionHandlers;", "getSubscriptionHandlers", "()Ldev/hyo/openiap/SubscriptionHandlers;", "setActivity", "activity", "Landroid/app/Activity;", "addPurchaseUpdateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ldev/hyo/openiap/listener/OpenIapPurchaseUpdateListener;", "removePurchaseUpdateListener", "addPurchaseErrorListener", "Ldev/hyo/openiap/listener/OpenIapPurchaseErrorListener;", "removePurchaseErrorListener", "checkAlternativeBillingAvailability", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAlternativeBillingInformationDialog", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAlternativeBillingReportingToken", "setUserChoiceBillingListener", "Ldev/hyo/openiap/listener/UserChoiceBillingListener;", "addUserChoiceBillingListener", "Ldev/hyo/openiap/listener/OpenIapUserChoiceBillingListener;", "removeUserChoiceBillingListener", "setDeveloperProvidedBillingListener", "Ldev/hyo/openiap/listener/DeveloperProvidedBillingListener;", "addDeveloperProvidedBillingListener", "Ldev/hyo/openiap/listener/OpenIapDeveloperProvidedBillingListener;", "removeDeveloperProvidedBillingListener", "isBillingProgramAvailable", "Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid;", "program", "Ldev/hyo/openiap/BillingProgramAndroid;", "(Ldev/hyo/openiap/BillingProgramAndroid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBillingProgramReportingDetails", "Ldev/hyo/openiap/BillingProgramReportingDetailsAndroid;", "launchExternalLink", "Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;", "(Landroid/app/Activity;Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OpenIapProtocol {

    /* compiled from: OpenIapProtocol.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(message = "Use verifyPurchase")
        public static /* synthetic */ void getValidateReceipt$annotations() {
        }
    }

    void addDeveloperProvidedBillingListener(OpenIapDeveloperProvidedBillingListener listener);

    void addPurchaseErrorListener(OpenIapPurchaseErrorListener listener);

    void addPurchaseUpdateListener(OpenIapPurchaseUpdateListener listener);

    void addUserChoiceBillingListener(OpenIapUserChoiceBillingListener listener);

    @Deprecated(message = "Use isBillingProgramAvailable with BillingProgramAndroid.ExternalOffer instead")
    Object checkAlternativeBillingAvailability(Continuation<? super Boolean> continuation);

    @Deprecated(message = "Use createBillingProgramReportingDetails with BillingProgramAndroid.ExternalOffer instead")
    Object createAlternativeBillingReportingToken(Continuation<? super String> continuation);

    Object createBillingProgramReportingDetails(BillingProgramAndroid billingProgramAndroid, Continuation<? super BillingProgramReportingDetailsAndroid> continuation);

    Function2<String, Continuation<? super Boolean>, Object> getAcknowledgePurchaseAndroid();

    Function2<String, Continuation<? super Boolean>, Object> getConsumePurchaseAndroid();

    Function2<DeepLinkOptions, Continuation<? super Unit>, Object> getDeepLinkToSubscriptions();

    Function1<Continuation<? super Boolean>, Object> getEndConnection();

    Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> getFetchProducts();

    Function3<Purchase, Boolean, Continuation<? super Unit>, Object> getFinishTransaction();

    Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> getGetActiveSubscriptions();

    Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getGetAvailablePurchases();

    Function2<List<String>, Continuation<? super Boolean>, Object> getHasActiveSubscriptions();

    Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> getInitConnection();

    MutationHandlers getMutationHandlers();

    QueryHandlers getQueryHandlers();

    Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> getRequestPurchase();

    Function1<Continuation<? super Unit>, Object> getRestorePurchases();

    SubscriptionHandlers getSubscriptionHandlers();

    Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> getValidateReceipt();

    Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> getVerifyPurchase();

    Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> getVerifyPurchaseWithProvider();

    Object isBillingProgramAvailable(BillingProgramAndroid billingProgramAndroid, Continuation<? super BillingProgramAvailabilityResultAndroid> continuation);

    Object launchExternalLink(Activity activity, LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid, Continuation<? super Boolean> continuation);

    void removeDeveloperProvidedBillingListener(OpenIapDeveloperProvidedBillingListener listener);

    void removePurchaseErrorListener(OpenIapPurchaseErrorListener listener);

    void removePurchaseUpdateListener(OpenIapPurchaseUpdateListener listener);

    void removeUserChoiceBillingListener(OpenIapUserChoiceBillingListener listener);

    void setActivity(Activity activity);

    void setDeveloperProvidedBillingListener(DeveloperProvidedBillingListener listener);

    void setUserChoiceBillingListener(UserChoiceBillingListener listener);

    @Deprecated(message = "Use launchExternalLink instead")
    Object showAlternativeBillingInformationDialog(Activity activity, Continuation<? super Boolean> continuation);
}
