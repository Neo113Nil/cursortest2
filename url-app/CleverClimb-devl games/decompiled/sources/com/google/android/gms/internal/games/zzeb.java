package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzeb extends zzec {
    private final /* synthetic */ int zzkp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(zzdy zzdyVar, GoogleApiClient googleApiClient, int i) {
        super(googleApiClient, null);
        this.zzkp = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zzb(this, this.zzkp);
    }
}
