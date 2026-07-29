package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzaz extends zzav {
    private final /* synthetic */ zzj zzei;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(zzaw zzawVar, GoogleApiClient googleApiClient, zzj zzjVar) {
        super(googleApiClient);
        this.zzei = zzjVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(this.zzei, (zzes) null, (String) null, new zzgs(this));
    }
}
