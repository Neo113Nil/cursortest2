package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import java.io.Closeable;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class fdl implements ComponentCallbacks2 {
    public static final hkh a = hkh.l("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final gzp d;
    public final List e;
    public final List f;
    public final Executor i;
    public hvi j;
    public boolean m;
    public final bst n;
    public final bsh o;
    private final htq q;
    private ScheduledFuture t;
    public final Set g = new HashSet();
    public final Object h = new Object();
    public final kee p = new kee(this);
    private final hut r = new ckt(this, 7);
    public int k = 0;
    private boolean s = false;
    public boolean l = false;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @Deprecated
    public fdl(Context context, ScheduledExecutorService scheduledExecutorService, bst bstVar, htq htqVar, iwq iwqVar) {
        this.q = htqVar;
        this.c = scheduledExecutorService;
        this.n = bstVar;
        this.i = new hvv(scheduledExecutorService);
        this.b = context;
        this.d = (gzp) iwqVar.d;
        this.e = iwqVar.b;
        this.f = iwqVar.c;
        this.o = (bsh) iwqVar.a;
    }

    public static htz a(hvi hviVar, Closeable... closeableArr) {
        hviVar.getClass();
        kee keeVar = new kee(closeableArr, null);
        hvh hvhVar = htz.a;
        htu htuVar = new htu();
        hwd hwdVar = new hwd(new gvu(keeVar, htuVar, 2));
        hwdVar.run();
        return new htz(hwdVar, htuVar).b(new fda(hviVar, 5), huf.a);
    }

    public static SQLiteDatabase e(Context context, File file, bsh bshVar, gzp gzpVar, List list, List list2) {
        SQLiteDatabase h = h(context, bshVar, file);
        try {
            if (!i(h, bshVar, list, list2)) {
                return h;
            }
            h.close();
            SQLiteDatabase h2 = h(context, bshVar, file);
            try {
                gty aC = hoq.aC(64, "Configuring reopened database.");
                try {
                    hoq.I(!i(h2, bshVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                    aC.close();
                    return h2;
                } catch (Throwable th) {
                    try {
                        aC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                h2.close();
                throw new fdh("Failed to open database.", e);
            } catch (IllegalStateException e2) {
                e = e2;
                h2.close();
                throw new fdh("Failed to open database.", e);
            } catch (Throwable th3) {
                h2.close();
                throw th3;
            }
        } catch (SQLiteException e3) {
            h.close();
            throw new fdh("Failed to open database.", e3);
        } catch (Throwable th4) {
            h.close();
            throw th4;
        }
    }

    public static boolean f(Context context, bsh bshVar) {
        int i = bshVar.a;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean g(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        int version = sQLiteDatabase.getVersion();
        ((hkf) ((hkf) a.b()).i("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "upgradeDatabase", 747, "AsyncSQLiteOpenHelper.java")).t("Database version is %d", version);
        int i = ((his) list).c;
        hoq.L(version <= i, "Can't downgrade from version %s to version %s", version, i);
        fwm fwmVar = new fwm(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            if (version != i) {
                try {
                    try {
                        gty aC = hoq.aC(67, "Applying upgrade steps");
                        try {
                            Iterator it = ((hel) list).subList(version, i).iterator();
                            while (it.hasNext()) {
                                fwmVar.q((fwm) ((bst) it.next()).a);
                            }
                            aC.close();
                            sQLiteDatabase.setVersion(i);
                        } catch (Throwable th) {
                            try {
                                aC.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (SQLiteDatabaseLockedException e) {
                        e = e;
                        throw new fdk("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (InterruptedException e2) {
                        throw new fdk("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e2);
                    }
                } catch (SQLiteDiskIOException e3) {
                    e = e3;
                    throw new fdk("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteFullException e4) {
                    e = e4;
                    throw new fdk("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteOutOfMemoryException e5) {
                    e = e5;
                    throw new fdk("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteTableLockedException e6) {
                    e = e6;
                    throw new fdk("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (Throwable th3) {
                    throw new fdj(th3);
                }
            }
            hjs listIterator = ((hel) list2).listIterator(0);
            if (listIterator.hasNext()) {
                throw null;
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return version != sQLiteDatabase.getVersion();
        } catch (Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    private static SQLiteDatabase h(Context context, bsh bshVar, File file) {
        boolean f = f(context, bshVar);
        int i = f ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (f) {
                openDatabase.enableWriteAheadLogging();
            }
            return openDatabase;
        } catch (Throwable th) {
            throw new fdh("Failed to open database.", th);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    private static boolean i(SQLiteDatabase sQLiteDatabase, bsh bshVar, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        Iterator it = bshVar.b.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf((String) it.next())));
        }
        return g(sQLiteDatabase, list, list2);
    }

    public final htz b() {
        hvi hviVar;
        int i;
        hvi aI;
        hoq.ay();
        gty gtyVar = null;
        try {
            synchronized (this.h) {
                int i2 = this.k + 1;
                this.k = i2;
                hviVar = this.j;
                i = 0;
                if (hviVar == null) {
                    hoq.I(i2 == 1, "DB was null with nonzero refcount");
                    gtyVar = hoq.aC(66, "Opening database");
                    try {
                        htq htqVar = this.q;
                        Executor executor = this.i;
                        hvi aN = hnu.aN(htqVar, executor);
                        hnu.aS(aN, this.r, this.c);
                        aI = hti.f(aN, gvx.a(new euy(this, 7)), executor);
                    } catch (Exception e) {
                        aI = hnu.aI(e);
                    }
                    hviVar = aI;
                    this.j = hviVar;
                }
                ScheduledFuture scheduledFuture = this.t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            }
            hvi aK = hnu.aK(hviVar);
            if (gtyVar != null) {
                gtyVar.b(aK);
            }
            return a(aK, new fdg(this, i)).b(gvx.d(new fda(this, 4)), huf.a);
        } finally {
            if (gtyVar != null) {
                gtyVar.close();
            }
        }
    }

    public final void c() {
        if (this.k != 0 || this.j == null) {
            return;
        }
        if (this.s) {
            d();
            return;
        }
        this.t = this.c.schedule(new evp(this, 7), 60L, TimeUnit.SECONDS);
        if (this.m) {
            return;
        }
        hnu.aS(this.j, new ckt(this, 8), this.i);
    }

    public final void d() {
        this.i.execute(new evp(this, 8));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.h) {
            this.s = i >= 40;
            c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
