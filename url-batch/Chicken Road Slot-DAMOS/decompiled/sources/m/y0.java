package m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f6218e;

    public /* synthetic */ y0(c1 c1Var, int i3) {
        this.f6217d = i3;
        this.f6218e = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6217d) {
            case 0:
                g1 g1Var = this.f6218e.f6041i;
                if (g1Var != null) {
                    g1Var.setListSelectionHidden(true);
                    g1Var.requestLayout();
                    break;
                }
                break;
            default:
                c1 c1Var = this.f6218e;
                g1 g1Var2 = c1Var.f6041i;
                if (g1Var2 != null && g1Var2.isAttachedToWindow() && c1Var.f6041i.getCount() > c1Var.f6041i.getChildCount() && c1Var.f6041i.getChildCount() <= Integer.MAX_VALUE) {
                    c1Var.J.setInputMethodMode(2);
                    c1Var.a();
                    break;
                }
                break;
        }
    }
}
