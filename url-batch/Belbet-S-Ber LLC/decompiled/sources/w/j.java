package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j extends o {
    @Override // w.d
    public final void a(d dVar) {
        v.a aVar = (v.a) this.f3772b;
        int i = aVar.f3587s0;
        f fVar = this.h;
        ArrayList arrayList = fVar.f3758l;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            int i7 = ((f) obj).f3755g;
            if (i5 == -1 || i7 < i5) {
                i5 = i7;
            }
            if (i4 < i7) {
                i4 = i7;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i5 + aVar.f3589u0);
        } else {
            fVar.d(i4 + aVar.f3589u0);
        }
    }

    @Override // w.o
    public final void d() {
        v.d dVar = this.f3772b;
        if (dVar instanceof v.a) {
            f fVar = this.h;
            fVar.f3751b = true;
            ArrayList arrayList = fVar.f3758l;
            v.a aVar = (v.a) dVar;
            int i = aVar.f3587s0;
            boolean z4 = aVar.f3588t0;
            int i4 = 0;
            if (i == 0) {
                fVar.f3753e = 4;
                while (i4 < aVar.f3690r0) {
                    v.d dVar2 = aVar.f3689q0[i4];
                    if (z4 || dVar2.f3622g0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.f3757k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i4++;
                }
                m(this.f3772b.d.h);
                m(this.f3772b.d.i);
                return;
            }
            if (i == 1) {
                fVar.f3753e = 5;
                while (i4 < aVar.f3690r0) {
                    v.d dVar3 = aVar.f3689q0[i4];
                    if (z4 || dVar3.f3622g0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.f3757k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i4++;
                }
                m(this.f3772b.d.h);
                m(this.f3772b.d.i);
                return;
            }
            if (i == 2) {
                fVar.f3753e = 6;
                while (i4 < aVar.f3690r0) {
                    v.d dVar4 = aVar.f3689q0[i4];
                    if (z4 || dVar4.f3622g0 != 8) {
                        f fVar4 = dVar4.f3617e.h;
                        fVar4.f3757k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i4++;
                }
                m(this.f3772b.f3617e.h);
                m(this.f3772b.f3617e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f3753e = 7;
            while (i4 < aVar.f3690r0) {
                v.d dVar5 = aVar.f3689q0[i4];
                if (z4 || dVar5.f3622g0 != 8) {
                    f fVar5 = dVar5.f3617e.i;
                    fVar5.f3757k.add(fVar);
                    arrayList.add(fVar5);
                }
                i4++;
            }
            m(this.f3772b.f3617e.h);
            m(this.f3772b.f3617e.i);
        }
    }

    @Override // w.o
    public final void e() {
        v.d dVar = this.f3772b;
        if (dVar instanceof v.a) {
            int i = ((v.a) dVar).f3587s0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.Y = fVar.f3755g;
            } else {
                dVar.Z = fVar.f3755g;
            }
        }
    }

    @Override // w.o
    public final void f() {
        this.f3773c = null;
        this.h.c();
    }

    @Override // w.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f3757k.add(fVar);
        fVar.f3758l.add(fVar2);
    }
}
