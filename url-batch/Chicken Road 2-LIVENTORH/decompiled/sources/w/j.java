package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends o {
    @Override // w.d
    public final void a(d dVar) {
        v.a aVar = (v.a) this.f3550b;
        int i = aVar.f3365s0;
        f fVar = this.f3555h;
        ArrayList arrayList = fVar.f3536l;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            int i7 = ((f) obj).f3532g;
            if (i5 == -1 || i7 < i5) {
                i5 = i7;
            }
            if (i4 < i7) {
                i4 = i7;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i5 + aVar.f3367u0);
        } else {
            fVar.d(i4 + aVar.f3367u0);
        }
    }

    @Override // w.o
    public final void d() {
        v.d dVar = this.f3550b;
        if (dVar instanceof v.a) {
            f fVar = this.f3555h;
            fVar.f3528b = true;
            ArrayList arrayList = fVar.f3536l;
            v.a aVar = (v.a) dVar;
            int i = aVar.f3365s0;
            boolean z3 = aVar.f3366t0;
            int i4 = 0;
            if (i == 0) {
                fVar.f3530e = 4;
                while (i4 < aVar.f3472r0) {
                    v.d dVar2 = aVar.f3471q0[i4];
                    if (z3 || dVar2.f3402g0 != 8) {
                        f fVar2 = dVar2.d.f3555h;
                        fVar2.f3535k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i4++;
                }
                m(this.f3550b.d.f3555h);
                m(this.f3550b.d.i);
                return;
            }
            if (i == 1) {
                fVar.f3530e = 5;
                while (i4 < aVar.f3472r0) {
                    v.d dVar3 = aVar.f3471q0[i4];
                    if (z3 || dVar3.f3402g0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.f3535k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i4++;
                }
                m(this.f3550b.d.f3555h);
                m(this.f3550b.d.i);
                return;
            }
            if (i == 2) {
                fVar.f3530e = 6;
                while (i4 < aVar.f3472r0) {
                    v.d dVar4 = aVar.f3471q0[i4];
                    if (z3 || dVar4.f3402g0 != 8) {
                        f fVar4 = dVar4.f3397e.f3555h;
                        fVar4.f3535k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i4++;
                }
                m(this.f3550b.f3397e.f3555h);
                m(this.f3550b.f3397e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f3530e = 7;
            while (i4 < aVar.f3472r0) {
                v.d dVar5 = aVar.f3471q0[i4];
                if (z3 || dVar5.f3402g0 != 8) {
                    f fVar5 = dVar5.f3397e.i;
                    fVar5.f3535k.add(fVar);
                    arrayList.add(fVar5);
                }
                i4++;
            }
            m(this.f3550b.f3397e.f3555h);
            m(this.f3550b.f3397e.i);
        }
    }

    @Override // w.o
    public final void e() {
        v.d dVar = this.f3550b;
        if (dVar instanceof v.a) {
            int i = ((v.a) dVar).f3365s0;
            f fVar = this.f3555h;
            if (i == 0 || i == 1) {
                dVar.Y = fVar.f3532g;
            } else {
                dVar.Z = fVar.f3532g;
            }
        }
    }

    @Override // w.o
    public final void f() {
        this.f3551c = null;
        this.f3555h.c();
    }

    @Override // w.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f3555h;
        fVar2.f3535k.add(fVar);
        fVar.f3536l.add(fVar2);
    }
}
