package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzapx implements zzaeu {
    private final int zza;
    private final List zzb;
    private final zzer zzc;
    private final SparseIntArray zzd;
    private final zzaqa zze;
    private final zzamd zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzapt zzj;
    private zzaps zzk;
    private zzaex zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i = zzapw.zza;
    }

    @Deprecated
    public zzapx() {
        this(1, 1, zzamd.zza, new zzfg(0L), new zzaok(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzaev zzaevVar) throws IOException {
        byte[] zzi = this.zzc.zzi();
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzi, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzi[(i2 * Opcodes.NEWARRAY) + i] != 71) {
                    break;
                }
            }
            zzaelVar.zze(i, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zza == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzf);
        }
        this.zzl = zzaexVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x019a, code lost:
    
        if (r3 == false) goto L96;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        long j;
        long j2;
        long zzo = zzaevVar.zzo();
        if (this.zzn) {
            if (zzo != -1) {
                zzapt zzaptVar = this.zzj;
                if (!zzaptVar.zza()) {
                    return zzaptVar.zzb(zzaevVar, zzafvVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = -1;
                j2 = 0;
            } else {
                this.zzo = true;
                zzapt zzaptVar2 = this.zzj;
                if (zzaptVar2.zzc() != -9223372036854775807L) {
                    j = -1;
                    j2 = 0;
                    zzaps zzapsVar = new zzaps(zzaptVar2.zzd(), zzaptVar2.zzc(), zzo, this.zzr, 112800);
                    this.zzk = zzapsVar;
                    this.zzl.zzw(zzapsVar.zza());
                } else {
                    j = -1;
                    j2 = 0;
                    this.zzl.zzw(new zzafx(zzaptVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j2, j2);
                if (zzaevVar.zzn() != j2) {
                    zzafvVar.zza = j2;
                    return 1;
                }
            }
            zzaps zzapsVar2 = this.zzk;
            if (zzapsVar2 != null && zzapsVar2.zzc()) {
                return zzapsVar2.zzd(zzaevVar, zzafvVar);
            }
        } else {
            j = -1;
        }
        zzer zzerVar = this.zzc;
        byte[] zzi = zzerVar.zzi();
        if (9400 - zzerVar.zzg() < 188) {
            int zzd = zzerVar.zzd();
            if (zzd > 0) {
                System.arraycopy(zzi, zzerVar.zzg(), zzi, 0, zzd);
            }
            zzerVar.zzb(zzi, zzd);
        }
        while (zzerVar.zzd() < 188) {
            int zze = zzerVar.zze();
            int zza = zzaevVar.zza(zzi, zze, 9400 - zze);
            if (zza == -1) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i);
                    if (zzaqcVar instanceof zzapg) {
                        zzapg zzapgVar = (zzapg) zzaqcVar;
                        if (zzapgVar.zzd(false)) {
                            zzapgVar.zzc(new zzer(), 1);
                        }
                    }
                    i++;
                }
            } else {
                zzerVar.zzf(zze + zza);
            }
        }
        int zzg = zzerVar.zzg();
        int zze2 = zzerVar.zze();
        int zza2 = zzaqd.zza(zzerVar.zzi(), zzg, zze2);
        zzerVar.zzh(zza2);
        int i2 = zza2 + Opcodes.NEWARRAY;
        if (i2 > zze2) {
            this.zzq += zza2 - zzg;
        } else {
            this.zzq = 0;
        }
        int zze3 = zzerVar.zze();
        if (i2 > zze3) {
            return 0;
        }
        int zzB = zzerVar.zzB();
        if ((8388608 & zzB) != 0) {
            zzerVar.zzh(i2);
            return 0;
        }
        int i3 = (4194304 & zzB) != 0 ? 1 : 0;
        int i4 = zzB & 32;
        int i5 = (zzB >> 8) & 8191;
        zzaqc zzaqcVar2 = (zzB & 16) != 0 ? (zzaqc) this.zzg.get(i5) : null;
        if (zzaqcVar2 == null) {
            zzerVar.zzh(i2);
            return 0;
        }
        int i6 = zzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i7 = sparseIntArray.get(i5, i6 - 1);
        sparseIntArray.put(i5, i6);
        if (i7 == i6) {
            zzerVar.zzh(i2);
            return 0;
        }
        if (i6 != ((i7 + 1) & 15)) {
            zzaqcVar2.zzb();
        }
        if (i4 != 0) {
            int zzs = zzerVar.zzs();
            i3 |= (zzerVar.zzs() & 64) != 0 ? 2 : 0;
            zzerVar.zzk(zzs - 1);
        }
        boolean z = this.zzn;
        if (z || !this.zzi.get(i5, false)) {
            zzerVar.zzf(i2);
            zzaqcVar2.zzc(zzerVar, i3);
            zzerVar.zzf(zze3);
        }
        if (this.zzn && zzo != j) {
            this.zzp = true;
        }
        zzerVar.zzh(i2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        zzaps zzapsVar;
        List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzfg zzfgVar = (zzfg) list.get(i);
            if (zzfgVar.zzc() != -9223372036854775807L) {
                long zza = zzfgVar.zza();
                if (zza != -9223372036854775807L) {
                    if (zza != 0) {
                        if (zza == j2) {
                        }
                    }
                }
            }
            zzfgVar.zzd(j2);
        }
        if (j2 != 0 && (zzapsVar = this.zzk) != null) {
            zzapsVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i2 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzaqc) sparseArray.valueAt(i2)).zzb();
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    final /* synthetic */ List zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzaqa zzi() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ zzaex zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzp(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i) {
        this.zzr = i;
    }

    public zzapx(int i, int i2, zzamd zzamdVar, zzfg zzfgVar, zzaqa zzaqaVar, int i3) {
        this.zze = zzaqaVar;
        this.zza = i2;
        this.zzf = zzamdVar;
        this.zzb = Collections.singletonList(zzfgVar);
        this.zzc = new zzer(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzapt(112800);
        this.zzl = zzaex.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzaqaVar.zza();
        int size = zza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(zza.keyAt(i4), (zzaqc) zza.valueAt(i4));
        }
        this.zzg.put(0, new zzapo(new zzapu(this)));
    }
}
