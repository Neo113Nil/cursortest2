package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import d0.g;
import d0.j;
import d0.s;
import e0.f;
import e0.h;
import e0.i;
import g0.b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l0.n;
import l0.p;
import l0.q;
import p.a;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    private static final String f1549i = j.f("ForceStopRunnable");

    /* renamed from: j, reason: collision with root package name */
    private static final long f1550j = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: f, reason: collision with root package name */
    private final Context f1551f;

    /* renamed from: g, reason: collision with root package name */
    private final i f1552g;

    /* renamed from: h, reason: collision with root package name */
    private int f1553h = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f1554a = j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j.c().g(f1554a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f1551f = context.getApplicationContext();
        this.f1552g = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i7) {
        return PendingIntent.getBroadcast(context, -1, c(context), i7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d7 = d(context, a.b() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f1550j;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, d7);
            } else {
                alarmManager.set(0, currentTimeMillis, d7);
            }
        }
    }

    public boolean a() {
        boolean i7 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f1551f, this.f1552g) : false;
        WorkDatabase o7 = this.f1552g.o();
        q B = o7.B();
        n A = o7.A();
        o7.c();
        try {
            List<p> b7 = B.b();
            boolean z6 = (b7 == null || b7.isEmpty()) ? false : true;
            if (z6) {
                for (p pVar : b7) {
                    B.j(s.ENQUEUED, pVar.f18477a);
                    B.d(pVar.f18477a, -1L);
                }
            }
            A.c();
            o7.r();
            return z6 || i7;
        } finally {
            o7.g();
        }
    }

    public void b() {
        boolean a7 = a();
        if (h()) {
            j.c().a(f1549i, "Rescheduling Workers.", new Throwable[0]);
            this.f1552g.s();
            this.f1552g.l().c(false);
        } else if (e()) {
            j.c().a(f1549i, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f1552g.s();
        } else if (a7) {
            j.c().a(f1549i, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f1552g.i(), this.f1552g.o(), this.f1552g.n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            PendingIntent d7 = d(this.f1551f, a.b() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d7 != null) {
                    d7.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f1551f.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i7 = 0; i7 < historicalProcessExitReasons.size(); i7++) {
                        if (historicalProcessExitReasons.get(i7).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d7 == null) {
                g(this.f1551f);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e7) {
            j.c().h(f1549i, "Ignoring exception", e7);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a i7 = this.f1552g.i();
        if (TextUtils.isEmpty(i7.c())) {
            j.c().a(f1549i, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b7 = m0.f.b(this.f1551f, i7);
        j.c().a(f1549i, String.format("Is default app process = %s", Boolean.valueOf(b7)), new Throwable[0]);
        return b7;
    }

    boolean h() {
        return this.f1552g.l().a();
    }

    public void i(long j7) {
        try {
            Thread.sleep(j7);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i7;
        try {
            if (f()) {
                while (true) {
                    h.e(this.f1551f);
                    j.c().a(f1549i, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e7) {
                        i7 = this.f1553h + 1;
                        this.f1553h = i7;
                        if (i7 >= 3) {
                            j c7 = j.c();
                            String str = f1549i;
                            c7.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                            g d7 = this.f1552g.i().d();
                            if (d7 == null) {
                                throw illegalStateException;
                            }
                            j.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                            d7.a(illegalStateException);
                        } else {
                            j.c().a(f1549i, String.format("Retrying after %s", Long.valueOf(i7 * 300)), e7);
                            i(this.f1553h * 300);
                        }
                    }
                    j.c().a(f1549i, String.format("Retrying after %s", Long.valueOf(i7 * 300)), e7);
                    i(this.f1553h * 300);
                }
            }
        } finally {
            this.f1552g.r();
        }
    }
}
