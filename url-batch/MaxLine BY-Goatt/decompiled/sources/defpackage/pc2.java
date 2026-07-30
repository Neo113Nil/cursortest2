package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class pc2 implements rc2 {
    public final /* synthetic */ long m;
    public final /* synthetic */ gm n;

    public /* synthetic */ pc2(long j, gm gmVar) {
        this.m = j;
        this.n = gmVar;
    }

    @Override // defpackage.rc2
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.m));
        gm gmVar = this.n;
        String str = gmVar.a;
        y42 y42Var = gmVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(z42.a(y42Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(z42.a(y42Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
