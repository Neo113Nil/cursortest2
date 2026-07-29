package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

/* loaded from: classes2.dex */
final class zzas extends zzay {
    private final /* synthetic */ int zzjo;
    private final /* synthetic */ LeaderboardScoreBuffer zzjp;
    private final /* synthetic */ int zzjq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzas(zzam zzamVar, GoogleApiClient googleApiClient, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        super(googleApiClient, null);
        this.zzjp = leaderboardScoreBuffer;
        this.zzjo = i;
        this.zzjq = i2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzjp, this.zzjo, this.zzjq);
    }
}
