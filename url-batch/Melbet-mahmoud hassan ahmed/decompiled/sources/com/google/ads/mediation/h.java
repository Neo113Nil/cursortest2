package com.google.ads.mediation;

import com.google.android.gms.internal.ads.yu;
import r2.n;

/* loaded from: classes.dex */
final class h extends r2.d implements s2.e, yu {

    /* renamed from: f, reason: collision with root package name */
    final AbstractAdViewAdapter f2208f;

    /* renamed from: g, reason: collision with root package name */
    final c3.i f2209g;

    public h(AbstractAdViewAdapter abstractAdViewAdapter, c3.i iVar) {
        this.f2208f = abstractAdViewAdapter;
        this.f2209g = iVar;
    }

    @Override // r2.d, com.google.android.gms.internal.ads.yu
    public final void M() {
        this.f2209g.e(this.f2208f);
    }

    @Override // s2.e
    public final void d(String str, String str2) {
        this.f2209g.o(this.f2208f, str, str2);
    }

    @Override // r2.d
    public final void e() {
        this.f2209g.a(this.f2208f);
    }

    @Override // r2.d
    public final void f(n nVar) {
        this.f2209g.d(this.f2208f, nVar);
    }

    @Override // r2.d
    public final void m() {
        this.f2209g.i(this.f2208f);
    }

    @Override // r2.d
    public final void q() {
        this.f2209g.l(this.f2208f);
    }
}
