package com.huawei.hms.iap;

import android.text.TextUtils;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.iap.entity.IsEnvReadyResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes.dex */
public class j extends a<g, IsEnvReadyResult> {
    public j(String str, String str2, boolean z4) {
        super(str, JsonUtil.createJsonString(null), str2);
        if (z4) {
            setApiLevel(4);
        }
    }

    @Override // com.huawei.hms.iap.a
    protected void a(z0.j jVar, ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("IsEnvReadyTaskApiCall", "dealSuccess");
        IsEnvReadyResult isEnvReadyResult = new IsEnvReadyResult();
        com.huawei.hms.iap.entity.b bVar = new com.huawei.hms.iap.entity.b();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, bVar);
        }
        isEnvReadyResult.setReturnCode(bVar.getReturnCode());
        isEnvReadyResult.setStatus(a(responseErrorCode));
        isEnvReadyResult.setAccountFlag(bVar.getAccountFlag());
        isEnvReadyResult.setCountry(bVar.getCountry());
        isEnvReadyResult.setCarrierId(bVar.getCarrierId());
        jVar.c(isEnvReadyResult);
    }
}
