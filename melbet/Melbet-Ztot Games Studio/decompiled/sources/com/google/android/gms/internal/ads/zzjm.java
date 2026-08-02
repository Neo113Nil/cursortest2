package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
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

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzjm extends zzj implements zzih {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private int zzB;
    private zzlj zzC;
    private zzig zzD;
    private zzbt zzE;
    private zzbh zzF;
    private Object zzG;
    private Surface zzH;
    private int zzI;
    private zzel zzJ;
    private int zzK;
    private zzh zzL;
    private float zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private zzbh zzR;
    private zzkx zzS;
    private int zzT;
    private long zzU;
    private final zzii zzV;
    private zzwa zzW;
    final zzyc zzb;
    final zzbt zzc;
    private final zzdm zze;
    private final Context zzf;
    private final zzbw zzg;
    private final zzle[] zzh;
    private final zzyb zzi;
    private final zzdt zzj;
    private final zzjx zzk;
    private final zzdz zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzca zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzln zzq;
    private final Looper zzr;
    private final zzyj zzs;
    private final zzdj zzt;
    private final zzji zzu;
    private final zzjk zzv;
    private final zzhl zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        zzbd.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzyi, java.lang.Object] */
    public zzjm(zzif zzifVar, zzbw zzbwVar) {
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zze = zzdmVar;
        try {
            zzea.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha02] [" + zzet.zze + "]");
            Context applicationContext = zzifVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzifVar.zzh.apply(zzifVar.zzb);
            this.zzq = apply;
            this.zzQ = zzifVar.zzj;
            this.zzL = zzifVar.zzk;
            this.zzI = zzifVar.zzl;
            this.zzN = false;
            this.zzx = zzifVar.zzp;
            zzji zzjiVar = new zzji(this, null);
            this.zzu = zzjiVar;
            zzjk zzjkVar = new zzjk(null == true ? 1 : 0);
            this.zzv = zzjkVar;
            Handler handler = new Handler(zzifVar.zzi);
            zzle[] zza = ((zzhy) zzifVar.zzc).zza.zza(handler, zzjiVar, zzjiVar, zzjiVar, zzjiVar);
            this.zzh = zza;
            int length = zza.length;
            zzyb zzybVar = (zzyb) zzifVar.zze.zza();
            this.zzi = zzybVar;
            zzif.zza(((zzhz) zzifVar.zzd).zza);
            zzyn zzg = zzyn.zzg(((zzic) zzifVar.zzg).zza);
            this.zzs = zzg;
            this.zzp = zzifVar.zzm;
            this.zzC = zzifVar.zzn;
            Looper looper = zzifVar.zzi;
            this.zzr = looper;
            zzdj zzdjVar = zzifVar.zzb;
            this.zzt = zzdjVar;
            this.zzg = zzbwVar;
            zzdz zzdzVar = new zzdz(looper, zzdjVar, new zzdx(this) { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdx
                public final void zza(Object obj, zzab zzabVar) {
                }
            });
            this.zzl = zzdzVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzW = new zzwa(0);
            this.zzD = zzig.zza;
            int length2 = zza.length;
            zzyc zzycVar = new zzyc(new zzli[2], new zzxv[2], zzck.zza, null);
            this.zzb = zzycVar;
            this.zzn = new zzca();
            zzbr zzbrVar = new zzbr();
            zzbrVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzybVar.zzn();
            zzbrVar.zzd(29, true);
            zzbrVar.zzd(23, false);
            zzbrVar.zzd(25, false);
            zzbrVar.zzd(33, false);
            zzbrVar.zzd(26, false);
            zzbrVar.zzd(34, false);
            zzbt zze = zzbrVar.zze();
            this.zzc = zze;
            zzbr zzbrVar2 = new zzbr();
            zzbrVar2.zzb(zze);
            zzbrVar2.zza(4);
            zzbrVar2.zza(10);
            this.zzE = zzbrVar2.zze();
            this.zzj = zzdjVar.zzb(looper, null);
            zzii zziiVar = new zzii(this);
            this.zzV = zziiVar;
            this.zzS = zzkx.zzg(zzycVar);
            apply.zzR(zzbwVar, looper);
            this.zzk = new zzjx(zza, zzybVar, zzycVar, (zzkb) zzifVar.zzf.zza(), zzg, 0, false, apply, this.zzC, zzifVar.zzt, zzifVar.zzo, false, false, looper, zzdjVar, zziiVar, zzet.zza < 31 ? new zznz(zzifVar.zzs) : zzjd.zza(applicationContext, this, zzifVar.zzq, zzifVar.zzs), null, this.zzD);
            this.zzM = 1.0f;
            this.zzF = zzbh.zza;
            this.zzR = zzbh.zza;
            this.zzT = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            this.zzK = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i = zzdc.zza;
            this.zzO = true;
            if (apply == 0) {
                throw null;
            }
            zzdzVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzjiVar);
            new zzhh(zzifVar.zza, handler, zzjiVar);
            this.zzw = new zzhl(zzifVar.zza, handler, zzjiVar);
            zzet.zzG(null, null);
            new zzs(0).zza();
            zzcp zzcpVar = zzcp.zza;
            this.zzJ = zzel.zza;
            zzybVar.zzk(this.zzL);
            zzab(1, 10, Integer.valueOf(this.zzK));
            zzab(2, 10, Integer.valueOf(this.zzK));
            zzab(1, 3, this.zzL);
            zzab(2, 4, Integer.valueOf(this.zzI));
            zzab(2, 5, 0);
            zzab(1, 9, Boolean.valueOf(this.zzN));
            zzab(2, 7, zzjkVar);
            zzab(6, 8, zzjkVar);
            zzab(-1, 16, Integer.valueOf(this.zzQ));
            zzdmVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzK(zzjm zzjmVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjmVar.zzad(surface);
        zzjmVar.zzH = surface;
    }

    private final int zzR(zzkx zzkxVar) {
        return zzkxVar.zza.zzo() ? this.zzT : zzkxVar.zza.zzn(zzkxVar.zzb.zza, this.zzn).zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzS(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzT(zzkx zzkxVar) {
        if (!zzkxVar.zzb.zzb()) {
            return zzet.zzu(zzU(zzkxVar));
        }
        zzkxVar.zza.zzn(zzkxVar.zzb.zza, this.zzn);
        if (zzkxVar.zzc == -9223372036854775807L) {
            long j = zzkxVar.zza.zze(zzR(zzkxVar), this.zza, 0L).zzl;
            return zzet.zzu(0L);
        }
        int i = zzet.zza;
        return zzet.zzu(zzkxVar.zzc) + zzet.zzu(0L);
    }

    private final long zzU(zzkx zzkxVar) {
        if (zzkxVar.zza.zzo()) {
            return zzet.zzr(this.zzU);
        }
        boolean z = zzkxVar.zzo;
        long j = zzkxVar.zzr;
        if (zzkxVar.zzb.zzb()) {
            return j;
        }
        zzW(zzkxVar.zza, zzkxVar.zzb, j);
        return j;
    }

    private static long zzV(zzkx zzkxVar) {
        zzcb zzcbVar = new zzcb();
        zzca zzcaVar = new zzca();
        zzkxVar.zza.zzn(zzkxVar.zzb.zza, zzcaVar);
        long j = zzkxVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzkxVar.zza.zze(zzcaVar.zzc, zzcbVar, 0L).zzl;
        return 0L;
    }

    private final long zzW(zzcc zzccVar, zzui zzuiVar, long j) {
        zzccVar.zzn(zzuiVar.zza, this.zzn);
        return j;
    }

    private final Pair zzX(zzcc zzccVar, int i, long j) {
        if (zzccVar.zzo()) {
            this.zzT = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzU = j;
            return null;
        }
        if (i == -1 || i >= zzccVar.zzc()) {
            i = zzccVar.zzg(false);
            long j2 = zzccVar.zze(i, this.zza, 0L).zzl;
            j = zzet.zzu(0L);
        }
        return zzccVar.zzl(this.zza, this.zzn, i, zzet.zzr(j));
    }

    private final zzkx zzY(zzkx zzkxVar, zzcc zzccVar, Pair pair) {
        zzdi.zzd(zzccVar.zzo() || pair != null);
        zzcc zzccVar2 = zzkxVar.zza;
        long zzT = zzT(zzkxVar);
        zzkx zzf = zzkxVar.zzf(zzccVar);
        if (zzccVar.zzo()) {
            zzui zzh = zzkx.zzh();
            long zzr = zzet.zzr(this.zzU);
            zzkx zza = zzf.zzb(zzh, zzr, zzr, zzr, 0L, zzwi.zza, this.zzb, zzfxr.zzm()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i = zzet.zza;
        boolean z = !obj.equals(pair.first);
        zzui zzuiVar = z ? new zzui(pair.first, -1L) : zzf.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzr2 = zzet.zzr(zzT);
        if (!zzccVar2.zzo()) {
            zzccVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzr2) {
            zzdi.zzf(!zzuiVar.zzb());
            zzkx zza2 = zzf.zzb(zzuiVar, longValue, longValue, longValue, 0L, z ? zzwi.zza : zzf.zzh, z ? this.zzb : zzf.zzi, z ? zzfxr.zzm() : zzf.zzj).zza(zzuiVar);
            zza2.zzp = longValue;
            return zza2;
        }
        if (longValue != zzr2) {
            zzdi.zzf(!zzuiVar.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzr2));
            long j = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j = longValue + max;
            }
            zzkx zzb = zzf.zzb(zzuiVar, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j;
            return zzb;
        }
        int zza3 = zzccVar.zza(zzf.zzk.zza);
        if (zza3 != -1 && zzccVar.zzd(zza3, this.zzn, false).zzc == zzccVar.zzn(zzuiVar.zza, this.zzn).zzc) {
            return zzf;
        }
        zzccVar.zzn(zzuiVar.zza, this.zzn);
        long zzh2 = zzuiVar.zzb() ? this.zzn.zzh(zzuiVar.zzb, zzuiVar.zzc) : this.zzn.zzd;
        zzkx zza4 = zzf.zzb(zzuiVar, zzf.zzr, zzf.zzr, zzf.zzd, zzh2 - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzuiVar);
        zza4.zzp = zzh2;
        return zza4;
    }

    private final zzla zzZ(zzkz zzkzVar) {
        int zzR = zzR(this.zzS);
        zzcc zzccVar = this.zzS.zza;
        int i = zzR == -1 ? 0 : zzR;
        zzdj zzdjVar = this.zzt;
        zzjx zzjxVar = this.zzk;
        return new zzla(zzjxVar, zzkzVar, zzccVar, i, zzdjVar, zzjxVar.zzc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(final int i, final int i2) {
        if (i == this.zzJ.zzb() && i2 == this.zzJ.zza()) {
            return;
        }
        this.zzJ = new zzel(i, i2);
        zzdz zzdzVar = this.zzl;
        zzdzVar.zzd(24, new zzdw() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i3 = zzjm.zzd;
                ((zzbu) obj).zzo(i, i2);
            }
        });
        zzdzVar.zzc();
        zzab(2, 14, new zzel(i, i2));
    }

    private final void zzab(int i, int i2, Object obj) {
        zzle[] zzleVarArr = this.zzh;
        int length = zzleVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzle zzleVar = zzleVarArr[i3];
            if (i == -1 || zzleVar.zzb() == i) {
                zzla zzZ = zzZ(zzleVar);
                zzZ.zzf(i2);
                zzZ.zze(obj);
                zzZ.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac() {
        zzab(1, 2, Float.valueOf(this.zzM * this.zzw.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzle[] zzleVarArr = this.zzh;
        int length = zzleVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzle zzleVar = zzleVarArr[i];
            if (zzleVar.zzb() == 2) {
                zzla zzZ = zzZ(zzleVar);
                zzZ.zzf(1);
                zzZ.zze(obj);
                zzZ.zzd();
                arrayList.add(zzZ);
            }
        }
        Object obj2 = this.zzG;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzla) it.next()).zzi(this.zzx);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzG;
            Surface surface = this.zzH;
            if (obj3 == surface) {
                surface.release();
                this.zzH = null;
            }
        }
        this.zzG = obj;
        if (z) {
            zzae(zzhw.zzd(new zzjy(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzae(zzhw zzhwVar) {
        zzkx zzkxVar = this.zzS;
        zzkx zza = zzkxVar.zza(zzkxVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzkx zze = zza.zze(1);
        if (zzhwVar != null) {
            zze = zze.zzd(zzhwVar);
        }
        this.zzy++;
        this.zzk.zzn();
        zzag(zze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzkx zzkxVar = this.zzS;
        if (zzkxVar.zzl == z2 && zzkxVar.zzm == i3) {
            return;
        }
        this.zzy++;
        boolean z3 = zzkxVar.zzo;
        zzkx zzc = zzkxVar.zzc(z2, i3);
        this.zzk.zzm(z2, i3);
        zzag(zzc, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzag(final zzkx zzkxVar, final int i, final int i2, boolean z, int i3, long j, int i4, boolean z2) {
        int i5;
        boolean z3;
        boolean z4;
        Pair pair;
        boolean z5;
        int i6;
        boolean booleanValue;
        final zzbc zzbcVar;
        List list;
        int i7;
        zzcc zzn;
        zzbh zzu;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        zzyc zzycVar;
        zzyc zzycVar2;
        zzbt zzbtVar;
        zzj zzjVar;
        boolean z11;
        zzcc zzn2;
        boolean z12;
        int i8;
        boolean z13;
        ?? r10;
        zzcc zzn3;
        boolean z14;
        zzcc zzn4;
        boolean z15;
        long j2;
        boolean z16;
        int i9;
        boolean z17;
        zzbt zze;
        int i10;
        Object obj;
        zzbc zzbcVar2;
        Object obj2;
        int i11;
        long j3;
        long zzV;
        Object obj3;
        zzbc zzbcVar3;
        Object obj4;
        int i12;
        final int i13 = i3;
        zzkx zzkxVar2 = this.zzS;
        this.zzS = zzkxVar;
        boolean z18 = !zzkxVar2.zza.equals(zzkxVar.zza);
        zzcc zzccVar = zzkxVar2.zza;
        zzcc zzccVar2 = zzkxVar.zza;
        if (zzccVar2.zzo() && zzccVar.zzo()) {
            pair = new Pair(false, -1);
        } else {
            if (zzccVar2.zzo() == zzccVar.zzo()) {
                if (zzccVar.zze(zzccVar.zzn(zzkxVar2.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb.equals(zzccVar2.zze(zzccVar2.zzn(zzkxVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb)) {
                    if (!z) {
                        i5 = i13;
                        z3 = false;
                    } else if (i13 != 0) {
                        i5 = i13;
                        z3 = true;
                    } else if (zzkxVar2.zzb.zzd < zzkxVar.zzb.zzd) {
                        pair = new Pair(true, 0);
                        i13 = 0;
                        z4 = true;
                    } else {
                        z3 = true;
                        i5 = 0;
                    }
                    z4 = z3;
                    i13 = i5;
                    pair = new Pair(false, -1);
                } else {
                    if (!z) {
                        z4 = false;
                        z5 = false;
                    } else if (i13 == 0) {
                        i13 = 0;
                        z4 = true;
                        i6 = 1;
                        pair = new Pair(true, Integer.valueOf(i6));
                    } else {
                        z4 = true;
                        z5 = true;
                    }
                    if (z4 && i13 == 1) {
                        z4 = z5;
                        i6 = 2;
                    } else {
                        if (!z18) {
                            throw new IllegalStateException();
                        }
                        i6 = 3;
                    }
                    pair = new Pair(true, Integer.valueOf(i6));
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzbcVar = null;
                } else {
                    zzbcVar = !zzkxVar.zza.zzo() ? zzkxVar.zza.zze(zzkxVar.zza.zzn(zzkxVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzd : null;
                    this.zzR = zzbh.zza;
                }
                if (!booleanValue || !zzkxVar2.zzj.equals(zzkxVar.zzj)) {
                    zzbf zza = this.zzR.zza();
                    list = zzkxVar.zzj;
                    for (i7 = 0; i7 < list.size(); i7++) {
                        zzbk zzbkVar = (zzbk) list.get(i7);
                        for (int i14 = 0; i14 < zzbkVar.zza(); i14++) {
                            zzbkVar.zzb(i14).zza(zza);
                        }
                    }
                    this.zzR = zza.zzu();
                }
                zzn = zzn();
                if (zzn.zzo()) {
                    zzbc zzbcVar4 = zzn.zze(zzd(), this.zza, 0L).zzd;
                    zzbf zza2 = this.zzR.zza();
                    zza2.zzb(zzbcVar4.zzd);
                    zzu = zza2.zzu();
                } else {
                    zzu = this.zzR;
                }
                z6 = !zzu.equals(this.zzF);
                this.zzF = zzu;
                z7 = zzkxVar2.zzl == zzkxVar.zzl;
                z8 = zzkxVar2.zze == zzkxVar.zze;
                if (!z8 || z7) {
                    zzah();
                }
                boolean z19 = zzkxVar2.zzg == zzkxVar.zzg;
                if (z18) {
                    this.zzl.zzd(0, new zzdw() { // from class: com.google.android.gms.internal.ads.zzik
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj5) {
                            int i15 = zzjm.zzd;
                            ((zzbu) obj5).zzp(zzkx.this.zza, i);
                        }
                    });
                }
                if (z4) {
                    z9 = z8;
                    z10 = z19;
                } else {
                    zzca zzcaVar = new zzca();
                    if (zzkxVar2.zza.zzo()) {
                        z9 = z8;
                        z10 = z19;
                        i10 = i4;
                        obj = null;
                        zzbcVar2 = null;
                        obj2 = null;
                        i11 = -1;
                    } else {
                        Object obj5 = zzkxVar2.zzb.zza;
                        zzkxVar2.zza.zzn(obj5, zzcaVar);
                        int i15 = zzcaVar.zzc;
                        int zza3 = zzkxVar2.zza.zza(obj5);
                        z9 = z8;
                        z10 = z19;
                        obj2 = obj5;
                        obj = zzkxVar2.zza.zze(i15, this.zza, 0L).zzb;
                        zzbcVar2 = this.zza.zzd;
                        i10 = i15;
                        i11 = zza3;
                    }
                    if (i13 == 0) {
                        if (zzkxVar2.zzb.zzb()) {
                            zzui zzuiVar = zzkxVar2.zzb;
                            j3 = zzcaVar.zzh(zzuiVar.zzb, zzuiVar.zzc);
                            zzV = zzV(zzkxVar2);
                            int i16 = zzet.zza;
                            zzui zzuiVar2 = zzkxVar2.zzb;
                            final zzbv zzbvVar = new zzbv(obj, i10, zzbcVar2, obj2, i11, zzet.zzu(j3), zzet.zzu(zzV), zzuiVar2.zzb, zzuiVar2.zzc);
                            int zzd2 = zzd();
                            if (this.zzS.zza.zzo()) {
                                zzkx zzkxVar3 = this.zzS;
                                Object obj6 = zzkxVar3.zzb.zza;
                                zzkxVar3.zza.zzn(obj6, this.zzn);
                                i12 = this.zzS.zza.zza(obj6);
                                obj3 = this.zzS.zza.zze(zzd2, this.zza, 0L).zzb;
                                zzbcVar3 = this.zza.zzd;
                                obj4 = obj6;
                            } else {
                                obj3 = null;
                                zzbcVar3 = null;
                                obj4 = null;
                                i12 = -1;
                            }
                            long zzu2 = zzet.zzu(j);
                            long zzu3 = !this.zzS.zzb.zzb() ? zzet.zzu(zzV(this.zzS)) : zzu2;
                            zzui zzuiVar3 = this.zzS.zzb;
                            final zzbv zzbvVar2 = new zzbv(obj3, zzd2, zzbcVar3, obj4, i12, zzu2, zzu3, zzuiVar3.zzb, zzuiVar3.zzc);
                            this.zzl.zzd(11, new zzdw() { // from class: com.google.android.gms.internal.ads.zzip
                                @Override // com.google.android.gms.internal.ads.zzdw
                                public final void zza(Object obj7) {
                                    int i17 = zzjm.zzd;
                                    ((zzbu) obj7).zzm(zzbvVar, zzbvVar2, i13);
                                }
                            });
                        } else {
                            j3 = zzkxVar2.zzb.zze != -1 ? zzV(this.zzS) : zzcaVar.zzd;
                            zzV = j3;
                            int i162 = zzet.zza;
                            zzui zzuiVar22 = zzkxVar2.zzb;
                            final zzbv zzbvVar3 = new zzbv(obj, i10, zzbcVar2, obj2, i11, zzet.zzu(j3), zzet.zzu(zzV), zzuiVar22.zzb, zzuiVar22.zzc);
                            int zzd22 = zzd();
                            if (this.zzS.zza.zzo()) {
                            }
                            long zzu22 = zzet.zzu(j);
                            if (!this.zzS.zzb.zzb()) {
                            }
                            zzui zzuiVar32 = this.zzS.zzb;
                            final zzbv zzbvVar22 = new zzbv(obj3, zzd22, zzbcVar3, obj4, i12, zzu22, zzu3, zzuiVar32.zzb, zzuiVar32.zzc);
                            this.zzl.zzd(11, new zzdw() { // from class: com.google.android.gms.internal.ads.zzip
                                @Override // com.google.android.gms.internal.ads.zzdw
                                public final void zza(Object obj7) {
                                    int i17 = zzjm.zzd;
                                    ((zzbu) obj7).zzm(zzbvVar3, zzbvVar22, i13);
                                }
                            });
                        }
                    } else if (zzkxVar2.zzb.zzb()) {
                        j3 = zzkxVar2.zzr;
                        zzV = zzV(zzkxVar2);
                        int i1622 = zzet.zza;
                        zzui zzuiVar222 = zzkxVar2.zzb;
                        final zzbv zzbvVar32 = new zzbv(obj, i10, zzbcVar2, obj2, i11, zzet.zzu(j3), zzet.zzu(zzV), zzuiVar222.zzb, zzuiVar222.zzc);
                        int zzd222 = zzd();
                        if (this.zzS.zza.zzo()) {
                        }
                        long zzu222 = zzet.zzu(j);
                        if (!this.zzS.zzb.zzb()) {
                        }
                        zzui zzuiVar322 = this.zzS.zzb;
                        final zzbv zzbvVar222 = new zzbv(obj3, zzd222, zzbcVar3, obj4, i12, zzu222, zzu3, zzuiVar322.zzb, zzuiVar322.zzc);
                        this.zzl.zzd(11, new zzdw() { // from class: com.google.android.gms.internal.ads.zzip
                            @Override // com.google.android.gms.internal.ads.zzdw
                            public final void zza(Object obj7) {
                                int i17 = zzjm.zzd;
                                ((zzbu) obj7).zzm(zzbvVar32, zzbvVar222, i13);
                            }
                        });
                    } else {
                        j3 = zzkxVar2.zzr;
                        zzV = j3;
                        int i16222 = zzet.zza;
                        zzui zzuiVar2222 = zzkxVar2.zzb;
                        final zzbv zzbvVar322 = new zzbv(obj, i10, zzbcVar2, obj2, i11, zzet.zzu(j3), zzet.zzu(zzV), zzuiVar2222.zzb, zzuiVar2222.zzc);
                        int zzd2222 = zzd();
                        if (this.zzS.zza.zzo()) {
                        }
                        long zzu2222 = zzet.zzu(j);
                        if (!this.zzS.zzb.zzb()) {
                        }
                        zzui zzuiVar3222 = this.zzS.zzb;
                        final zzbv zzbvVar2222 = new zzbv(obj3, zzd2222, zzbcVar3, obj4, i12, zzu2222, zzu3, zzuiVar3222.zzb, zzuiVar3222.zzc);
                        this.zzl.zzd(11, new zzdw() { // from class: com.google.android.gms.internal.ads.zzip
                            @Override // com.google.android.gms.internal.ads.zzdw
                            public final void zza(Object obj7) {
                                int i17 = zzjm.zzd;
                                ((zzbu) obj7).zzm(zzbvVar322, zzbvVar2222, i13);
                            }
                        });
                    }
                }
                if (!booleanValue) {
                    this.zzl.zzd(1, new zzdw() { // from class: com.google.android.gms.internal.ads.zzir
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzd(zzbc.this, intValue);
                        }
                    });
                }
                if (zzkxVar2.zzf != zzkxVar.zzf) {
                    this.zzl.zzd(10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzis
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzk(zzkx.this.zzf);
                        }
                    });
                    if (zzkxVar.zzf != null) {
                        this.zzl.zzd(10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzit
                            @Override // com.google.android.gms.internal.ads.zzdw
                            public final void zza(Object obj7) {
                                int i17 = zzjm.zzd;
                                ((zzbu) obj7).zzj(zzkx.this.zzf);
                            }
                        });
                    }
                }
                zzycVar = zzkxVar2.zzi;
                zzycVar2 = zzkxVar.zzi;
                if (zzycVar != zzycVar2) {
                    this.zzi.zzp(zzycVar2.zze);
                    this.zzl.zzd(2, new zzdw() { // from class: com.google.android.gms.internal.ads.zziu
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzq(zzkx.this.zzi.zzd);
                        }
                    });
                }
                if (z6) {
                    final zzbh zzbhVar = this.zzF;
                    this.zzl.zzd(14, new zzdw() { // from class: com.google.android.gms.internal.ads.zziv
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zze(zzbh.this);
                        }
                    });
                }
                if (z10) {
                    this.zzl.zzd(3, new zzdw() { // from class: com.google.android.gms.internal.ads.zziw
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzb(zzkx.this.zzg);
                        }
                    });
                }
                if (!z9 || z7) {
                    this.zzl.zzd(-1, new zzdw() { // from class: com.google.android.gms.internal.ads.zzix
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            zzkx zzkxVar4 = zzkx.this;
                            ((zzbu) obj7).zzl(zzkxVar4.zzl, zzkxVar4.zze);
                        }
                    });
                }
                if (z9) {
                    this.zzl.zzd(4, new zzdw() { // from class: com.google.android.gms.internal.ads.zziy
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzh(zzkx.this.zze);
                        }
                    });
                }
                if (z7) {
                    this.zzl.zzd(5, new zzdw() { // from class: com.google.android.gms.internal.ads.zzil
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzf(zzkx.this.zzl, i2);
                        }
                    });
                }
                if (zzkxVar2.zzm != zzkxVar.zzm) {
                    this.zzl.zzd(6, new zzdw() { // from class: com.google.android.gms.internal.ads.zzim
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzi(zzkx.this.zzm);
                        }
                    });
                }
                if (zzkxVar2.zzi() != zzkxVar.zzi()) {
                    this.zzl.zzd(7, new zzdw() { // from class: com.google.android.gms.internal.ads.zzin
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzc(zzkx.this.zzi());
                        }
                    });
                }
                if (!zzkxVar2.zzn.equals(zzkxVar.zzn)) {
                    this.zzl.zzd(12, new zzdw() { // from class: com.google.android.gms.internal.ads.zzio
                        @Override // com.google.android.gms.internal.ads.zzdw
                        public final void zza(Object obj7) {
                            int i17 = zzjm.zzd;
                            ((zzbu) obj7).zzg(zzkx.this.zzn);
                        }
                    });
                }
                zzbtVar = this.zzE;
                zzbw zzbwVar = this.zzg;
                zzbt zzbtVar2 = this.zzc;
                int i17 = zzet.zza;
                boolean zzw = zzbwVar.zzw();
                zzjVar = (zzj) zzbwVar;
                zzcc zzn5 = zzjVar.zzn();
                z11 = zzn5.zzo() && zzn5.zze(zzjVar.zzd(), zzjVar.zza, 0L).zzh;
                zzn2 = zzjVar.zzn();
                if (zzn2.zzo()) {
                    int zzd3 = zzjVar.zzd();
                    zzjVar.zzh();
                    zzjVar.zzv();
                    z12 = false;
                    r10 = 0;
                    int zzk = zzn2.zzk(zzd3, 0, false);
                    i8 = -1;
                    if (zzk != -1) {
                        z13 = true;
                        zzn3 = zzjVar.zzn();
                        if (!zzn3.zzo()) {
                            int zzd4 = zzjVar.zzd();
                            zzjVar.zzh();
                            zzjVar.zzv();
                            if (zzn3.zzj(zzd4, r10, r10) != i8) {
                                z14 = true;
                                zzn4 = zzjVar.zzn();
                                if (zzn4.zzo()) {
                                    z15 = z14;
                                    j2 = 0;
                                    if (zzn4.zze(zzjVar.zzd(), zzjVar.zza, 0L).zzb()) {
                                        z16 = true;
                                        zzcc zzn6 = zzjVar.zzn();
                                        boolean z20 = zzn6.zzo() && zzn6.zze(zzjVar.zzd(), zzjVar.zza, j2).zzi;
                                        boolean zzo = zzbwVar.zzn().zzo();
                                        zzbr zzbrVar = new zzbr();
                                        zzbrVar.zzb(zzbtVar2);
                                        boolean z21 = !zzw;
                                        zzbrVar.zzd(4, z21);
                                        zzbrVar.zzd(5, (z11 || zzw) ? false : true);
                                        zzbrVar.zzd(6, (z13 || zzw) ? false : true);
                                        zzbrVar.zzd(7, zzo && (z13 || !z16 || z11) && !zzw);
                                        zzbrVar.zzd(8, (z15 || zzw) ? false : true);
                                        zzbrVar.zzd(9, zzo && (z15 || (z16 && z20)) && !zzw);
                                        zzbrVar.zzd(10, z21);
                                        if (z11 || zzw) {
                                            i9 = 11;
                                            z17 = false;
                                        } else {
                                            i9 = 11;
                                            z17 = true;
                                        }
                                        zzbrVar.zzd(i9, z17);
                                        zzbrVar.zzd(12, (z11 || zzw) ? false : true);
                                        zze = zzbrVar.zze();
                                        this.zzE = zze;
                                        if (!zze.equals(zzbtVar)) {
                                            this.zzl.zzd(13, new zzdw() { // from class: com.google.android.gms.internal.ads.zzij
                                                @Override // com.google.android.gms.internal.ads.zzdw
                                                public final void zza(Object obj7) {
                                                    zzjm.this.zzP((zzbu) obj7);
                                                }
                                            });
                                        }
                                        this.zzl.zzc();
                                        boolean z22 = zzkxVar2.zzo;
                                        boolean z23 = zzkxVar.zzo;
                                    }
                                } else {
                                    z15 = z14;
                                    j2 = 0;
                                }
                                z16 = false;
                                zzcc zzn62 = zzjVar.zzn();
                                if (zzn62.zzo()) {
                                }
                                boolean zzo2 = zzbwVar.zzn().zzo();
                                zzbr zzbrVar2 = new zzbr();
                                zzbrVar2.zzb(zzbtVar2);
                                boolean z212 = !zzw;
                                zzbrVar2.zzd(4, z212);
                                zzbrVar2.zzd(5, (z11 || zzw) ? false : true);
                                zzbrVar2.zzd(6, (z13 || zzw) ? false : true);
                                zzbrVar2.zzd(7, zzo2 && (z13 || !z16 || z11) && !zzw);
                                zzbrVar2.zzd(8, (z15 || zzw) ? false : true);
                                zzbrVar2.zzd(9, zzo2 && (z15 || (z16 && z20)) && !zzw);
                                zzbrVar2.zzd(10, z212);
                                if (z11) {
                                }
                                i9 = 11;
                                z17 = false;
                                zzbrVar2.zzd(i9, z17);
                                zzbrVar2.zzd(12, (z11 || zzw) ? false : true);
                                zze = zzbrVar2.zze();
                                this.zzE = zze;
                                if (!zze.equals(zzbtVar)) {
                                }
                                this.zzl.zzc();
                                boolean z222 = zzkxVar2.zzo;
                                boolean z232 = zzkxVar.zzo;
                            }
                        }
                        z14 = false;
                        zzn4 = zzjVar.zzn();
                        if (zzn4.zzo()) {
                        }
                        z16 = false;
                        zzcc zzn622 = zzjVar.zzn();
                        if (zzn622.zzo()) {
                        }
                        boolean zzo22 = zzbwVar.zzn().zzo();
                        zzbr zzbrVar22 = new zzbr();
                        zzbrVar22.zzb(zzbtVar2);
                        boolean z2122 = !zzw;
                        zzbrVar22.zzd(4, z2122);
                        zzbrVar22.zzd(5, (z11 || zzw) ? false : true);
                        zzbrVar22.zzd(6, (z13 || zzw) ? false : true);
                        zzbrVar22.zzd(7, zzo22 && (z13 || !z16 || z11) && !zzw);
                        zzbrVar22.zzd(8, (z15 || zzw) ? false : true);
                        zzbrVar22.zzd(9, zzo22 && (z15 || (z16 && z20)) && !zzw);
                        zzbrVar22.zzd(10, z2122);
                        if (z11) {
                        }
                        i9 = 11;
                        z17 = false;
                        zzbrVar22.zzd(i9, z17);
                        zzbrVar22.zzd(12, (z11 || zzw) ? false : true);
                        zze = zzbrVar22.zze();
                        this.zzE = zze;
                        if (!zze.equals(zzbtVar)) {
                        }
                        this.zzl.zzc();
                        boolean z2222 = zzkxVar2.zzo;
                        boolean z2322 = zzkxVar.zzo;
                    }
                } else {
                    i8 = -1;
                    z12 = false;
                }
                z13 = false;
                r10 = z12;
                zzn3 = zzjVar.zzn();
                if (!zzn3.zzo()) {
                }
                z14 = false;
                zzn4 = zzjVar.zzn();
                if (zzn4.zzo()) {
                }
                z16 = false;
                zzcc zzn6222 = zzjVar.zzn();
                if (zzn6222.zzo()) {
                }
                boolean zzo222 = zzbwVar.zzn().zzo();
                zzbr zzbrVar222 = new zzbr();
                zzbrVar222.zzb(zzbtVar2);
                boolean z21222 = !zzw;
                zzbrVar222.zzd(4, z21222);
                zzbrVar222.zzd(5, (z11 || zzw) ? false : true);
                zzbrVar222.zzd(6, (z13 || zzw) ? false : true);
                zzbrVar222.zzd(7, zzo222 && (z13 || !z16 || z11) && !zzw);
                zzbrVar222.zzd(8, (z15 || zzw) ? false : true);
                zzbrVar222.zzd(9, zzo222 && (z15 || (z16 && z20)) && !zzw);
                zzbrVar222.zzd(10, z21222);
                if (z11) {
                }
                i9 = 11;
                z17 = false;
                zzbrVar222.zzd(i9, z17);
                zzbrVar222.zzd(12, (z11 || zzw) ? false : true);
                zze = zzbrVar222.zze();
                this.zzE = zze;
                if (!zze.equals(zzbtVar)) {
                }
                this.zzl.zzc();
                boolean z22222 = zzkxVar2.zzo;
                boolean z23222 = zzkxVar.zzo;
            }
            pair = new Pair(true, 3);
        }
        z4 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!booleanValue) {
        }
        zzbf zza4 = this.zzR.zza();
        list = zzkxVar.zzj;
        while (i7 < list.size()) {
        }
        this.zzR = zza4.zzu();
        zzn = zzn();
        if (zzn.zzo()) {
        }
        z6 = !zzu.equals(this.zzF);
        this.zzF = zzu;
        if (zzkxVar2.zzl == zzkxVar.zzl) {
        }
        if (zzkxVar2.zze == zzkxVar.zze) {
        }
        if (!z8) {
        }
        zzah();
        if (zzkxVar2.zzg == zzkxVar.zzg) {
        }
        if (z18) {
        }
        if (z4) {
        }
        if (!booleanValue) {
        }
        if (zzkxVar2.zzf != zzkxVar.zzf) {
        }
        zzycVar = zzkxVar2.zzi;
        zzycVar2 = zzkxVar.zzi;
        if (zzycVar != zzycVar2) {
        }
        if (z6) {
        }
        if (z10) {
        }
        if (!z9) {
        }
        this.zzl.zzd(-1, new zzdw() { // from class: com.google.android.gms.internal.ads.zzix
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj7) {
                int i172 = zzjm.zzd;
                zzkx zzkxVar4 = zzkx.this;
                ((zzbu) obj7).zzl(zzkxVar4.zzl, zzkxVar4.zze);
            }
        });
        if (z9) {
        }
        if (z7) {
        }
        if (zzkxVar2.zzm != zzkxVar.zzm) {
        }
        if (zzkxVar2.zzi() != zzkxVar.zzi()) {
        }
        if (!zzkxVar2.zzn.equals(zzkxVar.zzn)) {
        }
        zzbtVar = this.zzE;
        zzbw zzbwVar2 = this.zzg;
        zzbt zzbtVar22 = this.zzc;
        int i172 = zzet.zza;
        boolean zzw2 = zzbwVar2.zzw();
        zzjVar = (zzj) zzbwVar2;
        zzcc zzn52 = zzjVar.zzn();
        if (zzn52.zzo()) {
        }
        zzn2 = zzjVar.zzn();
        if (zzn2.zzo()) {
        }
        z13 = false;
        r10 = z12;
        zzn3 = zzjVar.zzn();
        if (!zzn3.zzo()) {
        }
        z14 = false;
        zzn4 = zzjVar.zzn();
        if (zzn4.zzo()) {
        }
        z16 = false;
        zzcc zzn62222 = zzjVar.zzn();
        if (zzn62222.zzo()) {
        }
        boolean zzo2222 = zzbwVar2.zzn().zzo();
        zzbr zzbrVar2222 = new zzbr();
        zzbrVar2222.zzb(zzbtVar22);
        boolean z212222 = !zzw2;
        zzbrVar2222.zzd(4, z212222);
        zzbrVar2222.zzd(5, (z11 || zzw2) ? false : true);
        zzbrVar2222.zzd(6, (z13 || zzw2) ? false : true);
        zzbrVar2222.zzd(7, zzo2222 && (z13 || !z16 || z11) && !zzw2);
        zzbrVar2222.zzd(8, (z15 || zzw2) ? false : true);
        zzbrVar2222.zzd(9, zzo2222 && (z15 || (z16 && z20)) && !zzw2);
        zzbrVar2222.zzd(10, z212222);
        if (z11) {
        }
        i9 = 11;
        z17 = false;
        zzbrVar2222.zzd(i9, z17);
        zzbrVar2222.zzd(12, (z11 || zzw2) ? false : true);
        zze = zzbrVar2222.zze();
        this.zzE = zze;
        if (!zze.equals(zzbtVar)) {
        }
        this.zzl.zzc();
        boolean z222222 = zzkxVar2.zzo;
        boolean z232222 = zzkxVar.zzo;
    }

    private final void zzah() {
        int zzf = zzf();
        if (zzf == 2 || zzf == 3) {
            zzai();
            boolean z = this.zzS.zzo;
            zzu();
            zzu();
        }
    }

    private final void zzai() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzr.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzr.getThread().getName());
            if (this.zzO) {
                throw new IllegalStateException(format);
            }
            zzea.zzg("ExoPlayerImpl", format, this.zzP ? null : new IllegalStateException());
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzA(zzlq zzlqVar) {
        zzai();
        this.zzq.zzQ(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzB(zzuk zzukVar) {
        zzai();
        List singletonList = Collections.singletonList(zzukVar);
        zzai();
        zzai();
        zzR(this.zzS);
        zzk();
        this.zzy++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzW = this.zzW.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzku zzkuVar = new zzku((zzuk) singletonList.get(i2), this.zzp);
            arrayList.add(zzkuVar);
            this.zzo.add(i2, new zzjl(zzkuVar.zzb, zzkuVar.zza));
        }
        this.zzW = this.zzW.zzg(0, arrayList.size());
        zzlc zzlcVar = new zzlc(this.zzo, this.zzW);
        if (!zzlcVar.zzo() && zzlcVar.zzc() < 0) {
            throw new zzaj(zzlcVar, -1, -9223372036854775807L);
        }
        int zzg = zzlcVar.zzg(false);
        zzkx zzY = zzY(this.zzS, zzlcVar, zzX(zzlcVar, zzg, -9223372036854775807L));
        int i3 = zzY.zze;
        if (zzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzlcVar.zzo() && zzg < zzlcVar.zzc()) {
                i3 = 2;
            }
        }
        zzkx zze = zzY.zze(i3);
        this.zzk.zzp(arrayList, zzg, zzet.zzr(-9223372036854775807L), this.zzW);
        zzag(zze, 0, 1, (this.zzS.zzb.zza.equals(zze.zzb.zza) || this.zzS.zza.zzo()) ? false : true, 4, zzU(zze), -1, false);
    }

    public final zzhw zzE() {
        zzai();
        return this.zzS.zzf;
    }

    final /* synthetic */ void zzN(zzjv zzjvVar) {
        long j;
        boolean z;
        int i = this.zzy - zzjvVar.zzb;
        this.zzy = i;
        boolean z2 = true;
        if (zzjvVar.zzc) {
            this.zzz = zzjvVar.zzd;
            this.zzA = true;
        }
        if (zzjvVar.zze) {
            this.zzB = zzjvVar.zzf;
        }
        if (i == 0) {
            zzcc zzccVar = zzjvVar.zza.zza;
            if (!this.zzS.zza.zzo() && zzccVar.zzo()) {
                this.zzT = -1;
                this.zzU = 0L;
            }
            if (!zzccVar.zzo()) {
                List zzw = ((zzlc) zzccVar).zzw();
                zzdi.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzjl) this.zzo.get(i2)).zzc((zzcc) zzw.get(i2));
                }
            }
            if (this.zzA) {
                if (zzjvVar.zza.zzb.equals(this.zzS.zzb) && zzjvVar.zza.zzd == this.zzS.zzr) {
                    z2 = false;
                }
                if (!z2) {
                    j = -9223372036854775807L;
                } else if (zzccVar.zzo() || zzjvVar.zza.zzb.zzb()) {
                    j = zzjvVar.zza.zzd;
                } else {
                    zzkx zzkxVar = zzjvVar.zza;
                    zzui zzuiVar = zzkxVar.zzb;
                    j = zzkxVar.zzd;
                    zzW(zzccVar, zzuiVar, j);
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzA = false;
            zzag(zzjvVar.zza, 1, this.zzB, z, this.zzz, j, -1, false);
        }
    }

    final /* synthetic */ void zzO(final zzjv zzjvVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // java.lang.Runnable
            public final void run() {
                zzjm.this.zzN(zzjvVar);
            }
        });
    }

    final /* synthetic */ void zzP(zzbu zzbuVar) {
        zzbuVar.zza(this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final void zza(int i, long j, int i2, boolean z) {
        zzai();
        if (i == -1) {
            return;
        }
        zzdi.zzd(i >= 0);
        zzcc zzccVar = this.zzS.zza;
        if (zzccVar.zzo() || i < zzccVar.zzc()) {
            this.zzq.zzu();
            this.zzy++;
            if (zzw()) {
                zzea.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzjv zzjvVar = new zzjv(this.zzS);
                zzjvVar.zza(1);
                this.zzV.zza.zzO(zzjvVar);
                return;
            }
            zzkx zzkxVar = this.zzS;
            int i3 = zzkxVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzccVar.zzo())) {
                zzkxVar = this.zzS.zze(2);
            }
            int zzd2 = zzd();
            zzkx zzY = zzY(zzkxVar, zzccVar, zzX(zzccVar, i, j));
            this.zzk.zzk(zzccVar, i, zzet.zzr(j));
            zzag(zzY, 0, 1, true, 1, zzU(zzY), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzb() {
        zzai();
        if (zzw()) {
            return this.zzS.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzc() {
        zzai();
        if (zzw()) {
            return this.zzS.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzd() {
        zzai();
        int zzR = zzR(this.zzS);
        if (zzR == -1) {
            return 0;
        }
        return zzR;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zze() {
        zzai();
        if (this.zzS.zza.zzo()) {
            return 0;
        }
        zzkx zzkxVar = this.zzS;
        return zzkxVar.zza.zza(zzkxVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzf() {
        zzai();
        return this.zzS.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzg() {
        zzai();
        return this.zzS.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzh() {
        zzai();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzi() {
        zzai();
        if (zzw()) {
            zzkx zzkxVar = this.zzS;
            return zzkxVar.zzk.equals(zzkxVar.zzb) ? zzet.zzu(this.zzS.zzp) : zzl();
        }
        zzai();
        if (this.zzS.zza.zzo()) {
            return this.zzU;
        }
        zzkx zzkxVar2 = this.zzS;
        long j = 0;
        if (zzkxVar2.zzk.zzd != zzkxVar2.zzb.zzd) {
            return zzet.zzu(zzkxVar2.zza.zze(zzd(), this.zza, 0L).zzm);
        }
        long j2 = zzkxVar2.zzp;
        if (this.zzS.zzk.zzb()) {
            zzkx zzkxVar3 = this.zzS;
            zzkxVar3.zza.zzn(zzkxVar3.zzk.zza, this.zzn).zzi(this.zzS.zzk.zzb);
        } else {
            j = j2;
        }
        zzkx zzkxVar4 = this.zzS;
        zzW(zzkxVar4.zza, zzkxVar4.zzk, j);
        return zzet.zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzj() {
        zzai();
        return zzT(this.zzS);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzk() {
        zzai();
        return zzet.zzu(zzU(this.zzS));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzl() {
        zzai();
        if (zzw()) {
            zzkx zzkxVar = this.zzS;
            zzui zzuiVar = zzkxVar.zzb;
            zzkxVar.zza.zzn(zzuiVar.zza, this.zzn);
            return zzet.zzu(this.zzn.zzh(zzuiVar.zzb, zzuiVar.zzc));
        }
        zzcc zzn = zzn();
        if (zzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzet.zzu(zzn.zze(zzd(), this.zza, 0L).zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzm() {
        zzai();
        return zzet.zzu(this.zzS.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzcc zzn() {
        zzai();
        return this.zzS.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzck zzo() {
        zzai();
        return this.zzS.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzp() {
        zzai();
        zzhl zzhlVar = this.zzw;
        boolean zzu = zzu();
        int zzb = zzhlVar.zzb(zzu, 2);
        zzaf(zzu, zzb, zzS(zzu, zzb));
        zzkx zzkxVar = this.zzS;
        if (zzkxVar.zze != 1) {
            return;
        }
        zzkx zzd2 = zzkxVar.zzd(null);
        zzkx zze = zzd2.zze(true == zzd2.zza.zzo() ? 4 : 2);
        this.zzy++;
        this.zzk.zzj();
        zzag(zze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzq(boolean z) {
        zzai();
        int zzb = this.zzw.zzb(z, zzf());
        zzaf(z, zzb, zzS(z, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzr(Surface surface) {
        zzai();
        zzad(surface);
        int i = surface == null ? 0 : -1;
        zzaa(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzs(float f) {
        zzai();
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzM == max) {
            return;
        }
        this.zzM = max;
        zzac();
        zzdz zzdzVar = this.zzl;
        zzdzVar.zzd(22, new zzdw() { // from class: com.google.android.gms.internal.ads.zziq
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i = zzjm.zzd;
                ((zzbu) obj).zzs(max);
            }
        });
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzt() {
        zzai();
        this.zzw.zzb(zzu(), 1);
        zzae(null);
        int i = zzdc.zza;
        zzfxr zzm = zzfxr.zzm();
        long j = this.zzS.zzr;
        zzfxr.zzk(zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzu() {
        zzai();
        return this.zzS.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzv() {
        zzai();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzw() {
        zzai();
        return this.zzS.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final int zzx() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzy(zzlq zzlqVar) {
        this.zzq.zzt(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzz() {
        zzea.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha02] [" + zzet.zze + "] [" + zzbd.zza() + "]");
        zzai();
        this.zzw.zzd();
        if (!this.zzk.zzo()) {
            zzdz zzdzVar = this.zzl;
            zzdzVar.zzd(10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzja
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj) {
                    ((zzbu) obj).zzj(zzhw.zzd(new zzjy(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzdzVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzs.zzf(this.zzq);
        boolean z = this.zzS.zzo;
        zzkx zze = this.zzS.zze(1);
        this.zzS = zze;
        zzkx zza = zze.zza(zze.zzb);
        this.zzS = zza;
        zza.zzp = zza.zzr;
        this.zzS.zzq = 0L;
        this.zzq.zzP();
        this.zzi.zzj();
        Surface surface = this.zzH;
        if (surface != null) {
            surface.release();
            this.zzH = null;
        }
        int i = zzdc.zza;
    }
}
