package z2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends o {
    @Override // z2.d
    public final void a(d dVar) {
        y2.a aVar = (y2.a) this.f9162b;
        int i = aVar.f8719s0;
        f fVar = this.f9168h;
        ArrayList arrayList = fVar.f9147l;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = -1;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = ((f) obj).f9143g;
            if (i9 == -1 || i11 < i9) {
                i9 = i11;
            }
            if (i8 < i11) {
                i8 = i11;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i9 + aVar.f8721u0);
        } else {
            fVar.d(i8 + aVar.f8721u0);
        }
    }

    @Override // z2.o
    public final void d() {
        y2.d dVar = this.f9162b;
        if (dVar instanceof y2.a) {
            f fVar = this.f9168h;
            fVar.f9138b = true;
            ArrayList arrayList = fVar.f9147l;
            y2.a aVar = (y2.a) dVar;
            int i = aVar.f8719s0;
            boolean z3 = aVar.f8720t0;
            int i8 = 0;
            if (i == 0) {
                fVar.f9141e = 4;
                while (i8 < aVar.f8832r0) {
                    y2.d dVar2 = aVar.f8831q0[i8];
                    if (z3 || dVar2.f8760g0 != 8) {
                        f fVar2 = dVar2.f8753d.f9168h;
                        fVar2.f9146k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i8++;
                }
                m(this.f9162b.f8753d.f9168h);
                m(this.f9162b.f8753d.i);
                return;
            }
            if (i == 1) {
                fVar.f9141e = 5;
                while (i8 < aVar.f8832r0) {
                    y2.d dVar3 = aVar.f8831q0[i8];
                    if (z3 || dVar3.f8760g0 != 8) {
                        f fVar3 = dVar3.f8753d.i;
                        fVar3.f9146k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i8++;
                }
                m(this.f9162b.f8753d.f9168h);
                m(this.f9162b.f8753d.i);
                return;
            }
            if (i == 2) {
                fVar.f9141e = 6;
                while (i8 < aVar.f8832r0) {
                    y2.d dVar4 = aVar.f8831q0[i8];
                    if (z3 || dVar4.f8760g0 != 8) {
                        f fVar4 = dVar4.f8755e.f9168h;
                        fVar4.f9146k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i8++;
                }
                m(this.f9162b.f8755e.f9168h);
                m(this.f9162b.f8755e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f9141e = 7;
            while (i8 < aVar.f8832r0) {
                y2.d dVar5 = aVar.f8831q0[i8];
                if (z3 || dVar5.f8760g0 != 8) {
                    f fVar5 = dVar5.f8755e.i;
                    fVar5.f9146k.add(fVar);
                    arrayList.add(fVar5);
                }
                i8++;
            }
            m(this.f9162b.f8755e.f9168h);
            m(this.f9162b.f8755e.i);
        }
    }

    @Override // z2.o
    public final void e() {
        y2.d dVar = this.f9162b;
        if (dVar instanceof y2.a) {
            int i = ((y2.a) dVar).f8719s0;
            f fVar = this.f9168h;
            if (i == 0 || i == 1) {
                dVar.Y = fVar.f9143g;
            } else {
                dVar.Z = fVar.f9143g;
            }
        }
    }

    @Override // z2.o
    public final void f() {
        this.f9163c = null;
        this.f9168h.c();
    }

    @Override // z2.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f9168h;
        fVar2.f9146k.add(fVar);
        fVar.f9147l.add(fVar2);
    }
}
