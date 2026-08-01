package l;

/* loaded from: classes.dex */
public final class B0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f2831b;

    public /* synthetic */ B0(F0 f02, int i) {
        this.f2830a = i;
        this.f2831b = f02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2830a) {
            case 0:
                C0242s0 c0242s0 = this.f2831b.f2846c;
                if (c0242s0 != null) {
                    c0242s0.setListSelectionHidden(true);
                    c0242s0.requestLayout();
                    break;
                }
                break;
            default:
                F0 f02 = this.f2831b;
                C0242s0 c0242s02 = f02.f2846c;
                if (c0242s02 != null && c0242s02.isAttachedToWindow() && f02.f2846c.getCount() > f02.f2846c.getChildCount() && f02.f2846c.getChildCount() <= f02.f2853m) {
                    f02.f2866z.setInputMethodMode(2);
                    f02.i();
                    break;
                }
                break;
        }
    }
}
