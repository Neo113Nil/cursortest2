package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0425Fn {
    public final Handler A00;
    public final InterfaceC0426Fo A01;

    public C0425Fn(Handler handler, InterfaceC0426Fo interfaceC0426Fo) {
        this.A00 = interfaceC0426Fo != null ? (Handler) C3M.A01(handler) : null;
        this.A01 = interfaceC0426Fo;
    }

    public final void A00(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fj
                @Override // java.lang.Runnable
                public final void run() {
                    C0425Fn.this.A02(i, j);
                }
            });
        }
    }

    public final void A01(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fa
                @Override // java.lang.Runnable
                public final void run() {
                    C0425Fn.this.A03(i, j);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j) {
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).ACr(i, j);
    }

    public final /* synthetic */ void A03(int i, long j) {
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).AD7(i, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i, C1830or c1830or) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0424Fm(this, i, c1830or));
        }
    }

    public final void A05(final C1830or c1830or, final C01775j c01775j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fg
                @Override // java.lang.Runnable
                public final void run() {
                    C0425Fn.this.A06(c1830or, c01775j);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C1830or c1830or, C01775j c01775j) {
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).AFk(c1830or);
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).AFl(c1830or, c01775j);
    }

    public final void A07(final C1783o4 c1783o4) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fi
                @Override // java.lang.Runnable
                public final void run() {
                    C0425Fn.this.A08(c1783o4);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C1783o4 c1783o4) {
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).AFr(c1783o4);
    }

    public final void A09(final C01745g c01745g) {
        c01745g.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fk
                @Override // java.lang.Runnable
                public final void run() {
                    C0425Fn.this.A0B(c01745g);
                }
            });
        }
    }

    public final void A0A(final C01745g c01745g) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fe
                @Override // java.lang.Runnable
                public final void run() {
                    C0425Fn.this.A0C(c01745g);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C01745g c01745g) {
        c01745g.A02();
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).AFe(c01745g);
    }

    public final /* synthetic */ void A0C(C01745g c01745g) {
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).AFf(c01745g);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ff
                @Override // java.lang.Runnable
                public final void run() {
                    C0425Fn.this.A0E(obj, elapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j) {
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).AEx(obj, j);
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
                    C0425Fn.this.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j2) {
        ((InterfaceC0426Fo) AbstractC01424a.A0f(this.A01)).AFd(str, j, j2);
    }
}
