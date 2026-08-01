package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class l5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l5(int i, Object obj) {
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
                n5 n5Var = (n5) obj;
                q5 q5Var = n5Var.L;
                q5Var.setSelection(i);
                if (q5Var.getOnItemClickListener() != null) {
                    q5Var.performItemClick(view, i, n5Var.I.getItemId(i));
                }
                n5Var.dismiss();
                break;
            default:
                su suVar = (su) obj;
                pt ptVar = suVar.j;
                convertSelectionToString = suVar.convertSelectionToString(i < 0 ? !ptVar.E.isShowing() ? null : ptVar.h.getSelectedItem() : suVar.getAdapter().getItem(i));
                suVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = suVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !ptVar.E.isShowing() ? null : ptVar.h.getSelectedView();
                        i = !ptVar.E.isShowing() ? -1 : ptVar.h.getSelectedItemPosition();
                        j = !ptVar.E.isShowing() ? Long.MIN_VALUE : ptVar.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(ptVar.h, view, i, j);
                }
                ptVar.dismiss();
                break;
        }
    }
}
