package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uf {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f12770a;

    /* renamed from: b, reason: collision with root package name */
    private final vf f12771b;

    public uf(Handler handler, vf vfVar) {
        Objects.requireNonNull(handler);
        this.f12770a = handler;
        this.f12771b = vfVar;
    }

    public final void b(int i7) {
        this.f12770a.post(new tf(this, i7));
    }

    public final void c(int i7, long j7, long j8) {
        this.f12770a.post(new qf(this, i7, j7, j8));
    }

    public final void d(String str, long j7, long j8) {
        this.f12770a.post(new of(this, str, j7, j8));
    }

    public final void e(tg tgVar) {
        this.f12770a.post(new sf(this, tgVar));
    }

    public final void f(tg tgVar) {
        this.f12770a.post(new nf(this, tgVar));
    }

    public final void g(xe xeVar) {
        this.f12770a.post(new pf(this, xeVar));
    }
}
