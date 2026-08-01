package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class on extends ra0 {
    @Override // defpackage.ef
    public final void a(ef efVar) {
        u7 u7Var = (u7) this.b;
        int i = u7Var.s0;
        gf gfVar = this.h;
        ArrayList arrayList = gfVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((gf) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            gfVar.d(i3 + u7Var.u0);
        } else {
            gfVar.d(i2 + u7Var.u0);
        }
    }

    @Override // defpackage.ra0
    public final void d() {
        ed edVar = this.b;
        if (edVar instanceof u7) {
            gf gfVar = this.h;
            gfVar.b = true;
            ArrayList arrayList = gfVar.l;
            u7 u7Var = (u7) edVar;
            int i = u7Var.s0;
            boolean z = u7Var.t0;
            int i2 = 0;
            if (i == 0) {
                gfVar.e = 4;
                while (i2 < u7Var.r0) {
                    ed edVar2 = u7Var.q0[i2];
                    if (z || edVar2.g0 != 8) {
                        gf gfVar2 = edVar2.d.h;
                        gfVar2.k.add(gfVar);
                        arrayList.add(gfVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                gfVar.e = 5;
                while (i2 < u7Var.r0) {
                    ed edVar3 = u7Var.q0[i2];
                    if (z || edVar3.g0 != 8) {
                        gf gfVar3 = edVar3.d.i;
                        gfVar3.k.add(gfVar);
                        arrayList.add(gfVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                gfVar.e = 6;
                while (i2 < u7Var.r0) {
                    ed edVar4 = u7Var.q0[i2];
                    if (z || edVar4.g0 != 8) {
                        gf gfVar4 = edVar4.e.h;
                        gfVar4.k.add(gfVar);
                        arrayList.add(gfVar4);
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
            gfVar.e = 7;
            while (i2 < u7Var.r0) {
                ed edVar5 = u7Var.q0[i2];
                if (z || edVar5.g0 != 8) {
                    gf gfVar5 = edVar5.e.i;
                    gfVar5.k.add(gfVar);
                    arrayList.add(gfVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.ra0
    public final void e() {
        ed edVar = this.b;
        if (edVar instanceof u7) {
            int i = ((u7) edVar).s0;
            gf gfVar = this.h;
            if (i == 0 || i == 1) {
                edVar.Y = gfVar.g;
            } else {
                edVar.Z = gfVar.g;
            }
        }
    }

    @Override // defpackage.ra0
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.ra0
    public final boolean k() {
        return false;
    }

    public final void m(gf gfVar) {
        gf gfVar2 = this.h;
        gfVar2.k.add(gfVar);
        gfVar.l.add(gfVar2);
    }
}
