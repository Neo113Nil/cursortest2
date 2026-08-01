package t;

import java.util.Iterator;
import s.C0294a;

/* loaded from: classes.dex */
public final class j extends o {
    @Override // t.InterfaceC0300d
    public final void a(InterfaceC0300d interfaceC0300d) {
        C0294a c0294a = (C0294a) this.f3796b;
        int i = c0294a.f3525s0;
        f fVar = this.h;
        Iterator it = fVar.f3782l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((f) it.next()).f3779g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + c0294a.f3527u0);
        } else {
            fVar.d(i2 + c0294a.f3527u0);
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3796b;
        if (dVar instanceof C0294a) {
            f fVar = this.h;
            fVar.f3775b = true;
            C0294a c0294a = (C0294a) dVar;
            int i = c0294a.f3525s0;
            boolean z2 = c0294a.f3526t0;
            int i2 = 0;
            if (i == 0) {
                fVar.f3777e = 4;
                while (i2 < c0294a.f3685r0) {
                    s.d dVar2 = c0294a.f3684q0[i2];
                    if (z2 || dVar2.f3586g0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.f3781k.add(fVar);
                        fVar.f3782l.add(fVar2);
                    }
                    i2++;
                }
                m(this.f3796b.d.h);
                m(this.f3796b.d.i);
                return;
            }
            if (i == 1) {
                fVar.f3777e = 5;
                while (i2 < c0294a.f3685r0) {
                    s.d dVar3 = c0294a.f3684q0[i2];
                    if (z2 || dVar3.f3586g0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.f3781k.add(fVar);
                        fVar.f3782l.add(fVar3);
                    }
                    i2++;
                }
                m(this.f3796b.d.h);
                m(this.f3796b.d.i);
                return;
            }
            if (i == 2) {
                fVar.f3777e = 6;
                while (i2 < c0294a.f3685r0) {
                    s.d dVar4 = c0294a.f3684q0[i2];
                    if (z2 || dVar4.f3586g0 != 8) {
                        f fVar4 = dVar4.f3581e.h;
                        fVar4.f3781k.add(fVar);
                        fVar.f3782l.add(fVar4);
                    }
                    i2++;
                }
                m(this.f3796b.f3581e.h);
                m(this.f3796b.f3581e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f3777e = 7;
            while (i2 < c0294a.f3685r0) {
                s.d dVar5 = c0294a.f3684q0[i2];
                if (z2 || dVar5.f3586g0 != 8) {
                    f fVar5 = dVar5.f3581e.i;
                    fVar5.f3781k.add(fVar);
                    fVar.f3782l.add(fVar5);
                }
                i2++;
            }
            m(this.f3796b.f3581e.h);
            m(this.f3796b.f3581e.i);
        }
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3796b;
        if (dVar instanceof C0294a) {
            int i = ((C0294a) dVar).f3525s0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.f3572Y = fVar.f3779g;
            } else {
                dVar.f3573Z = fVar.f3779g;
            }
        }
    }

    @Override // t.o
    public final void f() {
        this.f3797c = null;
        this.h.c();
    }

    @Override // t.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f3781k.add(fVar);
        fVar.f3782l.add(fVar2);
    }
}
