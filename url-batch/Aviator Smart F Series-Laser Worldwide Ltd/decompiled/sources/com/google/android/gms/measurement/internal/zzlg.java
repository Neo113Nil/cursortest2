package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
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
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.artillery.ctc.uitls.TimeConstants;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liulishuo.filedownloader.model.FileDownloadModel;
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
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public final class zzlg implements zzgz {
    private static volatile zzlg zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zziq zzD;
    private String zzE;

    @VisibleForTesting
    long zza;
    private final zzfv zzc;
    private final zzfa zzd;
    private zzam zze;
    private zzfc zzf;
    private zzkr zzg;
    private zzaa zzh;
    private final zzli zzi;
    private zzio zzj;
    private zzka zzk;
    private final zzkv zzl;
    private zzfm zzm;
    private final zzge zzn;
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
    private final zzln zzF = new zzlb(this);

    zzlg(zzlh zzlhVar, zzge zzgeVar) {
        Preconditions.checkNotNull(zzlhVar);
        this.zzn = zzge.zzp(zzlhVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzkv(this);
        zzli zzliVar = new zzli(this);
        zzliVar.zzX();
        this.zzi = zzliVar;
        zzfa zzfaVar = new zzfa(this);
        zzfaVar.zzX();
        this.zzd = zzfaVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzX();
        this.zzc = zzfvVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaB().zzp(new zzkw(this, zzlhVar));
    }

    @VisibleForTesting
    static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i8, String str) {
        List zzp = zzfsVar.zzp();
        for (int i9 = 0; i9 < zzp.size(); i9++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i9)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf(i8).longValue());
        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) zze.zzaD();
        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zze2.zzaD();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    @VisibleForTesting
    static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, @NonNull String str) {
        List zzp = zzfsVar.zzp();
        for (int i8 = 0; i8 < zzp.size(); i8++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i8)).zzg())) {
                zzfsVar.zzh(i8);
                return;
            }
        }
    }

    @WorkerThread
    private final zzq zzac(String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzx())) {
            zzaA().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean zzad = zzad(zzj);
        if (zzad != null && !zzad.booleanValue()) {
            zzaA().zzd().zzb("App version does not match; dropping. appId", zzeu.zzn(str));
            return null;
        }
        String zzz = zzj.zzz();
        String zzx = zzj.zzx();
        long zzb2 = zzj.zzb();
        String zzw = zzj.zzw();
        long zzm = zzj.zzm();
        long zzj2 = zzj.zzj();
        boolean zzal = zzj.zzal();
        String zzy = zzj.zzy();
        zzj.zza();
        return new zzq(str, zzz, zzx, zzb2, zzw, zzm, zzj2, (String) null, zzal, false, zzy, 0L, 0L, 0, zzj.zzak(), false, zzj.zzs(), zzj.zzr(), zzj.zzk(), zzj.zzD(), (String) null, zzh(str).zzh(), "", (String) null, zzj.zzan(), zzj.zzq());
    }

    @WorkerThread
    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzu(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzu(), 0).versionName;
                String zzx = zzhVar.zzx();
                if (zzx != null && zzx.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    private final void zzae() {
        zzaB().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzaA().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzaA().zzj().zza("Stopping uploading service(s)");
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

    @VisibleForTesting
    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j8, boolean z7) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = true != z7 ? "_lte" : "_se";
        zzll zzp = zzamVar.zzp(zzgcVar.zzaq(), str);
        zzll zzllVar = (zzp == null || zzp.zze == null) ? new zzll(zzgcVar.zzaq(), TtmlNode.TEXT_EMPHASIS_AUTO, str, zzax().currentTimeMillis(), Long.valueOf(j8)) : new zzll(zzgcVar.zzaq(), TtmlNode.TEXT_EMPHASIS_AUTO, str, zzax().currentTimeMillis(), Long.valueOf(((Long) zzp.zze).longValue() + j8));
        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzd.zzf(str);
        zzd.zzg(zzax().currentTimeMillis());
        zzd.zze(((Long) zzllVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
        int zza = zzli.zza(zzgcVar, str);
        if (zza >= 0) {
            zzgcVar.zzan(zza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j8 > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzllVar);
            zzaA().zzj().zzc("Updated engagement user property. scope, value", true != z7 ? "lifetime" : "session-scoped", zzllVar.zze);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0239  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzag() {
        long max;
        long j8;
        zzaB().zzg();
        zzB();
        if (this.zza > 0) {
            long abs = 3600000 - Math.abs(zzax().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzaA().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzm().zzc();
                zzkr zzkrVar = this.zzg;
                zzal(zzkrVar);
                zzkrVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzaA().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkr zzkrVar2 = this.zzg;
            zzal(zzkrVar2);
            zzkrVar2.zza();
            return;
        }
        long currentTimeMillis = zzax().currentTimeMillis();
        zzg();
        long max2 = Math.max(0L, ((Long) zzeh.zzA.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        boolean z7 = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (!zzamVar2.zzG()) {
                z7 = false;
            }
        }
        if (z7) {
            String zzl = zzg().zzl();
            if (TextUtils.isEmpty(zzl) || ".none.".equals(zzl)) {
                zzg();
                max = Math.max(0L, ((Long) zzeh.zzu.zza(null)).longValue());
            } else {
                zzg();
                max = Math.max(0L, ((Long) zzeh.zzv.zza(null)).longValue());
            }
        } else {
            zzg();
            max = Math.max(0L, ((Long) zzeh.zzt.zza(null)).longValue());
        }
        long zza = this.zzk.zzc.zza();
        long zza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        boolean z8 = z7;
        long zzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        long max3 = Math.max(zzd, zzamVar4.zze());
        if (max3 != 0) {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            j8 = abs2 + max2;
            long max4 = Math.max(abs3, abs4);
            if (z8 && max4 > 0) {
                j8 = Math.min(abs2, max4) + max;
            }
            zzli zzliVar = this.zzi;
            zzal(zzliVar);
            if (!zzliVar.zzw(max4, max)) {
                j8 = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i8 = 0;
                while (true) {
                    zzg();
                    if (i8 >= Math.min(20, Math.max(0, ((Integer) zzeh.zzC.zza(null)).intValue()))) {
                        break;
                    }
                    zzg();
                    j8 += Math.max(0L, ((Long) zzeh.zzB.zza(null)).longValue()) * (1 << i8);
                    if (j8 > abs4) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            if (j8 != 0) {
                zzaA().zzj().zza("Next upload time is 0");
                zzm().zzc();
                zzkr zzkrVar3 = this.zzg;
                zzal(zzkrVar3);
                zzkrVar3.zza();
                return;
            }
            zzfa zzfaVar = this.zzd;
            zzal(zzfaVar);
            if (!zzfaVar.zza()) {
                zzaA().zzj().zza("No network");
                zzm().zzb();
                zzkr zzkrVar4 = this.zzg;
                zzal(zzkrVar4);
                zzkrVar4.zza();
                return;
            }
            long zza3 = this.zzk.zzb.zza();
            zzg();
            long max5 = Math.max(0L, ((Long) zzeh.zzr.zza(null)).longValue());
            zzli zzliVar2 = this.zzi;
            zzal(zzliVar2);
            if (!zzliVar2.zzw(zza3, max5)) {
                j8 = Math.max(j8, zza3 + max5);
            }
            zzm().zzc();
            long currentTimeMillis2 = j8 - zzax().currentTimeMillis();
            if (currentTimeMillis2 <= 0) {
                zzg();
                currentTimeMillis2 = Math.max(0L, ((Long) zzeh.zzw.zza(null)).longValue());
                this.zzk.zzc.zzb(zzax().currentTimeMillis());
            }
            zzaA().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
            zzkr zzkrVar5 = this.zzg;
            zzal(zzkrVar5);
            zzkrVar5.zzd(currentTimeMillis2);
            return;
        }
        j8 = 0;
        if (j8 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:363:0x0b33, code lost:
    
        if (r10 > (com.google.android.gms.measurement.internal.zzag.zzA() + r8)) goto L358;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037c A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043f A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048a A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07da A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0823 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0846 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08c7 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08f3 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0b23 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0baa A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0bc6 A[Catch: all -> 0x00eb, SQLiteException -> 0x0bde, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0bde, blocks: (B:371:0x0bb7, B:373:0x0bc6), top: B:370:0x0bb7, outer: #2 }] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzah(String str, long j8) {
        int i8;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        zzld zzldVar;
        zzam zzamVar;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        long currentTimeMillis;
        long zzk;
        ContentValues contentValues;
        long parseLong;
        int zzc;
        long j9;
        SecureRandom secureRandom;
        zzld zzldVar2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar3;
        Long l8;
        Boolean bool;
        long zzr;
        com.google.android.gms.internal.measurement.zzgc zzgcVar4;
        String str2;
        int i9;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        com.google.android.gms.internal.measurement.zzfs zzfsVar2;
        int i10;
        int i11;
        com.google.android.gms.internal.measurement.zzfs zzfsVar3;
        String str3 = "_npa";
        String str4 = "_ai";
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        zzamVar2.zzw();
        try {
            zzld zzldVar3 = new zzld(this, null);
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzU(null, j8, this.zzA, zzldVar3);
            List list = zzldVar3.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgc zzgcVar5 = (com.google.android.gms.internal.measurement.zzgc) zzldVar3.zza.zzbB();
                zzgcVar5.zzr();
                com.google.android.gms.internal.measurement.zzfs zzfsVar4 = null;
                com.google.android.gms.internal.measurement.zzfs zzfsVar5 = null;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = -1;
                int i16 = -1;
                while (true) {
                    i8 = i14;
                    zzgcVar = zzgcVar5;
                    if (i12 >= zzldVar3.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfs zzfsVar6 = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzft) zzldVar3.zzc.get(i12)).zzbB();
                    zzfv zzfvVar = this.zzc;
                    zzal(zzfvVar);
                    String str5 = str3;
                    if (zzfvVar.zzr(zzldVar3.zza.zzy(), zzfsVar6.zzo())) {
                        int i17 = i13;
                        zzaA().zzk().zzc("Dropping blocked raw event. appId", zzeu.zzn(zzldVar3.zza.zzy()), this.zzn.zzj().zzd(zzfsVar6.zzo()));
                        zzfv zzfvVar2 = this.zzc;
                        zzal(zzfvVar2);
                        if (!zzfvVar2.zzp(zzldVar3.zza.zzy())) {
                            zzfv zzfvVar3 = this.zzc;
                            zzal(zzfvVar3);
                            if (!zzfvVar3.zzs(zzldVar3.zza.zzy()) && !"_err".equals(zzfsVar6.zzo())) {
                                zzv().zzO(this.zzF, zzldVar3.zza.zzy(), 11, "_ev", zzfsVar6.zzo(), 0);
                            }
                        }
                        str2 = str4;
                        i14 = i8;
                        zzgcVar5 = zzgcVar;
                        i13 = i17;
                    } else {
                        int i18 = i13;
                        if (zzfsVar6.zzo().equals(zzhb.zza(str4))) {
                            zzfsVar6.zzi(str4);
                            zzaA().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzaA().zzr(), 5)) {
                                for (int i19 = 0; i19 < zzfsVar6.zza(); i19++) {
                                    if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzfsVar6.zzn(i19).zzg()) && !zzfsVar6.zzn(i19).zzh().isEmpty() && "admob".equalsIgnoreCase(zzfsVar6.zzn(i19).zzh())) {
                                        zzaA().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        zzfv zzfvVar4 = this.zzc;
                        zzal(zzfvVar4);
                        boolean zzq = zzfvVar4.zzq(zzldVar3.zza.zzy(), zzfsVar6.zzo());
                        if (zzq) {
                            str2 = str4;
                            i9 = i12;
                        } else {
                            zzal(this.zzi);
                            String zzo = zzfsVar6.zzo();
                            Preconditions.checkNotEmpty(zzo);
                            str2 = str4;
                            i9 = i12;
                            if (zzo.hashCode() != 95027 || !zzo.equals("_ui")) {
                                zzfsVar2 = zzfsVar4;
                                i10 = i15;
                                zzfsVar = zzfsVar5;
                                i11 = i16;
                                zzq = false;
                                if (zzq) {
                                    ArrayList arrayList = new ArrayList(zzfsVar6.zzp());
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                        if ("value".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i22)).zzg())) {
                                            i20 = i22;
                                        } else if (FirebaseAnalytics.Param.CURRENCY.equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i22)).zzg())) {
                                            i21 = i22;
                                        }
                                    }
                                    if (i20 != -1) {
                                        if (((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i20)).zzw() || ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i20)).zzu()) {
                                            if (i21 != -1) {
                                                String zzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i21)).zzh();
                                                if (zzh.length() == 3) {
                                                    int i23 = 0;
                                                    while (i23 < zzh.length()) {
                                                        int codePointAt = zzh.codePointAt(i23);
                                                        if (Character.isLetter(codePointAt)) {
                                                            i23 += Character.charCount(codePointAt);
                                                        }
                                                    }
                                                }
                                            }
                                            zzaA().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                            zzfsVar6.zzh(i20);
                                            zzab(zzfsVar6, "_c");
                                            zzaa(zzfsVar6, 19, FirebaseAnalytics.Param.CURRENCY);
                                            break;
                                        }
                                        zzaA().zzl().zza("Value must be specified with a numeric type.");
                                        zzfsVar6.zzh(i20);
                                        zzab(zzfsVar6, "_c");
                                        zzaa(zzfsVar6, 18, "value");
                                    }
                                    if ("_e".equals(zzfsVar6.zzo())) {
                                        zzal(this.zzi);
                                        if (zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar6.zzaD(), "_fr") == null) {
                                            if (zzfsVar != null && Math.abs(zzfsVar.zzc() - zzfsVar6.zzc()) <= 1000) {
                                                com.google.android.gms.internal.measurement.zzfs zzfsVar7 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar.clone();
                                                if (zzaj(zzfsVar6, zzfsVar7)) {
                                                    zzgcVar5 = zzgcVar;
                                                    zzgcVar5.zzS(i11, zzfsVar7);
                                                    i16 = i11;
                                                    i15 = i10;
                                                    zzfsVar4 = null;
                                                    zzfsVar5 = null;
                                                    i12 = i9;
                                                    zzldVar3.zzc.set(i12, (com.google.android.gms.internal.measurement.zzft) zzfsVar6.zzaD());
                                                    i13 = i18 + 1;
                                                    zzgcVar5.zzk(zzfsVar6);
                                                    i14 = i8;
                                                }
                                            }
                                            zzgcVar5 = zzgcVar;
                                            zzfsVar4 = zzfsVar6;
                                            i16 = i11;
                                            i15 = i18;
                                            zzfsVar5 = zzfsVar;
                                            i12 = i9;
                                            zzldVar3.zzc.set(i12, (com.google.android.gms.internal.measurement.zzft) zzfsVar6.zzaD());
                                            i13 = i18 + 1;
                                            zzgcVar5.zzk(zzfsVar6);
                                            i14 = i8;
                                        } else {
                                            zzgcVar5 = zzgcVar;
                                            i15 = i10;
                                            i16 = i11;
                                            zzfsVar4 = zzfsVar2;
                                            zzfsVar5 = zzfsVar;
                                            i12 = i9;
                                            zzldVar3.zzc.set(i12, (com.google.android.gms.internal.measurement.zzft) zzfsVar6.zzaD());
                                            i13 = i18 + 1;
                                            zzgcVar5.zzk(zzfsVar6);
                                            i14 = i8;
                                        }
                                    } else {
                                        zzgcVar5 = zzgcVar;
                                        if ("_vs".equals(zzfsVar6.zzo())) {
                                            zzal(this.zzi);
                                            if (zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar6.zzaD(), "_et") == null) {
                                                if (zzfsVar2 != null && Math.abs(zzfsVar2.zzc() - zzfsVar6.zzc()) <= 1000) {
                                                    com.google.android.gms.internal.measurement.zzfs zzfsVar8 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar2.clone();
                                                    if (zzaj(zzfsVar8, zzfsVar6)) {
                                                        int i24 = i10;
                                                        zzgcVar5.zzS(i24, zzfsVar8);
                                                        i15 = i24;
                                                        i16 = i11;
                                                        zzfsVar4 = null;
                                                        zzfsVar5 = null;
                                                        i12 = i9;
                                                        zzldVar3.zzc.set(i12, (com.google.android.gms.internal.measurement.zzft) zzfsVar6.zzaD());
                                                        i13 = i18 + 1;
                                                        zzgcVar5.zzk(zzfsVar6);
                                                        i14 = i8;
                                                    }
                                                }
                                                zzfsVar5 = zzfsVar6;
                                                i15 = i10;
                                                i16 = i18;
                                                zzfsVar4 = zzfsVar2;
                                                i12 = i9;
                                                zzldVar3.zzc.set(i12, (com.google.android.gms.internal.measurement.zzft) zzfsVar6.zzaD());
                                                i13 = i18 + 1;
                                                zzgcVar5.zzk(zzfsVar6);
                                                i14 = i8;
                                            }
                                        }
                                        i15 = i10;
                                        i16 = i11;
                                        zzfsVar4 = zzfsVar2;
                                        zzfsVar5 = zzfsVar;
                                        i12 = i9;
                                        zzldVar3.zzc.set(i12, (com.google.android.gms.internal.measurement.zzft) zzfsVar6.zzaD());
                                        i13 = i18 + 1;
                                        zzgcVar5.zzk(zzfsVar6);
                                        i14 = i8;
                                    }
                                }
                                if ("_e".equals(zzfsVar6.zzo())) {
                                }
                            }
                        }
                        i10 = i15;
                        int i25 = 0;
                        boolean z7 = false;
                        boolean z8 = false;
                        while (true) {
                            zzfsVar2 = zzfsVar4;
                            if (i25 >= zzfsVar6.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfsVar6.zzn(i25).zzg())) {
                                com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfsVar6.zzn(i25).zzbB();
                                zzfsVar3 = zzfsVar5;
                                zzfwVar.zzi(1L);
                                zzfsVar6.zzk(i25, (com.google.android.gms.internal.measurement.zzfx) zzfwVar.zzaD());
                                z7 = true;
                            } else {
                                zzfsVar3 = zzfsVar5;
                                if ("_r".equals(zzfsVar6.zzn(i25).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfsVar6.zzn(i25).zzbB();
                                    zzfwVar2.zzi(1L);
                                    zzfsVar6.zzk(i25, (com.google.android.gms.internal.measurement.zzfx) zzfwVar2.zzaD());
                                    z8 = true;
                                }
                            }
                            i25++;
                            zzfsVar4 = zzfsVar2;
                            zzfsVar5 = zzfsVar3;
                        }
                        zzfsVar = zzfsVar5;
                        if (!z7 && zzq) {
                            zzaA().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfsVar6.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze.zzj("_c");
                            zze.zzi(1L);
                            zzfsVar6.zze(zze);
                        }
                        if (!z8) {
                            zzaA().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfsVar6.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze2.zzj("_r");
                            zze2.zzi(1L);
                            zzfsVar6.zze(zze2);
                        }
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        i11 = i16;
                        if (zzamVar4.zzl(zza(), zzldVar3.zza.zzy(), false, false, false, false, true).zze > zzg().zze(zzldVar3.zza.zzy(), zzeh.zzo)) {
                            zzab(zzfsVar6, "_r");
                        } else {
                            i8 = 1;
                        }
                        if (zzlo.zzak(zzfsVar6.zzo()) && zzq) {
                            zzam zzamVar5 = this.zze;
                            zzal(zzamVar5);
                            if (zzamVar5.zzl(zza(), zzldVar3.zza.zzy(), false, false, true, false, false).zzc > zzg().zze(zzldVar3.zza.zzy(), zzeh.zzn)) {
                                zzaA().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeu.zzn(zzldVar3.zza.zzy()));
                                com.google.android.gms.internal.measurement.zzfw zzfwVar3 = null;
                                boolean z9 = false;
                                int i26 = -1;
                                for (int i27 = 0; i27 < zzfsVar6.zza(); i27++) {
                                    com.google.android.gms.internal.measurement.zzfx zzn = zzfsVar6.zzn(i27);
                                    if ("_c".equals(zzn.zzg())) {
                                        zzfwVar3 = (com.google.android.gms.internal.measurement.zzfw) zzn.zzbB();
                                        i26 = i27;
                                    } else if ("_err".equals(zzn.zzg())) {
                                        z9 = true;
                                    }
                                }
                                if (z9) {
                                    if (zzfwVar3 != null) {
                                        zzfsVar6.zzh(i26);
                                    } else {
                                        zzfwVar3 = null;
                                    }
                                }
                                if (zzfwVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar4 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar3.clone();
                                    zzfwVar4.zzj("_err");
                                    zzfwVar4.zzi(10L);
                                    zzfsVar6.zzk(i26, (com.google.android.gms.internal.measurement.zzfx) zzfwVar4.zzaD());
                                } else {
                                    zzaA().zzd().zzb("Did not find conversion parameter. appId", zzeu.zzn(zzldVar3.zza.zzy()));
                                }
                            }
                        }
                        if (zzq) {
                        }
                        if ("_e".equals(zzfsVar6.zzo())) {
                        }
                    }
                    i12++;
                    str3 = str5;
                    str4 = str2;
                }
                String str6 = str3;
                com.google.android.gms.internal.measurement.zzgc zzgcVar6 = zzgcVar;
                long j10 = 0;
                int i28 = 0;
                while (i28 < i13) {
                    com.google.android.gms.internal.measurement.zzft zze3 = zzgcVar6.zze(i28);
                    if ("_e".equals(zze3.zzh())) {
                        zzal(this.zzi);
                        if (zzli.zzB(zze3, "_fr") != null) {
                            zzgcVar6.zzA(i28);
                            i13--;
                            i28--;
                            i28++;
                        }
                    }
                    zzal(this.zzi);
                    com.google.android.gms.internal.measurement.zzfx zzB = zzli.zzB(zze3, "_et");
                    if (zzB != null) {
                        Long valueOf = zzB.zzw() ? Long.valueOf(zzB.zzd()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j10 += valueOf.longValue();
                        }
                    }
                    i28++;
                }
                zzaf(zzgcVar6, j10, false);
                Iterator it = zzgcVar6.zzat().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it.next()).zzh())) {
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzA(zzgcVar6.zzaq(), "_se");
                        break;
                    }
                }
                if (zzli.zza(zzgcVar6, "_sid") >= 0) {
                    zzaf(zzgcVar6, j10, true);
                } else {
                    int zza = zzli.zza(zzgcVar6, "_se");
                    if (zza >= 0) {
                        zzgcVar6.zzB(zza);
                        zzaA().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeu.zzn(zzldVar3.zza.zzy()));
                    }
                }
                zzli zzliVar = this.zzi;
                zzal(zzliVar);
                zzliVar.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                zzfv zzfvVar5 = zzliVar.zzf.zzc;
                zzal(zzfvVar5);
                if (zzfvVar5.zzn(zzgcVar6.zzaq())) {
                    zzam zzamVar7 = zzliVar.zzf.zze;
                    zzal(zzamVar7);
                    zzh zzj = zzamVar7.zzj(zzgcVar6.zzaq());
                    if (zzj != null && zzj.zzak() && zzliVar.zzt.zzg().zze()) {
                        zzliVar.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzd.zzf(str6);
                        zzd.zzg(zzliVar.zzt.zzg().zza());
                        zzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
                        int i29 = 0;
                        while (true) {
                            if (i29 >= zzgcVar6.zzb()) {
                                zzgcVar6.zzm(zzgmVar);
                                break;
                            }
                            if (str6.equals(zzgcVar6.zzap(i29).zzf())) {
                                zzgcVar6.zzan(i29, zzgmVar);
                                break;
                            }
                            i29++;
                        }
                    }
                }
                zzgcVar6.zzai(Long.MAX_VALUE);
                zzgcVar6.zzQ(Long.MIN_VALUE);
                for (int i30 = 0; i30 < zzgcVar6.zza(); i30++) {
                    com.google.android.gms.internal.measurement.zzft zze4 = zzgcVar6.zze(i30);
                    if (zze4.zzd() < zzgcVar6.zzd()) {
                        zzgcVar6.zzai(zze4.zzd());
                    }
                    if (zze4.zzd() > zzgcVar6.zzc()) {
                        zzgcVar6.zzQ(zze4.zzd());
                    }
                }
                zzgcVar6.zzz();
                zzgcVar6.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgcVar6.zzf(zzaaVar.zza(zzgcVar6.zzaq(), zzgcVar6.zzat(), zzgcVar6.zzau(), Long.valueOf(zzgcVar6.zzd()), Long.valueOf(zzgcVar6.zzc())));
                if (zzg().zzw(zzldVar3.zza.zzy())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom zzG = zzv().zzG();
                    int i31 = 0;
                    while (i31 < zzgcVar6.zza()) {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar9 = (com.google.android.gms.internal.measurement.zzfs) zzgcVar6.zze(i31).zzbB();
                        if (zzfsVar9.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str7 = (String) zzli.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD(), "_en");
                            zzas zzasVar = (zzas) hashMap.get(str7);
                            if (zzasVar == null) {
                                zzam zzamVar8 = this.zze;
                                zzal(zzamVar8);
                                zzasVar = zzamVar8.zzn(zzldVar3.zza.zzy(), (String) Preconditions.checkNotNull(str7));
                                if (zzasVar != null) {
                                    hashMap.put(str7, zzasVar);
                                }
                            }
                            if (zzasVar != null && zzasVar.zzi == null) {
                                Long l9 = zzasVar.zzj;
                                if (l9 != null && l9.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzli.zzz(zzfsVar9, "_sr", zzasVar.zzj);
                                }
                                Boolean bool2 = zzasVar.zzk;
                                if (bool2 != null && bool2.booleanValue()) {
                                    zzal(this.zzi);
                                    zzli.zzz(zzfsVar9, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD());
                            }
                            zzgcVar6.zzS(i31, zzfsVar9);
                        } else {
                            zzfv zzfvVar6 = this.zzc;
                            zzal(zzfvVar6);
                            String zzy = zzldVar3.zza.zzy();
                            String zza2 = zzfvVar6.zza(zzy, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(zza2)) {
                                try {
                                    parseLong = Long.parseLong(zza2);
                                } catch (NumberFormatException e8) {
                                    zzfvVar6.zzt.zzaA().zzk().zzc("Unable to parse timezone offset. appId", zzeu.zzn(zzy), e8);
                                }
                                long zzr2 = zzv().zzr(zzfsVar9.zzc(), parseLong);
                                com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD();
                                Long l10 = 1L;
                                long j11 = parseLong;
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
                                        } else if (l10.equals(Long.valueOf(zzfxVar.zzd()))) {
                                            zzc = 1;
                                        }
                                    }
                                }
                                zzfv zzfvVar7 = this.zzc;
                                zzal(zzfvVar7);
                                zzc = zzfvVar7.zzc(zzldVar3.zza.zzy(), zzfsVar9.zzo());
                                if (zzc > 0) {
                                    zzaA().zzk().zzc("Sample rate must be positive. event, rate", zzfsVar9.zzo(), Integer.valueOf(zzc));
                                    arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD());
                                    zzgcVar6.zzS(i31, zzfsVar9);
                                } else {
                                    zzas zzasVar2 = (zzas) hashMap.get(zzfsVar9.zzo());
                                    if (zzasVar2 == null) {
                                        zzam zzamVar9 = this.zze;
                                        zzal(zzamVar9);
                                        zzasVar2 = zzamVar9.zzn(zzldVar3.zza.zzy(), zzfsVar9.zzo());
                                        if (zzasVar2 == null) {
                                            j9 = zzr2;
                                            zzaA().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzldVar3.zza.zzy(), zzfsVar9.zzo());
                                            zzasVar2 = new zzas(zzldVar3.zza.zzy(), zzfsVar9.zzo(), 1L, 1L, 1L, zzfsVar9.zzc(), 0L, null, null, null, null);
                                            zzal(this.zzi);
                                            Long l11 = (Long) zzli.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD(), "_eid");
                                            Boolean valueOf2 = Boolean.valueOf(l11 == null);
                                            if (zzc != 1) {
                                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD());
                                                if (valueOf2.booleanValue() && (zzasVar2.zzi != null || zzasVar2.zzj != null || zzasVar2.zzk != null)) {
                                                    hashMap.put(zzfsVar9.zzo(), zzasVar2.zza(null, null, null));
                                                }
                                                zzgcVar6.zzS(i31, zzfsVar9);
                                            } else {
                                                if (zzG.nextInt(zzc) == 0) {
                                                    zzal(this.zzi);
                                                    Long valueOf3 = Long.valueOf(zzc);
                                                    zzli.zzz(zzfsVar9, "_sr", valueOf3);
                                                    arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD());
                                                    if (valueOf2.booleanValue()) {
                                                        zzasVar2 = zzasVar2.zza(null, valueOf3, null);
                                                    }
                                                    hashMap.put(zzfsVar9.zzo(), zzasVar2.zzb(zzfsVar9.zzc(), j9));
                                                    zzldVar2 = zzldVar3;
                                                    zzgcVar4 = zzgcVar6;
                                                    secureRandom = zzG;
                                                } else {
                                                    long j12 = j9;
                                                    secureRandom = zzG;
                                                    Long l12 = zzasVar2.zzh;
                                                    if (l12 != null) {
                                                        zzr = l12.longValue();
                                                        zzldVar2 = zzldVar3;
                                                        zzgcVar3 = zzgcVar6;
                                                        l8 = l11;
                                                        bool = valueOf2;
                                                    } else {
                                                        zzldVar2 = zzldVar3;
                                                        zzgcVar3 = zzgcVar6;
                                                        l8 = l11;
                                                        bool = valueOf2;
                                                        zzr = zzv().zzr(zzfsVar9.zzb(), j11);
                                                    }
                                                    if (zzr != j12) {
                                                        zzal(this.zzi);
                                                        zzli.zzz(zzfsVar9, "_efs", 1L);
                                                        zzal(this.zzi);
                                                        Long valueOf4 = Long.valueOf(zzc);
                                                        zzli.zzz(zzfsVar9, "_sr", valueOf4);
                                                        arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD());
                                                        if (bool.booleanValue()) {
                                                            zzasVar2 = zzasVar2.zza(null, valueOf4, Boolean.TRUE);
                                                        }
                                                        hashMap.put(zzfsVar9.zzo(), zzasVar2.zzb(zzfsVar9.zzc(), j12));
                                                    } else if (bool.booleanValue()) {
                                                        hashMap.put(zzfsVar9.zzo(), zzasVar2.zza(l8, null, null));
                                                    }
                                                    zzgcVar4 = zzgcVar3;
                                                }
                                                zzgcVar4.zzS(i31, zzfsVar9);
                                                i31++;
                                                zzgcVar6 = zzgcVar4;
                                                zzG = secureRandom;
                                                zzldVar3 = zzldVar2;
                                            }
                                        }
                                    }
                                    j9 = zzr2;
                                    zzal(this.zzi);
                                    Long l112 = (Long) zzli.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD(), "_eid");
                                    Boolean valueOf22 = Boolean.valueOf(l112 == null);
                                    if (zzc != 1) {
                                    }
                                }
                            }
                            parseLong = 0;
                            long zzr22 = zzv().zzr(zzfsVar9.zzc(), parseLong);
                            com.google.android.gms.internal.measurement.zzft zzftVar2 = (com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaD();
                            Long l102 = 1L;
                            long j112 = parseLong;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            zzfv zzfvVar72 = this.zzc;
                            zzal(zzfvVar72);
                            zzc = zzfvVar72.zzc(zzldVar3.zza.zzy(), zzfsVar9.zzo());
                            if (zzc > 0) {
                            }
                        }
                        zzldVar2 = zzldVar3;
                        zzgcVar4 = zzgcVar6;
                        secureRandom = zzG;
                        i31++;
                        zzgcVar6 = zzgcVar4;
                        zzG = secureRandom;
                        zzldVar3 = zzldVar2;
                    }
                    zzld zzldVar4 = zzldVar3;
                    zzgcVar2 = zzgcVar6;
                    if (arrayList2.size() < zzgcVar2.zza()) {
                        zzgcVar2.zzr();
                        zzgcVar2.zzg(arrayList2);
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        zzam zzamVar10 = this.zze;
                        zzal(zzamVar10);
                        zzamVar10.zzE((zzas) entry.getValue());
                    }
                    zzldVar = zzldVar4;
                } else {
                    zzgcVar2 = zzgcVar6;
                    zzldVar = zzldVar3;
                }
                String zzy2 = zzldVar.zza.zzy();
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzh zzj2 = zzamVar11.zzj(zzy2);
                if (zzj2 == null) {
                    zzaA().zzd().zzb("Bundling raw events w/o app info. appId", zzeu.zzn(zzldVar.zza.zzy()));
                } else if (zzgcVar2.zza() > 0) {
                    long zzn2 = zzj2.zzn();
                    if (zzn2 != 0) {
                        zzgcVar2.zzab(zzn2);
                    } else {
                        zzgcVar2.zzv();
                    }
                    long zzp = zzj2.zzp();
                    if (zzp != 0) {
                        zzn2 = zzp;
                    }
                    if (zzn2 != 0) {
                        zzgcVar2.zzac(zzn2);
                    } else {
                        zzgcVar2.zzw();
                    }
                    zzj2.zzF();
                    zzgcVar2.zzI((int) zzj2.zzo());
                    zzj2.zzac(zzgcVar2.zzd());
                    zzj2.zzaa(zzgcVar2.zzc());
                    String zzt = zzj2.zzt();
                    if (zzt != null) {
                        zzgcVar2.zzW(zzt);
                    } else {
                        zzgcVar2.zzs();
                    }
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    zzamVar12.zzD(zzj2);
                }
                if (zzgcVar2.zza() > 0) {
                    this.zzn.zzay();
                    zzfv zzfvVar8 = this.zzc;
                    zzal(zzfvVar8);
                    com.google.android.gms.internal.measurement.zzff zze5 = zzfvVar8.zze(zzldVar.zza.zzy());
                    try {
                        try {
                            if (zze5 != null && zze5.zzu()) {
                                zzgcVar2.zzK(zze5.zzc());
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaD();
                                zzamVar.zzg();
                                zzamVar.zzW();
                                Preconditions.checkNotNull(zzgdVar);
                                Preconditions.checkNotEmpty(zzgdVar.zzy());
                                Preconditions.checkState(zzgdVar.zzbg());
                                zzamVar.zzz();
                                currentTimeMillis = zzamVar.zzt.zzax().currentTimeMillis();
                                zzk = zzgdVar.zzk();
                                zzamVar.zzt.zzf();
                                if (zzk >= currentTimeMillis - zzag.zzA()) {
                                    long zzk2 = zzgdVar.zzk();
                                    zzamVar.zzt.zzf();
                                }
                                zzamVar.zzt.zzaA().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeu.zzn(zzgdVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                                byte[] zzbx = zzgdVar.zzbx();
                                zzli zzliVar2 = zzamVar.zzf.zzi;
                                zzal(zzliVar2);
                                byte[] zzy3 = zzliVar2.zzy(zzbx);
                                zzamVar.zzt.zzaA().zzj().zzb("Saving bundle, size", Integer.valueOf(zzy3.length));
                                contentValues = new ContentValues();
                                contentValues.put(HttpConstants.HTTP_APP_ID, zzgdVar.zzy());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                                contentValues.put("data", zzy3);
                                contentValues.put("has_realtime", Integer.valueOf(i8));
                                if (zzgdVar.zzbm()) {
                                    contentValues.put("retry_count", Integer.valueOf(zzgdVar.zze()));
                                }
                                if (zzamVar.zzh().insert("queue", null, contentValues) == -1) {
                                    zzamVar.zzt.zzaA().zzd().zzb("Failed to insert bundle (got -1). appId", zzeu.zzn(zzgdVar.zzy()));
                                }
                            }
                            if (zzamVar.zzh().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e9) {
                            zzamVar.zzt.zzaA().zzd().zzc("Error storing bundle. appId", zzeu.zzn(zzgdVar.zzy()), e9);
                        }
                        zzli zzliVar22 = zzamVar.zzf.zzi;
                        zzal(zzliVar22);
                        byte[] zzy32 = zzliVar22.zzy(zzbx);
                        zzamVar.zzt.zzaA().zzj().zzb("Saving bundle, size", Integer.valueOf(zzy32.length));
                        contentValues = new ContentValues();
                        contentValues.put(HttpConstants.HTTP_APP_ID, zzgdVar.zzy());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                        contentValues.put("data", zzy32);
                        contentValues.put("has_realtime", Integer.valueOf(i8));
                        if (zzgdVar.zzbm()) {
                        }
                    } catch (IOException e10) {
                        zzamVar.zzt.zzaA().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeu.zzn(zzgdVar.zzy()), e10);
                    }
                    if (zzldVar.zza.zzG().isEmpty()) {
                        zzgcVar2.zzK(-1L);
                    } else {
                        zzaA().zzk().zzb("Did not find measurement config or missing version info. appId", zzeu.zzn(zzldVar.zza.zzy()));
                    }
                    zzamVar = this.zze;
                    zzal(zzamVar);
                    zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaD();
                    zzamVar.zzg();
                    zzamVar.zzW();
                    Preconditions.checkNotNull(zzgdVar);
                    Preconditions.checkNotEmpty(zzgdVar.zzy());
                    Preconditions.checkState(zzgdVar.zzbg());
                    zzamVar.zzz();
                    currentTimeMillis = zzamVar.zzt.zzax().currentTimeMillis();
                    zzk = zzgdVar.zzk();
                    zzamVar.zzt.zzf();
                    if (zzk >= currentTimeMillis - zzag.zzA()) {
                    }
                    zzamVar.zzt.zzaA().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeu.zzn(zzgdVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                    byte[] zzbx2 = zzgdVar.zzbx();
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                List list2 = zzldVar.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i32 = 0; i32 < list2.size(); i32++) {
                    if (i32 != 0) {
                        sb.append(SystemInfoUtil.COMMA);
                    }
                    sb.append(((Long) list2.get(i32)).longValue());
                }
                sb.append(")");
                int delete = zzamVar13.zzh().delete("raw_events", sb.toString(), null);
                if (delete != list2.size()) {
                    zzamVar13.zzt.zzaA().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzy2, zzy2});
                } catch (SQLiteException e11) {
                    zzamVar14.zzt.zzaA().zzd().zzc("Failed to remove unused event metadata. appId", zzeu.zzn(zzy2), e11);
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
        zzaB().zzg();
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
        com.google.android.gms.internal.measurement.zzfx zzB = zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_sc");
        String zzh = zzB == null ? null : zzB.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB2 = zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_pc");
        String zzh2 = zzB2 != null ? zzB2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB3 = zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_et");
        if (zzB3 == null || !zzB3.zzw() || zzB3.zzd() <= 0) {
            return true;
        }
        long zzd = zzB3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB4 = zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_et");
        if (zzB4 != null && zzB4.zzd() > 0) {
            zzd += zzB4.zzd();
        }
        zzal(this.zzi);
        zzli.zzz(zzfsVar2, "_et", Long.valueOf(zzd));
        zzal(this.zzi);
        zzli.zzz(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkt zzal(zzkt zzktVar) {
        if (zzktVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzktVar.zzY()) {
            return zzktVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzktVar.getClass())));
    }

    public static zzlg zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzlg.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzlg((zzlh) Preconditions.checkNotNull(new zzlh(context)), null);
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    static /* bridge */ /* synthetic */ void zzy(zzlg zzlgVar, zzlh zzlhVar) {
        zzlgVar.zzaB().zzg();
        zzlgVar.zzm = new zzfm(zzlgVar);
        zzam zzamVar = new zzam(zzlgVar);
        zzamVar.zzX();
        zzlgVar.zze = zzamVar;
        zzlgVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzlgVar.zzc));
        zzka zzkaVar = new zzka(zzlgVar);
        zzkaVar.zzX();
        zzlgVar.zzk = zzkaVar;
        zzaa zzaaVar = new zzaa(zzlgVar);
        zzaaVar.zzX();
        zzlgVar.zzh = zzaaVar;
        zzio zzioVar = new zzio(zzlgVar);
        zzioVar.zzX();
        zzlgVar.zzj = zzioVar;
        zzkr zzkrVar = new zzkr(zzlgVar);
        zzkrVar.zzX();
        zzlgVar.zzg = zzkrVar;
        zzlgVar.zzf = new zzfc(zzlgVar);
        if (zzlgVar.zzr != zzlgVar.zzs) {
            zzlgVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlgVar.zzr), Integer.valueOf(zzlgVar.zzs));
        }
        zzlgVar.zzo = true;
    }

    @VisibleForTesting
    @WorkerThread
    final void zzA() {
        zzaB().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaB().zzg();
            int i8 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaA().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i8 = allocate.getInt();
                    } else if (read != -1) {
                        zzaA().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e8) {
                    zzaA().zzd().zzb("Failed to read from channel", e8);
                }
            }
            int zzi = this.zzn.zzh().zzi();
            zzaB().zzg();
            if (i8 > zzi) {
                zzaA().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i8), Integer.valueOf(zzi));
                return;
            }
            if (i8 < zzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaB().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaA().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzi);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaA().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaA().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i8), Integer.valueOf(zzi));
                        return;
                    } catch (IOException e9) {
                        zzaA().zzd().zzb("Failed to write to channel", e9);
                    }
                }
                zzaA().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i8), Integer.valueOf(zzi));
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
        zzfv zzfvVar = this.zzc;
        zzal(zzfvVar);
        Set zzk = zzfvVar.zzk(str);
        if (zzk != null) {
            zzgcVar.zzi(zzk);
        }
        zzfv zzfvVar2 = this.zzc;
        zzal(zzfvVar2);
        if (zzfvVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfv zzfvVar3 = this.zzc;
        zzal(zzfvVar3);
        if (zzfvVar3.zzy(str)) {
            if (zzg().zzs(str, zzeh.zzar)) {
                String zzas = zzgcVar.zzas();
                if (!TextUtils.isEmpty(zzas) && (indexOf = zzas.indexOf(".")) != -1) {
                    zzgcVar.zzY(zzas.substring(0, indexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfv zzfvVar4 = this.zzc;
        zzal(zzfvVar4);
        if (zzfvVar4.zzz(str) && (zza = zzli.zza(zzgcVar, FileDownloadModel.ID)) != -1) {
            zzgcVar.zzB(zza);
        }
        zzfv zzfvVar5 = this.zzc;
        zzal(zzfvVar5);
        if (zzfvVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfv zzfvVar6 = this.zzc;
        zzal(zzfvVar6);
        if (zzfvVar6.zzu(str)) {
            zzgcVar.zzn();
            zzlf zzlfVar = (zzlf) this.zzC.get(str);
            if (zzlfVar == null || zzlfVar.zzb + zzg().zzi(str, zzeh.zzT) < zzax().elapsedRealtime()) {
                zzlfVar = new zzlf(this);
                this.zzC.put(str, zzlfVar);
            }
            zzgcVar.zzR(zzlfVar.zza);
        }
        zzfv zzfvVar7 = this.zzc;
        zzal(zzfvVar7);
        if (zzfvVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    @WorkerThread
    final void zzD(zzh zzhVar) {
        zzaB().zzg();
        if (TextUtils.isEmpty(zzhVar.zzz()) && TextUtils.isEmpty(zzhVar.zzs())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzu()), 204, null, null, null);
            return;
        }
        zzkv zzkvVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String zzz = zzhVar.zzz();
        if (TextUtils.isEmpty(zzz)) {
            zzz = zzhVar.zzs();
        }
        ArrayMap arrayMap = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) zzeh.zze.zza(null)).encodedAuthority((String) zzeh.zzf.zza(null)).path("config/app/".concat(String.valueOf(zzz))).appendQueryParameter("platform", HttpConstants.OS_TYPE_VALUE);
        zzkvVar.zzt.zzf().zzh();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(77000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzu());
            URL url = new URL(uri);
            zzaA().zzj().zzb("Fetching remote configuration", str);
            zzfv zzfvVar = this.zzc;
            zzal(zzfvVar);
            com.google.android.gms.internal.measurement.zzff zze = zzfvVar.zze(str);
            zzfv zzfvVar2 = this.zzc;
            zzal(zzfvVar2);
            String zzh = zzfvVar2.zzh(str);
            if (zze != null) {
                if (!TextUtils.isEmpty(zzh)) {
                    arrayMap = new ArrayMap();
                    arrayMap.put("If-Modified-Since", zzh);
                }
                zzfv zzfvVar3 = this.zzc;
                zzal(zzfvVar3);
                String zzf = zzfvVar3.zzf(str);
                if (!TextUtils.isEmpty(zzf)) {
                    if (arrayMap == null) {
                        arrayMap = new ArrayMap();
                    }
                    arrayMap.put("If-None-Match", zzf);
                }
            }
            this.zzt = true;
            zzfa zzfaVar = this.zzd;
            zzal(zzfaVar);
            zzky zzkyVar = new zzky(this);
            zzfaVar.zzg();
            zzfaVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkyVar);
            zzfaVar.zzt.zzaB().zzo(new zzez(zzfaVar, str, url, null, arrayMap, zzkyVar));
        } catch (MalformedURLException unused) {
            zzaA().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeu.zzn(zzhVar.zzu()), uri);
        }
    }

    @WorkerThread
    final void zzE(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> zzt;
        List<zzac> zzt2;
        List<zzac> zzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaB().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j8 = zzawVar.zzd;
        zzev zzb2 = zzev.zzb(zzawVar);
        zzaB().zzg();
        zziq zziqVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zziqVar = this.zzD;
        }
        zzlo.zzK(zziqVar, zzb2.zzd, false);
        zzaw zza = zzb2.zza();
        zzal(this.zzi);
        if (zzli.zzA(zza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzawVar2 = zza;
            } else if (!list.contains(zza.zza)) {
                zzaA().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zza.zza, zza.zzc);
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
                if (j8 < 0) {
                    zzamVar2.zzt.zzaA().zzk().zzc("Invalid time querying timed out conditional properties", zzeu.zzn(str2), Long.valueOf(j8));
                    zzt = Collections.emptyList();
                } else {
                    zzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j8)});
                }
                for (zzac zzacVar : zzt) {
                    if (zzacVar != null) {
                        zzaA().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar3 = zzacVar.zzg;
                        if (zzawVar3 != null) {
                            zzY(new zzaw(zzawVar3, j8), zzqVar);
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
                if (j8 < 0) {
                    zzamVar4.zzt.zzaA().zzk().zzc("Invalid time querying expired conditional properties", zzeu.zzn(str2), Long.valueOf(j8));
                    zzt2 = Collections.emptyList();
                } else {
                    zzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j8)});
                }
                ArrayList arrayList = new ArrayList(zzt2.size());
                for (zzac zzacVar2 : zzt2) {
                    if (zzacVar2 != null) {
                        zzaA().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
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
                    zzY(new zzaw((zzaw) it.next(), j8), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                String str3 = zzawVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j8 < 0) {
                    zzamVar7.zzt.zzaA().zzk().zzd("Invalid time querying triggered conditional properties", zzeu.zzn(str2), zzamVar7.zzt.zzj().zzd(str3), Long.valueOf(j8));
                    zzt3 = Collections.emptyList();
                } else {
                    zzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j8)});
                }
                ArrayList arrayList2 = new ArrayList(zzt3.size());
                for (zzac zzacVar3 : zzt3) {
                    if (zzacVar3 != null) {
                        zzlj zzljVar = zzacVar3.zzc;
                        zzll zzllVar = new zzll((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzljVar.zzb, j8, Preconditions.checkNotNull(zzljVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        if (zzamVar8.zzL(zzllVar)) {
                            zzaA().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                        } else {
                            zzaA().zzd().zzd("Too many active user properties, ignoring", zzeu.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                        }
                        zzaw zzawVar5 = zzacVar3.zzi;
                        if (zzawVar5 != null) {
                            arrayList2.add(zzawVar5);
                        }
                        zzacVar3.zzc = new zzlj(zzllVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzawVar2, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzaw((zzaw) it2.next(), j8), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            } catch (Throwable th) {
                zzam zzamVar12 = this.zze;
                zzal(zzamVar12);
                zzamVar12.zzx();
                throw th;
            }
        }
    }

    @WorkerThread
    final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzx())) {
            zzaA().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzad = zzad(zzj);
        if (zzad == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzaA().zzk().zzb("Could not find package. appId", zzeu.zzn(str));
            }
        } else if (!zzad.booleanValue()) {
            zzaA().zzd().zzb("App version does not match; dropping event. appId", zzeu.zzn(str));
            return;
        }
        String zzz = zzj.zzz();
        String zzx = zzj.zzx();
        long zzb2 = zzj.zzb();
        String zzw = zzj.zzw();
        long zzm = zzj.zzm();
        long zzj2 = zzj.zzj();
        boolean zzal = zzj.zzal();
        String zzy = zzj.zzy();
        zzj.zza();
        zzG(zzawVar, new zzq(str, zzz, zzx, zzb2, zzw, zzm, zzj2, (String) null, zzal, false, zzy, 0L, 0L, 0, zzj.zzak(), false, zzj.zzs(), zzj.zzr(), zzj.zzk(), zzj.zzD(), (String) null, zzh(str).zzh(), "", (String) null, zzj.zzan(), zzj.zzq()));
    }

    @WorkerThread
    final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzev zzb2 = zzev.zzb(zzawVar);
        zzlo zzv = zzv();
        Bundle bundle = zzb2.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzN(zzb2, zzg().zzd(zzqVar.zza));
        zzaw zza = zzb2.zza();
        if ("_cmp".equals(zza.zza) && "referrer API v2".equals(zza.zzb.zzg("_cis"))) {
            String zzg = zza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg)) {
                zzW(new zzlj("_lgclid", zza.zzd, zzg, TtmlNode.TEXT_EMPHASIS_AUTO), zzqVar);
            }
        }
        zzE(zza, zzqVar);
    }

    final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x0169, B:24:0x006c, B:28:0x00be, B:29:0x00af, B:32:0x00c6, B:34:0x00d2, B:36:0x00d8, B:38:0x00e2, B:40:0x00ee, B:42:0x00f4, B:46:0x0101, B:47:0x011d, B:49:0x0132, B:50:0x0151, B:52:0x015c, B:54:0x0162, B:55:0x0166, B:56:0x0140, B:57:0x010a, B:59:0x0115), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x0169, B:24:0x006c, B:28:0x00be, B:29:0x00af, B:32:0x00c6, B:34:0x00d2, B:36:0x00d8, B:38:0x00e2, B:40:0x00ee, B:42:0x00f4, B:46:0x0101, B:47:0x011d, B:49:0x0132, B:50:0x0151, B:52:0x015c, B:54:0x0162, B:55:0x0166, B:56:0x0140, B:57:0x010a, B:59:0x0115), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x0169, B:24:0x006c, B:28:0x00be, B:29:0x00af, B:32:0x00c6, B:34:0x00d2, B:36:0x00d8, B:38:0x00e2, B:40:0x00ee, B:42:0x00f4, B:46:0x0101, B:47:0x011d, B:49:0x0132, B:50:0x0151, B:52:0x015c, B:54:0x0162, B:55:0x0166, B:56:0x0140, B:57:0x010a, B:59:0x0115), top: B:4:0x0030, outer: #1 }] */
    @VisibleForTesting
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzI(String str, int i8, Throwable th, byte[] bArr, Map map) {
        boolean z7;
        zzfa zzfaVar;
        zzaB().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzt = false;
                zzae();
                throw th2;
            }
        }
        zzes zzj = zzaA().zzj();
        Integer valueOf = Integer.valueOf(bArr.length);
        zzj.zzb("onConfigFetched. Response size", valueOf);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzh zzj2 = zzamVar2.zzj(str);
            if (i8 != 200 && i8 != 204) {
                if (i8 == 304) {
                    i8 = 304;
                }
                z7 = false;
                if (zzj2 == null) {
                    zzaA().zzk().zzb("App does not exist in onConfigFetched. appId", zzeu.zzn(str));
                } else {
                    if (!z7 && i8 != 404) {
                        zzj2.zzV(zzax().currentTimeMillis());
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zzD(zzj2);
                        zzaA().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i8), th);
                        zzfv zzfvVar = this.zzc;
                        zzal(zzfvVar);
                        zzfvVar.zzl(str);
                        this.zzk.zzd.zzb(zzax().currentTimeMillis());
                        if (i8 == 503 || i8 == 429) {
                            this.zzk.zzb.zzb(zzax().currentTimeMillis());
                        }
                        zzag();
                    }
                    List list = map != null ? (List) map.get("Last-Modified") : null;
                    String str2 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                    List list2 = map != null ? (List) map.get("ETag") : null;
                    String str3 = (list2 == null || list2.isEmpty()) ? null : (String) list2.get(0);
                    if (i8 != 404 && i8 != 304) {
                        zzfv zzfvVar2 = this.zzc;
                        zzal(zzfvVar2);
                        zzfvVar2.zzt(str, bArr, str2, str3);
                        zzj2.zzM(zzax().currentTimeMillis());
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzD(zzj2);
                        if (i8 != 404) {
                            zzaA().zzl().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzaA().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i8), valueOf);
                        }
                        zzfaVar = this.zzd;
                        zzal(zzfaVar);
                        if (zzfaVar.zza() || !zzai()) {
                            zzag();
                        } else {
                            zzX();
                        }
                    }
                    zzfv zzfvVar3 = this.zzc;
                    zzal(zzfvVar3);
                    if (zzfvVar3.zze(str) == null) {
                        zzfv zzfvVar4 = this.zzc;
                        zzal(zzfvVar4);
                        zzfvVar4.zzt(str, null, null, null);
                    }
                    zzj2.zzM(zzax().currentTimeMillis());
                    zzam zzamVar42 = this.zze;
                    zzal(zzamVar42);
                    zzamVar42.zzD(zzj2);
                    if (i8 != 404) {
                    }
                    zzfaVar = this.zzd;
                    zzal(zzfaVar);
                    if (zzfaVar.zza()) {
                    }
                    zzag();
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
                this.zzt = false;
                zzae();
            }
            if (th == null) {
                z7 = true;
                if (zzj2 == null) {
                }
                zzam zzamVar52 = this.zze;
                zzal(zzamVar52);
                zzamVar52.zzC();
                zzam zzamVar62 = this.zze;
                zzal(zzamVar62);
                zzamVar62.zzx();
                this.zzt = false;
                zzae();
            }
            z7 = false;
            if (zzj2 == null) {
            }
            zzam zzamVar522 = this.zze;
            zzal(zzamVar522);
            zzamVar522.zzC();
            zzam zzamVar622 = this.zze;
            zzal(zzamVar622);
            zzamVar622.zzx();
            this.zzt = false;
            zzae();
        } catch (Throwable th3) {
            zzam zzamVar7 = this.zze;
            zzal(zzamVar7);
            zzamVar7.zzx();
            throw th3;
        }
    }

    final void zzJ(boolean z7) {
        zzag();
    }

    @VisibleForTesting
    @WorkerThread
    final void zzK(int i8, Throwable th, byte[] bArr, String str) {
        zzam zzamVar;
        long longValue;
        zzaB().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzae();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i8 != 200) {
            if (i8 == 204) {
                i8 = 204;
            }
            zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i8), th);
            this.zzk.zzd.zzb(zzax().currentTimeMillis());
            if (i8 != 503 || i8 == 429) {
                this.zzk.zzb.zzb(zzax().currentTimeMillis());
            }
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzy(list);
            zzag();
            this.zzu = false;
            zzae();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzax().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i8), Integer.valueOf(bArr.length));
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzw();
                try {
                    for (Long l8 : list) {
                        try {
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            longValue = l8.longValue();
                            zzamVar.zzg();
                            zzamVar.zzW();
                            try {
                            } catch (SQLiteException e8) {
                                zzamVar.zzt.zzaA().zzd().zzb("Failed to delete a bundle in a queue table", e8);
                                throw e8;
                            }
                        } catch (SQLiteException e9) {
                            List list2 = this.zzz;
                            if (list2 == null || !list2.contains(l8)) {
                                throw e9;
                            }
                        }
                        if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    }
                    zzam zzamVar4 = this.zze;
                    zzal(zzamVar4);
                    zzamVar4.zzC();
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzamVar5.zzx();
                    this.zzz = null;
                    zzfa zzfaVar = this.zzd;
                    zzal(zzfaVar);
                    if (zzfaVar.zza() && zzai()) {
                        zzX();
                    } else {
                        this.zzA = -1L;
                        zzag();
                    }
                    this.zza = 0L;
                } catch (Throwable th3) {
                    zzam zzamVar6 = this.zze;
                    zzal(zzamVar6);
                    zzamVar6.zzx();
                    throw th3;
                }
            } catch (SQLiteException e10) {
                zzaA().zzd().zzb("Database error while trying to delete uploaded bundles", e10);
                this.zza = zzax().elapsedRealtime();
                zzaA().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            this.zzu = false;
            zzae();
        }
        zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i8), th);
        this.zzk.zzd.zzb(zzax().currentTimeMillis());
        if (i8 != 503) {
        }
        this.zzk.zzb.zzb(zzax().currentTimeMillis());
        zzam zzamVar22 = this.zze;
        zzal(zzamVar22);
        zzamVar22.zzy(list);
        zzag();
        this.zzu = false;
        zzae();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:96|97)|(2:99|(8:101|(3:103|(2:105|(1:107))(1:127)|108)(1:128)|109|(1:111)(1:126)|112|113|114|(4:116|(1:118)(1:122)|119|(1:121))))|129|113|114|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04b2, code lost:
    
        zzaA().zzd().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r3), r0);
        r3 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04c6 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0548 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025e A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024f A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026e A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03dd A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0409 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04e3 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:125:0x04b2, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x041e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzL(zzq zzqVar) {
        zzh zzj;
        String str;
        String str2;
        zzas zzn;
        boolean z7;
        long zzc;
        PackageInfo packageInfo;
        String str3;
        String str4;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j8;
        boolean z8;
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzh zzj2 = zzamVar.zzj(zzqVar.zza);
            if (zzj2 != null && TextUtils.isEmpty(zzj2.zzz()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzj2.zzM(0L);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzD(zzj2);
                zzfv zzfvVar = this.zzc;
                zzal(zzfvVar);
                zzfvVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long j9 = zzqVar.zzm;
            if (j9 == 0) {
                j9 = zzax().currentTimeMillis();
            }
            this.zzn.zzg().zzd();
            int i8 = zzqVar.zzn;
            if (i8 != 0 && i8 != 1) {
                zzaA().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeu.zzn(zzqVar.zza), Integer.valueOf(i8));
                i8 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzll zzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzp != null && !TtmlNode.TEXT_EMPHASIS_AUTO.equals(zzp.zzb)) {
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzj = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                    if (zzj == null && zzv().zzao(zzqVar.zzb, zzj.zzz(), zzqVar.zzq, zzj.zzs())) {
                        zzaA().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeu.zzn(zzj.zzu()));
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        String zzu = zzj.zzu();
                        zzamVar6.zzW();
                        zzamVar6.zzg();
                        Preconditions.checkNotEmpty(zzu);
                        try {
                            SQLiteDatabase zzh = zzamVar6.zzh();
                            String[] strArr = {zzu};
                            int delete = zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("apps", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("event_filters", "app_id=?", strArr) + zzh.delete("property_filters", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("consent_settings", "app_id=?", strArr);
                            zzph.zzc();
                            str2 = "_sysu";
                            try {
                                str = "_pfo";
                                try {
                                    if (zzamVar6.zzt.zzf().zzs(null, zzeh.zzat)) {
                                        delete += zzh.delete("default_event_params", "app_id=?", strArr);
                                    }
                                    if (delete > 0) {
                                        zzamVar6.zzt.zzaA().zzj().zzc("Deleted application data. app, records", zzu, Integer.valueOf(delete));
                                    }
                                } catch (SQLiteException e8) {
                                    e = e8;
                                    zzamVar6.zzt.zzaA().zzd().zzc("Error deleting application data. appId, error", zzeu.zzn(zzu), e);
                                    zzj = null;
                                    if (zzj != null) {
                                    }
                                    zzd(zzqVar);
                                    if (i8 == 0) {
                                    }
                                    if (zzn == null) {
                                    }
                                    zzam zzamVar7 = this.zze;
                                    zzal(zzamVar7);
                                    zzamVar7.zzC();
                                    zzam zzamVar8 = this.zze;
                                    zzal(zzamVar8);
                                    zzamVar8.zzx();
                                }
                            } catch (SQLiteException e9) {
                                e = e9;
                                str = "_pfo";
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            str = "_pfo";
                            str2 = "_sysu";
                        }
                        zzj = null;
                    } else {
                        str = "_pfo";
                        str2 = "_sysu";
                    }
                    if (zzj != null) {
                        boolean z9 = (zzj.zzb() == -2147483648L || zzj.zzb() == zzqVar.zzj) ? false : true;
                        String zzx = zzj.zzx();
                        if (((zzj.zzb() != -2147483648L || zzx == null || zzx.equals(zzqVar.zzc)) ? false : true) | z9) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_pv", zzx);
                            zzE(new zzaw("_au", new zzau(bundle), TtmlNode.TEXT_EMPHASIS_AUTO, j9), zzqVar);
                        }
                    }
                    zzd(zzqVar);
                    if (i8 == 0) {
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzn = zzamVar9.zzn(zzqVar.zza, "_f");
                        z7 = false;
                    } else {
                        zzam zzamVar10 = this.zze;
                        zzal(zzamVar10);
                        zzn = zzamVar10.zzn(zzqVar.zza, "_v");
                        z7 = true;
                    }
                    if (zzn == null) {
                        long j10 = ((j9 / 3600000) + 1) * 3600000;
                        if (z7) {
                            zzW(new zzlj("_fvt", j9, Long.valueOf(j10), TtmlNode.TEXT_EMPHASIS_AUTO), zzqVar);
                            zzaB().zzg();
                            zzB();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                                bundle2.putLong("_dac", 1L);
                            }
                            zzG(new zzaw("_v", new zzau(bundle2), TtmlNode.TEXT_EMPHASIS_AUTO, j9), zzqVar);
                        } else {
                            zzW(new zzlj("_fot", j9, Long.valueOf(j10), TtmlNode.TEXT_EMPHASIS_AUTO), zzqVar);
                            zzaB().zzg();
                            zzfm zzfmVar = (zzfm) Preconditions.checkNotNull(this.zzm);
                            String str5 = zzqVar.zza;
                            if (str5 == null || str5.isEmpty()) {
                                zzfmVar.zza.zzaA().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                zzfmVar.zza.zzaB().zzg();
                                if (zzfmVar.zza()) {
                                    zzfl zzflVar = new zzfl(zzfmVar, str5);
                                    zzfmVar.zza.zzaB().zzg();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzfmVar.zza.zzaw().getPackageManager();
                                    if (packageManager == null) {
                                        zzfmVar.zza.zzaA().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzfmVar.zza.zzaA().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str6 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str6) && zzfmVar.zza()) {
                                                    try {
                                                    } catch (RuntimeException e11) {
                                                        e = e11;
                                                    }
                                                    try {
                                                        zzfmVar.zza.zzaA().zzj().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzfmVar.zza.zzaw(), new Intent(intent), zzflVar, 1) ? "available" : "not available");
                                                    } catch (RuntimeException e12) {
                                                        e = e12;
                                                        zzfmVar.zza.zzaA().zzd().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                        zzaB().zzg();
                                                        zzB();
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("_c", 1L);
                                                        bundle3.putLong("_r", 1L);
                                                        bundle3.putLong("_uwa", 0L);
                                                        String str7 = str;
                                                        bundle3.putLong(str7, 0L);
                                                        bundle3.putLong("_sys", 0L);
                                                        String str8 = str2;
                                                        bundle3.putLong(str8, 0L);
                                                        bundle3.putLong("_et", 1L);
                                                        if (zzqVar.zzp) {
                                                        }
                                                        String str9 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                                        zzam zzamVar11 = this.zze;
                                                        zzal(zzamVar11);
                                                        Preconditions.checkNotEmpty(str9);
                                                        zzamVar11.zzg();
                                                        zzamVar11.zzW();
                                                        zzc = zzamVar11.zzc(str9, "first_open_count");
                                                        if (this.zzn.zzaw().getPackageManager() != null) {
                                                        }
                                                        if (zzc >= 0) {
                                                        }
                                                        zzG(new zzaw("_f", new zzau(bundle3), TtmlNode.TEXT_EMPHASIS_AUTO, j9), zzqVar);
                                                        zzam zzamVar72 = this.zze;
                                                        zzal(zzamVar72);
                                                        zzamVar72.zzC();
                                                        zzam zzamVar82 = this.zze;
                                                        zzal(zzamVar82);
                                                        zzamVar82.zzx();
                                                    }
                                                } else {
                                                    zzfmVar.zza.zzaA().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzfmVar.zza.zzaA().zzi().zza("Install Referrer Reporter is not available");
                                }
                            }
                            zzaB().zzg();
                            zzB();
                            Bundle bundle32 = new Bundle();
                            bundle32.putLong("_c", 1L);
                            bundle32.putLong("_r", 1L);
                            bundle32.putLong("_uwa", 0L);
                            String str72 = str;
                            bundle32.putLong(str72, 0L);
                            bundle32.putLong("_sys", 0L);
                            String str82 = str2;
                            bundle32.putLong(str82, 0L);
                            bundle32.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                                bundle32.putLong("_dac", 1L);
                            }
                            String str92 = (String) Preconditions.checkNotNull(zzqVar.zza);
                            zzam zzamVar112 = this.zze;
                            zzal(zzamVar112);
                            Preconditions.checkNotEmpty(str92);
                            zzamVar112.zzg();
                            zzamVar112.zzW();
                            zzc = zzamVar112.zzc(str92, "first_open_count");
                            if (this.zzn.zzaw().getPackageManager() != null) {
                                zzaA().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeu.zzn(str92));
                            } else {
                                try {
                                    packageInfo = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(str92, 0);
                                } catch (PackageManager.NameNotFoundException e13) {
                                    zzaA().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeu.zzn(str92), e13);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    long j11 = packageInfo.firstInstallTime;
                                    if (j11 != 0) {
                                        if (j11 != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzg().zzs(null, zzeh.zzad)) {
                                                bundle32.putLong("_uwa", 1L);
                                            } else if (zzc == 0) {
                                                bundle32.putLong("_uwa", 1L);
                                                zzc = 0;
                                            }
                                            z8 = false;
                                        } else {
                                            applicationInfo = null;
                                            z8 = true;
                                        }
                                        str3 = "_sys";
                                        str4 = str82;
                                        zzW(new zzlj("_fi", j9, Long.valueOf(true != z8 ? 0L : 1L), TtmlNode.TEXT_EMPHASIS_AUTO), zzqVar);
                                        applicationInfo2 = Wrappers.packageManager(this.zzn.zzaw()).getApplicationInfo(str92, 0);
                                        if (applicationInfo2 != null) {
                                            if ((applicationInfo2.flags & 1) != 0) {
                                                j8 = 1;
                                                bundle32.putLong(str3, 1L);
                                            } else {
                                                j8 = 1;
                                            }
                                            if ((applicationInfo2.flags & 128) != 0) {
                                                bundle32.putLong(str4, j8);
                                            }
                                        }
                                    }
                                }
                                str3 = "_sys";
                                str4 = str82;
                                applicationInfo = null;
                                applicationInfo2 = Wrappers.packageManager(this.zzn.zzaw()).getApplicationInfo(str92, 0);
                                if (applicationInfo2 != null) {
                                }
                            }
                            if (zzc >= 0) {
                                bundle32.putLong(str72, zzc);
                            }
                            zzG(new zzaw("_f", new zzau(bundle32), TtmlNode.TEXT_EMPHASIS_AUTO, j9), zzqVar);
                        }
                    } else if (zzqVar.zzi) {
                        zzG(new zzaw("_cd", new zzau(new Bundle()), TtmlNode.TEXT_EMPHASIS_AUTO, j9), zzqVar);
                    }
                    zzam zzamVar722 = this.zze;
                    zzal(zzamVar722);
                    zzamVar722.zzC();
                    zzam zzamVar822 = this.zze;
                    zzal(zzamVar822);
                    zzamVar822.zzx();
                }
                if (zzqVar.zzr != null) {
                    zzlj zzljVar = new zzlj("_npa", j9, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), TtmlNode.TEXT_EMPHASIS_AUTO);
                    if (zzp == null || !zzp.zze.equals(zzljVar.zzd)) {
                        zzW(zzljVar, zzqVar);
                    }
                } else if (zzp != null) {
                    zzP("_npa", zzqVar);
                }
                zzam zzamVar52 = this.zze;
                zzal(zzamVar52);
                zzj = zzamVar52.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzj == null) {
                }
                str = "_pfo";
                str2 = "_sysu";
                if (zzj != null) {
                }
                zzd(zzqVar);
                if (i8 == 0) {
                }
                if (zzn == null) {
                }
                zzam zzamVar7222 = this.zze;
                zzal(zzamVar7222);
                zzamVar7222.zzC();
                zzam zzamVar8222 = this.zze;
                zzal(zzamVar8222);
                zzamVar8222.zzx();
            } catch (Throwable th) {
                zzam zzamVar12 = this.zze;
                zzal(zzamVar12);
                zzamVar12.zzx();
                throw th;
            }
        }
    }

    final void zzM() {
        this.zzr++;
    }

    @WorkerThread
    final void zzN(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzO(zzacVar, zzac);
        }
    }

    @WorkerThread
    final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
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
                    zzaA().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
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
                    zzaA().zzk().zzc("Conditional user property doesn't exist", zzeu.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            } catch (Throwable th) {
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzx();
                throw th;
            }
        }
    }

    @WorkerThread
    final void zzP(String str, zzq zzqVar) {
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(str) && zzqVar.zzr != null) {
                zzaA().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzlj("_npa", zzax().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), TtmlNode.TEXT_EMPHASIS_AUTO), zzqVar);
                return;
            }
            zzaA().zzc().zzb("Removing user property", this.zzn.zzj().zzf(str));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if (FileDownloadModel.ID.equals(str)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), str);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzaA().zzc().zzb("User property removed", this.zzn.zzj().zzf(str));
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            } catch (Throwable th) {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
                throw th;
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
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
                zzamVar.zzt.zzaA().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e8) {
            zzamVar.zzt.zzaA().zzd().zzc("Error resetting analytics data. appId, error", zzeu.zzn(str), e8);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    @WorkerThread
    public final void zzR(String str, zziq zziqVar) {
        zzaB().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zziqVar != null) {
            this.zzE = str;
            this.zzD = zziqVar;
        }
    }

    @WorkerThread
    protected final void zzS() {
        zzaB().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzax().currentTimeMillis());
        }
        zzag();
    }

    @WorkerThread
    final void zzT(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzU(zzacVar, zzac);
        }
    }

    @WorkerThread
    final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z7 = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzk != null && !zzk.zzb.equals(zzacVar2.zzb)) {
                    zzaA().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzk.zzb);
                }
                if (zzk != null && zzk.zze) {
                    zzacVar2.zzb = zzk.zzb;
                    zzacVar2.zzd = zzk.zzd;
                    zzacVar2.zzh = zzk.zzh;
                    zzacVar2.zzf = zzk.zzf;
                    zzacVar2.zzi = zzk.zzi;
                    zzacVar2.zze = true;
                    zzlj zzljVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlj(zzljVar.zzb, zzk.zzc.zzc, zzljVar.zza(), zzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzlj zzljVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlj(zzljVar2.zzb, zzacVar2.zzd, zzljVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z7 = true;
                }
                if (zzacVar2.zze) {
                    zzlj zzljVar3 = zzacVar2.zzc;
                    zzll zzllVar = new zzll((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzljVar3.zzb, zzljVar3.zzc, Preconditions.checkNotNull(zzljVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzL(zzllVar)) {
                        zzaA().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                    } else {
                        zzaA().zzd().zzd("(2)Too many active user properties, ignoring", zzeu.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                    }
                    if (z7 && zzacVar2.zzi != null) {
                        zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzaA().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzaA().zzd().zzd("Too many conditional properties, ignoring", zzeu.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            } catch (Throwable th) {
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzx();
                throw th;
            }
        }
    }

    @WorkerThread
    final void zzV(String str, zzai zzaiVar) {
        zzaB().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HttpConstants.HTTP_APP_ID, str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzt.zzaA().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeu.zzn(str));
            }
        } catch (SQLiteException e8) {
            zzamVar.zzt.zzaA().zzd().zzc("Error storing consent setting. appId, error", zzeu.zzn(str), e8);
        }
    }

    @WorkerThread
    final void zzW(zzlj zzljVar, zzq zzqVar) {
        long j8;
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int zzl = zzv().zzl(zzljVar.zzb);
            if (zzl != 0) {
                zzlo zzv = zzv();
                String str = zzljVar.zzb;
                zzg();
                String zzD = zzv.zzD(str, 24, true);
                String str2 = zzljVar.zzb;
                zzv().zzO(this.zzF, zzqVar.zza, zzl, "_ev", zzD, str2 != null ? str2.length() : 0);
                return;
            }
            int zzd = zzv().zzd(zzljVar.zzb, zzljVar.zza());
            if (zzd != 0) {
                zzlo zzv2 = zzv();
                String str3 = zzljVar.zzb;
                zzg();
                String zzD2 = zzv2.zzD(str3, 24, true);
                Object zza = zzljVar.zza();
                zzv().zzO(this.zzF, zzqVar.zza, zzd, "_ev", zzD2, (zza == null || !((zza instanceof String) || (zza instanceof CharSequence))) ? 0 : zza.toString().length());
                return;
            }
            Object zzB = zzv().zzB(zzljVar.zzb, zzljVar.zza());
            if (zzB == null) {
                return;
            }
            if ("_sid".equals(zzljVar.zzb)) {
                long j9 = zzljVar.zzc;
                String str4 = zzljVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzal(zzamVar);
                zzll zzp = zzamVar.zzp(str5, "_sno");
                if (zzp != null) {
                    Object obj = zzp.zze;
                    if (obj instanceof Long) {
                        j8 = ((Long) obj).longValue();
                        zzW(new zzlj("_sno", j9, Long.valueOf(j8 + 1), str4), zzqVar);
                    }
                }
                if (zzp != null) {
                    zzaA().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp.zze);
                }
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzas zzn = zzamVar2.zzn(str5, "_s");
                if (zzn != null) {
                    j8 = zzn.zzc;
                    zzaA().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j8));
                } else {
                    j8 = 0;
                }
                zzW(new zzlj("_sno", j9, Long.valueOf(j8 + 1), str4), zzqVar);
            }
            zzll zzllVar = new zzll((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzljVar.zzf), zzljVar.zzb, zzljVar.zzc, zzB);
            zzaA().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzllVar.zzc), zzB);
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                if (FileDownloadModel.ID.equals(zzllVar.zzc)) {
                    zzam zzamVar4 = this.zze;
                    zzal(zzamVar4);
                    zzll zzp2 = zzamVar4.zzp(zzqVar.zza, FileDownloadModel.ID);
                    if (zzp2 != null && !zzllVar.zze.equals(zzp2.zze)) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                boolean zzL = zzamVar6.zzL(zzllVar);
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzC();
                if (!zzL) {
                    zzaA().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                    zzv().zzO(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzx();
            } catch (Throwable th) {
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0522, code lost:
    
        if (r3 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
    
        if (r11 == null) goto L59;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x052b A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:10:0x0038, B:12:0x003e, B:14:0x004e, B:16:0x0056, B:18:0x005c, B:20:0x0067, B:22:0x0077, B:24:0x0082, B:26:0x0095, B:28:0x00b4, B:30:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:45:0x010c, B:46:0x0131, B:56:0x0136, B:57:0x0139, B:62:0x013a, B:65:0x0162, B:68:0x016a, B:76:0x01a4, B:78:0x02ae, B:80:0x02b4, B:82:0x02c0, B:83:0x02c4, B:85:0x02ca, B:88:0x02de, B:91:0x02e7, B:93:0x02ed, B:97:0x0312, B:98:0x0302, B:101:0x030c, B:107:0x0315, B:109:0x0330, B:112:0x033f, B:114:0x0363, B:116:0x039d, B:118:0x03a2, B:120:0x03aa, B:121:0x03ad, B:123:0x03b2, B:124:0x03b5, B:126:0x03c1, B:128:0x03d7, B:131:0x03df, B:133:0x03f0, B:134:0x0401, B:136:0x0416, B:138:0x0423, B:139:0x0438, B:141:0x0443, B:142:0x044c, B:144:0x0431, B:145:0x049c, B:171:0x0280, B:193:0x02ab, B:210:0x04b4, B:211:0x04b7, B:223:0x04b8, B:230:0x04f8, B:232:0x0525, B:234:0x052b, B:236:0x0536, B:239:0x0506, B:249:0x0541, B:250:0x0544), top: B:2:0x0010, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:10:0x0038, B:12:0x003e, B:14:0x004e, B:16:0x0056, B:18:0x005c, B:20:0x0067, B:22:0x0077, B:24:0x0082, B:26:0x0095, B:28:0x00b4, B:30:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:45:0x010c, B:46:0x0131, B:56:0x0136, B:57:0x0139, B:62:0x013a, B:65:0x0162, B:68:0x016a, B:76:0x01a4, B:78:0x02ae, B:80:0x02b4, B:82:0x02c0, B:83:0x02c4, B:85:0x02ca, B:88:0x02de, B:91:0x02e7, B:93:0x02ed, B:97:0x0312, B:98:0x0302, B:101:0x030c, B:107:0x0315, B:109:0x0330, B:112:0x033f, B:114:0x0363, B:116:0x039d, B:118:0x03a2, B:120:0x03aa, B:121:0x03ad, B:123:0x03b2, B:124:0x03b5, B:126:0x03c1, B:128:0x03d7, B:131:0x03df, B:133:0x03f0, B:134:0x0401, B:136:0x0416, B:138:0x0423, B:139:0x0438, B:141:0x0443, B:142:0x044c, B:144:0x0431, B:145:0x049c, B:171:0x0280, B:193:0x02ab, B:210:0x04b4, B:211:0x04b7, B:223:0x04b8, B:230:0x04f8, B:232:0x0525, B:234:0x052b, B:236:0x0536, B:239:0x0506, B:249:0x0541, B:250:0x0544), top: B:2:0x0010, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b4 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:10:0x0038, B:12:0x003e, B:14:0x004e, B:16:0x0056, B:18:0x005c, B:20:0x0067, B:22:0x0077, B:24:0x0082, B:26:0x0095, B:28:0x00b4, B:30:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:45:0x010c, B:46:0x0131, B:56:0x0136, B:57:0x0139, B:62:0x013a, B:65:0x0162, B:68:0x016a, B:76:0x01a4, B:78:0x02ae, B:80:0x02b4, B:82:0x02c0, B:83:0x02c4, B:85:0x02ca, B:88:0x02de, B:91:0x02e7, B:93:0x02ed, B:97:0x0312, B:98:0x0302, B:101:0x030c, B:107:0x0315, B:109:0x0330, B:112:0x033f, B:114:0x0363, B:116:0x039d, B:118:0x03a2, B:120:0x03aa, B:121:0x03ad, B:123:0x03b2, B:124:0x03b5, B:126:0x03c1, B:128:0x03d7, B:131:0x03df, B:133:0x03f0, B:134:0x0401, B:136:0x0416, B:138:0x0423, B:139:0x0438, B:141:0x0443, B:142:0x044c, B:144:0x0431, B:145:0x049c, B:171:0x0280, B:193:0x02ab, B:210:0x04b4, B:211:0x04b7, B:223:0x04b8, B:230:0x04f8, B:232:0x0525, B:234:0x052b, B:236:0x0536, B:239:0x0506, B:249:0x0541, B:250:0x0544), top: B:2:0x0010, inners: #8 }] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzX() {
        Cursor cursor;
        zzam zzamVar;
        long zzz;
        Cursor cursor2;
        String str;
        Cursor cursor3;
        long j8;
        Cursor cursor4;
        List emptyList;
        String str2;
        String str3;
        byte[] blob;
        zzli zzliVar;
        Cursor cursor5;
        zzaB().zzg();
        zzB();
        int i8 = 1;
        this.zzv = true;
        int i9 = 0;
        try {
            this.zzn.zzay();
            Boolean zzj = this.zzn.zzt().zzj();
            if (zzj == null) {
                zzaA().zzk().zza("Upload data called on the client side before use of service was decided");
                this.zzv = false;
            } else if (zzj.booleanValue()) {
                zzaA().zzd().zza("Upload called in the client side when service should be used");
                this.zzv = false;
            } else if (this.zza > 0) {
                zzag();
                this.zzv = false;
            } else {
                zzaB().zzg();
                if (this.zzy != null) {
                    zzaA().zzj().zza("Uploading requested multiple times");
                    this.zzv = false;
                } else {
                    zzfa zzfaVar = this.zzd;
                    zzal(zzfaVar);
                    if (zzfaVar.zza()) {
                        long currentTimeMillis = zzax().currentTimeMillis();
                        Cursor cursor6 = null;
                        int zze = zzg().zze(null, zzeh.zzR);
                        zzg();
                        long zzz2 = currentTimeMillis - zzag.zzz();
                        for (int i10 = 0; i10 < zze && zzah(null, zzz2); i10++) {
                        }
                        long zza = this.zzk.zzc.zza();
                        if (zza != 0) {
                            zzaA().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza)));
                        }
                        zzam zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        String zzr = zzamVar2.zzr();
                        long j9 = -1;
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
                                cursor = null;
                            }
                            try {
                                cursor2 = zzamVar.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzz)});
                                try {
                                } catch (SQLiteException e8) {
                                    e = e8;
                                    zzamVar.zzt.zzaA().zzd().zzb("Error selecting expired configs", e);
                                }
                            } catch (SQLiteException e9) {
                                e = e9;
                                cursor2 = null;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = null;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                            if (cursor2.moveToFirst()) {
                                str = cursor2.getString(0);
                                cursor2.close();
                                if (!TextUtils.isEmpty(str)) {
                                }
                            } else {
                                zzamVar.zzt.zzaA().zzj().zza("No expired configs for apps with pending events");
                                cursor2.close();
                                str = null;
                                if (!TextUtils.isEmpty(str)) {
                                    zzam zzamVar3 = this.zze;
                                    zzal(zzamVar3);
                                    zzh zzj2 = zzamVar3.zzj(str);
                                    if (zzj2 != null) {
                                        zzD(zzj2);
                                    }
                                }
                            }
                        } else {
                            if (this.zzA == -1) {
                                zzam zzamVar4 = this.zze;
                                zzal(zzamVar4);
                                try {
                                    cursor5 = zzamVar4.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    try {
                                        try {
                                            if (cursor5.moveToFirst()) {
                                                j9 = cursor5.getLong(0);
                                            }
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            zzamVar4.zzt.zzaA().zzd().zzb("Error querying raw events", e);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor6 = cursor5;
                                        if (cursor6 != null) {
                                            cursor6.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    cursor5 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (cursor6 != null) {
                                    }
                                    throw th;
                                }
                                cursor5.close();
                                this.zzA = j9;
                            }
                            int zze2 = zzg().zze(zzr, zzeh.zzg);
                            int max = Math.max(0, zzg().zze(zzr, zzeh.zzh));
                            zzam zzamVar5 = this.zze;
                            zzal(zzamVar5);
                            zzamVar5.zzg();
                            zzamVar5.zzW();
                            Preconditions.checkArgument(zze2 > 0);
                            Preconditions.checkArgument(max > 0);
                            Preconditions.checkNotEmpty(zzr);
                            try {
                                cursor4 = zzamVar5.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{zzr}, null, null, "rowid", String.valueOf(zze2));
                                try {
                                    try {
                                        if (cursor4.moveToFirst()) {
                                            ArrayList arrayList = new ArrayList();
                                            int i11 = 0;
                                            while (true) {
                                                long j10 = cursor4.getLong(i9);
                                                try {
                                                    blob = cursor4.getBlob(i8);
                                                    zzliVar = zzamVar5.zzf.zzi;
                                                    zzal(zzliVar);
                                                } catch (IOException e12) {
                                                    e = e12;
                                                    j8 = currentTimeMillis;
                                                }
                                                try {
                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                    byte[] bArr = new byte[1024];
                                                    j8 = currentTimeMillis;
                                                    while (true) {
                                                        try {
                                                            try {
                                                                int read = gZIPInputStream.read(bArr);
                                                                if (read <= 0) {
                                                                    break;
                                                                } else {
                                                                    byteArrayOutputStream.write(bArr, 0, read);
                                                                }
                                                            } catch (SQLiteException e13) {
                                                                e = e13;
                                                                zzamVar5.zzt.zzaA().zzd().zzc("Error querying bundles. appId", zzeu.zzn(zzr), e);
                                                                emptyList = Collections.emptyList();
                                                                if (cursor4 != null) {
                                                                    cursor4.close();
                                                                }
                                                                if (!emptyList.isEmpty()) {
                                                                }
                                                                this.zzv = false;
                                                                zzae();
                                                            }
                                                        } catch (IOException e14) {
                                                            e = e14;
                                                            try {
                                                                zzliVar.zzt.zzaA().zzd().zzb("Failed to ungzip content", e);
                                                                throw e;
                                                            } catch (IOException e15) {
                                                                e = e15;
                                                                zzamVar5.zzt.zzaA().zzd().zzc("Failed to unzip queued bundle. appId", zzeu.zzn(zzr), e);
                                                                if (cursor4.moveToNext()) {
                                                                    break;
                                                                }
                                                                currentTimeMillis = j8;
                                                                i8 = 1;
                                                                i9 = 0;
                                                                cursor4.close();
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
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    if (!arrayList.isEmpty() && byteArray.length + i11 > max) {
                                                        break;
                                                    }
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzli.zzl(com.google.android.gms.internal.measurement.zzgd.zzu(), byteArray);
                                                        if (!cursor4.isNull(2)) {
                                                            zzgcVar.zzaf(cursor4.getInt(2));
                                                        }
                                                        i11 += byteArray.length;
                                                        arrayList.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaD(), Long.valueOf(j10)));
                                                    } catch (IOException e16) {
                                                        zzamVar5.zzt.zzaA().zzd().zzc("Failed to merge queued bundle. appId", zzeu.zzn(zzr), e16);
                                                    }
                                                    if (cursor4.moveToNext() || i11 > max) {
                                                        break;
                                                        break;
                                                    } else {
                                                        currentTimeMillis = j8;
                                                        i8 = 1;
                                                        i9 = 0;
                                                    }
                                                } catch (IOException e17) {
                                                    e = e17;
                                                    j8 = currentTimeMillis;
                                                }
                                            }
                                            cursor4.close();
                                            emptyList = arrayList;
                                        } else {
                                            emptyList = Collections.emptyList();
                                            cursor4.close();
                                            j8 = currentTimeMillis;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        cursor3 = cursor4;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e18) {
                                    e = e18;
                                    j8 = currentTimeMillis;
                                }
                            } catch (SQLiteException e19) {
                                e = e19;
                                j8 = currentTimeMillis;
                                cursor4 = null;
                            } catch (Throwable th6) {
                                th = th6;
                                cursor3 = null;
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
                                        if (!zzgdVar.zzK().isEmpty()) {
                                            str3 = zzgdVar.zzK();
                                            break;
                                        }
                                    }
                                    if (str3 != null) {
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= emptyList.size()) {
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzgd zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) emptyList.get(i12)).first;
                                            if (!zzgdVar2.zzK().isEmpty() && !zzgdVar2.zzK().equals(str3)) {
                                                emptyList = emptyList.subList(0, i12);
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                }
                                com.google.android.gms.internal.measurement.zzga zza2 = com.google.android.gms.internal.measurement.zzgb.zza();
                                int size = emptyList.size();
                                ArrayList arrayList2 = new ArrayList(emptyList.size());
                                boolean z7 = zzg().zzt(zzr) && zzh(zzr).zzi(zzah.AD_STORAGE);
                                boolean zzi = zzh(zzr).zzi(zzah.AD_STORAGE);
                                boolean zzi2 = zzh(zzr).zzi(zzah.ANALYTICS_STORAGE);
                                zzqr.zzc();
                                boolean zzs = zzg().zzs(zzr, zzeh.zzao);
                                int i13 = 0;
                                while (i13 < size) {
                                    com.google.android.gms.internal.measurement.zzgc zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) emptyList.get(i13)).first).zzbB();
                                    arrayList2.add((Long) ((Pair) emptyList.get(i13)).second);
                                    zzg().zzh();
                                    zzgcVar2.zzam(77000L);
                                    long j11 = j8;
                                    zzgcVar2.zzal(j11);
                                    this.zzn.zzay();
                                    zzgcVar2.zzag(false);
                                    if (!z7) {
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
                                    if (!zzs) {
                                        zzgcVar2.zzy();
                                    }
                                    if (zzg().zzs(zzr, zzeh.zzV)) {
                                        byte[] zzbx = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaD()).zzbx();
                                        zzli zzliVar2 = this.zzi;
                                        zzal(zzliVar2);
                                        zzgcVar2.zzJ(zzliVar2.zzd(zzbx));
                                    }
                                    zza2.zza(zzgcVar2);
                                    i13++;
                                    j8 = j11;
                                }
                                long j12 = j8;
                                if (Log.isLoggable(zzaA().zzr(), 2)) {
                                    zzli zzliVar3 = this.zzi;
                                    zzal(zzliVar3);
                                    str2 = zzliVar3.zzm((com.google.android.gms.internal.measurement.zzgb) zza2.zzaD());
                                } else {
                                    str2 = null;
                                }
                                zzal(this.zzi);
                                byte[] zzbx2 = ((com.google.android.gms.internal.measurement.zzgb) zza2.zzaD()).zzbx();
                                zzku zza3 = this.zzl.zza(zzr);
                                try {
                                    Preconditions.checkArgument(!arrayList2.isEmpty());
                                    if (this.zzy != null) {
                                        zzaA().zzd().zza("Set uploading progress before finishing the previous upload");
                                    } else {
                                        this.zzy = new ArrayList(arrayList2);
                                    }
                                    this.zzk.zzd.zzb(j12);
                                    zzaA().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zza2.zzb(0).zzy() : "?", Integer.valueOf(zzbx2.length), str2);
                                    this.zzu = true;
                                    zzfa zzfaVar2 = this.zzd;
                                    zzal(zzfaVar2);
                                    URL url = new URL(zza3.zza());
                                    Map zzb2 = zza3.zzb();
                                    zzkx zzkxVar = new zzkx(this, zzr);
                                    zzfaVar2.zzg();
                                    zzfaVar2.zzW();
                                    Preconditions.checkNotNull(url);
                                    Preconditions.checkNotNull(zzbx2);
                                    Preconditions.checkNotNull(zzkxVar);
                                    zzfaVar2.zzt.zzaB().zzo(new zzez(zzfaVar2, zzr, url, zzbx2, zzb2, zzkxVar));
                                } catch (MalformedURLException unused) {
                                    zzaA().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeu.zzn(zzr), zza3.zza());
                                }
                            }
                        }
                        this.zzv = false;
                    } else {
                        zzaA().zzj().zza("Network not connected, ignoring upload request");
                        zzag();
                        this.zzv = false;
                    }
                }
            }
            zzae();
        } catch (Throwable th7) {
            this.zzv = false;
            zzae();
            throw th7;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:307|(2:309|(7:311|312|(1:314)|58|(0)(0)|61|(0)(0)))|315|316|317|318|319|320|321|322|323|324|325|326|327|312|(0)|58|(0)(0)|61|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(62:(2:70|(5:72|(1:74)|75|76|77))|78|(2:80|(5:82|(1:84)|85|86|87))|88|89|(1:91)|92|(2:94|(1:98))|99|(4:100|101|102|(6:103|104|105|106|107|108))|109|(1:111)|112|(2:114|(1:120)(3:117|118|119))(1:268)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:136)|137|(1:139)|140|(1:142)|143|(1:147)|148|(1:150)|151|(1:153)(1:267)|(33:157|(4:160|(3:162|163|(3:165|166|(3:168|169|171)(1:257))(1:259))(1:264)|258|158)|265|172|(1:174)|(1:176)|177|(2:181|(2:185|(1:187)))|188|(1:190)|191|(2:193|(1:195))|196|(3:198|(1:200)|201)|202|(1:206)|207|(1:209)|210|(3:213|214|211)|215|216|217|218|219|(2:220|(2:222|(1:225)(1:224))(3:241|242|(1:247)(1:246)))|227|228|229|(1:231)(2:236|237)|232|233|234)|266|(0)|177|(3:179|181|(3:183|185|(0)))|188|(0)|191|(0)|196|(0)|202|(2:204|206)|207|(0)|210|(1:211)|215|216|217|218|219|(3:220|(0)(0)|224)|227|228|229|(0)(0)|232|233|234) */
    /* JADX WARN: Can't wrap try/catch for region: R(65:(2:70|(5:72|(1:74)|75|76|77))|78|(2:80|(5:82|(1:84)|85|86|87))|88|89|(1:91)|92|(2:94|(1:98))|99|100|101|102|(6:103|104|105|106|107|108)|109|(1:111)|112|(2:114|(1:120)(3:117|118|119))(1:268)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:136)|137|(1:139)|140|(1:142)|143|(1:147)|148|(1:150)|151|(1:153)(1:267)|(33:157|(4:160|(3:162|163|(3:165|166|(3:168|169|171)(1:257))(1:259))(1:264)|258|158)|265|172|(1:174)|(1:176)|177|(2:181|(2:185|(1:187)))|188|(1:190)|191|(2:193|(1:195))|196|(3:198|(1:200)|201)|202|(1:206)|207|(1:209)|210|(3:213|214|211)|215|216|217|218|219|(2:220|(2:222|(1:225)(1:224))(3:241|242|(1:247)(1:246)))|227|228|229|(1:231)(2:236|237)|232|233|234)|266|(0)|177|(3:179|181|(3:183|185|(0)))|188|(0)|191|(0)|196|(0)|202|(2:204|206)|207|(0)|210|(1:211)|215|216|217|218|219|(3:220|(0)(0)|224)|227|228|229|(0)(0)|232|233|234) */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x09da, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0a95, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0a9d, code lost:
    
        r3.zzt.zzaA().zzd().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r7.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0ab3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0ad0, code lost:
    
        zzaA().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r4.zzaq()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x02f8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x030c, code lost:
    
        r12.zzt.zzaA().zzd().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r10), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x02fb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x02fc, code lost:
    
        r32 = com.baidu.ar.constants.HttpConstants.HTTP_APP_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0304, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0305, code lost:
    
        r31 = "metadata_fingerprint";
        r32 = com.baidu.ar.constants.HttpConstants.HTTP_APP_ID;
        r18 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0573 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05b4 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0678 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0685 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0692 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06ca A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06db A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x071c A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0743 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0776 A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07d6 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07f7 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x081c A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x086b A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0878 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0891 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08fc A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x091d A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x093c A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x09ce A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a7f A[Catch: all -> 0x01c4, SQLiteException -> 0x0a95, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x0a95, blocks: (B:229:0x0a70, B:231:0x0a7f), top: B:228:0x0a70, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x09df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0748 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x062d A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0389 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0343 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e8 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0415  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzY(zzaw zzawVar, zzq zzqVar) {
        long longValue;
        String str;
        String str2;
        zzll zzllVar;
        String str3;
        zzam zzamVar;
        zzau zzauVar;
        long j8;
        long intValue;
        String str4;
        long j9;
        zzar zzarVar;
        String str5;
        String str6;
        zzas zzn;
        zzas zzc;
        com.google.android.gms.internal.measurement.zzgc zzu;
        long j10;
        long j11;
        Map emptyMap;
        ArrayList arrayList;
        zzai zzc2;
        zzah zzahVar;
        zzh zzj;
        List zzu2;
        int i8;
        zzam zzamVar2;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        zzam zzamVar3;
        zzat zzatVar;
        int i9;
        ContentValues contentValues;
        String str7;
        Pair zzd;
        Object obj;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long nanoTime = System.nanoTime();
        zzaB().zzg();
        zzB();
        String str8 = zzqVar.zza;
        zzal(this.zzi);
        if (!zzli.zzA(zzawVar, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzfv zzfvVar = this.zzc;
        zzal(zzfvVar);
        String str9 = "_err";
        if (zzfvVar.zzr(str8, zzawVar.zza)) {
            zzaA().zzk().zzc("Dropping blocked event. appId", zzeu.zzn(str8), this.zzn.zzj().zzd(zzawVar.zza));
            zzfv zzfvVar2 = this.zzc;
            zzal(zzfvVar2);
            if (!zzfvVar2.zzp(str8)) {
                zzfv zzfvVar3 = this.zzc;
                zzal(zzfvVar3);
                if (!zzfvVar3.zzs(str8)) {
                    if ("_err".equals(zzawVar.zza)) {
                        return;
                    }
                    zzv().zzO(this.zzF, str8, 11, "_ev", zzawVar.zza, 0);
                    return;
                }
            }
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            zzh zzj2 = zzamVar4.zzj(str8);
            if (zzj2 != null) {
                long abs = Math.abs(zzax().currentTimeMillis() - Math.max(zzj2.zzl(), zzj2.zzc()));
                zzg();
                if (abs > ((Long) zzeh.zzz.zza(null)).longValue()) {
                    zzaA().zzc().zza("Fetching config for blocked app");
                    zzD(zzj2);
                    return;
                }
                return;
            }
            return;
        }
        zzev zzb2 = zzev.zzb(zzawVar);
        zzv().zzN(zzb2, zzg().zzd(str8));
        zzpn.zzc();
        int zzf = zzg().zzs(null, zzeh.zzaA) ? zzg().zzf(str8, zzeh.zzQ, 10, 35) : 0;
        Iterator it = new TreeSet(zzb2.zzd.keySet()).iterator();
        while (it.hasNext()) {
            String str10 = (String) it.next();
            if (FirebaseAnalytics.Param.ITEMS.equals(str10)) {
                zzlo zzv = zzv();
                Iterator it2 = it;
                Parcelable[] parcelableArray = zzb2.zzd.getParcelableArray(str10);
                zzpn.zzc();
                zzv.zzM(parcelableArray, zzf, zzg().zzs(null, zzeh.zzaA));
                it = it2;
                str9 = str9;
                nanoTime = nanoTime;
            }
        }
        long j12 = nanoTime;
        String str11 = str9;
        zzaw zza = zzb2.zza();
        if (Log.isLoggable(zzaA().zzr(), 2)) {
            zzaA().zzj().zzb("Logging event", this.zzn.zzj().zzc(zza));
        }
        zzpk.zzc();
        zzg().zzs(null, zzeh.zzax);
        zzam zzamVar5 = this.zze;
        zzal(zzamVar5);
        zzamVar5.zzw();
        try {
            zzd(zzqVar);
            boolean z7 = "ecommerce_purchase".equals(zza.zza) || FirebaseAnalytics.Event.PURCHASE.equals(zza.zza) || FirebaseAnalytics.Event.REFUND.equals(zza.zza);
            if (!"_iap".equals(zza.zza)) {
                if (z7) {
                    z7 = true;
                }
                str = "metadata_fingerprint";
                str2 = HttpConstants.HTTP_APP_ID;
                str3 = str11;
                boolean zzak = zzlo.zzak(zza.zza);
                boolean equals = str3.equals(zza.zza);
                zzv();
                zzauVar = zza.zzb;
                if (zzauVar != null) {
                    j8 = 0;
                } else {
                    zzat zzatVar2 = new zzat(zzauVar);
                    j8 = 0;
                    while (zzatVar2.hasNext()) {
                        if (zzauVar.zzf(zzatVar2.next()) instanceof Parcelable[]) {
                            j8 += ((Parcelable[]) r14).length;
                        }
                    }
                }
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzak zzm = zzamVar6.zzm(zza(), str8, j8 + 1, true, zzak, false, equals, false);
                long j13 = zzm.zzb;
                zzg();
                intValue = j13 - ((Integer) zzeh.zzk.zza(null)).intValue();
                if (intValue <= 0) {
                    if (intValue % 1000 == 1) {
                        zzaA().zzd().zzc("Data loss. Too many events logged. appId, count", zzeu.zzn(str8), Long.valueOf(zzm.zzb));
                    }
                    zzam zzamVar7 = this.zze;
                    zzal(zzamVar7);
                    zzamVar7.zzC();
                    zzam zzamVar8 = this.zze;
                    zzal(zzamVar8);
                    zzamVar8.zzx();
                    return;
                }
                if (zzak) {
                    long j14 = zzm.zza;
                    zzg();
                    long intValue2 = j14 - ((Integer) zzeh.zzm.zza(null)).intValue();
                    if (intValue2 > 0) {
                        if (intValue2 % 1000 == 1) {
                            zzaA().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeu.zzn(str8), Long.valueOf(zzm.zza));
                        }
                        zzv().zzO(this.zzF, str8, 16, "_ev", zza.zza, 0);
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzC();
                        zzam zzamVar10 = this.zze;
                        zzal(zzamVar10);
                        zzamVar10.zzx();
                        return;
                    }
                }
                if (equals) {
                    long max = zzm.zzd - Math.max(0, Math.min(1000000, zzg().zze(zzqVar.zza, zzeh.zzl)));
                    if (max > 0) {
                        if (max == 1) {
                            zzaA().zzd().zzc("Too many error events logged. appId, count", zzeu.zzn(str8), Long.valueOf(zzm.zzd));
                        }
                        zzam zzamVar11 = this.zze;
                        zzal(zzamVar11);
                        zzamVar11.zzC();
                        zzam zzamVar12 = this.zze;
                        zzal(zzamVar12);
                        zzamVar12.zzx();
                        return;
                    }
                }
                Bundle zzc3 = zza.zzb.zzc();
                zzv().zzP(zzc3, "_o", zza.zzc);
                if (zzv().zzaf(str8)) {
                    zzv().zzP(zzc3, "_dbg", 1L);
                    zzv().zzP(zzc3, "_r", 1L);
                }
                if ("_s".equals(zza.zza)) {
                    zzam zzamVar13 = this.zze;
                    zzal(zzamVar13);
                    zzll zzp = zzamVar13.zzp(zzqVar.zza, "_sno");
                    if (zzp != null && (zzp.zze instanceof Long)) {
                        zzv().zzP(zzc3, "_sno", zzp.zze);
                    }
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                Preconditions.checkNotEmpty(str8);
                zzamVar14.zzg();
                zzamVar14.zzW();
                try {
                    try {
                        str4 = "raw_events";
                        try {
                            j9 = zzamVar14.zzh().delete(str4, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str8, String.valueOf(Math.max(0, Math.min(1000000, zzamVar14.zzt.zzf().zze(str8, zzeh.zzp))))});
                        } catch (SQLiteException e8) {
                            e = e8;
                            zzamVar14.zzt.zzaA().zzd().zzc("Error deleting over the limit events. appId", zzeu.zzn(str8), e);
                            j9 = 0;
                            if (j9 > 0) {
                            }
                            zzge zzgeVar = this.zzn;
                            String str12 = zza.zzc;
                            String str13 = zza.zza;
                            long j15 = zza.zzd;
                            str5 = str4;
                            str6 = "_r";
                            zzarVar = new zzar(zzgeVar, str12, str8, str13, j15, 0L, zzc3);
                            zzam zzamVar15 = this.zze;
                            zzal(zzamVar15);
                            zzn = zzamVar15.zzn(str8, zzarVar.zzb);
                            if (zzn != null) {
                            }
                            zzam zzamVar16 = this.zze;
                            zzal(zzamVar16);
                            zzamVar16.zzE(zzc);
                            zzaB().zzg();
                            zzB();
                            Preconditions.checkNotNull(zzarVar);
                            Preconditions.checkNotNull(zzqVar);
                            Preconditions.checkNotEmpty(zzarVar.zza);
                            Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                            zzu = com.google.android.gms.internal.measurement.zzgd.zzu();
                            zzu.zzad(1);
                            zzu.zzZ(HttpConstants.OS_TYPE_VALUE);
                            if (!TextUtils.isEmpty(zzqVar.zza)) {
                            }
                            if (!TextUtils.isEmpty(zzqVar.zzd)) {
                            }
                            if (!TextUtils.isEmpty(zzqVar.zzc)) {
                            }
                            zzqr.zzc();
                            if (!TextUtils.isEmpty(zzqVar.zzx)) {
                                zzu.zzah(zzqVar.zzx);
                            }
                            j10 = zzqVar.zzj;
                            if (j10 != -2147483648L) {
                            }
                            zzu.zzV(zzqVar.zze);
                            if (!TextUtils.isEmpty(zzqVar.zzb)) {
                            }
                            zzu.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                            if (zzu.zzar().isEmpty()) {
                                zzu.zzC(zzqVar.zzq);
                            }
                            j11 = zzqVar.zzf;
                            if (j11 != 0) {
                            }
                            zzu.zzP(zzqVar.zzs);
                            zzli zzliVar = this.zzi;
                            zzal(zzliVar);
                            com.google.android.gms.internal.measurement.zzhf zza2 = com.google.android.gms.internal.measurement.zzhf.zza(zzliVar.zzf.zzn.zzaw().getContentResolver(), com.google.android.gms.internal.measurement.zzhq.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzay
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.google.android.gms.internal.measurement.zzib.zzc();
                                }
                            });
                            if (zza2 != null) {
                            }
                            if (emptyMap != null) {
                                arrayList = new ArrayList();
                                int intValue3 = ((Integer) zzeh.zzP.zza(null)).intValue();
                                while (r8.hasNext()) {
                                }
                                if (arrayList.isEmpty()) {
                                }
                                if (arrayList != null) {
                                }
                                zzc2 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                                zzahVar = zzah.AD_STORAGE;
                                if (zzc2.zzi(zzahVar)) {
                                }
                                this.zzn.zzg().zzv();
                                zzu.zzN(Build.MODEL);
                                this.zzn.zzg().zzv();
                                zzu.zzY(Build.VERSION.RELEASE);
                                zzu.zzak((int) this.zzn.zzg().zzb());
                                zzu.zzao(this.zzn.zzg().zzc());
                                zzpw.zzc();
                                if (zzg().zzs(null, zzeh.zzaE)) {
                                }
                                if (this.zzn.zzJ()) {
                                }
                                zzam zzamVar17 = this.zze;
                                zzal(zzamVar17);
                                zzj = zzamVar17.zzj(zzqVar.zza);
                                if (zzj == null) {
                                }
                                if (zzc2.zzi(zzah.ANALYTICS_STORAGE)) {
                                }
                                if (!TextUtils.isEmpty(zzj.zzy())) {
                                }
                                zzam zzamVar18 = this.zze;
                                zzal(zzamVar18);
                                zzu2 = zzamVar18.zzu(zzqVar.zza);
                                while (i8 < zzu2.size()) {
                                }
                                zzamVar2 = this.zze;
                                zzal(zzamVar2);
                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzu.zzaD();
                                zzamVar2.zzg();
                                zzamVar2.zzW();
                                Preconditions.checkNotNull(zzgdVar);
                                Preconditions.checkNotEmpty(zzgdVar.zzy());
                                byte[] zzbx = zzgdVar.zzbx();
                                zzli zzliVar2 = zzamVar2.zzf.zzi;
                                zzal(zzliVar2);
                                long zzd2 = zzliVar2.zzd(zzbx);
                                ContentValues contentValues2 = new ContentValues();
                                String str14 = str2;
                                contentValues2.put(str14, zzgdVar.zzy());
                                String str15 = str;
                                contentValues2.put(str15, Long.valueOf(zzd2));
                                contentValues2.put(TtmlNode.TAG_METADATA, zzbx);
                                zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                zzamVar3 = this.zze;
                                zzal(zzamVar3);
                                zzatVar = new zzat(zzarVar.zzf);
                                while (true) {
                                    if (zzatVar.hasNext()) {
                                    }
                                    str6 = str7;
                                }
                                zzamVar3.zzg();
                                zzamVar3.zzW();
                                Preconditions.checkNotNull(zzarVar);
                                Preconditions.checkNotEmpty(zzarVar.zza);
                                zzli zzliVar3 = zzamVar3.zzf.zzi;
                                zzal(zzliVar3);
                                byte[] zzbx2 = zzliVar3.zzj(zzarVar).zzbx();
                                contentValues = new ContentValues();
                                contentValues.put(str14, zzarVar.zza);
                                contentValues.put("name", zzarVar.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                                contentValues.put(str15, Long.valueOf(zzd2));
                                contentValues.put("data", zzbx2);
                                contentValues.put("realtime", Integer.valueOf(i9));
                                if (zzamVar3.zzh().insert(str5, null, contentValues) != -1) {
                                }
                                zzam zzamVar19 = this.zze;
                                zzal(zzamVar19);
                                zzamVar19.zzC();
                                zzam zzamVar20 = this.zze;
                                zzal(zzamVar20);
                                zzamVar20.zzx();
                                zzag();
                                zzaA().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j12) + 500000) / 1000000));
                                return;
                            }
                            arrayList = null;
                            if (arrayList != null) {
                            }
                            zzc2 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                            zzahVar = zzah.AD_STORAGE;
                            if (zzc2.zzi(zzahVar)) {
                            }
                            this.zzn.zzg().zzv();
                            zzu.zzN(Build.MODEL);
                            this.zzn.zzg().zzv();
                            zzu.zzY(Build.VERSION.RELEASE);
                            zzu.zzak((int) this.zzn.zzg().zzb());
                            zzu.zzao(this.zzn.zzg().zzc());
                            zzpw.zzc();
                            if (zzg().zzs(null, zzeh.zzaE)) {
                            }
                            if (this.zzn.zzJ()) {
                            }
                            zzam zzamVar172 = this.zze;
                            zzal(zzamVar172);
                            zzj = zzamVar172.zzj(zzqVar.zza);
                            if (zzj == null) {
                            }
                            if (zzc2.zzi(zzah.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(zzj.zzy())) {
                            }
                            zzam zzamVar182 = this.zze;
                            zzal(zzamVar182);
                            zzu2 = zzamVar182.zzu(zzqVar.zza);
                            while (i8 < zzu2.size()) {
                            }
                            zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzu.zzaD();
                            zzamVar2.zzg();
                            zzamVar2.zzW();
                            Preconditions.checkNotNull(zzgdVar);
                            Preconditions.checkNotEmpty(zzgdVar.zzy());
                            byte[] zzbx3 = zzgdVar.zzbx();
                            zzli zzliVar22 = zzamVar2.zzf.zzi;
                            zzal(zzliVar22);
                            long zzd22 = zzliVar22.zzd(zzbx3);
                            ContentValues contentValues22 = new ContentValues();
                            String str142 = str2;
                            contentValues22.put(str142, zzgdVar.zzy());
                            String str152 = str;
                            contentValues22.put(str152, Long.valueOf(zzd22));
                            contentValues22.put(TtmlNode.TAG_METADATA, zzbx3);
                            zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                            zzamVar3 = this.zze;
                            zzal(zzamVar3);
                            zzatVar = new zzat(zzarVar.zzf);
                            while (true) {
                                if (zzatVar.hasNext()) {
                                }
                                str6 = str7;
                            }
                            zzamVar3.zzg();
                            zzamVar3.zzW();
                            Preconditions.checkNotNull(zzarVar);
                            Preconditions.checkNotEmpty(zzarVar.zza);
                            zzli zzliVar32 = zzamVar3.zzf.zzi;
                            zzal(zzliVar32);
                            byte[] zzbx22 = zzliVar32.zzj(zzarVar).zzbx();
                            contentValues = new ContentValues();
                            contentValues.put(str142, zzarVar.zza);
                            contentValues.put("name", zzarVar.zzb);
                            contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                            contentValues.put(str152, Long.valueOf(zzd22));
                            contentValues.put("data", zzbx22);
                            contentValues.put("realtime", Integer.valueOf(i9));
                            if (zzamVar3.zzh().insert(str5, null, contentValues) != -1) {
                            }
                            zzam zzamVar192 = this.zze;
                            zzal(zzamVar192);
                            zzamVar192.zzC();
                            zzam zzamVar202 = this.zze;
                            zzal(zzamVar202);
                            zzamVar202.zzx();
                            zzag();
                            zzaA().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j12) + 500000) / 1000000));
                            return;
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        str4 = "raw_events";
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    str4 = "raw_events";
                }
                if (j9 > 0) {
                    zzaA().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeu.zzn(str8), Long.valueOf(j9));
                }
                zzge zzgeVar2 = this.zzn;
                String str122 = zza.zzc;
                String str132 = zza.zza;
                long j152 = zza.zzd;
                str5 = str4;
                str6 = "_r";
                zzarVar = new zzar(zzgeVar2, str122, str8, str132, j152, 0L, zzc3);
                zzam zzamVar152 = this.zze;
                zzal(zzamVar152);
                zzn = zzamVar152.zzn(str8, zzarVar.zzb);
                if (zzn != null) {
                    zzam zzamVar21 = this.zze;
                    zzal(zzamVar21);
                    if (zzamVar21.zzf(str8) >= zzg().zzb(str8) && zzak) {
                        zzaA().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeu.zzn(str8), this.zzn.zzj().zzd(zzarVar.zzb), Integer.valueOf(zzg().zzb(str8)));
                        zzv().zzO(this.zzF, str8, 8, null, null, 0);
                        zzam zzamVar22 = this.zze;
                        zzal(zzamVar22);
                        zzamVar22.zzx();
                        return;
                    }
                    zzc = new zzas(str8, zzarVar.zzb, 0L, 0L, 0L, zzarVar.zzd, 0L, null, null, null, null);
                } else {
                    zzarVar = zzarVar.zza(this.zzn, zzn.zzf);
                    zzc = zzn.zzc(zzarVar.zzd);
                }
                zzam zzamVar162 = this.zze;
                zzal(zzamVar162);
                zzamVar162.zzE(zzc);
                zzaB().zzg();
                zzB();
                Preconditions.checkNotNull(zzarVar);
                Preconditions.checkNotNull(zzqVar);
                Preconditions.checkNotEmpty(zzarVar.zza);
                Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                zzu = com.google.android.gms.internal.measurement.zzgd.zzu();
                zzu.zzad(1);
                zzu.zzZ(HttpConstants.OS_TYPE_VALUE);
                if (!TextUtils.isEmpty(zzqVar.zza)) {
                    zzu.zzD(zzqVar.zza);
                }
                if (!TextUtils.isEmpty(zzqVar.zzd)) {
                    zzu.zzF(zzqVar.zzd);
                }
                if (!TextUtils.isEmpty(zzqVar.zzc)) {
                    zzu.zzG(zzqVar.zzc);
                }
                zzqr.zzc();
                if (!TextUtils.isEmpty(zzqVar.zzx) && (zzg().zzs(null, zzeh.zzam) || zzg().zzs(zzqVar.zza, zzeh.zzao))) {
                    zzu.zzah(zzqVar.zzx);
                }
                j10 = zzqVar.zzj;
                if (j10 != -2147483648L) {
                    zzu.zzH((int) j10);
                }
                zzu.zzV(zzqVar.zze);
                if (!TextUtils.isEmpty(zzqVar.zzb)) {
                    zzu.zzU(zzqVar.zzb);
                }
                zzu.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                if (zzu.zzar().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                    zzu.zzC(zzqVar.zzq);
                }
                j11 = zzqVar.zzf;
                if (j11 != 0) {
                    zzu.zzM(j11);
                }
                zzu.zzP(zzqVar.zzs);
                zzli zzliVar4 = this.zzi;
                zzal(zzliVar4);
                com.google.android.gms.internal.measurement.zzhf zza22 = com.google.android.gms.internal.measurement.zzhf.zza(zzliVar4.zzf.zzn.zzaw().getContentResolver(), com.google.android.gms.internal.measurement.zzhq.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzay
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.internal.measurement.zzib.zzc();
                    }
                });
                emptyMap = zza22 != null ? Collections.emptyMap() : zza22.zzc();
                try {
                    if (emptyMap != null && !emptyMap.isEmpty()) {
                        arrayList = new ArrayList();
                        int intValue32 = ((Integer) zzeh.zzP.zza(null)).intValue();
                        for (Map.Entry entry : emptyMap.entrySet()) {
                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                try {
                                    int parseInt = Integer.parseInt((String) entry.getValue());
                                    if (parseInt != 0) {
                                        arrayList.add(Integer.valueOf(parseInt));
                                        if (arrayList.size() >= intValue32) {
                                            zzliVar4.zzt.zzaA().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                            break;
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } catch (NumberFormatException e11) {
                                    zzliVar4.zzt.zzaA().zzk().zzb("Experiment ID NumberFormatException", e11);
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                        }
                        if (arrayList != null) {
                            zzu.zzh(arrayList);
                        }
                        zzc2 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                        zzahVar = zzah.AD_STORAGE;
                        if (zzc2.zzi(zzahVar) && zzqVar.zzo) {
                            zzd = this.zzk.zzd(zzqVar.zza, zzc2);
                            if (!TextUtils.isEmpty((CharSequence) zzd.first) && zzqVar.zzo) {
                                zzu.zzae((String) zzd.first);
                                obj = zzd.second;
                                if (obj != null) {
                                    zzu.zzX(((Boolean) obj).booleanValue());
                                }
                            }
                        }
                        this.zzn.zzg().zzv();
                        zzu.zzN(Build.MODEL);
                        this.zzn.zzg().zzv();
                        zzu.zzY(Build.VERSION.RELEASE);
                        zzu.zzak((int) this.zzn.zzg().zzb());
                        zzu.zzao(this.zzn.zzg().zzc());
                        zzpw.zzc();
                        if (zzg().zzs(null, zzeh.zzaE)) {
                            zzu.zzaj(zzqVar.zzz);
                        }
                        if (this.zzn.zzJ()) {
                            zzu.zzaq();
                            if (!TextUtils.isEmpty(null)) {
                                zzu.zzO(null);
                            }
                        }
                        zzam zzamVar1722 = this.zze;
                        zzal(zzamVar1722);
                        zzj = zzamVar1722.zzj(zzqVar.zza);
                        if (zzj == null) {
                            zzj = new zzh(this.zzn, zzqVar.zza);
                            zzj.zzI(zzw(zzc2));
                            zzj.zzW(zzqVar.zzk);
                            zzj.zzX(zzqVar.zzb);
                            if (zzc2.zzi(zzahVar)) {
                                zzj.zzaf(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                            }
                            zzj.zzab(0L);
                            zzj.zzac(0L);
                            zzj.zzaa(0L);
                            zzj.zzK(zzqVar.zzc);
                            zzj.zzL(zzqVar.zzj);
                            zzj.zzJ(zzqVar.zzd);
                            zzj.zzY(zzqVar.zze);
                            zzj.zzT(zzqVar.zzf);
                            zzj.zzad(zzqVar.zzh);
                            zzj.zzU(zzqVar.zzs);
                            zzam zzamVar23 = this.zze;
                            zzal(zzamVar23);
                            zzamVar23.zzD(zzj);
                        }
                        if (zzc2.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzj.zzv())) {
                            zzu.zzE((String) Preconditions.checkNotNull(zzj.zzv()));
                        }
                        if (!TextUtils.isEmpty(zzj.zzy())) {
                            zzu.zzT((String) Preconditions.checkNotNull(zzj.zzy()));
                        }
                        zzam zzamVar1822 = this.zze;
                        zzal(zzamVar1822);
                        zzu2 = zzamVar1822.zzu(zzqVar.zza);
                        for (i8 = 0; i8 < zzu2.size(); i8++) {
                            com.google.android.gms.internal.measurement.zzgl zzd3 = com.google.android.gms.internal.measurement.zzgm.zzd();
                            zzd3.zzf(((zzll) zzu2.get(i8)).zzc);
                            zzd3.zzg(((zzll) zzu2.get(i8)).zzd);
                            zzli zzliVar5 = this.zzi;
                            zzal(zzliVar5);
                            zzliVar5.zzu(zzd3, ((zzll) zzu2.get(i8)).zze);
                            zzu.zzl(zzd3);
                        }
                        zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzu.zzaD();
                        zzamVar2.zzg();
                        zzamVar2.zzW();
                        Preconditions.checkNotNull(zzgdVar);
                        Preconditions.checkNotEmpty(zzgdVar.zzy());
                        byte[] zzbx32 = zzgdVar.zzbx();
                        zzli zzliVar222 = zzamVar2.zzf.zzi;
                        zzal(zzliVar222);
                        long zzd222 = zzliVar222.zzd(zzbx32);
                        ContentValues contentValues222 = new ContentValues();
                        String str1422 = str2;
                        contentValues222.put(str1422, zzgdVar.zzy());
                        String str1522 = str;
                        contentValues222.put(str1522, Long.valueOf(zzd222));
                        contentValues222.put(TtmlNode.TAG_METADATA, zzbx32);
                        zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                        zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzatVar = new zzat(zzarVar.zzf);
                        while (true) {
                            if (zzatVar.hasNext()) {
                                zzfv zzfvVar4 = this.zzc;
                                zzal(zzfvVar4);
                                boolean zzq = zzfvVar4.zzq(zzarVar.zza, zzarVar.zzb);
                                zzam zzamVar24 = this.zze;
                                zzal(zzamVar24);
                                zzak zzl = zzamVar24.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                                if (!zzq || zzl.zze >= zzg().zze(zzarVar.zza, zzeh.zzo)) {
                                    i9 = 0;
                                }
                            } else {
                                str7 = str6;
                                if (str7.equals(zzatVar.next())) {
                                    break;
                                } else {
                                    str6 = str7;
                                }
                            }
                        }
                        zzamVar3.zzg();
                        zzamVar3.zzW();
                        Preconditions.checkNotNull(zzarVar);
                        Preconditions.checkNotEmpty(zzarVar.zza);
                        zzli zzliVar322 = zzamVar3.zzf.zzi;
                        zzal(zzliVar322);
                        byte[] zzbx222 = zzliVar322.zzj(zzarVar).zzbx();
                        contentValues = new ContentValues();
                        contentValues.put(str1422, zzarVar.zza);
                        contentValues.put("name", zzarVar.zzb);
                        contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                        contentValues.put(str1522, Long.valueOf(zzd222));
                        contentValues.put("data", zzbx222);
                        contentValues.put("realtime", Integer.valueOf(i9));
                        if (zzamVar3.zzh().insert(str5, null, contentValues) != -1) {
                            zzamVar3.zzt.zzaA().zzd().zzb("Failed to insert raw event (got -1). appId", zzeu.zzn(zzarVar.zza));
                        } else {
                            this.zza = 0L;
                        }
                        zzam zzamVar1922 = this.zze;
                        zzal(zzamVar1922);
                        zzamVar1922.zzC();
                        zzam zzamVar2022 = this.zze;
                        zzal(zzamVar2022);
                        zzamVar2022.zzx();
                        zzag();
                        zzaA().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j12) + 500000) / 1000000));
                        return;
                    }
                    zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                    zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzatVar = new zzat(zzarVar.zzf);
                    while (true) {
                        if (zzatVar.hasNext()) {
                        }
                        str6 = str7;
                    }
                    zzamVar3.zzg();
                    zzamVar3.zzW();
                    Preconditions.checkNotNull(zzarVar);
                    Preconditions.checkNotEmpty(zzarVar.zza);
                    zzli zzliVar3222 = zzamVar3.zzf.zzi;
                    zzal(zzliVar3222);
                    byte[] zzbx2222 = zzliVar3222.zzj(zzarVar).zzbx();
                    contentValues = new ContentValues();
                    contentValues.put(str1422, zzarVar.zza);
                    contentValues.put("name", zzarVar.zzb);
                    contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                    contentValues.put(str1522, Long.valueOf(zzd222));
                    contentValues.put("data", zzbx2222);
                    contentValues.put("realtime", Integer.valueOf(i9));
                    if (zzamVar3.zzh().insert(str5, null, contentValues) != -1) {
                    }
                    zzam zzamVar19222 = this.zze;
                    zzal(zzamVar19222);
                    zzamVar19222.zzC();
                    zzam zzamVar20222 = this.zze;
                    zzal(zzamVar20222);
                    zzamVar20222.zzx();
                    zzag();
                    zzaA().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j12) + 500000) / 1000000));
                    return;
                } catch (SQLiteException e12) {
                    zzamVar2.zzt.zzaA().zzd().zzc("Error storing raw event metadata. appId", zzeu.zzn(zzgdVar.zzy()), e12);
                    throw e12;
                }
                arrayList = null;
                if (arrayList != null) {
                }
                zzc2 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                zzahVar = zzah.AD_STORAGE;
                if (zzc2.zzi(zzahVar)) {
                    zzd = this.zzk.zzd(zzqVar.zza, zzc2);
                    if (!TextUtils.isEmpty((CharSequence) zzd.first)) {
                        zzu.zzae((String) zzd.first);
                        obj = zzd.second;
                        if (obj != null) {
                        }
                    }
                }
                this.zzn.zzg().zzv();
                zzu.zzN(Build.MODEL);
                this.zzn.zzg().zzv();
                zzu.zzY(Build.VERSION.RELEASE);
                zzu.zzak((int) this.zzn.zzg().zzb());
                zzu.zzao(this.zzn.zzg().zzc());
                zzpw.zzc();
                if (zzg().zzs(null, zzeh.zzaE)) {
                }
                if (this.zzn.zzJ()) {
                }
                zzam zzamVar17222 = this.zze;
                zzal(zzamVar17222);
                zzj = zzamVar17222.zzj(zzqVar.zza);
                if (zzj == null) {
                }
                if (zzc2.zzi(zzah.ANALYTICS_STORAGE)) {
                    zzu.zzE((String) Preconditions.checkNotNull(zzj.zzv()));
                }
                if (!TextUtils.isEmpty(zzj.zzy())) {
                }
                zzam zzamVar18222 = this.zze;
                zzal(zzamVar18222);
                zzu2 = zzamVar18222.zzu(zzqVar.zza);
                while (i8 < zzu2.size()) {
                }
                zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzu.zzaD();
                zzamVar2.zzg();
                zzamVar2.zzW();
                Preconditions.checkNotNull(zzgdVar);
                Preconditions.checkNotEmpty(zzgdVar.zzy());
                byte[] zzbx322 = zzgdVar.zzbx();
                zzli zzliVar2222 = zzamVar2.zzf.zzi;
                zzal(zzliVar2222);
                long zzd2222 = zzliVar2222.zzd(zzbx322);
                ContentValues contentValues2222 = new ContentValues();
                String str14222 = str2;
                contentValues2222.put(str14222, zzgdVar.zzy());
                String str15222 = str;
                contentValues2222.put(str15222, Long.valueOf(zzd2222));
                contentValues2222.put(TtmlNode.TAG_METADATA, zzbx322);
            }
            String zzg = zza.zzb.zzg(FirebaseAnalytics.Param.CURRENCY);
            if (z7) {
                double doubleValue = zza.zzb.zzd("value").doubleValue() * 1000000.0d;
                if (doubleValue == i.DOUBLE_EPSILON) {
                    doubleValue = zza.zzb.zze("value").longValue() * 1000000.0d;
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    zzaA().zzk().zzc("Data lost. Currency value is too big. appId", zzeu.zzn(str8), Double.valueOf(doubleValue));
                    zzam zzamVar25 = this.zze;
                    zzal(zzamVar25);
                    zzamVar25.zzC();
                    zzam zzamVar26 = this.zze;
                    zzal(zzamVar26);
                    zzamVar26.zzx();
                    return;
                }
                longValue = Math.round(doubleValue);
                if (FirebaseAnalytics.Event.REFUND.equals(zza.zza)) {
                    longValue = -longValue;
                }
            } else {
                longValue = zza.zzb.zze("value").longValue();
            }
            if (!TextUtils.isEmpty(zzg)) {
                String upperCase = zzg.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    zzam zzamVar27 = this.zze;
                    zzal(zzamVar27);
                    zzll zzp2 = zzamVar27.zzp(str8, concat);
                    if (zzp2 != null) {
                        Object obj2 = zzp2.zze;
                        if (obj2 instanceof Long) {
                            zzllVar = new zzll(str8, zza.zzc, concat, zzax().currentTimeMillis(), Long.valueOf(((Long) obj2).longValue() + longValue));
                            str = "metadata_fingerprint";
                            str2 = HttpConstants.HTTP_APP_ID;
                            str3 = str11;
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            if (!zzamVar.zzL(zzllVar)) {
                                zzaA().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeu.zzn(str8), this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                                zzv().zzO(this.zzF, str8, 9, null, null, 0);
                            }
                            boolean zzak2 = zzlo.zzak(zza.zza);
                            boolean equals2 = str3.equals(zza.zza);
                            zzv();
                            zzauVar = zza.zzb;
                            if (zzauVar != null) {
                            }
                            zzam zzamVar62 = this.zze;
                            zzal(zzamVar62);
                            zzak zzm2 = zzamVar62.zzm(zza(), str8, j8 + 1, true, zzak2, false, equals2, false);
                            long j132 = zzm2.zzb;
                            zzg();
                            intValue = j132 - ((Integer) zzeh.zzk.zza(null)).intValue();
                            if (intValue <= 0) {
                            }
                        }
                    }
                    zzam zzamVar28 = this.zze;
                    zzal(zzamVar28);
                    int zze = zzg().zze(str8, zzeh.zzE) - 1;
                    Preconditions.checkNotEmpty(str8);
                    zzamVar28.zzg();
                    zzamVar28.zzW();
                    SQLiteDatabase zzh = zzamVar28.zzh();
                    String str16 = str11;
                    str = "metadata_fingerprint";
                    String[] strArr = new String[3];
                    strArr[0] = str8;
                    str2 = HttpConstants.HTTP_APP_ID;
                    strArr[1] = str8;
                    strArr[2] = String.valueOf(zze);
                    zzh.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                    str3 = str16;
                    zzllVar = new zzll(str8, zza.zzc, concat, zzax().currentTimeMillis(), Long.valueOf(longValue));
                    zzamVar = this.zze;
                    zzal(zzamVar);
                    if (!zzamVar.zzL(zzllVar)) {
                    }
                    boolean zzak22 = zzlo.zzak(zza.zza);
                    boolean equals22 = str3.equals(zza.zza);
                    zzv();
                    zzauVar = zza.zzb;
                    if (zzauVar != null) {
                    }
                    zzam zzamVar622 = this.zze;
                    zzal(zzamVar622);
                    zzak zzm22 = zzamVar622.zzm(zza(), str8, j8 + 1, true, zzak22, false, equals22, false);
                    long j1322 = zzm22.zzb;
                    zzg();
                    intValue = j1322 - ((Integer) zzeh.zzk.zza(null)).intValue();
                    if (intValue <= 0) {
                    }
                }
            }
            str = "metadata_fingerprint";
            str2 = HttpConstants.HTTP_APP_ID;
            str3 = str11;
            boolean zzak222 = zzlo.zzak(zza.zza);
            boolean equals222 = str3.equals(zza.zza);
            zzv();
            zzauVar = zza.zzb;
            if (zzauVar != null) {
            }
            zzam zzamVar6222 = this.zze;
            zzal(zzamVar6222);
            zzak zzm222 = zzamVar6222.zzm(zza(), str8, j8 + 1, true, zzak222, false, equals222, false);
            long j13222 = zzm222.zzb;
            zzg();
            intValue = j13222 - ((Integer) zzeh.zzk.zza(null)).intValue();
            if (intValue <= 0) {
            }
        } catch (Throwable th) {
            zzam zzamVar29 = this.zze;
            zzal(zzamVar29);
            zzamVar29.zzx();
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    final boolean zzZ() {
        zzaB().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzaA().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzaw().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock tryLock = channel.tryLock();
            this.zzw = tryLock;
            if (tryLock != null) {
                zzaA().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaA().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e8) {
            zzaA().zzd().zzb("Failed to acquire storage lock", e8);
            return false;
        } catch (IOException e9) {
            zzaA().zzd().zzb("Failed to access storage lock file", e9);
            return false;
        } catch (OverlappingFileLockException e10) {
            zzaA().zzk().zzb("Storage lock already acquired", e10);
            return false;
        }
    }

    final long zza() {
        long currentTimeMillis = zzax().currentTimeMillis();
        zzka zzkaVar = this.zzk;
        zzkaVar.zzW();
        zzkaVar.zzg();
        long zza = zzkaVar.zze.zza();
        if (zza == 0) {
            zza = zzkaVar.zzt.zzv().zzG().nextInt(TimeConstants.DAY) + 1;
            zzkaVar.zze.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final zzeu zzaA() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzaA();
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final zzgb zzaB() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzaB();
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final Context zzaw() {
        return this.zzn.zzaw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final Clock zzax() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzax();
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final zzab zzay() {
        throw null;
    }

    @WorkerThread
    final zzh zzd(zzq zzqVar) {
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzle zzleVar = null;
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzlf(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(zzqVar.zza);
        zzai zzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        zzah zzahVar = zzah.AD_STORAGE;
        String zzf = zzc.zzi(zzahVar) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzj == null) {
            zzj = new zzh(this.zzn, zzqVar.zza);
            if (zzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzj.zzI(zzw(zzc));
            }
            if (zzc.zzi(zzahVar)) {
                zzj.zzaf(zzf);
            }
        } else if (zzc.zzi(zzahVar) && zzf != null && !zzf.equals(zzj.zzB())) {
            zzj.zzaf(zzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzc).first)) {
                zzj.zzI(zzw(zzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, FileDownloadModel.ID) != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzll zzllVar = new zzll(zzqVar.zza, TtmlNode.TEXT_EMPHASIS_AUTO, "_lair", zzax().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzllVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj.zzv()) && zzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzj.zzI(zzw(zzc));
        }
        zzj.zzX(zzqVar.zzb);
        zzj.zzG(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzj.zzW(zzqVar.zzk);
        }
        long j8 = zzqVar.zze;
        if (j8 != 0) {
            zzj.zzY(j8);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzj.zzK(zzqVar.zzc);
        }
        zzj.zzL(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzj.zzJ(str);
        }
        zzj.zzT(zzqVar.zzf);
        zzj.zzad(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzj.zzZ(zzqVar.zzg);
        }
        zzj.zzH(zzqVar.zzo);
        zzj.zzae(zzqVar.zzr);
        zzj.zzU(zzqVar.zzs);
        zzqr.zzc();
        if (zzg().zzs(null, zzeh.zzam) || zzg().zzs(zzqVar.zza, zzeh.zzao)) {
            zzj.zzah(zzqVar.zzx);
        }
        zzop.zzc();
        if (zzg().zzs(null, zzeh.zzal)) {
            zzj.zzag(zzqVar.zzt);
        } else {
            zzop.zzc();
            if (zzg().zzs(null, zzeh.zzak)) {
                zzj.zzag(null);
            }
        }
        zzra.zzc();
        if (zzg().zzs(null, zzeh.zzaq)) {
            zzj.zzai(zzqVar.zzy);
        }
        zzpw.zzc();
        if (zzg().zzs(null, zzeh.zzaE)) {
            zzj.zzaj(zzqVar.zzz);
        }
        if (zzj.zzam()) {
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
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    @WorkerThread
    final zzai zzh(String str) {
        String str2;
        zzai zzaiVar = zzai.zza;
        zzaB().zzg();
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
                    cursor.close();
                } else {
                    cursor.close();
                    str2 = "G1";
                }
                zzai zzb2 = zzai.zzb(str2);
                zzV(str, zzb2);
                return zzb2;
            } catch (SQLiteException e8) {
                zzamVar.zzt.zzaA().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzep zzj() {
        return this.zzn.zzj();
    }

    public final zzfa zzl() {
        zzfa zzfaVar = this.zzd;
        zzal(zzfaVar);
        return zzfaVar;
    }

    public final zzfc zzm() {
        zzfc zzfcVar = this.zzf;
        if (zzfcVar != null) {
            return zzfcVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfv zzo() {
        zzfv zzfvVar = this.zzc;
        zzal(zzfvVar);
        return zzfvVar;
    }

    final zzge zzq() {
        return this.zzn;
    }

    public final zzio zzr() {
        zzio zzioVar = this.zzj;
        zzal(zzioVar);
        return zzioVar;
    }

    public final zzka zzs() {
        return this.zzk;
    }

    public final zzli zzu() {
        zzli zzliVar = this.zzi;
        zzal(zzliVar);
        return zzliVar;
    }

    public final zzlo zzv() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    @WorkerThread
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
            return (String) zzaB().zzh(new zzkz(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            zzaA().zzd().zzc("Failed to get app instance id. appId", zzeu.zzn(zzqVar.zza), e8);
            return null;
        }
    }

    @WorkerThread
    final void zzz(Runnable runnable) {
        zzaB().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
