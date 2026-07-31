package v0;

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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l0.C0488b;
import u0.C0674d;
import u0.C0678h;
import u0.C0679i;
import u0.C0680j;
import u0.C0684n;
import u0.C0686p;
import u0.C0687q;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final String f6060j = l0.q.f("ForceStopRunnable");

    /* renamed from: k, reason: collision with root package name */
    public static final long f6061k = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: f, reason: collision with root package name */
    public final Context f6062f;

    /* renamed from: g, reason: collision with root package name */
    public final m0.o f6063g;

    /* renamed from: h, reason: collision with root package name */
    public final a6.d f6064h;

    /* renamed from: i, reason: collision with root package name */
    public int f6065i = 0;

    public d(Context context, m0.o oVar) {
        this.f6062f = context.getApplicationContext();
        this.f6063g = oVar;
        this.f6064h = oVar.f5379g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i7 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
        long currentTimeMillis = System.currentTimeMillis() + f6061k;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z5;
        boolean z6;
        WorkDatabase workDatabase;
        int i7;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        a6.d dVar = this.f6064h;
        String str = p0.b.f5655j;
        Context context = this.f6062f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList d7 = p0.b.d(context, jobScheduler);
        m0.o oVar = this.f6063g;
        C0679i p4 = oVar.f5375c.p();
        p4.getClass();
        int i8 = 0;
        Q.k e4 = Q.k.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p4.f5981f;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            ArrayList arrayList = new ArrayList(m4.getCount());
            while (m4.moveToNext()) {
                arrayList.add(m4.isNull(0) ? null : m4.getString(0));
            }
            HashSet hashSet = new HashSet(d7 != null ? d7.size() : 0);
            if (d7 != null && !d7.isEmpty()) {
                int size = d7.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = d7.get(i9);
                    i9++;
                    JobInfo jobInfo = (JobInfo) obj;
                    C0680j f7 = p0.b.f(jobInfo);
                    if (f7 != null) {
                        hashSet.add(f7.f5985a);
                    } else {
                        p0.b.c(jobScheduler, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                z5 = true;
                if (i10 >= size2) {
                    z6 = false;
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                if (!hashSet.contains((String) obj2)) {
                    l0.q.d().a(p0.b.f5655j, "Reconciling jobs");
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                workDatabase = oVar.f5375c;
                workDatabase.c();
                try {
                    C0687q t6 = workDatabase.t();
                    int size3 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        t6.h(-1L, (String) obj3);
                    }
                    workDatabase.o();
                    workDatabase.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = oVar.f5375c;
            C0687q t7 = workDatabase.t();
            C0684n s6 = workDatabase.s();
            workDatabase.c();
            try {
                ArrayList c7 = t7.c();
                boolean isEmpty = c7.isEmpty();
                if (!isEmpty) {
                    int size4 = c7.size();
                    while (i8 < size4) {
                        Object obj4 = c7.get(i8);
                        i8++;
                        C0686p c0686p = (C0686p) obj4;
                        t7.k(c0686p.f6000a, 1);
                        t7.h(-1L, c0686p.f6000a);
                        z6 = z6;
                    }
                }
                boolean z7 = z6;
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) s6.f5994g;
                workDatabase_Impl2.b();
                C0678h c0678h = (C0678h) s6.f5997j;
                V.i a7 = c0678h.a();
                workDatabase_Impl2.c();
                try {
                    a7.a();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.k();
                    c0678h.n(a7);
                    workDatabase.o();
                    workDatabase.k();
                    if (isEmpty && !z7) {
                        z5 = false;
                    }
                    Long e7 = ((WorkDatabase) oVar.f5379g.f3172f).l().e("reschedule_needed");
                    String str2 = f6060j;
                    if (e7 != null && e7.longValue() == 1) {
                        l0.q.d().a(str2, "Rescheduling Workers.");
                        oVar.d();
                        a6.d dVar2 = oVar.f5379g;
                        dVar2.getClass();
                        ((WorkDatabase) dVar2.f3172f).l().f(new C0674d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i7 = Build.VERSION.SDK_INT;
                        int i12 = i7 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i12);
                    } catch (IllegalArgumentException e8) {
                        e = e8;
                        if (l0.q.d().f5283a <= 5) {
                            Log.w(str2, "Ignoring exception", e);
                        }
                        l0.q.d().a(str2, "Application was force-stopped, rescheduling.");
                        oVar.d();
                        long currentTimeMillis = System.currentTimeMillis();
                        dVar.getClass();
                        ((WorkDatabase) dVar.f3172f).l().f(new C0674d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    } catch (SecurityException e9) {
                        e = e9;
                        if (l0.q.d().f5283a <= 5) {
                        }
                        l0.q.d().a(str2, "Application was force-stopped, rescheduling.");
                        oVar.d();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        dVar.getClass();
                        ((WorkDatabase) dVar.f3172f).l().f(new C0674d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (i7 >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long e10 = ((WorkDatabase) dVar.f3172f).l().e("last_force_stop_ms");
                            long longValue = e10 != null ? e10.longValue() : 0L;
                            for (int i13 = 0; i13 < historicalProcessExitReasons.size(); i13++) {
                                ApplicationExitInfo c8 = io.flutter.view.b.c(historicalProcessExitReasons.get(i13));
                                reason = c8.getReason();
                                if (reason == 10) {
                                    timestamp = c8.getTimestamp();
                                    if (timestamp >= longValue) {
                                        l0.q.d().a(str2, "Application was force-stopped, rescheduling.");
                                        oVar.d();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        dVar.getClass();
                                        ((WorkDatabase) dVar.f3172f).l().f(new C0674d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                        return;
                                    }
                                }
                            }
                        }
                        if (z5) {
                            return;
                        }
                        l0.q.d().a(str2, "Found unfinished work, scheduling it.");
                        m0.i.a(oVar.f5374b, oVar.f5375c, oVar.f5377e);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        l0.q.d().a(str2, "Application was force-stopped, rescheduling.");
                        oVar.d();
                        long currentTimeMillis222 = System.currentTimeMillis();
                        dVar.getClass();
                        ((WorkDatabase) dVar.f3172f).l().f(new C0674d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                        return;
                    }
                    if (z5) {
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.k();
                    c0678h.n(a7);
                    throw th2;
                }
            } finally {
                workDatabase.k();
            }
        } finally {
            m4.close();
            e4.g();
        }
    }

    public final boolean b() {
        C0488b c0488b = this.f6063g.f5374b;
        c0488b.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f6060j;
        if (isEmpty) {
            l0.q.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a7 = j.a(this.f6062f, c0488b);
        l0.q.d().a(str, "Is default app process = " + a7);
        return a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f6060j;
        m0.o oVar = this.f6063g;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    i6.g.q(this.f6062f);
                    l0.q.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e4) {
                        int i7 = this.f6065i + 1;
                        this.f6065i = i7;
                        if (i7 >= 3) {
                            l0.q.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                            oVar.f5374b.getClass();
                            throw illegalStateException;
                        }
                        long j4 = i7 * 300;
                        String str2 = "Retrying after " + j4;
                        if (l0.q.d().f5283a <= 3) {
                            Log.d(str, str2, e4);
                        }
                        try {
                            Thread.sleep(this.f6065i * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e7) {
                    l0.q.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e7);
                    oVar.f5374b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            oVar.c();
        }
    }
}
