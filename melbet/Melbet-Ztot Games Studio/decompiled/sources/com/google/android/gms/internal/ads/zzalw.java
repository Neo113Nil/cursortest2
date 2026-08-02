package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzalw implements zzack {
    private final zzalx zza = new zzalx(null, 0);
    private final zzek zzb = new zzek(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        int zza = zzaclVar.zza(this.zzb.zzM(), 0, 2786);
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzK(0);
        this.zzb.zzJ(zza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zza.zzb(zzacnVar, new zzans(Integer.MIN_VALUE, 0, 1));
        zzacnVar.zzD();
        zzacnVar.zzO(new zzadh(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzc = false;
        this.zza.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r9.zzj();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if ((r4 - r3) >= 8192) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        zzaby zzabyVar;
        zzek zzekVar = new zzek(10);
        int i = 0;
        while (true) {
            zzabyVar = (zzaby) zzaclVar;
            zzabyVar.zzm(zzekVar.zzM(), 0, 10, false);
            zzekVar.zzK(0);
            if (zzekVar.zzo() != 4801587) {
                break;
            }
            zzekVar.zzL(3);
            int zzl = zzekVar.zzl();
            i += zzl + 10;
            zzabyVar.zzl(zzl, false);
        }
        zzaclVar.zzj();
        zzabyVar.zzl(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                zzabyVar.zzm(zzekVar.zzM(), 0, 6, false);
                zzekVar.zzK(0);
                if (zzekVar.zzq() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int zzb = zzabj.zzb(zzekVar.zzM());
                if (zzb == -1) {
                    return false;
                }
                zzabyVar.zzl(zzb - 6, false);
            }
            zzabyVar.zzl(i2, false);
        }
    }
}
