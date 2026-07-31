package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class vq1 extends z40 {

    /* renamed from: f, reason: collision with root package name */
    private final String f13477f;

    /* renamed from: g, reason: collision with root package name */
    private final mm1 f13478g;

    /* renamed from: h, reason: collision with root package name */
    private final rm1 f13479h;

    public vq1(String str, mm1 mm1Var, rm1 rm1Var) {
        this.f13477f = str;
        this.f13478g = mm1Var;
        this.f13479h = rm1Var;
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final boolean L(Bundle bundle) {
        return this.f13478g.x(bundle);
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final void S(Bundle bundle) {
        this.f13478g.l(bundle);
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final Bundle a() {
        return this.f13479h.L();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final n40 b() {
        return this.f13479h.W();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final cz c() {
        return this.f13479h.R();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final x3.a d() {
        return this.f13479h.b0();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final x3.a e() {
        return x3.b.B3(this.f13478g);
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final String f() {
        return this.f13479h.d0();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final g40 g() {
        return this.f13479h.T();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final String h() {
        return this.f13479h.e0();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final String i() {
        return this.f13479h.f0();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final String j() {
        return this.f13479h.h0();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final String k() {
        return this.f13477f;
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final void m() {
        this.f13478g.a();
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final void m3(Bundle bundle) {
        this.f13478g.S(bundle);
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final List<?> o() {
        return this.f13479h.e();
    }
}
