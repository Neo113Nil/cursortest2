package l;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f9728b;

    public /* synthetic */ H(K k3, int i3) {
        this.f9727a = i3;
        this.f9728b = k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K k3 = this.f9728b;
        switch (this.f9727a) {
            case 0:
                M m3 = k3.f9735c;
                if (m3 != null) {
                    m3.setListSelectionHidden(true);
                    m3.requestLayout();
                    break;
                }
                break;
            default:
                M m4 = k3.f9735c;
                if (m4 != null) {
                    Field field = E.A.f243a;
                    if (m4.isAttachedToWindow() && k3.f9735c.getCount() > k3.f9735c.getChildCount() && k3.f9735c.getChildCount() <= Integer.MAX_VALUE) {
                        k3.v.setInputMethodMode(2);
                        k3.d();
                        break;
                    }
                }
                break;
        }
    }
}
