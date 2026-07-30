package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzmw extends zzng {
    zzmw(int i8) {
        super(i8, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zza() {
        if (!zzj()) {
            for (int i8 = 0; i8 < zzb(); i8++) {
                Map.Entry zzg = zzg(i8);
                if (((zzkr) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzkr) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
