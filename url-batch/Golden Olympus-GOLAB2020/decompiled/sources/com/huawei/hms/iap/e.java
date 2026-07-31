package com.huawei.hms.iap;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.iap.entity.BaseReq;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.IsEnvReadyReq;
import com.huawei.hms.iap.entity.IsSandboxActivatedReq;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentWithPriceReq;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.iap.entity.RedeemCodeResultInfo;
import com.huawei.hms.iap.entity.StartIapActivityReq;
import com.huawei.hms.iap.task.ConsumeOwnedPurchaseTask;
import com.huawei.hms.iap.task.CreatePurchaseTask;
import com.huawei.hms.iap.task.IsEnvReadyTask;
import com.huawei.hms.iap.task.ObtainOwnedPurchaseRecordTask;
import com.huawei.hms.iap.task.ObtainOwnedPurchasesTask;
import com.huawei.hms.iap.task.ProductInfoTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements IapClient {

    /* renamed from: a, reason: collision with root package name */
    private Context f14200a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14201b;

    e(Context context) {
        this(context, null);
    }

    private void a(BaseReq baseReq) {
        if (TextUtils.isEmpty(this.f14201b)) {
            HMSLog.e("IapClientFullImpl", "addSceneAppId, appId is empty!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(baseReq.getReservedInfor());
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("accountInfo"));
            jSONObject2.put("subAppID", this.f14201b);
            jSONObject.put("accountInfo", jSONObject2.toString());
            baseReq.setReservedInfor(jSONObject.toString());
        } catch (JSONException unused) {
            HMSLog.e("IapClientFullImpl", "addSceneAppId, JSONException");
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq) {
        Checker.checkNonNull(consumeOwnedPurchaseReq);
        a(consumeOwnedPurchaseReq);
        return new ConsumeOwnedPurchaseTask(this.f14200a, consumeOwnedPurchaseReq);
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i createPurchaseIntent(PurchaseIntentReq purchaseIntentReq) {
        Checker.checkNonNull(purchaseIntentReq);
        a(purchaseIntentReq);
        return new CreatePurchaseTask(this.f14200a, purchaseIntentReq);
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq) {
        throw new UnsupportedOperationException("createPurchaseIntentWithPrice");
    }

    @Override // com.huawei.hms.iap.IapClient
    public void enablePendingPurchase() {
        throw new UnsupportedOperationException("enablePendingPurchase");
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady() {
        throw new UnsupportedOperationException("isEnvReady");
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq) {
        throw new UnsupportedOperationException("isSandboxActivated");
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        a(ownedPurchasesReq);
        return new ObtainOwnedPurchaseRecordTask(this.f14200a, ownedPurchasesReq);
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        a(ownedPurchasesReq);
        return new ObtainOwnedPurchasesTask(this.f14200a, ownedPurchasesReq);
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainProductInfo(ProductInfoReq productInfoReq) {
        Checker.checkNonNull(productInfoReq);
        a(productInfoReq);
        return new ProductInfoTask(this.f14200a, productInfoReq);
    }

    @Override // com.huawei.hms.iap.IapClient
    public PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent) {
        HMSLog.i("IapClientFullImpl", "parsePurchaseResultInfoFromIntent");
        if (intent == null) {
            intent = new Intent();
        }
        PurchaseResultInfo purchaseResultInfo = new PurchaseResultInfo();
        purchaseResultInfo.setReturnCode(com.huawei.hms.iap.util.c.a(intent, "returnCode", 1));
        purchaseResultInfo.setErrMsg(com.huawei.hms.iap.util.c.a(intent, "errMsg"));
        purchaseResultInfo.setInAppPurchaseData(com.huawei.hms.iap.util.c.a(intent, "inAppPurchaseData"));
        purchaseResultInfo.setInAppDataSignature(com.huawei.hms.iap.util.c.a(intent, "inAppDataSignature"));
        purchaseResultInfo.setSignatureAlgorithm(com.huawei.hms.iap.util.c.a(intent, "signatureAlgorithm"));
        HMSLog.i("IapClientFullImpl", "parsePurchaseResultInfoFromIntent:" + purchaseResultInfo.getReturnCode());
        return purchaseResultInfo;
    }

    @Override // com.huawei.hms.iap.IapClient
    public RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent) {
        throw new UnsupportedOperationException("parseRedeemCodeResultInfoFromIntent");
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i scanRedeemCode() {
        throw new UnsupportedOperationException("scanRedeemCode");
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i startIapActivity(StartIapActivityReq startIapActivityReq) {
        throw new UnsupportedOperationException("startIapActivity");
    }

    public e(Context context, String str) {
        this.f14200a = context;
        this.f14201b = str;
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady(IsEnvReadyReq isEnvReadyReq) {
        Checker.checkNonNull(isEnvReadyReq);
        a(isEnvReadyReq);
        return new IsEnvReadyTask(this.f14200a, isEnvReadyReq);
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady(boolean z4) {
        throw new UnsupportedOperationException("isEnvReady");
    }
}
