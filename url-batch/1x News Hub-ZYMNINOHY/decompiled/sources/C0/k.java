package C0;

import a2.InterfaceC0133a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import s0.C1185b;

/* loaded from: classes.dex */
public final class k implements d, D0.c, c {
    public static final C1185b f = new C1185b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final m f208a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.j f209b;

    /* renamed from: c, reason: collision with root package name */
    public final K0.j f210c;

    /* renamed from: d, reason: collision with root package name */
    public final a f211d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0133a f212e;

    public k(K0.j jVar, K0.j jVar2, a aVar, m mVar, InterfaceC0133a interfaceC0133a) {
        this.f208a = mVar;
        this.f209b = jVar;
        this.f210c = jVar2;
        this.f211d = aVar;
        this.f212e = interfaceC0133a;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, v0.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f10554a, String.valueOf(F0.a.a(iVar.f10556c))));
        byte[] bArr = iVar.f10555b;
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

    public static String g(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f197a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, i iVar) {
        try {
            return iVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        m mVar = this.f208a;
        Objects.requireNonNull(mVar);
        K0.j jVar = this.f210c;
        long d3 = jVar.d();
        while (true) {
            try {
                return mVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e3) {
                if (jVar.d() >= this.f211d.f194c + d3) {
                    throw new D0.a("Timed out while trying to open db.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(i iVar) {
        SQLiteDatabase a3 = a();
        a3.beginTransaction();
        try {
            Object apply = iVar.apply(a3);
            a3.setTransactionSuccessful();
            return apply;
        } finally {
            a3.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f208a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, v0.i iVar, int i3) {
        ArrayList arrayList = new ArrayList();
        Long b3 = b(sQLiteDatabase, iVar);
        if (b3 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b3.toString()}, null, null, null, String.valueOf(i3)), new A0.b(this, (Object) arrayList, iVar, 2));
        return arrayList;
    }

    public final void e(long j3, y0.c cVar, String str) {
        c(new B0.l(j3, str, cVar));
    }

    public final Object f(D0.b bVar) {
        SQLiteDatabase a3 = a();
        K0.j jVar = this.f210c;
        long d3 = jVar.d();
        while (true) {
            try {
                a3.beginTransaction();
                try {
                    Object execute = bVar.execute();
                    a3.setTransactionSuccessful();
                    return execute;
                } finally {
                    a3.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e3) {
                if (jVar.d() >= this.f211d.f194c + d3) {
                    throw new D0.a("Timed out while trying to acquire the lock.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
