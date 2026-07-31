package com.huawei.hms.support.api.paytask;

import android.text.TextUtils;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.entity.pay.PayResp;
import com.huawei.hms.support.api.pay.PayResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import z0.j;

/* loaded from: classes.dex */
public class PayTaskApiCall extends BasePayServiceTaskApiCall<PayHmsClient, PayResult> {

    /* renamed from: a, reason: collision with root package name */
    private String f14341a;

    public PayTaskApiCall(String str, String str2, String str3) {
        super(str, str2);
        this.f14341a = str3;
        if (a()) {
            setApiLevel(4);
        }
    }

    private boolean a() {
        if (TextUtils.isEmpty(this.f14341a)) {
            return false;
        }
        HMSLog.i("PayTaskApiCall", "Use the SHA256WithRSA/PSS algorithm.");
        return true;
    }

    @Override // com.huawei.hms.support.api.paytask.BasePayServiceTaskApiCall
    protected void dealSuccess(j jVar, ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("PayTaskApiCall", "dealSuccess");
        PayResp payResp = new PayResp();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, payResp);
        }
        PayResult payResult = new PayResult();
        payResult.setStatus(getStatus(responseErrorCode));
        jVar.c(payResult);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        if (a()) {
            return 60000300;
        }
        return super.getMinApkVersion();
    }

    public PayTaskApiCall(String str, String str2, String str3, String str4) {
        super(str, str2, str3);
        this.f14341a = str4;
        if (a()) {
            setApiLevel(4);
        }
    }
}
