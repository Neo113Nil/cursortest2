package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzayy implements Runnable {
    final /* synthetic */ zzayz zza;

    zzayy(zzayz zzayzVar) {
        Objects.requireNonNull(zzayzVar);
        this.zza = zzayzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayz zzayzVar = this.zza;
        synchronized (zzayzVar.zzp()) {
            if (zzayzVar.zzq()) {
                return;
            }
            zzayzVar.zzr(true);
            try {
                zzayzVar.zzn();
            } catch (Exception e) {
                this.zza.zzo().zzc(2023, -1L, e);
            }
            zzayz zzayzVar2 = this.zza;
            synchronized (zzayzVar2.zzp()) {
                zzayzVar2.zzr(false);
            }
        }
    }
}
