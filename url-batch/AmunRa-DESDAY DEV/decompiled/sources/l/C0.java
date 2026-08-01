package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2926b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2925a = i;
        this.f2926b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2925a) {
            case 0:
                C0242t0 c0242t0 = this.f2926b.f2941c;
                if (c0242t0 != null) {
                    c0242t0.setListSelectionHidden(true);
                    c0242t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2926b;
                C0242t0 c0242t02 = g02.f2941c;
                if (c0242t02 != null && c0242t02.isAttachedToWindow() && g02.f2941c.getCount() > g02.f2941c.getChildCount() && g02.f2941c.getChildCount() <= g02.f2948m) {
                    g02.f2961z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
