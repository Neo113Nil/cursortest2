package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class b5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b5(int i, Object obj) {
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
                d5 d5Var = (d5) obj;
                g5 g5Var = d5Var.L;
                g5Var.setSelection(i);
                if (g5Var.getOnItemClickListener() != null) {
                    g5Var.performItemClick(view, i, d5Var.I.getItemId(i));
                }
                d5Var.dismiss();
                break;
            case 1:
                rr rrVar = (rr) obj;
                yq yqVar = rrVar.j;
                convertSelectionToString = rrVar.convertSelectionToString(i < 0 ? !yqVar.E.isShowing() ? null : yqVar.h.getSelectedItem() : rrVar.getAdapter().getItem(i));
                rrVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = rrVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !yqVar.E.isShowing() ? null : yqVar.h.getSelectedView();
                        i = !yqVar.E.isShowing() ? -1 : yqVar.h.getSelectedItemPosition();
                        j = !yqVar.E.isShowing() ? Long.MIN_VALUE : yqVar.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(yqVar.h, view, i, j);
                }
                yqVar.dismiss();
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }
}
