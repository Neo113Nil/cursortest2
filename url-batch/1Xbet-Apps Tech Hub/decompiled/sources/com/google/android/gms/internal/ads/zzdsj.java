package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdsj implements zzdbc, zzczv, zzcyk, zzczb, com.google.android.gms.ads.internal.client.zza, zzddo {
    private final zzayp zza;
    private boolean zzb = false;

    public zzdsj(zzayp zzaypVar, @Nullable zzfbp zzfbpVar) {
        this.zza = zzaypVar;
        zzaypVar.zzc(2);
        if (zzfbpVar != null) {
            zzaypVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final void zzbG(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbt(final zzfeh zzfehVar) {
        this.zza.zzb(new zzayo() { // from class: com.google.android.gms.internal.ads.zzdsf
            @Override // com.google.android.gms.internal.ads.zzayo
            public final void zza(zzbae zzbaeVar) {
                zzaza zzazaVar = (zzaza) zzbaeVar.zza().zzaB();
                zzazs zzazsVar = (zzazs) zzbaeVar.zza().zzd().zzaB();
                zzazsVar.zza(zzfeh.this.zzb.zzb.zzb);
                zzazaVar.zzb(zzazsVar);
                zzbaeVar.zze(zzazaVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzi(final zzazk zzazkVar) {
        this.zza.zzb(new zzayo() { // from class: com.google.android.gms.internal.ads.zzdsi
            @Override // com.google.android.gms.internal.ads.zzayo
            public final void zza(zzbae zzbaeVar) {
                zzbaeVar.zzf(zzazk.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzj(final zzazk zzazkVar) {
        this.zza.zzb(new zzayo() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzayo
            public final void zza(zzbae zzbaeVar) {
                zzbaeVar.zzf(zzazk.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzl(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzm(final zzazk zzazkVar) {
        this.zza.zzb(new zzayo() { // from class: com.google.android.gms.internal.ads.zzdsh
            @Override // com.google.android.gms.internal.ads.zzayo
            public final void zza(zzbae zzbaeVar) {
                zzbaeVar.zzf(zzazk.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final synchronized void zzq() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        this.zza.zzc(3);
    }
}
