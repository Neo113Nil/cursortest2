package com.bytedance.sdk.openadsdk.multipro.pvs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.sUS;
import com.bytedance.sdk.openadsdk.core.NB;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.multipro.Jd;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DBMultiAdapter.java */
/* loaded from: classes2.dex */
public class pvs {
    private static final ConcurrentHashMap<String, Object> icD = new ConcurrentHashMap<>();
    public static sUS pvs;

    public static sUS pvs(Context context) {
        if (context == null) {
            try {
                mnm.pvs();
            } catch (Throwable unused) {
                jlb.so("binder error");
            }
        }
        if (pvs == null) {
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                pvs = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.sUS.pvs(com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs().pvs(5));
            } else {
                pvs = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.sUS.icD();
            }
        }
        return pvs;
    }

    private static String pvs() {
        return Jd.icD + "/t_db/ttopensdk.db/";
    }

    public static void pvs(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (pvs(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                NB.pvs(context).pvs().pvs(str, (String) null, contentValues);
                return;
            }
            sUS pvs2 = pvs(context);
            if (pvs2 != null) {
                pvs2.pvs(Uri.parse(pvs() + str), contentValues);
            }
        }
    }

    public static int pvs(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (pvs(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                return NB.pvs(context).pvs().pvs(str, str2, strArr);
            }
            sUS pvs2 = pvs(context);
            if (pvs2 != null) {
                return pvs2.pvs(Uri.parse(pvs() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int pvs(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (pvs(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                    return NB.pvs(context).pvs().pvs(str, contentValues, str2, strArr);
                }
                sUS pvs2 = pvs(context);
                if (pvs2 != null) {
                    return pvs2.pvs(Uri.parse(pvs() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> pvs(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (pvs(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                return pvs(NB.pvs(context).pvs().pvs(str, strArr, str2, strArr2, str3, str4, str5));
            }
            sUS pvs2 = pvs(context);
            if (pvs2 != null) {
                return pvs2.pvs(Uri.parse(pvs() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r6 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, List<String>> pvs(Cursor cursor) {
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
        }
        return hashMap;
    }

    private static Object pvs(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = icD;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (pvs.class) {
            obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = new Object();
                concurrentHashMap.put(str, obj);
            }
        }
        return obj;
    }
}
