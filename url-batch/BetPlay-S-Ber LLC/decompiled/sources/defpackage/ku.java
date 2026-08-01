package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ku implements PopupWindow.OnDismissListener {
    public final /* synthetic */ lu f;

    public ku(lu luVar) {
        this.f = luVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}
