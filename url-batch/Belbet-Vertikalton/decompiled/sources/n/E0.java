package n;

/* loaded from: classes.dex */
public final class E0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I0 f3449b;

    public /* synthetic */ E0(I0 i02, int i) {
        this.f3448a = i;
        this.f3449b = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3448a) {
            case 0:
                C0305v0 c0305v0 = this.f3449b.f3462c;
                if (c0305v0 != null) {
                    c0305v0.setListSelectionHidden(true);
                    c0305v0.requestLayout();
                    break;
                }
                break;
            default:
                I0 i02 = this.f3449b;
                C0305v0 c0305v02 = i02.f3462c;
                if (c0305v02 != null && c0305v02.isAttachedToWindow() && i02.f3462c.getCount() > i02.f3462c.getChildCount() && i02.f3462c.getChildCount() <= i02.f3469m) {
                    i02.f3482z.setInputMethodMode(2);
                    i02.h();
                    break;
                }
                break;
        }
    }
}
