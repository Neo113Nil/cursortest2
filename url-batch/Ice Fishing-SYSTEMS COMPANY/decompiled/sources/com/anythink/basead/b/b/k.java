package com.anythink.basead.b.b;

import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private w f6001b;

    /* renamed from: c, reason: collision with root package name */
    private x f6002c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.d.j f6003d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6004e;

    /* renamed from: a, reason: collision with root package name */
    private final String f6000a = "k";

    /* renamed from: f, reason: collision with root package name */
    private boolean f6005f = false;

    public k(w wVar, x xVar) {
        y yVar;
        this.f6001b = wVar;
        this.f6002c = xVar;
        this.f6004e = false;
        if (xVar == null || (yVar = xVar.f14325o) == null) {
            return;
        }
        this.f6004e = yVar.aa() != 2;
    }

    public final void a(com.anythink.basead.d.j jVar) {
        this.f6003d = jVar;
    }

    public final void b() {
        if (this.f6003d == null) {
            return;
        }
        if (this.f6004e || !this.f6005f) {
            this.f6005f = true;
            w wVar = this.f6001b;
            if (wVar == null || !(wVar instanceof bj) || !((bj) wVar).ay() || this.f6001b.r() == null || this.f6001b.r().bN() == 2) {
                com.anythink.basead.b.b.a(9, this.f6001b, this.f6003d);
            }
        }
    }

    public final com.anythink.basead.d.j a() {
        return this.f6003d;
    }
}
