package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaix extends zzajh {
    private zzacr zza;
    private zzaiw zzb;

    zzaix() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    protected final long zza(zzfj zzfjVar) {
        if (!zzd(zzfjVar.zzI())) {
            return -1L;
        }
        int i = (zzfjVar.zzI()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zza = zzacn.zza(zzfjVar, i);
            zzfjVar.zzG(0);
            return zza;
        }
        zzfjVar.zzH(4);
        zzfjVar.zzv();
        int zza2 = zzacn.zza(zzfjVar, i);
        zzfjVar.zzG(0);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfj zzfjVar, long j, zzaje zzajeVar) {
        byte[] zzI = zzfjVar.zzI();
        zzacr zzacrVar = this.zza;
        if (zzacrVar == null) {
            zzacr zzacrVar2 = new zzacr(zzI, 17);
            this.zza = zzacrVar2;
            zzajeVar.zza = zzacrVar2.zzc(Arrays.copyOfRange(zzI, 9, zzfjVar.zzd()), null);
            return true;
        }
        if ((zzI[0] & Byte.MAX_VALUE) == 3) {
            zzacq zzb = zzaco.zzb(zzfjVar);
            zzacr zzf = zzacrVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzaiw(zzf, zzb);
            return true;
        }
        if (!zzd(zzI)) {
            return true;
        }
        zzaiw zzaiwVar = this.zzb;
        if (zzaiwVar != null) {
            zzaiwVar.zza(j);
            zzajeVar.zzb = this.zzb;
        }
        zzajeVar.zza.getClass();
        return false;
    }
}
