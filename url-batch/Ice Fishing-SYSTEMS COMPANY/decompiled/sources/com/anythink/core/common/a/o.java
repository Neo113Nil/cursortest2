package com.anythink.core.common.a;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.q;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.C4782a;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private static volatile o f12360b;

    /* renamed from: f, reason: collision with root package name */
    private long f12365f;

    /* renamed from: a, reason: collision with root package name */
    final String f12361a = C4782a.PUSH_MINIFIED_BUTTONS_LIST;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f12364e = false;

    /* renamed from: g, reason: collision with root package name */
    private long f12366g = 0;

    /* renamed from: c, reason: collision with root package name */
    private q f12362c = q.a(com.anythink.core.common.e.e.a(t.b().g()));

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Integer> f12363d = new HashMap();

    /* renamed from: com.anythink.core.common.a.o$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f12368a;

        public AnonymousClass2(n nVar) {
            this.f12368a = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                File file = new File(this.f12368a.b());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            o.this.f12362c.c(this.f12368a.a());
        }
    }

    private o() {
        this.f12365f = 209715200L;
        this.f12365f = t.b().d(4);
    }

    public final void e() {
        this.f12365f = t.b().d(4);
    }

    public final void b() {
        if (this.f12364e) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.o.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    o.this.f12364e = true;
                    new ArrayList();
                    o oVar = o.this;
                    oVar.f12366g = oVar.f12362c.a();
                    long unused = o.this.f12366g;
                    long unused2 = o.this.f12365f;
                    long unused3 = o.this.f12366g;
                    long unused4 = o.this.f12365f;
                    if (o.this.f12366g > o.this.f12365f) {
                        List<n> b9 = o.this.f12362c.b();
                        b9.size();
                        for (n nVar : b9) {
                            try {
                                File file = new File(nVar.b());
                                if (file.exists()) {
                                    file.delete();
                                }
                            } catch (Throwable unused5) {
                            }
                            try {
                                if (!TextUtils.isEmpty(nVar.a())) {
                                    String a9 = nVar.a();
                                    o.this.f12363d.remove(a9);
                                    com.anythink.core.common.res.b.c.a().b(a9);
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                } catch (Throwable unused7) {
                }
                o.this.f12364e = false;
            }
        }, 13);
    }

    public final long c() {
        return this.f12365f;
    }

    public final long d() {
        return this.f12366g;
    }

    public static o a() {
        if (f12360b == null) {
            synchronized (o.class) {
                try {
                    if (f12360b == null) {
                        f12360b = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12360b;
    }

    private synchronized int b(String str) {
        if (this.f12363d.containsKey(str) && this.f12363d.get(str) != null) {
            return this.f12363d.get(str).intValue();
        }
        n a9 = this.f12362c.a(str);
        if (a9 == null || a9.c() <= 0) {
            return 0;
        }
        File file = new File(a9.b());
        if (file.exists() && file.length() >= a9.e()) {
            this.f12363d.put(str, Integer.valueOf(a9.c()));
            this.f12362c.b(str);
            return a9.c();
        }
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass2(a9), 2);
        return 0;
    }

    private void a(n nVar) {
        if (nVar == null) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass2(nVar), 2);
    }

    public final void a(String str, String str2, long j9, long j10, int i, boolean z8) {
        this.f12363d.put(str, Integer.valueOf(i));
        if (z8) {
            a(str, str2, j9, j10, i);
        }
    }

    public final void a(final String str, final String str2, final long j9, final long j10, final int i) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.o.3
            @Override // java.lang.Runnable
            public final void run() {
                o.this.f12362c.a(str, str2, j9, j10, i);
            }
        }, 13);
    }

    public final n a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12362c.a(str);
    }

    public final synchronized boolean a(String str, int i) {
        return b(str) >= i;
    }
}
