package com.huawei.hms.iap.task;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.huawei.hms.iapfull.IIapFullAPIVer4;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import java.util.concurrent.Executor;
import z0.f;
import z0.g;
import z0.i;

/* loaded from: classes.dex */
public abstract class BaseIapFullTask<V extends Result, E> extends i {
    protected boolean mIsCompleted;
    protected boolean mIsSuccessful;
    protected f mOnFailureListener;
    protected g mOnSuccessListener;
    protected V mResult;

    protected BaseIapFullTask(Context context, E e4) {
        setResult();
        if (context != null) {
            handleRequest(e4, IapFullAPIFactory.createIapFullAPIVer4(context));
            return;
        }
        HMSLog.e("BaseIapFullTask", "context is null.");
        this.mResult.setStatus(new Status(OrderStatusCode.ORDER_STATE_PARAM_ERROR, "param is error"));
        this.mIsSuccessful = false;
        this.mIsCompleted = true;
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
    public V getResult() {
        return this.mResult;
    }

    /* renamed from: getResultThrowException, reason: merged with bridge method [inline-methods] */
    public <E extends Throwable> V m16getResultThrowException(Class<E> cls) {
        return null;
    }

    protected abstract void handleRequest(E e4, IIapFullAPIVer4 iIapFullAPIVer4);

    protected void handleRequestFailed(int i4, String str) {
        this.mIsSuccessful = false;
        this.mIsCompleted = true;
        f fVar = this.mOnFailureListener;
        if (fVar != null) {
            fVar.onFailure(new IapApiException(new Status(i4, str)));
        }
    }

    protected void handleRequestSuccess() {
        this.mIsSuccessful = true;
        this.mIsCompleted = true;
        g gVar = this.mOnSuccessListener;
        if (gVar != null) {
            gVar.onSuccess(this.mResult);
        }
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return this.mIsCompleted;
    }

    @Override // z0.i
    public boolean isSuccessful() {
        return this.mIsSuccessful;
    }

    protected abstract void setResult();

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
            if (isComplete() && !isSuccessful()) {
                fVar.onFailure(new IapApiException(this.mResult.getStatus()));
                return this;
            }
            this.mOnFailureListener = fVar;
        }
        return this;
    }

    @Override // z0.i
    public i addOnSuccessListener(g gVar) {
        if (gVar != null) {
            if (isComplete() && isSuccessful()) {
                gVar.onSuccess(this.mResult);
                return this;
            }
            this.mOnSuccessListener = gVar;
        }
        return this;
    }
}
