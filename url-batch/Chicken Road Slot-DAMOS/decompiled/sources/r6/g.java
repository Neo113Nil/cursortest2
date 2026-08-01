package r6;

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
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements Closeable {

    /* renamed from: t, reason: collision with root package name */
    public static final h6.c f8196t = new h6.c("proto");

    /* renamed from: d, reason: collision with root package name */
    public final i f8197d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f8198e;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f8199i;

    /* renamed from: r, reason: collision with root package name */
    public final a f8200r;

    /* renamed from: s, reason: collision with root package name */
    public final gd.a f8201s;

    public g(c0 c0Var, c0 c0Var2, a aVar, i iVar, gd.a aVar2) {
        this.f8197d = iVar;
        this.f8198e = c0Var;
        this.f8199i = c0Var2;
        this.f8200r = aVar;
        this.f8201s = aVar2;
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, k6.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f5464a, String.valueOf(u6.a.a(iVar.f5466c))));
        byte[] bArr = iVar.f5465b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String o(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f8187a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object p(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        i iVar = this.f8197d;
        Objects.requireNonNull(iVar);
        c0 c0Var = this.f8199i;
        long g = c0Var.g();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (c0Var.g() >= this.f8200r.f8184c + g) {
                    throw new s6.a("Timed out while trying to open db.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8197d.close();
    }

    public final Object h(e eVar) {
        SQLiteDatabase a9 = a();
        a9.beginTransaction();
        try {
            Object apply = eVar.apply(a9);
            a9.setTransactionSuccessful();
            return apply;
        } finally {
            a9.endTransaction();
        }
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase, k6.i iVar, int i3) {
        ArrayList arrayList = new ArrayList();
        Long d10 = d(sQLiteDatabase, iVar);
        if (d10 == null) {
            return arrayList;
        }
        p(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{d10.toString()}, null, null, null, String.valueOf(i3)), new p6.a(this, (Object) arrayList, iVar, 2));
        return arrayList;
    }

    public final void j(long j, n6.c cVar, String str) {
        h(new q6.h(j, str, cVar));
    }

    public final Object m(s6.b bVar) {
        SQLiteDatabase a9 = a();
        c0 c0Var = this.f8199i;
        long g = c0Var.g();
        while (true) {
            try {
                a9.beginTransaction();
                try {
                    Object a10 = bVar.a();
                    a9.setTransactionSuccessful();
                    return a10;
                } finally {
                    a9.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (c0Var.g() >= this.f8200r.f8184c + g) {
                    throw new s6.a("Timed out while trying to acquire the lock.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
