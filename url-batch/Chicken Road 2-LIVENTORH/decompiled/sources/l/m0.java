package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m0 implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2385g;

    public /* synthetic */ m0(int i, Object obj) {
        this.f2384f = i;
        this.f2385g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        CharSequence convertSelectionToString;
        switch (this.f2384f) {
            case 0:
                o0 o0Var = (o0) this.f2385g;
                r0 r0Var = o0Var.L;
                r0Var.setSelection(i);
                if (r0Var.getOnItemClickListener() != null) {
                    r0Var.performItemClick(view, i, o0Var.I.getItemId(i));
                }
                o0Var.dismiss();
                break;
            default:
                o2.u uVar = (o2.u) this.f2385g;
                f2 f2Var = uVar.f2966j;
                convertSelectionToString = uVar.convertSelectionToString(i < 0 ? !f2Var.E.isShowing() ? null : f2Var.f2286h.getSelectedItem() : uVar.getAdapter().getItem(i));
                uVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = uVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !f2Var.E.isShowing() ? null : f2Var.f2286h.getSelectedView();
                        i = !f2Var.E.isShowing() ? -1 : f2Var.f2286h.getSelectedItemPosition();
                        j4 = !f2Var.E.isShowing() ? Long.MIN_VALUE : f2Var.f2286h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(f2Var.f2286h, view, i, j4);
                }
                f2Var.dismiss();
                break;
        }
    }
}
