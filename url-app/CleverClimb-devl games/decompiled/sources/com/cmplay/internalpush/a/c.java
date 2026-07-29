package com.cmplay.internalpush.a;

import android.content.Context;
import android.text.TextUtils;
import com.cmplay.base.util.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FilterHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f4175a;

    public static String a(int i) {
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                switch (i) {
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    default:
                        switch (i) {
                            case 11:
                                break;
                            case 12:
                                break;
                            case 13:
                                break;
                            case 14:
                                break;
                            case 15:
                                break;
                            default:
                                switch (i) {
                                }
                        }
                }
        }
        return "ERROR_CODE_NO_ERROR\t\t成功";
    }

    public static boolean a(com.cmplay.internalpush.data.c cVar) {
        long currentTimeMillis = System.currentTimeMillis();
        long c2 = cVar.c() * 1000;
        long d2 = cVar.d() * 1000;
        if (c2 > 0 && currentTimeMillis < c2) {
            f4175a = 6;
            return false;
        }
        if (d2 <= 0 || currentTimeMillis <= d2) {
            return true;
        }
        f4175a = 6;
        return false;
    }

    public static boolean b(com.cmplay.internalpush.data.c cVar) {
        long currentTimeMillis = System.currentTimeMillis();
        cVar.c();
        long d2 = cVar.d() * 1000;
        if (d2 <= 0 || currentTimeMillis <= d2) {
            return true;
        }
        f4175a = 6;
        return false;
    }

    public static boolean a(com.cmplay.internalpush.data.c cVar, long j, long j2) {
        if (cVar.Y()) {
            j = j2;
        }
        long f = cVar.f() * 60 * 60 * 1000;
        if (f <= 0 || j <= 0 || System.currentTimeMillis() - j >= f) {
            return true;
        }
        f4175a = 7;
        return false;
    }

    public static boolean b(com.cmplay.internalpush.data.c cVar, long j, long j2) {
        if (j <= j2) {
            j = j2;
        }
        long f = (cVar.f() > 3 ? cVar.f() : 3L) * 60 * 60 * 1000;
        if (f <= 0 || j <= 0 || System.currentTimeMillis() - j >= f) {
            return true;
        }
        f4175a = 7;
        return false;
    }

    public static boolean a(com.cmplay.internalpush.data.c cVar, long j, long j2, int i, boolean z) {
        if (z && 2 == i) {
            return b(cVar, j, j2);
        }
        return a(cVar, j, j2);
    }

    public static boolean c(com.cmplay.internalpush.data.c cVar) {
        if (cVar.e() > 0 && cVar.u() >= cVar.e()) {
            f4175a = 5;
            return false;
        }
        if (cVar.j() <= 0 || cVar.x() < cVar.j()) {
            return true;
        }
        f4175a = 1000;
        return false;
    }

    public static boolean d(com.cmplay.internalpush.data.c cVar) {
        if (!cVar.k() || !cVar.w()) {
            return true;
        }
        f4175a = 3;
        return false;
    }

    public static boolean a(Context context, com.cmplay.internalpush.data.c cVar) {
        ArrayList<com.cmplay.base.util.b> M = cVar.M();
        if (M != null && !M.isEmpty()) {
            Iterator<com.cmplay.base.util.b> it = M.iterator();
            while (it.hasNext()) {
                com.cmplay.base.util.b next = it.next();
                if (next != null) {
                    String str = next.f3963b;
                    if (!TextUtils.isEmpty(str) && b.a(context, str)) {
                        f4175a = 1;
                        return false;
                    }
                }
            }
        } else {
            String r = cVar.r();
            if (!TextUtils.isEmpty(r) && b.a(context, r)) {
                f4175a = 1;
                return false;
            }
        }
        return true;
    }

    public static boolean e(com.cmplay.internalpush.data.c cVar) {
        if (!TextUtils.isEmpty(cVar.l()) && !TextUtils.isEmpty(cVar.m()) && new File(cVar.m()).exists()) {
            return true;
        }
        f4175a = 8;
        return false;
    }

    public static boolean f(com.cmplay.internalpush.data.c cVar) {
        if (TextUtils.isEmpty(cVar.n())) {
            return true;
        }
        if (!TextUtils.isEmpty(cVar.n()) && !TextUtils.isEmpty(cVar.p()) && new File(cVar.p()).exists()) {
            return true;
        }
        f4175a = 9;
        return false;
    }

    public static boolean g(com.cmplay.internalpush.data.c cVar) {
        if (!TextUtils.isEmpty(cVar.y()) && !TextUtils.isEmpty(cVar.z()) && new File(cVar.z()).exists()) {
            return true;
        }
        f4175a = 11;
        return false;
    }

    public static boolean h(com.cmplay.internalpush.data.c cVar) {
        if (!TextUtils.isEmpty(cVar.F()) && !TextUtils.isEmpty(cVar.G()) && new File(cVar.G()).exists()) {
            return true;
        }
        f4175a = 12;
        return false;
    }

    public static boolean a(com.cmplay.internalpush.data.c cVar, boolean z) {
        if (!z || cVar.E() != 0) {
            return true;
        }
        f4175a = 2;
        return false;
    }

    public static boolean i(com.cmplay.internalpush.data.c cVar) {
        if (!cVar.V()) {
            return true;
        }
        f4175a = 1001;
        return false;
    }

    public static boolean j(com.cmplay.internalpush.data.c cVar) {
        int a2;
        int O = cVar.O();
        if (cVar.Y()) {
            a2 = d.a("hit_top_launch_time", 0);
        } else {
            a2 = d.a("launch_time", 0);
        }
        h.a("internal_push", "checkLaunchTime  showByStartup:" + O + "  launchTime:" + a2);
        if (O <= 0 || a2 >= O) {
            return true;
        }
        f4175a = 14;
        return false;
    }

    public static boolean k(com.cmplay.internalpush.data.c cVar) {
        int W = cVar.W();
        if (!cVar.Y()) {
            return true;
        }
        int X = cVar.X();
        h.a("internal_push", "checkDayLimit  dayLimit:" + W + "  curHitTopTodayShowTime:" + X);
        if (W <= 0 || X < W) {
            return true;
        }
        f4175a = 15;
        return false;
    }
}
