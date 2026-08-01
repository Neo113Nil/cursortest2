package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f3214b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f3213a = i;
        this.f3214b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3213a) {
            case 0:
                C0289t0 c0289t0 = this.f3214b.f3231c;
                if (c0289t0 != null) {
                    c0289t0.setListSelectionHidden(true);
                    c0289t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f3214b;
                C0289t0 c0289t02 = g02.f3231c;
                if (c0289t02 != null && c0289t02.isAttachedToWindow() && g02.f3231c.getCount() > g02.f3231c.getChildCount() && g02.f3231c.getChildCount() <= g02.f3239m) {
                    g02.f3252z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
