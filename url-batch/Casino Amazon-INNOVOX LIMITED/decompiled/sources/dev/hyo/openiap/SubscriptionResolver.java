package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\u0004¨\u0006\rÀ\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/SubscriptionResolver;", "", "developerProvidedBillingAndroid", "Ldev/hyo/openiap/DeveloperProvidedBillingDetailsAndroid;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "promotedProductIOS", "", "purchaseError", "Ldev/hyo/openiap/PurchaseError;", "purchaseUpdated", "Ldev/hyo/openiap/Purchase;", "userChoiceBillingAndroid", "Ldev/hyo/openiap/UserChoiceBillingDetails;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SubscriptionResolver {
    Object developerProvidedBillingAndroid(Continuation<? super DeveloperProvidedBillingDetailsAndroid> continuation);

    Object promotedProductIOS(Continuation<? super String> continuation);

    Object purchaseError(Continuation<? super PurchaseError> continuation);

    Object purchaseUpdated(Continuation<? super Purchase> continuation);

    Object userChoiceBillingAndroid(Continuation<? super UserChoiceBillingDetails> continuation);
}
