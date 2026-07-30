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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tc2 implements Closeable {
    public static final kh0 r = new kh0("proto");
    public final ue2 m;
    public final dq2 n;
    public final dq2 o;
    public final xl p;
    public final w52 q;

    public tc2(dq2 dq2Var, dq2 dq2Var2, xl xlVar, ue2 ue2Var, w52 w52Var) {
        this.m = ue2Var;
        this.n = dq2Var;
        this.o = dq2Var2;
        this.p = xlVar;
        this.q = w52Var;
    }

    public static Long f(SQLiteDatabase sQLiteDatabase, gm gmVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(gmVar.a, String.valueOf(z42.a(gmVar.c))));
        byte[] bArr = gmVar.b;
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

    public static String q(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((cm) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object s(Cursor cursor, rc2 rc2Var) {
        try {
            return rc2Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        ue2 ue2Var = this.m;
        Objects.requireNonNull(ue2Var);
        dq2 dq2Var = this.o;
        long h = dq2Var.h();
        while (true) {
            try {
                return ue2Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (dq2Var.h() >= this.p.c + h) {
                    throw new bs2("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    public final Object m(rc2 rc2Var) {
        SQLiteDatabase b = b();
        b.beginTransaction();
        try {
            Object apply = rc2Var.apply(b);
            b.setTransactionSuccessful();
            return apply;
        } finally {
            b.endTransaction();
        }
    }

    public final ArrayList n(SQLiteDatabase sQLiteDatabase, gm gmVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long f = f(sQLiteDatabase, gmVar);
        if (f == null) {
            return arrayList;
        }
        s(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{f.toString()}, null, null, null, String.valueOf(i)), new s80(this, (Object) arrayList, gmVar, 2));
        return arrayList;
    }

    public final void o(long j, cg1 cg1Var, String str) {
        m(new qc2(j, str, cg1Var));
    }

    public final Object p(cs2 cs2Var) {
        SQLiteDatabase b = b();
        dq2 dq2Var = this.o;
        long h = dq2Var.h();
        while (true) {
            try {
                b.beginTransaction();
                try {
                    Object b2 = cs2Var.b();
                    b.setTransactionSuccessful();
                    return b2;
                } finally {
                    b.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (dq2Var.h() >= this.p.c + h) {
                    throw new bs2("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
