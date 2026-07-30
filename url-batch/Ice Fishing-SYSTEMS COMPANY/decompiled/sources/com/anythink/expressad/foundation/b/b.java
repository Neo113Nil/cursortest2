package com.anythink.expressad.foundation.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.expressad.foundation.g.f.n;
import com.anythink.expressad.foundation.h.t;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    private static final String f18667g = "SDKController";

    /* renamed from: h, reason: collision with root package name */
    private static volatile b f18668h;
    private Context i;

    /* renamed from: m, reason: collision with root package name */
    private String f18678m;

    /* renamed from: n, reason: collision with root package name */
    private int f18679n;

    /* renamed from: j, reason: collision with root package name */
    private String f18675j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f18676k = "";

    /* renamed from: l, reason: collision with root package name */
    private boolean f18677l = false;

    /* renamed from: a, reason: collision with root package name */
    public final int f18669a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f18670b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f18671c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final int f18672d = 4;

    /* renamed from: e, reason: collision with root package name */
    public final int f18673e = 5;

    /* renamed from: f, reason: collision with root package name */
    public final int f18674f = 6;

    private b() {
    }

    public static b a() {
        if (f18668h == null) {
            synchronized (b.class) {
                try {
                    if (f18668h == null) {
                        f18668h = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18668h;
    }

    private static String b() {
        return com.anythink.expressad.out.b.f20180a;
    }

    private void c() {
        a.c().b(this.f18675j);
        a.c().c(this.f18676k);
        a.c().d();
        a(this.i.getApplicationContext());
        t.a(this.i);
        this.f18677l = true;
    }

    private static void d() {
    }

    private void e() {
        a.c().b(this.f18675j);
        a.c().c(this.f18676k);
        a.c().d();
    }

    public final void a(Map map, final Context context) {
        if (context != null) {
            this.i = context.getApplicationContext();
            a.c().a(this.i);
            try {
                n.a(this.i);
            } catch (Exception unused) {
            }
            com.anythink.core.common.d.t.b().a(new Runnable() { // from class: com.anythink.expressad.foundation.b.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.expressad.foundation.h.n.j(context);
                }
            }, 300L);
            if (map != null) {
                if (map.containsKey(com.anythink.expressad.a.f17779d)) {
                    this.f18675j = (String) map.get(com.anythink.expressad.a.f17779d);
                }
                if (map.containsKey(com.anythink.expressad.a.f17780e)) {
                    this.f18676k = (String) map.get(com.anythink.expressad.a.f17780e);
                }
                a.c().b(this.f18675j);
                a.c().c(this.f18676k);
                a.c().d();
                a(this.i.getApplicationContext());
                t.a(this.i);
                this.f18677l = true;
            }
        }
    }

    private static void a(Context context) {
        String str;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(u.b.f13009f, 0);
            String str2 = "";
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(u.a.f13002y, "");
                str = sharedPreferences.getString(u.a.f13003z, "");
                str2 = string;
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(com.anythink.expressad.foundation.g.a.cs) && TextUtils.isEmpty(com.anythink.expressad.foundation.g.a.ct)) {
                com.anythink.expressad.foundation.g.a.cs = str2;
                com.anythink.expressad.foundation.g.a.ct = str;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
