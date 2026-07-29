package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzap extends zzaw {
    private final /* synthetic */ String zzbq;
    private final /* synthetic */ int zzjm;
    private final /* synthetic */ int zzjn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzap(zzam zzamVar, GoogleApiClient googleApiClient, String str, int i, int i2) {
        super(googleApiClient, null);
        this.zzbq = str;
        this.zzjm = i;
        this.zzjn = i2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, (String) null, this.zzbq, this.zzjm, this.zzjn);
    }
}
