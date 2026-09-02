package j;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f13691a;

    public m(n nVar) {
        this.f13691a = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f13691a.c();
    }
}
