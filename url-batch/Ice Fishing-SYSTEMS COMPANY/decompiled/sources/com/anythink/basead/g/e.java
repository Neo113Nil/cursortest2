package com.anythink.basead.g;

import com.anythink.core.common.d.t;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.q;

/* loaded from: classes.dex */
public abstract class e implements a {

    /* renamed from: a, reason: collision with root package name */
    w f9134a;

    /* renamed from: b, reason: collision with root package name */
    n f9135b;

    /* renamed from: e, reason: collision with root package name */
    private int f9138e = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f9136c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f9137d = false;

    public e(w wVar, n nVar) {
        this.f9134a = wVar;
        this.f9135b = nVar;
    }

    private void a() {
        w wVar = this.f9134a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1) {
                com.anythink.core.common.a.d.a().b(rVar);
                if (this.f9135b == null || this.f9136c) {
                    return;
                }
                this.f9136c = true;
                com.anythink.core.common.a.f.a().a(this.f9135b.aI(), rVar);
            }
        }
    }

    private void b() {
        w wVar = this.f9134a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() != 1 || this.f9135b == null || this.f9137d) {
                return;
            }
            this.f9137d = true;
            com.anythink.core.common.a.f.a().b(this.f9135b.aI(), rVar);
        }
    }

    @Override // com.anythink.basead.g.a
    public void onAdClick(j jVar) {
        this.f9138e++;
        w wVar = this.f9134a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1 && this.f9135b != null && !this.f9137d) {
                this.f9137d = true;
                com.anythink.core.common.a.f.a().b(this.f9135b.aI(), rVar);
            }
        }
        n nVar = this.f9135b;
        if (nVar != null) {
            nVar.I(jVar.f9139a);
            this.f9135b.J(jVar.f9140b);
            this.f9135b.W(jVar.f9143e);
            if (this.f9134a.r() == null || this.f9138e > this.f9134a.r().bI()) {
                this.f9135b.d(false);
            } else {
                this.f9135b.d(true);
            }
        }
        q.a(t.b().g()).a(this.f9134a, this.f9135b, 6);
    }

    @Override // com.anythink.basead.g.a
    public void onAdShow(j jVar) {
        w wVar = this.f9134a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1) {
                com.anythink.core.common.a.d.a().b(rVar);
                if (this.f9135b != null && !this.f9136c) {
                    this.f9136c = true;
                    com.anythink.core.common.a.f.a().a(this.f9135b.aI(), rVar);
                }
            }
        }
        n nVar = this.f9135b;
        if (nVar != null) {
            nVar.U(this.f9134a.Q());
            this.f9135b.W(jVar.f9143e);
        }
        q.a(t.b().g()).a(this.f9134a, this.f9135b, 4);
    }

    public void updateTrackingInfo(n nVar) {
        this.f9135b = nVar;
    }
}
