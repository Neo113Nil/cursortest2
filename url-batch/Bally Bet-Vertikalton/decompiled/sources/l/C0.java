package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2831b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2830a = i;
        this.f2831b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2830a) {
            case 0:
                C0262t0 c0262t0 = this.f2831b.f2846c;
                if (c0262t0 != null) {
                    c0262t0.setListSelectionHidden(true);
                    c0262t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2831b;
                C0262t0 c0262t02 = g02.f2846c;
                if (c0262t02 != null && c0262t02.isAttachedToWindow() && g02.f2846c.getCount() > g02.f2846c.getChildCount() && g02.f2846c.getChildCount() <= g02.f2853m) {
                    g02.f2866z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
