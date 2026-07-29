package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.Players;

/* loaded from: classes2.dex */
final class zzbh extends zzbm {
    private final /* synthetic */ boolean zzjg;
    private final /* synthetic */ int zzjs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbh(zzbe zzbeVar, GoogleApiClient googleApiClient, int i, boolean z) {
        super(googleApiClient);
        this.zzjs = i;
        this.zzjg = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza((BaseImplementation.ResultHolder<Players.LoadPlayersResult>) this, this.zzjs, false, this.zzjg);
    }
}
