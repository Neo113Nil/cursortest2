package t;

import java.util.Iterator;
import s.C0295a;

/* loaded from: classes.dex */
public final class j extends o {
    @Override // t.InterfaceC0301d
    public final void a(InterfaceC0301d interfaceC0301d) {
        C0295a c0295a = (C0295a) this.f3764b;
        int i = c0295a.f3551s0;
        f fVar = this.h;
        Iterator it = fVar.f3750l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((f) it.next()).f3747g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + c0295a.f3553u0);
        } else {
            fVar.d(i2 + c0295a.f3553u0);
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3764b;
        if (dVar instanceof C0295a) {
            f fVar = this.h;
            fVar.f3743b = true;
            C0295a c0295a = (C0295a) dVar;
            int i = c0295a.f3551s0;
            boolean z2 = c0295a.f3552t0;
            int i2 = 0;
            if (i == 0) {
                fVar.f3745e = 4;
                while (i2 < c0295a.f3714r0) {
                    s.d dVar2 = c0295a.f3713q0[i2];
                    if (z2 || dVar2.f3612g0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.f3749k.add(fVar);
                        fVar.f3750l.add(fVar2);
                    }
                    i2++;
                }
                m(this.f3764b.d.h);
                m(this.f3764b.d.i);
                return;
            }
            if (i == 1) {
                fVar.f3745e = 5;
                while (i2 < c0295a.f3714r0) {
                    s.d dVar3 = c0295a.f3713q0[i2];
                    if (z2 || dVar3.f3612g0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.f3749k.add(fVar);
                        fVar.f3750l.add(fVar3);
                    }
                    i2++;
                }
                m(this.f3764b.d.h);
                m(this.f3764b.d.i);
                return;
            }
            if (i == 2) {
                fVar.f3745e = 6;
                while (i2 < c0295a.f3714r0) {
                    s.d dVar4 = c0295a.f3713q0[i2];
                    if (z2 || dVar4.f3612g0 != 8) {
                        f fVar4 = dVar4.f3607e.h;
                        fVar4.f3749k.add(fVar);
                        fVar.f3750l.add(fVar4);
                    }
                    i2++;
                }
                m(this.f3764b.f3607e.h);
                m(this.f3764b.f3607e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f3745e = 7;
            while (i2 < c0295a.f3714r0) {
                s.d dVar5 = c0295a.f3713q0[i2];
                if (z2 || dVar5.f3612g0 != 8) {
                    f fVar5 = dVar5.f3607e.i;
                    fVar5.f3749k.add(fVar);
                    fVar.f3750l.add(fVar5);
                }
                i2++;
            }
            m(this.f3764b.f3607e.h);
            m(this.f3764b.f3607e.i);
        }
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3764b;
        if (dVar instanceof C0295a) {
            int i = ((C0295a) dVar).f3551s0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.f3598Y = fVar.f3747g;
            } else {
                dVar.f3599Z = fVar.f3747g;
            }
        }
    }

    @Override // t.o
    public final void f() {
        this.f3765c = null;
        this.h.c();
    }

    @Override // t.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f3749k.add(fVar);
        fVar.f3750l.add(fVar2);
    }
}
