package com.anythink.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.f;
import com.anythink.core.common.h.g;
import com.anythink.core.common.h.k;
import com.anythink.core.common.v.af;
import com.anythink.core.d.l;
import com.google.android.gms.internal.ads.CL;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static volatile c f11734d;

    /* renamed from: a, reason: collision with root package name */
    final String f11735a = "c";

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, g> f11736b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, g> f11737c = new ConcurrentHashMap<>();

    public static c a() {
        if (f11734d == null) {
            synchronized (c.class) {
                try {
                    if (f11734d == null) {
                        f11734d = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11734d;
    }

    public static void b(Context context, String str, l lVar) {
        if (context == null || lVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        b.a(context).a(lVar.aE(), lVar.aF(), str, lVar.aq());
    }

    private static void c(Context context, bv bvVar, String str) {
        if (context == null || bvVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        b.a(context).d(bvVar);
    }

    public static void b(Context context, bv bvVar, String str) {
        if (context == null || bvVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        b.a(context).a(bvVar);
    }

    public static int a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            int a9 = b.a(context).a(str);
            int i = b.f11704n;
            return a9 != i ? a9 : i;
        }
        return b.f11704n;
    }

    public static void b(Context context, bv bvVar) {
        if (context == null || bvVar == null) {
            return;
        }
        b.a(context).c(bvVar);
    }

    public final int a(Context context, String str, l lVar) {
        if (context != null && lVar != null && !TextUtils.isEmpty(str)) {
            int aE = lVar.aE();
            long aF = lVar.aF();
            int a9 = b.a(context).a(aE, aF, str);
            if (a9 != b.f11704n) {
                return a9;
            }
            if (t.b().v() || !a(context, aE, aF, u.b.f13006c, a(str, ""), this.f11736b, str, 0)) {
                return b.f11704n;
            }
            return 8;
        }
        return b.f11704n;
    }

    public final int a(Context context, bv bvVar, String str, int i) {
        if (context != null && bvVar != null && !TextUtils.isEmpty(str)) {
            int bn = bvVar.bn();
            long bo = bvVar.bo();
            String z8 = bvVar.z();
            String a9 = a(str, z8);
            int a10 = b.a(context).a(bn, bo, bvVar.g(), z8, String.valueOf(i));
            if (a10 != b.f11704n) {
                return a10;
            }
            if (t.b().v() || !a(context, bn, bo, u.b.f13006c, a9, this.f11737c, z8, 1)) {
                return b.f11704n;
            }
            return 18;
        }
        return b.f11704n;
    }

    public static void a(Context context, bv bvVar, String str) {
        if (context == null || bvVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            b.a(context).d(bvVar);
        }
        int bn = bvVar.bn();
        long bo = bvVar.bo();
        String z8 = bvVar.z();
        b.a(context).b(bn, bo, bvVar.g(), z8, String.valueOf(bvVar.bf()));
    }

    private static String a(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : CL.k(str, "_", str2);
    }

    private static boolean a(Context context, int i, long j9, String str, String str2, ConcurrentHashMap<String, g> concurrentHashMap, String str3, int i4) {
        ConcurrentHashMap<String, f> concurrentHashMap2;
        f fVar;
        int i9;
        f fVar2;
        boolean z8 = false;
        if (i > 0 && j9 > 0 && concurrentHashMap != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            g gVar = concurrentHashMap.get(str2);
            if (gVar == null) {
                gVar = new g();
                String c4 = af.c(context, str, str2, "");
                if (!TextUtils.isEmpty(c4)) {
                    gVar.a(c4);
                }
                concurrentHashMap.put(str2, gVar);
            }
            int i10 = gVar.f14116a;
            long j10 = gVar.f14117b;
            long currentTimeMillis = System.currentTimeMillis();
            if (i4 == 0) {
                ConcurrentHashMap<String, f> concurrentHashMap3 = b.a(t.b().g()).f11709c;
                if (concurrentHashMap3 != null && !TextUtils.isEmpty(str3) && (fVar2 = concurrentHashMap3.get(str3)) != null && currentTimeMillis - j10 <= j9 && currentTimeMillis - fVar2.i() <= j9) {
                    i9 = fVar2.f14101a;
                    i10 += i9;
                }
                if (i10 >= i && System.currentTimeMillis() - j10 <= j9) {
                    z8 = true;
                }
                gVar.toString();
            } else {
                if (i4 == 1 && (concurrentHashMap2 = b.a(t.b().g()).f11712f) != null && !TextUtils.isEmpty(str3) && (fVar = concurrentHashMap2.get(str3)) != null && currentTimeMillis - j10 <= j9 && currentTimeMillis - fVar.i() <= j9) {
                    i9 = fVar.f14101a;
                    i10 += i9;
                }
                if (i10 >= i) {
                    z8 = true;
                }
                gVar.toString();
            }
        }
        return z8;
    }

    private static void a(Context context, int i, long j9, String str, String str2, ConcurrentHashMap<String, g> concurrentHashMap) {
        if (i <= 0 || j9 <= 0 || concurrentHashMap == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        g gVar = concurrentHashMap.get(str2);
        if (gVar == null) {
            String c4 = af.c(context, str, str2, "");
            g gVar2 = new g();
            if (!TextUtils.isEmpty(c4)) {
                gVar2.a(c4);
            }
            concurrentHashMap.put(str2, gVar2);
            gVar = gVar2;
        }
        if (System.currentTimeMillis() - gVar.f14117b > j9) {
            gVar.f14117b = System.currentTimeMillis();
            gVar.f14116a = 0;
        }
        gVar.f14116a++;
        gVar.toString();
        af.b(context, str, str2, gVar.toString());
    }

    public static k a(Context context, bv bvVar) {
        if (context == null || bvVar == null) {
            return null;
        }
        return b.a(context).b(bvVar);
    }
}
