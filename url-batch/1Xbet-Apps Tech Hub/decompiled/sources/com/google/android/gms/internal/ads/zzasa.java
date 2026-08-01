package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzasa implements Runnable {
    final /* synthetic */ zzasb zza;

    zzasa(zzasb zzasbVar) {
        this.zza = zzasbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfnt zzfntVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z = this.zza.zzp;
            if (z) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzasb.zzj(this.zza);
            } catch (Exception e) {
                zzfntVar = this.zza.zzh;
                zzfntVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
