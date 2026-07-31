package i;

import java.lang.reflect.Field;

/* renamed from: i.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0153H implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K f2130f;

    public /* synthetic */ RunnableC0153H(K k2, int i2) {
        this.f2129e = i2;
        this.f2130f = k2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f2129e;
        K k2 = this.f2130f;
        switch (i2) {
            case 0:
                M m2 = k2.f2137g;
                if (m2 != null) {
                    m2.setListSelectionHidden(true);
                    m2.requestLayout();
                    break;
                }
                break;
            default:
                M m3 = k2.f2137g;
                if (m3 != null) {
                    Field field = y.x.f3160a;
                    if (m3.isAttachedToWindow() && k2.f2137g.getCount() > k2.f2137g.getChildCount() && k2.f2137g.getChildCount() <= Integer.MAX_VALUE) {
                        k2.f2155z.setInputMethodMode(2);
                        k2.c();
                        break;
                    }
                }
                break;
        }
    }
}
