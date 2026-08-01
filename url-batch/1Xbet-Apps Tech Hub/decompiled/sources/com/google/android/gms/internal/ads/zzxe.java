package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzxe extends zzxs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxk zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxe(int i, zzdc zzdcVar, int i2, zzxk zzxkVar, int i3, boolean z, zzftz zzftzVar, int i4) {
        super(i, zzdcVar, i2);
        int i5;
        int i6;
        int i7;
        boolean z2;
        this.zzh = zzxkVar;
        int i8 = 1;
        int i9 = true != zzxkVar.zzQ ? 16 : 24;
        boolean z3 = zzxkVar.zzM;
        this.zzg = zzxw.zzg(this.zzd.zzd);
        this.zzi = zzxw.zzn(i3, false);
        int i10 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i10 >= zzxkVar.zzq.size()) {
                i6 = 0;
                i10 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzxw.zza(this.zzd, (String) zzxkVar.zzq.get(i10), false);
                if (i6 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.zzk = i10;
        this.zzj = i6;
        int i11 = this.zzd.zzf;
        int i12 = zzxkVar.zzr;
        this.zzl = Integer.bitCount(0);
        zzam zzamVar = this.zzd;
        int i13 = zzamVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzamVar.zze & 1);
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        if (zzamVar.zzi != -1) {
            int i14 = zzxkVar.zzt;
        }
        if (zzamVar.zzz != -1) {
            int i15 = zzxkVar.zzs;
        }
        this.zzf = zzftzVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = zzfs.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{zzfs.zzA(configuration.locale)};
        for (int i16 = 0; i16 < split.length; i16++) {
            split[i16] = zzfs.zzC(split[i16]);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= split.length) {
                i7 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                i7 = zzxw.zza(this.zzd, split[i17], false);
                if (i7 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzn = i17;
        this.zzo = i7;
        int i18 = 0;
        while (true) {
            if (i18 >= zzxkVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzxkVar.zzu.get(i18))) {
                i5 = i18;
                break;
            }
            i18++;
        }
        this.zzt = i5;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzxk zzxkVar2 = this.zzh;
        if (zzxw.zzn(i3, zzxkVar2.zzS) && ((z2 = this.zzf) || zzxkVar2.zzL)) {
            zzdh zzdhVar = zzxkVar2.zzv;
            if (zzxw.zzn(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z4 = zzxkVar2.zzB;
                boolean z5 = zzxkVar2.zzA;
                if ((zzxkVar2.zzU || !z) && (i9 & i3) != 0) {
                    i8 = 2;
                }
            }
        } else {
            i8 = 0;
        }
        this.zze = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzxs
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxs
    public final /* bridge */ /* synthetic */ boolean zzc(zzxs zzxsVar) {
        String str;
        zzxe zzxeVar = (zzxe) zzxsVar;
        boolean z = this.zzh.zzO;
        zzam zzamVar = this.zzd;
        int i = zzamVar.zzz;
        if (i == -1) {
            return false;
        }
        zzam zzamVar2 = zzxeVar.zzd;
        if (i != zzamVar2.zzz || (str = zzamVar.zzm) == null || !TextUtils.equals(str, zzamVar2.zzm)) {
            return false;
        }
        zzxk zzxkVar = this.zzh;
        boolean z2 = zzxkVar.zzN;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzxeVar.zzd.zzA) {
            return false;
        }
        boolean z3 = zzxkVar.zzP;
        return this.zzu == zzxeVar.zzu && this.zzv == zzxeVar.zzv;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxe zzxeVar) {
        zzfyd zzfydVar;
        zzfyd zza;
        zzfyd zzfydVar2;
        if (this.zzf && this.zzi) {
            zza = zzxw.zzc;
        } else {
            zzfydVar = zzxw.zzc;
            zza = zzfydVar.zza();
        }
        zzfwj zzd = zzfwj.zzj().zzd(this.zzi, zzxeVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxeVar.zzk), zzfyd.zzc().zza()).zzb(this.zzj, zzxeVar.zzj).zzb(this.zzl, zzxeVar.zzl).zzd(this.zzp, zzxeVar.zzp);
        boolean z = zzxeVar.zzm;
        zzfwj zzc = zzd.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxeVar.zzn), zzfyd.zzc().zza()).zzb(this.zzo, zzxeVar.zzo).zzd(this.zzf, zzxeVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxeVar.zzt), zzfyd.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzxeVar.zzs);
        boolean z2 = this.zzh.zzA;
        zzfydVar2 = zzxw.zzd;
        zzfwj zzc2 = zzc.zzc(valueOf, valueOf2, zzfydVar2).zzd(this.zzu, zzxeVar.zzu).zzd(this.zzv, zzxeVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxeVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxeVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzxeVar.zzs);
        if (!zzfs.zzF(this.zzg, zzxeVar.zzg)) {
            zza = zzxw.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }
}
