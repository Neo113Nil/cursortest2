package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayj implements Runnable {
    private static final String a = asq.b("ForceStopRunnable");
    private static final long b;
    private final Context c;
    private final auy d;
    private int e = 0;
    private final brn f;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = 315360000000L;
    }

    public ayj(Context context, auy auyVar) {
        this.c = context.getApplicationContext();
        this.d = auyVar;
        this.f = auyVar.l;
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b2 = b(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b2);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:15|16|(6:18|(1:20)|21|22|(4:25|(1:38)(7:27|28|(1:30)|31|(1:33)(1:37)|34|35)|36|23)|39)|40|41|42|(1:44)(1:199)|45|(3:49|(4:52|(3:58|59|60)(3:54|55|56)|57|50)|61)|62|(2:63|(2:65|(2:67|68)(1:196))(2:197|198))|69|(7:71|72|73|(2:76|74)|77|78|79)|84|85|86|87|(1:159)(1:91)|(3:93|(5:96|97|98|99|94)|104)|106|107|(3:111|112|(5:119|120|(1:122)(1:152)|123|(4:(1:126)|127|(5:131|(1:133)|134|(4:137|(2:139|(3:141|142|143)(1:144))(1:146)|145|135)|147)|(1:149)(0))(2:(2:151|143)|(0)(0)))(1:116))|157|112|(1:114)|119|120|(0)(0)|123|(0)(0)|171) */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02af, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02b2, code lost:
    
        defpackage.asq.a().f(defpackage.ayj.a, "Ignoring exception", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a1 A[Catch: SQLiteException -> 0x02ee, all -> 0x038d, TRY_ENTER, TryCatch #8 {all -> 0x038d, blocks: (B:3:0x0006, B:5:0x0012, B:6:0x0023, B:16:0x0033, B:18:0x0042, B:20:0x006b, B:22:0x00a6, B:23:0x00b7, B:25:0x00bd, B:28:0x00d5, B:30:0x00db, B:31:0x00f1, B:33:0x00f7, B:34:0x0104, B:37:0x00fe, B:40:0x0108, B:42:0x010b, B:44:0x0121, B:45:0x0127, B:47:0x012e, B:49:0x0134, B:50:0x0138, B:52:0x013e, B:59:0x014a, B:55:0x0150, B:62:0x0158, B:63:0x015c, B:65:0x0162, B:68:0x016e, B:71:0x0178, B:79:0x0196, B:82:0x019b, B:83:0x019e, B:85:0x019f, B:102:0x02ea, B:103:0x02ed, B:107:0x01ea, B:112:0x01f6, B:114:0x020a, B:116:0x0214, B:120:0x0232, B:123:0x023d, B:126:0x024b, B:127:0x024e, B:129:0x025d, B:131:0x0263, B:133:0x0273, B:135:0x0277, B:137:0x027d, B:139:0x028d, B:143:0x02bd, B:145:0x0296, B:149:0x02a1, B:151:0x029b, B:155:0x02b2, B:163:0x02f3, B:174:0x02fc, B:176:0x0300, B:178:0x0304, B:180:0x0308, B:182:0x030c, B:184:0x0310, B:186:0x0314, B:188:0x0318, B:191:0x031d, B:192:0x031e, B:194:0x0336, B:195:0x033d, B:165:0x033e, B:168:0x0347, B:204:0x034d, B:206:0x0365, B:207:0x036e, B:8:0x036f, B:10:0x0385, B:14:0x038c, B:208:0x0016), top: B:2:0x0006, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean isUserUnlocked;
        int i;
        WorkDatabase workDatabase;
        boolean z;
        boolean z2;
        Long a2;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            auy auyVar = this.d;
            arv arvVar = auyVar.c;
            if (TextUtils.isEmpty(arvVar.i)) {
                asq.a();
            } else {
                boolean a3 = ayn.a(this.c, arvVar);
                asq.a();
                if (!a3) {
                    auyVar.k();
                    return;
                }
            }
            Context context = this.c;
            isUserUnlocked = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
            if (!isUserUnlocked) {
                asq.a().c(a, "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                wo woVar = auyVar.c.f;
                if (woVar == null) {
                    throw illegalStateException;
                }
                woVar.a(illegalStateException);
                auyVar.k();
                return;
            }
            while (true) {
                try {
                    context.getClass();
                    if (zy.g(context).exists()) {
                        asq.a();
                        String str = aum.a;
                        File g = zy.g(context);
                        File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                        String[] strArr = aum.b;
                        int length = strArr.length;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(ksl.f(ixd.m(3), 16));
                        for (int i2 = 0; i2 < 3; i2++) {
                            String str2 = strArr[i2];
                            kol kolVar = new kol(new File(String.valueOf(g.getPath()).concat(String.valueOf(str2))), new File(String.valueOf(file.getPath()).concat(String.valueOf(str2))));
                            linkedHashMap.put(kolVar.a, kolVar.b);
                        }
                        for (Map.Entry entry : ixd.r(linkedHashMap, new kol(g, file)).entrySet()) {
                            File file2 = (File) entry.getKey();
                            File file3 = (File) entry.getValue();
                            if (file2.exists()) {
                                if (file3.exists()) {
                                    asq a4 = asq.a();
                                    String str3 = aum.a;
                                    Objects.toString(file3);
                                    a4.e(str3, "Over-writing contents of ".concat(String.valueOf(file3)));
                                }
                                if (file2.renameTo(file3)) {
                                    Objects.toString(file2);
                                    Objects.toString(file3);
                                } else {
                                    Objects.toString(file2);
                                    Objects.toString(file3);
                                }
                                asq.a();
                            }
                        }
                    }
                    asq.a();
                    try {
                        workDatabase = auyVar.d;
                        int i3 = avs.a;
                        JobScheduler a5 = avq.a(context);
                        List<JobInfo> e = avs.e(context, a5);
                        List b2 = workDatabase.z().b();
                        HashSet hashSet = new HashSet(e != null ? e.size() : 0);
                        if (e != null && !e.isEmpty()) {
                            for (JobInfo jobInfo : e) {
                                axl a6 = avs.a(jobInfo);
                                if (a6 != null) {
                                    hashSet.add(a6.a);
                                } else {
                                    avs.f(a5, jobInfo.getId());
                                }
                            }
                        }
                        Iterator it = b2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!hashSet.contains((String) it.next())) {
                                    asq.a();
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            workDatabase.m();
                            try {
                                axu C = workDatabase.C();
                                Iterator it2 = b2.iterator();
                                while (it2.hasNext()) {
                                    C.x((String) it2.next(), -1L);
                                }
                                workDatabase.p();
                                workDatabase.n();
                            } finally {
                                workDatabase.n();
                            }
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                    }
                } catch (SQLiteException e3) {
                    asq.a().c(a, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    wo woVar2 = this.d.c.f;
                    if (woVar2 == null) {
                        throw illegalStateException2;
                    }
                    woVar2.a(illegalStateException2);
                }
                try {
                    workDatabase = auyVar.d;
                    axu C2 = workDatabase.C();
                    axp B = workDatabase.B();
                    workDatabase.m();
                    try {
                        List<axt> h = C2.h();
                        boolean z3 = (h == null || h.isEmpty()) ? false : true;
                        if (z3) {
                            for (axt axtVar : h) {
                                try {
                                    atb atbVar = atb.a;
                                    String str4 = axtVar.b;
                                    C2.B(atbVar, str4);
                                    C2.s(str4, -512);
                                    C2.x(str4, -1L);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        }
                        B.b();
                        workDatabase.p();
                        if (!z3 && !z) {
                            z2 = false;
                            auy auyVar2 = this.d;
                            a2 = ((WorkDatabase) auyVar2.l.a).x().a("reschedule_needed");
                            if (a2 == null && a2.longValue() == 1) {
                                asq.a();
                                auyVar2.l();
                                ((WorkDatabase) auyVar2.l.a).x().b(new axa("reschedule_needed", 0L));
                            } else {
                                int i4 = Build.VERSION.SDK_INT < 31 ? 570425344 : 536870912;
                                Context context2 = this.c;
                                PendingIntent b3 = b(context2, i4);
                                if (Build.VERSION.SDK_INT < 30) {
                                    if (b3 != null) {
                                        b3.cancel();
                                    }
                                    historicalProcessExitReasons = ((ActivityManager) context2.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                        Long a7 = ((WorkDatabase) this.f.a).x().a("last_force_stop_ms");
                                        long longValue = a7 != null ? a7.longValue() : 0L;
                                        for (i = 0; i < historicalProcessExitReasons.size(); i++) {
                                            ApplicationExitInfo m = it$$ExternalSyntheticApiModelOutline0.m(historicalProcessExitReasons.get(i));
                                            reason = m.getReason();
                                            if (reason == 10) {
                                                timestamp = m.getTimestamp();
                                                if (timestamp >= longValue) {
                                                    asq.a();
                                                    auy auyVar3 = this.d;
                                                    auyVar3.l();
                                                    brn brnVar = this.f;
                                                    yp ypVar = auyVar3.c.n;
                                                    ((WorkDatabase) brnVar.a).x().b(new axa("last_force_stop_ms", Long.valueOf(System.currentTimeMillis())));
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (z2) {
                                        asq.a();
                                        aub.a(auyVar2.c, auyVar2.d, auyVar2.e);
                                    }
                                } else {
                                    if (b3 == null) {
                                        a(context2);
                                        asq.a();
                                        auy auyVar32 = this.d;
                                        auyVar32.l();
                                        brn brnVar2 = this.f;
                                        yp ypVar2 = auyVar32.c.n;
                                        ((WorkDatabase) brnVar2.a).x().b(new axa("last_force_stop_ms", Long.valueOf(System.currentTimeMillis())));
                                        break;
                                    }
                                    if (z2) {
                                    }
                                }
                            }
                        }
                        z2 = true;
                        auy auyVar22 = this.d;
                        a2 = ((WorkDatabase) auyVar22.l.a).x().a("reschedule_needed");
                        if (a2 == null) {
                        }
                        if (Build.VERSION.SDK_INT < 31) {
                        }
                        Context context22 = this.c;
                        PendingIntent b32 = b(context22, i4);
                        if (Build.VERSION.SDK_INT < 30) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    int i5 = this.e + 1;
                    this.e = i5;
                    if (i5 >= 3) {
                        if (!(e instanceof SQLiteAccessPermException) && !(e instanceof SQLiteCantOpenDatabaseException) && !(e instanceof SQLiteConstraintException) && !(e instanceof SQLiteDatabaseCorruptException) && !(e instanceof SQLiteDatabaseLockedException) && !(e instanceof SQLiteDiskIOException) && !(e instanceof SQLiteFullException) && !(e instanceof SQLiteTableLockedException)) {
                            throw e;
                        }
                        asq.a().d(a, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException3 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        wo woVar3 = this.d.c.f;
                        if (woVar3 == null) {
                            throw illegalStateException3;
                        }
                        asq.a();
                        woVar3.a(illegalStateException3);
                    }
                    asq.a();
                    try {
                        Thread.sleep(this.e * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            this.d.k();
        }
    }
}
