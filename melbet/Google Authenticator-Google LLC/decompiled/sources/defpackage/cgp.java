package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgp implements Closeable {
    private static final ccl c = new ccl("proto");
    public final cgb a;
    public final koe b;
    private final cgs d;

    public cgp(cgb cgbVar, cgs cgsVar, koe koeVar) {
        this.d = cgsVar;
        this.a = cgbVar;
        this.b = koeVar;
    }

    public static ccl d(String str) {
        return str == null ? c : new ccl(str);
    }

    public static Object g(Cursor cursor, cgn cgnVar) {
        try {
            return cgnVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    public static String h(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((cgc) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static final Long m(SQLiteDatabase sQLiteDatabase, ces cesVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(cesVar.a, String.valueOf(cgy.a(cesVar.c))));
        byte[] bArr = cesVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) g(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new cgg(1));
    }

    private final Object n(cgo cgoVar, cgn cgnVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                return cgoVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (SystemClock.elapsedRealtime() >= this.a.d + elapsedRealtime) {
                    return cgnVar.a(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final long a() {
        return c().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long b() {
        return c().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final SQLiteDatabase c() {
        return (SQLiteDatabase) n(new cgm(this.d, 0), new cgg(9));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final Object e(cgn cgnVar) {
        SQLiteDatabase c2 = c();
        c2.beginTransaction();
        try {
            Object a = cgnVar.a(c2);
            c2.setTransactionSuccessful();
            return a;
        } finally {
            c2.endTransaction();
        }
    }

    public final Object f(cgv cgvVar) {
        SQLiteDatabase c2 = c();
        n(new cgm(c2, 1), new cgg(8));
        try {
            Object a = cgvVar.a();
            c2.setTransactionSuccessful();
            return a;
        } finally {
            c2.endTransaction();
        }
    }

    public final List i(SQLiteDatabase sQLiteDatabase, ces cesVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long m = m(sQLiteDatabase, cesVar);
        if (m == null) {
            return arrayList;
        }
        g(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob", "experiment_ids_encrypted_list_blob", "pseudonymous_id_update_receiver_class_name"}, "context_id = ?", new String[]{m.toString()}, null, null, null, String.valueOf(i)), new cge(this, arrayList, cesVar, 1));
        return arrayList;
    }

    public final void j(final long j, final cff cffVar, final String str) {
        e(new cgn() { // from class: cgj
            @Override // defpackage.cgn
            public final Object a(Object obj) {
                String str2 = str;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                int i = cffVar.h;
                boolean booleanValue = ((Boolean) cgp.g(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(i)}), new cgg(7))).booleanValue();
                long j2 = j;
                if (booleanValue) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(i)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(i));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    public final void k(ces cesVar, long j) {
        e(new cgi(j, cesVar, 1));
    }

    public final boolean l(ces cesVar) {
        return ((Boolean) e(new cgl(this, cesVar, 1))).booleanValue();
    }
}
