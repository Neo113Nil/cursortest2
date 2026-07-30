package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.installations.FirebaseInstallations;
import defpackage.af3;
import defpackage.bf3;
import defpackage.cf3;
import defpackage.df3;
import defpackage.dg3;
import defpackage.ef3;
import defpackage.ff3;
import defpackage.gf3;
import defpackage.hf3;
import defpackage.jt2;
import defpackage.km3;
import defpackage.ll3;
import defpackage.mi2;
import defpackage.tf3;
import defpackage.ze3;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final dg3 zzb;
    private ExecutorService zzc;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class Event {
        public static final String ADD_PAYMENT_INFO = "add_payment_info";
        public static final String ADD_SHIPPING_INFO = "add_shipping_info";
        public static final String ADD_TO_CART = "add_to_cart";
        public static final String ADD_TO_WISHLIST = "add_to_wishlist";
        public static final String AD_IMPRESSION = "ad_impression";
        public static final String APP_OPEN = "app_open";
        public static final String BEGIN_CHECKOUT = "begin_checkout";
        public static final String CAMPAIGN_DETAILS = "campaign_details";
        public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
        public static final String GENERATE_LEAD = "generate_lead";
        public static final String JOIN_GROUP = "join_group";
        public static final String LEVEL_END = "level_end";
        public static final String LEVEL_START = "level_start";
        public static final String LEVEL_UP = "level_up";
        public static final String LOGIN = "login";
        public static final String POST_SCORE = "post_score";
        public static final String PURCHASE = "purchase";
        public static final String REFUND = "refund";
        public static final String REMOVE_FROM_CART = "remove_from_cart";
        public static final String SCREEN_VIEW = "screen_view";
        public static final String SEARCH = "search";
        public static final String SELECT_CONTENT = "select_content";
        public static final String SELECT_ITEM = "select_item";
        public static final String SELECT_PROMOTION = "select_promotion";
        public static final String SHARE = "share";
        public static final String SIGN_UP = "sign_up";
        public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
        public static final String TUTORIAL_BEGIN = "tutorial_begin";
        public static final String TUTORIAL_COMPLETE = "tutorial_complete";
        public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";
        public static final String VIEW_CART = "view_cart";
        public static final String VIEW_ITEM = "view_item";
        public static final String VIEW_ITEM_LIST = "view_item_list";
        public static final String VIEW_PROMOTION = "view_promotion";
        public static final String VIEW_SEARCH_RESULTS = "view_search_results";
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class Param {
        public static final String ACHIEVEMENT_ID = "achievement_id";
        public static final String ACLID = "aclid";
        public static final String AD_FORMAT = "ad_format";
        public static final String AD_PLATFORM = "ad_platform";
        public static final String AD_SOURCE = "ad_source";
        public static final String AD_UNIT_NAME = "ad_unit_name";
        public static final String AFFILIATION = "affiliation";
        public static final String CAMPAIGN = "campaign";
        public static final String CAMPAIGN_ID = "campaign_id";
        public static final String CHARACTER = "character";
        public static final String CONTENT = "content";
        public static final String CONTENT_TYPE = "content_type";
        public static final String COUPON = "coupon";
        public static final String CP1 = "cp1";
        public static final String CREATIVE_FORMAT = "creative_format";
        public static final String CREATIVE_NAME = "creative_name";
        public static final String CREATIVE_SLOT = "creative_slot";
        public static final String CURRENCY = "currency";
        public static final String DESTINATION = "destination";
        public static final String DISCOUNT = "discount";
        public static final String END_DATE = "end_date";
        public static final String EXTEND_SESSION = "extend_session";
        public static final String FLIGHT_NUMBER = "flight_number";
        public static final String GROUP_ID = "group_id";
        public static final String INDEX = "index";
        public static final String ITEMS = "items";
        public static final String ITEM_BRAND = "item_brand";
        public static final String ITEM_CATEGORY = "item_category";
        public static final String ITEM_CATEGORY2 = "item_category2";
        public static final String ITEM_CATEGORY3 = "item_category3";
        public static final String ITEM_CATEGORY4 = "item_category4";
        public static final String ITEM_CATEGORY5 = "item_category5";
        public static final String ITEM_ID = "item_id";
        public static final String ITEM_LIST_ID = "item_list_id";
        public static final String ITEM_LIST_NAME = "item_list_name";
        public static final String ITEM_NAME = "item_name";
        public static final String ITEM_VARIANT = "item_variant";
        public static final String LEVEL = "level";
        public static final String LEVEL_NAME = "level_name";
        public static final String LOCATION = "location";
        public static final String LOCATION_ID = "location_id";
        public static final String MARKETING_TACTIC = "marketing_tactic";
        public static final String MEDIUM = "medium";
        public static final String METHOD = "method";
        public static final String NUMBER_OF_NIGHTS = "number_of_nights";
        public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";
        public static final String NUMBER_OF_ROOMS = "number_of_rooms";
        public static final String ORIGIN = "origin";
        public static final String PAYMENT_TYPE = "payment_type";
        public static final String PRICE = "price";
        public static final String PROMOTION_ID = "promotion_id";
        public static final String PROMOTION_NAME = "promotion_name";
        public static final String QUANTITY = "quantity";
        public static final String SCORE = "score";
        public static final String SCREEN_CLASS = "screen_class";
        public static final String SCREEN_NAME = "screen_name";
        public static final String SEARCH_TERM = "search_term";
        public static final String SHIPPING = "shipping";
        public static final String SHIPPING_TIER = "shipping_tier";
        public static final String SOURCE = "source";
        public static final String SOURCE_PLATFORM = "source_platform";
        public static final String START_DATE = "start_date";
        public static final String SUCCESS = "success";
        public static final String TAX = "tax";
        public static final String TERM = "term";
        public static final String TRANSACTION_ID = "transaction_id";
        public static final String TRAVEL_CLASS = "travel_class";
        public static final String VALUE = "value";
        public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class UserProperty {
        public static final String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";
        public static final String SIGN_UP_METHOD = "sign_up_method";
    }

    public FirebaseAnalytics(dg3 dg3Var) {
        ll3.v(dg3Var);
        this.zzb = dg3Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (zza == null) {
                        zza = new FirebaseAnalytics(dg3.e(context, null));
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static km3 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        dg3 e = dg3.e(context, bundle);
        if (e == null) {
            return null;
        }
        return new zzd(e);
    }

    private final ExecutorService zzb() {
        FirebaseAnalytics firebaseAnalytics;
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.zzc == null) {
                    firebaseAnalytics = this;
                    firebaseAnalytics.zzc = new zza(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                } else {
                    firebaseAnalytics = this;
                }
                executorService = firebaseAnalytics.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public jt2 getAppInstanceId() {
        try {
            return mi2.f(new zzb(this), zzb());
        } catch (RuntimeException e) {
            dg3 dg3Var = this.zzb;
            dg3Var.getClass();
            dg3Var.c(new hf3(dg3Var, "Failed to schedule task for getAppInstanceId", (Object) null));
            return mi2.i(e);
        }
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) mi2.e(FirebaseInstallations.getInstance().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public jt2 getSessionId() {
        try {
            return mi2.f(new zzc(this), zzb());
        } catch (RuntimeException e) {
            dg3 dg3Var = this.zzb;
            dg3Var.getClass();
            dg3Var.c(new hf3(dg3Var, "Failed to schedule task for getSessionId", (Object) null));
            return mi2.i(e);
        }
    }

    public void logEvent(String str, Bundle bundle) {
        dg3 dg3Var = this.zzb;
        dg3Var.getClass();
        dg3Var.c(new tf3(dg3Var, null, null, str, bundle, false, true));
    }

    public void resetAnalyticsData() {
        dg3 dg3Var = this.zzb;
        dg3Var.getClass();
        dg3Var.c(new ff3(dg3Var));
    }

    public void setAnalyticsCollectionEnabled(boolean z) {
        dg3 dg3Var = this.zzb;
        Boolean valueOf = Boolean.valueOf(z);
        dg3Var.getClass();
        dg3Var.c(new ef3(dg3Var, valueOf));
    }

    public void setConsent(Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        ConsentStatus consentStatus3 = map.get(ConsentType.AD_USER_DATA);
        if (consentStatus3 != null) {
            int ordinal3 = consentStatus3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        ConsentStatus consentStatus4 = map.get(ConsentType.AD_PERSONALIZATION);
        if (consentStatus4 != null) {
            int ordinal4 = consentStatus4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        dg3 dg3Var = this.zzb;
        dg3Var.getClass();
        dg3Var.c(new bf3(dg3Var, bundle, 1));
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        dg3 dg3Var = this.zzb;
        ze3 a = ze3.a(activity);
        dg3Var.getClass();
        dg3Var.c(new cf3(dg3Var, a, str, str2));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        dg3 dg3Var = this.zzb;
        dg3Var.getClass();
        dg3Var.c(new bf3(dg3Var, bundle, 2));
    }

    public void setSessionTimeoutDuration(long j) {
        dg3 dg3Var = this.zzb;
        dg3Var.getClass();
        dg3Var.c(new gf3(dg3Var, j));
    }

    public void setUserId(String str) {
        dg3 dg3Var = this.zzb;
        dg3Var.getClass();
        dg3Var.c(new df3(dg3Var, str, 0));
    }

    public void setUserProperty(String str, String str2) {
        dg3 dg3Var = this.zzb;
        dg3Var.getClass();
        dg3Var.c(new af3(dg3Var, (String) null, str, (Object) str2, false));
    }

    public final /* synthetic */ dg3 zza() {
        return this.zzb;
    }
}
