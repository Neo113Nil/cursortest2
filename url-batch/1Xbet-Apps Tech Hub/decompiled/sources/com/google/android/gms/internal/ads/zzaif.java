package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaif {
    public final zzadk zza;
    public zzais zzd;
    public zzaib zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzair zzb = new zzair();
    public final zzfj zzc = new zzfj();
    private final zzfj zzj = new zzfj(1);
    private final zzfj zzk = new zzfj();

    public zzaif(zzadk zzadkVar, zzais zzaisVar, zzaib zzaibVar) {
        this.zza = zzadkVar;
        this.zzd = zzaisVar;
        this.zze = zzaibVar;
        zzh(zzaisVar, zzaibVar);
    }

    public final int zza() {
        int i = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzfj zzfjVar;
        zzaiq zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i3 = zzf.zzd;
        if (i3 != 0) {
            zzfjVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i4 = zzfs.zza;
            zzfj zzfjVar2 = this.zzk;
            int length = bArr.length;
            zzfjVar2.zzE(bArr, length);
            zzfjVar = this.zzk;
            i3 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzfj zzfjVar3 = this.zzj;
        zzfjVar3.zzI()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzfjVar3.zzG(0);
        this.zza.zzs(this.zzj, 1, 1);
        this.zza.zzs(zzfjVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb) {
            this.zzc.zzD(8);
            zzfj zzfjVar4 = this.zzc;
            byte[] zzI = zzfjVar4.zzI();
            zzI[0] = 0;
            zzI[1] = 1;
            zzI[2] = 0;
            zzI[3] = (byte) i2;
            zzI[4] = (byte) ((i >> 24) & 255);
            zzI[5] = (byte) ((i >> 16) & 255);
            zzI[6] = (byte) ((i >> 8) & 255);
            zzI[7] = (byte) (i & 255);
            this.zza.zzs(zzfjVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        zzfj zzfjVar5 = this.zzb.zzn;
        int zzp = zzfjVar5.zzp();
        zzfjVar5.zzH(-2);
        int i6 = (zzp * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzD(i6);
            byte[] zzI2 = this.zzc.zzI();
            zzfjVar5.zzC(zzI2, 0, i6);
            int i7 = (((zzI2[2] & 255) << 8) | (zzI2[3] & 255)) + i2;
            zzI2[2] = (byte) ((i7 >> 8) & 255);
            zzI2[3] = (byte) (i7 & 255);
            zzfjVar5 = this.zzc;
        }
        this.zza.zzs(zzfjVar5, i6, 1);
        return i5 + i6;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzair zzairVar = this.zzb;
        return zzairVar.zzi[this.zzf];
    }

    public final zzaiq zzf() {
        if (!this.zzl) {
            return null;
        }
        zzaib zzaibVar = this.zzb.zza;
        int i = zzfs.zza;
        int i2 = zzaibVar.zza;
        zzaiq zzaiqVar = this.zzb.zzm;
        if (zzaiqVar == null) {
            zzaiqVar = this.zzd.zza.zza(i2);
        }
        if (zzaiqVar == null || !zzaiqVar.zza) {
            return null;
        }
        return zzaiqVar;
    }

    public final void zzh(zzais zzaisVar, zzaib zzaibVar) {
        this.zzd = zzaisVar;
        this.zze = zzaibVar;
        this.zza.zzl(zzaisVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzair zzairVar = this.zzb;
        zzairVar.zzd = 0;
        zzairVar.zzp = 0L;
        zzairVar.zzq = false;
        zzairVar.zzk = false;
        zzairVar.zzo = false;
        zzairVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
