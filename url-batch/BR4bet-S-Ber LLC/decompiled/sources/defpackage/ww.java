package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ww implements PopupWindow.OnDismissListener {
    public final /* synthetic */ xw f;

    public ww(xw xwVar) {
        this.f = xwVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}
