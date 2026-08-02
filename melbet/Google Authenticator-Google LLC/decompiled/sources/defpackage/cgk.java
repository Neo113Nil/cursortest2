package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cgk implements cgn {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ cgk(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.cgn
    public final Object a(Object obj) {
        int i = 0;
        if (this.b != 0) {
            return (cfj) cgp.g(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new cgk(this.a, i));
        }
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new cfj(cursor.getLong(0), this.a);
    }
}
