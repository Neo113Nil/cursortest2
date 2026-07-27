package io.appmetrica.analytics.impl;

import g4.AbstractC0466k;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final C0618ef f6984a = C1027ua.k().z();

    /* renamed from: b, reason: collision with root package name */
    public final SavableToggle f6985b;

    /* renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f6986c;

    /* renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f6987d;

    /* renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f6988e;

    /* renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f6989f;

    /* renamed from: g, reason: collision with root package name */
    public final SavableToggle f6990g;

    public J(C0754jm c0754jm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f6985b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f6986c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f6987d = outerStateToggle2;
        this.f6988e = new ConjunctiveCompositeThreadSafeToggle(AbstractC0466k.A0(savableToggle, outerStateToggle), "GAID");
        this.f6989f = new ConjunctiveCompositeThreadSafeToggle(AbstractC0466k.A0(savableToggle, outerStateToggle2), "HOAID");
        this.f6990g = savableToggle;
        a(c0754jm);
    }

    public final void a(C0754jm c0754jm) {
        boolean z = c0754jm.f8574p;
        boolean z5 = true;
        this.f6986c.update(!z || c0754jm.f8572n.f9230c);
        OuterStateToggle outerStateToggle = this.f6987d;
        if (z && !c0754jm.f8572n.f9232e) {
            z5 = false;
        }
        outerStateToggle.update(z5);
    }

    public final G a() {
        int i2;
        int i3 = 3;
        int i6 = 4;
        if (this.f6988e.getActualState()) {
            i2 = 1;
        } else if (this.f6985b.getActualState()) {
            i2 = !this.f6986c.getActualState() ? 3 : 4;
        } else {
            i2 = 2;
        }
        if (this.f6989f.getActualState()) {
            i3 = 1;
        } else if (!this.f6985b.getActualState()) {
            i3 = 2;
        } else if (this.f6987d.getActualState()) {
            i3 = 4;
        }
        if (this.f6990g.getActualState()) {
            i6 = 1;
        } else if (!this.f6985b.getActualState()) {
            i6 = 2;
        }
        return new G(i2, i3, i6);
    }
}
