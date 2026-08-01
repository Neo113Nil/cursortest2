package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x7 implements zq {
    public final zq f;
    public int g = 0;
    public int h = -1;
    public int i = -1;

    public x7(k0 k0Var) {
        this.f = k0Var;
    }

    public final void a() {
        int i = this.g;
        if (i == 0) {
            return;
        }
        zq zqVar = this.f;
        if (i == 1) {
            zqVar.q(this.h, this.i);
        } else if (i == 2) {
            zqVar.f(this.h, this.i);
        } else if (i == 3) {
            zqVar.p(this.h, this.i);
        }
        this.g = 0;
    }

    @Override // defpackage.zq
    public final void f(int i, int i2) {
        int i3;
        if (this.g == 2 && (i3 = this.h) >= i && i3 <= i + i2) {
            this.i += i2;
            this.h = i;
        } else {
            a();
            this.h = i;
            this.i = i2;
            this.g = 2;
        }
    }

    @Override // defpackage.zq
    public final void g(int i, int i2) {
        a();
        this.f.g(i, i2);
    }

    @Override // defpackage.zq
    public final void p(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.g == 3 && i <= (i4 = this.i + (i3 = this.h)) && (i5 = i + i2) >= i3) {
            this.h = Math.min(i, i3);
            this.i = Math.max(i4, i5) - this.h;
        } else {
            a();
            this.h = i;
            this.i = i2;
            this.g = 3;
        }
    }

    @Override // defpackage.zq
    public final void q(int i, int i2) {
        int i3;
        if (this.g == 1 && i >= (i3 = this.h)) {
            int i4 = this.i;
            if (i <= i3 + i4) {
                this.i = i4 + i2;
                this.h = Math.min(i, i3);
                return;
            }
        }
        a();
        this.h = i;
        this.i = i2;
        this.g = 1;
    }
}
