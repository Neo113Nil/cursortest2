package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaer extends zzaeq {
    private final zzfj zzb;
    private final zzfj zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaer(zzadk zzadkVar) {
        super(zzadkVar);
        this.zzb = new zzfj(zzgg.zza);
        this.zzc = new zzfj(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeq
    protected final boolean zza(zzfj zzfjVar) throws zzaep {
        int zzl = zzfjVar.zzl();
        int i = zzl >> 4;
        int i2 = zzl & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzaep("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeq
    protected final boolean zzb(zzfj zzfjVar, long j) throws zzcf {
        int i;
        int zzl = zzfjVar.zzl();
        long zzg = zzfjVar.zzg();
        if (zzl == 0) {
            if (!this.zze) {
                zzfj zzfjVar2 = new zzfj(new byte[zzfjVar.zza()]);
                zzfjVar.zzC(zzfjVar2.zzI(), 0, zzfjVar.zza());
                zzabj zza = zzabj.zza(zzfjVar2);
                this.zzd = zza.zzb;
                zzak zzakVar = new zzak();
                zzakVar.zzU("video/avc");
                zzakVar.zzz(zza.zzk);
                zzakVar.zzab(zza.zzc);
                zzakVar.zzH(zza.zzd);
                zzakVar.zzR(zza.zzj);
                zzakVar.zzK(zza.zza);
                this.zza.zzl(zzakVar.zzac());
                this.zze = true;
                return false;
            }
        } else if (zzl == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] zzI = this.zzc.zzI();
            zzI[0] = 0;
            zzI[1] = 0;
            zzI[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzfjVar.zza() > 0) {
                zzfjVar.zzC(this.zzc.zzI(), i3, this.zzd);
                this.zzc.zzG(0);
                zzfj zzfjVar3 = this.zzc;
                zzfj zzfjVar4 = this.zzb;
                int zzo = zzfjVar3.zzo();
                zzfjVar4.zzG(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzfjVar, zzo);
                i4 = i4 + 4 + zzo;
            }
            this.zza.zzt(j + (zzg * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
