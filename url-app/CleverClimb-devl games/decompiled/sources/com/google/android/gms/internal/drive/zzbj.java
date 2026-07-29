package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;

/* loaded from: classes2.dex */
final class zzbj extends zzam {
    private final /* synthetic */ zzbi zzet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbj(zzbi zzbiVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzet = zzbiVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        Contents contents;
        zzeo zzeoVar = (zzeo) zzawVar.getService();
        DriveId driveId = this.zzet.getDriveId();
        contents = this.zzet.zzeq;
        zzeoVar.zza(new zzgd(driveId, 536870912, contents.getRequestId()), new zzgf(this, null));
    }
}
