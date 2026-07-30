package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0431Fn {
    public final Handler A00;
    public final InterfaceC0432Fo A01;

    public C0431Fn(Handler handler, InterfaceC0432Fo interfaceC0432Fo) {
        this.A00 = interfaceC0432Fo != null ? (Handler) C3M.A01(handler) : null;
        this.A01 = interfaceC0432Fo;
    }

    public final void A00(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fj
                @Override // java.lang.Runnable
                public final void run() {
                    C0431Fn.this.A02(i, j);
                }
            });
        }
    }

    public final void A01(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fa
                @Override // java.lang.Runnable
                public final void run() {
                    C0431Fn.this.A03(i, j);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j) {
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).ACr(i, j);
    }

    public final /* synthetic */ void A03(int i, long j) {
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).AD7(i, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i, C1836or c1836or) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0430Fm(this, i, c1836or));
        }
    }

    public final void A05(final C1836or c1836or, final C01835j c01835j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fg
                @Override // java.lang.Runnable
                public final void run() {
                    C0431Fn.this.A06(c1836or, c01835j);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C1836or c1836or, C01835j c01835j) {
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).AFk(c1836or);
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).AFl(c1836or, c01835j);
    }

    public final void A07(final C1789o4 c1789o4) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fi
                @Override // java.lang.Runnable
                public final void run() {
                    C0431Fn.this.A08(c1789o4);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C1789o4 c1789o4) {
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).AFr(c1789o4);
    }

    public final void A09(final C01805g c01805g) {
        c01805g.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fk
                @Override // java.lang.Runnable
                public final void run() {
                    C0431Fn.this.A0B(c01805g);
                }
            });
        }
    }

    public final void A0A(final C01805g c01805g) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fe
                @Override // java.lang.Runnable
                public final void run() {
                    C0431Fn.this.A0C(c01805g);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C01805g c01805g) {
        c01805g.A02();
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).AFe(c01805g);
    }

    public final /* synthetic */ void A0C(C01805g c01805g) {
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).AFf(c01805g);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ff
                @Override // java.lang.Runnable
                public final void run() {
                    C0431Fn.this.A0E(obj, elapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j) {
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).AEx(obj, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fh
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fd
                @Override // java.lang.Runnable
                public final void run() {
                    C0431Fn.this.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j2) {
        ((InterfaceC0432Fo) AbstractC01484a.A0f(this.A01)).AFd(str, j, j2);
    }
}
