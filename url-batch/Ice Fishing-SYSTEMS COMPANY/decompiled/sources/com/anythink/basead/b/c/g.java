package com.anythink.basead.b.c;

import android.text.TextUtils;
import com.anythink.basead.d.j;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b.a;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    long f6116b;

    /* renamed from: c, reason: collision with root package name */
    String f6117c;

    /* renamed from: d, reason: collision with root package name */
    a.C0094a f6118d;

    /* renamed from: e, reason: collision with root package name */
    private String f6119e;

    /* renamed from: f, reason: collision with root package name */
    private String f6120f;

    /* renamed from: g, reason: collision with root package name */
    private String f6121g;

    /* renamed from: h, reason: collision with root package name */
    private int f6122h;
    private w i;

    /* renamed from: j, reason: collision with root package name */
    private y f6123j;

    /* renamed from: k, reason: collision with root package name */
    private x f6124k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.res.b.a f6125l;

    /* renamed from: a, reason: collision with root package name */
    final String f6115a = "g";

    /* renamed from: m, reason: collision with root package name */
    private long f6126m = 0;

    public g(String str, final w wVar, y yVar, final x xVar) {
        this.f6117c = "";
        this.f6119e = wVar.E();
        this.i = wVar;
        this.f6123j = yVar;
        this.f6124k = xVar;
        this.f6120f = str;
        this.f6121g = wVar.v();
        this.f6122h = wVar.b();
        if (wVar instanceof bj) {
            this.f6117c = ((bj) wVar).aD();
        }
        this.f6125l = com.anythink.core.common.res.b.c.a().a(this.f6119e);
        this.f6116b = 0L;
        if (TextUtils.equals(String.valueOf(yVar.F()), "4") && yVar.aJ() != 1 && yVar.ac() > 0) {
            this.f6116b = yVar.x();
        }
        this.f6125l.a(new com.anythink.core.common.res.b.b(this.f6123j.ac(), this.f6123j.ae(), this.f6116b));
        this.f6125l.a(new a.b() { // from class: com.anythink.basead.b.c.g.1
            @Override // com.anythink.core.common.res.b.a.b
            public final boolean a(int i, long j9, long j10) {
                if (i < g.this.f6123j.ac()) {
                    return false;
                }
                if (g.this.f6118d != null) {
                    com.anythink.core.common.u.e.a(wVar, xVar, true, "", j10, j9, System.currentTimeMillis() - g.this.f6126m, g.this.f6118d.b(), g.this.f6118d.c(), g.this.f6118d.d());
                } else {
                    com.anythink.core.common.u.e.a(wVar, xVar, j10, j9, System.currentTimeMillis() - g.this.f6126m);
                }
                e.a().a(g.this.f6119e, i);
                return true;
            }

            @Override // com.anythink.core.common.res.b.a.b
            public final void a(String str2, String str3) {
                com.anythink.core.common.u.e.a(wVar, xVar, str3);
            }

            @Override // com.anythink.core.common.res.b.a.b
            public final void a(a.C0094a c0094a) {
                if (c0094a != null) {
                    g gVar = g.this;
                    gVar.f6118d = c0094a;
                    long j9 = gVar.f6116b;
                    if (j9 <= 0 || j9 != c0094a.a()) {
                        return;
                    }
                    String unused = g.this.f6121g;
                    String unused2 = g.this.f6119e;
                    c0094a.b();
                    c0094a.d();
                    g.this.f6123j.Q(g.this.f6118d.d());
                }
            }
        });
        this.f6125l.f16341k = new a.c() { // from class: com.anythink.basead.b.c.g.2
            @Override // com.anythink.core.common.res.b.a.c
            public final void a() {
                com.anythink.basead.b.b.a(30, wVar, new j("", ""));
            }

            @Override // com.anythink.core.common.res.b.a.c
            public final void a(String str2, String str3) {
                e.a().a(g.this.f6119e, com.anythink.basead.d.g.a(str2, str3));
            }
        };
    }

    public final void a() {
        this.f6126m = System.currentTimeMillis();
        this.f6125l.e();
    }
}
