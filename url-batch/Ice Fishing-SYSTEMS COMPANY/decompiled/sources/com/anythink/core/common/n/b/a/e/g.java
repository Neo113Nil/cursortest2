package com.anythink.core.common.n.b.a.e;

import com.anythink.core.common.n.b.a.e.i;
import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.v;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g implements com.anythink.core.common.n.b.a.c.c {

    /* renamed from: l, reason: collision with root package name */
    private final w.a f15425l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.e f15426m;

    /* renamed from: n, reason: collision with root package name */
    private final f f15427n;

    /* renamed from: o, reason: collision with root package name */
    private volatile i f15428o;

    /* renamed from: p, reason: collision with root package name */
    private final ab f15429p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f15430q;

    /* renamed from: b, reason: collision with root package name */
    private static final String f15416b = "connection";

    /* renamed from: c, reason: collision with root package name */
    private static final String f15417c = "host";

    /* renamed from: d, reason: collision with root package name */
    private static final String f15418d = "keep-alive";

    /* renamed from: e, reason: collision with root package name */
    private static final String f15419e = "proxy-connection";

    /* renamed from: g, reason: collision with root package name */
    private static final String f15421g = "te";

    /* renamed from: f, reason: collision with root package name */
    private static final String f15420f = "transfer-encoding";

    /* renamed from: h, reason: collision with root package name */
    private static final String f15422h = "encoding";
    private static final String i = "upgrade";

    /* renamed from: j, reason: collision with root package name */
    private static final List<String> f15423j = com.anythink.core.common.n.b.a.c.a(f15416b, f15417c, f15418d, f15419e, f15421g, f15420f, f15422h, i, c.f15283c, c.f15284d, c.f15285e, c.f15286f);

    /* renamed from: k, reason: collision with root package name */
    private static final List<String> f15424k = com.anythink.core.common.n.b.a.c.a(f15416b, f15417c, f15418d, f15419e, f15421g, f15420f, f15422h, i);

    public g(z zVar, com.anythink.core.common.n.b.a.b.e eVar, w.a aVar, f fVar) {
        this.f15426m = eVar;
        this.f15425l = aVar;
        this.f15427n = fVar;
        List<ab> q6 = zVar.q();
        ab abVar = ab.H2_PRIOR_KNOWLEDGE;
        this.f15429p = q6.contains(abVar) ? abVar : ab.HTTP_2;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final com.anythink.core.common.n.b.a.b.e a() {
        return this.f15426m;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void b() {
        this.f15427n.f15365r.b();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void c() {
        this.f15428o.f().close();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final u d() {
        return this.f15428o.d();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void e() {
        this.f15430q = true;
        if (this.f15428o != null) {
            this.f15428o.a(b.CANCEL);
        }
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final v a(ad adVar, long j9) {
        return this.f15428o.f();
    }

    private static List<c> b(ad adVar) {
        u c4 = adVar.c();
        ArrayList arrayList = new ArrayList(c4.a() + 4);
        arrayList.add(new c(c.f15288h, adVar.b()));
        arrayList.add(new c(c.i, com.anythink.core.common.n.b.a.c.i.a(adVar.a())));
        String a9 = adVar.a("Host");
        if (a9 != null) {
            arrayList.add(new c(c.f15290k, a9));
        }
        arrayList.add(new c(c.f15289j, adVar.a().b()));
        int a10 = c4.a();
        for (int i4 = 0; i4 < a10; i4++) {
            String lowerCase = c4.a(i4).toLowerCase(Locale.US);
            if (!f15423j.contains(lowerCase) || (lowerCase.equals(f15421g) && c4.b(i4).equals("trailers"))) {
                arrayList.add(new c(lowerCase, c4.b(i4)));
            }
        }
        return arrayList;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void a(ad adVar) {
        if (this.f15428o != null) {
            return;
        }
        boolean z8 = adVar.d() != null;
        u c4 = adVar.c();
        ArrayList arrayList = new ArrayList(c4.a() + 4);
        arrayList.add(new c(c.f15288h, adVar.b()));
        arrayList.add(new c(c.i, com.anythink.core.common.n.b.a.c.i.a(adVar.a())));
        String a9 = adVar.a("Host");
        if (a9 != null) {
            arrayList.add(new c(c.f15290k, a9));
        }
        arrayList.add(new c(c.f15289j, adVar.a().b()));
        int a10 = c4.a();
        for (int i4 = 0; i4 < a10; i4++) {
            String lowerCase = c4.a(i4).toLowerCase(Locale.US);
            if (!f15423j.contains(lowerCase) || (lowerCase.equals(f15421g) && c4.b(i4).equals("trailers"))) {
                arrayList.add(new c(lowerCase, c4.b(i4)));
            }
        }
        this.f15428o = this.f15427n.a(arrayList, z8);
        if (!this.f15430q) {
            i.c cVar = this.f15428o.f15448f;
            long e6 = this.f15425l.e();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVar.a(e6, timeUnit);
            this.f15428o.f15449g.a(this.f15425l.f(), timeUnit);
            return;
        }
        this.f15428o.a(b.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final com.anythink.core.common.n.c.w b(af afVar) {
        return this.f15428o.e();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final af.a a(boolean z8) {
        u c4 = this.f15428o.c();
        ab abVar = this.f15429p;
        u.a aVar = new u.a();
        int a9 = c4.a();
        com.anythink.core.common.n.b.a.c.k kVar = null;
        for (int i4 = 0; i4 < a9; i4++) {
            String a10 = c4.a(i4);
            String b9 = c4.b(i4);
            if (a10.equals(c.f15282b)) {
                kVar = com.anythink.core.common.n.b.a.c.k.a("HTTP/1.1 ".concat(String.valueOf(b9)));
            } else if (!f15424k.contains(a10)) {
                com.anythink.core.common.n.b.a.a.f15027a.a(aVar, a10, b9);
            }
        }
        if (kVar != null) {
            af.a a11 = new af.a().a(abVar).a(kVar.f15232e).a(kVar.f15233f).a(aVar.a());
            if (z8 && com.anythink.core.common.n.b.a.a.f15027a.a(a11) == 100) {
                return null;
            }
            return a11;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    private static af.a a(u uVar, ab abVar) {
        u.a aVar = new u.a();
        int a9 = uVar.a();
        com.anythink.core.common.n.b.a.c.k kVar = null;
        for (int i4 = 0; i4 < a9; i4++) {
            String a10 = uVar.a(i4);
            String b9 = uVar.b(i4);
            if (a10.equals(c.f15282b)) {
                kVar = com.anythink.core.common.n.b.a.c.k.a("HTTP/1.1 ".concat(String.valueOf(b9)));
            } else if (!f15424k.contains(a10)) {
                com.anythink.core.common.n.b.a.a.f15027a.a(aVar, a10, b9);
            }
        }
        if (kVar != null) {
            return new af.a().a(abVar).a(kVar.f15232e).a(kVar.f15233f).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final long a(af afVar) {
        return com.anythink.core.common.n.b.a.c.e.a(afVar);
    }
}
