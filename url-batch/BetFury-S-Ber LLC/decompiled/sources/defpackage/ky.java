package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ky implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ny g;

    public /* synthetic */ ky(ny nyVar, int i) {
        this.f = i;
        this.g = nyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        ny nyVar = this.g;
        switch (i) {
            case 0:
                xk xkVar = nyVar.h;
                if (xkVar != null) {
                    xkVar.setListSelectionHidden(true);
                    xkVar.requestLayout();
                    break;
                }
                break;
            default:
                xk xkVar2 = nyVar.h;
                if (xkVar2 != null && xkVar2.isAttachedToWindow() && nyVar.h.getCount() > nyVar.h.getChildCount() && nyVar.h.getChildCount() <= nyVar.r) {
                    nyVar.E.setInputMethodMode(2);
                    nyVar.d();
                    break;
                }
                break;
        }
    }
}
