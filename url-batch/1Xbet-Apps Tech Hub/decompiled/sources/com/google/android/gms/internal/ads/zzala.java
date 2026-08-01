package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzala implements zzabp {
    private final zzfq zza;
    private final zzfj zzb = new zzfj();
    private final int zzc;

    public zzala(int i, zzfq zzfqVar, int i2) {
        this.zzc = i;
        this.zza = zzfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final zzabo zza(zzacf zzacfVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzf = zzacfVar.zzf();
        int min = (int) Math.min(112800L, zzacfVar.zzd() - zzf);
        this.zzb.zzD(min);
        ((zzabu) zzacfVar).zzm(this.zzb.zzI(), 0, min, false);
        zzfj zzfjVar = this.zzb;
        int zzd = zzfjVar.zzd();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzfjVar.zza() >= 188 && (zza2 = (zza = zzalm.zza(zzfjVar.zzI(), zzfjVar.zzc(), zzd)) + Opcodes.NEWARRAY) <= zzd) {
            long zzb = zzalm.zzb(zzfjVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 <= j) {
                    j4 = zza;
                    if (100000 + zzb2 <= j) {
                        j3 = zzb2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzabo.zzd(zzb2, zzf);
                }
                return zzabo.zze(zzf + j4);
            }
            zzfjVar.zzG(zza2);
            j2 = zza2;
        }
        return j3 != -9223372036854775807L ? zzabo.zzf(j3, zzf + j2) : zzabo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzb() {
        byte[] bArr = zzfs.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
    }
}
