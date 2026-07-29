package com.google.android.gms.analytics;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzl implements Runnable {
    private final /* synthetic */ zzg zzsc;
    private final /* synthetic */ zzk zzsd;

    zzl(zzk zzkVar, zzg zzgVar) {
        this.zzsd = zzkVar;
        this.zzsc = zzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        this.zzsc.zzv().zza(this.zzsc);
        list = this.zzsd.zzrx;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzn) it.next()).zza(this.zzsc);
        }
        zzk zzkVar = this.zzsd;
        zzk.zzb(this.zzsc);
    }
}
