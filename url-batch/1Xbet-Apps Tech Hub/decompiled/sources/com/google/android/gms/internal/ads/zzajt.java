package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzajt implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzajs
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzajt.zza;
            return new zzace[]{new zzajt(0)};
        }
    };
    private final zzaju zzb;
    private final zzfj zzc;
    private final zzfj zzd;
    private final zzfi zze;
    private zzach zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzajt() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        zzef.zzb(this.zzf);
        int zza2 = zzacfVar.zza(this.zzc.zzI(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzO(new zzadd(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzf = zzachVar;
        this.zzb.zzb(zzachVar, new zzalk(Integer.MIN_VALUE, 0, 1));
        zzachVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        zzabu zzabuVar;
        int i = 0;
        while (true) {
            zzabuVar = (zzabu) zzacfVar;
            zzabuVar.zzm(this.zzd.zzI(), 0, 10, false);
            this.zzd.zzG(0);
            if (this.zzd.zzn() != 4801587) {
                break;
            }
            this.zzd.zzH(3);
            int zzk = this.zzd.zzk();
            i += zzk + 10;
            zzabuVar.zzl(zzk, false);
        }
        zzacfVar.zzj();
        zzabuVar.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzabuVar.zzm(this.zzd.zzI(), 0, 2, false);
            this.zzd.zzG(0);
            if (zzaju.zzf(this.zzd.zzp())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzabuVar.zzm(this.zzd.zzI(), 0, 4, false);
                this.zze.zzj(14);
                int zzd = this.zze.zzd(13);
                if (zzd <= 6) {
                    i4++;
                    zzacfVar.zzj();
                    zzabuVar.zzl(i4, false);
                } else {
                    zzabuVar.zzl(zzd - 6, false);
                    i3 += zzd;
                }
            } else {
                i4++;
                zzacfVar.zzj();
                zzabuVar.zzl(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    public zzajt(int i) {
        this.zzb = new zzaju(true, null);
        this.zzc = new zzfj(2048);
        this.zzh = -1L;
        zzfj zzfjVar = new zzfj(10);
        this.zzd = zzfjVar;
        byte[] zzI = zzfjVar.zzI();
        this.zze = new zzfi(zzI, zzI.length);
    }
}
