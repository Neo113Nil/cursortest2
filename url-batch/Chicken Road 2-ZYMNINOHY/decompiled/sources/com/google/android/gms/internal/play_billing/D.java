package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    public static final D f5812c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f5813d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5814a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f5815b;

    static {
        if (N.f5889f) {
            f5813d = null;
            f5812c = null;
        } else {
            f5813d = new D(null, false);
            f5812c = new D(null, true);
        }
    }

    public D(Throwable th, boolean z) {
        this.f5814a = z;
        this.f5815b = th;
    }
}
