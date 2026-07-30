package com.google.android.gms.internal.maps;

/* loaded from: classes3.dex */
final class zzbg extends zzbc {
    private final zzbi zza;

    zzbg(zzbi zzbiVar, int i8) {
        super(zzbiVar.size(), i8);
        this.zza = zzbiVar;
    }

    @Override // com.google.android.gms.internal.maps.zzbc
    protected final Object zza(int i8) {
        return this.zza.get(i8);
    }
}
