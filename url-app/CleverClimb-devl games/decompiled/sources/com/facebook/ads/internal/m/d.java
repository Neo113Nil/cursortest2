package com.facebook.ads.internal.m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.m.a;
import com.facebook.ads.internal.q.a.m;
import java.util.Map;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5195a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static double f5196b;

    /* renamed from: c, reason: collision with root package name */
    private static String f5197c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f5198d;

    @SuppressLint({"StaticFieldLeak"})
    private static c h;
    private final b e;
    private final com.facebook.ads.internal.e.d f;
    private final Context g;

    private d(Context context) {
        this.g = context.getApplicationContext();
        this.f = new com.facebook.ads.internal.e.d(context);
        this.e = new b(context, new g(context, this.f));
        this.e.b();
        b(context);
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (d.class) {
            if (h == null) {
                h = new d(context.getApplicationContext());
            }
            cVar = h;
        }
        return cVar;
    }

    private void a(final a aVar) {
        if (aVar.g()) {
            this.f.a(aVar.a(), aVar.h().f5204c, aVar.i().toString(), aVar.b(), aVar.c(), aVar.d(), aVar.e(), new com.facebook.ads.internal.e.a<String>() { // from class: com.facebook.ads.internal.m.d.1
                @Override // com.facebook.ads.internal.e.a
                public void a(int i, String str) {
                    super.a(i, str);
                }

                @Override // com.facebook.ads.internal.e.a
                public void a(String str) {
                    super.a((AnonymousClass1) str);
                    if (aVar.f()) {
                        d.this.e.a();
                    } else {
                        d.this.e.b();
                    }
                }
            });
            return;
        }
        Log.e(f5195a, "Attempting to log an invalid " + aVar.i() + " event.");
    }

    private static synchronized void b(Context context) {
        synchronized (d.class) {
            if (f5198d) {
                return;
            }
            com.facebook.ads.internal.i.a.a(context).a();
            m.a();
            f5196b = m.b();
            f5197c = m.c();
            f5198d = true;
        }
    }

    @Override // com.facebook.ads.internal.m.c
    public void a(String str) {
        new com.facebook.ads.internal.q.c.e(this.g).execute(str);
    }

    @Override // com.facebook.ads.internal.m.c
    public void a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(e.IMMEDIATE).a(f.IMPRESSION).a(true).a());
    }

    @Override // com.facebook.ads.internal.m.c
    public void a(String str, Map<String, String> map, String str2, e eVar) {
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(eVar).a(f.a(str2)).a(true).a());
    }

    @Override // com.facebook.ads.internal.m.c
    public void b(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(e.IMMEDIATE).a(f.INVALIDATION).a(false).a());
    }

    @Override // com.facebook.ads.internal.m.c
    public void c(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(e.IMMEDIATE).a(f.OPEN_LINK).a(true).a());
    }

    @Override // com.facebook.ads.internal.m.c
    public void d(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(e.IMMEDIATE).a(f.VIDEO).a(true).a());
    }

    @Override // com.facebook.ads.internal.m.c
    public void e(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(e.DEFERRED).a(f.NATIVE_VIEW).a(false).a());
    }

    @Override // com.facebook.ads.internal.m.c
    public void f(String str, Map<String, String> map) {
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(e.DEFERRED).a(f.BROWSER_SESSION).a(false).a());
    }

    @Override // com.facebook.ads.internal.m.c
    public void g(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(e.IMMEDIATE).a(f.STORE).a(true).a());
    }

    @Override // com.facebook.ads.internal.m.c
    public void h(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(new a.C0347a().a(str).a(f5196b).b(f5197c).a(map).a(e.DEFERRED).a(f.CLOSE).a(true).a());
    }
}
