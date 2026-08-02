package S1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b3.InterfaceC0264a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j implements d, T1.c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final I1.b f2585f = new I1.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final l f2586a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.i f2587b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.i f2588c;

    /* renamed from: d, reason: collision with root package name */
    public final a f2589d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0264a f2590e;

    public j(a2.i iVar, a2.i iVar2, a aVar, l lVar, InterfaceC0264a interfaceC0264a) {
        this.f2586a = lVar;
        this.f2587b = iVar;
        this.f2588c = iVar2;
        this.f2589d = aVar;
        this.f2590e = interfaceC0264a;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, L1.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f1645a, String.valueOf(V1.a.a(jVar.f1647c))));
        byte[] bArr = jVar.f1646b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = query;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String s(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f2575a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object t(Cursor cursor, h hVar) {
        try {
            return hVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        l lVar = this.f2586a;
        Objects.requireNonNull(lVar);
        a2.i iVar = this.f2588c;
        long q4 = iVar.q();
        while (true) {
            try {
                return lVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (iVar.q() >= this.f2589d.f2572c + q4) {
                    throw new T1.a("Timed out while trying to open db.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2586a.close();
    }

    public final Object e(h hVar) {
        SQLiteDatabase a3 = a();
        a3.beginTransaction();
        try {
            Object apply = hVar.apply(a3);
            a3.setTransactionSuccessful();
            return apply;
        } finally {
            a3.endTransaction();
        }
    }

    public final ArrayList f(SQLiteDatabase sQLiteDatabase, L1.j jVar, int i4) {
        ArrayList arrayList = new ArrayList();
        Long b4 = b(sQLiteDatabase, jVar);
        if (b4 == null) {
            return arrayList;
        }
        t(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b4.toString()}, null, null, null, String.valueOf(i4)), new Q1.b(this, (Object) arrayList, jVar, 2));
        return arrayList;
    }

    public final void k(long j4, O1.c cVar, String str) {
        e(new R1.l(j4, str, cVar));
    }

    public final Object n(T1.b bVar) {
        SQLiteDatabase a3 = a();
        a2.i iVar = this.f2588c;
        long q4 = iVar.q();
        while (true) {
            try {
                a3.beginTransaction();
                try {
                    Object c4 = bVar.c();
                    a3.setTransactionSuccessful();
                    return c4;
                } finally {
                    a3.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (iVar.q() >= this.f2589d.f2572c + q4) {
                    throw new T1.a("Timed out while trying to acquire the lock.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
