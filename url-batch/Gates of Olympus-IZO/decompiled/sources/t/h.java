package t;

import I.C0113p;
import I.C0119s0;
import s.C0865h;
import u.InterfaceC0953v;

/* loaded from: classes.dex */
public final class h implements InterfaceC0953v {

    /* renamed from: a, reason: collision with root package name */
    public final y f7586a;

    /* renamed from: b, reason: collision with root package name */
    public final g f7587b;

    /* renamed from: c, reason: collision with root package name */
    public final F2.h f7588c;

    public h(y yVar, g gVar, F2.h hVar) {
        this.f7586a = yVar;
        this.f7587b = gVar;
        this.f7588c = hVar;
    }

    @Override // u.InterfaceC0953v
    public final int a() {
        return this.f7587b.n().f1502e;
    }

    @Override // u.InterfaceC0953v
    public final int b(Object obj) {
        return this.f7588c.b(obj);
    }

    @Override // u.InterfaceC0953v
    public final Object c(int i3) {
        Object f3 = this.f7588c.f(i3);
        return f3 == null ? this.f7587b.o(i3) : f3;
    }

    @Override // u.InterfaceC0953v
    public final Object d(int i3) {
        return this.f7587b.m(i3);
    }

    @Override // u.InterfaceC0953v
    public final void e(int i3, Object obj, C0113p c0113p, int i4) {
        int i5;
        c0113p.S(1493551140);
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
            g2.i.C(obj, i3, this.f7586a.f7702o, Q.f.b(726189336, new P0.m(this, i3, 5), c0113p), c0113p, ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112));
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0865h(this, i3, obj, i4, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return Z1.i.a(this.f7587b, ((h) obj).f7587b);
    }

    public final int hashCode() {
        return this.f7587b.hashCode();
    }
}
