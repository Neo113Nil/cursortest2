package k;

import android.widget.PopupWindow;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199w implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0200x f3224a;

    public C0199w(C0200x c0200x) {
        this.f3224a = c0200x;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3224a.c();
    }
}
