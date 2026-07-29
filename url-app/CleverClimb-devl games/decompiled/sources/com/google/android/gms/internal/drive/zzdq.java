package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzdq extends zzea {
    private final /* synthetic */ boolean zzfy = false;
    private final /* synthetic */ zzdp zzgo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdq(zzdp zzdpVar, GoogleApiClient googleApiClient, boolean z) {
        super(zzdpVar, googleApiClient, null);
        this.zzgo = zzdpVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(new zzek(this.zzgo.zzk, this.zzfy), new zzdy(this));
    }
}
