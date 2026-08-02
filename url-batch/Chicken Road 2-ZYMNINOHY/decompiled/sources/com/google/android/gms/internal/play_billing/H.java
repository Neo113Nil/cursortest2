package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: d, reason: collision with root package name */
    public static final H f5845d = new H();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f5846a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5847b;

    /* renamed from: c, reason: collision with root package name */
    public H f5848c;

    public H() {
        this.f5846a = null;
        this.f5847b = null;
    }

    public H(Runnable runnable, Executor executor) {
        this.f5846a = runnable;
        this.f5847b = executor;
    }
}
