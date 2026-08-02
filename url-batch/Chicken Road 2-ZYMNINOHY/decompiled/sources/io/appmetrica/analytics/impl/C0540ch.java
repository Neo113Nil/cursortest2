package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540ch extends Rg {
    public C0540ch(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        Dk dk;
        Tk tk;
        C0738k9 c0738k9 = this.f10886a.n;
        Rk rk = c0738k9.f12204c;
        if (rk.f10895g == 0) {
            dk = rk.f10892d.b();
            Dk b4 = rk.f10893e.b();
            if ((dk == null ? -1L : dk.f10210d) <= (b4 != null ? b4.f10210d : -1L)) {
                dk = b4;
            }
        } else {
            dk = rk.f10894f;
        }
        if (dk != null) {
            tk = new Tk();
            tk.f11010a = dk.f10210d;
            long andIncrement = dk.f10212f.getAndIncrement();
            Uk uk = dk.f10208b;
            uk.a(Uk.f11064g, Long.valueOf(dk.f10212f.get()));
            uk.b();
            tk.f11011b = andIncrement;
            tk.f11012c = TimeUnit.MILLISECONDS.toSeconds(dk.f10216j);
            tk.f11013d = dk.f10209c.f10331a;
        } else {
            long j4 = p5.f10803j;
            long a3 = rk.f10890b.a();
            L6 l6 = rk.f10889a.f11226e;
            Vk vk = Vk.BACKGROUND;
            l6.a(a3, vk, j4);
            tk = new Tk();
            tk.f11010a = a3;
            tk.f11013d = vk;
            tk.f11011b = 0L;
            tk.f11012c = 0L;
        }
        c0738k9.a(p5, tk);
        return false;
    }
}
