package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lp extends rd0 {
    @Override // defpackage.dh
    public final void a(dh dhVar) {
        s7 s7Var = (s7) this.b;
        int i = s7Var.s0;
        fh fhVar = this.h;
        ArrayList arrayList = fhVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((fh) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            fhVar.d(i3 + s7Var.u0);
        } else {
            fhVar.d(i2 + s7Var.u0);
        }
    }

    @Override // defpackage.rd0
    public final void d() {
        ae aeVar = this.b;
        if (aeVar instanceof s7) {
            fh fhVar = this.h;
            fhVar.b = true;
            ArrayList arrayList = fhVar.l;
            s7 s7Var = (s7) aeVar;
            int i = s7Var.s0;
            boolean z = s7Var.t0;
            int i2 = 0;
            if (i == 0) {
                fhVar.e = 4;
                while (i2 < s7Var.r0) {
                    ae aeVar2 = s7Var.q0[i2];
                    if (z || aeVar2.g0 != 8) {
                        fh fhVar2 = aeVar2.d.h;
                        fhVar2.k.add(fhVar);
                        arrayList.add(fhVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                fhVar.e = 5;
                while (i2 < s7Var.r0) {
                    ae aeVar3 = s7Var.q0[i2];
                    if (z || aeVar3.g0 != 8) {
                        fh fhVar3 = aeVar3.d.i;
                        fhVar3.k.add(fhVar);
                        arrayList.add(fhVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                fhVar.e = 6;
                while (i2 < s7Var.r0) {
                    ae aeVar4 = s7Var.q0[i2];
                    if (z || aeVar4.g0 != 8) {
                        fh fhVar4 = aeVar4.e.h;
                        fhVar4.k.add(fhVar);
                        arrayList.add(fhVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fhVar.e = 7;
            while (i2 < s7Var.r0) {
                ae aeVar5 = s7Var.q0[i2];
                if (z || aeVar5.g0 != 8) {
                    fh fhVar5 = aeVar5.e.i;
                    fhVar5.k.add(fhVar);
                    arrayList.add(fhVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.rd0
    public final void e() {
        ae aeVar = this.b;
        if (aeVar instanceof s7) {
            int i = ((s7) aeVar).s0;
            fh fhVar = this.h;
            if (i == 0 || i == 1) {
                aeVar.Y = fhVar.g;
            } else {
                aeVar.Z = fhVar.g;
            }
        }
    }

    @Override // defpackage.rd0
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.rd0
    public final boolean k() {
        return false;
    }

    public final void m(fh fhVar) {
        fh fhVar2 = this.h;
        fhVar2.k.add(fhVar);
        fhVar.l.add(fhVar2);
    }
}
