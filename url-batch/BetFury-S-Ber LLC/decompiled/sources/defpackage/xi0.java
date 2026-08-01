package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xi0 extends mc0 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public xi0(wm0 wm0Var) {
        this.a = 1;
        this.d = wm0Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.xm0
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((yi0) obj).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                wm0 wm0Var = (wm0) obj;
                if (i2 == wm0Var.a.size()) {
                    xm0 xm0Var = wm0Var.d;
                    if (xm0Var != null) {
                        xm0Var.a();
                    }
                    this.c = 0;
                    this.b = false;
                    wm0Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mc0, defpackage.xm0
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.mc0, defpackage.xm0
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((yi0) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    xm0 xm0Var = ((wm0) obj).d;
                    if (xm0Var != null) {
                        xm0Var.c();
                        break;
                    }
                }
                break;
        }
    }

    public xi0(yi0 yi0Var, int i) {
        this.a = 0;
        this.d = yi0Var;
        this.c = i;
        this.b = false;
    }
}
