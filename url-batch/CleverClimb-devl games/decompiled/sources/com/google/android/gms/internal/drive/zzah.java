package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzah extends zzam {
    private final /* synthetic */ int zzdt = 536870912;

    zzah(zzaf zzafVar, GoogleApiClient googleApiClient, int i) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(new zzr(this.zzdt), new zzak(this));
    }
}
