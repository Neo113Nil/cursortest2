package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class yq1 extends d50 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f14787f;

    /* renamed from: g, reason: collision with root package name */
    private final rm1 f14788g;

    /* renamed from: h, reason: collision with root package name */
    private rn1 f14789h;

    /* renamed from: i, reason: collision with root package name */
    private mm1 f14790i;

    public yq1(Context context, rm1 rm1Var, rn1 rn1Var, mm1 mm1Var) {
        this.f14787f = context;
        this.f14788g = rm1Var;
        this.f14789h = rn1Var;
        this.f14790i = mm1Var;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final boolean N0(x3.a aVar) {
        rn1 rn1Var;
        Object O0 = x3.b.O0(aVar);
        if (!(O0 instanceof ViewGroup) || (rn1Var = this.f14789h) == null || !rn1Var.f((ViewGroup) O0)) {
            return false;
        }
        this.f14788g.Z().V0(new xq1(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void P0(String str) {
        mm1 mm1Var = this.f14790i;
        if (mm1Var != null) {
            mm1Var.R(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final String U5(String str) {
        return this.f14788g.Q().get(str);
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final cz b() {
        return this.f14788g.R();
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final x3.a e() {
        return x3.b.B3(this.f14787f);
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final String f() {
        return this.f14788g.g0();
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final List<String> i() {
        h.e<String, z30> P = this.f14788g.P();
        h.e<String, String> Q = this.f14788g.Q();
        String[] strArr = new String[P.size() + Q.size()];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < P.size()) {
            strArr[i9] = P.i(i8);
            i8++;
            i9++;
        }
        while (i7 < Q.size()) {
            strArr[i9] = Q.i(i7);
            i7++;
            i9++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void j() {
        mm1 mm1Var = this.f14790i;
        if (mm1Var != null) {
            mm1Var.a();
        }
        this.f14790i = null;
        this.f14789h = null;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void k() {
        String a7 = this.f14788g.a();
        if ("Google".equals(a7)) {
            io0.g("Illegal argument specified for omid partner name.");
            return;
        }
        if (TextUtils.isEmpty(a7)) {
            io0.g("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        mm1 mm1Var = this.f14790i;
        if (mm1Var != null) {
            mm1Var.J(a7, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final boolean l() {
        mm1 mm1Var = this.f14790i;
        return (mm1Var == null || mm1Var.v()) && this.f14788g.Y() != null && this.f14788g.Z() == null;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void m() {
        mm1 mm1Var = this.f14790i;
        if (mm1Var != null) {
            mm1Var.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final boolean t() {
        x3.a c02 = this.f14788g.c0();
        if (c02 == null) {
            io0.g("Trying to start OMID session before creation.");
            return false;
        }
        y2.t.i().g0(c02);
        if (this.f14788g.Y() == null) {
            return true;
        }
        this.f14788g.Y().t("onSdkLoaded", new h.a());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void u0(x3.a aVar) {
        mm1 mm1Var;
        Object O0 = x3.b.O0(aVar);
        if (!(O0 instanceof View) || this.f14788g.c0() == null || (mm1Var = this.f14790i) == null) {
            return;
        }
        mm1Var.j((View) O0);
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final n40 z(String str) {
        return this.f14788g.P().get(str);
    }
}
