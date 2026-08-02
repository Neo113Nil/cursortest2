package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
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

/* renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005zb implements Oa, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8668a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8669b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f8670c = "preferences";

    /* renamed from: d, reason: collision with root package name */
    public final C0980yb f8671d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f8672e;
    public final F6 f;

    public C1005zb(F6 f6) {
        this.f = f6;
        Locale locale = Locale.US;
        C0980yb c0980yb = new C0980yb(this, AbstractC0033i.h(Gd.a(), "IAA-DW-"));
        this.f8671d = c0980yb;
        c0980yb.start();
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
    public static void a(C1005zb c1005zb) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        c1005zb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabase = c1005zb.f.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(c1005zb.f8670c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("key"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                            int i3 = query.getInt(query.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        str = ParseUtils.parseInt(string2);
                                    } else if (i3 != 3) {
                                        str = string2;
                                        if (i3 != 4) {
                                            if (i3 == 5) {
                                                str = ParseUtils.parseFloat(string2);
                                            }
                                            str = null;
                                        }
                                    } else {
                                        str = ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        c1005zb.f8668a.put(string, str);
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
        AbstractC0709no.a(cursor);
        c1005zb.f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b() {
        synchronized (this.f8671d) {
            this.f8671d.notifyAll();
        }
    }

    public final void c() {
        if (this.f8672e) {
            return;
        }
        try {
            this.f8668a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8671d.isRunning()) {
            this.f8671d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean getBoolean(String str, boolean z) {
        Object b3 = b(str);
        return b3 instanceof Boolean ? ((Boolean) b3).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final int getInt(String str, int i3) {
        Object b3 = b(str);
        return b3 instanceof Integer ? ((Integer) b3).intValue() : i3;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final long getLong(String str, long j3) {
        Object b3 = b(str);
        return b3 instanceof Long ? ((Long) b3).longValue() : j3;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final String getString(String str, String str2) {
        Object b3 = b(str);
        return b3 instanceof String ? (String) b3 : str2;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa remove(String str) {
        synchronized (this.f8668a) {
            c();
            this.f8668a.remove(str);
        }
        synchronized (this.f8671d) {
            this.f8669b.put(str, this);
            this.f8671d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f8668a) {
            c();
            obj = this.f8668a.get(str);
        }
        return obj;
    }

    public static void a(C1005zb c1005zb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        c1005zb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i3 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c1005zb) {
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
            contentValuesArr[i3] = contentValues;
            i3++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c1005zb.f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i4 = 0; i4 < size; i4++) {
                        ContentValues contentValues2 = contentValuesArr[i4];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c1005zb.f8670c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c1005zb.f8670c, null, contentValues2, 5);
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
                    c1005zb.f.a(sQLiteDatabase);
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
        c1005zb.f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final synchronized Oa a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, long j3) {
        a(str, Long.valueOf(j3));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final synchronized Oa a(int i3, String str) {
        a(str, Integer.valueOf(i3));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, float f) {
        a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.f8668a) {
            c();
            containsKey = this.f8668a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f8668a) {
            hashSet = new HashSet(this.f8668a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f8668a) {
            c();
            this.f8668a.put(str, obj);
        }
        synchronized (this.f8671d) {
            this.f8669b.put(str, obj);
            this.f8671d.notifyAll();
        }
    }
}
