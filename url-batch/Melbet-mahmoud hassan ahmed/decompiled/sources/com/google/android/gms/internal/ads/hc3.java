package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class hc3 extends ca3<Void> implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f6181m;

    public hc3(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f6181m = runnable;
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final String i() {
        String valueOf = String.valueOf(this.f6181m);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f6181m.run();
        } catch (Throwable th) {
            x(th);
            d53.b(th);
            throw new RuntimeException(th);
        }
    }
}
