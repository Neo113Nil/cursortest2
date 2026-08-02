package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cgi implements cgn {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cgi(long j, ces cesVar, int i) {
        this.c = i;
        this.a = j;
        this.b = cesVar;
    }

    @Override // defpackage.cgn
    public final Object a(Object obj) {
        if (this.c == 0) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            String[] strArr = {String.valueOf(this.a)};
            cgp.g(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new cgh(this.b, 1));
            return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
        }
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        ces cesVar = (ces) this.b;
        String str = cesVar.a;
        ccn ccnVar = cesVar.c;
        if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(cgy.a(ccnVar))}) <= 0) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(cgy.a(ccnVar)));
            sQLiteDatabase2.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public /* synthetic */ cgi(cgp cgpVar, long j, int i) {
        this.c = i;
        this.b = cgpVar;
        this.a = j;
    }
}
