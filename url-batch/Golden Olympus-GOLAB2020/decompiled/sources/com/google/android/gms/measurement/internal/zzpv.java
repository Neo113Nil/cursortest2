package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.da;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes.dex */
public final class zzpv implements zzjs {
    private static volatile zzpv zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzmh zzG;
    private String zzH;
    private zzaz zzI;
    private long zzJ;
    long zza;
    private final zzif zzc;
    private final zzhk zzd;
    private zzaw zze;
    private zzhm zzf;
    private zzoy zzg;
    private zzae zzh;
    private final zzqa zzi;
    private zzmc zzj;
    private zzoa zzk;
    private final zzpi zzl;
    private zzhw zzm;
    private final zzio zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzqe zzK = new zzpq(this);

    zzpv(zzpw zzpwVar, zzio zzioVar) {
        Preconditions.checkNotNull(zzpwVar);
        this.zzn = zzio.zzp(zzpwVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new zzpi(this);
        zzqa zzqaVar = new zzqa(this);
        zzqaVar.zzaw();
        this.zzi = zzqaVar;
        zzhk zzhkVar = new zzhk(this);
        zzhkVar.zzaw();
        this.zzd = zzhkVar;
        zzif zzifVar = new zzif(this);
        zzifVar.zzaw();
        this.zzc = zzifVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaX().zzq(new zzpk(this, zzpwVar));
    }

    static /* bridge */ /* synthetic */ void zzH(zzpv zzpvVar, zzpw zzpwVar) {
        zzpvVar.zzaX().zzg();
        zzpvVar.zzm = new zzhw(zzpvVar);
        zzaw zzawVar = new zzaw(zzpvVar);
        zzawVar.zzaw();
        zzpvVar.zze = zzawVar;
        zzpvVar.zzi().zzu((zzal) Preconditions.checkNotNull(zzpvVar.zzc));
        zzoa zzoaVar = new zzoa(zzpvVar);
        zzoaVar.zzaw();
        zzpvVar.zzk = zzoaVar;
        zzae zzaeVar = new zzae(zzpvVar);
        zzaeVar.zzaw();
        zzpvVar.zzh = zzaeVar;
        zzmc zzmcVar = new zzmc(zzpvVar);
        zzmcVar.zzaw();
        zzpvVar.zzj = zzmcVar;
        zzoy zzoyVar = new zzoy(zzpvVar);
        zzoyVar.zzaw();
        zzpvVar.zzg = zzoyVar;
        zzpvVar.zzf = new zzhm(zzpvVar);
        if (zzpvVar.zzs != zzpvVar.zzt) {
            zzpvVar.zzaW().zze().zzc("Not all upload components initialized", Integer.valueOf(zzpvVar.zzs), Integer.valueOf(zzpvVar.zzt));
        }
        zzpvVar.zzo.set(true);
        zzpvVar.zzaW().zzj().zza("UploadController is now fully initialized");
    }

    static final void zzaA(com.google.android.gms.internal.measurement.zzhl zzhlVar, int i4, String str) {
        List zzp = zzhlVar.zzp();
        for (int i5 = 0; i5 < zzp.size(); i5++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhq) zzp.get(i5)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhp zze = com.google.android.gms.internal.measurement.zzhq.zze();
        zze.zzj("_err");
        zze.zzi(i4);
        com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) zze.zzba();
        com.google.android.gms.internal.measurement.zzhp zze2 = com.google.android.gms.internal.measurement.zzhq.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) zze2.zzba();
        zzhlVar.zzf(zzhqVar);
        zzhlVar.zzf(zzhqVar2);
    }

    static final void zzaB(com.google.android.gms.internal.measurement.zzhl zzhlVar, String str) {
        List zzp = zzhlVar.zzp();
        for (int i4 = 0; i4 < zzp.size(); i4++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhq) zzp.get(i4)).zzg())) {
                zzhlVar.zzh(i4);
                return;
            }
        }
    }

    private final int zzaC(String str, zzao zzaoVar) {
        zzjw zzjwVar;
        zzju zzf;
        zzif zzifVar = this.zzc;
        if (zzifVar.zzi(str) == null) {
            zzaoVar.zzd(zzjw.AD_PERSONALIZATION, zzan.FAILSAFE);
            return 1;
        }
        zzh zzl = zzj().zzl(str);
        if (zzl != null && zze.zza(zzl.zzK()).zzb() == zzju.POLICY && (zzf = zzifVar.zzf(str, (zzjwVar = zzjw.AD_PERSONALIZATION))) != zzju.UNINITIALIZED) {
            zzaoVar.zzd(zzjwVar, zzan.REMOTE_ENFORCED_DEFAULT);
            return zzf == zzju.GRANTED ? 0 : 1;
        }
        zzjw zzjwVar2 = zzjw.AD_PERSONALIZATION;
        zzaoVar.zzd(zzjwVar2, zzan.REMOTE_DEFAULT);
        return zzifVar.zzu(str, zzjwVar2) ? 0 : 1;
    }

    private final zzr zzaD(String str) {
        zzh zzl = zzj().zzl(str);
        if (zzl == null || TextUtils.isEmpty(zzl.zzF())) {
            zzaW().zzd().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean zzaF = zzaF(zzl);
        if (zzaF == null || zzaF.booleanValue()) {
            return new zzr(str, zzl.zzH(), zzl.zzF(), zzl.zze(), zzl.zzE(), zzl.zzq(), zzl.zzn(), (String) null, zzl.zzaJ(), false, zzl.zzG(), 0L, 0, zzl.zzaI(), false, zzl.zzA(), zzl.zzx(), zzl.zzo(), zzl.zzN(), (String) null, zzu(str).zzq(), "", (String) null, zzl.zzaL(), zzl.zzw(), zzu(str).zzb(), zzm(str).zzj(), zzl.zza(), zzl.zzf(), zzl.zzM(), zzl.zzK(), 0L, zzl.zzb());
        }
        zzaW().zze().zzb("App version does not match; dropping. appId", zzhe.zzn(str));
        return null;
    }

    private final zzaz zzaE() {
        if (this.zzI == null) {
            this.zzI = new zzpn(this, this.zzn);
        }
        return this.zzI;
    }

    private final Boolean zzaF(zzh zzhVar) {
        try {
            if (zzhVar.zze() != -2147483648L) {
                if (zzhVar.zze() == Wrappers.packageManager(this.zzn.zzaT()).getPackageInfo(zzhVar.zzC(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaT()).getPackageInfo(zzhVar.zzC(), 0).versionName;
                String zzF = zzhVar.zzF();
                if (zzF != null && zzF.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String zzaG(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void zzaH() {
        zzaX().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaW().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaW().zzj().zza("Stopping uploading service(s)");
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

    private final void zzaI(com.google.android.gms.internal.measurement.zzhw zzhwVar, long j4, boolean z4) {
        Object obj;
        String str = true != z4 ? "_lte" : "_se";
        zzqd zzy = zzj().zzy(zzhwVar.zzaF(), str);
        zzqd zzqdVar = (zzy == null || (obj = zzy.zze) == null) ? new zzqd(zzhwVar.zzaF(), "auto", str, zzaU().currentTimeMillis(), Long.valueOf(j4)) : new zzqd(zzhwVar.zzaF(), "auto", str, zzaU().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j4));
        com.google.android.gms.internal.measurement.zzin zze = com.google.android.gms.internal.measurement.zzio.zze();
        zze.zzf(str);
        zze.zzg(zzaU().currentTimeMillis());
        Object obj2 = zzqdVar.zze;
        zze.zze(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.zzio zzioVar = (com.google.android.gms.internal.measurement.zzio) zze.zzba();
        int zza = zzqa.zza(zzhwVar, str);
        if (zza >= 0) {
            zzhwVar.zzaC(zza, zzioVar);
        } else {
            zzhwVar.zzp(zzioVar);
        }
        if (j4 > 0) {
            zzj().zzai(zzqdVar);
            zzaW().zzj().zzc("Updated engagement user property. scope, value", true != z4 ? "lifetime" : "session-scoped", obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaJ() {
        zzaX().zzg();
        if (this.zzr.isEmpty() || zzaE().zze()) {
            return;
        }
        long max = Math.max(0L, ((Integer) zzgi.zzaA.zza(null)).intValue() - (zzaU().elapsedRealtime() - this.zzJ));
        zzaW().zzj().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
        zzaE().zzd(max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaK(Context context, Intent intent) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
            return;
        }
        makeBasic = BroadcastOptions.makeBasic();
        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
        bundle = shareIdentityEnabled.toBundle();
        context.sendBroadcast(intent, null, bundle);
    }

    private final void zzaL() {
        long max;
        long j4;
        zzaX().zzg();
        zzM();
        if (this.zza > 0) {
            long abs = 3600000 - Math.abs(zzaU().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzaW().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzq().zzc();
                zzx().zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzaN()) {
            zzaW().zzj().zza("Nothing to upload or uploading impossible");
            zzq().zzc();
            zzx().zza();
            return;
        }
        long currentTimeMillis = zzaU().currentTimeMillis();
        zzi();
        long max2 = Math.max(0L, ((Long) zzgi.zzN.zza(null)).longValue());
        boolean z4 = true;
        if (!zzj().zzac() && !zzj().zzab()) {
            z4 = false;
        }
        if (z4) {
            String zzo = zzi().zzo();
            if (TextUtils.isEmpty(zzo) || ".none.".equals(zzo)) {
                zzi();
                max = Math.max(0L, ((Long) zzgi.zzH.zza(null)).longValue());
            } else {
                zzi();
                max = Math.max(0L, ((Long) zzgi.zzI.zza(null)).longValue());
            }
        } else {
            zzi();
            max = Math.max(0L, ((Long) zzgi.zzG.zza(null)).longValue());
        }
        long zza = this.zzk.zzd.zza();
        long zza2 = this.zzk.zze.zza();
        long j5 = 0;
        boolean z5 = z4;
        long max3 = Math.max(zzj().zzf(), zzj().zzh());
        if (max3 == 0) {
            j4 = 0;
        } else {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            j4 = max2 + abs2;
            long max4 = Math.max(abs3, abs4);
            if (z5 && max4 > 0) {
                j4 = Math.min(abs2, max4) + max;
            }
            if (!zzA().zzz(max4, max)) {
                j4 = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i4 = 0;
                while (true) {
                    zzi();
                    if (i4 >= Math.min(20, Math.max(0, ((Integer) zzgi.zzP.zza(null)).intValue()))) {
                        j4 = 0;
                        break;
                    }
                    zzi();
                    j4 += Math.max(j5, ((Long) zzgi.zzO.zza(null)).longValue()) * (1 << i4);
                    if (j4 > abs4) {
                        break;
                    }
                    i4++;
                    j5 = 0;
                }
            }
            j5 = 0;
        }
        if (j4 == j5) {
            zzaW().zzj().zza("Next upload time is 0");
            zzq().zzc();
            zzx().zza();
            return;
        }
        if (!zzp().zzd()) {
            zzaW().zzj().zza("No network");
            zzq().zzb();
            zzx().zza();
            return;
        }
        long zza3 = this.zzk.zzc.zza();
        zzi();
        long max5 = Math.max(0L, ((Long) zzgi.zzE.zza(null)).longValue());
        if (!zzA().zzz(zza3, max5)) {
            j4 = Math.max(j4, zza3 + max5);
        }
        zzq().zzc();
        long currentTimeMillis2 = j4 - zzaU().currentTimeMillis();
        if (currentTimeMillis2 <= 0) {
            zzi();
            currentTimeMillis2 = Math.max(0L, ((Long) zzgi.zzJ.zza(null)).longValue());
            this.zzk.zzd.zzb(zzaU().currentTimeMillis());
        }
        zzaW().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
        zzx().zzd(currentTimeMillis2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:332:0x0d74, code lost:
    
        if (r7 > (com.google.android.gms.measurement.internal.zzam.zzI() + r5)) goto L437;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039b A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03cf A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e7 A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0400 A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c7 A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0565 A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050e A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0d66 A[Catch: all -> 0x0cfa, TryCatch #3 {all -> 0x0cfa, blocks: (B:323:0x0cd6, B:325:0x0ceb, B:328:0x0cf2, B:329:0x0d26, B:331:0x0d66, B:333:0x0d97, B:335:0x0d9b, B:336:0x0da5, B:338:0x0de8, B:340:0x0df5, B:342:0x0e06, B:344:0x0e50, B:346:0x0e61, B:347:0x0e7f, B:353:0x0e6c, B:355:0x0e1d, B:358:0x0e36, B:359:0x0d76, B:360:0x0cfd, B:362:0x0d09, B:363:0x0d0f, B:518:0x0e89), top: B:4:0x002d, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0de8 A[Catch: all -> 0x0cfa, TRY_LEAVE, TryCatch #3 {all -> 0x0cfa, blocks: (B:323:0x0cd6, B:325:0x0ceb, B:328:0x0cf2, B:329:0x0d26, B:331:0x0d66, B:333:0x0d97, B:335:0x0d9b, B:336:0x0da5, B:338:0x0de8, B:340:0x0df5, B:342:0x0e06, B:344:0x0e50, B:346:0x0e61, B:347:0x0e7f, B:353:0x0e6c, B:355:0x0e1d, B:358:0x0e36, B:359:0x0d76, B:360:0x0cfd, B:362:0x0d09, B:363:0x0d0f, B:518:0x0e89), top: B:4:0x002d, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e06 A[Catch: all -> 0x0cfa, SQLiteException -> 0x0e1c, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0e1c, blocks: (B:340:0x0df5, B:342:0x0e06), top: B:339:0x0df5, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a1e A[Catch: all -> 0x0a4f, TryCatch #6 {all -> 0x0a4f, blocks: (B:390:0x0914, B:391:0x0927, B:393:0x092d, B:419:0x0bf3, B:424:0x09cc, B:427:0x09fc, B:429:0x0a1e, B:430:0x0a26, B:432:0x0a2c, B:436:0x0a3e, B:439:0x0a59, B:441:0x0a6d, B:443:0x0a97, B:445:0x0aa3, B:447:0x0ab7, B:448:0x0af8, B:453:0x0b12, B:455:0x0b1d, B:457:0x0b21, B:459:0x0b25, B:461:0x0b29, B:462:0x0b35, B:463:0x0b3a, B:465:0x0b40, B:467:0x0b57, B:468:0x0b5c, B:469:0x0bee, B:471:0x0b76, B:473:0x0b7b, B:476:0x0b9e, B:478:0x0bc2, B:479:0x0bc9, B:483:0x0be1, B:484:0x0b86, B:496:0x0c02, B:498:0x0c12, B:499:0x0c18, B:500:0x0c20, B:502:0x0c26, B:317:0x0c41, B:319:0x0c51, B:320:0x0cce, B:370:0x0c69, B:372:0x0c6f, B:374:0x0c77, B:375:0x0c7e, B:380:0x0c8c, B:381:0x0c93, B:383:0x0cbf, B:384:0x0cc6, B:385:0x0cc3, B:386:0x0c90, B:388:0x0c7b), top: B:389:0x0914 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a6d A[Catch: all -> 0x0a4f, TryCatch #6 {all -> 0x0a4f, blocks: (B:390:0x0914, B:391:0x0927, B:393:0x092d, B:419:0x0bf3, B:424:0x09cc, B:427:0x09fc, B:429:0x0a1e, B:430:0x0a26, B:432:0x0a2c, B:436:0x0a3e, B:439:0x0a59, B:441:0x0a6d, B:443:0x0a97, B:445:0x0aa3, B:447:0x0ab7, B:448:0x0af8, B:453:0x0b12, B:455:0x0b1d, B:457:0x0b21, B:459:0x0b25, B:461:0x0b29, B:462:0x0b35, B:463:0x0b3a, B:465:0x0b40, B:467:0x0b57, B:468:0x0b5c, B:469:0x0bee, B:471:0x0b76, B:473:0x0b7b, B:476:0x0b9e, B:478:0x0bc2, B:479:0x0bc9, B:483:0x0be1, B:484:0x0b86, B:496:0x0c02, B:498:0x0c12, B:499:0x0c18, B:500:0x0c20, B:502:0x0c26, B:317:0x0c41, B:319:0x0c51, B:320:0x0cce, B:370:0x0c69, B:372:0x0c6f, B:374:0x0c77, B:375:0x0c7e, B:380:0x0c8c, B:381:0x0c93, B:383:0x0cbf, B:384:0x0cc6, B:385:0x0cc3, B:386:0x0c90, B:388:0x0c7b), top: B:389:0x0914 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0a97 A[Catch: all -> 0x0a4f, TryCatch #6 {all -> 0x0a4f, blocks: (B:390:0x0914, B:391:0x0927, B:393:0x092d, B:419:0x0bf3, B:424:0x09cc, B:427:0x09fc, B:429:0x0a1e, B:430:0x0a26, B:432:0x0a2c, B:436:0x0a3e, B:439:0x0a59, B:441:0x0a6d, B:443:0x0a97, B:445:0x0aa3, B:447:0x0ab7, B:448:0x0af8, B:453:0x0b12, B:455:0x0b1d, B:457:0x0b21, B:459:0x0b25, B:461:0x0b29, B:462:0x0b35, B:463:0x0b3a, B:465:0x0b40, B:467:0x0b57, B:468:0x0b5c, B:469:0x0bee, B:471:0x0b76, B:473:0x0b7b, B:476:0x0b9e, B:478:0x0bc2, B:479:0x0bc9, B:483:0x0be1, B:484:0x0b86, B:496:0x0c02, B:498:0x0c12, B:499:0x0c18, B:500:0x0c20, B:502:0x0c26, B:317:0x0c41, B:319:0x0c51, B:320:0x0cce, B:370:0x0c69, B:372:0x0c6f, B:374:0x0c77, B:375:0x0c7e, B:380:0x0c8c, B:381:0x0c93, B:383:0x0cbf, B:384:0x0cc6, B:385:0x0cc3, B:386:0x0c90, B:388:0x0c7b), top: B:389:0x0914 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183 A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd A[Catch: all -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0236 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029a A[EDGE_INSN: B:89:0x029a->B:90:0x029a BREAK  A[LOOP:2: B:75:0x022c->B:83:0x0295], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ce A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0331 A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:3:0x0012, B:6:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:25:0x069f, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:36:0x013d, B:38:0x014a, B:40:0x0156, B:42:0x015c, B:45:0x0167, B:46:0x0175, B:48:0x0183, B:51:0x01a3, B:53:0x01a9, B:55:0x01b9, B:57:0x01c7, B:59:0x01d7, B:61:0x01e4, B:66:0x01e7, B:69:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:83:0x0295, B:84:0x0263, B:86:0x0273, B:93:0x02a2, B:95:0x02ce, B:96:0x02f8, B:98:0x0331, B:99:0x0337, B:102:0x0343, B:104:0x037a, B:105:0x0395, B:107:0x039b, B:109:0x03ab, B:111:0x03c1, B:112:0x03b5, B:120:0x03c8, B:123:0x03cf, B:124:0x03e7, B:126:0x0400, B:127:0x040c, B:130:0x0418, B:134:0x043b, B:135:0x042a, B:143:0x04bb, B:145:0x04c7, B:148:0x04d8, B:150:0x04e9, B:152:0x04f5, B:154:0x055f, B:156:0x0565, B:157:0x0571, B:159:0x0577, B:161:0x0585, B:163:0x058f, B:164:0x05a2, B:166:0x05a8, B:167:0x05c3, B:169:0x05c9, B:171:0x05e7, B:173:0x05f6, B:175:0x0625, B:176:0x0600, B:178:0x0612, B:182:0x062f, B:183:0x0649, B:185:0x064f, B:188:0x0662, B:193:0x066f, B:195:0x0676, B:197:0x0688, B:204:0x050e, B:206:0x051c, B:209:0x052d, B:211:0x053e, B:213:0x054a, B:215:0x0444, B:217:0x0450, B:219:0x045c, B:222:0x04a0, B:223:0x0478, B:226:0x048a, B:228:0x0490, B:230:0x049a, B:242:0x06b8, B:244:0x06c6, B:246:0x06cf, B:248:0x06fd, B:249:0x06d5, B:251:0x06de, B:253:0x06e4, B:255:0x06f0, B:257:0x06f8, B:264:0x0700, B:265:0x070c, B:268:0x0714, B:271:0x0726, B:272:0x0731, B:274:0x0739, B:275:0x075f, B:277:0x0779, B:278:0x078e, B:280:0x07a8, B:281:0x07bd, B:282:0x07cb, B:284:0x07d1, B:286:0x07e1, B:287:0x07e8, B:289:0x07f4, B:291:0x07fb, B:294:0x0800, B:296:0x0842, B:298:0x0848, B:299:0x086f, B:301:0x0877, B:302:0x0880, B:304:0x0886, B:305:0x088c, B:307:0x08a1, B:309:0x08b1, B:311:0x08c1, B:313:0x08c9, B:314:0x08cc, B:396:0x0946, B:398:0x095f, B:400:0x0975, B:402:0x097a, B:404:0x097e, B:406:0x0982, B:408:0x098c, B:409:0x0992, B:411:0x0996, B:413:0x099c, B:414:0x09ad, B:415:0x09b9, B:491:0x09e2, B:494:0x09e8, B:505:0x0856, B:507:0x085c, B:509:0x0862, B:510:0x07ba, B:511:0x078b, B:512:0x073f, B:514:0x0745), top: B:2:0x0012, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzaM(String str, long j4) {
        zzpv zzpvVar;
        zzpr zzprVar;
        List list;
        boolean z4;
        long j5;
        boolean z5;
        long parseLong;
        long j6;
        String str2;
        int i4;
        long j7;
        zzpr zzprVar2;
        SecureRandom secureRandom;
        int i5;
        long zzt;
        String str3;
        int i6;
        String str4;
        zzaw zzj;
        com.google.android.gms.internal.measurement.zzhx zzhxVar;
        long currentTimeMillis;
        long zzo;
        ContentValues contentValues;
        String str5;
        int i7;
        boolean zzw;
        boolean z6;
        String str6;
        String str7;
        zzpr zzprVar3;
        int i8;
        com.google.android.gms.internal.measurement.zzhl zzhlVar;
        int i9;
        int i10;
        int i11;
        int i12;
        zzpr zzprVar4;
        int i13;
        int i14;
        int i15;
        int i16;
        zzpr zzprVar5;
        int i17;
        boolean z7;
        boolean z8;
        int i18;
        com.google.android.gms.internal.measurement.zzhp zzhpVar;
        boolean z9;
        boolean z10;
        String str8;
        zzpv zzpvVar2 = this;
        String str9 = "_efs";
        String str10 = "_ai";
        String str11 = FirebaseAnalytics.Event.PURCHASE;
        zzpvVar2.zzj().zzH();
        try {
            zzpr zzprVar6 = new zzpr(zzpvVar2, null);
            zzpvVar2.zzj().zzat(str, j4, zzpvVar2.zzB, zzprVar6);
            zzprVar = zzprVar6;
            list = zzprVar.zzc;
        } catch (Throwable th) {
            th = th;
            zzpvVar = zzpvVar2;
            zzpvVar.zzj().zzL();
            throw th;
        }
        try {
            if (list == null || list.isEmpty()) {
                zzpvVar = zzpvVar2;
                zzpvVar.zzj().zzS();
                z4 = false;
            } else {
                com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzprVar.zza.zzch();
                zzhwVar.zzu();
                int i19 = -1;
                int i20 = -1;
                com.google.android.gms.internal.measurement.zzhl zzhlVar2 = null;
                com.google.android.gms.internal.measurement.zzhl zzhlVar3 = null;
                int i21 = 0;
                int i22 = 0;
                boolean z11 = false;
                int i23 = 0;
                while (true) {
                    com.google.android.gms.internal.measurement.zzhl zzhlVar4 = zzhlVar2;
                    int i24 = i19;
                    int i25 = i20;
                    if (i21 >= zzprVar.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzhl zzhlVar5 = (com.google.android.gms.internal.measurement.zzhl) ((com.google.android.gms.internal.measurement.zzhm) zzprVar.zzc.get(i21)).zzch();
                    com.google.android.gms.internal.measurement.zzhl zzhlVar6 = zzhlVar3;
                    if (zzpvVar2.zzr().zzx(zzprVar.zza.zzF(), zzhlVar5.zzo())) {
                        zzpvVar2.zzaW().zzk().zzc("Dropping blocked raw event. appId", zzhe.zzn(zzprVar.zza.zzF()), zzpvVar2.zzn.zzj().zzd(zzhlVar5.zzo()));
                        if (!zzpvVar2.zzr().zzt(zzprVar.zza.zzF()) && !zzpvVar2.zzr().zzy(zzprVar.zza.zzF()) && !"_err".equals(zzhlVar5.zzo())) {
                            zzpvVar2.zzB().zzR(zzpvVar2.zzK, zzprVar.zza.zzF(), 11, "_ev", zzhlVar5.zzo(), 0);
                        }
                        zzhlVar2 = zzhlVar4;
                        i19 = i24;
                        str5 = str9;
                        str7 = str10;
                        str6 = str11;
                        zzprVar4 = zzprVar;
                        i13 = i21;
                        i20 = i25;
                    } else {
                        com.google.android.gms.internal.measurement.zzoy.zzb();
                        str5 = str9;
                        if (zzpvVar2.zzi().zzx(null, zzgi.zzbf)) {
                            String zzo2 = zzhlVar5.zzo();
                            if (!zzo2.equals(str11)) {
                                if (!zzo2.equals("_iap")) {
                                    if (zzo2.equals("ecommerce_purchase")) {
                                    }
                                }
                            }
                            com.google.android.gms.internal.measurement.zzhp zze = com.google.android.gms.internal.measurement.zzhq.zze();
                            i7 = i21;
                            zze.zzj("_cbs");
                            if (!z11) {
                                String zzF = zzprVar.zza.zzF();
                                if (zzpvVar2.zzaO(zzF, str11) && zzpvVar2.zzaO(zzF, "_iap") && zzpvVar2.zzaO(zzF, "ecommerce_purchase")) {
                                    str8 = "new_buyer";
                                    zze.zzk(str8);
                                    zzhlVar5.zzf((com.google.android.gms.internal.measurement.zzhq) zze.zzba());
                                    z11 = true;
                                    if (zzhlVar5.zzo().equals(zzjy.zza(str10))) {
                                        zzhlVar5.zzi(str10);
                                        zzpvVar2.zzaW().zzj().zza("Renaming ad_impression to _ai");
                                        if (Log.isLoggable(zzpvVar2.zzaW().zzr(), 5)) {
                                            for (int i26 = 0; i26 < zzhlVar5.zza(); i26++) {
                                                if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzhlVar5.zzn(i26).zzg()) && !zzhlVar5.zzn(i26).zzh().isEmpty() && "admob".equalsIgnoreCase(zzhlVar5.zzn(i26).zzh())) {
                                                    zzpvVar2.zzaW().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                                }
                                            }
                                        }
                                    }
                                    zzw = zzpvVar2.zzr().zzw(zzprVar.zza.zzF(), zzhlVar5.zzo());
                                    if (zzw) {
                                        z6 = zzw;
                                    } else {
                                        zzpvVar2.zzA();
                                        String zzo3 = zzhlVar5.zzo();
                                        Preconditions.checkNotEmpty(zzo3);
                                        z6 = zzw;
                                        if (zzo3.hashCode() != 95027 || !zzo3.equals("_ui")) {
                                            str7 = str10;
                                            str6 = str11;
                                            z6 = false;
                                            if (z6) {
                                                zzprVar3 = zzprVar;
                                            } else {
                                                ArrayList arrayList = new ArrayList(zzhlVar5.zzp());
                                                int i27 = -1;
                                                int i28 = -1;
                                                int i29 = 0;
                                                while (true) {
                                                    zzprVar3 = zzprVar;
                                                    if (i29 >= arrayList.size()) {
                                                        break;
                                                    }
                                                    if ("value".equals(((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i29)).zzg())) {
                                                        i27 = i29;
                                                    } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i29)).zzg())) {
                                                        i28 = i29;
                                                    }
                                                    i29++;
                                                    zzprVar = zzprVar3;
                                                }
                                                if (i27 != -1) {
                                                    if (((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i27)).zzw() || ((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i27)).zzu()) {
                                                        if (i28 != -1) {
                                                            String zzh = ((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i28)).zzh();
                                                            if (zzh.length() == 3) {
                                                                int i30 = 0;
                                                                while (i30 < zzh.length()) {
                                                                    int codePointAt = zzh.codePointAt(i30);
                                                                    if (Character.isLetter(codePointAt)) {
                                                                        i30 += Character.charCount(codePointAt);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        zzpvVar2.zzaW().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                        zzhlVar5.zzh(i27);
                                                        zzaB(zzhlVar5, "_c");
                                                        zzaA(zzhlVar5, 19, "currency");
                                                        break;
                                                    }
                                                    zzpvVar2.zzaW().zzl().zza("Value must be specified with a numeric type.");
                                                    zzhlVar5.zzh(i27);
                                                    zzaB(zzhlVar5, "_c");
                                                    zzaA(zzhlVar5, 18, "value");
                                                }
                                            }
                                            if ("_e".equals(zzhlVar5.zzo())) {
                                                i8 = i25;
                                                if ("_vs".equals(zzhlVar5.zzo())) {
                                                    zzpvVar2.zzA();
                                                    if (zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar5.zzba(), "_et") == null) {
                                                        if (zzhlVar4 != null && Math.abs(zzhlVar4.zzc() - zzhlVar5.zzc()) <= 1000) {
                                                            com.google.android.gms.internal.measurement.zzhl zzhlVar7 = (com.google.android.gms.internal.measurement.zzhl) zzhlVar4.clone();
                                                            if (zzpvVar2.zzaP(zzhlVar7, zzhlVar5)) {
                                                                zzhwVar.zzad(i24, zzhlVar7);
                                                                i9 = i24;
                                                                i10 = i8;
                                                                zzhlVar = null;
                                                                zzhlVar6 = null;
                                                                if (zzhlVar5.zza() == 0) {
                                                                }
                                                                i13 = i7;
                                                                zzprVar4.zzc.set(i13, (com.google.android.gms.internal.measurement.zzhm) zzhlVar5.zzba());
                                                                zzhwVar.zzn(zzhlVar5);
                                                                i22++;
                                                                i19 = i11;
                                                                i20 = i12;
                                                                zzhlVar2 = zzhlVar;
                                                            }
                                                        }
                                                        zzhlVar = zzhlVar4;
                                                        i9 = i24;
                                                        zzhlVar6 = zzhlVar5;
                                                        i10 = i22;
                                                        if (zzhlVar5.zza() == 0) {
                                                        }
                                                        i13 = i7;
                                                        zzprVar4.zzc.set(i13, (com.google.android.gms.internal.measurement.zzhm) zzhlVar5.zzba());
                                                        zzhwVar.zzn(zzhlVar5);
                                                        i22++;
                                                        i19 = i11;
                                                        i20 = i12;
                                                        zzhlVar2 = zzhlVar;
                                                    }
                                                }
                                                zzhlVar = zzhlVar4;
                                                i9 = i24;
                                                i10 = i8;
                                                if (zzhlVar5.zza() == 0) {
                                                }
                                                i13 = i7;
                                                zzprVar4.zzc.set(i13, (com.google.android.gms.internal.measurement.zzhm) zzhlVar5.zzba());
                                                zzhwVar.zzn(zzhlVar5);
                                                i22++;
                                                i19 = i11;
                                                i20 = i12;
                                                zzhlVar2 = zzhlVar;
                                            } else {
                                                zzpvVar2.zzA();
                                                if (zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar5.zzba(), "_fr") == null) {
                                                    if (zzhlVar6 != null && Math.abs(zzhlVar6.zzc() - zzhlVar5.zzc()) <= 1000) {
                                                        com.google.android.gms.internal.measurement.zzhl zzhlVar8 = (com.google.android.gms.internal.measurement.zzhl) zzhlVar6.clone();
                                                        if (zzpvVar2.zzaP(zzhlVar5, zzhlVar8)) {
                                                            i8 = i25;
                                                            zzhwVar.zzad(i8, zzhlVar8);
                                                            i9 = i24;
                                                            i10 = i8;
                                                            zzhlVar = null;
                                                            zzhlVar6 = null;
                                                            if (zzhlVar5.zza() == 0) {
                                                                zzpvVar2.zzA();
                                                                Bundle zzF2 = zzqa.zzF(zzhlVar5.zzp());
                                                                int i31 = 0;
                                                                while (i31 < zzhlVar5.zza()) {
                                                                    com.google.android.gms.internal.measurement.zzhq zzn = zzhlVar5.zzn(i31);
                                                                    if (!zzn.zzg().equals(FirebaseAnalytics.Param.ITEMS) || zzn.zzi().isEmpty()) {
                                                                        i14 = i9;
                                                                        i15 = i10;
                                                                        i16 = i31;
                                                                        zzprVar5 = zzprVar3;
                                                                        if (!zzn.zzg().equals(FirebaseAnalytics.Param.ITEMS)) {
                                                                            zzpvVar2.zzaw(zzhlVar5.zzo(), (com.google.android.gms.internal.measurement.zzhp) zzn.zzch(), zzF2, zzprVar5.zza.zzF());
                                                                        }
                                                                    } else {
                                                                        zzprVar5 = zzprVar3;
                                                                        String zzF3 = zzprVar5.zza.zzF();
                                                                        List zzi = zzn.zzi();
                                                                        Bundle[] bundleArr = new Bundle[zzi.size()];
                                                                        int i32 = 0;
                                                                        while (i32 < zzi.size()) {
                                                                            com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) zzi.get(i32);
                                                                            zzpvVar2.zzA();
                                                                            int i33 = i9;
                                                                            Bundle zzF4 = zzqa.zzF(zzhqVar.zzi());
                                                                            Iterator it = zzhqVar.zzi().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzpvVar2.zzaw(zzhlVar5.zzo(), (com.google.android.gms.internal.measurement.zzhp) ((com.google.android.gms.internal.measurement.zzhq) it.next()).zzch(), zzF4, zzF3);
                                                                                i10 = i10;
                                                                                i31 = i31;
                                                                            }
                                                                            bundleArr[i32] = zzF4;
                                                                            i32++;
                                                                            i9 = i33;
                                                                            i10 = i10;
                                                                            i31 = i31;
                                                                        }
                                                                        i14 = i9;
                                                                        i15 = i10;
                                                                        i16 = i31;
                                                                        zzF2.putParcelableArray(FirebaseAnalytics.Param.ITEMS, bundleArr);
                                                                    }
                                                                    i31 = i16 + 1;
                                                                    i9 = i14;
                                                                    i10 = i15;
                                                                    zzprVar3 = zzprVar5;
                                                                }
                                                                i11 = i9;
                                                                i12 = i10;
                                                                zzprVar4 = zzprVar3;
                                                                zzhlVar5.zzg();
                                                                zzqa zzA = zzpvVar2.zzA();
                                                                ArrayList arrayList2 = new ArrayList();
                                                                for (String str12 : zzF2.keySet()) {
                                                                    com.google.android.gms.internal.measurement.zzhp zze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                                                                    zze2.zzj(str12);
                                                                    Object obj = zzF2.get(str12);
                                                                    if (obj != null) {
                                                                        zzA.zzw(zze2, obj);
                                                                        arrayList2.add((com.google.android.gms.internal.measurement.zzhq) zze2.zzba());
                                                                    }
                                                                }
                                                                int size = arrayList2.size();
                                                                int i34 = 0;
                                                                while (i34 < size) {
                                                                    Object obj2 = arrayList2.get(i34);
                                                                    i34++;
                                                                    zzhlVar5.zzf((com.google.android.gms.internal.measurement.zzhq) obj2);
                                                                }
                                                            } else {
                                                                i11 = i9;
                                                                i12 = i10;
                                                                zzprVar4 = zzprVar3;
                                                            }
                                                            i13 = i7;
                                                            zzprVar4.zzc.set(i13, (com.google.android.gms.internal.measurement.zzhm) zzhlVar5.zzba());
                                                            zzhwVar.zzn(zzhlVar5);
                                                            i22++;
                                                            i19 = i11;
                                                            i20 = i12;
                                                            zzhlVar2 = zzhlVar;
                                                        }
                                                    }
                                                    zzhlVar = zzhlVar5;
                                                    i10 = i25;
                                                    i9 = i22;
                                                    if (zzhlVar5.zza() == 0) {
                                                    }
                                                    i13 = i7;
                                                    zzprVar4.zzc.set(i13, (com.google.android.gms.internal.measurement.zzhm) zzhlVar5.zzba());
                                                    zzhwVar.zzn(zzhlVar5);
                                                    i22++;
                                                    i19 = i11;
                                                    i20 = i12;
                                                    zzhlVar2 = zzhlVar;
                                                } else {
                                                    i8 = i25;
                                                    zzhlVar = zzhlVar4;
                                                    i9 = i24;
                                                    i10 = i8;
                                                    if (zzhlVar5.zza() == 0) {
                                                    }
                                                    i13 = i7;
                                                    zzprVar4.zzc.set(i13, (com.google.android.gms.internal.measurement.zzhm) zzhlVar5.zzba());
                                                    zzhwVar.zzn(zzhlVar5);
                                                    i22++;
                                                    i19 = i11;
                                                    i20 = i12;
                                                    zzhlVar2 = zzhlVar;
                                                }
                                            }
                                        }
                                    }
                                    str7 = str10;
                                    i17 = 0;
                                    z7 = false;
                                    boolean z12 = false;
                                    while (true) {
                                        str6 = str11;
                                        if (i17 >= zzhlVar5.zza()) {
                                            break;
                                        }
                                        if ("_c".equals(zzhlVar5.zzn(i17).zzg())) {
                                            com.google.android.gms.internal.measurement.zzhp zzhpVar2 = (com.google.android.gms.internal.measurement.zzhp) zzhlVar5.zzn(i17).zzch();
                                            z10 = z12;
                                            zzhpVar2.zzi(1L);
                                            zzhlVar5.zzk(i17, (com.google.android.gms.internal.measurement.zzhq) zzhpVar2.zzba());
                                            z7 = true;
                                        } else {
                                            z10 = z12;
                                            if ("_r".equals(zzhlVar5.zzn(i17).zzg())) {
                                                com.google.android.gms.internal.measurement.zzhp zzhpVar3 = (com.google.android.gms.internal.measurement.zzhp) zzhlVar5.zzn(i17).zzch();
                                                zzhpVar3.zzi(1L);
                                                zzhlVar5.zzk(i17, (com.google.android.gms.internal.measurement.zzhq) zzhpVar3.zzba());
                                                z12 = true;
                                                z7 = z7;
                                                i17++;
                                                str11 = str6;
                                            }
                                        }
                                        z12 = z10;
                                        i17++;
                                        str11 = str6;
                                    }
                                    z8 = z12;
                                    if (!z7 && z6) {
                                        zzpvVar2.zzaW().zzj().zzb("Marking event as conversion", zzpvVar2.zzn.zzj().zzd(zzhlVar5.zzo()));
                                        com.google.android.gms.internal.measurement.zzhp zze3 = com.google.android.gms.internal.measurement.zzhq.zze();
                                        zze3.zzj("_c");
                                        zze3.zzi(1L);
                                        zzhlVar5.zze(zze3);
                                    }
                                    if (!z8) {
                                        zzpvVar2.zzaW().zzj().zzb("Marking event as real-time", zzpvVar2.zzn.zzj().zzd(zzhlVar5.zzo()));
                                        com.google.android.gms.internal.measurement.zzhp zze4 = com.google.android.gms.internal.measurement.zzhq.zze();
                                        zze4.zzj("_r");
                                        zze4.zzi(1L);
                                        zzhlVar5.zze(zze4);
                                    }
                                    if (zzpvVar2.zzj().zzo(zzpvVar2.zza(), zzprVar.zza.zzF(), false, false, false, false, true, false, false).zze > zzpvVar2.zzi().zzh(zzprVar.zza.zzF(), zzgi.zzo)) {
                                        zzaB(zzhlVar5, "_r");
                                    } else {
                                        i23 = 1;
                                    }
                                    if (zzqf.zzaq(zzhlVar5.zzo()) && z6 && zzpvVar2.zzj().zzo(zzpvVar2.zza(), zzprVar.zza.zzF(), false, false, true, false, false, false, false).zzc > zzpvVar2.zzi().zzh(zzprVar.zza.zzF(), zzgi.zzn)) {
                                        zzpvVar2.zzaW().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzhe.zzn(zzprVar.zza.zzF()));
                                        int i35 = -1;
                                        i18 = 0;
                                        zzhpVar = null;
                                        z9 = false;
                                        while (i18 < zzhlVar5.zza()) {
                                            com.google.android.gms.internal.measurement.zzhq zzn2 = zzhlVar5.zzn(i18);
                                            int i36 = i18;
                                            if ("_c".equals(zzn2.zzg())) {
                                                zzhpVar = (com.google.android.gms.internal.measurement.zzhp) zzn2.zzch();
                                                i35 = i36;
                                            } else if ("_err".equals(zzn2.zzg())) {
                                                z9 = true;
                                            }
                                            i18 = i36 + 1;
                                        }
                                        if (z9) {
                                            if (zzhpVar != null) {
                                                zzhlVar5.zzh(i35);
                                            } else {
                                                zzhpVar = null;
                                            }
                                        }
                                        if (zzhpVar == null) {
                                            com.google.android.gms.internal.measurement.zzhp zzhpVar4 = (com.google.android.gms.internal.measurement.zzhp) zzhpVar.clone();
                                            zzhpVar4.zzj("_err");
                                            zzhpVar4.zzi(10L);
                                            zzhlVar5.zzk(i35, (com.google.android.gms.internal.measurement.zzhq) zzhpVar4.zzba());
                                        } else {
                                            zzpvVar2.zzaW().zze().zzb("Did not find conversion parameter. appId", zzhe.zzn(zzprVar.zza.zzF()));
                                        }
                                    }
                                    if (z6) {
                                    }
                                    if ("_e".equals(zzhlVar5.zzo())) {
                                    }
                                }
                            }
                            str8 = "returning_buyer";
                            zze.zzk(str8);
                            zzhlVar5.zzf((com.google.android.gms.internal.measurement.zzhq) zze.zzba());
                            z11 = true;
                            if (zzhlVar5.zzo().equals(zzjy.zza(str10))) {
                            }
                            zzw = zzpvVar2.zzr().zzw(zzprVar.zza.zzF(), zzhlVar5.zzo());
                            if (zzw) {
                            }
                            str7 = str10;
                            i17 = 0;
                            z7 = false;
                            boolean z122 = false;
                            while (true) {
                                str6 = str11;
                                if (i17 >= zzhlVar5.zza()) {
                                }
                                i17++;
                                str11 = str6;
                            }
                            z8 = z122;
                            if (!z7) {
                                zzpvVar2.zzaW().zzj().zzb("Marking event as conversion", zzpvVar2.zzn.zzj().zzd(zzhlVar5.zzo()));
                                com.google.android.gms.internal.measurement.zzhp zze32 = com.google.android.gms.internal.measurement.zzhq.zze();
                                zze32.zzj("_c");
                                zze32.zzi(1L);
                                zzhlVar5.zze(zze32);
                            }
                            if (!z8) {
                            }
                            if (zzpvVar2.zzj().zzo(zzpvVar2.zza(), zzprVar.zza.zzF(), false, false, false, false, true, false, false).zze > zzpvVar2.zzi().zzh(zzprVar.zza.zzF(), zzgi.zzo)) {
                            }
                            if (zzqf.zzaq(zzhlVar5.zzo())) {
                                zzpvVar2.zzaW().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzhe.zzn(zzprVar.zza.zzF()));
                                int i352 = -1;
                                i18 = 0;
                                zzhpVar = null;
                                z9 = false;
                                while (i18 < zzhlVar5.zza()) {
                                }
                                if (z9) {
                                }
                                if (zzhpVar == null) {
                                }
                            }
                            if (z6) {
                            }
                            if ("_e".equals(zzhlVar5.zzo())) {
                            }
                        }
                        i7 = i21;
                        if (zzhlVar5.zzo().equals(zzjy.zza(str10))) {
                        }
                        zzw = zzpvVar2.zzr().zzw(zzprVar.zza.zzF(), zzhlVar5.zzo());
                        if (zzw) {
                        }
                        str7 = str10;
                        i17 = 0;
                        z7 = false;
                        boolean z1222 = false;
                        while (true) {
                            str6 = str11;
                            if (i17 >= zzhlVar5.zza()) {
                            }
                            i17++;
                            str11 = str6;
                        }
                        z8 = z1222;
                        if (!z7) {
                        }
                        if (!z8) {
                        }
                        if (zzpvVar2.zzj().zzo(zzpvVar2.zza(), zzprVar.zza.zzF(), false, false, false, false, true, false, false).zze > zzpvVar2.zzi().zzh(zzprVar.zza.zzF(), zzgi.zzo)) {
                        }
                        if (zzqf.zzaq(zzhlVar5.zzo())) {
                        }
                        if (z6) {
                        }
                        if ("_e".equals(zzhlVar5.zzo())) {
                        }
                    }
                    i21 = i13 + 1;
                    zzprVar = zzprVar4;
                    zzhlVar3 = zzhlVar6;
                    str9 = str5;
                    str10 = str7;
                    str11 = str6;
                }
                String str13 = str9;
                zzpr zzprVar7 = zzprVar;
                long j8 = 0;
                long j9 = 0;
                int i37 = i22;
                int i38 = 0;
                while (i38 < i37) {
                    com.google.android.gms.internal.measurement.zzhm zzh2 = zzhwVar.zzh(i38);
                    if ("_e".equals(zzh2.zzh())) {
                        zzpvVar2.zzA();
                        if (zzqa.zzG(zzh2, "_fr") != null) {
                            zzhwVar.zzD(i38);
                            i37--;
                            i38--;
                            i38++;
                        }
                    }
                    zzpvVar2.zzA();
                    com.google.android.gms.internal.measurement.zzhq zzG = zzqa.zzG(zzh2, "_et");
                    if (zzG != null) {
                        Long valueOf = zzG.zzw() ? Long.valueOf(zzG.zzd()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j9 += valueOf.longValue();
                        }
                    }
                    i38++;
                }
                zzpvVar2.zzaI(zzhwVar, j9, false);
                Iterator it2 = zzhwVar.zzaM().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzhm) it2.next()).zzh())) {
                        zzpvVar2.zzj().zzP(zzhwVar.zzaF(), "_se");
                        break;
                    }
                }
                if (zzqa.zza(zzhwVar, "_sid") >= 0) {
                    zzpvVar2.zzaI(zzhwVar, j9, true);
                } else {
                    int zza = zzqa.zza(zzhwVar, "_se");
                    if (zza >= 0) {
                        zzhwVar.zzE(zza);
                        zzpvVar2.zzaW().zze().zzb("Session engagement user property is in the bundle without session ID. appId", zzhe.zzn(zzprVar7.zza.zzF()));
                    }
                }
                String zzF5 = zzprVar7.zza.zzF();
                zzpvVar2.zzaX().zzg();
                zzpvVar2.zzM();
                zzh zzl = zzpvVar2.zzj().zzl(zzF5);
                if (zzl == null) {
                    zzpvVar2.zzaW().zze().zzb("Cannot fix consent fields without appInfo. appId", zzhe.zzn(zzF5));
                } else {
                    zzpvVar2.zzQ(zzl, zzhwVar);
                }
                String zzF6 = zzprVar7.zza.zzF();
                zzpvVar2.zzaX().zzg();
                zzpvVar2.zzM();
                zzh zzl2 = zzpvVar2.zzj().zzl(zzF6);
                if (zzl2 == null) {
                    zzpvVar2.zzaW().zzk().zzb("Cannot populate ad_campaign_info without appInfo. appId", zzhe.zzn(zzF6));
                } else {
                    zzpvVar2.zzaa(zzl2, zzhwVar);
                }
                zzhwVar.zzax(Long.MAX_VALUE);
                zzhwVar.zzab(Long.MIN_VALUE);
                for (int i39 = 0; i39 < zzhwVar.zzc(); i39++) {
                    com.google.android.gms.internal.measurement.zzhm zzh3 = zzhwVar.zzh(i39);
                    if (zzh3.zzd() < zzhwVar.zzf()) {
                        zzhwVar.zzax(zzh3.zzd());
                    }
                    if (zzh3.zzd() > zzhwVar.zze()) {
                        zzhwVar.zzab(zzh3.zzd());
                    }
                }
                zzhwVar.zzB();
                zzjx zzjxVar = zzjx.zza;
                zzjx zzl3 = zzpvVar2.zzu(zzprVar7.zza.zzF()).zzl(zzjx.zzk(zzprVar7.zza.zzK(), 100));
                zzjx zzt2 = zzpvVar2.zzj().zzt(zzprVar7.zza.zzF());
                zzpvVar2.zzj().zzW(zzprVar7.zza.zzF(), zzl3);
                zzjw zzjwVar = zzjw.ANALYTICS_STORAGE;
                if (!zzl3.zzr(zzjwVar) && zzt2.zzr(zzjwVar)) {
                    zzpvVar2.zzj().zzI(zzprVar7.zza.zzF());
                } else if (zzl3.zzr(zzjwVar) && !zzt2.zzr(zzjwVar)) {
                    zzpvVar2.zzj().zzQ(zzprVar7.zza.zzF());
                }
                zzjw zzjwVar2 = zzjw.AD_STORAGE;
                if (!zzl3.zzr(zzjwVar2)) {
                    zzhwVar.zzz();
                    zzhwVar.zzw();
                    zzhwVar.zzt();
                }
                if (!zzl3.zzr(zzjwVar)) {
                    zzhwVar.zzq();
                    zzhwVar.zzA();
                }
                zzqr.zzb();
                if (zzpvVar2.zzi().zzx(zzprVar7.zza.zzF(), zzgi.zzaV) && zzpvVar2.zzB().zzab(zzprVar7.zza.zzF()) && zzpvVar2.zzu(zzprVar7.zza.zzF()).zzr(zzjwVar2) && zzprVar7.zza.zzbt()) {
                    zzpvVar2.zzR(zzhwVar, zzprVar7);
                }
                zzhwVar.zzr();
                zzhwVar.zzi(zzpvVar2.zzh().zza(zzhwVar.zzaF(), zzhwVar.zzaM(), zzhwVar.zzaN(), Long.valueOf(zzhwVar.zzf()), Long.valueOf(zzhwVar.zze()), !zzl3.zzr(zzjwVar)));
                if (zzpvVar2.zzi().zzB(zzprVar7.zza.zzF())) {
                    try {
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        SecureRandom zzJ = zzpvVar2.zzB().zzJ();
                        int i40 = 0;
                        while (i40 < zzhwVar.zzc()) {
                            com.google.android.gms.internal.measurement.zzhl zzhlVar9 = (com.google.android.gms.internal.measurement.zzhl) zzhwVar.zzh(i40).zzch();
                            if (zzhlVar9.zzo().equals("_ep")) {
                                zzpvVar2.zzA();
                                String str14 = (String) zzqa.zzH((com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba(), "_en");
                                zzbd zzbdVar = (zzbd) hashMap.get(str14);
                                if (zzbdVar == null && (zzbdVar = zzpvVar2.zzj().zzs(zzprVar7.zza.zzF(), (String) Preconditions.checkNotNull(str14))) != null) {
                                    hashMap.put(str14, zzbdVar);
                                }
                                if (zzbdVar == null || zzbdVar.zzi != null) {
                                    str4 = str13;
                                } else {
                                    Long l4 = zzbdVar.zzj;
                                    if (l4 != null && l4.longValue() > 1) {
                                        zzpvVar2.zzA();
                                        zzqa.zzD(zzhlVar9, "_sr", l4);
                                    }
                                    Boolean bool = zzbdVar.zzk;
                                    if (bool == null || !bool.booleanValue()) {
                                        str4 = str13;
                                    } else {
                                        zzpvVar2.zzA();
                                        str4 = str13;
                                        zzqa.zzD(zzhlVar9, str4, 1L);
                                    }
                                    arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba());
                                }
                                zzhwVar.zzad(i40, zzhlVar9);
                                j6 = j8;
                                secureRandom = zzJ;
                                i6 = i40;
                                str3 = str4;
                                zzprVar2 = zzprVar7;
                            } else {
                                String str15 = str13;
                                zzif zzr = zzpvVar2.zzr();
                                String zzF7 = zzprVar7.zza.zzF();
                                String zza2 = zzr.zza(zzF7, "measurement.account.time_zone_offset_minutes");
                                if (!TextUtils.isEmpty(zza2)) {
                                    try {
                                        parseLong = Long.parseLong(zza2);
                                    } catch (NumberFormatException e4) {
                                        zzr.zzu.zzaW().zzk().zzc("Unable to parse timezone offset. appId", zzhe.zzn(zzF7), e4);
                                    }
                                    j6 = j8;
                                    long zzt3 = zzpvVar2.zzB().zzt(zzhlVar9.zzc(), parseLong);
                                    com.google.android.gms.internal.measurement.zzhm zzhmVar = (com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba();
                                    Long l5 = 1L;
                                    if (!TextUtils.isEmpty("_dbg")) {
                                        for (com.google.android.gms.internal.measurement.zzhq zzhqVar2 : zzhmVar.zzi()) {
                                            str2 = str15;
                                            if (!"_dbg".equals(zzhqVar2.zzg())) {
                                                str15 = str2;
                                            } else if (l5.equals(Long.valueOf(zzhqVar2.zzd()))) {
                                                i4 = 1;
                                                if (i4 > 0) {
                                                }
                                                secureRandom = zzJ;
                                                i6 = i40;
                                                zzprVar2 = zzprVar7;
                                                str3 = str2;
                                            } else {
                                                i4 = zzr().zzc(zzprVar7.zza.zzF(), zzhlVar9.zzo());
                                                if (i4 > 0) {
                                                    zzaW().zzk().zzc("Sample rate must be positive. event, rate", zzhlVar9.zzo(), Integer.valueOf(i4));
                                                    arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba());
                                                    zzhwVar.zzad(i40, zzhlVar9);
                                                } else {
                                                    zzbd zzbdVar2 = (zzbd) hashMap.get(zzhlVar9.zzo());
                                                    if (zzbdVar2 == null && (zzbdVar2 = zzj().zzs(zzprVar7.zza.zzF(), zzhlVar9.zzo())) == null) {
                                                        j7 = parseLong;
                                                        zzaW().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzprVar7.zza.zzF(), zzhlVar9.zzo());
                                                        zzbdVar2 = new zzbd(zzprVar7.zza.zzF(), zzhlVar9.zzo(), 1L, 1L, 1L, zzhlVar9.zzc(), 0L, null, null, null, null);
                                                    } else {
                                                        j7 = parseLong;
                                                    }
                                                    zzA();
                                                    Long l6 = (Long) zzqa.zzH((com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba(), "_eid");
                                                    boolean z13 = l6 != null;
                                                    if (i4 == 1) {
                                                        arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba());
                                                        if (z13 && (zzbdVar2.zzi != null || zzbdVar2.zzj != null || zzbdVar2.zzk != null)) {
                                                            hashMap.put(zzhlVar9.zzo(), zzbdVar2.zza(null, null, null));
                                                        }
                                                        zzhwVar.zzad(i40, zzhlVar9);
                                                    } else {
                                                        if (zzJ.nextInt(i4) == 0) {
                                                            zzA();
                                                            boolean z14 = z13;
                                                            Long valueOf2 = Long.valueOf(i4);
                                                            zzqa.zzD(zzhlVar9, "_sr", valueOf2);
                                                            arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba());
                                                            if (z14) {
                                                                zzbdVar2 = zzbdVar2.zza(null, valueOf2, null);
                                                            }
                                                            hashMap.put(zzhlVar9.zzo(), zzbdVar2.zzb(zzhlVar9.zzc(), zzt3));
                                                            secureRandom = zzJ;
                                                            i6 = i40;
                                                            zzprVar2 = zzprVar7;
                                                            str3 = str2;
                                                        } else {
                                                            boolean z15 = z13;
                                                            Long l7 = zzbdVar2.zzh;
                                                            if (l7 != null) {
                                                                zzt = l7.longValue();
                                                                secureRandom = zzJ;
                                                                i5 = i40;
                                                                zzprVar2 = zzprVar7;
                                                            } else {
                                                                zzprVar2 = zzprVar7;
                                                                secureRandom = zzJ;
                                                                i5 = i40;
                                                                zzt = zzB().zzt(zzhlVar9.zzb(), j7);
                                                            }
                                                            if (zzt != zzt3) {
                                                                zzA();
                                                                str3 = str2;
                                                                zzqa.zzD(zzhlVar9, str3, 1L);
                                                                zzA();
                                                                Long valueOf3 = Long.valueOf(i4);
                                                                zzqa.zzD(zzhlVar9, "_sr", valueOf3);
                                                                arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba());
                                                                if (z15) {
                                                                    zzbdVar2 = zzbdVar2.zza(null, valueOf3, Boolean.TRUE);
                                                                }
                                                                hashMap.put(zzhlVar9.zzo(), zzbdVar2.zzb(zzhlVar9.zzc(), zzt3));
                                                            } else {
                                                                str3 = str2;
                                                                if (z15) {
                                                                    hashMap.put(zzhlVar9.zzo(), zzbdVar2.zza(l6, null, null));
                                                                }
                                                            }
                                                            i6 = i5;
                                                        }
                                                        zzhwVar.zzad(i6, zzhlVar9);
                                                    }
                                                }
                                                secureRandom = zzJ;
                                                i6 = i40;
                                                zzprVar2 = zzprVar7;
                                                str3 = str2;
                                            }
                                        }
                                    }
                                    str2 = str15;
                                    i4 = zzr().zzc(zzprVar7.zza.zzF(), zzhlVar9.zzo());
                                    if (i4 > 0) {
                                    }
                                    secureRandom = zzJ;
                                    i6 = i40;
                                    zzprVar2 = zzprVar7;
                                    str3 = str2;
                                }
                                parseLong = j8;
                                j6 = j8;
                                long zzt32 = zzpvVar2.zzB().zzt(zzhlVar9.zzc(), parseLong);
                                com.google.android.gms.internal.measurement.zzhm zzhmVar2 = (com.google.android.gms.internal.measurement.zzhm) zzhlVar9.zzba();
                                Long l52 = 1L;
                                if (!TextUtils.isEmpty("_dbg")) {
                                }
                                str2 = str15;
                                i4 = zzr().zzc(zzprVar7.zza.zzF(), zzhlVar9.zzo());
                                if (i4 > 0) {
                                }
                                secureRandom = zzJ;
                                i6 = i40;
                                zzprVar2 = zzprVar7;
                                str3 = str2;
                            }
                            int i41 = i6 + 1;
                            zzpvVar2 = this;
                            j8 = j6;
                            str13 = str3;
                            zzJ = secureRandom;
                            zzprVar7 = zzprVar2;
                            i40 = i41;
                        }
                        j5 = j8;
                        zzpr zzprVar8 = zzprVar7;
                        z5 = true;
                        if (arrayList3.size() < zzhwVar.zzc()) {
                            zzhwVar.zzu();
                            zzhwVar.zzj(arrayList3);
                        }
                        Iterator it3 = hashMap.entrySet().iterator();
                        while (it3.hasNext()) {
                            zzj().zzV((zzbd) ((Map.Entry) it3.next()).getValue());
                        }
                        zzprVar7 = zzprVar8;
                    } catch (Throwable th2) {
                        th = th2;
                        zzpvVar = this;
                        zzpvVar.zzj().zzL();
                        throw th;
                    }
                } else {
                    j5 = 0;
                    z5 = true;
                }
                String zzF8 = zzprVar7.zza.zzF();
                zzh zzl4 = zzj().zzl(zzF8);
                if (zzl4 == null) {
                    zzaW().zze().zzb("Bundling raw events w/o app info. appId", zzhe.zzn(zzprVar7.zza.zzF()));
                } else if (zzhwVar.zzc() > 0) {
                    long zzs = zzl4.zzs();
                    if (zzs != j5) {
                        zzhwVar.zzap(zzs);
                    } else {
                        zzhwVar.zzx();
                    }
                    long zzu = zzl4.zzu();
                    if (zzu != j5) {
                        zzs = zzu;
                    }
                    if (zzs != j5) {
                        zzhwVar.zzaq(zzs);
                    } else {
                        zzhwVar.zzy();
                    }
                    zzl4.zzQ(zzhwVar.zzc());
                    zzhwVar.zzV((int) zzl4.zzr());
                    zzhwVar.zzP((int) zzl4.zzt());
                    zzl4.zzau(zzhwVar.zzf());
                    zzl4.zzas(zzhwVar.zze());
                    String zzB = zzl4.zzB();
                    if (zzB != null) {
                        zzhwVar.zzaj(zzB);
                    } else {
                        zzhwVar.zzv();
                    }
                    zzj().zzT(zzl4, false, false);
                }
                if (zzhwVar.zzc() > 0) {
                    zzpvVar = this;
                    zzpvVar.zzn.zzaV();
                    com.google.android.gms.internal.measurement.zzgo zzj2 = zzpvVar.zzr().zzj(zzprVar7.zza.zzF());
                    try {
                        try {
                            if (zzj2 != null && zzj2.zzw()) {
                                zzhwVar.zzR(zzj2.zzc());
                                zzj = zzpvVar.zzj();
                                zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba();
                                zzj.zzg();
                                zzj.zzav();
                                Preconditions.checkNotNull(zzhxVar);
                                Preconditions.checkNotEmpty(zzhxVar.zzF());
                                Preconditions.checkState(zzhxVar.zzbK());
                                zzj.zzO();
                                zzio zzioVar = zzj.zzu;
                                currentTimeMillis = zzioVar.zzaU().currentTimeMillis();
                                zzo = zzhxVar.zzo();
                                zzioVar.zzf();
                                if (zzo >= currentTimeMillis - zzam.zzI()) {
                                    long zzo4 = zzhxVar.zzo();
                                    zzioVar.zzf();
                                }
                                zzioVar.zzaW().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzhe.zzn(zzhxVar.zzF()), Long.valueOf(currentTimeMillis), Long.valueOf(zzhxVar.zzo()));
                                byte[] zzB2 = zzj.zzg.zzA().zzB(zzhxVar.zzcd());
                                zzio zzioVar2 = zzj.zzu;
                                zzioVar2.zzaW().zzj().zzb("Saving bundle, size", Integer.valueOf(zzB2.length));
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzhxVar.zzF());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(zzhxVar.zzo()));
                                contentValues.put("data", zzB2);
                                contentValues.put("has_realtime", Integer.valueOf(i23));
                                if (zzhxVar.zzbR()) {
                                    contentValues.put("retry_count", Integer.valueOf(zzhxVar.zzg()));
                                }
                                if (zzj.zzj().insert("queue", null, contentValues) == -1) {
                                    zzioVar2.zzaW().zze().zzb("Failed to insert bundle (got -1). appId", zzhe.zzn(zzhxVar.zzF()));
                                }
                            }
                            if (zzj.zzj().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e5) {
                            zzj.zzu.zzaW().zze().zzc("Error storing bundle. appId", zzhe.zzn(zzhxVar.zzF()), e5);
                        }
                        byte[] zzB22 = zzj.zzg.zzA().zzB(zzhxVar.zzcd());
                        zzio zzioVar22 = zzj.zzu;
                        zzioVar22.zzaW().zzj().zzb("Saving bundle, size", Integer.valueOf(zzB22.length));
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzhxVar.zzF());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzhxVar.zzo()));
                        contentValues.put("data", zzB22);
                        contentValues.put("has_realtime", Integer.valueOf(i23));
                        if (zzhxVar.zzbR()) {
                        }
                    } catch (IOException e6) {
                        zzj.zzu.zzaW().zze().zzc("Data loss. Failed to serialize bundle. appId", zzhe.zzn(zzhxVar.zzF()), e6);
                    }
                    if (zzprVar7.zza.zzP().isEmpty()) {
                        zzhwVar.zzR(-1L);
                    } else {
                        zzpvVar.zzaW().zzk().zzb("Did not find measurement config or missing version info. appId", zzhe.zzn(zzprVar7.zza.zzF()));
                    }
                    zzj = zzpvVar.zzj();
                    zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba();
                    zzj.zzg();
                    zzj.zzav();
                    Preconditions.checkNotNull(zzhxVar);
                    Preconditions.checkNotEmpty(zzhxVar.zzF());
                    Preconditions.checkState(zzhxVar.zzbK());
                    zzj.zzO();
                    zzio zzioVar3 = zzj.zzu;
                    currentTimeMillis = zzioVar3.zzaU().currentTimeMillis();
                    zzo = zzhxVar.zzo();
                    zzioVar3.zzf();
                    if (zzo >= currentTimeMillis - zzam.zzI()) {
                    }
                    zzioVar3.zzaW().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzhe.zzn(zzhxVar.zzF()), Long.valueOf(currentTimeMillis), Long.valueOf(zzhxVar.zzo()));
                } else {
                    zzpvVar = this;
                }
                zzpvVar.zzj().zzJ(zzprVar7.zzb);
                zzaw zzj3 = zzpvVar.zzj();
                try {
                    zzj3.zzj().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzF8, zzF8});
                } catch (SQLiteException e7) {
                    zzj3.zzu.zzaW().zze().zzc("Failed to remove unused event metadata. appId", zzhe.zzn(zzF8), e7);
                }
                zzpvVar.zzj().zzS();
                z4 = z5;
            }
            zzpvVar.zzj().zzL();
            return z4;
        } catch (Throwable th3) {
            th = th3;
            zzpvVar.zzj().zzL();
            throw th;
        }
    }

    private final boolean zzaN() {
        zzaX().zzg();
        zzM();
        return zzj().zzaa() || !TextUtils.isEmpty(zzj().zzA());
    }

    private final boolean zzaO(String str, String str2) {
        zzbd zzs = zzj().zzs(str, str2);
        return zzs == null || zzs.zzc < 1;
    }

    private final boolean zzaP(com.google.android.gms.internal.measurement.zzhl zzhlVar, com.google.android.gms.internal.measurement.zzhl zzhlVar2) {
        Preconditions.checkArgument("_e".equals(zzhlVar.zzo()));
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzG = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba(), "_sc");
        String zzh = zzG == null ? null : zzG.zzh();
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzG2 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar2.zzba(), "_pc");
        String zzh2 = zzG2 != null ? zzG2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzhlVar.zzo()));
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzG3 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba(), "_et");
        if (zzG3 == null || !zzG3.zzw() || zzG3.zzd() <= 0) {
            return true;
        }
        long zzd = zzG3.zzd();
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzG4 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar2.zzba(), "_et");
        if (zzG4 != null && zzG4.zzd() > 0) {
            zzd += zzG4.zzd();
        }
        zzA();
        zzqa.zzD(zzhlVar2, "_et", Long.valueOf(zzd));
        zzA();
        zzqa.zzD(zzhlVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzaQ(zzr zzrVar) {
        return (TextUtils.isEmpty(zzrVar.zzb) && TextUtils.isEmpty(zzrVar.zzp)) ? false : true;
    }

    private static final zzpg zzaR(zzpg zzpgVar) {
        if (zzpgVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzpgVar.zzax()) {
            return zzpgVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzpgVar.getClass())));
    }

    private static final Boolean zzaS(zzr zzrVar) {
        Boolean bool = zzrVar.zzq;
        String str = zzrVar.zzE;
        if (!TextUtils.isEmpty(str)) {
            zzju zzb2 = zze.zza(str).zzb();
            zzju zzjuVar = zzju.UNINITIALIZED;
            int ordinal = zzb2.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static zzpv zzz(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpv.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzpv((zzpw) Preconditions.checkNotNull(new zzpw(context)), null);
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    public final zzqa zzA() {
        zzqa zzqaVar = this.zzi;
        zzaR(zzqaVar);
        return zzqaVar;
    }

    public final zzqf zzB() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzw();
    }

    final String zzC(zzjx zzjxVar) {
        if (!zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzB().zzJ().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String zzD(zzr zzrVar) {
        try {
            return (String) zzaX().zzf(new zzpo(this, zzrVar)).get(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            zzaW().zze().zzc("Failed to get app instance id. appId", zzhe.zzn(zzrVar.zza), e4);
            return null;
        }
    }

    final List zzF(zzr zzrVar, Bundle bundle) {
        zzaX().zzg();
        zzqr.zzb();
        zzam zzi = zzi();
        String str = zzrVar.zza;
        if (!zzi.zzx(str, zzgi.zzaV) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaW().zze().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i4 = 0; i4 < intArray.length; i4++) {
                        zzaw zzj = zzj();
                        int i5 = intArray[i4];
                        long j4 = longArray[i4];
                        Preconditions.checkNotEmpty(str);
                        zzj.zzg();
                        zzj.zzav();
                        try {
                            int delete = zzj.zzj().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i5), String.valueOf(j4)});
                            zzj.zzu.zzaW().zzj().zzd("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i5), Long.valueOf(j4));
                        } catch (SQLiteException e4) {
                            zzj.zzu.zzaW().zze().zzc("Error pruning trigger URIs. appId", zzhe.zzn(str), e4);
                        }
                    }
                }
            }
        }
        zzaw zzj2 = zzj();
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzj2.zzg();
        zzj2.zzav();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = zzj2.zzj().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzov(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e5) {
                zzj2.zzu.zzaW().zze().zzc("Error querying trigger uris. appId", zzhe.zzn(str2), e5);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } finally {
        }
    }

    final void zzK(Runnable runnable) {
        zzaX().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    final void zzL() {
        zzaX().zzg();
        zzM();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzaz()) {
            FileChannel fileChannel = this.zzy;
            zzaX().zzg();
            int i4 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaW().zze().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i4 = allocate.getInt();
                    } else if (read != -1) {
                        zzaW().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e4) {
                    zzaW().zze().zzb("Failed to read from channel", e4);
                }
            }
            int zzi = this.zzn.zzh().zzi();
            zzaX().zzg();
            if (i4 > zzi) {
                zzaW().zze().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i4), Integer.valueOf(zzi));
                return;
            }
            if (i4 < zzi) {
                FileChannel fileChannel2 = this.zzy;
                zzaX().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaW().zze().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzi);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaW().zze().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaW().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i4), Integer.valueOf(zzi));
                        return;
                    } catch (IOException e5) {
                        zzaW().zze().zzb("Failed to write to channel", e5);
                    }
                }
                zzaW().zze().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i4), Integer.valueOf(zzi));
            }
        }
    }

    final void zzM() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzN(String str, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        int zza;
        int indexOf;
        Set zzo = zzr().zzo(str);
        if (zzo != null) {
            zzhwVar.zzl(zzo);
        }
        if (zzr().zzB(str)) {
            zzhwVar.zzs();
        }
        if (zzr().zzE(str)) {
            String zzaK = zzhwVar.zzaK();
            if (!TextUtils.isEmpty(zzaK) && (indexOf = zzaK.indexOf(".")) != -1) {
                zzhwVar.zzam(zzaK.substring(0, indexOf));
            }
        }
        if (zzr().zzF(str) && (zza = zzqa.zza(zzhwVar, "_id")) != -1) {
            zzhwVar.zzE(zza);
        }
        if (zzr().zzD(str)) {
            zzhwVar.zzt();
        }
        if (zzr().zzA(str)) {
            zzhwVar.zzq();
            if (zzu(str).zzr(zzjw.ANALYTICS_STORAGE)) {
                Map map = this.zzE;
                zzps zzpsVar = (zzps) map.get(str);
                if (zzpsVar == null || zzpsVar.zzb + zzi().zzk(str, zzgi.zzaj) < zzaU().elapsedRealtime()) {
                    zzpsVar = new zzps(this);
                    map.put(str, zzpsVar);
                }
                zzhwVar.zzac(zzpsVar.zza);
            }
        }
        if (zzr().zzC(str)) {
            zzhwVar.zzA();
        }
    }

    final void zzO(zzh zzhVar) {
        zzaX().zzg();
        if (TextUtils.isEmpty(zzhVar.zzH()) && TextUtils.isEmpty(zzhVar.zzA())) {
            zzW((String) Preconditions.checkNotNull(zzhVar.zzC()), InterfaceC1490j3.c.b.f16804e, null, null, null);
            return;
        }
        String str = (String) Preconditions.checkNotNull(zzhVar.zzC());
        zzaW().zzj().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgo zzj = zzr().zzj(str);
        String zzl = zzr().zzl(str);
        androidx.collection.a aVar = null;
        if (zzj != null) {
            if (!TextUtils.isEmpty(zzl)) {
                aVar = new androidx.collection.a();
                aVar.put("If-Modified-Since", zzl);
            }
            String zzk = zzr().zzk(str);
            if (!TextUtils.isEmpty(zzk)) {
                if (aVar == null) {
                    aVar = new androidx.collection.a();
                }
                aVar.put("If-None-Match", zzk);
            }
        }
        this.zzu = true;
        zzp().zza(zzhVar, aVar, new zzhg() { // from class: com.google.android.gms.measurement.internal.zzpj
            @Override // com.google.android.gms.measurement.internal.zzhg
            public final void zza(String str2, int i4, Throwable th, byte[] bArr, Map map) {
                zzpv.this.zzW(str2, i4, th, bArr, map);
            }
        });
    }

    final void zzP(zzr zzrVar, long j4) {
        zzh zzl = zzj().zzl((String) Preconditions.checkNotNull(zzrVar.zza));
        if (zzl != null && zzB().zzaw(zzrVar.zzb, zzl.zzH(), zzrVar.zzp, zzl.zzA())) {
            zzaW().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzhe.zzn(zzl.zzC()));
            zzaw zzj = zzj();
            String zzC = zzl.zzC();
            zzj.zzav();
            zzj.zzg();
            Preconditions.checkNotEmpty(zzC);
            try {
                SQLiteDatabase zzj2 = zzj.zzj();
                String[] strArr = {zzC};
                int delete = zzj2.delete("events", "app_id=?", strArr) + zzj2.delete("user_attributes", "app_id=?", strArr) + zzj2.delete("conditional_properties", "app_id=?", strArr) + zzj2.delete("apps", "app_id=?", strArr) + zzj2.delete("raw_events", "app_id=?", strArr) + zzj2.delete("raw_events_metadata", "app_id=?", strArr) + zzj2.delete("event_filters", "app_id=?", strArr) + zzj2.delete("property_filters", "app_id=?", strArr) + zzj2.delete("audience_filter_values", "app_id=?", strArr) + zzj2.delete("consent_settings", "app_id=?", strArr) + zzj2.delete("default_event_params", "app_id=?", strArr) + zzj2.delete("trigger_uris", "app_id=?", strArr);
                if (delete > 0) {
                    zzj.zzu.zzaW().zzj().zzc("Deleted application data. app, records", zzC, Integer.valueOf(delete));
                }
            } catch (SQLiteException e4) {
                zzj.zzu.zzaW().zze().zzc("Error deleting application data. appId, error", zzhe.zzn(zzC), e4);
            }
            zzl = null;
        }
        if (zzl != null) {
            boolean z4 = (zzl.zze() == -2147483648L || zzl.zze() == zzrVar.zzj) ? false : true;
            String zzF = zzl.zzF();
            if (z4 || ((zzl.zze() != -2147483648L || zzF == null || zzF.equals(zzrVar.zzc)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", zzF);
                zzbh zzbhVar = new zzbh("_au", new zzbf(bundle), "auto", j4);
                if (zzi().zzx(null, zzgi.zzbm)) {
                    zzU(zzbhVar, zzrVar);
                } else {
                    zzS(zzbhVar, zzrVar);
                }
            }
        }
    }

    final void zzQ(zzh zzhVar, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        com.google.android.gms.internal.measurement.zzio zzioVar;
        zzaX().zzg();
        zzM();
        zzao zzb2 = zzao.zzb(zzhwVar.zzaH());
        String zzC = zzhVar.zzC();
        zzaX().zzg();
        zzM();
        zzjx zzu = zzu(zzC);
        zzju zzjuVar = zzju.UNINITIALIZED;
        int ordinal = zzu.zze().ordinal();
        if (ordinal == 1) {
            zzb2.zzd(zzjw.AD_STORAGE, zzan.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal == 2 || ordinal == 3) {
            zzb2.zzc(zzjw.AD_STORAGE, zzu.zzb());
        } else {
            zzb2.zzd(zzjw.AD_STORAGE, zzan.FAILSAFE);
        }
        int ordinal2 = zzu.zzf().ordinal();
        if (ordinal2 == 1) {
            zzb2.zzd(zzjw.ANALYTICS_STORAGE, zzan.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            zzb2.zzc(zzjw.ANALYTICS_STORAGE, zzu.zzb());
        } else {
            zzb2.zzd(zzjw.ANALYTICS_STORAGE, zzan.FAILSAFE);
        }
        String zzC2 = zzhVar.zzC();
        zzaX().zzg();
        zzM();
        zzba zzl = zzl(zzC2, zzm(zzC2), zzu(zzC2), zzb2);
        zzhwVar.zzak(((Boolean) Preconditions.checkNotNull(zzl.zzh())).booleanValue());
        if (!TextUtils.isEmpty(zzl.zzi())) {
            zzhwVar.zzU(zzl.zzi());
        }
        zzaX().zzg();
        zzM();
        Iterator it = zzhwVar.zzaN().iterator();
        while (true) {
            if (it.hasNext()) {
                zzioVar = (com.google.android.gms.internal.measurement.zzio) it.next();
                if ("_npa".equals(zzioVar.zzg())) {
                    break;
                }
            } else {
                zzioVar = null;
                break;
            }
        }
        if (zzioVar != null) {
            zzjw zzjwVar = zzjw.AD_PERSONALIZATION;
            if (zzb2.zza(zzjwVar) == zzan.UNSET) {
                zzqd zzy = zzj().zzy(zzhVar.zzC(), "_npa");
                if (zzy != null) {
                    String str = zzy.zzb;
                    if ("tcf".equals(str)) {
                        zzb2.zzd(zzjwVar, zzan.TCF);
                    } else if ("app".equals(str)) {
                        zzb2.zzd(zzjwVar, zzan.API);
                    } else {
                        zzb2.zzd(zzjwVar, zzan.MANIFEST);
                    }
                } else {
                    Boolean zzx = zzhVar.zzx();
                    if (zzx == null || ((zzx.booleanValue() && zzioVar.zzc() != 1) || !(zzx.booleanValue() || zzioVar.zzc() == 0))) {
                        zzb2.zzd(zzjwVar, zzan.API);
                    } else {
                        zzb2.zzd(zzjwVar, zzan.MANIFEST);
                    }
                }
            }
        } else {
            int zzaC = zzaC(zzhVar.zzC(), zzb2);
            com.google.android.gms.internal.measurement.zzin zze = com.google.android.gms.internal.measurement.zzio.zze();
            zze.zzf("_npa");
            zze.zzg(zzaU().currentTimeMillis());
            zze.zze(zzaC);
            zzhwVar.zzp((com.google.android.gms.internal.measurement.zzio) zze.zzba());
            zzaW().zzj().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(zzaC));
        }
        zzhwVar.zzS(zzb2.toString());
        boolean zzv = this.zzc.zzv(zzhVar.zzC());
        List zzaM = zzhwVar.zzaM();
        int i4 = 0;
        for (int i5 = 0; i5 < zzaM.size(); i5++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhm) zzaM.get(i5)).zzh())) {
                com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) ((com.google.android.gms.internal.measurement.zzhm) zzaM.get(i5)).zzch();
                List zzp = zzhlVar.zzp();
                int i6 = 0;
                while (true) {
                    if (i6 >= zzp.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhq) zzp.get(i6)).zzg())) {
                        String zzh = ((com.google.android.gms.internal.measurement.zzhq) zzp.get(i6)).zzh();
                        if (zzv && zzh.length() > 4) {
                            char[] charArray = zzh.toCharArray();
                            int i7 = 1;
                            while (true) {
                                if (i7 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7)) {
                                    i4 = i7;
                                    break;
                                }
                                i7++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i4);
                            zzh = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhp zze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                        zze2.zzj("_tcfd");
                        zze2.zzk(zzh);
                        zzhlVar.zzj(i6, zze2);
                    } else {
                        i6++;
                    }
                }
                zzhwVar.zzad(i5, zzhlVar);
                return;
            }
        }
    }

    final void zzR(com.google.android.gms.internal.measurement.zzhw zzhwVar, zzpr zzprVar) {
        for (int i4 = 0; i4 < zzhwVar.zzc(); i4++) {
            com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) zzhwVar.zzh(i4).zzch();
            Iterator it = zzhlVar.zzp().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhq) it.next()).zzg())) {
                    if (zzprVar.zza.zza() >= zzi().zzh(zzprVar.zza.zzF(), zzgi.zzak)) {
                        int zzh = zzi().zzh(zzprVar.zza.zzF(), zzgi.zzax);
                        String str = null;
                        if (zzh <= 0) {
                            if (zzi().zzx(zzprVar.zza.zzF(), zzgi.zzaX)) {
                                str = zzB().zzF();
                                com.google.android.gms.internal.measurement.zzhp zze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zze.zzj("_tu");
                                zze.zzk(str);
                                zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze.zzba());
                            }
                            com.google.android.gms.internal.measurement.zzhp zze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze2.zzj("_tr");
                            zze2.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze2.zzba());
                            zzov zzl = zzA().zzl(zzprVar.zza.zzF(), zzhwVar, zzhlVar, str);
                            if (zzl != null) {
                                zzaW().zzj().zzc("Generated trigger URI. appId, uri", zzprVar.zza.zzF(), zzl.zza);
                                zzj().zzad(zzprVar.zza.zzF(), zzl);
                                Deque deque = this.zzr;
                                if (!deque.contains(zzprVar.zza.zzF())) {
                                    deque.add(zzprVar.zza.zzF());
                                }
                            }
                        } else if (zzj().zzo(zza(), zzprVar.zza.zzF(), false, false, false, false, false, false, true).zzg > zzh) {
                            com.google.android.gms.internal.measurement.zzhp zze3 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze3.zzj("_tnr");
                            zze3.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze3.zzba());
                        } else {
                            if (zzi().zzx(zzprVar.zza.zzF(), zzgi.zzaX)) {
                                str = zzB().zzF();
                                com.google.android.gms.internal.measurement.zzhp zze4 = com.google.android.gms.internal.measurement.zzhq.zze();
                                zze4.zzj("_tu");
                                zze4.zzk(str);
                                zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze4.zzba());
                            }
                            com.google.android.gms.internal.measurement.zzhp zze5 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze5.zzj("_tr");
                            zze5.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze5.zzba());
                            zzov zzl2 = zzA().zzl(zzprVar.zza.zzF(), zzhwVar, zzhlVar, str);
                            if (zzl2 != null) {
                                zzaW().zzj().zzc("Generated trigger URI. appId, uri", zzprVar.zza.zzF(), zzl2.zza);
                                zzj().zzad(zzprVar.zza.zzF(), zzl2);
                                Deque deque2 = this.zzr;
                                if (!deque2.contains(zzprVar.zza.zzF())) {
                                    deque2.add(zzprVar.zza.zzF());
                                }
                            }
                        }
                    }
                    zzhwVar.zzae(i4, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba());
                }
            }
        }
    }

    final void zzS(zzbh zzbhVar, zzr zzrVar) {
        zzbh zzbhVar2;
        List<zzai> zzC;
        List<zzai> zzC2;
        List<zzai> zzC3;
        String str;
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzaX().zzg();
        zzM();
        long j4 = zzbhVar.zzd;
        zzhf zzb2 = zzhf.zzb(zzbhVar);
        zzaX().zzg();
        zzqf.zzN((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zzb2.zzd, false);
        zzbh zza = zzb2.zza();
        zzA();
        if (zzqa.zzE(zza, zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            List list = zzrVar.zzs;
            if (list != null) {
                String str3 = zza.zza;
                if (!list.contains(str3)) {
                    zzaW().zzd().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zza.zza, zza.zzc);
                    return;
                } else {
                    Bundle zzc = zza.zzb.zzc();
                    zzc.putLong("ga_safelisted", 1L);
                    zzbhVar2 = new zzbh(str3, new zzbf(zzc), zza.zzc, zza.zzd);
                }
            } else {
                zzbhVar2 = zza;
            }
            zzj().zzH();
            try {
                zzra.zzb();
                if (zzi().zzx(null, zzgi.zzbi) && "_s".equals(zzbhVar2.zza) && !zzj().zzZ(str2, "_s") && zzbhVar2.zzb.zze("_sid").longValue() != 0) {
                    if (!zzj().zzZ(str2, "_f") && !zzj().zzZ(str2, "_v")) {
                        zzj().zzG(str2, Long.valueOf(zzaU().currentTimeMillis() - 15000), "_sid", zzf(str2, zzbhVar2));
                    }
                    zzj().zzG(str2, null, "_sid", zzf(str2, zzbhVar2));
                }
                zzaw zzj = zzj();
                Preconditions.checkNotEmpty(str2);
                zzj.zzg();
                zzj.zzav();
                if (j4 < 0) {
                    zzj.zzu.zzaW().zzk().zzc("Invalid time querying timed out conditional properties", zzhe.zzn(str2), Long.valueOf(j4));
                    zzC = Collections.EMPTY_LIST;
                } else {
                    zzC = zzj.zzC("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j4)});
                }
                for (zzai zzaiVar : zzC) {
                    if (zzaiVar != null) {
                        zzaW().zzj().zzd("User property timed out", zzaiVar.zza, this.zzn.zzj().zzf(zzaiVar.zzc.zzb), zzaiVar.zzc.zza());
                        zzbh zzbhVar3 = zzaiVar.zzg;
                        if (zzbhVar3 != null) {
                            zzax(new zzbh(zzbhVar3, j4), zzrVar);
                        }
                        zzj().zza(str2, zzaiVar.zzc.zzb);
                    }
                }
                zzaw zzj2 = zzj();
                Preconditions.checkNotEmpty(str2);
                zzj2.zzg();
                zzj2.zzav();
                if (j4 < 0) {
                    zzj2.zzu.zzaW().zzk().zzc("Invalid time querying expired conditional properties", zzhe.zzn(str2), Long.valueOf(j4));
                    zzC2 = Collections.EMPTY_LIST;
                } else {
                    zzC2 = zzj2.zzC("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j4)});
                }
                ArrayList arrayList = new ArrayList(zzC2.size());
                for (zzai zzaiVar2 : zzC2) {
                    if (zzaiVar2 != null) {
                        zzaW().zzj().zzd("User property expired", zzaiVar2.zza, this.zzn.zzj().zzf(zzaiVar2.zzc.zzb), zzaiVar2.zzc.zza());
                        zzj().zzP(str2, zzaiVar2.zzc.zzb);
                        zzbh zzbhVar4 = zzaiVar2.zzk;
                        if (zzbhVar4 != null) {
                            arrayList.add(zzbhVar4);
                        }
                        zzj().zza(str2, zzaiVar2.zzc.zzb);
                    }
                }
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    zzax(new zzbh((zzbh) obj, j4), zzrVar);
                }
                zzaw zzj3 = zzj();
                String str4 = zzbhVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str4);
                zzj3.zzg();
                zzj3.zzav();
                if (j4 < 0) {
                    zzio zzioVar = zzj3.zzu;
                    zzioVar.zzaW().zzk().zzd("Invalid time querying triggered conditional properties", zzhe.zzn(str2), zzioVar.zzj().zzd(str4), Long.valueOf(j4));
                    zzC3 = Collections.EMPTY_LIST;
                } else {
                    zzC3 = zzj3.zzC("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j4)});
                }
                ArrayList arrayList2 = new ArrayList(zzC3.size());
                for (zzai zzaiVar3 : zzC3) {
                    if (zzaiVar3 != null) {
                        zzqb zzqbVar = zzaiVar3.zzc;
                        zzqd zzqdVar = new zzqd((String) Preconditions.checkNotNull(zzaiVar3.zza), zzaiVar3.zzb, zzqbVar.zzb, j4, Preconditions.checkNotNull(zzqbVar.zza()));
                        if (zzj().zzai(zzqdVar)) {
                            zzaW().zzj().zzd("User property triggered", zzaiVar3.zza, this.zzn.zzj().zzf(zzqdVar.zzc), zzqdVar.zze);
                        } else {
                            zzaW().zze().zzd("Too many active user properties, ignoring", zzhe.zzn(zzaiVar3.zza), this.zzn.zzj().zzf(zzqdVar.zzc), zzqdVar.zze);
                        }
                        zzbh zzbhVar5 = zzaiVar3.zzi;
                        if (zzbhVar5 != null) {
                            arrayList2.add(zzbhVar5);
                        }
                        zzaiVar3.zzc = new zzqb(zzqdVar);
                        zzaiVar3.zze = true;
                        zzj().zzah(zzaiVar3);
                    }
                }
                zzax(zzbhVar2, zzrVar);
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    zzax(new zzbh((zzbh) obj2, j4), zzrVar);
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzT(zzbh zzbhVar, String str) {
        zzh zzl = zzj().zzl(str);
        if (zzl == null || TextUtils.isEmpty(zzl.zzF())) {
            zzaW().zzd().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzaF = zzaF(zzl);
        if (zzaF == null) {
            if (!"_ui".equals(zzbhVar.zza)) {
                zzaW().zzk().zzb("Could not find package. appId", zzhe.zzn(str));
            }
        } else if (!zzaF.booleanValue()) {
            zzaW().zze().zzb("App version does not match; dropping event. appId", zzhe.zzn(str));
            return;
        }
        zzU(zzbhVar, new zzr(str, zzl.zzH(), zzl.zzF(), zzl.zze(), zzl.zzE(), zzl.zzq(), zzl.zzn(), (String) null, zzl.zzaJ(), false, zzl.zzG(), 0L, 0, zzl.zzaI(), false, zzl.zzA(), zzl.zzx(), zzl.zzo(), zzl.zzN(), (String) null, zzu(str).zzq(), "", (String) null, zzl.zzaL(), zzl.zzw(), zzu(str).zzb(), zzm(str).zzj(), zzl.zza(), zzl.zzf(), zzl.zzM(), zzl.zzK(), 0L, zzl.zzb()));
    }

    final void zzU(zzbh zzbhVar, zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzhf zzb2 = zzhf.zzb(zzbhVar);
        zzB().zzO(zzb2.zzd, zzj().zzk(str));
        zzB().zzQ(zzb2, zzi().zzf(str));
        zzbh zza = zzb2.zza();
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zza.zza)) {
            zzbf zzbfVar = zza.zzb;
            if ("referrer API v2".equals(zzbfVar.zzg("_cis"))) {
                String zzg = zzbfVar.zzg("gclid");
                if (!TextUtils.isEmpty(zzg)) {
                    zzas(new zzqb("_lgclid", zza.zzd, zzg, "auto"), zzrVar);
                }
            }
        }
        zzS(zza, zzrVar);
    }

    final void zzV() {
        this.zzt++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x015f, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00d0, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013c, B:47:0x0146, B:49:0x0154, B:50:0x015c, B:51:0x010b, B:52:0x00d8, B:54:0x00e2), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x015f, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00d0, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013c, B:47:0x0146, B:49:0x0154, B:50:0x015c, B:51:0x010b, B:52:0x00d8, B:54:0x00e2), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x015f, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00d0, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013c, B:47:0x0146, B:49:0x0154, B:50:0x015c, B:51:0x010b, B:52:0x00d8, B:54:0x00e2), top: B:4:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzW(String str, int i4, Throwable th, byte[] bArr, Map map) {
        boolean z4;
        zzaX().zzg();
        zzM();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzaH();
                throw th2;
            }
        }
        zzhc zzj = zzaW().zzj();
        Integer valueOf = Integer.valueOf(bArr.length);
        zzj.zzb("onConfigFetched. Response size", valueOf);
        zzj().zzH();
        try {
            zzh zzl = zzj().zzl(str);
            if (i4 != 200 && i4 != 204) {
                if (i4 == 304) {
                    i4 = 304;
                }
                z4 = false;
                if (zzl == null) {
                    zzaW().zzk().zzb("App does not exist in onConfigFetched. appId", zzhe.zzn(str));
                } else {
                    if (!z4 && i4 != 404) {
                        zzl.zzam(zzaU().currentTimeMillis());
                        zzj().zzT(zzl, false, false);
                        zzaW().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i4), th);
                        zzr().zzq(str);
                        this.zzk.zze.zzb(zzaU().currentTimeMillis());
                        if (i4 == 503 || i4 == 429) {
                            this.zzk.zzc.zzb(zzaU().currentTimeMillis());
                        }
                        zzaL();
                    }
                    String zzaG = zzaG(map, "Last-Modified");
                    String zzaG2 = zzaG(map, "ETag");
                    if (i4 != 404 && i4 != 304) {
                        zzr().zzz(str, bArr, zzaG, zzaG2);
                        zzl.zzab(zzaU().currentTimeMillis());
                        zzj().zzT(zzl, false, false);
                        if (i4 != 404) {
                            zzaW().zzl().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzaW().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i4), valueOf);
                        }
                        if (!zzp().zzd() && zzaN()) {
                            zzat();
                        } else if (!zzi().zzx(null, zzgi.zzaM) && zzp().zzd() && zzj().zzY(zzl.zzC())) {
                            zzav(zzl.zzC());
                        } else {
                            zzaL();
                        }
                    }
                    if (zzr().zzj(str) == null) {
                        zzr().zzz(str, null, null, null);
                    }
                    zzl.zzab(zzaU().currentTimeMillis());
                    zzj().zzT(zzl, false, false);
                    if (i4 != 404) {
                    }
                    if (!zzp().zzd()) {
                    }
                    if (!zzi().zzx(null, zzgi.zzaM)) {
                    }
                    zzaL();
                }
                zzj().zzS();
                zzj().zzL();
                this.zzu = false;
                zzaH();
            }
            if (th == null) {
                z4 = true;
                if (zzl == null) {
                }
                zzj().zzS();
                zzj().zzL();
                this.zzu = false;
                zzaH();
            }
            z4 = false;
            if (zzl == null) {
            }
            zzj().zzS();
            zzj().zzL();
            this.zzu = false;
            zzaH();
        } catch (Throwable th3) {
            zzj().zzL();
            throw th3;
        }
    }

    final void zzX(boolean z4) {
        zzaL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r21 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzY(boolean z4, int i4, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        zzaw zzj;
        long longValue;
        int i5 = i4;
        zzaX().zzg();
        zzM();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } finally {
                this.zzv = false;
                zzaH();
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = (List) Preconditions.checkNotNull(this.zzz);
        this.zzz = null;
        try {
            if (z4) {
                if (i5 != 200) {
                    if (i5 == 204) {
                        i5 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    zzaW().zzl().zzd("Network upload failed. Will retry later. code, error", Integer.valueOf(i5), th, str2.substring(0, Math.min(32, str2.length())));
                    this.zzk.zze.zzb(zzaU().currentTimeMillis());
                    if (i5 == 503 || i5 == 429) {
                        this.zzk.zzc.zzb(zzaU().currentTimeMillis());
                    }
                    zzj().zzM(list2);
                    zzaL();
                    this.zzv = false;
                    zzaH();
                    return;
                }
            }
            if (zzi().zzx(null, zzgi.zzaM)) {
                if (zzi().zzx(null, zzgi.zzaP)) {
                    HashMap hashMap = new HashMap();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        com.google.android.gms.internal.measurement.zzhv zzhvVar = (com.google.android.gms.internal.measurement.zzhv) pair.first;
                        zzph zzphVar = (zzph) pair.second;
                        if (zzphVar.zza() != zzmf.SGTM_CLIENT) {
                            long zzd = zzj().zzd(str, zzhvVar, zzphVar.zzc(), zzphVar.zzd(), zzphVar.zza(), null);
                            if (zzphVar.zza() == zzmf.GOOGLE_SIGNAL_PENDING && zzd != -1 && !zzhvVar.zzf().isEmpty()) {
                                hashMap.put(zzhvVar.zzf(), Long.valueOf(zzd));
                            }
                        }
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        com.google.android.gms.internal.measurement.zzhv zzhvVar2 = (com.google.android.gms.internal.measurement.zzhv) pair2.first;
                        zzph zzphVar2 = (zzph) pair2.second;
                        if (zzphVar2.zza() == zzmf.SGTM_CLIENT) {
                            zzj().zzd(str, zzhvVar2, zzphVar2.zzc(), zzphVar2.zzd(), zzphVar2.zza(), (Long) hashMap.get(zzhvVar2.zzf()));
                        }
                    }
                } else {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Pair pair3 = (Pair) it3.next();
                        com.google.android.gms.internal.measurement.zzhv zzhvVar3 = (com.google.android.gms.internal.measurement.zzhv) pair3.first;
                        zzph zzphVar3 = (zzph) pair3.second;
                        zzj().zzd(str, zzhvVar3, zzphVar3.zzc(), zzphVar3.zzd(), zzphVar3.zza(), null);
                    }
                }
            }
            for (Long l4 : list2) {
                try {
                    zzj = zzj();
                    longValue = l4.longValue();
                    zzj.zzg();
                    zzj.zzav();
                } catch (SQLiteException e4) {
                    List list3 = this.zzA;
                    if (list3 == null || !list3.contains(l4)) {
                        throw e4;
                    }
                }
                try {
                    if (zzj.zzj().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                } catch (SQLiteException e5) {
                    zzj.zzu.zzaW().zze().zzb("Failed to delete a bundle in a queue table", e5);
                    throw e5;
                }
            }
            zzj().zzS();
            zzj().zzL();
            this.zzA = null;
            if (zzi().zzx(null, zzgi.zzaM) && zzp().zzd() && zzj().zzY(str)) {
                zzav(str);
            } else if (zzp().zzd() && zzaN()) {
                zzat();
            } else {
                this.zzB = -1L;
                zzaL();
            }
            this.zza = 0L;
            this.zzv = false;
            zzaH();
            return;
        } catch (Throwable th2) {
            zzj().zzL();
            throw th2;
        }
        zzhc zzj2 = zzaW().zzj();
        Integer valueOf = Integer.valueOf(i5);
        zzj2.zzc("Network upload successful with code, uploadAttempted", valueOf, Boolean.valueOf(z4));
        if (z4) {
            try {
                this.zzk.zzd.zzb(zzaU().currentTimeMillis());
            } catch (SQLiteException e6) {
                zzaW().zze().zzb("Database error while trying to delete uploaded bundles", e6);
                this.zza = zzaU().elapsedRealtime();
                zzaW().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
        }
        this.zzk.zze.zzb(0L);
        zzaL();
        if (z4) {
            zzaW().zzj().zzc("Successful upload. Got network response. code, size", valueOf, Integer.valueOf(bArr2.length));
        } else {
            zzaW().zzj().zza("Purged empty bundles");
        }
        zzj().zzH();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008c  */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzZ(String str, int i4, Throwable th, byte[] bArr, zzpz zzpzVar) {
        zzaX().zzg();
        zzM();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzv = false;
                zzaH();
                throw th2;
            }
        }
        if (i4 != 200) {
            if (i4 == 204) {
                i4 = 204;
            }
            String str2 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str2.substring(0, Math.min(32, str2.length()));
            zzhc zzl = zzaW().zzl();
            Integer valueOf = Integer.valueOf(i4);
            if (th == null) {
                th = substring;
            }
            zzl.zzd("Network upload failed. Will retry later. appId, status, error", str, valueOf, th);
            zzj().zzN(Long.valueOf(zzpzVar.zzc()));
            zzaL();
            this.zzv = false;
            zzaH();
        }
        if (th == null) {
            zzj().zzK(Long.valueOf(zzpzVar.zzc()));
            zzaW().zzj().zzc("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i4));
            if (zzi().zzx(null, zzgi.zzaM) && zzp().zzd() && zzj().zzY(str)) {
                zzav(str);
            } else {
                zzaL();
            }
            this.zzv = false;
            zzaH();
        }
        String str22 = new String(bArr, StandardCharsets.UTF_8);
        ?? substring2 = str22.substring(0, Math.min(32, str22.length()));
        zzhc zzl2 = zzaW().zzl();
        Integer valueOf2 = Integer.valueOf(i4);
        if (th == null) {
        }
        zzl2.zzd("Network upload failed. Will retry later. appId, status, error", str, valueOf2, th);
        zzj().zzN(Long.valueOf(zzpzVar.zzc()));
        zzaL();
        this.zzv = false;
        zzaH();
    }

    final long zza() {
        long currentTimeMillis = zzaU().currentTimeMillis();
        zzoa zzoaVar = this.zzk;
        zzoaVar.zzav();
        zzoaVar.zzg();
        zzhp zzhpVar = zzoaVar.zzf;
        long zza = zzhpVar.zza();
        if (zza == 0) {
            zza = zzoaVar.zzu.zzw().zzJ().nextInt(86400000) + 1;
            zzhpVar.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final Context zzaT() {
        return this.zzn.zzaT();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final Clock zzaU() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzaf zzaV() {
        return this.zzn.zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzhe zzaW() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzil zzaX() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaX();
    }

    final void zzaa(zzh zzhVar, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        zzaX().zzg();
        zzM();
        com.google.android.gms.internal.measurement.zzhb zzc = com.google.android.gms.internal.measurement.zzhc.zzc();
        byte[] zzaN = zzhVar.zzaN();
        if (zzaN != null) {
            try {
                zzc = (com.google.android.gms.internal.measurement.zzhb) zzqa.zzp(zzc, zzaN);
            } catch (com.google.android.gms.internal.measurement.zzmm unused) {
                zzaW().zzk().zzb("Failed to parse locally stored ad campaign info. appId", zzhe.zzn(zzhVar.zzC()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhm zzhmVar : zzhwVar.zzaM()) {
            if (zzhmVar.zzh().equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                String str = (String) zzqa.zzI(zzhmVar, "gclid", "");
                String str2 = (String) zzqa.zzI(zzhmVar, "gbraid", "");
                String str3 = (String) zzqa.zzI(zzhmVar, "gad_source", "");
                if (!str.isEmpty() || !str2.isEmpty()) {
                    long longValue = ((Long) zzqa.zzI(zzhmVar, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzhmVar.zzd();
                    }
                    if ("referrer API v2".equals(zzqa.zzH(zzhmVar, "_cis"))) {
                        if (longValue > zzc.zzb()) {
                            if (str.isEmpty()) {
                                zzc.zzh();
                            } else {
                                zzc.zzp(str);
                            }
                            if (str2.isEmpty()) {
                                zzc.zzg();
                            } else {
                                zzc.zzo(str2);
                            }
                            if (str3.isEmpty()) {
                                zzc.zzf();
                            } else {
                                zzc.zzn(str3);
                            }
                            zzc.zzm(longValue);
                        }
                    } else if (longValue > zzc.zza()) {
                        if (str.isEmpty()) {
                            zzc.zze();
                        } else {
                            zzc.zzk(str);
                        }
                        if (str2.isEmpty()) {
                            zzc.zzd();
                        } else {
                            zzc.zzj(str2);
                        }
                        if (str3.isEmpty()) {
                            zzc.zzc();
                        } else {
                            zzc.zzi(str3);
                        }
                        zzc.zzl(longValue);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzhc) zzc.zzba()).equals(com.google.android.gms.internal.measurement.zzhc.zze())) {
            zzhwVar.zzF((com.google.android.gms.internal.measurement.zzhc) zzc.zzba());
        }
        zzhVar.zzR(((com.google.android.gms.internal.measurement.zzhc) zzc.zzba()).zzcd());
        if (zzhVar.zzaK()) {
            zzj().zzT(zzhVar, false, false);
        }
    }

    final void zzab(zzr zzrVar) {
        zzaX().zzg();
        zzM();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        int i4 = 0;
        if (zzi().zzx(null, zzgi.zzay)) {
            long currentTimeMillis = zzaU().currentTimeMillis();
            int zzh = zzi().zzh(null, zzgi.zzah);
            zzi();
            long zzF = currentTimeMillis - zzam.zzF();
            while (i4 < zzh && zzaM(null, zzF)) {
                i4++;
            }
        } else {
            zzi();
            long zzH = zzam.zzH();
            while (i4 < zzH && zzaM(str, 0L)) {
                i4++;
            }
        }
        if (zzi().zzx(null, zzgi.zzaz)) {
            zzaX().zzg();
            zzaJ();
        }
        if (zzi().zzx(null, zzgi.zzaQ) && this.zzl.zzd(str, com.google.android.gms.internal.measurement.zzih.zzb(zzrVar.zzG))) {
            zzaW().zzj().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzau(str, zzaU().currentTimeMillis());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:65|66)|(2:68|(8:70|(3:72|(2:74|(1:76))(1:96)|77)(1:97)|78|(1:80)(1:95)|81|82|83|(4:85|(1:87)(1:91)|88|(1:90))))|98|82|83|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00c9, code lost:
    
        if (true == r12.booleanValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00cb, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00d0, code lost:
    
        r15 = new com.google.android.gms.measurement.internal.zzqb("_npa", r17, java.lang.Long.valueOf(r23), "auto");
        r24 = 1;
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00e3, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00ed, code lost:
    
        if (r11.zze.equals(r15.zzd) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00ef, code lost:
    
        zzas(r15, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00ce, code lost:
    
        r23 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0342, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0343, code lost:
    
        zzaW().zze().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r6), r0);
        r14 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03db A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0123 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010f A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0283 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ae A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0374 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0357 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:25:0x009e, B:27:0x00ac, B:31:0x00fc, B:33:0x0109, B:34:0x0112, B:36:0x0117, B:38:0x0130, B:42:0x0144, B:44:0x0168, B:47:0x0170, B:49:0x017f, B:50:0x0257, B:52:0x0283, B:53:0x0286, B:55:0x02ae, B:59:0x0374, B:60:0x0377, B:61:0x03fb, B:66:0x02c3, B:68:0x02e6, B:70:0x02ee, B:72:0x02f4, B:76:0x0307, B:78:0x0318, B:81:0x0324, B:83:0x0332, B:85:0x0357, B:87:0x035d, B:88:0x0365, B:90:0x036b, B:94:0x0343, B:96:0x0310, B:101:0x02d2, B:102:0x018e, B:104:0x01b7, B:105:0x01c6, B:107:0x01cd, B:109:0x01d3, B:111:0x01dd, B:113:0x01e3, B:115:0x01e9, B:117:0x01ef, B:119:0x01f4, B:122:0x0214, B:127:0x0218, B:128:0x022c, B:129:0x023a, B:130:0x0248, B:131:0x038d, B:133:0x03c2, B:134:0x03c5, B:135:0x03db, B:137:0x03e1, B:138:0x0123, B:139:0x010f, B:141:0x00c1, B:144:0x00d0, B:146:0x00e5, B:148:0x00ef, B:152:0x00f9), top: B:24:0x009e, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzac(zzr zzrVar) {
        long j4;
        long j5;
        zzbd zzs;
        boolean z4;
        long zze;
        zzio zzioVar;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j6;
        boolean z5;
        zzaX().zzg();
        zzM();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        if (zzaQ(zzrVar)) {
            zzh zzl = zzj().zzl(str);
            if (zzl != null && TextUtils.isEmpty(zzl.zzH()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzl.zzab(0L);
                zzj().zzT(zzl, false, false);
                zzr().zzr(str);
            }
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            long j7 = zzrVar.zzl;
            if (j7 == 0) {
                j7 = zzaU().currentTimeMillis();
            }
            long j8 = j7;
            this.zzn.zzg().zzg();
            int i4 = zzrVar.zzm;
            if (i4 != 0 && i4 != 1) {
                zzaW().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzhe.zzn(str), Integer.valueOf(i4));
                i4 = 0;
            }
            zzj().zzH();
            try {
                zzqd zzy = zzj().zzy(str, "_npa");
                Boolean zzaS = zzaS(zzrVar);
                if (zzy != null && !"auto".equals(zzy.zzb)) {
                    j4 = j8;
                    j5 = 1;
                    if (zzi().zzx(null, zzgi.zzbl)) {
                        zzP(zzrVar, j4);
                    } else {
                        zzP(zzrVar, zzrVar.zzF);
                    }
                    zzg(zzrVar);
                    if (i4 != 0) {
                        zzs = zzj().zzs(str, "_f");
                        z4 = false;
                    } else {
                        zzs = zzj().zzs(str, "_v");
                        z4 = true;
                    }
                    if (zzs != null) {
                        long j9 = ((j4 / 3600000) + j5) * 3600000;
                        if (z4) {
                            long j10 = j4;
                            zzas(new zzqb("_fvt", j10, Long.valueOf(j9), "auto"), zzrVar);
                            zzaX().zzg();
                            zzM();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (zzrVar.zzo) {
                                bundle.putLong("_dac", 1L);
                            }
                            zzU(new zzbh("_v", new zzbf(bundle), "auto", j10), zzrVar);
                        } else {
                            Long valueOf = Long.valueOf(j9);
                            long j11 = j4;
                            zzas(new zzqb("_fot", j11, valueOf, "auto"), zzrVar);
                            zzaX().zzg();
                            zzhw zzhwVar = (zzhw) Preconditions.checkNotNull(this.zzm);
                            if (str != null && !str.isEmpty()) {
                                zzio zzioVar2 = zzhwVar.zza;
                                zzioVar2.zzaX().zzg();
                                if (zzhwVar.zza()) {
                                    zzhv zzhvVar = new zzhv(zzhwVar, str);
                                    zzioVar2.zzaX().zzg();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzioVar2.zzaT().getPackageManager();
                                    if (packageManager == null) {
                                        zzioVar2.zzaW().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzioVar2.zzaW().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str2 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str2) && zzhwVar.zza()) {
                                                    try {
                                                        zzioVar2.zzaW().zzj().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzioVar2.zzaT(), new Intent(intent), zzhvVar, 1) ? "available" : "not available");
                                                    } catch (RuntimeException e4) {
                                                        zzhwVar.zza.zzaW().zze().zzb("Exception occurred while binding to Install Referrer Service", e4.getMessage());
                                                    }
                                                } else {
                                                    zzioVar2.zzaW().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzioVar2.zzaW().zzi().zza("Install Referrer Reporter is not available");
                                }
                                zzaX().zzg();
                                zzM();
                                Bundle bundle2 = new Bundle();
                                long j12 = j5;
                                bundle2.putLong("_c", j12);
                                bundle2.putLong("_r", j12);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong("_et", j12);
                                if (zzrVar.zzo) {
                                    bundle2.putLong("_dac", j12);
                                }
                                String str3 = (String) Preconditions.checkNotNull(zzrVar.zza);
                                zzaw zzj = zzj();
                                Preconditions.checkNotEmpty(str3);
                                zzj.zzg();
                                zzj.zzav();
                                zze = zzj.zze(str3, "first_open_count");
                                zzioVar = this.zzn;
                                if (zzioVar.zzaT().getPackageManager() != null) {
                                    zzaW().zze().zzb("PackageManager is null, first open report might be inaccurate. appId", zzhe.zzn(str3));
                                } else {
                                    try {
                                        packageInfo = Wrappers.packageManager(zzioVar.zzaT()).getPackageInfo(str3, 0);
                                    } catch (PackageManager.NameNotFoundException e5) {
                                        zzaW().zze().zzc("Package info is null, first open report might be inaccurate. appId", zzhe.zzn(str3), e5);
                                        packageInfo = null;
                                    }
                                    if (packageInfo != null) {
                                        long j13 = packageInfo.firstInstallTime;
                                        if (j13 != 0) {
                                            if (j13 != packageInfo.lastUpdateTime) {
                                                applicationInfo = null;
                                                if (!zzi().zzx(null, zzgi.zzaH)) {
                                                    bundle2.putLong("_uwa", 1L);
                                                } else if (zze == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    zze = 0;
                                                }
                                                z5 = false;
                                            } else {
                                                applicationInfo = null;
                                                z5 = true;
                                            }
                                            zzas(new zzqb("_fi", j11, Long.valueOf(true != z5 ? 0L : 1L), "auto"), zzrVar);
                                            applicationInfo2 = Wrappers.packageManager(this.zzn.zzaT()).getApplicationInfo(str3, 0);
                                            if (applicationInfo2 != null) {
                                                if ((applicationInfo2.flags & 1) != 0) {
                                                    j6 = 1;
                                                    bundle2.putLong("_sys", 1L);
                                                } else {
                                                    j6 = 1;
                                                }
                                                if ((applicationInfo2.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                                    bundle2.putLong("_sysu", j6);
                                                }
                                            }
                                        }
                                    }
                                    applicationInfo = null;
                                    applicationInfo2 = Wrappers.packageManager(this.zzn.zzaT()).getApplicationInfo(str3, 0);
                                    if (applicationInfo2 != null) {
                                    }
                                }
                                if (zze >= 0) {
                                    bundle2.putLong("_pfo", zze);
                                }
                                zzU(new zzbh("_f", new zzbf(bundle2), "auto", j11), zzrVar);
                            }
                            zzhwVar.zza.zzaW().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            zzaX().zzg();
                            zzM();
                            Bundle bundle22 = new Bundle();
                            long j122 = j5;
                            bundle22.putLong("_c", j122);
                            bundle22.putLong("_r", j122);
                            bundle22.putLong("_uwa", 0L);
                            bundle22.putLong("_pfo", 0L);
                            bundle22.putLong("_sys", 0L);
                            bundle22.putLong("_sysu", 0L);
                            bundle22.putLong("_et", j122);
                            if (zzrVar.zzo) {
                            }
                            String str32 = (String) Preconditions.checkNotNull(zzrVar.zza);
                            zzaw zzj2 = zzj();
                            Preconditions.checkNotEmpty(str32);
                            zzj2.zzg();
                            zzj2.zzav();
                            zze = zzj2.zze(str32, "first_open_count");
                            zzioVar = this.zzn;
                            if (zzioVar.zzaT().getPackageManager() != null) {
                            }
                            if (zze >= 0) {
                            }
                            zzU(new zzbh("_f", new zzbf(bundle22), "auto", j11), zzrVar);
                        }
                    } else {
                        long j14 = j4;
                        if (zzrVar.zzi) {
                            zzU(new zzbh("_cd", new zzbf(new Bundle()), "auto", j14), zzrVar);
                        }
                    }
                    zzj().zzS();
                    zzj().zzL();
                }
                j4 = j8;
                j5 = 1;
                if (zzy != null) {
                    zzag("_npa", zzrVar);
                }
                if (zzi().zzx(null, zzgi.zzbl)) {
                }
                zzg(zzrVar);
                if (i4 != 0) {
                }
                if (zzs != null) {
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzad() {
        this.zzs++;
    }

    final void zzae(zzai zzaiVar) {
        zzr zzaD = zzaD((String) Preconditions.checkNotNull(zzaiVar.zza));
        if (zzaD != null) {
            zzaf(zzaiVar, zzaD);
        }
    }

    final void zzaf(zzai zzaiVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzaiVar);
        Preconditions.checkNotEmpty(zzaiVar.zza);
        Preconditions.checkNotNull(zzaiVar.zzc);
        Preconditions.checkNotEmpty(zzaiVar.zzc.zzb);
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            zzj().zzH();
            try {
                zzg(zzrVar);
                String str = (String) Preconditions.checkNotNull(zzaiVar.zza);
                zzai zzm = zzj().zzm(str, zzaiVar.zzc.zzb);
                if (zzm != null) {
                    zzaW().zzd().zzc("Removing conditional user property", zzaiVar.zza, this.zzn.zzj().zzf(zzaiVar.zzc.zzb));
                    zzj().zza(str, zzaiVar.zzc.zzb);
                    if (zzm.zze) {
                        zzj().zzP(str, zzaiVar.zzc.zzb);
                    }
                    zzbh zzbhVar = zzaiVar.zzk;
                    if (zzbhVar != null) {
                        zzbf zzbfVar = zzbhVar.zzb;
                        zzax((zzbh) Preconditions.checkNotNull(zzB().zzC(str, ((zzbh) Preconditions.checkNotNull(zzbhVar)).zza, zzbfVar != null ? zzbfVar.zzc() : null, zzm.zzb, zzbhVar.zzd, true, true)), zzrVar);
                    }
                } else {
                    zzaW().zzk().zzc("Conditional user property doesn't exist", zzhe.zzn(zzaiVar.zza), this.zzn.zzj().zzf(zzaiVar.zzc.zzb));
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzag(String str, zzr zzrVar) {
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            Boolean zzaS = zzaS(zzrVar);
            if ("_npa".equals(str) && zzaS != null) {
                zzaW().zzd().zza("Falling back to manifest metadata value for ad personalization");
                zzas(new zzqb("_npa", zzaU().currentTimeMillis(), Long.valueOf(true != zzaS.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            zzhc zzd = zzaW().zzd();
            zzio zzioVar = this.zzn;
            zzd.zzb("Removing user property", zzioVar.zzj().zzf(str));
            zzj().zzH();
            try {
                zzg(zzrVar);
                if ("_id".equals(str)) {
                    zzj().zzP((String) Preconditions.checkNotNull(zzrVar.zza), "_lair");
                }
                zzj().zzP((String) Preconditions.checkNotNull(zzrVar.zza), str);
                zzj().zzS();
                zzaW().zzd().zzb("User property removed", zzioVar.zzj().zzf(str));
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzah(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzaw zzj = zzj();
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        Preconditions.checkNotEmpty(str);
        zzj.zzg();
        zzj.zzav();
        try {
            SQLiteDatabase zzj2 = zzj.zzj();
            String[] strArr = {str};
            int delete = zzj2.delete("apps", "app_id=?", strArr) + zzj2.delete("events", "app_id=?", strArr) + zzj2.delete("events_snapshot", "app_id=?", strArr) + zzj2.delete("user_attributes", "app_id=?", strArr) + zzj2.delete("conditional_properties", "app_id=?", strArr) + zzj2.delete("raw_events", "app_id=?", strArr) + zzj2.delete("raw_events_metadata", "app_id=?", strArr) + zzj2.delete("queue", "app_id=?", strArr) + zzj2.delete("audience_filter_values", "app_id=?", strArr) + zzj2.delete("main_event_params", "app_id=?", strArr) + zzj2.delete("default_event_params", "app_id=?", strArr) + zzj2.delete("trigger_uris", "app_id=?", strArr) + zzj2.delete("upload_queue", "app_id=?", strArr);
            if (delete > 0) {
                zzj.zzu.zzaW().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e4) {
            zzj.zzu.zzaW().zze().zzc("Error resetting analytics data. appId, error", zzhe.zzn(str), e4);
        }
        if (zzrVar.zzh) {
            zzac(zzrVar);
        }
    }

    final void zzai(zzr zzrVar) {
        zzaX().zzg();
        zzM();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzba zze = zzba.zze(zzrVar.zzA);
        zzaW().zzj().zzc("Setting DMA consent for package", str, zze);
        zzaX().zzg();
        zzM();
        zzju zzf = zzba.zzc(zzd(str), 100).zzf();
        this.zzD.put(str, zze);
        zzj().zzU(str, zze);
        zzju zzf2 = zzba.zzc(zzd(str), 100).zzf();
        zzaX().zzg();
        zzM();
        zzju zzjuVar = zzju.DENIED;
        boolean z4 = zzf == zzjuVar && zzf2 == zzju.GRANTED;
        boolean z5 = zzf == zzju.GRANTED && zzf2 == zzjuVar;
        if (z4 || z5) {
            zzaW().zzj().zzb("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzj().zzo(zza(), str, false, false, false, false, false, false, false).zzf < zzi().zzh(str, zzgi.zzal)) {
                bundle.putLong("_r", 1L);
                zzaW().zzj().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzo(zza(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    public final void zzaj(String str, zzmh zzmhVar) {
        zzaX().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzmhVar != null) {
            this.zzH = str;
            this.zzG = zzmhVar;
        }
    }

    final void zzak(zzr zzrVar) {
        zzaX().zzg();
        zzM();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzjx zzk = zzjx.zzk(zzrVar.zzu, zzrVar.zzz);
        zzu(str);
        zzaW().zzj().zzc("Setting storage consent for package", str, zzk);
        zzaq(str, zzk);
    }

    final void zzal(List list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaW().zze().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    protected final void zzam() {
        zzaX().zzg();
        zzj().zzO();
        zzaw zzj = zzj();
        zzj.zzg();
        zzj.zzav();
        if (zzj.zzae()) {
            zzgg zzggVar = zzgi.zzau;
            if (((Long) zzggVar.zza(null)).longValue() != 0) {
                SQLiteDatabase zzj2 = zzj.zzj();
                zzio zzioVar = zzj.zzu;
                int delete = zzj2.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzioVar.zzaU().currentTimeMillis()), String.valueOf(zzggVar.zza(null))});
                if (delete > 0) {
                    zzioVar.zzaW().zzj().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(zzaU().currentTimeMillis());
        }
        zzaL();
    }

    final void zzan(zzai zzaiVar) {
        zzr zzaD = zzaD((String) Preconditions.checkNotNull(zzaiVar.zza));
        if (zzaD != null) {
            zzao(zzaiVar, zzaD);
        }
    }

    final void zzao(zzai zzaiVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzaiVar);
        Preconditions.checkNotEmpty(zzaiVar.zza);
        Preconditions.checkNotNull(zzaiVar.zzb);
        Preconditions.checkNotNull(zzaiVar.zzc);
        Preconditions.checkNotEmpty(zzaiVar.zzc.zzb);
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            zzai zzaiVar2 = new zzai(zzaiVar);
            boolean z4 = false;
            zzaiVar2.zze = false;
            zzj().zzH();
            try {
                zzai zzm = zzj().zzm((String) Preconditions.checkNotNull(zzaiVar2.zza), zzaiVar2.zzc.zzb);
                if (zzm != null && !zzm.zzb.equals(zzaiVar2.zzb)) {
                    zzaW().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzaiVar2.zzc.zzb), zzaiVar2.zzb, zzm.zzb);
                }
                if (zzm != null && zzm.zze) {
                    zzaiVar2.zzb = zzm.zzb;
                    zzaiVar2.zzd = zzm.zzd;
                    zzaiVar2.zzh = zzm.zzh;
                    zzaiVar2.zzf = zzm.zzf;
                    zzaiVar2.zzi = zzm.zzi;
                    zzaiVar2.zze = true;
                    zzqb zzqbVar = zzaiVar2.zzc;
                    zzaiVar2.zzc = new zzqb(zzqbVar.zzb, zzm.zzc.zzc, zzqbVar.zza(), zzm.zzc.zzf);
                } else if (TextUtils.isEmpty(zzaiVar2.zzf)) {
                    zzqb zzqbVar2 = zzaiVar2.zzc;
                    zzaiVar2.zzc = new zzqb(zzqbVar2.zzb, zzaiVar2.zzd, zzqbVar2.zza(), zzaiVar2.zzc.zzf);
                    zzaiVar2.zze = true;
                    z4 = true;
                }
                if (zzaiVar2.zze) {
                    zzqb zzqbVar3 = zzaiVar2.zzc;
                    zzqd zzqdVar = new zzqd((String) Preconditions.checkNotNull(zzaiVar2.zza), zzaiVar2.zzb, zzqbVar3.zzb, zzqbVar3.zzc, Preconditions.checkNotNull(zzqbVar3.zza()));
                    if (zzj().zzai(zzqdVar)) {
                        zzaW().zzd().zzd("User property updated immediately", zzaiVar2.zza, this.zzn.zzj().zzf(zzqdVar.zzc), zzqdVar.zze);
                    } else {
                        zzaW().zze().zzd("(2)Too many active user properties, ignoring", zzhe.zzn(zzaiVar2.zza), this.zzn.zzj().zzf(zzqdVar.zzc), zzqdVar.zze);
                    }
                    if (z4 && zzaiVar2.zzi != null) {
                        zzax(new zzbh(zzaiVar2.zzi, zzaiVar2.zzd), zzrVar);
                    }
                }
                if (zzj().zzah(zzaiVar2)) {
                    zzaW().zzd().zzd("Conditional property added", zzaiVar2.zza, this.zzn.zzj().zzf(zzaiVar2.zzc.zzb), zzaiVar2.zzc.zza());
                } else {
                    zzaW().zze().zzd("Too many conditional properties, ignoring", zzhe.zzn(zzaiVar2.zza), this.zzn.zzj().zzf(zzaiVar2.zzc.zzb), zzaiVar2.zzc.zza());
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzap(String str, zzag zzagVar) {
        long j4;
        zzam zzi = zzi();
        zzgg zzggVar = zzgi.zzaP;
        if (zzi.zzx(null, zzggVar)) {
            zzaX().zzg();
            zzM();
            zzaw zzj = zzj();
            long j5 = zzagVar.zza;
            zzpz zzx = zzj.zzx(j5);
            if (zzx == null) {
                zzaW().zzk().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j5));
                return;
            }
            String zzh = zzx.zzh();
            if (zzagVar.zzb != zzme.SUCCESS.zza()) {
                if (zzagVar.zzb == zzme.BACKOFF.zza()) {
                    Map map = this.zzF;
                    zzpt zzptVar = (zzpt) map.get(zzh);
                    if (zzptVar == null) {
                        zzptVar = new zzpt(this);
                        map.put(zzh, zzptVar);
                    } else {
                        zzptVar.zzb();
                    }
                    j4 = zzptVar.zzc;
                    zzaW().zzj().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, zzh, Long.valueOf((j4 - zzaU().currentTimeMillis()) / 1000));
                }
                zzaw zzj2 = zzj();
                Long valueOf = Long.valueOf(zzagVar.zza);
                zzj2.zzN(valueOf);
                zzaW().zzj().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
                return;
            }
            Map map2 = this.zzF;
            if (map2.containsKey(zzh)) {
                map2.remove(zzh);
            }
            zzaw zzj3 = zzj();
            Long valueOf2 = Long.valueOf(j5);
            zzj3.zzK(valueOf2);
            zzaW().zzj().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
            long j6 = zzagVar.zzc;
            if (j6 > 0) {
                zzaw zzj4 = zzj();
                zzio zzioVar = zzj4.zzu;
                if (zzioVar.zzf().zzx(null, zzggVar)) {
                    zzj4.zzg();
                    zzj4.zzav();
                    Long valueOf3 = Long.valueOf(j6);
                    Preconditions.checkNotNull(valueOf3);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(zzmf.GOOGLE_SIGNAL.zza()));
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzioVar.zzaU().currentTimeMillis()));
                    try {
                        if (zzj4.zzj().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j6), str, String.valueOf(zzmf.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                            zzioVar.zzaW().zzk().zzc("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                        }
                    } catch (SQLiteException e4) {
                        zzj4.zzu.zzaW().zze().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j6), e4);
                        throw e4;
                    }
                }
                zzaW().zzj().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzagVar.zzc));
                zzav(str);
            }
        }
    }

    final void zzaq(String str, zzjx zzjxVar) {
        zzaX().zzg();
        zzM();
        this.zzC.put(str, zzjxVar);
        zzj().zzX(str, zzjxVar);
    }

    final void zzar(String str, boolean z4, Long l4, Long l5) {
        zzh zzl = zzj().zzl(str);
        if (zzl != null) {
            zzl.zzaF(z4);
            zzl.zzaG(l4);
            zzl.zzaH(l5);
            if (zzl.zzaK()) {
                zzj().zzT(zzl, false, false);
            }
        }
    }

    final void zzas(zzqb zzqbVar, zzr zzrVar) {
        zzqd zzy;
        long j4;
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            zzqf zzB = zzB();
            String str = zzqbVar.zzb;
            int zzj = zzB.zzj(str);
            if (zzj != 0) {
                zzqf zzB2 = zzB();
                zzi();
                zzB().zzR(this.zzK, zzrVar.zza, zzj, "_ev", zzB2.zzG(str, 24, true), str != null ? str.length() : 0);
                return;
            }
            int zzd = zzB().zzd(str, zzqbVar.zza());
            if (zzd != 0) {
                zzqf zzB3 = zzB();
                zzi();
                String zzG = zzB3.zzG(str, 24, true);
                Object zza = zzqbVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    r13 = zza.toString().length();
                }
                zzB().zzR(this.zzK, zzrVar.zza, zzd, "_ev", zzG, r13);
                return;
            }
            Object zzE = zzB().zzE(str, zzqbVar.zza());
            if (zzE != null) {
                if ("_sid".equals(str)) {
                    long j5 = zzqbVar.zzc;
                    String str2 = zzqbVar.zzf;
                    String str3 = (String) Preconditions.checkNotNull(zzrVar.zza);
                    zzqd zzy2 = zzj().zzy(str3, "_sno");
                    if (zzy2 != null) {
                        Object obj = zzy2.zze;
                        if (obj instanceof Long) {
                            j4 = ((Long) obj).longValue();
                            zzas(new zzqb("_sno", j5, Long.valueOf(j4 + 1), str2), zzrVar);
                        }
                    }
                    if (zzy2 != null) {
                        zzaW().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzy2.zze);
                    }
                    zzbd zzs = zzj().zzs(str3, "_s");
                    if (zzs != null) {
                        zzhc zzj2 = zzaW().zzj();
                        long j6 = zzs.zzc;
                        zzj2.zzb("Backfill the session number. Last used session number", Long.valueOf(j6));
                        j4 = j6;
                    } else {
                        j4 = 0;
                    }
                    zzas(new zzqb("_sno", j5, Long.valueOf(j4 + 1), str2), zzrVar);
                }
                String str4 = zzrVar.zza;
                zzqd zzqdVar = new zzqd((String) Preconditions.checkNotNull(str4), (String) Preconditions.checkNotNull(zzqbVar.zzf), str, zzqbVar.zzc, zzE);
                zzhc zzj3 = zzaW().zzj();
                zzio zzioVar = this.zzn;
                String str5 = zzqdVar.zzc;
                zzj3.zzc("Setting user property", zzioVar.zzj().zzf(str5), zzE);
                zzj().zzH();
                try {
                    if ("_id".equals(str5) && (zzy = zzj().zzy(str4, "_id")) != null && !zzqdVar.zze.equals(zzy.zze)) {
                        zzj().zzP(str4, "_lair");
                    }
                    zzg(zzrVar);
                    boolean zzai = zzj().zzai(zzqdVar);
                    if ("_sid".equals(str)) {
                        long zzd2 = zzA().zzd(zzrVar.zzw);
                        zzh zzl = zzj().zzl(str4);
                        if (zzl != null) {
                            zzl.zzaB(zzd2);
                            if (zzl.zzaK()) {
                                zzj().zzT(zzl, false, false);
                            }
                        }
                    }
                    zzj().zzS();
                    if (!zzai) {
                        zzaW().zze().zzc("Too many unique user properties are set. Ignoring user property", zzioVar.zzj().zzf(str5), zzqdVar.zze);
                        zzB().zzR(this.zzK, str4, 9, null, null, 0);
                    }
                    zzj().zzL();
                } catch (Throwable th) {
                    zzj().zzL();
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0194, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzat() {
        zzaw zzj;
        long zzF;
        SQLiteException e4;
        zzh zzl;
        zzaX().zzg();
        zzM();
        this.zzw = true;
        try {
            zzio zzioVar = this.zzn;
            zzioVar.zzaV();
            Boolean zzl2 = zzioVar.zzu().zzl();
            if (zzl2 == null) {
                zzaW().zzk().zza("Upload data called on the client side before use of service was decided");
            } else if (zzl2.booleanValue()) {
                zzaW().zze().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else {
                zzaX().zzg();
                if (this.zzz != null) {
                    zzaW().zzj().zza("Uploading requested multiple times");
                } else if (zzp().zzd()) {
                    ?? currentTimeMillis = zzaU().currentTimeMillis();
                    Cursor cursor = null;
                    r7 = null;
                    Cursor cursor2 = null;
                    r7 = null;
                    r7 = null;
                    String str = null;
                    int zzh = zzi().zzh(null, zzgi.zzah);
                    zzi();
                    long zzF2 = currentTimeMillis - zzam.zzF();
                    for (int i4 = 0; i4 < zzh && zzaM(null, zzF2); i4++) {
                    }
                    zzqr.zzb();
                    zzaX().zzg();
                    zzaJ();
                    long zza = this.zzk.zzd.zza();
                    if (zza != 0) {
                        zzaW().zzd().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza)));
                    }
                    String zzA = zzj().zzA();
                    long j4 = -1;
                    if (TextUtils.isEmpty(zzA)) {
                        try {
                            this.zzB = -1L;
                            zzj = zzj();
                            zzi();
                            zzF = currentTimeMillis - zzam.zzF();
                            zzj.zzg();
                            zzj.zzav();
                        } catch (Throwable th) {
                            th = th;
                            cursor = currentTimeMillis;
                        }
                        try {
                            currentTimeMillis = zzj.zzj().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzF)});
                            try {
                                if (currentTimeMillis.moveToFirst()) {
                                    str = currentTimeMillis.getString(0);
                                } else {
                                    zzj.zzu.zzaW().zzj().zza("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e5) {
                                e4 = e5;
                                zzj.zzu.zzaW().zze().zzb("Error selecting expired configs", e4);
                            }
                        } catch (SQLiteException e6) {
                            e4 = e6;
                            currentTimeMillis = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                        currentTimeMillis.close();
                        if (!TextUtils.isEmpty(str) && (zzl = zzj().zzl(str)) != null) {
                            zzO(zzl);
                        }
                    } else {
                        if (this.zzB == -1) {
                            zzaw zzj2 = zzj();
                            try {
                                try {
                                    cursor2 = zzj2.zzj().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursor2.moveToFirst()) {
                                        j4 = cursor2.getLong(0);
                                    }
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            } catch (SQLiteException e7) {
                                zzj2.zzu.zzaW().zze().zzb("Error querying raw events", e7);
                            }
                            cursor2.close();
                            this.zzB = j4;
                        }
                        zzau(zzA, currentTimeMillis);
                    }
                } else {
                    zzaW().zzj().zza("Network not connected, ignoring upload request");
                    zzaL();
                }
            }
            this.zzw = false;
            zzaH();
        } catch (Throwable th3) {
            this.zzw = false;
            zzaH();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0224, code lost:
    
        if (r11 == null) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzau(String str, long j4) {
        Cursor cursor;
        Cursor cursor2;
        List list;
        boolean z4;
        com.google.android.gms.internal.measurement.zzhv zzhvVar;
        String str2;
        zzph zzphVar;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        com.google.android.gms.internal.measurement.zzim zzb2;
        String str3;
        Cursor cursor3;
        byte[] blob;
        zzqa zzA;
        long j5;
        com.google.android.gms.internal.measurement.zzhx zzhxVar;
        long j6;
        long j7;
        int zzh = zzi().zzh(str, zzgi.zzg);
        int i5 = 0;
        int max = Math.max(0, zzi().zzh(str, zzgi.zzh));
        zzaw zzj = zzj();
        zzj.zzg();
        zzj.zzav();
        int i6 = 1;
        Preconditions.checkArgument(zzh > 0);
        Preconditions.checkArgument(max > 0);
        Preconditions.checkNotEmpty(str);
        try {
            cursor2 = zzj.zzj().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(zzh));
            try {
            } catch (SQLiteException e4) {
                e = e4;
                cursor3 = cursor2;
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (!cursor2.moveToFirst()) {
            list = Collections.EMPTY_LIST;
            cursor2.close();
            if (list.isEmpty()) {
                return;
            }
            if (zzu(str).zzr(zzjw.AD_STORAGE)) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str3 = null;
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzhx zzhxVar2 = (com.google.android.gms.internal.measurement.zzhx) ((Pair) it.next()).first;
                    if (!zzhxVar2.zzT().isEmpty()) {
                        str3 = zzhxVar2.zzT();
                        break;
                    }
                }
                if (str3 != null) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= list.size()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzhx zzhxVar3 = (com.google.android.gms.internal.measurement.zzhx) ((Pair) list.get(i7)).first;
                        if (!zzhxVar3.zzT().isEmpty() && !zzhxVar3.zzT().equals(str3)) {
                            list = list.subList(0, i7);
                            break;
                        }
                        i7++;
                    }
                }
            }
            com.google.android.gms.internal.measurement.zzht zzb3 = com.google.android.gms.internal.measurement.zzhv.zzb();
            int size = list.size();
            List arrayList = new ArrayList(list.size());
            boolean z8 = zzi().zzy(str) && zzu(str).zzr(zzjw.AD_STORAGE);
            boolean zzr = zzu(str).zzr(zzjw.AD_STORAGE);
            boolean zzr2 = zzu(str).zzr(zzjw.ANALYTICS_STORAGE);
            zzrd.zzb();
            boolean zzx = zzi().zzx(str, zzgi.zzaL);
            zzpi zzpiVar = this.zzl;
            zzph zza = zzpiVar.zza(str);
            int i8 = 0;
            while (i8 < size) {
                com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) ((com.google.android.gms.internal.measurement.zzhx) ((Pair) list.get(i8)).first).zzch();
                List list2 = list;
                arrayList.add((Long) ((Pair) list.get(i8)).second);
                zzi().zzj();
                boolean z9 = z8;
                boolean z10 = zzr;
                zzhwVar.zzaB(119002L);
                zzhwVar.zzaA(j4);
                this.zzn.zzaV();
                zzhwVar.zzau(false);
                if (!z9) {
                    zzhwVar.zzt();
                }
                if (!z10) {
                    zzhwVar.zzz();
                    zzhwVar.zzw();
                }
                if (!zzr2) {
                    zzhwVar.zzq();
                }
                zzN(str, zzhwVar);
                if (!zzx) {
                    zzhwVar.zzA();
                }
                if (!zzr2) {
                    zzhwVar.zzr();
                }
                String zzaL = zzhwVar.zzaL();
                if (TextUtils.isEmpty(zzaL) || zzaL.equals("00000000-0000-0000-0000-000000000000")) {
                    ArrayList arrayList2 = new ArrayList(zzhwVar.zzaM());
                    Iterator it2 = arrayList2.iterator();
                    z5 = z9;
                    i4 = size;
                    Long l4 = null;
                    Long l5 = null;
                    boolean z11 = false;
                    boolean z12 = false;
                    while (it2.hasNext()) {
                        Iterator it3 = it2;
                        com.google.android.gms.internal.measurement.zzhm zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it2.next();
                        boolean z13 = zzr2;
                        boolean z14 = zzx;
                        if ("_fx".equals(zzhmVar.zzh())) {
                            it3.remove();
                            zzr2 = z13;
                            it2 = it3;
                            zzx = z14;
                            z11 = true;
                        } else if ("_f".equals(zzhmVar.zzh())) {
                            zzA();
                            com.google.android.gms.internal.measurement.zzhq zzG = zzqa.zzG(zzhmVar, "_pfo");
                            if (zzG != null) {
                                l4 = Long.valueOf(zzG.zzd());
                            }
                            zzA();
                            com.google.android.gms.internal.measurement.zzhq zzG2 = zzqa.zzG(zzhmVar, "_uwa");
                            if (zzG2 != null) {
                                l5 = Long.valueOf(zzG2.zzd());
                            }
                            zzr2 = z13;
                            it2 = it3;
                            zzx = z14;
                        } else {
                            zzr2 = z13;
                            it2 = it3;
                            zzx = z14;
                        }
                        z12 = true;
                    }
                    z6 = zzr2;
                    z7 = zzx;
                    if (z11) {
                        zzhwVar.zzu();
                        zzhwVar.zzj(arrayList2);
                    }
                    if (z12) {
                        zzar(zzhwVar.zzaF(), true, l4, l5);
                    }
                } else {
                    z5 = z9;
                    i4 = size;
                    z6 = zzr2;
                    z7 = zzx;
                }
                if (zzhwVar.zzc() != 0) {
                    if (zzi().zzx(str, zzgi.zzaB)) {
                        zzhwVar.zzQ(zzA().zzf(((com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba()).zzcd()));
                    }
                    if (zzi().zzx(null, zzgi.zzaP) && (zzb2 = zza.zzb()) != null) {
                        zzhwVar.zzaw(zzb2);
                    }
                    zzb3.zzc(zzhwVar);
                }
                i8++;
                zzr = z10;
                list = list2;
                z8 = z5;
                size = i4;
                zzr2 = z6;
                zzx = z7;
            }
            if (zzb3.zza() == 0) {
                zzal(arrayList);
                zzY(false, InterfaceC1490j3.c.b.f16804e, null, null, str, Collections.EMPTY_LIST);
                return;
            }
            com.google.android.gms.internal.measurement.zzhv zzhvVar2 = (com.google.android.gms.internal.measurement.zzhv) zzb3.zzba();
            List arrayList3 = new ArrayList();
            boolean z15 = zzi().zzx(null, zzgi.zzaP) && zza.zza() == zzmf.SGTM_CLIENT;
            if (zza.zza() == zzmf.SGTM) {
                z4 = z15;
            } else {
                if (!z15) {
                    zzhvVar = zzhvVar2;
                    if (zzi().zzx(null, zzgi.zzaO) || zzp().zzd()) {
                        Object zzq = !Log.isLoggable(zzaW().zzr(), 2) ? zzA().zzq(zzhvVar) : null;
                        zzA();
                        byte[] zzcd = zzhvVar.zzcd();
                        zzal(arrayList);
                        this.zzk.zze.zzb(j4);
                        zzaW().zzj().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(zzcd.length), zzq);
                        this.zzv = true;
                        zzp().zzc(str, zza, zzhvVar, new zzpl(this, str, arrayList3));
                        return;
                    }
                    return;
                }
                z4 = true;
            }
            Iterator it4 = ((com.google.android.gms.internal.measurement.zzhv) zzb3.zzba()).zzh().iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (((com.google.android.gms.internal.measurement.zzhx) it4.next()).zzbI()) {
                        str2 = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            com.google.android.gms.internal.measurement.zzhv zzhvVar3 = (com.google.android.gms.internal.measurement.zzhv) zzb3.zzba();
            zzaX().zzg();
            zzM();
            com.google.android.gms.internal.measurement.zzht zzc = com.google.android.gms.internal.measurement.zzhv.zzc(zzhvVar3);
            if (!TextUtils.isEmpty(str2)) {
                zzc.zzf(str2);
            }
            String zzm = zzr().zzm(str);
            if (!TextUtils.isEmpty(zzm)) {
                zzc.zzg(zzm);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = zzhvVar3.zzh().iterator();
            while (it5.hasNext()) {
                com.google.android.gms.internal.measurement.zzhw zzA2 = com.google.android.gms.internal.measurement.zzhx.zzA((com.google.android.gms.internal.measurement.zzhx) it5.next());
                zzA2.zzt();
                arrayList4.add((com.google.android.gms.internal.measurement.zzhx) zzA2.zzba());
            }
            zzc.zzd();
            zzc.zzb(arrayList4);
            zzam zzi = zzi();
            zzgg zzggVar = zzgi.zzaN;
            if (zzi.zzx(null, zzggVar)) {
                zzaW().zzj().zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", TextUtils.isEmpty(str2) ? "null" : zzc.zzi());
            } else {
                zzaW().zzj().zza("[sgtm] Processed MeasurementBatch for sGTM.");
            }
            zzhvVar = (com.google.android.gms.internal.measurement.zzhv) zzc.zzba();
            if (!TextUtils.isEmpty(str2) && zzi().zzx(null, zzggVar)) {
                com.google.android.gms.internal.measurement.zzhv zzhvVar4 = (com.google.android.gms.internal.measurement.zzhv) zzb3.zzba();
                zzaX().zzg();
                zzM();
                com.google.android.gms.internal.measurement.zzht zzb4 = com.google.android.gms.internal.measurement.zzhv.zzb();
                zzaW().zzj().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", str2);
                zzb4.zzf(str2);
                for (com.google.android.gms.internal.measurement.zzhx zzhxVar4 : zzhvVar4.zzh()) {
                    com.google.android.gms.internal.measurement.zzhw zzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                    zzz.zzY(zzhxVar4.zzN());
                    zzz.zzV(zzhxVar4.zzd());
                    zzb4.zzc(zzz);
                }
                com.google.android.gms.internal.measurement.zzhv zzhvVar5 = (com.google.android.gms.internal.measurement.zzhv) zzb4.zzba();
                String zzm2 = zzpiVar.zzg.zzr().zzm(str);
                if (TextUtils.isEmpty(zzm2)) {
                    zzphVar = new zzph((String) zzgi.zzr.zza(null), Collections.EMPTY_MAP, z4 ? zzmf.GOOGLE_SIGNAL_PENDING : zzmf.GOOGLE_SIGNAL, null);
                } else {
                    Uri parse = Uri.parse((String) zzgi.zzr.zza(null));
                    Uri.Builder buildUpon = parse.buildUpon();
                    buildUpon.authority(zzm2 + "." + parse.getAuthority());
                    zzphVar = new zzph(buildUpon.build().toString(), Collections.EMPTY_MAP, z4 ? zzmf.GOOGLE_SIGNAL_PENDING : zzmf.GOOGLE_SIGNAL, null);
                }
                arrayList3.add(Pair.create(zzhvVar5, zzphVar));
            }
            if (z4) {
                com.google.android.gms.internal.measurement.zzht zzhtVar = (com.google.android.gms.internal.measurement.zzht) zzhvVar.zzch();
                for (int i9 = 0; i9 < zzhvVar.zza(); i9++) {
                    com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzhvVar.zze(i9).zzch();
                    zzhwVar2.zzC();
                    zzhwVar2.zzO(j4);
                    zzhtVar.zze(i9, zzhwVar2);
                }
                arrayList3.add(Pair.create((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba(), zza));
                zzal(arrayList);
                zzY(false, InterfaceC1490j3.c.b.f16804e, null, null, str, arrayList3);
                if (zzay(str, zza.zzc())) {
                    zzaW().zzj().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent.setPackage(str);
                    zzaK(this.zzn.zzaT(), intent);
                    return;
                }
                return;
            }
            if (zzi().zzx(null, zzgi.zzaO)) {
            }
            if (!Log.isLoggable(zzaW().zzr(), 2)) {
            }
            zzA();
            byte[] zzcd2 = zzhvVar.zzcd();
            zzal(arrayList);
            this.zzk.zze.zzb(j4);
            zzaW().zzj().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(zzcd2.length), zzq);
            this.zzv = true;
            zzp().zzc(str, zza, zzhvVar, new zzpl(this, str, arrayList3));
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            long j8 = cursor2.getLong(i5);
            try {
                blob = cursor2.getBlob(i6);
                zzA = zzj.zzg.zzA();
            } catch (IOException e6) {
                e = e6;
                cursor3 = cursor2;
            }
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    cursor3 = cursor2;
                    try {
                        try {
                            byteArrayOutputStream.write(bArr, 0, read);
                            cursor2 = cursor3;
                        } catch (IOException e7) {
                            e = e7;
                            try {
                                zzA.zzu.zzaW().zze().zzb("Failed to ungzip content", e);
                                throw e;
                            } catch (IOException e8) {
                                e = e8;
                                zzj.zzu.zzaW().zze().zzc("Failed to unzip queued bundle. appId", zzhe.zzn(str), e);
                                if (cursor3.moveToNext()) {
                                    break;
                                }
                                cursor2 = cursor3;
                                i5 = 0;
                                i6 = 1;
                                cursor3.close();
                                list = arrayList5;
                                if (list.isEmpty()) {
                                }
                            }
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        cursor2 = cursor3;
                        try {
                            zzj.zzu.zzaW().zze().zzc("Error querying bundles. appId", zzhe.zzn(str), e);
                            list = Collections.EMPTY_LIST;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = cursor3;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (!arrayList5.isEmpty() && byteArray.length + i10 > max) {
                    break;
                }
                try {
                    com.google.android.gms.internal.measurement.zzhw zzhwVar3 = (com.google.android.gms.internal.measurement.zzhw) zzqa.zzp(com.google.android.gms.internal.measurement.zzhx.zzz(), byteArray);
                    if (!arrayList5.isEmpty()) {
                        com.google.android.gms.internal.measurement.zzhx zzhxVar5 = (com.google.android.gms.internal.measurement.zzhx) ((Pair) arrayList5.get(0)).first;
                        com.google.android.gms.internal.measurement.zzhx zzhxVar6 = (com.google.android.gms.internal.measurement.zzhx) zzhwVar3.zzba();
                        if (!zzhxVar5.zzK().equals(zzhxVar6.zzK()) || !zzhxVar5.zzJ().equals(zzhxVar6.zzJ()) || zzhxVar5.zzbu() != zzhxVar6.zzbu() || !zzhxVar5.zzL().equals(zzhxVar6.zzL())) {
                            break;
                        }
                        Iterator it6 = zzhxVar5.zzY().iterator();
                        while (true) {
                            j5 = -1;
                            Iterator it7 = it6;
                            if (!it6.hasNext()) {
                                zzhxVar = zzhxVar6;
                                j6 = -1;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzio zzioVar = (com.google.android.gms.internal.measurement.zzio) it7.next();
                            zzhxVar = zzhxVar6;
                            if ("_npa".equals(zzioVar.zzg())) {
                                j6 = zzioVar.zzc();
                                break;
                            } else {
                                it6 = it7;
                                zzhxVar6 = zzhxVar;
                            }
                        }
                        Iterator it8 = zzhxVar.zzY().iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                j7 = j6;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzio zzioVar2 = (com.google.android.gms.internal.measurement.zzio) it8.next();
                            j7 = j6;
                            if ("_npa".equals(zzioVar2.zzg())) {
                                j5 = zzioVar2.zzc();
                                break;
                            }
                            j6 = j7;
                        }
                        if (j7 != j5) {
                            break;
                        }
                    }
                    if (!cursor2.isNull(2)) {
                        zzhwVar3.zzat(cursor2.getInt(2));
                    }
                    i10 += byteArray.length;
                    arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.zzhx) zzhwVar3.zzba(), Long.valueOf(j8)));
                } catch (IOException e10) {
                    zzj.zzu.zzaW().zze().zzc("Failed to merge queued bundle. appId", zzhe.zzn(str), e10);
                }
                cursor3 = cursor2;
                if (cursor3.moveToNext() || i10 > max) {
                    break;
                    break;
                } else {
                    cursor2 = cursor3;
                    i5 = 0;
                    i6 = 1;
                }
            } catch (IOException e11) {
                e = e11;
                cursor3 = cursor2;
            }
        }
        cursor3 = cursor2;
        cursor3.close();
        list = arrayList5;
        if (list.isEmpty()) {
        }
    }

    final void zzav(String str) {
        com.google.android.gms.internal.measurement.zzhv zzg;
        zzaX().zzg();
        zzM();
        this.zzw = true;
        try {
            zzio zzioVar = this.zzn;
            zzioVar.zzaV();
            Boolean zzl = zzioVar.zzu().zzl();
            if (zzl == null) {
                zzaW().zzk().zza("Upload data called on the client side before use of service was decided");
            } else if (zzl.booleanValue()) {
                zzaW().zze().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else if (!zzp().zzd()) {
                zzaW().zzj().zza("Network not connected, ignoring upload request");
                zzaL();
            } else if (zzj().zzY(str)) {
                zzpz zzw = zzj().zzw(str);
                if (zzw != null && (zzg = zzw.zzg()) != null) {
                    zzaW().zzj().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzw.zzd(), zzw.zzh());
                    byte[] zzcd = zzg.zzcd();
                    if (Log.isLoggable(zzaW().zzr(), 2)) {
                        zzaW().zzj().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(zzcd.length), zzA().zzq(zzg));
                    }
                    this.zzv = true;
                    zzp().zzc(str, zzw.zzf(), zzg, new zzpm(this, str, zzw));
                }
            } else {
                zzaW().zzj().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
            this.zzw = false;
            zzaH();
        } catch (Throwable th) {
            this.zzw = false;
            zzaH();
            throw th;
        }
    }

    final void zzaw(String str, com.google.android.gms.internal.measurement.zzhp zzhpVar, Bundle bundle, String str2) {
        List listOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long zzd = (zzqf.zzap(zzhpVar.zzl()) || zzqf.zzap(str)) ? zzi().zzd(str2, true) : zzi().zzc(str2, true);
        long codePointCount = zzhpVar.zzm().codePointCount(0, zzhpVar.zzm().length());
        zzqf zzB = zzB();
        String zzl = zzhpVar.zzl();
        zzi();
        String zzG = zzB.zzG(zzl, 40, true);
        if (codePointCount <= zzd || listOf.contains(zzhpVar.zzl())) {
            return;
        }
        if ("_ev".equals(zzhpVar.zzl())) {
            bundle.putString("_ev", zzB().zzG(zzhpVar.zzm(), zzi().zzd(str2, true), true));
            return;
        }
        zzaW().zzl().zzc("Param value is too long; discarded. Name, value length", zzG, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", zzG);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(zzhpVar.zzl());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:367|(2:369|(10:371|372|373|(1:375)|58|(0)(0)|61|(0)(0)|67|68))|376|377|378|379|380|381|372|373|(0)|58|(0)(0)|61|(0)(0)|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(57:(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))|84|85|(1:87)|88|(2:92|(1:94))|95|(2:105|106)|109|(6:110|111|112|113|114|115)|116|(1:118)|119|(2:121|(1:125)(1:124))(1:334)|126|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|(1:144)|145|(2:147|(1:149))|150|(6:154|(1:158)|159|(1:161)(1:194)|162|(1:164)(15:165|(1:167)(1:193)|168|(1:170)(1:192)|171|(1:173)(1:191)|174|(1:176)(1:190)|177|(1:179)(1:189)|180|(1:182)(1:188)|183|(1:185)(1:187)|186))|195|(1:197)|198|(1:200)(1:333)|(13:(35:204|(4:207|(3:209|210|(2:212|(2:214|216)(1:324))(1:326))(1:330)|325|205)|331|217|(1:219)|(1:221)|222|(1:224)|225|(2:229|(4:231|(1:233)|234|(29:242|(1:244)(1:322)|245|(1:247)|248|249|(2:251|(1:253))|254|(3:256|(1:258)|259)(1:321)|260|(1:264)|265|(1:267)|268|(4:271|(2:277|278)|279|269)|283|284|285|286|287|(2:288|(2:290|(1:292)(1:307))(3:308|309|(1:314)(1:313)))|293|294|295|296|(1:298)(2:303|304)|299|300|301)))|323|249|(0)|254|(0)(0)|260|(2:262|264)|265|(0)|268|(1:269)|283|284|285|286|287|(3:288|(0)(0)|307)|293|294|295|296|(0)(0)|299|300|301)|285|286|287|(3:288|(0)(0)|307)|293|294|295|296|(0)(0)|299|300|301)|332|(0)|222|(0)|225|(3:227|229|(0))|323|249|(0)|254|(0)(0)|260|(0)|265|(0)|268|(1:269)|283|284) */
    /* JADX WARN: Can't wrap try/catch for region: R(59:336|337|116|(0)|119|(0)(0)|126|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|142|(0)|145|(0)|150|(7:152|154|(2:156|158)|159|(0)(0)|162|(0)(0))|195|(0)|198|(0)(0)|(36:202|204|(1:205)|331|217|(0)|(0)|222|(0)|225|(0)|323|249|(0)|254|(0)(0)|260|(0)|265|(0)|268|(1:269)|283|284|285|286|287|(3:288|(0)(0)|307)|293|294|295|296|(0)(0)|299|300|301)|332|(0)|222|(0)|225|(0)|323|249|(0)|254|(0)(0)|260|(0)|265|(0)|268|(1:269)|283|284|285|286|287|(3:288|(0)(0)|307)|293|294|295|296|(0)(0)|299|300|301) */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0b1e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0b25, code lost:
    
        r2.zzu.zzaW().zze().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r13.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0b3b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0b56, code lost:
    
        zzaW().zze().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r10.zzaF()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0286, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0287, code lost:
    
        r9.zzu.zzaW().zze().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r10), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x050a A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0546 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05fa A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0605 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0610 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x061b A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0627 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0638 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0662 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06b1 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0722 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x074b A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x077c A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07e3 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07f2 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0815 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0829 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x08e8 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0900 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0967 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0988 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09a4 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a63 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0b0a A[Catch: all -> 0x0176, SQLiteException -> 0x0b1e, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0b1e, blocks: (B:296:0x0afb, B:298:0x0b0a), top: B:295:0x0afb, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a70 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x074e A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05b5 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0309 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02bf A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0374 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x032a, B:63:0x0374, B:65:0x0379, B:66:0x0390, B:70:0x039b, B:72:0x03b3, B:74:0x03b8, B:75:0x03cf, B:78:0x03ed, B:82:0x040e, B:83:0x0425, B:84:0x042e, B:87:0x044b, B:88:0x045f, B:90:0x0467, B:92:0x0475, B:94:0x047b, B:95:0x0482, B:97:0x048e, B:99:0x0496, B:101:0x049e, B:103:0x04a4, B:106:0x04a8, B:109:0x04b4, B:111:0x04c1, B:114:0x04e6, B:118:0x050a, B:119:0x051f, B:121:0x0546, B:124:0x055d, B:125:0x0598, B:127:0x05c2, B:129:0x05fa, B:130:0x05fd, B:132:0x0605, B:133:0x0608, B:135:0x0610, B:136:0x0613, B:138:0x061b, B:139:0x061e, B:141:0x0627, B:142:0x062b, B:144:0x0638, B:145:0x063b, B:147:0x0662, B:149:0x066a, B:150:0x066d, B:152:0x067c, B:154:0x0686, B:158:0x069b, B:162:0x06a8, B:165:0x06b1, B:168:0x06be, B:171:0x06cc, B:174:0x06da, B:177:0x06e8, B:180:0x06f6, B:183:0x0702, B:186:0x0710, B:195:0x071c, B:197:0x0722, B:198:0x0725, B:200:0x074b, B:202:0x0754, B:204:0x075d, B:205:0x0776, B:207:0x077c, B:210:0x0792, B:212:0x079e, B:214:0x07ab, B:328:0x07c9, B:217:0x07d9, B:221:0x07e3, B:222:0x07e6, B:224:0x07f2, B:225:0x07f7, B:227:0x0815, B:229:0x0819, B:231:0x0829, B:233:0x0834, B:234:0x083d, B:236:0x0847, B:238:0x0853, B:240:0x085d, B:242:0x0863, B:244:0x0872, B:245:0x088e, B:247:0x0894, B:248:0x089d, B:249:0x08ac, B:251:0x08e8, B:253:0x08f1, B:254:0x08f6, B:256:0x0900, B:258:0x091c, B:259:0x0927, B:260:0x095f, B:262:0x0967, B:264:0x0971, B:265:0x097e, B:267:0x0988, B:268:0x0995, B:269:0x099e, B:271:0x09a4, B:273:0x09e0, B:275:0x09ea, B:277:0x09fc, B:284:0x0a02, B:286:0x0a47, B:287:0x0a52, B:288:0x0a5d, B:290:0x0a63, B:294:0x0ab0, B:296:0x0afb, B:298:0x0b0a, B:299:0x0b6b, B:304:0x0b22, B:306:0x0b25, B:309:0x0a70, B:311:0x0a9c, B:317:0x0b3e, B:318:0x0b55, B:320:0x0b56, B:333:0x074e, B:334:0x05b5, B:337:0x04f1, B:341:0x0309, B:342:0x0310, B:344:0x0316, B:346:0x0322, B:351:0x0193, B:353:0x019d, B:355:0x01b2, B:360:0x01ce, B:363:0x0202, B:365:0x0208, B:367:0x0216, B:369:0x0226, B:371:0x0233, B:373:0x02b5, B:375:0x02bf, B:377:0x025a, B:379:0x0273, B:381:0x029b, B:384:0x0287, B:386:0x01da, B:388:0x01f8), top: B:42:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0399  */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Long, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzax(zzbh zzbhVar, zzr zzrVar) {
        String str;
        long longValue;
        String str2;
        zzbh zzbhVar2;
        Object obj;
        zzqd zzqdVar;
        boolean z4;
        zzqd zzqdVar2;
        zzbf zzbfVar;
        long j4;
        long zzH;
        String str3;
        long j5;
        String str4;
        zzbd zzs;
        zzbd zzc;
        String str5;
        com.google.android.gms.internal.measurement.zzhw zzz;
        String str6;
        String str7;
        String str8;
        long j6;
        String str9;
        zzjx zzl;
        long j7;
        Map zzd;
        ArrayList arrayList;
        String str10;
        zzjx zzl2;
        zzjw zzjwVar;
        String str11;
        zzjx zzjxVar;
        zzbc zzbcVar;
        zzio zzioVar;
        zzh zzl3;
        int i4;
        List zzE;
        int i5;
        zzaw zzj;
        com.google.android.gms.internal.measurement.zzhx zzhxVar;
        zzaw zzj2;
        zzbe zzbeVar;
        int i6;
        ContentValues contentValues;
        Pair zzd2;
        zzh zzl4;
        zzh zzhVar;
        long j8;
        Object obj2;
        zzqd zzy;
        Preconditions.checkNotNull(zzrVar);
        String str12 = zzrVar.zza;
        Preconditions.checkNotEmpty(str12);
        long nanoTime = System.nanoTime();
        zzaX().zzg();
        zzM();
        zzA();
        if (zzqa.zzE(zzbhVar, zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            zzif zzr = zzr();
            String str13 = zzbhVar.zza;
            if (zzr.zzx(str12, str13)) {
                zzaW().zzk().zzc("Dropping blocked event. appId", zzhe.zzn(str12), this.zzn.zzj().zzd(str13));
                if (!zzr().zzt(str12) && !zzr().zzy(str12)) {
                    if ("_err".equals(str13)) {
                        return;
                    }
                    zzB().zzR(this.zzK, str12, 11, "_ev", str13, 0);
                    return;
                }
                zzh zzl5 = zzj().zzl(str12);
                if (zzl5 != null) {
                    long abs = Math.abs(zzaU().currentTimeMillis() - Math.max(zzl5.zzp(), zzl5.zzg()));
                    zzi();
                    if (abs > ((Long) zzgi.zzM.zza(null)).longValue()) {
                        zzaW().zzd().zza("Fetching config for blocked app");
                        zzO(zzl5);
                        return;
                    }
                    return;
                }
                return;
            }
            zzhf zzb2 = zzhf.zzb(zzbhVar);
            zzB().zzQ(zzb2, zzi().zzf(str12));
            int zzi = zzi().zzi(str12, zzgi.zzaf, 10, 35);
            Bundle bundle = zzb2.zzd;
            for (String str14 : new TreeSet(bundle.keySet())) {
                if (FirebaseAnalytics.Param.ITEMS.equals(str14)) {
                    zzB().zzP(bundle.getParcelableArray(str14), zzi);
                }
            }
            zzbh zza = zzb2.zza();
            if (Log.isLoggable(zzaW().zzr(), 2)) {
                zzaW().zzj().zzb("Logging event", this.zzn.zzj().zzc(zza));
            }
            zzj().zzH();
            try {
                zzg(zzrVar);
                String str15 = zza.zza;
                boolean z5 = "ecommerce_purchase".equals(str15) || FirebaseAnalytics.Event.PURCHASE.equals(str15) || FirebaseAnalytics.Event.REFUND.equals(str15);
                if (!"_iap".equals(str15)) {
                    if (!z5) {
                        str2 = "app_id";
                        zzbhVar2 = zza;
                        str = "_err";
                        z4 = true;
                        obj = null;
                        String str16 = zzbhVar2.zza;
                        boolean zzaq = zzqf.zzaq(str16);
                        boolean equals = str.equals(str16);
                        zzB();
                        zzbfVar = zzbhVar2.zzb;
                        if (zzbfVar != null) {
                            j4 = 0;
                        } else {
                            zzbe zzbeVar2 = new zzbe(zzbfVar);
                            j4 = 0;
                            while (zzbeVar2.hasNext()) {
                                if (zzbfVar.zzf(zzbeVar2.next()) instanceof Parcelable[]) {
                                    j4 += ((Parcelable[]) r14).length;
                                }
                            }
                        }
                        String str17 = str12;
                        ?? r30 = obj;
                        zzas zzp = zzj().zzp(zza(), str17, j4 + 1, true, zzaq, false, equals, false, false, false);
                        long j9 = zzp.zzb;
                        zzi();
                        zzH = j9 - zzam.zzH();
                        if (zzH <= 0) {
                            if (zzH % 1000 == 1) {
                                zzaW().zze().zzc("Data loss. Too many events logged. appId, count", zzhe.zzn(str17), Long.valueOf(zzp.zzb));
                            }
                            zzj().zzS();
                        } else {
                            if (zzaq) {
                                long j10 = zzp.zza;
                                zzi();
                                long intValue = j10 - ((Integer) zzgi.zzm.zza(r30)).intValue();
                                if (intValue > 0) {
                                    if (intValue % 1000 == 1) {
                                        zzaW().zze().zzc("Data loss. Too many public events logged. appId, count", zzhe.zzn(str17), Long.valueOf(zzp.zza));
                                    }
                                    zzB().zzR(this.zzK, str17, 16, "_ev", zzbhVar2.zza, 0);
                                    zzj().zzS();
                                }
                            }
                            if (equals) {
                                long max = zzp.zzd - Math.max(0, Math.min(1000000, zzi().zzh(zzrVar.zza, zzgi.zzl)));
                                if (max > 0) {
                                    if (max == 1) {
                                        zzaW().zze().zzc("Too many error events logged. appId, count", zzhe.zzn(str17), Long.valueOf(zzp.zzd));
                                    }
                                    zzj().zzS();
                                }
                            }
                            Bundle zzc2 = zzbfVar.zzc();
                            zzqf zzB = zzB();
                            String str18 = zzbhVar2.zzc;
                            zzB.zzS(zzc2, "_o", str18);
                            if (zzB().zzak(str17, zzrVar.zzD)) {
                                zzB().zzS(zzc2, "_dbg", 1L);
                                zzB().zzS(zzc2, "_r", 1L);
                            }
                            if ("_s".equals(str16) && (zzy = zzj().zzy(zzrVar.zza, "_sno")) != null) {
                                Object obj3 = zzy.zze;
                                if (obj3 instanceof Long) {
                                    zzB().zzS(zzc2, "_sno", obj3);
                                }
                            }
                            if (zzi().zzx(r30, zzgi.zzbg) && Objects.equals(str18, "am") && Objects.equals(str16, "_ai") && (obj2 = zzc2.get("value")) != null && (obj2 instanceof String)) {
                                try {
                                    double parseDouble = Double.parseDouble((String) obj2);
                                    zzc2.remove("value");
                                    zzc2.putDouble("value", parseDouble);
                                } catch (NumberFormatException unused) {
                                }
                            }
                            zzaw zzj3 = zzj();
                            Preconditions.checkNotEmpty(str17);
                            zzj3.zzg();
                            zzj3.zzav();
                            try {
                                str3 = "raw_events";
                                try {
                                    j5 = zzj3.zzj().delete(str3, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str17, String.valueOf(Math.max(0, Math.min(1000000, zzj3.zzu.zzf().zzh(str17, zzgi.zzp))))});
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    zzj3.zzu.zzaW().zze().zzc("Error deleting over the limit events. appId", zzhe.zzn(str17), e);
                                    j5 = 0;
                                    if (j5 > 0) {
                                    }
                                    zzio zzioVar2 = this.zzn;
                                    str4 = str3;
                                    zzbc zzbcVar2 = new zzbc(zzioVar2, zzbhVar2.zzc, str17, zzbhVar2.zza, zzbhVar2.zzd, 0L, zzc2);
                                    zzaw zzj4 = zzj();
                                    String str19 = zzbcVar2.zzb;
                                    zzs = zzj4.zzs(str17, str19);
                                    if (zzs == null) {
                                    }
                                    zzbc zzbcVar3 = zzbcVar2;
                                    zzj().zzV(zzc);
                                    zzaX().zzg();
                                    zzM();
                                    Preconditions.checkNotNull(zzbcVar3);
                                    Preconditions.checkNotNull(zzrVar);
                                    String str20 = zzbcVar3.zza;
                                    Preconditions.checkNotEmpty(str20);
                                    str5 = zzrVar.zza;
                                    Preconditions.checkArgument(str20.equals(str5));
                                    zzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                                    zzz.zzar(1);
                                    zzz.zzan("android");
                                    if (!TextUtils.isEmpty(str5)) {
                                    }
                                    str6 = zzrVar.zzd;
                                    if (!TextUtils.isEmpty(str6)) {
                                    }
                                    str7 = zzrVar.zzc;
                                    if (!TextUtils.isEmpty(str7)) {
                                    }
                                    str8 = zzrVar.zzw;
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    j6 = zzrVar.zzj;
                                    if (j6 != -2147483648L) {
                                    }
                                    zzz.zzai(zzrVar.zze);
                                    str9 = zzrVar.zzb;
                                    if (!TextUtils.isEmpty(str9)) {
                                    }
                                    zzl = zzu((String) Preconditions.checkNotNull(str5)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                                    zzz.zzT(zzl.zzp());
                                    if (zzz.zzaJ().isEmpty()) {
                                    }
                                    zzqr.zzb();
                                    if (zzi().zzx(str5, zzgi.zzaV)) {
                                        zzz.zzG(zzrVar.zzB);
                                        j8 = zzrVar.zzC;
                                        if (!zzl.zzr(zzjw.AD_STORAGE)) {
                                            j8 = (j8 & (-2)) | 32;
                                        }
                                        zzz.zzaa(j8 != 1);
                                        if (j8 == 0) {
                                        }
                                    }
                                    j7 = zzrVar.zzf;
                                    if (j7 != 0) {
                                    }
                                    zzz.zzZ(zzrVar.zzr);
                                    zzqa zzA = zzA();
                                    com.google.android.gms.internal.measurement.zzjm zza2 = com.google.android.gms.internal.measurement.zzjm.zza(zzA.zzg.zzn.zzaT().getContentResolver(), com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbj
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.google.android.gms.internal.measurement.zzki.zzc();
                                        }
                                    });
                                    if (zza2 != null) {
                                    }
                                    if (zzd != null) {
                                        arrayList = new ArrayList();
                                        int intValue2 = ((Integer) zzgi.zzae.zza(r30)).intValue();
                                        while (r14.hasNext()) {
                                        }
                                        if (arrayList.isEmpty()) {
                                        }
                                        if (arrayList != null) {
                                        }
                                        if (zzi().zzx(r30, zzgi.zzbk)) {
                                        }
                                        str10 = zzrVar.zza;
                                        zzl2 = zzu((String) Preconditions.checkNotNull(str10)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                                        zzjwVar = zzjw.AD_STORAGE;
                                        if (zzl2.zzr(zzjwVar)) {
                                        }
                                        str11 = r30;
                                        zzjxVar = zzl2;
                                        zzbcVar = zzbcVar3;
                                        zzioVar = this.zzn;
                                        zzioVar.zzg().zzv();
                                        zzz.zzX(Build.MODEL);
                                        zzioVar.zzg().zzv();
                                        zzz.zzam(Build.VERSION.RELEASE);
                                        zzz.zzaz((int) zzioVar.zzg().zza());
                                        zzz.zzaD(zzioVar.zzg().zzb());
                                        zzz.zzay(zzrVar.zzy);
                                        if (zzioVar.zzJ()) {
                                        }
                                        zzl3 = zzj().zzl(str10);
                                        if (zzl3 == null) {
                                        }
                                        if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
                                        }
                                        if (!TextUtils.isEmpty(zzl3.zzG())) {
                                        }
                                        zzE = zzj().zzE(str10);
                                        while (i5 < zzE.size()) {
                                        }
                                        zzj = zzj();
                                        zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                                        zzj.zzg();
                                        zzj.zzav();
                                        Preconditions.checkNotNull(zzhxVar);
                                        Preconditions.checkNotEmpty(zzhxVar.zzF());
                                        byte[] zzcd = zzhxVar.zzcd();
                                        long zzf = zzj.zzg.zzA().zzf(zzcd);
                                        ContentValues contentValues2 = new ContentValues();
                                        String str21 = str2;
                                        contentValues2.put(str21, zzhxVar.zzF());
                                        contentValues2.put("metadata_fingerprint", Long.valueOf(zzf));
                                        contentValues2.put("metadata", zzcd);
                                        zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                        zzj2 = zzj();
                                        zzbeVar = new zzbe(zzbcVar.zzf);
                                        while (true) {
                                            if (zzbeVar.hasNext()) {
                                            }
                                        }
                                        i6 = 1;
                                        zzj2.zzg();
                                        zzj2.zzav();
                                        Preconditions.checkNotNull(zzbcVar);
                                        String str22 = zzbcVar.zza;
                                        Preconditions.checkNotEmpty(str22);
                                        byte[] zzcd2 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                        contentValues = new ContentValues();
                                        contentValues.put(str21, str22);
                                        contentValues.put("name", zzbcVar.zzb);
                                        contentValues.put(da.a.f15878d, Long.valueOf(zzbcVar.zzd));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(zzf));
                                        contentValues.put("data", zzcd2);
                                        contentValues.put("realtime", Integer.valueOf(i6));
                                        if (zzj2.zzj().insert(str4, null, contentValues) == -1) {
                                        }
                                        zzj().zzS();
                                        zzj().zzL();
                                        zzaL();
                                        zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                        return;
                                    }
                                    arrayList = r30;
                                    if (arrayList != null) {
                                    }
                                    if (zzi().zzx(r30, zzgi.zzbk)) {
                                    }
                                    str10 = zzrVar.zza;
                                    zzl2 = zzu((String) Preconditions.checkNotNull(str10)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                                    zzjwVar = zzjw.AD_STORAGE;
                                    if (zzl2.zzr(zzjwVar)) {
                                    }
                                    str11 = r30;
                                    zzjxVar = zzl2;
                                    zzbcVar = zzbcVar3;
                                    zzioVar = this.zzn;
                                    zzioVar.zzg().zzv();
                                    zzz.zzX(Build.MODEL);
                                    zzioVar.zzg().zzv();
                                    zzz.zzam(Build.VERSION.RELEASE);
                                    zzz.zzaz((int) zzioVar.zzg().zza());
                                    zzz.zzaD(zzioVar.zzg().zzb());
                                    zzz.zzay(zzrVar.zzy);
                                    if (zzioVar.zzJ()) {
                                    }
                                    zzl3 = zzj().zzl(str10);
                                    if (zzl3 == null) {
                                    }
                                    if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
                                    }
                                    if (!TextUtils.isEmpty(zzl3.zzG())) {
                                    }
                                    zzE = zzj().zzE(str10);
                                    while (i5 < zzE.size()) {
                                    }
                                    zzj = zzj();
                                    zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                                    zzj.zzg();
                                    zzj.zzav();
                                    Preconditions.checkNotNull(zzhxVar);
                                    Preconditions.checkNotEmpty(zzhxVar.zzF());
                                    byte[] zzcd3 = zzhxVar.zzcd();
                                    long zzf2 = zzj.zzg.zzA().zzf(zzcd3);
                                    ContentValues contentValues22 = new ContentValues();
                                    String str212 = str2;
                                    contentValues22.put(str212, zzhxVar.zzF());
                                    contentValues22.put("metadata_fingerprint", Long.valueOf(zzf2));
                                    contentValues22.put("metadata", zzcd3);
                                    zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    zzj2 = zzj();
                                    zzbeVar = new zzbe(zzbcVar.zzf);
                                    while (true) {
                                        if (zzbeVar.hasNext()) {
                                        }
                                    }
                                    i6 = 1;
                                    zzj2.zzg();
                                    zzj2.zzav();
                                    Preconditions.checkNotNull(zzbcVar);
                                    String str222 = zzbcVar.zza;
                                    Preconditions.checkNotEmpty(str222);
                                    byte[] zzcd22 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                    contentValues = new ContentValues();
                                    contentValues.put(str212, str222);
                                    contentValues.put("name", zzbcVar.zzb);
                                    contentValues.put(da.a.f15878d, Long.valueOf(zzbcVar.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(zzf2));
                                    contentValues.put("data", zzcd22);
                                    contentValues.put("realtime", Integer.valueOf(i6));
                                    if (zzj2.zzj().insert(str4, null, contentValues) == -1) {
                                    }
                                    zzj().zzS();
                                    zzj().zzL();
                                    zzaL();
                                    zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                    return;
                                }
                            } catch (SQLiteException e5) {
                                e = e5;
                                str3 = "raw_events";
                            }
                            if (j5 > 0) {
                                zzaW().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzhe.zzn(str17), Long.valueOf(j5));
                            }
                            zzio zzioVar22 = this.zzn;
                            str4 = str3;
                            zzbc zzbcVar22 = new zzbc(zzioVar22, zzbhVar2.zzc, str17, zzbhVar2.zza, zzbhVar2.zzd, 0L, zzc2);
                            zzaw zzj42 = zzj();
                            String str192 = zzbcVar22.zzb;
                            zzs = zzj42.zzs(str17, str192);
                            if (zzs == null) {
                                zzbcVar22 = zzbcVar22.zza(zzioVar22, zzs.zzf);
                                zzc = zzs.zzc(zzbcVar22.zzd);
                            } else if (zzj().zzi(str17) < zzi().zzb(str17) || !zzaq) {
                                zzc = new zzbd(str17, str192, 0L, 0L, 0L, zzbcVar22.zzd, 0L, null, null, null, null);
                            } else {
                                zzaW().zze().zzd("Too many event names used, ignoring event. appId, name, supported count", zzhe.zzn(str17), zzioVar22.zzj().zzd(str192), Integer.valueOf(zzi().zzb(str17)));
                                zzB().zzR(this.zzK, str17, 8, null, null, 0);
                            }
                            zzbc zzbcVar32 = zzbcVar22;
                            zzj().zzV(zzc);
                            zzaX().zzg();
                            zzM();
                            Preconditions.checkNotNull(zzbcVar32);
                            Preconditions.checkNotNull(zzrVar);
                            String str202 = zzbcVar32.zza;
                            Preconditions.checkNotEmpty(str202);
                            str5 = zzrVar.zza;
                            Preconditions.checkArgument(str202.equals(str5));
                            zzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                            zzz.zzar(1);
                            zzz.zzan("android");
                            if (!TextUtils.isEmpty(str5)) {
                                zzz.zzI(str5);
                            }
                            str6 = zzrVar.zzd;
                            if (!TextUtils.isEmpty(str6)) {
                                zzz.zzK(str6);
                            }
                            str7 = zzrVar.zzc;
                            if (!TextUtils.isEmpty(str7)) {
                                zzz.zzL(str7);
                            }
                            str8 = zzrVar.zzw;
                            if (!TextUtils.isEmpty(str8)) {
                                zzz.zzav(str8);
                            }
                            j6 = zzrVar.zzj;
                            if (j6 != -2147483648L) {
                                zzz.zzM((int) j6);
                            }
                            zzz.zzai(zzrVar.zze);
                            str9 = zzrVar.zzb;
                            if (!TextUtils.isEmpty(str9)) {
                                zzz.zzah(str9);
                            }
                            zzl = zzu((String) Preconditions.checkNotNull(str5)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                            zzz.zzT(zzl.zzp());
                            if (zzz.zzaJ().isEmpty()) {
                                String str23 = zzrVar.zzp;
                                if (!TextUtils.isEmpty(str23)) {
                                    zzz.zzH(str23);
                                }
                            }
                            zzqr.zzb();
                            if (zzi().zzx(str5, zzgi.zzaV) && zzB().zzab(str5)) {
                                zzz.zzG(zzrVar.zzB);
                                j8 = zzrVar.zzC;
                                if (!zzl.zzr(zzjw.AD_STORAGE) && j8 != 0) {
                                    j8 = (j8 & (-2)) | 32;
                                }
                                zzz.zzaa(j8 != 1);
                                if (j8 == 0) {
                                    com.google.android.gms.internal.measurement.zzhf zza3 = com.google.android.gms.internal.measurement.zzhg.zza();
                                    zza3.zzc((j8 & 1) != 0);
                                    zza3.zze((j8 & 2) != 0);
                                    zza3.zzf((j8 & 4) != 0);
                                    zza3.zzg((j8 & 8) != 0);
                                    zza3.zzb((j8 & 16) != 0);
                                    zza3.zza((j8 & 32) != 0);
                                    zza3.zzd((j8 & 64) != 0);
                                    zzz.zzN((com.google.android.gms.internal.measurement.zzhg) zza3.zzba());
                                }
                            }
                            j7 = zzrVar.zzf;
                            if (j7 != 0) {
                                zzz.zzW(j7);
                            }
                            zzz.zzZ(zzrVar.zzr);
                            zzqa zzA2 = zzA();
                            com.google.android.gms.internal.measurement.zzjm zza22 = com.google.android.gms.internal.measurement.zzjm.zza(zzA2.zzg.zzn.zzaT().getContentResolver(), com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.google.android.gms.internal.measurement.zzki.zzc();
                                }
                            });
                            zzd = zza22 != null ? Collections.EMPTY_MAP : zza22.zzd();
                            try {
                                if (zzd != null && !zzd.isEmpty()) {
                                    arrayList = new ArrayList();
                                    int intValue22 = ((Integer) zzgi.zzae.zza(r30)).intValue();
                                    for (Map.Entry entry : zzd.entrySet()) {
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = Integer.parseInt((String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue22) {
                                                        zzA2.zzu.zzaW().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e6) {
                                                zzA2.zzu.zzaW().zzk().zzb("Experiment ID NumberFormatException", e6);
                                            }
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                    }
                                    if (arrayList != null) {
                                        zzz.zzk(arrayList);
                                    }
                                    if (zzi().zzx(r30, zzgi.zzbk)) {
                                        zzz.zzaf("");
                                    }
                                    str10 = zzrVar.zza;
                                    zzl2 = zzu((String) Preconditions.checkNotNull(str10)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                                    zzjwVar = zzjw.AD_STORAGE;
                                    if (zzl2.zzr(zzjwVar) && zzrVar.zzn) {
                                        zzd2 = this.zzk.zzd(str10, zzl2);
                                        if (!TextUtils.isEmpty((CharSequence) zzd2.first)) {
                                            zzz.zzas((String) zzd2.first);
                                            Object obj4 = zzd2.second;
                                            if (obj4 != null) {
                                                zzz.zzal(((Boolean) obj4).booleanValue());
                                            }
                                            if (!zzbcVar32.zzb.equals("_fx") && !((String) zzd2.first).equals("00000000-0000-0000-0000-000000000000") && (zzl4 = zzj().zzl(str10)) != null && zzl4.zzaM()) {
                                                zzar(str10, false, r30, r30);
                                                Bundle bundle2 = new Bundle();
                                                Long zzy2 = zzl4.zzy();
                                                if (zzy2 != null) {
                                                    str11 = r30;
                                                    zzjxVar = zzl2;
                                                    long longValue2 = zzy2.longValue();
                                                    zzhVar = zzl4;
                                                    zzbcVar = zzbcVar32;
                                                    bundle2.putLong("_pfo", Math.max(0L, longValue2));
                                                } else {
                                                    str11 = r30;
                                                    zzjxVar = zzl2;
                                                    zzhVar = zzl4;
                                                    zzbcVar = zzbcVar32;
                                                }
                                                Long zzz2 = zzhVar.zzz();
                                                if (zzz2 != null) {
                                                    bundle2.putLong("_uwa", zzz2.longValue());
                                                }
                                                bundle2.putLong("_r", 1L);
                                                this.zzK.zza(str10, "_fx", bundle2);
                                                zzioVar = this.zzn;
                                                zzioVar.zzg().zzv();
                                                zzz.zzX(Build.MODEL);
                                                zzioVar.zzg().zzv();
                                                zzz.zzam(Build.VERSION.RELEASE);
                                                zzz.zzaz((int) zzioVar.zzg().zza());
                                                zzz.zzaD(zzioVar.zzg().zzb());
                                                zzz.zzay(zzrVar.zzy);
                                                if (zzioVar.zzJ()) {
                                                    zzz.zzaF();
                                                    if (!TextUtils.isEmpty(str11)) {
                                                        zzz.zzY(str11);
                                                    }
                                                }
                                                zzl3 = zzj().zzl(str10);
                                                if (zzl3 == null) {
                                                    zzl3 = new zzh(zzioVar, str10);
                                                    zzl3.zzV(zzC(zzjxVar));
                                                    zzl3.zzan(zzrVar.zzk);
                                                    zzl3.zzao(zzrVar.zzb);
                                                    if (zzjxVar.zzr(zzjwVar)) {
                                                        zzl3.zzax(this.zzk.zzf(str10, zzrVar.zzn));
                                                    }
                                                    zzl3.zzat(0L);
                                                    zzl3.zzau(0L);
                                                    zzl3.zzas(0L);
                                                    zzl3.zzX(zzrVar.zzc);
                                                    zzl3.zzY(zzrVar.zzj);
                                                    zzl3.zzW(zzrVar.zzd);
                                                    zzl3.zzap(zzrVar.zze);
                                                    zzl3.zzaj(zzrVar.zzf);
                                                    zzl3.zzav(zzrVar.zzh);
                                                    zzl3.zzal(zzrVar.zzr);
                                                    i4 = 0;
                                                    zzj().zzT(zzl3, false, false);
                                                } else {
                                                    i4 = 0;
                                                }
                                                if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzl3.zzD())) {
                                                    zzz.zzJ((String) Preconditions.checkNotNull(zzl3.zzD()));
                                                }
                                                if (!TextUtils.isEmpty(zzl3.zzG())) {
                                                    zzz.zzag((String) Preconditions.checkNotNull(zzl3.zzG()));
                                                }
                                                zzE = zzj().zzE(str10);
                                                for (i5 = i4; i5 < zzE.size(); i5++) {
                                                    com.google.android.gms.internal.measurement.zzin zze = com.google.android.gms.internal.measurement.zzio.zze();
                                                    zze.zzf(((zzqd) zzE.get(i5)).zzc);
                                                    zze.zzg(((zzqd) zzE.get(i5)).zzd);
                                                    zzA().zzx(zze, ((zzqd) zzE.get(i5)).zze);
                                                    zzz.zzo(zze);
                                                    if ("_sid".equals(((zzqd) zzE.get(i5)).zzc) && zzl3.zzv() != 0 && zzA().zzd(zzrVar.zzw) != zzl3.zzv()) {
                                                        zzz.zzA();
                                                    }
                                                }
                                                zzj = zzj();
                                                zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                                                zzj.zzg();
                                                zzj.zzav();
                                                Preconditions.checkNotNull(zzhxVar);
                                                Preconditions.checkNotEmpty(zzhxVar.zzF());
                                                byte[] zzcd32 = zzhxVar.zzcd();
                                                long zzf22 = zzj.zzg.zzA().zzf(zzcd32);
                                                ContentValues contentValues222 = new ContentValues();
                                                String str2122 = str2;
                                                contentValues222.put(str2122, zzhxVar.zzF());
                                                contentValues222.put("metadata_fingerprint", Long.valueOf(zzf22));
                                                contentValues222.put("metadata", zzcd32);
                                                zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                                zzj2 = zzj();
                                                zzbeVar = new zzbe(zzbcVar.zzf);
                                                while (true) {
                                                    if (zzbeVar.hasNext()) {
                                                        if ("_r".equals(zzbeVar.next())) {
                                                            break;
                                                        }
                                                    } else {
                                                        zzif zzr2 = zzr();
                                                        String str24 = zzbcVar.zza;
                                                        boolean zzw = zzr2.zzw(str24, zzbcVar.zzb);
                                                        zzas zzo = zzj().zzo(zza(), str24, false, false, false, false, false, false, false);
                                                        if (!zzw || zzo.zze >= zzi().zzh(str24, zzgi.zzo)) {
                                                            i6 = 0;
                                                        }
                                                    }
                                                }
                                                i6 = 1;
                                                zzj2.zzg();
                                                zzj2.zzav();
                                                Preconditions.checkNotNull(zzbcVar);
                                                String str2222 = zzbcVar.zza;
                                                Preconditions.checkNotEmpty(str2222);
                                                byte[] zzcd222 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                                contentValues = new ContentValues();
                                                contentValues.put(str2122, str2222);
                                                contentValues.put("name", zzbcVar.zzb);
                                                contentValues.put(da.a.f15878d, Long.valueOf(zzbcVar.zzd));
                                                contentValues.put("metadata_fingerprint", Long.valueOf(zzf22));
                                                contentValues.put("data", zzcd222);
                                                contentValues.put("realtime", Integer.valueOf(i6));
                                                if (zzj2.zzj().insert(str4, null, contentValues) == -1) {
                                                    zzj2.zzu.zzaW().zze().zzb("Failed to insert raw event (got -1). appId", zzhe.zzn(str2222));
                                                } else {
                                                    this.zza = 0L;
                                                }
                                                zzj().zzS();
                                                zzj().zzL();
                                                zzaL();
                                                zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                                return;
                                            }
                                        }
                                    }
                                    str11 = r30;
                                    zzjxVar = zzl2;
                                    zzbcVar = zzbcVar32;
                                    zzioVar = this.zzn;
                                    zzioVar.zzg().zzv();
                                    zzz.zzX(Build.MODEL);
                                    zzioVar.zzg().zzv();
                                    zzz.zzam(Build.VERSION.RELEASE);
                                    zzz.zzaz((int) zzioVar.zzg().zza());
                                    zzz.zzaD(zzioVar.zzg().zzb());
                                    zzz.zzay(zzrVar.zzy);
                                    if (zzioVar.zzJ()) {
                                    }
                                    zzl3 = zzj().zzl(str10);
                                    if (zzl3 == null) {
                                    }
                                    if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
                                        zzz.zzJ((String) Preconditions.checkNotNull(zzl3.zzD()));
                                    }
                                    if (!TextUtils.isEmpty(zzl3.zzG())) {
                                    }
                                    zzE = zzj().zzE(str10);
                                    while (i5 < zzE.size()) {
                                    }
                                    zzj = zzj();
                                    zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                                    zzj.zzg();
                                    zzj.zzav();
                                    Preconditions.checkNotNull(zzhxVar);
                                    Preconditions.checkNotEmpty(zzhxVar.zzF());
                                    byte[] zzcd322 = zzhxVar.zzcd();
                                    long zzf222 = zzj.zzg.zzA().zzf(zzcd322);
                                    ContentValues contentValues2222 = new ContentValues();
                                    String str21222 = str2;
                                    contentValues2222.put(str21222, zzhxVar.zzF());
                                    contentValues2222.put("metadata_fingerprint", Long.valueOf(zzf222));
                                    contentValues2222.put("metadata", zzcd322);
                                    zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues2222, 4);
                                    zzj2 = zzj();
                                    zzbeVar = new zzbe(zzbcVar.zzf);
                                    while (true) {
                                        if (zzbeVar.hasNext()) {
                                        }
                                    }
                                    i6 = 1;
                                    zzj2.zzg();
                                    zzj2.zzav();
                                    Preconditions.checkNotNull(zzbcVar);
                                    String str22222 = zzbcVar.zza;
                                    Preconditions.checkNotEmpty(str22222);
                                    byte[] zzcd2222 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                    contentValues = new ContentValues();
                                    contentValues.put(str21222, str22222);
                                    contentValues.put("name", zzbcVar.zzb);
                                    contentValues.put(da.a.f15878d, Long.valueOf(zzbcVar.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(zzf222));
                                    contentValues.put("data", zzcd2222);
                                    contentValues.put("realtime", Integer.valueOf(i6));
                                    if (zzj2.zzj().insert(str4, null, contentValues) == -1) {
                                    }
                                    zzj().zzS();
                                    zzj().zzL();
                                    zzaL();
                                    zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                    return;
                                }
                                zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues2222, 4);
                                zzj2 = zzj();
                                zzbeVar = new zzbe(zzbcVar.zzf);
                                while (true) {
                                    if (zzbeVar.hasNext()) {
                                    }
                                }
                                i6 = 1;
                                zzj2.zzg();
                                zzj2.zzav();
                                Preconditions.checkNotNull(zzbcVar);
                                String str222222 = zzbcVar.zza;
                                Preconditions.checkNotEmpty(str222222);
                                byte[] zzcd22222 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                contentValues = new ContentValues();
                                contentValues.put(str21222, str222222);
                                contentValues.put("name", zzbcVar.zzb);
                                contentValues.put(da.a.f15878d, Long.valueOf(zzbcVar.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(zzf222));
                                contentValues.put("data", zzcd22222);
                                contentValues.put("realtime", Integer.valueOf(i6));
                                if (zzj2.zzj().insert(str4, null, contentValues) == -1) {
                                }
                                zzj().zzS();
                                zzj().zzL();
                                zzaL();
                                zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                return;
                            } catch (SQLiteException e7) {
                                zzj.zzu.zzaW().zze().zzc("Error storing raw event metadata. appId", zzhe.zzn(zzhxVar.zzF()), e7);
                                throw e7;
                            }
                            arrayList = r30;
                            if (arrayList != null) {
                            }
                            if (zzi().zzx(r30, zzgi.zzbk)) {
                            }
                            str10 = zzrVar.zza;
                            zzl2 = zzu((String) Preconditions.checkNotNull(str10)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                            zzjwVar = zzjw.AD_STORAGE;
                            if (zzl2.zzr(zzjwVar)) {
                                zzd2 = this.zzk.zzd(str10, zzl2);
                                if (!TextUtils.isEmpty((CharSequence) zzd2.first)) {
                                }
                            }
                            str11 = r30;
                            zzjxVar = zzl2;
                            zzbcVar = zzbcVar32;
                            zzioVar = this.zzn;
                            zzioVar.zzg().zzv();
                            zzz.zzX(Build.MODEL);
                            zzioVar.zzg().zzv();
                            zzz.zzam(Build.VERSION.RELEASE);
                            zzz.zzaz((int) zzioVar.zzg().zza());
                            zzz.zzaD(zzioVar.zzg().zzb());
                            zzz.zzay(zzrVar.zzy);
                            if (zzioVar.zzJ()) {
                            }
                            zzl3 = zzj().zzl(str10);
                            if (zzl3 == null) {
                            }
                            if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(zzl3.zzG())) {
                            }
                            zzE = zzj().zzE(str10);
                            while (i5 < zzE.size()) {
                            }
                            zzj = zzj();
                            zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                            zzj.zzg();
                            zzj.zzav();
                            Preconditions.checkNotNull(zzhxVar);
                            Preconditions.checkNotEmpty(zzhxVar.zzF());
                            byte[] zzcd3222 = zzhxVar.zzcd();
                            long zzf2222 = zzj.zzg.zzA().zzf(zzcd3222);
                            ContentValues contentValues22222 = new ContentValues();
                            String str212222 = str2;
                            contentValues22222.put(str212222, zzhxVar.zzF());
                            contentValues22222.put("metadata_fingerprint", Long.valueOf(zzf2222));
                            contentValues22222.put("metadata", zzcd3222);
                        }
                        zzj().zzL();
                    }
                    z5 = true;
                }
                zzbf zzbfVar2 = zza.zzb;
                String zzg = zzbfVar2.zzg("currency");
                if (z5) {
                    double doubleValue = zzbfVar2.zzd("value").doubleValue() * 1000000.0d;
                    if (doubleValue == 0.0d) {
                        str = "_err";
                        doubleValue = zzbfVar2.zze("value").longValue() * 1000000.0d;
                    } else {
                        str = "_err";
                    }
                    if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                        zzaW().zzk().zzc("Data lost. Currency value is too big. appId", zzhe.zzn(str12), Double.valueOf(doubleValue));
                        zzj().zzS();
                        zzj().zzL();
                    } else {
                        longValue = Math.round(doubleValue);
                        if (FirebaseAnalytics.Event.REFUND.equals(str15)) {
                            longValue = -longValue;
                        }
                    }
                } else {
                    str = "_err";
                    longValue = zzbfVar2.zze("value").longValue();
                }
                if (!TextUtils.isEmpty(zzg)) {
                    String upperCase = zzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String concat = "_ltv_".concat(upperCase);
                        zzqd zzy3 = zzj().zzy(str12, concat);
                        if (zzy3 != null) {
                            Object obj5 = zzy3.zze;
                            if (obj5 instanceof Long) {
                                str2 = "app_id";
                                zzbhVar2 = zza;
                                z4 = true;
                                obj = null;
                                zzqdVar = new zzqd(str12, zza.zzc, concat, zzaU().currentTimeMillis(), Long.valueOf(((Long) obj5).longValue() + longValue));
                                str12 = str12;
                                zzqdVar2 = zzqdVar;
                                if (!zzj().zzai(zzqdVar2)) {
                                    zzaW().zze().zzd("Too many unique user properties are set. Ignoring user property. appId", zzhe.zzn(str12), this.zzn.zzj().zzf(zzqdVar2.zzc), zzqdVar2.zze);
                                    zzB().zzR(this.zzK, str12, 9, null, null, 0);
                                }
                                String str162 = zzbhVar2.zza;
                                boolean zzaq2 = zzqf.zzaq(str162);
                                boolean equals2 = str.equals(str162);
                                zzB();
                                zzbfVar = zzbhVar2.zzb;
                                if (zzbfVar != null) {
                                }
                                String str172 = str12;
                                ?? r302 = obj;
                                zzas zzp2 = zzj().zzp(zza(), str172, j4 + 1, true, zzaq2, false, equals2, false, false, false);
                                long j92 = zzp2.zzb;
                                zzi();
                                zzH = j92 - zzam.zzH();
                                if (zzH <= 0) {
                                }
                                zzj().zzL();
                            }
                        }
                        str2 = "app_id";
                        zzbhVar2 = zza;
                        obj = null;
                        zzaw zzj5 = zzj();
                        int zzh = zzi().zzh(str12, zzgi.zzS) - 1;
                        Preconditions.checkNotEmpty(str12);
                        zzj5.zzg();
                        zzj5.zzav();
                        zzj5.zzj().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str12, str12, String.valueOf(zzh)});
                        z4 = true;
                        zzqdVar = new zzqd(str12, zzbhVar2.zzc, concat, zzaU().currentTimeMillis(), Long.valueOf(longValue));
                        str12 = str12;
                        zzqdVar2 = zzqdVar;
                        if (!zzj().zzai(zzqdVar2)) {
                        }
                        String str1622 = zzbhVar2.zza;
                        boolean zzaq22 = zzqf.zzaq(str1622);
                        boolean equals22 = str.equals(str1622);
                        zzB();
                        zzbfVar = zzbhVar2.zzb;
                        if (zzbfVar != null) {
                        }
                        String str1722 = str12;
                        ?? r3022 = obj;
                        zzas zzp22 = zzj().zzp(zza(), str1722, j4 + 1, true, zzaq22, false, equals22, false, false, false);
                        long j922 = zzp22.zzb;
                        zzi();
                        zzH = j922 - zzam.zzH();
                        if (zzH <= 0) {
                        }
                        zzj().zzL();
                    }
                }
                str2 = "app_id";
                zzbhVar2 = zza;
                z4 = true;
                obj = null;
                String str16222 = zzbhVar2.zza;
                boolean zzaq222 = zzqf.zzaq(str16222);
                boolean equals222 = str.equals(str16222);
                zzB();
                zzbfVar = zzbhVar2.zzb;
                if (zzbfVar != null) {
                }
                String str17222 = str12;
                ?? r30222 = obj;
                zzas zzp222 = zzj().zzp(zza(), str17222, j4 + 1, true, zzaq222, false, equals222, false, false, false);
                long j9222 = zzp222.zzb;
                zzi();
                zzH = j9222 - zzam.zzH();
                if (zzH <= 0) {
                }
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final boolean zzay(String str, String str2) {
        zzh zzl = zzj().zzl(str);
        if (zzl != null && zzB().zzak(str, zzl.zzM())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpt zzptVar = (zzpt) this.zzF.get(str2);
        if (zzptVar == null) {
            return true;
        }
        return zzptVar.zzc();
    }

    final boolean zzaz() {
        zzaX().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaW().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzf();
        File filesDir = this.zzn.zzaT().getFilesDir();
        com.google.android.gms.internal.measurement.zzbx.zza();
        int i4 = com.google.android.gms.internal.measurement.zzcc.zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock tryLock = channel.tryLock();
            this.zzx = tryLock;
            if (tryLock != null) {
                zzaW().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaW().zze().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e4) {
            zzaW().zze().zzb("Failed to acquire storage lock", e4);
            return false;
        } catch (IOException e5) {
            zzaW().zze().zzb("Failed to access storage lock file", e5);
            return false;
        } catch (OverlappingFileLockException e6) {
            zzaW().zzk().zzb("Storage lock already acquired", e6);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Bundle zzd(String str) {
        zzaX().zzg();
        zzM();
        if (zzr().zzi(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjx zzu = zzu(str);
        bundle.putAll(zzu.zzc());
        bundle.putAll(zzl(str, zzm(str), zzu, new zzao()).zzb());
        zzqd zzy = zzj().zzy(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzy != null ? zzy.zze.equals(1L) : zzaC(str, new zzao())) ? "granted" : "denied");
        return bundle;
    }

    final Bundle zzf(String str, zzbh zzbhVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbhVar.zzb.zze("_sid").longValue());
        zzqd zzy = zzj().zzy(str, "_sno");
        if (zzy != null) {
            Object obj = zzy.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzh zzg(zzr zzrVar) {
        boolean z4;
        String str;
        long j4;
        String str2;
        String str3;
        String str4;
        zzaX().zzg();
        zzM();
        Preconditions.checkNotNull(zzrVar);
        String str5 = zzrVar.zza;
        Preconditions.checkNotEmpty(str5);
        String str6 = zzrVar.zzv;
        zzpu zzpuVar = null;
        if (!str6.isEmpty()) {
            this.zzE.put(str5, new zzps(this, str6));
        }
        zzh zzl = zzj().zzl(str5);
        zzjx zzl2 = zzu(str5).zzl(zzjx.zzk(zzrVar.zzu, 100));
        zzjw zzjwVar = zzjw.AD_STORAGE;
        String zzf = zzl2.zzr(zzjwVar) ? this.zzk.zzf(str5, zzrVar.zzn) : "";
        boolean z5 = true;
        if (zzl == null) {
            zzh zzhVar = new zzh(this.zzn, str5);
            if (zzl2.zzr(zzjw.ANALYTICS_STORAGE)) {
                zzhVar.zzV(zzC(zzl2));
            }
            if (zzl2.zzr(zzjwVar)) {
                zzhVar.zzax(zzf);
            }
            zzl = zzhVar;
        } else if (zzl2.zzr(zzjwVar) && zzf != null && !zzf.equals(zzl.zzJ())) {
            boolean isEmpty = TextUtils.isEmpty(zzl.zzJ());
            zzl.zzax(zzf);
            if (zzrVar.zzn && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(str5, zzl2).first) && !isEmpty) {
                if (zzl2.zzr(zzjw.ANALYTICS_STORAGE)) {
                    zzl.zzV(zzC(zzl2));
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (zzj().zzy(str5, "_id") != null && zzj().zzy(str5, "_lair") == null) {
                    zzj().zzai(new zzqd(str5, "auto", "_lair", zzaU().currentTimeMillis(), 1L));
                }
                zzl.zzao(zzrVar.zzb);
                zzl.zzS(zzrVar.zzp);
                str = zzrVar.zzk;
                if (!TextUtils.isEmpty(str)) {
                    zzl.zzan(str);
                }
                j4 = zzrVar.zze;
                if (j4 != 0) {
                    zzl.zzap(j4);
                }
                str2 = zzrVar.zzc;
                if (!TextUtils.isEmpty(str2)) {
                    zzl.zzX(str2);
                }
                zzl.zzY(zzrVar.zzj);
                str3 = zzrVar.zzd;
                if (str3 != null) {
                    zzl.zzW(str3);
                }
                zzl.zzaj(zzrVar.zzf);
                zzl.zzav(zzrVar.zzh);
                str4 = zzrVar.zzg;
                if (!TextUtils.isEmpty(str4)) {
                    zzl.zzaq(str4);
                }
                zzl.zzU(zzrVar.zzn);
                zzl.zzaw(zzrVar.zzq);
                zzl.zzal(zzrVar.zzr);
                zzl.zzaA(zzrVar.zzw);
                com.google.android.gms.internal.measurement.zzpn.zzb();
                if (zzi().zzx(null, zzgi.zzaK)) {
                    com.google.android.gms.internal.measurement.zzpn.zzb();
                    if (zzi().zzx(null, zzgi.zzaJ)) {
                        zzl.zzay(null);
                    }
                } else {
                    zzl.zzay(zzrVar.zzs);
                }
                zzl.zzaD(zzrVar.zzx);
                zzl.zzaC(zzrVar.zzD);
                zzqr.zzb();
                if (zzi().zzx(null, zzgi.zzaV)) {
                    zzl.zzT(zzrVar.zzB);
                }
                zzl.zzaE(zzrVar.zzy);
                zzl.zzaz(zzrVar.zzE);
                if (zzi().zzx(null, zzgi.zzaP)) {
                    zzl.zzaa(zzrVar.zzG);
                }
                if (!zzl.zzaK()) {
                    z5 = z4;
                } else if (!z4) {
                    return zzl;
                }
                zzj().zzT(zzl, z5, false);
                return zzl;
            }
            if (TextUtils.isEmpty(zzl.zzD()) && zzl2.zzr(zzjw.ANALYTICS_STORAGE)) {
                zzl.zzV(zzC(zzl2));
            }
        } else if (TextUtils.isEmpty(zzl.zzD()) && zzl2.zzr(zzjw.ANALYTICS_STORAGE)) {
            zzl.zzV(zzC(zzl2));
        }
        z4 = false;
        zzl.zzao(zzrVar.zzb);
        zzl.zzS(zzrVar.zzp);
        str = zzrVar.zzk;
        if (!TextUtils.isEmpty(str)) {
        }
        j4 = zzrVar.zze;
        if (j4 != 0) {
        }
        str2 = zzrVar.zzc;
        if (!TextUtils.isEmpty(str2)) {
        }
        zzl.zzY(zzrVar.zzj);
        str3 = zzrVar.zzd;
        if (str3 != null) {
        }
        zzl.zzaj(zzrVar.zzf);
        zzl.zzav(zzrVar.zzh);
        str4 = zzrVar.zzg;
        if (!TextUtils.isEmpty(str4)) {
        }
        zzl.zzU(zzrVar.zzn);
        zzl.zzaw(zzrVar.zzq);
        zzl.zzal(zzrVar.zzr);
        zzl.zzaA(zzrVar.zzw);
        com.google.android.gms.internal.measurement.zzpn.zzb();
        if (zzi().zzx(null, zzgi.zzaK)) {
        }
        zzl.zzaD(zzrVar.zzx);
        zzl.zzaC(zzrVar.zzD);
        zzqr.zzb();
        if (zzi().zzx(null, zzgi.zzaV)) {
        }
        zzl.zzaE(zzrVar.zzy);
        zzl.zzaz(zzrVar.zzE);
        if (zzi().zzx(null, zzgi.zzaP)) {
        }
        if (!zzl.zzaK()) {
        }
        zzj().zzT(zzl, z5, false);
        return zzl;
    }

    public final zzae zzh() {
        zzae zzaeVar = this.zzh;
        zzaR(zzaeVar);
        return zzaeVar;
    }

    public final zzam zzi() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzaw zzj() {
        zzaw zzawVar = this.zze;
        zzaR(zzawVar);
        return zzawVar;
    }

    final zzba zzl(String str, zzba zzbaVar, zzjx zzjxVar, zzao zzaoVar) {
        zzju zzjuVar;
        int i4 = 90;
        if (zzr().zzi(str) == null) {
            if (zzbaVar.zzf() == zzju.DENIED) {
                i4 = zzbaVar.zza();
                zzaoVar.zzc(zzjw.AD_USER_DATA, i4);
            } else {
                zzaoVar.zzd(zzjw.AD_USER_DATA, zzan.FAILSAFE);
            }
            return new zzba(Boolean.FALSE, i4, Boolean.TRUE, "-");
        }
        zzju zzf = zzbaVar.zzf();
        zzju zzjuVar2 = zzju.GRANTED;
        if (zzf == zzjuVar2 || zzf == (zzjuVar = zzju.DENIED)) {
            i4 = zzbaVar.zza();
            zzaoVar.zzc(zzjw.AD_USER_DATA, i4);
        } else {
            if (zzf == zzju.POLICY) {
                zzif zzifVar = this.zzc;
                zzjw zzjwVar = zzjw.AD_USER_DATA;
                zzju zzf2 = zzifVar.zzf(str, zzjwVar);
                if (zzf2 != zzju.UNINITIALIZED) {
                    zzaoVar.zzd(zzjwVar, zzan.REMOTE_ENFORCED_DEFAULT);
                    zzf = zzf2;
                }
            }
            zzif zzifVar2 = this.zzc;
            zzjw zzjwVar2 = zzjw.AD_USER_DATA;
            zzjw zzh = zzifVar2.zzh(str, zzjwVar2);
            zzju zze = zzjxVar.zze();
            boolean z4 = zze == zzjuVar2 || zze == zzjuVar;
            if (zzh == zzjw.AD_STORAGE && z4) {
                zzaoVar.zzd(zzjwVar2, zzan.REMOTE_DELEGATION);
                zzf = zze;
            } else {
                zzaoVar.zzd(zzjwVar2, zzan.REMOTE_DEFAULT);
                zzf = true != zzifVar2.zzu(str, zzjwVar2) ? zzjuVar : zzjuVar2;
            }
        }
        boolean zzv = this.zzc.zzv(str);
        SortedSet zzp = zzr().zzp(str);
        if (zzf == zzju.DENIED || zzp.isEmpty()) {
            return new zzba(Boolean.FALSE, i4, Boolean.valueOf(zzv), "-");
        }
        return new zzba(Boolean.TRUE, i4, Boolean.valueOf(zzv), zzv ? TextUtils.join("", zzp) : "");
    }

    final zzba zzm(String str) {
        zzaX().zzg();
        zzM();
        Map map = this.zzD;
        zzba zzbaVar = (zzba) map.get(str);
        if (zzbaVar != null) {
            return zzbaVar;
        }
        zzba zzq = zzj().zzq(str);
        map.put(str, zzq);
        return zzq;
    }

    public final zzgx zzo() {
        return this.zzn.zzj();
    }

    public final zzhk zzp() {
        zzhk zzhkVar = this.zzd;
        zzaR(zzhkVar);
        return zzhkVar;
    }

    public final zzhm zzq() {
        zzhm zzhmVar = this.zzf;
        if (zzhmVar != null) {
            return zzhmVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzif zzr() {
        zzif zzifVar = this.zzc;
        zzaR(zzifVar);
        return zzifVar;
    }

    final zzio zzt() {
        return this.zzn;
    }

    final zzjx zzu(String str) {
        zzjx zzjxVar = zzjx.zza;
        zzaX().zzg();
        zzM();
        zzjx zzjxVar2 = (zzjx) this.zzC.get(str);
        if (zzjxVar2 == null) {
            zzjxVar2 = zzj().zzu(str);
            if (zzjxVar2 == null) {
                zzjxVar2 = zzjx.zza;
            }
            zzaq(str, zzjxVar2);
        }
        return zzjxVar2;
    }

    public final zzmc zzv() {
        zzmc zzmcVar = this.zzj;
        zzaR(zzmcVar);
        return zzmcVar;
    }

    public final zzoa zzw() {
        return this.zzk;
    }

    public final zzoy zzx() {
        zzoy zzoyVar = this.zzg;
        zzaR(zzoyVar);
        return zzoyVar;
    }

    public final zzpi zzy() {
        return this.zzl;
    }
}
