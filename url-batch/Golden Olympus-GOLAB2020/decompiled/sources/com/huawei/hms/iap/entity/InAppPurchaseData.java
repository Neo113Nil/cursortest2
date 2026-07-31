package com.huawei.hms.iap.entity;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class InAppPurchaseData {
    public static final int NOT_PRESENT = Integer.MIN_VALUE;

    /* renamed from: A, reason: collision with root package name */
    private int f14202A;

    /* renamed from: B, reason: collision with root package name */
    private long f14203B;

    /* renamed from: C, reason: collision with root package name */
    private int f14204C;

    /* renamed from: D, reason: collision with root package name */
    private String f14205D;

    /* renamed from: E, reason: collision with root package name */
    private int f14206E;

    /* renamed from: F, reason: collision with root package name */
    private int f14207F;

    /* renamed from: G, reason: collision with root package name */
    private int f14208G;

    /* renamed from: H, reason: collision with root package name */
    private long f14209H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f14210I;

    /* renamed from: J, reason: collision with root package name */
    private int f14211J;

    /* renamed from: K, reason: collision with root package name */
    private int f14212K;

    /* renamed from: L, reason: collision with root package name */
    private String f14213L;

    /* renamed from: M, reason: collision with root package name */
    private int f14214M;

    /* renamed from: N, reason: collision with root package name */
    private String f14215N;

    /* renamed from: O, reason: collision with root package name */
    private String f14216O;

    /* renamed from: P, reason: collision with root package name */
    private int f14217P;

    /* renamed from: Q, reason: collision with root package name */
    private String f14218Q;

    /* renamed from: R, reason: collision with root package name */
    private int f14219R;

    /* renamed from: S, reason: collision with root package name */
    private long f14220S;

    /* renamed from: T, reason: collision with root package name */
    private long f14221T;

    /* renamed from: U, reason: collision with root package name */
    private int f14222U;

    /* renamed from: V, reason: collision with root package name */
    private long f14223V;

    /* renamed from: a, reason: collision with root package name */
    private String f14224a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14225b;

    /* renamed from: c, reason: collision with root package name */
    private String f14226c;

    /* renamed from: d, reason: collision with root package name */
    private String f14227d;

    /* renamed from: e, reason: collision with root package name */
    private String f14228e;

    /* renamed from: f, reason: collision with root package name */
    private String f14229f;

    /* renamed from: g, reason: collision with root package name */
    private long f14230g;

    /* renamed from: h, reason: collision with root package name */
    private int f14231h;

    /* renamed from: i, reason: collision with root package name */
    private String f14232i;

    /* renamed from: j, reason: collision with root package name */
    private String f14233j;

    /* renamed from: k, reason: collision with root package name */
    private int f14234k;

    /* renamed from: l, reason: collision with root package name */
    private String f14235l;

    /* renamed from: m, reason: collision with root package name */
    private long f14236m;

    /* renamed from: n, reason: collision with root package name */
    private String f14237n;

    /* renamed from: o, reason: collision with root package name */
    private String f14238o;

    /* renamed from: p, reason: collision with root package name */
    private String f14239p;

    /* renamed from: q, reason: collision with root package name */
    private long f14240q;

    /* renamed from: r, reason: collision with root package name */
    private String f14241r;

    /* renamed from: s, reason: collision with root package name */
    private int f14242s;

    /* renamed from: t, reason: collision with root package name */
    private long f14243t;

    /* renamed from: u, reason: collision with root package name */
    private long f14244u;

    /* renamed from: v, reason: collision with root package name */
    private long f14245v;

    /* renamed from: w, reason: collision with root package name */
    private long f14246w;

    /* renamed from: x, reason: collision with root package name */
    private int f14247x;

    /* renamed from: y, reason: collision with root package name */
    private int f14248y;

    /* renamed from: z, reason: collision with root package name */
    private int f14249z;

    public interface PurchaseState {
        public static final int CANCELED = 1;
        public static final int INITIALIZED = Integer.MIN_VALUE;
        public static final int PENDING = 3;
        public static final int PURCHASED = 0;
        public static final int REFUNDED = 2;
    }

    public InAppPurchaseData(String str) {
        JSONObject jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        this.f14224a = jSONObject.optString("applicationId");
        this.f14225b = jSONObject.optBoolean("autoRenewing");
        this.f14226c = jSONObject.optString("orderId");
        this.f14227d = jSONObject.optString("packageName", null);
        this.f14228e = jSONObject.optString("productId");
        this.f14229f = jSONObject.optString(HwPayConstant.KEY_PRODUCTNAME, null);
        this.f14230g = jSONObject.optLong("purchaseTime", -2147483648L);
        this.f14231h = jSONObject.optInt("purchaseState");
        this.f14232i = jSONObject.optString("developerPayload", null);
        this.f14233j = jSONObject.optString("purchaseToken");
        this.f14234k = jSONObject.optInt("purchaseType", Integer.MIN_VALUE);
        this.f14235l = jSONObject.optString("currency");
        this.f14236m = jSONObject.optLong("price");
        this.f14237n = jSONObject.optString("country");
        this.f14238o = jSONObject.optString("lastOrderId", null);
        this.f14239p = jSONObject.optString("productGroup", null);
        this.f14240q = jSONObject.optLong("oriPurchaseTime", -2147483648L);
        this.f14241r = jSONObject.optString("subscriptionId", null);
        this.f14242s = jSONObject.optInt(FirebaseAnalytics.Param.QUANTITY, Integer.MIN_VALUE);
        this.f14243t = jSONObject.optLong("daysLasted", -2147483648L);
        this.f14244u = jSONObject.optLong("numOfPeriods", -2147483648L);
        this.f14245v = jSONObject.optLong("numOfDiscount", -2147483648L);
        this.f14246w = jSONObject.optLong("expirationDate", -2147483648L);
        this.f14247x = jSONObject.optInt("expirationIntent", Integer.MIN_VALUE);
        this.f14248y = jSONObject.optInt("retryFlag", Integer.MIN_VALUE);
        this.f14249z = jSONObject.optInt("introductoryFlag", Integer.MIN_VALUE);
        this.f14202A = jSONObject.optInt("trialFlag", Integer.MIN_VALUE);
        this.f14203B = jSONObject.optLong("cancelTime", -2147483648L);
        this.f14204C = jSONObject.optInt("cancelReason", Integer.MIN_VALUE);
        this.f14205D = jSONObject.optString("appInfo", null);
        this.f14206E = jSONObject.optInt("notifyClosed", Integer.MIN_VALUE);
        this.f14207F = jSONObject.optInt("renewStatus", Integer.MIN_VALUE);
        this.f14208G = jSONObject.optInt("priceConsentStatus", Integer.MIN_VALUE);
        this.f14209H = jSONObject.optLong("renewPrice", -2147483648L);
        this.f14210I = jSONObject.optBoolean("subIsvalid", false);
        this.f14211J = jSONObject.optInt("cancelledSubKeepDays", Integer.MIN_VALUE);
        this.f14212K = jSONObject.optInt("kind", Integer.MIN_VALUE);
        this.f14213L = jSONObject.optString("developerChallenge", null);
        this.f14214M = jSONObject.optInt("consumptionState", Integer.MIN_VALUE);
        this.f14215N = jSONObject.optString("payOrderId", null);
        this.f14216O = jSONObject.optString("payType", null);
        this.f14217P = jSONObject.optInt("deferFlag", Integer.MIN_VALUE);
        this.f14218Q = jSONObject.optString("oriSubscriptionId", null);
        this.f14219R = jSONObject.optInt("cancelWay", Integer.MIN_VALUE);
        this.f14220S = jSONObject.optLong("cancellationTime", -2147483648L);
        this.f14221T = jSONObject.optLong("resumeTime", -2147483648L);
        this.f14223V = jSONObject.optLong("graceExpirationTime", -2147483648L);
        this.f14222U = jSONObject.optInt("accountFlag", Integer.MIN_VALUE);
    }

    public int getAccountFlag() {
        return this.f14222U;
    }

    public String getAppInfo() {
        return this.f14205D;
    }

    public String getApplicationId() {
        return this.f14224a;
    }

    public int getCancelReason() {
        return this.f14204C;
    }

    public long getCancelTime() {
        return this.f14203B;
    }

    public int getCancelWay() {
        return this.f14219R;
    }

    public long getCancellationTime() {
        return this.f14220S;
    }

    public int getCancelledSubKeepDays() {
        return this.f14211J;
    }

    public int getConsumptionState() {
        return this.f14214M;
    }

    public String getCountry() {
        return this.f14237n;
    }

    public String getCurrency() {
        return this.f14235l;
    }

    public long getDaysLasted() {
        return this.f14243t;
    }

    public int getDeferFlag() {
        return this.f14217P;
    }

    public String getDeveloperChallenge() {
        return this.f14213L;
    }

    public String getDeveloperPayload() {
        return this.f14232i;
    }

    public long getExpirationDate() {
        return this.f14246w;
    }

    public int getExpirationIntent() {
        return this.f14247x;
    }

    public long getGraceExpirationTime() {
        return this.f14223V;
    }

    public int getIntroductoryFlag() {
        return this.f14249z;
    }

    public int getKind() {
        return this.f14212K;
    }

    public String getLastOrderId() {
        return this.f14238o;
    }

    public int getNotifyClosed() {
        return this.f14206E;
    }

    public long getNumOfDiscount() {
        return this.f14245v;
    }

    public long getNumOfPeriods() {
        return this.f14244u;
    }

    public String getOrderID() {
        return this.f14226c;
    }

    public long getOriPurchaseTime() {
        return this.f14240q;
    }

    public String getOriSubscriptionId() {
        return this.f14218Q;
    }

    public String getPackageName() {
        return this.f14227d;
    }

    public String getPayOrderId() {
        return this.f14215N;
    }

    public String getPayType() {
        return this.f14216O;
    }

    public long getPrice() {
        return this.f14236m;
    }

    public int getPriceConsentStatus() {
        return this.f14208G;
    }

    public String getProductGroup() {
        return this.f14239p;
    }

    public String getProductId() {
        return this.f14228e;
    }

    public String getProductName() {
        return this.f14229f;
    }

    public int getPurchaseState() {
        return this.f14231h;
    }

    public long getPurchaseTime() {
        return this.f14230g;
    }

    public String getPurchaseToken() {
        return this.f14233j;
    }

    public int getPurchaseType() {
        return this.f14234k;
    }

    public int getQuantity() {
        return this.f14242s;
    }

    public long getRenewPrice() {
        return this.f14209H;
    }

    public int getRenewStatus() {
        return this.f14207F;
    }

    public long getResumeTime() {
        return this.f14221T;
    }

    public int getRetryFlag() {
        return this.f14248y;
    }

    public String getSubscriptionId() {
        return this.f14241r;
    }

    public int getTrialFlag() {
        return this.f14202A;
    }

    public boolean isAutoRenewing() {
        return this.f14225b;
    }

    public boolean isSubValid() {
        return this.f14210I;
    }
}
