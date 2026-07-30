package h;

import java.lang.reflect.Field;

/* renamed from: h.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0147G implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J f2099f;

    public /* synthetic */ RunnableC0147G(J j2, int i2) {
        this.f2098e = i2;
        this.f2099f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J j2 = this.f2099f;
        switch (this.f2098e) {
            case 0:
                L l2 = j2.f2106g;
                if (l2 != null) {
                    l2.setListSelectionHidden(true);
                    l2.requestLayout();
                    break;
                }
                break;
            default:
                L l3 = j2.f2106g;
                if (l3 != null) {
                    Field field = w.x.f3075a;
                    if (l3.isAttachedToWindow() && j2.f2106g.getCount() > j2.f2106g.getChildCount() && j2.f2106g.getChildCount() <= Integer.MAX_VALUE) {
                        j2.f2124z.setInputMethodMode(2);
                        j2.g();
                        break;
                    }
                }
                break;
        }
    }
}
