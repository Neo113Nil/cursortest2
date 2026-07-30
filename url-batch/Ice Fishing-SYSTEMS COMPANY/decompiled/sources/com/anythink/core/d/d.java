package com.anythink.core.d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bs;
import com.anythink.core.common.h.v;
import com.anythink.core.common.res.b;
import com.anythink.core.common.v.af;
import com.anythink.core.common.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17405a = "d";

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f17406c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f17407d;

    /* renamed from: e, reason: collision with root package name */
    private Context f17409e;

    /* renamed from: g, reason: collision with root package name */
    private Object f17411g = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f17410f = false;

    /* renamed from: b, reason: collision with root package name */
    List<a> f17408b = Collections.synchronizedList(new ArrayList(3));

    /* renamed from: h, reason: collision with root package name */
    private String f17412h = u.a.f12987j;
    private final r i = new r();

    /* renamed from: j, reason: collision with root package name */
    private final c f17413j = new c();

    /* renamed from: com.anythink.core.d.d$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.c.b.a().a(d.f17407d.u(), d.f17407d.aD(), d.f17407d.aE(), d.f17407d.aJ());
            com.anythink.core.common.o.e.a().a(d.f17407d);
        }
    }

    public interface a {
        void a();

        void b();
    }

    private d(Context context) {
        this.f17409e = context;
    }

    public static b a() {
        return com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
    }

    public static /* synthetic */ boolean b(d dVar) {
        dVar.f17410f = false;
        return false;
    }

    private Context e() {
        return this.f17409e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (this.f17411g) {
            try {
                Iterator<a> it = this.f17408b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.f17408b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean g() {
        return this.f17410f;
    }

    private static void h() {
    }

    private void b(Context context) {
        this.f17409e = context;
    }

    private b c(Context context) {
        r rVar;
        b bVar = new b();
        bVar.f17327b = true;
        bVar.ag();
        bVar.c("0");
        bVar.a(0L);
        bVar.al();
        bVar.ao();
        bVar.aq();
        bVar.d("");
        bVar.at();
        bVar.av();
        bVar.e("");
        bVar.ae();
        bVar.W();
        bVar.O();
        bVar.Q();
        bVar.b("[\"com.anythink\"]");
        bVar.K();
        bVar.w();
        bVar.b();
        bVar.s();
        if (context != null && (rVar = this.i) != null) {
            b b9 = rVar.b(com.anythink.core.common.d.t.b().p());
            Thread.currentThread().getId();
            Thread.currentThread().getName();
            if (b9 != null) {
                bVar.a(b9.h());
            }
        }
        return bVar;
    }

    private void b(a aVar) {
        synchronized (this.f17411g) {
            if (aVar != null) {
                try {
                    this.f17408b.remove(aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final b b(String str) {
        r rVar;
        if (f17407d == null) {
            synchronized (this) {
                try {
                    if (f17407d == null) {
                        try {
                            if (this.f17409e == null) {
                                this.f17409e = com.anythink.core.common.d.t.b().g();
                            }
                            f17407d = a(this.f17409e, str);
                        } catch (Throwable unused) {
                        }
                        if (f17407d == null) {
                            Context context = this.f17409e;
                            b bVar = new b();
                            bVar.f17327b = true;
                            bVar.ag();
                            bVar.c("0");
                            bVar.a(0L);
                            bVar.al();
                            bVar.ao();
                            bVar.aq();
                            bVar.d("");
                            bVar.at();
                            bVar.av();
                            bVar.e("");
                            bVar.ae();
                            bVar.W();
                            bVar.O();
                            bVar.Q();
                            bVar.b("[\"com.anythink\"]");
                            bVar.K();
                            bVar.w();
                            bVar.b();
                            bVar.s();
                            if (context != null && (rVar = this.i) != null) {
                                b b9 = rVar.b(com.anythink.core.common.d.t.b().p());
                                Thread.currentThread().getId();
                                Thread.currentThread().getName();
                                if (b9 != null) {
                                    bVar.a(b9.h());
                                }
                            }
                            f17407d = bVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17407d;
    }

    public static d a(Context context) {
        if (f17406c == null) {
            synchronized (d.class) {
                try {
                    if (f17406c == null) {
                        f17406c = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17406c;
    }

    private void a(a aVar) {
        synchronized (this.f17411g) {
            try {
                if (this.f17411g != null) {
                    this.f17408b.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str) {
        boolean z8;
        Map<String, Object> map;
        boolean z9;
        b b9 = b(str);
        if (b9 != null) {
            j d2 = b9.d();
            long af = b9.af();
            long currentTimeMillis = System.currentTimeMillis();
            boolean z10 = b9.X() + af <= currentTimeMillis;
            if (d2 != null) {
                if (d2.a() + b9.X() <= currentTimeMillis) {
                    z8 = true;
                    map = b9.f17328c;
                    Map<String, Object> m8 = com.anythink.core.common.d.t.b().m();
                    if (map == null) {
                        z9 = !map.equals(m8);
                    } else {
                        z9 = m8 != null;
                    }
                    if (z10 && !z8 && !z9) {
                        return false;
                    }
                }
            }
            z8 = false;
            map = b9.f17328c;
            Map<String, Object> m82 = com.anythink.core.common.d.t.b().m();
            if (map == null) {
            }
            if (z10) {
            }
        }
        return true;
    }

    public final void c() {
        com.anythink.core.common.d.t b9 = com.anythink.core.common.d.t.b();
        final String p6 = b9.p();
        String q6 = b9.q();
        final Context context = this.f17409e;
        if (context == null || TextUtils.isEmpty(p6) || TextUtils.isEmpty(q6)) {
            return;
        }
        b b10 = b(p6);
        Map<String, String> hashMap = new HashMap<>();
        if (!b10.f17327b) {
            hashMap = b10.bb();
        }
        v vVar = new v(p6, q6);
        vVar.a(hashMap);
        c.b(context, vVar, new com.anythink.core.common.m.q() { // from class: com.anythink.core.d.d.3
            @Override // com.anythink.core.common.m.q
            public final void onLoadCanceled(int i) {
                d.this.f();
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i, String str, AdError adError) {
                d.this.f();
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i, Object obj) {
                d.a(d.this, context, obj, p6);
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadStart(int i) {
            }
        });
    }

    private b a(Context context, String str) {
        bs bsVar;
        List<bs> a9 = com.anythink.core.common.e.f.a(com.anythink.core.common.e.e.a(context)).a(str, this.f17412h);
        if (a9 != null && a9.size() > 0 && (bsVar = a9.get(0)) != null) {
            try {
                b a10 = b.a(new JSONObject(bsVar.d()));
                if (a10 != null) {
                    a10.a(Long.parseLong(bsVar.a()));
                }
                return a10;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private b a(final Context context, final String str, final JSONObject jSONObject) {
        try {
            b b9 = a(context).b(str);
            if (!b9.S()) {
                b9.a(jSONObject, null);
            }
        } catch (Throwable unused) {
        }
        final b a9 = b.a(jSONObject);
        a9.a(System.currentTimeMillis());
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.d.d.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.e.f.a(com.anythink.core.common.e.e.a(context)).a(str, jSONObject.toString(), d.this.f17412h);
                af.a(context, u.b.f13004a, u.a.f13000w, a9.ak());
            }
        });
        return a9;
    }

    public final void c(String str) {
        r rVar = this.i;
        if (rVar != null) {
            rVar.a(str);
        }
    }

    public static long b() {
        if (f17407d == null || f17407d.V() == 0) {
            return 204800L;
        }
        return f17407d.V();
    }

    public final synchronized void a(final String str, String str2) {
        try {
            if (this.f17410f) {
                return;
            }
            this.f17410f = true;
            v vVar = new v(str, str2);
            vVar.f();
            if (f17407d != null) {
                vVar.a(f17407d.bb());
            }
            this.f17413j.a(this.f17409e, vVar, new com.anythink.core.common.m.q() { // from class: com.anythink.core.d.d.2
                @Override // com.anythink.core.common.m.q
                public final void onLoadCanceled(int i) {
                    d.b(d.this);
                    d.this.f();
                }

                @Override // com.anythink.core.common.m.q
                public final void onLoadError(int i, String str3, AdError adError) {
                    d.b(d.this);
                    d.this.f();
                }

                @Override // com.anythink.core.common.m.q
                public final void onLoadFinish(int i, Object obj) {
                    d.b(d.this);
                    d dVar = d.this;
                    d.a(dVar, dVar.f17409e, obj, str);
                }

                @Override // com.anythink.core.common.m.q
                public final void onLoadStart(int i) {
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void a(Context context, b bVar) {
        if (bVar == null) {
            return;
        }
        String z8 = bVar.z();
        if (TextUtils.isEmpty(z8)) {
            return;
        }
        com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, z8), (b.a) null);
    }

    private void a(JSONObject jSONObject) {
        JSONObject aV;
        try {
            b b9 = b(com.anythink.core.common.d.t.b().p());
            if (b9 == null || (aV = b9.aV()) == null) {
                return;
            }
            jSONObject.put("a_c", aV);
        } catch (Exception unused) {
        }
    }

    private void a(Context context, Object obj, String str) {
        if (obj instanceof JSONObject) {
            b a9 = a(context, str, (JSONObject) obj);
            if (a9 != null) {
                f17407d = a9;
                String E8 = a9.E();
                if (!TextUtils.isEmpty(E8) && TextUtils.isEmpty(com.anythink.core.common.d.t.b().C())) {
                    com.anythink.core.common.d.t.b().j(E8);
                }
                com.anythink.core.common.q.a(context).a(f17407d);
                b bVar = f17407d;
                if (bVar != null) {
                    String z8 = bVar.z();
                    if (!TextUtils.isEmpty(z8)) {
                        com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, z8), (b.a) null);
                    }
                }
                com.anythink.core.common.v.b.b.a().a(new AnonymousClass4());
                w.a().a(f17407d.h());
                com.anythink.core.common.c.a().b(f17407d.j());
                com.anythink.core.common.a.o.a().e();
                com.anythink.core.common.d.t.b();
                com.anythink.core.a.b.a(context.getApplicationContext()).a(a9.aI());
                com.anythink.core.common.d.t.b().H();
                com.anythink.core.common.d.t.b().a(a9);
                com.anythink.core.common.v.e.a().a(a9.g());
                com.anythink.core.common.b.a.a().a(a9);
            }
            f();
        }
    }

    public static /* synthetic */ void a(d dVar, Context context, Object obj, String str) {
        if (obj instanceof JSONObject) {
            b a9 = dVar.a(context, str, (JSONObject) obj);
            if (a9 != null) {
                f17407d = a9;
                String E8 = a9.E();
                if (!TextUtils.isEmpty(E8) && TextUtils.isEmpty(com.anythink.core.common.d.t.b().C())) {
                    com.anythink.core.common.d.t.b().j(E8);
                }
                com.anythink.core.common.q.a(context).a(f17407d);
                b bVar = f17407d;
                if (bVar != null) {
                    String z8 = bVar.z();
                    if (!TextUtils.isEmpty(z8)) {
                        com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, z8), (b.a) null);
                    }
                }
                com.anythink.core.common.v.b.b.a().a(dVar.new AnonymousClass4());
                w.a().a(f17407d.h());
                com.anythink.core.common.c.a().b(f17407d.j());
                com.anythink.core.common.a.o.a().e();
                com.anythink.core.common.d.t.b();
                com.anythink.core.a.b.a(context.getApplicationContext()).a(a9.aI());
                com.anythink.core.common.d.t.b().H();
                com.anythink.core.common.d.t.b().a(a9);
                com.anythink.core.common.v.e.a().a(a9.g());
                com.anythink.core.common.b.a.a().a(a9);
            }
            dVar.f();
        }
    }
}
