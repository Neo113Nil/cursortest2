package com.tapjoy.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class g extends at implements ax, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f8143a;

    /* renamed from: b, reason: collision with root package name */
    private final bd f8144b;

    /* renamed from: c, reason: collision with root package name */
    private int f8145c;

    public g(File file, bd bdVar) {
        this.f8143a = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        this.f8144b = bdVar;
        if (this.f8143a.getVersion() != 1) {
            this.f8143a.beginTransaction();
            try {
                this.f8143a.execSQL("CREATE TABLE IF NOT EXISTS List(value BLOB)");
                this.f8143a.setVersion(1);
                this.f8143a.setTransactionSuccessful();
            } finally {
                this.f8143a.endTransaction();
            }
        }
        this.f8145c = a();
    }

    protected final void finalize() {
        close();
        super.finalize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8143a != null) {
            this.f8143a.close();
            this.f8143a = null;
        }
    }

    private int a() {
        Cursor rawQuery;
        Cursor cursor = null;
        try {
            rawQuery = this.f8143a.rawQuery("SELECT COUNT(1) FROM List", null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!rawQuery.moveToNext()) {
                a(rawQuery);
                return 0;
            }
            int i = rawQuery.getInt(0);
            a(rawQuery);
            return i;
        } catch (Throwable th2) {
            th = th2;
            cursor = rawQuery;
            a(cursor);
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f8145c;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f8143a.delete("List", "1", null);
        this.f8145c = 0;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        jq.a(obj);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                this.f8144b.a(byteArrayOutputStream, obj);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ka.a(byteArrayOutputStream);
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", byteArray);
                if (this.f8143a.insert("List", null, contentValues) == -1) {
                    return false;
                }
                this.f8145c++;
                return true;
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        } catch (Throwable th) {
            ka.a(byteArrayOutputStream);
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (this.f8145c <= 0) {
            return null;
        }
        Object peek = peek();
        b(1);
        return peek;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (this.f8145c > 0) {
            return a(0);
        }
        return null;
    }

    @Override // com.tapjoy.internal.ax
    public final Object a(int i) {
        Throwable th;
        Cursor cursor;
        if (i < 0 || i >= this.f8145c) {
            throw new IndexOutOfBoundsException();
        }
        try {
            cursor = this.f8143a.rawQuery("SELECT value FROM List ORDER BY rowid LIMIT " + i + ",1", null);
            try {
                if (cursor.moveToNext()) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cursor.getBlob(0));
                    try {
                        try {
                            Object b2 = this.f8144b.b(byteArrayInputStream);
                            a(cursor);
                            return b2;
                        } catch (IOException e) {
                            throw new IllegalStateException(e);
                        }
                    } finally {
                        ka.a(byteArrayInputStream);
                    }
                }
                throw new NoSuchElementException();
            } catch (Throwable th2) {
                th = th2;
                a(cursor);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // com.tapjoy.internal.ax
    public final void b(int i) {
        if (i <= 0 || i > this.f8145c) {
            throw new IndexOutOfBoundsException();
        }
        if (i == this.f8145c) {
            clear();
            return;
        }
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f8143a;
            StringBuilder sb = new StringBuilder("SELECT rowid FROM List ORDER BY rowid LIMIT ");
            sb.append(i - 1);
            sb.append(",1");
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            try {
                if (rawQuery.moveToNext()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    int delete = this.f8143a.delete("List", "rowid <= " + j, null);
                    this.f8145c = this.f8145c - delete;
                    if (delete != i) {
                        throw new IllegalStateException("Try to delete " + i + ", but deleted " + delete);
                    }
                    a((Cursor) null);
                    return;
                }
                throw new IllegalStateException();
            } catch (Throwable th) {
                th = th;
                cursor = rawQuery;
                a(cursor);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static Cursor a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        cursor.close();
        return null;
    }
}
