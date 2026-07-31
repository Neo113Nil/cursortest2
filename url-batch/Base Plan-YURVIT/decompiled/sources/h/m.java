package h;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f2056e;

    public m(n nVar) {
        this.f2056e = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2056e.c();
    }
}
