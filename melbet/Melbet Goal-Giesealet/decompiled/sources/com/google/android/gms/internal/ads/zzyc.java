package com.google.android.gms.internal.ads;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzyc extends zzxv {
    private final boolean zze;
    private final zzxo zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r1 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r1 >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
    
        if (r1 >= 0.0f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r12 >= 0) goto L44;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0106 A[EDGE_INSN: B:124:0x0106->B:71:0x0106 BREAK  A[LOOP:1: B:63:0x00e7->B:122:0x0103], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzyc(int i, zzbf zzbfVar, int i2, zzxo zzxoVar, int i3, String str, int i4, boolean z) {
        super(i, zzbfVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        zzu zzuVar;
        String str2;
        int i9;
        boolean z4;
        zzu zzuVar2;
        int i10;
        int i11;
        int i12;
        this.zzf = zzxoVar;
        int i13 = 1;
        int i14 = true != zzxoVar.zzM ? 16 : 24;
        boolean z5 = zzxoVar.zzL;
        if (z && (((i10 = (zzuVar2 = this.zzd).zzv) == -1 || i10 <= zzxoVar.zza) && ((i11 = zzuVar2.zzw) == -1 || i11 <= zzxoVar.zzb))) {
            float f = zzuVar2.zzz;
            if ((f == -1.0f || f <= zzxoVar.zzc) && ((i12 = zzuVar2.zzj) == -1 || i12 <= zzxoVar.zzd)) {
                z2 = true;
                this.zze = z2;
                if (z) {
                    zzu zzuVar3 = this.zzd;
                    int i15 = zzuVar3.zzv;
                    if (i15 != -1) {
                        int i16 = zzxoVar.zze;
                    }
                    int i17 = zzuVar3.zzw;
                    if (i17 != -1) {
                        int i18 = zzxoVar.zzf;
                    }
                    float f2 = zzuVar3.zzz;
                    if (f2 != -1.0f) {
                        int i19 = zzxoVar.zzg;
                    }
                    int i20 = zzuVar3.zzj;
                    if (i20 != -1) {
                        int i21 = zzxoVar.zzh;
                    }
                    z3 = true;
                    this.zzg = z3;
                    this.zzh = zzln.zzZ(i3, false);
                    zzu zzuVar4 = this.zzd;
                    float f3 = zzuVar4.zzz;
                    this.zzi = f3 == -1.0f && f3 >= 10.0f;
                    this.zzj = zzuVar4.zzj;
                    this.zzk = zzuVar4.zzc();
                    i5 = 0;
                    while (true) {
                        i6 = Integer.MAX_VALUE;
                        if (i5 >= zzxoVar.zzo.size()) {
                            i7 = 0;
                            i5 = Integer.MAX_VALUE;
                            break;
                        } else {
                            i7 = zzyd.zzj(this.zzd, (String) zzxoVar.zzo.get(i5), false);
                            if (i7 > 0) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.zzm = i5;
                    this.zzn = i7;
                    int i22 = this.zzd.zzf;
                    int i23 = zzxoVar.zzp;
                    this.zzo = zzyd.zzm(i22, 0);
                    int i24 = this.zzd.zzf;
                    this.zzq = (i24 == 0 && (i24 & 1) == 0) ? false : true;
                    this.zzr = zzyd.zzj(this.zzd, str, zzyd.zzi(str) == null);
                    i8 = 0;
                    while (true) {
                        if (i8 < zzxoVar.zzm.size()) {
                            String str3 = this.zzd.zzo;
                            if (str3 != null && str3.equals(zzxoVar.zzm.get(i8))) {
                                i6 = i8;
                                break;
                            }
                            i8++;
                        } else {
                            break;
                        }
                    }
                    this.zzl = i6;
                    this.zzp = zzyd.zzn(this.zzd, zzxoVar.zzn);
                    this.zzt = (i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 128;
                    this.zzu = (i3 & 64) == 64;
                    zzuVar = this.zzd;
                    str2 = zzuVar.zzo;
                    if (str2 != null) {
                        switch (str2.hashCode()) {
                            case -1851077871:
                                if (str2.equals("video/dolby-vision")) {
                                    i9 = 5;
                                    break;
                                }
                                break;
                            case -1662735862:
                                if (str2.equals("video/av01")) {
                                    i9 = 4;
                                    break;
                                }
                                break;
                            case -1662541442:
                                if (str2.equals("video/hevc")) {
                                    i9 = 3;
                                    break;
                                }
                                break;
                            case 1331836730:
                                if (str2.equals("video/avc")) {
                                    i9 = 1;
                                    break;
                                }
                                break;
                            case 1599127257:
                                if (str2.equals("video/x-vnd.on2.vp9")) {
                                    i9 = 2;
                                    break;
                                }
                                break;
                        }
                        this.zzv = i9;
                        if ((zzuVar.zzf & 16384) == 0) {
                            zzxo zzxoVar2 = this.zzf;
                            if (zzln.zzZ(i3, zzxoVar2.zzV) && ((z4 = this.zze) || zzxoVar2.zzK)) {
                                if (zzln.zzZ(i3, false) && this.zzg && z4 && zzuVar.zzj != -1) {
                                    boolean z6 = zzxoVar2.zzG;
                                    boolean z7 = zzxoVar2.zzF;
                                    if ((i14 & i3) != 0) {
                                        i13 = 2;
                                    }
                                }
                                this.zzs = i13;
                            }
                        }
                        i13 = 0;
                        this.zzs = i13;
                    }
                    i9 = 0;
                    this.zzv = i9;
                    if ((zzuVar.zzf & 16384) == 0) {
                    }
                    i13 = 0;
                    this.zzs = i13;
                }
                z3 = false;
                this.zzg = z3;
                this.zzh = zzln.zzZ(i3, false);
                zzu zzuVar42 = this.zzd;
                float f32 = zzuVar42.zzz;
                this.zzi = f32 == -1.0f && f32 >= 10.0f;
                this.zzj = zzuVar42.zzj;
                this.zzk = zzuVar42.zzc();
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 >= zzxoVar.zzo.size()) {
                    }
                    i5++;
                }
                this.zzm = i5;
                this.zzn = i7;
                int i222 = this.zzd.zzf;
                int i232 = zzxoVar.zzp;
                this.zzo = zzyd.zzm(i222, 0);
                int i242 = this.zzd.zzf;
                this.zzq = (i242 == 0 && (i242 & 1) == 0) ? false : true;
                this.zzr = zzyd.zzj(this.zzd, str, zzyd.zzi(str) == null);
                i8 = 0;
                while (true) {
                    if (i8 < zzxoVar.zzm.size()) {
                    }
                    i8++;
                }
                this.zzl = i6;
                this.zzp = zzyd.zzn(this.zzd, zzxoVar.zzn);
                this.zzt = (i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 128;
                this.zzu = (i3 & 64) == 64;
                zzuVar = this.zzd;
                str2 = zzuVar.zzo;
                if (str2 != null) {
                }
                i9 = 0;
                this.zzv = i9;
                if ((zzuVar.zzf & 16384) == 0) {
                }
                i13 = 0;
                this.zzs = i13;
            }
        }
        z2 = false;
        this.zze = z2;
        if (z) {
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = zzln.zzZ(i3, false);
        zzu zzuVar422 = this.zzd;
        float f322 = zzuVar422.zzz;
        this.zzi = f322 == -1.0f && f322 >= 10.0f;
        this.zzj = zzuVar422.zzj;
        this.zzk = zzuVar422.zzc();
        i5 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i5 >= zzxoVar.zzo.size()) {
            }
            i5++;
        }
        this.zzm = i5;
        this.zzn = i7;
        int i2222 = this.zzd.zzf;
        int i2322 = zzxoVar.zzp;
        this.zzo = zzyd.zzm(i2222, 0);
        int i2422 = this.zzd.zzf;
        this.zzq = (i2422 == 0 && (i2422 & 1) == 0) ? false : true;
        this.zzr = zzyd.zzj(this.zzd, str, zzyd.zzi(str) == null);
        i8 = 0;
        while (true) {
            if (i8 < zzxoVar.zzm.size()) {
            }
            i8++;
        }
        this.zzl = i6;
        this.zzp = zzyd.zzn(this.zzd, zzxoVar.zzn);
        this.zzt = (i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 128;
        this.zzu = (i3 & 64) == 64;
        zzuVar = this.zzd;
        str2 = zzuVar.zzo;
        if (str2 != null) {
        }
        i9 = 0;
        this.zzv = i9;
        if ((zzuVar.zzf & 16384) == 0) {
        }
        i13 = 0;
        this.zzs = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzyc zzycVar, zzyc zzycVar2) {
        zzgjp zza = zzgjp.zzg().zzd(zzycVar.zzh, zzycVar2.zzh).zza(Integer.valueOf(zzycVar.zzm), Integer.valueOf(zzycVar2.zzm), zzglj.zzb().zza()).zzb(zzycVar.zzn, zzycVar2.zzn).zzb(zzycVar.zzo, zzycVar2.zzo).zza(Integer.valueOf(zzycVar.zzp), Integer.valueOf(zzycVar2.zzp), zzglj.zzb().zza()).zzd(zzycVar.zzq, zzycVar2.zzq).zzb(zzycVar.zzr, zzycVar2.zzr).zzd(zzycVar.zzi, zzycVar2.zzi).zzd(zzycVar.zze, zzycVar2.zze).zzd(zzycVar.zzg, zzycVar2.zzg).zza(Integer.valueOf(zzycVar.zzl), Integer.valueOf(zzycVar2.zzl), zzglj.zzb().zza());
        boolean z = zzycVar.zzt;
        zzgjp zzd = zza.zzd(z, zzycVar2.zzt);
        boolean z2 = zzycVar.zzu;
        zzgjp zzd2 = zzd.zzd(z2, zzycVar2.zzu);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzycVar.zzv, zzycVar2.zzv);
        }
        return zzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzyc zzycVar, zzyc zzycVar2) {
        zzglj zzgljVar;
        zzglj zza;
        if (zzycVar.zze && zzycVar.zzh) {
            zza = zzyd.zzc;
        } else {
            zzgljVar = zzyd.zzc;
            zza = zzgljVar.zza();
        }
        zzgjp zzg = zzgjp.zzg();
        boolean z = zzycVar.zzf.zzF;
        return zzg.zza(Integer.valueOf(zzycVar.zzk), Integer.valueOf(zzycVar2.zzk), zza).zza(Integer.valueOf(zzycVar.zzj), Integer.valueOf(zzycVar2.zzj), zza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        zzyc zzycVar = (zzyc) zzxvVar;
        if (!Objects.equals(this.zzd.zzo, zzycVar.zzd.zzo)) {
            return false;
        }
        boolean z = this.zzf.zzN;
        return this.zzt == zzycVar.zzt && this.zzu == zzycVar.zzu;
    }
}
