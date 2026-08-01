package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbw {
    private CharSequence zza;
    private CharSequence zzb;
    private CharSequence zzc;
    private CharSequence zzd;
    private CharSequence zze;
    private byte[] zzf;
    private Integer zzg;
    private Integer zzh;
    private Integer zzi;
    private Integer zzj;
    private Boolean zzk;
    private Integer zzl;
    private Integer zzm;
    private Integer zzn;
    private Integer zzo;
    private Integer zzp;
    private Integer zzq;
    private CharSequence zzr;
    private CharSequence zzs;
    private CharSequence zzt;
    private CharSequence zzu;
    private CharSequence zzv;
    private Integer zzw;

    public zzbw() {
    }

    /* synthetic */ zzbw(zzby zzbyVar, zzbv zzbvVar) {
        this.zza = zzbyVar.zzc;
        this.zzb = zzbyVar.zzd;
        this.zzc = zzbyVar.zze;
        this.zzd = zzbyVar.zzf;
        this.zze = zzbyVar.zzg;
        this.zzf = zzbyVar.zzh;
        this.zzg = zzbyVar.zzi;
        this.zzh = zzbyVar.zzj;
        this.zzi = zzbyVar.zzk;
        this.zzj = zzbyVar.zzl;
        this.zzk = zzbyVar.zzm;
        this.zzl = zzbyVar.zzo;
        this.zzm = zzbyVar.zzp;
        this.zzn = zzbyVar.zzq;
        this.zzo = zzbyVar.zzr;
        this.zzp = zzbyVar.zzs;
        this.zzq = zzbyVar.zzt;
        this.zzr = zzbyVar.zzu;
        this.zzs = zzbyVar.zzv;
        this.zzt = zzbyVar.zzw;
        this.zzu = zzbyVar.zzx;
        this.zzv = zzbyVar.zzy;
        this.zzw = zzbyVar.zzz;
    }

    public final zzbw zza(byte[] bArr, int i) {
        if (this.zzf == null || zzfs.zzF(Integer.valueOf(i), 3) || !zzfs.zzF(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i);
        }
        return this;
    }

    public final zzbw zzb(zzby zzbyVar) {
        if (zzbyVar != null) {
            CharSequence charSequence = zzbyVar.zzc;
            if (charSequence != null) {
                this.zza = charSequence;
            }
            CharSequence charSequence2 = zzbyVar.zzd;
            if (charSequence2 != null) {
                this.zzb = charSequence2;
            }
            CharSequence charSequence3 = zzbyVar.zze;
            if (charSequence3 != null) {
                this.zzc = charSequence3;
            }
            CharSequence charSequence4 = zzbyVar.zzf;
            if (charSequence4 != null) {
                this.zzd = charSequence4;
            }
            CharSequence charSequence5 = zzbyVar.zzg;
            if (charSequence5 != null) {
                this.zze = charSequence5;
            }
            byte[] bArr = zzbyVar.zzh;
            if (bArr != null) {
                Integer num = zzbyVar.zzi;
                this.zzf = (byte[]) bArr.clone();
                this.zzg = num;
            }
            Integer num2 = zzbyVar.zzj;
            if (num2 != null) {
                this.zzh = num2;
            }
            Integer num3 = zzbyVar.zzk;
            if (num3 != null) {
                this.zzi = num3;
            }
            Integer num4 = zzbyVar.zzl;
            if (num4 != null) {
                this.zzj = num4;
            }
            Boolean bool = zzbyVar.zzm;
            if (bool != null) {
                this.zzk = bool;
            }
            Integer num5 = zzbyVar.zzn;
            if (num5 != null) {
                this.zzl = num5;
            }
            Integer num6 = zzbyVar.zzo;
            if (num6 != null) {
                this.zzl = num6;
            }
            Integer num7 = zzbyVar.zzp;
            if (num7 != null) {
                this.zzm = num7;
            }
            Integer num8 = zzbyVar.zzq;
            if (num8 != null) {
                this.zzn = num8;
            }
            Integer num9 = zzbyVar.zzr;
            if (num9 != null) {
                this.zzo = num9;
            }
            Integer num10 = zzbyVar.zzs;
            if (num10 != null) {
                this.zzp = num10;
            }
            Integer num11 = zzbyVar.zzt;
            if (num11 != null) {
                this.zzq = num11;
            }
            CharSequence charSequence6 = zzbyVar.zzu;
            if (charSequence6 != null) {
                this.zzr = charSequence6;
            }
            CharSequence charSequence7 = zzbyVar.zzv;
            if (charSequence7 != null) {
                this.zzs = charSequence7;
            }
            CharSequence charSequence8 = zzbyVar.zzw;
            if (charSequence8 != null) {
                this.zzt = charSequence8;
            }
            CharSequence charSequence9 = zzbyVar.zzx;
            if (charSequence9 != null) {
                this.zzu = charSequence9;
            }
            CharSequence charSequence10 = zzbyVar.zzy;
            if (charSequence10 != null) {
                this.zzv = charSequence10;
            }
            Integer num12 = zzbyVar.zzz;
            if (num12 != null) {
                this.zzw = num12;
            }
        }
        return this;
    }

    public final zzbw zzc(CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzbw zzd(CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzbw zze(CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzbw zzf(CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzbw zzg(CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzbw zzh(CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzbw zzi(CharSequence charSequence) {
        this.zzu = charSequence;
        return this;
    }

    public final zzbw zzj(Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzbw zzk(Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzbw zzl(Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzbw zzm(Integer num) {
        this.zzq = num;
        return this;
    }

    public final zzbw zzn(Integer num) {
        this.zzp = num;
        return this;
    }

    public final zzbw zzo(Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzbw zzp(CharSequence charSequence) {
        this.zzv = charSequence;
        return this;
    }

    public final zzbw zzq(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzbw zzr(Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzbw zzs(Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzbw zzt(CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzby zzu() {
        return new zzby(this);
    }
}
