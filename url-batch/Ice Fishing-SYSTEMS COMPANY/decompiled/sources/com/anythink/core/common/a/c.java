package com.anythink.core.common.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bw;
import com.anythink.core.common.h.p;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.v.u;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f12291b;

    /* renamed from: a, reason: collision with root package name */
    private final String f12292a = getClass().getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, a> f12293c = new ConcurrentHashMap();

    public class a {

        /* renamed from: b, reason: collision with root package name */
        private bv f12295b;

        /* renamed from: c, reason: collision with root package name */
        private ATBaseAdAdapter f12296c;

        /* renamed from: d, reason: collision with root package name */
        private BaseAd f12297d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.h.c f12298e;

        /* renamed from: f, reason: collision with root package name */
        private String f12299f;

        /* renamed from: g, reason: collision with root package name */
        private com.anythink.core.common.h.n f12300g;

        public a() {
        }

        private com.anythink.core.common.h.n f() {
            return this.f12300g;
        }

        public final synchronized void c() {
            String unused = c.this.f12292a;
            this.f12296c = null;
            this.f12297d = null;
            this.f12298e = null;
        }

        public final bv d() {
            return this.f12295b;
        }

        public final synchronized com.anythink.core.common.h.c e() {
            return this.f12298e;
        }

        public final synchronized boolean b() {
            String unused = c.this.f12292a;
            return a() != null;
        }

        public final synchronized void a(String str, com.anythink.core.common.h.n nVar) {
            String unused = c.this.f12292a;
            this.f12299f = str;
            this.f12300g = nVar;
        }

        public final synchronized com.anythink.core.common.h.c a() {
            boolean internalIsAdReady;
            String unused = c.this.f12292a;
            ATBaseAdAdapter aTBaseAdAdapter = this.f12296c;
            com.anythink.core.common.h.n nVar = this.f12300g;
            if (aTBaseAdAdapter == null) {
                return null;
            }
            if (nVar == null) {
                return null;
            }
            com.anythink.core.common.h.c cVar = this.f12298e;
            if (cVar != null) {
                if (!cVar.k()) {
                    String unused2 = c.this.f12292a;
                    return null;
                }
                String unused3 = c.this.f12292a;
                return this.f12298e;
            }
            this.f12297d = null;
            if (TextUtils.equals(nVar.aK(), "0")) {
                BaseAd baseAdObject = this.f12296c.getBaseAdObject(t.b().g());
                this.f12297d = baseAdObject;
                internalIsAdReady = baseAdObject != null;
            } else {
                internalIsAdReady = this.f12296c.internalIsAdReady();
            }
            String unused4 = c.this.f12292a;
            if (internalIsAdReady) {
                this.f12300g.L(12);
                this.f12300g.m(ak.a(this.f12295b, this.f12296c));
                aj.a(this.f12296c, this.f12300g, this.f12295b);
                BaseAd baseAd = this.f12297d;
                if (baseAd != null) {
                    baseAd.setTrackingInfo(this.f12296c.getTrackingInfo().af());
                }
                this.f12295b.R().b(this.f12299f);
                com.anythink.core.b.d.c.a(this.f12296c, this.f12295b, this.f12300g, this.f12297d);
                com.anythink.core.common.h.c cVar2 = new com.anythink.core.common.h.c();
                this.f12298e = cVar2;
                cVar2.a(this.f12296c);
                this.f12298e.c(System.currentTimeMillis());
                this.f12298e.b(this.f12295b.u());
                this.f12298e.a(this.f12295b.G());
                this.f12298e.a("3");
                BaseAd baseAd2 = this.f12297d;
                if (baseAd2 != null) {
                    this.f12298e.a(baseAd2);
                }
            }
            return this.f12298e;
        }
    }

    private c() {
    }

    public static c a() {
        if (f12291b == null) {
            synchronized (c.class) {
                try {
                    if (f12291b == null) {
                        f12291b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12291b;
    }

    public final a a(Context context, String str, String str2, bv bvVar, com.anythink.core.d.l lVar, Map<String, Object> map, ATAdRequest aTAdRequest) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        if ((k6 != null && !k6.S() && k6.t() != 1) || bvVar == null) {
            return null;
        }
        bw a9 = com.anythink.core.common.a.a().a(str, bvVar);
        if (a9 != null && a9.a((ad) null).b() != null) {
            return null;
        }
        a aVar = this.f12293c.get(str);
        if (aVar != null && aVar.f12296c != null) {
            return aVar;
        }
        ad a10 = com.anythink.core.b.f.a().a(str, bvVar);
        if (a10 != null) {
            a10.a();
        }
        if (a10 != null && !a10.a()) {
            bvVar.a(a10, 0, 2, 1);
            p a11 = u.a(bvVar);
            ATBaseAdAdapter aTBaseAdAdapter = a11 != null ? a11.f14192a : null;
            if (aTBaseAdAdapter != null && aTBaseAdAdapter.internalInitNetworkObjectByPlacementId(context, lVar.a(str, str2, bvVar, aTAdRequest), map)) {
                a aVar2 = new a();
                aVar2.f12296c = aTBaseAdAdapter;
                aVar2.f12295b = bvVar;
                this.f12293c.put(str, aVar2);
                return aVar2;
            }
        }
        return null;
    }

    public final synchronized com.anythink.core.common.h.c a(String str) {
        a aVar;
        com.anythink.core.common.h.c e6;
        if (TextUtils.isEmpty(str) || (aVar = this.f12293c.get(str)) == null || aVar.f12296c == null || (e6 = aVar.e()) == null || !e6.k()) {
            return null;
        }
        com.anythink.core.common.v.p.a(aVar.d());
        return e6;
    }

    public final synchronized void a(String str, String str2) {
        a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = this.f12293c.get(str)) != null && aVar.f12295b != null && aVar.f12295b.z().equals(str2)) {
            aVar.c();
            this.f12293c.remove(str);
        }
    }
}
