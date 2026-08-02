package j;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class I implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L f2870f;

    public /* synthetic */ I(L l2, int i2) {
        this.f2869e = i2;
        this.f2870f = l2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L l2 = this.f2870f;
        switch (this.f2869e) {
            case 0:
                N n2 = l2.f2878g;
                if (n2 != null) {
                    n2.setListSelectionHidden(true);
                    n2.requestLayout();
                    break;
                }
                break;
            default:
                N n3 = l2.f2878g;
                if (n3 != null) {
                    Field field = A.z.f58a;
                    if (n3.isAttachedToWindow() && l2.f2878g.getCount() > l2.f2878g.getChildCount() && l2.f2878g.getChildCount() <= Integer.MAX_VALUE) {
                        l2.f2896z.setInputMethodMode(2);
                        l2.c();
                        break;
                    }
                }
                break;
        }
    }
}
