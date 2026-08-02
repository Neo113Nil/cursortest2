package i;

import android.widget.PopupWindow;

/* renamed from: i.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214l implements PopupWindow.OnDismissListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0215m f2456e;

    public C0214l(C0215m c0215m) {
        this.f2456e = c0215m;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2456e.c();
    }
}
