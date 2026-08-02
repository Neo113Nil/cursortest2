package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* loaded from: classes.dex */
public final class Mn {

    /* renamed from: a, reason: collision with root package name */
    public final M3 f6349a;

    /* renamed from: b, reason: collision with root package name */
    public final Eo f6350b;

    /* renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f6351c;

    public Mn(Toggle toggle) {
        M3 m3 = new M3(C0876ua.k().z());
        this.f6349a = m3;
        Eo eo = new Eo();
        this.f6350b = eo;
        this.f6351c = new ConjunctiveCompositeThreadSafeToggle(c2.f.L(m3, eo, toggle == null ? new xo() : toggle), "loc-def");
    }
}
