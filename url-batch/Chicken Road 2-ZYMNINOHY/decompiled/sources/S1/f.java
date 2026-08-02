package S1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1.j f2581b;

    public /* synthetic */ f(long j4, L1.j jVar) {
        this.f2580a = j4;
        this.f2581b = jVar;
    }

    @Override // S1.h
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f2580a));
        L1.j jVar = this.f2581b;
        String str = jVar.f1645a;
        I1.c cVar = jVar.f1647c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(V1.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", jVar.f1645a);
            contentValues.put("priority", Integer.valueOf(V1.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
