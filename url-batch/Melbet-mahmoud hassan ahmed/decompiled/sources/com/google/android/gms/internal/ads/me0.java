package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class me0 extends rd0 {

    /* renamed from: f, reason: collision with root package name */
    private final c3.v f8504f;

    public me0(c3.v vVar) {
        this.f8504f = vVar;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final boolean G() {
        return this.f8504f.l();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final boolean H() {
        return this.f8504f.m();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final void K5(x3.a aVar, x3.a aVar2, x3.a aVar3) {
        this.f8504f.E((View) x3.b.O0(aVar), (HashMap) x3.b.O0(aVar2), (HashMap) x3.b.O0(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final void N() {
        this.f8504f.s();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final void P3(x3.a aVar) {
        this.f8504f.F((View) x3.b.O0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final double b() {
        if (this.f8504f.o() != null) {
            return this.f8504f.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final float d() {
        return this.f8504f.k();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final float e() {
        return this.f8504f.e();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final float f() {
        return this.f8504f.f();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final Bundle h() {
        return this.f8504f.g();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final cz i() {
        if (this.f8504f.H() != null) {
            return this.f8504f.H().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final g40 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final n40 k() {
        u2.d i7 = this.f8504f.i();
        if (i7 != null) {
            return new z30(i7.a(), i7.c(), i7.b(), i7.e(), i7.d());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final void k2(x3.a aVar) {
        this.f8504f.q((View) x3.b.O0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String l() {
        return this.f8504f.b();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final x3.a m() {
        View G = this.f8504f.G();
        if (G == null) {
            return null;
        }
        return x3.b.B3(G);
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final x3.a n() {
        Object I = this.f8504f.I();
        if (I == null) {
            return null;
        }
        return x3.b.B3(I);
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final x3.a o() {
        View a7 = this.f8504f.a();
        if (a7 == null) {
            return null;
        }
        return x3.b.B3(a7);
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String p() {
        return this.f8504f.h();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String q() {
        return this.f8504f.n();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String r() {
        return this.f8504f.c();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String t() {
        return this.f8504f.d();
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final List x() {
        List<u2.d> j7 = this.f8504f.j();
        ArrayList arrayList = new ArrayList();
        if (j7 != null) {
            for (u2.d dVar : j7) {
                arrayList.add(new z30(dVar.a(), dVar.c(), dVar.b(), dVar.e(), dVar.d()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String y() {
        return this.f8504f.p();
    }
}
