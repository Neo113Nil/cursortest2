package J0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements L0.b, q1.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1263h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1264i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1265j;

    public /* synthetic */ i(k kVar, Iterable iterable, D0.j jVar, long j4) {
        this.f1261f = 0;
        this.f1263h = kVar;
        this.f1264i = iterable;
        this.f1265j = jVar;
        this.f1262g = j4;
    }

    @Override // q1.f
    public ScheduledFuture a(a6.d dVar) {
        switch (this.f1261f) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                q1.e eVar = (q1.e) this.f1263h;
                Runnable runnable = (Runnable) this.f1264i;
                return eVar.f5773g.schedule(new q1.d(eVar, runnable, dVar, 1), this.f1262g, (TimeUnit) this.f1265j);
            default:
                q1.e eVar2 = (q1.e) this.f1263h;
                Callable callable = (Callable) this.f1264i;
                return eVar2.f5773g.schedule(new m0.e(eVar2, callable, dVar, 1), this.f1262g, (TimeUnit) this.f1265j);
        }
    }

    @Override // L0.b
    public Object c() {
        k kVar = (k) this.f1263h;
        Iterable iterable = (Iterable) this.f1264i;
        D0.j jVar = (D0.j) this.f1265j;
        K0.h hVar = (K0.h) kVar.f1271c;
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + K0.h.n(iterable);
            SQLiteDatabase a7 = hVar.a();
            a7.beginTransaction();
            try {
                a7.compileStatement(str).execute();
                Cursor rawQuery = a7.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.h(rawQuery.getInt(0), G0.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
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
        hVar.e(new K0.e(kVar.f1275g.c() + this.f1262g, jVar));
        return null;
    }

    public /* synthetic */ i(q1.e eVar, Object obj, long j4, TimeUnit timeUnit, int i7) {
        this.f1261f = i7;
        this.f1263h = eVar;
        this.f1264i = obj;
        this.f1262g = j4;
        this.f1265j = timeUnit;
    }
}
