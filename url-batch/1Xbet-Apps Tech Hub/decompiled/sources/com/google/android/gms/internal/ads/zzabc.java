package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzabc {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabb zza(byte[] bArr) throws zzcf {
        return zzb(new zzfi(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabb zzb(zzfi zzfiVar, boolean z) throws zzcf {
        int zzc2 = zzc(zzfiVar);
        int zzd = zzd(zzfiVar);
        int zzd2 = zzfiVar.zzd(4);
        String str = "mp4a.40." + zzc2;
        int i = 22;
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzfiVar);
            zzc2 = zzc(zzfiVar);
            if (zzc2 == 22) {
                zzd2 = zzfiVar.zzd(4);
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
                        throw zzcf.zzc("Unsupported audio object type: " + zzc2);
                }
            }
            if (zzfiVar.zzn()) {
                zzez.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzfiVar.zzn()) {
                zzfiVar.zzl(14);
            }
            boolean zzn = zzfiVar.zzn();
            if (zzd2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 == 20) {
                    zzc2 = 20;
                }
                if (zzn) {
                    if (zzc2 == 22) {
                        zzfiVar.zzl(16);
                    } else {
                        i = zzc2;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        zzfiVar.zzl(3);
                    }
                    zzfiVar.zzl(1);
                }
                switch (zzc2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int zzd3 = zzfiVar.zzd(2);
                        if (zzd3 == 2) {
                            i2 = zzd3;
                        }
                        throw zzcf.zzc("Unsupported epConfig: " + i2);
                }
            }
            zzfiVar.zzl(3);
            if (zzn) {
            }
            switch (zzc2) {
            }
        }
        int i3 = zzc[zzd2];
        if (i3 != -1) {
            return new zzabb(zzd, i3, str, null);
        }
        throw zzcf.zza(null, null);
    }

    private static int zzc(zzfi zzfiVar) {
        int zzd = zzfiVar.zzd(5);
        return zzd == 31 ? zzfiVar.zzd(6) + 32 : zzd;
    }

    private static int zzd(zzfi zzfiVar) throws zzcf {
        int zzd = zzfiVar.zzd(4);
        if (zzd == 15) {
            if (zzfiVar.zza() >= 24) {
                return zzfiVar.zzd(24);
            }
            throw zzcf.zza("AAC header insufficient data", null);
        }
        if (zzd < 13) {
            return zzb[zzd];
        }
        throw zzcf.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
