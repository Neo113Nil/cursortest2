package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* renamed from: com.my.tracker.obfuscated.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1653k2 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f21401a = new String[1];

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteDatabase f21402b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f21403c;

    /* renamed from: d, reason: collision with root package name */
    private final SQLiteStatement f21404d;

    /* renamed from: e, reason: collision with root package name */
    private final SQLiteStatement f21405e;

    /* renamed from: f, reason: collision with root package name */
    private final SQLiteStatement f21406f;

    /* renamed from: com.my.tracker.obfuscated.k2$a */
    static abstract class a implements Closeable, AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        final Cursor f21407a;

        a(Cursor cursor) {
            this.f21407a = cursor;
        }

        final boolean b() {
            return this.f21407a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f21407a.close();
            } catch (Throwable th) {
                AbstractC1708y2.b("TimeSpentDataBaseSQL: AbstractReader error: error while closing cursor", th);
            }
        }

        protected void finalize() {
            super.finalize();
            close();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.k2$b */
    static final class b extends a {
        b(Cursor cursor) {
            super(cursor);
        }

        byte[] m() {
            return this.f21407a.getBlob(2);
        }

        long n() {
            return this.f21407a.getLong(0);
        }
    }

    private C1653k2(SQLiteDatabase sQLiteDatabase) {
        this.f21402b = sQLiteDatabase;
        this.f21404d = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM table_tick_packet");
        this.f21403c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_tick_packet(timestamp, content) VALUES (?, ?)");
        this.f21405e = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id = ?");
        this.f21406f = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id IN (SELECT packet_id FROM table_tick_packet ORDER BY timestamp ASC LIMIT ?)");
    }

    int a(int i4) {
        this.f21406f.clearBindings();
        this.f21406f.bindLong(1, i4);
        int executeUpdateDelete = this.f21406f.executeUpdateDelete();
        AbstractC1708y2.a("TimeSpentDataBaseSQL: " + executeUpdateDelete + " oldest tick packet(s) removed from database (reason: delete " + i4 + " oldest tick packets)");
        return executeUpdateDelete;
    }

    b b(int i4) {
        this.f21401a[0] = String.valueOf(i4);
        return new b(this.f21402b.rawQuery("SELECT packet_id, timestamp, content FROM table_tick_packet ORDER BY timestamp DESC LIMIT ?", this.f21401a));
    }

    int a(long j4) {
        this.f21405e.clearBindings();
        this.f21405e.bindLong(1, j4);
        int executeUpdateDelete = this.f21405e.executeUpdateDelete();
        AbstractC1708y2.a("TimeSpentDataBaseSQL: " + executeUpdateDelete + " tick packet removed from database (reason: delete tick packet with packetId = " + j4 + ")");
        return executeUpdateDelete;
    }

    void a(long[] jArr) {
        this.f21402b.beginTransaction();
        try {
            int i4 = 0;
            for (long j4 : jArr) {
                i4 += a(j4);
            }
            AbstractC1708y2.a("TimeSpentDataBaseSQL: " + i4 + " tick packet(s) removed from database (reason: delete " + jArr.length + " tick packets)");
            this.f21402b.setTransactionSuccessful();
            this.f21402b.endTransaction();
        } catch (Throwable th) {
            this.f21402b.endTransaction();
            throw th;
        }
    }

    int a() {
        return (int) this.f21404d.simpleQueryForLong();
    }

    static C1653k2 a(String str, Context context) {
        String format = String.format("mytracker_timespent_%s.db", str);
        SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(format, 0, null);
        if (openOrCreateDatabase == null) {
            throw new Exception("TimeSpentDataBaseSQL: context.openOrCreateDatabase failed");
        }
        if (openOrCreateDatabase.getVersion() != 1) {
            openOrCreateDatabase.close();
            context.deleteDatabase(format);
            openOrCreateDatabase = context.openOrCreateDatabase(format, 0, null);
            openOrCreateDatabase.setVersion(1);
            openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_tick_packet(packet_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, content BLOB NOT NULL)");
            openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_tick_packettimestamp ON table_tick_packet(timestamp)");
        }
        return new C1653k2(openOrCreateDatabase);
    }

    long a(long j4, byte[] bArr) {
        this.f21402b.beginTransaction();
        try {
            this.f21403c.clearBindings();
            this.f21403c.bindLong(1, j4);
            this.f21403c.bindBlob(2, bArr);
            long executeInsert = this.f21403c.executeInsert();
            if (executeInsert < 0) {
                throw new Exception("TimeSpentDataBaseSQL: sql insert failed");
            }
            this.f21402b.setTransactionSuccessful();
            AbstractC1708y2.a("TimeSpentDataBaseSQL: 1 tick packet (packetId = " + executeInsert + ") inserted to database (reason: store tick packet)");
            return executeInsert;
        } finally {
            this.f21402b.endTransaction();
        }
    }
}
