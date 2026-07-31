package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: DuplicateLogDAO.java */
/* loaded from: classes5.dex */
public final class b extends a<com.apm.insight.d.a> {
    @Override // com.apm.insight.e.a.a
    protected final /* synthetic */ ContentValues a(com.apm.insight.d.a aVar) {
        com.apm.insight.d.a aVar2 = aVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar2.a);
        contentValues.put("insert_time", Long.valueOf(aVar2.b));
        return contentValues;
    }

    public b() {
        super("duplicatelog");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        int i;
        if (sQLiteDatabase != null && !TextUtils.isEmpty(str)) {
            try {
                Cursor query = sQLiteDatabase.query(this.a, null, "path=?", new String[]{str}, null, null, null);
                i = query.getCount();
                try {
                    query.close();
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.a.b(th);
                    if (i <= 0) {
                        return false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i = 0;
            }
            if (i <= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.apm.insight.e.a.a
    public final void a(SQLiteDatabase sQLiteDatabase, com.apm.insight.d.a aVar) {
        if (aVar == null || a(sQLiteDatabase, aVar.a)) {
            return;
        }
        super.a(sQLiteDatabase, (SQLiteDatabase) aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.a + " where _id in (select _id from " + this.a + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e) {
            com.apm.insight.a.b((Throwable) e);
        }
    }

    @Override // com.apm.insight.e.a.a
    protected final HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("path", "TEXT");
        hashMap.put("insert_time", "INTEGER");
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "TEXT");
        hashMap.put("ext2", "TEXT");
        return hashMap;
    }
}
