package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzxa extends zzxv implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxo zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    public zzxa(int i, zzbf zzbfVar, int i2, zzxo zzxoVar, int i3, boolean z, zzghd zzghdVar, int i4) {
        super(i, zzbfVar, i2);
        int i5;
        int i6;
        int hashCode;
        int i7;
        int i8;
        boolean z2;
        this.zzh = zzxoVar;
        int i9 = 1;
        int i10 = true != zzxoVar.zzT ? 16 : 24;
        boolean z3 = zzxoVar.zzP;
        this.zzg = zzyd.zzi(this.zzd.zzd);
        this.zzi = zzln.zzZ(i3, false);
        int i11 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i11 >= zzxoVar.zzq.size()) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzyd.zzj(this.zzd, (String) zzxoVar.zzq.get(i11), false);
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
        int i13 = zzxoVar.zzs;
        this.zzl = zzyd.zzm(i12, 0);
        this.zzm = zzyd.zzn(this.zzd, zzxoVar.zzr);
        zzu zzuVar = this.zzd;
        int i14 = zzuVar.zzf;
        this.zzn = i14 == 0 || (i14 & 1) != 0;
        this.zzq = 1 == (zzuVar.zze & 1);
        String str = zzuVar.zzo;
        this.zzx = str != null && ((hashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(hashCode == 187078297 ? !str.equals("audio/ac4") : !(hashCode == 1504698186 && str.equals("audio/iamf"))));
        this.zzr = zzuVar.zzG;
        this.zzs = zzuVar.zzH;
        this.zzt = zzuVar.zzj;
        int i15 = zzuVar.zzj;
        this.zzf = (i15 == -1 || i15 <= zzxoVar.zzu) && ((i7 = zzuVar.zzG) == -1 || i7 <= zzxoVar.zzt) && zzghdVar.zza(zzuVar);
        String str2 = zzeo.zza;
        String[] split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i16 = 0; i16 < split.length; i16++) {
            split[i16] = zzeo.zzh(split[i16]);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= split.length) {
                i8 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                i8 = zzyd.zzj(this.zzd, split[i17], false);
                if (i8 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzo = i17;
        this.zzp = i8;
        int i18 = 0;
        while (true) {
            if (i18 >= zzxoVar.zzv.size()) {
                break;
            }
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzxoVar.zzv.get(i18))) {
                i5 = i18;
                break;
            }
            i18++;
        }
        this.zzu = i5;
        this.zzv = (i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 128;
        this.zzw = (i3 & 64) == 64;
        zzxo zzxoVar2 = this.zzh;
        if (zzln.zzZ(i3, zzxoVar2.zzV) && ((z2 = this.zzf) || zzxoVar2.zzO)) {
            int i19 = zzxoVar2.zzw.zzb;
            if (zzln.zzZ(i3, false) && z2 && this.zzd.zzj != -1) {
                boolean z4 = zzxoVar2.zzG;
                boolean z5 = zzxoVar2.zzF;
                if ((zzxoVar2.zzX || !z) && (i10 & i3) != 0) {
                    i9 = 2;
                }
            }
        } else {
            i9 = 0;
        }
        this.zze = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        String str;
        zzxo zzxoVar = this.zzh;
        zzxa zzxaVar = (zzxa) zzxvVar;
        boolean z = zzxoVar.zzR;
        zzu zzuVar = this.zzd;
        int i = zzuVar.zzG;
        if (i == -1) {
            return false;
        }
        zzu zzuVar2 = zzxaVar.zzd;
        if (i != zzuVar2.zzG || (str = zzuVar.zzo) == null || !TextUtils.equals(str, zzuVar2.zzo)) {
            return false;
        }
        boolean z2 = zzxoVar.zzQ;
        int i2 = zzuVar.zzH;
        if (i2 == -1 || i2 != zzuVar2.zzH) {
            return false;
        }
        boolean z3 = zzxoVar.zzS;
        return this.zzv == zzxaVar.zzv && this.zzw == zzxaVar.zzw;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxa zzxaVar) {
        zzglj zzgljVar;
        zzglj zza;
        boolean z = this.zzf;
        if (z && this.zzi) {
            zza = zzyd.zzc;
        } else {
            zzgljVar = zzyd.zzc;
            zza = zzgljVar.zza();
        }
        zzgjp zza2 = zzgjp.zzg().zzd(this.zzi, zzxaVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzxaVar.zzk), zzglj.zzb().zza()).zzb(this.zzj, zzxaVar.zzj).zzb(this.zzl, zzxaVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzxaVar.zzm), zzglj.zzb().zza()).zzd(this.zzq, zzxaVar.zzq).zzd(this.zzn, zzxaVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzxaVar.zzo), zzglj.zzb().zza()).zzb(this.zzp, zzxaVar.zzp).zzd(z, zzxaVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzxaVar.zzu), zzglj.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgjp zza3 = zza2.zzd(this.zzv, zzxaVar.zzv).zzd(this.zzw, zzxaVar.zzw).zzd(this.zzx, zzxaVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzxaVar.zzr), zza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzxaVar.zzs), zza);
        if (Objects.equals(this.zzg, zzxaVar.zzg)) {
            zza3 = zza3.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzxaVar.zzt), zza);
        }
        return zza3.zze();
    }
}
