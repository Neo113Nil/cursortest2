package q6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements s6.b, r6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8049e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8050i;

    public /* synthetic */ h(long j, Object obj, Object obj2) {
        this.f8049e = obj;
        this.f8050i = obj2;
        this.f8048d = j;
    }

    @Override // s6.b
    public Object a() {
        i iVar = (i) this.f8049e;
        k6.i iVar2 = (k6.i) this.f8050i;
        r6.g gVar = (r6.g) iVar.f8053c;
        long g = ((c0) iVar.f8057h).g() + this.f8048d;
        gVar.getClass();
        gVar.h(new r6.d(g, iVar2));
        return null;
    }

    @Override // r6.e
    public Object apply(Object obj) {
        String str = (String) this.f8049e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i3 = ((n6.c) this.f8050i).f7161d;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i3)});
        try {
            boolean z10 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.f8048d;
            if (z10) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i3)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i3));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
