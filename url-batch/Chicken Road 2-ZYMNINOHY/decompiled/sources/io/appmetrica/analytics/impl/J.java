package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f10450a = C0817na.k().y();

    /* renamed from: b, reason: collision with root package name */
    public final SavableToggle f10451b;

    /* renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f10452c;

    /* renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f10453d;

    /* renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f10454e;

    /* renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f10455f;

    /* renamed from: g, reason: collision with root package name */
    public final SavableToggle f10456g;

    public J(C0622fm c0622fm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f10451b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f10452c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f10453d = outerStateToggle2;
        this.f10454e = new ConjunctiveCompositeThreadSafeToggle(d3.j.W(savableToggle, outerStateToggle), "GAID");
        this.f10455f = new ConjunctiveCompositeThreadSafeToggle(d3.j.W(savableToggle, outerStateToggle2), "HOAID");
        this.f10456g = savableToggle;
        a(c0622fm);
    }

    public final void a(C0622fm c0622fm) {
        boolean z = c0622fm.f11873p;
        boolean z4 = true;
        this.f10452c.update(!z || c0622fm.n.f12261c);
        OuterStateToggle outerStateToggle = this.f10453d;
        if (z && !c0622fm.n.f12263e) {
            z4 = false;
        }
        outerStateToggle.update(z4);
    }

    public final G a() {
        int i4;
        int i5 = 3;
        int i6 = 4;
        if (this.f10454e.getActualState()) {
            i4 = 1;
        } else if (this.f10451b.getActualState()) {
            i4 = !this.f10452c.getActualState() ? 3 : 4;
        } else {
            i4 = 2;
        }
        if (this.f10455f.getActualState()) {
            i5 = 1;
        } else if (!this.f10451b.getActualState()) {
            i5 = 2;
        } else if (this.f10453d.getActualState()) {
            i5 = 4;
        }
        if (this.f10456g.getActualState()) {
            i6 = 1;
        } else if (!this.f10451b.getActualState()) {
            i6 = 2;
        }
        return new G(i4, i5, i6);
    }
}
