package com.google.android.gms.internal.fitness;

/* loaded from: classes3.dex */
final class zzfk extends zzfh {
    private final zzfm zza;

    zzfk(zzfm zzfmVar, int i8) {
        super(zzfmVar.size(), i8);
        this.zza = zzfmVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzfh
    protected final Object zza(int i8) {
        return this.zza.get(i8);
    }
}
