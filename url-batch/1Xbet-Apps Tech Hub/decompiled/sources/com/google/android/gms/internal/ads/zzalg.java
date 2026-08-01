package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzalg implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzald
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzalg.zza;
            return new zzace[]{new zzalg(0)};
        }
    };
    private final List zzb;
    private final zzfj zzc;
    private final SparseIntArray zzd;
    private final zzalj zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzalc zzi;
    private zzalb zzj;
    private zzach zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzalg() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b3, code lost:
    
        if (r1 == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long zzd = zzacfVar.zzd();
        if (this.zzm) {
            if (zzd != -1) {
                zzalc zzalcVar = this.zzi;
                if (!zzalcVar.zzd()) {
                    return zzalcVar.zza(zzacfVar, zzadbVar, this.zzq);
                }
            }
            if (this.zzn) {
                j = 0;
            } else {
                this.zzn = true;
                zzalc zzalcVar2 = this.zzi;
                if (zzalcVar2.zzb() != -9223372036854775807L) {
                    j = 0;
                    zzalb zzalbVar = new zzalb(zzalcVar2.zzc(), zzalcVar2.zzb(), zzd, this.zzq, 112800);
                    this.zzj = zzalbVar;
                    this.zzk.zzO(zzalbVar.zzb());
                } else {
                    j = 0;
                    this.zzk.zzO(new zzadd(zzalcVar2.zzb(), 0L));
                }
            }
            if (this.zzo) {
                z = false;
                this.zzo = false;
                zzd(j, j);
                if (zzacfVar.zzf() != j) {
                    zzadbVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzalb zzalbVar2 = this.zzj;
            r3 = z;
            if (zzalbVar2 != null) {
                r3 = z;
                if (zzalbVar2.zze()) {
                    return zzalbVar2.zza(zzacfVar, zzadbVar);
                }
            }
        } else {
            r3 = 0;
        }
        zzfj zzfjVar = this.zzc;
        byte[] zzI = zzfjVar.zzI();
        if (9400 - zzfjVar.zzc() < 188) {
            int zza2 = zzfjVar.zza();
            if (zza2 > 0) {
                System.arraycopy(zzI, zzfjVar.zzc(), zzI, r3, zza2);
            }
            this.zzc.zzE(zzI, zza2);
        }
        while (true) {
            zzfj zzfjVar2 = this.zzc;
            if (zzfjVar2.zza() >= 188) {
                int zzc = zzfjVar2.zzc();
                int zzd2 = zzfjVar2.zzd();
                int zza3 = zzalm.zza(zzfjVar2.zzI(), zzc, zzd2);
                this.zzc.zzG(zza3);
                int i = zza3 + Opcodes.NEWARRAY;
                if (i > zzd2) {
                    this.zzp += zza3 - zzc;
                } else {
                    this.zzp = r3;
                }
                zzfj zzfjVar3 = this.zzc;
                int zzd3 = zzfjVar3.zzd();
                if (i > zzd3) {
                    return r3;
                }
                int zzf = zzfjVar3.zzf();
                if ((8388608 & zzf) != 0) {
                    this.zzc.zzG(i);
                    return r3;
                }
                int i2 = (4194304 & zzf) != 0 ? 1 : r3;
                int i3 = zzf & 32;
                int i4 = (zzf >> 8) & 8191;
                zzall zzallVar = (zzf & 16) != 0 ? (zzall) this.zzf.get(i4) : null;
                if (zzallVar == null) {
                    this.zzc.zzG(i);
                    return r3;
                }
                int i5 = zzf & 15;
                int i6 = this.zzd.get(i4, i5 - 1);
                this.zzd.put(i4, i5);
                if (i6 == i5) {
                    this.zzc.zzG(i);
                    return r3;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    zzallVar.zzc();
                }
                if (i3 != 0) {
                    zzfj zzfjVar4 = this.zzc;
                    int zzl = zzfjVar4.zzl();
                    i2 |= (zzfjVar4.zzl() & 64) != 0 ? 2 : r3;
                    this.zzc.zzH(zzl - 1);
                }
                boolean z2 = this.zzm;
                if (z2 || !this.zzh.get(i4, r3)) {
                    this.zzc.zzF(i);
                    zzallVar.zza(this.zzc, i2);
                    this.zzc.zzF(zzd3);
                }
                if (this.zzm && zzd != -1) {
                    this.zzo = true;
                }
                this.zzc.zzG(i);
                return r3;
            }
            int zzd4 = zzfjVar2.zzd();
            int zza4 = zzacfVar.zza(zzI, zzd4, 9400 - zzd4);
            if (zza4 == -1) {
                for (int i7 = r3; i7 < this.zzf.size(); i7++) {
                    zzall zzallVar2 = (zzall) this.zzf.valueAt(i7);
                    if (zzallVar2 instanceof zzakp) {
                        zzallVar2.zza(new zzfj(), 1);
                    }
                }
                return -1;
            }
            this.zzc.zzF(zzd4 + zza4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzk = zzachVar;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        zzalb zzalbVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzfq zzfqVar = (zzfq) this.zzb.get(i);
            if (zzfqVar.zze() != -9223372036854775807L) {
                long zzc = zzfqVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j2) {
                        }
                    }
                }
            }
            zzfqVar.zzf(j2);
        }
        if (j2 != 0 && (zzalbVar = this.zzj) != null) {
            zzalbVar.zzd(j2);
        }
        this.zzc.zzD(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            ((zzall) this.zzf.valueAt(i2)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(zzacf zzacfVar) throws IOException {
        byte[] zzI = this.zzc.zzI();
        zzabu zzabuVar = (zzabu) zzacfVar;
        zzabuVar.zzm(zzI, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzI[(i2 * Opcodes.NEWARRAY) + i] != 71) {
                    break;
                }
            }
            zzabuVar.zzo(i, false);
            return true;
        }
        return false;
    }

    public zzalg(int i) {
        this(1, new zzfq(0L), new zzajv(0), 112800);
    }

    public zzalg(int i, zzfq zzfqVar, zzalj zzaljVar, int i2) {
        this.zze = zzaljVar;
        this.zzb = Collections.singletonList(zzfqVar);
        this.zzc = new zzfj(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzalc(112800);
        this.zzk = zzach.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.zzf.put(sparseArray2.keyAt(i3), (zzall) sparseArray2.valueAt(i3));
        }
        this.zzf.put(0, new zzaky(new zzale(this)));
    }
}
