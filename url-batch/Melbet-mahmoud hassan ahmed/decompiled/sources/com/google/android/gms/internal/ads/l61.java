package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class l61 implements lc1, qb1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f7840f;

    /* renamed from: g, reason: collision with root package name */
    private final eu0 f7841g;

    /* renamed from: h, reason: collision with root package name */
    private final rr2 f7842h;

    /* renamed from: i, reason: collision with root package name */
    private final po0 f7843i;

    /* renamed from: j, reason: collision with root package name */
    private x3.a f7844j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7845k;

    public l61(Context context, eu0 eu0Var, rr2 rr2Var, po0 po0Var) {
        this.f7840f = context;
        this.f7841g = eu0Var;
        this.f7842h = rr2Var;
        this.f7843i = po0Var;
    }

    private final synchronized void a() {
        ug0 ug0Var;
        vg0 vg0Var;
        if (this.f7842h.Q) {
            if (this.f7841g == null) {
                return;
            }
            if (y2.t.i().k0(this.f7840f)) {
                po0 po0Var = this.f7843i;
                int i7 = po0Var.f10302g;
                int i8 = po0Var.f10303h;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i7);
                sb.append(".");
                sb.append(i8);
                String sb2 = sb.toString();
                String a7 = this.f7842h.S.a();
                if (this.f7842h.S.b() == 1) {
                    ug0Var = ug0.VIDEO;
                    vg0Var = vg0.DEFINED_BY_JAVASCRIPT;
                } else {
                    ug0Var = ug0.HTML_DISPLAY;
                    vg0Var = this.f7842h.f11377f == 1 ? vg0.ONE_PIXEL : vg0.BEGIN_TO_RENDER;
                }
                x3.a i02 = y2.t.i().i0(sb2, this.f7841g.L(), "", "javascript", a7, vg0Var, ug0Var, this.f7842h.f11386j0);
                this.f7844j = i02;
                Object obj = this.f7841g;
                if (i02 != null) {
                    y2.t.i().l0(this.f7844j, (View) obj);
                    this.f7841g.B0(this.f7844j);
                    y2.t.i().g0(this.f7844j);
                    this.f7845k = true;
                    this.f7841g.t("onSdkLoaded", new h.a());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final synchronized void k() {
        eu0 eu0Var;
        if (!this.f7845k) {
            a();
        }
        if (!this.f7842h.Q || this.f7844j == null || (eu0Var = this.f7841g) == null) {
            return;
        }
        eu0Var.t("onSdkImpression", new h.a());
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final synchronized void m() {
        if (this.f7845k) {
            return;
        }
        a();
    }
}
