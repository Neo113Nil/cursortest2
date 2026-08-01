package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2843b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2842a = i;
        this.f2843b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2842a) {
            case 0:
                C0261t0 c0261t0 = this.f2843b.f2858c;
                if (c0261t0 != null) {
                    c0261t0.setListSelectionHidden(true);
                    c0261t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2843b;
                C0261t0 c0261t02 = g02.f2858c;
                if (c0261t02 != null && c0261t02.isAttachedToWindow() && g02.f2858c.getCount() > g02.f2858c.getChildCount() && g02.f2858c.getChildCount() <= g02.f2865m) {
                    g02.f2878z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
