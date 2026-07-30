package com.baidu.sec.privacy.b;

import android.content.Context;
import com.baidu.sec.privacy.c;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f10623a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f10624b;

    /* renamed from: c, reason: collision with root package name */
    public static com.baidu.sec.privacy.a f10625c;

    /* renamed from: d, reason: collision with root package name */
    public static c f10626d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f10627e;

    public static Context a() {
        return f10623a;
    }

    public static com.baidu.sec.privacy.a b() {
        return f10625c;
    }

    public static c c() {
        return f10626d;
    }

    public static boolean d() {
        return f10627e;
    }

    public static void a(Context context, String str, com.baidu.sec.privacy.a aVar) {
        f10625c = aVar;
        a(context, str);
    }

    public static void a(Context context, String str) {
        if (f10624b) {
            return;
        }
        try {
            f10627e = false;
            a(context, str, false, null);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
        }
    }

    public static void a(Context context, String str, boolean z7, c cVar) {
        if (f10624b) {
            return;
        }
        try {
            f10624b = true;
            f10623a = context.getApplicationContext();
            f10626d = cVar;
            f10627e = z7;
            com.baidu.sec.privacy.d.b.a(str, z7, cVar);
            com.baidu.sec.privacy.d.a.b(str);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
        }
    }

    public static a a(Context context) {
        return com.baidu.sec.privacy.e.a.a(context);
    }

    public static void a(boolean z7) {
        try {
            com.baidu.sec.privacy.f.c.a(z7);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
        }
    }
}
