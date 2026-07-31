package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class qk1 implements lc1, z2.q {

    /* renamed from: f, reason: collision with root package name */
    private final Context f10737f;

    /* renamed from: g, reason: collision with root package name */
    private final eu0 f10738g;

    /* renamed from: h, reason: collision with root package name */
    private final rr2 f10739h;

    /* renamed from: i, reason: collision with root package name */
    private final po0 f10740i;

    /* renamed from: j, reason: collision with root package name */
    private final jr f10741j;

    /* renamed from: k, reason: collision with root package name */
    x3.a f10742k;

    public qk1(Context context, eu0 eu0Var, rr2 rr2Var, po0 po0Var, jr jrVar) {
        this.f10737f = context;
        this.f10738g = eu0Var;
        this.f10739h = rr2Var;
        this.f10740i = po0Var;
        this.f10741j = jrVar;
    }

    @Override // z2.q
    public final void B3() {
    }

    @Override // z2.q
    public final void E(int i7) {
        this.f10742k = null;
    }

    @Override // z2.q
    public final void a() {
        eu0 eu0Var;
        if (this.f10742k == null || (eu0Var = this.f10738g) == null) {
            return;
        }
        eu0Var.t("onSdkImpression", new h.a());
    }

    @Override // z2.q
    public final void b() {
    }

    @Override // z2.q
    public final void k6() {
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final void m() {
        vg0 vg0Var;
        ug0 ug0Var;
        jr jrVar = this.f10741j;
        if ((jrVar == jr.REWARD_BASED_VIDEO_AD || jrVar == jr.INTERSTITIAL || jrVar == jr.APP_OPEN) && this.f10739h.Q && this.f10738g != null && y2.t.i().k0(this.f10737f)) {
            po0 po0Var = this.f10740i;
            int i7 = po0Var.f10302g;
            int i8 = po0Var.f10303h;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i7);
            sb.append(".");
            sb.append(i8);
            String sb2 = sb.toString();
            String a7 = this.f10739h.S.a();
            if (this.f10739h.S.b() == 1) {
                ug0Var = ug0.VIDEO;
                vg0Var = vg0.DEFINED_BY_JAVASCRIPT;
            } else {
                vg0Var = this.f10739h.V == 2 ? vg0.UNSPECIFIED : vg0.BEGIN_TO_RENDER;
                ug0Var = ug0.HTML_DISPLAY;
            }
            x3.a i02 = y2.t.i().i0(sb2, this.f10738g.L(), "", "javascript", a7, vg0Var, ug0Var, this.f10739h.f11386j0);
            this.f10742k = i02;
            if (i02 != null) {
                y2.t.i().l0(this.f10742k, (View) this.f10738g);
                this.f10738g.B0(this.f10742k);
                y2.t.i().g0(this.f10742k);
                this.f10738g.t("onSdkLoaded", new h.a());
            }
        }
    }

    @Override // z2.q
    public final void o4() {
    }
}
