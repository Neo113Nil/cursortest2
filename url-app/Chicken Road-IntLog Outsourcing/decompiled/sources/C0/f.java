package C0;

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
import c0.C0307i;
import h2.C0482c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import s0.C1414b;
import u1.AbstractC1477a;
import w0.C1506b;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f331e = s0.s.f("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f332f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f333a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.o f334b;

    /* renamed from: c, reason: collision with root package name */
    public final C0482c f335c;

    /* renamed from: d, reason: collision with root package name */
    public int f336d = 0;

    public f(Context context, t0.o oVar) {
        this.f333a = context.getApplicationContext();
        this.f334b = oVar;
        this.f335c = oVar.f11888g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long currentTimeMillis = System.currentTimeMillis() + f332f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        WorkDatabase workDatabase;
        int i2;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        C0482c c0482c = this.f335c;
        String str = C1506b.f12111e;
        Context context = this.f333a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList c2 = C1506b.c(context, jobScheduler);
        t0.o oVar = this.f334b;
        B0.i p5 = oVar.f11884c.p();
        p5.getClass();
        X.k c6 = X.k.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p5.f153b;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c6, null);
        try {
            ArrayList arrayList = new ArrayList(m6.getCount());
            while (m6.moveToNext()) {
                arrayList.add(m6.isNull(0) ? null : m6.getString(0));
            }
            HashSet hashSet = new HashSet(c2 != null ? c2.size() : 0);
            if (c2 != null && !c2.isEmpty()) {
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    B0.j d6 = C1506b.d(jobInfo);
                    if (d6 != null) {
                        hashSet.add(d6.f157a);
                    } else {
                        C1506b.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        s0.s.d().a(C1506b.f12111e, "Reconciling jobs");
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                workDatabase = oVar.f11884c;
                workDatabase.c();
                try {
                    B0.r t5 = workDatabase.t();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        t5.h(-1L, (String) it3.next());
                    }
                    workDatabase.o();
                    workDatabase.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = oVar.f11884c;
            B0.r t6 = workDatabase.t();
            B0.n s2 = workDatabase.s();
            workDatabase.c();
            try {
                ArrayList c7 = t6.c();
                boolean isEmpty = c7.isEmpty();
                if (!isEmpty) {
                    Iterator it4 = c7.iterator();
                    while (it4.hasNext()) {
                        B0.q qVar = (B0.q) it4.next();
                        t6.k(1, qVar.f173a);
                        t6.h(-1L, qVar.f173a);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) s2.f167a;
                workDatabase_Impl2.b();
                B0.h hVar = (B0.h) s2.f170d;
                C0307i a6 = hVar.a();
                workDatabase_Impl2.c();
                try {
                    a6.a();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.k();
                    hVar.n(a6);
                    workDatabase.o();
                    workDatabase.k();
                    boolean z5 = !isEmpty || z;
                    Long l2 = ((WorkDatabase) oVar.f11888g.f5783b).l().l("reschedule_needed");
                    String str2 = f331e;
                    if (l2 != null && l2.longValue() == 1) {
                        s0.s.d().a(str2, "Rescheduling Workers.");
                        oVar.d();
                        C0482c c0482c2 = oVar.f11888g;
                        c0482c2.getClass();
                        ((WorkDatabase) c0482c2.f5783b).l().m(new B0.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i2 = Build.VERSION.SDK_INT;
                        int i3 = i2 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        if (s0.s.d().f11793a <= 5) {
                            Log.w(str2, "Ignoring exception", e);
                        }
                        s0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        oVar.d();
                        long currentTimeMillis = System.currentTimeMillis();
                        c0482c.getClass();
                        ((WorkDatabase) c0482c.f5783b).l().m(new B0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    } catch (SecurityException e6) {
                        e = e6;
                        if (s0.s.d().f11793a <= 5) {
                        }
                        s0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        oVar.d();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        c0482c.getClass();
                        ((WorkDatabase) c0482c.f5783b).l().m(new B0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (i2 >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long l6 = ((WorkDatabase) c0482c.f5783b).l().l("last_force_stop_ms");
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            for (int i6 = 0; i6 < historicalProcessExitReasons.size(); i6++) {
                                ApplicationExitInfo d7 = e.d(historicalProcessExitReasons.get(i6));
                                reason = d7.getReason();
                                if (reason == 10) {
                                    timestamp = d7.getTimestamp();
                                    if (timestamp >= longValue) {
                                        s0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                                        oVar.d();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        c0482c.getClass();
                                        ((WorkDatabase) c0482c.f5783b).l().m(new B0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                        return;
                                    }
                                }
                            }
                        }
                        if (z5) {
                            return;
                        }
                        s0.s.d().a(str2, "Found unfinished work, scheduling it.");
                        t0.i.a(oVar.f11883b, oVar.f11884c, oVar.f11886e);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        s0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        oVar.d();
                        long currentTimeMillis222 = System.currentTimeMillis();
                        c0482c.getClass();
                        ((WorkDatabase) c0482c.f5783b).l().m(new B0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                        return;
                    }
                    if (z5) {
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.k();
                    hVar.n(a6);
                    throw th2;
                }
            } finally {
                workDatabase.k();
            }
        } finally {
            m6.close();
            c6.g();
        }
    }

    public final boolean b() {
        C1414b c1414b = this.f334b.f11883b;
        c1414b.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f331e;
        if (isEmpty) {
            s0.s.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a6 = m.a(this.f333a, c1414b);
        s0.s.d().a(str, "Is default app process = " + a6);
        return a6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f331e;
        t0.o oVar = this.f334b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    AbstractC1477a.t(this.f333a);
                    s0.s.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e3) {
                        int i2 = this.f336d + 1;
                        this.f336d = i2;
                        if (i2 >= 3) {
                            s0.s.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                            oVar.f11883b.getClass();
                            throw illegalStateException;
                        }
                        long j2 = i2 * 300;
                        String str2 = "Retrying after " + j2;
                        if (s0.s.d().f11793a <= 3) {
                            Log.d(str, str2, e3);
                        }
                        try {
                            Thread.sleep(this.f336d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e6) {
                    s0.s.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e6);
                    oVar.f11883b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            oVar.c();
        }
    }
}
