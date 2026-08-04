package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbyu {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbyu() {
    }

    /* synthetic */ zzbyu(byte[] bArr) {
    }

    public final void zza() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgt)).longValue() <= currentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = currentTimeMillis2;
            }
        }
    }
}
