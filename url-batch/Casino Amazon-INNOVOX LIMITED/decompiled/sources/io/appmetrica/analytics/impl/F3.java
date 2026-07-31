package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* loaded from: classes3.dex */
public final class F3 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final C0047af f838a;

    public F3(C0047af c0047af) {
        super(c0047af.e(), "[ClientApiTrackingStatusToggle]");
        this.f838a = c0047af;
    }

    public final void a(boolean z) {
        updateState(z);
        this.f838a.f(z);
    }
}
