package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2779b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2778a = i;
        this.f2779b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2778a) {
            case 0:
                C0245t0 c0245t0 = this.f2779b.f2792c;
                if (c0245t0 != null) {
                    c0245t0.setListSelectionHidden(true);
                    c0245t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2779b;
                C0245t0 c0245t02 = g02.f2792c;
                if (c0245t02 != null && c0245t02.isAttachedToWindow() && g02.f2792c.getCount() > g02.f2792c.getChildCount() && g02.f2792c.getChildCount() <= g02.f2799m) {
                    g02.f2812z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
