package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbdw implements Runnable {
    final /* synthetic */ zzbdx zza;

    zzbdw(zzbdx zzbdxVar) {
        Objects.requireNonNull(zzbdxVar);
        this.zza = zzbdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbdx zzbdxVar = this.zza;
        synchronized (zzbdxVar.zzf()) {
            if (zzbdxVar.zzg().get() && zzbdxVar.zzh()) {
                zzbdxVar.zzg().set(false);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbdxVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbdy) it.next()).zza(false);
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                    }
                }
            } else {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
