package K0;

import H1.r;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j5.InterfaceC0438a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h implements d, L0.c, c {

    /* renamed from: k, reason: collision with root package name */
    public static final A0.c f1356k = new A0.c("proto");

    /* renamed from: f, reason: collision with root package name */
    public final j f1357f;

    /* renamed from: g, reason: collision with root package name */
    public final M0.a f1358g;

    /* renamed from: h, reason: collision with root package name */
    public final M0.a f1359h;

    /* renamed from: i, reason: collision with root package name */
    public final a f1360i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0438a f1361j;

    public h(M0.a aVar, M0.a aVar2, a aVar3, j jVar, InterfaceC0438a interfaceC0438a) {
        this.f1357f = jVar;
        this.f1358g = aVar;
        this.f1359h = aVar2;
        this.f1360i = aVar3;
        this.f1361j = interfaceC0438a;
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, D0.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f342a, String.valueOf(N0.a.a(jVar.f344c))));
        byte[] bArr = jVar.f343b;
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

    public static String n(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f1349a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object v(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.f1357f;
        Objects.requireNonNull(jVar);
        M0.a aVar = this.f1359h;
        long c7 = aVar.c();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (aVar.c() >= this.f1360i.f1346c + c7) {
                    throw new L0.a("Timed out while trying to open db.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1357f.close();
    }

    public final Object e(f fVar) {
        SQLiteDatabase a7 = a();
        a7.beginTransaction();
        try {
            Object apply = fVar.apply(a7);
            a7.setTransactionSuccessful();
            return apply;
        } finally {
            a7.endTransaction();
        }
    }

    public final ArrayList g(SQLiteDatabase sQLiteDatabase, D0.j jVar, int i7) {
        ArrayList arrayList = new ArrayList();
        Long d7 = d(sQLiteDatabase, jVar);
        if (d7 == null) {
            return arrayList;
        }
        v(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{d7.toString()}, null, null, null, String.valueOf(i7)), new r(this, arrayList, jVar, 2));
        return arrayList;
    }

    public final void h(long j4, G0.c cVar, String str) {
        e(new J0.j(str, cVar, j4));
    }

    public final Object m(L0.b bVar) {
        SQLiteDatabase a7 = a();
        M0.a aVar = this.f1359h;
        long c7 = aVar.c();
        while (true) {
            try {
                a7.beginTransaction();
                try {
                    Object c8 = bVar.c();
                    a7.setTransactionSuccessful();
                    return c8;
                } finally {
                    a7.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (aVar.c() >= this.f1360i.f1346c + c7) {
                    throw new L0.a("Timed out while trying to acquire the lock.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
