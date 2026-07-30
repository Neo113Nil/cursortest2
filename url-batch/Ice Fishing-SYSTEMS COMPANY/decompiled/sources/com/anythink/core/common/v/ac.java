package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.u;
import java.io.File;

/* loaded from: classes.dex */
public class ac {

    /* renamed from: f, reason: collision with root package name */
    private static volatile ac f16784f;

    /* renamed from: k, reason: collision with root package name */
    private volatile String f16793k;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f16794l;

    /* renamed from: m, reason: collision with root package name */
    private volatile String f16795m;

    /* renamed from: n, reason: collision with root package name */
    private volatile String f16796n;

    /* renamed from: p, reason: collision with root package name */
    private File f16798p;

    /* renamed from: e, reason: collision with root package name */
    private final String f16789e = "ac";

    /* renamed from: g, reason: collision with root package name */
    private final String f16790g = k.b("aHR0cHM6Ly9kMnExeTd0aXIyODF4Ni5jbG91ZGZyb250Lm5ldC9vbXNkay9vbXNka192MS41LjIuanM=");

    /* renamed from: h, reason: collision with root package name */
    private final String f16791h = k.b("aHR0cHM6Ly9kMnExeTd0aXIyODF4Ni5jbG91ZGZyb250Lm5ldC9vbXNkay9vbXNka193ZWJ2aWV3X2luamVjdGlvbl9jb250ZW50LnR4dA==");
    private final String i = "omsdk_sdk_js.txt";

    /* renamed from: j, reason: collision with root package name */
    private final String f16792j = "omsdk_webview_injection_content.txt";

    /* renamed from: o, reason: collision with root package name */
    private final String f16797o = "anythink_omsdk/";

    /* renamed from: a, reason: collision with root package name */
    boolean f16785a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f16786b = false;

    /* renamed from: c, reason: collision with root package name */
    final String f16787c = "omsdk_sdk_js_url";

    /* renamed from: d, reason: collision with root package name */
    final String f16788d = "omsdk_webview_injection_content_url";

    /* renamed from: q, reason: collision with root package name */
    private final Object f16799q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private String f16800r = "";

    /* renamed from: s, reason: collision with root package name */
    private String f16801s = "";

    /* renamed from: t, reason: collision with root package name */
    private String f16802t = "";

    /* renamed from: u, reason: collision with root package name */
    private String f16803u = "";

    /* renamed from: com.anythink.core.common.v.ac$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16810a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16811b;

        public AnonymousClass4(String str, String str2) {
            this.f16810a = str;
            this.f16811b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (ac.this.f16799q) {
                try {
                    if (!ac.this.f16798p.exists()) {
                        ac.this.f16798p.mkdirs();
                    }
                    File file = new File(ac.this.f16798p, this.f16810a);
                    if (file.exists()) {
                        file.delete();
                    }
                    w.a(this.f16811b.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static boolean d() {
        return com.anythink.basead.b.c.i.l().b(com.anythink.core.common.d.t.b().p()).aK() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f(Context context) {
        if (context == null) {
            try {
                context = com.anythink.core.common.d.t.b().g();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16800r = af.c(context, u.b.f13004a, "omsdk_sdk_js_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g(Context context) {
        if (context == null) {
            try {
                context = com.anythink.core.common.d.t.b().g();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16802t = af.c(context, u.b.f13004a, "omsdk_webview_injection_content_url", "");
    }

    public final void c(final Context context) {
        if (b(context)) {
            this.f16785a = true;
            try {
                new com.anythink.core.common.m.h(this.f16793k).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.ac.2
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        ac.this.f16785a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str, AdError adError) {
                        ac acVar = ac.this;
                        acVar.f16801s = acVar.f16793k;
                        ac acVar2 = ac.this;
                        acVar2.f16785a = false;
                        com.anythink.core.common.u.e.a(1, acVar2.f16793k, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = ac.this.f16789e;
                        String unused2 = ac.this.f16793k;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            ac acVar = ac.this;
                            acVar.a(context, acVar.f16793k);
                            ac.this.f16794l = obj2;
                            ac.a(ac.this, obj2, "omsdk_sdk_js.txt");
                        }
                        ac.this.f16785a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f16785a = false;
            }
        }
    }

    public final void e(final Context context) {
        if (d(context)) {
            this.f16786b = true;
            try {
                new com.anythink.core.common.m.h(this.f16795m).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.ac.3
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        ac.this.f16786b = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str, AdError adError) {
                        ac acVar = ac.this;
                        acVar.f16803u = acVar.f16795m;
                        ac acVar2 = ac.this;
                        acVar2.f16786b = false;
                        com.anythink.core.common.u.e.a(2, acVar2.f16795m, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = ac.this.f16789e;
                        String unused2 = ac.this.f16795m;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            ac acVar = ac.this;
                            acVar.b(context, acVar.f16795m);
                            ac.this.f16796n = obj2;
                            ac.a(ac.this, obj2, "omsdk_webview_injection_content.txt");
                        }
                        ac.this.f16786b = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f16786b = false;
            }
        }
    }

    private synchronized String f() {
        return this.f16802t;
    }

    public static ac a() {
        if (f16784f == null) {
            synchronized (ac.class) {
                try {
                    if (f16784f == null) {
                        f16784f = new ac();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16784f;
    }

    public final boolean b(Context context) {
        boolean z8;
        String str;
        if (this.f16785a) {
            return false;
        }
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(context));
        if (k6 != null && !k6.S()) {
            z8 = d();
        } else {
            com.anythink.core.common.d.t.b();
            z8 = true;
        }
        if (!z8) {
            return false;
        }
        if (k6 != null && !k6.S()) {
            str = k6.aM();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f16790g;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f16801s, str)) {
            return false;
        }
        String e6 = e();
        if (!TextUtils.isEmpty(e6) && TextUtils.equals(e6, str)) {
            if (TextUtils.isEmpty(this.f16794l)) {
                this.f16794l = a("omsdk_sdk_js.txt");
            }
            return false;
        }
        this.f16793k = str;
        return true;
    }

    private synchronized String e() {
        return this.f16800r;
    }

    public final String c() {
        if (!d()) {
            return "";
        }
        return this.f16796n;
    }

    public final boolean d(Context context) {
        boolean z8;
        String str;
        if (this.f16786b) {
            return false;
        }
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(context));
        if (k6 != null && !k6.S()) {
            z8 = d();
        } else {
            com.anythink.core.common.d.t.b();
            z8 = true;
        }
        if (!z8) {
            return false;
        }
        if (k6 != null && !k6.S()) {
            str = k6.aL();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f16791h;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f16803u, str)) {
            return false;
        }
        String f6 = f();
        if (!TextUtils.isEmpty(f6) && TextUtils.equals(f6, str)) {
            if (TextUtils.isEmpty(this.f16796n)) {
                this.f16796n = a("omsdk_webview_injection_content.txt");
            }
            return false;
        }
        this.f16795m = str;
        return true;
    }

    public final void a(final Context context) {
        try {
            this.f16798p = new File(com.anythink.core.common.d.t.b().g().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/anythink_omsdk/");
        } catch (Throwable unused) {
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.ac.1
            @Override // java.lang.Runnable
            public final void run() {
                ac.this.f(context);
                ac.this.g(context);
                ac acVar = ac.this;
                acVar.f16794l = acVar.a("omsdk_sdk_js.txt");
                ac acVar2 = ac.this;
                acVar2.f16796n = acVar2.a("omsdk_webview_injection_content.txt");
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String a(String str) {
        String str2;
        synchronized (this.f16799q) {
            str2 = "";
            try {
                File file = new File(this.f16798p, str);
                if (file.exists() && file.canRead()) {
                    str2 = w.a(file);
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    private void a(String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass4(str2, str), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, String str) {
        this.f16800r = str;
        af.b(context, u.b.f13004a, "omsdk_sdk_js_url", str);
    }

    public final String b() {
        if (!d()) {
            return "";
        }
        return this.f16794l;
    }

    public static /* synthetic */ void a(ac acVar, String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(acVar.new AnonymousClass4(str2, str), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(Context context, String str) {
        this.f16802t = str;
        af.b(context, u.b.f13004a, "omsdk_webview_injection_content_url", str);
    }
}
