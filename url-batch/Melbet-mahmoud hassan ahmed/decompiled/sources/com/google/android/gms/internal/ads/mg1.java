package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mg1 {

    /* renamed from: a, reason: collision with root package name */
    private final Set<hi1<pc1>> f8542a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set<hi1<td1>> f8543b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set<hi1<yu>> f8544c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Set<hi1<pi1>> f8545d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Set<hi1<va1>> f8546e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Set<hi1<qb1>> f8547f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Set<hi1<wc1>> f8548g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final Set<hi1<lc1>> f8549h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Set<hi1<ya1>> f8550i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final Set<hi1<o03>> f8551j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final Set<hi1<fe>> f8552k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final Set<hi1<mb1>> f8553l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private final Set<hi1<jd1>> f8554m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final Set<hi1<z2.q>> f8555n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private ap2 f8556o;

    public final mg1 d(yu yuVar, Executor executor) {
        this.f8544c.add(new hi1<>(yuVar, executor));
        return this;
    }

    public final mg1 e(ya1 ya1Var, Executor executor) {
        this.f8550i.add(new hi1<>(ya1Var, executor));
        return this;
    }

    public final mg1 f(mb1 mb1Var, Executor executor) {
        this.f8553l.add(new hi1<>(mb1Var, executor));
        return this;
    }

    public final mg1 g(qb1 qb1Var, Executor executor) {
        this.f8547f.add(new hi1<>(qb1Var, executor));
        return this;
    }

    public final mg1 h(va1 va1Var, Executor executor) {
        this.f8546e.add(new hi1<>(va1Var, executor));
        return this;
    }

    public final mg1 i(lc1 lc1Var, Executor executor) {
        this.f8549h.add(new hi1<>(lc1Var, executor));
        return this;
    }

    public final mg1 j(wc1 wc1Var, Executor executor) {
        this.f8548g.add(new hi1<>(wc1Var, executor));
        return this;
    }

    public final mg1 k(z2.q qVar, Executor executor) {
        this.f8555n.add(new hi1<>(qVar, executor));
        return this;
    }

    public final mg1 l(jd1 jd1Var, Executor executor) {
        this.f8554m.add(new hi1<>(jd1Var, executor));
        return this;
    }

    public final mg1 m(td1 td1Var, Executor executor) {
        this.f8543b.add(new hi1<>(td1Var, executor));
        return this;
    }

    public final mg1 n(fe feVar, Executor executor) {
        this.f8552k.add(new hi1<>(feVar, executor));
        return this;
    }

    public final mg1 o(pi1 pi1Var, Executor executor) {
        this.f8545d.add(new hi1<>(pi1Var, executor));
        return this;
    }

    public final mg1 p(ap2 ap2Var) {
        this.f8556o = ap2Var;
        return this;
    }

    public final og1 q() {
        return new og1(this, null);
    }
}
