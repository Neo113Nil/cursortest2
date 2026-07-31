package com.huawei.hms.support.api.paytask;

import android.text.TextUtils;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoResp;
import com.huawei.hms.support.api.pay.PurchaseInfoResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import z0.j;

/* loaded from: classes.dex */
public class GetPurchaseInfoTaskApiCall extends BasePayServiceTaskApiCall<PayHmsClient, PurchaseInfoResult> {
    protected GetPurchaseInfoTaskApiCall(String str, String str2) {
        super(str, str2);
        setApiLevel(99);
    }

    @Override // com.huawei.hms.support.api.paytask.BasePayServiceTaskApiCall
    protected void dealSuccess(j jVar, ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("GetPurchaseInfoTaskApiCall", "dealSuccess");
        PurchaseInfoResp purchaseInfoResp = new PurchaseInfoResp();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, purchaseInfoResp);
        }
        PurchaseInfoResult purchaseInfoResult = new PurchaseInfoResult(purchaseInfoResp);
        Status status = new Status(responseErrorCode.getStatusCode(), responseErrorCode.getErrorReason());
        purchaseInfoResult.setStatus(status);
        purchaseInfoResult.setStatus(status);
        jVar.c(purchaseInfoResult);
    }
}
