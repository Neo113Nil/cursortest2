package com.appsflyer.unity;

import android.util.Log;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.MediationNetwork;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.api.Store;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.models.InAppPurchaseValidationResult;
import com.appsflyer.internal.models.ProductPurchase;
import com.appsflyer.internal.models.SubscriptionPurchase;
import com.appsflyer.internal.models.SubscriptionValidationResult;
import com.appsflyer.internal.models.ValidationFailureData;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import com.appsflyer.unity.AppsFlyerAndroidWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.unity3d.player.UnityPlayer;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppsFlyerAndroidWrapper {
    private static final long DDL_TIMEOUT_DEFAULT = 3000;
    private static final String ERROR_CALLBACK = "didReceivePurchaseRevenueError";
    private static final String GCD_CALLBACK = "onConversionDataSuccess";
    private static final String GCD_ERROR_CALLBACK = "onConversionDataFail";
    private static final String GENERATE_LINK_CALLBACK = "onInviteLinkGenerated";
    private static final String GENERATE_LINK_ERROR_CALLBACK = "onInviteLinkGeneratedFailure";
    private static final String IN_APP_RESPONSE_CALLBACK = "inAppResponseReceived";
    private static final String OAOA_CALLBACK = "onAppOpenAttribution";
    private static final String OAOA_ERROR_CALLBACK = "onAppOpenAttributionFailure";
    private static final String ON_DEEPLINKING = "onDeepLinking";
    private static final String PLUGIN_VERSION = "6.17.0";
    private static final String START_REQUEST_CALLBACK = "requestResponseReceived";
    private static final String VALIDATE_AND_LOG_V2_CALLBACK = "onValidateAndLogComplete";
    private static final String VALIDATE_AND_LOG_V2__ERROR_CALLBACK = "onValidateAndLogFailure";
    private static final String VALIDATE_CALLBACK = "didFinishValidateReceipt";
    private static final String VALIDATE_ERROR_CALLBACK = "didFinishValidateReceiptWithError";
    private static final String VALIDATION_CALLBACK = "didReceivePurchaseRevenueValidationInfo";
    private static PurchaseClient.Builder builder = null;
    private static AppsFlyerConversionListener conversionListener = null;
    private static long ddlTimeout = 3000;
    private static String devkey = "";
    private static PurchaseClient purchaseClientInstance;
    private static String unityObjectName;

    /* renamed from: com.appsflyer.unity.AppsFlyerAndroidWrapper$10, reason: invalid class name */
    class AnonymousClass10 implements PurchaseClient.InAppPurchaseValidationResultListener {
        AnonymousClass10() {
        }

        public static /* synthetic */ void a(String str, InAppPurchaseValidationResult inAppPurchaseValidationResult) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("token", str);
            hashMap.put("success", inAppPurchaseValidationResult.getSuccess() ? com.ironsource.mediationsdk.metadata.a.f17681g : "false");
            if (inAppPurchaseValidationResult.getSuccess()) {
                ProductPurchase productPurchase = inAppPurchaseValidationResult.getProductPurchase();
                hashMap2.put("productId", productPurchase.getProductId());
                hashMap2.put("purchaseState", Integer.valueOf(productPurchase.getPurchaseState()));
                hashMap2.put("kind", productPurchase.getKind());
                hashMap2.put("purchaseTimeMillis", productPurchase.getPurchaseTimeMillis());
                hashMap2.put("consumptionState", Integer.valueOf(productPurchase.getConsumptionState()));
                hashMap2.put("developerPayload", productPurchase.getDeveloperPayload());
                hashMap2.put("orderId", productPurchase.getOrderId());
                hashMap2.put("purchaseType", Integer.valueOf(productPurchase.getPurchaseType()));
                hashMap2.put("acknowledgementState", Integer.valueOf(productPurchase.getAcknowledgementState()));
                hashMap2.put("purchaseToken", productPurchase.getPurchaseToken());
                hashMap2.put(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(productPurchase.getQuantity()));
                hashMap2.put("obfuscatedExternalAccountId", productPurchase.getObfuscatedExternalAccountId());
                hashMap2.put("obfuscatedExternalProfileId", productPurchase.getObfuscatedExternalProfileId());
                hashMap2.put("regionCode", productPurchase.getRegionCode());
                hashMap.put("productPurchase", hashMap2);
            } else {
                ValidationFailureData failureData = inAppPurchaseValidationResult.getFailureData();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("status", Integer.valueOf(failureData.getStatus()));
                hashMap3.put("description", failureData.getDescription());
                hashMap.put("failureData", hashMap3);
            }
            UnityPlayer.UnitySendMessage(AppsFlyerAndroidWrapper.unityObjectName, AppsFlyerAndroidWrapper.VALIDATION_CALLBACK, new JSONObject(hashMap).toString());
        }

        @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
        public void onFailure(String str, Throwable th) {
            if (AppsFlyerAndroidWrapper.unityObjectName != null) {
                UnityPlayer.UnitySendMessage(AppsFlyerAndroidWrapper.unityObjectName, AppsFlyerAndroidWrapper.ERROR_CALLBACK, str);
            }
        }

        @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
        public void onResponse(Map<String, ? extends InAppPurchaseValidationResult> map) {
            if (AppsFlyerAndroidWrapper.unityObjectName == null || map == null) {
                return;
            }
            map.forEach(new BiConsumer() { // from class: com.appsflyer.unity.a
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AppsFlyerAndroidWrapper.AnonymousClass10.a((String) obj, (InAppPurchaseValidationResult) obj2);
                }
            });
        }
    }

    /* renamed from: com.appsflyer.unity.AppsFlyerAndroidWrapper$9, reason: invalid class name */
    class AnonymousClass9 implements PurchaseClient.SubscriptionPurchaseValidationResultListener {
        AnonymousClass9() {
        }

        public static /* synthetic */ void a(String str, SubscriptionValidationResult subscriptionValidationResult) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("productId", str);
            hashMap.put("success", subscriptionValidationResult.getSuccess() ? com.ironsource.mediationsdk.metadata.a.f17681g : "false");
            if (subscriptionValidationResult.getSuccess()) {
                SubscriptionPurchase subscriptionPurchase = subscriptionValidationResult.getSubscriptionPurchase();
                HashMap hashMap3 = new HashMap();
                if (subscriptionPurchase.getCanceledStateContext() != null) {
                    HashMap hashMap4 = new HashMap();
                    HashMap hashMap5 = new HashMap();
                    if (subscriptionPurchase.getCanceledStateContext().getUserInitiatedCancellation() != null) {
                        if (subscriptionPurchase.getCanceledStateContext().getUserInitiatedCancellation().getCancelSurveyResult() != null) {
                            hashMap3.put("reason", subscriptionPurchase.getCanceledStateContext().getUserInitiatedCancellation().getCancelSurveyResult().getReason());
                            hashMap3.put("reasonUserInput", subscriptionPurchase.getCanceledStateContext().getUserInitiatedCancellation().getCancelSurveyResult().getReasonUserInput());
                            hashMap5.put("cancelSurveyResult", hashMap3);
                        }
                        hashMap5.put("cancelTime", subscriptionPurchase.getCanceledStateContext().getUserInitiatedCancellation().getCancelTime());
                    }
                    hashMap4.put("developerInitiatedCancellation", null);
                    hashMap4.put("replacementCancellation", null);
                    hashMap4.put("systemInitiatedCancellation", null);
                    hashMap4.put("userInitiatedCancellation", hashMap5);
                }
                if (subscriptionPurchase.getExternalAccountIdentifiers() != null) {
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put("externalAccountId", subscriptionPurchase.getExternalAccountIdentifiers().getExternalAccountId());
                    hashMap6.put("obfuscatedExternalAccountId", subscriptionPurchase.getExternalAccountIdentifiers().getObfuscatedExternalAccountId());
                    hashMap6.put("obfuscatedExternalProfileId", subscriptionPurchase.getExternalAccountIdentifiers().getObfuscatedExternalProfileId());
                    hashMap2.put("externalAccountIdentifiers", hashMap6);
                }
                if (subscriptionPurchase.getPausedStateContext() != null) {
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put("autoResumeTime", subscriptionPurchase.getPausedStateContext().getAutoResumeTime());
                    hashMap2.put("pausedStateContext", hashMap7);
                }
                if (subscriptionPurchase.getSubscribeWithGoogleInfo() != null) {
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put("emailAddress", subscriptionPurchase.getSubscribeWithGoogleInfo().getEmailAddress());
                    hashMap8.put("familyName", subscriptionPurchase.getSubscribeWithGoogleInfo().getFamilyName());
                    hashMap8.put("givenName", subscriptionPurchase.getSubscribeWithGoogleInfo().getGivenName());
                    hashMap8.put("profileId", subscriptionPurchase.getSubscribeWithGoogleInfo().getProfileId());
                    hashMap8.put("profileName", subscriptionPurchase.getSubscribeWithGoogleInfo().getProfileName());
                    hashMap2.put("subscribeWithGoogleInfo", hashMap8);
                }
                int size = subscriptionPurchase.getLineItems().size();
                Map[] mapArr = new Map[size];
                for (int i4 = 0; i4 < size; i4++) {
                    HashMap hashMap9 = new HashMap();
                    hashMap9.put("expiryTime", subscriptionPurchase.getLineItems().get(i4).getExpiryTime());
                    hashMap9.put("productId", subscriptionPurchase.getLineItems().get(i4).getProductId());
                    if (subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan() != null) {
                        HashMap hashMap10 = new HashMap();
                        if (subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getAutoRenewEnabled() != null) {
                            hashMap10.put("autoRenewEnabled", subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getAutoRenewEnabled().booleanValue() ? com.ironsource.mediationsdk.metadata.a.f17681g : "false");
                        }
                        if (subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getPriceChangeDetails() != null) {
                            HashMap hashMap11 = new HashMap();
                            hashMap11.put("expectedNewPriceChargeTime", subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getPriceChangeDetails().getExpectedNewPriceChargeTime());
                            hashMap11.put("priceChangeMode", subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getPriceChangeDetails().getPriceChangeMode());
                            hashMap11.put("priceChangeState", subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getPriceChangeDetails().getPriceChangeState());
                            hashMap10.put("priceChangeDetails", hashMap11);
                            if (subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getPriceChangeDetails().getNewPrice() != null) {
                                HashMap hashMap12 = new HashMap();
                                hashMap12.put(AppsFlyerProperties.CURRENCY_CODE, subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getPriceChangeDetails().getNewPrice().getCurrencyCode());
                                hashMap12.put("nanos", Long.valueOf(subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getPriceChangeDetails().getNewPrice().getNanos()));
                                hashMap12.put("units", Long.valueOf(subscriptionPurchase.getLineItems().get(i4).getAutoRenewingPlan().getPriceChangeDetails().getNewPrice().getUnits()));
                                hashMap11.put("newPrice", hashMap12);
                            }
                        }
                        hashMap9.put("autoRenewingPlan", hashMap10);
                    }
                    if (subscriptionPurchase.getLineItems().get(i4).getOfferDetails() != null) {
                        HashMap hashMap13 = new HashMap();
                        hashMap13.put("basePlanId", subscriptionPurchase.getLineItems().get(i4).getOfferDetails().getBasePlanId());
                        if (subscriptionPurchase.getLineItems().get(i4).getOfferDetails().getOfferId() != null) {
                            hashMap13.put("offerId", subscriptionPurchase.getLineItems().get(i4).getOfferDetails().getOfferId());
                        }
                        hashMap9.put("offerDetails", hashMap13);
                    }
                    if (subscriptionPurchase.getLineItems().get(i4).getDeferredItemReplacement() != null) {
                        HashMap hashMap14 = new HashMap();
                        hashMap14.put("productId", subscriptionPurchase.getLineItems().get(i4).getDeferredItemReplacement().getProductId());
                        hashMap9.put("deferredItemReplacement", hashMap14);
                    }
                    if (subscriptionPurchase.getLineItems().get(i4).getPrepaidPlan() != null && subscriptionPurchase.getLineItems().get(i4).getPrepaidPlan().getAllowExtendAfterTime() != null) {
                        HashMap hashMap15 = new HashMap();
                        hashMap15.put("allowExtendAfterTime", subscriptionPurchase.getLineItems().get(i4).getPrepaidPlan().getAllowExtendAfterTime());
                        hashMap9.put("prepaidPlan", hashMap15);
                    }
                    mapArr[i4] = hashMap9;
                }
                hashMap2.put("lineItems", mapArr);
                hashMap2.put("acknowledgementState", subscriptionPurchase.getAcknowledgementState());
                hashMap2.put("canceledStateContext", subscriptionPurchase.getCanceledStateContext());
                hashMap2.put("kind", subscriptionPurchase.getKind());
                hashMap2.put("latestOrderId", subscriptionPurchase.getLatestOrderId());
                hashMap2.put("linkedPurchaseToken", subscriptionPurchase.getLinkedPurchaseToken());
                hashMap2.put("regionCode", subscriptionPurchase.getRegionCode());
                hashMap2.put("subscriptionState", subscriptionPurchase.getSubscriptionState());
                hashMap2.put("testPurchase", null);
                hashMap2.put("startTime", subscriptionPurchase.getStartTime());
                hashMap.put("subscriptionPurchase", hashMap2);
            } else {
                ValidationFailureData failureData = subscriptionValidationResult.getFailureData();
                HashMap hashMap16 = new HashMap();
                hashMap16.put("status", Integer.valueOf(failureData.getStatus()));
                hashMap16.put("description", failureData.getDescription());
                hashMap.put("failureData", hashMap16);
            }
            UnityPlayer.UnitySendMessage(AppsFlyerAndroidWrapper.unityObjectName, AppsFlyerAndroidWrapper.VALIDATION_CALLBACK, new JSONObject(hashMap).toString());
        }

        @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
        public void onFailure(String str, Throwable th) {
            if (AppsFlyerAndroidWrapper.unityObjectName != null) {
                UnityPlayer.UnitySendMessage(AppsFlyerAndroidWrapper.unityObjectName, AppsFlyerAndroidWrapper.ERROR_CALLBACK, str);
            }
        }

        @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
        public void onResponse(Map<String, ? extends SubscriptionValidationResult> map) {
            if (AppsFlyerAndroidWrapper.unityObjectName == null || map == null) {
                return;
            }
            map.forEach(new BiConsumer() { // from class: com.appsflyer.unity.b
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AppsFlyerAndroidWrapper.AnonymousClass9.a((String) obj, (SubscriptionValidationResult) obj2);
                }
            });
        }
    }

    public static void addPushNotificationDeepLinkPath(String... strArr) {
        AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath(strArr);
    }

    public static void attributeAndOpenStore(String str, String str2, Map<String, String> map) {
        CrossPromotionHelper.logAndOpenStore(UnityPlayer.currentActivity, str, str2, map);
    }

    public static void build() {
        PurchaseClient.Builder builder2 = builder;
        if (builder2 != null) {
            purchaseClientInstance = builder2.build();
        } else {
            Log.w("AppsFlyer_Connector", "[PurchaseConnector]: Initialization is required prior to building.");
        }
    }

    public static void createOneLinkInviteListener(Map<String, String> map, final String str) {
        LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(UnityPlayer.currentActivity);
        generateInviteUrl.setChannel(map.get(AppsFlyerProperties.CHANNEL));
        generateInviteUrl.setCampaign(map.get("campaign"));
        generateInviteUrl.setReferrerName(map.get("referrerName"));
        generateInviteUrl.setReferrerImageURL(map.get("referrerImageUrl"));
        generateInviteUrl.setReferrerCustomerId(map.get("customerID"));
        generateInviteUrl.setBaseDeeplink(map.get("baseDeepLink"));
        generateInviteUrl.setBrandDomain(map.get("brandDomain"));
        map.remove(AppsFlyerProperties.CHANNEL);
        map.remove("campaign");
        map.remove("referrerName");
        map.remove("referrerImageUrl");
        map.remove("customerID");
        map.remove("baseDeepLink");
        map.remove("brandDomain");
        generateInviteUrl.addParameters(map);
        generateInviteUrl.generateLink(UnityPlayer.currentActivity, new LinkGenerator.ResponseListener() { // from class: com.appsflyer.unity.AppsFlyerAndroidWrapper.6
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponse(String str2) {
                String str3 = str;
                if (str3 != null) {
                    UnityPlayer.UnitySendMessage(str3, AppsFlyerAndroidWrapper.GENERATE_LINK_CALLBACK, str2);
                }
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponseError(String str2) {
                String str3 = str;
                if (str3 != null) {
                    UnityPlayer.UnitySendMessage(str3, AppsFlyerAndroidWrapper.GENERATE_LINK_ERROR_CALLBACK, str2);
                }
            }
        });
    }

    public static void enableFacebookDeferredApplinks(boolean z4) {
        AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(z4);
    }

    public static void enableTCFDataCollection(boolean z4) {
        AppsFlyerLib.getInstance().enableTCFDataCollection(z4);
    }

    public static String getAppsFlyerId() {
        return AppsFlyerLib.getInstance().getAppsFlyerUID(UnityPlayer.currentActivity);
    }

    public static String getAttributionId() {
        return AppsFlyerLib.getInstance().getAttributionId(UnityPlayer.currentActivity);
    }

    public static void getConversionData(String str) {
        if (conversionListener == null) {
            conversionListener = getConversionListener(str);
        }
        AppsFlyerLib.getInstance().registerConversionListener(UnityPlayer.currentActivity, conversionListener);
    }

    private static AppsFlyerConversionListener getConversionListener(final String str) {
        return new AppsFlyerConversionListener() { // from class: com.appsflyer.unity.AppsFlyerAndroidWrapper.3
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                if (str != null) {
                    UnityPlayer.UnitySendMessage(str, AppsFlyerAndroidWrapper.OAOA_CALLBACK, new JSONObject(map).toString());
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str2) {
                String str3 = str;
                if (str3 != null) {
                    UnityPlayer.UnitySendMessage(str3, AppsFlyerAndroidWrapper.OAOA_ERROR_CALLBACK, str2);
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str2) {
                String str3 = str;
                if (str3 != null) {
                    UnityPlayer.UnitySendMessage(str3, AppsFlyerAndroidWrapper.GCD_ERROR_CALLBACK, str2);
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                if (str != null) {
                    UnityPlayer.UnitySendMessage(str, AppsFlyerAndroidWrapper.GCD_CALLBACK, new JSONObject(map).toString());
                }
            }
        };
    }

    public static String getHostName() {
        return AppsFlyerLib.getInstance().getHostName();
    }

    public static String getHostPrefix() {
        return AppsFlyerLib.getInstance().getHostPrefix();
    }

    public static String getOutOfStore() {
        return AppsFlyerLib.getInstance().getOutOfStore(UnityPlayer.currentActivity);
    }

    public static String getSdkVersion() {
        return AppsFlyerLib.getInstance().getSdkVersion();
    }

    public static void handlePushNotifications() {
        AppsFlyerLib.getInstance().sendPushNotificationData(UnityPlayer.currentActivity);
    }

    public static void initInAppPurchaseValidatorListener(final String str) {
        AppsFlyerLib.getInstance().registerValidatorListener(UnityPlayer.currentActivity, new AppsFlyerInAppPurchaseValidatorListener() { // from class: com.appsflyer.unity.AppsFlyerAndroidWrapper.4
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInApp() {
                String str2 = str;
                if (str2 != null) {
                    UnityPlayer.UnitySendMessage(str2, AppsFlyerAndroidWrapper.VALIDATE_CALLBACK, "Validate success");
                }
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInAppFailure(String str2) {
                String str3 = str;
                if (str3 != null) {
                    UnityPlayer.UnitySendMessage(str3, AppsFlyerAndroidWrapper.VALIDATE_ERROR_CALLBACK, str2);
                }
            }
        });
    }

    public static AppsFlyerInAppPurchaseValidationCallback initInAppPurchaseValidatorV2Listener(final String str) {
        return new AppsFlyerInAppPurchaseValidationCallback() { // from class: com.appsflyer.unity.AppsFlyerAndroidWrapper.5
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidationCallback
            public void onInAppPurchaseValidationError(Map<String, ?> map) {
                if (str != null) {
                    UnityPlayer.UnitySendMessage(str, AppsFlyerAndroidWrapper.VALIDATE_AND_LOG_V2__ERROR_CALLBACK, new JSONObject(map).toString());
                }
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidationCallback
            public void onInAppPurchaseValidationFinished(Map<String, ?> map) {
                if (str != null) {
                    UnityPlayer.UnitySendMessage(str, AppsFlyerAndroidWrapper.VALIDATE_AND_LOG_V2_CALLBACK, new JSONObject(map).toString());
                }
            }
        };
    }

    public static void initPurchaseConnector(String str, int i4) {
        unityObjectName = str;
        Store mappingEnum = mappingEnum(i4);
        if (mappingEnum == null) {
            Log.w("AppsFlyer_Connector", "[PurchaseConnector]: Please choose a valid store.");
            return;
        }
        PurchaseClient.Builder builder2 = new PurchaseClient.Builder(UnityPlayer.currentActivity, mappingEnum);
        builder = builder2;
        builder = PurchaseRevenueBridge.configurePurchaseClient(builder2);
    }

    public static void initSDK(String str, String str2) {
        if (conversionListener == null && str2 != null) {
            conversionListener = getConversionListener(str2);
        }
        devkey = str;
        setPluginInfo();
        AppsFlyerLib.getInstance().init(str, conversionListener, UnityPlayer.currentActivity);
    }

    public static boolean isPreInstalledApp() {
        return AppsFlyerLib.getInstance().isPreInstalledApp(UnityPlayer.currentActivity);
    }

    public static boolean isTrackingStopped() {
        return AppsFlyerLib.getInstance().isStopped();
    }

    public static void logAdRevenue(String str, MediationNetwork mediationNetwork, String str2, double d4, HashMap<String, Object> hashMap) {
        AppsFlyerLib.getInstance().logAdRevenue(new AFAdRevenueData(str, mediationNetwork, str2, d4), hashMap);
    }

    private static Store mappingEnum(int i4) {
        if (i4 != 0) {
            return null;
        }
        return Store.GOOGLE;
    }

    private static Boolean parseNullableBoolean(String str) {
        if (str == null) {
            return null;
        }
        if (str.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f17681g)) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static void recordCrossPromoteImpression(String str, String str2, Map<String, String> map) {
        CrossPromotionHelper.logCrossPromoteImpression(UnityPlayer.currentActivity, str, str2, map);
    }

    public static void setAdditionalData(HashMap<String, Object> hashMap) {
        AppsFlyerLib.getInstance().setAdditionalData(hashMap);
    }

    public static void setAndroidIdData(String str) {
        AppsFlyerLib.getInstance().setAndroidIdData(str);
    }

    public static void setAppInviteOneLinkID(String str) {
        AppsFlyerLib.getInstance().setAppInviteOneLink(str);
    }

    public static void setAutoLogInApps(boolean z4) {
        PurchaseClient.Builder builder2 = builder;
        if (builder2 != null) {
            builder2.autoLogInApps(z4);
        }
    }

    public static void setAutoLogSubscriptions(boolean z4) {
        PurchaseClient.Builder builder2 = builder;
        if (builder2 != null) {
            builder2.logSubscriptions(z4);
        }
    }

    public static void setCollectAndroidID(boolean z4) {
        AppsFlyerLib.getInstance().setCollectAndroidID(z4);
    }

    public static void setCollectIMEI(boolean z4) {
        AppsFlyerLib.getInstance().setCollectIMEI(z4);
    }

    public static void setCollectOaid(boolean z4) {
        AppsFlyerLib.getInstance().setCollectOaid(z4);
    }

    public static void setConsentData(String str, String str2, String str3, String str4) {
        AppsFlyerLib.getInstance().setConsentData(new AppsFlyerConsent(parseNullableBoolean(str), parseNullableBoolean(str2), parseNullableBoolean(str3), parseNullableBoolean(str4)));
    }

    public static void setConsumeAFDeepLinks(boolean z4) {
    }

    public static void setCurrencyCode(String str) {
        AppsFlyerLib.getInstance().setCurrencyCode(str);
    }

    public static void setCustomerIdAndTrack(String str) {
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession(str, UnityPlayer.currentActivity);
    }

    public static void setCustomerUserId(String str) {
        AppsFlyerLib.getInstance().setCustomerUserId(str);
    }

    public static void setDeepLinkTimeout(long j4) {
        ddlTimeout = j4;
    }

    public static void setDeviceTrackingDisabled(boolean z4) {
        AppsFlyerLib.getInstance().anonymizeUser(z4);
    }

    public static void setDisableAdvertisingIdentifiers(boolean z4) {
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(z4);
    }

    public static void setDisableNetworkData(boolean z4) {
        AppsFlyerLib.getInstance().setDisableNetworkData(z4);
    }

    public static void setHost(String str, String str2) {
        AppsFlyerLib.getInstance().setHost(str, str2);
    }

    public static void setImeiData(String str) {
        AppsFlyerLib.getInstance().setImeiData(str);
    }

    public static void setIsDebug(boolean z4) {
        AppsFlyerLib.getInstance().setDebugLog(z4);
    }

    public static void setIsSandbox(boolean z4) {
        PurchaseClient.Builder builder2 = builder;
        if (builder2 != null) {
            builder2.setSandbox(z4);
        }
    }

    public static void setIsUpdate(boolean z4) {
        AppsFlyerLib.getInstance().setIsUpdate(z4);
    }

    public static void setLogLevel(AFLogger.LogLevel logLevel) {
        AppsFlyerLib.getInstance().setLogLevel(logLevel);
    }

    public static void setMinTimeBetweenSessions(int i4) {
        AppsFlyerLib.getInstance().setMinTimeBetweenSessions(i4);
    }

    public static void setOneLinkCustomDomain(String... strArr) {
        AppsFlyerLib.getInstance().setOneLinkCustomDomain(strArr);
    }

    public static void setOutOfStore(String str) {
        AppsFlyerLib.getInstance().setOutOfStore(str);
    }

    public static void setPhoneNumber(String str) {
        AppsFlyerLib.getInstance().setPhoneNumber(str);
    }

    public static void setPluginInfo() {
        AppsFlyerLib.getInstance().setPluginInfo(new PluginInfo(Plugin.UNITY, PLUGIN_VERSION));
    }

    public static void setPreinstallAttribution(String str, String str2, String str3) {
        AppsFlyerLib.getInstance().setPreinstallAttribution(str, str2, str3);
    }

    public static void setPurchaseRevenueValidationListeners(boolean z4) {
        PurchaseClient.Builder builder2 = builder;
        if (builder2 == null || !z4) {
            return;
        }
        builder2.setSubscriptionValidationResultListener(new AnonymousClass9());
        builder.setInAppValidationResultListener(new AnonymousClass10());
    }

    public static void setResolveDeepLinkURLs(String... strArr) {
        AppsFlyerLib.getInstance().setResolveDeepLinkURLs(strArr);
    }

    public static void setSharingFilter(String... strArr) {
        AppsFlyerLib.getInstance().setSharingFilter(strArr);
    }

    public static void setSharingFilterForAllPartners() {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
    }

    public static void setSharingFilterForPartners(String... strArr) {
        AppsFlyerLib.getInstance().setSharingFilterForPartners(strArr);
    }

    public static void setUserEmails(String... strArr) {
        AppsFlyerLib.getInstance().setUserEmails(strArr);
    }

    public static void startObservingTransactions() {
        PurchaseClient purchaseClient = purchaseClientInstance;
        if (purchaseClient != null) {
            purchaseClient.startObservingTransactions();
        } else {
            Log.w("AppsFlyer_Connector", "[PurchaseConnector]: startObservingTransactions was not called because the purchase client instance is null, please call build() prior to this function.");
        }
    }

    public static void startTracking(final boolean z4, final String str) {
        AppsFlyerLib.getInstance().start(UnityPlayer.currentActivity, devkey, new AppsFlyerRequestListener() { // from class: com.appsflyer.unity.AppsFlyerAndroidWrapper.1
            @Override // com.appsflyer.attribution.AppsFlyerRequestListener
            public void onError(int i4, String str2) {
                if (!z4 || str == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i4));
                hashMap.put("errorDescription", str2);
                UnityPlayer.UnitySendMessage(str, AppsFlyerAndroidWrapper.START_REQUEST_CALLBACK, new JSONObject(hashMap).toString());
            }

            @Override // com.appsflyer.attribution.AppsFlyerRequestListener
            public void onSuccess() {
                if (!z4 || str == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, 200);
                UnityPlayer.UnitySendMessage(str, AppsFlyerAndroidWrapper.START_REQUEST_CALLBACK, new JSONObject(hashMap).toString());
            }
        });
    }

    public static void stopObservingTransactions() {
        PurchaseClient purchaseClient = purchaseClientInstance;
        if (purchaseClient != null) {
            purchaseClient.stopObservingTransactions();
        } else {
            Log.w("AppsFlyer_Connector", "[PurchaseConnector]: stopObservingTransactions was not called because the purchase client instance is null, please call build() prior to this function.");
        }
    }

    public static void stopTracking(boolean z4) {
        AppsFlyerLib.getInstance().stop(z4, UnityPlayer.currentActivity);
    }

    public static void subscribeForDeepLink(final String str) {
        if (ddlTimeout != DDL_TIMEOUT_DEFAULT) {
            AppsFlyerLib.getInstance().subscribeForDeepLink(new DeepLinkListener() { // from class: com.appsflyer.unity.AppsFlyerAndroidWrapper.7
                @Override // com.appsflyer.deeplink.DeepLinkListener
                public void onDeepLinking(DeepLinkResult deepLinkResult) {
                    String str2 = str;
                    if (str2 != null) {
                        UnityPlayer.UnitySendMessage(str2, AppsFlyerAndroidWrapper.ON_DEEPLINKING, deepLinkResult.toString());
                    }
                }
            }, ddlTimeout);
        } else {
            AppsFlyerLib.getInstance().subscribeForDeepLink(new DeepLinkListener() { // from class: com.appsflyer.unity.AppsFlyerAndroidWrapper.8
                @Override // com.appsflyer.deeplink.DeepLinkListener
                public void onDeepLinking(DeepLinkResult deepLinkResult) {
                    String str2 = str;
                    if (str2 != null) {
                        UnityPlayer.UnitySendMessage(str2, AppsFlyerAndroidWrapper.ON_DEEPLINKING, deepLinkResult.toString());
                    }
                }
            });
        }
    }

    public static void trackEvent(String str, HashMap<String, Object> hashMap, final boolean z4, final String str2) {
        AppsFlyerLib.getInstance().logEvent(UnityPlayer.currentActivity, str, hashMap, new AppsFlyerRequestListener() { // from class: com.appsflyer.unity.AppsFlyerAndroidWrapper.2
            @Override // com.appsflyer.attribution.AppsFlyerRequestListener
            public void onError(int i4, String str3) {
                if (!z4 || str2 == null) {
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i4));
                hashMap2.put("errorDescription", str3);
                UnityPlayer.UnitySendMessage(str2, AppsFlyerAndroidWrapper.IN_APP_RESPONSE_CALLBACK, new JSONObject(hashMap2).toString());
            }

            @Override // com.appsflyer.attribution.AppsFlyerRequestListener
            public void onSuccess() {
                if (!z4 || str2 == null) {
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, 200);
                UnityPlayer.UnitySendMessage(str2, AppsFlyerAndroidWrapper.IN_APP_RESPONSE_CALLBACK, new JSONObject(hashMap2).toString());
            }
        });
    }

    public static void trackLocation(double d4, double d5) {
        AppsFlyerLib.getInstance().logLocation(UnityPlayer.currentActivity, d4, d5);
    }

    public static void updateServerUninstallToken(String str) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(UnityPlayer.currentActivity, str);
    }

    public static void validateAndTrackInAppPurchase(String str, String str2, String str3, String str4, String str5, HashMap<String, String> hashMap, String str6) {
        AppsFlyerLib.getInstance().validateAndLogInAppPurchase(UnityPlayer.currentActivity, str, str2, str3, str4, str5, hashMap);
        if (str6 != null) {
            initInAppPurchaseValidatorListener(str6);
        }
    }

    public static void validateAndTrackInAppPurchaseV2(int i4, String str, String str2, String str3, String str4, HashMap<String, String> hashMap, String str5) {
        AFPurchaseDetails aFPurchaseDetails = new AFPurchaseDetails(i4 == 0 ? AFPurchaseType.SUBSCRIPTION : AFPurchaseType.ONE_TIME_PURCHASE, str, str2, str3, str4);
        if (str5 != null) {
            AppsFlyerLib.getInstance().validateAndLogInAppPurchase(aFPurchaseDetails, hashMap, initInAppPurchaseValidatorV2Listener(str5));
        }
    }

    public static void waitForCustomerUserId(boolean z4) {
        AppsFlyerLib.getInstance().waitForCustomerUserId(true);
    }

    public static void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, strArr);
    }

    public static void startTracking() {
        startTracking(false, null);
    }

    public static void trackEvent(String str, HashMap<String, Object> hashMap) {
        trackEvent(str, hashMap, false, null);
    }
}
