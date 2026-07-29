package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzbp extends zzbt {
    private final /* synthetic */ String zzjt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbp(zzbo zzboVar, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient, null);
        this.zzjt = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zzh(this, this.zzjt);
    }
}
