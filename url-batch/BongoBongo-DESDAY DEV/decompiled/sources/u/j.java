package u;

import java.util.Iterator;
import t.C0297a;

/* loaded from: classes.dex */
public final class j extends o {
    @Override // u.InterfaceC0303d
    public final void a(InterfaceC0303d interfaceC0303d) {
        C0297a c0297a = (C0297a) this.f3944b;
        int i = c0297a.f3725s0;
        f fVar = this.f3949h;
        Iterator it = fVar.f3930l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((f) it.next()).f3926g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + c0297a.f3727u0);
        } else {
            fVar.d(i2 + c0297a.f3727u0);
        }
    }

    @Override // u.o
    public final void d() {
        t.d dVar = this.f3944b;
        if (dVar instanceof C0297a) {
            f fVar = this.f3949h;
            fVar.f3922b = true;
            C0297a c0297a = (C0297a) dVar;
            int i = c0297a.f3725s0;
            boolean z2 = c0297a.f3726t0;
            int i2 = 0;
            if (i == 0) {
                fVar.f3924e = 4;
                while (i2 < c0297a.f3891r0) {
                    t.d dVar2 = c0297a.f3890q0[i2];
                    if (z2 || dVar2.f3788g0 != 8) {
                        f fVar2 = dVar2.d.f3949h;
                        fVar2.f3929k.add(fVar);
                        fVar.f3930l.add(fVar2);
                    }
                    i2++;
                }
                m(this.f3944b.d.f3949h);
                m(this.f3944b.d.i);
                return;
            }
            if (i == 1) {
                fVar.f3924e = 5;
                while (i2 < c0297a.f3891r0) {
                    t.d dVar3 = c0297a.f3890q0[i2];
                    if (z2 || dVar3.f3788g0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.f3929k.add(fVar);
                        fVar.f3930l.add(fVar3);
                    }
                    i2++;
                }
                m(this.f3944b.d.f3949h);
                m(this.f3944b.d.i);
                return;
            }
            if (i == 2) {
                fVar.f3924e = 6;
                while (i2 < c0297a.f3891r0) {
                    t.d dVar4 = c0297a.f3890q0[i2];
                    if (z2 || dVar4.f3788g0 != 8) {
                        f fVar4 = dVar4.f3783e.f3949h;
                        fVar4.f3929k.add(fVar);
                        fVar.f3930l.add(fVar4);
                    }
                    i2++;
                }
                m(this.f3944b.f3783e.f3949h);
                m(this.f3944b.f3783e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f3924e = 7;
            while (i2 < c0297a.f3891r0) {
                t.d dVar5 = c0297a.f3890q0[i2];
                if (z2 || dVar5.f3788g0 != 8) {
                    f fVar5 = dVar5.f3783e.i;
                    fVar5.f3929k.add(fVar);
                    fVar.f3930l.add(fVar5);
                }
                i2++;
            }
            m(this.f3944b.f3783e.f3949h);
            m(this.f3944b.f3783e.i);
        }
    }

    @Override // u.o
    public final void e() {
        t.d dVar = this.f3944b;
        if (dVar instanceof C0297a) {
            int i = ((C0297a) dVar).f3725s0;
            f fVar = this.f3949h;
            if (i == 0 || i == 1) {
                dVar.f3774Y = fVar.f3926g;
            } else {
                dVar.f3775Z = fVar.f3926g;
            }
        }
    }

    @Override // u.o
    public final void f() {
        this.f3945c = null;
        this.f3949h.c();
    }

    @Override // u.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f3949h;
        fVar2.f3929k.add(fVar);
        fVar.f3930l.add(fVar2);
    }
}
