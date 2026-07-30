package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class qc2 implements rc2, cs2 {
    public final /* synthetic */ long m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ qc2(long j, Object obj, Object obj2) {
        this.n = obj;
        this.o = obj2;
        this.m = j;
    }

    @Override // defpackage.rc2
    public Object apply(Object obj) {
        String str = (String) this.n;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((cg1) this.o).m;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.m;
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

    @Override // defpackage.cs2
    public Object b() {
        f33 f33Var = (f33) this.n;
        gm gmVar = (gm) this.o;
        tc2 tc2Var = f33Var.c;
        long h = f33Var.g.h() + this.m;
        tc2Var.getClass();
        tc2Var.m(new pc2(h, gmVar));
        return null;
    }
}
