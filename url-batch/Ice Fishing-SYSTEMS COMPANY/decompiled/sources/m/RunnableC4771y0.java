package m;

/* renamed from: m.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4771y0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39539n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B0 f39540u;

    public /* synthetic */ RunnableC4771y0(B0 b02, int i) {
        this.f39539n = i;
        this.f39540u = b02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39539n) {
            case 0:
                C4754p0 c4754p0 = this.f39540u.f39255v;
                if (c4754p0 != null) {
                    c4754p0.setListSelectionHidden(true);
                    c4754p0.requestLayout();
                    break;
                }
                break;
            default:
                B0 b02 = this.f39540u;
                C4754p0 c4754p02 = b02.f39255v;
                if (c4754p02 != null && c4754p02.isAttachedToWindow() && b02.f39255v.getCount() > b02.f39255v.getChildCount() && b02.f39255v.getChildCount() <= b02.f39240F) {
                    b02.f39252S.setInputMethodMode(2);
                    b02.show();
                    break;
                }
                break;
        }
    }
}
