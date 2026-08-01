package l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c2 f2607g;

    public /* synthetic */ y1(c2 c2Var, int i) {
        this.f2606f = i;
        this.f2607g = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2606f) {
            case 0:
                p1 p1Var = this.f2607g.h;
                if (p1Var != null) {
                    p1Var.setListSelectionHidden(true);
                    p1Var.requestLayout();
                    break;
                }
                break;
            default:
                c2 c2Var = this.f2607g;
                p1 p1Var2 = c2Var.h;
                if (p1Var2 != null && p1Var2.isAttachedToWindow() && c2Var.h.getCount() > c2Var.h.getChildCount() && c2Var.h.getChildCount() <= c2Var.f2417r) {
                    c2Var.E.setInputMethodMode(2);
                    c2Var.e();
                    break;
                }
                break;
        }
    }
}
