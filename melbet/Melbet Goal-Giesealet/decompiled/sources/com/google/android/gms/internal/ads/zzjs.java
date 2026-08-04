package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzjs extends zze implements zzik {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzda zzB;
    private final zzlz zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private zzls zzG;
    private zzlt zzH;
    private zzij zzI;
    private zzaw zzJ;
    private zzam zzK;
    private Object zzL;
    private Surface zzM;
    private int zzN;
    private zzeg zzO;
    private zzc zzP;
    private float zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private int zzU;
    private zzam zzV;
    private zzld zzW;
    private int zzX;
    private long zzY;
    private zzwi zzZ;
    final zzyn zzb;
    final zzaw zzc;
    private final zzde zze = new zzde(zzdb.zza);
    private final Context zzf;
    private final zzba zzg;
    private final zzll[] zzh;
    private final zzll[] zzi;
    private final zzym zzj;
    private final zzdl zzk;
    private final zzkd zzl;
    private final zzkf zzm;
    private final zzdr zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbc zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmd zzs;
    private final Looper zzt;
    private final zzyu zzu;
    private final zzdb zzv;
    private final zzir zzw;
    private final zzjq zzx;
    private final zzmb zzy;
    private final zzmc zzz;

    static {
        zzak.zzb("media3.exoplayer");
    }

    public zzjs(zzii zziiVar, zzba zzbaVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzeo.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.8.0] [");
            sb.append(str);
            sb.append("]");
            zzds.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zziiVar.zza.getApplicationContext();
            this.zzs = (zzmd) zziiVar.zzh.apply(zziiVar.zzb);
            this.zzU = zziiVar.zzj;
            this.zzP = zziiVar.zzk;
            this.zzN = zziiVar.zzl;
            this.zzR = false;
            this.zzA = zziiVar.zzq;
            zzir zzirVar = new zzir(this, null);
            this.zzw = zzirVar;
            this.zzx = new zzjq(null);
            zzll[] zza = ((zzlq) zziiVar.zzc.zza()).zza(new Handler(zziiVar.zzi), zzirVar, zzirVar, zzirVar, zzirVar);
            this.zzh = zza;
            int length = zza.length;
            this.zzi = new zzll[2];
            int i = 0;
            while (true) {
                zzll[] zzllVarArr = this.zzi;
                int length2 = zzllVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzll zzllVar = this.zzh[i];
                zzllVarArr[i] = null;
                i++;
            }
            zzym zzymVar = (zzym) zziiVar.zze.zza();
            this.zzj = zzymVar;
            zzyu zzyuVar = (zzyu) zziiVar.zzg.zza();
            this.zzu = zzyuVar;
            this.zzr = zziiVar.zzm;
            this.zzH = zziiVar.zzn;
            this.zzG = zziiVar.zzo;
            Looper looper = zziiVar.zzi;
            this.zzt = looper;
            zzdb zzdbVar = zziiVar.zzb;
            this.zzv = zzdbVar;
            this.zzg = zzbaVar;
            this.zzn = new zzdr(looper, zzdbVar, new zzdn() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzdn
                public final /* synthetic */ void zza(Object obj, zzr zzrVar) {
                    zzjs.this.zzH((zzay) obj, zzrVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzZ = new zzwi(0);
            this.zzI = zzij.zza;
            int length3 = this.zzh.length;
            zzyn zzynVar = new zzyn(new zzlo[2], new zzyf[2], zzbm.zza, null);
            this.zzb = zzynVar;
            this.zzp = new zzbc();
            zzav zzavVar = new zzav();
            zzavVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzymVar.zzd();
            zzavVar.zzb(29, true);
            zzavVar.zzb(23, false);
            zzavVar.zzb(25, false);
            zzavVar.zzb(33, false);
            zzavVar.zzb(26, false);
            zzavVar.zzb(34, false);
            zzaw zze = zzavVar.zze();
            this.zzc = zze;
            zzav zzavVar2 = new zzav();
            zzavVar2.zzd(zze);
            zzavVar2.zza(4);
            zzavVar2.zza(10);
            this.zzJ = zzavVar2.zze();
            this.zzk = zzdbVar.zzd(looper, null);
            zzkd zzkdVar = new zzkd() { // from class: com.google.android.gms.internal.ads.zzis
                @Override // com.google.android.gms.internal.ads.zzkd
                public final /* synthetic */ void zza(zzkc zzkcVar) {
                    zzjs.this.zzI(zzkcVar);
                }
            };
            this.zzl = zzkdVar;
            this.zzW = zzld.zza(zzynVar);
            this.zzs.zzx(zzbaVar, looper);
            final zzox zzoxVar = new zzox(zziiVar.zzu);
            zzkf zzkfVar = new zzkf(this.zzf, this.zzh, this.zzi, zzymVar, zzynVar, (zzkj) zziiVar.zzf.zza(), zzyuVar, 0, false, this.zzs, this.zzH, zziiVar.zzv, zziiVar.zzp, false, false, looper, zzdbVar, zzkdVar, zzoxVar, null, this.zzI, this.zzx);
            this.zzm = zzkfVar;
            Looper zzn = zzkfVar.zzn();
            this.zzQ = 1.0f;
            zzam zzamVar = zzam.zza;
            this.zzK = zzamVar;
            this.zzV = zzamVar;
            this.zzX = -1;
            int i2 = zzcn.zza;
            this.zzS = true;
            zzd(this.zzs);
            zzyuVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z = zziiVar.zzs;
                zzdbVar.zzd(zzkfVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzil
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzot zza2 = zzot.zza(context);
                        if (zza2 == null) {
                            zzds.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.zzB(zza2);
                        }
                        zzoxVar.zzb(zza2.zzb());
                    }
                });
            }
            zzda zzdaVar = new zzda(0, zzn, looper, zzdbVar, new zzcz() { // from class: com.google.android.gms.internal.ads.zzjd
                @Override // com.google.android.gms.internal.ads.zzcz
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    zzjs.this.zzJ(((Integer) obj).intValue(), intValue);
                }
            });
            this.zzB = zzdaVar;
            zzdaVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzjs.this.zzK();
                }
            });
            new zzhl(zziiVar.zza, zzn, zziiVar.zzi, this.zzw, zzdbVar);
            this.zzy = new zzmb(zziiVar.zza, zzn, zzdbVar);
            this.zzz = new zzmc(zziiVar.zza, zzn, zzdbVar);
            int i3 = zzl.zza;
            zzbu zzbuVar = zzbu.zza;
            this.zzO = zzeg.zza;
            this.zzC = new zzlz(this, this.zzw, zzdbVar, zziiVar.zzr);
            zzkfVar.zzg(this.zzG);
            zzkfVar.zzi(this.zzP, false);
            zzam(1, 3, this.zzP);
            zzam(2, 4, Integer.valueOf(this.zzN));
            zzam(2, 5, 0);
            zzam(1, 9, Boolean.valueOf(this.zzR));
            zzam(6, 8, this.zzx);
            zzam(-1, 16, Integer.valueOf(this.zzU));
        } finally {
            this.zze.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
    public final void zzN(zzhz zzhzVar) {
        zzld zzldVar = this.zzW;
        zzld zzh = zzldVar.zzh(zzldVar.zzb);
        zzh.zzq = zzh.zzs;
        zzh.zzr = 0L;
        zzld zzae = zzae(zzh, 1);
        if (zzhzVar != null) {
            zzae = zzae.zzf(zzhzVar);
        }
        this.zzD++;
        this.zzm.zzh();
        zzab(zzae, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzY(zzld zzldVar) {
        zzbe zzbeVar = zzldVar.zza;
        return zzbeVar.zzg() ? this.zzX : zzbeVar.zzo(zzldVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzZ(zzld zzldVar) {
        zzup zzupVar = zzldVar.zzb;
        if (!zzupVar.zzb()) {
            return zzeo.zzp(zzaa(zzldVar));
        }
        zzbe zzbeVar = zzldVar.zza;
        zzbeVar.zzo(zzupVar.zza, this.zzp);
        long j = zzldVar.zzc;
        if (j != -9223372036854775807L) {
            return zzeo.zzp(0L) + zzeo.zzp(j);
        }
        long j2 = zzbeVar.zzb(zzY(zzldVar), this.zza, 0L).zzl;
        return zzeo.zzp(0L);
    }

    private final long zzaa(zzld zzldVar) {
        zzbe zzbeVar = zzldVar.zza;
        if (zzbeVar.zzg()) {
            return zzeo.zzq(this.zzY);
        }
        boolean z = zzldVar.zzp;
        long j = zzldVar.zzs;
        zzup zzupVar = zzldVar.zzb;
        if (zzupVar.zzb()) {
            return j;
        }
        zzag(zzbeVar, zzupVar, j);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ed  */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzab(final zzld zzldVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        zzld zzldVar2;
        zzbe zzbeVar;
        final int i5;
        boolean z3;
        Pair pair;
        boolean z4;
        boolean z5;
        int i6;
        boolean booleanValue;
        final zzaj zzajVar;
        List list;
        int i7;
        zzbe zzo;
        zzam zzw;
        int i8;
        int i9;
        int i10;
        boolean z6;
        zzhz zzhzVar;
        zzhz zzhzVar2;
        zzyn zzynVar;
        zzyn zzynVar2;
        zze zzeVar;
        zzbe zzo2;
        zzaw zzawVar;
        boolean z7;
        zzbe zzo3;
        ?? r15;
        int i11;
        boolean z8;
        zzbe zzo4;
        boolean z9;
        zzbe zzo5;
        zzba zzbaVar;
        long j2;
        boolean z10;
        int i12;
        boolean z11;
        zzaw zze;
        int i13;
        Object obj;
        zzaj zzajVar2;
        Object obj2;
        int i14;
        long j3;
        long zzac;
        Object obj3;
        zzaj zzajVar3;
        Object obj4;
        int i15;
        int i16 = i2;
        zzld zzldVar3 = this.zzW;
        this.zzW = zzldVar;
        zzbe zzbeVar2 = zzldVar3.zza;
        zzbe zzbeVar3 = zzldVar.zza;
        boolean equals = zzbeVar2.equals(zzbeVar3);
        if (zzbeVar3.zzg() && zzbeVar2.zzg()) {
            pair = new Pair(false, -1);
        } else {
            if (zzbeVar3.zzg() == zzbeVar2.zzg()) {
                zzup zzupVar = zzldVar3.zzb;
                Object obj5 = zzupVar.zza;
                i4 = 0;
                zzbc zzbcVar = this.zzp;
                int i17 = zzbeVar2.zzo(obj5, zzbcVar).zzc;
                zzbd zzbdVar = this.zza;
                Object obj6 = zzbeVar2.zzb(i17, zzbdVar, 0L).zzb;
                zzup zzupVar2 = zzldVar.zzb;
                zzldVar2 = zzldVar3;
                zzbeVar = zzbeVar2;
                if (obj6.equals(zzbeVar3.zzb(zzbeVar3.zzo(zzupVar2.zza, zzbcVar).zzc, zzbdVar, 0L).zzb)) {
                    if (z) {
                        if (i16 != 0) {
                            i5 = i16;
                        } else if (zzupVar.zzd < zzupVar2.zzd) {
                            pair = new Pair(true, 0);
                            i5 = 0;
                            z3 = true;
                        } else {
                            i5 = 0;
                        }
                        z3 = true;
                    } else {
                        i5 = i16;
                        z3 = false;
                    }
                    pair = new Pair(false, -1);
                } else {
                    if (!z) {
                        z4 = false;
                        z5 = false;
                    } else if (i16 == 0) {
                        i16 = 0;
                        z4 = true;
                        i6 = 1;
                        Pair pair2 = new Pair(true, Integer.valueOf(i6));
                        boolean z12 = z4;
                        i5 = i16;
                        z3 = z12;
                        pair = pair2;
                    } else {
                        z4 = true;
                        z5 = true;
                    }
                    if (z4 && i16 == 1) {
                        z4 = z5;
                        i6 = 2;
                    } else {
                        if (equals) {
                            throw new IllegalStateException();
                        }
                        i6 = 3;
                    }
                    Pair pair22 = new Pair(true, Integer.valueOf(i6));
                    boolean z122 = z4;
                    i5 = i16;
                    z3 = z122;
                    pair = pair22;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzajVar = null;
                } else {
                    zzajVar = !zzbeVar3.zzg() ? zzbeVar3.zzb(zzbeVar3.zzo(zzldVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd : null;
                    this.zzV = zzam.zza;
                }
                if (!booleanValue || !zzldVar2.zzj.equals(zzldVar.zzj)) {
                    zzal zza = this.zzV.zza();
                    list = zzldVar.zzj;
                    for (i7 = i4; i7 < list.size(); i7++) {
                        zzao zzaoVar = (zzao) list.get(i7);
                        for (int i18 = i4; i18 < zzaoVar.zza(); i18++) {
                            zzaoVar.zzb(i18).zza(zza);
                        }
                    }
                    this.zzV = zza.zzw();
                }
                zzo = zzo();
                if (zzo.zzg()) {
                    zzaj zzajVar4 = zzo.zzb(zzq(), this.zza, 0L).zzd;
                    zzal zza2 = this.zzV.zza();
                    zza2.zzv(zzajVar4.zzd);
                    zzw = zza2.zzw();
                } else {
                    zzw = this.zzV;
                }
                boolean equals2 = zzw.equals(this.zzK);
                this.zzK = zzw;
                int i19 = zzldVar2.zzl == zzldVar.zzl ? 1 : i4;
                i8 = zzldVar2.zze == zzldVar.zze ? 1 : i4;
                if (i8 == 0 || i19 != 0) {
                    zzak();
                }
                i9 = zzldVar2.zzg == zzldVar.zzg ? 1 : i4;
                if (!equals) {
                    this.zzn.zzd(i4, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjl
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj7) {
                            int i20 = zzjs.zzd;
                            ((zzay) obj7).zzb(zzld.this.zza, i);
                        }
                    });
                }
                if (z3) {
                    i10 = i19;
                    z6 = equals2;
                } else {
                    zzbc zzbcVar2 = new zzbc();
                    if (zzbeVar.zzg()) {
                        i10 = i19;
                        z6 = equals2;
                        i13 = i3;
                        obj = null;
                        zzajVar2 = null;
                        obj2 = null;
                        i14 = -1;
                    } else {
                        Object obj7 = zzldVar2.zzb.zza;
                        zzbe zzbeVar4 = zzbeVar;
                        zzbeVar4.zzo(obj7, zzbcVar2);
                        int i20 = zzbcVar2.zzc;
                        int zze2 = zzbeVar4.zze(obj7);
                        zzbd zzbdVar2 = this.zza;
                        i10 = i19;
                        z6 = equals2;
                        Object obj8 = zzbeVar4.zzb(i20, zzbdVar2, 0L).zzb;
                        zzajVar2 = zzbdVar2.zzd;
                        i13 = i20;
                        obj = obj8;
                        obj2 = obj7;
                        i14 = zze2;
                    }
                    if (i5 == 0) {
                        zzup zzupVar3 = zzldVar2.zzb;
                        if (zzupVar3.zzb()) {
                            j3 = zzbcVar2.zzh(zzupVar3.zzb, zzupVar3.zzc);
                            zzac = zzac(zzldVar2);
                            String str = zzeo.zza;
                            zzup zzupVar4 = zzldVar2.zzb;
                            final zzaz zzazVar = new zzaz(obj, i13, zzajVar2, obj2, i14, zzeo.zzp(j3), zzeo.zzp(zzac), zzupVar4.zzb, zzupVar4.zzc);
                            int zzq = zzq();
                            if (this.zzW.zza.zzg()) {
                                zzld zzldVar4 = this.zzW;
                                Object obj9 = zzldVar4.zzb.zza;
                                zzldVar4.zza.zzo(obj9, this.zzp);
                                int zze3 = this.zzW.zza.zze(obj9);
                                zzbe zzbeVar5 = this.zzW.zza;
                                zzbd zzbdVar3 = this.zza;
                                i15 = zze3;
                                obj3 = zzbeVar5.zzb(zzq, zzbdVar3, 0L).zzb;
                                zzajVar3 = zzbdVar3.zzd;
                                obj4 = obj9;
                            } else {
                                obj3 = null;
                                zzajVar3 = null;
                                obj4 = null;
                                i15 = -1;
                            }
                            long zzp = zzeo.zzp(j);
                            long zzp2 = !this.zzW.zzb.zzb() ? zzeo.zzp(zzac(this.zzW)) : zzp;
                            zzup zzupVar5 = this.zzW.zzb;
                            final zzaz zzazVar2 = new zzaz(obj3, zzq, zzajVar3, obj4, i15, zzp, zzp2, zzupVar5.zzb, zzupVar5.zzc);
                            this.zzn.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjm
                                @Override // com.google.android.gms.internal.ads.zzdm
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i21 = zzjs.zzd;
                                    ((zzay) obj10).zzo(zzazVar, zzazVar2, i5);
                                }
                            });
                        } else {
                            j3 = zzupVar3.zze != -1 ? zzac(this.zzW) : zzbcVar2.zzd;
                            zzac = j3;
                            String str2 = zzeo.zza;
                            zzup zzupVar42 = zzldVar2.zzb;
                            final zzaz zzazVar3 = new zzaz(obj, i13, zzajVar2, obj2, i14, zzeo.zzp(j3), zzeo.zzp(zzac), zzupVar42.zzb, zzupVar42.zzc);
                            int zzq2 = zzq();
                            if (this.zzW.zza.zzg()) {
                            }
                            long zzp3 = zzeo.zzp(j);
                            if (!this.zzW.zzb.zzb()) {
                            }
                            zzup zzupVar52 = this.zzW.zzb;
                            final zzaz zzazVar22 = new zzaz(obj3, zzq2, zzajVar3, obj4, i15, zzp3, zzp2, zzupVar52.zzb, zzupVar52.zzc);
                            this.zzn.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjm
                                @Override // com.google.android.gms.internal.ads.zzdm
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i21 = zzjs.zzd;
                                    ((zzay) obj10).zzo(zzazVar3, zzazVar22, i5);
                                }
                            });
                        }
                    } else if (zzldVar2.zzb.zzb()) {
                        j3 = zzldVar2.zzs;
                        zzac = zzac(zzldVar2);
                        String str22 = zzeo.zza;
                        zzup zzupVar422 = zzldVar2.zzb;
                        final zzaz zzazVar32 = new zzaz(obj, i13, zzajVar2, obj2, i14, zzeo.zzp(j3), zzeo.zzp(zzac), zzupVar422.zzb, zzupVar422.zzc);
                        int zzq22 = zzq();
                        if (this.zzW.zza.zzg()) {
                        }
                        long zzp32 = zzeo.zzp(j);
                        if (!this.zzW.zzb.zzb()) {
                        }
                        zzup zzupVar522 = this.zzW.zzb;
                        final zzaz zzazVar222 = new zzaz(obj3, zzq22, zzajVar3, obj4, i15, zzp32, zzp2, zzupVar522.zzb, zzupVar522.zzc);
                        this.zzn.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjm
                            @Override // com.google.android.gms.internal.ads.zzdm
                            public final /* synthetic */ void zza(Object obj10) {
                                int i21 = zzjs.zzd;
                                ((zzay) obj10).zzo(zzazVar32, zzazVar222, i5);
                            }
                        });
                    } else {
                        j3 = zzldVar2.zzs;
                        zzac = j3;
                        String str222 = zzeo.zza;
                        zzup zzupVar4222 = zzldVar2.zzb;
                        final zzaz zzazVar322 = new zzaz(obj, i13, zzajVar2, obj2, i14, zzeo.zzp(j3), zzeo.zzp(zzac), zzupVar4222.zzb, zzupVar4222.zzc);
                        int zzq222 = zzq();
                        if (this.zzW.zza.zzg()) {
                        }
                        long zzp322 = zzeo.zzp(j);
                        if (!this.zzW.zzb.zzb()) {
                        }
                        zzup zzupVar5222 = this.zzW.zzb;
                        final zzaz zzazVar2222 = new zzaz(obj3, zzq222, zzajVar3, obj4, i15, zzp322, zzp2, zzupVar5222.zzb, zzupVar5222.zzc);
                        this.zzn.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjm
                            @Override // com.google.android.gms.internal.ads.zzdm
                            public final /* synthetic */ void zza(Object obj10) {
                                int i21 = zzjs.zzd;
                                ((zzay) obj10).zzo(zzazVar322, zzazVar2222, i5);
                            }
                        });
                    }
                }
                if (!booleanValue) {
                    this.zzn.zzd(1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjn
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zzc(zzaj.this, intValue);
                        }
                    });
                }
                zzhzVar = zzldVar2.zzf;
                zzhzVar2 = zzldVar.zzf;
                if (zzhzVar != zzhzVar2) {
                    zzdr zzdrVar = this.zzn;
                    zzdrVar.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjo
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zzn(zzld.this.zzf);
                        }
                    });
                    if (zzhzVar2 != null) {
                        zzdrVar.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzit
                            @Override // com.google.android.gms.internal.ads.zzdm
                            public final /* synthetic */ void zza(Object obj10) {
                                int i21 = zzjs.zzd;
                                ((zzay) obj10).zzm(zzld.this.zzf);
                            }
                        });
                    }
                }
                zzynVar = zzldVar2.zzi;
                zzynVar2 = zzldVar.zzi;
                if (zzynVar != zzynVar2) {
                    this.zzj.zzp(zzynVar2.zze);
                    this.zzn.zzd(2, new zzdm() { // from class: com.google.android.gms.internal.ads.zziu
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zzd(zzld.this.zzi.zzd);
                        }
                    });
                }
                if (!z6) {
                    final zzam zzamVar = this.zzK;
                    this.zzn.zzd(14, new zzdm() { // from class: com.google.android.gms.internal.ads.zziv
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zze(zzam.this);
                        }
                    });
                }
                if (i9 != 0) {
                    this.zzn.zzd(3, new zzdm() { // from class: com.google.android.gms.internal.ads.zziw
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zzf(zzld.this.zzg);
                        }
                    });
                }
                if (i8 == 0 || i10 != 0) {
                    this.zzn.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzix
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            zzld zzldVar5 = zzld.this;
                            ((zzay) obj10).zzh(zzldVar5.zzl, zzldVar5.zze);
                        }
                    });
                }
                if (i8 != 0) {
                    this.zzn.zzd(4, new zzdm() { // from class: com.google.android.gms.internal.ads.zziy
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zzi(zzld.this.zze);
                        }
                    });
                }
                if (i10 == 0 || zzldVar2.zzm != zzldVar.zzm) {
                    this.zzn.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziz
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            zzld zzldVar5 = zzld.this;
                            ((zzay) obj10).zzj(zzldVar5.zzl, zzldVar5.zzm);
                        }
                    });
                }
                if (zzldVar2.zzn != zzldVar.zzn) {
                    this.zzn.zzd(6, new zzdm() { // from class: com.google.android.gms.internal.ads.zzja
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zzk(zzld.this.zzn);
                        }
                    });
                }
                if (zzldVar2.zzj() != zzldVar.zzj()) {
                    this.zzn.zzd(7, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjb
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zzl(zzld.this.zzj());
                        }
                    });
                }
                if (!zzldVar2.zzo.equals(zzldVar.zzo)) {
                    this.zzn.zzd(12, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjc
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzjs.zzd;
                            ((zzay) obj10).zzp(zzld.this.zzo);
                        }
                    });
                }
                zzaw zzawVar2 = this.zzJ;
                zzba zzbaVar2 = this.zzg;
                zzaw zzawVar3 = this.zzc;
                String str3 = zzeo.zza;
                boolean zzv = zzbaVar2.zzv();
                zzeVar = (zze) zzbaVar2;
                zzo2 = zzeVar.zzo();
                if (zzo2.zzg()) {
                    zzawVar = zzawVar2;
                    if (zzo2.zzb(zzeVar.zzq(), zzeVar.zza, 0L).zzh) {
                        z7 = true;
                        zzo3 = zzeVar.zzo();
                        if (zzo3.zzg()) {
                            i11 = -1;
                            r15 = 0;
                            z8 = false;
                        } else {
                            int zzq3 = zzeVar.zzq();
                            zzeVar.zzk();
                            zzeVar.zzl();
                            r15 = 0;
                            r15 = 0;
                            int zzi = zzo3.zzi(zzq3, 0, false);
                            i11 = -1;
                            z8 = zzi != -1;
                        }
                        zzo4 = zzeVar.zzo();
                        if (!zzo4.zzg()) {
                            int zzq4 = zzeVar.zzq();
                            zzeVar.zzk();
                            zzeVar.zzl();
                            if (zzo4.zzh(zzq4, r15, r15) != i11) {
                                z9 = true;
                                zzo5 = zzeVar.zzo();
                                if (zzo5.zzg()) {
                                    zzbaVar = zzbaVar2;
                                    j2 = 0;
                                    if (zzo5.zzb(zzeVar.zzq(), zzeVar.zza, 0L).zzb()) {
                                        z10 = true;
                                        zzbe zzo6 = zzeVar.zzo();
                                        boolean z13 = zzo6.zzg() && zzo6.zzb(zzeVar.zzq(), zzeVar.zza, j2).zzi;
                                        boolean zzg = zzbaVar.zzo().zzg();
                                        zzav zzavVar = new zzav();
                                        zzavVar.zzd(zzawVar3);
                                        boolean z14 = !zzv;
                                        zzavVar.zzb(4, z14);
                                        zzavVar.zzb(5, (z7 || zzv) ? false : true);
                                        zzavVar.zzb(6, (z8 || zzv) ? false : true);
                                        zzavVar.zzb(7, zzg && (z8 || !z10 || z7) && !zzv);
                                        zzavVar.zzb(8, (z9 || zzv) ? false : true);
                                        zzavVar.zzb(9, zzg && (z9 || (z10 && z13)) && !zzv);
                                        zzavVar.zzb(10, z14);
                                        zzavVar.zzb(11, (z7 || zzv) ? false : true);
                                        if (z7 || zzv) {
                                            i12 = 12;
                                            z11 = false;
                                        } else {
                                            i12 = 12;
                                            z11 = true;
                                        }
                                        zzavVar.zzb(i12, z11);
                                        zze = zzavVar.zze();
                                        this.zzJ = zze;
                                        if (!zze.equals(zzawVar)) {
                                            this.zzn.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzje
                                                @Override // com.google.android.gms.internal.ads.zzdm
                                                public final /* synthetic */ void zza(Object obj10) {
                                                    zzjs.this.zzL((zzay) obj10);
                                                }
                                            });
                                        }
                                        this.zzn.zze();
                                        boolean z15 = zzldVar2.zzp;
                                        boolean z16 = zzldVar.zzp;
                                    }
                                } else {
                                    zzbaVar = zzbaVar2;
                                    j2 = 0;
                                }
                                z10 = false;
                                zzbe zzo62 = zzeVar.zzo();
                                if (zzo62.zzg()) {
                                }
                                boolean zzg2 = zzbaVar.zzo().zzg();
                                zzav zzavVar2 = new zzav();
                                zzavVar2.zzd(zzawVar3);
                                boolean z142 = !zzv;
                                zzavVar2.zzb(4, z142);
                                zzavVar2.zzb(5, (z7 || zzv) ? false : true);
                                zzavVar2.zzb(6, (z8 || zzv) ? false : true);
                                zzavVar2.zzb(7, zzg2 && (z8 || !z10 || z7) && !zzv);
                                zzavVar2.zzb(8, (z9 || zzv) ? false : true);
                                zzavVar2.zzb(9, zzg2 && (z9 || (z10 && z13)) && !zzv);
                                zzavVar2.zzb(10, z142);
                                zzavVar2.zzb(11, (z7 || zzv) ? false : true);
                                if (z7) {
                                }
                                i12 = 12;
                                z11 = false;
                                zzavVar2.zzb(i12, z11);
                                zze = zzavVar2.zze();
                                this.zzJ = zze;
                                if (!zze.equals(zzawVar)) {
                                }
                                this.zzn.zze();
                                boolean z152 = zzldVar2.zzp;
                                boolean z162 = zzldVar.zzp;
                            }
                        }
                        z9 = r15;
                        zzo5 = zzeVar.zzo();
                        if (zzo5.zzg()) {
                        }
                        z10 = false;
                        zzbe zzo622 = zzeVar.zzo();
                        if (zzo622.zzg()) {
                        }
                        boolean zzg22 = zzbaVar.zzo().zzg();
                        zzav zzavVar22 = new zzav();
                        zzavVar22.zzd(zzawVar3);
                        boolean z1422 = !zzv;
                        zzavVar22.zzb(4, z1422);
                        zzavVar22.zzb(5, (z7 || zzv) ? false : true);
                        zzavVar22.zzb(6, (z8 || zzv) ? false : true);
                        zzavVar22.zzb(7, zzg22 && (z8 || !z10 || z7) && !zzv);
                        zzavVar22.zzb(8, (z9 || zzv) ? false : true);
                        zzavVar22.zzb(9, zzg22 && (z9 || (z10 && z13)) && !zzv);
                        zzavVar22.zzb(10, z1422);
                        zzavVar22.zzb(11, (z7 || zzv) ? false : true);
                        if (z7) {
                        }
                        i12 = 12;
                        z11 = false;
                        zzavVar22.zzb(i12, z11);
                        zze = zzavVar22.zze();
                        this.zzJ = zze;
                        if (!zze.equals(zzawVar)) {
                        }
                        this.zzn.zze();
                        boolean z1522 = zzldVar2.zzp;
                        boolean z1622 = zzldVar.zzp;
                    }
                } else {
                    zzawVar = zzawVar2;
                }
                z7 = false;
                zzo3 = zzeVar.zzo();
                if (zzo3.zzg()) {
                }
                zzo4 = zzeVar.zzo();
                if (!zzo4.zzg()) {
                }
                z9 = r15;
                zzo5 = zzeVar.zzo();
                if (zzo5.zzg()) {
                }
                z10 = false;
                zzbe zzo6222 = zzeVar.zzo();
                if (zzo6222.zzg()) {
                }
                boolean zzg222 = zzbaVar.zzo().zzg();
                zzav zzavVar222 = new zzav();
                zzavVar222.zzd(zzawVar3);
                boolean z14222 = !zzv;
                zzavVar222.zzb(4, z14222);
                zzavVar222.zzb(5, (z7 || zzv) ? false : true);
                zzavVar222.zzb(6, (z8 || zzv) ? false : true);
                zzavVar222.zzb(7, zzg222 && (z8 || !z10 || z7) && !zzv);
                zzavVar222.zzb(8, (z9 || zzv) ? false : true);
                zzavVar222.zzb(9, zzg222 && (z9 || (z10 && z13)) && !zzv);
                zzavVar222.zzb(10, z14222);
                zzavVar222.zzb(11, (z7 || zzv) ? false : true);
                if (z7) {
                }
                i12 = 12;
                z11 = false;
                zzavVar222.zzb(i12, z11);
                zze = zzavVar222.zze();
                this.zzJ = zze;
                if (!zze.equals(zzawVar)) {
                }
                this.zzn.zze();
                boolean z15222 = zzldVar2.zzp;
                boolean z16222 = zzldVar.zzp;
            }
            pair = new Pair(true, 3);
        }
        zzldVar2 = zzldVar3;
        zzbeVar = zzbeVar2;
        i4 = 0;
        i5 = i16;
        z3 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!booleanValue) {
        }
        zzal zza3 = this.zzV.zza();
        list = zzldVar.zzj;
        while (i7 < list.size()) {
        }
        this.zzV = zza3.zzw();
        zzo = zzo();
        if (zzo.zzg()) {
        }
        boolean equals22 = zzw.equals(this.zzK);
        this.zzK = zzw;
        if (zzldVar2.zzl == zzldVar.zzl) {
        }
        if (zzldVar2.zze == zzldVar.zze) {
        }
        if (i8 == 0) {
        }
        zzak();
        if (zzldVar2.zzg == zzldVar.zzg) {
        }
        if (!equals) {
        }
        if (z3) {
        }
        if (!booleanValue) {
        }
        zzhzVar = zzldVar2.zzf;
        zzhzVar2 = zzldVar.zzf;
        if (zzhzVar != zzhzVar2) {
        }
        zzynVar = zzldVar2.zzi;
        zzynVar2 = zzldVar.zzi;
        if (zzynVar != zzynVar2) {
        }
        if (!z6) {
        }
        if (i9 != 0) {
        }
        if (i8 == 0) {
        }
        this.zzn.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzix
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj10) {
                int i21 = zzjs.zzd;
                zzld zzldVar5 = zzld.this;
                ((zzay) obj10).zzh(zzldVar5.zzl, zzldVar5.zze);
            }
        });
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        this.zzn.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj10) {
                int i21 = zzjs.zzd;
                zzld zzldVar5 = zzld.this;
                ((zzay) obj10).zzj(zzldVar5.zzl, zzldVar5.zzm);
            }
        });
        if (zzldVar2.zzn != zzldVar.zzn) {
        }
        if (zzldVar2.zzj() != zzldVar.zzj()) {
        }
        if (!zzldVar2.zzo.equals(zzldVar.zzo)) {
        }
        zzaw zzawVar22 = this.zzJ;
        zzba zzbaVar22 = this.zzg;
        zzaw zzawVar32 = this.zzc;
        String str32 = zzeo.zza;
        boolean zzv2 = zzbaVar22.zzv();
        zzeVar = (zze) zzbaVar22;
        zzo2 = zzeVar.zzo();
        if (zzo2.zzg()) {
        }
        z7 = false;
        zzo3 = zzeVar.zzo();
        if (zzo3.zzg()) {
        }
        zzo4 = zzeVar.zzo();
        if (!zzo4.zzg()) {
        }
        z9 = r15;
        zzo5 = zzeVar.zzo();
        if (zzo5.zzg()) {
        }
        z10 = false;
        zzbe zzo62222 = zzeVar.zzo();
        if (zzo62222.zzg()) {
        }
        boolean zzg2222 = zzbaVar.zzo().zzg();
        zzav zzavVar2222 = new zzav();
        zzavVar2222.zzd(zzawVar32);
        boolean z142222 = !zzv2;
        zzavVar2222.zzb(4, z142222);
        zzavVar2222.zzb(5, (z7 || zzv2) ? false : true);
        zzavVar2222.zzb(6, (z8 || zzv2) ? false : true);
        zzavVar2222.zzb(7, zzg2222 && (z8 || !z10 || z7) && !zzv2);
        zzavVar2222.zzb(8, (z9 || zzv2) ? false : true);
        zzavVar2222.zzb(9, zzg2222 && (z9 || (z10 && z13)) && !zzv2);
        zzavVar2222.zzb(10, z142222);
        zzavVar2222.zzb(11, (z7 || zzv2) ? false : true);
        if (z7) {
        }
        i12 = 12;
        z11 = false;
        zzavVar2222.zzb(i12, z11);
        zze = zzavVar2222.zze();
        this.zzJ = zze;
        if (!zze.equals(zzawVar)) {
        }
        this.zzn.zze();
        boolean z152222 = zzldVar2.zzp;
        boolean z162222 = zzldVar.zzp;
    }

    private static long zzac(zzld zzldVar) {
        zzbd zzbdVar = new zzbd();
        zzbc zzbcVar = new zzbc();
        zzbe zzbeVar = zzldVar.zza;
        zzbeVar.zzo(zzldVar.zzb.zza, zzbcVar);
        long j = zzldVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L).zzl;
        return 0L;
    }

    private final zzld zzad(zzld zzldVar, zzbe zzbeVar, Pair pair) {
        zzghc.zza(zzbeVar.zzg() || pair != null);
        zzbe zzbeVar2 = zzldVar.zza;
        long zzZ = zzZ(zzldVar);
        zzld zzd2 = zzldVar.zzd(zzbeVar);
        if (zzbeVar.zzg()) {
            zzup zzb = zzld.zzb();
            long zzq = zzeo.zzq(this.zzY);
            zzld zzh = zzd2.zzc(zzb, zzq, zzq, zzq, 0L, zzwq.zza, this.zzb, zzgjz.zzi()).zzh(zzb);
            zzh.zzq = zzh.zzs;
            return zzh;
        }
        zzup zzupVar = zzd2.zzb;
        Object obj = zzupVar.zza;
        String str = zzeo.zza;
        boolean equals = obj.equals(pair.first);
        zzup zzupVar2 = !equals ? new zzup(pair.first, -1L) : zzupVar;
        long longValue = ((Long) pair.second).longValue();
        long zzq2 = zzeo.zzq(zzZ);
        if (!zzbeVar2.zzg()) {
            zzbeVar2.zzo(obj, this.zzp);
        }
        if (!equals || longValue < zzq2) {
            zzup zzupVar3 = zzupVar2;
            zzghc.zzh(!zzupVar3.zzb());
            zzld zzh2 = zzd2.zzc(zzupVar3, longValue, longValue, longValue, 0L, !equals ? zzwq.zza : zzd2.zzh, !equals ? this.zzb : zzd2.zzi, !equals ? zzgjz.zzi() : zzd2.zzj).zzh(zzupVar3);
            zzh2.zzq = longValue;
            return zzh2;
        }
        if (longValue != zzq2) {
            zzup zzupVar4 = zzupVar2;
            zzghc.zzh(!zzupVar4.zzb());
            long max = Math.max(0L, zzd2.zzr - (longValue - zzq2));
            long j = zzd2.zzq;
            if (zzd2.zzk.equals(zzupVar)) {
                j = longValue + max;
            }
            zzld zzc = zzd2.zzc(zzupVar4, longValue, longValue, longValue, max, zzd2.zzh, zzd2.zzi, zzd2.zzj);
            zzc.zzq = j;
            return zzc;
        }
        int zze = zzbeVar.zze(zzd2.zzk.zza);
        if (zze != -1) {
            zzbc zzbcVar = this.zzp;
            if (zzbeVar.zzd(zze, zzbcVar, false).zzc == zzbeVar.zzo(zzupVar2.zza, zzbcVar).zzc) {
                return zzd2;
            }
        }
        Object obj2 = zzupVar2.zza;
        zzbc zzbcVar2 = this.zzp;
        zzbeVar.zzo(obj2, zzbcVar2);
        long zzh3 = zzupVar2.zzb() ? zzbcVar2.zzh(zzupVar2.zzb, zzupVar2.zzc) : zzbcVar2.zzd;
        zzup zzupVar5 = zzupVar2;
        zzld zzh4 = zzd2.zzc(zzupVar5, zzd2.zzs, zzd2.zzs, zzd2.zzd, zzh3 - zzd2.zzs, zzd2.zzh, zzd2.zzi, zzd2.zzj).zzh(zzupVar5);
        zzh4.zzq = zzh3;
        return zzh4;
    }

    private static zzld zzae(zzld zzldVar, int i) {
        zzld zze = zzldVar.zze(i);
        return (i == 1 || i == 4) ? zze.zzg(false) : zze;
    }

    private final Pair zzaf(zzbe zzbeVar, int i, long j) {
        if (zzbeVar.zzg()) {
            this.zzX = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzY = j;
            return null;
        }
        if (i == -1 || i >= zzbeVar.zza()) {
            i = zzbeVar.zzk(false);
            long j2 = zzbeVar.zzb(i, this.zza, 0L).zzl;
            j = zzeo.zzp(0L);
        }
        return zzbeVar.zzm(this.zza, this.zzp, i, zzeo.zzq(j));
    }

    private final long zzag(zzbe zzbeVar, zzup zzupVar, long j) {
        zzbeVar.zzo(zzupVar.zza, this.zzp);
        return j;
    }

    private final zzlh zzah(zzlg zzlgVar) {
        int zzY = zzY(this.zzW);
        zzbe zzbeVar = this.zzW.zza;
        if (zzY == -1) {
            zzY = 0;
        }
        zzdb zzdbVar = this.zzv;
        zzkf zzkfVar = this.zzm;
        return new zzlh(zzkfVar, zzlgVar, zzbeVar, zzY, zzdbVar, zzkfVar.zzn());
    }

    private final void zzai(Object obj) {
        Object obj2 = this.zzL;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zzl = this.zzm.zzl(obj, z ? this.zzA : -9223372036854775807L);
        if (z) {
            Object obj3 = this.zzL;
            Surface surface = this.zzM;
            if (obj3 == surface) {
                surface.release();
                this.zzM = null;
            }
        }
        this.zzL = obj;
        if (zzl) {
            return;
        }
        zzN(zzhz.zzc(new zzkg(3), PointerIconCompat.TYPE_HELP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzQ(final int i, final int i2) {
        if (i == this.zzO.zza() && i2 == this.zzO.zzb()) {
            return;
        }
        this.zzO = new zzeg(i, i2);
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(24, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzjs.zzd;
                ((zzay) obj).zzu(i, i2);
            }
        });
        zzdrVar.zze();
        zzam(2, 14, new zzeg(i, i2));
    }

    private final void zzak() {
        int zzg = zzg();
        if (zzg != 2 && zzg != 3) {
            this.zzy.zza(false);
            this.zzz.zza(false);
        } else {
            zzal();
            boolean z = this.zzW.zzp;
            this.zzy.zza(zzj());
            this.zzz.zza(zzj());
        }
    }

    private final void zzal() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzeo.zza;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzS) {
                throw new IllegalStateException(format);
            }
            zzds.zzd("ExoPlayerImpl", format, this.zzT ? null : new IllegalStateException());
            this.zzT = true;
        }
    }

    private final void zzam(int i, int i2, Object obj) {
        zzll[] zzllVarArr = this.zzh;
        int length = zzllVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzll zzllVar = zzllVarArr[i3];
            if (i == -1 || zzllVar.zza() == i) {
                zzlh zzah = zzah(zzllVar);
                zzah.zzb(i2);
                zzah.zzd(obj);
                zzah.zzg();
            }
        }
        zzll[] zzllVarArr2 = this.zzi;
        int length2 = zzllVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzll zzllVar2 = zzllVarArr2[i4];
            if (zzllVar2 != null && (i == -1 || zzllVar2.zza() == i)) {
                zzlh zzah2 = zzah(zzllVar2);
                zzah2.zzb(i2);
                zzah2.zzd(obj);
                zzah2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzA(Surface surface) {
        zzal();
        zzai(surface);
        int i = surface == null ? 0 : -1;
        zzQ(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzB(zzmg zzmgVar) {
        this.zzs.zzv(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzC(zzmg zzmgVar) {
        zzal();
        this.zzs.zzw(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final int zzD() {
        zzal();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzE(zzur zzurVar) {
        zzal();
        List singletonList = Collections.singletonList(zzurVar);
        zzal();
        zzal();
        zzY(this.zzW);
        zzs();
        this.zzD++;
        List list = this.zzq;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = size - 1; i >= 0; i--) {
                list.remove(i);
            }
            this.zzZ = this.zzZ.zzg(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzkz zzkzVar = new zzkz((zzur) singletonList.get(i2), this.zzr);
            arrayList.add(zzkzVar);
            list.add(i2, new zzjr(zzkzVar.zzb, zzkzVar.zza));
        }
        this.zzZ = this.zzZ.zzf(0, arrayList.size());
        zzlj zzljVar = new zzlj(list, this.zzZ);
        if (!zzljVar.zzg() && zzljVar.zza() < 0) {
            throw new zzv(zzljVar, -1, -9223372036854775807L);
        }
        int zzk = zzljVar.zzk(false);
        zzld zzad = zzad(this.zzW, zzljVar, zzaf(zzljVar, zzk, -9223372036854775807L));
        int i3 = zzad.zze;
        if (i3 == 1) {
            i3 = 1;
        } else {
            if (!zzljVar.zzg()) {
                if (zzk != -1) {
                    if (zzk < zzljVar.zza()) {
                        i3 = 2;
                    }
                }
            }
            i3 = 4;
        }
        zzld zzae = zzae(zzad, i3);
        this.zzm.zzy(arrayList, zzk, zzeo.zzq(-9223372036854775807L), this.zzZ);
        zzab(zzae, 0, (this.zzW.zzb.zza.equals(zzae.zzb.zza) || this.zzW.zza.zzg()) ? false : true, 4, zzaa(zzae), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzF() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeo.zza;
        String zza = zzak.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str).length() + 3 + String.valueOf(zza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.8.0] [");
        sb.append(str);
        sb.append("] [");
        sb.append(zza);
        sb.append("]");
        zzds.zzb("ExoPlayerImpl", sb.toString());
        zzal();
        this.zzy.zza(false);
        this.zzz.zza(false);
        this.zzC.zzv();
        if (!this.zzm.zzm()) {
            zzdr zzdrVar = this.zzn;
            zzdrVar.zzd(10, zzjj.zza);
            zzdrVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzl(null);
        zzyu zzyuVar = this.zzu;
        zzmd zzmdVar = this.zzs;
        zzyuVar.zzg(zzmdVar);
        boolean z = this.zzW.zzp;
        zzld zzae = zzae(this.zzW, 1);
        this.zzW = zzae;
        zzld zzh = zzae.zzh(zzae.zzb);
        this.zzW = zzh;
        zzh.zzq = zzh.zzs;
        this.zzW.zzr = 0L;
        zzmdVar.zzy();
        Surface surface = this.zzM;
        if (surface != null) {
            surface.release();
            this.zzM = null;
        }
        int i = zzcn.zza;
    }

    public final zzhz zzG() {
        zzal();
        return this.zzW.zzf;
    }

    final /* synthetic */ void zzH(zzay zzayVar, zzr zzrVar) {
        zzayVar.zza(this.zzg, new zzax(zzrVar));
    }

    final /* synthetic */ void zzI(final zzkc zzkcVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzjs.this.zzM(zzkcVar);
            }
        });
    }

    final /* synthetic */ void zzJ(int i, final int i2) {
        zzal();
        Integer valueOf = Integer.valueOf(i2);
        zzam(1, 10, valueOf);
        zzam(2, 10, valueOf);
        zzdm zzdmVar = new zzdm() { // from class: com.google.android.gms.internal.ads.zzjg
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzjs.zzd;
                ((zzay) obj).zzq(i2);
            }
        };
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(21, zzdmVar);
        zzdrVar.zze();
    }

    final /* synthetic */ void zzK() {
        String str = zzeo.zza;
        this.zzB.zzb(Integer.valueOf(zzca.zza(this.zzf).generateAudioSessionId()));
    }

    final /* synthetic */ void zzL(zzay zzayVar) {
        zzayVar.zzg(this.zzJ);
    }

    final /* synthetic */ void zzM(zzkc zzkcVar) {
        boolean z;
        int i = this.zzD - zzkcVar.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zzkcVar.zzc) {
            this.zzE = zzkcVar.zzd;
            this.zzF = true;
        }
        if (i == 0) {
            zzbe zzbeVar = zzkcVar.zza.zza;
            if (!this.zzW.zza.zzg() && zzbeVar.zzg()) {
                this.zzX = -1;
                this.zzY = 0L;
            }
            if (!zzbeVar.zzg()) {
                List zzw = ((zzlj) zzbeVar).zzw();
                int size = zzw.size();
                List list = this.zzq;
                zzghc.zzh(size == list.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzjr) list.get(i2)).zzc((zzbe) zzw.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (this.zzF) {
                if (zzkcVar.zza.zzb.equals(this.zzW.zzb) && zzkcVar.zza.zzd == this.zzW.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzbeVar.zzg() || zzkcVar.zza.zzb.zzb()) {
                        j = zzkcVar.zza.zzd;
                    } else {
                        zzld zzldVar = zzkcVar.zza;
                        zzup zzupVar = zzldVar.zzb;
                        long j2 = zzldVar.zzd;
                        zzag(zzbeVar, zzupVar, j2);
                        j = j2;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            this.zzF = false;
            zzab(zzkcVar.zza, 1, z, this.zzE, j, -1, false);
        }
    }

    final /* synthetic */ void zzO(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzai(surface);
        this.zzM = surface;
    }

    final /* synthetic */ void zzP(Object obj) {
        zzai(null);
    }

    final /* synthetic */ zzdr zzR() {
        return this.zzn;
    }

    final /* synthetic */ zzmd zzS() {
        return this.zzs;
    }

    final /* synthetic */ zzda zzT() {
        return this.zzB;
    }

    final /* synthetic */ Object zzU() {
        return this.zzL;
    }

    final /* synthetic */ boolean zzV() {
        return this.zzR;
    }

    final /* synthetic */ void zzW(boolean z) {
        this.zzR = z;
    }

    @Override // com.google.android.gms.internal.ads.zze
    protected final void zzb(int i, long j, int i2, boolean z) {
        zzal();
        if (i == -1) {
            return;
        }
        zzghc.zza(i >= 0);
        zzbe zzbeVar = this.zzW.zza;
        if (zzbeVar.zzg() || i < zzbeVar.zza()) {
            this.zzs.zzA();
            this.zzD++;
            if (zzv()) {
                zzds.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkc zzkcVar = new zzkc(this.zzW);
                zzkcVar.zza(1);
                this.zzl.zza(zzkcVar);
                return;
            }
            zzld zzldVar = this.zzW;
            int i3 = zzldVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzbeVar.zzg())) {
                zzldVar = zzae(this.zzW, 2);
            }
            int zzq = zzq();
            zzld zzad = zzad(zzldVar, zzbeVar, zzaf(zzbeVar, i, j));
            this.zzm.zzf(zzbeVar, i, zzeo.zzq(j));
            zzab(zzad, 0, true, 1, zzaa(zzad), zzq, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final Looper zzc() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zze(zzay zzayVar) {
        zzal();
        this.zzn.zzc(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzf() {
        zzal();
        zzld zzldVar = this.zzW;
        if (zzldVar.zze != 1) {
            return;
        }
        zzld zzf = zzldVar.zzf(null);
        zzld zzae = zzae(zzf, true != zzf.zza.zzg() ? 2 : 4);
        this.zzD++;
        this.zzm.zzd();
        zzab(zzae, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzg() {
        zzal();
        return this.zzW.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzh() {
        zzal();
        return this.zzW.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzi(boolean z) {
        zzal();
        zzld zzldVar = this.zzW;
        int i = zzldVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (zzldVar.zzl == z && i == i2 && zzldVar.zzm == 1) {
            return;
        }
        this.zzD++;
        boolean z2 = zzldVar.zzp;
        zzld zzi = zzldVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzab(zzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzj() {
        zzal();
        return this.zzW.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzk() {
        zzal();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzl() {
        zzal();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzm() {
        zzal();
        zzN(null);
        new zzcn(zzgjz.zzi(), this.zzW.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbm zzn() {
        zzal();
        return this.zzW.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbe zzo() {
        zzal();
        return this.zzW.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzp() {
        zzal();
        if (this.zzW.zza.zzg()) {
            return 0;
        }
        zzld zzldVar = this.zzW;
        return zzldVar.zza.zze(zzldVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzq() {
        zzal();
        int zzY = zzY(this.zzW);
        if (zzY == -1) {
            return 0;
        }
        return zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzr() {
        zzal();
        if (!zzv()) {
            zzbe zzo = zzo();
            if (zzo.zzg()) {
                return -9223372036854775807L;
            }
            return zzeo.zzp(zzo.zzb(zzq(), this.zza, 0L).zzm);
        }
        zzld zzldVar = this.zzW;
        zzup zzupVar = zzldVar.zzb;
        zzbe zzbeVar = zzldVar.zza;
        Object obj = zzupVar.zza;
        zzbc zzbcVar = this.zzp;
        zzbeVar.zzo(obj, zzbcVar);
        return zzeo.zzp(zzbcVar.zzh(zzupVar.zzb, zzupVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzs() {
        zzal();
        return zzeo.zzp(zzaa(this.zzW));
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzt() {
        zzal();
        if (zzv()) {
            zzld zzldVar = this.zzW;
            return zzldVar.zzk.equals(zzldVar.zzb) ? zzeo.zzp(this.zzW.zzq) : zzr();
        }
        zzal();
        if (this.zzW.zza.zzg()) {
            return this.zzY;
        }
        zzld zzldVar2 = this.zzW;
        long j = 0;
        if (zzldVar2.zzk.zzd != zzldVar2.zzb.zzd) {
            return zzeo.zzp(zzldVar2.zza.zzb(zzq(), this.zza, 0L).zzm);
        }
        long j2 = zzldVar2.zzq;
        if (this.zzW.zzk.zzb()) {
            zzld zzldVar3 = this.zzW;
            zzldVar3.zza.zzo(zzldVar3.zzk.zza, this.zzp).zzc(this.zzW.zzk.zzb);
        } else {
            j = j2;
        }
        zzld zzldVar4 = this.zzW;
        zzag(zzldVar4.zza, zzldVar4.zzk, j);
        return zzeo.zzp(j);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzu() {
        zzal();
        return zzeo.zzp(this.zzW.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzv() {
        zzal();
        return this.zzW.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzw() {
        zzal();
        if (zzv()) {
            return this.zzW.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzx() {
        zzal();
        if (zzv()) {
            return this.zzW.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzy() {
        zzal();
        return zzZ(this.zzW);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzz(float f) {
        zzal();
        String str = zzeo.zza;
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzQ == max) {
            return;
        }
        this.zzQ = max;
        this.zzm.zzj(max);
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(22, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjk
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i = zzjs.zzd;
                ((zzay) obj).zzr(max);
            }
        });
        zzdrVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzd(zzay zzayVar) {
        zzayVar.getClass();
        this.zzn.zzb(zzayVar);
    }
}
