package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzw extends zzz {
    private final /* synthetic */ boolean zzjg;
    private final /* synthetic */ String[] zzjk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(zzv zzvVar, GoogleApiClient googleApiClient, boolean z, String[] strArr) {
        super(googleApiClient, null);
        this.zzjg = z;
        this.zzjk = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzjg, this.zzjk);
    }
}
