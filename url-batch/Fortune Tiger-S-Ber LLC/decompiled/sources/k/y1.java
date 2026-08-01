package k;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2691f;
    public final /* synthetic */ c2 g;

    public /* synthetic */ y1(c2 c2Var, int i4) {
        this.f2691f = i4;
        this.g = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2691f) {
            case 0:
                p1 p1Var = this.g.h;
                if (p1Var != null) {
                    p1Var.setListSelectionHidden(true);
                    p1Var.requestLayout();
                    break;
                }
                break;
            default:
                c2 c2Var = this.g;
                p1 p1Var2 = c2Var.h;
                if (p1Var2 != null && p1Var2.isAttachedToWindow() && c2Var.h.getCount() > c2Var.h.getChildCount() && c2Var.h.getChildCount() <= c2Var.f2518r) {
                    c2Var.E.setInputMethodMode(2);
                    c2Var.c();
                    break;
                }
                break;
        }
    }
}
