package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2481a4 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final C2834nf f38659a;

    public C2481a4(@NotNull C2834nf c2834nf) {
        super(c2834nf.e(), "[ClientApiTrackingStatusToggle]");
        this.f38659a = c2834nf;
    }

    public final void a(boolean z4) {
        updateState(z4);
        this.f38659a.f(z4);
    }
}
