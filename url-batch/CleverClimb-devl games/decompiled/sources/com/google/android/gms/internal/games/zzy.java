package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzy extends zzab {
    private final /* synthetic */ String zzk;
    private final /* synthetic */ int zzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzy(zzv zzvVar, GoogleApiClient googleApiClient, String str, int i) {
        super(googleApiClient, null);
        this.zzk = str;
        this.zzl = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this.zzk, this.zzl);
    }
}
