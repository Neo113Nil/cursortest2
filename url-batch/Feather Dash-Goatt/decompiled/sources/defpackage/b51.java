package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b51 implements Closeable {
    public static final vv j = new vv("proto");
    public final w61 d;
    public final me1 e;
    public final me1 g;
    public final lb h;
    public final o01 i;

    public b51(me1 me1Var, me1 me1Var2, lb lbVar, w61 w61Var, o01 o01Var) {
        this.d = w61Var;
        this.e = me1Var;
        this.g = me1Var2;
        this.h = lbVar;
        this.i = o01Var;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, cc ccVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ccVar.a, String.valueOf(ez0.a(ccVar.c))));
        byte[] bArr = ccVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((ub) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, z41 z41Var) {
        try {
            return z41Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        w61 w61Var = this.d;
        Objects.requireNonNull(w61Var);
        me1 me1Var = this.g;
        long d = me1Var.d();
        while (true) {
            try {
                return w61Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (me1Var.d() >= this.h.c + d) {
                    throw new ag1("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(z41 z41Var) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = z41Var.apply(a);
            a.setTransactionSuccessful();
            return apply;
        } finally {
            a.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, cc ccVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long b = b(sQLiteDatabase, ccVar);
        if (b == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(i)), new mq(this, (Object) arrayList, ccVar, 3));
        return arrayList;
    }

    public final void e(long j2, ui0 ui0Var, String str) {
        c(new y41(j2, str, ui0Var));
    }

    public final Object f(bg1 bg1Var) {
        SQLiteDatabase a = a();
        me1 me1Var = this.g;
        long d = me1Var.d();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object b = bg1Var.b();
                    a.setTransactionSuccessful();
                    return b;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (me1Var.d() >= this.h.c + d) {
                    throw new ag1("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
