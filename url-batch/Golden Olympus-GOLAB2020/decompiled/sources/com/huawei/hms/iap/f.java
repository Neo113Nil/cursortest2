package com.huawei.hms.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.IsEnvReadyReq;
import com.huawei.hms.iap.entity.IsSandboxActivatedReq;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentWithPriceReq;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.iap.entity.RedeemCodeResultInfo;
import com.huawei.hms.iap.entity.StartIapActivityReq;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends HuaweiApi<i> implements IapClient {

    /* renamed from: a, reason: collision with root package name */
    private static final Api<i> f14257a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_IAP);

    /* renamed from: b, reason: collision with root package name */
    private static i f14258b = new i();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f14259c;

    /* renamed from: d, reason: collision with root package name */
    private String f14260d;

    f(Activity activity) {
        super(activity, f14257a, f14258b, (AbstractClientBuilder) new h(), 61606301);
    }

    private void a(boolean z4, String str) {
        String a4 = com.huawei.hms.iap.util.b.a(this.f14260d, "productAppId", str);
        this.f14260d = a4;
        this.f14260d = com.huawei.hms.iap.util.b.a(a4, "isConsignment", Boolean.valueOf(z4));
        setApiLevel(10);
    }

    private String b(String str) {
        try {
            return new JSONObject(str).optString("transactionId", "");
        } catch (JSONException e4) {
            HMSLog.e("IapClientImpl", "getTransactionId  exception :" + e4.getMessage());
            return "";
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq) {
        HMSLog.i("IapClientImpl", "consumeOwnedPurchase");
        Checker.checkNonNull(consumeOwnedPurchaseReq);
        return doWrite(new c("iap.consumePurchase", consumeOwnedPurchaseReq, this.f14260d, HiAnalyticsClient.reportEntry(getContext(), "iap.consumePurchase", 61606301)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i createPurchaseIntent(PurchaseIntentReq purchaseIntentReq) {
        String reportEntry;
        HiAnalyticsUtil hiAnalyticsUtil;
        Context context;
        String b4;
        String str;
        HMSLog.i("IapClientImpl", "createPurchaseIntent");
        Checker.checkNonNull(purchaseIntentReq);
        if (purchaseIntentReq.getPriceType() == 2) {
            reportEntry = HiAnalyticsClient.reportEntry(getContext(), "iap.buy", 61606301);
            hiAnalyticsUtil = HiAnalyticsUtil.getInstance();
            context = getContext();
            b4 = b(JsonUtil.createJsonString(purchaseIntentReq));
            str = HiAnalyticsConstant.KeyAndValue.START_SUB;
        } else {
            reportEntry = HiAnalyticsClient.reportEntry(getContext(), "iap.buy", 61606301);
            hiAnalyticsUtil = HiAnalyticsUtil.getInstance();
            context = getContext();
            b4 = b(JsonUtil.createJsonString(purchaseIntentReq));
            str = HiAnalyticsConstant.KeyAndValue.START_BUY;
        }
        hiAnalyticsUtil.onEvent(context, str, b4);
        String a4 = com.huawei.hms.iap.util.b.a(this.f14260d, "enablePendingPurchases", Boolean.valueOf(f14259c));
        this.f14260d = a4;
        return doWrite(new n("iap.buy", purchaseIntentReq, a4, reportEntry));
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq) {
        HMSLog.i("IapClientImpl", "createPurchaseIntentWithPrice");
        Checker.checkNonNull(purchaseIntentWithPriceReq);
        if (!a(purchaseIntentWithPriceReq.getReservedInfor())) {
            z0.j jVar = new z0.j();
            jVar.b(new IapApiException(new Status(OrderStatusCode.ORDER_STATE_PARAM_ERROR, "reservedInfor must be a JSON string")));
            return jVar.a();
        }
        HiAnalyticsUtil.getInstance().onEvent(getContext(), HiAnalyticsConstant.KeyAndValue.START_BUYWITHPRICE, b(JsonUtil.createJsonString(purchaseIntentWithPriceReq)));
        String reportEntry = HiAnalyticsClient.reportEntry(getContext(), "iap.buyWithPrice", 61606301);
        String a4 = com.huawei.hms.iap.util.b.a(this.f14260d, "enablePendingPurchases", Boolean.valueOf(f14259c));
        this.f14260d = a4;
        return doWrite(new o("iap.buyWithPrice", purchaseIntentWithPriceReq, a4, reportEntry));
    }

    @Override // com.huawei.hms.iap.IapClient
    public void enablePendingPurchase() {
        HMSLog.i("IapClientImpl", "enablePendingPurchase");
        f14259c = true;
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady() {
        return isEnvReady(false);
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq) {
        Checker.checkNonNull(isSandboxActivatedReq);
        return doWrite(new k("iap.isSandboxActivated", JsonUtil.createJsonString(isSandboxActivatedReq), this.f14260d, HiAnalyticsClient.reportEntry(getContext(), "iap.isSandboxActivated", 61606301)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq) {
        HMSLog.i("IapClientImpl", "obtainOwnedPurchaseRecord");
        Checker.checkNonNull(ownedPurchasesReq);
        return doWrite(new l("iap.getPurchaseHistory", ownedPurchasesReq, this.f14260d, HiAnalyticsClient.reportEntry(getContext(), "iap.getPurchaseHistory", 61606301)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq) {
        HMSLog.i("IapClientImpl", "obtainOwnedPurchases");
        Checker.checkNonNull(ownedPurchasesReq);
        return doWrite(new l("iap.getPurchase", ownedPurchasesReq, this.f14260d, HiAnalyticsClient.reportEntry(getContext(), "iap.getPurchase", 61606301)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainProductInfo(ProductInfoReq productInfoReq) {
        HMSLog.i("IapClientImpl", "obtainProductInfo");
        Checker.checkNonNull(productInfoReq);
        return doWrite(new m("iap.getSkuDetails", JsonUtil.createJsonString(productInfoReq), this.f14260d, HiAnalyticsClient.reportEntry(getContext(), "iap.getSkuDetails", 61606301)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent) {
        HMSLog.i("IapClientImpl", "parsePurchaseResultInfoFromIntent");
        if (intent == null) {
            intent = new Intent();
        }
        PurchaseResultInfo purchaseResultInfo = new PurchaseResultInfo();
        purchaseResultInfo.setReturnCode(com.huawei.hms.iap.util.c.a(intent, "returnCode", 1));
        purchaseResultInfo.setErrMsg(com.huawei.hms.iap.util.c.a(intent, "errMsg"));
        purchaseResultInfo.setInAppPurchaseData(com.huawei.hms.iap.util.c.a(intent, "inAppPurchaseData"));
        purchaseResultInfo.setInAppDataSignature(com.huawei.hms.iap.util.c.a(intent, "Signature"));
        purchaseResultInfo.setSignatureAlgorithm(com.huawei.hms.iap.util.c.a(intent, "signatureAlgorithm"));
        HMSLog.i("IapClientImpl", "getBuyResultInfoFromIntent:" + purchaseResultInfo.getReturnCode());
        return purchaseResultInfo;
    }

    @Override // com.huawei.hms.iap.IapClient
    public RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent) {
        HMSLog.i("IapClientImpl", "parseRedeemCodeResultInfoFromIntent");
        if (intent == null) {
            intent = new Intent();
        }
        RedeemCodeResultInfo redeemCodeResultInfo = new RedeemCodeResultInfo();
        redeemCodeResultInfo.setRedeemCode(com.huawei.hms.iap.util.c.a(intent, "redeemCode"));
        redeemCodeResultInfo.setReturnCode(com.huawei.hms.iap.util.c.a(intent, "returnCode", 1));
        HMSLog.i("IapClientImpl", "parseRedeemCodeResultInfoFromIntent:" + redeemCodeResultInfo.getReturnCode());
        return redeemCodeResultInfo;
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i scanRedeemCode() {
        return doWrite(new q("iap.scanRedeemCode", HiAnalyticsClient.reportEntry(getContext(), "iap.scanRedeemCode", 61606301)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i startIapActivity(StartIapActivityReq startIapActivityReq) {
        Checker.checkNonNull(startIapActivityReq);
        return doWrite(new r("iap.startActivity", startIapActivityReq, this.f14260d, HiAnalyticsClient.reportEntry(getContext(), "iap.startActivity", 61606301)));
    }

    f(Activity activity, String str) {
        super(activity, f14257a, f14258b, (AbstractClientBuilder) new p(), 61606301, str);
        setApiLevel(3);
    }

    private boolean a(String str) {
        if (str == null) {
            return true;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady(IsEnvReadyReq isEnvReadyReq) {
        throw new UnsupportedOperationException("isEnvReady");
    }

    f(Activity activity, String str, boolean z4) {
        super(activity, f14257a, f14258b, (AbstractClientBuilder) new h(), 61606301);
        a(z4, str);
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady(boolean z4) {
        return doWrite(new j("iap.isBillingSupported", HiAnalyticsClient.reportEntry(getContext(), "iap.isBillingSupported", 61606301), z4));
    }

    f(Context context) {
        super(context, f14257a, f14258b, new h(), 61606301);
    }

    f(Context context, String str) {
        super(context, f14257a, f14258b, new p(), 61606301, str);
        setApiLevel(3);
    }

    f(Context context, String str, boolean z4) {
        super(context, f14257a, f14258b, new h(), 61606301);
        a(z4, str);
    }
}
