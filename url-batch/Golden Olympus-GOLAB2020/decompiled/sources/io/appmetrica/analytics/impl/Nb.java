package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Nb implements InterfaceC2542cb, Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f37999a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f38000b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f38001c = "preferences";

    /* renamed from: d, reason: collision with root package name */
    public final Mb f38002d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f38003e;

    /* renamed from: f, reason: collision with root package name */
    public final T6 f38004f;

    public Nb(T6 t6) {
        this.f38004f = t6;
        Mb mb = new Mb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(Od.a())));
        this.f38002d = mb;
        mb.start();
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
    public static void a(Nb nb) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        nb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabase = nb.f38004f.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(nb.f38001c, new String[]{b9.h.f15463W, "value", "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow(b9.h.f15463W));
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
                                        nb.f37999a.put(string, str);
                                    }
                                } else {
                                    if (com.ironsource.mediationsdk.metadata.a.f17681g.equals(string2)) {
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
        AbstractC2713io.a(cursor);
        nb.f38004f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final void b() {
        synchronized (this.f38002d) {
            this.f38002d.notifyAll();
        }
    }

    public final void c() {
        if (this.f38003e) {
            return;
        }
        try {
            this.f37999a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38002d.isRunning()) {
            this.f38002d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final boolean getBoolean(String str, boolean z4) {
        Object b4 = b(str);
        return b4 instanceof Boolean ? ((Boolean) b4).booleanValue() : z4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final int getInt(String str, int i4) {
        Object b4 = b(str);
        return b4 instanceof Integer ? ((Integer) b4).intValue() : i4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final long getLong(String str, long j4) {
        Object b4 = b(str);
        return b4 instanceof Long ? ((Long) b4).longValue() : j4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final String getString(String str, String str2) {
        Object b4 = b(str);
        return b4 instanceof String ? (String) b4 : str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final InterfaceC2542cb remove(String str) {
        synchronized (this.f37999a) {
            c();
            this.f37999a.remove(str);
        }
        synchronized (this.f38002d) {
            this.f38000b.put(str, this);
            this.f38002d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f37999a) {
            c();
            obj = this.f37999a.get(str);
        }
        return obj;
    }

    public static void a(Nb nb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        nb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i4 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put(b9.h.f15463W, str);
            if (value == nb) {
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
            sQLiteDatabase = nb.f38004f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i5 = 0; i5 < size; i5++) {
                        ContentValues contentValues2 = contentValuesArr[i5];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(nb.f38001c, "key = ?", new String[]{contentValues2.getAsString(b9.h.f15463W)});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(nb.f38001c, null, contentValues2, 5);
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
                    nb.f38004f.a(sQLiteDatabase);
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
        nb.f38004f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final synchronized InterfaceC2542cb a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final InterfaceC2542cb a(String str, long j4) {
        a(str, Long.valueOf(j4));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final synchronized InterfaceC2542cb a(int i4, String str) {
        a(str, Integer.valueOf(i4));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final InterfaceC2542cb a(String str, boolean z4) {
        a(str, Boolean.valueOf(z4));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final InterfaceC2542cb a(String str, float f4) {
        a(str, Float.valueOf(f4));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.f37999a) {
            c();
            containsKey = this.f37999a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2542cb
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f37999a) {
            hashSet = new HashSet(this.f37999a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f37999a) {
            c();
            this.f37999a.put(str, obj);
        }
        synchronized (this.f38002d) {
            this.f38000b.put(str, obj);
            this.f38002d.notifyAll();
        }
    }
}
