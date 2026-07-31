package com.huawei.hms.support.api.paytask;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.pay.HwWalletInfoRequest;
import com.huawei.hms.support.api.entity.pay.InternalPayRequest;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.PayNaming;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductPayRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoRequest;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.api.pay.ProductPayResultInfo;
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkPayTask;
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkProductPayTask;
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkWithholdTask;
import com.huawei.hms.support.api.paytask.fullsdk.OrderDetailTask;
import com.huawei.hms.support.api.paytask.fullsdk.ProductDetailTask;
import com.huawei.hms.support.api.paytask.fullsdk.PurchaseInfoTask;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.Checker;
import z0.i;

/* loaded from: classes.dex */
public class PayClientFullImpl implements PayClient {

    /* renamed from: a, reason: collision with root package name */
    private Context f14338a;

    PayClientFullImpl(Context context) {
        if (context != null) {
            this.f14338a = context;
        }
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i addWithholdingPlan(WithholdRequest withholdRequest) {
        Checker.checkNonNull(withholdRequest);
        HiAnalyticsClient.reportEntry(this.f14338a, PayNaming.FULL_WITHHOLD, 61606301);
        return new FullSdkWithholdTask(this.f14338a, withholdRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i getOrderDetail(OrderRequest orderRequest) {
        Checker.checkNonNull(orderRequest);
        HiAnalyticsClient.reportEntry(this.f14338a, PayNaming.FULL_GETORDERDETAIL, 61606301);
        return new OrderDetailTask(this.f14338a, orderRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public PayResultInfo getPayResultInfoFromIntent(Intent intent) {
        throw new UnsupportedOperationException("getPayResultInfoFromIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i getProductDetails(ProductDetailRequest productDetailRequest) {
        Checker.checkNonNull(productDetailRequest);
        HiAnalyticsClient.reportEntry(this.f14338a, PayNaming.FULL_PRODUCTDETAIL, 61606301);
        return new ProductDetailTask(this.f14338a, productDetailRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public ProductPayResultInfo getProductPayResultFromIntent(Intent intent) {
        throw new UnsupportedOperationException("getProductPayResultFromIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest) {
        Checker.checkNonNull(purchaseInfoRequest);
        HiAnalyticsClient.reportEntry(this.f14338a, PayNaming.FULL_PURCHASEINFO, 61606301);
        return new PurchaseInfoTask(this.f14338a, purchaseInfoRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i getWalletUiIntent(int i4) {
        throw new UnsupportedOperationException("getWalletUiIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i internalPay(InternalPayRequest internalPayRequest) {
        throw new UnsupportedOperationException("internalPay");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i pay(PayReq payReq) {
        Checker.checkNonNull(payReq);
        HiAnalyticsClient.reportEntry(this.f14338a, PayNaming.FULL_PAY, 61606301);
        return new FullSdkPayTask(this.f14338a, payReq);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i productPay(ProductPayRequest productPayRequest) {
        Checker.checkNonNull(productPayRequest);
        HiAnalyticsClient.reportEntry(this.f14338a, PayNaming.FULL_PRODUCTPAY, 61606301);
        return new FullSdkProductPayTask(this.f14338a, productPayRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest) {
        throw new UnsupportedOperationException("queryWalletInfo");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public void setSubAppId(String str) {
        throw new UnsupportedOperationException("setSubAppId");
    }
}
