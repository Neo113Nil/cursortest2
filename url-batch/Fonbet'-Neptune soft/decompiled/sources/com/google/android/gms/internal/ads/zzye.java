package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzye extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzyi zzh;
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
    private final boolean zzw;

    public zzye(int i, zzbm zzbmVar, int i2, zzyi zzyiVar, int i3, boolean z, zzfvq zzfvqVar, int i4) {
        super(i, zzbmVar, i2);
        int i5;
        int i6;
        int hashCode;
        int i7;
        String[] strArr;
        int i8;
        boolean z2;
        LocaleList locales;
        String languageTags;
        this.zzh = zzyiVar;
        int i9 = 1;
        int i10 = true != zzyiVar.zzP ? 16 : 24;
        boolean z3 = zzyiVar.zzL;
        this.zzg = zzyu.zzh(this.zzd.zzd);
        this.zzi = zzmb.zza(i3, false);
        int i11 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i11 >= zzyiVar.zzp.size()) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzyu.zzc(this.zzd, (String) zzyiVar.zzp.get(i11), false);
                if (i6 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.zzk = i11;
        this.zzj = i6;
        int i12 = this.zzd.zzf;
        int i13 = zzyiVar.zzq;
        this.zzl = zzyu.zzb(i12, 0);
        zzz zzzVar = this.zzd;
        int i14 = zzzVar.zzf;
        this.zzm = i14 == 0 || (i14 & 1) != 0;
        this.zzp = 1 == (zzzVar.zze & 1);
        String str = zzzVar.zzo;
        this.zzw = str != null && ((hashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(hashCode == 187078297 ? !str.equals("audio/ac4") : !(hashCode == 1504698186 && str.equals("audio/iamf"))));
        this.zzq = zzzVar.zzG;
        this.zzr = zzzVar.zzH;
        this.zzs = zzzVar.zzj;
        int i15 = zzzVar.zzj;
        this.zzf = (i15 == -1 || i15 <= zzyiVar.zzs) && ((i7 = zzzVar.zzG) == -1 || i7 <= zzyiVar.zzr) && zzfvqVar.zza(zzzVar);
        String str2 = zzex.zza;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i16 = 0; i16 < strArr.length; i16++) {
            strArr[i16] = zzex.zzE(strArr[i16]);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= strArr.length) {
                i8 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                i8 = zzyu.zzc(this.zzd, strArr[i17], false);
                if (i8 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzn = i17;
        this.zzo = i8;
        int i18 = 0;
        while (true) {
            if (i18 >= zzyiVar.zzt.size()) {
                break;
            }
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzyiVar.zzt.get(i18))) {
                i5 = i18;
                break;
            }
            i18++;
        }
        this.zzt = i5;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzyi zzyiVar2 = this.zzh;
        if (zzmb.zza(i3, zzyiVar2.zzR) && ((z2 = this.zzf) || zzyiVar2.zzK)) {
            int i19 = zzyiVar2.zzu.zzb;
            if (zzmb.zza(i3, false) && z2 && this.zzd.zzj != -1) {
                boolean z4 = zzyiVar2.zzC;
                boolean z5 = zzyiVar2.zzB;
                if ((zzyiVar2.zzT || !z) && (i10 & i3) != 0) {
                    i9 = 2;
                }
            }
        } else {
            i9 = 0;
        }
        this.zze = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        String str;
        zzyi zzyiVar = this.zzh;
        zzye zzyeVar = (zzye) zzypVar;
        boolean z = zzyiVar.zzN;
        zzz zzzVar = this.zzd;
        int i = zzzVar.zzG;
        if (i == -1) {
            return false;
        }
        zzz zzzVar2 = zzyeVar.zzd;
        if (i != zzzVar2.zzG || (str = zzzVar.zzo) == null || !TextUtils.equals(str, zzzVar2.zzo)) {
            return false;
        }
        boolean z2 = zzyiVar.zzM;
        int i2 = zzzVar.zzH;
        if (i2 == -1 || i2 != zzzVar2.zzH) {
            return false;
        }
        boolean z3 = zzyiVar.zzO;
        return this.zzu == zzyeVar.zzu && this.zzv == zzyeVar.zzv;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzye zzyeVar) {
        zzgab zzgabVar;
        zzgab zza;
        boolean z = this.zzf;
        if (z && this.zzi) {
            zza = zzyu.zzc;
        } else {
            zzgabVar = zzyu.zzc;
            zza = zzgabVar.zza();
        }
        zzfyf zzc = zzfyf.zzj().zzd(this.zzi, zzyeVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzyeVar.zzk), zzgab.zzc().zza()).zzb(this.zzj, zzyeVar.zzj).zzb(this.zzl, zzyeVar.zzl).zzd(this.zzp, zzyeVar.zzp).zzd(this.zzm, zzyeVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzyeVar.zzn), zzgab.zzc().zza()).zzb(this.zzo, zzyeVar.zzo).zzd(z, zzyeVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzyeVar.zzt), zzgab.zzc().zza());
        boolean z2 = this.zzh.zzB;
        zzfyf zzc2 = zzc.zzd(this.zzu, zzyeVar.zzu).zzd(this.zzv, zzyeVar.zzv).zzd(this.zzw, zzyeVar.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzyeVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzyeVar.zzr), zza);
        if (Objects.equals(this.zzg, zzyeVar.zzg)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzyeVar.zzs), zza);
        }
        return zzc2.zza();
    }
}
