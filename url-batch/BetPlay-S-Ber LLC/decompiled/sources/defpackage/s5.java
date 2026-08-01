package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class s5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s5(int i, Object obj) {
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
                u5 u5Var = (u5) obj;
                x5 x5Var = u5Var.L;
                x5Var.setSelection(i);
                if (x5Var.getOnItemClickListener() != null) {
                    x5Var.performItemClick(view, i, u5Var.I.getItemId(i));
                }
                u5Var.dismiss();
                break;
            default:
                es esVar = (es) obj;
                lr lrVar = esVar.j;
                convertSelectionToString = esVar.convertSelectionToString(i < 0 ? !lrVar.E.isShowing() ? null : lrVar.h.getSelectedItem() : esVar.getAdapter().getItem(i));
                esVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = esVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !lrVar.E.isShowing() ? null : lrVar.h.getSelectedView();
                        i = !lrVar.E.isShowing() ? -1 : lrVar.h.getSelectedItemPosition();
                        j = !lrVar.E.isShowing() ? Long.MIN_VALUE : lrVar.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(lrVar.h, view, i, j);
                }
                lrVar.dismiss();
                break;
        }
    }
}
