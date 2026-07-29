package com.cmplay.internalpush.a;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.cmplay.base.util.h;
import com.cmplay.base.util.p;
import com.cmplay.base.util.q;
import com.cmplay.base.util.t;
import com.cmplay.base.util.z;
import com.cmplay.internalpush.k;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: CommonUtil.java */
/* loaded from: classes.dex */
public class b {
    public static boolean a(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = q.a(str + str2);
        if (a2 == null) {
            a2 = "";
        }
        return a2 + "_" + str.substring(str.lastIndexOf("/") + 1, str.length());
    }

    public static void a(Context context, com.cmplay.internalpush.data.d dVar, z zVar) {
        if (a(context, dVar)) {
            return;
        }
        int g = dVar.g();
        String f = dVar.f();
        String b2 = dVar.b();
        if (1 == g) {
            p.a(context, f, b2, zVar);
            return;
        }
        if (2 == g && k.a() != null) {
            if (k.a().a(f)) {
                return;
            }
            p.d(context, f);
        } else {
            if (3 == g) {
                com.cmplay.base.util.a.a.a(context).a(f, dVar.d());
                return;
            }
            if (4 == g && k.a() != null) {
                k.a().b(f);
            } else {
                if (6 == g) {
                    if (p.a(context, dVar.i())) {
                        return;
                    }
                    p.d(context, f);
                    return;
                }
                p.d(context, f);
            }
        }
    }

    public static boolean a(Context context, com.cmplay.internalpush.data.d dVar) {
        if (dVar == null || dVar.g() == 4 || dVar.g() == 2) {
            h.a("internal_push", "CommonUtil.openInnerPushAppIfInstalled  jumpType:" + dVar.g() + "    return false");
            return false;
        }
        ArrayList<com.cmplay.base.util.b> i = dVar.i();
        if (i != null && !i.isEmpty()) {
            Iterator<com.cmplay.base.util.b> it = i.iterator();
            while (it.hasNext()) {
                com.cmplay.base.util.b next = it.next();
                if (next != null) {
                    String str = next.f3963b;
                    if (!TextUtils.isEmpty(str) && a(context, str)) {
                        h.a("internal_push", "CommonUtil.openInnerPushAppIfInstalled  1    PackageUtils.openApp");
                        t.d(context, str);
                        return true;
                    }
                }
            }
        } else {
            String e = dVar.e();
            if (!TextUtils.isEmpty(e) && a(context, e)) {
                h.a("internal_push", "CommonUtil.openInnerPushAppIfInstalled  2    PackageUtils.openApp");
                t.d(context, e);
                return true;
            }
        }
        return false;
    }

    public static long a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long a() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    public static boolean a(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
    }
}
