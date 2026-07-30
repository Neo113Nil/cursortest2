package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sk1 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ tk1 m;

    public sk1(tk1 tk1Var) {
        this.m = tk1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.m.c();
    }
}
