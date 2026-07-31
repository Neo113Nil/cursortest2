package J0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements L0.b, K0.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1267g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1268h;

    public /* synthetic */ j(Object obj, Object obj2, long j4) {
        this.f1267g = obj;
        this.f1268h = obj2;
        this.f1266f = j4;
    }

    @Override // K0.f
    public Object apply(Object obj) {
        String str = (String) this.f1267g;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i7 = ((G0.c) this.f1268h).f823f;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
        try {
            boolean z5 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j4 = this.f1266f;
            if (z5) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i7));
            contentValues.put("events_dropped_count", Long.valueOf(j4));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // L0.b
    public Object c() {
        k kVar = (k) this.f1267g;
        D0.j jVar = (D0.j) this.f1268h;
        K0.d dVar = kVar.f1271c;
        long c7 = kVar.f1275g.c() + this.f1266f;
        K0.h hVar = (K0.h) dVar;
        hVar.getClass();
        hVar.e(new K0.e(c7, jVar));
        return null;
    }
}
