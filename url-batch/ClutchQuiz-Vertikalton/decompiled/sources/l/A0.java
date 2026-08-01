package l;

/* loaded from: classes.dex */
public final class A0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f2825b;

    public /* synthetic */ A0(E0 e02, int i) {
        this.f2824a = i;
        this.f2825b = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2824a) {
            case 0:
                C0236r0 c0236r0 = this.f2825b.f2840c;
                if (c0236r0 != null) {
                    c0236r0.setListSelectionHidden(true);
                    c0236r0.requestLayout();
                    break;
                }
                break;
            default:
                E0 e02 = this.f2825b;
                C0236r0 c0236r02 = e02.f2840c;
                if (c0236r02 != null && c0236r02.isAttachedToWindow() && e02.f2840c.getCount() > e02.f2840c.getChildCount() && e02.f2840c.getChildCount() <= e02.f2847m) {
                    e02.f2860z.setInputMethodMode(2);
                    e02.i();
                    break;
                }
                break;
        }
    }
}
