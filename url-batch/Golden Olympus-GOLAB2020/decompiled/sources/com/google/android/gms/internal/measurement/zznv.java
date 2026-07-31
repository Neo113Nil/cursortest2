package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zznv extends zzoa {
    zznv() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final void zza() {
        if (!zzj()) {
            for (int i4 = 0; i4 < zzc(); i4++) {
                Map.Entry zzg = zzg(i4);
                if (((zzlt) ((zznw) zzg).zza()).zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzlt) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
