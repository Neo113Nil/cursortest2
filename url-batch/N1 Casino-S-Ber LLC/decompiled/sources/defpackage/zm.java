package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class zm extends ka0 {
    @Override // defpackage.ff
    public final void a(ff ffVar) {
        i7 i7Var = (i7) this.b;
        int i = i7Var.s0;
        hf hfVar = this.h;
        ArrayList arrayList = hfVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((hf) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            hfVar.d(i3 + i7Var.u0);
        } else {
            hfVar.d(i2 + i7Var.u0);
        }
    }

    @Override // defpackage.ka0
    public final void d() {
        ad adVar = this.b;
        if (adVar instanceof i7) {
            hf hfVar = this.h;
            hfVar.b = true;
            ArrayList arrayList = hfVar.l;
            i7 i7Var = (i7) adVar;
            int i = i7Var.s0;
            boolean z = i7Var.t0;
            int i2 = 0;
            if (i == 0) {
                hfVar.e = 4;
                while (i2 < i7Var.r0) {
                    ad adVar2 = i7Var.q0[i2];
                    if (z || adVar2.g0 != 8) {
                        hf hfVar2 = adVar2.d.h;
                        hfVar2.k.add(hfVar);
                        arrayList.add(hfVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                hfVar.e = 5;
                while (i2 < i7Var.r0) {
                    ad adVar3 = i7Var.q0[i2];
                    if (z || adVar3.g0 != 8) {
                        hf hfVar3 = adVar3.d.i;
                        hfVar3.k.add(hfVar);
                        arrayList.add(hfVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                hfVar.e = 6;
                while (i2 < i7Var.r0) {
                    ad adVar4 = i7Var.q0[i2];
                    if (z || adVar4.g0 != 8) {
                        hf hfVar4 = adVar4.e.h;
                        hfVar4.k.add(hfVar);
                        arrayList.add(hfVar4);
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
            hfVar.e = 7;
            while (i2 < i7Var.r0) {
                ad adVar5 = i7Var.q0[i2];
                if (z || adVar5.g0 != 8) {
                    hf hfVar5 = adVar5.e.i;
                    hfVar5.k.add(hfVar);
                    arrayList.add(hfVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.ka0
    public final void e() {
        ad adVar = this.b;
        if (adVar instanceof i7) {
            int i = ((i7) adVar).s0;
            hf hfVar = this.h;
            if (i == 0 || i == 1) {
                adVar.Y = hfVar.g;
            } else {
                adVar.Z = hfVar.g;
            }
        }
    }

    @Override // defpackage.ka0
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.ka0
    public final boolean k() {
        return false;
    }

    public final void m(hf hfVar) {
        hf hfVar2 = this.h;
        hfVar2.k.add(hfVar);
        hfVar.l.add(hfVar2);
    }
}
