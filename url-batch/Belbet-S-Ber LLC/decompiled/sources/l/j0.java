package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j0 implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2482g;

    public /* synthetic */ j0(int i, Object obj) {
        this.f2481f = i;
        this.f2482g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        CharSequence convertSelectionToString;
        switch (this.f2481f) {
            case 0:
                l0 l0Var = (l0) this.f2482g;
                o0 o0Var = l0Var.L;
                o0Var.setSelection(i);
                if (o0Var.getOnItemClickListener() != null) {
                    o0Var.performItemClick(view, i, l0Var.I.getItemId(i));
                }
                l0Var.dismiss();
                break;
            default:
                s2.u uVar = (s2.u) this.f2482g;
                c2 c2Var = uVar.f3325j;
                convertSelectionToString = uVar.convertSelectionToString(i < 0 ? !c2Var.E.isShowing() ? null : c2Var.h.getSelectedItem() : uVar.getAdapter().getItem(i));
                uVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = uVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c2Var.E.isShowing() ? null : c2Var.h.getSelectedView();
                        i = !c2Var.E.isShowing() ? -1 : c2Var.h.getSelectedItemPosition();
                        j2 = !c2Var.E.isShowing() ? Long.MIN_VALUE : c2Var.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c2Var.h, view, i, j2);
                }
                c2Var.dismiss();
                break;
        }
    }
}
