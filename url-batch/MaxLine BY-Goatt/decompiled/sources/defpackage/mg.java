package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mg implements PopupWindow.OnDismissListener {
    public final /* synthetic */ hg m;
    public final /* synthetic */ ng n;

    public mg(ng ngVar, hg hgVar) {
        this.n = ngVar;
        this.m = hgVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.n.R.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.m);
        }
    }
}
