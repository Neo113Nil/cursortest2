package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzat extends zzba {
    private final /* synthetic */ String zzbq;
    private final /* synthetic */ long zzbt;
    private final /* synthetic */ String zzbu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzat(zzam zzamVar, GoogleApiClient googleApiClient, String str, long j, String str2) {
        super(googleApiClient);
        this.zzbq = str;
        this.zzbt = j;
        this.zzbu = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzbq, this.zzbt, this.zzbu);
    }
}
