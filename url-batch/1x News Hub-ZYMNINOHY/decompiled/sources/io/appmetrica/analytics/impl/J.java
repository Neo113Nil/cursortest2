package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final C0467ef f6183a = C0876ua.k().z();

    /* renamed from: b, reason: collision with root package name */
    public final SavableToggle f6184b;

    /* renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f6185c;

    /* renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f6186d;

    /* renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f6187e;
    public final ConjunctiveCompositeThreadSafeToggle f;

    /* renamed from: g, reason: collision with root package name */
    public final SavableToggle f6188g;

    public J(C0603jm c0603jm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f6184b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f6185c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f6186d = outerStateToggle2;
        this.f6187e = new ConjunctiveCompositeThreadSafeToggle(c2.f.L(savableToggle, outerStateToggle), "GAID");
        this.f = new ConjunctiveCompositeThreadSafeToggle(c2.f.L(savableToggle, outerStateToggle2), "HOAID");
        this.f6188g = savableToggle;
        a(c0603jm);
    }

    public final void a(C0603jm c0603jm) {
        boolean z = c0603jm.f7676p;
        boolean z2 = true;
        this.f6185c.update(!z || c0603jm.f7675n.f8291c);
        OuterStateToggle outerStateToggle = this.f6186d;
        if (z && !c0603jm.f7675n.f8293e) {
            z2 = false;
        }
        outerStateToggle.update(z2);
    }

    public final G a() {
        int i3;
        int i4 = 3;
        int i5 = 4;
        if (this.f6187e.getActualState()) {
            i3 = 1;
        } else if (this.f6184b.getActualState()) {
            i3 = !this.f6185c.getActualState() ? 3 : 4;
        } else {
            i3 = 2;
        }
        if (this.f.getActualState()) {
            i4 = 1;
        } else if (!this.f6184b.getActualState()) {
            i4 = 2;
        } else if (this.f6186d.getActualState()) {
            i4 = 4;
        }
        if (this.f6188g.getActualState()) {
            i5 = 1;
        } else if (!this.f6184b.getActualState()) {
            i5 = 2;
        }
        return new G(i3, i4, i5);
    }
}
