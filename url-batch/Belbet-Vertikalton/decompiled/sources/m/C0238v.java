package m;

import android.widget.PopupWindow;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0239w f3409a;

    public C0238v(C0239w c0239w) {
        this.f3409a = c0239w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3409a.c();
    }
}
