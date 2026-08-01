package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vt implements PopupWindow.OnDismissListener {
    public final /* synthetic */ wt f;

    public vt(wt wtVar) {
        this.f = wtVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}
