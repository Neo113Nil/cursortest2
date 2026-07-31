package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class r8 extends c6 {
    public static final String[] d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", "details", "detailsJson", "dParam", NotificationCompat.CATEGORY_SERVICE, "tag"};
    public final LinkedList c;

    public r8(Context context) {
        super(context);
        this.c = new LinkedList();
    }

    public static boolean a(n8 n8Var, t8 t8Var, SQLiteDatabase sQLiteDatabase, HashMap hashMap, long j) {
        if (t8Var.f436a.size() > 0 && !t8Var.f436a.contains(n8Var.d)) {
            return false;
        }
        if (t8Var.b.size() > 0 && t8Var.b.contains(n8Var.d)) {
            return false;
        }
        if (t8Var.c.size() > 0 && !t8Var.c.contains(n8Var.i)) {
            return false;
        }
        if (t8Var.d.size() > 0 && t8Var.d.contains(n8Var.i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hashMap.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", (String) hashMap.get("sdkVersion"));
        }
        if (hashMap.containsKey("category")) {
            linkedHashMap.put("category", (String) hashMap.get("category"));
        }
        for (String str : t8Var.e) {
            if (hashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) hashMap.get(str));
            }
        }
        int size = linkedHashMap.size();
        if (size < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(size);
        String str2 = "";
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append(str2);
            sb.append((String) entry.getKey());
            if (entry.getValue() == null) {
                sb.append(" IS NULL");
            } else {
                sb.append(" = ?");
                arrayList.add((String) entry.getValue());
            }
            str2 = " AND ";
        }
        Pair pair = new Pair(sb.toString(), (String[]) arrayList.toArray(new String[0]));
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, null, null, "sendSuccess DESC");
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                if (j2 <= 0) {
                    return true;
                }
                long j3 = j - j2;
                long j4 = t8Var.f;
                if (j4 > 0 && j3 < j4) {
                    return true;
                }
            }
            return false;
        } finally {
            a(cursor);
        }
    }

    public static n8 b(Cursor cursor) {
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(1);
        a(j, j2);
        String string = cursor.getString(2);
        o8 o8Var = (o8) o8.c.get(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        boolean z = cursor.getInt(9) == 1;
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        }
        if (o8Var == null) {
            throw new IllegalArgumentException();
        }
        Object obj = null;
        if (string5 != null) {
            try {
                obj = new JSONTokener(string5).nextValue();
            } catch (JSONException unused) {
            }
        }
        n8 n8Var = new n8(o8Var, j);
        n8Var.h = Long.valueOf(j2);
        n8Var.c = string;
        n8Var.i = string2;
        n8Var.d = string3;
        n8Var.e = string4;
        n8Var.f = obj;
        n8Var.g = string6;
        n8Var.j = z;
        n8Var.k = string7;
        return n8Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    public final void a(c9 c9Var, int i, int i2) {
        String str = "attempt < " + i + " AND validTill >= " + System.currentTimeMillis() + " AND sendSuccess = 0  AND send <= sendFailure";
        Cursor cursor = null;
        try {
            cursor = a().query("events", d, str, null, null, null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i2)));
            while (cursor.moveToNext()) {
                c9Var.a(b(cursor));
            }
        } finally {
            a(cursor);
        }
    }

    public final boolean a(n8 n8Var, q8 q8Var) {
        long j;
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = q8Var.e + currentTimeMillis;
            Long l = n8Var.h;
            if (l != null) {
                j = l.longValue();
            } else {
                n8Var.h = Long.valueOf(currentTimeMillis);
                j = currentTimeMillis;
            }
            Object obj = n8Var.f;
            String obj2 = obj != null ? obj.toString() : null;
            String str = n8Var.c;
            if (str == null) {
                str = "5.3.2";
            }
            String str2 = str;
            List list = q8Var.g;
            if (list.size() > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("sdkVersion", str2);
                hashMap.put("category", n8Var.f348a.f361a);
                hashMap.put("appActivity", n8Var.i);
                hashMap.put("value", n8Var.d);
                hashMap.put("details", n8Var.e);
                hashMap.put("detailsJson", obj2);
                hashMap.put("dParam", n8Var.g);
                hashMap.put(NotificationCompat.CATEGORY_SERVICE, n8Var.j ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (a(n8Var, (t8) it.next(), a2, hashMap, currentTimeMillis)) {
                        a2.endTransaction();
                        return false;
                    }
                }
            }
            a2.delete("events", "validTill < " + currentTimeMillis, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(j));
            contentValues.put("validTill", Long.valueOf(j2));
            contentValues.put("sdkVersion", str2);
            contentValues.put("category", n8Var.f348a.f361a);
            contentValues.put("appActivity", n8Var.i);
            contentValues.put("value", n8Var.d);
            contentValues.put("details", n8Var.e);
            contentValues.put("detailsJson", obj2);
            contentValues.put("dParam", n8Var.g);
            contentValues.put(NotificationCompat.CATEGORY_SERVICE, Integer.valueOf(n8Var.j ? 1 : 0));
            contentValues.put("tag", n8Var.k);
            contentValues.put("priority", Integer.valueOf(q8Var.c));
            a2.insertOrThrow("events", null, contentValues);
            a2.setTransactionSuccessful();
            synchronized (this) {
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    ((c7) it2.next()).call();
                }
            }
            return true;
        } finally {
            a2.endTransaction();
        }
    }

    public static void a(long j, long j2) {
        if (j <= 0) {
            throw new IllegalArgumentException();
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, long j) {
        try {
            Cursor query = sQLiteDatabase.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j)}, null, null, null);
            if (query.moveToFirst()) {
                int i = query.getInt(0);
                a(query);
                return i;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            a(null);
            throw th;
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
