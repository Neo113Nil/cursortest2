package O1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b1.C0273j;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements h, d1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2235e;

    public /* synthetic */ b(g gVar, Object obj, long j2, TimeUnit timeUnit, int i2) {
        this.f2231a = i2;
        this.f2232b = gVar;
        this.f2235e = obj;
        this.f2233c = j2;
        this.f2234d = timeUnit;
    }

    @Override // O1.h
    public ScheduledFuture a(B1.g gVar) {
        switch (this.f2231a) {
            case 0:
                g gVar2 = (g) this.f2232b;
                gVar2.getClass();
                return gVar2.f2254b.schedule(new e(gVar2, (Runnable) this.f2235e, gVar, 1), this.f2233c, (TimeUnit) this.f2234d);
            default:
                g gVar3 = (g) this.f2232b;
                gVar3.getClass();
                return gVar3.f2254b.schedule(new f(gVar3, (Callable) this.f2235e, gVar, 0), this.f2233c, (TimeUnit) this.f2234d);
        }
    }

    @Override // d1.b
    public Object execute() {
        C0273j c0273j = (C0273j) this.f2232b;
        c1.i iVar = (c1.i) c0273j.f4789c;
        iVar.getClass();
        Iterable iterable = (Iterable) this.f2235e;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + c1.i.q(iterable);
            SQLiteDatabase a6 = iVar.a();
            a6.beginTransaction();
            try {
                a6.compileStatement(str).execute();
                Cursor rawQuery = a6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = rawQuery;
                    while (cursor.moveToNext()) {
                        iVar.o(cursor.getInt(0), Y0.c.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    rawQuery.close();
                    a6.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    a6.setTransactionSuccessful();
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            } finally {
                a6.endTransaction();
            }
        }
        iVar.c(new c1.e(c0273j.f4793g.e() + this.f2233c, (V0.i) this.f2234d));
        return null;
    }

    public /* synthetic */ b(C0273j c0273j, Iterable iterable, V0.i iVar, long j2) {
        this.f2231a = 2;
        this.f2232b = c0273j;
        this.f2235e = iterable;
        this.f2234d = iVar;
        this.f2233c = j2;
    }
}
