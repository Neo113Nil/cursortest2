package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzawh implements Runnable {
    final /* synthetic */ zzawi zza;

    zzawh(zzawi zzawiVar) {
        this.zza = zzawiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzawi zzawiVar = this.zza;
            z = zzawiVar.zzd;
            if (z) {
                z2 = zzawiVar.zze;
                if (z2) {
                    zzawiVar.zzd = false;
                    zzcbn.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzawj) it.next()).zza(false);
                        } catch (Exception e) {
                            zzcbn.zzh("", e);
                        }
                    }
                }
            }
            zzcbn.zze("App is still foreground");
        }
    }
}
