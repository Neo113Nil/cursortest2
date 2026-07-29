package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

/* loaded from: classes2.dex */
final class zzcl extends zzco {
    private final /* synthetic */ Snapshot zzef;
    private final /* synthetic */ SnapshotMetadataChange zzkd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcl(zzci zzciVar, GoogleApiClient googleApiClient, Snapshot snapshot, SnapshotMetadataChange snapshotMetadataChange) {
        super(googleApiClient, null);
        this.zzef = snapshot;
        this.zzkd = snapshotMetadataChange;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzef, this.zzkd);
    }
}
