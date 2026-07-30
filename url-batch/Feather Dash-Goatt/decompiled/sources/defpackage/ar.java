package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ar implements gr, bg1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ar(ne0 ne0Var, Iterable iterable, cc ccVar, long j) {
        this.d = 2;
        this.e = ne0Var;
        this.i = iterable;
        this.h = ccVar;
        this.g = j;
    }

    @Override // defpackage.gr
    public ScheduledFuture a(final s40 s40Var) {
        int i = this.d;
        Object obj = this.h;
        long j = this.g;
        Object obj2 = this.i;
        final fr frVar = (fr) this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return frVar.e.schedule(new dr(frVar, (Runnable) obj2, s40Var, 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return frVar.e.schedule(new Callable() { // from class: er
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fr.this.d.submit(new x4(callable, 4, s40Var));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.bg1
    public Object b() {
        ne0 ne0Var = (ne0) this.e;
        Iterable iterable = (Iterable) this.i;
        cc ccVar = (cc) this.h;
        b51 b51Var = (b51) ne0Var.c;
        b51Var.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(b51.g(iterable));
            SQLiteDatabase a = b51Var.a();
            a.beginTransaction();
            try {
                a.compileStatement(concat).execute();
                Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        b51Var.e(rawQuery.getInt(0), ui0.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a.setTransactionSuccessful();
            } finally {
                a.endTransaction();
            }
        }
        b51Var.c(new x41(((me1) ne0Var.g).d() + this.g, ccVar));
        return null;
    }

    public /* synthetic */ ar(fr frVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.d = i;
        this.e = frVar;
        this.i = obj;
        this.g = j;
        this.h = timeUnit;
    }
}
