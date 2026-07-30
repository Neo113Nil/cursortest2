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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzks extends zzf implements zzjh {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfa zzC;
    private final zzkr zzD;
    private final Map zzE;
    private int zzF;
    private int zzG;
    private boolean zzH;
    private zzms zzI;
    private zzmt zzJ;
    private zzjg zzK;
    private zzax zzL;
    private zzan zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzes zzQ;
    private zzd zzR;
    private float zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private zzil zzY;
    private zzan zzZ;
    private zzmd zzaa;
    private int zzab;
    private long zzac;
    private zzyf zzad;
    final zzaak zzb;
    final zzax zzc;
    private final zzdq zze = new zzdq(zzdn.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzml[] zzh;
    private final zzml[] zzi;
    private final zzaaj zzj;
    private final zzdx zzk;
    private final zzld zzl;
    private final zzlf zzm;
    private final zzed zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmx zzs;
    private final Looper zzt;
    private final zzaas zzu;
    private final zzdn zzv;
    private final zzjo zzw;
    private final zzkn zzx;
    private final zzfo zzy;
    private final zzfp zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzks(zzjf zzjfVar, zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfj.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb.append(str);
            sb.append("]");
            zzee.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjfVar.zza.getApplicationContext();
            this.zzs = (zzmx) zzjfVar.zzh.apply(zzjfVar.zzb);
            this.zzW = zzjfVar.zzj;
            this.zzR = zzjfVar.zzk;
            this.zzP = zzjfVar.zzl;
            this.zzT = false;
            this.zzA = zzjfVar.zzq;
            zzjo zzjoVar = new zzjo(this, null);
            this.zzw = zzjoVar;
            this.zzx = new zzkn(null);
            zzml[] zza = ((zzmq) zzjfVar.zzc.zza()).zza(new Handler(zzjfVar.zzi), zzjoVar, zzjoVar, zzjoVar, zzjoVar);
            this.zzh = zza;
            int length = zza.length;
            this.zzi = new zzml[2];
            int i = 0;
            while (true) {
                zzml[] zzmlVarArr = this.zzi;
                int length2 = zzmlVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzml zzmlVar = this.zzh[i];
                zzmlVarArr[i] = null;
                i++;
            }
            zzaaj zzaajVar = (zzaaj) zzjfVar.zze.zza();
            this.zzj = zzaajVar;
            zzaas zzaasVar = (zzaas) zzjfVar.zzg.zza();
            this.zzu = zzaasVar;
            this.zzr = zzjfVar.zzm;
            this.zzJ = zzjfVar.zzn;
            this.zzI = zzjfVar.zzo;
            Looper looper = zzjfVar.zzi;
            this.zzt = looper;
            zzdn zzdnVar = zzjfVar.zzb;
            this.zzv = zzdnVar;
            this.zzg = zzbbVar;
            this.zzn = new zzed(looper, zzdnVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    zzks.this.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzyf(0);
            this.zzK = zzjg.zza;
            int length3 = this.zzh.length;
            zzaak zzaakVar = new zzaak(new zzmo[2], new zzaac[2], zzbn.zza, null);
            this.zzb = zzaakVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaajVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zze = zzawVar.zze();
            this.zzc = zze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzL = zzawVar2.zze();
            this.zzk = zzdnVar.zzd(looper, null);
            zzld zzldVar = new zzld() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzld
                public final /* synthetic */ void zza(zzlc zzlcVar) {
                    zzks.this.zzK(zzlcVar);
                }
            };
            this.zzl = zzldVar;
            this.zzaa = zzmd.zza(zzaakVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpq zzpqVar = new zzpq(zzjfVar.zzx);
            zzlf zzlfVar = new zzlf(this.zzf, this.zzh, this.zzi, zzaajVar, zzaakVar, (zzlj) zzjfVar.zzf.zza(), zzaasVar, 0, false, this.zzs, this.zzJ, zzjfVar.zzy, zzjfVar.zzp, false, false, looper, zzdnVar, zzldVar, zzpqVar, null, this.zzK, this.zzx);
            this.zzm = zzlfVar;
            Looper zzn = zzlfVar.zzn();
            this.zzS = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzM = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i2 = zzcz.zza;
            this.zzU = true;
            zze(this.zzs);
            zzaasVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z = zzjfVar.zzv;
                zzdnVar.zzd(zzlfVar.zzn(), null).zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpm zza2 = zzpm.zza(context);
                        if (zza2 == null) {
                            zzee.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.zzD(zza2);
                        }
                        zzpqVar.zzb(zza2.zzb());
                    }
                });
            }
            zzdm zzdmVar = new zzdm(0, zzn, looper, zzdnVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    zzks.this.zzL(((Integer) obj).intValue(), intValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzks.this.zzM();
                }
            });
            new zzbz(zzjfVar.zza, zzn, zzjfVar.zzi, this.zzw, zzdnVar);
            boolean z2 = (zzjfVar.zzs == Integer.MAX_VALUE || zzjfVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfo zzfoVar = new zzfo(zzjfVar.zza, zzn, zzdnVar);
            this.zzy = zzfoVar;
            zzfoVar.zza(z2);
            this.zzz = new zzfp(zzjfVar.zza, zzn, zzdnVar);
            int i3 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzQ = zzes.zza;
            this.zzD = Build.VERSION.SDK_INT >= 34 ? new zzkr(this, zzjfVar.zza, null) : null;
            this.zzE = new HashMap();
            this.zzY = zzil.zza;
            this.zzC = new zzfa(this, this.zzw, zzdnVar, zzjfVar.zzr, zzjfVar.zzs, zzjfVar.zzt, zzjfVar.zzu);
            zzlfVar.zzg(this.zzI);
            zzlfVar.zzi(this.zzR, false);
            zzaw(1, 3, this.zzR);
            zzaw(2, 4, Integer.valueOf(this.zzP));
            zzaw(2, 5, 0);
            zzaw(1, 9, Boolean.valueOf(this.zzT));
            zzaw(6, 8, this.zzx);
            zzaw(-1, 16, Integer.valueOf(this.zzW));
        } finally {
            this.zze.zza();
        }
    }

    static /* synthetic */ zzil zzU(zzil zzilVar, List list) {
        zzik zzikVar = new zzik(zzilVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzilVar.zza()) {
            if (!hashSet.contains(str)) {
                zzikVar.zzf(str);
            }
        }
        return zzikVar.zzg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
    public final void zzP(zziw zziwVar) {
        zzmd zzmdVar = this.zzaa;
        zzmd zzh = zzmdVar.zzh(zzmdVar.zzb);
        zzh.zzq = zzh.zzs;
        zzh.zzr = 0L;
        zzmd zzao = zzao(zzh, 1);
        if (zziwVar != null) {
            zzao = zzao.zzf(zziwVar);
        }
        this.zzF++;
        this.zzm.zzh();
        zzal(zzao, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzai(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmdVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzaj(zzmd zzmdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        if (!zzwkVar.zzb()) {
            return zzfj.zzp(zzak(zzmdVar));
        }
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        long j = zzmdVar.zzc;
        if (j != -9223372036854775807L) {
            return zzfj.zzp(0L) + zzfj.zzp(j);
        }
        long j2 = zzbfVar.zzb(zzai(zzmdVar), this.zza, 0L).zzl;
        return zzfj.zzp(0L);
    }

    private final long zzak(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        if (zzbfVar.zzg()) {
            return zzfj.zzq(this.zzac);
        }
        boolean z = zzmdVar.zzp;
        long j = zzmdVar.zzs;
        zzwk zzwkVar = zzmdVar.zzb;
        if (zzwkVar.zzb()) {
            return j;
        }
        zzaq(zzbfVar, zzwkVar, j);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0471 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x047b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0496 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d7  */
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
    /* JADX WARN: Removed duplicated region for block: B:42:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ed  */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzal(final zzmd zzmdVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        zzmd zzmdVar2;
        zzbf zzbfVar;
        final int i5;
        boolean z3;
        Pair pair;
        boolean z4;
        boolean z5;
        int i6;
        boolean booleanValue;
        final zzak zzakVar;
        List list;
        int i7;
        zzbf zzq;
        zzan zzw;
        int i8;
        int i9;
        int i10;
        boolean z6;
        zziw zziwVar;
        zziw zziwVar2;
        zzaak zzaakVar;
        zzaak zzaakVar2;
        zzf zzfVar;
        zzbf zzq2;
        zzax zzaxVar;
        boolean z7;
        zzbf zzq3;
        ?? r15;
        int i11;
        boolean z8;
        zzbf zzq4;
        boolean z9;
        zzbf zzq5;
        zzbb zzbbVar;
        long j2;
        boolean z10;
        int i12;
        boolean z11;
        zzax zze;
        int i13;
        int i14;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long j3;
        long zzam;
        int i15;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        int i16 = i2;
        zzmd zzmdVar3 = this.zzaa;
        this.zzaa = zzmdVar;
        zzbf zzbfVar2 = zzmdVar3.zza;
        zzbf zzbfVar3 = zzmdVar.zza;
        boolean equals = zzbfVar2.equals(zzbfVar3);
        if (zzbfVar3.zzg() && zzbfVar2.zzg()) {
            pair = new Pair(false, -1);
        } else {
            if (zzbfVar3.zzg() == zzbfVar2.zzg()) {
                zzwk zzwkVar = zzmdVar3.zzb;
                Object obj5 = zzwkVar.zza;
                i4 = 0;
                zzbd zzbdVar = this.zzp;
                int i17 = zzbfVar2.zzo(obj5, zzbdVar).zzc;
                zzbe zzbeVar = this.zza;
                Object obj6 = zzbfVar2.zzb(i17, zzbeVar, 0L).zzb;
                zzwk zzwkVar2 = zzmdVar.zzb;
                zzmdVar2 = zzmdVar3;
                zzbfVar = zzbfVar2;
                if (obj6.equals(zzbfVar3.zzb(zzbfVar3.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb)) {
                    if (z) {
                        if (i16 != 0) {
                            i5 = i16;
                        } else if (zzwkVar.zzd < zzwkVar2.zzd) {
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
                    zzakVar = null;
                } else {
                    zzakVar = !zzbfVar3.zzg() ? zzbfVar3.zzb(zzbfVar3.zzo(zzmdVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd : null;
                    this.zzZ = zzan.zza;
                }
                if (!booleanValue || !zzmdVar2.zzj.equals(zzmdVar.zzj)) {
                    zzam zza = this.zzZ.zza();
                    list = zzmdVar.zzj;
                    for (i7 = i4; i7 < list.size(); i7++) {
                        zzap zzapVar = (zzap) list.get(i7);
                        for (int i18 = i4; i18 < zzapVar.zza(); i18++) {
                            zzapVar.zzb(i18).zza(zza);
                        }
                    }
                    this.zzZ = zza.zzw();
                }
                zzq = zzq();
                if (zzq.zzg()) {
                    zzak zzakVar4 = zzq.zzb(zzs(), this.zza, 0L).zzd;
                    zzam zza2 = this.zzZ.zza();
                    zza2.zzv(zzakVar4.zzd);
                    zzw = zza2.zzw();
                } else {
                    zzw = this.zzZ;
                }
                boolean equals2 = zzw.equals(this.zzM);
                this.zzM = zzw;
                int i19 = zzmdVar2.zzl == zzmdVar.zzl ? 1 : i4;
                i8 = zzmdVar2.zze == zzmdVar.zze ? 1 : i4;
                if (i8 == 0 || i19 != 0) {
                    zzau();
                }
                i9 = zzmdVar2.zzg == zzmdVar.zzg ? 1 : i4;
                if (!equals) {
                    this.zzn.zzd(i4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzki
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj7) {
                            int i20 = zzks.zzd;
                            ((zzaz) obj7).zzb(zzmd.this.zza, i);
                        }
                    });
                }
                if (z3) {
                    i10 = i19;
                    z6 = equals2;
                } else {
                    zzbd zzbdVar2 = new zzbd();
                    if (zzbfVar.zzg()) {
                        i10 = i19;
                        z6 = equals2;
                        i13 = i3;
                        i14 = i13;
                        obj = null;
                        zzakVar2 = null;
                        obj2 = null;
                    } else {
                        Object obj7 = zzmdVar2.zzb.zza;
                        zzbf zzbfVar4 = zzbfVar;
                        zzbfVar4.zzo(obj7, zzbdVar2);
                        int i20 = zzbdVar2.zzc;
                        int zze2 = zzbfVar4.zze(obj7);
                        zzbe zzbeVar2 = this.zza;
                        i10 = i19;
                        z6 = equals2;
                        Object obj8 = zzbfVar4.zzb(i20, zzbeVar2, 0L).zzb;
                        zzakVar2 = zzbeVar2.zzd;
                        i13 = i20;
                        obj = obj8;
                        obj2 = obj7;
                        i14 = zze2;
                    }
                    if (i5 == 0) {
                        zzwk zzwkVar3 = zzmdVar2.zzb;
                        if (zzwkVar3.zzb()) {
                            j3 = zzbdVar2.zzh(zzwkVar3.zzb, zzwkVar3.zzc);
                            zzam = zzam(zzmdVar2);
                            String str = zzfj.zza;
                            zzwk zzwkVar4 = zzmdVar2.zzb;
                            final zzba zzbaVar = new zzba(obj, i13, zzakVar2, obj2, i14, zzfj.zzp(j3), zzfj.zzp(zzam), zzwkVar4.zzb, zzwkVar4.zzc);
                            int zzs = zzs();
                            int zzr = zzr();
                            if (this.zzaa.zza.zzg()) {
                                zzmd zzmdVar4 = this.zzaa;
                                Object obj9 = zzmdVar4.zzb.zza;
                                zzmdVar4.zza.zzo(obj9, this.zzp);
                                int zze3 = this.zzaa.zza.zze(obj9);
                                zzbf zzbfVar5 = this.zzaa.zza;
                                zzbe zzbeVar3 = this.zza;
                                i15 = zze3;
                                obj3 = zzbfVar5.zzb(zzs, zzbeVar3, 0L).zzb;
                                zzakVar3 = zzbeVar3.zzd;
                                obj4 = obj9;
                            } else {
                                i15 = zzr;
                                obj3 = null;
                                zzakVar3 = null;
                                obj4 = null;
                            }
                            long zzp = zzfj.zzp(j);
                            long zzp2 = !this.zzaa.zzb.zzb() ? zzfj.zzp(zzam(this.zzaa)) : zzp;
                            zzwk zzwkVar5 = this.zzaa.zzb;
                            final zzba zzbaVar2 = new zzba(obj3, zzs, zzakVar3, obj4, i15, zzp, zzp2, zzwkVar5.zzb, zzwkVar5.zzc);
                            this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                                @Override // com.google.android.gms.internal.ads.zzdy
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i21 = zzks.zzd;
                                    ((zzaz) obj10).zzo(zzbaVar, zzbaVar2, i5);
                                }
                            });
                        } else {
                            j3 = zzwkVar3.zze != -1 ? zzam(this.zzaa) : zzbdVar2.zzd;
                            zzam = j3;
                            String str2 = zzfj.zza;
                            zzwk zzwkVar42 = zzmdVar2.zzb;
                            final zzba zzbaVar3 = new zzba(obj, i13, zzakVar2, obj2, i14, zzfj.zzp(j3), zzfj.zzp(zzam), zzwkVar42.zzb, zzwkVar42.zzc);
                            int zzs2 = zzs();
                            int zzr2 = zzr();
                            if (this.zzaa.zza.zzg()) {
                            }
                            long zzp3 = zzfj.zzp(j);
                            if (!this.zzaa.zzb.zzb()) {
                            }
                            zzwk zzwkVar52 = this.zzaa.zzb;
                            final zzba zzbaVar22 = new zzba(obj3, zzs2, zzakVar3, obj4, i15, zzp3, zzp2, zzwkVar52.zzb, zzwkVar52.zzc);
                            this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                                @Override // com.google.android.gms.internal.ads.zzdy
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i21 = zzks.zzd;
                                    ((zzaz) obj10).zzo(zzbaVar3, zzbaVar22, i5);
                                }
                            });
                        }
                    } else if (zzmdVar2.zzb.zzb()) {
                        j3 = zzmdVar2.zzs;
                        zzam = zzam(zzmdVar2);
                        String str22 = zzfj.zza;
                        zzwk zzwkVar422 = zzmdVar2.zzb;
                        final zzba zzbaVar32 = new zzba(obj, i13, zzakVar2, obj2, i14, zzfj.zzp(j3), zzfj.zzp(zzam), zzwkVar422.zzb, zzwkVar422.zzc);
                        int zzs22 = zzs();
                        int zzr22 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        long zzp32 = zzfj.zzp(j);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzwk zzwkVar522 = this.zzaa.zzb;
                        final zzba zzbaVar222 = new zzba(obj3, zzs22, zzakVar3, obj4, i15, zzp32, zzp2, zzwkVar522.zzb, zzwkVar522.zzc);
                        this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj10) {
                                int i21 = zzks.zzd;
                                ((zzaz) obj10).zzo(zzbaVar32, zzbaVar222, i5);
                            }
                        });
                    } else {
                        j3 = zzmdVar2.zzs;
                        zzam = j3;
                        String str222 = zzfj.zza;
                        zzwk zzwkVar4222 = zzmdVar2.zzb;
                        final zzba zzbaVar322 = new zzba(obj, i13, zzakVar2, obj2, i14, zzfj.zzp(j3), zzfj.zzp(zzam), zzwkVar4222.zzb, zzwkVar4222.zzc);
                        int zzs222 = zzs();
                        int zzr222 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        long zzp322 = zzfj.zzp(j);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzwk zzwkVar5222 = this.zzaa.zzb;
                        final zzba zzbaVar2222 = new zzba(obj3, zzs222, zzakVar3, obj4, i15, zzp322, zzp2, zzwkVar5222.zzb, zzwkVar5222.zzc);
                        this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj10) {
                                int i21 = zzks.zzd;
                                ((zzaz) obj10).zzo(zzbaVar322, zzbaVar2222, i5);
                            }
                        });
                    }
                }
                if (!booleanValue) {
                    this.zzn.zzd(1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkk
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zzc(zzak.this, intValue);
                        }
                    });
                }
                zziwVar = zzmdVar2.zzf;
                zziwVar2 = zzmdVar.zzf;
                if (zziwVar != zziwVar2) {
                    zzed zzedVar = this.zzn;
                    zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkl
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zzn(zzmd.this.zzf);
                        }
                    });
                    if (zziwVar2 != null) {
                        zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjq
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj10) {
                                int i21 = zzks.zzd;
                                ((zzaz) obj10).zzm(zzmd.this.zzf);
                            }
                        });
                    }
                }
                zzaakVar = zzmdVar2.zzi;
                zzaakVar2 = zzmdVar.zzi;
                if (zzaakVar != zzaakVar2) {
                    this.zzj.zzp(zzaakVar2.zze);
                    this.zzn.zzd(2, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjr
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zzd(zzmd.this.zzi.zzd);
                        }
                    });
                }
                if (!z6) {
                    final zzan zzanVar = this.zzM;
                    this.zzn.zzd(14, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjs
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zze(zzan.this);
                        }
                    });
                }
                if (i9 != 0) {
                    this.zzn.zzd(3, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjt
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zzf(zzmd.this.zzg);
                        }
                    });
                }
                if (i8 == 0 || i10 != 0) {
                    this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzju
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            zzmd zzmdVar5 = zzmd.this;
                            ((zzaz) obj10).zzh(zzmdVar5.zzl, zzmdVar5.zze);
                        }
                    });
                }
                if (i8 != 0) {
                    this.zzn.zzd(4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjv
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zzi(zzmd.this.zze);
                        }
                    });
                }
                if (i10 == 0 || zzmdVar2.zzm != zzmdVar.zzm) {
                    this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjw
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            zzmd zzmdVar5 = zzmd.this;
                            ((zzaz) obj10).zzj(zzmdVar5.zzl, zzmdVar5.zzm);
                        }
                    });
                }
                if (zzmdVar2.zzn != zzmdVar.zzn) {
                    this.zzn.zzd(6, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjx
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zzk(zzmd.this.zzn);
                        }
                    });
                }
                if (zzmdVar2.zzj() != zzmdVar.zzj()) {
                    this.zzn.zzd(7, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjy
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zzl(zzmd.this.zzj());
                        }
                    });
                }
                if (!zzmdVar2.zzo.equals(zzmdVar.zzo)) {
                    this.zzn.zzd(12, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjz
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i21 = zzks.zzd;
                            ((zzaz) obj10).zzp(zzmd.this.zzo);
                        }
                    });
                }
                zzax zzaxVar2 = this.zzL;
                zzbb zzbbVar2 = this.zzg;
                zzax zzaxVar3 = this.zzc;
                String str3 = zzfj.zza;
                boolean zzx = zzbbVar2.zzx();
                zzfVar = (zzf) zzbbVar2;
                zzq2 = zzfVar.zzq();
                if (zzq2.zzg()) {
                    zzaxVar = zzaxVar2;
                    if (zzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
                        z7 = true;
                        zzq3 = zzfVar.zzq();
                        if (zzq3.zzg()) {
                            i11 = -1;
                            r15 = 0;
                            z8 = false;
                        } else {
                            int zzs3 = zzfVar.zzs();
                            zzfVar.zzl();
                            zzfVar.zzm();
                            r15 = 0;
                            r15 = 0;
                            int zzi = zzq3.zzi(zzs3, 0, false);
                            i11 = -1;
                            z8 = zzi != -1;
                        }
                        zzq4 = zzfVar.zzq();
                        if (!zzq4.zzg()) {
                            int zzs4 = zzfVar.zzs();
                            zzfVar.zzl();
                            zzfVar.zzm();
                            if (zzq4.zzh(zzs4, r15, r15) != i11) {
                                z9 = true;
                                zzq5 = zzfVar.zzq();
                                if (zzq5.zzg()) {
                                    zzbbVar = zzbbVar2;
                                    j2 = 0;
                                    if (zzq5.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                                        z10 = true;
                                        zzbf zzq6 = zzfVar.zzq();
                                        boolean z13 = zzq6.zzg() && zzq6.zzb(zzfVar.zzs(), zzfVar.zza, j2).zzi;
                                        boolean zzg = zzbbVar.zzq().zzg();
                                        zzaw zzawVar = new zzaw();
                                        zzawVar.zzd(zzaxVar3);
                                        boolean z14 = !zzx;
                                        zzawVar.zzb(4, z14);
                                        zzawVar.zzb(5, (z7 || zzx) ? false : true);
                                        zzawVar.zzb(6, (z8 || zzx) ? false : true);
                                        zzawVar.zzb(7, zzg && (z8 || !z10 || z7) && !zzx);
                                        zzawVar.zzb(8, (z9 || zzx) ? false : true);
                                        zzawVar.zzb(9, zzg && (z9 || (z10 && z13)) && !zzx);
                                        zzawVar.zzb(10, z14);
                                        zzawVar.zzb(11, (z7 || zzx) ? false : true);
                                        if (z7 || zzx) {
                                            i12 = 12;
                                            z11 = false;
                                        } else {
                                            i12 = 12;
                                            z11 = true;
                                        }
                                        zzawVar.zzb(i12, z11);
                                        zze = zzawVar.zze();
                                        this.zzL = zze;
                                        if (!zze.equals(zzaxVar)) {
                                            this.zzn.zzd(13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkb
                                                @Override // com.google.android.gms.internal.ads.zzdy
                                                public final /* synthetic */ void zza(Object obj10) {
                                                    zzks.this.zzN((zzaz) obj10);
                                                }
                                            });
                                        }
                                        this.zzn.zze();
                                        boolean z15 = zzmdVar2.zzp;
                                        boolean z16 = zzmdVar.zzp;
                                    }
                                } else {
                                    zzbbVar = zzbbVar2;
                                    j2 = 0;
                                }
                                z10 = false;
                                zzbf zzq62 = zzfVar.zzq();
                                if (zzq62.zzg()) {
                                }
                                boolean zzg2 = zzbbVar.zzq().zzg();
                                zzaw zzawVar2 = new zzaw();
                                zzawVar2.zzd(zzaxVar3);
                                boolean z142 = !zzx;
                                zzawVar2.zzb(4, z142);
                                zzawVar2.zzb(5, (z7 || zzx) ? false : true);
                                zzawVar2.zzb(6, (z8 || zzx) ? false : true);
                                zzawVar2.zzb(7, zzg2 && (z8 || !z10 || z7) && !zzx);
                                zzawVar2.zzb(8, (z9 || zzx) ? false : true);
                                zzawVar2.zzb(9, zzg2 && (z9 || (z10 && z13)) && !zzx);
                                zzawVar2.zzb(10, z142);
                                zzawVar2.zzb(11, (z7 || zzx) ? false : true);
                                if (z7) {
                                }
                                i12 = 12;
                                z11 = false;
                                zzawVar2.zzb(i12, z11);
                                zze = zzawVar2.zze();
                                this.zzL = zze;
                                if (!zze.equals(zzaxVar)) {
                                }
                                this.zzn.zze();
                                boolean z152 = zzmdVar2.zzp;
                                boolean z162 = zzmdVar.zzp;
                            }
                        }
                        z9 = r15;
                        zzq5 = zzfVar.zzq();
                        if (zzq5.zzg()) {
                        }
                        z10 = false;
                        zzbf zzq622 = zzfVar.zzq();
                        if (zzq622.zzg()) {
                        }
                        boolean zzg22 = zzbbVar.zzq().zzg();
                        zzaw zzawVar22 = new zzaw();
                        zzawVar22.zzd(zzaxVar3);
                        boolean z1422 = !zzx;
                        zzawVar22.zzb(4, z1422);
                        zzawVar22.zzb(5, (z7 || zzx) ? false : true);
                        zzawVar22.zzb(6, (z8 || zzx) ? false : true);
                        zzawVar22.zzb(7, zzg22 && (z8 || !z10 || z7) && !zzx);
                        zzawVar22.zzb(8, (z9 || zzx) ? false : true);
                        zzawVar22.zzb(9, zzg22 && (z9 || (z10 && z13)) && !zzx);
                        zzawVar22.zzb(10, z1422);
                        zzawVar22.zzb(11, (z7 || zzx) ? false : true);
                        if (z7) {
                        }
                        i12 = 12;
                        z11 = false;
                        zzawVar22.zzb(i12, z11);
                        zze = zzawVar22.zze();
                        this.zzL = zze;
                        if (!zze.equals(zzaxVar)) {
                        }
                        this.zzn.zze();
                        boolean z1522 = zzmdVar2.zzp;
                        boolean z1622 = zzmdVar.zzp;
                    }
                } else {
                    zzaxVar = zzaxVar2;
                }
                z7 = false;
                zzq3 = zzfVar.zzq();
                if (zzq3.zzg()) {
                }
                zzq4 = zzfVar.zzq();
                if (!zzq4.zzg()) {
                }
                z9 = r15;
                zzq5 = zzfVar.zzq();
                if (zzq5.zzg()) {
                }
                z10 = false;
                zzbf zzq6222 = zzfVar.zzq();
                if (zzq6222.zzg()) {
                }
                boolean zzg222 = zzbbVar.zzq().zzg();
                zzaw zzawVar222 = new zzaw();
                zzawVar222.zzd(zzaxVar3);
                boolean z14222 = !zzx;
                zzawVar222.zzb(4, z14222);
                zzawVar222.zzb(5, (z7 || zzx) ? false : true);
                zzawVar222.zzb(6, (z8 || zzx) ? false : true);
                zzawVar222.zzb(7, zzg222 && (z8 || !z10 || z7) && !zzx);
                zzawVar222.zzb(8, (z9 || zzx) ? false : true);
                zzawVar222.zzb(9, zzg222 && (z9 || (z10 && z13)) && !zzx);
                zzawVar222.zzb(10, z14222);
                zzawVar222.zzb(11, (z7 || zzx) ? false : true);
                if (z7) {
                }
                i12 = 12;
                z11 = false;
                zzawVar222.zzb(i12, z11);
                zze = zzawVar222.zze();
                this.zzL = zze;
                if (!zze.equals(zzaxVar)) {
                }
                this.zzn.zze();
                boolean z15222 = zzmdVar2.zzp;
                boolean z16222 = zzmdVar.zzp;
            }
            pair = new Pair(true, 3);
        }
        zzmdVar2 = zzmdVar3;
        zzbfVar = zzbfVar2;
        i4 = 0;
        i5 = i16;
        z3 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!booleanValue) {
        }
        zzam zza3 = this.zzZ.zza();
        list = zzmdVar.zzj;
        while (i7 < list.size()) {
        }
        this.zzZ = zza3.zzw();
        zzq = zzq();
        if (zzq.zzg()) {
        }
        boolean equals22 = zzw.equals(this.zzM);
        this.zzM = zzw;
        if (zzmdVar2.zzl == zzmdVar.zzl) {
        }
        if (zzmdVar2.zze == zzmdVar.zze) {
        }
        if (i8 == 0) {
        }
        zzau();
        if (zzmdVar2.zzg == zzmdVar.zzg) {
        }
        if (!equals) {
        }
        if (z3) {
        }
        if (!booleanValue) {
        }
        zziwVar = zzmdVar2.zzf;
        zziwVar2 = zzmdVar.zzf;
        if (zziwVar != zziwVar2) {
        }
        zzaakVar = zzmdVar2.zzi;
        zzaakVar2 = zzmdVar.zzi;
        if (zzaakVar != zzaakVar2) {
        }
        if (!z6) {
        }
        if (i9 != 0) {
        }
        if (i8 == 0) {
        }
        this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj10) {
                int i21 = zzks.zzd;
                zzmd zzmdVar5 = zzmd.this;
                ((zzaz) obj10).zzh(zzmdVar5.zzl, zzmdVar5.zze);
            }
        });
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj10) {
                int i21 = zzks.zzd;
                zzmd zzmdVar5 = zzmd.this;
                ((zzaz) obj10).zzj(zzmdVar5.zzl, zzmdVar5.zzm);
            }
        });
        if (zzmdVar2.zzn != zzmdVar.zzn) {
        }
        if (zzmdVar2.zzj() != zzmdVar.zzj()) {
        }
        if (!zzmdVar2.zzo.equals(zzmdVar.zzo)) {
        }
        zzax zzaxVar22 = this.zzL;
        zzbb zzbbVar22 = this.zzg;
        zzax zzaxVar32 = this.zzc;
        String str32 = zzfj.zza;
        boolean zzx2 = zzbbVar22.zzx();
        zzfVar = (zzf) zzbbVar22;
        zzq2 = zzfVar.zzq();
        if (zzq2.zzg()) {
        }
        z7 = false;
        zzq3 = zzfVar.zzq();
        if (zzq3.zzg()) {
        }
        zzq4 = zzfVar.zzq();
        if (!zzq4.zzg()) {
        }
        z9 = r15;
        zzq5 = zzfVar.zzq();
        if (zzq5.zzg()) {
        }
        z10 = false;
        zzbf zzq62222 = zzfVar.zzq();
        if (zzq62222.zzg()) {
        }
        boolean zzg2222 = zzbbVar.zzq().zzg();
        zzaw zzawVar2222 = new zzaw();
        zzawVar2222.zzd(zzaxVar32);
        boolean z142222 = !zzx2;
        zzawVar2222.zzb(4, z142222);
        zzawVar2222.zzb(5, (z7 || zzx2) ? false : true);
        zzawVar2222.zzb(6, (z8 || zzx2) ? false : true);
        zzawVar2222.zzb(7, zzg2222 && (z8 || !z10 || z7) && !zzx2);
        zzawVar2222.zzb(8, (z9 || zzx2) ? false : true);
        zzawVar2222.zzb(9, zzg2222 && (z9 || (z10 && z13)) && !zzx2);
        zzawVar2222.zzb(10, z142222);
        zzawVar2222.zzb(11, (z7 || zzx2) ? false : true);
        if (z7) {
        }
        i12 = 12;
        z11 = false;
        zzawVar2222.zzb(i12, z11);
        zze = zzawVar2222.zze();
        this.zzL = zze;
        if (!zze.equals(zzaxVar)) {
        }
        this.zzn.zze();
        boolean z152222 = zzmdVar2.zzp;
        boolean z162222 = zzmdVar.zzp;
    }

    private static long zzam(zzmd zzmdVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzmdVar.zzb.zza, zzbdVar);
        long j = zzmdVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmd zzan(zzmd zzmdVar, zzbf zzbfVar, Pair pair) {
        boolean z;
        zzgrc.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmdVar.zza;
        long zzaj = zzaj(zzmdVar);
        zzmd zzd2 = zzmdVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzwk zzb = zzmd.zzb();
            long zzq = zzfj.zzq(this.zzac);
            zzmd zzh = zzd2.zzc(zzb, zzq, zzq, zzq, 0L, zzyn.zza, this.zzb, zzguf.zzi()).zzh(zzb);
            zzh.zzq = zzh.zzs;
            return zzh;
        }
        zzwk zzwkVar = zzd2.zzb;
        Object obj = zzwkVar.zza;
        String str = zzfj.zza;
        boolean equals = obj.equals(pair.first);
        zzwk zzwkVar2 = !equals ? new zzwk(pair.first, -1L) : zzwkVar;
        long longValue = ((Long) pair.second).longValue();
        long zzq2 = zzfj.zzq(zzaj);
        if (!zzbfVar2.zzg()) {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (equals && zzq2 - longValue == 1) {
                zzbd zzo = zzbfVar2.zzo(obj, zzbdVar);
                z = true;
                if (zzq2 == zzo.zzd) {
                    zzq2--;
                }
                if (equals || longValue < zzq2) {
                    zzgrc.zzi(zzwkVar2.zzb() ^ z);
                    zzwk zzwkVar3 = zzwkVar2;
                    zzmd zzh2 = zzd2.zzc(zzwkVar3, longValue, longValue, longValue, 0L, equals ? zzyn.zza : zzd2.zzh, equals ? this.zzb : zzd2.zzi, equals ? zzguf.zzi() : zzd2.zzj).zzh(zzwkVar3);
                    zzh2.zzq = longValue;
                    return zzh2;
                }
                if (longValue != zzq2) {
                    zzgrc.zzi(zzwkVar2.zzb() ^ z);
                    long max = Math.max(0L, zzd2.zzr - (longValue - zzq2));
                    long j = zzd2.zzq;
                    if (zzd2.zzk.equals(zzwkVar)) {
                        j = longValue + max;
                    }
                    zzmd zzc = zzd2.zzc(zzwkVar2, longValue, longValue, longValue, max, zzd2.zzh, zzd2.zzi, zzd2.zzj);
                    zzc.zzq = j;
                    return zzc;
                }
                int zze = zzbfVar.zze(zzd2.zzk.zza);
                if (zze != -1) {
                    zzbd zzbdVar2 = this.zzp;
                    if (zzbfVar.zzd(zze, zzbdVar2, false).zzc == zzbfVar.zzo(zzwkVar2.zza, zzbdVar2).zzc) {
                        return zzd2;
                    }
                }
                Object obj2 = zzwkVar2.zza;
                zzbd zzbdVar3 = this.zzp;
                zzbfVar.zzo(obj2, zzbdVar3);
                long zzh3 = zzwkVar2.zzb() ? zzbdVar3.zzh(zzwkVar2.zzb, zzwkVar2.zzc) : zzbdVar3.zzd;
                zzwk zzwkVar4 = zzwkVar2;
                zzmd zzh4 = zzd2.zzc(zzwkVar4, zzd2.zzs, zzd2.zzs, zzd2.zzd, zzh3 - zzd2.zzs, zzd2.zzh, zzd2.zzi, zzd2.zzj).zzh(zzwkVar4);
                zzh4.zzq = zzh3;
                return zzh4;
            }
        }
        z = true;
        if (equals) {
        }
        zzgrc.zzi(zzwkVar2.zzb() ^ z);
        zzwk zzwkVar32 = zzwkVar2;
        zzmd zzh22 = zzd2.zzc(zzwkVar32, longValue, longValue, longValue, 0L, equals ? zzyn.zza : zzd2.zzh, equals ? this.zzb : zzd2.zzi, equals ? zzguf.zzi() : zzd2.zzj).zzh(zzwkVar32);
        zzh22.zzq = longValue;
        return zzh22;
    }

    private static zzmd zzao(zzmd zzmdVar, int i) {
        zzmd zze = zzmdVar.zze(i);
        return (i == 1 || i == 4) ? zze.zzg(false) : zze;
    }

    private final Pair zzap(zzbf zzbfVar, int i, long j) {
        if (zzbfVar.zzg()) {
            this.zzab = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzac = j;
            return null;
        }
        if (i == -1 || i >= zzbfVar.zza()) {
            i = zzbfVar.zzk(false);
            long j2 = zzbfVar.zzb(i, this.zza, 0L).zzl;
            j = zzfj.zzp(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i, zzfj.zzq(j));
    }

    private final long zzaq(zzbf zzbfVar, zzwk zzwkVar, long j) {
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        return j;
    }

    private final zzmh zzar(zzmg zzmgVar) {
        int zzai = zzai(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzai == -1) {
            zzai = 0;
        }
        zzdn zzdnVar = this.zzv;
        zzlf zzlfVar = this.zzm;
        return new zzmh(zzlfVar, zzmgVar, zzbfVar, zzai, zzdnVar, zzlfVar.zzn());
    }

    private final void zzas(Object obj) {
        Object obj2 = this.zzN;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zzl = this.zzm.zzl(obj, z ? this.zzA : -9223372036854775807L);
        if (z) {
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (zzl) {
            return;
        }
        zzP(zziw.zzc(new zzlg(3), PointerIconCompat.TYPE_HELP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i, final int i2) {
        if (i == this.zzQ.zza() && i2 == this.zzQ.zzb()) {
            return;
        }
        this.zzQ = new zzes(i, i2);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(24, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzks.zzd;
                ((zzaz) obj).zzu(i, i2);
            }
        });
        zzedVar.zze();
        zzaw(2, 14, new zzes(i, i2));
    }

    private final void zzau() {
        int zzh = zzh();
        if (zzh != 2 && zzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzav();
            boolean z = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzav() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfj.zza;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzU) {
                throw new IllegalStateException(format);
            }
            zzee.zzd("ExoPlayerImpl", format, this.zzV ? null : new IllegalStateException());
            this.zzV = true;
        }
    }

    private final void zzaw(int i, int i2, Object obj) {
        zzml[] zzmlVarArr = this.zzh;
        int length = zzmlVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzml zzmlVar = zzmlVarArr[i3];
            if (i == -1 || zzmlVar.zza() == i) {
                zzmh zzar = zzar(zzmlVar);
                zzar.zzb(i2);
                zzar.zzd(obj);
                zzar.zzg();
            }
        }
        zzml[] zzmlVarArr2 = this.zzi;
        int length2 = zzmlVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzml zzmlVar2 = zzmlVarArr2[i4];
            if (zzmlVar2 != null && (i == -1 || zzmlVar2.zza() == i)) {
                zzmh zzar2 = zzar(zzmlVar2);
                zzar2.zzb(i2);
                zzar2.zzd(obj);
                zzar2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzav();
        return zzaj(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        zzav();
        String str = zzfj.zza;
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzS == max) {
            return;
        }
        this.zzS = max;
        this.zzm.zzj(max);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(22, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i = zzks.zzd;
                ((zzaz) obj).zzr(max);
            }
        });
        zzedVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzav();
        zzas(surface);
        int i = surface == null ? 0 : -1;
        zzS(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzD(zzna zznaVar) {
        this.zzs.zzv(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzE(zzna zznaVar) {
        zzav();
        this.zzs.zzw(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final int zzF() {
        zzav();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzG(zzwm zzwmVar) {
        zzav();
        List singletonList = Collections.singletonList(zzwmVar);
        zzav();
        zzav();
        zzai(this.zzaa);
        zzu();
        this.zzF++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < singletonList.size(); i++) {
            zzlz zzlzVar = new zzlz((zzwm) singletonList.get(i), this.zzr);
            arrayList.add(zzlzVar);
            list.add(i, new zzko(zzlzVar.zzb, zzlzVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zzmj zzmjVar = new zzmj(list, this.zzad);
        if (!zzmjVar.zzg() && zzmjVar.zza() < 0) {
            throw new zzw(zzmjVar, -1, -9223372036854775807L);
        }
        int zzk = zzmjVar.zzk(false);
        zzmd zzan = zzan(this.zzaa, zzmjVar, zzap(zzmjVar, zzk, -9223372036854775807L));
        int i2 = zzan.zze;
        if (i2 == 1) {
            i2 = 1;
        } else {
            if (!zzmjVar.zzg()) {
                if (zzk != -1) {
                    if (zzk < zzmjVar.zza()) {
                        i2 = 2;
                    }
                }
            }
            i2 = 4;
        }
        zzmd zzao = zzao(zzan, i2);
        this.zzm.zzy(arrayList, zzk, zzfj.zzq(-9223372036854775807L), this.zzad);
        zzal(zzao, 0, (this.zzaa.zzb.zza.equals(zzao.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzak(zzao), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfj.zza;
        String zza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 40 + String.valueOf(str).length() + 3 + String.valueOf(zza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
        sb.append(str);
        sb.append("] [");
        sb.append(zza);
        sb.append("]");
        zzee.zzb("ExoPlayerImpl", sb.toString());
        zzav();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzkr zzkrVar = this.zzD;
        if (zzkrVar != null && Build.VERSION.SDK_INT >= 34) {
            zzkrVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzed zzedVar = this.zzn;
            zzedVar.zzd(10, zzkg.zza);
            zzedVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzm(null);
        zzaas zzaasVar = this.zzu;
        zzmx zzmxVar = this.zzs;
        zzaasVar.zzg(zzmxVar);
        boolean z = this.zzaa.zzp;
        zzmd zzao = zzao(this.zzaa, 1);
        this.zzaa = zzao;
        zzmd zzh = zzao.zzh(zzao.zzb);
        this.zzaa = zzh;
        zzh.zzq = zzh.zzs;
        this.zzaa.zzr = 0L;
        zzmxVar.zzy();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        int i = zzcz.zza;
        this.zzX = true;
    }

    public final zziw zzI() {
        zzav();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final zzlc zzlcVar) {
        this.zzk.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzks.this.zzO(zzlcVar);
            }
        });
    }

    final /* synthetic */ void zzL(int i, final int i2) {
        zzav();
        Integer valueOf = Integer.valueOf(i2);
        zzaw(1, 10, valueOf);
        zzaw(2, 10, valueOf);
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzks.zzd;
                ((zzaz) obj).zzq(i2);
            }
        };
        zzed zzedVar = this.zzn;
        zzedVar.zzd(21, zzdyVar);
        zzedVar.zze();
    }

    final /* synthetic */ void zzM() {
        String str = zzfj.zza;
        int generateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (generateAudioSessionId == -1) {
            generateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(generateAudioSessionId));
    }

    final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzL);
    }

    final /* synthetic */ void zzO(zzlc zzlcVar) {
        int i;
        long j;
        boolean z;
        int i2 = this.zzF - zzlcVar.zzb;
        this.zzF = i2;
        boolean z2 = true;
        if (zzlcVar.zzc) {
            this.zzG = zzlcVar.zzd;
            this.zzH = true;
        }
        if (i2 == 0) {
            zzbf zzbfVar = zzlcVar.zza.zza;
            int i3 = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List zzw = ((zzmj) zzbfVar).zzw();
                int size = zzw.size();
                List list = this.zzq;
                zzgrc.zzi(size == list.size());
                for (int i4 = 0; i4 < zzw.size(); i4++) {
                    ((zzko) list.get(i4)).zzc((zzbf) zzw.get(i4));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.zzH) {
                boolean z3 = zzlcVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean equals = zzlcVar.zza.zzb.equals(this.zzaa.zzb);
                long j3 = zzlcVar.zza.zzd;
                long j4 = this.zzaa.zzs;
                if (z3 || (equals && j3 == j4)) {
                    z2 = false;
                }
                if (z2) {
                    i3 = zzs();
                    if (zzbfVar.zzg() || zzlcVar.zza.zzb.zzb()) {
                        j2 = zzlcVar.zza.zzd;
                    } else {
                        zzmd zzmdVar = zzlcVar.zza;
                        zzwk zzwkVar = zzmdVar.zzb;
                        long j5 = zzmdVar.zzd;
                        zzaq(zzbfVar, zzwkVar, j5);
                        j2 = j5;
                    }
                }
                z = z2;
                long j6 = j2;
                i = i3;
                j = j6;
            } else {
                i = -1;
                j = -9223372036854775807L;
                z = false;
            }
            this.zzH = false;
            zzal(zzlcVar.zza, 1, z, this.zzG, j, i, false);
        }
    }

    final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzas(surface);
        this.zzO = surface;
    }

    final /* synthetic */ void zzR(Object obj) {
        zzas(null);
    }

    final /* synthetic */ void zzT(int i, int i2, Object obj) {
        zzaw(1, 19, obj);
    }

    final /* synthetic */ zzed zzV() {
        return this.zzn;
    }

    final /* synthetic */ zzmx zzW() {
        return this.zzs;
    }

    final /* synthetic */ Looper zzX() {
        return this.zzt;
    }

    final /* synthetic */ zzdn zzY() {
        return this.zzv;
    }

    final /* synthetic */ zzdm zzZ() {
        return this.zzB;
    }

    final /* synthetic */ Map zzaa() {
        return this.zzE;
    }

    final /* synthetic */ Object zzab() {
        return this.zzN;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzT;
    }

    final /* synthetic */ void zzad(boolean z) {
        this.zzT = z;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzX;
    }

    final /* synthetic */ zzil zzaf() {
        return this.zzY;
    }

    final /* synthetic */ void zzag(zzil zzilVar) {
        this.zzY = zzilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i, long j, int i2, boolean z) {
        zzav();
        if (i == -1) {
            return;
        }
        zzgrc.zza(i >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzF++;
            if (zzx()) {
                zzee.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlc zzlcVar = new zzlc(this.zzaa);
                zzlcVar.zza(1);
                this.zzl.zza(zzlcVar);
                return;
            }
            zzmd zzmdVar = this.zzaa;
            int i3 = zzmdVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzbfVar.zzg())) {
                zzmdVar = zzao(this.zzaa, 2);
            }
            int zzs = zzs();
            zzmd zzan = zzan(zzmdVar, zzbfVar, zzap(zzbfVar, i, j));
            this.zzm.zzf(zzbfVar, i, zzfj.zzq(j));
            zzal(zzan, 0, true, 1, zzak(zzan), zzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzav();
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzav();
        zzmd zzmdVar = this.zzaa;
        if (zzmdVar.zze != 1) {
            return;
        }
        zzmd zzf = zzmdVar.zzf(null);
        zzmd zzao = zzao(zzf, true != zzf.zza.zzg() ? 2 : 4);
        this.zzF++;
        this.zzm.zzd();
        zzal(zzao, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzav();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzav();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z) {
        zzav();
        zzmd zzmdVar = this.zzaa;
        int i = zzmdVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (zzmdVar.zzl == z && i == i2 && zzmdVar.zzm == 1) {
            return;
        }
        this.zzF++;
        boolean z2 = zzmdVar.zzp;
        zzmd zzi = zzmdVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzal(zzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzav();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzav();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzav();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzav();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzav();
        zzP(null);
        new zzcz(zzguf.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzav();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzav();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzav();
        if (!this.zzaa.zza.zzg()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zza.zze(zzmdVar.zzb.zza);
        }
        int i = this.zzab;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzav();
        int zzai = zzai(this.zzaa);
        if (zzai == -1) {
            return 0;
        }
        return zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzav();
        if (!zzx()) {
            zzbf zzq = zzq();
            if (zzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfj.zzp(zzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmd zzmdVar = this.zzaa;
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfj.zzp(zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzav();
        return zzfj.zzp(zzak(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzav();
        if (zzx()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zzk.equals(zzmdVar.zzb) ? zzfj.zzp(this.zzaa.zzq) : zzt();
        }
        zzav();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmd zzmdVar2 = this.zzaa;
        long j = 0;
        if (zzmdVar2.zzk.zzd != zzmdVar2.zzb.zzd) {
            return zzfj.zzp(zzmdVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j2 = zzmdVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmd zzmdVar3 = this.zzaa;
            zzmdVar3.zza.zzo(zzmdVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j = j2;
        }
        zzmd zzmdVar4 = this.zzaa;
        zzaq(zzmdVar4.zza, zzmdVar4.zzk, j);
        return zzfj.zzp(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzav();
        return zzfj.zzp(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzav();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzb(zzazVar);
    }
}
