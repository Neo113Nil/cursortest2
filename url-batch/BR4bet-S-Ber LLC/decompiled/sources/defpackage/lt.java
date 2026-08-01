package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lt implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ pt g;

    public /* synthetic */ lt(pt ptVar, int i) {
        this.f = i;
        this.g = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        pt ptVar = this.g;
        switch (i) {
            case 0:
                mi miVar = ptVar.h;
                if (miVar != null) {
                    miVar.setListSelectionHidden(true);
                    miVar.requestLayout();
                    break;
                }
                break;
            default:
                mi miVar2 = ptVar.h;
                if (miVar2 != null && miVar2.isAttachedToWindow() && ptVar.h.getCount() > ptVar.h.getChildCount() && ptVar.h.getChildCount() <= ptVar.r) {
                    ptVar.E.setInputMethodMode(2);
                    ptVar.d();
                    break;
                }
                break;
        }
    }
}
