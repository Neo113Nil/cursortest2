package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzenm implements AppEventListener, zzdbc, zzczv, zzcyk, zzczb, com.google.android.gms.ads.internal.client.zza, zzcyh, zzdas, zzcyx, zzdge {
    private final zzfje zzj;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziG)).intValue());

    public zzenm(zzfje zzfjeVar) {
        this.zzj = zzfjeVar;
    }

    private final void zzo() {
        if (this.zzh.get() && this.zzi.get()) {
            for (final Pair pair : this.zza) {
                zzfaz.zza(this.zzc, new zzfay() { // from class: com.google.android.gms.internal.ads.zzemx
                    @Override // com.google.android.gms.internal.ads.zzfay
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkb)).booleanValue()) {
            return;
        }
        zzfaz.zza(this.zzb, zzenk.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzg.get()) {
            zzfaz.zza(this.zzc, new zzfay() { // from class: com.google.android.gms.internal.ads.zzene
                @Override // com.google.android.gms.internal.ads.zzfay
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zza.offer(new Pair(str, str2))) {
            zzcbn.zze("The queue for app events is full, dropping the new event.");
            zzfje zzfjeVar = this.zzj;
            if (zzfjeVar != null) {
                zzfjd zzb = zzfjd.zzb("dae_action");
                zzb.zza("dae_name", str);
                zzb.zza("dae_data", str2);
                zzfjeVar.zzb(zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zza() {
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzemu
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
            }
        });
        zzfaz.zza(this.zzf, new zzfay() { // from class: com.google.android.gms.internal.ads.zzemv
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzb() {
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzenf
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final void zzbG(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzemy
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzena
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzbL() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkb)).booleanValue()) {
            zzfaz.zza(this.zzb, zzenk.zza);
        }
        zzfaz.zza(this.zzf, new zzfay() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbt(zzfeh zzfehVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzbx(zzbwq zzbwqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzc() {
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzj();
            }
        });
        zzfaz.zza(this.zzf, new zzfay() { // from class: com.google.android.gms.internal.ads.zzeni
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzf();
            }
        });
        zzfaz.zza(this.zzf, new zzfay() { // from class: com.google.android.gms.internal.ads.zzenj
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzf() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzg() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzb.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfaz.zza(this.zzd, new zzfay() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcb zzi() {
        return (com.google.android.gms.ads.internal.client.zzcb) this.zzc.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.set(zzbhVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze.set(zzbkVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzd.set(zzdgVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zzc.set(zzcbVar);
        this.zzh.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.set(zzciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfaz.zza(this.zzf, new zzfay() { // from class: com.google.android.gms.internal.ads.zzend
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzq() {
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final synchronized void zzr() {
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzenb
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
            }
        });
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzenc
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc();
            }
        });
        this.zzi.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzs() {
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzeng
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzk();
            }
        });
    }
}
