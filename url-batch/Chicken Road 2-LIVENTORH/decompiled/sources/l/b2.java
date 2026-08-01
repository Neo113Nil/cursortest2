package l;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f2 f2249g;

    public /* synthetic */ b2(f2 f2Var, int i) {
        this.f2248f = i;
        this.f2249g = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2248f) {
            case 0:
                s1 s1Var = this.f2249g.f2286h;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    break;
                }
                break;
            default:
                f2 f2Var = this.f2249g;
                s1 s1Var2 = f2Var.f2286h;
                if (s1Var2 != null && s1Var2.isAttachedToWindow() && f2Var.f2286h.getCount() > f2Var.f2286h.getChildCount() && f2Var.f2286h.getChildCount() <= f2Var.f2295r) {
                    f2Var.E.setInputMethodMode(2);
                    f2Var.f();
                    break;
                }
                break;
        }
    }
}
