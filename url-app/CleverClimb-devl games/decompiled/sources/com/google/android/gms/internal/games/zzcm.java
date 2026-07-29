package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.snapshot.SnapshotMetadata;

/* loaded from: classes2.dex */
final class zzcm extends zzcq {
    private final /* synthetic */ SnapshotMetadata zzke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcm(zzci zzciVar, GoogleApiClient googleApiClient, SnapshotMetadata snapshotMetadata) {
        super(googleApiClient, null);
        this.zzke = snapshotMetadata;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zzi(this, this.zzke.getSnapshotId());
    }
}
