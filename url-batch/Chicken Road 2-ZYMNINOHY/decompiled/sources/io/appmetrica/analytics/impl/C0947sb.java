package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947sb implements Ha, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12725a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12726b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f12727c = "preferences";

    /* renamed from: d, reason: collision with root package name */
    public final C0921rb f12728d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f12729e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1098y6 f12730f;

    public C0947sb(InterfaceC1098y6 interfaceC1098y6) {
        this.f12730f = interfaceC1098y6;
        Locale locale = Locale.US;
        C0921rb c0921rb = new C0921rb(this, AbstractC0005f.j(ThreadFactoryC1131zd.a(), "IAA-DW-"));
        this.f12728d = c0921rb;
        c0921rb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C0947sb c0947sb) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        c0947sb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabase = c0947sb.f12730f.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(c0947sb.f12727c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("key"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                            int i4 = query.getInt(query.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i4 != 1) {
                                    if (i4 == 2) {
                                        str = ParseUtils.parseInt(string2);
                                    } else if (i4 != 3) {
                                        str = string2;
                                        if (i4 != 4) {
                                            if (i4 == 5) {
                                                str = ParseUtils.parseFloat(string2);
                                            }
                                            str = null;
                                        }
                                    } else {
                                        str = ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        c0947sb.f12725a.put(string, str);
                                    }
                                } else {
                                    if ("true".equals(string2)) {
                                        str = Boolean.TRUE;
                                    } else {
                                        if ("false".equals(string2)) {
                                            str = Boolean.FALSE;
                                        }
                                        str = null;
                                    }
                                    if (str == null) {
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    cursor = query;
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            sQLiteDatabase = null;
        }
        AbstractC0779lo.a(cursor);
        c0947sb.f12730f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void b() {
        synchronized (this.f12728d) {
            this.f12728d.notifyAll();
        }
    }

    public final void c() {
        if (this.f12729e) {
            return;
        }
        try {
            this.f12725a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12728d.isRunning()) {
            this.f12728d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean getBoolean(String str, boolean z) {
        Object b4 = b(str);
        return b4 instanceof Boolean ? ((Boolean) b4).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final int getInt(String str, int i4) {
        Object b4 = b(str);
        return b4 instanceof Integer ? ((Integer) b4).intValue() : i4;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final long getLong(String str, long j4) {
        Object b4 = b(str);
        return b4 instanceof Long ? ((Long) b4).longValue() : j4;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final String getString(String str, String str2) {
        Object b4 = b(str);
        return b4 instanceof String ? (String) b4 : str2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha remove(String str) {
        synchronized (this.f12725a) {
            c();
            this.f12725a.remove(str);
        }
        synchronized (this.f12728d) {
            this.f12726b.put(str, this);
            this.f12728d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f12725a) {
            c();
            obj = this.f12725a.get(str);
        }
        return obj;
    }

    public static void a(C0947sb c0947sb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        c0947sb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i4 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c0947sb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i4] = contentValues;
            i4++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c0947sb.f12730f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i5 = 0; i5 < size; i5++) {
                        ContentValues contentValues2 = contentValuesArr[i5];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c0947sb.f12727c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c0947sb.f12727c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    c0947sb.f12730f.a(sQLiteDatabase);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c0947sb.f12730f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized Ha a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, long j4) {
        a(str, Long.valueOf(j4));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized Ha a(int i4, String str) {
        a(str, Integer.valueOf(i4));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, float f4) {
        a(str, Float.valueOf(f4));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.f12725a) {
            c();
            containsKey = this.f12725a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f12725a) {
            hashSet = new HashSet(this.f12725a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f12725a) {
            c();
            this.f12725a.put(str, obj);
        }
        synchronized (this.f12728d) {
            this.f12726b.put(str, obj);
            this.f12728d.notifyAll();
        }
    }
}
