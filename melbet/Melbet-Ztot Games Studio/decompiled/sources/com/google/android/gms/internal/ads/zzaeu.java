package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaeu extends zzaet {
    private final zzek zzb;
    private final zzek zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaeu(zzadp zzadpVar) {
        super(zzadpVar);
        this.zzb = new zzek(zzfh.zza);
        this.zzc = new zzek(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zza(zzek zzekVar) throws zzaes {
        int zzm = zzekVar.zzm();
        int i = zzm >> 4;
        int i2 = zzm & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzaes("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zzb(zzek zzekVar, long j) throws zzbo {
        int i;
        int zzm = zzekVar.zzm();
        long zzh = zzekVar.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzek zzekVar2 = new zzek(new byte[zzekVar.zzb()]);
                zzekVar.zzG(zzekVar2.zzM(), 0, zzekVar.zzb());
                zzabn zza = zzabn.zza(zzekVar2);
                this.zzd = zza.zzb;
                zzad zzadVar = new zzad();
                zzadVar.zzX("video/avc");
                zzadVar.zzz(zza.zzk);
                zzadVar.zzac(zza.zzc);
                zzadVar.zzI(zza.zzd);
                zzadVar.zzT(zza.zzj);
                zzadVar.zzL(zza.zza);
                this.zza.zzl(zzadVar.zzad());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] zzM = this.zzc.zzM();
            zzM[0] = 0;
            zzM[1] = 0;
            zzM[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzekVar.zzb() > 0) {
                zzekVar.zzG(this.zzc.zzM(), i3, this.zzd);
                this.zzc.zzK(0);
                zzek zzekVar3 = this.zzc;
                zzek zzekVar4 = this.zzb;
                int zzp = zzekVar3.zzp();
                zzekVar4.zzK(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzekVar, zzp);
                i4 = i4 + 4 + zzp;
            }
            this.zza.zzs(j + (zzh * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
