package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzxv extends zzxs {
    private final boolean zze;
    private final zzxk zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r2 <= 2.1474836E9f) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r1 >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r1 >= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (r1 >= 0.0f) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r10 >= 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzxv(int i, zzdc zzdcVar, int i2, zzxk zzxkVar, int i3, int i4, boolean z) {
        super(i, zzdcVar, 0);
        boolean z2;
        boolean z3;
        int i5;
        String str;
        int i6;
        char c;
        zzxk zzxkVar2;
        boolean z4;
        int i7 = 0;
        this.zzf = zzxkVar;
        int i8 = true != zzxkVar.zzJ ? 16 : 24;
        boolean z5 = zzxkVar.zzI;
        if (z) {
            zzam zzamVar = this.zzd;
            if (zzamVar.zzr != -1) {
                int i9 = zzxkVar.zzd;
            }
            if (zzamVar.zzs != -1) {
                int i10 = zzxkVar.zze;
            }
            float f = zzamVar.zzt;
            if (f != -1.0f) {
                int i11 = zzxkVar.zzf;
            }
            if (zzamVar.zzi != -1) {
                int i12 = zzxkVar.zzg;
            }
            z2 = true;
            this.zze = z2;
            if (z) {
                zzam zzamVar2 = this.zzd;
                int i13 = zzamVar2.zzr;
                if (i13 != -1) {
                    int i14 = zzxkVar.zzh;
                }
                int i15 = zzamVar2.zzs;
                if (i15 != -1) {
                    int i16 = zzxkVar.zzi;
                }
                float f2 = zzamVar2.zzt;
                if (f2 != -1.0f) {
                    int i17 = zzxkVar.zzj;
                }
                int i18 = zzamVar2.zzi;
                if (i18 != -1) {
                    int i19 = zzxkVar.zzk;
                }
                z3 = true;
                this.zzg = z3;
                this.zzh = zzxw.zzn(i3, false);
                zzam zzamVar3 = this.zzd;
                this.zzi = zzamVar3.zzi;
                this.zzj = zzamVar3.zza();
                int i20 = this.zzd.zzf;
                int i21 = zzxkVar.zzp;
                this.zzl = Integer.bitCount(0);
                int i22 = this.zzd.zzf;
                this.zzm = true;
                i5 = 0;
                while (true) {
                    if (i5 >= zzxkVar.zzo.size()) {
                        i5 = Integer.MAX_VALUE;
                        break;
                    }
                    String str2 = this.zzd.zzm;
                    if (str2 != null && str2.equals(zzxkVar.zzo.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                this.zzk = i5;
                this.zzo = (i3 & 384) == 128;
                this.zzp = (i3 & 64) == 64;
                zzam zzamVar4 = this.zzd;
                str = zzamVar4.zzm;
                if (str != null) {
                    i6 = 4;
                    switch (str.hashCode()) {
                        case -1851077871:
                            if (str.equals("video/dolby-vision")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1662735862:
                            if (str.equals("video/av01")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1662541442:
                            if (str.equals("video/hevc")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1331836730:
                            if (str.equals("video/avc")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1599127257:
                            if (str.equals("video/x-vnd.on2.vp9")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        i6 = 5;
                    } else if (c != 1) {
                        if (c == 2) {
                            i6 = 3;
                        } else if (c == 3) {
                            i6 = 2;
                        } else if (c == 4) {
                            i6 = 1;
                        }
                    }
                    this.zzq = i6;
                    int i23 = zzamVar4.zzf;
                    zzxkVar2 = this.zzf;
                    if (zzxw.zzn(i3, zzxkVar2.zzS) && ((z4 = this.zze) || zzxkVar2.zzH)) {
                        if (zzxw.zzn(i3, false) && this.zzg && z4 && zzamVar4.zzi != -1) {
                            boolean z6 = zzxkVar2.zzB;
                            boolean z7 = zzxkVar2.zzA;
                            if ((i8 & i3) != 0) {
                                i7 = 2;
                            }
                        }
                        i7 = 1;
                    }
                    this.zzn = i7;
                }
                i6 = 0;
                this.zzq = i6;
                int i232 = zzamVar4.zzf;
                zzxkVar2 = this.zzf;
                if (zzxw.zzn(i3, zzxkVar2.zzS)) {
                    if (zzxw.zzn(i3, false)) {
                        boolean z62 = zzxkVar2.zzB;
                        boolean z72 = zzxkVar2.zzA;
                        if ((i8 & i3) != 0) {
                        }
                    }
                    i7 = 1;
                }
                this.zzn = i7;
            }
            z3 = false;
            this.zzg = z3;
            this.zzh = zzxw.zzn(i3, false);
            zzam zzamVar32 = this.zzd;
            this.zzi = zzamVar32.zzi;
            this.zzj = zzamVar32.zza();
            int i202 = this.zzd.zzf;
            int i212 = zzxkVar.zzp;
            this.zzl = Integer.bitCount(0);
            int i222 = this.zzd.zzf;
            this.zzm = true;
            i5 = 0;
            while (true) {
                if (i5 >= zzxkVar.zzo.size()) {
                }
                i5++;
            }
            this.zzk = i5;
            this.zzo = (i3 & 384) == 128;
            this.zzp = (i3 & 64) == 64;
            zzam zzamVar42 = this.zzd;
            str = zzamVar42.zzm;
            if (str != null) {
            }
            i6 = 0;
            this.zzq = i6;
            int i2322 = zzamVar42.zzf;
            zzxkVar2 = this.zzf;
            if (zzxw.zzn(i3, zzxkVar2.zzS)) {
            }
            this.zzn = i7;
        }
        z2 = false;
        this.zze = z2;
        if (z) {
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = zzxw.zzn(i3, false);
        zzam zzamVar322 = this.zzd;
        this.zzi = zzamVar322.zzi;
        this.zzj = zzamVar322.zza();
        int i2022 = this.zzd.zzf;
        int i2122 = zzxkVar.zzp;
        this.zzl = Integer.bitCount(0);
        int i2222 = this.zzd.zzf;
        this.zzm = true;
        i5 = 0;
        while (true) {
            if (i5 >= zzxkVar.zzo.size()) {
            }
            i5++;
        }
        this.zzk = i5;
        this.zzo = (i3 & 384) == 128;
        this.zzp = (i3 & 64) == 64;
        zzam zzamVar422 = this.zzd;
        str = zzamVar422.zzm;
        if (str != null) {
        }
        i6 = 0;
        this.zzq = i6;
        int i23222 = zzamVar422.zzf;
        zzxkVar2 = this.zzf;
        if (zzxw.zzn(i3, zzxkVar2.zzS)) {
        }
        this.zzn = i7;
    }

    public static /* synthetic */ int zza(zzxv zzxvVar, zzxv zzxvVar2) {
        zzfyd zzfydVar;
        zzfyd zza;
        zzfyd zzfydVar2;
        if (zzxvVar.zze && zzxvVar.zzh) {
            zza = zzxw.zzc;
        } else {
            zzfydVar = zzxw.zzc;
            zza = zzfydVar.zza();
        }
        zzfwj zzj = zzfwj.zzj();
        Integer valueOf = Integer.valueOf(zzxvVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzxvVar2.zzi);
        boolean z = zzxvVar.zzf.zzA;
        zzfydVar2 = zzxw.zzd;
        return zzj.zzc(valueOf, valueOf2, zzfydVar2).zzc(Integer.valueOf(zzxvVar.zzj), Integer.valueOf(zzxvVar2.zzj), zza).zzc(Integer.valueOf(zzxvVar.zzi), Integer.valueOf(zzxvVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzxv zzxvVar, zzxv zzxvVar2) {
        zzfwj zzb = zzfwj.zzj().zzd(zzxvVar.zzh, zzxvVar2.zzh).zzb(zzxvVar.zzl, zzxvVar2.zzl);
        boolean z = zzxvVar.zzm;
        boolean z2 = zzxvVar2.zzm;
        zzfwj zzc = zzb.zzd(true, true).zzd(zzxvVar.zze, zzxvVar2.zze).zzd(zzxvVar.zzg, zzxvVar2.zzg).zzc(Integer.valueOf(zzxvVar.zzk), Integer.valueOf(zzxvVar2.zzk), zzfyd.zzc().zza());
        boolean z3 = zzxvVar.zzo;
        zzfwj zzd = zzc.zzd(z3, zzxvVar2.zzo);
        boolean z4 = zzxvVar.zzp;
        zzfwj zzd2 = zzd.zzd(z4, zzxvVar2.zzp);
        if (z3 && z4) {
            zzd2 = zzd2.zzb(zzxvVar.zzq, zzxvVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxs
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzxs
    public final /* bridge */ /* synthetic */ boolean zzc(zzxs zzxsVar) {
        zzxv zzxvVar = (zzxv) zzxsVar;
        if (!zzfs.zzF(this.zzd.zzm, zzxvVar.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzK;
        return this.zzo == zzxvVar.zzo && this.zzp == zzxvVar.zzp;
    }
}
