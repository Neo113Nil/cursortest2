package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzbu extends zzbq {
    private final zzbw zza;

    zzbu(zzbw zzbwVar, int i4) {
        super(zzbwVar.size(), i4);
        this.zza = zzbwVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    protected final Object zza(int i4) {
        return this.zza.get(i4);
    }
}
