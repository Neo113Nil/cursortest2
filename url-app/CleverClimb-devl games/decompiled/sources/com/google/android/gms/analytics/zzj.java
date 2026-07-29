package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class zzj<T extends zzj> {
    private final zzk zzrt;
    protected final zzg zzru;
    private final List<zzh> zzrv;

    @VisibleForTesting
    protected zzj(zzk zzkVar, Clock clock) {
        Preconditions.checkNotNull(zzkVar);
        this.zzrt = zzkVar;
        this.zzrv = new ArrayList();
        zzg zzgVar = new zzg(this, clock);
        zzgVar.zzx();
        this.zzru = zzgVar;
    }

    protected void zza(zzg zzgVar) {
    }

    protected final void zzd(zzg zzgVar) {
        Iterator<zzh> it = this.zzrv.iterator();
        while (it.hasNext()) {
            it.next().zza(this, zzgVar);
        }
    }

    public zzg zzi() {
        zzg zzo = this.zzru.zzo();
        zzd(zzo);
        return zzo;
    }

    protected final zzk zzy() {
        return this.zzrt;
    }
}
