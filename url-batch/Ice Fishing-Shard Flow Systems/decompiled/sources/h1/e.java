package h1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import k1.AbstractC0594a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1.i f5132e;

    public /* synthetic */ e(long j, a1.i iVar) {
        this.f5131d = j;
        this.f5132e = iVar;
    }

    @Override // h1.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f5131d));
        a1.i iVar = this.f5132e;
        String str = iVar.f3067a;
        X0.d dVar = iVar.f3069c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC0594a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f3067a);
            contentValues.put("priority", Integer.valueOf(AbstractC0594a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
