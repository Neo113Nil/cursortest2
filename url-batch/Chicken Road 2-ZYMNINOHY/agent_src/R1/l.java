package R1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements T1.b, S1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2361c;

    public /* synthetic */ l(long j4, Object obj, Object obj2) {
        this.f2360b = obj;
        this.f2361c = obj2;
        this.f2359a = j4;
    }

    @Override // S1.h
    public Object apply(Object obj) {
        String str = (String) this.f2360b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i4 = ((O1.c) this.f2361c).f2022a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i4)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j4 = this.f2359a;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i4)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i4));
            contentValues.put("events_dropped_count", Long.valueOf(j4));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // T1.b
    public Object c() {
        m mVar = (m) this.f2360b;
        L1.j jVar = (L1.j) this.f2361c;
        S1.d dVar = mVar.f2364c;
        long q4 = mVar.f2368g.q() + this.f2359a;
        S1.j jVar2 = (S1.j) dVar;
        jVar2.getClass();
        jVar2.e(new S1.f(q4, jVar));
        return null;
    }
}
