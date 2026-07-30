package g2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import e2.C4468a;
import h2.C4564a;
import h2.InterfaceC4565b;
import h2.InterfaceC4566c;
import j2.AbstractC4595a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p7.InterfaceC4864a;

/* loaded from: classes.dex */
public final class h implements d, InterfaceC4566c, c {

    /* renamed from: y, reason: collision with root package name */
    public static final W1.c f37872y = new W1.c("proto");

    /* renamed from: n, reason: collision with root package name */
    public final j f37873n;

    /* renamed from: u, reason: collision with root package name */
    public final i2.a f37874u;

    /* renamed from: v, reason: collision with root package name */
    public final i2.a f37875v;

    /* renamed from: w, reason: collision with root package name */
    public final C4525a f37876w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC4864a f37877x;

    public h(i2.a aVar, i2.a aVar2, C4525a c4525a, j jVar, InterfaceC4864a interfaceC4864a) {
        this.f37873n = jVar;
        this.f37874u = aVar;
        this.f37875v = aVar2;
        this.f37876w = c4525a;
        this.f37877x = interfaceC4864a;
    }

    public static Long g(SQLiteDatabase sQLiteDatabase, Z1.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f4225a, String.valueOf(AbstractC4595a.a(iVar.f4227c))));
        byte[] bArr = iVar.f4226b;
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
            sb.append(((C4526b) it.next()).f37865a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object p(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        j jVar = this.f37873n;
        Objects.requireNonNull(jVar);
        i2.a aVar = this.f37875v;
        long a9 = aVar.a();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e6) {
                if (aVar.a() >= this.f37876w.f37862c + a9) {
                    throw new C4564a("Timed out while trying to open db.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37873n.close();
    }

    public final Object i(f fVar) {
        SQLiteDatabase b9 = b();
        b9.beginTransaction();
        try {
            Object apply = fVar.apply(b9);
            b9.setTransactionSuccessful();
            return apply;
        } finally {
            b9.endTransaction();
        }
    }

    public final ArrayList j(SQLiteDatabase sQLiteDatabase, Z1.i iVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long g9 = g(sQLiteDatabase, iVar);
        if (g9 == null) {
            return arrayList;
        }
        p(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", com.anythink.core.express.b.a.f17692k}, "context_id = ?", new String[]{g9.toString()}, null, null, null, String.valueOf(i)), new C4468a(this, (Object) arrayList, iVar, 2));
        return arrayList;
    }

    public final void k(long j9, c2.c cVar, String str) {
        i(new f2.h(j9, str, cVar));
    }

    public final Object m(InterfaceC4565b interfaceC4565b) {
        SQLiteDatabase b9 = b();
        i2.a aVar = this.f37875v;
        long a9 = aVar.a();
        while (true) {
            try {
                b9.beginTransaction();
                try {
                    Object d2 = interfaceC4565b.d();
                    b9.setTransactionSuccessful();
                    return d2;
                } finally {
                    b9.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e6) {
                if (aVar.a() >= this.f37876w.f37862c + a9) {
                    throw new C4564a("Timed out while trying to acquire the lock.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
