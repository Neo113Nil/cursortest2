package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2851b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2850a = i;
        this.f2851b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2850a) {
            case 0:
                C0213t0 c0213t0 = this.f2851b.f2864c;
                if (c0213t0 != null) {
                    c0213t0.setListSelectionHidden(true);
                    c0213t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2851b;
                C0213t0 c0213t02 = g02.f2864c;
                if (c0213t02 != null && c0213t02.isAttachedToWindow() && g02.f2864c.getCount() > g02.f2864c.getChildCount() && g02.f2864c.getChildCount() <= g02.f2871m) {
                    g02.f2884z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
