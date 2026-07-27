package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import b2.AbstractC0279e;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1156zb implements Oa, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9625a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9626b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f9627c = "preferences";

    /* renamed from: d, reason: collision with root package name */
    public final C1131yb f9628d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f9629e;

    /* renamed from: f, reason: collision with root package name */
    public final F6 f9630f;

    public C1156zb(F6 f6) {
        this.f9630f = f6;
        Locale locale = Locale.US;
        C1131yb c1131yb = new C1131yb(this, AbstractC0279e.d(Gd.a(), "IAA-DW-"));
        this.f9628d = c1131yb;
        c1131yb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C1156zb c1156zb) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        c1156zb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabase = c1156zb.f9630f.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(c1156zb.f9627c, new String[]{"key", "value", WebViewManager.EVENT_TYPE_KEY}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("key"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                            int i2 = query.getInt(query.getColumnIndexOrThrow(WebViewManager.EVENT_TYPE_KEY));
                            if (!TextUtils.isEmpty(string)) {
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        str = ParseUtils.parseInt(string2);
                                    } else if (i2 != 3) {
                                        str = string2;
                                        if (i2 != 4) {
                                            if (i2 == 5) {
                                                str = ParseUtils.parseFloat(string2);
                                            }
                                            str = null;
                                        }
                                    } else {
                                        str = ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        c1156zb.f9625a.put(string, str);
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
        AbstractC0860no.a(cursor);
        c1156zb.f9630f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b() {
        synchronized (this.f9628d) {
            this.f9628d.notifyAll();
        }
    }

    public final void c() {
        if (this.f9629e) {
            return;
        }
        try {
            this.f9625a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9628d.isRunning()) {
            this.f9628d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean getBoolean(String str, boolean z) {
        Object b6 = b(str);
        return b6 instanceof Boolean ? ((Boolean) b6).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final int getInt(String str, int i2) {
        Object b6 = b(str);
        return b6 instanceof Integer ? ((Integer) b6).intValue() : i2;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final long getLong(String str, long j2) {
        Object b6 = b(str);
        return b6 instanceof Long ? ((Long) b6).longValue() : j2;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final String getString(String str, String str2) {
        Object b6 = b(str);
        return b6 instanceof String ? (String) b6 : str2;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa remove(String str) {
        synchronized (this.f9625a) {
            c();
            this.f9625a.remove(str);
        }
        synchronized (this.f9628d) {
            this.f9626b.put(str, this);
            this.f9628d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f9625a) {
            c();
            obj = this.f9625a.get(str);
        }
        return obj;
    }

    public static void a(C1156zb c1156zb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        c1156zb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i2 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c1156zb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put(WebViewManager.EVENT_TYPE_KEY, (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put(WebViewManager.EVENT_TYPE_KEY, (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put(WebViewManager.EVENT_TYPE_KEY, (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put(WebViewManager.EVENT_TYPE_KEY, (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put(WebViewManager.EVENT_TYPE_KEY, (Integer) 5);
            }
            contentValuesArr[i2] = contentValues;
            i2++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c1156zb.f9630f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i3 = 0; i3 < size; i3++) {
                        ContentValues contentValues2 = contentValuesArr[i3];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c1156zb.f9627c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c1156zb.f9627c, null, contentValues2, 5);
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
                    c1156zb.f9630f.a(sQLiteDatabase);
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
        c1156zb.f9630f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final synchronized Oa a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, long j2) {
        a(str, Long.valueOf(j2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final synchronized Oa a(int i2, String str) {
        a(str, Integer.valueOf(i2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, float f3) {
        a(str, Float.valueOf(f3));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.f9625a) {
            c();
            containsKey = this.f9625a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f9625a) {
            hashSet = new HashSet(this.f9625a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f9625a) {
            c();
            this.f9625a.put(str, obj);
        }
        synchronized (this.f9628d) {
            this.f9626b.put(str, obj);
            this.f9628d.notifyAll();
        }
    }
}
