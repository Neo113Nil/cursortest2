package dev.hyo.openiap;

import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010H¦@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015H¦@¢\u0006\u0002\u0010\u0004J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH¦@¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u0004\u0018\u00010\"H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010$\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010%\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0004J\u0018\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ \u0010'\u001a\u00020\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010H¦@¢\u0006\u0002\u0010\u0013J\u000e\u0010(\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0016\u0010+\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0018\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00102\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0016\u0010/\u001a\u0002002\u0006\u0010\u0018\u001a\u000201H¦@¢\u0006\u0002\u00102¨\u00063À\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/QueryResolver;", "", "canPresentExternalPurchaseNoticeIOS", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentEntitlementIOS", "Ldev/hyo/openiap/PurchaseIOS;", "sku", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProducts", "Ldev/hyo/openiap/FetchProductsResult;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Ldev/hyo/openiap/ProductRequest;", "(Ldev/hyo/openiap/ProductRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveSubscriptions", "", "Ldev/hyo/openiap/ActiveSubscription;", "subscriptionIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppTransactionIOS", "Ldev/hyo/openiap/AppTransaction;", "getAvailablePurchases", "Ldev/hyo/openiap/Purchase;", "options", "Ldev/hyo/openiap/PurchaseOptions;", "(Ldev/hyo/openiap/PurchaseOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExternalPurchaseCustomLinkTokenIOS", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenResultIOS;", "tokenType", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenTypeIOS;", "(Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenTypeIOS;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPendingTransactionsIOS", "getPromotedProductIOS", "Ldev/hyo/openiap/ProductIOS;", "getReceiptDataIOS", "getStorefront", "getStorefrontIOS", "getTransactionJwsIOS", "hasActiveSubscriptions", "isEligibleForExternalPurchaseCustomLinkIOS", "isEligibleForIntroOfferIOS", "groupID", "isTransactionVerifiedIOS", "latestTransactionIOS", "subscriptionStatusIOS", "Ldev/hyo/openiap/SubscriptionStatusIOS;", "validateReceiptIOS", "Ldev/hyo/openiap/VerifyPurchaseResultIOS;", "Ldev/hyo/openiap/VerifyPurchaseProps;", "(Ldev/hyo/openiap/VerifyPurchaseProps;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface QueryResolver {
    Object canPresentExternalPurchaseNoticeIOS(Continuation<? super Boolean> continuation);

    Object currentEntitlementIOS(String str, Continuation<? super PurchaseIOS> continuation);

    Object fetchProducts(ProductRequest productRequest, Continuation<? super FetchProductsResult> continuation);

    Object getActiveSubscriptions(List<String> list, Continuation<? super List<ActiveSubscription>> continuation);

    Object getAppTransactionIOS(Continuation<? super AppTransaction> continuation);

    Object getAvailablePurchases(PurchaseOptions purchaseOptions, Continuation<? super List<? extends Purchase>> continuation);

    Object getExternalPurchaseCustomLinkTokenIOS(ExternalPurchaseCustomLinkTokenTypeIOS externalPurchaseCustomLinkTokenTypeIOS, Continuation<? super ExternalPurchaseCustomLinkTokenResultIOS> continuation);

    Object getPendingTransactionsIOS(Continuation<? super List<PurchaseIOS>> continuation);

    Object getPromotedProductIOS(Continuation<? super ProductIOS> continuation);

    Object getReceiptDataIOS(Continuation<? super String> continuation);

    Object getStorefront(Continuation<? super String> continuation);

    Object getStorefrontIOS(Continuation<? super String> continuation);

    Object getTransactionJwsIOS(String str, Continuation<? super String> continuation);

    Object hasActiveSubscriptions(List<String> list, Continuation<? super Boolean> continuation);

    Object isEligibleForExternalPurchaseCustomLinkIOS(Continuation<? super Boolean> continuation);

    Object isEligibleForIntroOfferIOS(String str, Continuation<? super Boolean> continuation);

    Object isTransactionVerifiedIOS(String str, Continuation<? super Boolean> continuation);

    Object latestTransactionIOS(String str, Continuation<? super PurchaseIOS> continuation);

    Object subscriptionStatusIOS(String str, Continuation<? super List<SubscriptionStatusIOS>> continuation);

    Object validateReceiptIOS(VerifyPurchaseProps verifyPurchaseProps, Continuation<? super VerifyPurchaseResultIOS> continuation);

    /* compiled from: Types.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object getActiveSubscriptions$default(QueryResolver queryResolver, List list, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActiveSubscriptions");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        return queryResolver.getActiveSubscriptions(list, continuation);
    }

    static /* synthetic */ Object getAvailablePurchases$default(QueryResolver queryResolver, PurchaseOptions purchaseOptions, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAvailablePurchases");
        }
        if ((i & 1) != 0) {
            purchaseOptions = null;
        }
        return queryResolver.getAvailablePurchases(purchaseOptions, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object hasActiveSubscriptions$default(QueryResolver queryResolver, List list, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasActiveSubscriptions");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        return queryResolver.hasActiveSubscriptions(list, continuation);
    }
}
