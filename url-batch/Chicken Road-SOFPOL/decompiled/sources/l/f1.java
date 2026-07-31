package l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1 f4245e;

    public /* synthetic */ f1(j1 j1Var, int i) {
        this.f4244d = i;
        this.f4245e = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4244d) {
            case 0:
                n1 n1Var = this.f4245e.f4299f;
                if (n1Var != null) {
                    n1Var.setListSelectionHidden(true);
                    n1Var.requestLayout();
                    break;
                }
                break;
            default:
                j1 j1Var = this.f4245e;
                n1 n1Var2 = j1Var.f4299f;
                if (n1Var2 != null && n1Var2.isAttachedToWindow() && j1Var.f4299f.getCount() > j1Var.f4299f.getChildCount() && j1Var.f4299f.getChildCount() <= Integer.MAX_VALUE) {
                    j1Var.f4317y.setInputMethodMode(2);
                    j1Var.d();
                    break;
                }
                break;
        }
    }
}
