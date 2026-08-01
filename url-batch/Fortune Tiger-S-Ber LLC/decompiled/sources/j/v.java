package j;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v implements PopupWindow.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f2243f;

    public v(w wVar) {
        this.f2243f = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2243f.c();
    }
}
