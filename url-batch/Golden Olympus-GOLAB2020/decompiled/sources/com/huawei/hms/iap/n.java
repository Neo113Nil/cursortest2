package com.huawei.hms.iap;

import android.text.TextUtils;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n extends b {

    /* renamed from: a, reason: collision with root package name */
    private PurchaseIntentReq f14262a;

    public n(String str, PurchaseIntentReq purchaseIntentReq, String str2, String str3) {
        super(str, JsonUtil.createJsonString(purchaseIntentReq), str2, str3);
        this.f14262a = purchaseIntentReq;
        b();
    }

    private void b() {
        int i4;
        if (a(this.f14262a.getReservedInfor())) {
            i4 = 11;
        } else {
            if (f()) {
                a(8);
                return;
            }
            if (e()) {
                a(8);
                return;
            }
            if (!g()) {
                if (c()) {
                    a(4);
                    return;
                } else {
                    if (d()) {
                        a(4);
                        return;
                    }
                    return;
                }
            }
            i4 = 7;
        }
        a(i4);
    }

    private boolean c() {
        PurchaseIntentReq purchaseIntentReq = this.f14262a;
        if (purchaseIntentReq == null || TextUtils.isEmpty(purchaseIntentReq.getSignatureAlgorithm())) {
            return false;
        }
        HMSLog.i("PurchaseIntentTaskApiCall", "Use the SHA256WithRSA/PSS algorithm.");
        return true;
    }

    private boolean d() {
        PurchaseIntentReq purchaseIntentReq = this.f14262a;
        if (purchaseIntentReq == null || TextUtils.isEmpty(purchaseIntentReq.getReservedInfor())) {
            return false;
        }
        HMSLog.i("PurchaseIntentTaskApiCall", "reservedInfor is not empty");
        return true;
    }

    private boolean e() {
        if (this.f14262a.getPriceType() != 2 && d()) {
            try {
                JSONObject optJSONObject = new JSONObject(this.f14262a.getReservedInfor()).optJSONObject("orderPurchaseExtensionInformation");
                if (optJSONObject == null || new JSONObject(optJSONObject.optString("purchaseExtension")).optJSONObject("memberPoints") == null) {
                    return false;
                }
                HMSLog.i("PurchaseIntentTaskApiCall", "isPassMemberPoints");
                return true;
            } catch (JSONException unused) {
                HMSLog.w("PurchaseIntentTaskApiCall", "JSONException");
            }
        }
        return false;
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        try {
            if (new JSONObject(this.f14262a.getReservedInfor()).has("offerCode")) {
                HMSLog.i("PurchaseIntentTaskApiCall", "isSubscriptionBenefit");
                return true;
            }
        } catch (JSONException unused) {
            HMSLog.w("PurchaseIntentTaskApiCall", "JSONException");
        }
        return false;
    }

    private boolean g() {
        if (this.f14262a.getPriceType() == 2 || !com.huawei.hms.iap.util.b.b(getRequestJson(), "enablePendingPurchases")) {
            return false;
        }
        HMSLog.i("PurchaseIntentTaskApiCall", "Enable pending purchase.");
        return true;
    }

    @Override // com.huawei.hms.iap.a
    protected int a() {
        if (a(this.f14262a.getReservedInfor())) {
            return 61000000;
        }
        if (f() || e()) {
            return 60600000;
        }
        if (g()) {
            return 60300000;
        }
        if (c() || d()) {
            return 50300000;
        }
        return super.a();
    }
}
