package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.Players;

/* loaded from: classes2.dex */
final class zzbf extends zzbm {
    private final /* synthetic */ String zzjr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbf(zzbe zzbeVar, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient);
        this.zzjr = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza((BaseImplementation.ResultHolder<Players.LoadPlayersResult>) this, this.zzjr, false);
    }
}
