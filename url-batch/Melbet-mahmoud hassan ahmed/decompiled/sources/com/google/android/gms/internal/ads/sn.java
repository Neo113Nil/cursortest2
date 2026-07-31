package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sn {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f11878a;

    /* renamed from: b, reason: collision with root package name */
    private final tn f11879b;

    public sn(Handler handler, tn tnVar) {
        Objects.requireNonNull(handler);
        this.f11878a = handler;
        this.f11879b = tnVar;
    }

    public final void b(String str, long j7, long j8) {
        this.f11878a.post(new mn(this, str, j7, j8));
    }

    public final void c(tg tgVar) {
        this.f11878a.post(new rn(this, tgVar));
    }

    public final void d(int i7, long j7) {
        this.f11878a.post(new on(this, i7, j7));
    }

    public final void e(tg tgVar) {
        this.f11878a.post(new ln(this, tgVar));
    }

    public final void f(xe xeVar) {
        this.f11878a.post(new nn(this, xeVar));
    }

    public final void g(Surface surface) {
        this.f11878a.post(new qn(this, surface));
    }

    public final void h(int i7, int i8, int i9, float f7) {
        this.f11878a.post(new pn(this, i7, i8, i9, f7));
    }
}
