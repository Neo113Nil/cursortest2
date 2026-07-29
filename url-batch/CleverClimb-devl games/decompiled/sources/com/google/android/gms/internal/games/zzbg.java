package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzbg extends zzbm {
    private final /* synthetic */ boolean zzjg;
    private final /* synthetic */ String zzjr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbg(zzbe zzbeVar, GoogleApiClient googleApiClient, String str, boolean z) {
        super(googleApiClient);
        this.zzjr = str;
        this.zzjg = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzjr, this.zzjg);
    }
}
