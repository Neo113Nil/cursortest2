package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class b51 {

    /* renamed from: a, reason: collision with root package name */
    private final t61 f3253a;

    /* renamed from: b, reason: collision with root package name */
    private final View f3254b;

    /* renamed from: c, reason: collision with root package name */
    private final sr2 f3255c;

    /* renamed from: d, reason: collision with root package name */
    private final eu0 f3256d;

    public b51(View view, eu0 eu0Var, t61 t61Var, sr2 sr2Var) {
        this.f3254b = view;
        this.f3256d = eu0Var;
        this.f3253a = t61Var;
        this.f3255c = sr2Var;
    }

    public static final hi1<lc1> f(final Context context, final po0 po0Var, final rr2 rr2Var, final ks2 ks2Var) {
        return new hi1<>(new lc1() { // from class: com.google.android.gms.internal.ads.z41
            @Override // com.google.android.gms.internal.ads.lc1
            public final void m() {
                y2.t.t().n(context, po0Var.f10301f, rr2Var.D.toString(), ks2Var.f7620f);
            }
        }, wo0.f13899f);
    }

    public static final Set<hi1<lc1>> g(n61 n61Var) {
        return Collections.singleton(new hi1(n61Var, wo0.f13899f));
    }

    public static final hi1<lc1> h(l61 l61Var) {
        return new hi1<>(l61Var, wo0.f13898e);
    }

    public final View a() {
        return this.f3254b;
    }

    public final eu0 b() {
        return this.f3256d;
    }

    public final t61 c() {
        return this.f3253a;
    }

    public jc1 d(Set<hi1<lc1>> set) {
        return new jc1(set);
    }

    public final sr2 e() {
        return this.f3255c;
    }
}
