package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gm implements PopupWindow.OnDismissListener {
    final /* synthetic */ gn a;

    public gm(gn gnVar) {
        this.a = gnVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
