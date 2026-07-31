package ru.rustore.unitysdk.payclient;

import android.content.Intent;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.pay.RuStorePayClient;
import ru.rustore.sdk.pay.callback.PurchaseEventListener;
import ru.rustore.sdk.pay.model.AppUserEmail;
import ru.rustore.sdk.pay.model.AppUserId;
import ru.rustore.sdk.pay.model.DeveloperPayload;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.ProductId;
import ru.rustore.sdk.pay.model.ProductPurchaseParams;
import ru.rustore.sdk.pay.model.ProductPurchaseResult;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.Purchase;
import ru.rustore.sdk.pay.model.PurchaseAvailabilityResult;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.pay.model.UserAuthorizationStatus;
import ru.rustore.unitysdk.payclient.RuStoreUnityPayClient;
import ru.rustore.unitysdk.payclient.callbacks.CancelTwoStepPurchaseListener;
import ru.rustore.unitysdk.payclient.callbacks.ConfirmTwoStepPurchaseListener;
import ru.rustore.unitysdk.payclient.callbacks.ProductPurchaseResultListener;
import ru.rustore.unitysdk.payclient.callbacks.ProductsResponseListener;
import ru.rustore.unitysdk.payclient.callbacks.PurchaseAvailabilityListener;
import ru.rustore.unitysdk.payclient.callbacks.PurchaseResponseListener;
import ru.rustore.unitysdk.payclient.callbacks.PurchasesResponseListener;
import ru.rustore.unitysdk.payclient.callbacks.UserAuthorizationStatusListener;
import ru.rustore.unitysdk.payclient.internal.DataParser;

@Metadata
/* loaded from: classes3.dex */
public final class RuStoreUnityPayClient {

    @NotNull
    public static final RuStoreUnityPayClient INSTANCE = new RuStoreUnityPayClient();
    private static final long MAX_RETRY_TIME_MS = 5000;
    private static final long RETRY_DELAY_MS = 200;

    private RuStoreUnityPayClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelTwoStepPurchase$lambda$28(CancelTwoStepPurchaseListener listener, Unit it) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(it, "it");
        listener.OnSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelTwoStepPurchase$lambda$29(CancelTwoStepPurchaseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmTwoStepPurchase$lambda$26(ConfirmTwoStepPurchaseListener listener, Unit it) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(it, "it");
        listener.OnSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmTwoStepPurchase$lambda$27(ConfirmTwoStepPurchaseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getProducts$lambda$5(ProductsResponseListener listener, List result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getProducts$lambda$6(ProductsResponseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchase$lambda$11(PurchaseResponseListener listener, Purchase result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchase$lambda$12(PurchaseResponseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchaseAvailability$lambda$2(PurchaseAvailabilityListener listener, PurchaseAvailabilityResult result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchaseAvailability$lambda$3(PurchaseAvailabilityListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchases$lambda$10(PurchasesResponseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchases$lambda$9(PurchasesResponseListener listener, List result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getUserAuthorizationStatus$lambda$0(UserAuthorizationStatusListener listener, UserAuthorizationStatus result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getUserAuthorizationStatus$lambda$1(UserAuthorizationStatusListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    private final void internalProceedIntent(Intent intent, SdkTheme sdkTheme, long j4, long j5) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                RuStorePayClient.Companion.getInstance().getIntentInteractor().proceedIntent(intent, sdkTheme);
                return;
            } catch (RuStorePaymentException.RuStorePayClientNotCreated e4) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (j4 <= 0 || elapsedRealtime2 >= j4) {
                    throw e4;
                }
                Thread.sleep(j5);
            }
        }
        throw e4;
    }

    public static /* synthetic */ void proceedIntent$default(RuStoreUnityPayClient ruStoreUnityPayClient, Intent intent, SdkTheme sdkTheme, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            sdkTheme = SdkTheme.LIGHT;
        }
        if ((i4 & 4) != 0) {
            j4 = 5000;
        }
        ruStoreUnityPayClient.proceedIntent(intent, sdkTheme, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchase$lambda$17(ProductPurchaseResultListener listener, ProductPurchaseResult result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchase$lambda$18(ProductPurchaseResultListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseTwoStep$lambda$23(ProductPurchaseResultListener listener, ProductPurchaseResult result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseTwoStep$lambda$24(ProductPurchaseResultListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    public final void cancelTwoStepPurchase(@NotNull String purchaseId, @NotNull final CancelTwoStepPurchaseListener listener) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStorePayClient.Companion.getInstance().getPurchaseInteractor().cancelTwoStepPurchase(new PurchaseId(purchaseId)).addOnSuccessListener(new OnSuccessListener() { // from class: F3.f
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.cancelTwoStepPurchase$lambda$28(CancelTwoStepPurchaseListener.this, (Unit) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.g
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.cancelTwoStepPurchase$lambda$29(CancelTwoStepPurchaseListener.this, th);
            }
        });
    }

    public final void confirmTwoStepPurchase(@NotNull String purchaseId, @Nullable String str, @NotNull final ConfirmTwoStepPurchaseListener listener) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStorePayClient.Companion.getInstance().getPurchaseInteractor().confirmTwoStepPurchase(new PurchaseId(purchaseId), str != null ? new DeveloperPayload(str) : null).addOnSuccessListener(new OnSuccessListener() { // from class: F3.d
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.confirmTwoStepPurchase$lambda$26(ConfirmTwoStepPurchaseListener.this, (Unit) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.e
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.confirmTwoStepPurchase$lambda$27(ConfirmTwoStepPurchaseListener.this, th);
            }
        });
    }

    public final void getProducts(@NotNull String[] productsId, @NotNull final ProductsResponseListener listener) {
        Intrinsics.checkNotNullParameter(productsId, "productsId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList(productsId.length);
        for (String str : productsId) {
            arrayList.add(new ProductId(str));
        }
        RuStorePayClient.Companion.getInstance().getProductInteractor().getProducts(CollectionsKt.toList(arrayList)).addOnSuccessListener(new OnSuccessListener() { // from class: F3.a
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.getProducts$lambda$5(ProductsResponseListener.this, (List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.j
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.getProducts$lambda$6(ProductsResponseListener.this, th);
            }
        });
    }

    public final void getPurchase(@NotNull String purchaseId, @NotNull final PurchaseResponseListener listener) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStorePayClient.Companion.getInstance().getPurchaseInteractor().getPurchase(new PurchaseId(purchaseId)).addOnSuccessListener(new OnSuccessListener() { // from class: F3.q
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.getPurchase$lambda$11(PurchaseResponseListener.this, (Purchase) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.r
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.getPurchase$lambda$12(PurchaseResponseListener.this, th);
            }
        });
    }

    public final void getPurchaseAvailability(@NotNull final PurchaseAvailabilityListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStorePayClient.Companion.getInstance().getPurchaseInteractor().getPurchaseAvailability().addOnSuccessListener(new OnSuccessListener() { // from class: F3.o
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.getPurchaseAvailability$lambda$2(PurchaseAvailabilityListener.this, (PurchaseAvailabilityResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.p
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.getPurchaseAvailability$lambda$3(PurchaseAvailabilityListener.this, th);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getPurchases(@Nullable String str, @Nullable String str2, @NotNull final PurchasesResponseListener listener) {
        ProductType valueOf;
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (str != null) {
            try {
                valueOf = ProductType.valueOf(str);
            } catch (IllegalArgumentException unused) {
            }
            RuStorePayClient.Companion.getInstance().getPurchaseInteractor().getPurchases(valueOf, str2 != null ? DataParser.INSTANCE.parsePurchaseStatus(str2) : null).addOnSuccessListener(new OnSuccessListener() { // from class: F3.k
                @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    RuStoreUnityPayClient.getPurchases$lambda$9(PurchasesResponseListener.this, (List) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: F3.l
                @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                public final void onFailure(Throwable th) {
                    RuStoreUnityPayClient.getPurchases$lambda$10(PurchasesResponseListener.this, th);
                }
            });
        }
        valueOf = null;
        RuStorePayClient.Companion.getInstance().getPurchaseInteractor().getPurchases(valueOf, str2 != null ? DataParser.INSTANCE.parsePurchaseStatus(str2) : null).addOnSuccessListener(new OnSuccessListener() { // from class: F3.k
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.getPurchases$lambda$9(PurchasesResponseListener.this, (List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.l
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.getPurchases$lambda$10(PurchasesResponseListener.this, th);
            }
        });
    }

    public final void getUserAuthorizationStatus(@NotNull final UserAuthorizationStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStorePayClient.Companion.getInstance().getUserInteractor().getUserAuthorizationStatus().addOnSuccessListener(new OnSuccessListener() { // from class: F3.h
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.getUserAuthorizationStatus$lambda$0(UserAuthorizationStatusListener.this, (UserAuthorizationStatus) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.i
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.getUserAuthorizationStatus$lambda$1(UserAuthorizationStatusListener.this, th);
            }
        });
    }

    public final void proceedIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        proceedIntent$default(this, intent, null, 0L, 6, null);
    }

    public final void purchase(@NotNull String productId, @Nullable String str, @Nullable String str2, @Nullable String str3, int i4, @Nullable String str4, @NotNull String preferredPurchaseType, @NotNull String sdkTheme, @NotNull final ProductPurchaseResultListener listener, @Nullable PurchaseEventListener purchaseEventListener) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(preferredPurchaseType, "preferredPurchaseType");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ProductId productId2 = new ProductId(productId);
        AppUserEmail appUserEmail = str != null ? new AppUserEmail(str) : null;
        AppUserId appUserId = str2 != null ? new AppUserId(str2) : null;
        ProductPurchaseParams productPurchaseParams = new ProductPurchaseParams(productId2, new Quantity(i4), str3 != null ? new OrderId(str3) : null, str4 != null ? new DeveloperPayload(str4) : null, appUserId, appUserEmail);
        DataParser dataParser = DataParser.INSTANCE;
        RuStorePayClient.Companion.getInstance().getPurchaseInteractor().purchase(productPurchaseParams, dataParser.parsePurchaseType(preferredPurchaseType), dataParser.parseSdkTheme(sdkTheme), purchaseEventListener).addOnSuccessListener(new OnSuccessListener() { // from class: F3.b
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.purchase$lambda$17(ProductPurchaseResultListener.this, (ProductPurchaseResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.c
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.purchase$lambda$18(ProductPurchaseResultListener.this, th);
            }
        });
    }

    public final void purchaseTwoStep(@NotNull String productId, @Nullable String str, @Nullable String str2, @Nullable String str3, int i4, @Nullable String str4, @NotNull String sdkTheme, @NotNull final ProductPurchaseResultListener listener, @Nullable PurchaseEventListener purchaseEventListener) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ProductId productId2 = new ProductId(productId);
        AppUserEmail appUserEmail = str != null ? new AppUserEmail(str) : null;
        AppUserId appUserId = str2 != null ? new AppUserId(str2) : null;
        RuStorePayClient.Companion.getInstance().getPurchaseInteractor().purchaseTwoStep(new ProductPurchaseParams(productId2, new Quantity(i4), str3 != null ? new OrderId(str3) : null, str4 != null ? new DeveloperPayload(str4) : null, appUserId, appUserEmail), DataParser.INSTANCE.parseSdkTheme(sdkTheme), purchaseEventListener).addOnSuccessListener(new OnSuccessListener() { // from class: F3.m
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityPayClient.purchaseTwoStep$lambda$23(ProductPurchaseResultListener.this, (ProductPurchaseResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: F3.n
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityPayClient.purchaseTwoStep$lambda$24(ProductPurchaseResultListener.this, th);
            }
        });
    }

    public final void proceedIntent(@NotNull Intent intent, @NotNull SdkTheme sdkTheme) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        proceedIntent$default(this, intent, sdkTheme, 0L, 4, null);
    }

    public final void proceedIntent(@NotNull Intent intent, @NotNull SdkTheme sdkTheme, long j4) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        try {
            internalProceedIntent(intent, sdkTheme, j4, 200L);
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
