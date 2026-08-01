package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzalv {
    public static Pair zza(zzacf zzacfVar) throws IOException {
        zzacfVar.zzj();
        zzalu zzd = zzd(1684108385, zzacfVar, new zzfj(8));
        ((zzabu) zzacfVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzacfVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzalt zzb(zzacf zzacfVar) throws IOException {
        byte[] bArr;
        zzfj zzfjVar = new zzfj(16);
        zzalu zzd = zzd(1718449184, zzacfVar, zzfjVar);
        zzef.zzf(zzd.zzb >= 16);
        zzabu zzabuVar = (zzabu) zzacfVar;
        zzabuVar.zzm(zzfjVar.zzI(), 0, 16, false);
        zzfjVar.zzG(0);
        int zzj = zzfjVar.zzj();
        int zzj2 = zzfjVar.zzj();
        int zzi = zzfjVar.zzi();
        int zzi2 = zzfjVar.zzi();
        int zzj3 = zzfjVar.zzj();
        int zzj4 = zzfjVar.zzj();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zzabuVar.zzm(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzfs.zzf;
        }
        zzabuVar.zzo((int) (zzacfVar.zze() - zzacfVar.zzf()), false);
        return new zzalt(zzj, zzj2, zzi, zzi2, zzj3, zzj4, bArr);
    }

    public static boolean zzc(zzacf zzacfVar) throws IOException {
        zzfj zzfjVar = new zzfj(8);
        int i = zzalu.zza(zzacfVar, zzfjVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzabu) zzacfVar).zzm(zzfjVar.zzI(), 0, 4, false);
        zzfjVar.zzG(0);
        int zzf = zzfjVar.zzf();
        if (zzf == 1463899717) {
            return true;
        }
        zzez.zzc("WavHeaderReader", "Unsupported form type: " + zzf);
        return false;
    }

    private static zzalu zzd(int i, zzacf zzacfVar, zzfj zzfjVar) throws IOException {
        zzalu zza = zzalu.zza(zzacfVar, zzfjVar);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzez.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb + 8;
            if (j > 2147483647L) {
                throw zzcf.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
            }
            ((zzabu) zzacfVar).zzo((int) j, false);
            zza = zzalu.zza(zzacfVar, zzfjVar);
        }
    }
}
