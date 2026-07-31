package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.android.billingclient.api.PendingPurchasesParams;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes10.dex */
public abstract class BillingClient {

    /* compiled from: com.android.billingclient:billing@@7.1.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    /* compiled from: com.android.billingclient:billing@@7.1.1 */
    @AnyThread
    public static final class Builder {
        private volatile String zza;
        private volatile PendingPurchasesParams zzb;
        private final Context zzc;
        private volatile PurchasesUpdatedListener zzd;
        private volatile zzco zze;
        private volatile zzch zzf;
        private volatile zzb zzg;
        private volatile UserChoiceBillingListener zzh;

        @Nullable
        private volatile ExecutorService zzi;
        private volatile boolean zzj;
        private volatile boolean zzk;
        private volatile boolean zzl;

        /* synthetic */ Builder(Context context, zzo zzoVar) {
            this.zzc = context;
        }

        private final boolean zza() {
            try {
                return this.zzc.getPackageManager().getApplicationInfo(this.zzc.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
                return false;
            }
        }

        @NonNull
        public BillingClient build() {
            if (this.zzc == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.zzd == null) {
                if (this.zzh != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (!this.zzj && !this.zzk) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.zzc;
                return zza() ? new zzcc(null, context, null, null) : new BillingClientImpl(null, context, null, null);
            }
            if (this.zzb == null || !this.zzb.isEnabledForOneTimeProducts()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.zzd == null) {
                PendingPurchasesParams pendingPurchasesParams = this.zzb;
                Context context2 = this.zzc;
                return zza() ? new zzcc(null, pendingPurchasesParams, context2, null, null, null) : new BillingClientImpl(null, pendingPurchasesParams, context2, null, null, null);
            }
            if (this.zzh == null) {
                PendingPurchasesParams pendingPurchasesParams2 = this.zzb;
                Context context3 = this.zzc;
                PurchasesUpdatedListener purchasesUpdatedListener = this.zzd;
                return zza() ? new zzcc((String) null, pendingPurchasesParams2, context3, purchasesUpdatedListener, (zzb) null, (zzch) null, (ExecutorService) null) : new BillingClientImpl((String) null, pendingPurchasesParams2, context3, purchasesUpdatedListener, (zzb) null, (zzch) null, (ExecutorService) null);
            }
            PendingPurchasesParams pendingPurchasesParams3 = this.zzb;
            Context context4 = this.zzc;
            PurchasesUpdatedListener purchasesUpdatedListener2 = this.zzd;
            UserChoiceBillingListener userChoiceBillingListener = this.zzh;
            return zza() ? new zzcc((String) null, pendingPurchasesParams3, context4, purchasesUpdatedListener2, userChoiceBillingListener, (zzch) null, (ExecutorService) null) : new BillingClientImpl((String) null, pendingPurchasesParams3, context4, purchasesUpdatedListener2, userChoiceBillingListener, (zzch) null, (ExecutorService) null);
        }

        @NonNull
        @zzf
        public Builder enableAlternativeBillingOnly() {
            this.zzj = true;
            return this;
        }

        @NonNull
        @zzg
        public Builder enableExternalOffer() {
            this.zzk = true;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder enablePendingPurchases() {
            PendingPurchasesParams.Builder newBuilder = PendingPurchasesParams.newBuilder();
            newBuilder.enableOneTimeProducts();
            enablePendingPurchases(newBuilder.build());
            return this;
        }

        @NonNull
        @zzj
        public Builder enablePendingPurchases(@NonNull PendingPurchasesParams pendingPurchasesParams) {
            this.zzb = pendingPurchasesParams;
            return this;
        }

        @NonNull
        @zzk
        public Builder enableUserChoiceBilling(@NonNull UserChoiceBillingListener userChoiceBillingListener) {
            this.zzh = userChoiceBillingListener;
            return this;
        }

        @NonNull
        public Builder setListener(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzd = purchasesUpdatedListener;
            return this;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.1.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* compiled from: com.android.billingclient:billing@@7.1.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {

        @NonNull
        @zzf
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";

        @NonNull
        @zzh
        public static final String BILLING_CONFIG = "ggg";

        @NonNull
        @zzg
        public static final String EXTERNAL_OFFER = "kkk";

        @NonNull
        public static final String IN_APP_MESSAGING = "bbb";

        @NonNull
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";

        @NonNull
        public static final String PRODUCT_DETAILS = "fff";

        @NonNull
        public static final String SUBSCRIPTIONS = "subscriptions";

        @NonNull
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    /* compiled from: com.android.billingclient:billing@@7.1.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    /* compiled from: com.android.billingclient:billing@@7.1.1 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    @NonNull
    @AnyThread
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context, null);
    }

    @AnyThread
    public abstract void acknowledgePurchase(@NonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @NonNull AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    @AnyThread
    public abstract void consumeAsync(@NonNull ConsumeParams consumeParams, @NonNull ConsumeResponseListener consumeResponseListener);

    @AnyThread
    @zzf
    @KeepForSdk
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(@NonNull AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @zzg
    @AnyThread
    public abstract void createExternalOfferReportingDetailsAsync(@NonNull ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    @AnyThread
    public abstract void endConnection();

    @AnyThread
    @zzh
    public abstract void getBillingConfigAsync(@NonNull GetBillingConfigParams getBillingConfigParams, @NonNull BillingConfigResponseListener billingConfigResponseListener);

    @AnyThread
    public abstract int getConnectionState();

    @AnyThread
    @zzf
    @KeepForSdk
    public abstract void isAlternativeBillingOnlyAvailableAsync(@NonNull AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @zzg
    @AnyThread
    public abstract void isExternalOfferAvailableAsync(@NonNull ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    @NonNull
    @AnyThread
    public abstract BillingResult isFeatureSupported(@NonNull String str);

    @AnyThread
    public abstract boolean isReady();

    @NonNull
    @UiThread
    public abstract BillingResult launchBillingFlow(@NonNull Activity activity, @NonNull BillingFlowParams billingFlowParams);

    @AnyThread
    public abstract void queryProductDetailsAsync(@NonNull QueryProductDetailsParams queryProductDetailsParams, @NonNull ProductDetailsResponseListener productDetailsResponseListener);

    @AnyThread
    @Deprecated
    public abstract void queryPurchaseHistoryAsync(@NonNull QueryPurchaseHistoryParams queryPurchaseHistoryParams, @NonNull PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @AnyThread
    @Deprecated
    public abstract void queryPurchaseHistoryAsync(@NonNull String str, @NonNull PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @AnyThread
    public abstract void queryPurchasesAsync(@NonNull QueryPurchasesParams queryPurchasesParams, @NonNull PurchasesResponseListener purchasesResponseListener);

    @AnyThread
    @Deprecated
    public abstract void queryPurchasesAsync(@NonNull String str, @NonNull PurchasesResponseListener purchasesResponseListener);

    @AnyThread
    @Deprecated
    public abstract void querySkuDetailsAsync(@NonNull SkuDetailsParams skuDetailsParams, @NonNull SkuDetailsResponseListener skuDetailsResponseListener);

    @NonNull
    @zzf
    @UiThread
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(@NonNull Activity activity, @NonNull AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @NonNull
    @zzg
    @UiThread
    public abstract BillingResult showExternalOfferInformationDialog(@NonNull Activity activity, @NonNull ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    @NonNull
    @UiThread
    public abstract BillingResult showInAppMessages(@NonNull Activity activity, @NonNull InAppMessageParams inAppMessageParams, @NonNull InAppMessageResponseListener inAppMessageResponseListener);

    @AnyThread
    public abstract void startConnection(@NonNull BillingClientStateListener billingClientStateListener);
}
