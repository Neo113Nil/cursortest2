package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ik implements PopupWindow.OnDismissListener {
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    final /* synthetic */ il b;

    public ik(il ilVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = ilVar;
        this.a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
