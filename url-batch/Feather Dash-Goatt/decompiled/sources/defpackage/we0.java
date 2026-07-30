package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class we0 {
    public final Object a;
    public final ye0 b;
    public int d;
    public we0 e;
    public boolean f;
    public int c = -1;
    public final av0 g = gb0.F(null);

    public we0(Object obj, ye0 ye0Var) {
        this.a = obj;
        this.b = ye0Var;
    }

    public final we0 a() {
        if (this.f) {
            r80.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.d.add(this);
            we0 we0Var = (we0) this.g.getValue();
            if (we0Var != null) {
                we0Var.a();
            } else {
                we0Var = null;
            }
            this.e = we0Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            r80.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.d.remove(this);
            we0 we0Var = this.e;
            if (we0Var != null) {
                we0Var.b();
            }
            this.e = null;
        }
    }
}
