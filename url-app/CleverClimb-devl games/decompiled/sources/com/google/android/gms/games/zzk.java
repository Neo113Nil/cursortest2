package com.google.android.gms.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;

/* loaded from: classes.dex */
final class zzk extends Games.zzc {
    private final /* synthetic */ String zzaq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(GoogleApiClient googleApiClient, String str) {
        super(googleApiClient, null);
        this.zzaq = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this.zzaq, this);
    }
}
