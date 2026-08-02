package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzabg {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabf zza(byte[] bArr) throws zzbo {
        return zzb(new zzej(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabf zzb(zzej zzejVar, boolean z) throws zzbo {
        int zzc2 = zzc(zzejVar);
        int zzd = zzd(zzejVar);
        int zzd2 = zzejVar.zzd(4);
        String str = "mp4a.40." + zzc2;
        int i = 22;
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzejVar);
            zzc2 = zzc(zzejVar);
            if (zzc2 == 22) {
                zzd2 = zzejVar.zzd(4);
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
                        throw zzbo.zzc("Unsupported audio object type: " + zzc2);
                }
            }
            if (zzejVar.zzp()) {
                zzea.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzejVar.zzp()) {
                zzejVar.zzn(14);
            }
            boolean zzp = zzejVar.zzp();
            if (zzd2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 == 20) {
                    zzc2 = 20;
                }
                if (zzp) {
                    if (zzc2 == 22) {
                        zzejVar.zzn(16);
                    } else {
                        i = zzc2;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        zzejVar.zzn(3);
                    }
                    zzejVar.zzn(1);
                }
                switch (zzc2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int zzd3 = zzejVar.zzd(2);
                        if (zzd3 == 2) {
                            i2 = zzd3;
                        }
                        throw zzbo.zzc("Unsupported epConfig: " + i2);
                }
            }
            zzejVar.zzn(3);
            if (zzp) {
            }
            switch (zzc2) {
            }
        }
        int i3 = zzc[zzd2];
        if (i3 != -1) {
            return new zzabf(zzd, i3, str, null);
        }
        throw zzbo.zza(null, null);
    }

    private static int zzc(zzej zzejVar) {
        int zzd = zzejVar.zzd(5);
        return zzd == 31 ? zzejVar.zzd(6) + 32 : zzd;
    }

    private static int zzd(zzej zzejVar) throws zzbo {
        int zzd = zzejVar.zzd(4);
        if (zzd == 15) {
            if (zzejVar.zza() >= 24) {
                return zzejVar.zzd(24);
            }
            throw zzbo.zza("AAC header insufficient data", null);
        }
        if (zzd < 13) {
            return zzb[zzd];
        }
        throw zzbo.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
