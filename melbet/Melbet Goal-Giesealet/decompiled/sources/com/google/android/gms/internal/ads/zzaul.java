package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaul implements Runnable {
    final /* synthetic */ zzaum zza;

    zzaul(zzaum zzaumVar) {
        Objects.requireNonNull(zzaumVar);
        this.zza = zzaumVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaum zzaumVar = this.zza;
        synchronized (zzaumVar.zzp()) {
            if (zzaumVar.zzq()) {
                return;
            }
            zzaumVar.zzr(true);
            try {
                zzaumVar.zzn();
            } catch (Exception e) {
                this.zza.zzo().zzc(2023, -1L, e);
            }
            zzaum zzaumVar2 = this.zza;
            synchronized (zzaumVar2.zzp()) {
                zzaumVar2.zzr(false);
            }
        }
    }
}
