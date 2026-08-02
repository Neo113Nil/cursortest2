package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* loaded from: classes.dex */
public final class M3 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final C0467ef f6322a;

    public M3(C0467ef c0467ef) {
        super(c0467ef.e(), "[ClientApiTrackingStatusToggle]");
        this.f6322a = c0467ef;
    }

    public final void a(boolean z) {
        updateState(z);
        this.f6322a.f(z);
    }
}
