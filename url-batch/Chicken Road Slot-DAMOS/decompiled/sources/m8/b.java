package m8;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements h, s6.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6578e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6579i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6580r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6581s;

    public /* synthetic */ b(q6.i iVar, Iterable iterable, k6.i iVar2, long j) {
        this.f6577d = 2;
        this.f6578e = iVar;
        this.f6581s = iterable;
        this.f6580r = iVar2;
        this.f6579i = j;
    }

    @Override // s6.b
    public Object a() {
        q6.i iVar = (q6.i) this.f6578e;
        Iterable iterable = (Iterable) this.f6581s;
        k6.i iVar2 = (k6.i) this.f6580r;
        r6.g gVar = (r6.g) iVar.f8053c;
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(r6.g.o(iterable));
            SQLiteDatabase a9 = gVar.a();
            a9.beginTransaction();
            try {
                a9.compileStatement(concat).execute();
                Cursor rawQuery = a9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        gVar.j(rawQuery.getInt(0), n6.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a9.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a9.setTransactionSuccessful();
            } finally {
                a9.endTransaction();
            }
        }
        gVar.h(new r6.d(((c0) iVar.f8057h).g() + this.f6579i, iVar2));
        return null;
    }

    @Override // m8.h
    public ScheduledFuture b(l.d dVar) {
        switch (this.f6577d) {
            case 0:
                g gVar = (g) this.f6578e;
                Runnable runnable = (Runnable) this.f6581s;
                return gVar.f6600e.schedule(new e(gVar, runnable, dVar, 1), this.f6579i, (TimeUnit) this.f6580r);
            default:
                g gVar2 = (g) this.f6578e;
                Callable callable = (Callable) this.f6581s;
                return gVar2.f6600e.schedule(new f(gVar2, callable, dVar, 0), this.f6579i, (TimeUnit) this.f6580r);
        }
    }

    public /* synthetic */ b(g gVar, Object obj, long j, TimeUnit timeUnit, int i3) {
        this.f6577d = i3;
        this.f6578e = gVar;
        this.f6581s = obj;
        this.f6579i = j;
        this.f6580r = timeUnit;
    }
}
