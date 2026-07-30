package O3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import g1.C4523c;
import h2.InterfaceC4565b;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements g, InterfaceC4565b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2493n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2494u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f2495v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2496w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2497x;

    public /* synthetic */ b(f fVar, Object obj, long j9, TimeUnit timeUnit, int i) {
        this.f2493n = i;
        this.f2494u = fVar;
        this.f2497x = obj;
        this.f2495v = j9;
        this.f2496w = timeUnit;
    }

    @Override // O3.g
    public ScheduledFuture a(C4523c c4523c) {
        switch (this.f2493n) {
            case 0:
                f fVar = (f) this.f2494u;
                return fVar.f2512u.schedule(new e(fVar, (Runnable) this.f2497x, c4523c, 1), this.f2495v, (TimeUnit) this.f2496w);
            default:
                f fVar2 = (f) this.f2494u;
                return fVar2.f2512u.schedule(new K0.e(fVar2, (Callable) this.f2497x, c4523c, 1), this.f2495v, (TimeUnit) this.f2496w);
        }
    }

    @Override // h2.InterfaceC4565b
    public Object d() {
        f2.i iVar = (f2.i) this.f2494u;
        g2.h hVar = (g2.h) iVar.f37688c;
        hVar.getClass();
        Iterable iterable = (Iterable) this.f2497x;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + g2.h.n(iterable);
            SQLiteDatabase b9 = hVar.b();
            b9.beginTransaction();
            try {
                b9.compileStatement(str).execute();
                Cursor rawQuery = b9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.k(rawQuery.getInt(0), c2.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                b9.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                b9.setTransactionSuccessful();
            } finally {
                b9.endTransaction();
            }
        }
        hVar.i(new g2.e(iVar.f37692g.a() + this.f2495v, (Z1.i) this.f2496w));
        return null;
    }

    public /* synthetic */ b(f2.i iVar, Iterable iterable, Z1.i iVar2, long j9) {
        this.f2493n = 2;
        this.f2494u = iVar;
        this.f2497x = iterable;
        this.f2496w = iVar2;
        this.f2495v = j9;
    }
}
