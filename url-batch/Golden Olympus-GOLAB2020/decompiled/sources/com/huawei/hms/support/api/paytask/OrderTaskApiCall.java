package com.huawei.hms.support.api.paytask;

import android.text.TextUtils;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.OrderResp;
import com.huawei.hms.support.api.pay.OrderResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import z0.j;

/* loaded from: classes.dex */
public class OrderTaskApiCall extends BasePayServiceTaskApiCall<PayHmsClient, OrderResult> {

    /* renamed from: a, reason: collision with root package name */
    private OrderRequest f14334a;

    public OrderTaskApiCall(String str, OrderRequest orderRequest, String str2) {
        super(str, JsonUtil.createJsonString(orderRequest), str2);
        this.f14334a = orderRequest;
        if (a()) {
            setApiLevel(4);
        }
    }

    private boolean a() {
        OrderRequest orderRequest = this.f14334a;
        if (orderRequest == null || TextUtils.isEmpty(orderRequest.signatureAlgorithm)) {
            return false;
        }
        HMSLog.i("OrderTaskApiCall", "Use the SHA256WithRSA/PSS algorithm.");
        return true;
    }

    @Override // com.huawei.hms.support.api.paytask.BasePayServiceTaskApiCall
    protected void dealSuccess(j jVar, ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("OrderTaskApiCall", "dealSuccess");
        OrderResp orderResp = new OrderResp();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, orderResp);
        }
        OrderResult orderResult = new OrderResult(orderResp);
        orderResult.setStatus(new Status(orderResp.getReturnCode(), orderResp.getReturnDesc()));
        jVar.c(orderResult);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        if (a()) {
            return 60000300;
        }
        return super.getMinApkVersion();
    }
}
