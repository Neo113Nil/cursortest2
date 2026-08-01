package l;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f5708d;

    public l(m mVar) {
        this.f5708d = mVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f5708d.c();
    }
}
