package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzafc {
    public static boolean zza(zzer zzerVar, zzafh zzafhVar, int i, zzafb zzafbVar) {
        int zzg = zzerVar.zzg();
        long zzz = zzerVar.zzz();
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
            if (i2 != zzafhVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzafhVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 != 0 && i3 != zzafhVar.zzi) || j6 == 1 || !zzd(zzerVar, zzafhVar, z, zzafbVar)) {
            return false;
        }
        long j7 = zzafbVar.zza;
        int zzc = zzc(zzerVar, (int) (j2 & 15));
        long j8 = zzafhVar.zzj;
        boolean z2 = j8 == 0 || j7 + ((long) zzc) >= j8;
        if (zzc == -1) {
            return false;
        }
        if ((!z2 && zzc < zzafhVar.zza) || zzc > zzafhVar.zzb) {
            return false;
        }
        int i4 = zzafhVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzafhVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzerVar.zzs() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int zzt = zzerVar.zzt();
                if (i5 == 14) {
                    zzt *= 10;
                }
                if (zzt != i4) {
                    return false;
                }
            }
        }
        if (zzerVar.zzs() != zzfj.zzI(zzerVar.zzi(), zzg, zzerVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzerVar.zzd() != 0) {
            int zzn = zzerVar.zzn();
            if ((zzn & 128) != 0) {
                return false;
            }
            int i6 = (zzn & 126) >> 1;
            if ((i6 >= 2 && i6 <= 7) || (i6 >= 13 && i6 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i6);
                zzee.zzb("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzaev zzaevVar, zzafh zzafhVar) throws IOException {
        zzaevVar.zzl();
        zzaevVar.zzk(1);
        byte[] bArr = new byte[1];
        zzaevVar.zzi(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzaevVar.zzk(2);
        int i2 = 1 != i ? 6 : 7;
        zzer zzerVar = new zzer(i2);
        zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 0, i2));
        zzaevVar.zzl();
        zzafb zzafbVar = new zzafb();
        if (zzd(zzerVar, zzafhVar, z, zzafbVar)) {
            return zzafbVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzer zzerVar, int i) {
        switch (i) {
            case 1:
                return Opcodes.CHECKCAST;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzerVar.zzs() + 1;
            case 7:
                return zzerVar.zzt() + 1;
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

    private static boolean zzd(zzer zzerVar, zzafh zzafhVar, boolean z, zzafb zzafbVar) {
        try {
            long zzO = zzerVar.zzO();
            if (!z) {
                zzO *= zzafhVar.zzb;
            }
            long j = zzafhVar.zzj;
            if (j != 0 && zzO > j) {
                return false;
            }
            zzafbVar.zza = zzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
