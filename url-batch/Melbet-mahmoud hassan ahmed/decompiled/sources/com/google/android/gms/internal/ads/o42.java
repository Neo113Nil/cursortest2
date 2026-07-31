package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class o42 extends SQLiteOpenHelper {

    /* renamed from: f, reason: collision with root package name */
    private final Context f9505f;

    /* renamed from: g, reason: collision with root package name */
    private final dc3 f9506g;

    public o42(Context context, dc3 dc3Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) sw.c().b(m10.f8215h6)).intValue());
        this.f9505f = context;
        this.f9506g = dc3Var;
    }

    static /* synthetic */ Void f(oo0 oo0Var, SQLiteDatabase sQLiteDatabase) {
        y(sQLiteDatabase, oo0Var);
        return null;
    }

    static /* synthetic */ void u(SQLiteDatabase sQLiteDatabase, String str, oo0 oo0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        y(sQLiteDatabase, oo0Var);
    }

    static final void x(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void y(SQLiteDatabase sQLiteDatabase, oo0 oo0Var) {
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = ");
            sb.append(1);
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, sb.toString(), null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i7 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i7] = query.getString(columnIndex);
                }
                i7++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i8 = 0; i8 < count; i8++) {
                oo0Var.b(strArr[i8]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    final /* synthetic */ Void b(q42 q42Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(q42Var.f10571a));
        contentValues.put("gws_query_id", q42Var.f10572b);
        contentValues.put("url", q42Var.f10573c);
        contentValues.put("event_state", Integer.valueOf(q42Var.f10574d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        y2.t.q();
        a3.x0 e7 = a3.g2.e(this.f9505f);
        if (e7 != null) {
            try {
                e7.zze(x3.b.B3(this.f9505f));
            } catch (RemoteException e8) {
                a3.r1.l("Failed to schedule offline ping sender.", e8);
            }
        }
        return null;
    }

    public final void h(final String str) {
        q(new pv2() { // from class: com.google.android.gms.internal.ads.k42
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj) {
                o42.x((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void i(final q42 q42Var) {
        q(new pv2() { // from class: com.google.android.gms.internal.ads.j42
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj) {
                o42.this.b(q42Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void q(pv2<SQLiteDatabase, Void> pv2Var) {
        rb3.r(this.f9506g.E(new Callable() { // from class: com.google.android.gms.internal.ads.m42
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o42.this.getWritableDatabase();
            }
        }), new n42(this, pv2Var), this.f9506g);
    }

    final void v(final SQLiteDatabase sQLiteDatabase, final oo0 oo0Var, final String str) {
        this.f9506g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l42
            @Override // java.lang.Runnable
            public final void run() {
                o42.u(sQLiteDatabase, str, oo0Var);
            }
        });
    }

    public final void w(final oo0 oo0Var, final String str) {
        q(new pv2() { // from class: com.google.android.gms.internal.ads.i42
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj) {
                o42.this.v((SQLiteDatabase) obj, oo0Var, str);
                return null;
            }
        });
    }
}
