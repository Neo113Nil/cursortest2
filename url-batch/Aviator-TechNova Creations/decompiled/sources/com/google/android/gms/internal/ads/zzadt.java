package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzadt {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzads zza(byte[] bArr) throws zzat {
        return zzb(new zzeq(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzads zzb(zzeq zzeqVar, boolean z) throws zzat {
        int i;
        int zzc2 = zzc(zzeqVar);
        int zzd = zzd(zzeqVar);
        int zzj = zzeqVar.zzj(4);
        StringBuilder sb = new StringBuilder(String.valueOf(zzc2).length() + 8);
        sb.append("mp4a.40.");
        sb.append(zzc2);
        String sb2 = sb.toString();
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzeqVar);
            zzc2 = zzc(zzeqVar);
            if (zzc2 == 22) {
                zzj = zzeqVar.zzj(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (zzc2 != 1 && zzc2 != 2 && zzc2 != 3 && zzc2 != 4 && zzc2 != 6 && zzc2 != 7 && zzc2 != 17) {
                switch (zzc2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zzc2).length() + 31);
                        sb3.append("Unsupported audio object type: ");
                        sb3.append(zzc2);
                        throw zzat.zzc(sb3.toString());
                }
            }
            if (zzeqVar.zzi()) {
                zzee.zzc("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(14);
            }
            boolean zzi = zzeqVar.zzi();
            if (zzj == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 == 20) {
                    zzc2 = 20;
                }
                if (zzi) {
                    if (zzc2 == 22) {
                        zzeqVar.zzh(16);
                        i = 22;
                    } else {
                        i = zzc2;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        zzeqVar.zzh(3);
                    }
                    zzeqVar.zzh(1);
                }
                switch (zzc2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int zzj2 = zzeqVar.zzj(2);
                        if (zzj2 == 2) {
                            i2 = zzj2;
                        }
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + 22);
                        sb4.append("Unsupported epConfig: ");
                        sb4.append(i2);
                        throw zzat.zzc(sb4.toString());
                }
            }
            zzeqVar.zzh(3);
            if (zzi) {
            }
            switch (zzc2) {
            }
        }
        int i3 = zzc[zzj];
        if (i3 != -1) {
            return new zzads(zzd, i3, sb2, null);
        }
        throw zzat.zzb(null, null);
    }

    private static int zzc(zzeq zzeqVar) {
        int zzj = zzeqVar.zzj(5);
        return zzj == 31 ? zzeqVar.zzj(6) + 32 : zzj;
    }

    private static int zzd(zzeq zzeqVar) throws zzat {
        int zzj = zzeqVar.zzj(4);
        if (zzj == 15) {
            if (zzeqVar.zzc() >= 24) {
                return zzeqVar.zzj(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (zzj < 13) {
            return zzb[zzj];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }
}
