package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: UMDBUtils.java */
/* loaded from: classes2.dex */
class f {
    f() {
    }

    public static boolean a(String str, SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select count(*) as c from sqlite_master where type ='table' and name ='" + str.trim() + "' ", null);
            try {
                if (rawQuery.moveToNext()) {
                    if (rawQuery.getInt(0) > 0) {
                        z = true;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Exception unused) {
                cursor = rawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                return z;
            } catch (Throwable th) {
                th = th;
                cursor = rawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return z;
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File file = new File(c.f8856a + context.getPackageName() + c.f8857b + c.f8858c);
            if (file.exists()) {
                file.delete();
            }
            d.a(context).a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String b(Context context) {
        return c.f8856a + context.getPackageName() + c.f8857b;
    }

    public static String a(List<String> list) {
        return TextUtils.join("!", list);
    }

    public static List<String> a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    public static List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
