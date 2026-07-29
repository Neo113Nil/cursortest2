package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.TransferPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzbd extends TaskApiCall<zzaw, TransferPreferences> {
    zzbd(zzbb zzbbVar) {
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<TransferPreferences> taskCompletionSource) throws RemoteException {
        ((zzeo) zzawVar.getService()).zzb(new zzhg(taskCompletionSource));
    }
}
