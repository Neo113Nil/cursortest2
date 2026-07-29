package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.MetadataChangeSet;

/* loaded from: classes2.dex */
final class zzdt extends zzea {
    private final /* synthetic */ MetadataChangeSet zzfb;
    private final /* synthetic */ zzdp zzgo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdt(zzdp zzdpVar, GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet) {
        super(zzdpVar, googleApiClient, null);
        this.zzgo = zzdpVar;
        this.zzfb = metadataChangeSet;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        zzaw zzawVar2 = zzawVar;
        this.zzfb.zzp().zza(zzawVar2.getContext());
        ((zzeo) zzawVar2.getService()).zza(new zzgz(this.zzgo.zzk, this.zzfb.zzp()), new zzdy(this));
    }
}
