package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cgg implements cgn {
    private final /* synthetic */ int a;

    public /* synthetic */ cgg(int i) {
        this.a = i;
    }

    @Override // defpackage.cgn
    public final Object a(Object obj) {
        int i = 3;
        switch (this.a) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + System.currentTimeMillis()).execute();
                return null;
            case 1:
                Cursor cursor = (Cursor) obj;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return null;
            case 2:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 3:
                Cursor cursor2 = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    iyh c = ces.c();
                    c.k(cursor2.getString(1));
                    c.l(cgy.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    c.b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(c.j());
                }
                return arrayList;
            case 4:
                Cursor cursor3 = (Cursor) obj;
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (cursor3.moveToNext()) {
                    byte[] blob = cursor3.getBlob(0);
                    arrayList2.add(blob);
                    i2 += blob.length;
                }
                byte[] bArr = new byte[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i4);
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i3, length);
                    i3 += length;
                }
                return bArr;
            case 5:
                return (List) cgp.g(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new cgg(i));
            case 6:
                Cursor cursor4 = (Cursor) obj;
                if (cursor4.moveToNext()) {
                    return Long.valueOf(cursor4.getLong(0));
                }
                return 0L;
            case 7:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case 8:
                throw new cgu("Timed out while trying to acquire the lock.", (Throwable) obj);
            default:
                throw new cgu("Timed out while trying to open db.", (Throwable) obj);
        }
    }
}
