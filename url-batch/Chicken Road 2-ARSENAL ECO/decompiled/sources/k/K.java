package k;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class K implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f4930g;

    public /* synthetic */ K(N n7, int i7) {
        this.f4929f = i7;
        this.f4930g = n7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f4929f;
        N n7 = this.f4930g;
        switch (i7) {
            case 0:
                P p4 = n7.f4938h;
                if (p4 != null) {
                    p4.setListSelectionHidden(true);
                    p4.requestLayout();
                    break;
                }
                break;
            default:
                P p6 = n7.f4938h;
                if (p6 != null) {
                    Field field = D.D.f240a;
                    if (p6.isAttachedToWindow() && n7.f4938h.getCount() > n7.f4938h.getChildCount() && n7.f4938h.getChildCount() <= Integer.MAX_VALUE) {
                        n7.f4935A.setInputMethodMode(2);
                        n7.b();
                        break;
                    }
                }
                break;
        }
    }
}
