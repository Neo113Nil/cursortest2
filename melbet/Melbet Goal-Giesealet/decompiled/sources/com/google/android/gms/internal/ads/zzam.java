package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzam {
    public static final zzam zza = new zzam(new zzal());
    public final Integer zzA;
    public final zzgjz zzB;
    public final CharSequence zzb;
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final byte[] zzg;
    public final Integer zzh;
    public final Integer zzi;
    public final Integer zzj;

    @Deprecated
    public final Integer zzk;
    public final Boolean zzl;

    @Deprecated
    public final Integer zzm;
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final CharSequence zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final Integer zzw;
    public final Integer zzx;
    public final CharSequence zzy;
    public final CharSequence zzz;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(1000, 36);
    }

    private zzam(zzal zzalVar) {
        Boolean zzH = zzalVar.zzH();
        Integer zzV = zzalVar.zzV();
        Integer zzG = zzalVar.zzG();
        int i = 1;
        int i2 = 0;
        if (zzH != null) {
            if (!zzH.booleanValue()) {
                zzG = -1;
            } else if (zzG == null || zzG.intValue() == -1) {
                if (zzV != null) {
                    switch (zzV.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    zzG = Integer.valueOf(i);
                }
                i = 0;
                zzG = Integer.valueOf(i);
            }
        } else if (zzG != null) {
            zzH = Boolean.valueOf(zzG.intValue() != -1);
            if (zzH.booleanValue() && zzV == null) {
                switch (zzG.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                zzV = Integer.valueOf(i2);
            }
        } else {
            zzG = null;
        }
        this.zzb = zzalVar.zzx();
        this.zzc = zzalVar.zzy();
        this.zzd = zzalVar.zzz();
        this.zze = zzalVar.zzA();
        this.zzf = zzalVar.zzB();
        this.zzg = zzalVar.zzC();
        this.zzh = zzalVar.zzD();
        this.zzi = zzalVar.zzE();
        this.zzj = zzalVar.zzF();
        this.zzk = zzG;
        this.zzl = zzH;
        this.zzm = zzalVar.zzI();
        this.zzn = zzalVar.zzI();
        this.zzo = zzalVar.zzJ();
        this.zzp = zzalVar.zzK();
        this.zzq = zzalVar.zzL();
        this.zzr = zzalVar.zzM();
        this.zzs = zzalVar.zzN();
        this.zzt = zzalVar.zzO();
        this.zzu = zzalVar.zzP();
        this.zzv = zzalVar.zzQ();
        this.zzw = zzalVar.zzR();
        this.zzx = zzalVar.zzS();
        this.zzy = zzalVar.zzT();
        this.zzz = zzalVar.zzU();
        this.zzA = zzV;
        this.zzB = zzalVar.zzW();
    }

    /* synthetic */ zzam(zzal zzalVar, byte[] bArr) {
        this(zzalVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzam zzamVar = (zzam) obj;
            if (Objects.equals(this.zzb, zzamVar.zzb) && Objects.equals(this.zzc, zzamVar.zzc) && Objects.equals(this.zzd, zzamVar.zzd) && Objects.equals(this.zze, zzamVar.zze) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(this.zzf, zzamVar.zzf) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(null, null) && Arrays.equals(this.zzg, zzamVar.zzg) && Objects.equals(this.zzh, zzamVar.zzh) && Objects.equals(null, null) && Objects.equals(this.zzi, zzamVar.zzi) && Objects.equals(this.zzj, zzamVar.zzj) && Objects.equals(this.zzk, zzamVar.zzk) && Objects.equals(this.zzl, zzamVar.zzl) && Objects.equals(null, null) && Objects.equals(this.zzn, zzamVar.zzn) && Objects.equals(this.zzo, zzamVar.zzo) && Objects.equals(this.zzp, zzamVar.zzp) && Objects.equals(this.zzq, zzamVar.zzq) && Objects.equals(this.zzr, zzamVar.zzr) && Objects.equals(this.zzs, zzamVar.zzs) && Objects.equals(this.zzt, zzamVar.zzt) && Objects.equals(this.zzu, zzamVar.zzu) && Objects.equals(this.zzv, zzamVar.zzv) && Objects.equals(this.zzw, zzamVar.zzw) && Objects.equals(this.zzx, zzamVar.zzx) && Objects.equals(this.zzy, zzamVar.zzy) && Objects.equals(null, null) && Objects.equals(this.zzz, zzamVar.zzz) && Objects.equals(this.zzA, zzamVar.zzA) && Objects.equals(this.zzB, zzamVar.zzB)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, null, this.zzz, this.zzA, true, this.zzB);
    }

    public final zzal zza() {
        return new zzal(this, null);
    }
}
