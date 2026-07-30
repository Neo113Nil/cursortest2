package com.google.android.gms.internal.common;

/* loaded from: classes3.dex */
final class zzae extends zzz {
    private final zzag zza;

    zzae(zzag zzagVar, int i8) {
        super(zzagVar.size(), i8);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i8) {
        return this.zza.get(i8);
    }
}
