package m;

/* loaded from: classes.dex */
public final class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0 f2918b;

    public /* synthetic */ F0(J0 j02, int i) {
        this.f2917a = i;
        this.f2918b = j02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2917a) {
            case 0:
                C0246w0 c0246w0 = this.f2918b.f2934c;
                if (c0246w0 != null) {
                    c0246w0.setListSelectionHidden(true);
                    c0246w0.requestLayout();
                    break;
                }
                break;
            default:
                J0 j02 = this.f2918b;
                C0246w0 c0246w02 = j02.f2934c;
                if (c0246w02 != null && c0246w02.isAttachedToWindow() && j02.f2934c.getCount() > j02.f2934c.getChildCount() && j02.f2934c.getChildCount() <= j02.f2942m) {
                    j02.f2955z.setInputMethodMode(2);
                    j02.j();
                    break;
                }
                break;
        }
    }
}
