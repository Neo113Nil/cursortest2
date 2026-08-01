package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2847b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2846a = i;
        this.f2847b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2846a) {
            case 0:
                C0261t0 c0261t0 = this.f2847b.f2862c;
                if (c0261t0 != null) {
                    c0261t0.setListSelectionHidden(true);
                    c0261t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2847b;
                C0261t0 c0261t02 = g02.f2862c;
                if (c0261t02 != null && c0261t02.isAttachedToWindow() && g02.f2862c.getCount() > g02.f2862c.getChildCount() && g02.f2862c.getChildCount() <= g02.f2869m) {
                    g02.f2882z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
