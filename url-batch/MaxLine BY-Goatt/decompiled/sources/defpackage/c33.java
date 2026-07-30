package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class c33 implements cs2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ tc2 n;

    public /* synthetic */ c33(tc2 tc2Var, int i) {
        this.m = i;
        this.n = tc2Var;
    }

    @Override // defpackage.cs2
    public final Object b() {
        SQLiteDatabase b;
        int i = this.m;
        tc2 tc2Var = this.n;
        switch (i) {
            case 0:
                tc2Var.getClass();
                int i2 = ru.e;
                js0 js0Var = new js0();
                js0Var.n = null;
                js0Var.m = new ArrayList();
                js0Var.o = null;
                js0Var.p = BuildConfig.FLAVOR;
                HashMap hashMap = new HashMap();
                b = tc2Var.b();
                b.beginTransaction();
                try {
                    ru ruVar = (ru) tc2.s(b.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new s80(tc2Var, hashMap, js0Var, 3));
                    b.setTransactionSuccessful();
                    return ruVar;
                } finally {
                }
            default:
                long h = tc2Var.n.h() - tc2Var.p.d;
                b = tc2Var.b();
                b.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(h)};
                    Cursor rawQuery = b.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            tc2Var.o(rawQuery.getInt(0), cg1.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = b.delete("events", "timestamp_ms < ?", strArr);
                    b.setTransactionSuccessful();
                    b.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
