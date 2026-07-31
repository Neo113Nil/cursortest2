package s;

import I.C0113p;
import I.C0119s0;
import u.InterfaceC0953v;

/* renamed from: s.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866i implements InterfaceC0953v {

    /* renamed from: a, reason: collision with root package name */
    public final C0880w f7371a;

    /* renamed from: b, reason: collision with root package name */
    public final C0864g f7372b;

    /* renamed from: c, reason: collision with root package name */
    public final C0860c f7373c;

    /* renamed from: d, reason: collision with root package name */
    public final F2.h f7374d;

    public C0866i(C0880w c0880w, C0864g c0864g, C0860c c0860c, F2.h hVar) {
        this.f7371a = c0880w;
        this.f7372b = c0864g;
        this.f7373c = c0860c;
        this.f7374d = hVar;
    }

    @Override // u.InterfaceC0953v
    public final int a() {
        return this.f7372b.n().f1502e;
    }

    @Override // u.InterfaceC0953v
    public final int b(Object obj) {
        return this.f7374d.b(obj);
    }

    @Override // u.InterfaceC0953v
    public final Object c(int i3) {
        Object f3 = this.f7374d.f(i3);
        return f3 == null ? this.f7372b.o(i3) : f3;
    }

    @Override // u.InterfaceC0953v
    public final Object d(int i3) {
        return this.f7372b.m(i3);
    }

    @Override // u.InterfaceC0953v
    public final void e(int i3, Object obj, C0113p c0113p, int i4) {
        int i5;
        c0113p.S(-462424778);
        if ((i4 & 6) == 0) {
            i5 = (c0113p.d(i3) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0113p.h(obj) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0113p.f(this) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            g2.i.C(obj, i3, this.f7371a.f7489q, Q.f.b(-824725566, new P0.m(this, i3, 4), c0113p), c0113p, ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112));
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0865h(this, i3, obj, i4, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0866i)) {
            return false;
        }
        return Z1.i.a(this.f7372b, ((C0866i) obj).f7372b);
    }

    public final int hashCode() {
        return this.f7372b.hashCode();
    }
}
