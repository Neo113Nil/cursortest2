package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends o {
    @Override // t.d
    public final void a(d dVar) {
        s.a aVar = (s.a) this.f3355b;
        int i4 = aVar.f3209s0;
        f fVar = this.h;
        ArrayList arrayList = fVar.f3341l;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int i8 = ((f) obj).g;
            if (i6 == -1 || i8 < i6) {
                i6 = i8;
            }
            if (i5 < i8) {
                i5 = i8;
            }
        }
        if (i4 == 0 || i4 == 2) {
            fVar.d(i6 + aVar.f3211u0);
        } else {
            fVar.d(i5 + aVar.f3211u0);
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3355b;
        if (dVar instanceof s.a) {
            f fVar = this.h;
            fVar.f3334b = true;
            ArrayList arrayList = fVar.f3341l;
            s.a aVar = (s.a) dVar;
            int i4 = aVar.f3209s0;
            boolean z3 = aVar.f3210t0;
            int i5 = 0;
            if (i4 == 0) {
                fVar.f3336e = 4;
                while (i5 < aVar.f3312r0) {
                    s.d dVar2 = aVar.f3311q0[i5];
                    if (z3 || dVar2.f3242g0 != 8) {
                        f fVar2 = dVar2.f3237d.h;
                        fVar2.f3340k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i5++;
                }
                m(this.f3355b.f3237d.h);
                m(this.f3355b.f3237d.f3359i);
                return;
            }
            if (i4 == 1) {
                fVar.f3336e = 5;
                while (i5 < aVar.f3312r0) {
                    s.d dVar3 = aVar.f3311q0[i5];
                    if (z3 || dVar3.f3242g0 != 8) {
                        f fVar3 = dVar3.f3237d.f3359i;
                        fVar3.f3340k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i5++;
                }
                m(this.f3355b.f3237d.h);
                m(this.f3355b.f3237d.f3359i);
                return;
            }
            if (i4 == 2) {
                fVar.f3336e = 6;
                while (i5 < aVar.f3312r0) {
                    s.d dVar4 = aVar.f3311q0[i5];
                    if (z3 || dVar4.f3242g0 != 8) {
                        f fVar4 = dVar4.f3239e.h;
                        fVar4.f3340k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i5++;
                }
                m(this.f3355b.f3239e.h);
                m(this.f3355b.f3239e.f3359i);
                return;
            }
            if (i4 != 3) {
                return;
            }
            fVar.f3336e = 7;
            while (i5 < aVar.f3312r0) {
                s.d dVar5 = aVar.f3311q0[i5];
                if (z3 || dVar5.f3242g0 != 8) {
                    f fVar5 = dVar5.f3239e.f3359i;
                    fVar5.f3340k.add(fVar);
                    arrayList.add(fVar5);
                }
                i5++;
            }
            m(this.f3355b.f3239e.h);
            m(this.f3355b.f3239e.f3359i);
        }
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3355b;
        if (dVar instanceof s.a) {
            int i4 = ((s.a) dVar).f3209s0;
            f fVar = this.h;
            if (i4 == 0 || i4 == 1) {
                dVar.Y = fVar.g;
            } else {
                dVar.Z = fVar.g;
            }
        }
    }

    @Override // t.o
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // t.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f3340k.add(fVar);
        fVar.f3341l.add(fVar2);
    }
}
