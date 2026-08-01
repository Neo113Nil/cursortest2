package d6;

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
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final String f3627s = t5.o.f("ForceStopRunnable");

    /* renamed from: t, reason: collision with root package name */
    public static final long f3628t = 315360000000L;

    /* renamed from: d, reason: collision with root package name */
    public final Context f3629d;

    /* renamed from: e, reason: collision with root package name */
    public final u5.m f3630e;

    /* renamed from: i, reason: collision with root package name */
    public final f f3631i;

    /* renamed from: r, reason: collision with root package name */
    public int f3632r = 0;

    public d(Context context, u5.m mVar) {
        this.f3629d = context.getApplicationContext();
        this.f3630e = mVar;
        this.f3631i = mVar.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i3 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
        long currentTimeMillis = System.currentTimeMillis() + f3628t;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i3;
        boolean z10;
        WorkDatabase workDatabase;
        int i10;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        f fVar = this.f3631i;
        String str = x5.b.f10510s;
        Context context = this.f3629d;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList c10 = x5.b.c(context, jobScheduler);
        u5.m mVar = this.f3630e;
        c6.i y3 = mVar.f9651c.y();
        y3.getClass();
        int i11 = 0;
        z a9 = z.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) y3.f1820a;
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            ArrayList arrayList = new ArrayList(E.getCount());
            while (E.moveToNext()) {
                arrayList.add(E.isNull(0) ? null : E.getString(0));
            }
            HashSet hashSet = new HashSet(c10 != null ? c10.size() : 0);
            if (c10 != null && !c10.isEmpty()) {
                int size = c10.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = c10.get(i12);
                    i12++;
                    JobInfo jobInfo = (JobInfo) obj;
                    c6.j f3 = x5.b.f(jobInfo);
                    if (f3 != null) {
                        hashSet.add(f3.f1824a);
                    } else {
                        x5.b.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i13 = 0;
            while (true) {
                i3 = 1;
                if (i13 >= size2) {
                    z10 = false;
                    break;
                }
                Object obj2 = arrayList.get(i13);
                i13++;
                if (!hashSet.contains((String) obj2)) {
                    t5.o.d().a(x5.b.f10510s, "Reconciling jobs");
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                workDatabase = mVar.f9651c;
                workDatabase.c();
                try {
                    c6.q B = workDatabase.B();
                    int size3 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        B.l((String) obj3, -1L);
                    }
                    workDatabase.u();
                    workDatabase.h();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = mVar.f9651c;
            c6.q B2 = workDatabase.B();
            c6.n A = workDatabase.A();
            workDatabase.c();
            try {
                ArrayList g = B2.g();
                boolean isEmpty = g.isEmpty();
                if (!isEmpty) {
                    int size4 = g.size();
                    while (i11 < size4) {
                        c6.p pVar = (c6.p) g.get(i11);
                        B2.p(i3, pVar.f1839a);
                        B2.l(pVar.f1839a, -1L);
                        i11++;
                        i3 = 1;
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) A.f1833d;
                workDatabase_Impl2.b();
                c6.h hVar = (c6.h) A.f1836r;
                k5.k a10 = hVar.a();
                workDatabase_Impl2.c();
                try {
                    a10.a();
                    workDatabase_Impl2.u();
                    workDatabase_Impl2.h();
                    hVar.c(a10);
                    workDatabase.u();
                    workDatabase.h();
                    boolean z11 = !isEmpty || z10;
                    Long j = mVar.g.f3635a.x().j("reschedule_needed");
                    String str2 = f3627s;
                    if (j != null && j.longValue() == 1) {
                        t5.o.d().a(str2, "Rescheduling Workers.");
                        mVar.d();
                        f fVar2 = mVar.g;
                        fVar2.getClass();
                        fVar2.f3635a.x().l(new c6.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i10 = Build.VERSION.SDK_INT;
                        int i15 = i10 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i15);
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        if (t5.o.d().f9314a <= 5) {
                            Log.w(str2, "Ignoring exception", e);
                        }
                        t5.o.d().a(str2, "Application was force-stopped, rescheduling.");
                        mVar.d();
                        long currentTimeMillis = System.currentTimeMillis();
                        fVar.getClass();
                        fVar.f3635a.x().l(new c6.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    } catch (SecurityException e9) {
                        e = e9;
                        if (t5.o.d().f9314a <= 5) {
                        }
                        t5.o.d().a(str2, "Application was force-stopped, rescheduling.");
                        mVar.d();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        fVar.getClass();
                        fVar.f3635a.x().l(new c6.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (i10 >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long j3 = fVar.f3635a.x().j("last_force_stop_ms");
                            long longValue = j3 != null ? j3.longValue() : 0L;
                            for (int i16 = 0; i16 < historicalProcessExitReasons.size(); i16++) {
                                ApplicationExitInfo g2 = com.appsflyer.internal.n.g(historicalProcessExitReasons.get(i16));
                                reason = g2.getReason();
                                if (reason == 10) {
                                    timestamp = g2.getTimestamp();
                                    if (timestamp >= longValue) {
                                        t5.o.d().a(str2, "Application was force-stopped, rescheduling.");
                                        mVar.d();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        fVar.getClass();
                                        fVar.f3635a.x().l(new c6.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                        return;
                                    }
                                }
                            }
                        }
                        if (z11) {
                            return;
                        }
                        t5.o.d().a(str2, "Found unfinished work, scheduling it.");
                        u5.h.a(mVar.f9650b, mVar.f9651c, mVar.f9653e);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        t5.o.d().a(str2, "Application was force-stopped, rescheduling.");
                        mVar.d();
                        long currentTimeMillis222 = System.currentTimeMillis();
                        fVar.getClass();
                        fVar.f3635a.x().l(new c6.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                        return;
                    }
                    if (z11) {
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.h();
                    hVar.c(a10);
                    throw th2;
                }
            } finally {
                workDatabase.h();
            }
        } finally {
            E.close();
            a9.d();
        }
    }

    public final boolean b() {
        t5.b bVar = this.f3630e.f9650b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f3627s;
        if (isEmpty) {
            t5.o.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a9 = k.a(this.f3629d, bVar);
        t5.o.d().a(str, "Is default app process = " + a9);
        return a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f3627s;
        u5.m mVar = this.f3630e;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    z4.w.E(this.f3629d);
                    t5.o.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e2) {
                        int i3 = this.f3632r + 1;
                        this.f3632r = i3;
                        if (i3 >= 3) {
                            t5.o.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            mVar.f9650b.getClass();
                            throw illegalStateException;
                        }
                        long j = i3 * 300;
                        String str2 = "Retrying after " + j;
                        if (t5.o.d().f9314a <= 3) {
                            Log.d(str, str2, e2);
                        }
                        try {
                            Thread.sleep(this.f3632r * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e9) {
                    t5.o.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e9);
                    mVar.f9650b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            mVar.c();
        }
    }
}
