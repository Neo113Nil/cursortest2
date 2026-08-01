package k;

import android.widget.PopupWindow;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0210w f3120a;

    public C0209v(C0210w c0210w) {
        this.f3120a = c0210w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3120a.c();
    }
}
