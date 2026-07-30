package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgyt extends zzgyr {
    private zzgyt() {
        throw null;
    }

    /* synthetic */ zzgyt(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        synchronized (zzgyuVar) {
            if (zzgyuVar.seenExceptionsField == null) {
                zzgyuVar.seenExceptionsField = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final int zzb(zzgyu zzgyuVar) {
        int i;
        synchronized (zzgyuVar) {
            i = zzgyuVar.remainingField - 1;
            zzgyuVar.remainingField = i;
        }
        return i;
    }
}
