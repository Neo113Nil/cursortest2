package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
final class zzaw extends zzar {
    private final zzaz zza;

    zzaw(zzaz zzazVar, int i4) {
        super(zzazVar.size(), i4);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzar
    protected final Object zza(int i4) {
        return this.zza.get(i4);
    }
}
