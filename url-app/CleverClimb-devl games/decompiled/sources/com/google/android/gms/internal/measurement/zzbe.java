package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzbe extends zzar {
    private final zzu zzsa;

    zzbe(zzat zzatVar) {
        super(zzatVar);
        this.zzsa = new zzu();
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        zzbw().zzz().zzb(this.zzsa);
        zzde zzca = zzca();
        String zzaf = zzca.zzaf();
        if (zzaf != null) {
            this.zzsa.setAppName(zzaf);
        }
        String zzag = zzca.zzag();
        if (zzag != null) {
            this.zzsa.setAppVersion(zzag);
        }
    }

    public final zzu zzdb() {
        zzch();
        return this.zzsa;
    }
}
