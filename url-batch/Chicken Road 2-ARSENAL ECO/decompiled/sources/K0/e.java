package K0;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D0.j f1353g;

    public /* synthetic */ e(long j4, D0.j jVar) {
        this.f1352f = j4;
        this.f1353g = jVar;
    }

    @Override // K0.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1352f));
        D0.j jVar = this.f1353g;
        String str = jVar.f342a;
        A0.d dVar = jVar.f344c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(N0.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.f342a);
            contentValues.put("priority", Integer.valueOf(N0.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
