package l;

/* loaded from: classes.dex */
public final class A0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f3248b;

    public /* synthetic */ A0(E0 e02, int i) {
        this.f3247a = i;
        this.f3248b = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3247a) {
            case 0:
                C0257r0 c0257r0 = this.f3248b.f3263c;
                if (c0257r0 != null) {
                    c0257r0.setListSelectionHidden(true);
                    c0257r0.requestLayout();
                    break;
                }
                break;
            default:
                E0 e02 = this.f3248b;
                C0257r0 c0257r02 = e02.f3263c;
                if (c0257r02 != null && c0257r02.isAttachedToWindow() && e02.f3263c.getCount() > e02.f3263c.getChildCount() && e02.f3263c.getChildCount() <= e02.f3270m) {
                    e02.f3283z.setInputMethodMode(2);
                    e02.i();
                    break;
                }
                break;
        }
    }
}
