package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class k8 implements qt {
    public final qt f;
    public int g = 0;
    public int h = -1;
    public int i = -1;

    public k8(rc0 rc0Var) {
        this.f = rc0Var;
    }

    public final void a() {
        int i = this.g;
        if (i == 0) {
            return;
        }
        qt qtVar = this.f;
        if (i == 1) {
            qtVar.p(this.h, this.i);
        } else if (i == 2) {
            qtVar.d(this.h, this.i);
        } else if (i == 3) {
            qtVar.o(this.h, this.i);
        }
        this.g = 0;
    }

    @Override // defpackage.qt
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

    @Override // defpackage.qt
    public final void e(int i, int i2) {
        a();
        this.f.e(i, i2);
    }

    @Override // defpackage.qt
    public final void o(int i, int i2) {
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

    @Override // defpackage.qt
    public final void p(int i, int i2) {
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
