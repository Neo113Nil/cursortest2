package com.google.android.gms.internal.fido;

/* loaded from: classes3.dex */
final class zzax extends zzau {
    private final zzaz zza;

    zzax(zzaz zzazVar, int i8) {
        super(zzazVar.size(), i8);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzau
    protected final Object zza(int i8) {
        return this.zza.get(i8);
    }
}
