package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdco implements AppEventListener, OnAdMetadataChangedListener, zzcyh, com.google.android.gms.ads.internal.client.zza, zzdas, zzczb, zzdag, com.google.android.gms.ads.internal.overlay.zzo, zzcyx, zzdge {
    private final zzdcm zza = new zzdcm(this, null);

    @Nullable
    private zzenm zzb;

    @Nullable
    private zzenq zzc;

    @Nullable
    private zzezs zzd;

    @Nullable
    private zzfcx zze;

    private static void zzn(Object obj, zzdcn zzdcnVar) {
        if (obj != null) {
            zzdcnVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbe
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbf
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenq) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbk
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbq
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zza() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdcj
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).zza();
            }
        });
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdck
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzb() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdcc
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).zzb();
            }
        });
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzbL() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbz
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).zzbL();
            }
        });
        zzn(this.zzc, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdce
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenq) obj).zzbL();
            }
        });
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdcf
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zzbL();
            }
        });
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdcg
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzezs) obj).zzbL();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbx
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbj
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbw
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzezs) obj).zzbv();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbw() {
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbs
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzezs) obj).zzbw();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzbx(final zzbwq zzbwqVar, final String str, final String str2) {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbn
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbp
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zzbx(zzbwq.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdby
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzezs) obj).zzby();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbz(final int i) {
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdca
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzezs) obj).zzbz(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzc() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbl
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).zzc();
            }
        });
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbm
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zze() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbd
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbo
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzf() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbg
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbh
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzg() {
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdcb
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzezs) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbt
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbu
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzn(this.zzd, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbv
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzezs) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final zzdcm zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdch
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzfcx) obj).zzp(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdci
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).zzp(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzq() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbi
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzs() {
        zzn(this.zzb, new zzdcn() { // from class: com.google.android.gms.internal.ads.zzdbr
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zza(Object obj) {
                ((zzenm) obj).zzs();
            }
        });
    }
}
