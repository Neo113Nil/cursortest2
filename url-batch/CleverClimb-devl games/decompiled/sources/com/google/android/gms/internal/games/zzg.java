package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzg extends zzp {
    private final /* synthetic */ boolean zzjg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzg(zzf zzfVar, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient, null);
        this.zzjg = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zzc(this, this.zzjg);
    }
}
