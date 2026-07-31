package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kq1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7581a;

    /* renamed from: b, reason: collision with root package name */
    private final l31 f7582b;

    /* renamed from: c, reason: collision with root package name */
    private final ji1 f7583c;

    kq1(Executor executor, l31 l31Var, ji1 ji1Var) {
        this.f7581a = executor;
        this.f7583c = ji1Var;
        this.f7582b = l31Var;
    }

    public final void a(final eu0 eu0Var) {
        if (eu0Var == null) {
            return;
        }
        this.f7583c.S0(eu0Var.c0());
        this.f7583c.D0(new zn() { // from class: com.google.android.gms.internal.ads.gq1
            @Override // com.google.android.gms.internal.ads.zn
            public final void o0(xn xnVar) {
                tv0 E0 = eu0.this.E0();
                Rect rect = xnVar.f14252d;
                E0.w0(rect.left, rect.top, false);
            }
        }, this.f7581a);
        this.f7583c.D0(new zn() { // from class: com.google.android.gms.internal.ads.hq1
            @Override // com.google.android.gms.internal.ads.zn
            public final void o0(xn xnVar) {
                eu0 eu0Var2 = eu0.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != xnVar.f14258j ? "0" : "1");
                eu0Var2.t("onAdVisibilityChanged", hashMap);
            }
        }, this.f7581a);
        this.f7583c.D0(this.f7582b, this.f7581a);
        this.f7582b.e(eu0Var);
        eu0Var.G0("/trackActiveViewUnit", new t70() { // from class: com.google.android.gms.internal.ads.iq1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                kq1.this.b((eu0) obj, map);
            }
        });
        eu0Var.G0("/untrackActiveViewUnit", new t70() { // from class: com.google.android.gms.internal.ads.jq1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                kq1.this.c((eu0) obj, map);
            }
        });
    }

    final /* synthetic */ void b(eu0 eu0Var, Map map) {
        this.f7582b.b();
    }

    final /* synthetic */ void c(eu0 eu0Var, Map map) {
        this.f7582b.a();
    }
}
