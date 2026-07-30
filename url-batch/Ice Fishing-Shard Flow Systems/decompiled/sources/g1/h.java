package g1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import d1.EnumC0356c;
import i1.InterfaceC0542b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC0542b, h1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4996e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4997i;

    public /* synthetic */ h(long j, Object obj, Object obj2) {
        this.f4996e = obj;
        this.f4997i = obj2;
        this.f4995d = j;
    }

    @Override // h1.f
    public Object apply(Object obj) {
        String str = (String) this.f4996e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i2 = ((EnumC0356c) this.f4997i).f4640d;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i2)});
        try {
            boolean z7 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.f4995d;
            if (z7) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i2)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i2));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // i1.InterfaceC0542b
    public Object b() {
        i iVar = (i) this.f4996e;
        a1.i iVar2 = (a1.i) this.f4997i;
        h1.d dVar = iVar.f5000c;
        long d7 = iVar.f5004g.d() + this.f4995d;
        h1.h hVar = (h1.h) dVar;
        hVar.getClass();
        hVar.g(new h1.e(d7, iVar2));
        return null;
    }
}
