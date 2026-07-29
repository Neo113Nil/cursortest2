package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import android.util.Base64;
import com.tapjoy.TapjoyConstants;
import com.umeng.analytics.pro.c;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UMStoreManager.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8906a = 2049;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8907b = 2050;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8908c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private static Context f8909d = null;
    private static String e = null;
    private static final String f = "umeng+";
    private static final String g = "ek__id";
    private static final String h = "ek_key";
    private List<String> i;
    private List<Integer> j;
    private String k;

    /* compiled from: UMStoreManager.java */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r1.endTransaction();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003a, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i) {
        SQLiteDatabase sQLiteDatabase;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable unused) {
                    e.a(f8909d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
            } catch (Throwable unused3) {
                sQLiteDatabase = null;
            }
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = r0;
        }
        try {
            sQLiteDatabase.beginTransaction();
            if (i == 0) {
                sQLiteDatabase.execSQL("delete from __dp where __ty=0");
            } else {
                r0 = 4;
                if (i == 4) {
                    sQLiteDatabase.execSQL("delete from __dp where __ty=3");
                    sQLiteDatabase.execSQL("delete from __dp where __ty=2");
                } else {
                    r0 = 1;
                    r0 = 1;
                    if (i == 1) {
                        sQLiteDatabase.execSQL("delete from __dp where __ty=1");
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException unused4) {
            r0 = sQLiteDatabase;
            f.a(f8909d);
            if (r0 != 0) {
                r0.endTransaction();
                r0 = r0;
            }
            e.a(f8909d).b();
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused5) {
                }
            }
            e.a(f8909d).b();
            throw th;
        }
    }

    /* compiled from: UMStoreManager.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final g f8914a = new g();

        private b() {
        }
    }

    private g() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
    }

    public static g a(Context context) {
        g gVar = b.f8914a;
        if (f8909d == null && context != null) {
            f8909d = context.getApplicationContext();
            gVar.h();
        }
        return gVar;
    }

    private void h() {
        synchronized (this) {
            i();
            this.i.clear();
        }
    }

    public void a() {
        this.i.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(JSONObject jSONObject, int i) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable unused) {
                    e.a(f8909d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
            } catch (Throwable unused3) {
                sQLiteDatabase = null;
            }
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = sQLiteDatabase2;
        }
        try {
            sQLiteDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            String optString = jSONObject.optString("__ii");
            contentValues.put(c.a.C0393a.f8861a, Long.valueOf(System.currentTimeMillis() - TapjoyConstants.TIMER_INCREMENT));
            if (TextUtils.isEmpty(optString)) {
                optString = "-1";
            }
            contentValues.put("__ii", optString);
            jSONObject.remove("__ii");
            contentValues.put(c.a.C0393a.f8863c, a(jSONObject.toString()));
            contentValues.put(c.a.C0393a.f8864d, Integer.valueOf(i));
            contentValues.put(c.a.C0393a.e, DeviceConfig.getAppVersionCode(f8909d));
            sQLiteDatabase.insert(c.a.f8860a, null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
            f.a(f8909d);
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.endTransaction();
            }
            e.a(f8909d).b();
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(JSONArray jSONArray) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable unused) {
                    e.a(f8909d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
            } catch (Throwable unused3) {
                sQLiteDatabase = null;
            }
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = sQLiteDatabase2;
        }
        try {
            sQLiteDatabase.beginTransaction();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    ContentValues contentValues = new ContentValues();
                    String optString = jSONObject.optString("__i");
                    if (TextUtils.isEmpty(optString) || "-1".equals(optString)) {
                        optString = o.a().c();
                        if (TextUtils.isEmpty(optString)) {
                            optString = "-1";
                        }
                    }
                    contentValues.put("__i", optString);
                    contentValues.put("__e", jSONObject.optString("id"));
                    contentValues.put("__t", Integer.valueOf(jSONObject.optInt("__t")));
                    jSONObject.remove("__i");
                    jSONObject.remove("__t");
                    contentValues.put(c.d.a.f8883c, a(jSONObject.toString()));
                    sQLiteDatabase.insert(c.d.f8880a, null, contentValues);
                } catch (Exception unused4) {
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException unused5) {
            sQLiteDatabase2 = sQLiteDatabase;
            f.a(f8909d);
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.endTransaction();
            }
            e.a(f8909d).b();
        } catch (Throwable unused6) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0043, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, String str2, int i) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable unused) {
                    e.a(f8909d).b();
                    return false;
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
            } catch (Throwable unused3) {
                sQLiteDatabase = null;
            }
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = sQLiteDatabase2;
        }
        try {
            sQLiteDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put("__i", str);
            String a2 = a(str2);
            if (!TextUtils.isEmpty(a2)) {
                contentValues.put("__a", a2);
                contentValues.put("__t", Integer.valueOf(i));
                sQLiteDatabase.insert(c.C0394c.f8873a, null, contentValues);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
            f.a(f8909d);
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.endTransaction();
            }
            e.a(f8909d).b();
            return false;
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        r1.endTransaction();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2 = null;
        r0 = 0;
        SQLiteDatabase sQLiteDatabase3 = null;
        String str = 0;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable th2) {
                    sQLiteDatabase = sQLiteDatabase2;
                    th = th2;
                }
            } catch (SQLiteDatabaseCorruptException unused) {
            } catch (Throwable unused2) {
                sQLiteDatabase = null;
            }
        } catch (Throwable unused3) {
        }
        try {
            sQLiteDatabase.beginTransaction();
            str = o.a().d();
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : new String[]{"", "-1"}) {
                    sQLiteDatabase.execSQL("update __et set __i=\"" + str + "\" where __i=\"" + str2 + "\"");
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase2 = str;
            } else {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused4) {
                    }
                }
                e.a(f8909d).b();
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
            sQLiteDatabase3 = sQLiteDatabase;
            f.a(f8909d);
            sQLiteDatabase2 = sQLiteDatabase3;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.endTransaction();
                sQLiteDatabase2 = sQLiteDatabase3;
            }
            e.a(f8909d).b();
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused6) {
                }
            }
            e.a(f8909d).b();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        r2.endTransaction();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.umeng.analytics.pro.g$a] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.umeng.analytics.pro.g$a] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.umeng.analytics.pro.g$a] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, JSONObject jSONObject, a aVar) {
        SQLiteDatabase sQLiteDatabase;
        if (jSONObject == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable unused) {
                    e.a(f8909d).b();
                    return false;
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
            } catch (Throwable unused3) {
                sQLiteDatabase = null;
            }
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = sQLiteDatabase2;
        }
        try {
            sQLiteDatabase.beginTransaction();
            if (aVar == a.BEGIN) {
                long longValue = ((Long) jSONObject.get("__e")).longValue();
                ContentValues contentValues = new ContentValues();
                contentValues.put("__ii", str);
                contentValues.put("__e", String.valueOf(longValue));
                sQLiteDatabase.insert(c.e.f8889a, null, contentValues);
            } else if (aVar == a.END) {
                long longValue2 = ((Long) jSONObject.get(c.e.a.g)).longValue();
                ?? sb = new StringBuilder();
                sb.append("update __sd set __f=\"");
                sb.append(longValue2);
                sb.append("\" where ");
                sb.append("__ii");
                sb.append("=\"");
                sb.append(str);
                sb.append("\"");
                sQLiteDatabase.execSQL(sb.toString());
                sQLiteDatabase2 = sb;
            } else {
                ?? r1 = a.PAGE;
                if (aVar == r1) {
                    a(str, jSONObject, sQLiteDatabase, "__a");
                    sQLiteDatabase2 = r1;
                } else {
                    ?? r12 = a.AUTOPAGE;
                    if (aVar == r12) {
                        a(str, jSONObject, sQLiteDatabase, c.e.a.f8892c);
                        sQLiteDatabase2 = r12;
                    } else {
                        ?? r13 = a.NEWSESSION;
                        sQLiteDatabase2 = r13;
                        if (aVar == r13) {
                            a(str, jSONObject, sQLiteDatabase);
                            sQLiteDatabase2 = r13;
                        }
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
            f.a(f8909d);
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.endTransaction();
                sQLiteDatabase2 = sQLiteDatabase2;
            }
            e.a(f8909d).b();
            return false;
        } catch (Throwable unused5) {
        }
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        String str2 = null;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(c.e.a.e);
            if (jSONObject2 != null) {
                cursor = sQLiteDatabase.rawQuery("select __d from __sd where __ii=\"" + str + "\"", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            str2 = b(cursor.getString(cursor.getColumnIndex(c.e.a.e)));
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
            } else {
                cursor = null;
            }
            if (jSONObject2 != null) {
                JSONArray jSONArray = new JSONArray();
                if (!TextUtils.isEmpty(str2)) {
                    jSONArray = new JSONArray(str2);
                }
                jSONArray.put(jSONObject2);
                String a2 = a(jSONArray.toString());
                if (!TextUtils.isEmpty(a2)) {
                    sQLiteDatabase.execSQL("update  __sd set __d=\"" + a2 + "\" where __ii=\"" + str + "\"");
                }
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(c.e.a.f8893d);
            if (jSONObject3 != null) {
                String a3 = a(jSONObject3.toString());
                if (!TextUtils.isEmpty(a3)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + a3 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.getLong(c.e.a.g)) + "\" where __ii=\"" + str + "\"");
            if (cursor == null) {
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        cursor.close();
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) throws JSONException {
        Cursor cursor;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str3 = null;
        try {
            if ("__a".equals(str2)) {
                jSONArray = jSONObject.optJSONArray("__a");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    return;
                }
            } else if (c.e.a.f8892c.equals(str2)) {
                jSONArray = jSONObject.optJSONArray(c.e.a.f8892c);
                if (jSONArray == null || jSONArray.length() <= 0) {
                    return;
                }
            } else {
                jSONArray = null;
            }
            cursor = sQLiteDatabase.rawQuery("select " + str2 + " from " + c.e.f8889a + " where __ii=\"" + str + "\"", null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        str3 = b(cursor.getString(cursor.getColumnIndex(str2)));
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            }
            jSONArray2 = new JSONArray();
            if (!TextUtils.isEmpty(str3)) {
                jSONArray2 = new JSONArray(str3);
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (jSONArray2.length() > 1000) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    jSONArray2.put(jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
        String a2 = a(jSONArray2.toString());
        if (!TextUtils.isEmpty(a2)) {
            sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + a2 + "\" where __ii=\"" + str + "\"");
        }
        if (cursor == null) {
            return;
        }
        cursor.close();
    }

    public JSONObject a(boolean z) {
        a();
        this.j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            a(jSONObject, z);
            b(jSONObject, null);
            a(jSONObject, (String) null);
        } else {
            String a2 = a(jSONObject, z);
            if (!TextUtils.isEmpty(a2)) {
                b(jSONObject, a2);
                a(jSONObject, a2);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a1, code lost:
    
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b3, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        com.umeng.analytics.pro.e.a(com.umeng.analytics.pro.g.f8909d).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, org.json.JSONArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject c() {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        ?? jSONObject = new JSONObject();
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        try {
            try {
                sQLiteDatabase = e.a(f8909d).a();
                try {
                    sQLiteDatabase.beginTransaction();
                    cursor = sQLiteDatabase.rawQuery("select *  from __dp", null);
                    if (cursor != null) {
                        try {
                            r1 = new JSONArray();
                            ?? jSONArray = new JSONArray();
                            ?? jSONArray2 = new JSONArray();
                            while (cursor.moveToNext()) {
                                String string = cursor.getString(cursor.getColumnIndex(c.a.C0393a.f8863c));
                                int i = cursor.getInt(cursor.getColumnIndex(c.a.C0393a.f8864d));
                                if (!TextUtils.isEmpty(string)) {
                                    JSONObject jSONObject2 = new JSONObject(b(string));
                                    if (jSONObject2.length() > 0) {
                                        if (i == 2) {
                                            jSONArray.put(jSONObject2);
                                        } else if (i == 3) {
                                            jSONArray.put(jSONObject2);
                                        } else if (i == 0) {
                                            r1.put(jSONObject2);
                                        } else if (i == 1) {
                                            jSONArray2.put(jSONObject2);
                                        }
                                    }
                                }
                                if (r1.length() > 0) {
                                    jSONObject.put("events", r1);
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject.put(com.umeng.analytics.pro.b.ac, jSONArray);
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put(com.umeng.analytics.pro.b.ah, jSONArray2);
                                }
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            r1 = cursor;
                            f.a(f8909d);
                            if (r1 != 0) {
                                r1.close();
                            }
                        } catch (Throwable unused2) {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                    cursor = null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = r1;
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
            sQLiteDatabase = null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            cursor = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x016b, code lost:
    
        if (r1 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x017d, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0195, code lost:
    
        if (r1 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017b, code lost:
    
        if (r1 != null) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(JSONObject jSONObject, String str) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase = e.a(f8909d).a();
                try {
                    sQLiteDatabase.beginTransaction();
                    String str2 = "select *  from __et";
                    if (!TextUtils.isEmpty(str)) {
                        str2 = "select *  from __et where __i=\"" + str + "\"";
                    }
                    cursor = sQLiteDatabase.rawQuery(str2, null);
                    if (cursor != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            String c2 = o.a().c();
                            while (cursor.moveToNext()) {
                                int i = cursor.getInt(cursor.getColumnIndex("__t"));
                                String string = cursor.getString(cursor.getColumnIndex("__i"));
                                String string2 = cursor.getString(cursor.getColumnIndex(c.d.a.f8883c));
                                if (TextUtils.isEmpty(string) || "-1".equals(string)) {
                                    if (!TextUtils.isEmpty(c2)) {
                                        string = c2;
                                    }
                                }
                                this.j.add(Integer.valueOf(cursor.getInt(0)));
                                switch (i) {
                                    case f8906a /* 2049 */:
                                        if (!TextUtils.isEmpty(string2)) {
                                            JSONObject jSONObject4 = new JSONObject(b(string2));
                                            if (jSONObject2.has(string)) {
                                                jSONArray = jSONObject2.optJSONArray(string);
                                            } else {
                                                jSONArray = new JSONArray();
                                            }
                                            jSONArray.put(jSONObject4);
                                            jSONObject2.put(string, jSONArray);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case f8907b /* 2050 */:
                                        if (!TextUtils.isEmpty(string2)) {
                                            JSONObject jSONObject5 = new JSONObject(b(string2));
                                            if (jSONObject3.has(string)) {
                                                jSONArray2 = jSONObject3.optJSONArray(string);
                                            } else {
                                                jSONArray2 = new JSONArray();
                                            }
                                            jSONArray2.put(jSONObject5);
                                            jSONObject3.put(string, jSONArray2);
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                            if (jSONObject2.length() > 0) {
                                JSONArray jSONArray3 = new JSONArray();
                                Iterator<String> keys = jSONObject2.keys();
                                while (keys.hasNext()) {
                                    JSONObject jSONObject6 = new JSONObject();
                                    String next = keys.next();
                                    jSONObject6.put(next, new JSONArray(jSONObject2.optString(next)));
                                    if (jSONObject6.length() > 0) {
                                        jSONArray3.put(jSONObject6);
                                    }
                                }
                                if (jSONArray3.length() > 0) {
                                    jSONObject.put(com.umeng.analytics.pro.b.N, jSONArray3);
                                }
                            }
                            if (jSONObject3.length() > 0) {
                                JSONArray jSONArray4 = new JSONArray();
                                Iterator<String> keys2 = jSONObject3.keys();
                                while (keys2.hasNext()) {
                                    JSONObject jSONObject7 = new JSONObject();
                                    String next2 = keys2.next();
                                    jSONObject7.put(next2, new JSONArray(jSONObject3.optString(next2)));
                                    if (jSONObject7.length() > 0) {
                                        jSONArray4.put(jSONObject7);
                                    }
                                }
                                if (jSONArray4.length() > 0) {
                                    jSONObject.put(com.umeng.analytics.pro.b.O, jSONArray4);
                                }
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            cursor2 = cursor;
                            f.a(f8909d);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                        } catch (Throwable unused2) {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                    cursor = null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
            sQLiteDatabase = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            sQLiteDatabase = null;
        }
        e.a(f8909d).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r1 != null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase = e.a(f8909d).a();
                try {
                    sQLiteDatabase.beginTransaction();
                    String str2 = "select *  from __er";
                    if (!TextUtils.isEmpty(str)) {
                        str2 = "select *  from __er where __i=\"" + str + "\"";
                    }
                    cursor = sQLiteDatabase.rawQuery(str2, null);
                    if (cursor != null) {
                        try {
                            JSONArray jSONArray = new JSONArray();
                            while (cursor.moveToNext()) {
                                String string = cursor.getString(cursor.getColumnIndex("__a"));
                                if (!TextUtils.isEmpty(string)) {
                                    jSONArray.put(new JSONObject(b(string)));
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put("error", jSONArray);
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            cursor2 = cursor;
                            f.a(f8909d);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Throwable unused2) {
                                }
                            }
                            e.a(f8909d).b();
                            throw th;
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                    cursor = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
            sQLiteDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
        }
        e.a(f8909d).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0147, code lost:
    
        if (r3 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x015b, code lost:
    
        r3.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0159, code lost:
    
        if (r3 != null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(JSONObject jSONObject, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        String str;
        String str2 = null;
        str2 = null;
        str2 = null;
        str2 = null;
        str2 = null;
        r2 = null;
        str2 = null;
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase = e.a(f8909d).a();
                try {
                    sQLiteDatabase.beginTransaction();
                    cursor = sQLiteDatabase.rawQuery("select *  from __sd", null);
                    if (cursor != null) {
                        try {
                            try {
                                JSONArray jSONArray = new JSONArray();
                                while (true) {
                                    if (!cursor.moveToNext()) {
                                        break;
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    String string = cursor.getString(cursor.getColumnIndex(c.e.a.g));
                                    String string2 = cursor.getString(cursor.getColumnIndex("__e"));
                                    str = cursor.getString(cursor.getColumnIndex("__ii"));
                                    try {
                                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                                            if (Long.parseLong(string) - Long.parseLong(string2) > 0) {
                                                String string3 = cursor.getString(cursor.getColumnIndex("__a"));
                                                String string4 = cursor.getString(cursor.getColumnIndex(c.e.a.f8892c));
                                                String string5 = cursor.getString(cursor.getColumnIndex(c.e.a.f8893d));
                                                String string6 = cursor.getString(cursor.getColumnIndex(c.e.a.e));
                                                this.i.add(str);
                                                jSONObject2.put("id", str);
                                                jSONObject2.put(com.umeng.analytics.pro.b.p, string2);
                                                jSONObject2.put(com.umeng.analytics.pro.b.q, string);
                                                jSONObject2.put("duration", Long.parseLong(string) - Long.parseLong(string2));
                                                if (!TextUtils.isEmpty(string3)) {
                                                    jSONObject2.put(com.umeng.analytics.pro.b.s, new JSONArray(b(string3)));
                                                }
                                                if (!TextUtils.isEmpty(string4)) {
                                                    jSONObject2.put(com.umeng.analytics.pro.b.t, new JSONArray(b(string4)));
                                                }
                                                if (!TextUtils.isEmpty(string5)) {
                                                    jSONObject2.put(com.umeng.analytics.pro.b.A, new JSONObject(b(string5)));
                                                }
                                                if (!TextUtils.isEmpty(string6)) {
                                                    jSONObject2.put(com.umeng.analytics.pro.b.w, new JSONArray(b(string6)));
                                                }
                                                if (jSONObject2.length() > 0) {
                                                    jSONArray.put(jSONObject2);
                                                }
                                            }
                                            if (z) {
                                                str2 = str;
                                                break;
                                            }
                                        }
                                        str2 = str;
                                    } catch (SQLiteDatabaseCorruptException unused) {
                                        cursor2 = cursor;
                                        f.a(f8909d);
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            try {
                                                sQLiteDatabase.endTransaction();
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                        e.a(f8909d).b();
                                        return str;
                                    } catch (Throwable unused3) {
                                        str2 = str;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                }
                                if (this.i.size() < 1) {
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        try {
                                            sQLiteDatabase.endTransaction();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    e.a(f8909d).b();
                                    return str2;
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject.put(com.umeng.analytics.pro.b.n, jSONArray);
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    try {
                                        sQLiteDatabase.endTransaction();
                                    } catch (Throwable unused5) {
                                    }
                                }
                                e.a(f8909d).b();
                                throw th;
                            }
                        } catch (SQLiteDatabaseCorruptException unused6) {
                            str = str2;
                        } catch (Throwable unused7) {
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused8) {
                    str = null;
                } catch (Throwable unused9) {
                    cursor = null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        } catch (SQLiteDatabaseCorruptException unused10) {
            sQLiteDatabase = null;
            str = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
            cursor = null;
        }
        e.a(f8909d).b();
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        r1.endTransaction();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005b, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable unused) {
                    e.a(f8909d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
            } catch (Throwable unused3) {
                sQLiteDatabase = null;
            }
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = sQLiteDatabase2;
        }
        try {
            sQLiteDatabase.beginTransaction();
            if (z2) {
                if (z) {
                    sQLiteDatabase.execSQL("delete from __sd");
                }
            } else if (this.i.size() > 0) {
                int i = 0;
                while (i < this.i.size()) {
                    sQLiteDatabase.execSQL("delete from __sd where __ii=\"" + this.i.get(i) + "\"");
                    i++;
                    sQLiteDatabase2 = "\"";
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
            f.a(f8909d);
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.endTransaction();
                sQLiteDatabase2 = sQLiteDatabase2;
            }
            e.a(f8909d).b();
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r1.endTransaction();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2 = null;
        r0 = 0;
        SQLiteDatabase sQLiteDatabase3 = null;
        ?? r0 = 0;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable th2) {
                    sQLiteDatabase = sQLiteDatabase2;
                    th = th2;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    if (this.j.size() > 0) {
                        for (int i = 0; i < this.j.size(); i++) {
                            sQLiteDatabase.execSQL("delete from __et where rowid=" + this.j.get(i));
                        }
                    }
                    r0 = this.j;
                    r0.clear();
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase2 = r0;
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase3 = sQLiteDatabase;
                    f.a(f8909d);
                    sQLiteDatabase2 = sQLiteDatabase3;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.endTransaction();
                        sQLiteDatabase2 = sQLiteDatabase3;
                    }
                    e.a(f8909d).b();
                } catch (Throwable unused2) {
                }
            } catch (SQLiteDatabaseCorruptException unused3) {
            } catch (Throwable unused4) {
                sQLiteDatabase = null;
            }
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0023, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1.endTransaction();
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        r0 = 0;
        SQLiteDatabase sQLiteDatabase3 = null;
        ?? r0 = 0;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (SQLiteDatabaseCorruptException unused) {
            } catch (Throwable unused2) {
                sQLiteDatabase = null;
            }
        } catch (Throwable unused3) {
        }
        try {
            sQLiteDatabase.beginTransaction();
            r0 = "delete from __er";
            sQLiteDatabase.execSQL("delete from __er");
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase2 = r0;
        } catch (SQLiteDatabaseCorruptException unused4) {
            sQLiteDatabase3 = sQLiteDatabase;
            f.a(f8909d);
            sQLiteDatabase2 = sQLiteDatabase3;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.endTransaction();
                sQLiteDatabase2 = sQLiteDatabase3;
            }
            e.a(f8909d).b();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase2 = sQLiteDatabase;
            if (sQLiteDatabase2 != null) {
                try {
                    sQLiteDatabase2.endTransaction();
                } catch (Throwable unused5) {
                }
            }
            e.a(f8909d).b();
            throw th;
        }
    }

    public void f() {
        b(-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        r1.endTransaction();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0055, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(int i) {
        SQLiteDatabase sQLiteDatabase;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            try {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable unused) {
                    e.a(f8909d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
            } catch (Throwable unused3) {
                sQLiteDatabase = null;
            }
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = r0;
        }
        try {
            sQLiteDatabase.beginTransaction();
            String str = "delete from __dp";
            if (i == -1) {
                sQLiteDatabase.execSQL("delete from __dp");
                r0 = str;
            } else {
                r0 = 1;
                if (i == 1) {
                    sQLiteDatabase.execSQL("delete from __dp where __ty=1");
                } else {
                    r0 = 4;
                    if (i == 4) {
                        sQLiteDatabase.execSQL("delete from __dp where __ty=3");
                        sQLiteDatabase.execSQL("delete from __dp where __ty=2");
                    } else {
                        r0 = 3;
                        r0 = 3;
                        if (i == 3) {
                            sQLiteDatabase.execSQL("delete from __dp where __ty=3");
                        } else if (i == 0) {
                            sQLiteDatabase.execSQL("delete from __dp where __ty=0");
                        } else {
                            r0 = 2;
                            r0 = 2;
                            if (i == 2) {
                                sQLiteDatabase.execSQL("delete from __dp where __ty=2");
                            }
                        }
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException unused4) {
            r0 = sQLiteDatabase;
            f.a(f8909d);
            if (r0 != 0) {
                r0.endTransaction();
                r0 = r0;
            }
            e.a(f8909d).b();
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase isEmpty = TextUtils.isEmpty(this.k);
        try {
            if (isEmpty == 0) {
                try {
                    sQLiteDatabase = e.a(f8909d).a();
                    try {
                        sQLiteDatabase.beginTransaction();
                        sQLiteDatabase.execSQL("delete from __er where __i=\"" + this.k + "\"");
                        sQLiteDatabase.execSQL("delete from __et where __i=\"" + this.k + "\"");
                        sQLiteDatabase.setTransactionSuccessful();
                    } catch (SQLiteDatabaseCorruptException unused) {
                        f.a(f8909d);
                    } catch (Throwable unused2) {
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                    sQLiteDatabase = null;
                } catch (Throwable th) {
                    th = th;
                    isEmpty = 0;
                    if (isEmpty != 0) {
                        try {
                            isEmpty.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    e.a(f8909d).b();
                    throw th;
                }
            }
            this.k = null;
            e.a(f8909d).b();
            this.k = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a3, code lost:
    
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b0, code lost:
    
        r1.endTransaction();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(boolean z, String str) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        sQLiteDatabase2 = null;
        try {
            try {
                try {
                    this.k = str;
                    sQLiteDatabase = e.a(f8909d).a();
                } catch (Throwable unused) {
                    e.a(f8909d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
            } catch (Throwable unused3) {
                sQLiteDatabase = null;
            }
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = sQLiteDatabase2;
        }
        try {
            sQLiteDatabase.beginTransaction();
            if (!TextUtils.isEmpty(str)) {
                sQLiteDatabase.execSQL("delete from __er where __i=\"" + str + "\"");
                sQLiteDatabase.execSQL("delete from __et where __i=\"" + str + "\"");
                if (z) {
                    sQLiteDatabase.execSQL("update __sd set __b=\"" + ((Object) null) + "\" where __ii=\"" + str + "\"");
                    sQLiteDatabase.execSQL("update __sd set __a=\"" + ((Object) null) + "\" where __ii=\"" + str + "\"");
                    sQLiteDatabase2 = "=\"";
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
            f.a(f8909d);
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.endTransaction();
                sQLiteDatabase2 = sQLiteDatabase2;
            }
            e.a(f8909d).b();
        } catch (Throwable unused5) {
        }
    }

    private void i() {
        try {
            if (TextUtils.isEmpty(e)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8909d);
                String string = sharedPreferences.getString(g, null);
                if (TextUtils.isEmpty(string)) {
                    string = DeviceConfig.getDBencryptID(f8909d);
                    if (!TextUtils.isEmpty(string)) {
                        sharedPreferences.edit().putString(g, string).commit();
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    String substring = string.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (Character.isDigit(charAt)) {
                            if (Integer.parseInt(Character.toString(charAt)) == 0) {
                                sb.append(0);
                            } else {
                                sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                            }
                        } else {
                            sb.append(charAt);
                        }
                    }
                    e = sb.toString();
                }
                if (TextUtils.isEmpty(e)) {
                    return;
                }
                e += new StringBuilder(e).reverse().toString();
                String string2 = sharedPreferences.getString(h, null);
                if (TextUtils.isEmpty(string2)) {
                    sharedPreferences.edit().putString(h, a(f)).commit();
                } else {
                    if (f.equals(b(string2))) {
                        return;
                    }
                    a(true, false);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public String a(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String b(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }
}
