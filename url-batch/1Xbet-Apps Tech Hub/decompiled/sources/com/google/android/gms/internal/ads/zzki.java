package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzki extends zzm implements zzjd {
    public static final /* synthetic */ int zzd = 0;
    private final zzmi zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzmd zzG;
    private zzcn zzH;
    private zzby zzI;
    private zzby zzJ;
    private zzam zzK;
    private zzam zzL;
    private AudioTrack zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzfk zzQ;
    private zzil zzR;
    private zzil zzS;
    private int zzT;
    private zzk zzU;
    private float zzV;
    private boolean zzW;
    private zzee zzX;
    private boolean zzY;
    private boolean zzZ;
    private zzz zzaa;
    private zzdu zzab;
    private zzby zzac;
    private zzls zzad;
    private int zzae;
    private long zzaf;
    private final zzje zzag;
    private zzwd zzah;
    final zzyf zzb;
    final zzcn zzc;
    private final zzei zze;
    private final Context zzf;
    private final zzcr zzg;
    private final zzlz[] zzh;
    private final zzye zzi;
    private final zzeq zzj;
    private final zzkt zzk;
    private final zzew zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcx zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzuj zzq;
    private final zzmj zzr;
    private final Looper zzs;
    private final zzym zzt;
    private final zzeg zzu;
    private final zzke zzv;
    private final zzkg zzw;
    private final zzif zzx;
    private final zzij zzy;
    private final zzmh zzz;

    static {
        zzbt.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzmj, com.google.android.gms.internal.ads.zzyl, java.lang.Object] */
    public zzki(zzjc zzjcVar, zzcr zzcrVar) {
        Object obj;
        zzei zzeiVar = new zzei(zzeg.zza);
        this.zze = zzeiVar;
        try {
            zzez.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.0-beta01] [" + zzfs.zze + "]");
            Context applicationContext = zzjcVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzjcVar.zzh.apply(zzjcVar.zzb);
            this.zzr = apply;
            this.zzU = zzjcVar.zzj;
            this.zzP = zzjcVar.zzk;
            this.zzW = false;
            this.zzB = zzjcVar.zzo;
            zzke zzkeVar = new zzke(this, null);
            this.zzv = zzkeVar;
            zzkg zzkgVar = new zzkg(null);
            this.zzw = zzkgVar;
            Handler handler = new Handler(zzjcVar.zzi);
            zzlz[] zza = ((zziv) zzjcVar.zzc).zza.zza(handler, zzkeVar, zzkeVar, zzkeVar, zzkeVar);
            this.zzh = zza;
            int length = zza.length;
            zzye zzyeVar = (zzye) zzjcVar.zze.zza();
            this.zzi = zzyeVar;
            this.zzq = zzjc.zza(((zziw) zzjcVar.zzd).zza);
            zzyq zzg = zzyq.zzg(((zziz) zzjcVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzjcVar.zzl;
            this.zzG = zzjcVar.zzm;
            Looper looper = zzjcVar.zzi;
            this.zzs = looper;
            zzeg zzegVar = zzjcVar.zzb;
            this.zzu = zzegVar;
            this.zzg = zzcrVar;
            zzew zzewVar = new zzew(looper, zzegVar, new zzeu() { // from class: com.google.android.gms.internal.ads.zzjy
                @Override // com.google.android.gms.internal.ads.zzeu
                public final void zza(Object obj2, zzah zzahVar) {
                }
            });
            this.zzl = zzewVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzah = new zzwd(0);
            int length2 = zza.length;
            zzyf zzyfVar = new zzyf(new zzmc[2], new zzxy[2], zzdn.zza, null);
            this.zzb = zzyfVar;
            this.zzn = new zzcx();
            zzcl zzclVar = new zzcl();
            zzclVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzyeVar.zzm();
            zzclVar.zzd(29, true);
            zzclVar.zzd(23, false);
            zzclVar.zzd(25, false);
            zzclVar.zzd(33, false);
            zzclVar.zzd(26, false);
            zzclVar.zzd(34, false);
            zzcn zze = zzclVar.zze();
            this.zzc = zze;
            zzcl zzclVar2 = new zzcl();
            zzclVar2.zzb(zze);
            zzclVar2.zza(4);
            zzclVar2.zza(10);
            this.zzH = zzclVar2.zze();
            this.zzj = zzegVar.zzb(looper, null);
            zzje zzjeVar = new zzje(this);
            this.zzag = zzjeVar;
            this.zzad = zzls.zzg(zzyfVar);
            apply.zzR(zzcrVar, looper);
            this.zzk = new zzkt(zza, zzyeVar, zzyfVar, (zzkw) zzjcVar.zzf.zza(), zzg, 0, false, apply, this.zzG, zzjcVar.zzr, zzjcVar.zzn, false, looper, zzegVar, zzjeVar, zzfs.zza < 31 ? new zzov() : zzjz.zza(applicationContext, this, zzjcVar.zzp), null);
            this.zzV = 1.0f;
            this.zzI = zzby.zza;
            zzby zzbyVar = zzby.zza;
            this.zzJ = zzbyVar;
            this.zzac = zzbyVar;
            this.zzae = -1;
            if (zzfs.zza >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.zzT = audioManager == null ? -1 : audioManager.generateAudioSessionId();
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzM;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzM.release();
                    obj = null;
                    this.zzM = null;
                }
                if (this.zzM == null) {
                    this.zzM = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzT = this.zzM.getAudioSessionId();
            }
            this.zzX = zzee.zza;
            this.zzY = true;
            apply.getClass();
            zzewVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzkeVar);
            this.zzx = new zzif(zzjcVar.zza, handler, zzkeVar);
            this.zzy = new zzij(zzjcVar.zza, handler, zzkeVar);
            zzfs.zzF(obj, obj);
            this.zzz = new zzmh(zzjcVar.zza);
            this.zzA = new zzmi(zzjcVar.zza);
            this.zzaa = new zzx(0).zza();
            this.zzab = zzdu.zza;
            this.zzQ = zzfk.zza;
            zzyeVar.zzj(this.zzU);
            zzag(1, 10, Integer.valueOf(this.zzT));
            zzag(2, 10, Integer.valueOf(this.zzT));
            zzag(1, 3, this.zzU);
            zzag(2, 4, Integer.valueOf(this.zzP));
            zzag(2, 5, 0);
            zzag(1, 9, Boolean.valueOf(this.zzW));
            zzag(2, 7, zzkgVar);
            zzag(6, 8, zzkgVar);
            zzeiVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzP(zzki zzkiVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkiVar.zzai(surface);
        zzkiVar.zzO = surface;
    }

    private final int zzW(zzls zzlsVar) {
        return zzlsVar.zza.zzo() ? this.zzae : zzlsVar.zza.zzn(zzlsVar.zzb.zza, this.zzn).zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzX(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzY(zzls zzlsVar) {
        if (!zzlsVar.zzb.zzb()) {
            return zzfs.zzt(zzZ(zzlsVar));
        }
        zzlsVar.zza.zzn(zzlsVar.zzb.zza, this.zzn);
        if (zzlsVar.zzc == -9223372036854775807L) {
            long j = zzlsVar.zza.zze(zzW(zzlsVar), this.zza, 0L).zzn;
            return zzfs.zzt(0L);
        }
        int i = zzfs.zza;
        return zzfs.zzt(0L) + zzfs.zzt(zzlsVar.zzc);
    }

    private final long zzZ(zzls zzlsVar) {
        if (zzlsVar.zza.zzo()) {
            return zzfs.zzq(this.zzaf);
        }
        boolean z = zzlsVar.zzo;
        long j = zzlsVar.zzr;
        if (zzlsVar.zzb.zzb()) {
            return j;
        }
        zzab(zzlsVar.zza, zzlsVar.zzb, j);
        return j;
    }

    private static long zzaa(zzls zzlsVar) {
        zzcz zzczVar = new zzcz();
        zzcx zzcxVar = new zzcx();
        zzlsVar.zza.zzn(zzlsVar.zzb.zza, zzcxVar);
        long j = zzlsVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzlsVar.zza.zze(zzcxVar.zzd, zzczVar, 0L).zzn;
        return 0L;
    }

    private final long zzab(zzda zzdaVar, zzuk zzukVar, long j) {
        zzdaVar.zzn(zzukVar.zza, this.zzn);
        return j;
    }

    private final Pair zzac(zzda zzdaVar, int i, long j) {
        if (zzdaVar.zzo()) {
            this.zzae = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzaf = j;
            return null;
        }
        if (i == -1 || i >= zzdaVar.zzc()) {
            i = zzdaVar.zzg(false);
            long j2 = zzdaVar.zze(i, this.zza, 0L).zzn;
            j = zzfs.zzt(0L);
        }
        return zzdaVar.zzl(this.zza, this.zzn, i, zzfs.zzq(j));
    }

    private final zzls zzad(zzls zzlsVar, zzda zzdaVar, Pair pair) {
        zzef.zzd(zzdaVar.zzo() || pair != null);
        zzda zzdaVar2 = zzlsVar.zza;
        long zzY = zzY(zzlsVar);
        zzls zzf = zzlsVar.zzf(zzdaVar);
        if (zzdaVar.zzo()) {
            zzuk zzh = zzls.zzh();
            long zzq = zzfs.zzq(this.zzaf);
            zzls zza = zzf.zzb(zzh, zzq, zzq, zzq, 0L, zzwl.zza, this.zzb, zzfwu.zzl()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i = zzfs.zza;
        boolean z = !obj.equals(pair.first);
        zzuk zzukVar = z ? new zzuk(pair.first, -1L) : zzf.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzq2 = zzfs.zzq(zzY);
        if (!zzdaVar2.zzo()) {
            zzdaVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzq2) {
            zzef.zzf(!zzukVar.zzb());
            zzls zza2 = zzf.zzb(zzukVar, longValue, longValue, longValue, 0L, z ? zzwl.zza : zzf.zzh, z ? this.zzb : zzf.zzi, z ? zzfwu.zzl() : zzf.zzj).zza(zzukVar);
            zza2.zzp = longValue;
            return zza2;
        }
        if (longValue != zzq2) {
            zzef.zzf(!zzukVar.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzq2));
            long j = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j = longValue + max;
            }
            zzls zzb = zzf.zzb(zzukVar, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j;
            return zzb;
        }
        int zza3 = zzdaVar.zza(zzf.zzk.zza);
        if (zza3 != -1 && zzdaVar.zzd(zza3, this.zzn, false).zzd == zzdaVar.zzn(zzukVar.zza, this.zzn).zzd) {
            return zzf;
        }
        zzdaVar.zzn(zzukVar.zza, this.zzn);
        long zzh2 = zzukVar.zzb() ? this.zzn.zzh(zzukVar.zzb, zzukVar.zzc) : this.zzn.zze;
        zzls zza4 = zzf.zzb(zzukVar, zzf.zzr, zzf.zzr, zzf.zzd, zzh2 - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzukVar);
        zza4.zzp = zzh2;
        return zza4;
    }

    private final zzlv zzae(zzlu zzluVar) {
        int zzW = zzW(this.zzad);
        zzda zzdaVar = this.zzad.zza;
        if (zzW == -1) {
            zzW = 0;
        }
        zzeg zzegVar = this.zzu;
        zzkt zzktVar = this.zzk;
        return new zzlv(zzktVar, zzluVar, zzdaVar, zzW, zzegVar, zzktVar.zzb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(final int i, final int i2) {
        if (i == this.zzQ.zzb() && i2 == this.zzQ.zza()) {
            return;
        }
        this.zzQ = new zzfk(i, i2);
        zzew zzewVar = this.zzl;
        zzewVar.zzd(24, new zzet() { // from class: com.google.android.gms.internal.ads.zzjv
            @Override // com.google.android.gms.internal.ads.zzet
            public final void zza(Object obj) {
                int i3 = zzki.zzd;
                ((zzco) obj).zzo(i, i2);
            }
        });
        zzewVar.zzc();
        zzag(2, 14, new zzfk(i, i2));
    }

    private final void zzag(int i, int i2, Object obj) {
        zzlz[] zzlzVarArr = this.zzh;
        int length = zzlzVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzlz zzlzVar = zzlzVarArr[i3];
            if (zzlzVar.zzb() == i) {
                zzlv zzae = zzae(zzlzVar);
                zzae.zzf(i2);
                zzae.zze(obj);
                zzae.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzah() {
        zzag(1, 2, Float.valueOf(this.zzV * this.zzy.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzlz[] zzlzVarArr = this.zzh;
        int length = zzlzVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzlz zzlzVar = zzlzVarArr[i];
            if (zzlzVar.zzb() == 2) {
                zzlv zzae = zzae(zzlzVar);
                zzae.zzf(1);
                zzae.zze(obj);
                zzae.zzd();
                arrayList.add(zzae);
            }
        }
        Object obj2 = this.zzN;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzlv) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (z) {
            zzaj(zzit.zzd(new zzku(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzaj(zzit zzitVar) {
        zzls zzlsVar = this.zzad;
        zzls zza = zzlsVar.zza(zzlsVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzls zze = zza.zze(1);
        if (zzitVar != null) {
            zze = zze.zzd(zzitVar);
        }
        this.zzC++;
        this.zzk.zzn();
        zzal(zze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzak(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzls zzlsVar = this.zzad;
        if (zzlsVar.zzl == z2 && zzlsVar.zzm == i3) {
            return;
        }
        this.zzC++;
        boolean z3 = zzlsVar.zzo;
        zzls zzc = zzlsVar.zzc(z2, i3);
        this.zzk.zzm(z2, i3);
        zzal(zzc, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzal(final zzls zzlsVar, final int i, final int i2, boolean z, int i3, long j, int i4, boolean z2) {
        int i5;
        boolean z3;
        boolean z4;
        Pair pair;
        boolean z5;
        int i6;
        boolean booleanValue;
        final zzbs zzbsVar;
        zzda zzn;
        zzby zzu;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        zzyf zzyfVar;
        zzyf zzyfVar2;
        zzcn zzcnVar;
        zzm zzmVar;
        boolean z11;
        zzda zzn2;
        ?? r10;
        int i7;
        boolean z12;
        zzda zzn3;
        boolean z13;
        zzda zzn4;
        boolean z14;
        long j2;
        boolean z15;
        int i8;
        boolean z16;
        zzcn zze;
        int i9;
        Object obj;
        zzbs zzbsVar2;
        Object obj2;
        int i10;
        long j3;
        long zzaa;
        Object obj3;
        zzbs zzbsVar3;
        Object obj4;
        int i11;
        final int i12 = i3;
        zzls zzlsVar2 = this.zzad;
        this.zzad = zzlsVar;
        boolean z17 = !zzlsVar2.zza.equals(zzlsVar.zza);
        zzda zzdaVar = zzlsVar2.zza;
        zzda zzdaVar2 = zzlsVar.zza;
        if (zzdaVar2.zzo() && zzdaVar.zzo()) {
            pair = new Pair(false, -1);
        } else {
            if (zzdaVar2.zzo() == zzdaVar.zzo()) {
                if (zzdaVar.zze(zzdaVar.zzn(zzlsVar2.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzdaVar2.zze(zzdaVar2.zzn(zzlsVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
                    if (!z) {
                        i5 = i12;
                        z3 = false;
                    } else if (i12 != 0) {
                        i5 = i12;
                        z3 = true;
                    } else if (zzlsVar2.zzb.zzd < zzlsVar.zzb.zzd) {
                        pair = new Pair(true, 0);
                        z4 = true;
                        i12 = 0;
                    } else {
                        z3 = true;
                        i5 = 0;
                    }
                    z4 = z3;
                    i12 = i5;
                    pair = new Pair(false, -1);
                } else {
                    if (!z) {
                        z4 = false;
                        z5 = false;
                    } else if (i12 == 0) {
                        z4 = true;
                        i6 = 1;
                        i12 = 0;
                        pair = new Pair(true, Integer.valueOf(i6));
                    } else {
                        z4 = true;
                        z5 = true;
                    }
                    if (z4 && i12 == 1) {
                        z4 = z5;
                        i6 = 2;
                    } else {
                        if (!z17) {
                            throw new IllegalStateException();
                        }
                        i6 = 3;
                    }
                    pair = new Pair(true, Integer.valueOf(i6));
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzbsVar = null;
                } else {
                    zzbsVar = !zzlsVar.zza.zzo() ? zzlsVar.zza.zze(zzlsVar.zza.zzn(zzlsVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zze : null;
                    this.zzac = zzby.zza;
                }
                if (!zzlsVar2.zzj.equals(zzlsVar.zzj)) {
                    zzbw zza = this.zzac.zza();
                    List list = zzlsVar.zzj;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        zzcb zzcbVar = (zzcb) list.get(i13);
                        for (int i14 = 0; i14 < zzcbVar.zza(); i14++) {
                            zzcbVar.zzb(i14).zza(zza);
                        }
                    }
                    this.zzac = zza.zzu();
                }
                zzn = zzn();
                if (zzn.zzo()) {
                    zzbs zzbsVar4 = zzn.zze(zzd(), this.zza, 0L).zze;
                    zzbw zza2 = this.zzac.zza();
                    zza2.zzb(zzbsVar4.zzg);
                    zzu = zza2.zzu();
                } else {
                    zzu = this.zzac;
                }
                z6 = !zzu.equals(this.zzI);
                this.zzI = zzu;
                z7 = zzlsVar2.zzl == zzlsVar.zzl;
                z8 = zzlsVar2.zze == zzlsVar.zze;
                if (!z8 || z7) {
                    zzam();
                }
                boolean z18 = zzlsVar2.zzg == zzlsVar.zzg;
                if (z17) {
                    this.zzl.zzd(0, new zzet() { // from class: com.google.android.gms.internal.ads.zzjg
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj5) {
                            int i15 = zzki.zzd;
                            ((zzco) obj5).zzp(zzls.this.zza, i);
                        }
                    });
                }
                if (z4) {
                    z9 = z8;
                    z10 = z18;
                } else {
                    zzcx zzcxVar = new zzcx();
                    if (zzlsVar2.zza.zzo()) {
                        z9 = z8;
                        z10 = z18;
                        i9 = i4;
                        obj = null;
                        zzbsVar2 = null;
                        obj2 = null;
                        i10 = -1;
                    } else {
                        Object obj5 = zzlsVar2.zzb.zza;
                        zzlsVar2.zza.zzn(obj5, zzcxVar);
                        int i15 = zzcxVar.zzd;
                        int zza3 = zzlsVar2.zza.zza(obj5);
                        z9 = z8;
                        z10 = z18;
                        obj2 = obj5;
                        obj = zzlsVar2.zza.zze(i15, this.zza, 0L).zzc;
                        zzbsVar2 = this.zza.zze;
                        i9 = i15;
                        i10 = zza3;
                    }
                    if (i12 == 0) {
                        if (zzlsVar2.zzb.zzb()) {
                            zzuk zzukVar = zzlsVar2.zzb;
                            j3 = zzcxVar.zzh(zzukVar.zzb, zzukVar.zzc);
                            zzaa = zzaa(zzlsVar2);
                            int i16 = zzfs.zza;
                            zzuk zzukVar2 = zzlsVar2.zzb;
                            final zzcq zzcqVar = new zzcq(obj, i9, zzbsVar2, obj2, i10, zzfs.zzt(j3), zzfs.zzt(zzaa), zzukVar2.zzb, zzukVar2.zzc);
                            int zzd2 = zzd();
                            if (this.zzad.zza.zzo()) {
                                zzls zzlsVar3 = this.zzad;
                                Object obj6 = zzlsVar3.zzb.zza;
                                zzlsVar3.zza.zzn(obj6, this.zzn);
                                i11 = this.zzad.zza.zza(obj6);
                                obj3 = this.zzad.zza.zze(zzd2, this.zza, 0L).zzc;
                                zzbsVar3 = this.zza.zze;
                                obj4 = obj6;
                            } else {
                                obj3 = null;
                                zzbsVar3 = null;
                                obj4 = null;
                                i11 = -1;
                            }
                            long zzt = zzfs.zzt(j);
                            long zzt2 = !this.zzad.zzb.zzb() ? zzfs.zzt(zzaa(this.zzad)) : zzt;
                            zzuk zzukVar3 = this.zzad.zzb;
                            final zzcq zzcqVar2 = new zzcq(obj3, zzd2, zzbsVar3, obj4, i11, zzt, zzt2, zzukVar3.zzb, zzukVar3.zzc);
                            this.zzl.zzd(11, new zzet() { // from class: com.google.android.gms.internal.ads.zzjl
                                @Override // com.google.android.gms.internal.ads.zzet
                                public final void zza(Object obj7) {
                                    int i17 = zzki.zzd;
                                    ((zzco) obj7).zzm(zzcqVar, zzcqVar2, i12);
                                }
                            });
                        } else {
                            j3 = zzlsVar2.zzb.zze != -1 ? zzaa(this.zzad) : zzcxVar.zze;
                            zzaa = j3;
                            int i162 = zzfs.zza;
                            zzuk zzukVar22 = zzlsVar2.zzb;
                            final zzcq zzcqVar3 = new zzcq(obj, i9, zzbsVar2, obj2, i10, zzfs.zzt(j3), zzfs.zzt(zzaa), zzukVar22.zzb, zzukVar22.zzc);
                            int zzd22 = zzd();
                            if (this.zzad.zza.zzo()) {
                            }
                            long zzt3 = zzfs.zzt(j);
                            if (!this.zzad.zzb.zzb()) {
                            }
                            zzuk zzukVar32 = this.zzad.zzb;
                            final zzcq zzcqVar22 = new zzcq(obj3, zzd22, zzbsVar3, obj4, i11, zzt3, zzt2, zzukVar32.zzb, zzukVar32.zzc);
                            this.zzl.zzd(11, new zzet() { // from class: com.google.android.gms.internal.ads.zzjl
                                @Override // com.google.android.gms.internal.ads.zzet
                                public final void zza(Object obj7) {
                                    int i17 = zzki.zzd;
                                    ((zzco) obj7).zzm(zzcqVar3, zzcqVar22, i12);
                                }
                            });
                        }
                    } else if (zzlsVar2.zzb.zzb()) {
                        j3 = zzlsVar2.zzr;
                        zzaa = zzaa(zzlsVar2);
                        int i1622 = zzfs.zza;
                        zzuk zzukVar222 = zzlsVar2.zzb;
                        final zzcq zzcqVar32 = new zzcq(obj, i9, zzbsVar2, obj2, i10, zzfs.zzt(j3), zzfs.zzt(zzaa), zzukVar222.zzb, zzukVar222.zzc);
                        int zzd222 = zzd();
                        if (this.zzad.zza.zzo()) {
                        }
                        long zzt32 = zzfs.zzt(j);
                        if (!this.zzad.zzb.zzb()) {
                        }
                        zzuk zzukVar322 = this.zzad.zzb;
                        final zzcq zzcqVar222 = new zzcq(obj3, zzd222, zzbsVar3, obj4, i11, zzt32, zzt2, zzukVar322.zzb, zzukVar322.zzc);
                        this.zzl.zzd(11, new zzet() { // from class: com.google.android.gms.internal.ads.zzjl
                            @Override // com.google.android.gms.internal.ads.zzet
                            public final void zza(Object obj7) {
                                int i17 = zzki.zzd;
                                ((zzco) obj7).zzm(zzcqVar32, zzcqVar222, i12);
                            }
                        });
                    } else {
                        j3 = zzlsVar2.zzr;
                        zzaa = j3;
                        int i16222 = zzfs.zza;
                        zzuk zzukVar2222 = zzlsVar2.zzb;
                        final zzcq zzcqVar322 = new zzcq(obj, i9, zzbsVar2, obj2, i10, zzfs.zzt(j3), zzfs.zzt(zzaa), zzukVar2222.zzb, zzukVar2222.zzc);
                        int zzd2222 = zzd();
                        if (this.zzad.zza.zzo()) {
                        }
                        long zzt322 = zzfs.zzt(j);
                        if (!this.zzad.zzb.zzb()) {
                        }
                        zzuk zzukVar3222 = this.zzad.zzb;
                        final zzcq zzcqVar2222 = new zzcq(obj3, zzd2222, zzbsVar3, obj4, i11, zzt322, zzt2, zzukVar3222.zzb, zzukVar3222.zzc);
                        this.zzl.zzd(11, new zzet() { // from class: com.google.android.gms.internal.ads.zzjl
                            @Override // com.google.android.gms.internal.ads.zzet
                            public final void zza(Object obj7) {
                                int i17 = zzki.zzd;
                                ((zzco) obj7).zzm(zzcqVar322, zzcqVar2222, i12);
                            }
                        });
                    }
                }
                if (!booleanValue) {
                    this.zzl.zzd(1, new zzet() { // from class: com.google.android.gms.internal.ads.zzjn
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzd(zzbs.this, intValue);
                        }
                    });
                }
                if (zzlsVar2.zzf != zzlsVar.zzf) {
                    this.zzl.zzd(10, new zzet() { // from class: com.google.android.gms.internal.ads.zzjo
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzk(zzls.this.zzf);
                        }
                    });
                    if (zzlsVar.zzf != null) {
                        this.zzl.zzd(10, new zzet() { // from class: com.google.android.gms.internal.ads.zzjp
                            @Override // com.google.android.gms.internal.ads.zzet
                            public final void zza(Object obj7) {
                                int i17 = zzki.zzd;
                                ((zzco) obj7).zzj(zzls.this.zzf);
                            }
                        });
                    }
                }
                zzyfVar = zzlsVar2.zzi;
                zzyfVar2 = zzlsVar.zzi;
                if (zzyfVar != zzyfVar2) {
                    this.zzi.zzp(zzyfVar2.zze);
                    this.zzl.zzd(2, new zzet() { // from class: com.google.android.gms.internal.ads.zzjq
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzq(zzls.this.zzi.zzd);
                        }
                    });
                }
                if (z6) {
                    final zzby zzbyVar = this.zzI;
                    this.zzl.zzd(14, new zzet() { // from class: com.google.android.gms.internal.ads.zzjr
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zze(zzby.this);
                        }
                    });
                }
                if (z10) {
                    this.zzl.zzd(3, new zzet() { // from class: com.google.android.gms.internal.ads.zzjs
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzb(zzls.this.zzg);
                        }
                    });
                }
                if (!z9 || z7) {
                    this.zzl.zzd(-1, new zzet() { // from class: com.google.android.gms.internal.ads.zzjt
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            zzls zzlsVar4 = zzls.this;
                            ((zzco) obj7).zzl(zzlsVar4.zzl, zzlsVar4.zze);
                        }
                    });
                }
                if (z9) {
                    this.zzl.zzd(4, new zzet() { // from class: com.google.android.gms.internal.ads.zzju
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzh(zzls.this.zze);
                        }
                    });
                }
                if (z7) {
                    this.zzl.zzd(5, new zzet() { // from class: com.google.android.gms.internal.ads.zzjh
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzf(zzls.this.zzl, i2);
                        }
                    });
                }
                if (zzlsVar2.zzm != zzlsVar.zzm) {
                    this.zzl.zzd(6, new zzet() { // from class: com.google.android.gms.internal.ads.zzji
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzi(zzls.this.zzm);
                        }
                    });
                }
                if (zzlsVar2.zzi() != zzlsVar.zzi()) {
                    this.zzl.zzd(7, new zzet() { // from class: com.google.android.gms.internal.ads.zzjj
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzc(zzls.this.zzi());
                        }
                    });
                }
                if (!zzlsVar2.zzn.equals(zzlsVar.zzn)) {
                    this.zzl.zzd(12, new zzet() { // from class: com.google.android.gms.internal.ads.zzjk
                        @Override // com.google.android.gms.internal.ads.zzet
                        public final void zza(Object obj7) {
                            int i17 = zzki.zzd;
                            ((zzco) obj7).zzg(zzls.this.zzn);
                        }
                    });
                }
                zzcnVar = this.zzH;
                zzcr zzcrVar = this.zzg;
                zzcn zzcnVar2 = this.zzc;
                int i17 = zzfs.zza;
                boolean zzx = zzcrVar.zzx();
                zzmVar = (zzm) zzcrVar;
                zzda zzn5 = zzmVar.zzn();
                z11 = zzn5.zzo() && zzn5.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzi;
                zzn2 = zzmVar.zzn();
                if (zzn2.zzo()) {
                    int zzd3 = zzmVar.zzd();
                    zzmVar.zzh();
                    zzmVar.zzw();
                    r10 = 0;
                    r10 = 0;
                    int zzk = zzn2.zzk(zzd3, 0, false);
                    i7 = -1;
                    z12 = zzk != -1;
                } else {
                    i7 = -1;
                    r10 = 0;
                    z12 = false;
                }
                zzn3 = zzmVar.zzn();
                if (!zzn3.zzo()) {
                    int zzd4 = zzmVar.zzd();
                    zzmVar.zzh();
                    zzmVar.zzw();
                    if (zzn3.zzj(zzd4, r10, r10) != i7) {
                        z13 = true;
                        zzn4 = zzmVar.zzn();
                        if (zzn4.zzo()) {
                            z14 = z13;
                            j2 = 0;
                        } else {
                            z14 = z13;
                            j2 = 0;
                            if (zzn4.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzb()) {
                                z15 = true;
                                zzda zzn6 = zzmVar.zzn();
                                boolean z19 = zzn6.zzo() && zzn6.zze(zzmVar.zzd(), zzmVar.zza, j2).zzj;
                                boolean zzo = zzcrVar.zzn().zzo();
                                zzcl zzclVar = new zzcl();
                                zzclVar.zzb(zzcnVar2);
                                boolean z20 = !zzx;
                                zzclVar.zzd(4, z20);
                                zzclVar.zzd(5, (z11 || zzx) ? false : true);
                                zzclVar.zzd(6, (z12 || zzx) ? false : true);
                                zzclVar.zzd(7, zzo && (z12 || !z15 || z11) && !zzx);
                                zzclVar.zzd(8, (z14 || zzx) ? false : true);
                                zzclVar.zzd(9, zzo && (z14 || (z15 && z19)) && !zzx);
                                zzclVar.zzd(10, z20);
                                if (z11 || zzx) {
                                    i8 = 11;
                                    z16 = false;
                                } else {
                                    i8 = 11;
                                    z16 = true;
                                }
                                zzclVar.zzd(i8, z16);
                                zzclVar.zzd(12, (z11 || zzx) ? false : true);
                                zze = zzclVar.zze();
                                this.zzH = zze;
                                if (!zze.equals(zzcnVar)) {
                                    this.zzl.zzd(13, new zzet() { // from class: com.google.android.gms.internal.ads.zzjf
                                        @Override // com.google.android.gms.internal.ads.zzet
                                        public final void zza(Object obj7) {
                                            zzki.this.zzU((zzco) obj7);
                                        }
                                    });
                                }
                                this.zzl.zzc();
                                boolean z21 = zzlsVar2.zzo;
                                boolean z22 = zzlsVar.zzo;
                            }
                        }
                        z15 = false;
                        zzda zzn62 = zzmVar.zzn();
                        if (zzn62.zzo()) {
                        }
                        boolean zzo2 = zzcrVar.zzn().zzo();
                        zzcl zzclVar2 = new zzcl();
                        zzclVar2.zzb(zzcnVar2);
                        boolean z202 = !zzx;
                        zzclVar2.zzd(4, z202);
                        zzclVar2.zzd(5, (z11 || zzx) ? false : true);
                        zzclVar2.zzd(6, (z12 || zzx) ? false : true);
                        zzclVar2.zzd(7, zzo2 && (z12 || !z15 || z11) && !zzx);
                        zzclVar2.zzd(8, (z14 || zzx) ? false : true);
                        zzclVar2.zzd(9, zzo2 && (z14 || (z15 && z19)) && !zzx);
                        zzclVar2.zzd(10, z202);
                        if (z11) {
                        }
                        i8 = 11;
                        z16 = false;
                        zzclVar2.zzd(i8, z16);
                        zzclVar2.zzd(12, (z11 || zzx) ? false : true);
                        zze = zzclVar2.zze();
                        this.zzH = zze;
                        if (!zze.equals(zzcnVar)) {
                        }
                        this.zzl.zzc();
                        boolean z212 = zzlsVar2.zzo;
                        boolean z222 = zzlsVar.zzo;
                    }
                }
                z13 = r10;
                zzn4 = zzmVar.zzn();
                if (zzn4.zzo()) {
                }
                z15 = false;
                zzda zzn622 = zzmVar.zzn();
                if (zzn622.zzo()) {
                }
                boolean zzo22 = zzcrVar.zzn().zzo();
                zzcl zzclVar22 = new zzcl();
                zzclVar22.zzb(zzcnVar2);
                boolean z2022 = !zzx;
                zzclVar22.zzd(4, z2022);
                zzclVar22.zzd(5, (z11 || zzx) ? false : true);
                zzclVar22.zzd(6, (z12 || zzx) ? false : true);
                zzclVar22.zzd(7, zzo22 && (z12 || !z15 || z11) && !zzx);
                zzclVar22.zzd(8, (z14 || zzx) ? false : true);
                zzclVar22.zzd(9, zzo22 && (z14 || (z15 && z19)) && !zzx);
                zzclVar22.zzd(10, z2022);
                if (z11) {
                }
                i8 = 11;
                z16 = false;
                zzclVar22.zzd(i8, z16);
                zzclVar22.zzd(12, (z11 || zzx) ? false : true);
                zze = zzclVar22.zze();
                this.zzH = zze;
                if (!zze.equals(zzcnVar)) {
                }
                this.zzl.zzc();
                boolean z2122 = zzlsVar2.zzo;
                boolean z2222 = zzlsVar.zzo;
            }
            pair = new Pair(true, 3);
        }
        z4 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!zzlsVar2.zzj.equals(zzlsVar.zzj)) {
        }
        zzn = zzn();
        if (zzn.zzo()) {
        }
        z6 = !zzu.equals(this.zzI);
        this.zzI = zzu;
        if (zzlsVar2.zzl == zzlsVar.zzl) {
        }
        if (zzlsVar2.zze == zzlsVar.zze) {
        }
        if (!z8) {
        }
        zzam();
        if (zzlsVar2.zzg == zzlsVar.zzg) {
        }
        if (z17) {
        }
        if (z4) {
        }
        if (!booleanValue) {
        }
        if (zzlsVar2.zzf != zzlsVar.zzf) {
        }
        zzyfVar = zzlsVar2.zzi;
        zzyfVar2 = zzlsVar.zzi;
        if (zzyfVar != zzyfVar2) {
        }
        if (z6) {
        }
        if (z10) {
        }
        if (!z9) {
        }
        this.zzl.zzd(-1, new zzet() { // from class: com.google.android.gms.internal.ads.zzjt
            @Override // com.google.android.gms.internal.ads.zzet
            public final void zza(Object obj7) {
                int i172 = zzki.zzd;
                zzls zzlsVar4 = zzls.this;
                ((zzco) obj7).zzl(zzlsVar4.zzl, zzlsVar4.zze);
            }
        });
        if (z9) {
        }
        if (z7) {
        }
        if (zzlsVar2.zzm != zzlsVar.zzm) {
        }
        if (zzlsVar2.zzi() != zzlsVar.zzi()) {
        }
        if (!zzlsVar2.zzn.equals(zzlsVar.zzn)) {
        }
        zzcnVar = this.zzH;
        zzcr zzcrVar2 = this.zzg;
        zzcn zzcnVar22 = this.zzc;
        int i172 = zzfs.zza;
        boolean zzx2 = zzcrVar2.zzx();
        zzmVar = (zzm) zzcrVar2;
        zzda zzn52 = zzmVar.zzn();
        if (zzn52.zzo()) {
        }
        zzn2 = zzmVar.zzn();
        if (zzn2.zzo()) {
        }
        zzn3 = zzmVar.zzn();
        if (!zzn3.zzo()) {
        }
        z13 = r10;
        zzn4 = zzmVar.zzn();
        if (zzn4.zzo()) {
        }
        z15 = false;
        zzda zzn6222 = zzmVar.zzn();
        if (zzn6222.zzo()) {
        }
        boolean zzo222 = zzcrVar2.zzn().zzo();
        zzcl zzclVar222 = new zzcl();
        zzclVar222.zzb(zzcnVar22);
        boolean z20222 = !zzx2;
        zzclVar222.zzd(4, z20222);
        zzclVar222.zzd(5, (z11 || zzx2) ? false : true);
        zzclVar222.zzd(6, (z12 || zzx2) ? false : true);
        zzclVar222.zzd(7, zzo222 && (z12 || !z15 || z11) && !zzx2);
        zzclVar222.zzd(8, (z14 || zzx2) ? false : true);
        zzclVar222.zzd(9, zzo222 && (z14 || (z15 && z19)) && !zzx2);
        zzclVar222.zzd(10, z20222);
        if (z11) {
        }
        i8 = 11;
        z16 = false;
        zzclVar222.zzd(i8, z16);
        zzclVar222.zzd(12, (z11 || zzx2) ? false : true);
        zze = zzclVar222.zze();
        this.zzH = zze;
        if (!zze.equals(zzcnVar)) {
        }
        this.zzl.zzc();
        boolean z21222 = zzlsVar2.zzo;
        boolean z22222 = zzlsVar.zzo;
    }

    private final void zzam() {
        int zzf = zzf();
        if (zzf == 2 || zzf == 3) {
            zzan();
            boolean z = this.zzad.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzan() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzY) {
                throw new IllegalStateException(format);
            }
            zzez.zzg("ExoPlayerImpl", format, this.zzZ ? null : new IllegalStateException());
            this.zzZ = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final void zzA(zzmm zzmmVar) {
        zzan();
        this.zzr.zzQ(zzmmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final void zzB(zzum zzumVar) {
        zzan();
        List singletonList = Collections.singletonList(zzumVar);
        zzan();
        zzan();
        zzW(this.zzad);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzah = this.zzah.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzlp zzlpVar = new zzlp((zzum) singletonList.get(i2), this.zzp);
            arrayList.add(zzlpVar);
            this.zzo.add(i2, new zzkh(zzlpVar.zzb, zzlpVar.zza));
        }
        this.zzah = this.zzah.zzg(0, arrayList.size());
        zzlx zzlxVar = new zzlx(this.zzo, this.zzah);
        if (!zzlxVar.zzo() && zzlxVar.zzc() < 0) {
            throw new zzaq(zzlxVar, -1, -9223372036854775807L);
        }
        int zzg = zzlxVar.zzg(false);
        zzls zzad = zzad(this.zzad, zzlxVar, zzac(zzlxVar, zzg, -9223372036854775807L));
        int i3 = zzad.zze;
        if (zzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzlxVar.zzo() && zzg < zzlxVar.zzc()) {
                i3 = 2;
            }
        }
        zzls zze = zzad.zze(i3);
        this.zzk.zzp(arrayList, zzg, zzfs.zzq(-9223372036854775807L), this.zzah);
        zzal(zze, 0, 1, (this.zzad.zzb.zza.equals(zze.zzb.zza) || this.zzad.zza.zzo()) ? false : true, 4, zzZ(zze), -1, false);
    }

    public final zzit zzE() {
        zzan();
        return this.zzad.zzf;
    }

    final /* synthetic */ void zzS(zzkr zzkrVar) {
        long j;
        boolean z;
        int i = this.zzC - zzkrVar.zzb;
        this.zzC = i;
        boolean z2 = true;
        if (zzkrVar.zzc) {
            this.zzD = zzkrVar.zzd;
            this.zzE = true;
        }
        if (zzkrVar.zze) {
            this.zzF = zzkrVar.zzf;
        }
        if (i == 0) {
            zzda zzdaVar = zzkrVar.zza.zza;
            if (!this.zzad.zza.zzo() && zzdaVar.zzo()) {
                this.zzae = -1;
                this.zzaf = 0L;
            }
            if (!zzdaVar.zzo()) {
                List zzw = ((zzlx) zzdaVar).zzw();
                zzef.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzkh) this.zzo.get(i2)).zzc((zzda) zzw.get(i2));
                }
            }
            if (this.zzE) {
                if (zzkrVar.zza.zzb.equals(this.zzad.zzb) && zzkrVar.zza.zzd == this.zzad.zzr) {
                    z2 = false;
                }
                if (!z2) {
                    j = -9223372036854775807L;
                } else if (zzdaVar.zzo() || zzkrVar.zza.zzb.zzb()) {
                    j = zzkrVar.zza.zzd;
                } else {
                    zzls zzlsVar = zzkrVar.zza;
                    zzuk zzukVar = zzlsVar.zzb;
                    j = zzlsVar.zzd;
                    zzab(zzdaVar, zzukVar, j);
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzE = false;
            zzal(zzkrVar.zza, 1, this.zzF, z, this.zzD, j, -1, false);
        }
    }

    final /* synthetic */ void zzT(final zzkr zzkrVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
            @Override // java.lang.Runnable
            public final void run() {
                zzki.this.zzS(zzkrVar);
            }
        });
    }

    final /* synthetic */ void zzU(zzco zzcoVar) {
        zzcoVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        zzan();
        zzef.zzd(i >= 0);
        this.zzr.zzu();
        zzda zzdaVar = this.zzad.zza;
        if (zzdaVar.zzo() || i < zzdaVar.zzc()) {
            this.zzC++;
            if (zzx()) {
                zzez.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkr zzkrVar = new zzkr(this.zzad);
                zzkrVar.zza(1);
                this.zzag.zza.zzT(zzkrVar);
                return;
            }
            zzls zzlsVar = this.zzad;
            int i3 = zzlsVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzdaVar.zzo())) {
                zzlsVar = this.zzad.zze(2);
            }
            int zzd2 = zzd();
            zzls zzad = zzad(zzlsVar, zzdaVar, zzac(zzdaVar, i, j));
            this.zzk.zzk(zzdaVar, i, zzfs.zzq(j));
            zzal(zzad, 0, 1, true, 1, zzZ(zzad), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzb() {
        zzan();
        if (zzx()) {
            return this.zzad.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzc() {
        zzan();
        if (zzx()) {
            return this.zzad.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzd() {
        zzan();
        int zzW = zzW(this.zzad);
        if (zzW == -1) {
            return 0;
        }
        return zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zze() {
        zzan();
        if (this.zzad.zza.zzo()) {
            return 0;
        }
        zzls zzlsVar = this.zzad;
        return zzlsVar.zza.zza(zzlsVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzf() {
        zzan();
        return this.zzad.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzg() {
        zzan();
        return this.zzad.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzh() {
        zzan();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final long zzi() {
        zzan();
        if (zzx()) {
            zzls zzlsVar = this.zzad;
            return zzlsVar.zzk.equals(zzlsVar.zzb) ? zzfs.zzt(this.zzad.zzp) : zzl();
        }
        zzan();
        if (this.zzad.zza.zzo()) {
            return this.zzaf;
        }
        zzls zzlsVar2 = this.zzad;
        long j = 0;
        if (zzlsVar2.zzk.zzd != zzlsVar2.zzb.zzd) {
            return zzfs.zzt(zzlsVar2.zza.zze(zzd(), this.zza, 0L).zzo);
        }
        long j2 = zzlsVar2.zzp;
        if (this.zzad.zzk.zzb()) {
            zzls zzlsVar3 = this.zzad;
            zzlsVar3.zza.zzn(zzlsVar3.zzk.zza, this.zzn).zzi(this.zzad.zzk.zzb);
        } else {
            j = j2;
        }
        zzls zzlsVar4 = this.zzad;
        zzab(zzlsVar4.zza, zzlsVar4.zzk, j);
        return zzfs.zzt(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final long zzj() {
        zzan();
        return zzY(this.zzad);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final long zzk() {
        zzan();
        return zzfs.zzt(zzZ(this.zzad));
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final long zzl() {
        zzan();
        if (zzx()) {
            zzls zzlsVar = this.zzad;
            zzuk zzukVar = zzlsVar.zzb;
            zzlsVar.zza.zzn(zzukVar.zza, this.zzn);
            return zzfs.zzt(this.zzn.zzh(zzukVar.zzb, zzukVar.zzc));
        }
        zzda zzn = zzn();
        if (zzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzfs.zzt(zzn.zze(zzd(), this.zza, 0L).zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final long zzm() {
        zzan();
        return zzfs.zzt(this.zzad.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final zzda zzn() {
        zzan();
        return this.zzad.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final zzdn zzo() {
        zzan();
        return this.zzad.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzp() {
        zzan();
        zzij zzijVar = this.zzy;
        boolean zzv = zzv();
        int zzb = zzijVar.zzb(zzv, 2);
        zzak(zzv, zzb, zzX(zzv, zzb));
        zzls zzlsVar = this.zzad;
        if (zzlsVar.zze != 1) {
            return;
        }
        zzls zzd2 = zzlsVar.zzd(null);
        zzls zze = zzd2.zze(true == zzd2.zza.zzo() ? 4 : 2);
        this.zzC++;
        this.zzk.zzj();
        zzal(zze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzq() {
        AudioTrack audioTrack;
        zzez.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.0-beta01] [" + zzfs.zze + "] [" + zzbt.zza() + "]");
        zzan();
        if (zzfs.zza < 21 && (audioTrack = this.zzM) != null) {
            audioTrack.release();
            this.zzM = null;
        }
        this.zzy.zzd();
        if (!this.zzk.zzo()) {
            zzew zzewVar = this.zzl;
            zzewVar.zzd(10, new zzet() { // from class: com.google.android.gms.internal.ads.zzjw
                @Override // com.google.android.gms.internal.ads.zzet
                public final void zza(Object obj) {
                    ((zzco) obj).zzj(zzit.zzd(new zzku(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzewVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        boolean z = this.zzad.zzo;
        zzls zze = this.zzad.zze(1);
        this.zzad = zze;
        zzls zza = zze.zza(zze.zzb);
        this.zzad = zza;
        zza.zzp = zza.zzr;
        this.zzad.zzq = 0L;
        this.zzr.zzP();
        this.zzi.zzi();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        this.zzX = zzee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzr(boolean z) {
        zzan();
        int zzb = this.zzy.zzb(z, zzf());
        zzak(z, zzb, zzX(z, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzs(Surface surface) {
        zzan();
        zzai(surface);
        int i = surface == null ? 0 : -1;
        zzaf(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzt(float f) {
        zzan();
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzV == max) {
            return;
        }
        this.zzV = max;
        zzah();
        zzew zzewVar = this.zzl;
        zzewVar.zzd(22, new zzet() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzet
            public final void zza(Object obj) {
                int i = zzki.zzd;
                ((zzco) obj).zzs(max);
            }
        });
        zzewVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzu() {
        zzan();
        this.zzy.zzb(zzv(), 1);
        zzaj(null);
        this.zzX = new zzee(zzfwu.zzl(), this.zzad.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzv() {
        zzan();
        return this.zzad.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzw() {
        zzan();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzx() {
        zzan();
        return this.zzad.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final int zzy() {
        zzan();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final void zzz(zzmm zzmmVar) {
        this.zzr.zzt(zzmmVar);
    }
}
