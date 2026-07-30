package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.BleDevice;

/* loaded from: classes3.dex */
final class zzct extends zzk {
    final /* synthetic */ BleDevice zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzct(zzcy zzcyVar, GoogleApiClient googleApiClient, BleDevice bleDevice) {
        super(googleApiClient);
        this.zza = bleDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbx) ((zzm) anyClient).getService()).zzd(new com.google.android.gms.fitness.request.zzf(this.zza.getAddress(), this.zza, (zzcp) new zzes(this)));
    }
}
