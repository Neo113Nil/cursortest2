package r6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6.i f8193e;

    public /* synthetic */ d(long j, k6.i iVar) {
        this.f8192d = j;
        this.f8193e = iVar;
    }

    @Override // r6.e
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f8192d));
        k6.i iVar = this.f8193e;
        String str = iVar.f5464a;
        h6.d dVar = iVar.f5466c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(u6.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(u6.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
