package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzakk implements zzajy {
    private zzadk zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzfj zza = new zzfj(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(zzfj zzfjVar) {
        zzef.zzb(this.zzb);
        if (this.zzc) {
            int zza = zzfjVar.zza();
            int i = this.zzf;
            if (i < 10) {
                int min = Math.min(zza, 10 - i);
                System.arraycopy(zzfjVar.zzI(), zzfjVar.zzc(), this.zza.zzI(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzG(0);
                    if (this.zza.zzl() != 73 || this.zza.zzl() != 68 || this.zza.zzl() != 51) {
                        zzez.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    } else {
                        this.zza.zzH(3);
                        this.zze = this.zza.zzk() + 10;
                    }
                }
            }
            int min2 = Math.min(zza, this.zze - this.zzf);
            this.zzb.zzr(zzfjVar, min2);
            this.zzf += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        zzadk zzw = zzachVar.zzw(zzalkVar.zza(), 5);
        this.zzb = zzw;
        zzak zzakVar = new zzak();
        zzakVar.zzJ(zzalkVar.zzb());
        zzakVar.zzU("application/id3");
        zzw.zzl(zzakVar.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
        int i;
        zzef.zzb(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                this.zzb.zzt(j, 1, i, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzd = j;
        }
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
