package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2825b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2824a = i;
        this.f2825b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2824a) {
            case 0:
                C0261t0 c0261t0 = this.f2825b.f2840c;
                if (c0261t0 != null) {
                    c0261t0.setListSelectionHidden(true);
                    c0261t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2825b;
                C0261t0 c0261t02 = g02.f2840c;
                if (c0261t02 != null && c0261t02.isAttachedToWindow() && g02.f2840c.getCount() > g02.f2840c.getChildCount() && g02.f2840c.getChildCount() <= g02.f2847m) {
                    g02.f2860z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
