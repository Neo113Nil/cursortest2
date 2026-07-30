package Q0;

import G0.A;
import G0.C0103c;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import h0.C0465k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final String f2300m = G0.s.f("ForceStopRunnable");

    /* renamed from: n, reason: collision with root package name */
    public static final long f2301n = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: d, reason: collision with root package name */
    public final Context f2302d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.p f2303e;

    /* renamed from: i, reason: collision with root package name */
    public final l2.c f2304i;

    /* renamed from: l, reason: collision with root package name */
    public int f2305l = 0;

    public f(Context context, H0.p pVar) {
        this.f2302d = context.getApplicationContext();
        this.f2303e = pVar;
        this.f2304i = pVar.f924g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long currentTimeMillis = System.currentTimeMillis() + f2301n;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z7;
        WorkDatabase workDatabase;
        int i2;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        l2.c cVar = this.f2304i;
        String str = K0.b.f1422m;
        Context context = this.f2302d;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList c7 = K0.b.c(context, jobScheduler);
        H0.p pVar = this.f2303e;
        P0.i p7 = pVar.f920c.p();
        p7.getClass();
        C0465k g7 = C0465k.g(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p7.f2200a;
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
        try {
            ArrayList arrayList = new ArrayList(J7.getCount());
            while (J7.moveToNext()) {
                arrayList.add(J7.isNull(0) ? null : J7.getString(0));
            }
            HashSet hashSet = new HashSet(c7 != null ? c7.size() : 0);
            if (c7 != null && !c7.isEmpty()) {
                int size = c7.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = c7.get(i5);
                    i5++;
                    JobInfo jobInfo = (JobInfo) obj;
                    P0.j d7 = K0.b.d(jobInfo);
                    if (d7 != null) {
                        hashSet.add(d7.f2204a);
                    } else {
                        K0.b.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    z7 = false;
                    break;
                }
                Object obj2 = arrayList.get(i7);
                i7++;
                if (!hashSet.contains((String) obj2)) {
                    G0.s.d().a(K0.b.f1422m, "Reconciling jobs");
                    z7 = true;
                    break;
                }
            }
            if (z7) {
                workDatabase = pVar.f920c;
                workDatabase.c();
                try {
                    P0.q t6 = workDatabase.t();
                    int size3 = arrayList.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj3 = arrayList.get(i8);
                        i8++;
                        t6.h((String) obj3, -1L);
                    }
                    workDatabase.o();
                    workDatabase.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = pVar.f920c;
            P0.q t7 = workDatabase.t();
            P0.n s7 = workDatabase.s();
            workDatabase.c();
            try {
                ArrayList c8 = t7.c();
                boolean isEmpty = c8.isEmpty();
                if (!isEmpty) {
                    int size4 = c8.size();
                    int i9 = 0;
                    while (i9 < size4) {
                        Object obj4 = c8.get(i9);
                        i9++;
                        P0.p pVar2 = (P0.p) obj4;
                        t7.k(A.f770d, pVar2.f2220a);
                        t7.h(pVar2.f2220a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) s7.f2214e;
                workDatabase_Impl2.b();
                P0.h hVar = (P0.h) s7.f2217m;
                m0.j a7 = hVar.a();
                workDatabase_Impl2.c();
                try {
                    a7.a();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.k();
                    hVar.d(a7);
                    workDatabase.o();
                    workDatabase.k();
                    boolean z8 = !isEmpty || z7;
                    Long r7 = ((WorkDatabase) pVar.f924g.f6269d).l().r("reschedule_needed");
                    String str2 = f2300m;
                    if (r7 != null && r7.longValue() == 1) {
                        G0.s.d().a(str2, "Rescheduling Workers.");
                        pVar.d();
                        l2.c cVar2 = pVar.f924g;
                        cVar2.getClass();
                        Intrinsics.checkNotNullParameter("reschedule_needed", "key");
                        ((WorkDatabase) cVar2.f6269d).l().t(new P0.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i2 = Build.VERSION.SDK_INT;
                        int i10 = i2 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                        if (G0.s.d().f824a <= 5) {
                            Log.w(str2, "Ignoring exception", e);
                        }
                        G0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.d();
                        long currentTimeMillis = System.currentTimeMillis();
                        cVar.getClass();
                        ((WorkDatabase) cVar.f6269d).l().t(new P0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    } catch (SecurityException e8) {
                        e = e8;
                        if (G0.s.d().f824a <= 5) {
                        }
                        G0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.d();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        cVar.getClass();
                        ((WorkDatabase) cVar.f6269d).l().t(new P0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (i2 >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long r8 = ((WorkDatabase) cVar.f6269d).l().r("last_force_stop_ms");
                            long longValue = r8 != null ? r8.longValue() : 0L;
                            for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                                ApplicationExitInfo c9 = E0.a.c(historicalProcessExitReasons.get(i11));
                                reason = c9.getReason();
                                if (reason == 10) {
                                    timestamp = c9.getTimestamp();
                                    if (timestamp >= longValue) {
                                        G0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                                        pVar.d();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        cVar.getClass();
                                        ((WorkDatabase) cVar.f6269d).l().t(new P0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                        return;
                                    }
                                }
                            }
                        }
                        if (z8) {
                            return;
                        }
                        G0.s.d().a(str2, "Found unfinished work, scheduling it.");
                        H0.i.a(pVar.f919b, pVar.f920c, pVar.f922e);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        G0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.d();
                        long currentTimeMillis222 = System.currentTimeMillis();
                        cVar.getClass();
                        ((WorkDatabase) cVar.f6269d).l().t(new P0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                        return;
                    }
                    if (z8) {
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.k();
                    hVar.d(a7);
                    throw th2;
                }
            } finally {
                workDatabase.k();
            }
        } finally {
            J7.close();
            g7.h();
        }
    }

    public final boolean b() {
        C0103c c0103c = this.f2303e.f919b;
        c0103c.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f2300m;
        if (isEmpty) {
            G0.s.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a7 = l.a(this.f2302d, c0103c);
        G0.s.d().a(str, "Is default app process = " + a7);
        return a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f2300m;
        H0.p pVar = this.f2303e;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    O6.g.V(this.f2302d);
                    G0.s.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e7) {
                        int i2 = this.f2305l + 1;
                        this.f2305l = i2;
                        if (i2 >= 3) {
                            G0.s.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                            pVar.f919b.getClass();
                            throw illegalStateException;
                        }
                        long j = i2 * 300;
                        String str2 = "Retrying after " + j;
                        if (G0.s.d().f824a <= 3) {
                            Log.d(str, str2, e7);
                        }
                        try {
                            Thread.sleep(this.f2305l * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e8) {
                    G0.s.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e8);
                    pVar.f919b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            pVar.c();
        }
    }
}
