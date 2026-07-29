package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

/* loaded from: classes2.dex */
final class zzcn extends zzcu {
    private final /* synthetic */ SnapshotMetadataChange zzkd;
    private final /* synthetic */ String zzkf;
    private final /* synthetic */ String zzkg;
    private final /* synthetic */ SnapshotContents zzkh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcn(zzci zzciVar, GoogleApiClient googleApiClient, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
        super(googleApiClient, null);
        this.zzkf = str;
        this.zzkg = str2;
        this.zzkd = snapshotMetadataChange;
        this.zzkh = snapshotContents;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzkf, this.zzkg, this.zzkd, this.zzkh);
    }
}
