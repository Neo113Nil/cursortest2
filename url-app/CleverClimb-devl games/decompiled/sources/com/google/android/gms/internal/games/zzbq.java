package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzbq extends zzbv {
    private final /* synthetic */ String zzjt;
    private final /* synthetic */ String zzju;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(zzbo zzboVar, GoogleApiClient googleApiClient, String str, String str2) {
        super(googleApiClient, null);
        this.zzjt = str;
        this.zzju = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zzb(this, this.zzjt, this.zzju);
    }
}
