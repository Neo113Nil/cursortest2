package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzdl extends zzdu {
    private final /* synthetic */ int zzkm;
    private final /* synthetic */ int[] zzkn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdl(zzdb zzdbVar, GoogleApiClient googleApiClient, int i, int[] iArr) {
        super(googleApiClient, null);
        this.zzkm = i;
        this.zzkn = iArr;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzkm, this.zzkn);
    }
}
