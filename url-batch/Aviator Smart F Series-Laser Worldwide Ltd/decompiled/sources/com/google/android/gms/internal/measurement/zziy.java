package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zziy extends zzis {
    private final zzja zza;

    zziy(zzja zzjaVar, int i8) {
        super(zzjaVar.size(), i8);
        this.zza = zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    protected final Object zza(int i8) {
        return this.zza.get(i8);
    }
}
