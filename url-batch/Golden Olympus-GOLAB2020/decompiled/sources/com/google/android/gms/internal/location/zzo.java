package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzo extends zzx {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzo(zzz zzzVar, GoogleApiClient googleApiClient, boolean z4) {
        super(googleApiClient);
        this.zza = z4;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(zzaz zzazVar) {
        zzazVar.zzI(this.zza);
        setResult((zzo) Status.RESULT_SUCCESS);
    }
}
