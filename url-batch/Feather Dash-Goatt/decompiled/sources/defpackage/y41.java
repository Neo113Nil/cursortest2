package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y41 implements z41, bg1 {
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ y41(long j, Object obj, Object obj2) {
        this.e = obj;
        this.g = obj2;
        this.d = j;
    }

    @Override // defpackage.z41
    public Object apply(Object obj) {
        String str = (String) this.e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((ui0) this.g).d;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.d;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.bg1
    public Object b() {
        ne0 ne0Var = (ne0) this.e;
        cc ccVar = (cc) this.g;
        b51 b51Var = (b51) ne0Var.c;
        long d = ((me1) ne0Var.g).d() + this.d;
        b51Var.getClass();
        b51Var.c(new x41(d, ccVar));
        return null;
    }
}
