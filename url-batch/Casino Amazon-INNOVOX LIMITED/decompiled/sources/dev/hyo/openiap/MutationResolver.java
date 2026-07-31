package dev.hyo.openiap;

import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H¦@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ&\u0010\u0019\u001a\u00020\u00142\n\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H¦@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012J\u0016\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H¦@¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010-\u001a\u00020.H¦@¢\u0006\u0002\u0010\nJ\u0018\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010&\u001a\u000201H¦@¢\u0006\u0002\u00102J\u000e\u00103\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u000e\u00104\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\nJ\u000e\u00105\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H¦@¢\u0006\u0002\u0010:J\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H¦@¢\u0006\u0002\u0010\nJ\u000e\u0010>\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u0016\u0010?\u001a\u00020@2\u0006\u0010\u0015\u001a\u00020AH¦@¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020@2\u0006\u0010\u0015\u001a\u00020AH¦@¢\u0006\u0002\u0010BJ\u0016\u0010D\u001a\u00020E2\u0006\u0010\u0015\u001a\u00020FH¦@¢\u0006\u0002\u0010G¨\u0006HÀ\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/MutationResolver;", "", "acknowledgePurchaseAndroid", "", "purchaseToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beginRefundRequestIOS", "sku", "checkAlternativeBillingAvailabilityAndroid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearTransactionIOS", "consumePurchaseAndroid", "createAlternativeBillingTokenAndroid", "createBillingProgramReportingDetailsAndroid", "Ldev/hyo/openiap/BillingProgramReportingDetailsAndroid;", "program", "Ldev/hyo/openiap/BillingProgramAndroid;", "(Ldev/hyo/openiap/BillingProgramAndroid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deepLinkToSubscriptions", "", "options", "Ldev/hyo/openiap/DeepLinkOptions;", "(Ldev/hyo/openiap/DeepLinkOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endConnection", "finishTransaction", "purchase", "Ldev/hyo/openiap/Purchase;", "Ldev/hyo/openiap/PurchaseInput;", "isConsumable", "(Ldev/hyo/openiap/Purchase;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initConnection", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Ldev/hyo/openiap/InitConnectionConfig;", "(Ldev/hyo/openiap/InitConnectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBillingProgramAvailableAndroid", "Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid;", "launchExternalLinkAndroid", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;", "(Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentCodeRedemptionSheetIOS", "presentExternalPurchaseLinkIOS", "Ldev/hyo/openiap/ExternalPurchaseLinkResultIOS;", ImagesContract.URL, "presentExternalPurchaseNoticeSheetIOS", "Ldev/hyo/openiap/ExternalPurchaseNoticeResultIOS;", "requestPurchase", "Ldev/hyo/openiap/RequestPurchaseResult;", "Ldev/hyo/openiap/RequestPurchaseProps;", "(Ldev/hyo/openiap/RequestPurchaseProps;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPurchaseOnPromotedProductIOS", "restorePurchases", "showAlternativeBillingDialogAndroid", "showExternalPurchaseCustomLinkNoticeIOS", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeResultIOS;", "noticeType", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeTypeIOS;", "(Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeTypeIOS;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showManageSubscriptionsIOS", "", "Ldev/hyo/openiap/PurchaseIOS;", "syncIOS", "validateReceipt", "Ldev/hyo/openiap/VerifyPurchaseResult;", "Ldev/hyo/openiap/VerifyPurchaseProps;", "(Ldev/hyo/openiap/VerifyPurchaseProps;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyPurchase", "verifyPurchaseWithProvider", "Ldev/hyo/openiap/VerifyPurchaseWithProviderResult;", "Ldev/hyo/openiap/VerifyPurchaseWithProviderProps;", "(Ldev/hyo/openiap/VerifyPurchaseWithProviderProps;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MutationResolver {
    Object acknowledgePurchaseAndroid(String str, Continuation<? super Boolean> continuation);

    Object beginRefundRequestIOS(String str, Continuation<? super String> continuation);

    Object checkAlternativeBillingAvailabilityAndroid(Continuation<? super Boolean> continuation);

    Object clearTransactionIOS(Continuation<? super Boolean> continuation);

    Object consumePurchaseAndroid(String str, Continuation<? super Boolean> continuation);

    Object createAlternativeBillingTokenAndroid(Continuation<? super String> continuation);

    Object createBillingProgramReportingDetailsAndroid(BillingProgramAndroid billingProgramAndroid, Continuation<? super BillingProgramReportingDetailsAndroid> continuation);

    Object deepLinkToSubscriptions(DeepLinkOptions deepLinkOptions, Continuation<? super Unit> continuation);

    Object endConnection(Continuation<? super Boolean> continuation);

    Object finishTransaction(Purchase purchase, Boolean bool, Continuation<? super Unit> continuation);

    Object initConnection(InitConnectionConfig initConnectionConfig, Continuation<? super Boolean> continuation);

    Object isBillingProgramAvailableAndroid(BillingProgramAndroid billingProgramAndroid, Continuation<? super BillingProgramAvailabilityResultAndroid> continuation);

    Object launchExternalLinkAndroid(LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid, Continuation<? super Boolean> continuation);

    Object presentCodeRedemptionSheetIOS(Continuation<? super Boolean> continuation);

    Object presentExternalPurchaseLinkIOS(String str, Continuation<? super ExternalPurchaseLinkResultIOS> continuation);

    Object presentExternalPurchaseNoticeSheetIOS(Continuation<? super ExternalPurchaseNoticeResultIOS> continuation);

    Object requestPurchase(RequestPurchaseProps requestPurchaseProps, Continuation<? super RequestPurchaseResult> continuation);

    Object requestPurchaseOnPromotedProductIOS(Continuation<? super Boolean> continuation);

    Object restorePurchases(Continuation<? super Unit> continuation);

    Object showAlternativeBillingDialogAndroid(Continuation<? super Boolean> continuation);

    Object showExternalPurchaseCustomLinkNoticeIOS(ExternalPurchaseCustomLinkNoticeTypeIOS externalPurchaseCustomLinkNoticeTypeIOS, Continuation<? super ExternalPurchaseCustomLinkNoticeResultIOS> continuation);

    Object showManageSubscriptionsIOS(Continuation<? super List<PurchaseIOS>> continuation);

    Object syncIOS(Continuation<? super Boolean> continuation);

    Object validateReceipt(VerifyPurchaseProps verifyPurchaseProps, Continuation<? super VerifyPurchaseResult> continuation);

    Object verifyPurchase(VerifyPurchaseProps verifyPurchaseProps, Continuation<? super VerifyPurchaseResult> continuation);

    Object verifyPurchaseWithProvider(VerifyPurchaseWithProviderProps verifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult> continuation);

    /* compiled from: Types.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object deepLinkToSubscriptions$default(MutationResolver mutationResolver, DeepLinkOptions deepLinkOptions, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deepLinkToSubscriptions");
        }
        if ((i & 1) != 0) {
            deepLinkOptions = null;
        }
        return mutationResolver.deepLinkToSubscriptions(deepLinkOptions, continuation);
    }

    static /* synthetic */ Object finishTransaction$default(MutationResolver mutationResolver, Purchase purchase, Boolean bool, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishTransaction");
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return mutationResolver.finishTransaction(purchase, bool, continuation);
    }

    static /* synthetic */ Object initConnection$default(MutationResolver mutationResolver, InitConnectionConfig initConnectionConfig, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initConnection");
        }
        if ((i & 1) != 0) {
            initConnectionConfig = null;
        }
        return mutationResolver.initConnection(initConnectionConfig, continuation);
    }
}
