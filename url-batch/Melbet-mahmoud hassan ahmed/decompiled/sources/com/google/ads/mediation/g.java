package com.google.ads.mediation;

import android.view.View;
import c3.v;
import java.util.Map;
import u2.l;
import u2.n;

/* loaded from: classes.dex */
final class g extends v {

    /* renamed from: s, reason: collision with root package name */
    private final u2.h f2207s;

    public g(u2.h hVar) {
        this.f2207s = hVar;
        w(hVar.d());
        y(hVar.f());
        u(hVar.b());
        x(hVar.e());
        v(hVar.c());
        t(hVar.a());
        C(hVar.h());
        D(hVar.i());
        B(hVar.g());
        J(hVar.k());
        A(true);
        z(true);
        K(hVar.j());
    }

    @Override // c3.v
    public final void E(View view, Map<String, View> map, Map<String, View> map2) {
        if (view instanceof n) {
            throw null;
        }
        if (l.f22480a.get(view) != null) {
            throw null;
        }
    }
}
