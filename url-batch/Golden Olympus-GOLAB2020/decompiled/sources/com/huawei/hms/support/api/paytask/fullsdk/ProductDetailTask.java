package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.iapfull.bean.WebProductDetailRequest;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductDetailResp;
import com.huawei.hms.support.api.pay.ProductDetailResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import java.util.concurrent.Executor;
import z0.f;
import z0.g;
import z0.i;

/* loaded from: classes.dex */
public class ProductDetailTask extends i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14352a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14353b;

    /* renamed from: c, reason: collision with root package name */
    private ProductDetailResult f14354c = new ProductDetailResult();

    /* renamed from: d, reason: collision with root package name */
    private g f14355d;

    /* renamed from: e, reason: collision with root package name */
    private f f14356e;

    public ProductDetailTask(Context context, ProductDetailRequest productDetailRequest) {
        if (context != null) {
            IapFullAPIFactory.createIapFullAPI(context).getProductDetail(a(productDetailRequest), new WebPayCallback() { // from class: com.huawei.hms.support.api.paytask.fullsdk.ProductDetailTask.1
                public void onFailure(int i4, String str) {
                    ProductDetailResult productDetailResult = new ProductDetailResult();
                    productDetailResult.setStatus(new Status(i4, str));
                    ProductDetailTask.this.f14353b = false;
                    ProductDetailTask.this.f14354c = productDetailResult;
                    ProductDetailTask.this.f14352a = true;
                    if (ProductDetailTask.this.f14356e != null) {
                        ProductDetailTask.this.f14356e.onFailure(new IapApiException(ProductDetailTask.this.f14354c.getStatus()));
                    }
                }

                public void onSuccess(String str) {
                    ProductDetailResp productDetailResp = new ProductDetailResp();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JsonUtil.jsonToEntity(str, productDetailResp);
                        } catch (IllegalArgumentException e4) {
                            HMSLog.e("ProductDetailTask", "ProductDetailResp jsonToEntity " + e4.getMessage());
                        }
                    }
                    ProductDetailResult productDetailResult = new ProductDetailResult();
                    productDetailResult.setProductList(productDetailResp.productList);
                    productDetailResult.setStatus(new Status(productDetailResp.returnCode, productDetailResp.errMsg));
                    productDetailResult.setFailList(productDetailResp.getFailList());
                    productDetailResult.setProductList(productDetailResp.getProductList());
                    productDetailResult.setRequestId(productDetailResp.getRequestId());
                    ProductDetailTask.this.f14353b = true;
                    ProductDetailTask.this.f14354c = productDetailResult;
                    ProductDetailTask.this.f14352a = true;
                    if (ProductDetailTask.this.f14355d != null) {
                        ProductDetailTask.this.f14355d.onSuccess(ProductDetailTask.this.f14354c);
                    }
                }
            });
            return;
        }
        this.f14354c.setStatus(new Status(PayStatusCodes.PAY_STATE_PARAM_ERROR, "param is error"));
        this.f14353b = false;
        this.f14352a = true;
    }

    private WebProductDetailRequest a(ProductDetailRequest productDetailRequest) {
        WebProductDetailRequest webProductDetailRequest = new WebProductDetailRequest();
        webProductDetailRequest.setApplicationID(productDetailRequest.getApplicationID());
        webProductDetailRequest.setMerchantId(productDetailRequest.getMerchantId());
        webProductDetailRequest.setProductNos(productDetailRequest.getProductNos());
        webProductDetailRequest.setRequestId(productDetailRequest.getRequestId());
        webProductDetailRequest.setReservedInfor(productDetailRequest.getReservedInfor());
        return webProductDetailRequest;
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
    public ProductDetailResult getResult() {
        return this.f14354c;
    }

    /* renamed from: getResultThrowException, reason: merged with bridge method [inline-methods] */
    public <E extends Throwable> ProductDetailResult m21getResultThrowException(Class<E> cls) {
        return null;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return this.f14352a;
    }

    @Override // z0.i
    public boolean isSuccessful() {
        return this.f14353b;
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
                fVar.onFailure(new IapApiException(this.f14354c.getStatus()));
                return this;
            }
            this.f14356e = fVar;
        }
        return this;
    }

    @Override // z0.i
    public i addOnSuccessListener(g gVar) {
        if (gVar != null) {
            this.f14355d = gVar;
        }
        return this;
    }
}
