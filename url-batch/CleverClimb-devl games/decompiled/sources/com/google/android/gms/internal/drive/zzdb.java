package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzdb extends TaskApiCall<zzaw, DriveFolder> {
    private final /* synthetic */ MetadataChangeSet zzfb;
    private final /* synthetic */ DriveFolder zzfx;

    zzdb(zzch zzchVar, MetadataChangeSet metadataChangeSet, DriveFolder driveFolder) {
        this.zzfb = metadataChangeSet;
        this.zzfx = driveFolder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<DriveFolder> taskCompletionSource) throws RemoteException {
        zzaw zzawVar2 = zzawVar;
        this.zzfb.zzp().zza(zzawVar2.getContext());
        ((zzeo) zzawVar2.getService()).zza(new zzy(this.zzfx.getDriveId(), this.zzfb.zzp()), new zzhe(taskCompletionSource));
    }
}
