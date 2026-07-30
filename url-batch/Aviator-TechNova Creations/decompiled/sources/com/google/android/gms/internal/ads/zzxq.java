package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.facebook.appevents.AppEventsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzxq implements zzwi, zzaex, zzaax, zzabc, zzya {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzxp zzB;
    private zzafy zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhb zze;
    private final zzto zzf;
    private final zzwu zzg;
    private final zztj zzh;
    private final zzxi zzi;
    private final zzaan zzj;
    private final long zzk;
    private final long zzl;
    private final zzxd zzn;
    private zzwh zzs;
    private zzaic zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzabf zzm = new zzabf("ProgressiveMediaPeriod");
    private final zzdq zzo = new zzdq(zzdn.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxm
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzxq.this.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxj
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzxq.this.zzE();
        }
    };
    private final Handler zzr = zzfj.zzc(null);
    private zzxo[] zzw = new zzxo[0];
    private zzyb[] zzv = new zzyb[0];
    private zzxg[] zzu = new zzxg[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzb = Collections.unmodifiableMap(hashMap);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzm("application/x-icy");
        zzc = zztVar.zzM();
    }

    public zzxq(Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzto zztoVar, zztj zztjVar, zzaaw zzaawVar, zzwu zzwuVar, zzxi zzxiVar, zzaan zzaanVar, String str, int i, boolean z, int i2, zzv zzvVar, long j, zzabl zzablVar) {
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zztoVar;
        this.zzh = zztjVar;
        this.zzg = zzwuVar;
        this.zzi = zzxiVar;
        this.zzj = zzaanVar;
        this.zzk = i;
        this.zzn = zzxdVar;
        this.zzl = j;
    }

    private final void zzR(int i) {
        zzaa();
        zzxp zzxpVar = this.zzB;
        boolean[] zArr = zzxpVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzv zza = zzxpVar.zza.zza(i).zza(0);
        this.zzg.zzh(new zzwg(1, zzas.zzf(zza.zzo), zza, 0, null, zzfj.zzp(this.zzL), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i]) && !this.zzv[i].zzq(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzyb zzybVar : this.zzv) {
                    zzybVar.zzg(false);
                }
                zzwh zzwhVar = this.zzs;
                zzwhVar.getClass();
                zzwhVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzagh zzU(zzxo zzxoVar) {
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            if (zzxoVar.equals(this.zzw[i])) {
                return this.zzv[i];
            }
        }
        if (this.zzx) {
            int i2 = zzxoVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzee.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzaer();
        }
        zzyb zzybVar = new zzyb(this.zzj, this.zzf, this.zzh);
        zzxg zzxgVar = new zzxg(zzybVar);
        zzybVar.zzy(this);
        int i3 = length + 1;
        zzxo[] zzxoVarArr = (zzxo[]) Arrays.copyOf(this.zzw, i3);
        zzxoVarArr[length] = zzxoVar;
        String str = zzfj.zza;
        this.zzw = zzxoVarArr;
        zzyb[] zzybVarArr = (zzyb[]) Arrays.copyOf(this.zzv, i3);
        zzybVarArr[length] = zzybVar;
        this.zzv = zzybVarArr;
        zzxg[] zzxgVarArr = (zzxg[]) Arrays.copyOf(this.zzu, i3);
        zzxgVarArr[length] = zzxgVar;
        this.zzu = zzxgVarArr;
        return zzxgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            if (zzybVar.zzn() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzv zzn = this.zzv[i2].zzn();
            zzn.getClass();
            String str = zzn.zzo;
            boolean zza = zzas.zza(str);
            boolean z = zza || zzas.zzb(str);
            zArr[i2] = z;
            this.zzz = z | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzaic zzaicVar = this.zzt;
            if (zzaicVar != null) {
                if (zza || this.zzw[i2].zzb) {
                    zzap zzapVar = zzn.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzaicVar) : zzapVar.zzg(zzaicVar);
                    zzt zza2 = zzn.zza();
                    zza2.zzk(zzapVar2);
                    zzn = zza2.zzM();
                }
                if (zza && zzn.zzh == -1 && zzn.zzi == -1 && (i = zzaicVar.zza) != -1) {
                    zzt zza3 = zzn.zza();
                    zza3.zzh(i);
                    zzn = zza3.zzM();
                }
            }
            zzv zzb2 = zzn.zzb(this.zzf.zzb(zzn));
            zzbgVarArr[i2] = new zzbg(Integer.toString(i2), zzb2);
            this.zzI = zzb2.zzu | this.zzI;
        }
        this.zzB = new zzxp(new zzyn(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzxe(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    private final void zzW() {
        zzxh zzxhVar = new zzxh(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgrc.zzi(zzZ());
            long j = this.zzD;
            if (j != -9223372036854775807L && this.zzM > j) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzafy zzafyVar = this.zzC;
            zzafyVar.getClass();
            zzxhVar.zzd(zzafyVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzxhVar, this, zzaaw.zza(this.zzF));
    }

    private final int zzX() {
        int i = 0;
        for (zzyb zzybVar : this.zzv) {
            i += zzybVar.zzi();
        }
        return i;
    }

    private final long zzY(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzyb[] zzybVarArr = this.zzv;
            if (i >= zzybVarArr.length) {
                return j;
            }
            if (!z) {
                zzxp zzxpVar = this.zzB;
                zzxpVar.getClass();
                i = zzxpVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzybVarArr[i].zzo());
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzaa() {
        zzgrc.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzA(zzabb zzabbVar, long j, long j2, boolean z) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxhVar.zze();
        this.zzg.zzf(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        if (z) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzwh zzwhVar = this.zzs;
            zzwhVar.getClass();
            zzwhVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzB(zzabb zzabbVar, long j, long j2) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long zzY = zzY(true);
            long j3 = zzY == Long.MIN_VALUE ? 0L : zzY + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzD = j3;
            this.zzi.zzb(j3, this.zzC, this.zzE);
        }
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxhVar.zze();
        this.zzg.zze(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        this.zzP = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzC(zzabb zzabbVar, long j, long j2, int i) {
        zzwb zzwbVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        if (i == 0) {
            long zze = zzxhVar.zze();
            zzhf zzh = zzxhVar.zzh();
            zzwbVar = new zzwb(zze, zzh, zzh.zza, Collections.emptyMap(), j, 0L, 0L);
        } else {
            zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        }
        this.zzg.zzd(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), i);
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzxq.this.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ zzaic zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(zzaic zzaicVar) {
        this.zzt = zzaicVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzj();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j) {
        this.zzs = zzwhVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j) {
        zzaac zzaacVar;
        zzaa();
        zzxp zzxpVar = this.zzB;
        zzyn zzynVar = zzxpVar.zza;
        boolean[] zArr3 = zzxpVar.zzc;
        int i = this.zzJ;
        int i2 = 0;
        for (int i3 = 0; i3 < zzaacVarArr.length; i3++) {
            zzyc zzycVar = zzycVarArr[i3];
            if (zzycVar != null && (zzaacVarArr[i3] == null || !zArr[i3])) {
                int zza = ((zzxn) zzycVar).zza();
                zzgrc.zzi(zArr3[zza]);
                this.zzJ--;
                zArr3[zza] = false;
                zzycVarArr[i3] = null;
            }
        }
        boolean z = !this.zzG ? j == 0 || this.zzA : i != 0;
        for (int i4 = 0; i4 < zzaacVarArr.length; i4++) {
            if (zzycVarArr[i4] == null && (zzaacVar = zzaacVarArr[i4]) != null) {
                zzgrc.zzi(zzaacVar.zze() == 1);
                zzgrc.zzi(zzaacVar.zzf(0) == 0);
                int zzb2 = zzynVar.zzb(zzaacVar.zza());
                zzgrc.zzi(!zArr3[zzb2]);
                this.zzJ++;
                zArr3[zzb2] = true;
                this.zzI = zzaacVar.zzc().zzu | this.zzI;
                zzycVarArr[i4] = new zzxn(this, zzb2);
                zArr2[i4] = true;
                if (!z) {
                    zzyb zzybVar = this.zzv[zzb2];
                    z = (zzybVar.zzm() == 0 || zzybVar.zzt(j, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzabf zzabfVar = this.zzm;
            if (zzabfVar.zze()) {
                zzyb[] zzybVarArr = this.zzv;
                int length = zzybVarArr.length;
                while (i2 < length) {
                    zzybVarArr[i2].zzx();
                    i2++;
                }
                zzabfVar.zzf();
            } else {
                this.zzP = false;
                for (zzyb zzybVar2 : this.zzv) {
                    zzybVar2.zzg(false);
                }
            }
        } else if (z) {
            j = zzj(j);
            while (i2 < zzycVarArr.length) {
                if (zzycVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzG = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j, boolean z) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            this.zzv[i].zzw(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long j;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzxp zzxpVar = this.zzB;
                if (zzxpVar.zzb[i] && zzxpVar.zzc[i] && !this.zzv[i].zzp()) {
                    j = Math.min(j, this.zzv[i].zzo());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzY(false);
        }
        return j == Long.MIN_VALUE ? this.zzL : j;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j) {
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j = 0;
        }
        this.zzH = false;
        long j2 = this.zzL;
        this.zzL = j;
        if (zzZ()) {
            this.zzM = j;
            return j;
        }
        if (this.zzF != 7 && (this.zzP || this.zzm.zze())) {
            int length = this.zzv.length;
            for (int i = 0; i < length; i++) {
                zzyb zzybVar = this.zzv[i];
                if (this.zzu[i].zzf() && (zzybVar.zzm() != 0 || j2 != j)) {
                    if (this.zzA ? zzybVar.zzs(zzybVar.zzl()) : zzybVar.zzt(j, this.zzP)) {
                        continue;
                    } else if (!zArr[i] && this.zzz) {
                    }
                }
            }
            return j;
        }
        this.zzN = false;
        this.zzM = j;
        this.zzP = false;
        this.zzI = false;
        zzabf zzabfVar = this.zzm;
        if (zzabfVar.zze()) {
            for (zzyb zzybVar2 : this.zzv) {
                zzybVar2.zzx();
            }
            zzabfVar.zzf();
            return j;
        }
        zzabfVar.zzc();
        for (zzyb zzybVar3 : this.zzv) {
            zzybVar3.zzg(false);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r23 == Long.MIN_VALUE) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0080  */
    @Override // com.google.android.gms.internal.ads.zzwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzk(long j, zzmt zzmtVar) {
        long j2;
        long j3;
        boolean z;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzafw zzc2 = this.zzC.zzc(j);
        zzafz zzafzVar = zzc2.zza;
        zzafz zzafzVar2 = zzc2.zzb;
        long j4 = zzmtVar.zzd;
        if (j4 == 0) {
            if (zzmtVar.zze == 0) {
                return j;
            }
            j4 = 0;
        }
        String str = zzfj.zza;
        long j5 = j - j4;
        long j6 = Long.MAX_VALUE;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j5) > 0L ? 1 : ((j ^ j5) == 0L ? 0 : -1)) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j8 = Long.MIN_VALUE;
        if (j7 == Long.MIN_VALUE) {
            if (j5 == Long.MIN_VALUE) {
                j5 = Long.MIN_VALUE;
            }
            j7 = Long.MIN_VALUE;
            long j9 = zzmtVar.zze;
            long j10 = j + j9;
            j2 = !((((j ^ j10) > 0L ? 1 : ((j ^ j10) == 0L ? 0 : -1)) < 0) | (((j9 ^ j) > 0L ? 1 : ((j9 ^ j) == 0L ? 0 : -1)) >= 0)) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
            if (j2 == Long.MIN_VALUE) {
                j8 = j10;
            }
            if (j2 != Long.MAX_VALUE) {
                int i = (j8 > Long.MAX_VALUE ? 1 : (j8 == Long.MAX_VALUE ? 0 : -1));
            } else {
                j6 = j2;
            }
            j3 = zzafzVar.zzb;
            z = j7 > j3 && j3 <= j6;
            long j11 = zzafzVar2.zzb;
            boolean z2 = j7 > j11 && j11 <= j6;
            if (z || !z2) {
                if (!z) {
                    return z2 ? j11 : j7;
                }
                return j3;
            }
            if (Math.abs(j3 - j) <= Math.abs(j11 - j)) {
                return j3;
            }
        }
        if (j7 == Long.MAX_VALUE) {
            if (j5 == Long.MAX_VALUE) {
                j7 = Long.MAX_VALUE;
            }
            j7 = Long.MIN_VALUE;
        }
        long j92 = zzmtVar.zze;
        long j102 = j + j92;
        if (!((((j ^ j102) > 0L ? 1 : ((j ^ j102) == 0L ? 0 : -1)) < 0) | (((j92 ^ j) > 0L ? 1 : ((j92 ^ j) == 0L ? 0 : -1)) >= 0))) {
        }
        if (j2 == Long.MIN_VALUE) {
        }
        if (j2 != Long.MAX_VALUE) {
        }
        j3 = zzafzVar.zzb;
        if (j7 > j3) {
        }
        long j112 = zzafzVar2.zzb;
        if (j7 > j112) {
        }
        if (z) {
        }
        if (!z) {
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        if (this.zzP) {
            return false;
        }
        zzabf zzabfVar = this.zzm;
        if (zzabfVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zza = this.zzo.zza();
        if (zzabfVar.zze()) {
            return zza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo() {
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzf();
        }
        this.zzn.zzb();
    }

    final boolean zzp(int i) {
        return !zzT() && this.zzv[i].zzq(this.zzP);
    }

    final void zzq(int i) throws IOException {
        this.zzv[i].zzk();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzm.zzh(zzaaw.zza(this.zzF));
    }

    final int zzs(int i, zzlh zzlhVar, zzih zzihVar, int i2) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int zzr = this.zzv[i].zzr(zzlhVar, zzihVar, i2, this.zzP);
        if (zzr == -3) {
            zzS(i);
        }
        return zzr;
    }

    final int zzt(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        zzyb zzybVar = this.zzv[i];
        int zzu = zzybVar.zzu(j, this.zzP);
        zzybVar.zzv(zzu);
        if (zzu != 0) {
            return zzu;
        }
        zzS(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i, int i2) {
        return zzU(new zzxo(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(final zzafy zzafyVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzxq.this.zzF(zzafyVar);
            }
        });
    }

    final zzagh zzx() {
        return zzU(new zzxo(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzaax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzaaz zzz(zzabb zzabbVar, long j, long j2, IOException iOException, int i) {
        long j3;
        zzaaz zza;
        zzafy zzafyVar;
        boolean zza2;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxhVar.zzg();
        String str = zzfj.zza;
        if (!(iOException instanceof zzat) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof zzhp) && !(iOException instanceof zzabe)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof zzhc) || ((zzhc) th).zza != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != -9223372036854775807L) {
                zza = zzabf.zzb;
            } else {
                int zzX = zzX();
                boolean z = zzX > this.zzO;
                if (this.zzK || !((zzafyVar = this.zzC) == null || zzafyVar.zza() == -9223372036854775807L)) {
                    this.zzO = zzX;
                } else {
                    boolean z2 = this.zzy;
                    if (!z2 || zzT()) {
                        this.zzH = z2;
                        this.zzL = 0L;
                        this.zzO = 0;
                        for (zzyb zzybVar : this.zzv) {
                            zzybVar.zzg(false);
                        }
                        zzxhVar.zzd(0L, 0L);
                    } else {
                        this.zzN = true;
                        zza = zzabf.zza;
                    }
                }
                zza = zzabf.zza(z, j3);
            }
            zza2 = zza.zza();
            this.zzg.zzg(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), iOException, !zza2);
            if (!zza2) {
                zzxhVar.zze();
            }
            return zza;
        }
        j3 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
        }
        zza2 = zza.zza();
        this.zzg.zzg(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), iOException, !zza2);
        if (!zza2) {
        }
        return zza;
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzafy zzafyVar) {
        this.zzC = this.zzt == null ? zzafyVar : new zzafx(-9223372036854775807L, 0L);
        this.zzD = zzafyVar.zza();
        boolean z = false;
        if (!this.zzK && zzafyVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzE = z;
        this.zzF = true == z ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzafyVar, z);
        } else {
            zzD();
        }
    }
}
