package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzacw {
    private final zzfj zza = new zzfj(10);

    public final zzcb zza(zzacf zzacfVar, zzafy zzafyVar) throws IOException {
        zzcb zzcbVar = null;
        int i = 0;
        while (true) {
            try {
                ((zzabu) zzacfVar).zzm(this.zza.zzI(), 0, 10, false);
                this.zza.zzG(0);
                if (this.zza.zzn() != 4801587) {
                    break;
                }
                this.zza.zzH(3);
                int zzk = this.zza.zzk();
                int i2 = zzk + 10;
                if (zzcbVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzI(), 0, bArr, 0, 10);
                    ((zzabu) zzacfVar).zzm(bArr, 10, zzk, false);
                    zzcbVar = zzaga.zza(bArr, i2, zzafyVar, new zzafb());
                } else {
                    ((zzabu) zzacfVar).zzl(zzk, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzacfVar.zzj();
        ((zzabu) zzacfVar).zzl(i, false);
        return zzcbVar;
    }
}
