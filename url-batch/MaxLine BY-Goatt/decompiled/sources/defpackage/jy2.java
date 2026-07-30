package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jy2 extends mi2 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public jy2(x53 x53Var) {
        this.a = 1;
        this.d = x53Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.y53
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((ky2) obj).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                x53 x53Var = (x53) obj;
                if (i2 == x53Var.a.size()) {
                    y53 y53Var = x53Var.d;
                    if (y53Var != null) {
                        y53Var.a();
                    }
                    this.c = 0;
                    this.b = false;
                    x53Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mi2, defpackage.y53
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.mi2, defpackage.y53
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((ky2) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    y53 y53Var = ((x53) obj).d;
                    if (y53Var != null) {
                        y53Var.c();
                        break;
                    }
                }
                break;
        }
    }

    public jy2(ky2 ky2Var, int i) {
        this.a = 0;
        this.d = ky2Var;
        this.c = i;
        this.b = false;
    }
}
