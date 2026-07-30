package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchase;
import com.facebook.appevents.iap.InAppPurchaseDedupeConfig;
import com.facebook.appevents.iap.InAppPurchaseEventManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import defpackage.pv;
import defpackage.qv;
import defpackage.rv;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AutomaticAnalyticsLogger {
    private static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
    public static final AutomaticAnalyticsLogger INSTANCE = new AutomaticAnalyticsLogger();
    private static final String TAG = AutomaticAnalyticsLogger.class.getCanonicalName();
    private static final InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class PurchaseLoggingParameters {
        private Currency currency;
        private OperationalData operationalData;
        private Bundle param;
        private BigDecimal purchaseAmount;

        public PurchaseLoggingParameters(BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
            bigDecimal.getClass();
            currency.getClass();
            bundle.getClass();
            operationalData.getClass();
            this.purchaseAmount = bigDecimal;
            this.currency = currency;
            this.param = bundle;
            this.operationalData = operationalData;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final OperationalData getOperationalData() {
            return this.operationalData;
        }

        public final Bundle getParam() {
            return this.param;
        }

        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public final void setCurrency(Currency currency) {
            currency.getClass();
            this.currency = currency;
        }

        public final void setOperationalData(OperationalData operationalData) {
            operationalData.getClass();
            this.operationalData = operationalData;
        }

        public final void setParam(Bundle bundle) {
            bundle.getClass();
            this.param = bundle;
        }

        public final void setPurchaseAmount(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.purchaseAmount = bigDecimal;
        }
    }

    private AutomaticAnalyticsLogger() {
    }

    public static final synchronized Bundle getPurchaseDedupeParameters(List<PurchaseLoggingParameters> list) {
        Bundle performDedupe;
        synchronized (AutomaticAnalyticsLogger.class) {
            list.getClass();
            PurchaseLoggingParameters purchaseLoggingParameters = list.get(0);
            performDedupe = InAppPurchaseManager.performDedupe(pv.c(new InAppPurchase(AppEventsConstants.EVENT_NAME_PURCHASED, purchaseLoggingParameters.getPurchaseAmount().doubleValue(), purchaseLoggingParameters.getCurrency())), System.currentTimeMillis(), true, pv.c(new Pair(purchaseLoggingParameters.getParam(), purchaseLoggingParameters.getOperationalData())));
        }
        return performDedupe;
    }

    private final List<PurchaseLoggingParameters> getPurchaseLoggingParameters(String str, String str2, Map<String, String> map, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            OperationalData operationalData = new OperationalData();
            if (billingClientVersion != null) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_AUTOLOG_IMPLEMENTATION, billingClientVersion.getType(), bundle, operationalData);
            }
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = jSONObject.getString("productId");
            string.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_ID, string, bundle, operationalData);
            String string2 = jSONObject.getString("productId");
            string2.getClass();
            companion.addParameter(operationalDataEnum, AppEventsConstants.EVENT_PARAM_CONTENT_ID, string2, bundle, operationalData);
            companion.addParameter(operationalDataEnum, Constants.ANDROID_DYNAMIC_ADS_CONTENT_ID, "client_implicit", bundle, operationalData);
            String string3 = jSONObject.getString(Constants.GP_IAP_PURCHASE_TIME);
            string3.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_PURCHASE_TIME, string3, bundle, operationalData);
            String string4 = jSONObject.getString("purchaseToken");
            string4.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_PURCHASE_TOKEN, string4, bundle, operationalData);
            String optString = jSONObject.optString("packageName");
            optString.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_PACKAGE_NAME, optString, bundle, operationalData);
            String optString2 = jSONObject2.optString("title");
            optString2.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_TITLE, optString2, bundle, operationalData);
            String optString3 = jSONObject2.optString("description");
            optString3.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_DESCRIPTION, optString3, bundle, operationalData);
            String optString4 = jSONObject2.optString("type");
            optString4.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_TYPE, optString4, bundle, operationalData);
            String specificBillingLibraryVersion = InAppPurchaseManager.getSpecificBillingLibraryVersion();
            if (specificBillingLibraryVersion != null) {
                companion.addParameter(operationalDataEnum, Constants.IAP_BILLING_LIBRARY_VERSION, specificBillingLibraryVersion, bundle, operationalData);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, entry.getKey(), entry.getValue(), bundle, operationalData);
            }
            if (jSONObject2.has(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4)) {
                return qv.h(getPurchaseParametersGPBLV2V4(optString4, bundle, operationalData, jSONObject, jSONObject2));
            }
            if (!jSONObject2.has(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS) && !jSONObject2.has(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS)) {
                return null;
            }
            return getPurchaseParametersGPBLV5V7(optString4, bundle, operationalData, jSONObject2);
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing in-app purchase/subscription data.", e);
            return null;
        } catch (Exception e2) {
            Log.e(TAG, "Failed to get purchase logging parameters,", e2);
            return null;
        }
    }

    private final PurchaseLoggingParameters getPurchaseParametersGPBLV2V4(String str, Bundle bundle, OperationalData operationalData, JSONObject jSONObject, JSONObject jSONObject2) {
        Bundle bundle2;
        OperationalData operationalData2;
        if (Intrinsics.b(str, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String bool = Boolean.toString(jSONObject.optBoolean(Constants.GP_IAP_AUTORENEWING, false));
            bool.getClass();
            bundle2 = bundle;
            operationalData2 = operationalData;
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, bool, bundle2, operationalData2);
            String optString = jSONObject2.optString(Constants.GP_IAP_SUBSCRIPTION_PERIOD);
            optString.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_PERIOD, optString, bundle2, operationalData2);
            String optString2 = jSONObject2.optString(Constants.GP_IAP_FREE_TRIAL_PERIOD);
            optString2.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_FREE_TRIAL_PERIOD, optString2, bundle2, operationalData2);
            String optString3 = jSONObject2.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_CYCLES);
            optString3.getClass();
            if (optString3.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PRICE_CYCLES, optString3, bundle2, operationalData2);
            }
            String optString4 = jSONObject2.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_PERIOD);
            optString4.getClass();
            if (optString4.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PERIOD, optString4, bundle2, operationalData2);
            }
            String optString5 = jSONObject2.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_AMOUNT_MICROS);
            optString5.getClass();
            if (optString5.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, optString5, bundle2, operationalData2);
            }
        } else {
            bundle2 = bundle;
            operationalData2 = operationalData;
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4) / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V2V4));
        currency.getClass();
        return new PurchaseLoggingParameters(bigDecimal, currency, bundle2, operationalData2);
    }

    private final List<PurchaseLoggingParameters> getPurchaseParametersGPBLV5V7(String str, Bundle bundle, OperationalData operationalData, JSONObject jSONObject) {
        if (!Intrinsics.b(str, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS);
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7) / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7));
            currency.getClass();
            return qv.h(new PurchaseLoggingParameters(bigDecimal, currency, bundle, operationalData));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS);
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS).getJSONObject(i);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            OperationalData copy = operationalData.copy();
            String string = jSONObject3.getString(Constants.GP_IAP_BASE_PLAN_ID);
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            string.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_BASE_PLAN, string, bundle2, copy);
            JSONObject jSONObject4 = jSONObject3.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES).getJSONObject(r10.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String optString = jSONObject4.optString(Constants.GP_IAP_BILLING_PERIOD);
            optString.getClass();
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_PERIOD, optString, bundle2, copy);
            if (!jSONObject4.has(Constants.GP_IAP_RECURRENCE_MODE) || jSONObject4.getInt(Constants.GP_IAP_RECURRENCE_MODE) == 3) {
                companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, "false", bundle2, copy);
            } else {
                companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, bundle2, copy);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7) / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7));
            currency2.getClass();
            arrayList.add(new PurchaseLoggingParameters(bigDecimal2, currency2, bundle2, copy));
        }
        return arrayList;
    }

    public static final synchronized Bundle getSubscriptionDedupeParameters(List<PurchaseLoggingParameters> list, String str) {
        Bundle performDedupe;
        synchronized (AutomaticAnalyticsLogger.class) {
            try {
                list.getClass();
                str.getClass();
                ArrayList arrayList = new ArrayList();
                for (PurchaseLoggingParameters purchaseLoggingParameters : list) {
                    arrayList.add(new InAppPurchase(str, purchaseLoggingParameters.getPurchaseAmount().doubleValue(), purchaseLoggingParameters.getCurrency()));
                }
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList(rv.l(list, 10));
                for (PurchaseLoggingParameters purchaseLoggingParameters2 : list) {
                    arrayList2.add(new Pair(purchaseLoggingParameters2.getParam(), purchaseLoggingParameters2.getOperationalData()));
                }
                performDedupe = InAppPurchaseManager.performDedupe(arrayList, currentTimeMillis, true, arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return performDedupe;
    }

    public static final boolean isImplicitPurchaseLoggingEnabled() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return appSettingsWithoutQuery != null && FacebookSdk.getAutoLogAppEventsEnabled() && appSettingsWithoutQuery.getIAPAutomaticLoggingEnabled();
    }

    public static final void logActivateAppEvent() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            if (applicationContext instanceof Application) {
                AppEventsLogger.Companion.activateApp((Application) applicationContext, applicationId);
            } else {
                Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void logActivityTimeSpentEvent(String str, long j) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
        if (queryAppSettings == null || !queryAppSettings.getAutomaticLoggingEnabled() || j <= 0) {
            return;
        }
        InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence(Constants.AA_TIME_SPENT_SCREEN_PARAMETER_NAME, str);
        internalAppEventsLogger2.logEvent(Constants.AA_TIME_SPENT_EVENT_NAME, j, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void logPurchase(String str, String str2, boolean z, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z2) {
        List<PurchaseLoggingParameters> purchaseLoggingParameters;
        String str3;
        String str4;
        str.getClass();
        str2.getClass();
        if (!isImplicitPurchaseLoggingEnabled() || (purchaseLoggingParameters = INSTANCE.getPurchaseLoggingParameters(str, str2, billingClientVersion)) == null || purchaseLoggingParameters.isEmpty()) {
            return;
        }
        if (z && FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_IF_AUTO_LOG_SUBS, FacebookSdk.getApplicationId(), false)) {
            str4 = z2 ? Constants.EVENT_NAME_SUBSCRIPTION_RESTORED : InAppPurchaseEventManager.INSTANCE.hasFreeTrialPeirod(str2) ? AppEventsConstants.EVENT_NAME_START_TRIAL : AppEventsConstants.EVENT_NAME_SUBSCRIBE;
        } else {
            if (!z2) {
                str3 = AppEventsConstants.EVENT_NAME_PURCHASED;
                InAppPurchaseDedupeConfig.INSTANCE.addDedupeParameters((z || !FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitSubsDedupe)) ? (z && FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe)) ? getPurchaseDedupeParameters(purchaseLoggingParameters) : null : getSubscriptionDedupeParameters(purchaseLoggingParameters, str3), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
                if (str3.equals(AppEventsConstants.EVENT_NAME_PURCHASED)) {
                    internalAppEventsLogger.logEventImplicitly(str3, purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
                    return;
                } else {
                    internalAppEventsLogger.logPurchaseImplicitly(purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
                    return;
                }
            }
            str4 = Constants.EVENT_NAME_PURCHASE_RESTORED;
        }
        str3 = str4;
        InAppPurchaseDedupeConfig.INSTANCE.addDedupeParameters((z || !FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitSubsDedupe)) ? (z && FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe)) ? getPurchaseDedupeParameters(purchaseLoggingParameters) : null : getSubscriptionDedupeParameters(purchaseLoggingParameters, str3), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
        if (str3.equals(AppEventsConstants.EVENT_NAME_PURCHASED)) {
        }
    }

    public static /* synthetic */ void logPurchase$default(String str, String str2, boolean z, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        logPurchase(str, str2, z, billingClientVersion, z2);
    }

    private final List<PurchaseLoggingParameters> getPurchaseLoggingParameters(String str, String str2, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        return getPurchaseLoggingParameters(str, str2, new HashMap(), billingClientVersion);
    }
}
