package l;

import android.widget.PopupWindow;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0179w f2877a;

    public C0178v(C0179w c0179w) {
        this.f2877a = c0179w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2877a.c();
    }
}
