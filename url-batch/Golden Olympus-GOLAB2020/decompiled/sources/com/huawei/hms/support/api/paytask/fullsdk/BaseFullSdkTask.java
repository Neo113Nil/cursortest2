package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.bean.PayRequest;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.PayResult;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import z0.f;
import z0.g;
import z0.i;

/* loaded from: classes.dex */
public abstract class BaseFullSdkTask<T extends BaseReq> extends i {

    /* renamed from: b, reason: collision with root package name */
    private boolean f14343b;
    protected Context mContext;
    protected T mRequest;
    protected Intent mIntent = getFullSdkIntent();

    /* renamed from: a, reason: collision with root package name */
    private PayResult f14342a = new PayResult();

    protected BaseFullSdkTask(Context context, T t4) {
        this.mContext = context;
        this.mRequest = t4;
        this.f14342a.setStatus(this.mIntent == null ? new Status(PayStatusCodes.PAY_STATE_PARAM_ERROR, "param is error") : new Status(0, "success", this.mIntent));
        this.f14343b = true;
    }

    public i addOnFailureListener(Activity activity, f fVar) {
        addOnFailureListener(fVar);
        return this;
    }

    public i addOnSuccessListener(Activity activity, g gVar) {
        addOnSuccessListener(gVar);
        return this;
    }

    protected boolean checkFieldExist(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.getName().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected abstract PayRequest createRequestParams();

    @Override // z0.i
    public Exception getException() {
        return null;
    }

    protected abstract Intent getFullSdkIntent();

    @Override // z0.i
    public PayResult getResult() {
        return this.f14342a;
    }

    /* renamed from: getResultThrowException, reason: merged with bridge method [inline-methods] */
    public <E extends Throwable> PayResult m18getResultThrowException(Class<E> cls) {
        return null;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return this.f14343b;
    }

    @Override // z0.i
    public boolean isSuccessful() {
        return this.mIntent != null;
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
        if (fVar != null && !isSuccessful()) {
            fVar.onFailure(new IapApiException(this.f14342a.getStatus()));
        }
        return this;
    }

    @Override // z0.i
    public i addOnSuccessListener(g gVar) {
        if (gVar != null && isSuccessful()) {
            gVar.onSuccess(this.f14342a);
        }
        return this;
    }
}
