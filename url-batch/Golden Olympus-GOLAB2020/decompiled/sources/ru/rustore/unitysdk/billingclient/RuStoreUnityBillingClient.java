package ru.rustore.unitysdk.billingclient;

import E3.p;
import android.app.Application;
import android.content.Intent;
import android.util.Log;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.RuStoreBillingClient;
import ru.rustore.sdk.billingclient.RuStoreBillingClientFactory;
import ru.rustore.sdk.billingclient.model.purchase.PaymentResult;
import ru.rustore.sdk.billingclient.model.purchase.Purchase;
import ru.rustore.sdk.billingclient.model.purchase.PurchaseAvailabilityResult;
import ru.rustore.sdk.billingclient.model.user.UserAuthorizationStatus;
import ru.rustore.sdk.billingclient.presentation.BillingClientTheme;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger;
import ru.rustore.sdk.billingclient.usecase.PurchasesUseCase;
import ru.rustore.sdk.billingclient.utils.BillingRuStoreExceptionExtKt;
import ru.rustore.sdk.billingclient.utils.pub.RuStoreBillingClientExtKt;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.core.util.RuStoreUtils;
import ru.rustore.unitysdk.billingclient.RuStoreUnityBillingClient;
import ru.rustore.unitysdk.billingclient.callbacks.AuthorizationStatusListener;
import ru.rustore.unitysdk.billingclient.callbacks.ConfirmPurchaseListener;
import ru.rustore.unitysdk.billingclient.callbacks.DeletePurchaseListener;
import ru.rustore.unitysdk.billingclient.callbacks.PaymentResultListener;
import ru.rustore.unitysdk.billingclient.callbacks.ProductsResponseListener;
import ru.rustore.unitysdk.billingclient.callbacks.PurchaseAvailabilityListener;
import ru.rustore.unitysdk.billingclient.callbacks.PurchaseInfoResponseListener;
import ru.rustore.unitysdk.billingclient.callbacks.PurchasesResponseListener;
import ru.rustore.unitysdk.core.PlayerProvider;

@Metadata
/* loaded from: classes3.dex */
public final class RuStoreUnityBillingClient {

    @NotNull
    public static final RuStoreUnityBillingClient INSTANCE = new RuStoreUnityBillingClient();
    private static boolean allowErrorHandling;
    private static RuStoreBillingClient billingClient;
    private static boolean isInitialized;

    @Metadata
    public static final class BillingClientLogger implements ExternalPaymentLogger {

        @NotNull
        private final String tag;

        public BillingClientLogger(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.tag = tag;
        }

        public void d(@Nullable Throwable th, @NotNull Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.d(this.tag, (String) message.invoke(), th);
        }

        public void e(@Nullable Throwable th, @NotNull Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.e(this.tag, (String) message.invoke(), th);
        }

        public void i(@Nullable Throwable th, @NotNull Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.i(this.tag, (String) message.invoke(), th);
        }

        public void v(@Nullable Throwable th, @NotNull Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.v(this.tag, (String) message.invoke(), th);
        }

        public void w(@Nullable Throwable th, @NotNull Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.w(this.tag, (String) message.invoke(), th);
        }
    }

    private RuStoreUnityBillingClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPurchasesAvailability$lambda$2(PurchaseAvailabilityListener listener, PurchaseAvailabilityResult result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPurchasesAvailability$lambda$3(PurchaseAvailabilityListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.handleError(throwable);
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmPurchase$lambda$15(ConfirmPurchaseListener listener, Unit it) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(it, "it");
        listener.OnSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmPurchase$lambda$16(ConfirmPurchaseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.handleError(throwable);
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deletePurchase$lambda$17(DeletePurchaseListener listener, Unit it) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(it, "it");
        listener.OnSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deletePurchase$lambda$18(DeletePurchaseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.handleError(throwable);
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAuthorizationStatus$lambda$5(AuthorizationStatusListener listener, UserAuthorizationStatus result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAuthorizationStatus$lambda$6(AuthorizationStatusListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.handleError(throwable);
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getProducts$lambda$7(ProductsResponseListener listener, List result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getProducts$lambda$8(ProductsResponseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.handleError(throwable);
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchaseInfo$lambda$11(PurchaseInfoResponseListener listener, Purchase result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchaseInfo$lambda$12(PurchaseInfoResponseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.handleError(throwable);
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchases$lambda$10(PurchasesResponseListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.handleError(throwable);
        listener.OnFailure(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchases$lambda$9(PurchasesResponseListener listener, List result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    private final void handleError(Throwable th) {
        if (allowErrorHandling && (th instanceof RuStoreException)) {
            BillingRuStoreExceptionExtKt.resolveForBilling((RuStoreException) th, PlayerProvider.INSTANCE.getCurrentActivity());
        }
    }

    private static final ExternalPaymentLogger init$lambda$0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new BillingClientLogger(tag);
    }

    private static final ExternalPaymentLogger init$lambda$1(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new BillingClientLogger(tag);
    }

    public static final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (isInitialized) {
            RuStoreBillingClient ruStoreBillingClient = billingClient;
            if (ruStoreBillingClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                ruStoreBillingClient = null;
            }
            ruStoreBillingClient.onNewIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseProduct$lambda$13(PaymentResultListener listener, PaymentResult result) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(result, "result");
        listener.OnSuccess(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseProduct$lambda$14(PaymentResultListener listener, Throwable throwable) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        listener.OnFailure(throwable);
    }

    public final void checkPurchasesAvailability(@NotNull final PurchaseAvailabilityListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStoreBillingClientExtKt.checkPurchasesAvailability(RuStoreBillingClient.Companion).addOnSuccessListener(new OnSuccessListener() { // from class: E3.e
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityBillingClient.checkPurchasesAvailability$lambda$2(PurchaseAvailabilityListener.this, (PurchaseAvailabilityResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: E3.f
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityBillingClient.checkPurchasesAvailability$lambda$3(PurchaseAvailabilityListener.this, th);
            }
        });
    }

    public final void confirmPurchase(@NotNull String purchaseId, @NotNull final ConfirmPurchaseListener listener) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStoreBillingClient ruStoreBillingClient = billingClient;
        if (ruStoreBillingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            ruStoreBillingClient = null;
        }
        PurchasesUseCase.confirmPurchase$default(ruStoreBillingClient.getPurchases(), purchaseId, (String) null, 2, (Object) null).addOnSuccessListener(new OnSuccessListener() { // from class: E3.n
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityBillingClient.confirmPurchase$lambda$15(ConfirmPurchaseListener.this, (Unit) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: E3.o
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityBillingClient.confirmPurchase$lambda$16(ConfirmPurchaseListener.this, th);
            }
        });
    }

    public final void deletePurchase(@NotNull String purchaseId, @NotNull final DeletePurchaseListener listener) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStoreBillingClient ruStoreBillingClient = billingClient;
        if (ruStoreBillingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            ruStoreBillingClient = null;
        }
        ruStoreBillingClient.getPurchases().deletePurchase(purchaseId).addOnSuccessListener(new OnSuccessListener() { // from class: E3.q
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityBillingClient.deletePurchase$lambda$17(DeletePurchaseListener.this, (Unit) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: E3.b
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityBillingClient.deletePurchase$lambda$18(DeletePurchaseListener.this, th);
            }
        });
    }

    public final void getAuthorizationStatus(@NotNull final AuthorizationStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStoreBillingClient ruStoreBillingClient = billingClient;
        if (ruStoreBillingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            ruStoreBillingClient = null;
        }
        ruStoreBillingClient.getUserInfo().getAuthorizationStatus().addOnSuccessListener(new OnSuccessListener() { // from class: E3.j
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityBillingClient.getAuthorizationStatus$lambda$5(AuthorizationStatusListener.this, (UserAuthorizationStatus) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: E3.k
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityBillingClient.getAuthorizationStatus$lambda$6(AuthorizationStatusListener.this, th);
            }
        });
    }

    public final boolean getErrorHandling() {
        return allowErrorHandling;
    }

    public final void getProducts(@NotNull String[] productIds, @NotNull final ProductsResponseListener listener) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStoreBillingClient ruStoreBillingClient = billingClient;
        if (ruStoreBillingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            ruStoreBillingClient = null;
        }
        ruStoreBillingClient.getProducts().getProducts(AbstractC3219i.e(productIds)).addOnSuccessListener(new OnSuccessListener() { // from class: E3.a
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityBillingClient.getProducts$lambda$7(ProductsResponseListener.this, (List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: E3.i
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityBillingClient.getProducts$lambda$8(ProductsResponseListener.this, th);
            }
        });
    }

    public final void getPurchaseInfo(@NotNull String purchaseId, @NotNull final PurchaseInfoResponseListener listener) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStoreBillingClient ruStoreBillingClient = billingClient;
        if (ruStoreBillingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            ruStoreBillingClient = null;
        }
        ruStoreBillingClient.getPurchases().getPurchaseInfo(purchaseId).addOnSuccessListener(new OnSuccessListener() { // from class: E3.g
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityBillingClient.getPurchaseInfo$lambda$11(PurchaseInfoResponseListener.this, (Purchase) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: E3.h
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityBillingClient.getPurchaseInfo$lambda$12(PurchaseInfoResponseListener.this, th);
            }
        });
    }

    public final void getPurchases(@NotNull final PurchasesResponseListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStoreBillingClient ruStoreBillingClient = billingClient;
        if (ruStoreBillingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            ruStoreBillingClient = null;
        }
        ruStoreBillingClient.getPurchases().getPurchases().addOnSuccessListener(new OnSuccessListener() { // from class: E3.l
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityBillingClient.getPurchases$lambda$9(PurchasesResponseListener.this, (List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: E3.m
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityBillingClient.getPurchases$lambda$10(PurchasesResponseListener.this, th);
            }
        });
    }

    public final int getThemeCode() {
        return RuStoreBillingClientThemeProviderImpl.INSTANCE.getTheme().ordinal();
    }

    public final void init(@NotNull String consoleApplicationId, @NotNull String deeplinkScheme, boolean z4, @NotNull String metricType) {
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(deeplinkScheme, "deeplinkScheme");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        init(consoleApplicationId, deeplinkScheme, false, z4, metricType);
    }

    public final boolean isRuStoreInstalled() {
        Application application = PlayerProvider.INSTANCE.getCurrentActivity().getApplication();
        if (application != null) {
            return RuStoreUtils.INSTANCE.isRuStoreInstalled(application);
        }
        return false;
    }

    public final void purchaseProduct(@NotNull String productId, @Nullable String str, int i4, @Nullable String str2, @NotNull final PaymentResultListener listener) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RuStoreBillingClient ruStoreBillingClient = billingClient;
        if (ruStoreBillingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            ruStoreBillingClient = null;
        }
        ruStoreBillingClient.getPurchases().purchaseProduct(productId, str, Integer.valueOf(i4), str2).addOnSuccessListener(new OnSuccessListener() { // from class: E3.c
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RuStoreUnityBillingClient.purchaseProduct$lambda$13(PaymentResultListener.this, (PaymentResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: E3.d
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RuStoreUnityBillingClient.purchaseProduct$lambda$14(PaymentResultListener.this, th);
            }
        });
    }

    public final void setErrorHandling(boolean z4) {
        allowErrorHandling = z4;
    }

    public final void setThemeCode(int i4) {
        RuStoreBillingClientThemeProviderImpl.INSTANCE.setTheme(BillingClientTheme.values()[i4]);
    }

    public final void init(@NotNull String consoleApplicationId, @NotNull String deeplinkScheme, boolean z4, boolean z5, @NotNull String metricType) {
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(deeplinkScheme, "deeplinkScheme");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        if (isInitialized) {
            return;
        }
        allowErrorHandling = z4;
        RuStoreBillingClientFactory ruStoreBillingClientFactory = RuStoreBillingClientFactory.INSTANCE;
        Application application = PlayerProvider.INSTANCE.getCurrentActivity().getApplication();
        RuStoreBillingClientThemeProviderImpl ruStoreBillingClientThemeProviderImpl = RuStoreBillingClientThemeProviderImpl.INSTANCE;
        p pVar = new p();
        Map mapOf = MapsKt.mapOf(TuplesKt.to("type", metricType));
        Intrinsics.checkNotNull(application);
        billingClient = ruStoreBillingClientFactory.create(application, consoleApplicationId, deeplinkScheme, ruStoreBillingClientThemeProviderImpl, pVar, z5, mapOf);
        isInitialized = true;
    }

    public final void init() {
        if (isInitialized) {
            return;
        }
        Application application = PlayerProvider.INSTANCE.getCurrentActivity().getApplication();
        int identifier = application.getResources().getIdentifier("rustore_BillingClientSettings_consoleApplicationId", "string", application.getPackageName());
        int identifier2 = application.getResources().getIdentifier("rustore_BillingClientSettings_deeplinkScheme", "string", application.getPackageName());
        int identifier3 = application.getResources().getIdentifier("rustore_BillingClientSettings_enableLogs", "string", application.getPackageName());
        allowErrorHandling = Boolean.parseBoolean(application.getString(application.getResources().getIdentifier("rustore_BillingClientSettings_allowNativeErrorHandling", "string", application.getPackageName())));
        RuStoreBillingClientFactory ruStoreBillingClientFactory = RuStoreBillingClientFactory.INSTANCE;
        String string = application.getString(identifier);
        String string2 = application.getString(identifier2);
        RuStoreBillingClientThemeProviderImpl ruStoreBillingClientThemeProviderImpl = RuStoreBillingClientThemeProviderImpl.INSTANCE;
        boolean parseBoolean = Boolean.parseBoolean(application.getString(identifier3));
        p pVar = new p();
        Map mapOf = MapsKt.mapOf(TuplesKt.to("type", PluginErrorDetails.Platform.UNITY));
        Intrinsics.checkNotNull(application);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNull(string2);
        billingClient = ruStoreBillingClientFactory.create(application, string, string2, ruStoreBillingClientThemeProviderImpl, pVar, parseBoolean, mapOf);
        isInitialized = true;
    }
}
