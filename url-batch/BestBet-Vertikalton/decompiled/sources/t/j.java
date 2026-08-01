package t;

import java.util.Iterator;
import s.C0316a;

/* loaded from: classes.dex */
public final class j extends o {
    @Override // t.InterfaceC0346d
    public final void a(InterfaceC0346d interfaceC0346d) {
        C0316a c0316a = (C0316a) this.f4111b;
        int i = c0316a.s0;
        f fVar = this.h;
        Iterator it = fVar.f4097l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((f) it.next()).f4094g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + c0316a.f3847u0);
        } else {
            fVar.d(i2 + c0316a.f3847u0);
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f4111b;
        if (dVar instanceof C0316a) {
            f fVar = this.h;
            fVar.f4090b = true;
            C0316a c0316a = (C0316a) dVar;
            int i = c0316a.s0;
            boolean z2 = c0316a.f3846t0;
            int i2 = 0;
            if (i == 0) {
                fVar.f4092e = 4;
                while (i2 < c0316a.f4006r0) {
                    s.d dVar2 = c0316a.f4005q0[i2];
                    if (z2 || dVar2.f3906g0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.f4096k.add(fVar);
                        fVar.f4097l.add(fVar2);
                    }
                    i2++;
                }
                m(this.f4111b.d.h);
                m(this.f4111b.d.i);
                return;
            }
            if (i == 1) {
                fVar.f4092e = 5;
                while (i2 < c0316a.f4006r0) {
                    s.d dVar3 = c0316a.f4005q0[i2];
                    if (z2 || dVar3.f3906g0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.f4096k.add(fVar);
                        fVar.f4097l.add(fVar3);
                    }
                    i2++;
                }
                m(this.f4111b.d.h);
                m(this.f4111b.d.i);
                return;
            }
            if (i == 2) {
                fVar.f4092e = 6;
                while (i2 < c0316a.f4006r0) {
                    s.d dVar4 = c0316a.f4005q0[i2];
                    if (z2 || dVar4.f3906g0 != 8) {
                        f fVar4 = dVar4.f3901e.h;
                        fVar4.f4096k.add(fVar);
                        fVar.f4097l.add(fVar4);
                    }
                    i2++;
                }
                m(this.f4111b.f3901e.h);
                m(this.f4111b.f3901e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f4092e = 7;
            while (i2 < c0316a.f4006r0) {
                s.d dVar5 = c0316a.f4005q0[i2];
                if (z2 || dVar5.f3906g0 != 8) {
                    f fVar5 = dVar5.f3901e.i;
                    fVar5.f4096k.add(fVar);
                    fVar.f4097l.add(fVar5);
                }
                i2++;
            }
            m(this.f4111b.f3901e.h);
            m(this.f4111b.f3901e.i);
        }
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f4111b;
        if (dVar instanceof C0316a) {
            int i = ((C0316a) dVar).s0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.f3892Y = fVar.f4094g;
            } else {
                dVar.f3893Z = fVar.f4094g;
            }
        }
    }

    @Override // t.o
    public final void f() {
        this.f4112c = null;
        this.h.c();
    }

    @Override // t.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f4096k.add(fVar);
        fVar.f4097l.add(fVar2);
    }
}
