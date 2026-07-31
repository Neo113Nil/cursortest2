package com.my.tracker.obfuscated;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* renamed from: com.my.tracker.obfuscated.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1660m1 {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f21429a;

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f21430b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f21431c;

    /* renamed from: d, reason: collision with root package name */
    private final SQLiteStatement f21432d;

    /* renamed from: com.my.tracker.obfuscated.m1$a */
    private static class a implements InterfaceC1611b {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f21433a;

        public a(Cursor cursor) {
            this.f21433a = cursor;
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1611b
        public long a() {
            return this.f21433a.getLong(0);
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1611b
        public boolean b() {
            return this.f21433a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21433a.close();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1611b
        public byte[] i() {
            return this.f21433a.getBlob(1);
        }
    }

    C1660m1(SQLiteDatabase sQLiteDatabase) {
        this.f21429a = sQLiteDatabase;
        this.f21430b = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id not in   (SELECT id    FROM table_partial_proto_packet    ORDER BY TS DESC    LIMIT ?  )");
        this.f21431c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_partial_proto_packet(data, ts) VALUES (?, ?)");
        this.f21432d = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id = ?");
    }

    static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_partial_proto_packet(id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, ts INTEGER(8))");
    }

    void b(long j4) {
        this.f21430b.bindLong(1, j4);
        this.f21430b.executeUpdateDelete();
    }

    void a(long j4) {
        this.f21432d.bindLong(1, j4);
        this.f21432d.executeUpdateDelete();
    }

    InterfaceC1611b a() {
        return new a(this.f21429a.rawQuery("SELECT id, data FROM table_partial_proto_packet ORDER BY ts", null));
    }

    void a(byte[] bArr) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f21431c.bindBlob(1, bArr);
            this.f21431c.bindLong(2, currentTimeMillis);
            this.f21431c.executeInsert();
        } finally {
            this.f21431c.clearBindings();
        }
    }
}
