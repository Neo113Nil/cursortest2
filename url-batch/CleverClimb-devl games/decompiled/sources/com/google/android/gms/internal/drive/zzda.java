package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzda extends TaskApiCall<zzaw, Void> {
    private final /* synthetic */ DriveContents zzfv;

    zzda(zzch zzchVar, DriveContents driveContents) {
        this.zzfv = driveContents;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(new zzo(this.zzfv.zzh().getRequestId(), false), new zzhl(taskCompletionSource));
    }
}
