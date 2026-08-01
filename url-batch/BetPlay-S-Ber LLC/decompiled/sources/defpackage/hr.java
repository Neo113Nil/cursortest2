package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class hr implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ lr g;

    public /* synthetic */ hr(lr lrVar, int i) {
        this.f = i;
        this.g = lrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        lr lrVar = this.g;
        switch (i) {
            case 0:
                dg dgVar = lrVar.h;
                if (dgVar != null) {
                    dgVar.setListSelectionHidden(true);
                    dgVar.requestLayout();
                    break;
                }
                break;
            default:
                dg dgVar2 = lrVar.h;
                if (dgVar2 != null && dgVar2.isAttachedToWindow() && lrVar.h.getCount() > lrVar.h.getChildCount() && lrVar.h.getChildCount() <= lrVar.r) {
                    lrVar.E.setInputMethodMode(2);
                    lrVar.d();
                    break;
                }
                break;
        }
    }
}
