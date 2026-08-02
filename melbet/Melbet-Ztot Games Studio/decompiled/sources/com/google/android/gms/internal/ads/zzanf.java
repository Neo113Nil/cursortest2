package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzanf implements zzack {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzanc zzi;
    private zzacn zzj;
    private boolean zzk;
    private final zzer zza = new zzer(0);
    private final zzek zzc = new zzek(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzand zzd = new zzand();

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        zzamf zzamhVar;
        zzdi.zzb(this.zzj);
        long zzd = zzaclVar.zzd();
        if (zzd != -1) {
            zzand zzandVar = this.zzd;
            if (!zzandVar.zze()) {
                return zzandVar.zza(zzaclVar, zzadfVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzand zzandVar2 = this.zzd;
            if (zzandVar2.zzb() != -9223372036854775807L) {
                zzanc zzancVar = new zzanc(zzandVar2.zzd(), zzandVar2.zzb(), zzd);
                this.zzi = zzancVar;
                this.zzj.zzO(zzancVar.zzb());
            } else {
                this.zzj.zzO(new zzadh(zzandVar2.zzb(), 0L));
            }
        }
        zzanc zzancVar2 = this.zzi;
        if (zzancVar2 != null && zzancVar2.zze()) {
            return zzancVar2.zza(zzaclVar, zzadfVar);
        }
        zzaclVar.zzj();
        long zze = zzd != -1 ? zzd - zzaclVar.zze() : -1L;
        if ((zze != -1 && zze < 4) || !zzaclVar.zzm(this.zzc.zzM(), 0, 4, true)) {
            return -1;
        }
        this.zzc.zzK(0);
        int zzg = this.zzc.zzg();
        if (zzg == 441) {
            return -1;
        }
        if (zzg == 442) {
            zzaby zzabyVar = (zzaby) zzaclVar;
            zzabyVar.zzm(this.zzc.zzM(), 0, 10, false);
            this.zzc.zzK(9);
            zzabyVar.zzo((this.zzc.zzm() & 7) + 14, false);
            return 0;
        }
        if (zzg == 443) {
            zzaby zzabyVar2 = (zzaby) zzaclVar;
            zzabyVar2.zzm(this.zzc.zzM(), 0, 2, false);
            this.zzc.zzK(0);
            zzabyVar2.zzo(this.zzc.zzq() + 6, false);
            return 0;
        }
        if ((zzg >> 8) != 1) {
            ((zzaby) zzaclVar).zzo(1, false);
            return 0;
        }
        int i = zzg & 255;
        zzane zzaneVar = (zzane) this.zzb.get(i);
        if (!this.zze) {
            if (zzaneVar == null) {
                zzamf zzamfVar = null;
                if (i == 189) {
                    zzamhVar = new zzalx(null, 0);
                    this.zzf = true;
                    this.zzh = zzaclVar.zzf();
                } else if ((zzg & 224) == 192) {
                    zzamhVar = new zzamr(null, 0);
                    this.zzf = true;
                    this.zzh = zzaclVar.zzf();
                } else {
                    if ((zzg & 240) == 224) {
                        zzamhVar = new zzamh(null);
                        this.zzg = true;
                        this.zzh = zzaclVar.zzf();
                    }
                    if (zzamfVar != null) {
                        zzamfVar.zzb(this.zzj, new zzans(Integer.MIN_VALUE, i, 256));
                        zzaneVar = new zzane(zzamfVar, this.zza);
                        this.zzb.put(i, zzaneVar);
                    }
                }
                zzamfVar = zzamhVar;
                if (zzamfVar != null) {
                }
            }
            long j = 1048576;
            if (this.zzf && this.zzg) {
                j = 8192 + this.zzh;
            }
            if (zzaclVar.zzf() > j) {
                this.zze = true;
                this.zzj.zzD();
            }
        }
        zzaby zzabyVar3 = (zzaby) zzaclVar;
        zzabyVar3.zzm(this.zzc.zzM(), 0, 2, false);
        this.zzc.zzK(0);
        int zzq = this.zzc.zzq() + 6;
        if (zzaneVar == null) {
            zzabyVar3.zzo(zzq, false);
        } else {
            this.zzc.zzH(zzq);
            zzabyVar3.zzn(this.zzc.zzM(), 0, zzq, false);
            this.zzc.zzK(6);
            zzaneVar.zza(this.zzc);
            zzek zzekVar = this.zzc;
            zzekVar.zzJ(zzekVar.zzc());
        }
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
        this.zzj = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(long j, long j2) {
        zzanc zzancVar;
        int i;
        zzer zzerVar = this.zza;
        if (zzerVar.zzf() != -9223372036854775807L) {
            long zzd = zzerVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (zzd != 0) {
                }
            }
            zzancVar = this.zzi;
            if (zzancVar != null) {
                zzancVar.zzd(j2);
            }
            for (i = 0; i < this.zzb.size(); i++) {
                ((zzane) this.zzb.valueAt(i)).zzb();
            }
        }
        zzerVar.zzi(j2);
        zzancVar = this.zzi;
        if (zzancVar != null) {
        }
        while (i < this.zzb.size()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        byte[] bArr = new byte[14];
        zzaby zzabyVar = (zzaby) zzaclVar;
        zzabyVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzabyVar.zzl(bArr[13] & 7, false);
        zzabyVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
