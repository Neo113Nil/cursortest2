package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* loaded from: classes2.dex */
final class zzbk extends zzav {
    private final /* synthetic */ zzbi zzet;
    private final /* synthetic */ MetadataChangeSet zzeu;
    private final /* synthetic */ com.google.android.gms.drive.zzn zzev;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(zzbi zzbiVar, GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.zzn zznVar) {
        super(googleApiClient);
        this.zzet = zzbiVar;
        this.zzeu = metadataChangeSet;
        this.zzev = zznVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        Contents contents;
        Contents contents2;
        Contents contents3;
        zzaw zzawVar2 = zzawVar;
        this.zzeu.zzp().zza(zzawVar2.getContext());
        zzeo zzeoVar = (zzeo) zzawVar2.getService();
        contents = this.zzet.zzeq;
        DriveId driveId = contents.getDriveId();
        MetadataBundle zzp = this.zzeu.zzp();
        contents2 = this.zzet.zzeq;
        int requestId = contents2.getRequestId();
        contents3 = this.zzet.zzeq;
        zzeoVar.zza(new zzm(driveId, zzp, requestId, contents3.zza(), this.zzev), new zzgs(this));
    }
}
