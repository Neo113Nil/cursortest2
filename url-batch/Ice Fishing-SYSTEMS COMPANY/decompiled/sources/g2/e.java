package g2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import j2.AbstractC4595a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f37868n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z1.i f37869u;

    public /* synthetic */ e(long j9, Z1.i iVar) {
        this.f37868n = j9;
        this.f37869u = iVar;
    }

    @Override // g2.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f37868n));
        Z1.i iVar = this.f37869u;
        String str = iVar.f4225a;
        W1.d dVar = iVar.f4227c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC4595a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f4225a);
            contentValues.put("priority", Integer.valueOf(AbstractC4595a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
