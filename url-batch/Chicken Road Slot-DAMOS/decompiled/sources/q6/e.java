package q6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.messaging.v;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements s6.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r6.g f8041e;

    public /* synthetic */ e(r6.g gVar, int i3) {
        this.f8040d = i3;
        this.f8041e = gVar;
    }

    @Override // s6.b
    public final Object a() {
        SQLiteDatabase a9;
        int i3 = this.f8040d;
        r6.g gVar = this.f8041e;
        switch (i3) {
            case 0:
                gVar.getClass();
                int i10 = n6.a.f7147e;
                v vVar = new v();
                vVar.f3176e = null;
                vVar.f3177i = new ArrayList();
                vVar.f3178r = null;
                vVar.f3175d = "";
                HashMap hashMap = new HashMap();
                a9 = gVar.a();
                a9.beginTransaction();
                try {
                    n6.a aVar = (n6.a) r6.g.p(a9.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new p6.a(gVar, hashMap, vVar, 3));
                    a9.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            default:
                long g = gVar.f8198e.g() - gVar.f8200r.f8185d;
                a9 = gVar.a();
                a9.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(g)};
                    Cursor rawQuery = a9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar.j(rawQuery.getInt(0), n6.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a9.delete("events", "timestamp_ms < ?", strArr);
                    a9.setTransactionSuccessful();
                    a9.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
