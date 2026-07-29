package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzck extends zzcu {
    private final /* synthetic */ String zzka;
    private final /* synthetic */ boolean zzkb;
    private final /* synthetic */ int zzkc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzck(zzci zzciVar, GoogleApiClient googleApiClient, String str, boolean z, int i) {
        super(googleApiClient, null);
        this.zzka = str;
        this.zzkb = z;
        this.zzkc = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzka, this.zzkb, this.zzkc);
    }
}
