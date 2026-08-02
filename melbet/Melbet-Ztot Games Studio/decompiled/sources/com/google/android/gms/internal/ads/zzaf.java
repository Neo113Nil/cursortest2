package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzaf {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    private int zzH;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbk zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzy zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzo zzy;
    public final int zzz;

    static {
        new zzaf(new zzad());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008a, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Incorrect condition in loop: B:59:0x0097 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzaf(zzad zzadVar) {
        String str;
        String str2;
        List list;
        List list2;
        List list3;
        List list4;
        boolean z;
        List list5;
        String str3;
        List list6;
        String str4;
        String str5;
        String str6;
        List list7;
        List list8;
        String str7;
        int i;
        int i2;
        int i3;
        int i4;
        String str8;
        zzbk zzbkVar;
        String str9;
        String str10;
        int i5;
        List list9;
        zzy zzyVar;
        long j;
        int i6;
        int i7;
        float f;
        int i8;
        float f2;
        byte[] bArr;
        int i9;
        zzo zzoVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str11;
        String str12;
        String str13;
        str = zzadVar.zza;
        this.zza = str;
        str2 = zzadVar.zzd;
        String zzD = zzet.zzD(str2);
        this.zzd = zzD;
        list = zzadVar.zzc;
        if (list.isEmpty()) {
            str11 = zzadVar.zzb;
            if (str11 != null) {
                str12 = zzadVar.zzb;
                this.zzc = zzfxr.zzn(new zzak(zzD, str12));
                str13 = zzadVar.zzb;
                this.zzb = str13;
                i = zzadVar.zze;
                this.zze = i;
                i2 = zzadVar.zzf;
                this.zzf = i2;
                i3 = zzadVar.zzg;
                this.zzg = i3;
                i4 = zzadVar.zzh;
                this.zzh = i4;
                this.zzi = i4 != -1 ? i4 : i3;
                str8 = zzadVar.zzi;
                this.zzj = str8;
                zzbkVar = zzadVar.zzj;
                this.zzk = zzbkVar;
                str9 = zzadVar.zzk;
                this.zzl = str9;
                str10 = zzadVar.zzl;
                this.zzm = str10;
                i5 = zzadVar.zzm;
                this.zzn = i5;
                list9 = zzadVar.zzn;
                this.zzo = list9 == null ? Collections.emptyList() : zzadVar.zzn;
                zzyVar = zzadVar.zzo;
                this.zzp = zzyVar;
                j = zzadVar.zzp;
                this.zzq = j;
                i6 = zzadVar.zzq;
                this.zzr = i6;
                i7 = zzadVar.zzr;
                this.zzs = i7;
                f = zzadVar.zzs;
                this.zzt = f;
                i8 = zzadVar.zzt;
                this.zzu = i8 == -1 ? 0 : zzadVar.zzt;
                f2 = zzadVar.zzu;
                this.zzv = f2 == -1.0f ? 1.0f : zzadVar.zzu;
                bArr = zzadVar.zzv;
                this.zzw = bArr;
                i9 = zzadVar.zzw;
                this.zzx = i9;
                zzoVar = zzadVar.zzx;
                this.zzy = zzoVar;
                i10 = zzadVar.zzy;
                this.zzz = i10;
                i11 = zzadVar.zzz;
                this.zzA = i11;
                i12 = zzadVar.zzA;
                this.zzB = i12;
                i13 = zzadVar.zzB;
                this.zzC = i13 == -1 ? 0 : zzadVar.zzB;
                i14 = zzadVar.zzC;
                this.zzD = i14 != -1 ? zzadVar.zzC : 0;
                i15 = zzadVar.zzD;
                this.zzE = i15;
                i16 = zzadVar.zzE;
                this.zzF = i16;
                i17 = zzadVar.zzF;
                if (i17 != 0 && zzyVar != null) {
                    this.zzG = 1;
                    return;
                } else {
                    i18 = zzadVar.zzF;
                    this.zzG = i18;
                }
            }
        }
        list2 = zzadVar.zzc;
        if (!list2.isEmpty()) {
            str6 = zzadVar.zzb;
            if (str6 == null) {
                list7 = zzadVar.zzc;
                this.zzc = list7;
                list8 = zzadVar.zzc;
                Iterator it = list8.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str7 = ((zzak) list8.get(0)).zzb;
                        break;
                    }
                    zzak zzakVar = (zzak) it.next();
                    if (TextUtils.equals(zzakVar.zza, zzD)) {
                        str7 = zzakVar.zzb;
                        break;
                    }
                }
                this.zzb = str7;
                i = zzadVar.zze;
                this.zze = i;
                i2 = zzadVar.zzf;
                this.zzf = i2;
                i3 = zzadVar.zzg;
                this.zzg = i3;
                i4 = zzadVar.zzh;
                this.zzh = i4;
                this.zzi = i4 != -1 ? i4 : i3;
                str8 = zzadVar.zzi;
                this.zzj = str8;
                zzbkVar = zzadVar.zzj;
                this.zzk = zzbkVar;
                str9 = zzadVar.zzk;
                this.zzl = str9;
                str10 = zzadVar.zzl;
                this.zzm = str10;
                i5 = zzadVar.zzm;
                this.zzn = i5;
                list9 = zzadVar.zzn;
                this.zzo = list9 == null ? Collections.emptyList() : zzadVar.zzn;
                zzyVar = zzadVar.zzo;
                this.zzp = zzyVar;
                j = zzadVar.zzp;
                this.zzq = j;
                i6 = zzadVar.zzq;
                this.zzr = i6;
                i7 = zzadVar.zzr;
                this.zzs = i7;
                f = zzadVar.zzs;
                this.zzt = f;
                i8 = zzadVar.zzt;
                this.zzu = i8 == -1 ? 0 : zzadVar.zzt;
                f2 = zzadVar.zzu;
                this.zzv = f2 == -1.0f ? 1.0f : zzadVar.zzu;
                bArr = zzadVar.zzv;
                this.zzw = bArr;
                i9 = zzadVar.zzw;
                this.zzx = i9;
                zzoVar = zzadVar.zzx;
                this.zzy = zzoVar;
                i10 = zzadVar.zzy;
                this.zzz = i10;
                i11 = zzadVar.zzz;
                this.zzA = i11;
                i12 = zzadVar.zzA;
                this.zzB = i12;
                i13 = zzadVar.zzB;
                this.zzC = i13 == -1 ? 0 : zzadVar.zzB;
                i14 = zzadVar.zzC;
                this.zzD = i14 != -1 ? zzadVar.zzC : 0;
                i15 = zzadVar.zzD;
                this.zzE = i15;
                i16 = zzadVar.zzE;
                this.zzF = i16;
                i17 = zzadVar.zzF;
                if (i17 != 0) {
                }
                i18 = zzadVar.zzF;
                this.zzG = i18;
            }
        }
        list3 = zzadVar.zzc;
        if (list3.isEmpty()) {
            str5 = zzadVar.zzb;
        }
        for (int i19 = 0; i19 < list4.size(); i19++) {
            list5 = zzadVar.zzc;
            String str14 = ((zzak) list5.get(i19)).zzb;
            str3 = zzadVar.zzb;
            if (str14.equals(str3)) {
                z = true;
                break;
            }
        }
        z = false;
        zzdi.zzf(z);
        list6 = zzadVar.zzc;
        this.zzc = list6;
        str4 = zzadVar.zzb;
        this.zzb = str4;
        i = zzadVar.zze;
        this.zze = i;
        i2 = zzadVar.zzf;
        this.zzf = i2;
        i3 = zzadVar.zzg;
        this.zzg = i3;
        i4 = zzadVar.zzh;
        this.zzh = i4;
        this.zzi = i4 != -1 ? i4 : i3;
        str8 = zzadVar.zzi;
        this.zzj = str8;
        zzbkVar = zzadVar.zzj;
        this.zzk = zzbkVar;
        str9 = zzadVar.zzk;
        this.zzl = str9;
        str10 = zzadVar.zzl;
        this.zzm = str10;
        i5 = zzadVar.zzm;
        this.zzn = i5;
        list9 = zzadVar.zzn;
        this.zzo = list9 == null ? Collections.emptyList() : zzadVar.zzn;
        zzyVar = zzadVar.zzo;
        this.zzp = zzyVar;
        j = zzadVar.zzp;
        this.zzq = j;
        i6 = zzadVar.zzq;
        this.zzr = i6;
        i7 = zzadVar.zzr;
        this.zzs = i7;
        f = zzadVar.zzs;
        this.zzt = f;
        i8 = zzadVar.zzt;
        this.zzu = i8 == -1 ? 0 : zzadVar.zzt;
        f2 = zzadVar.zzu;
        this.zzv = f2 == -1.0f ? 1.0f : zzadVar.zzu;
        bArr = zzadVar.zzv;
        this.zzw = bArr;
        i9 = zzadVar.zzw;
        this.zzx = i9;
        zzoVar = zzadVar.zzx;
        this.zzy = zzoVar;
        i10 = zzadVar.zzy;
        this.zzz = i10;
        i11 = zzadVar.zzz;
        this.zzA = i11;
        i12 = zzadVar.zzA;
        this.zzB = i12;
        i13 = zzadVar.zzB;
        this.zzC = i13 == -1 ? 0 : zzadVar.zzB;
        i14 = zzadVar.zzC;
        this.zzD = i14 != -1 ? zzadVar.zzC : 0;
        i15 = zzadVar.zzD;
        this.zzE = i15;
        i16 = zzadVar.zzE;
        this.zzF = i16;
        i17 = zzadVar.zzF;
        if (i17 != 0) {
        }
        i18 = zzadVar.zzF;
        this.zzG = i18;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaf zzafVar = (zzaf) obj;
            int i2 = this.zzH;
            if ((i2 == 0 || (i = zzafVar.zzH) == 0 || i2 == i) && this.zze == zzafVar.zze && this.zzf == zzafVar.zzf && this.zzg == zzafVar.zzg && this.zzh == zzafVar.zzh && this.zzn == zzafVar.zzn && this.zzq == zzafVar.zzq && this.zzr == zzafVar.zzr && this.zzs == zzafVar.zzs && this.zzu == zzafVar.zzu && this.zzx == zzafVar.zzx && this.zzz == zzafVar.zzz && this.zzA == zzafVar.zzA && this.zzB == zzafVar.zzB && this.zzC == zzafVar.zzC && this.zzD == zzafVar.zzD && this.zzE == zzafVar.zzE && this.zzG == zzafVar.zzG && Float.compare(this.zzt, zzafVar.zzt) == 0 && Float.compare(this.zzv, zzafVar.zzv) == 0 && zzet.zzG(this.zza, zzafVar.zza) && zzet.zzG(this.zzb, zzafVar.zzb) && this.zzc.equals(zzafVar.zzc) && zzet.zzG(this.zzj, zzafVar.zzj) && zzet.zzG(this.zzl, zzafVar.zzl) && zzet.zzG(this.zzm, zzafVar.zzm) && zzet.zzG(this.zzd, zzafVar.zzd) && Arrays.equals(this.zzw, zzafVar.zzw) && zzet.zzG(this.zzk, zzafVar.zzk) && zzet.zzG(this.zzy, zzafVar.zzy) && zzet.zzG(this.zzp, zzafVar.zzp) && zzd(zzafVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Format(" + this.zza + ", " + this.zzb + ", " + this.zzl + ", " + this.zzm + ", " + this.zzj + ", " + this.zzi + ", " + this.zzd + ", [" + this.zzr + ", " + this.zzs + ", " + this.zzt + ", " + String.valueOf(this.zzy) + "], [" + this.zzz + ", " + this.zzA + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzad zzb() {
        return new zzad(this, null);
    }

    public final zzaf zzc(int i) {
        zzad zzadVar = new zzad(this, null);
        zzadVar.zzC(i);
        return new zzaf(zzadVar);
    }

    public final boolean zzd(zzaf zzafVar) {
        if (this.zzo.size() != zzafVar.zzo.size()) {
            return false;
        }
        for (int i = 0; i < this.zzo.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzafVar.zzo.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.zzH;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int hashCode2 = ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.zzc.hashCode();
        String str3 = this.zzd;
        int hashCode3 = ((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31;
        String str4 = this.zzj;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzbk zzbkVar = this.zzk;
        int hashCode5 = (hashCode4 + (zzbkVar == null ? 0 : zzbkVar.hashCode())) * 31;
        String str5 = this.zzl;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int hashCode7 = ((((((((((((((((((((((((((((((((((hashCode6 + (this.zzm != null ? r2.hashCode() : 0)) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) - 1) * 31) - 1) * 31) + this.zzG;
        this.zzH = hashCode7;
        return hashCode7;
    }
}
