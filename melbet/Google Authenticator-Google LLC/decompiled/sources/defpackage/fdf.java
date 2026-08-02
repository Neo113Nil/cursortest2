package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fdf {
    public final SQLiteDatabase a;
    public final Executor b;
    public volatile boolean c = false;
    public final kee d;
    private final Executor e;

    public fdf(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, kee keeVar) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.e = executor2;
        this.d = keeVar;
    }

    public final hvi a(fds fdsVar) {
        b();
        guc gucVar = gub.a;
        fwm fwmVar = new fwm(this.a);
        gty aB = hoq.aB(62, "Transaction", gucVar, true);
        try {
            hvj hvjVar = new hvj(gvx.i(new fdd(this, fdsVar, fwmVar)));
            this.e.execute(hvjVar);
            hvjVar.c(new evb(hvjVar, fwmVar, 3, null), huf.a);
            aB.b(hvjVar);
            aB.close();
            return hvjVar;
        } catch (Throwable th) {
            try {
                aB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.c) {
            throw new IllegalStateException("Already closed");
        }
    }
}
