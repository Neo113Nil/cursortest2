package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzdd extends TaskApiCall<zzaw, Metadata> {
    private final /* synthetic */ MetadataChangeSet zzfb;
    private final /* synthetic */ DriveResource zzfo;

    zzdd(zzch zzchVar, MetadataChangeSet metadataChangeSet, DriveResource driveResource) {
        this.zzfb = metadataChangeSet;
        this.zzfo = driveResource;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<Metadata> taskCompletionSource) throws RemoteException {
        zzaw zzawVar2 = zzawVar;
        this.zzfb.zzp().zza(zzawVar2.getContext());
        ((zzeo) zzawVar2.getService()).zza(new zzgz(this.zzfo.getDriveId(), this.zzfb.zzp()), new zzhj(taskCompletionSource));
    }
}
