package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzdj extends zzdq {
    private final /* synthetic */ String zzew;
    private final /* synthetic */ String zzkk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdj(zzdb zzdbVar, GoogleApiClient googleApiClient, String str, String str2) {
        super(googleApiClient, null);
        this.zzew = str;
        this.zzkk = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzew, this.zzkk);
    }
}
