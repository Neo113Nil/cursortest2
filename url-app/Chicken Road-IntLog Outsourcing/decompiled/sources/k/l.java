package k;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class l implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f10634a;

    public l(m mVar) {
        this.f10634a = mVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f10634a.c();
    }
}
