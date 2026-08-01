package l;

/* loaded from: classes.dex */
public final class B0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f2795b;

    public /* synthetic */ B0(F0 f02, int i) {
        this.f2794a = i;
        this.f2795b = f02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2794a) {
            case 0:
                C0236s0 c0236s0 = this.f2795b.f2810c;
                if (c0236s0 != null) {
                    c0236s0.setListSelectionHidden(true);
                    c0236s0.requestLayout();
                    break;
                }
                break;
            default:
                F0 f02 = this.f2795b;
                C0236s0 c0236s02 = f02.f2810c;
                if (c0236s02 != null && c0236s02.isAttachedToWindow() && f02.f2810c.getCount() > f02.f2810c.getChildCount() && f02.f2810c.getChildCount() <= f02.f2817m) {
                    f02.f2830z.setInputMethodMode(2);
                    f02.i();
                    break;
                }
                break;
        }
    }
}
