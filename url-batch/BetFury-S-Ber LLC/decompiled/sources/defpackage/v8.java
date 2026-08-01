package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v8 implements oy {
    public final oy f;
    public int g = 0;
    public int h = -1;
    public int i = -1;

    public v8(o0 o0Var) {
        this.f = o0Var;
    }

    public final void a() {
        int i = this.g;
        if (i == 0) {
            return;
        }
        oy oyVar = this.f;
        if (i == 1) {
            oyVar.n(this.h, this.i);
        } else if (i == 2) {
            oyVar.d(this.h, this.i);
        } else if (i == 3) {
            oyVar.m(this.h, this.i);
        }
        this.g = 0;
    }

    @Override // defpackage.oy
    public final void d(int i, int i2) {
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

    @Override // defpackage.oy
    public final void e(int i, int i2) {
        a();
        this.f.e(i, i2);
    }

    @Override // defpackage.oy
    public final void m(int i, int i2) {
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

    @Override // defpackage.oy
    public final void n(int i, int i2) {
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
