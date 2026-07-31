package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.iapfull.bean.WebPurchaseInfoRequest;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoResp;
import com.huawei.hms.support.api.pay.PurchaseInfoResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import java.util.concurrent.Executor;
import z0.f;
import z0.g;
import z0.i;

/* loaded from: classes.dex */
public class PurchaseInfoTask extends i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14358a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14359b;

    /* renamed from: c, reason: collision with root package name */
    private PurchaseInfoResult f14360c = new PurchaseInfoResult();

    /* renamed from: d, reason: collision with root package name */
    private g f14361d;

    /* renamed from: e, reason: collision with root package name */
    private f f14362e;

    public PurchaseInfoTask(Context context, PurchaseInfoRequest purchaseInfoRequest) {
        if (context != null) {
            IapFullAPIFactory.createIapFullAPI(context).getPurchaseInfo(a(purchaseInfoRequest), new WebPayCallback() { // from class: com.huawei.hms.support.api.paytask.fullsdk.PurchaseInfoTask.1
                public void onFailure(int i4, String str) {
                    PurchaseInfoResp purchaseInfoResp = new PurchaseInfoResp();
                    purchaseInfoResp.setCommonStatus(new Status(i4, str));
                    PurchaseInfoTask.this.f14359b = false;
                    PurchaseInfoTask.this.f14360c = new PurchaseInfoResult(purchaseInfoResp);
                    PurchaseInfoTask.this.f14358a = true;
                    if (PurchaseInfoTask.this.f14362e != null) {
                        PurchaseInfoTask.this.f14362e.onFailure(new IapApiException(PurchaseInfoTask.this.f14360c.getStatus()));
                    }
                }

                public void onSuccess(String str) {
                    PurchaseInfoResp purchaseInfoResp = new PurchaseInfoResp();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JsonUtil.jsonToEntity(str, purchaseInfoResp);
                        } catch (IllegalArgumentException e4) {
                            HMSLog.e("ProductDetailTask", "ProductDetailResp jsonToEntity " + e4.getMessage());
                        }
                    }
                    PurchaseInfoResult purchaseInfoResult = new PurchaseInfoResult(purchaseInfoResp);
                    PurchaseInfoTask.this.f14359b = true;
                    PurchaseInfoTask.this.f14360c = purchaseInfoResult;
                    PurchaseInfoTask.this.f14358a = true;
                    if (PurchaseInfoTask.this.f14361d != null) {
                        PurchaseInfoTask.this.f14361d.onSuccess(PurchaseInfoTask.this.f14360c);
                    }
                }
            });
            return;
        }
        this.f14360c.setStatus(new Status(PayStatusCodes.PAY_STATE_PARAM_ERROR, "param is error"));
        this.f14359b = false;
        this.f14358a = true;
    }

    private WebPurchaseInfoRequest a(PurchaseInfoRequest purchaseInfoRequest) {
        WebPurchaseInfoRequest webPurchaseInfoRequest = new WebPurchaseInfoRequest();
        webPurchaseInfoRequest.setAppId(purchaseInfoRequest.getAppId());
        webPurchaseInfoRequest.setMerchantId(purchaseInfoRequest.getMerchantId());
        webPurchaseInfoRequest.setPageNo(purchaseInfoRequest.getPageNo());
        webPurchaseInfoRequest.setPriceType(purchaseInfoRequest.getPriceType());
        webPurchaseInfoRequest.setProductId(purchaseInfoRequest.getProductId());
        webPurchaseInfoRequest.setReservedInfor(purchaseInfoRequest.getReservedInfor());
        webPurchaseInfoRequest.setSign(purchaseInfoRequest.getSign());
        webPurchaseInfoRequest.setSignatureAlgorithm(purchaseInfoRequest.getSignatureAlgorithm());
        webPurchaseInfoRequest.setTs(purchaseInfoRequest.getTs());
        return webPurchaseInfoRequest;
    }

    public i addOnFailureListener(Activity activity, f fVar) {
        addOnFailureListener(fVar);
        return this;
    }

    public i addOnSuccessListener(Activity activity, g gVar) {
        addOnSuccessListener(gVar);
        return this;
    }

    @Override // z0.i
    public Exception getException() {
        return null;
    }

    @Override // z0.i
    public PurchaseInfoResult getResult() {
        return this.f14360c;
    }

    /* renamed from: getResultThrowException, reason: merged with bridge method [inline-methods] */
    public <E extends Throwable> PurchaseInfoResult m22getResultThrowException(Class<E> cls) {
        return null;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return this.f14358a;
    }

    @Override // z0.i
    public boolean isSuccessful() {
        return this.f14359b;
    }

    public i addOnFailureListener(Executor executor, f fVar) {
        addOnFailureListener(fVar);
        return this;
    }

    public i addOnSuccessListener(Executor executor, g gVar) {
        addOnSuccessListener(gVar);
        return this;
    }

    @Override // z0.i
    public i addOnFailureListener(f fVar) {
        if (fVar != null) {
            if (isComplete()) {
                fVar.onFailure(new IapApiException(this.f14360c.getStatus()));
                return this;
            }
            this.f14362e = fVar;
        }
        return this;
    }

    @Override // z0.i
    public i addOnSuccessListener(g gVar) {
        if (gVar != null) {
            this.f14361d = gVar;
        }
        return this;
    }
}
