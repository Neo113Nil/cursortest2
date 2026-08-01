package l;

/* loaded from: classes.dex */
public final class D0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f3214b;

    public /* synthetic */ D0(H0 h02, int i) {
        this.f3213a = i;
        this.f3214b = h02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3213a) {
            case 0:
                C0289u0 c0289u0 = this.f3214b.f3231c;
                if (c0289u0 != null) {
                    c0289u0.setListSelectionHidden(true);
                    c0289u0.requestLayout();
                    break;
                }
                break;
            default:
                H0 h02 = this.f3214b;
                C0289u0 c0289u02 = h02.f3231c;
                if (c0289u02 != null && c0289u02.isAttachedToWindow() && h02.f3231c.getCount() > h02.f3231c.getChildCount() && h02.f3231c.getChildCount() <= h02.f3239m) {
                    h02.f3252z.setInputMethodMode(2);
                    h02.i();
                    break;
                }
                break;
        }
    }
}
