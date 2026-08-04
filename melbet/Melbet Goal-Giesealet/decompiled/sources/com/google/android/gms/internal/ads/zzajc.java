package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzajc implements zzacu {
    private zzacx zza;
    private zzajj zzb;
    private boolean zzc;

    static {
        int i = zzajb.zza;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zza(zzacv zzacvVar) throws IOException {
        zzaje zzajeVar = new zzaje();
        if (zzajeVar.zzc(zzacvVar, true) && (zzajeVar.zza & 2) == 2) {
            int min = Math.min(zzajeVar.zze, 8);
            zzef zzefVar = new zzef(min);
            zzacvVar.zzi(zzefVar.zzi(), 0, min);
            zzefVar.zzh(0);
            if (zzefVar.zzd() >= 5 && zzefVar.zzs() == 127 && zzefVar.zzz() == 1179402563) {
                this.zzb = new zzaja();
            } else {
                zzefVar.zzh(0);
                try {
                    if (zzaeh.zzd(1, zzefVar, true)) {
                        this.zzb = new zzajl();
                    }
                } catch (zzas unused) {
                }
                zzefVar.zzh(0);
                if (zzajg.zzd(zzefVar)) {
                    this.zzb = new zzajg();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        try {
            return zza(zzacvVar);
        } catch (zzas unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zza(zzacvVar)) {
                throw zzas.zzb("Failed to determine bitstream type", null);
            }
            zzacvVar.zzl();
        }
        if (!this.zzc) {
            zzaeb zzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzacvVar, zzadsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        zzajj zzajjVar = this.zzb;
        if (zzajjVar != null) {
            zzajjVar.zzf(j, j2);
        }
    }
}
