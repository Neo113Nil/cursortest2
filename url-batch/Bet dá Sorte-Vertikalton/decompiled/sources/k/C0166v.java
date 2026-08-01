package k;

import android.widget.PopupWindow;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0167w f2708a;

    public C0166v(C0167w c0167w) {
        this.f2708a = c0167w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2708a.c();
    }
}
