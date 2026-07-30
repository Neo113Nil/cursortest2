package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends p0 {
    @Override // r1.p0
    public final void B0() {
        i0 i0Var = this.f7870q.f7700q.B.f7849s;
        r6.k.c(i0Var);
        i0Var.t0();
    }

    @Override // p1.e0
    public final int a0(int i7) {
        q5.g r8 = this.f7870q.f7700q.r();
        p1.f0 k8 = r8.k();
        d0 d0Var = (d0) r8.f7527g;
        return k8.c((a1) d0Var.A.f3893d, d0Var.l(), i7);
    }

    @Override // p1.e0
    public final p1.n0 b(long j8) {
        o0(j8);
        a1 a1Var = this.f7870q;
        i0.d v5 = a1Var.f7700q.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                i0 i0Var = ((d0) objArr[i8]).B.f7849s;
                r6.k.c(i0Var);
                i0Var.f7789n = 3;
                i8++;
            } while (i8 < i7);
        }
        d0 d0Var = a1Var.f7700q;
        p0.A0(this, d0Var.f7733t.a(this, d0Var.l(), j8));
        return this;
    }

    @Override // p1.e0
    public final int c(int i7) {
        q5.g r8 = this.f7870q.f7700q.r();
        p1.f0 k8 = r8.k();
        d0 d0Var = (d0) r8.f7527g;
        return k8.g((a1) d0Var.A.f3893d, d0Var.l(), i7);
    }

    @Override // p1.e0
    public final int d0(int i7) {
        q5.g r8 = this.f7870q.f7700q.r();
        p1.f0 k8 = r8.k();
        d0 d0Var = (d0) r8.f7527g;
        return k8.e((a1) d0Var.A.f3893d, d0Var.l(), i7);
    }

    @Override // p1.e0
    public final int e0(int i7) {
        q5.g r8 = this.f7870q.f7700q.r();
        p1.f0 k8 = r8.k();
        d0 d0Var = (d0) r8.f7527g;
        return k8.b((a1) d0Var.A.f3893d, d0Var.l(), i7);
    }

    @Override // r1.o0
    public final int p0(p1.l lVar) {
        i0 i0Var = this.f7870q.f7700q.B.f7849s;
        r6.k.c(i0Var);
        e0 e0Var = i0Var.f7797v;
        if (!i0Var.f7790o) {
            l0 l0Var = i0Var.C;
            if (l0Var.f7833c == 2) {
                e0Var.f7759f = true;
                if (e0Var.f7755b) {
                    l0Var.f7838h = true;
                    l0Var.f7839i = true;
                }
            } else {
                e0Var.f7760g = true;
            }
        }
        s sVar = i0Var.l().P;
        if (sVar != null) {
            sVar.f7865m = true;
        }
        i0Var.E();
        s sVar2 = i0Var.l().P;
        if (sVar2 != null) {
            sVar2.f7865m = false;
        }
        Integer num = (Integer) e0Var.f7762i.get(lVar);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f7875v.put(lVar, Integer.valueOf(intValue));
        return intValue;
    }
}
