package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;

/* loaded from: classes2.dex */
final class zzbt extends zzby {
    private final /* synthetic */ MetadataChangeSet zzfb;
    private final /* synthetic */ int zzfc;
    private final /* synthetic */ int zzfd;
    private final /* synthetic */ ExecutionOptions zzfe;
    private final /* synthetic */ zzbs zzff;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbt(zzbs zzbsVar, GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, int i, int i2, ExecutionOptions executionOptions) {
        super(googleApiClient);
        this.zzff = zzbsVar;
        this.zzfb = metadataChangeSet;
        this.zzfc = i;
        this.zzfd = i2;
        this.zzfe = executionOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        zzaw zzawVar2 = zzawVar;
        this.zzfb.zzp().zza(zzawVar2.getContext());
        ((zzeo) zzawVar2.getService()).zza(new zzw(this.zzff.getDriveId(), this.zzfb.zzp(), this.zzfc, this.zzfd, this.zzfe), new zzbv(this));
    }
}
