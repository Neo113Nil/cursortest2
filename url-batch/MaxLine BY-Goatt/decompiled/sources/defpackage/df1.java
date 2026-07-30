package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class df1 {
    public final wt1 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ ef1 d;

    public df1(ef1 ef1Var, wt1 wt1Var) {
        this.d = ef1Var;
        this.a = wt1Var;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        ef1 ef1Var = this.d;
        int i2 = ef1Var.c;
        ef1Var.c = i + i2;
        if (!ef1Var.d) {
            ef1Var.d = true;
            while (true) {
                try {
                    int i3 = ef1Var.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    ef1Var.d = false;
                }
            }
        }
        if (this.b) {
            ef1Var.c(this);
        }
    }
}
