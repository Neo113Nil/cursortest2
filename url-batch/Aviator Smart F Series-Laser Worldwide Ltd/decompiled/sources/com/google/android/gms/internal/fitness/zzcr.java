package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes3.dex */
final class zzcr extends zzk {
    final /* synthetic */ com.google.android.gms.fitness.request.zzab zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcr(zzcy zzcyVar, GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.zzab zzabVar) {
        super(googleApiClient);
        this.zza = zzabVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbx) ((zzm) anyClient).getService()).zzg(new com.google.android.gms.fitness.request.zzbb(this.zza, new zzes(this)));
    }
}
