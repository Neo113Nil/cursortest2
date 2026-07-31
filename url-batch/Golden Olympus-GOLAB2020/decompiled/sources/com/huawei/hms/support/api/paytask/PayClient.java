package com.huawei.hms.support.api.paytask;

import android.content.Intent;
import com.huawei.hms.support.api.entity.pay.HwWalletInfoRequest;
import com.huawei.hms.support.api.entity.pay.InternalPayRequest;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductPayRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoRequest;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.api.pay.ProductPayResultInfo;
import z0.i;

/* loaded from: classes.dex */
public interface PayClient {
    i addWithholdingPlan(WithholdRequest withholdRequest);

    i getOrderDetail(OrderRequest orderRequest);

    PayResultInfo getPayResultInfoFromIntent(Intent intent);

    i getProductDetails(ProductDetailRequest productDetailRequest);

    ProductPayResultInfo getProductPayResultFromIntent(Intent intent);

    i getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest);

    i getWalletUiIntent(int i4);

    i internalPay(InternalPayRequest internalPayRequest);

    i pay(PayReq payReq);

    i productPay(ProductPayRequest productPayRequest);

    i queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest);

    void setSubAppId(String str);
}
