package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzay extends zzav {
    private final /* synthetic */ zzee zzej;
    private final /* synthetic */ zzgm zzek;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzay(zzaw zzawVar, GoogleApiClient googleApiClient, zzgm zzgmVar, zzee zzeeVar) {
        super(googleApiClient);
        this.zzek = zzgmVar;
        this.zzej = zzeeVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(this.zzek, this.zzej, (String) null, new zzgs(this));
    }
}
