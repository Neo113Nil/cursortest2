package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzbc extends TaskApiCall<zzaw, DriveId> {
    private final /* synthetic */ String zzdu;

    zzbc(zzbb zzbbVar, String str) {
        this.zzdu = str;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<DriveId> taskCompletionSource) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(new zzek(DriveId.zza(this.zzdu), false), new zzhf(taskCompletionSource));
    }
}
