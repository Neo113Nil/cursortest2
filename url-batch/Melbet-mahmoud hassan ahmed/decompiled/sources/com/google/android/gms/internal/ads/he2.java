package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class he2 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f6201a = new AtomicBoolean(false);

    public final void a(boolean z6) {
        this.f6201a.set(true);
    }

    public final boolean b() {
        return this.f6201a.get();
    }
}
