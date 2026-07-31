package com.google.android.gms.internal.ads;

import java.io.IOException;
import v2.a;

/* loaded from: classes.dex */
public final class wc extends qd {
    public wc(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", j8Var, i7, 24);
    }

    private final void c() {
        v2.a h7 = this.f10650b.h();
        if (h7 == null) {
            return;
        }
        try {
            a.C0146a c7 = h7.c();
            String d7 = jc.d(c7.a());
            if (d7 != null) {
                synchronized (this.f10653e) {
                    this.f10653e.i0(d7);
                    this.f10653e.h0(c7.b());
                    this.f10653e.N(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        if (this.f10650b.q()) {
            c();
            return;
        }
        synchronized (this.f10653e) {
            this.f10653e.i0((String) this.f10654f.invoke(null, this.f10650b.b()));
        }
    }

    @Override // com.google.android.gms.internal.ads.qd
    public final Void b() {
        if (this.f10650b.r()) {
            super.b();
            return null;
        }
        if (this.f10650b.q()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.qd, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
