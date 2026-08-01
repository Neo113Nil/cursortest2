package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzajq implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzajp
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzajq.zza;
            return new zzace[]{new zzajq()};
        }
    };
    private final zzajr zzb = new zzajr(null);
    private final zzfj zzc = new zzfj(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        int zza2 = zzacfVar.zza(this.zzc.zzI(), 0, 16384);
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
        int i;
        zzfj zzfjVar = new zzfj(10);
        int i2 = 0;
        while (true) {
            zzabuVar = (zzabu) zzacfVar;
            zzabuVar.zzm(zzfjVar.zzI(), 0, 10, false);
            zzfjVar.zzG(0);
            if (zzfjVar.zzn() != 4801587) {
                break;
            }
            zzfjVar.zzH(3);
            int zzk = zzfjVar.zzk();
            i2 += zzk + 10;
            zzabuVar.zzl(zzk, false);
        }
        zzacfVar.zzj();
        zzabuVar.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzabuVar.zzm(zzfjVar.zzI(), 0, 7, false);
            zzfjVar.zzG(0);
            int zzp = zzfjVar.zzp();
            if (zzp == 44096 || zzp == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzI = zzfjVar.zzI();
                int i6 = zzabi.zza;
                if (zzI.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzI[2] & 255) << 8) | (zzI[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((zzI[4] & 255) << 16) | ((zzI[5] & 255) << 8) | (zzI[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzp == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzabuVar.zzl(i - 7, false);
            } else {
                zzacfVar.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzabuVar.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
