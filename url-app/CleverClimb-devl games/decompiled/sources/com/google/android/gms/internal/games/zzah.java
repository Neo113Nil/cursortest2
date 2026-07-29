package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class zzah<TResult> extends TaskApiCall<com.google.android.gms.games.internal.zze, TResult> {
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        try {
            zza(zzeVar, taskCompletionSource);
        } catch (RemoteException | SecurityException e) {
            taskCompletionSource.trySetException(e);
        }
    }

    protected abstract void zza(com.google.android.gms.games.internal.zze zzeVar, TaskCompletionSource<TResult> taskCompletionSource) throws RemoteException;
}
