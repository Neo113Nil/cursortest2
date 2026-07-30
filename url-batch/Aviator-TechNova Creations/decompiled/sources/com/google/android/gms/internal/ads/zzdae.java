package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdae implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzfjc zzc;
    private final zzfir zzd;
    private final Clock zze;
    private final zzdxz zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfpk zza = zzfpl.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    zzdae(zzfjc zzfjcVar, zzfir zzfirVar, Clock clock, zzdxz zzdxzVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfjcVar;
        this.zzd = zzfirVar;
        this.zze = clock;
        this.zzf = zzdxzVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            zzdxz zzdxzVar = this.zzf;
            String str = this.zzc.zzb.zzb.zzb;
            String encodeToString = Base64.encodeToString(((zzfpl) this.zza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzop)).booleanValue()) {
                zzdxy zza = zzdxzVar.zza();
                zza.zzc("action", "pclma");
                zza.zzc("pclmd", encodeToString);
                zza.zzc("gqi", str);
                zza.zzf();
            }
        }
    }

    private final void zzo(int i) {
        synchronized (this.zzb) {
            if (!this.zzi && this.zzh) {
                zzfpk zzfpkVar = this.zza;
                zzfoc zza = zzfod.zza();
                zza.zzb(i);
                zza.zza(this.zze.currentTimeMillis());
                zzfpkVar.zza((zzfod) zza.zzbu());
                if (i == 10) {
                    zzn();
                    this.zzi = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd.zzaE > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdad
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdae.this.zzm();
                    }
                }, this.zzd.zzaE, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            if (this.zzi) {
                return;
            }
            this.zzi = true;
            zzn();
        }
    }
}
