package com.huawei.hms.iap;

import android.content.Intent;
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

/* loaded from: classes.dex */
public interface IapClient {

    public interface PriceType {
        public static final int IN_APP_CONSUMABLE = 0;
        public static final int IN_APP_NONCONSUMABLE = 1;
        public static final int IN_APP_SUBSCRIPTION = 2;
    }

    z0.i consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq);

    z0.i createPurchaseIntent(PurchaseIntentReq purchaseIntentReq);

    @Deprecated
    z0.i createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq);

    void enablePendingPurchase();

    z0.i isEnvReady();

    z0.i isEnvReady(IsEnvReadyReq isEnvReadyReq);

    z0.i isEnvReady(boolean z4);

    z0.i isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq);

    z0.i obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq);

    z0.i obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq);

    z0.i obtainProductInfo(ProductInfoReq productInfoReq);

    PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent);

    RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent);

    z0.i scanRedeemCode();

    z0.i startIapActivity(StartIapActivityReq startIapActivityReq);
}
