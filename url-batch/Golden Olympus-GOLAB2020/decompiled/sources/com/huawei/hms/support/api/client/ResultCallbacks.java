package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.Releasable;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

@Deprecated
/* loaded from: classes.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    private static final String TAG = "ResultCallbacks";

    public abstract void onFailure(Status status);

    public abstract void onSuccess(R r4);

    @Override // com.huawei.hms.support.api.client.ResultCallback
    public final void onResult(R r4) {
        try {
            Status status = r4.getStatus();
            if (status.isSuccess()) {
                onSuccess(r4);
                return;
            }
            onFailure(status);
            if (r4 instanceof Releasable) {
                ((Releasable) r4).release();
            }
        } catch (Exception e4) {
            HMSLog.w(TAG, "Failed to release " + r4 + ", reason: " + e4);
        }
    }
}
