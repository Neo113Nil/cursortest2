package com.huawei.hms.support.api.paytask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.iap.util.a;
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
import com.huawei.hms.support.api.paytask.fullsdk.FailureTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import java.lang.ref.WeakReference;
import z0.i;

/* loaded from: classes.dex */
public class PayClientEntryImpl implements PayClient {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f14335a;

    /* renamed from: b, reason: collision with root package name */
    private PayClientImpl f14336b;

    /* renamed from: c, reason: collision with root package name */
    private PayClientFullImpl f14337c;

    PayClientEntryImpl(Activity activity) {
        this.f14335a = new WeakReference<>(activity);
    }

    private PayClientImpl a() {
        if (this.f14336b == null) {
            Context context = this.f14335a.get();
            if (context == null) {
                HMSLog.e("PayClientImpl", "getPayClientImpl context is null.");
                return null;
            }
            this.f14336b = context instanceof Activity ? new PayClientImpl((Activity) context) : new PayClientImpl(context);
        }
        return this.f14336b;
    }

    private PayClientFullImpl b() {
        if (this.f14337c == null) {
            Context context = this.f14335a.get();
            if (context == null) {
                HMSLog.e("PayClientImpl", "getPayClientFullImpl context is null.");
                return null;
            }
            this.f14337c = new PayClientFullImpl(context);
        }
        return this.f14337c;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i addWithholdingPlan(WithholdRequest withholdRequest) {
        Checker.checkNonNull(withholdRequest);
        Context context = this.f14335a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, withholdRequest.reservedInfor, withholdRequest.country, withholdRequest.currency, "Withhold")) {
            HMSLog.i("PayClientImpl", "withhold with Full SDK branch.");
            PayClientFullImpl b4 = b();
            return b4 != null ? b4.addWithholdingPlan(withholdRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "withhold with IAP SDK branch.");
        PayClientImpl a4 = a();
        return a4 != null ? a4.addWithholdingPlan(withholdRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i getOrderDetail(OrderRequest orderRequest) {
        Checker.checkNonNull(orderRequest);
        Context context = this.f14335a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, orderRequest.reservedInfor, "GetOrderDetail")) {
            PayClientImpl a4 = a();
            return a4 != null ? a4.getOrderDetail(orderRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getOrderDetail with Full SDK branch.");
        PayClientFullImpl b4 = b();
        return b4 != null ? b4.getOrderDetail(orderRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public PayResultInfo getPayResultInfoFromIntent(Intent intent) {
        Checker.checkNonNull(intent);
        PayClientImpl a4 = a();
        if (a4 != null) {
            return a4.getPayResultInfoFromIntent(intent);
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i getProductDetails(ProductDetailRequest productDetailRequest) {
        Checker.checkNonNull(productDetailRequest);
        Context context = this.f14335a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, productDetailRequest.reservedInfor, "Productdetail")) {
            PayClientImpl a4 = a();
            return a4 != null ? a4.getProductDetails(productDetailRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getProductDetails with Full SDK branch.");
        PayClientFullImpl b4 = b();
        return b4 != null ? b4.getProductDetails(productDetailRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public ProductPayResultInfo getProductPayResultFromIntent(Intent intent) {
        Checker.checkNonNull(intent);
        PayClientImpl a4 = a();
        if (a4 != null) {
            return a4.getProductPayResultFromIntent(intent);
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest) {
        Checker.checkNonNull(purchaseInfoRequest);
        Context context = this.f14335a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, purchaseInfoRequest.reservedInfor, "Purchaseinfo")) {
            PayClientImpl a4 = a();
            return a4 != null ? a4.getPurchaseInfo(purchaseInfoRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getProductDetails with Full SDK branch.");
        PayClientFullImpl b4 = b();
        return b4 != null ? b4.getPurchaseInfo(purchaseInfoRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i getWalletUiIntent(int i4) {
        PayClientImpl a4 = a();
        return a4 != null ? a4.getWalletUiIntent(i4) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i internalPay(InternalPayRequest internalPayRequest) {
        Checker.checkNonNull(internalPayRequest);
        PayClientImpl a4 = a();
        return a4 != null ? a4.internalPay(internalPayRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i pay(PayReq payReq) {
        Checker.checkNonNull(payReq);
        Context context = this.f14335a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, payReq.reservedInfor, payReq.country, payReq.currency, "Pay")) {
            HMSLog.i("PayClientImpl", "pay with Full SDK branch.");
            PayClientFullImpl b4 = b();
            return b4 != null ? b4.pay(payReq) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "pay with IAP SDK branch.");
        PayClientImpl a4 = a();
        return a4 != null ? a4.pay(payReq) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i productPay(ProductPayRequest productPayRequest) {
        Checker.checkNonNull(productPayRequest);
        Context context = this.f14335a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, productPayRequest.reservedInfor, "ProductPay")) {
            PayClientImpl a4 = a();
            return a4 != null ? a4.productPay(productPayRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "productPay with Full SDK branch.");
        PayClientFullImpl b4 = b();
        return b4 != null ? b4.productPay(productPayRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public i queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest) {
        Checker.checkNonNull(hwWalletInfoRequest);
        PayClientImpl a4 = a();
        return a4 != null ? a4.queryWalletInfo(hwWalletInfoRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public void setSubAppId(String str) {
        PayClientImpl a4 = a();
        if (a4 == null) {
            HMSLog.e("PayClientImpl", "setSubAppId payClient is null");
            return;
        }
        try {
            a4.setSubAppId(str);
        } catch (ApiException unused) {
            HMSLog.d("PayClientImpl", "setSubAppId fail");
        }
    }

    PayClientEntryImpl(Context context) {
        this.f14335a = new WeakReference<>(context);
    }
}
