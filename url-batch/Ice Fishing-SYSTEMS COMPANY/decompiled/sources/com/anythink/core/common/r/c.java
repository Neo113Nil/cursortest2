package com.anythink.core.common.r;

import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.n;
import com.anythink.core.d.l;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    private static final String f16208l = "c";

    /* renamed from: a, reason: collision with root package name */
    String f16209a;

    /* renamed from: b, reason: collision with root package name */
    h f16210b;

    /* renamed from: c, reason: collision with root package name */
    int f16211c;

    /* renamed from: d, reason: collision with root package name */
    d f16212d;

    /* renamed from: e, reason: collision with root package name */
    int f16213e;

    /* renamed from: f, reason: collision with root package name */
    boolean f16214f;

    /* renamed from: g, reason: collision with root package name */
    long f16215g;

    /* renamed from: h, reason: collision with root package name */
    String f16216h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    Boolean f16217j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.t.b f16218k;

    /* renamed from: m, reason: collision with root package name */
    private ATAdRequest f16219m;

    /* renamed from: com.anythink.core.common.r.c$1, reason: invalid class name */
    public class AnonymousClass1 implements com.anythink.core.common.t.b {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.k();
        }
    }

    public c(String str) {
        this.f16209a = str;
        StringBuilder c4 = AbstractC5088e.c(str, "_");
        c4.append(hashCode());
        this.f16216h = c4.toString();
    }

    private Boolean f() {
        return this.f16217j;
    }

    private void g() {
        if (this.f16214f && this.f16215g != -1) {
            this.f16218k = new AnonymousClass1();
            com.anythink.core.common.t.d.a().a(this.f16218k, this.f16215g, false);
        }
    }

    private void h() {
        if (this.f16218k != null) {
            this.f16210b.toString();
            com.anythink.core.common.t.d.a().b(this.f16218k);
        }
    }

    private com.anythink.core.common.f i() {
        return com.anythink.core.common.f.a(t.b().g(), this.f16209a, String.valueOf(this.f16213e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        h();
        d dVar = this.f16212d;
        if (dVar != null) {
            dVar.a(this.f16216h, this.f16210b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        d dVar = this.f16212d;
        if (dVar != null) {
            dVar.b(this.f16216h, this.f16210b);
        }
    }

    private ar l() {
        com.anythink.core.common.h.d dVar;
        ar arVar = new ar();
        arVar.a(t.b().M());
        arVar.f13704c = this.f16211c;
        arVar.a(this.f16219m);
        h hVar = this.f16210b;
        if (hVar != null) {
            n nVar = hVar.f16245g;
            ar arVar2 = hVar.f16244f;
            l lVar = hVar.f16246h;
            g gVar = hVar.f16247j;
            if (arVar2 != null) {
                dVar = arVar2.i;
                if (dVar == null) {
                    dVar = new com.anythink.core.common.h.d();
                }
                dVar.a(arVar2.f13702a);
            } else {
                dVar = new com.anythink.core.common.h.d();
                if (this.f16211c == 17) {
                    dVar.b(nVar != null ? 1 : 2);
                }
            }
            dVar.a(this.f16210b.i);
            if (nVar != null) {
                dVar.a(nVar.aI(), nVar.Z(), nVar.aG());
            } else if (lVar != null) {
                dVar.a(lVar.i(), lVar.ay(), lVar.ai());
            }
            if (gVar != null) {
                dVar.b(gVar.h());
                dVar.a(gVar.f());
                dVar.a(gVar.i());
            }
        } else {
            dVar = null;
        }
        arVar.i = dVar;
        return arVar;
    }

    public final void c() {
        com.anythink.core.common.h.d dVar;
        h hVar = this.f16210b;
        if (hVar != null) {
            hVar.toString();
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(t.b().g(), this.f16209a, String.valueOf(this.f16213e));
        if (this.f16214f && this.f16215g != -1) {
            this.f16218k = new AnonymousClass1();
            com.anythink.core.common.t.d.a().a(this.f16218k, this.f16215g, false);
        }
        ar arVar = new ar();
        arVar.a(t.b().M());
        arVar.f13704c = this.f16211c;
        arVar.a(this.f16219m);
        h hVar2 = this.f16210b;
        if (hVar2 != null) {
            n nVar = hVar2.f16245g;
            ar arVar2 = hVar2.f16244f;
            l lVar = hVar2.f16246h;
            g gVar = hVar2.f16247j;
            if (arVar2 != null) {
                dVar = arVar2.i;
                if (dVar == null) {
                    dVar = new com.anythink.core.common.h.d();
                }
                dVar.a(arVar2.f13702a);
            } else {
                dVar = new com.anythink.core.common.h.d();
                if (this.f16211c == 17) {
                    dVar.b(nVar != null ? 1 : 2);
                }
            }
            dVar.a(this.f16210b.i);
            if (nVar != null) {
                dVar.a(nVar.aI(), nVar.Z(), nVar.aG());
            } else if (lVar != null) {
                dVar.a(lVar.i(), lVar.ay(), lVar.ai());
            }
            if (gVar != null) {
                dVar.b(gVar.h());
                dVar.a(gVar.f());
                dVar.a(gVar.i());
            }
        } else {
            dVar = null;
        }
        arVar.i = dVar;
        a9.a(t.b().g(), String.valueOf(this.f16213e), this.f16209a, arVar, new com.anythink.core.common.d.a() { // from class: com.anythink.core.common.r.c.2
            @Override // com.anythink.core.common.d.a
            public final void onAdLoadFail(AdError adError) {
                c.this.a(adError);
            }

            @Override // com.anythink.core.common.d.a
            public final void onAdLoaded() {
                c.this.j();
            }
        });
    }

    public final int d() {
        return this.f16211c;
    }

    public final String e() {
        return this.f16209a;
    }

    public final boolean b() {
        return this.f16217j == null || !this.i;
    }

    public final void a(b bVar) {
        h hVar = bVar.f16202a;
        this.f16210b = hVar;
        this.f16211c = bVar.f16203b;
        this.f16213e = hVar.f16239a;
        this.f16212d = bVar.f16206e;
        this.f16214f = bVar.f16204c;
        this.f16215g = bVar.f16205d;
        this.f16219m = bVar.f16207f;
    }

    public final String a() {
        return this.f16216h;
    }

    private void a(Boolean bool) {
        this.f16217j = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(AdError adError) {
        h();
        d dVar = this.f16212d;
        if (dVar != null) {
            dVar.a(this.f16216h, this.f16210b, adError);
        }
    }
}
