package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSet;

/* loaded from: classes3.dex */
final class zzdi extends zzah {
    final /* synthetic */ DataSet zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdi(zzds zzdsVar, GoogleApiClient googleApiClient, DataSet dataSet, boolean z7) {
        super(googleApiClient);
        this.zza = dataSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzca) ((zzaj) anyClient).getService()).zze(new com.google.android.gms.fitness.request.zzk(this.zza, (zzcp) new zzes(this), false));
    }
}
