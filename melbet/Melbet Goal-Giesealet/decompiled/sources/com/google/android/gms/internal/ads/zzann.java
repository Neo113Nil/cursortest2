package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzann implements zzacu {
    private final int zza;
    private final List zzb;
    private final zzef zzc;
    private final SparseIntArray zzd;
    private final zzanq zze;
    private final zzajt zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanj zzj;
    private zzani zzk;
    private zzacx zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i = zzanm.zza;
    }

    @Deprecated
    public zzann() {
        this(1, 1, zzajt.zza, new zzel(0L), new zzama(0), 112800);
    }

    final /* synthetic */ List zza() {
        return this.zzb;
    }

    final /* synthetic */ zzanq zzb() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzc() {
        return this.zzg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        byte[] zzi = this.zzc.zzi();
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(zzi, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzi[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            zzaclVar.zze(i, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if (this.zza == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzf);
        }
        this.zzl = zzacxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x019a, code lost:
    
        if (r3 == false) goto L96;
     */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        long j;
        long j2;
        long zzo = zzacvVar.zzo();
        if (this.zzn) {
            if (zzo != -1) {
                zzanj zzanjVar = this.zzj;
                if (!zzanjVar.zza()) {
                    return zzanjVar.zzb(zzacvVar, zzadsVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = -1;
                j2 = 0;
            } else {
                this.zzo = true;
                zzanj zzanjVar2 = this.zzj;
                if (zzanjVar2.zzc() != -9223372036854775807L) {
                    j = -1;
                    j2 = 0;
                    zzani zzaniVar = new zzani(zzanjVar2.zzd(), zzanjVar2.zzc(), zzo, this.zzr, 112800);
                    this.zzk = zzaniVar;
                    this.zzl.zzw(zzaniVar.zza());
                } else {
                    j = -1;
                    j2 = 0;
                    this.zzl.zzw(new zzadu(zzanjVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zzh(j2, j2);
                if (zzacvVar.zzn() != j2) {
                    zzadsVar.zza = j2;
                    return 1;
                }
            }
            zzani zzaniVar2 = this.zzk;
            if (zzaniVar2 != null && zzaniVar2.zzc()) {
                return zzaniVar2.zzd(zzacvVar, zzadsVar);
            }
        } else {
            j = -1;
        }
        zzef zzefVar = this.zzc;
        byte[] zzi = zzefVar.zzi();
        if (9400 - zzefVar.zzg() < 188) {
            int zzd = zzefVar.zzd();
            if (zzd > 0) {
                System.arraycopy(zzi, zzefVar.zzg(), zzi, 0, zzd);
            }
            zzefVar.zzb(zzi, zzd);
        }
        while (zzefVar.zzd() < 188) {
            int zze = zzefVar.zze();
            int zza = zzacvVar.zza(zzi, zze, 9400 - zze);
            if (zza == -1) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzans zzansVar = (zzans) sparseArray.valueAt(i);
                    if (zzansVar instanceof zzamw) {
                        zzamw zzamwVar = (zzamw) zzansVar;
                        if (zzamwVar.zzd(false)) {
                            zzamwVar.zzc(new zzef(), 1);
                        }
                    }
                    i++;
                }
            } else {
                zzefVar.zzf(zze + zza);
            }
        }
        int zzg = zzefVar.zzg();
        int zze2 = zzefVar.zze();
        int zza2 = zzant.zza(zzefVar.zzi(), zzg, zze2);
        zzefVar.zzh(zza2);
        int i2 = zza2 + 188;
        if (i2 > zze2) {
            this.zzq += zza2 - zzg;
        } else {
            this.zzq = 0;
        }
        int zze3 = zzefVar.zze();
        if (i2 > zze3) {
            return 0;
        }
        int zzB = zzefVar.zzB();
        if ((8388608 & zzB) != 0) {
            zzefVar.zzh(i2);
            return 0;
        }
        int i3 = (4194304 & zzB) != 0 ? 1 : 0;
        int i4 = zzB & 32;
        int i5 = (zzB >> 8) & 8191;
        zzans zzansVar2 = (zzB & 16) != 0 ? (zzans) this.zzg.get(i5) : null;
        if (zzansVar2 == null) {
            zzefVar.zzh(i2);
            return 0;
        }
        int i6 = zzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i7 = sparseIntArray.get(i5, i6 - 1);
        sparseIntArray.put(i5, i6);
        if (i7 == i6) {
            zzefVar.zzh(i2);
            return 0;
        }
        if (i6 != ((i7 + 1) & 15)) {
            zzansVar2.zzb();
        }
        if (i4 != 0) {
            int zzs = zzefVar.zzs();
            i3 |= (zzefVar.zzs() & 64) != 0 ? 2 : 0;
            zzefVar.zzk(zzs - 1);
        }
        boolean z = this.zzn;
        if (z || !this.zzi.get(i5, false)) {
            zzefVar.zzf(i2);
            zzansVar2.zzc(zzefVar, i3);
            zzefVar.zzf(zze3);
        }
        if (this.zzn && zzo != j) {
            this.zzp = true;
        }
        zzefVar.zzh(i2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        zzani zzaniVar;
        List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzel zzelVar = (zzel) list.get(i);
            if (zzelVar.zzc() != -9223372036854775807L) {
                long zza = zzelVar.zza();
                if (zza != -9223372036854775807L) {
                    if (zza != 0) {
                        if (zza == j2) {
                        }
                    }
                }
            }
            zzelVar.zzd(j2);
        }
        if (j2 != 0 && (zzaniVar = this.zzk) != null) {
            zzaniVar.zzb(j2);
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
                ((zzans) sparseArray.valueAt(i2)).zzb();
                i2++;
            }
        }
    }

    final /* synthetic */ SparseBooleanArray zzj() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzi;
    }

    final /* synthetic */ zzacx zzl() {
        return this.zzl;
    }

    final /* synthetic */ int zzm() {
        return this.zzm;
    }

    final /* synthetic */ void zzn(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzo(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzp(int i) {
        this.zzr = i;
    }

    public zzann(int i, int i2, zzajt zzajtVar, zzel zzelVar, zzanq zzanqVar, int i3) {
        this.zze = zzanqVar;
        this.zza = i2;
        this.zzf = zzajtVar;
        this.zzb = Collections.singletonList(zzelVar);
        this.zzc = new zzef(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanj(112800);
        this.zzl = zzacx.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzanqVar.zza();
        int size = zza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(zza.keyAt(i4), (zzans) zza.valueAt(i4));
        }
        this.zzg.put(0, new zzane(new zzank(this)));
    }
}
