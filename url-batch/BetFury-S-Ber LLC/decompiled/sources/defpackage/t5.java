package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class t5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t5(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CharSequence convertSelectionToString;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                v5 v5Var = (v5) obj;
                y5 y5Var = v5Var.L;
                y5Var.setSelection(i);
                if (y5Var.getOnItemClickListener() != null) {
                    y5Var.performItemClick(view, i, v5Var.I.getItemId(i));
                }
                v5Var.dismiss();
                break;
            case 1:
                xz xzVar = (xz) obj;
                ny nyVar = xzVar.j;
                convertSelectionToString = xzVar.convertSelectionToString(i < 0 ? !nyVar.E.isShowing() ? null : nyVar.h.getSelectedItem() : xzVar.getAdapter().getItem(i));
                xzVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = xzVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !nyVar.E.isShowing() ? null : nyVar.h.getSelectedView();
                        i = !nyVar.E.isShowing() ? -1 : nyVar.h.getSelectedItemPosition();
                        j = !nyVar.E.isShowing() ? Long.MIN_VALUE : nyVar.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(nyVar.h, view, i, j);
                }
                nyVar.dismiss();
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }
}
