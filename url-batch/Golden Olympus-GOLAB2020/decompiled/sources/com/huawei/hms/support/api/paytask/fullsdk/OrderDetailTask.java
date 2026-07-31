package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.iapfull.bean.WebOrderRequest;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.OrderResp;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import com.huawei.hms.support.api.pay.OrderResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import java.util.concurrent.Executor;
import z0.f;
import z0.g;
import z0.i;

/* loaded from: classes.dex */
public class OrderDetailTask extends i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14346a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14347b;

    /* renamed from: c, reason: collision with root package name */
    private OrderResult f14348c = new OrderResult();

    /* renamed from: d, reason: collision with root package name */
    private g f14349d;

    /* renamed from: e, reason: collision with root package name */
    private f f14350e;

    public OrderDetailTask(Context context, OrderRequest orderRequest) {
        if (context != null) {
            IapFullAPIFactory.createIapFullAPI(context).getOrderDetail(a(orderRequest), new WebPayCallback() { // from class: com.huawei.hms.support.api.paytask.fullsdk.OrderDetailTask.1
                public void onFailure(int i4, String str) {
                    OrderResp orderResp = new OrderResp();
                    orderResp.setCommonStatus(new Status(i4, str));
                    OrderDetailTask.this.f14347b = false;
                    OrderDetailTask.this.f14348c = new OrderResult(orderResp);
                    OrderDetailTask.this.f14346a = true;
                    if (OrderDetailTask.this.f14350e != null) {
                        OrderDetailTask.this.f14350e.onFailure(new IapApiException(OrderDetailTask.this.f14348c.getStatus()));
                    }
                }

                public void onSuccess(String str) {
                    OrderResp orderResp = new OrderResp();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JsonUtil.jsonToEntity(str, orderResp);
                        } catch (IllegalArgumentException e4) {
                            HMSLog.e("ProductDetailTask", "OrderResp jsonToEntity " + e4.getMessage());
                        }
                    }
                    OrderResult orderResult = new OrderResult(orderResp);
                    OrderDetailTask.this.f14347b = true;
                    OrderDetailTask.this.f14348c = orderResult;
                    OrderDetailTask.this.f14346a = true;
                    if (OrderDetailTask.this.f14349d != null) {
                        OrderDetailTask.this.f14349d.onSuccess(OrderDetailTask.this.f14348c);
                    }
                }
            });
            return;
        }
        this.f14348c.setStatus(new Status(PayStatusCodes.PAY_STATE_PARAM_ERROR, "param is error"));
        this.f14347b = false;
        this.f14346a = true;
    }

    private WebOrderRequest a(OrderRequest orderRequest) {
        WebOrderRequest webOrderRequest = new WebOrderRequest();
        webOrderRequest.setMerchantId(orderRequest.getMerchantId());
        webOrderRequest.setRequestId(orderRequest.getRequestId());
        webOrderRequest.setKeyType(orderRequest.getKeyType());
        webOrderRequest.setTime(orderRequest.getTime());
        webOrderRequest.setReservedInfor(orderRequest.getReservedInfor());
        webOrderRequest.setSign(orderRequest.getSign());
        webOrderRequest.setSignatureAlgorithm(orderRequest.getSignatureAlgorithm());
        return webOrderRequest;
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
    public OrderResult getResult() {
        return this.f14348c;
    }

    /* renamed from: getResultThrowException, reason: merged with bridge method [inline-methods] */
    public <E extends Throwable> OrderResult m20getResultThrowException(Class<E> cls) {
        return null;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return this.f14346a;
    }

    @Override // z0.i
    public boolean isSuccessful() {
        return this.f14347b;
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
                fVar.onFailure(new IapApiException(this.f14348c.getStatus()));
                return this;
            }
            this.f14350e = fVar;
        }
        return this;
    }

    @Override // z0.i
    public i addOnSuccessListener(g gVar) {
        if (gVar != null) {
            this.f14349d = gVar;
        }
        return this;
    }
}
