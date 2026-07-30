package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vl1 implements bg1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ b51 e;

    public /* synthetic */ vl1(b51 b51Var, int i) {
        this.d = i;
        this.e = b51Var;
    }

    @Override // defpackage.bg1
    public final Object b() {
        SQLiteDatabase a;
        int i = this.d;
        b51 b51Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b51Var.getClass();
                int i2 = ih.e;
                o91 o91Var = new o91();
                o91Var.e = null;
                o91Var.g = new ArrayList();
                o91Var.h = null;
                o91Var.d = "";
                HashMap hashMap = new HashMap();
                a = b51Var.a();
                a.beginTransaction();
                try {
                    ih ihVar = (ih) b51.h(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new mq(b51Var, hashMap, o91Var, 4));
                    a.setTransactionSuccessful();
                    return ihVar;
                } finally {
                }
            default:
                long d = b51Var.e.d() - b51Var.h.d;
                a = b51Var.a();
                a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d)};
                    Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            b51Var.e(rawQuery.getInt(0), ui0.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a.delete("events", "timestamp_ms < ?", strArr);
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
