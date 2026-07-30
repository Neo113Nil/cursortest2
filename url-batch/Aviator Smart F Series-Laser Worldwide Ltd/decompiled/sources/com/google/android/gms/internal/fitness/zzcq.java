package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.StartBleScanRequest;

/* loaded from: classes3.dex */
final class zzcq extends zzk {
    final /* synthetic */ StartBleScanRequest zza;
    final /* synthetic */ com.google.android.gms.fitness.request.zzab zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcq(zzcy zzcyVar, GoogleApiClient googleApiClient, StartBleScanRequest startBleScanRequest, com.google.android.gms.fitness.request.zzab zzabVar) {
        super(googleApiClient);
        this.zza = startBleScanRequest;
        this.zzb = zzabVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbx) ((zzm) anyClient).getService()).zzf(new StartBleScanRequest(this.zza.getDataTypes(), this.zzb, this.zza.getTimeoutSecs(), new zzes(this)));
    }
}
