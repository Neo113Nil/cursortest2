package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcy extends TaskApiCall<zzaw, Void> {
    private final /* synthetic */ MetadataChangeSet zzeu;
    private final /* synthetic */ DriveContents zzfv;
    private final /* synthetic */ com.google.android.gms.drive.zzn zzfw;

    zzcy(zzch zzchVar, com.google.android.gms.drive.zzn zznVar, DriveContents driveContents, MetadataChangeSet metadataChangeSet) {
        this.zzfw = zznVar;
        this.zzfv = driveContents;
        this.zzeu = metadataChangeSet;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        zzaw zzawVar2 = zzawVar;
        try {
            this.zzfw.zza(zzawVar2);
        } catch (IllegalStateException e) {
            taskCompletionSource.setException(e);
        }
        this.zzfv.zzi();
        this.zzeu.zzp().zza(zzawVar2.getContext());
        ((zzeo) zzawVar2.getService()).zza(new zzm(this.zzfv.getDriveId(), this.zzeu.zzp(), this.zzfv.zzh().getRequestId(), this.zzfv.zzh().zza(), this.zzfw), new zzhl(taskCompletionSource));
    }
}
