package com.anythink.expressad.videocommon.a;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.videocommon.e.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22365a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f22366b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final String f22367c = "com.anythink.expressad.videocommon.a.a";

    /* renamed from: d, reason: collision with root package name */
    private static a f22368d;

    private a() {
        try {
            t.b().g();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static a a() {
        if (f22368d == null) {
            synchronized (a.class) {
                try {
                    if (f22368d == null) {
                        f22368d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22368d;
    }

    private static void b() {
    }

    private static void c() {
    }

    private static void d() {
    }

    private static void e() {
    }

    private static void f() {
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextUtils.isEmpty(str2);
    }

    public static boolean a(d dVar) {
        try {
            com.anythink.expressad.videocommon.e.a b9 = c.a().b();
            long c4 = b9 != null ? b9.c() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            if (dVar != null) {
                long o9 = dVar.o() * 1000;
                long bo = currentTimeMillis - dVar.bo();
                if (o9 > 0 && o9 >= bo) {
                    return false;
                }
                if (o9 <= 0 && c4 >= bo) {
                    return false;
                }
            }
            return true;
        } catch (Exception e6) {
            e6.printStackTrace();
            return true;
        }
    }

    public static List<d> a(List<d> list) {
        ArrayList arrayList = null;
        if (list != null) {
            try {
                com.anythink.expressad.videocommon.e.a b9 = c.a().b();
                long c4 = b9 != null ? b9.c() : 0L;
                long currentTimeMillis = System.currentTimeMillis();
                if (list.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (d dVar : list) {
                            if (dVar != null) {
                                long o9 = dVar.o() * 1000;
                                long bo = currentTimeMillis - dVar.bo();
                                if ((o9 > 0 && o9 >= bo) || (o9 <= 0 && c4 >= bo)) {
                                    arrayList2.add(dVar);
                                }
                            }
                        }
                        return arrayList2;
                    } catch (Exception e6) {
                        e = e6;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        return arrayList;
                    }
                }
            } catch (Exception e9) {
                e = e9;
            }
        }
        return arrayList;
    }
}
