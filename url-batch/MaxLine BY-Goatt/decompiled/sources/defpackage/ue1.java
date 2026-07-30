package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ue1 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ ye1 n;

    public /* synthetic */ ue1(ye1 ye1Var, int i) {
        this.m = i;
        this.n = ye1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        ye1 ye1Var = this.n;
        switch (i) {
            case 0:
                ne0 ne0Var = ye1Var.o;
                if (ne0Var != null) {
                    ne0Var.setListSelectionHidden(true);
                    ne0Var.requestLayout();
                    break;
                }
                break;
            default:
                ne0 ne0Var2 = ye1Var.o;
                if (ne0Var2 != null && ne0Var2.isAttachedToWindow() && ye1Var.o.getCount() > ye1Var.o.getChildCount() && ye1Var.o.getChildCount() <= ye1Var.y) {
                    ye1Var.K.setInputMethodMode(2);
                    ye1Var.c();
                    break;
                }
                break;
        }
    }
}
