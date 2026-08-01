package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vq implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ yq g;

    public /* synthetic */ vq(yq yqVar, int i) {
        this.f = i;
        this.g = yqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        yq yqVar = this.g;
        switch (i) {
            case 0:
                lg lgVar = yqVar.h;
                if (lgVar != null) {
                    lgVar.setListSelectionHidden(true);
                    lgVar.requestLayout();
                    break;
                }
                break;
            default:
                lg lgVar2 = yqVar.h;
                if (lgVar2 != null && lgVar2.isAttachedToWindow() && yqVar.h.getCount() > yqVar.h.getChildCount() && yqVar.h.getChildCount() <= yqVar.r) {
                    yqVar.E.setInputMethodMode(2);
                    yqVar.d();
                    break;
                }
                break;
        }
    }
}
