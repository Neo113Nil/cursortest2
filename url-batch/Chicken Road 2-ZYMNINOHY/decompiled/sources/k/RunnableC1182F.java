package k;

import java.lang.reflect.Field;

/* renamed from: k.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1182F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1185I f13918b;

    public /* synthetic */ RunnableC1182F(AbstractC1185I abstractC1185I, int i4) {
        this.f13917a = i4;
        this.f13918b = abstractC1185I;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f13917a;
        AbstractC1185I abstractC1185I = this.f13918b;
        switch (i4) {
            case 0:
                C1187K c1187k = abstractC1185I.f13925c;
                if (c1187k != null) {
                    c1187k.setListSelectionHidden(true);
                    c1187k.requestLayout();
                    break;
                }
                break;
            default:
                C1187K c1187k2 = abstractC1185I.f13925c;
                if (c1187k2 != null) {
                    Field field = E.H.f375a;
                    if (c1187k2.isAttachedToWindow() && abstractC1185I.f13925c.getCount() > abstractC1185I.f13925c.getChildCount() && abstractC1185I.f13925c.getChildCount() <= Integer.MAX_VALUE) {
                        abstractC1185I.v.setInputMethodMode(2);
                        abstractC1185I.show();
                        break;
                    }
                }
                break;
        }
    }
}
