package com.google.android.gms.auth.api.accounttransfer;

import com.baidu.ar.auth.FeatureCodes;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzav;

/* loaded from: classes3.dex */
final class zzi extends zzn {
    final /* synthetic */ zzav zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(AccountTransferClient accountTransferClient, int i8, zzav zzavVar) {
        super(FeatureCodes.BEAUTY_MAKEUP);
        this.zza = zzavVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    protected final void zza(zzau zzauVar) {
        zzauVar.zzf(this.zzc, this.zza);
    }
}
