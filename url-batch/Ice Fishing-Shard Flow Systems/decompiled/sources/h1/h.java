package h1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import d1.EnumC0356c;
import f1.C0393a;
import i1.C0541a;
import i1.InterfaceC0542b;
import i1.InterfaceC0543c;
import j1.InterfaceC0568a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import k1.AbstractC0594a;

/* loaded from: classes.dex */
public final class h implements d, InterfaceC0543c, c {

    /* renamed from: n, reason: collision with root package name */
    public static final X0.c f5135n = new X0.c("proto");

    /* renamed from: d, reason: collision with root package name */
    public final j f5136d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0568a f5137e;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0568a f5138i;

    /* renamed from: l, reason: collision with root package name */
    public final C0468a f5139l;

    /* renamed from: m, reason: collision with root package name */
    public final Q5.a f5140m;

    public h(InterfaceC0568a interfaceC0568a, InterfaceC0568a interfaceC0568a2, C0468a c0468a, j jVar, Q5.a aVar) {
        this.f5136d = jVar;
        this.f5137e = interfaceC0568a;
        this.f5138i = interfaceC0568a2;
        this.f5139l = c0468a;
        this.f5140m = aVar;
    }

    public static Object B(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, a1.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f3067a, String.valueOf(AbstractC0594a.a(iVar.f3069c))));
        byte[] bArr = iVar.f3068b;
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

    public static String t(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C0469b) it.next()).f5128a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final SQLiteDatabase a() {
        j jVar = this.f5136d;
        Objects.requireNonNull(jVar);
        InterfaceC0568a interfaceC0568a = this.f5138i;
        long d7 = interfaceC0568a.d();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e7) {
                if (interfaceC0568a.d() >= this.f5139l.f5125c + d7) {
                    throw new C0541a("Timed out while trying to open db.", e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5136d.close();
    }

    public final Object g(f fVar) {
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

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, a1.i iVar, int i2) {
        ArrayList arrayList = new ArrayList();
        Long d7 = d(sQLiteDatabase, iVar);
        if (d7 == null) {
            return arrayList;
        }
        B(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{d7.toString()}, null, null, null, String.valueOf(i2)), new C0393a(this, (Object) arrayList, iVar, 2));
        return arrayList;
    }

    public final void j(long j, EnumC0356c enumC0356c, String str) {
        g(new g1.h(j, str, enumC0356c));
    }

    public final Object s(InterfaceC0542b interfaceC0542b) {
        SQLiteDatabase a7 = a();
        InterfaceC0568a interfaceC0568a = this.f5138i;
        long d7 = interfaceC0568a.d();
        while (true) {
            try {
                a7.beginTransaction();
                try {
                    Object b7 = interfaceC0542b.b();
                    a7.setTransactionSuccessful();
                    return b7;
                } finally {
                    a7.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e7) {
                if (interfaceC0568a.d() >= this.f5139l.f5125c + d7) {
                    throw new C0541a("Timed out while trying to acquire the lock.", e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
