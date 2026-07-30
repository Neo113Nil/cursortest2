package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Subscription;

/* loaded from: classes3.dex */
final class zzdv extends zzap {
    final /* synthetic */ Subscription zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdv(zzea zzeaVar, GoogleApiClient googleApiClient, Subscription subscription) {
        super(googleApiClient);
        this.zza = subscription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzcb) ((zzar) anyClient).getService()).zze(new com.google.android.gms.fitness.request.zzbd(this.zza, false, (zzcp) new zzes(this)));
    }
}
