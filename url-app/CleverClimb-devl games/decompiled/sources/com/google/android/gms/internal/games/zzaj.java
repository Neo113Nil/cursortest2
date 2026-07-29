package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzaj extends zzak {
    private final /* synthetic */ int zzjl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(zzai zzaiVar, GoogleApiClient googleApiClient, int i) {
        super(googleApiClient, null);
        this.zzjl = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzjl);
    }
}
