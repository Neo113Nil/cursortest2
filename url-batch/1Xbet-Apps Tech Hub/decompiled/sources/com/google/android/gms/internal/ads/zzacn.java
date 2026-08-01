package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzacn {
    public static int zza(zzfj zzfjVar, int i) {
        switch (i) {
            case 1:
                return Opcodes.CHECKCAST;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzfjVar.zzl() + 1;
            case 7:
                return zzfjVar.zzp() + 1;
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

    public static long zzb(zzacf zzacfVar, zzacr zzacrVar) throws IOException {
        zzacfVar.zzj();
        zzabu zzabuVar = (zzabu) zzacfVar;
        zzabuVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzabuVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzabuVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzfj zzfjVar = new zzfj(i2);
        zzfjVar.zzF(zzaci.zza(zzacfVar, zzfjVar.zzI(), 0, i2));
        zzacfVar.zzj();
        zzacm zzacmVar = new zzacm();
        if (zzd(zzfjVar, zzacrVar, z, zzacmVar)) {
            return zzacmVar.zza;
        }
        throw zzcf.zza(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r3 != r22.zzf) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r21.zzl() * 1000) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if (r4 == r5) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzc(zzfj zzfjVar, zzacr zzacrVar, int i, zzacm zzacmVar) {
        int zza;
        int zzc = zzfjVar.zzc();
        long zzt = zzfjVar.zzt();
        long j = zzt >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = zzt >> 12;
        long j3 = zzt >> 8;
        long j4 = zzt >> 4;
        long j5 = zzt >> 1;
        long j6 = zzt & 1;
        int i2 = (int) (j4 & 15);
        if (i2 > 7 ? !(i2 > 10 || zzacrVar.zzg != 2) : i2 == zzacrVar.zzg - 1) {
            int i3 = (int) (j5 & 7);
            if ((i3 == 0 || i3 == zzacrVar.zzi) && j6 != 1 && zzd(zzfjVar, zzacrVar, z, zzacmVar) && (zza = zza(zzfjVar, (int) (j2 & 15))) != -1 && zza <= zzacrVar.zzb) {
                int i4 = zzacrVar.zze;
                int i5 = (int) (j3 & 15);
                if (i5 != 0) {
                    if (i5 > 11) {
                        if (i5 != 12) {
                            if (i5 <= 14) {
                                int zzp = zzfjVar.zzp();
                                if (i5 == 14) {
                                    zzp *= 10;
                                }
                            }
                        }
                    }
                }
                if (zzfjVar.zzl() == zzfs.zze(zzfjVar.zzI(), zzc, zzfjVar.zzc() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzfj zzfjVar, zzacr zzacrVar, boolean z, zzacm zzacmVar) {
        try {
            long zzv = zzfjVar.zzv();
            if (!z) {
                zzv *= zzacrVar.zzb;
            }
            zzacmVar.zza = zzv;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
