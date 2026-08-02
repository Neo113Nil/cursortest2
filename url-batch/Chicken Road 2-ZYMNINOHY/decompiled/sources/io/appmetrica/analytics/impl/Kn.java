package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* loaded from: classes.dex */
public final class Kn {

    /* renamed from: a, reason: collision with root package name */
    public final E3 f10541a;

    /* renamed from: b, reason: collision with root package name */
    public final Do f10542b;

    /* renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f10543c;

    public Kn(Toggle toggle) {
        E3 e32 = new E3(C0817na.k().y());
        this.f10541a = e32;
        Do r12 = new Do();
        this.f10542b = r12;
        this.f10543c = new ConjunctiveCompositeThreadSafeToggle(d3.j.W(e32, r12, toggle == null ? new C1038vo() : toggle), "loc-def");
    }
}
