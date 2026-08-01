package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import kotlin.time.DurationKt;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes2.dex */
public final class zzkt implements zzgm {
    private static volatile zzkt zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzie zzD;
    private String zzE;
    long zza;
    private final zzfi zzc;
    private final zzen zzd;
    private zzam zze;
    private zzep zzf;
    private zzkf zzg;
    private zzaa zzh;
    private final zzkv zzi;
    private zzic zzj;
    private zzjo zzk;
    private final zzki zzl;
    private zzez zzm;
    private final zzfr zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzla zzF = new zzko(this);

    zzkt(zzku zzkuVar, zzfr zzfrVar) {
        Preconditions.checkNotNull(zzkuVar);
        this.zzn = zzfr.zzp(zzkuVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzki(this);
        zzkv zzkvVar = new zzkv(this);
        zzkvVar.zzX();
        this.zzi = zzkvVar;
        zzen zzenVar = new zzen(this);
        zzenVar.zzX();
        this.zzd = zzenVar;
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzX();
        this.zzc = zzfiVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaz().zzp(new zzkj(this, zzkuVar));
    }

    static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i, String str) {
        List zzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < zzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) zze.zzaC();
        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zze2.zzaC();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        List zzp = zzfsVar.zzp();
        for (int i = 0; i < zzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    private final zzq zzac(String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean zzad = zzad(zzj);
        if (zzad != null && !zzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping. appId", zzeh.zzn(str));
            return null;
        }
        String zzy = zzj.zzy();
        String zzw = zzj.zzw();
        long zzb2 = zzj.zzb();
        String zzv = zzj.zzv();
        long zzm = zzj.zzm();
        long zzj2 = zzj.zzj();
        boolean zzai = zzj.zzai();
        String zzx = zzj.zzx();
        zzj.zza();
        return new zzq(str, zzy, zzw, zzb2, zzv, zzm, zzj2, (String) null, zzai, false, zzx, 0L, 0L, 0, zzj.zzah(), false, zzj.zzr(), zzj.zzq(), zzj.zzk(), zzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null);
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionName;
                String zzw = zzhVar.zzw();
                if (zzw != null && zzw.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j, boolean z) {
        String str = true != z ? "_lte" : "_se";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzky zzp = zzamVar.zzp(zzgcVar.zzap(), str);
        zzky zzkyVar = (zzp == null || zzp.zze == null) ? new zzky(zzgcVar.zzap(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzav().currentTimeMillis(), Long.valueOf(j)) : new zzky(zzgcVar.zzap(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzp.zze).longValue() + j));
        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzd.zzf(str);
        zzd.zzg(zzav().currentTimeMillis());
        zzd.zze(((Long) zzkyVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaC();
        int zza = zzkv.zza(zzgcVar, str);
        if (zza >= 0) {
            zzgcVar.zzam(zza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzkyVar);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzkyVar.zze);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzag() {
        long max;
        long j;
        zzaz().zzg();
        zzB();
        if (this.zza > 0) {
            long abs = 3600000 - Math.abs(zzav().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzm().zzc();
                zzkf zzkfVar = this.zzg;
                zzal(zzkfVar);
                zzkfVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzay().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkf zzkfVar2 = this.zzg;
            zzal(zzkfVar2);
            zzkfVar2.zza();
            return;
        }
        long currentTimeMillis = zzav().currentTimeMillis();
        zzg();
        long max2 = Math.max(0L, ((Long) zzdu.zzz.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        boolean z = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (!zzamVar2.zzG()) {
                z = false;
            }
        }
        if (z) {
            String zzl = zzg().zzl();
            if (TextUtils.isEmpty(zzl) || ".none.".equals(zzl)) {
                zzg();
                max = Math.max(0L, ((Long) zzdu.zzt.zza(null)).longValue());
            } else {
                zzg();
                max = Math.max(0L, ((Long) zzdu.zzu.zza(null)).longValue());
            }
        } else {
            zzg();
            max = Math.max(0L, ((Long) zzdu.zzs.zza(null)).longValue());
        }
        long zza = this.zzk.zzc.zza();
        long zza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        boolean z2 = z;
        long zzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        long max3 = Math.max(zzd, zzamVar4.zze());
        if (max3 != 0) {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            long max4 = Math.max(currentTimeMillis - abs3, abs4);
            j = abs2 + max2;
            if (z2 && max4 > 0) {
                j = Math.min(abs2, max4) + max;
            }
            zzkv zzkvVar = this.zzi;
            zzal(zzkvVar);
            if (!zzkvVar.zzw(max4, max)) {
                j = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    zzg();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzdu.zzB.zza(null)).intValue()))) {
                        break;
                    }
                    zzg();
                    j += Math.max(0L, ((Long) zzdu.zzA.zza(null)).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (j != 0) {
                zzay().zzj().zza("Next upload time is 0");
                zzm().zzc();
                zzkf zzkfVar3 = this.zzg;
                zzal(zzkfVar3);
                zzkfVar3.zza();
                return;
            }
            zzen zzenVar = this.zzd;
            zzal(zzenVar);
            if (!zzenVar.zza()) {
                zzay().zzj().zza("No network");
                zzm().zzb();
                zzkf zzkfVar4 = this.zzg;
                zzal(zzkfVar4);
                zzkfVar4.zza();
                return;
            }
            long zza3 = this.zzk.zzb.zza();
            zzg();
            long max5 = Math.max(0L, ((Long) zzdu.zzq.zza(null)).longValue());
            zzkv zzkvVar2 = this.zzi;
            zzal(zzkvVar2);
            if (!zzkvVar2.zzw(zza3, max5)) {
                j = Math.max(j, zza3 + max5);
            }
            zzm().zzc();
            long currentTimeMillis2 = j - zzav().currentTimeMillis();
            if (currentTimeMillis2 <= 0) {
                zzg();
                currentTimeMillis2 = Math.max(0L, ((Long) zzdu.zzv.zza(null)).longValue());
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
            }
            zzay().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
            zzkf zzkfVar5 = this.zzg;
            zzal(zzkfVar5);
            zzkfVar5.zzd(currentTimeMillis2);
            return;
        }
        j = 0;
        if (j != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x0b81, code lost:
    
        if (r10 > (com.google.android.gms.measurement.internal.zzag.zzA() + r8)) goto L374;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04c5 A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x081f A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0868 A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x088b A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x090c A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0938 A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0b71 A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0bf8 A[Catch: all -> 0x0d1a, TRY_LEAVE, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0c14 A[Catch: SQLiteException -> 0x0c2c, all -> 0x0d1a, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0c2c, blocks: (B:394:0x0c05, B:396:0x0c14), top: B:393:0x0c05, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03a7 A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x046b A[Catch: all -> 0x0d1a, TryCatch #2 {all -> 0x0d1a, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:25:0x0538, B:26:0x00f3, B:28:0x0101, B:31:0x0125, B:33:0x012b, B:35:0x013d, B:37:0x014b, B:39:0x015b, B:41:0x0168, B:46:0x016d, B:49:0x0186, B:66:0x03a7, B:67:0x03b3, B:70:0x03bd, B:74:0x03e0, B:75:0x03cf, B:84:0x045f, B:86:0x046b, B:89:0x047e, B:91:0x048f, B:93:0x049b, B:95:0x0524, B:102:0x04c5, B:104:0x04d5, B:107:0x04ea, B:109:0x04fb, B:111:0x0507, B:115:0x03e8, B:117:0x03f4, B:119:0x0400, B:123:0x0445, B:124:0x041d, B:127:0x042f, B:129:0x0435, B:131:0x043f, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x0243, B:144:0x0219, B:146:0x022a, B:153:0x0252, B:155:0x027e, B:156:0x02a8, B:158:0x02de, B:159:0x02e4, B:162:0x02f0, B:164:0x0326, B:165:0x0341, B:167:0x0347, B:169:0x0355, B:171:0x0368, B:172:0x035d, B:180:0x036f, B:183:0x0376, B:184:0x038e, B:197:0x054d, B:199:0x055b, B:201:0x0566, B:203:0x0598, B:204:0x056e, B:206:0x0579, B:208:0x057f, B:210:0x058b, B:212:0x0593, B:219:0x059b, B:220:0x05a7, B:223:0x05af, B:226:0x05c1, B:227:0x05cd, B:229:0x05d5, B:230:0x05fa, B:232:0x061f, B:234:0x0630, B:236:0x0636, B:238:0x0642, B:239:0x0673, B:241:0x0679, B:245:0x0687, B:243:0x068b, B:247:0x068e, B:248:0x0691, B:249:0x069f, B:251:0x06a5, B:253:0x06b5, B:254:0x06bc, B:256:0x06c8, B:258:0x06cf, B:261:0x06d2, B:263:0x0712, B:264:0x0725, B:266:0x072b, B:269:0x0745, B:271:0x0760, B:273:0x0779, B:275:0x077e, B:277:0x0782, B:279:0x0786, B:281:0x0790, B:282:0x079a, B:284:0x079e, B:286:0x07a4, B:287:0x07b2, B:288:0x07bb, B:291:0x0a0e, B:292:0x07c8, B:357:0x07df, B:295:0x07fb, B:297:0x081f, B:298:0x0827, B:300:0x082d, B:304:0x083f, B:309:0x0868, B:310:0x088b, B:312:0x0897, B:314:0x08ac, B:315:0x08ed, B:318:0x0905, B:320:0x090c, B:322:0x091b, B:324:0x091f, B:326:0x0923, B:328:0x0927, B:329:0x0933, B:330:0x0938, B:332:0x093e, B:334:0x095a, B:335:0x095f, B:336:0x0a0b, B:338:0x097a, B:340:0x0982, B:343:0x09a9, B:345:0x09d5, B:346:0x09df, B:348:0x09f1, B:350:0x09fb, B:351:0x098f, B:355:0x0853, B:361:0x07e6, B:363:0x0a1a, B:365:0x0a28, B:366:0x0a2e, B:367:0x0a36, B:369:0x0a3c, B:372:0x0a56, B:374:0x0a67, B:375:0x0adb, B:377:0x0ae1, B:379:0x0af9, B:382:0x0b00, B:383:0x0b2f, B:385:0x0b71, B:387:0x0ba6, B:389:0x0baa, B:390:0x0bb5, B:392:0x0bf8, B:394:0x0c05, B:396:0x0c14, B:400:0x0c2e, B:403:0x0c47, B:404:0x0b83, B:405:0x0b08, B:407:0x0b14, B:408:0x0b18, B:409:0x0c5f, B:410:0x0c77, B:413:0x0c7f, B:415:0x0c84, B:418:0x0c94, B:420:0x0cae, B:421:0x0cc9, B:424:0x0cd3, B:425:0x0cf6, B:432:0x0ce3, B:433:0x0a7f, B:435:0x0a85, B:437:0x0a8f, B:438:0x0a96, B:443:0x0aa6, B:444:0x0aad, B:446:0x0acc, B:447:0x0ad3, B:448:0x0ad0, B:449:0x0aaa, B:451:0x0a93, B:453:0x05da, B:455:0x05e0, B:458:0x0d08), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzah(String str, long j) {
        int i;
        String str2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        zzkq zzkqVar;
        zzam zzamVar;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        long currentTimeMillis;
        long zzk;
        ContentValues contentValues;
        long parseLong;
        int zzc;
        long j2;
        SecureRandom secureRandom;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        Long l;
        zzkq zzkqVar2;
        HashMap hashMap;
        long zzr;
        HashMap hashMap2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar3;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        int i2;
        String str3;
        com.google.android.gms.internal.measurement.zzgc zzgcVar4;
        com.google.android.gms.internal.measurement.zzfs zzfsVar2;
        int i3;
        com.google.android.gms.internal.measurement.zzfs zzfsVar3;
        int i4;
        int i5;
        com.google.android.gms.internal.measurement.zzgc zzgcVar5;
        int i6;
        com.google.android.gms.internal.measurement.zzfs zzfsVar4;
        int i7;
        int i8;
        com.google.android.gms.internal.measurement.zzfs zzfsVar5;
        char c;
        String str4 = "_npa";
        String str5 = "_ai";
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        zzamVar2.zzw();
        try {
            zzkq zzkqVar3 = new zzkq(this, null);
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzU(null, j, this.zzA, zzkqVar3);
            List list = zzkqVar3.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgc zzgcVar6 = (com.google.android.gms.internal.measurement.zzgc) zzkqVar3.zza.zzby();
                zzgcVar6.zzr();
                com.google.android.gms.internal.measurement.zzfs zzfsVar6 = null;
                com.google.android.gms.internal.measurement.zzfs zzfsVar7 = null;
                int i9 = 0;
                int i10 = 0;
                int i11 = -1;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    i = i13;
                    str2 = str4;
                    String str6 = str5;
                    if (i9 >= zzkqVar3.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfs zzfsVar8 = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzft) zzkqVar3.zzc.get(i9)).zzby();
                    zzfi zzfiVar = this.zzc;
                    zzal(zzfiVar);
                    int i14 = i10;
                    if (zzfiVar.zzr(zzkqVar3.zza.zzx(), zzfsVar8.zzo())) {
                        zzay().zzk().zzc("Dropping blocked raw event. appId", zzeh.zzn(zzkqVar3.zza.zzx()), this.zzn.zzj().zzd(zzfsVar8.zzo()));
                        zzfi zzfiVar2 = this.zzc;
                        zzal(zzfiVar2);
                        if (!zzfiVar2.zzp(zzkqVar3.zza.zzx())) {
                            zzfi zzfiVar3 = this.zzc;
                            zzal(zzfiVar3);
                            if (!zzfiVar3.zzs(zzkqVar3.zza.zzx()) && !"_err".equals(zzfsVar8.zzo())) {
                                zzv().zzN(this.zzF, zzkqVar3.zza.zzx(), 11, "_ev", zzfsVar8.zzo(), 0);
                            }
                        }
                        i7 = i9;
                        zzfsVar = zzfsVar6;
                        i13 = i;
                        i10 = i14;
                        zzgcVar5 = zzgcVar6;
                    } else {
                        if (zzfsVar8.zzo().equals(zzgo.zza(str6))) {
                            zzfsVar8.zzi(str6);
                            str6 = str6;
                            zzay().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzay().zzq(), 5)) {
                                int i15 = 0;
                                while (i15 < zzfsVar8.zza()) {
                                    int i16 = i9;
                                    if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzfsVar8.zzn(i15).zzg()) && !zzfsVar8.zzn(i15).zzh().isEmpty() && "admob".equalsIgnoreCase(zzfsVar8.zzn(i15).zzh())) {
                                        zzay().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i15++;
                                    i9 = i16;
                                }
                            }
                        }
                        int i17 = i9;
                        zzfi zzfiVar4 = this.zzc;
                        zzal(zzfiVar4);
                        boolean zzq = zzfiVar4.zzq(zzkqVar3.zza.zzx(), zzfsVar8.zzo());
                        if (zzq) {
                            zzfsVar = zzfsVar6;
                            i2 = i11;
                        } else {
                            zzal(this.zzi);
                            String zzo = zzfsVar8.zzo();
                            Preconditions.checkNotEmpty(zzo);
                            i2 = i11;
                            int hashCode = zzo.hashCode();
                            zzfsVar = zzfsVar6;
                            if (hashCode == 94660) {
                                if (zzo.equals("_in")) {
                                    c = 0;
                                    if (c != 0) {
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                }
                            } else if (hashCode != 95025) {
                                if (hashCode == 95027 && zzo.equals("_ui")) {
                                    c = 1;
                                    if (c != 0 && c != 1 && c != 2) {
                                        zzgcVar4 = zzgcVar6;
                                        str3 = "_et";
                                        zzfsVar2 = zzfsVar7;
                                        i3 = i12;
                                        zzq = false;
                                        if (zzq) {
                                            ArrayList arrayList = new ArrayList(zzfsVar8.zzp());
                                            int i18 = -1;
                                            int i19 = -1;
                                            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                if ("value".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i20)).zzg())) {
                                                    i18 = i20;
                                                } else if (FirebaseAnalytics.Param.CURRENCY.equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i20)).zzg())) {
                                                    i19 = i20;
                                                }
                                            }
                                            if (i18 != -1) {
                                                if (((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i18)).zzw() || ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i18)).zzu()) {
                                                    if (i19 != -1) {
                                                        String zzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i19)).zzh();
                                                        if (zzh.length() == 3) {
                                                            int i21 = 0;
                                                            while (i21 < zzh.length()) {
                                                                int codePointAt = zzh.codePointAt(i21);
                                                                if (Character.isLetter(codePointAt)) {
                                                                    i21 += Character.charCount(codePointAt);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                    zzfsVar8.zzh(i18);
                                                    zzab(zzfsVar8, "_c");
                                                    zzaa(zzfsVar8, 19, FirebaseAnalytics.Param.CURRENCY);
                                                    break;
                                                }
                                                zzay().zzl().zza("Value must be specified with a numeric type.");
                                                zzfsVar8.zzh(i18);
                                                zzab(zzfsVar8, "_c");
                                                zzaa(zzfsVar8, 18, "value");
                                            }
                                            if ("_e".equals(zzfsVar8.zzo())) {
                                                i5 = i3;
                                                zzgcVar5 = zzgcVar4;
                                                if ("_vs".equals(zzfsVar8.zzo())) {
                                                    zzal(this.zzi);
                                                    if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC(), str3) == null) {
                                                        if (zzfsVar == null || Math.abs(zzfsVar.zzc() - zzfsVar8.zzc()) > 1000) {
                                                            zzfsVar7 = zzfsVar8;
                                                            i11 = i2;
                                                            i12 = i14;
                                                        } else {
                                                            com.google.android.gms.internal.measurement.zzfs zzfsVar9 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar.clone();
                                                            if (zzaj(zzfsVar9, zzfsVar8)) {
                                                                i6 = i2;
                                                                zzgcVar5.zzS(i6, zzfsVar9);
                                                                i12 = i5;
                                                                zzfsVar4 = null;
                                                                zzfsVar = null;
                                                            } else {
                                                                i6 = i2;
                                                                zzfsVar4 = zzfsVar8;
                                                                i12 = i14;
                                                            }
                                                            zzfsVar7 = zzfsVar4;
                                                            i11 = i6;
                                                        }
                                                    }
                                                }
                                                i6 = i2;
                                                i12 = i5;
                                                zzfsVar7 = zzfsVar2;
                                                i11 = i6;
                                            } else {
                                                zzal(this.zzi);
                                                if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC(), "_fr") != null) {
                                                    i5 = i3;
                                                    zzgcVar5 = zzgcVar4;
                                                    i6 = i2;
                                                    i12 = i5;
                                                    zzfsVar7 = zzfsVar2;
                                                    i11 = i6;
                                                } else if (zzfsVar2 == null || Math.abs(zzfsVar2.zzc() - zzfsVar8.zzc()) > 1000) {
                                                    zzgcVar5 = zzgcVar4;
                                                    zzfsVar = zzfsVar8;
                                                    i12 = i3;
                                                    zzfsVar7 = zzfsVar2;
                                                    i11 = i14;
                                                } else {
                                                    com.google.android.gms.internal.measurement.zzfs zzfsVar10 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar2.clone();
                                                    if (zzaj(zzfsVar8, zzfsVar10)) {
                                                        i8 = i3;
                                                        zzgcVar5 = zzgcVar4;
                                                        zzgcVar5.zzS(i8, zzfsVar10);
                                                        i11 = i2;
                                                        zzfsVar5 = null;
                                                        zzfsVar7 = null;
                                                    } else {
                                                        i8 = i3;
                                                        zzgcVar5 = zzgcVar4;
                                                        zzfsVar5 = zzfsVar8;
                                                        zzfsVar7 = zzfsVar2;
                                                        i11 = i14;
                                                    }
                                                    zzfsVar = zzfsVar5;
                                                    i12 = i8;
                                                }
                                            }
                                            i7 = i17;
                                            zzkqVar3.zzc.set(i7, (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC());
                                            i10 = i14 + 1;
                                            zzgcVar5.zzk(zzfsVar8);
                                            i13 = i;
                                        }
                                        if ("_e".equals(zzfsVar8.zzo())) {
                                        }
                                        i7 = i17;
                                        zzkqVar3.zzc.set(i7, (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC());
                                        i10 = i14 + 1;
                                        zzgcVar5.zzk(zzfsVar8);
                                        i13 = i;
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                    zzgcVar4 = zzgcVar6;
                                    str3 = "_et";
                                    zzfsVar2 = zzfsVar7;
                                    i3 = i12;
                                    zzq = false;
                                    if (zzq) {
                                    }
                                    if ("_e".equals(zzfsVar8.zzo())) {
                                    }
                                    i7 = i17;
                                    zzkqVar3.zzc.set(i7, (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC());
                                    i10 = i14 + 1;
                                    zzgcVar5.zzk(zzfsVar8);
                                    i13 = i;
                                }
                            } else {
                                if (zzo.equals("_ug")) {
                                    c = 2;
                                    if (c != 0) {
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                }
                            }
                        }
                        str3 = "_et";
                        int i22 = 0;
                        boolean z = false;
                        boolean z2 = false;
                        while (true) {
                            zzgcVar4 = zzgcVar6;
                            if (i22 >= zzfsVar8.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfsVar8.zzn(i22).zzg())) {
                                com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfsVar8.zzn(i22).zzby();
                                zzfsVar3 = zzfsVar7;
                                i4 = i12;
                                zzfwVar.zzi(1L);
                                zzfsVar8.zzk(i22, (com.google.android.gms.internal.measurement.zzfx) zzfwVar.zzaC());
                                z = true;
                            } else {
                                zzfsVar3 = zzfsVar7;
                                i4 = i12;
                                if ("_r".equals(zzfsVar8.zzn(i22).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfsVar8.zzn(i22).zzby();
                                    zzfwVar2.zzi(1L);
                                    zzfsVar8.zzk(i22, (com.google.android.gms.internal.measurement.zzfx) zzfwVar2.zzaC());
                                    z2 = true;
                                }
                            }
                            i22++;
                            zzfsVar7 = zzfsVar3;
                            i12 = i4;
                            zzgcVar6 = zzgcVar4;
                        }
                        zzfsVar2 = zzfsVar7;
                        i3 = i12;
                        if (!z && zzq) {
                            zzay().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfsVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze.zzj("_c");
                            zze.zzi(1L);
                            zzfsVar8.zze(zze);
                        }
                        if (!z2) {
                            zzay().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfsVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze2.zzj("_r");
                            zze2.zzi(1L);
                            zzfsVar8.zze(zze2);
                        }
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        if (zzamVar4.zzl(zza(), zzkqVar3.zza.zzx(), false, false, false, false, true).zze > zzg().zze(zzkqVar3.zza.zzx(), zzdu.zzn)) {
                            zzab(zzfsVar8, "_r");
                        } else {
                            i = 1;
                        }
                        if (zzlb.zzai(zzfsVar8.zzo()) && zzq) {
                            zzam zzamVar5 = this.zze;
                            zzal(zzamVar5);
                            if (zzamVar5.zzl(zza(), zzkqVar3.zza.zzx(), false, false, true, false, false).zzc > zzg().zze(zzkqVar3.zza.zzx(), zzdu.zzm)) {
                                zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeh.zzn(zzkqVar3.zza.zzx()));
                                com.google.android.gms.internal.measurement.zzfw zzfwVar3 = null;
                                boolean z3 = false;
                                int i23 = -1;
                                for (int i24 = 0; i24 < zzfsVar8.zza(); i24++) {
                                    com.google.android.gms.internal.measurement.zzfx zzn = zzfsVar8.zzn(i24);
                                    if ("_c".equals(zzn.zzg())) {
                                        zzfwVar3 = (com.google.android.gms.internal.measurement.zzfw) zzn.zzby();
                                        i23 = i24;
                                    } else if ("_err".equals(zzn.zzg())) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    if (zzfwVar3 != null) {
                                        zzfsVar8.zzh(i23);
                                    } else {
                                        zzfwVar3 = null;
                                    }
                                }
                                if (zzfwVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar4 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar3.clone();
                                    zzfwVar4.zzj("_err");
                                    zzfwVar4.zzi(10L);
                                    zzfsVar8.zzk(i23, (com.google.android.gms.internal.measurement.zzfx) zzfwVar4.zzaC());
                                } else {
                                    zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(zzkqVar3.zza.zzx()));
                                }
                            }
                        }
                        if (zzq) {
                        }
                        if ("_e".equals(zzfsVar8.zzo())) {
                        }
                        i7 = i17;
                        zzkqVar3.zzc.set(i7, (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC());
                        i10 = i14 + 1;
                        zzgcVar5.zzk(zzfsVar8);
                        i13 = i;
                    }
                    i9 = i7 + 1;
                    zzgcVar6 = zzgcVar5;
                    str4 = str2;
                    str5 = str6;
                    zzfsVar6 = zzfsVar;
                }
                com.google.android.gms.internal.measurement.zzgc zzgcVar7 = zzgcVar6;
                long j3 = 0;
                int i25 = 0;
                while (i25 < i10) {
                    com.google.android.gms.internal.measurement.zzft zze3 = zzgcVar7.zze(i25);
                    if ("_e".equals(zze3.zzh())) {
                        zzal(this.zzi);
                        if (zzkv.zzB(zze3, "_fr") != null) {
                            zzgcVar7.zzA(i25);
                            i10--;
                            i25--;
                            i25++;
                        }
                    }
                    zzal(this.zzi);
                    com.google.android.gms.internal.measurement.zzfx zzB = zzkv.zzB(zze3, "_et");
                    if (zzB != null) {
                        Long valueOf = zzB.zzw() ? Long.valueOf(zzB.zzd()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j3 += valueOf.longValue();
                        }
                    }
                    i25++;
                }
                zzaf(zzgcVar7, j3, false);
                Iterator it = zzgcVar7.zzas().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it.next()).zzh())) {
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzA(zzgcVar7.zzap(), "_se");
                        break;
                    }
                }
                if (zzkv.zza(zzgcVar7, "_sid") >= 0) {
                    zzaf(zzgcVar7, j3, true);
                } else {
                    int zza = zzkv.zza(zzgcVar7, "_se");
                    if (zza >= 0) {
                        zzgcVar7.zzB(zza);
                        zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeh.zzn(zzkqVar3.zza.zzx()));
                    }
                }
                zzkv zzkvVar = this.zzi;
                zzal(zzkvVar);
                zzkvVar.zzt.zzay().zzj().zza("Checking account type status for ad personalization signals");
                zzfi zzfiVar5 = zzkvVar.zzf.zzc;
                zzal(zzfiVar5);
                if (zzfiVar5.zzn(zzgcVar7.zzap())) {
                    zzam zzamVar7 = zzkvVar.zzf.zze;
                    zzal(zzamVar7);
                    zzh zzj = zzamVar7.zzj(zzgcVar7.zzap());
                    if (zzj != null && zzj.zzah() && zzkvVar.zzt.zzg().zze()) {
                        zzkvVar.zzt.zzay().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzd.zzf(str2);
                        zzd.zzg(zzkvVar.zzt.zzg().zza());
                        zzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaC();
                        int i26 = 0;
                        while (true) {
                            if (i26 >= zzgcVar7.zzb()) {
                                zzgcVar7.zzm(zzgmVar);
                                break;
                            }
                            if (str2.equals(zzgcVar7.zzao(i26).zzf())) {
                                zzgcVar7.zzam(i26, zzgmVar);
                                break;
                            }
                            i26++;
                        }
                    }
                }
                zzgcVar7.zzai(Long.MAX_VALUE);
                zzgcVar7.zzQ(Long.MIN_VALUE);
                for (int i27 = 0; i27 < zzgcVar7.zza(); i27++) {
                    com.google.android.gms.internal.measurement.zzft zze4 = zzgcVar7.zze(i27);
                    if (zze4.zzd() < zzgcVar7.zzd()) {
                        zzgcVar7.zzai(zze4.zzd());
                    }
                    if (zze4.zzd() > zzgcVar7.zzc()) {
                        zzgcVar7.zzQ(zze4.zzd());
                    }
                }
                zzgcVar7.zzz();
                zzgcVar7.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgcVar7.zzf(zzaaVar.zza(zzgcVar7.zzap(), zzgcVar7.zzas(), zzgcVar7.zzat(), Long.valueOf(zzgcVar7.zzd()), Long.valueOf(zzgcVar7.zzc())));
                if (zzg().zzw(zzkqVar3.zza.zzx())) {
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom zzG = zzv().zzG();
                    int i28 = 0;
                    while (i28 < zzgcVar7.zza()) {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar11 = (com.google.android.gms.internal.measurement.zzfs) zzgcVar7.zze(i28).zzby();
                        if (zzfsVar11.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str7 = (String) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC(), "_en");
                            zzas zzasVar = (zzas) hashMap3.get(str7);
                            if (zzasVar == null) {
                                zzam zzamVar8 = this.zze;
                                zzal(zzamVar8);
                                zzasVar = zzamVar8.zzn(zzkqVar3.zza.zzx(), (String) Preconditions.checkNotNull(str7));
                                if (zzasVar != null) {
                                    hashMap3.put(str7, zzasVar);
                                }
                            }
                            if (zzasVar != null && zzasVar.zzi == null) {
                                Long l2 = zzasVar.zzj;
                                if (l2 != null && l2.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzkv.zzz(zzfsVar11, "_sr", zzasVar.zzj);
                                }
                                Boolean bool = zzasVar.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzal(this.zzi);
                                    zzkv.zzz(zzfsVar11, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                            }
                            zzgcVar7.zzS(i28, zzfsVar11);
                        } else {
                            zzfi zzfiVar6 = this.zzc;
                            zzal(zzfiVar6);
                            String zzx = zzkqVar3.zza.zzx();
                            String zza2 = zzfiVar6.zza(zzx, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(zza2)) {
                                try {
                                    parseLong = Long.parseLong(zza2);
                                } catch (NumberFormatException e) {
                                    zzfiVar6.zzt.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeh.zzn(zzx), e);
                                }
                                long zzr2 = zzv().zzr(zzfsVar11.zzc(), parseLong);
                                com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC();
                                Long l3 = 1L;
                                long j4 = parseLong;
                                if (!TextUtils.isEmpty("_dbg")) {
                                    Iterator it2 = zzftVar.zzi().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                                        Iterator it3 = it2;
                                        if (!"_dbg".equals(zzfxVar.zzg())) {
                                            it2 = it3;
                                        } else if (l3.equals(Long.valueOf(zzfxVar.zzd()))) {
                                            zzc = 1;
                                        }
                                    }
                                }
                                zzfi zzfiVar7 = this.zzc;
                                zzal(zzfiVar7);
                                zzc = zzfiVar7.zzc(zzkqVar3.zza.zzx(), zzfsVar11.zzo());
                                if (zzc > 0) {
                                    zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfsVar11.zzo(), Integer.valueOf(zzc));
                                    arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                                    zzgcVar7.zzS(i28, zzfsVar11);
                                } else {
                                    zzas zzasVar2 = (zzas) hashMap3.get(zzfsVar11.zzo());
                                    if (zzasVar2 == null) {
                                        zzam zzamVar9 = this.zze;
                                        zzal(zzamVar9);
                                        zzasVar2 = zzamVar9.zzn(zzkqVar3.zza.zzx(), zzfsVar11.zzo());
                                        if (zzasVar2 == null) {
                                            j2 = zzr2;
                                            zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzkqVar3.zza.zzx(), zzfsVar11.zzo());
                                            zzasVar2 = new zzas(zzkqVar3.zza.zzx(), zzfsVar11.zzo(), 1L, 1L, 1L, zzfsVar11.zzc(), 0L, null, null, null, null);
                                            zzal(this.zzi);
                                            Long l4 = (Long) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC(), "_eid");
                                            Boolean valueOf2 = Boolean.valueOf(l4 == null);
                                            if (zzc != 1) {
                                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                                                if (valueOf2.booleanValue() && (zzasVar2.zzi != null || zzasVar2.zzj != null || zzasVar2.zzk != null)) {
                                                    hashMap3.put(zzfsVar11.zzo(), zzasVar2.zza(null, null, null));
                                                }
                                                zzgcVar7.zzS(i28, zzfsVar11);
                                            } else {
                                                if (zzG.nextInt(zzc) == 0) {
                                                    zzal(this.zzi);
                                                    Long valueOf3 = Long.valueOf(zzc);
                                                    zzkv.zzz(zzfsVar11, "_sr", valueOf3);
                                                    arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                                                    if (valueOf2.booleanValue()) {
                                                        zzasVar2 = zzasVar2.zza(null, valueOf3, null);
                                                    }
                                                    hashMap3.put(zzfsVar11.zzo(), zzasVar2.zzb(zzfsVar11.zzc(), j2));
                                                    zzkqVar2 = zzkqVar3;
                                                    secureRandom = zzG;
                                                    zzgcVar3 = zzgcVar7;
                                                    hashMap2 = hashMap3;
                                                } else {
                                                    long j5 = j2;
                                                    secureRandom = zzG;
                                                    Long l5 = zzasVar2.zzh;
                                                    if (l5 != null) {
                                                        zzr = l5.longValue();
                                                        zzkqVar2 = zzkqVar3;
                                                        hashMap = hashMap3;
                                                        zzgcVar2 = zzgcVar7;
                                                        l = l4;
                                                    } else {
                                                        zzgcVar2 = zzgcVar7;
                                                        l = l4;
                                                        zzkqVar2 = zzkqVar3;
                                                        hashMap = hashMap3;
                                                        zzr = zzv().zzr(zzfsVar11.zzb(), j4);
                                                    }
                                                    if (zzr != j5) {
                                                        zzal(this.zzi);
                                                        zzkv.zzz(zzfsVar11, "_efs", 1L);
                                                        zzal(this.zzi);
                                                        Long valueOf4 = Long.valueOf(zzc);
                                                        zzkv.zzz(zzfsVar11, "_sr", valueOf4);
                                                        arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                                                        if (valueOf2.booleanValue()) {
                                                            zzasVar2 = zzasVar2.zza(null, valueOf4, true);
                                                        }
                                                        hashMap2 = hashMap;
                                                        hashMap2.put(zzfsVar11.zzo(), zzasVar2.zzb(zzfsVar11.zzc(), j5));
                                                    } else {
                                                        hashMap2 = hashMap;
                                                        if (valueOf2.booleanValue()) {
                                                            hashMap2.put(zzfsVar11.zzo(), zzasVar2.zza(l, null, null));
                                                        }
                                                    }
                                                    zzgcVar3 = zzgcVar2;
                                                }
                                                zzgcVar3.zzS(i28, zzfsVar11);
                                                i28++;
                                                zzgcVar7 = zzgcVar3;
                                                hashMap3 = hashMap2;
                                                zzG = secureRandom;
                                                zzkqVar3 = zzkqVar2;
                                            }
                                        }
                                    }
                                    j2 = zzr2;
                                    zzal(this.zzi);
                                    Long l42 = (Long) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC(), "_eid");
                                    Boolean valueOf22 = Boolean.valueOf(l42 == null);
                                    if (zzc != 1) {
                                    }
                                }
                            }
                            parseLong = 0;
                            long zzr22 = zzv().zzr(zzfsVar11.zzc(), parseLong);
                            com.google.android.gms.internal.measurement.zzft zzftVar2 = (com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC();
                            Long l32 = 1L;
                            long j42 = parseLong;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            zzfi zzfiVar72 = this.zzc;
                            zzal(zzfiVar72);
                            zzc = zzfiVar72.zzc(zzkqVar3.zza.zzx(), zzfsVar11.zzo());
                            if (zzc > 0) {
                            }
                        }
                        zzkqVar2 = zzkqVar3;
                        secureRandom = zzG;
                        zzgcVar3 = zzgcVar7;
                        hashMap2 = hashMap3;
                        i28++;
                        zzgcVar7 = zzgcVar3;
                        hashMap3 = hashMap2;
                        zzG = secureRandom;
                        zzkqVar3 = zzkqVar2;
                    }
                    zzkq zzkqVar4 = zzkqVar3;
                    HashMap hashMap4 = hashMap3;
                    zzgcVar = zzgcVar7;
                    if (arrayList2.size() < zzgcVar.zza()) {
                        zzgcVar.zzr();
                        zzgcVar.zzg(arrayList2);
                    }
                    for (Map.Entry entry : hashMap4.entrySet()) {
                        zzam zzamVar10 = this.zze;
                        zzal(zzamVar10);
                        zzamVar10.zzE((zzas) entry.getValue());
                    }
                    zzkqVar = zzkqVar4;
                } else {
                    zzgcVar = zzgcVar7;
                    zzkqVar = zzkqVar3;
                }
                String zzx2 = zzkqVar.zza.zzx();
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzh zzj2 = zzamVar11.zzj(zzx2);
                if (zzj2 == null) {
                    zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeh.zzn(zzkqVar.zza.zzx()));
                } else if (zzgcVar.zza() > 0) {
                    long zzn2 = zzj2.zzn();
                    if (zzn2 != 0) {
                        zzgcVar.zzab(zzn2);
                    } else {
                        zzgcVar.zzv();
                    }
                    long zzp = zzj2.zzp();
                    if (zzp != 0) {
                        zzn2 = zzp;
                    }
                    if (zzn2 != 0) {
                        zzgcVar.zzac(zzn2);
                    } else {
                        zzgcVar.zzw();
                    }
                    zzj2.zzE();
                    zzgcVar.zzI((int) zzj2.zzo());
                    zzj2.zzab(zzgcVar.zzd());
                    zzj2.zzZ(zzgcVar.zzc());
                    String zzs = zzj2.zzs();
                    if (zzs != null) {
                        zzgcVar.zzW(zzs);
                    } else {
                        zzgcVar.zzs();
                    }
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    zzamVar12.zzD(zzj2);
                }
                if (zzgcVar.zza() > 0) {
                    this.zzn.zzaw();
                    zzfi zzfiVar8 = this.zzc;
                    zzal(zzfiVar8);
                    com.google.android.gms.internal.measurement.zzff zze5 = zzfiVar8.zze(zzkqVar.zza.zzx());
                    try {
                        try {
                            if (zze5 != null && zze5.zzs()) {
                                zzgcVar.zzK(zze5.zzc());
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC();
                                zzamVar.zzg();
                                zzamVar.zzW();
                                Preconditions.checkNotNull(zzgdVar);
                                Preconditions.checkNotEmpty(zzgdVar.zzx());
                                Preconditions.checkState(zzgdVar.zzbe());
                                zzamVar.zzz();
                                currentTimeMillis = zzamVar.zzt.zzav().currentTimeMillis();
                                zzk = zzgdVar.zzk();
                                zzamVar.zzt.zzf();
                                if (zzk >= currentTimeMillis - zzag.zzA()) {
                                    long zzk2 = zzgdVar.zzk();
                                    zzamVar.zzt.zzf();
                                }
                                zzamVar.zzt.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzgdVar.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                                byte[] zzbu = zzgdVar.zzbu();
                                zzkv zzkvVar2 = zzamVar.zzf.zzi;
                                zzal(zzkvVar2);
                                byte[] zzy = zzkvVar2.zzy(zzbu);
                                zzamVar.zzt.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(zzy.length));
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzgdVar.zzx());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                                contentValues.put("data", zzy);
                                contentValues.put("has_realtime", Integer.valueOf(i));
                                if (zzgdVar.zzbk()) {
                                    contentValues.put("retry_count", Integer.valueOf(zzgdVar.zze()));
                                }
                                if (zzamVar.zzh().insert("queue", null, contentValues) == -1) {
                                    zzamVar.zzt.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeh.zzn(zzgdVar.zzx()));
                                }
                            }
                            if (zzamVar.zzh().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e2) {
                            zzamVar.zzt.zzay().zzd().zzc("Error storing bundle. appId", zzeh.zzn(zzgdVar.zzx()), e2);
                        }
                        zzkv zzkvVar22 = zzamVar.zzf.zzi;
                        zzal(zzkvVar22);
                        byte[] zzy2 = zzkvVar22.zzy(zzbu);
                        zzamVar.zzt.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(zzy2.length));
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzgdVar.zzx());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                        contentValues.put("data", zzy2);
                        contentValues.put("has_realtime", Integer.valueOf(i));
                        if (zzgdVar.zzbk()) {
                        }
                    } catch (IOException e3) {
                        zzamVar.zzt.zzay().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeh.zzn(zzgdVar.zzx()), e3);
                    }
                    if (zzkqVar.zza.zzF().isEmpty()) {
                        zzgcVar.zzK(-1L);
                    } else {
                        zzay().zzk().zzb("Did not find measurement config or missing version info. appId", zzeh.zzn(zzkqVar.zza.zzx()));
                    }
                    zzamVar = this.zze;
                    zzal(zzamVar);
                    zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC();
                    zzamVar.zzg();
                    zzamVar.zzW();
                    Preconditions.checkNotNull(zzgdVar);
                    Preconditions.checkNotEmpty(zzgdVar.zzx());
                    Preconditions.checkState(zzgdVar.zzbe());
                    zzamVar.zzz();
                    currentTimeMillis = zzamVar.zzt.zzav().currentTimeMillis();
                    zzk = zzgdVar.zzk();
                    zzamVar.zzt.zzf();
                    if (zzk >= currentTimeMillis - zzag.zzA()) {
                    }
                    zzamVar.zzt.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzgdVar.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                    byte[] zzbu2 = zzgdVar.zzbu();
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                List list2 = zzkqVar.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i29 = 0; i29 < list2.size(); i29++) {
                    if (i29 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) list2.get(i29)).longValue());
                }
                sb.append(")");
                int delete = zzamVar13.zzh().delete("raw_events", sb.toString(), null);
                if (delete != list2.size()) {
                    zzamVar13.zzt.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzx2, zzx2});
                } catch (SQLiteException e4) {
                    zzamVar14.zzt.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeh.zzn(zzx2), e4);
                }
                zzam zzamVar15 = this.zze;
                zzal(zzamVar15);
                zzamVar15.zzC();
                zzam zzamVar16 = this.zze;
                zzal(zzamVar16);
                zzamVar16.zzx();
                return true;
            }
            zzam zzamVar17 = this.zze;
            zzal(zzamVar17);
            zzamVar17.zzC();
            zzam zzamVar18 = this.zze;
            zzal(zzamVar18);
            zzamVar18.zzx();
            return false;
        } catch (Throwable th) {
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            zzamVar19.zzx();
            throw th;
        }
    }

    private final boolean zzai() {
        zzaz().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (zzamVar.zzF()) {
            return true;
        }
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        return !TextUtils.isEmpty(zzamVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC(), "_sc");
        String zzh = zzB == null ? null : zzB.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB2 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaC(), "_pc");
        String zzh2 = zzB2 != null ? zzB2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB3 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC(), "_et");
        if (zzB3 == null || !zzB3.zzw() || zzB3.zzd() <= 0) {
            return true;
        }
        long zzd = zzB3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB4 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaC(), "_et");
        if (zzB4 != null && zzB4.zzd() > 0) {
            zzd += zzB4.zzd();
        }
        zzal(this.zzi);
        zzkv.zzz(zzfsVar2, "_et", Long.valueOf(zzd));
        zzal(this.zzi);
        zzkv.zzz(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkh zzal(zzkh zzkhVar) {
        if (zzkhVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkhVar.zzY()) {
            return zzkhVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(zzkhVar.getClass()))));
    }

    public static zzkt zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzkt.class) {
                if (zzb == null) {
                    zzb = new zzkt((zzku) Preconditions.checkNotNull(new zzku(context)), null);
                }
            }
        }
        return zzb;
    }

    static /* bridge */ /* synthetic */ void zzy(zzkt zzktVar, zzku zzkuVar) {
        zzktVar.zzaz().zzg();
        zzktVar.zzm = new zzez(zzktVar);
        zzam zzamVar = new zzam(zzktVar);
        zzamVar.zzX();
        zzktVar.zze = zzamVar;
        zzktVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzktVar.zzc));
        zzjo zzjoVar = new zzjo(zzktVar);
        zzjoVar.zzX();
        zzktVar.zzk = zzjoVar;
        zzaa zzaaVar = new zzaa(zzktVar);
        zzaaVar.zzX();
        zzktVar.zzh = zzaaVar;
        zzic zzicVar = new zzic(zzktVar);
        zzicVar.zzX();
        zzktVar.zzj = zzicVar;
        zzkf zzkfVar = new zzkf(zzktVar);
        zzkfVar.zzX();
        zzktVar.zzg = zzkfVar;
        zzktVar.zzf = new zzep(zzktVar);
        if (zzktVar.zzr != zzktVar.zzs) {
            zzktVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzktVar.zzr), Integer.valueOf(zzktVar.zzs));
        }
        zzktVar.zzo = true;
    }

    final void zzA() {
        zzaz().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaz().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzay().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e) {
                    zzay().zzd().zzb("Failed to read from channel", e);
                }
            }
            int zzi = this.zzn.zzh().zzi();
            zzaz().zzg();
            if (i > zzi) {
                zzay().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                return;
            }
            if (i < zzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaz().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzi);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzay().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                        return;
                    } catch (IOException e2) {
                        zzay().zzd().zzb("Failed to write to channel", e2);
                    }
                }
                zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
            }
        }
    }

    final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int zza;
        int indexOf;
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        Set zzk = zzfiVar.zzk(str);
        if (zzk != null) {
            zzgcVar.zzi(zzk);
        }
        zzfi zzfiVar2 = this.zzc;
        zzal(zzfiVar2);
        if (zzfiVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfi zzfiVar3 = this.zzc;
        zzal(zzfiVar3);
        if (zzfiVar3.zzy(str)) {
            if (zzg().zzs(str, zzdu.zzaq)) {
                String zzar = zzgcVar.zzar();
                if (!TextUtils.isEmpty(zzar) && (indexOf = zzar.indexOf(".")) != -1) {
                    zzgcVar.zzY(zzar.substring(0, indexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfi zzfiVar4 = this.zzc;
        zzal(zzfiVar4);
        if (zzfiVar4.zzz(str) && (zza = zzkv.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(zza);
        }
        zzfi zzfiVar5 = this.zzc;
        zzal(zzfiVar5);
        if (zzfiVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfi zzfiVar6 = this.zzc;
        zzal(zzfiVar6);
        if (zzfiVar6.zzu(str)) {
            zzgcVar.zzn();
            zzks zzksVar = (zzks) this.zzC.get(str);
            if (zzksVar == null || zzksVar.zzb + zzg().zzi(str, zzdu.zzR) < zzav().elapsedRealtime()) {
                zzksVar = new zzks(this);
                this.zzC.put(str, zzksVar);
            }
            zzgcVar.zzR(zzksVar.zza);
        }
        zzfi zzfiVar7 = this.zzc;
        zzal(zzfiVar7);
        if (zzfiVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    final void zzD(zzh zzhVar) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        zzaz().zzg();
        if (TextUtils.isEmpty(zzhVar.zzy()) && TextUtils.isEmpty(zzhVar.zzr())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzt()), 204, null, null, null);
            return;
        }
        zzki zzkiVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String zzy = zzhVar.zzy();
        if (TextUtils.isEmpty(zzy)) {
            zzy = zzhVar.zzr();
        }
        ArrayMap arrayMap3 = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) zzdu.zzd.zza(null)).encodedAuthority((String) zzdu.zze.zza(null)).path("config/app/".concat(String.valueOf(zzy))).appendQueryParameter("platform", "android");
        zzkiVar.zzt.zzf().zzh();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzt());
            URL url = new URL(uri);
            zzay().zzj().zzb("Fetching remote configuration", str);
            zzfi zzfiVar = this.zzc;
            zzal(zzfiVar);
            com.google.android.gms.internal.measurement.zzff zze = zzfiVar.zze(str);
            zzfi zzfiVar2 = this.zzc;
            zzal(zzfiVar2);
            String zzh = zzfiVar2.zzh(str);
            if (zze != null) {
                if (TextUtils.isEmpty(zzh)) {
                    arrayMap2 = null;
                } else {
                    arrayMap2 = new ArrayMap();
                    arrayMap2.put(HttpHeaders.IF_MODIFIED_SINCE, zzh);
                }
                zzox.zzc();
                if (zzg().zzs(null, zzdu.zzao)) {
                    zzfi zzfiVar3 = this.zzc;
                    zzal(zzfiVar3);
                    String zzf = zzfiVar3.zzf(str);
                    if (!TextUtils.isEmpty(zzf)) {
                        if (arrayMap2 == null) {
                            arrayMap2 = new ArrayMap();
                        }
                        arrayMap3 = arrayMap2;
                        arrayMap3.put(HttpHeaders.IF_NONE_MATCH, zzf);
                    }
                }
                arrayMap = arrayMap2;
                this.zzt = true;
                zzen zzenVar = this.zzd;
                zzal(zzenVar);
                zzkl zzklVar = new zzkl(this);
                zzenVar.zzg();
                zzenVar.zzW();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(zzklVar);
                zzenVar.zzt.zzaz().zzo(new zzem(zzenVar, str, url, null, arrayMap, zzklVar));
            }
            arrayMap = arrayMap3;
            this.zzt = true;
            zzen zzenVar2 = this.zzd;
            zzal(zzenVar2);
            zzkl zzklVar2 = new zzkl(this);
            zzenVar2.zzg();
            zzenVar2.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzklVar2);
            zzenVar2.zzt.zzaz().zzo(new zzem(zzenVar2, str, url, null, arrayMap, zzklVar2));
        } catch (MalformedURLException unused) {
            zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeh.zzn(zzhVar.zzt()), uri);
        }
    }

    final void zzE(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> zzt;
        List<zzac> zzt2;
        List<zzac> zzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaz().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j = zzawVar.zzd;
        zzei zzb2 = zzei.zzb(zzawVar);
        zzaz().zzg();
        zzie zzieVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zzieVar = this.zzD;
        }
        zzlb.zzK(zzieVar, zzb2.zzd, false);
        zzaw zza = zzb2.zza();
        zzal(this.zzi);
        if (zzkv.zzA(zza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzawVar2 = zza;
            } else if (!list.contains(zza.zza)) {
                zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zza.zza, zza.zzc);
                return;
            } else {
                Bundle zzc = zza.zzb.zzc();
                zzc.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(zza.zza, new zzau(zzc), zza.zzc, zza.zzd);
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                Preconditions.checkNotEmpty(str2);
                zzamVar2.zzg();
                zzamVar2.zzW();
                if (j < 0) {
                    zzamVar2.zzt.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeh.zzn(str2), Long.valueOf(j));
                    zzt = Collections.emptyList();
                } else {
                    zzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzacVar : zzt) {
                    if (zzacVar != null) {
                        zzay().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar3 = zzacVar.zzg;
                        if (zzawVar3 != null) {
                            zzY(new zzaw(zzawVar3, j), zzqVar);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zza(str2, zzacVar.zzc.zzb);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                Preconditions.checkNotEmpty(str2);
                zzamVar4.zzg();
                zzamVar4.zzW();
                if (j < 0) {
                    zzamVar4.zzt.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeh.zzn(str2), Long.valueOf(j));
                    zzt2 = Collections.emptyList();
                } else {
                    zzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(zzt2.size());
                for (zzac zzacVar2 : zzt2) {
                    if (zzacVar2 != null) {
                        zzay().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(str2, zzacVar2.zzc.zzb);
                        zzaw zzawVar4 = zzacVar2.zzk;
                        if (zzawVar4 != null) {
                            arrayList.add(zzawVar4);
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zza(str2, zzacVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY(new zzaw((zzaw) it.next(), j), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                String str3 = zzawVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j < 0) {
                    zzamVar7.zzt.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeh.zzn(str2), zzamVar7.zzt.zzj().zzd(str3), Long.valueOf(j));
                    zzt3 = Collections.emptyList();
                } else {
                    zzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(zzt3.size());
                for (zzac zzacVar3 : zzt3) {
                    if (zzacVar3 != null) {
                        zzkw zzkwVar = zzacVar3.zzc;
                        zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzkwVar.zzb, j, Preconditions.checkNotNull(zzkwVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        if (zzamVar8.zzL(zzkyVar)) {
                            zzay().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                        } else {
                            zzay().zzd().zzd("Too many active user properties, ignoring", zzeh.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                        }
                        zzaw zzawVar5 = zzacVar3.zzi;
                        if (zzawVar5 != null) {
                            arrayList2.add(zzawVar5);
                        }
                        zzacVar3.zzc = new zzkw(zzkyVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzawVar2, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzaw((zzaw) it2.next(), j), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzad = zzad(zzj);
        if (zzad == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzeh.zzn(str));
            }
        } else if (!zzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzeh.zzn(str));
            return;
        }
        String zzy = zzj.zzy();
        String zzw = zzj.zzw();
        long zzb2 = zzj.zzb();
        String zzv = zzj.zzv();
        long zzm = zzj.zzm();
        long zzj2 = zzj.zzj();
        boolean zzai = zzj.zzai();
        String zzx = zzj.zzx();
        zzj.zza();
        zzG(zzawVar, new zzq(str, zzy, zzw, zzb2, zzv, zzm, zzj2, (String) null, zzai, false, zzx, 0L, 0L, 0, zzj.zzah(), false, zzj.zzr(), zzj.zzq(), zzj.zzk(), zzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null));
    }

    final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzei zzb2 = zzei.zzb(zzawVar);
        zzlb zzv = zzv();
        Bundle bundle = zzb2.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzM(zzb2, zzg().zzd(zzqVar.zza));
        zzaw zza = zzb2.zza();
        if ("_cmp".equals(zza.zza) && "referrer API v2".equals(zza.zzb.zzg("_cis"))) {
            String zzg = zza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg)) {
                zzW(new zzkw("_lgclid", zza.zzd, zzg, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
            }
        }
        zzE(zza, zzqVar);
    }

    final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:5:0x002c, B:13:0x0049, B:14:0x016f, B:24:0x0063, B:28:0x00b5, B:29:0x00a6, B:32:0x00bd, B:34:0x00c9, B:36:0x00cf, B:37:0x00d7, B:40:0x00e8, B:42:0x00f4, B:44:0x00fa, B:48:0x0107, B:49:0x0123, B:51:0x0138, B:52:0x0157, B:54:0x0162, B:56:0x0168, B:57:0x016c, B:58:0x0146, B:59:0x0110, B:61:0x011b), top: B:4:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:5:0x002c, B:13:0x0049, B:14:0x016f, B:24:0x0063, B:28:0x00b5, B:29:0x00a6, B:32:0x00bd, B:34:0x00c9, B:36:0x00cf, B:37:0x00d7, B:40:0x00e8, B:42:0x00f4, B:44:0x00fa, B:48:0x0107, B:49:0x0123, B:51:0x0138, B:52:0x0157, B:54:0x0162, B:56:0x0168, B:57:0x016c, B:58:0x0146, B:59:0x0110, B:61:0x011b), top: B:4:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:5:0x002c, B:13:0x0049, B:14:0x016f, B:24:0x0063, B:28:0x00b5, B:29:0x00a6, B:32:0x00bd, B:34:0x00c9, B:36:0x00cf, B:37:0x00d7, B:40:0x00e8, B:42:0x00f4, B:44:0x00fa, B:48:0x0107, B:49:0x0123, B:51:0x0138, B:52:0x0157, B:54:0x0162, B:56:0x0168, B:57:0x016c, B:58:0x0146, B:59:0x0110, B:61:0x011b), top: B:4:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:5:0x002c, B:13:0x0049, B:14:0x016f, B:24:0x0063, B:28:0x00b5, B:29:0x00a6, B:32:0x00bd, B:34:0x00c9, B:36:0x00cf, B:37:0x00d7, B:40:0x00e8, B:42:0x00f4, B:44:0x00fa, B:48:0x0107, B:49:0x0123, B:51:0x0138, B:52:0x0157, B:54:0x0162, B:56:0x0168, B:57:0x016c, B:58:0x0146, B:59:0x0110, B:61:0x011b), top: B:4:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:5:0x002c, B:13:0x0049, B:14:0x016f, B:24:0x0063, B:28:0x00b5, B:29:0x00a6, B:32:0x00bd, B:34:0x00c9, B:36:0x00cf, B:37:0x00d7, B:40:0x00e8, B:42:0x00f4, B:44:0x00fa, B:48:0x0107, B:49:0x0123, B:51:0x0138, B:52:0x0157, B:54:0x0162, B:56:0x0168, B:57:0x016c, B:58:0x0146, B:59:0x0110, B:61:0x011b), top: B:4:0x002c, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzI(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        String str2;
        zzfi zzfiVar;
        zzen zzenVar;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzt = false;
                zzae();
            }
        }
        zzef zzj = zzay().zzj();
        Integer valueOf = Integer.valueOf(bArr.length);
        zzj.zzb("onConfigFetched. Response size", valueOf);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzh zzj2 = zzamVar2.zzj(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (zzj2 == null) {
                    zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeh.zzn(str));
                } else {
                    if (!z && i != 404) {
                        zzj2.zzU(zzav().currentTimeMillis());
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zzD(zzj2);
                        zzay().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                        zzfi zzfiVar2 = this.zzc;
                        zzal(zzfiVar2);
                        zzfiVar2.zzl(str);
                        this.zzk.zzd.zzb(zzav().currentTimeMillis());
                        if (i == 503 || i == 429) {
                            this.zzk.zzb.zzb(zzav().currentTimeMillis());
                        }
                        zzag();
                    }
                    List list = map != null ? (List) map.get(HttpHeaders.LAST_MODIFIED) : null;
                    String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                    zzox.zzc();
                    if (zzg().zzs(null, zzdu.zzao)) {
                        List list2 = map != null ? (List) map.get(HttpHeaders.ETAG) : null;
                        if (list2 != null && !list2.isEmpty()) {
                            str2 = (String) list2.get(0);
                            if (i != 404 && i != 304) {
                                zzfi zzfiVar3 = this.zzc;
                                zzal(zzfiVar3);
                                zzfiVar3.zzt(str, bArr, str3, str2);
                                zzj2.zzL(zzav().currentTimeMillis());
                                zzam zzamVar4 = this.zze;
                                zzal(zzamVar4);
                                zzamVar4.zzD(zzj2);
                                if (i != 404) {
                                    zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                                } else {
                                    zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                                }
                                zzenVar = this.zzd;
                                zzal(zzenVar);
                                if (zzenVar.zza() || !zzai()) {
                                    zzag();
                                } else {
                                    zzX();
                                }
                            }
                            zzfiVar = this.zzc;
                            zzal(zzfiVar);
                            if (zzfiVar.zze(str) == null) {
                                zzfi zzfiVar4 = this.zzc;
                                zzal(zzfiVar4);
                                zzfiVar4.zzt(str, null, null, null);
                            }
                            zzj2.zzL(zzav().currentTimeMillis());
                            zzam zzamVar42 = this.zze;
                            zzal(zzamVar42);
                            zzamVar42.zzD(zzj2);
                            if (i != 404) {
                            }
                            zzenVar = this.zzd;
                            zzal(zzenVar);
                            if (zzenVar.zza()) {
                            }
                            zzag();
                        }
                    }
                    str2 = null;
                    if (i != 404) {
                        zzfi zzfiVar32 = this.zzc;
                        zzal(zzfiVar32);
                        zzfiVar32.zzt(str, bArr, str3, str2);
                        zzj2.zzL(zzav().currentTimeMillis());
                        zzam zzamVar422 = this.zze;
                        zzal(zzamVar422);
                        zzamVar422.zzD(zzj2);
                        if (i != 404) {
                        }
                        zzenVar = this.zzd;
                        zzal(zzenVar);
                        if (zzenVar.zza()) {
                        }
                        zzag();
                    }
                    zzfiVar = this.zzc;
                    zzal(zzfiVar);
                    if (zzfiVar.zze(str) == null) {
                    }
                    zzj2.zzL(zzav().currentTimeMillis());
                    zzam zzamVar4222 = this.zze;
                    zzal(zzamVar4222);
                    zzamVar4222.zzD(zzj2);
                    if (i != 404) {
                    }
                    zzenVar = this.zzd;
                    zzal(zzenVar);
                    if (zzenVar.zza()) {
                    }
                    zzag();
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            }
            if (th == null) {
                z = true;
                if (zzj2 == null) {
                }
                zzam zzamVar52 = this.zze;
                zzal(zzamVar52);
                zzamVar52.zzC();
            }
            z = false;
            if (zzj2 == null) {
            }
            zzam zzamVar522 = this.zze;
            zzal(zzamVar522);
            zzamVar522.zzC();
        } finally {
            zzam zzamVar6 = this.zze;
            zzal(zzamVar6);
            zzamVar6.zzx();
        }
    }

    final void zzJ(boolean z) {
        zzag();
    }

    final void zzK(int i, Throwable th, byte[] bArr, String str) {
        zzam zzamVar;
        long longValue;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzae();
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i != 503 || i == 429) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzy(list);
            zzag();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzw();
            } catch (SQLiteException e) {
                zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e);
                this.zza = zzav().elapsedRealtime();
                zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            try {
                for (Long l : list) {
                    try {
                        zzamVar = this.zze;
                        zzal(zzamVar);
                        longValue = l.longValue();
                        zzamVar.zzg();
                        zzamVar.zzW();
                    } catch (SQLiteException e2) {
                        List list2 = this.zzz;
                        if (list2 == null || !list2.contains(l)) {
                            throw e2;
                        }
                    }
                    try {
                        if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e3) {
                        zzamVar.zzt.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e3);
                        throw e3;
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
                this.zzz = null;
                zzen zzenVar = this.zzd;
                zzal(zzenVar);
                if (zzenVar.zza() && zzai()) {
                    zzX();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } catch (Throwable th2) {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
                throw th2;
            }
        }
        zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.zzk.zzd.zzb(zzav().currentTimeMillis());
        if (i != 503) {
        }
        this.zzk.zzb.zzb(zzav().currentTimeMillis());
        zzam zzamVar22 = this.zze;
        zzal(zzamVar22);
        zzamVar22.zzy(list);
        zzag();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x04d6 A[Catch: all -> 0x0580, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0552 A[Catch: all -> 0x0580, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x026f A[Catch: all -> 0x0580, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0206 A[Catch: all -> 0x0580, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0260 A[Catch: all -> 0x0580, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027f A[Catch: all -> 0x0580, TRY_LEAVE, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ed A[Catch: all -> 0x0580, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0419 A[Catch: all -> 0x0580, TRY_LEAVE, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04f2 A[Catch: all -> 0x0580, TryCatch #1 {all -> 0x0580, blocks: (B:24:0x00a4, B:26:0x00b3, B:30:0x0119, B:32:0x012c, B:34:0x0142, B:36:0x0169, B:39:0x01c5, B:41:0x01cb, B:43:0x01d4, B:47:0x0206, B:49:0x0211, B:52:0x021e, B:55:0x022f, B:58:0x023a, B:60:0x023d, B:63:0x025b, B:65:0x0260, B:67:0x027f, B:70:0x0292, B:72:0x02b8, B:75:0x02c0, B:77:0x02cf, B:78:0x03b9, B:80:0x03ed, B:81:0x03f0, B:83:0x0419, B:87:0x04f2, B:88:0x04f5, B:89:0x056f, B:94:0x042e, B:96:0x0453, B:98:0x045b, B:100:0x0465, B:104:0x0478, B:105:0x048b, B:108:0x0497, B:110:0x04ab, B:113:0x04b8, B:115:0x04d6, B:117:0x04dc, B:118:0x04e1, B:120:0x04e7, B:123:0x04c2, B:129:0x0483, B:134:0x043f, B:135:0x02e0, B:137:0x030b, B:138:0x031c, B:140:0x0323, B:142:0x0329, B:144:0x0333, B:146:0x033d, B:148:0x0343, B:150:0x0349, B:152:0x034e, B:157:0x0371, B:160:0x0376, B:161:0x038a, B:162:0x039a, B:163:0x03aa, B:164:0x050a, B:166:0x053a, B:167:0x053d, B:168:0x0552, B:170:0x0556, B:171:0x026f, B:173:0x01ed, B:178:0x00c5, B:180:0x00c9, B:183:0x00da, B:185:0x00f3, B:187:0x00fd, B:191:0x0109), top: B:23:0x00a4, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x042e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzL(zzq zzqVar) {
        String str;
        String str2;
        int i;
        zzh zzj;
        String str3;
        zzas zzn;
        boolean z;
        long zzc;
        PackageInfo packageInfo;
        String str4;
        String str5;
        ApplicationInfo applicationInfo;
        String str6;
        ApplicationInfo applicationInfo2;
        boolean z2;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzh zzj2 = zzamVar.zzj(zzqVar.zza);
            if (zzj2 != null && TextUtils.isEmpty(zzj2.zzy()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzj2.zzL(0L);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzD(zzj2);
                zzfi zzfiVar = this.zzc;
                zzal(zzfiVar);
                zzfiVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long j = zzqVar.zzm;
            if (j == 0) {
                j = zzav().currentTimeMillis();
            }
            this.zzn.zzg().zzd();
            int i2 = zzqVar.zzn;
            if (i2 != 0 && i2 != 1) {
                zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeh.zzn(zzqVar.zza), Integer.valueOf(i2));
                i2 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzky zzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzp != null && !DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(zzp.zzb)) {
                    str = "_sysu";
                    str2 = "_sys";
                    i = 1;
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzj = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                    if (zzj == null && zzv().zzam(zzqVar.zzb, zzj.zzy(), zzqVar.zzq, zzj.zzr())) {
                        zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeh.zzn(zzj.zzt()));
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        String zzt = zzj.zzt();
                        zzamVar6.zzW();
                        zzamVar6.zzg();
                        Preconditions.checkNotEmpty(zzt);
                        try {
                            SQLiteDatabase zzh = zzamVar6.zzh();
                            String[] strArr = new String[i];
                            strArr[0] = zzt;
                            int delete = zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("apps", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("event_filters", "app_id=?", strArr) + zzh.delete("property_filters", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("consent_settings", "app_id=?", strArr);
                            zzoi.zzc();
                            str3 = "_pfo";
                            try {
                                if (zzamVar6.zzt.zzf().zzs(null, zzdu.zzat)) {
                                    delete += zzh.delete("default_event_params", "app_id=?", strArr);
                                }
                                if (delete > 0) {
                                    zzamVar6.zzt.zzay().zzj().zzc("Deleted application data. app, records", zzt, Integer.valueOf(delete));
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                zzamVar6.zzt.zzay().zzd().zzc("Error deleting application data. appId, error", zzeh.zzn(zzt), e);
                                zzj = null;
                                if (zzj != null) {
                                }
                                zzd(zzqVar);
                                if (i2 == 0) {
                                }
                                if (zzn == null) {
                                }
                                zzam zzamVar7 = this.zze;
                                zzal(zzamVar7);
                                zzamVar7.zzC();
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            str3 = "_pfo";
                        }
                        zzj = null;
                    } else {
                        str3 = "_pfo";
                    }
                    if (zzj != null) {
                        boolean z3 = (zzj.zzb() == -2147483648L || zzj.zzb() == zzqVar.zzj) ? false : true;
                        String zzw = zzj.zzw();
                        if (z3 | ((zzj.zzb() != -2147483648L || zzw == null || zzw.equals(zzqVar.zzc)) ? false : true)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_pv", zzw);
                            zzE(new zzaw("_au", new zzau(bundle), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j), zzqVar);
                        }
                    }
                    zzd(zzqVar);
                    if (i2 == 0) {
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        zzn = zzamVar8.zzn(zzqVar.zza, "_f");
                        z = false;
                    } else {
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzn = zzamVar9.zzn(zzqVar.zza, "_v");
                        z = true;
                    }
                    if (zzn == null) {
                        long j2 = ((j / 3600000) + 1) * 3600000;
                        if (z) {
                            zzW(new zzkw("_fvt", j, Long.valueOf(j2), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                            zzaz().zzg();
                            zzB();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                                bundle2.putLong("_dac", 1L);
                            }
                            zzG(new zzaw("_v", new zzau(bundle2), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j), zzqVar);
                        } else {
                            zzW(new zzkw("_fot", j, Long.valueOf(j2), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                            zzaz().zzg();
                            zzez zzezVar = (zzez) Preconditions.checkNotNull(this.zzm);
                            String str7 = zzqVar.zza;
                            if (str7 != null && !str7.isEmpty()) {
                                zzezVar.zza.zzaz().zzg();
                                if (zzezVar.zza()) {
                                    zzey zzeyVar = new zzey(zzezVar, str7);
                                    zzezVar.zza.zzaz().zzg();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzezVar.zza.zzau().getPackageManager();
                                    if (packageManager == null) {
                                        zzezVar.zza.zzay().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzezVar.zza.zzay().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ResolveInfo resolveInfo = queryIntentServices.get(0);
                                            if (resolveInfo.serviceInfo != null) {
                                                String str8 = resolveInfo.serviceInfo.packageName;
                                                if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str8) && zzezVar.zza()) {
                                                    try {
                                                        zzezVar.zza.zzay().zzj().zzb("Install Referrer Service is", true != ConnectionTracker.getInstance().bindService(zzezVar.zza.zzau(), new Intent(intent), zzeyVar, 1) ? "not available" : "available");
                                                    } catch (RuntimeException e3) {
                                                        zzezVar.zza.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", e3.getMessage());
                                                    }
                                                } else {
                                                    zzezVar.zza.zzay().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzezVar.zza.zzay().zzi().zza("Install Referrer Reporter is not available");
                                }
                                zzaz().zzg();
                                zzB();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("_c", 1L);
                                bundle3.putLong("_r", 1L);
                                bundle3.putLong("_uwa", 0L);
                                String str9 = str3;
                                bundle3.putLong(str9, 0L);
                                String str10 = str2;
                                bundle3.putLong(str10, 0L);
                                String str11 = str;
                                bundle3.putLong(str11, 0L);
                                bundle3.putLong("_et", 1L);
                                if (zzqVar.zzp) {
                                    bundle3.putLong("_dac", 1L);
                                }
                                String str12 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                zzam zzamVar10 = this.zze;
                                zzal(zzamVar10);
                                Preconditions.checkNotEmpty(str12);
                                zzamVar10.zzg();
                                zzamVar10.zzW();
                                zzc = zzamVar10.zzc(str12, "first_open_count");
                                if (this.zzn.zzau().getPackageManager() != null) {
                                    zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str12));
                                } else {
                                    try {
                                        packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str12, 0);
                                    } catch (PackageManager.NameNotFoundException e4) {
                                        zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeh.zzn(str12), e4);
                                        packageInfo = null;
                                    }
                                    if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                        str4 = str12;
                                        str5 = str11;
                                        applicationInfo = null;
                                    } else {
                                        str4 = str12;
                                        if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzg().zzs(null, zzdu.zzab)) {
                                                bundle3.putLong("_uwa", 1L);
                                            } else if (zzc == 0) {
                                                bundle3.putLong("_uwa", 1L);
                                                z2 = false;
                                                zzc = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            z2 = true;
                                        }
                                        str5 = str11;
                                        zzW(new zzkw("_fi", j, Long.valueOf(true != z2 ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                                    }
                                    try {
                                        str6 = str4;
                                    } catch (PackageManager.NameNotFoundException e5) {
                                        e = e5;
                                        str6 = str4;
                                    }
                                    try {
                                        applicationInfo2 = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str6, 0);
                                    } catch (PackageManager.NameNotFoundException e6) {
                                        e = e6;
                                        zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeh.zzn(str6), e);
                                        applicationInfo2 = applicationInfo;
                                        if (applicationInfo2 != null) {
                                        }
                                        if (zzc >= 0) {
                                        }
                                        zzG(new zzaw("_f", new zzau(bundle3), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j), zzqVar);
                                        zzam zzamVar72 = this.zze;
                                        zzal(zzamVar72);
                                        zzamVar72.zzC();
                                    }
                                    if (applicationInfo2 != null) {
                                        if ((applicationInfo2.flags & 1) != 0) {
                                            bundle3.putLong(str10, 1L);
                                        }
                                        if ((applicationInfo2.flags & 128) != 0) {
                                            bundle3.putLong(str5, 1L);
                                        }
                                    }
                                }
                                if (zzc >= 0) {
                                    bundle3.putLong(str9, zzc);
                                }
                                zzG(new zzaw("_f", new zzau(bundle3), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j), zzqVar);
                            }
                            zzezVar.zza.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            zzaz().zzg();
                            zzB();
                            Bundle bundle32 = new Bundle();
                            bundle32.putLong("_c", 1L);
                            bundle32.putLong("_r", 1L);
                            bundle32.putLong("_uwa", 0L);
                            String str92 = str3;
                            bundle32.putLong(str92, 0L);
                            String str102 = str2;
                            bundle32.putLong(str102, 0L);
                            String str112 = str;
                            bundle32.putLong(str112, 0L);
                            bundle32.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                            }
                            String str122 = (String) Preconditions.checkNotNull(zzqVar.zza);
                            zzam zzamVar102 = this.zze;
                            zzal(zzamVar102);
                            Preconditions.checkNotEmpty(str122);
                            zzamVar102.zzg();
                            zzamVar102.zzW();
                            zzc = zzamVar102.zzc(str122, "first_open_count");
                            if (this.zzn.zzau().getPackageManager() != null) {
                            }
                            if (zzc >= 0) {
                            }
                            zzG(new zzaw("_f", new zzau(bundle32), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j), zzqVar);
                        }
                    } else if (zzqVar.zzi) {
                        zzG(new zzaw("_cd", new zzau(new Bundle()), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, j), zzqVar);
                    }
                    zzam zzamVar722 = this.zze;
                    zzal(zzamVar722);
                    zzamVar722.zzC();
                }
                if (zzqVar.zzr != null) {
                    str = "_sysu";
                    str2 = "_sys";
                    i = 1;
                    zzkw zzkwVar = new zzkw("_npa", j, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    if (zzp == null || !zzp.zze.equals(zzkwVar.zzd)) {
                        zzW(zzkwVar, zzqVar);
                    }
                } else {
                    str = "_sysu";
                    str2 = "_sys";
                    i = 1;
                    if (zzp != null) {
                        zzP(new zzkw("_npa", j, null, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                    }
                }
                zzam zzamVar52 = this.zze;
                zzal(zzamVar52);
                zzj = zzamVar52.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzj == null) {
                }
                str3 = "_pfo";
                if (zzj != null) {
                }
                zzd(zzqVar);
                if (i2 == 0) {
                }
                if (zzn == null) {
                }
                zzam zzamVar7222 = this.zze;
                zzal(zzamVar7222);
                zzamVar7222.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    final void zzM() {
        this.zzr++;
    }

    final void zzN(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzO(zzacVar, zzac);
        }
    }

    final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzk != null) {
                    zzay().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        zzY((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzauVar != null ? zzauVar.zzc() : null, zzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzay().zzk().zzc("Conditional user property doesn't exist", zzeh.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    final void zzP(zzkw zzkwVar, zzq zzqVar) {
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(zzkwVar.zzb) && zzqVar.zzr != null) {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzkw("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                return;
            }
            zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzkwVar.zzb));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(zzkwVar.zzb)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), zzkwVar.zzb);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzkwVar.zzb));
            } finally {
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            }
        }
    }

    final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase zzh = zzamVar.zzh();
            String[] strArr = {str};
            int delete = zzh.delete("apps", "app_id=?", strArr) + zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("queue", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("main_event_params", "app_id=?", strArr) + zzh.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzamVar.zzt.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeh.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzie zzieVar) {
        zzaz().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzieVar != null) {
            this.zzE = str;
            this.zzD = zzieVar;
        }
    }

    protected final void zzS() {
        zzaz().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzag();
    }

    final void zzT(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzU(zzacVar, zzac);
        }
    }

    final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzk != null && !zzk.zzb.equals(zzacVar2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzk.zzb);
                }
                if (zzk != null && zzk.zze) {
                    zzacVar2.zzb = zzk.zzb;
                    zzacVar2.zzd = zzk.zzd;
                    zzacVar2.zzh = zzk.zzh;
                    zzacVar2.zzf = zzk.zzf;
                    zzacVar2.zzi = zzk.zzi;
                    zzacVar2.zze = true;
                    zzkw zzkwVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzkw(zzkwVar.zzb, zzk.zzc.zzc, zzkwVar.zza(), zzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzkw zzkwVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzkw(zzkwVar2.zzb, zzacVar2.zzd, zzkwVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
                if (zzacVar2.zze) {
                    zzkw zzkwVar3 = zzacVar2.zzc;
                    zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzkwVar3.zzb, zzkwVar3.zzc, Preconditions.checkNotNull(zzkwVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzL(zzkyVar)) {
                        zzay().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    } else {
                        zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzeh.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    }
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzay().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzay().zzd().zzd("Too many conditional properties, ignoring", zzeh.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    final void zzV(String str, zzai zzaiVar) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzt.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeh.zzn(str), e);
        }
    }

    final void zzW(zzkw zzkwVar, zzq zzqVar) {
        long j;
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int zzl = zzv().zzl(zzkwVar.zzb);
            int i = 0;
            if (zzl != 0) {
                zzlb zzv = zzv();
                String str = zzkwVar.zzb;
                zzg();
                String zzD = zzv.zzD(str, 24, true);
                String str2 = zzkwVar.zzb;
                zzv().zzN(this.zzF, zzqVar.zza, zzl, "_ev", zzD, str2 != null ? str2.length() : 0);
                return;
            }
            int zzd = zzv().zzd(zzkwVar.zzb, zzkwVar.zza());
            if (zzd != 0) {
                zzlb zzv2 = zzv();
                String str3 = zzkwVar.zzb;
                zzg();
                String zzD2 = zzv2.zzD(str3, 24, true);
                Object zza = zzkwVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    i = zza.toString().length();
                }
                zzv().zzN(this.zzF, zzqVar.zza, zzd, "_ev", zzD2, i);
                return;
            }
            Object zzB = zzv().zzB(zzkwVar.zzb, zzkwVar.zza());
            if (zzB == null) {
                return;
            }
            if ("_sid".equals(zzkwVar.zzb)) {
                long j2 = zzkwVar.zzc;
                String str4 = zzkwVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzal(zzamVar);
                zzky zzp = zzamVar.zzp(str5, "_sno");
                if (zzp != null) {
                    Object obj = zzp.zze;
                    if (obj instanceof Long) {
                        j = ((Long) obj).longValue();
                        zzW(new zzkw("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
                    }
                }
                if (zzp != null) {
                    zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp.zze);
                }
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzas zzn = zzamVar2.zzn(str5, "_s");
                if (zzn != null) {
                    j = zzn.zzc;
                    zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j));
                } else {
                    j = 0;
                }
                zzW(new zzkw("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
            }
            zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzkwVar.zzf), zzkwVar.zzb, zzkwVar.zzc, zzB);
            zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzkyVar.zzc), zzB);
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                if ("_id".equals(zzkyVar.zzc)) {
                    zzam zzamVar4 = this.zze;
                    zzal(zzamVar4);
                    zzky zzp2 = zzamVar4.zzp(zzqVar.zza, "_id");
                    if (zzp2 != null && !zzkyVar.zze.equals(zzp2.zze)) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                boolean zzL = zzamVar6.zzL(zzkyVar);
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzC();
                if (!zzL) {
                    zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    zzv().zzN(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzx();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02fe, code lost:
    
        r0 = r0.subList(0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0303, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0304, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0548, code lost:
    
        if (r11 != null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x054a, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0572, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x056f, code lost:
    
        if (r11 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0108, code lost:
    
        if (r11 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        r22.zzA = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
    
        if (r11 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012a, code lost:
    
        if (r11 == null) goto L56;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x058d: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:280:0x058d */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0270 A[Catch: all -> 0x0594, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x0594, blocks: (B:81:0x029f, B:83:0x02a5, B:85:0x02b1, B:86:0x02b5, B:88:0x02bb, B:91:0x02cf, B:94:0x02d8, B:96:0x02de, B:101:0x02f3, B:117:0x030a, B:119:0x0325, B:122:0x0334, B:124:0x0358, B:129:0x036a, B:134:0x03a4, B:136:0x03a9, B:138:0x03b1, B:139:0x03b4, B:141:0x03b9, B:142:0x03bc, B:144:0x03c8, B:146:0x03de, B:152:0x03ea, B:154:0x03fb, B:155:0x040d, B:157:0x042f, B:159:0x046d, B:161:0x047f, B:162:0x0494, B:166:0x04a4, B:167:0x04a8, B:169:0x048d, B:170:0x04ec, B:171:0x0464, B:197:0x0270, B:219:0x029c, B:239:0x0503, B:240:0x0506, B:249:0x0507, B:257:0x054a, B:259:0x0573, B:261:0x0579, B:263:0x0584, B:267:0x0555, B:277:0x0590, B:278:0x0593, B:165:0x04a0), top: B:36:0x00eb, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134 A[Catch: all -> 0x0597, TryCatch #18 {all -> 0x0597, blocks: (B:3:0x0010, B:5:0x0021, B:10:0x0034, B:12:0x003a, B:14:0x004a, B:16:0x0052, B:18:0x0058, B:20:0x0063, B:22:0x0073, B:24:0x007e, B:26:0x0091, B:28:0x00b0, B:30:0x00b6, B:32:0x00b9, B:34:0x00c5, B:35:0x00dc, B:38:0x00ed, B:40:0x00f3, B:47:0x010a, B:48:0x012d, B:59:0x0134, B:60:0x0137, B:65:0x0138, B:68:0x0160, B:71:0x0168, B:79:0x019e, B:165:0x04a0), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a5 A[Catch: all -> 0x0594, TryCatch #15 {all -> 0x0594, blocks: (B:81:0x029f, B:83:0x02a5, B:85:0x02b1, B:86:0x02b5, B:88:0x02bb, B:91:0x02cf, B:94:0x02d8, B:96:0x02de, B:101:0x02f3, B:117:0x030a, B:119:0x0325, B:122:0x0334, B:124:0x0358, B:129:0x036a, B:134:0x03a4, B:136:0x03a9, B:138:0x03b1, B:139:0x03b4, B:141:0x03b9, B:142:0x03bc, B:144:0x03c8, B:146:0x03de, B:152:0x03ea, B:154:0x03fb, B:155:0x040d, B:157:0x042f, B:159:0x046d, B:161:0x047f, B:162:0x0494, B:166:0x04a4, B:167:0x04a8, B:169:0x048d, B:170:0x04ec, B:171:0x0464, B:197:0x0270, B:219:0x029c, B:239:0x0503, B:240:0x0506, B:249:0x0507, B:257:0x054a, B:259:0x0573, B:261:0x0579, B:263:0x0584, B:267:0x0555, B:277:0x0590, B:278:0x0593, B:165:0x04a0), top: B:36:0x00eb, inners: #21 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzX() {
        boolean z;
        Cursor cursor;
        Cursor cursor2;
        zzam zzamVar;
        long zzz;
        Cursor cursor3;
        Cursor cursor4;
        long j;
        Cursor cursor5;
        List emptyList;
        String str;
        String str2;
        String str3;
        byte[] byteArray;
        Cursor cursor6;
        zzaz().zzg();
        zzB();
        int i = 1;
        this.zzv = true;
        int i2 = 0;
        try {
            this.zzn.zzaw();
            Boolean zzj = this.zzn.zzt().zzj();
            if (zzj == null) {
                zzay().zzk().zza("Upload data called on the client side before use of service was decided");
                this.zzv = false;
            } else if (zzj.booleanValue()) {
                zzay().zzd().zza("Upload called in the client side when service should be used");
                this.zzv = false;
            } else if (this.zza > 0) {
                zzag();
                this.zzv = false;
            } else {
                zzaz().zzg();
                if (this.zzy != null) {
                    zzay().zzj().zza("Uploading requested multiple times");
                    this.zzv = false;
                } else {
                    zzen zzenVar = this.zzd;
                    zzal(zzenVar);
                    if (zzenVar.zza()) {
                        long currentTimeMillis = zzav().currentTimeMillis();
                        Cursor cursor7 = null;
                        int zze = zzg().zze(null, zzdu.zzP);
                        zzg();
                        long zzz2 = currentTimeMillis - zzag.zzz();
                        for (int i3 = 0; i3 < zze && zzah(null, zzz2); i3++) {
                        }
                        long zza = this.zzk.zzc.zza();
                        if (zza != 0) {
                            zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza)));
                        }
                        zzam zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        String zzr = zzamVar2.zzr();
                        long j2 = -1;
                        try {
                            if (TextUtils.isEmpty(zzr)) {
                                try {
                                    this.zzA = -1L;
                                    zzamVar = this.zze;
                                    zzal(zzamVar);
                                    zzg();
                                    zzz = currentTimeMillis - zzag.zzz();
                                    zzamVar.zzg();
                                    zzamVar.zzW();
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursor;
                                }
                                try {
                                    cursor3 = zzamVar.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzz)});
                                    try {
                                    } catch (SQLiteException e) {
                                        e = e;
                                        zzamVar.zzt.zzay().zzd().zzb("Error selecting expired configs", e);
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor3 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = null;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                                if (cursor3.moveToFirst()) {
                                    String str4 = cursor3.getString(0);
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (!TextUtils.isEmpty(str4)) {
                                        zzam zzamVar3 = this.zze;
                                        zzal(zzamVar3);
                                        zzh zzj2 = zzamVar3.zzj(str4);
                                        if (zzj2 != null) {
                                            zzD(zzj2);
                                        }
                                    }
                                } else {
                                    zzamVar.zzt.zzay().zzj().zza("No expired configs for apps with pending events");
                                }
                            } else {
                                if (this.zzA == -1) {
                                    zzam zzamVar4 = this.zze;
                                    zzal(zzamVar4);
                                    try {
                                        cursor6 = zzamVar4.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        try {
                                            try {
                                                if (cursor6.moveToFirst()) {
                                                    j2 = cursor6.getLong(0);
                                                }
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                zzamVar4.zzt.zzay().zzd().zzb("Error querying raw events", e);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor7 = cursor6;
                                            if (cursor7 != null) {
                                                cursor7.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        cursor6 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (cursor7 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                int zze2 = zzg().zze(zzr, zzdu.zzf);
                                int max = Math.max(0, zzg().zze(zzr, zzdu.zzg));
                                zzam zzamVar5 = this.zze;
                                zzal(zzamVar5);
                                zzamVar5.zzg();
                                zzamVar5.zzW();
                                Preconditions.checkArgument(zze2 > 0);
                                Preconditions.checkArgument(max > 0);
                                Preconditions.checkNotEmpty(zzr);
                                try {
                                    cursor5 = zzamVar5.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{zzr}, null, null, "rowid", String.valueOf(zze2));
                                    try {
                                        try {
                                            if (cursor5.moveToFirst()) {
                                                ArrayList arrayList = new ArrayList();
                                                int i4 = 0;
                                                while (true) {
                                                    long j3 = cursor5.getLong(i2);
                                                    try {
                                                        byte[] blob = cursor5.getBlob(i);
                                                        zzkv zzkvVar = zzamVar5.zzf.zzi;
                                                        zzal(zzkvVar);
                                                        try {
                                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                            byte[] bArr = new byte[1024];
                                                            j = currentTimeMillis;
                                                            while (true) {
                                                                try {
                                                                    try {
                                                                        int read = gZIPInputStream.read(bArr);
                                                                        if (read <= 0) {
                                                                            break;
                                                                        } else {
                                                                            byteArrayOutputStream.write(bArr, 0, read);
                                                                        }
                                                                    } catch (SQLiteException e5) {
                                                                        e = e5;
                                                                        zzamVar5.zzt.zzay().zzd().zzc("Error querying bundles. appId", zzeh.zzn(zzr), e);
                                                                        emptyList = Collections.emptyList();
                                                                        if (cursor5 != null) {
                                                                            cursor5.close();
                                                                        }
                                                                        if (!emptyList.isEmpty()) {
                                                                        }
                                                                        this.zzv = false;
                                                                        zzae();
                                                                    }
                                                                } catch (IOException e6) {
                                                                    e = e6;
                                                                    try {
                                                                        zzkvVar.zzt.zzay().zzd().zzb("Failed to ungzip content", e);
                                                                        throw e;
                                                                    } catch (IOException e7) {
                                                                        e = e7;
                                                                        zzamVar5.zzt.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeh.zzn(zzr), e);
                                                                        if (cursor5.moveToNext()) {
                                                                            break;
                                                                        }
                                                                        currentTimeMillis = j;
                                                                        i = 1;
                                                                        i2 = 0;
                                                                        if (cursor5 != null) {
                                                                        }
                                                                        emptyList = arrayList;
                                                                        if (!emptyList.isEmpty()) {
                                                                        }
                                                                        this.zzv = false;
                                                                        zzae();
                                                                    }
                                                                }
                                                            }
                                                            gZIPInputStream.close();
                                                            byteArrayInputStream.close();
                                                            byteArray = byteArrayOutputStream.toByteArray();
                                                        } catch (IOException e8) {
                                                            e = e8;
                                                            j = currentTimeMillis;
                                                        }
                                                    } catch (IOException e9) {
                                                        e = e9;
                                                        j = currentTimeMillis;
                                                    }
                                                    if (!arrayList.isEmpty() && byteArray.length + i4 > max) {
                                                        break;
                                                    }
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzkv.zzl(com.google.android.gms.internal.measurement.zzgd.zzt(), byteArray);
                                                        if (!cursor5.isNull(2)) {
                                                            zzgcVar.zzaf(cursor5.getInt(2));
                                                        }
                                                        i4 += byteArray.length;
                                                        arrayList.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC(), Long.valueOf(j3)));
                                                    } catch (IOException e10) {
                                                        zzamVar5.zzt.zzay().zzd().zzc("Failed to merge queued bundle. appId", zzeh.zzn(zzr), e10);
                                                    }
                                                    if (cursor5.moveToNext() || i4 > max) {
                                                        break;
                                                        break;
                                                    } else {
                                                        currentTimeMillis = j;
                                                        i = 1;
                                                        i2 = 0;
                                                    }
                                                }
                                                if (cursor5 != null) {
                                                    cursor5.close();
                                                }
                                                emptyList = arrayList;
                                            } else {
                                                emptyList = Collections.emptyList();
                                                if (cursor5 != null) {
                                                    cursor5.close();
                                                }
                                                j = currentTimeMillis;
                                            }
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            j = currentTimeMillis;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        cursor4 = cursor5;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    j = currentTimeMillis;
                                    cursor5 = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor4 = null;
                                }
                                if (!emptyList.isEmpty()) {
                                    if (zzh(zzr).zzi(zzah.AD_STORAGE)) {
                                        Iterator it = emptyList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str3 = null;
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                            if (!zzgdVar.zzJ().isEmpty()) {
                                                str3 = zzgdVar.zzJ();
                                                break;
                                            }
                                        }
                                        if (str3 != null) {
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= emptyList.size()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzgd zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) emptyList.get(i5)).first;
                                                if (!zzgdVar2.zzJ().isEmpty() && !zzgdVar2.zzJ().equals(str3)) {
                                                    break;
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                    com.google.android.gms.internal.measurement.zzga zza2 = com.google.android.gms.internal.measurement.zzgb.zza();
                                    int size = emptyList.size();
                                    ArrayList arrayList2 = new ArrayList(emptyList.size());
                                    boolean z2 = zzg().zzt(zzr) && zzh(zzr).zzi(zzah.AD_STORAGE);
                                    boolean zzi = zzh(zzr).zzi(zzah.AD_STORAGE);
                                    boolean zzi2 = zzh(zzr).zzi(zzah.ANALYTICS_STORAGE);
                                    zzpd.zzc();
                                    boolean z3 = zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzr, zzdu.zzan);
                                    int i6 = 0;
                                    while (i6 < size) {
                                        com.google.android.gms.internal.measurement.zzgc zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) emptyList.get(i6)).first).zzby();
                                        arrayList2.add((Long) ((Pair) emptyList.get(i6)).second);
                                        zzg().zzh();
                                        zzgcVar2.zzal(74029L);
                                        long j4 = j;
                                        zzgcVar2.zzak(j4);
                                        this.zzn.zzaw();
                                        try {
                                            zzgcVar2.zzag(false);
                                            if (!z2) {
                                                zzgcVar2.zzq();
                                            }
                                            if (!zzi) {
                                                zzgcVar2.zzx();
                                                zzgcVar2.zzt();
                                            }
                                            if (!zzi2) {
                                                zzgcVar2.zzn();
                                            }
                                            zzC(zzr, zzgcVar2);
                                            if (!z3) {
                                                zzgcVar2.zzy();
                                            }
                                            if (zzg().zzs(zzr, zzdu.zzT)) {
                                                byte[] zzbu = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaC()).zzbu();
                                                zzkv zzkvVar2 = this.zzi;
                                                zzal(zzkvVar2);
                                                zzgcVar2.zzJ(zzkvVar2.zzd(zzbu));
                                            }
                                            zza2.zza(zzgcVar2);
                                            i6++;
                                            j = j4;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z = false;
                                            this.zzv = z;
                                            zzae();
                                            throw th;
                                        }
                                    }
                                    long j5 = j;
                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                        zzkv zzkvVar3 = this.zzi;
                                        zzal(zzkvVar3);
                                        str = zzkvVar3.zzm((com.google.android.gms.internal.measurement.zzgb) zza2.zzaC());
                                    } else {
                                        str = null;
                                    }
                                    zzal(this.zzi);
                                    byte[] zzbu2 = ((com.google.android.gms.internal.measurement.zzgb) zza2.zzaC()).zzbu();
                                    zzfi zzfiVar = this.zzl.zzf.zzc;
                                    zzal(zzfiVar);
                                    String zzi3 = zzfiVar.zzi(zzr);
                                    if (TextUtils.isEmpty(zzi3)) {
                                        str2 = (String) zzdu.zzp.zza(null);
                                    } else {
                                        Uri parse = Uri.parse((String) zzdu.zzp.zza(null));
                                        Uri.Builder buildUpon = parse.buildUpon();
                                        buildUpon.authority(zzi3 + "." + parse.getAuthority());
                                        str2 = buildUpon.build().toString();
                                    }
                                    try {
                                        URL url = new URL(str2);
                                        Preconditions.checkArgument(!arrayList2.isEmpty());
                                        if (this.zzy != null) {
                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.zzy = new ArrayList(arrayList2);
                                        }
                                        this.zzk.zzd.zzb(j5);
                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zza2.zzb(0).zzx() : "?", Integer.valueOf(zzbu2.length), str);
                                        this.zzu = true;
                                        zzen zzenVar2 = this.zzd;
                                        zzal(zzenVar2);
                                        zzkk zzkkVar = new zzkk(this, zzr);
                                        zzenVar2.zzg();
                                        zzenVar2.zzW();
                                        Preconditions.checkNotNull(url);
                                        Preconditions.checkNotNull(zzbu2);
                                        Preconditions.checkNotNull(zzkkVar);
                                        zzenVar2.zzt.zzaz().zzo(new zzem(zzenVar2, zzr, url, zzbu2, null, zzkkVar));
                                    } catch (MalformedURLException unused) {
                                        zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeh.zzn(zzr), str2);
                                    }
                                }
                            }
                            this.zzv = false;
                        } catch (Throwable th8) {
                            th = th8;
                            z = false;
                        }
                    } else {
                        zzay().zzj().zza("Network not connected, ignoring upload request");
                        zzag();
                        this.zzv = false;
                    }
                }
            }
            zzae();
        } catch (Throwable th9) {
            th = th9;
            z = false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:288|(2:290|(1:292)(7:293|294|(1:296)|46|(0)(0)|49|(0)(0)))|297|298|299|300|301|302|303|304|305|306|294|(0)|46|(0)(0)|49|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(66:(2:58|(5:60|(1:62)|63|64|65))|66|(2:68|(5:70|(1:72)|73|74|75))|76|77|(1:79)|80|(2:82|(1:86))|87|88|89|90|91|92|93|(3:94|95|96)|97|(1:99)|100|(2:102|(1:108)(3:105|106|107))(1:249)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:124)|125|(1:127)|128|(1:130)|131|(1:135)|136|(1:138)|139|(4:144|(4:147|(3:149|150|(3:152|153|(3:155|156|158)(1:239))(1:241))(1:246)|240|145)|247|159)|248|(1:162)|163|(2:167|(2:171|(1:173)))|174|(2:176|(1:178))|179|(3:181|(1:183)|184)|185|(1:189)|190|(1:192)|193|(3:196|197|194)|198|199|200|201|202|(2:203|(2:205|(1:207)(1:222))(3:223|224|(1:229)(1:228)))|208|209|210|211|(1:213)(2:218|219)|214|215|216) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0749, code lost:
    
        if (r14.isEmpty() == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x09fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x09ff, code lost:
    
        r2.zzt.zzay().zzd().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r5.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0a30, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0a32, code lost:
    
        zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r2.zzap()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x027b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0288, code lost:
    
        r11.zzt.zzay().zzd().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r10), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x027d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x027e, code lost:
    
        r33 = "metadata_fingerprint";
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0281, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0282, code lost:
    
        r33 = "metadata_fingerprint";
        r21 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0542 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0608 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0615 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0622 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x065a A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x066b A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06ac A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06ee A[Catch: all -> 0x0a7a, TRY_LEAVE, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x074e A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0794 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07de A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07f7 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0885 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08a5 A[Catch: all -> 0x0a7a, TRY_LEAVE, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0937 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x09e3 A[Catch: SQLiteException -> 0x09fe, all -> 0x0a7a, TRY_LEAVE, TryCatch #8 {SQLiteException -> 0x09fe, blocks: (B:211:0x09d3, B:213:0x09e3), top: B:210:0x09d3, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0943 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05bb A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x030f A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x016b A[Catch: all -> 0x0a7a, TRY_ENTER, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01e6 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02c2 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x036f A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0503 A[Catch: all -> 0x0a7a, TryCatch #4 {all -> 0x0a7a, blocks: (B:31:0x0124, B:34:0x0135, B:36:0x013f, B:40:0x014b, B:46:0x02f9, B:49:0x032f, B:51:0x036f, B:53:0x0375, B:54:0x038c, B:58:0x039f, B:60:0x03b6, B:62:0x03bc, B:63:0x03d3, B:68:0x03fd, B:72:0x041e, B:73:0x0435, B:76:0x0446, B:79:0x0463, B:80:0x0477, B:82:0x0481, B:84:0x0490, B:86:0x0496, B:87:0x049f, B:89:0x04ad, B:92:0x04c2, B:95:0x04d7, B:99:0x0503, B:100:0x0518, B:102:0x0542, B:105:0x055a, B:108:0x059d, B:109:0x05c9, B:111:0x0608, B:112:0x060d, B:114:0x0615, B:115:0x061a, B:117:0x0622, B:118:0x0627, B:120:0x0636, B:122:0x0644, B:124:0x064c, B:125:0x0651, B:127:0x065a, B:128:0x065e, B:130:0x066b, B:131:0x0670, B:133:0x0697, B:135:0x069f, B:136:0x06a4, B:138:0x06ac, B:139:0x06af, B:141:0x06c7, B:144:0x06cf, B:145:0x06e8, B:147:0x06ee, B:150:0x0702, B:153:0x070e, B:156:0x071b, B:244:0x0735, B:159:0x0745, B:162:0x074e, B:163:0x0751, B:165:0x076f, B:167:0x0773, B:169:0x0785, B:171:0x0789, B:173:0x0794, B:174:0x079f, B:176:0x07de, B:178:0x07e7, B:179:0x07ea, B:181:0x07f7, B:183:0x0819, B:184:0x0826, B:185:0x085c, B:187:0x0864, B:189:0x086e, B:190:0x087b, B:192:0x0885, B:193:0x0892, B:194:0x089f, B:196:0x08a5, B:199:0x08d5, B:201:0x091b, B:202:0x0925, B:203:0x0931, B:205:0x0937, B:209:0x0985, B:211:0x09d3, B:213:0x09e3, B:214:0x0a47, B:219:0x09fb, B:221:0x09ff, B:224:0x0943, B:226:0x096f, B:233:0x0a18, B:234:0x0a2f, B:238:0x0a32, B:249:0x05bb, B:253:0x04e8, B:260:0x030f, B:261:0x0316, B:263:0x031c, B:266:0x0328, B:271:0x015f, B:274:0x016b, B:276:0x0182, B:281:0x01a0, B:284:0x01e0, B:286:0x01e6, B:288:0x01f4, B:290:0x0209, B:293:0x0210, B:294:0x02b7, B:296:0x02c2, B:297:0x023e, B:299:0x025b, B:302:0x0262, B:305:0x0273, B:306:0x029b, B:310:0x0288, B:319:0x01ae, B:324:0x01d6), top: B:30:0x0124, inners: #2, #6, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzY(zzaw zzawVar, zzq zzqVar) {
        boolean z;
        String zzg;
        String str;
        long longValue;
        String str2;
        String str3;
        zzky zzkyVar;
        zzam zzamVar;
        zzau zzauVar;
        long j;
        long intValue;
        String str4;
        int i;
        long j2;
        zzar zzarVar;
        int i2;
        String str5;
        zzas zzn;
        zzas zzc;
        com.google.android.gms.internal.measurement.zzgc zzt;
        long j3;
        long j4;
        Map zzc2;
        ArrayList arrayList;
        zzai zzc3;
        zzh zzj;
        List zzu;
        int i3;
        zzam zzamVar2;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        zzam zzamVar3;
        zzat zzatVar;
        int i4;
        ContentValues contentValues;
        Pair zzd;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long nanoTime = System.nanoTime();
        zzaz().zzg();
        zzB();
        String str6 = zzqVar.zza;
        zzal(this.zzi);
        if (!zzkv.zzA(zzawVar, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        if (zzfiVar.zzr(str6, zzawVar.zza)) {
            zzay().zzk().zzc("Dropping blocked event. appId", zzeh.zzn(str6), this.zzn.zzj().zzd(zzawVar.zza));
            zzfi zzfiVar2 = this.zzc;
            zzal(zzfiVar2);
            if (!zzfiVar2.zzp(str6)) {
                zzfi zzfiVar3 = this.zzc;
                zzal(zzfiVar3);
                if (!zzfiVar3.zzs(str6)) {
                    if ("_err".equals(zzawVar.zza)) {
                        return;
                    }
                    zzv().zzN(this.zzF, str6, 11, "_ev", zzawVar.zza, 0);
                    return;
                }
            }
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            zzh zzj2 = zzamVar4.zzj(str6);
            if (zzj2 != null) {
                long abs = Math.abs(zzav().currentTimeMillis() - Math.max(zzj2.zzl(), zzj2.zzc()));
                zzg();
                if (abs > ((Long) zzdu.zzy.zza(null)).longValue()) {
                    zzay().zzc().zza("Fetching config for blocked app");
                    zzD(zzj2);
                    return;
                }
                return;
            }
            return;
        }
        zzei zzb2 = zzei.zzb(zzawVar);
        zzv().zzM(zzb2, zzg().zzd(str6));
        zzaw zza = zzb2.zza();
        if (Log.isLoggable(zzay().zzq(), 2)) {
            zzay().zzj().zzb("Logging event", this.zzn.zzj().zzc(zza));
        }
        zzam zzamVar5 = this.zze;
        zzal(zzamVar5);
        zzamVar5.zzw();
        try {
            zzd(zzqVar);
            if (!"ecommerce_purchase".equals(zza.zza) && !FirebaseAnalytics.Event.PURCHASE.equals(zza.zza) && !FirebaseAnalytics.Event.REFUND.equals(zza.zza)) {
                z = false;
                if (!"_iap".equals(zza.zza)) {
                    if (z) {
                        z = true;
                    } else {
                        str2 = "metadata_fingerprint";
                        str3 = "_err";
                        boolean zzai = zzlb.zzai(zza.zza);
                        boolean equals = str3.equals(zza.zza);
                        zzv();
                        zzauVar = zza.zzb;
                        if (zzauVar == null) {
                            j = 0;
                        } else {
                            zzat zzatVar2 = new zzat(zzauVar);
                            j = 0;
                            while (zzatVar2.hasNext()) {
                                if (zzauVar.zzf(zzatVar2.next()) instanceof Parcelable[]) {
                                    j += ((Parcelable[]) r13).length;
                                }
                            }
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzak zzm = zzamVar6.zzm(zza(), str6, j + 1, true, zzai, false, equals, false);
                        long j5 = zzm.zzb;
                        zzg();
                        intValue = j5 - ((Integer) zzdu.zzj.zza(null)).intValue();
                        if (intValue > 0) {
                            if (intValue % 1000 == 1) {
                                zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeh.zzn(str6), Long.valueOf(zzm.zzb));
                            }
                            zzam zzamVar7 = this.zze;
                            zzal(zzamVar7);
                            zzamVar7.zzC();
                            return;
                        }
                        if (zzai) {
                            long j6 = zzm.zza;
                            zzg();
                            long intValue2 = j6 - ((Integer) zzdu.zzl.zza(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeh.zzn(str6), Long.valueOf(zzm.zza));
                                }
                                zzv().zzN(this.zzF, str6, 16, "_ev", zza.zza, 0);
                                zzam zzamVar8 = this.zze;
                                zzal(zzamVar8);
                                zzamVar8.zzC();
                                return;
                            }
                        }
                        if (equals) {
                            long max = zzm.zzd - Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zzg().zze(zzqVar.zza, zzdu.zzk)));
                            if (max > 0) {
                                if (max == 1) {
                                    zzay().zzd().zzc("Too many error events logged. appId, count", zzeh.zzn(str6), Long.valueOf(zzm.zzd));
                                }
                                zzam zzamVar9 = this.zze;
                                zzal(zzamVar9);
                                zzamVar9.zzC();
                                return;
                            }
                        }
                        Bundle zzc4 = zza.zzb.zzc();
                        zzv().zzO(zzc4, "_o", zza.zzc);
                        if (zzv().zzae(str6)) {
                            zzv().zzO(zzc4, "_dbg", 1L);
                            zzv().zzO(zzc4, "_r", 1L);
                        }
                        if ("_s".equals(zza.zza)) {
                            zzam zzamVar10 = this.zze;
                            zzal(zzamVar10);
                            zzky zzp = zzamVar10.zzp(zzqVar.zza, "_sno");
                            if (zzp != null && (zzp.zze instanceof Long)) {
                                zzv().zzO(zzc4, "_sno", zzp.zze);
                            }
                        }
                        zzam zzamVar11 = this.zze;
                        zzal(zzamVar11);
                        Preconditions.checkNotEmpty(str6);
                        zzamVar11.zzg();
                        zzamVar11.zzW();
                        try {
                            i = 0;
                            try {
                                str4 = "raw_events";
                            } catch (SQLiteException e) {
                                e = e;
                                str4 = "raw_events";
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            str4 = "raw_events";
                            i = 0;
                        }
                        try {
                            try {
                                j2 = zzamVar11.zzh().delete(str4, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zzamVar11.zzt.zzf().zze(str6, zzdu.zzo))))});
                            } catch (SQLiteException e3) {
                                e = e3;
                                zzamVar11.zzt.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeh.zzn(str6), e);
                                j2 = 0;
                                if (j2 > 0) {
                                }
                                i2 = i;
                                str5 = str4;
                                zzarVar = new zzar(this.zzn, zza.zzc, str6, zza.zza, zza.zzd, 0L, zzc4);
                                zzam zzamVar12 = this.zze;
                                zzal(zzamVar12);
                                zzn = zzamVar12.zzn(str6, zzarVar.zzb);
                                if (zzn != null) {
                                }
                                zzam zzamVar13 = this.zze;
                                zzal(zzamVar13);
                                zzamVar13.zzE(zzc);
                                zzaz().zzg();
                                zzB();
                                Preconditions.checkNotNull(zzarVar);
                                Preconditions.checkNotNull(zzqVar);
                                Preconditions.checkNotEmpty(zzarVar.zza);
                                Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                                zzt = com.google.android.gms.internal.measurement.zzgd.zzt();
                                zzt.zzad(1);
                                zzt.zzZ("android");
                                if (!TextUtils.isEmpty(zzqVar.zza)) {
                                }
                                if (!TextUtils.isEmpty(zzqVar.zzd)) {
                                }
                                if (!TextUtils.isEmpty(zzqVar.zzc)) {
                                }
                                zzpd.zzc();
                                if (zzg().zzs(null, zzdu.zzal)) {
                                    zzt.zzah(zzqVar.zzx);
                                }
                                j3 = zzqVar.zzj;
                                if (j3 != -2147483648L) {
                                }
                                zzt.zzV(zzqVar.zze);
                                if (!TextUtils.isEmpty(zzqVar.zzb)) {
                                }
                                zzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                                if (zzt.zzaq().isEmpty()) {
                                    zzt.zzC(zzqVar.zzq);
                                }
                                j4 = zzqVar.zzf;
                                if (j4 != 0) {
                                }
                                zzt.zzP(zzqVar.zzs);
                                zzkv zzkvVar = this.zzi;
                                zzal(zzkvVar);
                                zzc2 = zzdu.zzc(zzkvVar.zzf.zzn.zzau());
                                if (zzc2 != null) {
                                    arrayList = new ArrayList();
                                    int intValue3 = ((Integer) zzdu.zzO.zza(null)).intValue();
                                    while (r9.hasNext()) {
                                    }
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                }
                                zzc3 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                                if (zzc3.zzi(zzah.AD_STORAGE)) {
                                    zzd = this.zzk.zzd(zzqVar.zza, zzc3);
                                    if (!TextUtils.isEmpty((CharSequence) zzd.first)) {
                                        zzt.zzae((String) zzd.first);
                                        if (zzd.second != null) {
                                        }
                                    }
                                }
                                this.zzn.zzg().zzu();
                                zzt.zzN(Build.MODEL);
                                this.zzn.zzg().zzu();
                                zzt.zzY(Build.VERSION.RELEASE);
                                zzt.zzaj((int) this.zzn.zzg().zzb());
                                zzt.zzan(this.zzn.zzg().zzc());
                                if (this.zzn.zzJ()) {
                                }
                                zzam zzamVar14 = this.zze;
                                zzal(zzamVar14);
                                zzj = zzamVar14.zzj(zzqVar.zza);
                                if (zzj == null) {
                                }
                                if (zzc3.zzi(zzah.ANALYTICS_STORAGE)) {
                                    zzt.zzE((String) Preconditions.checkNotNull(zzj.zzu()));
                                }
                                if (!TextUtils.isEmpty(zzj.zzx())) {
                                }
                                zzam zzamVar15 = this.zze;
                                zzal(zzamVar15);
                                zzu = zzamVar15.zzu(zzqVar.zza);
                                while (i3 < zzu.size()) {
                                }
                                zzamVar2 = this.zze;
                                zzal(zzamVar2);
                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzt.zzaC();
                                zzamVar2.zzg();
                                zzamVar2.zzW();
                                Preconditions.checkNotNull(zzgdVar);
                                Preconditions.checkNotEmpty(zzgdVar.zzx());
                                byte[] zzbu = zzgdVar.zzbu();
                                zzkv zzkvVar2 = zzamVar2.zzf.zzi;
                                zzal(zzkvVar2);
                                long zzd2 = zzkvVar2.zzd(zzbu);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("app_id", zzgdVar.zzx());
                                String str7 = str2;
                                contentValues2.put(str7, Long.valueOf(zzd2));
                                contentValues2.put("metadata", zzbu);
                                zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                zzamVar3 = this.zze;
                                zzal(zzamVar3);
                                zzatVar = new zzat(zzarVar.zzf);
                                while (true) {
                                    if (!zzatVar.hasNext()) {
                                    }
                                }
                                i4 = 1;
                                zzamVar3.zzg();
                                zzamVar3.zzW();
                                Preconditions.checkNotNull(zzarVar);
                                Preconditions.checkNotEmpty(zzarVar.zza);
                                zzkv zzkvVar3 = zzamVar3.zzf.zzi;
                                zzal(zzkvVar3);
                                byte[] zzbu2 = zzkvVar3.zzj(zzarVar).zzbu();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzarVar.zza);
                                contentValues.put("name", zzarVar.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                                contentValues.put(str7, Long.valueOf(zzd2));
                                contentValues.put("data", zzbu2);
                                contentValues.put("realtime", Integer.valueOf(i4));
                                if (zzamVar3.zzh().insert(str5, null, contentValues) != -1) {
                                }
                                zzam zzamVar16 = this.zze;
                                zzal(zzamVar16);
                                zzamVar16.zzC();
                                zzam zzamVar17 = this.zze;
                                zzal(zzamVar17);
                                zzamVar17.zzx();
                                zzag();
                                zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                return;
                            }
                            zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                            zzamVar3 = this.zze;
                            zzal(zzamVar3);
                            zzatVar = new zzat(zzarVar.zzf);
                            while (true) {
                                if (!zzatVar.hasNext()) {
                                    if ("_r".equals(zzatVar.next())) {
                                        break;
                                    }
                                } else {
                                    zzfi zzfiVar4 = this.zzc;
                                    zzal(zzfiVar4);
                                    boolean zzq = zzfiVar4.zzq(zzarVar.zza, zzarVar.zzb);
                                    zzam zzamVar18 = this.zze;
                                    zzal(zzamVar18);
                                    zzak zzl = zzamVar18.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                                    if (!zzq || zzl.zze >= zzg().zze(zzarVar.zza, zzdu.zzn)) {
                                        i4 = i2;
                                    }
                                }
                            }
                            i4 = 1;
                            zzamVar3.zzg();
                            zzamVar3.zzW();
                            Preconditions.checkNotNull(zzarVar);
                            Preconditions.checkNotEmpty(zzarVar.zza);
                            zzkv zzkvVar32 = zzamVar3.zzf.zzi;
                            zzal(zzkvVar32);
                            byte[] zzbu22 = zzkvVar32.zzj(zzarVar).zzbu();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", zzarVar.zza);
                            contentValues.put("name", zzarVar.zzb);
                            contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                            contentValues.put(str7, Long.valueOf(zzd2));
                            contentValues.put("data", zzbu22);
                            contentValues.put("realtime", Integer.valueOf(i4));
                            if (zzamVar3.zzh().insert(str5, null, contentValues) != -1) {
                                zzamVar3.zzt.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeh.zzn(zzarVar.zza));
                            } else {
                                this.zza = 0L;
                            }
                            zzam zzamVar162 = this.zze;
                            zzal(zzamVar162);
                            zzamVar162.zzC();
                            zzam zzamVar172 = this.zze;
                            zzal(zzamVar172);
                            zzamVar172.zzx();
                            zzag();
                            zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                            return;
                        } catch (SQLiteException e4) {
                            zzamVar2.zzt.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeh.zzn(zzgdVar.zzx()), e4);
                            throw e4;
                        }
                        if (j2 > 0) {
                            zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeh.zzn(str6), Long.valueOf(j2));
                        }
                        i2 = i;
                        str5 = str4;
                        zzarVar = new zzar(this.zzn, zza.zzc, str6, zza.zza, zza.zzd, 0L, zzc4);
                        zzam zzamVar122 = this.zze;
                        zzal(zzamVar122);
                        zzn = zzamVar122.zzn(str6, zzarVar.zzb);
                        if (zzn != null) {
                            zzam zzamVar19 = this.zze;
                            zzal(zzamVar19);
                            if (zzamVar19.zzf(str6) >= zzg().zzb(str6) && zzai) {
                                zzay().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeh.zzn(str6), this.zzn.zzj().zzd(zzarVar.zzb), Integer.valueOf(zzg().zzb(str6)));
                                zzv().zzN(this.zzF, str6, 8, null, null, 0);
                                return;
                            }
                            zzc = new zzas(str6, zzarVar.zzb, 0L, 0L, 0L, zzarVar.zzd, 0L, null, null, null, null);
                        } else {
                            zzarVar = zzarVar.zza(this.zzn, zzn.zzf);
                            zzc = zzn.zzc(zzarVar.zzd);
                        }
                        zzam zzamVar132 = this.zze;
                        zzal(zzamVar132);
                        zzamVar132.zzE(zzc);
                        zzaz().zzg();
                        zzB();
                        Preconditions.checkNotNull(zzarVar);
                        Preconditions.checkNotNull(zzqVar);
                        Preconditions.checkNotEmpty(zzarVar.zza);
                        Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                        zzt = com.google.android.gms.internal.measurement.zzgd.zzt();
                        zzt.zzad(1);
                        zzt.zzZ("android");
                        if (!TextUtils.isEmpty(zzqVar.zza)) {
                            zzt.zzD(zzqVar.zza);
                        }
                        if (!TextUtils.isEmpty(zzqVar.zzd)) {
                            zzt.zzF(zzqVar.zzd);
                        }
                        if (!TextUtils.isEmpty(zzqVar.zzc)) {
                            zzt.zzG(zzqVar.zzc);
                        }
                        zzpd.zzc();
                        if (zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzqVar.zza, zzdu.zzan) && !TextUtils.isEmpty(zzqVar.zzx)) {
                            zzt.zzah(zzqVar.zzx);
                        }
                        j3 = zzqVar.zzj;
                        if (j3 != -2147483648L) {
                            zzt.zzH((int) j3);
                        }
                        zzt.zzV(zzqVar.zze);
                        if (!TextUtils.isEmpty(zzqVar.zzb)) {
                            zzt.zzU(zzqVar.zzb);
                        }
                        zzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                        if (zzt.zzaq().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                            zzt.zzC(zzqVar.zzq);
                        }
                        j4 = zzqVar.zzf;
                        if (j4 != 0) {
                            zzt.zzM(j4);
                        }
                        zzt.zzP(zzqVar.zzs);
                        zzkv zzkvVar4 = this.zzi;
                        zzal(zzkvVar4);
                        zzc2 = zzdu.zzc(zzkvVar4.zzf.zzn.zzau());
                        if (zzc2 != null && !zzc2.isEmpty()) {
                            arrayList = new ArrayList();
                            int intValue32 = ((Integer) zzdu.zzO.zza(null)).intValue();
                            for (Map.Entry entry : zzc2.entrySet()) {
                                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                    try {
                                        int parseInt = Integer.parseInt((String) entry.getValue());
                                        if (parseInt != 0) {
                                            arrayList.add(Integer.valueOf(parseInt));
                                            if (arrayList.size() >= intValue32) {
                                                zzkvVar4.zzt.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                break;
                                            }
                                            continue;
                                        } else {
                                            continue;
                                        }
                                    } catch (NumberFormatException e5) {
                                        zzkvVar4.zzt.zzay().zzk().zzb("Experiment ID NumberFormatException", e5);
                                    }
                                }
                            }
                        }
                        arrayList = null;
                        if (arrayList != null) {
                            zzt.zzh(arrayList);
                        }
                        zzc3 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                        if (zzc3.zzi(zzah.AD_STORAGE) && zzqVar.zzo) {
                            zzd = this.zzk.zzd(zzqVar.zza, zzc3);
                            if (!TextUtils.isEmpty((CharSequence) zzd.first) && zzqVar.zzo) {
                                zzt.zzae((String) zzd.first);
                                if (zzd.second != null) {
                                    zzt.zzX(((Boolean) zzd.second).booleanValue());
                                }
                            }
                        }
                        this.zzn.zzg().zzu();
                        zzt.zzN(Build.MODEL);
                        this.zzn.zzg().zzu();
                        zzt.zzY(Build.VERSION.RELEASE);
                        zzt.zzaj((int) this.zzn.zzg().zzb());
                        zzt.zzan(this.zzn.zzg().zzc());
                        if (this.zzn.zzJ()) {
                            zzt.zzap();
                            if (!TextUtils.isEmpty(null)) {
                                zzt.zzO(null);
                            }
                        }
                        zzam zzamVar142 = this.zze;
                        zzal(zzamVar142);
                        zzj = zzamVar142.zzj(zzqVar.zza);
                        if (zzj == null) {
                            zzj = new zzh(this.zzn, zzqVar.zza);
                            zzj.zzH(zzw(zzc3));
                            zzj.zzV(zzqVar.zzk);
                            zzj.zzW(zzqVar.zzb);
                            if (zzc3.zzi(zzah.AD_STORAGE)) {
                                zzj.zzae(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                            }
                            zzj.zzaa(0L);
                            zzj.zzab(0L);
                            zzj.zzZ(0L);
                            zzj.zzJ(zzqVar.zzc);
                            zzj.zzK(zzqVar.zzj);
                            zzj.zzI(zzqVar.zzd);
                            zzj.zzX(zzqVar.zze);
                            zzj.zzS(zzqVar.zzf);
                            zzj.zzac(zzqVar.zzh);
                            zzj.zzT(zzqVar.zzs);
                            zzam zzamVar20 = this.zze;
                            zzal(zzamVar20);
                            zzamVar20.zzD(zzj);
                        }
                        if (zzc3.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzj.zzu())) {
                            zzt.zzE((String) Preconditions.checkNotNull(zzj.zzu()));
                        }
                        if (!TextUtils.isEmpty(zzj.zzx())) {
                            zzt.zzT((String) Preconditions.checkNotNull(zzj.zzx()));
                        }
                        zzam zzamVar152 = this.zze;
                        zzal(zzamVar152);
                        zzu = zzamVar152.zzu(zzqVar.zza);
                        for (i3 = i2; i3 < zzu.size(); i3++) {
                            com.google.android.gms.internal.measurement.zzgl zzd3 = com.google.android.gms.internal.measurement.zzgm.zzd();
                            zzd3.zzf(((zzky) zzu.get(i3)).zzc);
                            zzd3.zzg(((zzky) zzu.get(i3)).zzd);
                            zzkv zzkvVar5 = this.zzi;
                            zzal(zzkvVar5);
                            zzkvVar5.zzu(zzd3, ((zzky) zzu.get(i3)).zze);
                            zzt.zzl(zzd3);
                        }
                        zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzt.zzaC();
                        zzamVar2.zzg();
                        zzamVar2.zzW();
                        Preconditions.checkNotNull(zzgdVar);
                        Preconditions.checkNotEmpty(zzgdVar.zzx());
                        byte[] zzbu3 = zzgdVar.zzbu();
                        zzkv zzkvVar22 = zzamVar2.zzf.zzi;
                        zzal(zzkvVar22);
                        long zzd22 = zzkvVar22.zzd(zzbu3);
                        ContentValues contentValues22 = new ContentValues();
                        contentValues22.put("app_id", zzgdVar.zzx());
                        String str72 = str2;
                        contentValues22.put(str72, Long.valueOf(zzd22));
                        contentValues22.put("metadata", zzbu3);
                    }
                }
                zzg = zza.zzb.zzg(FirebaseAnalytics.Param.CURRENCY);
                if (z) {
                    str = "_err";
                    longValue = zza.zzb.zze("value").longValue();
                } else {
                    double doubleValue = zza.zzb.zzd("value").doubleValue() * 1000000.0d;
                    if (doubleValue == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        str = "_err";
                        doubleValue = zza.zzb.zze("value").longValue() * 1000000.0d;
                    } else {
                        str = "_err";
                    }
                    if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                        zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(str6), Double.valueOf(doubleValue));
                        zzam zzamVar21 = this.zze;
                        zzal(zzamVar21);
                        zzamVar21.zzC();
                        return;
                    }
                    longValue = Math.round(doubleValue);
                    if (FirebaseAnalytics.Event.REFUND.equals(zza.zza)) {
                        longValue = -longValue;
                    }
                }
                if (!TextUtils.isEmpty(zzg)) {
                    String upperCase = zzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String concat = "_ltv_".concat(String.valueOf(upperCase));
                        zzam zzamVar22 = this.zze;
                        zzal(zzamVar22);
                        zzky zzp2 = zzamVar22.zzp(str6, concat);
                        if (zzp2 != null) {
                            Object obj = zzp2.zze;
                            if (obj instanceof Long) {
                                str2 = "metadata_fingerprint";
                                str3 = str;
                                zzkyVar = new zzky(str6, zza.zzc, concat, zzav().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + longValue));
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                if (!zzamVar.zzL(zzkyVar)) {
                                    zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str6), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                                    zzv().zzN(this.zzF, str6, 9, null, null, 0);
                                }
                                boolean zzai2 = zzlb.zzai(zza.zza);
                                boolean equals2 = str3.equals(zza.zza);
                                zzv();
                                zzauVar = zza.zzb;
                                if (zzauVar == null) {
                                }
                                zzam zzamVar62 = this.zze;
                                zzal(zzamVar62);
                                zzak zzm2 = zzamVar62.zzm(zza(), str6, j + 1, true, zzai2, false, equals2, false);
                                long j52 = zzm2.zzb;
                                zzg();
                                intValue = j52 - ((Integer) zzdu.zzj.zza(null)).intValue();
                                if (intValue > 0) {
                                }
                            }
                        }
                        String str8 = str;
                        zzam zzamVar23 = this.zze;
                        zzal(zzamVar23);
                        int zze = zzg().zze(str6, zzdu.zzD) - 1;
                        Preconditions.checkNotEmpty(str6);
                        zzamVar23.zzg();
                        zzamVar23.zzW();
                        SQLiteDatabase zzh = zzamVar23.zzh();
                        String str9 = str8;
                        String[] strArr = new String[3];
                        strArr[0] = str6;
                        strArr[1] = str6;
                        str2 = "metadata_fingerprint";
                        strArr[2] = String.valueOf(zze);
                        zzh.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                        str3 = str9;
                        zzkyVar = new zzky(str6, zza.zzc, concat, zzav().currentTimeMillis(), Long.valueOf(longValue));
                        zzamVar = this.zze;
                        zzal(zzamVar);
                        if (!zzamVar.zzL(zzkyVar)) {
                        }
                        boolean zzai22 = zzlb.zzai(zza.zza);
                        boolean equals22 = str3.equals(zza.zza);
                        zzv();
                        zzauVar = zza.zzb;
                        if (zzauVar == null) {
                        }
                        zzam zzamVar622 = this.zze;
                        zzal(zzamVar622);
                        zzak zzm22 = zzamVar622.zzm(zza(), str6, j + 1, true, zzai22, false, equals22, false);
                        long j522 = zzm22.zzb;
                        zzg();
                        intValue = j522 - ((Integer) zzdu.zzj.zza(null)).intValue();
                        if (intValue > 0) {
                        }
                    }
                }
                str2 = "metadata_fingerprint";
                str3 = str;
                boolean zzai222 = zzlb.zzai(zza.zza);
                boolean equals222 = str3.equals(zza.zza);
                zzv();
                zzauVar = zza.zzb;
                if (zzauVar == null) {
                }
                zzam zzamVar6222 = this.zze;
                zzal(zzamVar6222);
                zzak zzm222 = zzamVar6222.zzm(zza(), str6, j + 1, true, zzai222, false, equals222, false);
                long j5222 = zzm222.zzb;
                zzg();
                intValue = j5222 - ((Integer) zzdu.zzj.zza(null)).intValue();
                if (intValue > 0) {
                }
            }
            z = true;
            if (!"_iap".equals(zza.zza)) {
            }
            zzg = zza.zzb.zzg(FirebaseAnalytics.Param.CURRENCY);
            if (z) {
            }
            if (!TextUtils.isEmpty(zzg)) {
            }
            str2 = "metadata_fingerprint";
            str3 = str;
            boolean zzai2222 = zzlb.zzai(zza.zza);
            boolean equals2222 = str3.equals(zza.zza);
            zzv();
            zzauVar = zza.zzb;
            if (zzauVar == null) {
            }
            zzam zzamVar62222 = this.zze;
            zzal(zzamVar62222);
            zzak zzm2222 = zzamVar62222.zzm(zza(), str6, j + 1, true, zzai2222, false, equals2222, false);
            long j52222 = zzm2222.zzb;
            zzg();
            intValue = j52222 - ((Integer) zzdu.zzj.zza(null)).intValue();
            if (intValue > 0) {
            }
        } finally {
            zzam zzamVar24 = this.zze;
            zzal(zzamVar24);
            zzamVar24.zzx();
        }
    }

    final boolean zzZ() {
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock tryLock = channel.tryLock();
            this.zzw = tryLock;
            if (tryLock != null) {
                zzay().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzay().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzay().zzd().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzay().zzd().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzay().zzk().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    final long zza() {
        long currentTimeMillis = zzav().currentTimeMillis();
        zzjo zzjoVar = this.zzk;
        zzjoVar.zzW();
        zzjoVar.zzg();
        long zza = zzjoVar.zze.zza();
        if (zza == 0) {
            zza = zzjoVar.zzt.zzv().zzG().nextInt(86400000) + 1;
            zzjoVar.zze.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Context zzau() {
        return this.zzn.zzau();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Clock zzav() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzab zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzeh zzay() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzfo zzaz() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    final zzh zzd(zzq zzqVar) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzkr zzkrVar = null;
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzks(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(zzqVar.zza);
        zzai zzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        String zzf = zzc.zzi(zzah.AD_STORAGE) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzj == null) {
            zzj = new zzh(this.zzn, zzqVar.zza);
            if (zzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzj.zzH(zzw(zzc));
            }
            if (zzc.zzi(zzah.AD_STORAGE)) {
                zzj.zzae(zzf);
            }
        } else if (zzc.zzi(zzah.AD_STORAGE) && zzf != null && !zzf.equals(zzj.zzA())) {
            zzj.zzae(zzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzc).first)) {
                zzj.zzH(zzw(zzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzky zzkyVar = new zzky(zzqVar.zza, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lair", zzav().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzkyVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj.zzu()) && zzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzj.zzH(zzw(zzc));
        }
        zzj.zzW(zzqVar.zzb);
        zzj.zzF(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzj.zzV(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzj.zzX(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzj.zzJ(zzqVar.zzc);
        }
        zzj.zzK(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzj.zzI(str);
        }
        zzj.zzS(zzqVar.zzf);
        zzj.zzac(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzj.zzY(zzqVar.zzg);
        }
        zzj.zzG(zzqVar.zzo);
        zzj.zzad(zzqVar.zzr);
        zzj.zzT(zzqVar.zzs);
        zzpd.zzc();
        if (zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzqVar.zza, zzdu.zzan)) {
            zzj.zzag(zzqVar.zzx);
        }
        zznt.zzc();
        if (zzg().zzs(null, zzdu.zzaj)) {
            zzj.zzaf(zzqVar.zzt);
        } else {
            zznt.zzc();
            if (zzg().zzs(null, zzdu.zzai)) {
                zzj.zzaf(null);
            }
        }
        if (zzj.zzaj()) {
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzD(zzj);
        }
        return zzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    final zzai zzh(String str) {
        String str2;
        zzai zzaiVar = zzai.zza;
        zzaz().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 != null) {
            return zzaiVar2;
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        zzamVar.zzg();
        zzamVar.zzW();
        Cursor cursor = null;
        try {
            try {
                cursor = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursor.moveToFirst()) {
                    str2 = cursor.getString(0);
                } else {
                    if (cursor != null) {
                        cursor.close();
                    }
                    str2 = "G1";
                }
                zzai zzb2 = zzai.zzb(str2);
                zzV(str, zzb2);
                return zzb2;
            } catch (SQLiteException e) {
                zzamVar.zzt.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzec zzj() {
        return this.zzn.zzj();
    }

    public final zzen zzl() {
        zzen zzenVar = this.zzd;
        zzal(zzenVar);
        return zzenVar;
    }

    public final zzep zzm() {
        zzep zzepVar = this.zzf;
        if (zzepVar != null) {
            return zzepVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfi zzo() {
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        return zzfiVar;
    }

    final zzfr zzq() {
        return this.zzn;
    }

    public final zzic zzr() {
        zzic zzicVar = this.zzj;
        zzal(zzicVar);
        return zzicVar;
    }

    public final zzjo zzs() {
        return this.zzk;
    }

    public final zzkv zzu() {
        zzkv zzkvVar = this.zzi;
        zzal(zzkvVar);
        return zzkvVar;
    }

    public final zzlb zzv() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    final String zzw(zzai zzaiVar) {
        if (!zzaiVar.zzi(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String zzx(zzq zzqVar) {
        try {
            return (String) zzaz().zzh(new zzkm(this, zzqVar)).get(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzeh.zzn(zzqVar.zza), e);
            return null;
        }
    }

    final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
