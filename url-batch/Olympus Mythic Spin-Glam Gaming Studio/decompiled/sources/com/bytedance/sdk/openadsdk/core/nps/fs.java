package com.bytedance.sdk.openadsdk.core.nps;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class fs {
    private static final ConcurrentHashMap<String, Object> zmn = new ConcurrentHashMap<>();

    public static void zmn(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (zmn(str)) {
            try {
                zmn.zmn(context).zmn().zmn(str, (String) null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    public static long fs(Context context, String str, ContentValues contentValues) {
        long fs;
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (zmn(str)) {
                try {
                    fs = zmn.zmn(context).zmn().fs(str, null, contentValues);
                } catch (Throwable unused) {
                }
            }
            return fs;
        }
        return 0L;
    }

    public static int zmn(Context context, String str, String str2, String[] strArr) {
        int zmn2;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (zmn(str)) {
            try {
                zmn2 = zmn.zmn(context).zmn().zmn(str, str2, strArr);
            } catch (Throwable unused) {
                return 0;
            }
        }
        return zmn2;
    }

    public static int zmn(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        int zmn2;
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (zmn(str)) {
                try {
                    zmn2 = zmn.zmn(context).zmn().zmn(str, contentValues, str2, strArr);
                } catch (Throwable unused) {
                }
            }
            return zmn2;
        }
        return 0;
    }

    public static Map<String, List<String>> zmn(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Map<String, List<String>> zmn2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (zmn(str)) {
            try {
                zmn2 = zmn(zmn.zmn(context).zmn().zmn(str, strArr, str2, strArr2, str3, str4, str5));
            } catch (Throwable unused) {
                return null;
            }
        }
        return zmn2;
    }

    public static Map<String, List<String>> zmn(Cursor cursor) {
        HashMap hashMap = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new LinkedList());
                        }
                        ((List) hashMap.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
            } catch (Throwable unused) {
            }
            cursor.close();
        }
        return hashMap;
    }

    private static Object zmn(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = zmn;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (fs.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
