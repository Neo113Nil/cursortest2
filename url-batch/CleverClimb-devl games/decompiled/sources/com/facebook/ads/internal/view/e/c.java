package com.facebook.ads.internal.view.e;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.internal.j.f;
import com.facebook.ads.internal.view.e.b.h;
import com.facebook.ads.internal.view.e.b.j;
import com.facebook.ads.internal.view.e.b.l;
import com.facebook.ads.internal.view.e.b.m;
import com.facebook.ads.internal.view.e.b.n;
import com.facebook.ads.internal.view.e.b.p;
import com.facebook.ads.internal.view.e.b.r;
import com.facebook.ads.internal.view.e.b.s;
import com.facebook.ads.internal.view.e.b.v;
import com.facebook.ads.internal.view.e.b.w;
import com.facebook.ads.internal.view.e.b.x;
import com.facebook.ads.internal.view.e.b.y;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f5669a;

    /* renamed from: b, reason: collision with root package name */
    private final w f5670b;

    /* renamed from: c, reason: collision with root package name */
    private final f<r> f5671c;

    /* renamed from: d, reason: collision with root package name */
    private final f<h> f5672d;
    private final f<j> e;
    private final f<n> f;
    private final f<com.facebook.ads.internal.view.e.b.b> g;
    private final f<p> h;
    private final f<x> i;
    private final f<y> j;
    private final f<s> k;
    private final m l;
    private final b m;
    private boolean n;

    public c(Context context, com.facebook.ads.internal.m.c cVar, b bVar, String str) {
        this(context, cVar, bVar, new ArrayList(), str);
    }

    public c(Context context, com.facebook.ads.internal.m.c cVar, b bVar, String str, Bundle bundle) {
        this(context, cVar, bVar, new ArrayList(), str, bundle);
    }

    public c(Context context, com.facebook.ads.internal.m.c cVar, b bVar, List<com.facebook.ads.internal.b.b> list, String str) {
        super(context, cVar, bVar, list, str);
        this.f5670b = new w() { // from class: com.facebook.ads.internal.view.e.c.1

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f5673a = !c.class.desiredAssertionStatus();

            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                if (!f5673a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.e();
            }
        };
        this.f5671c = new f<r>() { // from class: com.facebook.ads.internal.view.e.c.5

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f5681a = !c.class.desiredAssertionStatus();

            @Override // com.facebook.ads.internal.j.f
            public Class<r> a() {
                return r.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(r rVar) {
                if (!f5681a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.i();
            }
        };
        this.f5672d = new f<h>() { // from class: com.facebook.ads.internal.view.e.c.6

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f5683a = !c.class.desiredAssertionStatus();

            @Override // com.facebook.ads.internal.j.f
            public Class<h> a() {
                return h.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                if (!f5683a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.j();
            }
        };
        this.e = new f<j>() { // from class: com.facebook.ads.internal.view.e.c.7

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f5685a = !c.class.desiredAssertionStatus();

            @Override // com.facebook.ads.internal.j.f
            public Class<j> a() {
                return j.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                if (!f5685a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                if (c.this.n) {
                    c.this.k();
                } else {
                    c.this.n = true;
                }
            }
        };
        this.f = new f<n>() { // from class: com.facebook.ads.internal.view.e.c.8
            @Override // com.facebook.ads.internal.j.f
            public Class<n> a() {
                return n.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(n nVar) {
                if (c.this.f5669a <= 0 || c.this.m.getCurrentPosition() != c.this.m.getDuration() || c.this.m.getDuration() <= c.this.f5669a) {
                    c.this.a(c.this.m.getCurrentPosition());
                }
            }
        };
        this.g = new f<com.facebook.ads.internal.view.e.b.b>() { // from class: com.facebook.ads.internal.view.e.c.9
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.b> a() {
                return com.facebook.ads.internal.view.e.b.b.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar2) {
                c cVar2;
                int a2 = bVar2.a();
                int b2 = bVar2.b();
                if (c.this.f5669a <= 0 || a2 != b2 || b2 <= c.this.f5669a) {
                    if (!(a2 == 0 && c.this.m.g()) && b2 >= a2 + TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL) {
                        cVar2 = c.this;
                    } else if (b2 != 0) {
                        c.this.b(b2);
                        return;
                    } else {
                        cVar2 = c.this;
                        a2 = c.this.f5669a;
                    }
                    cVar2.b(a2);
                }
            }
        };
        this.h = new f<p>() { // from class: com.facebook.ads.internal.view.e.c.10
            @Override // com.facebook.ads.internal.j.f
            public Class<p> a() {
                return p.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                c.this.a(pVar.a(), pVar.b());
            }
        };
        this.i = new f<x>() { // from class: com.facebook.ads.internal.view.e.c.11
            @Override // com.facebook.ads.internal.j.f
            public Class<x> a() {
                return x.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(x xVar) {
                c.this.b();
            }
        };
        this.j = new f<y>() { // from class: com.facebook.ads.internal.view.e.c.12
            @Override // com.facebook.ads.internal.j.f
            public Class<y> a() {
                return y.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(y yVar) {
                c.this.c();
            }
        };
        this.k = new f<s>() { // from class: com.facebook.ads.internal.view.e.c.2
            @Override // com.facebook.ads.internal.j.f
            public Class<s> a() {
                return s.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(s sVar) {
                c.this.a(c.this.l(), c.this.l());
            }
        };
        this.l = new m() { // from class: com.facebook.ads.internal.view.e.c.3
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                c.this.f5669a = c.this.m.getDuration();
            }
        };
        this.n = false;
        this.m = bVar;
        this.m.getEventBus().a(this.f5670b, this.f, this.f5671c, this.e, this.f5672d, this.g, this.h, this.i, this.j, this.l, this.k);
    }

    public c(Context context, com.facebook.ads.internal.m.c cVar, b bVar, List<com.facebook.ads.internal.b.b> list, String str, Bundle bundle) {
        super(context, cVar, bVar, list, str, bundle);
        this.f5670b = new w() { // from class: com.facebook.ads.internal.view.e.c.1

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f5673a = !c.class.desiredAssertionStatus();

            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                if (!f5673a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.e();
            }
        };
        this.f5671c = new f<r>() { // from class: com.facebook.ads.internal.view.e.c.5

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f5681a = !c.class.desiredAssertionStatus();

            @Override // com.facebook.ads.internal.j.f
            public Class<r> a() {
                return r.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(r rVar) {
                if (!f5681a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.i();
            }
        };
        this.f5672d = new f<h>() { // from class: com.facebook.ads.internal.view.e.c.6

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f5683a = !c.class.desiredAssertionStatus();

            @Override // com.facebook.ads.internal.j.f
            public Class<h> a() {
                return h.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                if (!f5683a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.j();
            }
        };
        this.e = new f<j>() { // from class: com.facebook.ads.internal.view.e.c.7

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f5685a = !c.class.desiredAssertionStatus();

            @Override // com.facebook.ads.internal.j.f
            public Class<j> a() {
                return j.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                if (!f5685a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                if (c.this.n) {
                    c.this.k();
                } else {
                    c.this.n = true;
                }
            }
        };
        this.f = new f<n>() { // from class: com.facebook.ads.internal.view.e.c.8
            @Override // com.facebook.ads.internal.j.f
            public Class<n> a() {
                return n.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(n nVar) {
                if (c.this.f5669a <= 0 || c.this.m.getCurrentPosition() != c.this.m.getDuration() || c.this.m.getDuration() <= c.this.f5669a) {
                    c.this.a(c.this.m.getCurrentPosition());
                }
            }
        };
        this.g = new f<com.facebook.ads.internal.view.e.b.b>() { // from class: com.facebook.ads.internal.view.e.c.9
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.b> a() {
                return com.facebook.ads.internal.view.e.b.b.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar2) {
                c cVar2;
                int a2 = bVar2.a();
                int b2 = bVar2.b();
                if (c.this.f5669a <= 0 || a2 != b2 || b2 <= c.this.f5669a) {
                    if (!(a2 == 0 && c.this.m.g()) && b2 >= a2 + TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL) {
                        cVar2 = c.this;
                    } else if (b2 != 0) {
                        c.this.b(b2);
                        return;
                    } else {
                        cVar2 = c.this;
                        a2 = c.this.f5669a;
                    }
                    cVar2.b(a2);
                }
            }
        };
        this.h = new f<p>() { // from class: com.facebook.ads.internal.view.e.c.10
            @Override // com.facebook.ads.internal.j.f
            public Class<p> a() {
                return p.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                c.this.a(pVar.a(), pVar.b());
            }
        };
        this.i = new f<x>() { // from class: com.facebook.ads.internal.view.e.c.11
            @Override // com.facebook.ads.internal.j.f
            public Class<x> a() {
                return x.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(x xVar) {
                c.this.b();
            }
        };
        this.j = new f<y>() { // from class: com.facebook.ads.internal.view.e.c.12
            @Override // com.facebook.ads.internal.j.f
            public Class<y> a() {
                return y.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(y yVar) {
                c.this.c();
            }
        };
        this.k = new f<s>() { // from class: com.facebook.ads.internal.view.e.c.2
            @Override // com.facebook.ads.internal.j.f
            public Class<s> a() {
                return s.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(s sVar) {
                c.this.a(c.this.l(), c.this.l());
            }
        };
        this.l = new m() { // from class: com.facebook.ads.internal.view.e.c.3
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                c.this.f5669a = c.this.m.getDuration();
            }
        };
        this.n = false;
        this.m = bVar;
        this.m.getEventBus().a(this.f5670b, this.f, this.f5671c, this.e, this.f5672d, this.g, this.i, this.j, this.k);
    }

    public void a() {
        this.m.getStateHandler().post(new Runnable() { // from class: com.facebook.ads.internal.view.e.c.4
            @Override // java.lang.Runnable
            public void run() {
                c.this.m.getEventBus().b(c.this.f5670b, c.this.f, c.this.f5671c, c.this.e, c.this.f5672d, c.this.g, c.this.h, c.this.i, c.this.j, c.this.l, c.this.k);
            }
        });
    }
}
