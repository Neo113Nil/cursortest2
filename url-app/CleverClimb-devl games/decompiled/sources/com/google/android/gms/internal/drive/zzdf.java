package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes2.dex */
final class zzdf extends TaskApiCall<zzaw, Void> {
    private final /* synthetic */ DriveResource zzfo;
    private final /* synthetic */ List zzfz;

    zzdf(zzch zzchVar, DriveResource driveResource, List list) {
        this.zzfo = driveResource;
        this.zzfz = list;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(new zzgq(this.zzfo.getDriveId(), this.zzfz), new zzhl(taskCompletionSource));
    }
}
