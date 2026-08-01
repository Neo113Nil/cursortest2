package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfcx implements OnAdMetadataChangedListener, zzczv, zzcyk, zzcyh, zzcyx, zzdas, zzfbi, zzdge {
    private final zzffz zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfcx(zzffz zzffzVar) {
        this.zza = zzffzVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfaz.zza(this.zzb, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcl
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zza() {
        this.zza.zza();
        zzfaz.zza(this.zzd, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfct
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxm) obj).zzg();
            }
        });
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbww) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzb() {
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbww) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final void zzbG(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        zzfaz.zza(this.zzc, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcq
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxq) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfaz.zza(this.zzc, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcr
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxq) obj).zze(i);
            }
        });
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcs
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbww) obj).zzg(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzbL() {
        zzfaz.zza(this.zzd, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxm) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzbx(final zzbwq zzbwqVar, final String str, final String str2) {
        zzfaz.zza(this.zzd, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcw
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                zzbwq zzbwqVar2 = zzbwq.this;
                ((zzbxm) obj).zzk(new zzbya(zzbwqVar2.zzc(), zzbwqVar2.zzb()));
            }
        });
        zzfaz.zza(this.zzf, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcc
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                zzbwq zzbwqVar2 = zzbwq.this;
                ((zzbxr) obj).zze(new zzbya(zzbwqVar2.zzc(), zzbwqVar2.zzb()), str, str2);
            }
        });
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcd
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbww) obj).zze(zzbwq.this);
            }
        });
        zzfaz.zza(this.zzg, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfce
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbwr) obj).zze(zzbwq.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzc() {
        zzfaz.zza(this.zzd, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcf
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxm) obj).zzj();
            }
        });
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcg
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbww) obj).zzj();
            }
        });
        zzfaz.zza(this.zzd, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfch
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxm) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zze() {
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcp
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbww) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzf() {
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcb
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbww) obj).zzl();
            }
        });
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfaz.zza(this.zzh, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfci
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzj(zzbxm zzbxmVar) {
        this.zzd.set(zzbxmVar);
    }

    public final void zzk(zzbxq zzbxqVar) {
        this.zzc.set(zzbxqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final void zzl(zzfbi zzfbiVar) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzbww zzbwwVar) {
        this.zze.set(zzbwwVar);
    }

    @Deprecated
    public final void zzn(zzbwr zzbwrVar) {
        this.zzg.set(zzbwrVar);
    }

    public final void zzo(zzbxr zzbxrVar) {
        this.zzf.set(zzbxrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfaz.zza(this.zzd, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxm) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfaz.zza(this.zzd, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfco
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxm) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        zzfaz.zza(this.zzc, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcj
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbxq) obj).zzg();
            }
        });
        zzfaz.zza(this.zze, new zzfay() { // from class: com.google.android.gms.internal.ads.zzfck
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((zzbww) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzs() {
    }
}
