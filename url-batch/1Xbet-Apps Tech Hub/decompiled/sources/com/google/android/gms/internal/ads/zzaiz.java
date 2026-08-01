package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaiz implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzaiy
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzaiz.zza;
            return new zzace[]{new zzaiz()};
        }
    };
    private zzach zzb;
    private zzajh zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zza(zzacf zzacfVar) throws IOException {
        zzajb zzajbVar = new zzajb();
        if (zzajbVar.zzb(zzacfVar, true) && (zzajbVar.zza & 2) == 2) {
            int min = Math.min(zzajbVar.zze, 8);
            zzfj zzfjVar = new zzfj(min);
            ((zzabu) zzacfVar).zzm(zzfjVar.zzI(), 0, min, false);
            zzfjVar.zzG(0);
            if (zzfjVar.zza() >= 5 && zzfjVar.zzl() == 127 && zzfjVar.zzt() == 1179402563) {
                this.zzc = new zzaix();
            } else {
                zzfjVar.zzG(0);
                try {
                    if (zzadq.zzd(1, zzfjVar, true)) {
                        this.zzc = new zzajj();
                    }
                } catch (zzcf unused) {
                }
                zzfjVar.zzG(0);
                if (zzajd.zzd(zzfjVar)) {
                    this.zzc = new zzajd();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        zzef.zzb(this.zzb);
        if (this.zzc == null) {
            if (!zza(zzacfVar)) {
                throw zzcf.zza("Failed to determine bitstream type", null);
            }
            zzacfVar.zzj();
        }
        if (!this.zzd) {
            zzadk zzw = this.zzb.zzw(0, 1);
            this.zzb.zzD();
            this.zzc.zzh(this.zzb, zzw);
            this.zzd = true;
        }
        return this.zzc.zze(zzacfVar, zzadbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzb = zzachVar;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        zzajh zzajhVar = this.zzc;
        if (zzajhVar != null) {
            zzajhVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        try {
            return zza(zzacfVar);
        } catch (zzcf unused) {
            return false;
        }
    }
}
