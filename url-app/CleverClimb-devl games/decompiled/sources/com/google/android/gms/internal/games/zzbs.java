package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzbs extends zzbx {
    private final /* synthetic */ boolean zzjg;
    private final /* synthetic */ String[] zzjw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbs(zzbo zzboVar, GoogleApiClient googleApiClient, boolean z, String[] strArr) {
        super(googleApiClient, null);
        this.zzjg = z;
        this.zzjw = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zzb(this, this.zzjg, this.zzjw);
    }
}
