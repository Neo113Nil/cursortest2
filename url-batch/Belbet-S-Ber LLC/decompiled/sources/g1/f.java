package g1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f implements j0 {

    /* renamed from: f, reason: collision with root package name */
    public final j0 f1646f;

    /* renamed from: g, reason: collision with root package name */
    public int f1647g = 0;
    public int h = -1;
    public int i = -1;

    public f(a0.a aVar) {
        this.f1646f = aVar;
    }

    public final void a() {
        int i = this.f1647g;
        if (i == 0) {
            return;
        }
        j0 j0Var = this.f1646f;
        if (i == 1) {
            j0Var.u(this.h, this.i);
        } else if (i == 2) {
            j0Var.h(this.h, this.i);
        } else if (i == 3) {
            j0Var.t(this.h, this.i);
        }
        this.f1647g = 0;
    }

    @Override // g1.j0
    public final void h(int i, int i4) {
        int i5;
        if (this.f1647g == 2 && (i5 = this.h) >= i && i5 <= i + i4) {
            this.i += i4;
            this.h = i;
        } else {
            a();
            this.h = i;
            this.i = i4;
            this.f1647g = 2;
        }
    }

    @Override // g1.j0
    public final void i(int i, int i4) {
        a();
        this.f1646f.i(i, i4);
    }

    @Override // g1.j0
    public final void t(int i, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f1647g == 3 && i <= (i6 = this.i + (i5 = this.h)) && (i7 = i + i4) >= i5) {
            this.h = Math.min(i, i5);
            this.i = Math.max(i6, i7) - this.h;
        } else {
            a();
            this.h = i;
            this.i = i4;
            this.f1647g = 3;
        }
    }

    @Override // g1.j0
    public final void u(int i, int i4) {
        int i5;
        if (this.f1647g == 1 && i >= (i5 = this.h)) {
            int i6 = this.i;
            if (i <= i5 + i6) {
                this.i = i6 + i4;
                this.h = Math.min(i, i5);
                return;
            }
        }
        a();
        this.h = i;
        this.i = i4;
        this.f1647g = 1;
    }
}
