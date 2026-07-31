package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzamg extends zzamh {
    zzamg() {
        super();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamh
    public final void zza() {
        if (!zze()) {
            for (int i4 = 0; i4 < zzb(); i4++) {
                Map.Entry zza = zza(i4);
                if (((zzaka) zza.getKey()).zze()) {
                    zza.setValue(Collections.unmodifiableList((List) zza.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzaka) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
