package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class x93 {

    /* renamed from: d, reason: collision with root package name */
    static final x93 f14099d = new x93();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f14100a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f14101b;

    /* renamed from: c, reason: collision with root package name */
    x93 f14102c;

    x93() {
        this.f14100a = null;
        this.f14101b = null;
    }

    x93(Runnable runnable, Executor executor) {
        this.f14100a = runnable;
        this.f14101b = executor;
    }
}
