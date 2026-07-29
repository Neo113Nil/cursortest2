package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;

/* loaded from: classes2.dex */
final class zzdc extends zzdo {
    private final /* synthetic */ TurnBasedMatchConfig zzki;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdc(zzdb zzdbVar, GoogleApiClient googleApiClient, TurnBasedMatchConfig turnBasedMatchConfig) {
        super(googleApiClient, null);
        this.zzki = turnBasedMatchConfig;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzki);
    }
}
