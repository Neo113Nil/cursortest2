package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* loaded from: classes3.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(@NonNull Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(@NonNull R r8) {
        Status status = r8.getStatus();
        if (status.isSuccess()) {
            onSuccess(r8);
            return;
        }
        onFailure(status);
        if (r8 instanceof Releasable) {
            try {
                ((Releasable) r8).release();
            } catch (RuntimeException e8) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r8)), e8);
            }
        }
    }

    public abstract void onSuccess(@NonNull R r8);
}
