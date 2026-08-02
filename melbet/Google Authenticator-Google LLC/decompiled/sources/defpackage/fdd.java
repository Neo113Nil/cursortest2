package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fdd implements Callable {
    volatile boolean a;
    final /* synthetic */ fds b;
    final /* synthetic */ fdf c;
    final /* synthetic */ fwm d;

    public fdd(fdf fdfVar, fds fdsVar, fwm fwmVar) {
        this.b = fdsVar;
        this.d = fwmVar;
        this.c = fdfVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SQLiteDatabase sQLiteDatabase = this.c.a;
        hoq.I(!sQLiteDatabase.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        sQLiteDatabase.beginTransactionWithListener(new fdc(this));
        try {
            this.a = true;
            Object a = this.b.a(this.d);
            fwm.i();
            sQLiteDatabase.setTransactionSuccessful();
            this.a = false;
            return a;
        } finally {
            this.c.a.endTransaction();
        }
    }
}
