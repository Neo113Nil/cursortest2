package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0000do extends yw {
    final /* synthetic */ dp a;

    public C0000do(dp dpVar) {
        this.a = dpVar;
    }

    @Override // defpackage.yw, defpackage.yv
    public final void a() {
        dy dyVar = this.a.a;
        dyVar.s.setVisibility(8);
        PopupWindow popupWindow = dyVar.t;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (dyVar.s.getParent() instanceof View) {
            View view = (View) dyVar.s.getParent();
            int i = yq.a;
            view.requestApplyInsets();
        }
        dyVar.s.i();
        dyVar.M.P(null);
        dyVar.M = null;
        ViewGroup viewGroup = dyVar.x;
        int i2 = yq.a;
        viewGroup.requestApplyInsets();
    }
}
