package l;

/* loaded from: classes.dex */
public final class A0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f2810b;

    public /* synthetic */ A0(E0 e02, int i) {
        this.f2809a = i;
        this.f2810b = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2809a) {
            case 0:
                C0234r0 c0234r0 = this.f2810b.f2825c;
                if (c0234r0 != null) {
                    c0234r0.setListSelectionHidden(true);
                    c0234r0.requestLayout();
                    break;
                }
                break;
            default:
                E0 e02 = this.f2810b;
                C0234r0 c0234r02 = e02.f2825c;
                if (c0234r02 != null && c0234r02.isAttachedToWindow() && e02.f2825c.getCount() > e02.f2825c.getChildCount() && e02.f2825c.getChildCount() <= e02.f2832m) {
                    e02.f2845z.setInputMethodMode(2);
                    e02.i();
                    break;
                }
                break;
        }
    }
}
