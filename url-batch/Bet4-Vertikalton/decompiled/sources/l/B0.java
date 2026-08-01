package l;

/* loaded from: classes.dex */
public final class B0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f2771b;

    public /* synthetic */ B0(F0 f02, int i) {
        this.f2770a = i;
        this.f2771b = f02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2770a) {
            case 0:
                C0233s0 c0233s0 = this.f2771b.f2784c;
                if (c0233s0 != null) {
                    c0233s0.setListSelectionHidden(true);
                    c0233s0.requestLayout();
                    break;
                }
                break;
            default:
                F0 f02 = this.f2771b;
                C0233s0 c0233s02 = f02.f2784c;
                if (c0233s02 != null && c0233s02.isAttachedToWindow() && f02.f2784c.getCount() > f02.f2784c.getChildCount() && f02.f2784c.getChildCount() <= f02.f2791m) {
                    f02.f2804z.setInputMethodMode(2);
                    f02.i();
                    break;
                }
                break;
        }
    }
}
