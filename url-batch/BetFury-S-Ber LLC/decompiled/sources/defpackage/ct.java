package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ct extends vn0 {
    @Override // defpackage.jj
    public final void a(jj jjVar) {
        e8 e8Var = (e8) this.b;
        int i = e8Var.s0;
        mj mjVar = this.h;
        ArrayList arrayList = mjVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((mj) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            mjVar.d(i3 + e8Var.u0);
        } else {
            mjVar.d(i2 + e8Var.u0);
        }
    }

    @Override // defpackage.vn0
    public final void d() {
        rf rfVar = this.b;
        if (rfVar instanceof e8) {
            mj mjVar = this.h;
            mjVar.b = true;
            ArrayList arrayList = mjVar.l;
            e8 e8Var = (e8) rfVar;
            int i = e8Var.s0;
            boolean z = e8Var.t0;
            int i2 = 0;
            if (i == 0) {
                mjVar.e = lj.LEFT;
                while (i2 < e8Var.r0) {
                    rf rfVar2 = e8Var.q0[i2];
                    if (z || rfVar2.h0 != 8) {
                        mj mjVar2 = rfVar2.d.h;
                        mjVar2.k.add(mjVar);
                        arrayList.add(mjVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                mjVar.e = lj.RIGHT;
                while (i2 < e8Var.r0) {
                    rf rfVar3 = e8Var.q0[i2];
                    if (z || rfVar3.h0 != 8) {
                        mj mjVar3 = rfVar3.d.i;
                        mjVar3.k.add(mjVar);
                        arrayList.add(mjVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                mjVar.e = lj.TOP;
                while (i2 < e8Var.r0) {
                    rf rfVar4 = e8Var.q0[i2];
                    if (z || rfVar4.h0 != 8) {
                        mj mjVar4 = rfVar4.e.h;
                        mjVar4.k.add(mjVar);
                        arrayList.add(mjVar4);
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
            mjVar.e = lj.BOTTOM;
            while (i2 < e8Var.r0) {
                rf rfVar5 = e8Var.q0[i2];
                if (z || rfVar5.h0 != 8) {
                    mj mjVar5 = rfVar5.e.i;
                    mjVar5.k.add(mjVar);
                    arrayList.add(mjVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.vn0
    public final void e() {
        rf rfVar = this.b;
        if (rfVar instanceof e8) {
            int i = ((e8) rfVar).s0;
            mj mjVar = this.h;
            if (i == 0 || i == 1) {
                rfVar.Z = mjVar.g;
            } else {
                rfVar.a0 = mjVar.g;
            }
        }
    }

    @Override // defpackage.vn0
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.vn0
    public final boolean k() {
        return false;
    }

    public final void m(mj mjVar) {
        mj mjVar2 = this.h;
        mjVar2.k.add(mjVar);
        mjVar.l.add(mjVar2);
    }
}
