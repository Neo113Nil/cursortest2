package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hb0 extends ip0<ob0> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f6166c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final mb0 f6167d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6168e;

    public hb0(mb0 mb0Var) {
        this.f6167d = mb0Var;
    }

    public final void g() {
        synchronized (this.f6166c) {
            if (this.f6168e) {
                return;
            }
            this.f6168e = true;
            e(new eb0(this), new ep0());
            e(new fb0(this), new gb0(this));
        }
    }
}
