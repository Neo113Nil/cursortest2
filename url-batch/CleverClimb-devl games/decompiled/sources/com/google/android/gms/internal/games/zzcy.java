package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzcy extends zzcz {
    private final /* synthetic */ boolean zzjg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(zzcx zzcxVar, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient, null);
        this.zzjg = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zze(this, this.zzjg);
    }
}
