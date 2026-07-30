package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;

/* loaded from: classes3.dex */
final class zzdl extends zzah {
    final /* synthetic */ DataUpdateListenerRegistrationRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdl(zzds zzdsVar, GoogleApiClient googleApiClient, DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        super(googleApiClient);
        this.zza = dataUpdateListenerRegistrationRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzca) ((zzaj) anyClient).getService()).zzh(new DataUpdateListenerRegistrationRequest(this.zza, new zzes(this)));
    }
}
