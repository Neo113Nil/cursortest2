package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Z f5816a;

    /* renamed from: b, reason: collision with root package name */
    public final W f5817b;

    public E(Z z, W w4) {
        this.f5816a = z;
        this.f5817b = w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5816a.f5891a != this) {
            return;
        }
        W w4 = this.f5817b;
        if (N.f5890g.R(this.f5816a, this, Z.g(w4))) {
            Z.i(this.f5816a);
        }
    }
}
