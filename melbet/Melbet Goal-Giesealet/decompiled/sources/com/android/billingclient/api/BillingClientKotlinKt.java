package com.android.billingclient.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* compiled from: com.android.billingclient:billing-ktx@@8.0.0 */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\t\u001a\u001a\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\r\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0017\u001a\u00020\u0018*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013¨\u0006\u0019"}, d2 = {"acknowledgePurchase", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/BillingClient;", "params", "Lcom/android/billingclient/api/AcknowledgePurchaseParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/AcknowledgePurchaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumePurchase", "Lcom/android/billingclient/api/ConsumeResult;", "Lcom/android/billingclient/api/ConsumeParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/ConsumeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchasesAsync", "Lcom/android/billingclient/api/PurchasesResult;", "Lcom/android/billingclient/api/QueryPurchasesParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryPurchasesParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryProductDetails", "Lcom/android/billingclient/api/ProductDetailsResult;", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryProductDetailsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAlternativeBillingOnlyAvailable", "(Lcom/android/billingclient/api/BillingClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAlternativeBillingOnlyReportingDetails", "Lcom/android/billingclient/api/CreateAlternativeBillingOnlyReportingDetailsResult;", "isExternalOfferAvailable", "createExternalOfferReportingDetails", "Lcom/android/billingclient/api/CreateExternalOfferReportingDetailsResult;", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BillingClientKotlinKt {
    /* renamed from: $r8$lambda$BC2cAL2vk_I3dV-pkSAsSywRIek, reason: not valid java name */
    public static /* synthetic */ void m230$r8$lambda$BC2cAL2vk_I3dVpkSAsSywRIek(CompletableDeferred completableDeferred, BillingResult billingResult, String str) {
        Intrinsics.checkNotNull(billingResult);
        completableDeferred.complete(new ConsumeResult(billingResult, str));
    }

    public static /* synthetic */ void $r8$lambda$NjHhuq09jAs8F8dpZjv_HsFBRq0(CompletableDeferred completableDeferred, BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        completableDeferred.complete(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$UIFqmbqzelSukPAr7gb0UVftOsk(CompletableDeferred completableDeferred, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        Intrinsics.checkNotNull(billingResult);
        completableDeferred.complete(new ProductDetailsResult(billingResult, queryProductDetailsResult.getProductDetailsList()));
    }

    /* renamed from: $r8$lambda$jxN-QYHicJYIZOoHSpSjQpTOUq0, reason: not valid java name */
    public static /* synthetic */ void m231$r8$lambda$jxNQYHicJYIZOoHSpSjQpTOUq0(CompletableDeferred completableDeferred, BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        completableDeferred.complete(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(CompletableDeferred completableDeferred, BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        completableDeferred.complete(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$uERt1i0NYhXEQkbmrKSYJisMHH8(CompletableDeferred completableDeferred, BillingResult billingResult, List list) {
        Intrinsics.checkNotNull(billingResult);
        Intrinsics.checkNotNull(list);
        completableDeferred.complete(new PurchasesResult(billingResult, list));
    }

    /* renamed from: $r8$lambda$vlcEyDRKESu-E49PJWQAtcRlfoM, reason: not valid java name */
    public static /* synthetic */ void m232$r8$lambda$vlcEyDRKESuE49PJWQAtcRlfoM(CompletableDeferred completableDeferred, BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.checkNotNull(billingResult);
        completableDeferred.complete(new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails));
    }

    public static /* synthetic */ void $r8$lambda$z4VlE67Tlsqm1a7xTsH92uzKGwo(CompletableDeferred completableDeferred, BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNull(billingResult);
        completableDeferred.complete(new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails));
    }

    public static final Object acknowledgePurchase(BillingClient billingClient, AcknowledgePurchaseParams acknowledgePurchaseParams, Continuation<? super BillingResult> continuation) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda3
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                BillingClientKotlinKt.$r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(CompletableDeferred.this, billingResult);
            }
        });
        return CompletableDeferred$default.await(continuation);
    }

    public static final Object consumePurchase(BillingClient billingClient, ConsumeParams consumeParams, Continuation<? super ConsumeResult> continuation) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult billingResult, String str) {
                BillingClientKotlinKt.m230$r8$lambda$BC2cAL2vk_I3dVpkSAsSywRIek(CompletableDeferred.this, billingResult, str);
            }
        });
        return CompletableDeferred$default.await(continuation);
    }

    public static final Object createAlternativeBillingOnlyReportingDetails(BillingClient billingClient, Continuation<? super CreateAlternativeBillingOnlyReportingDetailsResult> continuation) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new AlternativeBillingOnlyReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda6
            @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
            public final void onAlternativeBillingOnlyTokenResponse(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
                BillingClientKotlinKt.m232$r8$lambda$vlcEyDRKESuE49PJWQAtcRlfoM(CompletableDeferred.this, billingResult, alternativeBillingOnlyReportingDetails);
            }
        });
        return CompletableDeferred$default.await(continuation);
    }

    public static final Object createExternalOfferReportingDetails(BillingClient billingClient, Continuation<? super CreateExternalOfferReportingDetailsResult> continuation) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.createExternalOfferReportingDetailsAsync(new ExternalOfferReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda4
            @Override // com.android.billingclient.api.ExternalOfferReportingDetailsListener
            public final void onExternalOfferReportingDetailsResponse(BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
                BillingClientKotlinKt.$r8$lambda$z4VlE67Tlsqm1a7xTsH92uzKGwo(CompletableDeferred.this, billingResult, externalOfferReportingDetails);
            }
        });
        return CompletableDeferred$default.await(continuation);
    }

    public static final Object isAlternativeBillingOnlyAvailable(BillingClient billingClient, Continuation<? super BillingResult> continuation) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.isAlternativeBillingOnlyAvailableAsync(new AlternativeBillingOnlyAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda5
            @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
            public final void onAlternativeBillingOnlyAvailabilityResponse(BillingResult billingResult) {
                BillingClientKotlinKt.m231$r8$lambda$jxNQYHicJYIZOoHSpSjQpTOUq0(CompletableDeferred.this, billingResult);
            }
        });
        return CompletableDeferred$default.await(continuation);
    }

    public static final Object isExternalOfferAvailable(BillingClient billingClient, Continuation<? super BillingResult> continuation) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.isExternalOfferAvailableAsync(new ExternalOfferAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.ExternalOfferAvailabilityListener
            public final void onExternalOfferAvailabilityResponse(BillingResult billingResult) {
                BillingClientKotlinKt.$r8$lambda$NjHhuq09jAs8F8dpZjv_HsFBRq0(CompletableDeferred.this, billingResult);
            }
        });
        return CompletableDeferred$default.await(continuation);
    }

    public static final Object queryProductDetails(BillingClient billingClient, QueryProductDetailsParams queryProductDetailsParams, Continuation<? super ProductDetailsResult> continuation) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                BillingClientKotlinKt.$r8$lambda$UIFqmbqzelSukPAr7gb0UVftOsk(CompletableDeferred.this, billingResult, queryProductDetailsResult);
            }
        });
        return CompletableDeferred$default.await(continuation);
    }

    public static final Object queryPurchasesAsync(BillingClient billingClient, QueryPurchasesParams queryPurchasesParams, Continuation<? super PurchasesResult> continuation) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.queryPurchasesAsync(queryPurchasesParams, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda7
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.$r8$lambda$uERt1i0NYhXEQkbmrKSYJisMHH8(CompletableDeferred.this, billingResult, list);
            }
        });
        return CompletableDeferred$default.await(continuation);
    }
}
