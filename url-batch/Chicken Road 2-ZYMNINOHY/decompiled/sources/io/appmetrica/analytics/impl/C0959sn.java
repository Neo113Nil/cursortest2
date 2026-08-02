package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959sn implements TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1098y6 f12752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12753b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f12754c = new SystemTimeProvider();

    public C0959sn(InterfaceC1098y6 interfaceC1098y6, String str) {
        this.f12752a = interfaceC1098y6;
        this.f12753b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(String str, int i4) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        C1011un c1011un;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = this.f12752a.a();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable unused) {
            cursor = null;
        }
        if (sQLiteDatabase != 0) {
            try {
                cursor = sQLiteDatabase.query(false, this.f12753b, null, "scope=?", new String[]{str}, null, null, "id", String.valueOf(i4));
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                c1011un = new C1011un(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("scope")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getBlob(cursor.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c1011un = null;
                            }
                            if (c1011un != null) {
                                arrayList.add(c1011un);
                            }
                        } catch (Throwable unused3) {
                            cursor2 = sQLiteDatabase;
                            sQLiteDatabase = cursor2;
                            cursor2 = cursor;
                            sQLiteDatabase2 = sQLiteDatabase;
                            AbstractC0779lo.a(cursor2);
                            this.f12752a.a(sQLiteDatabase2);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursor = null;
            }
            cursor2 = cursor;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        AbstractC0779lo.a(cursor2);
        this.f12752a.a(sQLiteDatabase2);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j4, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f12752a.a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", Long.valueOf(j4));
                    contentValues.put("data", bArr);
                    long insertOrThrow = sQLiteDatabase.insertOrThrow(this.f12753b, null, contentValues);
                    this.f12752a.a(sQLiteDatabase);
                    return insertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.f12752a.a(sQLiteDatabase);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f12752a.a(sQLiteDatabase);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j4) {
        a("id=?", new String[]{String.valueOf(j4)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j4) {
        a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.f12754c.currentTimeMillis() - j4)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return (TempCacheStorage.Entry) d3.i.d0(get(str, 1));
    }

    public final void a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f12752a.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.delete(this.f12753b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f12752a.a(sQLiteDatabase);
    }
}
