package C0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f205a;

    @Override // C0.i, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
        long j3 = this.f205a;
        try {
            Cursor cursor = rawQuery;
            cursor.moveToNext();
            return new y0.g(cursor.getLong(0), j3);
        } finally {
            rawQuery.close();
        }
    }
}
