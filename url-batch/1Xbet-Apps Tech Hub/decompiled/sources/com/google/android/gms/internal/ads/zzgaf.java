package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgaf extends zzgac {
    private zzgaf() {
        super(null);
    }

    /* synthetic */ zzgaf(zzgae zzgaeVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    final int zza(zzgag zzgagVar) {
        int i;
        int i2;
        synchronized (zzgagVar) {
            i = zzgagVar.remaining;
            i2 = i - 1;
            zzgagVar.remaining = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    final void zzb(zzgag zzgagVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzgagVar) {
            set3 = zzgagVar.seenExceptions;
            if (set3 == null) {
                zzgagVar.seenExceptions = set2;
            }
        }
    }
}
