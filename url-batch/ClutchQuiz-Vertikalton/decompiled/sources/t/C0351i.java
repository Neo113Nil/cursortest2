package t;

import s.C0340d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351i extends AbstractC0358p {
    @Override // t.InterfaceC0346d
    public final void a(InterfaceC0346d interfaceC0346d) {
        C0348f c0348f = this.h;
        if (c0348f.f3692c && !c0348f.f3696j) {
            c0348f.d((int) ((((C0348f) c0348f.f3698l.get(0)).f3695g * ((s.h) this.f3712b).q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0358p
    public final void d() {
        C0340d c0340d = this.f3712b;
        s.h hVar = (s.h) c0340d;
        int i = hVar.f3628r0;
        int i2 = hVar.f3629s0;
        int i3 = hVar.f3631u0;
        C0348f c0348f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0348f.f3698l.add(c0340d.f3515T.d.h);
                this.f3712b.f3515T.d.h.f3697k.add(c0348f);
                c0348f.f3694f = i;
            } else if (i2 != -1) {
                c0348f.f3698l.add(c0340d.f3515T.d.i);
                this.f3712b.f3515T.d.i.f3697k.add(c0348f);
                c0348f.f3694f = -i2;
            } else {
                c0348f.f3691b = true;
                c0348f.f3698l.add(c0340d.f3515T.d.i);
                this.f3712b.f3515T.d.i.f3697k.add(c0348f);
            }
            m(this.f3712b.d.h);
            m(this.f3712b.d.i);
            return;
        }
        if (i != -1) {
            c0348f.f3698l.add(c0340d.f3515T.f3529e.h);
            this.f3712b.f3515T.f3529e.h.f3697k.add(c0348f);
            c0348f.f3694f = i;
        } else if (i2 != -1) {
            c0348f.f3698l.add(c0340d.f3515T.f3529e.i);
            this.f3712b.f3515T.f3529e.i.f3697k.add(c0348f);
            c0348f.f3694f = -i2;
        } else {
            c0348f.f3691b = true;
            c0348f.f3698l.add(c0340d.f3515T.f3529e.i);
            this.f3712b.f3515T.f3529e.i.f3697k.add(c0348f);
        }
        m(this.f3712b.f3529e.h);
        m(this.f3712b.f3529e.i);
    }

    @Override // t.AbstractC0358p
    public final void e() {
        C0340d c0340d = this.f3712b;
        int i = ((s.h) c0340d).f3631u0;
        C0348f c0348f = this.h;
        if (i == 1) {
            c0340d.f3520Y = c0348f.f3695g;
        } else {
            c0340d.f3521Z = c0348f.f3695g;
        }
    }

    @Override // t.AbstractC0358p
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0358p
    public final boolean k() {
        return false;
    }

    public final void m(C0348f c0348f) {
        C0348f c0348f2 = this.h;
        c0348f2.f3697k.add(c0348f);
        c0348f.f3698l.add(c0348f2);
    }
}
