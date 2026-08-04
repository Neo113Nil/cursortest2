package com.google.android.gms.internal.ads;

import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzadc {
    public static boolean zza(zzef zzefVar, zzadh zzadhVar, int i, zzadb zzadbVar) {
        int zzg = zzefVar.zzg();
        long zzz = zzefVar.zzz();
        long j = zzz >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = zzz >> 12;
        long j3 = zzz >> 8;
        long j4 = zzz >> 4;
        long j5 = zzz >> 1;
        long j6 = zzz & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzadhVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzadhVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 != 0 && i3 != zzadhVar.zzi) || j6 == 1 || !zzd(zzefVar, zzadhVar, z, zzadbVar)) {
            return false;
        }
        long j7 = zzadbVar.zza;
        int zzc = zzc(zzefVar, (int) (j2 & 15));
        long j8 = zzadhVar.zzj;
        boolean z2 = j8 == 0 || j7 + ((long) zzc) >= j8;
        if (zzc == -1) {
            return false;
        }
        if ((!z2 && zzc < zzadhVar.zza) || zzc > zzadhVar.zzb) {
            return false;
        }
        int i4 = zzadhVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzadhVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzefVar.zzs() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int zzt = zzefVar.zzt();
                if (i5 == 14) {
                    zzt *= 10;
                }
                if (zzt != i4) {
                    return false;
                }
            }
        }
        if (zzefVar.zzs() != zzeo.zzJ(zzefVar.zzi(), zzg, zzefVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzefVar.zzd() != 0) {
            int zzn = zzefVar.zzn();
            if ((zzn & 128) != 0) {
                return false;
            }
            int i6 = (zzn & WebSocketProtocol.PAYLOAD_SHORT) >> 1;
            if ((i6 >= 2 && i6 <= 7) || (i6 >= 13 && i6 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i6);
                zzds.zzb("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzacv zzacvVar, zzadh zzadhVar) throws IOException {
        zzacvVar.zzl();
        zzacvVar.zzk(1);
        byte[] bArr = new byte[1];
        zzacvVar.zzi(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzacvVar.zzk(2);
        int i2 = 1 != i ? 6 : 7;
        zzef zzefVar = new zzef(i2);
        zzefVar.zzf(zzacy.zzb(zzacvVar, zzefVar.zzi(), 0, i2));
        zzacvVar.zzl();
        zzadb zzadbVar = new zzadb();
        if (zzd(zzefVar, zzadhVar, z, zzadbVar)) {
            return zzadbVar.zza;
        }
        throw zzas.zzb(null, null);
    }

    public static int zzc(zzef zzefVar, int i) {
        switch (i) {
            case 1:
                return JfifUtil.MARKER_SOFn;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzefVar.zzs() + 1;
            case 7:
                return zzefVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzef zzefVar, zzadh zzadhVar, boolean z, zzadb zzadbVar) {
        try {
            long zzO = zzefVar.zzO();
            if (!z) {
                zzO *= zzadhVar.zzb;
            }
            long j = zzadhVar.zzj;
            if (j != 0 && zzO > j) {
                return false;
            }
            zzadbVar.zza = zzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
