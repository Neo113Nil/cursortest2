package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;

/* loaded from: classes2.dex */
final class zzdn implements TurnBasedMultiplayer.CancelMatchResult {
    private final /* synthetic */ Status zzbc;
    private final /* synthetic */ zzdm zzko;

    zzdn(zzdm zzdmVar, Status status) {
        this.zzko = zzdmVar;
        this.zzbc = status;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult
    public final String getMatchId() {
        String str;
        str = this.zzko.zzji;
        return str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzbc;
    }
}
