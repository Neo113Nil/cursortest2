package com.google.android.gms.games.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class zzs<L> extends RegisterListenerMethod<zze, L> {
    protected zzs(ListenerHolder<L> listenerHolder) {
        super(listenerHolder);
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected /* synthetic */ void registerListener(zze zzeVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        try {
            zzb(zzeVar, taskCompletionSource);
        } catch (SecurityException e) {
            taskCompletionSource.trySetException(e);
        }
    }

    protected abstract void zzb(zze zzeVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;
}
