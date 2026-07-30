package T1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import d1.EnumC0356c;
import i1.InterfaceC0542b;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements g, InterfaceC0542b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2569e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2570i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2571l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2572m;

    public /* synthetic */ b(f fVar, Object obj, long j, TimeUnit timeUnit, int i2) {
        this.f2568d = i2;
        this.f2569e = fVar;
        this.f2572m = obj;
        this.f2570i = j;
        this.f2571l = timeUnit;
    }

    @Override // T1.g
    public ScheduledFuture a(B.f fVar) {
        switch (this.f2568d) {
            case 0:
                f fVar2 = (f) this.f2569e;
                Runnable runnable = (Runnable) this.f2572m;
                return fVar2.f2587e.schedule(new e(fVar2, runnable, fVar, 1), this.f2570i, (TimeUnit) this.f2571l);
            default:
                f fVar3 = (f) this.f2569e;
                Callable callable = (Callable) this.f2572m;
                return fVar3.f2587e.schedule(new H0.e(fVar3, callable, fVar, 1), this.f2570i, (TimeUnit) this.f2571l);
        }
    }

    @Override // i1.InterfaceC0542b
    public Object b() {
        g1.i iVar = (g1.i) this.f2569e;
        Iterable iterable = (Iterable) this.f2572m;
        a1.i iVar2 = (a1.i) this.f2571l;
        h1.h hVar = (h1.h) iVar.f5000c;
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + h1.h.t(iterable);
            SQLiteDatabase a7 = hVar.a();
            a7.beginTransaction();
            try {
                a7.compileStatement(str).execute();
                Cursor rawQuery = a7.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.j(rawQuery.getInt(0), EnumC0356c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a7.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a7.setTransactionSuccessful();
            } finally {
                a7.endTransaction();
            }
        }
        hVar.g(new h1.e(iVar.f5004g.d() + this.f2570i, iVar2));
        return null;
    }

    public /* synthetic */ b(g1.i iVar, Iterable iterable, a1.i iVar2, long j) {
        this.f2568d = 2;
        this.f2569e = iVar;
        this.f2572m = iterable;
        this.f2571l = iVar2;
        this.f2570i = j;
    }
}
