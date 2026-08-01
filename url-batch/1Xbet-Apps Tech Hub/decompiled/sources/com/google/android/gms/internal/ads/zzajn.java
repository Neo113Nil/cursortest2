package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzajn implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzajm
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzajn.zza;
            return new zzace[]{new zzajn()};
        }
    };
    private final zzajo zzb = new zzajo(null);
    private final zzfj zzc = new zzfj(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        int zza2 = zzacfVar.zza(this.zzc.zzI(), 0, 2786);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzb.zzb(zzachVar, new zzalk(Integer.MIN_VALUE, 0, 1));
        zzachVar.zzD();
        zzachVar.zzO(new zzadd(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        zzabu zzabuVar;
        zzfj zzfjVar = new zzfj(10);
        int i = 0;
        while (true) {
            zzabuVar = (zzabu) zzacfVar;
            zzabuVar.zzm(zzfjVar.zzI(), 0, 10, false);
            zzfjVar.zzG(0);
            if (zzfjVar.zzn() != 4801587) {
                break;
            }
            zzfjVar.zzH(3);
            int zzk = zzfjVar.zzk();
            i += zzk + 10;
            zzabuVar.zzl(zzk, false);
        }
        zzacfVar.zzj();
        zzabuVar.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzabuVar.zzm(zzfjVar.zzI(), 0, 6, false);
            zzfjVar.zzG(0);
            if (zzfjVar.zzp() != 2935) {
                zzacfVar.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzabuVar.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzb = zzabf.zzb(zzfjVar.zzI());
                if (zzb == -1) {
                    return false;
                }
                zzabuVar.zzl(zzb - 6, false);
            }
        }
    }
}
