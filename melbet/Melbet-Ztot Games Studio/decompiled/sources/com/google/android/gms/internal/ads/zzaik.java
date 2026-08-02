package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaik {
    public final zzadp zza;
    public zzaiz zzd;
    public zzaih zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzaiy zzb = new zzaiy();
    public final zzek zzc = new zzek();
    private final zzek zzj = new zzek(1);
    private final zzek zzk = new zzek();

    public zzaik(zzadp zzadpVar, zzaiz zzaizVar, zzaih zzaihVar) {
        this.zza = zzadpVar;
        this.zzd = zzaizVar;
        this.zze = zzaihVar;
        zzh(zzaizVar, zzaihVar);
    }

    public final int zza() {
        int i = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzek zzekVar;
        zzaix zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i3 = zzf.zzd;
        if (i3 != 0) {
            zzekVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i4 = zzet.zza;
            zzek zzekVar2 = this.zzk;
            int length = bArr.length;
            zzekVar2.zzI(bArr, length);
            zzekVar = this.zzk;
            i3 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzek zzekVar3 = this.zzj;
        zzekVar3.zzM()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzekVar3.zzK(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzekVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb) {
            this.zzc.zzH(8);
            zzek zzekVar4 = this.zzc;
            byte[] zzM = zzekVar4.zzM();
            zzM[0] = 0;
            zzM[1] = 1;
            zzM[2] = 0;
            zzM[3] = (byte) i2;
            zzM[4] = (byte) ((i >> 24) & 255);
            zzM[5] = (byte) ((i >> 16) & 255);
            zzM[6] = (byte) ((i >> 8) & 255);
            zzM[7] = (byte) (i & 255);
            this.zza.zzr(zzekVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        zzek zzekVar5 = this.zzb.zzn;
        int zzq = zzekVar5.zzq();
        zzekVar5.zzL(-2);
        int i6 = (zzq * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzH(i6);
            byte[] zzM2 = this.zzc.zzM();
            zzekVar5.zzG(zzM2, 0, i6);
            int i7 = (((zzM2[2] & 255) << 8) | (zzM2[3] & 255)) + i2;
            zzM2[2] = (byte) ((i7 >> 8) & 255);
            zzM2[3] = (byte) (i7 & 255);
            zzekVar5 = this.zzc;
        }
        this.zza.zzr(zzekVar5, i6, 1);
        return i5 + i6;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzaiy zzaiyVar = this.zzb;
        return zzaiyVar.zzi[this.zzf];
    }

    public final zzaix zzf() {
        if (!this.zzl) {
            return null;
        }
        zzaih zzaihVar = this.zzb.zza;
        int i = zzet.zza;
        int i2 = zzaihVar.zza;
        zzaix zzaixVar = this.zzb.zzm;
        if (zzaixVar == null) {
            zzaixVar = this.zzd.zza.zza(i2);
        }
        if (zzaixVar == null || !zzaixVar.zza) {
            return null;
        }
        return zzaixVar;
    }

    public final void zzh(zzaiz zzaizVar, zzaih zzaihVar) {
        this.zzd = zzaizVar;
        this.zze = zzaihVar;
        this.zza.zzl(zzaizVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzaiy zzaiyVar = this.zzb;
        zzaiyVar.zzd = 0;
        zzaiyVar.zzp = 0L;
        zzaiyVar.zzq = false;
        zzaiyVar.zzk = false;
        zzaiyVar.zzo = false;
        zzaiyVar.zzm = null;
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
