package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* renamed from: com.my.tracker.obfuscated.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1628e1 {

    /* renamed from: y, reason: collision with root package name */
    static long f21269y = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f21270a = new String[1];

    /* renamed from: b, reason: collision with root package name */
    private final h f21271b = new h();

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f21272c;

    /* renamed from: d, reason: collision with root package name */
    private final SQLiteStatement f21273d;

    /* renamed from: e, reason: collision with root package name */
    private final SQLiteStatement f21274e;

    /* renamed from: f, reason: collision with root package name */
    private final SQLiteStatement f21275f;

    /* renamed from: g, reason: collision with root package name */
    private final SQLiteStatement f21276g;

    /* renamed from: h, reason: collision with root package name */
    private final SQLiteStatement f21277h;

    /* renamed from: i, reason: collision with root package name */
    private final SQLiteStatement f21278i;

    /* renamed from: j, reason: collision with root package name */
    private final SQLiteStatement f21279j;

    /* renamed from: k, reason: collision with root package name */
    private final SQLiteStatement f21280k;

    /* renamed from: l, reason: collision with root package name */
    private final SQLiteStatement f21281l;

    /* renamed from: m, reason: collision with root package name */
    private final SQLiteStatement f21282m;

    /* renamed from: n, reason: collision with root package name */
    private final SQLiteStatement f21283n;

    /* renamed from: o, reason: collision with root package name */
    private final SQLiteStatement f21284o;

    /* renamed from: p, reason: collision with root package name */
    private final SQLiteStatement f21285p;

    /* renamed from: q, reason: collision with root package name */
    private final SQLiteStatement f21286q;

    /* renamed from: r, reason: collision with root package name */
    private final SQLiteStatement f21287r;

    /* renamed from: s, reason: collision with root package name */
    private final SQLiteStatement f21288s;

    /* renamed from: t, reason: collision with root package name */
    private final SQLiteStatement f21289t;

    /* renamed from: u, reason: collision with root package name */
    private final SQLiteStatement f21290u;

    /* renamed from: v, reason: collision with root package name */
    private final SQLiteStatement f21291v;

    /* renamed from: w, reason: collision with root package name */
    private final C1660m1 f21292w;

    /* renamed from: x, reason: collision with root package name */
    protected final SQLiteDatabase f21293x;

    /* renamed from: com.my.tracker.obfuscated.e1$a */
    static abstract class a implements Closeable, AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        final Cursor f21294a;

        a(Cursor cursor) {
            this.f21294a = cursor;
        }

        final boolean b() {
            return this.f21294a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f21294a.close();
            } catch (Throwable th) {
                AbstractC1708y2.b("AbstractReader error: error while closing cursor", th);
            }
        }

        protected void finalize() {
            super.finalize();
            close();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$b */
    static final class b extends a {
        b(Cursor cursor) {
            super(cursor);
        }

        long a() {
            return this.f21294a.getLong(0);
        }

        long e() {
            return this.f21294a.getLong(5);
        }

        String m() {
            return this.f21294a.getString(1);
        }

        String n() {
            return this.f21294a.getString(2);
        }

        String o() {
            return this.f21294a.getString(3);
        }

        int p() {
            return this.f21294a.getInt(4);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$c */
    static final class c extends a {
        c(Cursor cursor) {
            super(cursor);
        }

        long a() {
            return this.f21294a.getLong(0);
        }

        long c() {
            return this.f21294a.getLong(4);
        }

        long g() {
            return this.f21294a.getLong(1);
        }

        byte[] l() {
            return this.f21294a.getBlob(3);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$d */
    static final class d extends a {
        d(Cursor cursor) {
            super(cursor);
        }

        long e() {
            return this.f21294a.getLong(1);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$e */
    static final class e extends a {
        e(Cursor cursor) {
            super(cursor);
        }

        long a() {
            return this.f21294a.getLong(0);
        }

        long e() {
            return this.f21294a.getLong(3);
        }

        String m() {
            return this.f21294a.getString(1);
        }

        String n() {
            return this.f21294a.getString(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$f */
    static final class f extends a {
        f(Cursor cursor) {
            super(cursor);
        }

        long a() {
            return this.f21294a.getLong(0);
        }

        long c() {
            return this.f21294a.getLong(3);
        }

        String k() {
            return this.f21294a.getString(1);
        }

        long m() {
            return this.f21294a.isNull(2) ? C1628e1.f21269y : this.f21294a.getLong(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$g */
    static final class g extends a {
        g(Cursor cursor) {
            super(cursor);
        }

        long m() {
            return this.f21294a.getLong(2);
        }

        long n() {
            return this.f21294a.getLong(1);
        }

        boolean o() {
            return this.f21294a.isNull(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$h */
    static final class h implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        long f21295a;

        /* renamed from: b, reason: collision with root package name */
        byte[] f21296b;

        h() {
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.f21295a);
            sQLiteQuery.bindBlob(2, this.f21296b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private C1628e1(SQLiteDatabase sQLiteDatabase) {
        this.f21293x = sQLiteDatabase;
        this.f21272c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.f21273d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.f21274e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f21275f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.f21276g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.f21277h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.f21278i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");
        this.f21279j = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.f21280k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.f21281l = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.f21282m = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.f21283n = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.f21287r = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.f21284o = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.f21285p = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.f21288s = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.f21286q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.f21289t = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.f21290u = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
        this.f21291v = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");
        this.f21292w = new C1660m1(sQLiteDatabase);
    }

    void a() {
        this.f21282m.execute();
    }

    void b() {
        this.f21283n.execute();
    }

    void c() {
        this.f21284o.execute();
    }

    void d() {
        this.f21285p.execute();
    }

    void e() {
        this.f21286q.execute();
    }

    InterfaceC1611b f() {
        return this.f21292w.a();
    }

    long g() {
        Cursor rawQuery = this.f21293x.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", null);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j4 = rawQuery.getLong(0);
            rawQuery.close();
            return j4;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    b h() {
        return new b(this.f21293x.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", null));
    }

    c i() {
        return new c(this.f21293x.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", null));
    }

    long j() {
        Cursor rawQuery = this.f21293x.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", null);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j4 = rawQuery.getLong(0);
            rawQuery.close();
            return j4;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    e k() {
        return new e(this.f21293x.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", null));
    }

    long l() {
        Cursor rawQuery = this.f21293x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j4 = rawQuery.getLong(0);
            rawQuery.close();
            return j4;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void a(long j4) {
        this.f21291v.bindLong(1, j4);
        this.f21291v.execute();
    }

    void b(long j4) {
        this.f21290u.bindLong(1, j4);
        this.f21290u.execute();
    }

    void c(long j4) {
        this.f21292w.a(j4);
    }

    long d(long j4) {
        this.f21270a[0] = String.valueOf(j4);
        Cursor rawQuery = this.f21293x.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.f21270a);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j5 = rawQuery.getLong(0);
            rawQuery.close();
            return j5;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    d e(long j4) {
        this.f21270a[0] = String.valueOf(j4);
        return new d(this.f21293x.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.f21270a));
    }

    long f(long j4) {
        this.f21270a[0] = String.valueOf(j4);
        Cursor rawQuery = this.f21293x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.f21270a);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j5 = rawQuery.getLong(0);
            rawQuery.close();
            return j5;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    long g(long j4) {
        this.f21270a[0] = String.valueOf(j4);
        Cursor rawQuery = this.f21293x.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.f21270a);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j5 = rawQuery.getLong(0);
            rawQuery.close();
            return j5;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    g h(long j4) {
        this.f21270a[0] = String.valueOf(j4);
        return new g(this.f21293x.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.f21270a));
    }

    void i(long j4) {
        this.f21292w.b(j4);
    }

    long a(long j4, long j5) {
        this.f21287r.bindLong(1, j4);
        this.f21287r.bindLong(2, j5);
        return this.f21287r.executeUpdateDelete();
    }

    long b(long j4, long j5) {
        this.f21288s.bindLong(1, j4);
        this.f21288s.bindLong(2, j5);
        return this.f21288s.executeUpdateDelete();
    }

    void c(long j4, long j5) {
        this.f21273d.bindLong(1, j4);
        this.f21273d.bindLong(2, j5);
        this.f21273d.execute();
    }

    void d(long j4, long j5) {
        this.f21279j.bindLong(1, j5);
        this.f21279j.bindLong(2, j4);
        this.f21279j.execute();
    }

    long a(long j4, byte[] bArr) {
        h hVar = this.f21271b;
        hVar.f21295a = j4;
        hVar.f21296b = bArr;
        Cursor rawQueryWithFactory = this.f21293x.rawQueryWithFactory(hVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", null, null);
        try {
            if (!rawQueryWithFactory.moveToNext()) {
                rawQueryWithFactory.close();
                return 0L;
            }
            long j5 = rawQueryWithFactory.getLong(0);
            rawQueryWithFactory.close();
            return j5;
        } catch (Throwable th) {
            if (rawQueryWithFactory != null) {
                try {
                    rawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    c b(long j4, byte[] bArr) {
        h hVar = this.f21271b;
        hVar.f21295a = j4;
        hVar.f21296b = bArr;
        return new c(this.f21293x.rawQueryWithFactory(hVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, null));
    }

    f a(String str) {
        String[] strArr = this.f21270a;
        strArr[0] = str;
        return new f(this.f21293x.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    Long b(String str) {
        String[] strArr = this.f21270a;
        strArr[0] = str;
        Cursor rawQuery = this.f21293x.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return null;
            }
            Long valueOf = Long.valueOf(rawQuery.getLong(0));
            rawQuery.close();
            return valueOf;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    long a(String str, String str2, String str3, int i4, long j4) {
        this.f21278i.bindString(1, str);
        this.f21278i.bindString(2, str2);
        this.f21278i.bindString(3, str3);
        this.f21278i.bindLong(4, i4);
        this.f21278i.bindLong(5, j4);
        return this.f21278i.executeInsert();
    }

    long a(int i4, byte[] bArr, boolean z4) {
        this.f21272c.bindLong(1, i4);
        this.f21272c.bindLong(2, z4 ? 1L : 0L);
        this.f21272c.bindBlob(3, bArr);
        return this.f21272c.executeInsert();
    }

    long a(String str, String str2, long j4) {
        this.f21277h.bindString(1, str);
        this.f21277h.bindString(2, str2);
        this.f21277h.bindLong(3, j4);
        return this.f21277h.executeInsert();
    }

    void a(byte[] bArr) {
        this.f21292w.a(bArr);
    }

    long a(String str, long j4) {
        this.f21274e.bindString(1, str);
        this.f21274e.bindLong(2, j4);
        return this.f21274e.executeInsert();
    }

    void a(long j4, long j5, boolean z4, long j6) {
        this.f21275f.bindLong(1, j4);
        this.f21275f.bindLong(2, j5);
        SQLiteStatement sQLiteStatement = this.f21275f;
        if (z4) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j6);
        }
        this.f21275f.execute();
    }

    public static C1628e1 a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            if (openOrCreateDatabase == null) {
                AbstractC1708y2.b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (openOrCreateDatabase.getVersion() != 10) {
                openOrCreateDatabase.close();
                context.deleteDatabase(str2);
                openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
                openOrCreateDatabase.setVersion(10);
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");
                C1660m1.a(openOrCreateDatabase);
            }
            return new C1628e1(openOrCreateDatabase);
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    void a(String str, Long l4) {
        SQLiteStatement sQLiteStatement;
        if (l4 == null) {
            this.f21289t.bindString(1, str);
            sQLiteStatement = this.f21289t;
        } else {
            long longValue = l4.longValue();
            this.f21276g.bindString(1, str);
            this.f21276g.bindLong(2, longValue);
            if (this.f21276g.executeInsert() != f21269y) {
                return;
            }
            this.f21281l.bindLong(1, longValue);
            this.f21281l.bindString(2, str);
            sQLiteStatement = this.f21281l;
        }
        sQLiteStatement.execute();
    }

    void a(long j4, long j5, long j6) {
        if (j5 != f21269y) {
            this.f21280k.bindLong(1, j5);
        } else {
            this.f21280k.bindNull(1);
        }
        this.f21280k.bindLong(2, j6);
        this.f21280k.bindLong(3, j4);
        this.f21280k.execute();
    }
}
