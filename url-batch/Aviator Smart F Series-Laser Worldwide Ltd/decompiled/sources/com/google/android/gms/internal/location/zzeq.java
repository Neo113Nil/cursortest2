package com.google.android.gms.internal.location;

/* loaded from: classes3.dex */
final class zzeq extends zzeo {
    private final zzes zza;

    zzeq(zzes zzesVar, int i8) {
        super(zzesVar.size(), i8);
        this.zza = zzesVar;
    }

    @Override // com.google.android.gms.internal.location.zzeo
    protected final Object zza(int i8) {
        return this.zza.get(i8);
    }
}
