package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class sc0 extends wv0 {

    /* renamed from: f, reason: collision with root package name */
    private final f4.a f11785f;

    sc0(f4.a aVar) {
        this.f11785f = aVar;
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void J2(String str, String str2, Bundle bundle) {
        this.f11785f.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final Map K4(String str, String str2, boolean z6) {
        return this.f11785f.m(str, str2, z6);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void L(Bundle bundle) {
        this.f11785f.q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void L5(x3.a aVar, String str, String str2) {
        this.f11785f.s(aVar != null ? (Activity) x3.b.O0(aVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final List M1(String str, String str2) {
        return this.f11785f.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void O4(String str) {
        this.f11785f.c(str);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void S(Bundle bundle) {
        this.f11785f.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final Bundle Z4(Bundle bundle) {
        return this.f11785f.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final String b() {
        return this.f11785f.e();
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final long c() {
        return this.f11785f.d();
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final String d() {
        return this.f11785f.f();
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final String e() {
        return this.f11785f.h();
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final String f() {
        return this.f11785f.i();
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void f3(String str, String str2, x3.a aVar) {
        this.f11785f.t(str, str2, aVar != null ? x3.b.O0(aVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final String h() {
        return this.f11785f.j();
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void m0(String str) {
        this.f11785f.a(str);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final int s(String str) {
        return this.f11785f.l(str);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void v5(String str, String str2, Bundle bundle) {
        this.f11785f.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.xv0
    public final void y0(Bundle bundle) {
        this.f11785f.r(bundle);
    }
}
